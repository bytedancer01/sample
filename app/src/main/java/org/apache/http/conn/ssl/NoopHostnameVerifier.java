package org.apache.http.conn.ssl;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/ssl/NoopHostnameVerifier.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/ssl/NoopHostnameVerifier.class */
public class NoopHostnameVerifier implements HostnameVerifier {
    public static final NoopHostnameVerifier INSTANCE = new NoopHostnameVerifier();

    public final String toString() {
        return "NO_OP";
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        return true;
    }
}
