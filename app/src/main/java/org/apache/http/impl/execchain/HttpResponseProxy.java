package org.apache.http.impl.execchain;

import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.params.HttpParams;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/execchain/HttpResponseProxy.class */
class HttpResponseProxy implements CloseableHttpResponse {
    private final ConnectionHolder connHolder;
    private final HttpResponse original;

    public HttpResponseProxy(HttpResponse httpResponse, ConnectionHolder connectionHolder) {
        this.original = httpResponse;
        this.connHolder = connectionHolder;
        ResponseEntityProxy.enchance(httpResponse, connectionHolder);
    }

    @Override // org.apache.http.HttpMessage
    public void addHeader(String str, String str2) {
        this.original.addHeader(str, str2);
    }

    @Override // org.apache.http.HttpMessage
    public void addHeader(Header header) {
        this.original.addHeader(header);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ConnectionHolder connectionHolder = this.connHolder;
        if (connectionHolder != null) {
            connectionHolder.close();
        }
    }

    @Override // org.apache.http.HttpMessage
    public boolean containsHeader(String str) {
        return this.original.containsHeader(str);
    }

    @Override // org.apache.http.HttpMessage
    public Header[] getAllHeaders() {
        return this.original.getAllHeaders();
    }

    @Override // org.apache.http.HttpResponse
    public HttpEntity getEntity() {
        return this.original.getEntity();
    }

    @Override // org.apache.http.HttpMessage
    public Header getFirstHeader(String str) {
        return this.original.getFirstHeader(str);
    }

    @Override // org.apache.http.HttpMessage
    public Header[] getHeaders(String str) {
        return this.original.getHeaders(str);
    }

    @Override // org.apache.http.HttpMessage
    public Header getLastHeader(String str) {
        return this.original.getLastHeader(str);
    }

    @Override // org.apache.http.HttpResponse
    public Locale getLocale() {
        return this.original.getLocale();
    }

    @Override // org.apache.http.HttpMessage
    @Deprecated
    public HttpParams getParams() {
        return this.original.getParams();
    }

    @Override // org.apache.http.HttpMessage
    public ProtocolVersion getProtocolVersion() {
        return this.original.getProtocolVersion();
    }

    @Override // org.apache.http.HttpResponse
    public StatusLine getStatusLine() {
        return this.original.getStatusLine();
    }

    @Override // org.apache.http.HttpMessage
    public HeaderIterator headerIterator() {
        return this.original.headerIterator();
    }

    @Override // org.apache.http.HttpMessage
    public HeaderIterator headerIterator(String str) {
        return this.original.headerIterator(str);
    }

    @Override // org.apache.http.HttpMessage
    public void removeHeader(Header header) {
        this.original.removeHeader(header);
    }

    @Override // org.apache.http.HttpMessage
    public void removeHeaders(String str) {
        this.original.removeHeaders(str);
    }

    @Override // org.apache.http.HttpResponse
    public void setEntity(HttpEntity httpEntity) {
        this.original.setEntity(httpEntity);
    }

    @Override // org.apache.http.HttpMessage
    public void setHeader(String str, String str2) {
        this.original.setHeader(str, str2);
    }

    @Override // org.apache.http.HttpMessage
    public void setHeader(Header header) {
        this.original.setHeader(header);
    }

    @Override // org.apache.http.HttpMessage
    public void setHeaders(Header[] headerArr) {
        this.original.setHeaders(headerArr);
    }

    @Override // org.apache.http.HttpResponse
    public void setLocale(Locale locale) {
        this.original.setLocale(locale);
    }

    @Override // org.apache.http.HttpMessage
    @Deprecated
    public void setParams(HttpParams httpParams) {
        this.original.setParams(httpParams);
    }

    @Override // org.apache.http.HttpResponse
    public void setReasonPhrase(String str) {
        this.original.setReasonPhrase(str);
    }

    @Override // org.apache.http.HttpResponse
    public void setStatusCode(int i10) {
        this.original.setStatusCode(i10);
    }

    @Override // org.apache.http.HttpResponse
    public void setStatusLine(ProtocolVersion protocolVersion, int i10) {
        this.original.setStatusLine(protocolVersion, i10);
    }

    @Override // org.apache.http.HttpResponse
    public void setStatusLine(ProtocolVersion protocolVersion, int i10, String str) {
        this.original.setStatusLine(protocolVersion, i10, str);
    }

    @Override // org.apache.http.HttpResponse
    public void setStatusLine(StatusLine statusLine) {
        this.original.setStatusLine(statusLine);
    }

    public String toString() {
        return "HttpResponseProxy{" + this.original + '}';
    }
}
