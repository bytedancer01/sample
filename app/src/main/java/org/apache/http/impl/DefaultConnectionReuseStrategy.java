package org.apache.http.impl;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ParseException;
import org.apache.http.ProtocolVersion;
import org.apache.http.TokenIterator;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.message.BasicTokenIterator;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/DefaultConnectionReuseStrategy.class */
public class DefaultConnectionReuseStrategy implements ConnectionReuseStrategy {
    public static final DefaultConnectionReuseStrategy INSTANCE = new DefaultConnectionReuseStrategy();

    private boolean canResponseHaveBody(HttpRequest httpRequest, HttpResponse httpResponse) {
        if (httpRequest != null && httpRequest.getRequestLine().getMethod().equalsIgnoreCase(HttpHead.METHOD_NAME)) {
            return false;
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        boolean z10 = false;
        if (statusCode >= 200) {
            z10 = false;
            if (statusCode != 204) {
                z10 = false;
                if (statusCode != 304) {
                    z10 = false;
                    if (statusCode != 205) {
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }

    public TokenIterator createTokenIterator(HeaderIterator headerIterator) {
        return new BasicTokenIterator(headerIterator);
    }

    @Override // org.apache.http.ConnectionReuseStrategy
    public boolean keepAlive(HttpResponse httpResponse, HttpContext httpContext) {
        Args.notNull(httpResponse, "HTTP response");
        Args.notNull(httpContext, "HTTP context");
        if (httpResponse.getStatusLine().getStatusCode() == 204) {
            Header firstHeader = httpResponse.getFirstHeader("Content-Length");
            if (firstHeader != null) {
                try {
                    if (Integer.parseInt(firstHeader.getValue()) > 0) {
                        return false;
                    }
                } catch (NumberFormatException e10) {
                }
            }
            if (httpResponse.getFirstHeader("Transfer-Encoding") != null) {
                return false;
            }
        }
        HttpRequest httpRequest = (HttpRequest) httpContext.getAttribute("http.request");
        if (httpRequest != null) {
            try {
                BasicTokenIterator basicTokenIterator = new BasicTokenIterator(httpRequest.headerIterator("Connection"));
                while (basicTokenIterator.hasNext()) {
                    if (HTTP.CONN_CLOSE.equalsIgnoreCase(basicTokenIterator.nextToken())) {
                        return false;
                    }
                }
            } catch (ParseException e11) {
                return false;
            }
        }
        ProtocolVersion protocolVersion = httpResponse.getStatusLine().getProtocolVersion();
        Header firstHeader2 = httpResponse.getFirstHeader("Transfer-Encoding");
        if (firstHeader2 != null) {
            if (!HTTP.CHUNK_CODING.equalsIgnoreCase(firstHeader2.getValue())) {
                return false;
            }
        } else if (canResponseHaveBody(httpRequest, httpResponse)) {
            Header[] headers = httpResponse.getHeaders("Content-Length");
            if (headers.length != 1) {
                return false;
            }
            try {
                if (Integer.parseInt(headers[0].getValue()) < 0) {
                    return false;
                }
            } catch (NumberFormatException e12) {
                return false;
            }
        }
        HeaderIterator headerIterator = httpResponse.headerIterator("Connection");
        HeaderIterator headerIterator2 = headerIterator;
        if (!headerIterator.hasNext()) {
            headerIterator2 = httpResponse.headerIterator("Proxy-Connection");
        }
        if (headerIterator2.hasNext()) {
            try {
                BasicTokenIterator basicTokenIterator2 = new BasicTokenIterator(headerIterator2);
                boolean z10 = false;
                while (basicTokenIterator2.hasNext()) {
                    String nextToken = basicTokenIterator2.nextToken();
                    if (HTTP.CONN_CLOSE.equalsIgnoreCase(nextToken)) {
                        return false;
                    }
                    if (HTTP.CONN_KEEP_ALIVE.equalsIgnoreCase(nextToken)) {
                        z10 = true;
                    }
                }
                if (z10) {
                    return true;
                }
            } catch (ParseException e13) {
                return false;
            }
        }
        return !protocolVersion.lessEquals(HttpVersion.HTTP_1_0);
    }
}
