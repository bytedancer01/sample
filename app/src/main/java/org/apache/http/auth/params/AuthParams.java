package org.apache.http.auth.params;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/auth/params/AuthParams.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/auth/params/AuthParams.class */
public final class AuthParams {
    private AuthParams() {
    }

    public static String getCredentialCharset(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        String str = (String) httpParams.getParameter(AuthPNames.CREDENTIAL_CHARSET);
        String str2 = str;
        if (str == null) {
            str2 = HTTP.DEF_PROTOCOL_CHARSET.name();
        }
        return str2;
    }

    public static void setCredentialCharset(HttpParams httpParams, String str) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setParameter(AuthPNames.CREDENTIAL_CHARSET, str);
    }
}
