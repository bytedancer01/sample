package org.apache.http.client.params;

import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/params/HttpClientParams.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/params/HttpClientParams.class */
public class HttpClientParams {
    private HttpClientParams() {
    }

    public static long getConnectionManagerTimeout(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        Long l10 = (Long) httpParams.getParameter("http.conn-manager.timeout");
        return l10 != null ? l10.longValue() : HttpConnectionParams.getConnectionTimeout(httpParams);
    }

    public static String getCookiePolicy(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        String str = (String) httpParams.getParameter(ClientPNames.COOKIE_POLICY);
        String str2 = str;
        if (str == null) {
            str2 = "best-match";
        }
        return str2;
    }

    public static boolean isAuthenticating(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        return httpParams.getBooleanParameter(ClientPNames.HANDLE_AUTHENTICATION, true);
    }

    public static boolean isRedirecting(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        return httpParams.getBooleanParameter(ClientPNames.HANDLE_REDIRECTS, true);
    }

    public static void setAuthenticating(HttpParams httpParams, boolean z10) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setBooleanParameter(ClientPNames.HANDLE_AUTHENTICATION, z10);
    }

    public static void setConnectionManagerTimeout(HttpParams httpParams, long j10) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setLongParameter("http.conn-manager.timeout", j10);
    }

    public static void setCookiePolicy(HttpParams httpParams, String str) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setParameter(ClientPNames.COOKIE_POLICY, str);
    }

    public static void setRedirecting(HttpParams httpParams, boolean z10) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setBooleanParameter(ClientPNames.HANDLE_REDIRECTS, z10);
    }
}
