package org.apache.http.conn.ssl;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/ssl/AllowAllHostnameVerifier.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/ssl/AllowAllHostnameVerifier.class */
public class AllowAllHostnameVerifier extends AbstractVerifier {
    public static final AllowAllHostnameVerifier INSTANCE = new AllowAllHostnameVerifier();

    public final String toString() {
        return "ALLOW_ALL";
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
    public final void verify(String str, String[] strArr, String[] strArr2) {
    }
}
