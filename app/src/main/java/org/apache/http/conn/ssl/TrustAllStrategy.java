package org.apache.http.conn.ssl;

import java.security.cert.X509Certificate;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/ssl/TrustAllStrategy.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/ssl/TrustAllStrategy.class */
public class TrustAllStrategy implements TrustStrategy {
    public static final TrustAllStrategy INSTANCE = new TrustAllStrategy();

    @Override // org.apache.http.ssl.TrustStrategy
    public boolean isTrusted(X509Certificate[] x509CertificateArr, String str) {
        return true;
    }
}
