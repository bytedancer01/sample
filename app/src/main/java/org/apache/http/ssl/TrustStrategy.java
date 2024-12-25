package org.apache.http.ssl;

import java.security.cert.X509Certificate;

/* loaded from: combined.jar:classes3.jar:org/apache/http/ssl/TrustStrategy.class */
public interface TrustStrategy {
    boolean isTrusted(X509Certificate[] x509CertificateArr, String str);
}
