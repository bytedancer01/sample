package org.apache.http.params;

import org.apache.http.util.Args;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/params/HttpConnectionParams.class */
public final class HttpConnectionParams implements CoreConnectionPNames {
    private HttpConnectionParams() {
    }

    public static int getConnectionTimeout(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        return httpParams.getIntParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 0);
    }

    public static int getLinger(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        return httpParams.getIntParameter(CoreConnectionPNames.SO_LINGER, -1);
    }

    public static boolean getSoKeepalive(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        return httpParams.getBooleanParameter(CoreConnectionPNames.SO_KEEPALIVE, false);
    }

    public static boolean getSoReuseaddr(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        return httpParams.getBooleanParameter(CoreConnectionPNames.SO_REUSEADDR, false);
    }

    public static int getSoTimeout(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        return httpParams.getIntParameter(CoreConnectionPNames.SO_TIMEOUT, 0);
    }

    public static int getSocketBufferSize(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        return httpParams.getIntParameter(CoreConnectionPNames.SOCKET_BUFFER_SIZE, -1);
    }

    public static boolean getTcpNoDelay(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        return httpParams.getBooleanParameter(CoreConnectionPNames.TCP_NODELAY, true);
    }

    public static boolean isStaleCheckingEnabled(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        return httpParams.getBooleanParameter(CoreConnectionPNames.STALE_CONNECTION_CHECK, true);
    }

    public static void setConnectionTimeout(HttpParams httpParams, int i10) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setIntParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, i10);
    }

    public static void setLinger(HttpParams httpParams, int i10) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setIntParameter(CoreConnectionPNames.SO_LINGER, i10);
    }

    public static void setSoKeepalive(HttpParams httpParams, boolean z10) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setBooleanParameter(CoreConnectionPNames.SO_KEEPALIVE, z10);
    }

    public static void setSoReuseaddr(HttpParams httpParams, boolean z10) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setBooleanParameter(CoreConnectionPNames.SO_REUSEADDR, z10);
    }

    public static void setSoTimeout(HttpParams httpParams, int i10) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setIntParameter(CoreConnectionPNames.SO_TIMEOUT, i10);
    }

    public static void setSocketBufferSize(HttpParams httpParams, int i10) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setIntParameter(CoreConnectionPNames.SOCKET_BUFFER_SIZE, i10);
    }

    public static void setStaleCheckingEnabled(HttpParams httpParams, boolean z10) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setBooleanParameter(CoreConnectionPNames.STALE_CONNECTION_CHECK, z10);
    }

    public static void setTcpNoDelay(HttpParams httpParams, boolean z10) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setBooleanParameter(CoreConnectionPNames.TCP_NODELAY, z10);
    }
}
