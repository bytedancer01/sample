package org.apache.http.impl.execchain;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/execchain/ProtocolExec.class */
public class ProtocolExec implements ClientExecChain {
    private final HttpProcessor httpProcessor;
    private final Log log = LogFactory.getLog(getClass());
    private final ClientExecChain requestExecutor;

    public ProtocolExec(ClientExecChain clientExecChain, HttpProcessor httpProcessor) {
        Args.notNull(clientExecChain, "HTTP client request executor");
        Args.notNull(httpProcessor, "HTTP protocol processor");
        this.requestExecutor = clientExecChain;
        this.httpProcessor = httpProcessor;
    }

    @Override // org.apache.http.impl.execchain.ClientExecChain
    public CloseableHttpResponse execute(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware) {
        URI uri;
        HttpHost httpHost;
        String userInfo;
        Args.notNull(httpRoute, "HTTP route");
        Args.notNull(httpRequestWrapper, "HTTP request");
        Args.notNull(httpClientContext, "HTTP context");
        HttpRequest original = httpRequestWrapper.getOriginal();
        if (original instanceof HttpUriRequest) {
            uri = ((HttpUriRequest) original).getURI();
        } else {
            String uri2 = original.getRequestLine().getUri();
            try {
                uri = URI.create(uri2);
            } catch (IllegalArgumentException e10) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Unable to parse '" + uri2 + "' as a valid URI; request URI and Host header may be inconsistent", e10);
                }
                uri = null;
            }
        }
        httpRequestWrapper.setURI(uri);
        rewriteRequestURI(httpRequestWrapper, httpRoute);
        HttpHost httpHost2 = (HttpHost) httpRequestWrapper.getParams().getParameter(ClientPNames.VIRTUAL_HOST);
        HttpHost httpHost3 = httpHost2;
        if (httpHost2 != null) {
            httpHost3 = httpHost2;
            if (httpHost2.getPort() == -1) {
                int port = httpRoute.getTargetHost().getPort();
                HttpHost httpHost4 = httpHost2;
                if (port != -1) {
                    httpHost4 = new HttpHost(httpHost2.getHostName(), port, httpHost2.getSchemeName());
                }
                httpHost3 = httpHost4;
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Using virtual host" + httpHost4);
                    httpHost3 = httpHost4;
                }
            }
        }
        if (httpHost3 != null) {
            httpHost = httpHost3;
        } else {
            httpHost = null;
            if (uri != null) {
                httpHost = null;
                if (uri.isAbsolute()) {
                    httpHost = null;
                    if (uri.getHost() != null) {
                        httpHost = new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
                    }
                }
            }
        }
        HttpHost httpHost5 = httpHost;
        if (httpHost == null) {
            httpHost5 = httpRequestWrapper.getTarget();
        }
        HttpHost httpHost6 = httpHost5;
        if (httpHost5 == null) {
            httpHost6 = httpRoute.getTargetHost();
        }
        if (uri != null && (userInfo = uri.getUserInfo()) != null) {
            CredentialsProvider credentialsProvider = httpClientContext.getCredentialsProvider();
            CredentialsProvider credentialsProvider2 = credentialsProvider;
            if (credentialsProvider == null) {
                credentialsProvider2 = new BasicCredentialsProvider();
                httpClientContext.setCredentialsProvider(credentialsProvider2);
            }
            credentialsProvider2.setCredentials(new AuthScope(httpHost6), new UsernamePasswordCredentials(userInfo));
        }
        httpClientContext.setAttribute("http.target_host", httpHost6);
        httpClientContext.setAttribute("http.route", httpRoute);
        httpClientContext.setAttribute("http.request", httpRequestWrapper);
        this.httpProcessor.process(httpRequestWrapper, httpClientContext);
        CloseableHttpResponse execute = this.requestExecutor.execute(httpRoute, httpRequestWrapper, httpClientContext, httpExecutionAware);
        try {
            httpClientContext.setAttribute("http.response", execute);
            this.httpProcessor.process(execute, httpClientContext);
            return execute;
        } catch (IOException e11) {
            execute.close();
            throw e11;
        } catch (RuntimeException e12) {
            execute.close();
            throw e12;
        } catch (HttpException e13) {
            execute.close();
            throw e13;
        }
    }

    public void rewriteRequestURI(HttpRequestWrapper httpRequestWrapper, HttpRoute httpRoute) {
        URI uri = httpRequestWrapper.getURI();
        if (uri != null) {
            try {
                httpRequestWrapper.setURI(URIUtils.rewriteURIForRoute(uri, httpRoute));
            } catch (URISyntaxException e10) {
                throw new ProtocolException("Invalid URI: " + uri, e10);
            }
        }
    }
}
