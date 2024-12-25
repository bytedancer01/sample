package org.apache.http.impl.execchain;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.protocol.RequestClientConnControl;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.ImmutableHttpProcessor;
import org.apache.http.protocol.RequestContent;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.protocol.RequestUserAgent;
import org.apache.http.util.Args;
import org.apache.http.util.VersionInfo;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/execchain/MinimalClientExec.class */
public class MinimalClientExec implements ClientExecChain {
    private final HttpClientConnectionManager connManager;
    private final HttpProcessor httpProcessor;
    private final ConnectionKeepAliveStrategy keepAliveStrategy;
    private final Log log = LogFactory.getLog(getClass());
    private final HttpRequestExecutor requestExecutor;
    private final ConnectionReuseStrategy reuseStrategy;

    public MinimalClientExec(HttpRequestExecutor httpRequestExecutor, HttpClientConnectionManager httpClientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        Args.notNull(httpRequestExecutor, "HTTP request executor");
        Args.notNull(httpClientConnectionManager, "Client connection manager");
        Args.notNull(connectionReuseStrategy, "Connection reuse strategy");
        Args.notNull(connectionKeepAliveStrategy, "Connection keep alive strategy");
        this.httpProcessor = new ImmutableHttpProcessor(new RequestContent(), new RequestTargetHost(), new RequestClientConnControl(), new RequestUserAgent(VersionInfo.getUserAgent("Apache-HttpClient", "org.apache.http.client", getClass())));
        this.requestExecutor = httpRequestExecutor;
        this.connManager = httpClientConnectionManager;
        this.reuseStrategy = connectionReuseStrategy;
        this.keepAliveStrategy = connectionKeepAliveStrategy;
    }

    public static void rewriteRequestURI(HttpRequestWrapper httpRequestWrapper, HttpRoute httpRoute) {
        try {
            URI uri = httpRequestWrapper.getURI();
            if (uri != null) {
                httpRequestWrapper.setURI(uri.isAbsolute() ? URIUtils.rewriteURI(uri, null, true) : URIUtils.rewriteURI(uri));
            }
        } catch (URISyntaxException e10) {
            throw new ProtocolException("Invalid URI: " + httpRequestWrapper.getRequestLine().getUri(), e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x015d A[Catch: Error -> 0x0207, RuntimeException -> 0x0213, IOException -> 0x021b, HttpException -> 0x0223, ConnectionShutdownException -> 0x022b, TRY_ENTER, TryCatch #3 {IOException -> 0x021b, Error -> 0x0207, ConnectionShutdownException -> 0x022b, RuntimeException -> 0x0213, HttpException -> 0x0223, blocks: (B:55:0x009b, B:57:0x00a5, B:58:0x00b1, B:59:0x00c1, B:18:0x00c4, B:20:0x00cc, B:23:0x00e4, B:25:0x0100, B:27:0x010a, B:29:0x0114, B:31:0x0121, B:33:0x0135, B:36:0x015d, B:38:0x0164, B:40:0x01b5, B:42:0x01d5, B:44:0x01df, B:47:0x01eb, B:50:0x01f8, B:52:0x01cf), top: B:54:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b5 A[Catch: Error -> 0x0207, RuntimeException -> 0x0213, IOException -> 0x021b, HttpException -> 0x0223, ConnectionShutdownException -> 0x022b, TRY_LEAVE, TryCatch #3 {IOException -> 0x021b, Error -> 0x0207, ConnectionShutdownException -> 0x022b, RuntimeException -> 0x0213, HttpException -> 0x0223, blocks: (B:55:0x009b, B:57:0x00a5, B:58:0x00b1, B:59:0x00c1, B:18:0x00c4, B:20:0x00cc, B:23:0x00e4, B:25:0x0100, B:27:0x010a, B:29:0x0114, B:31:0x0121, B:33:0x0135, B:36:0x015d, B:38:0x0164, B:40:0x01b5, B:42:0x01d5, B:44:0x01df, B:47:0x01eb, B:50:0x01f8, B:52:0x01cf), top: B:54:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cf A[Catch: Error -> 0x0207, RuntimeException -> 0x0213, IOException -> 0x021b, HttpException -> 0x0223, ConnectionShutdownException -> 0x022b, TRY_ENTER, TryCatch #3 {IOException -> 0x021b, Error -> 0x0207, ConnectionShutdownException -> 0x022b, RuntimeException -> 0x0213, HttpException -> 0x0223, blocks: (B:55:0x009b, B:57:0x00a5, B:58:0x00b1, B:59:0x00c1, B:18:0x00c4, B:20:0x00cc, B:23:0x00e4, B:25:0x0100, B:27:0x010a, B:29:0x0114, B:31:0x0121, B:33:0x0135, B:36:0x015d, B:38:0x0164, B:40:0x01b5, B:42:0x01d5, B:44:0x01df, B:47:0x01eb, B:50:0x01f8, B:52:0x01cf), top: B:54:0x009b }] */
    @Override // org.apache.http.impl.execchain.ClientExecChain
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.http.client.methods.CloseableHttpResponse execute(org.apache.http.conn.routing.HttpRoute r7, org.apache.http.client.methods.HttpRequestWrapper r8, org.apache.http.client.protocol.HttpClientContext r9, org.apache.http.client.methods.HttpExecutionAware r10) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.execchain.MinimalClientExec.execute(org.apache.http.conn.routing.HttpRoute, org.apache.http.client.methods.HttpRequestWrapper, org.apache.http.client.protocol.HttpClientContext, org.apache.http.client.methods.HttpExecutionAware):org.apache.http.client.methods.CloseableHttpResponse");
    }
}
