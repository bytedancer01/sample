package org.apache.http.conn.ssl;

import java.security.cert.X509Certificate;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/ssl/TrustSelfSignedStrategy.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/ssl/TrustSelfSignedStrategy.class */
public class TrustSelfSignedStrategy implements TrustStrategy {
    public static final TrustSelfSignedStrategy INSTANCE = new TrustSelfSignedStrategy();

    @Override // org.apache.http.ssl.TrustStrategy
    public boolean isTrusted(X509Certificate[] x509CertificateArr, String str) {
        boolean z10 = true;
        if (x509CertificateArr.length != 1) {
            z10 = false;
        }
        return z10;
    }
}
