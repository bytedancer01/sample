package org.apache.http.protocol;

import java.io.IOException;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/protocol/HttpRequestExecutor.class */
public class HttpRequestExecutor {
    public static final int DEFAULT_WAIT_FOR_CONTINUE = 3000;
    private final int waitForContinue;

    public HttpRequestExecutor() {
        this(DEFAULT_WAIT_FOR_CONTINUE);
    }

    public HttpRequestExecutor(int i10) {
        this.waitForContinue = Args.positive(i10, "Wait for continue time");
    }

    private static void closeConnection(HttpClientConnection httpClientConnection) {
        try {
            httpClientConnection.close();
        } catch (IOException e10) {
        }
    }

    public boolean canResponseHaveBody(HttpRequest httpRequest, HttpResponse httpResponse) {
        if (HttpHead.METHOD_NAME.equalsIgnoreCase(httpRequest.getRequestLine().getMethod())) {
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

    public HttpResponse doReceiveResponse(HttpRequest httpRequest, HttpClientConnection httpClientConnection, HttpContext httpContext) {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpClientConnection, "Client connection");
        Args.notNull(httpContext, "HTTP context");
        HttpResponse httpResponse = null;
        int i10 = 0;
        while (true) {
            if (httpResponse != null && i10 >= 200) {
                return httpResponse;
            }
            HttpResponse receiveResponseHeader = httpClientConnection.receiveResponseHeader();
            int statusCode = receiveResponseHeader.getStatusLine().getStatusCode();
            if (statusCode < 100) {
                throw new ProtocolException("Invalid response: " + receiveResponseHeader.getStatusLine());
            }
            i10 = statusCode;
            httpResponse = receiveResponseHeader;
            if (canResponseHaveBody(httpRequest, receiveResponseHeader)) {
                httpClientConnection.receiveResponseEntity(receiveResponseHeader);
                i10 = statusCode;
                httpResponse = receiveResponseHeader;
            }
        }
    }

    public HttpResponse doSendRequest(HttpRequest httpRequest, HttpClientConnection httpClientConnection, HttpContext httpContext) {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpClientConnection, "Client connection");
        Args.notNull(httpContext, "HTTP context");
        httpContext.setAttribute("http.connection", httpClientConnection);
        httpContext.setAttribute("http.request_sent", Boolean.FALSE);
        httpClientConnection.sendRequestHeader(httpRequest);
        HttpResponse httpResponse = null;
        if (httpRequest instanceof HttpEntityEnclosingRequest) {
            ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
            HttpEntityEnclosingRequest httpEntityEnclosingRequest = (HttpEntityEnclosingRequest) httpRequest;
            boolean z10 = true;
            HttpResponse httpResponse2 = null;
            if (httpEntityEnclosingRequest.expectContinue()) {
                z10 = true;
                httpResponse2 = null;
                if (!protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
                    httpClientConnection.flush();
                    z10 = true;
                    httpResponse2 = null;
                    if (httpClientConnection.isResponseAvailable(this.waitForContinue)) {
                        httpResponse2 = httpClientConnection.receiveResponseHeader();
                        if (canResponseHaveBody(httpRequest, httpResponse2)) {
                            httpClientConnection.receiveResponseEntity(httpResponse2);
                        }
                        int statusCode = httpResponse2.getStatusLine().getStatusCode();
                        if (statusCode >= 200) {
                            z10 = false;
                        } else {
                            if (statusCode != 100) {
                                throw new ProtocolException("Unexpected response: " + httpResponse2.getStatusLine());
                            }
                            z10 = true;
                            httpResponse2 = null;
                        }
                    }
                }
            }
            httpResponse = httpResponse2;
            if (z10) {
                httpClientConnection.sendRequestEntity(httpEntityEnclosingRequest);
                httpResponse = httpResponse2;
            }
        }
        httpClientConnection.flush();
        httpContext.setAttribute("http.request_sent", Boolean.TRUE);
        return httpResponse;
    }

    public HttpResponse execute(HttpRequest httpRequest, HttpClientConnection httpClientConnection, HttpContext httpContext) {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpClientConnection, "Client connection");
        Args.notNull(httpContext, "HTTP context");
        try {
            HttpResponse doSendRequest = doSendRequest(httpRequest, httpClientConnection, httpContext);
            HttpResponse httpResponse = doSendRequest;
            if (doSendRequest == null) {
                httpResponse = doReceiveResponse(httpRequest, httpClientConnection, httpContext);
            }
            return httpResponse;
        } catch (IOException e10) {
            closeConnection(httpClientConnection);
            throw e10;
        } catch (RuntimeException e11) {
            closeConnection(httpClientConnection);
            throw e11;
        } catch (HttpException e12) {
            closeConnection(httpClientConnection);
            throw e12;
        }
    }

    public void postProcess(HttpResponse httpResponse, HttpProcessor httpProcessor, HttpContext httpContext) {
        Args.notNull(httpResponse, "HTTP response");
        Args.notNull(httpProcessor, "HTTP processor");
        Args.notNull(httpContext, "HTTP context");
        httpContext.setAttribute("http.response", httpResponse);
        httpProcessor.process(httpResponse, httpContext);
    }

    public void preProcess(HttpRequest httpRequest, HttpProcessor httpProcessor, HttpContext httpContext) {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpProcessor, "HTTP processor");
        Args.notNull(httpContext, "HTTP context");
        httpContext.setAttribute("http.request", httpRequest);
        httpProcessor.process(httpRequest, httpContext);
    }
}
