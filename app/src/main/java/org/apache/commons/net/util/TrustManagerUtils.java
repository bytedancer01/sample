package org.apache.commons.net.util;

import java.security.KeyStore;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/util/TrustManagerUtils.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/util/TrustManagerUtils.class */
public final class TrustManagerUtils {
    private static final X509Certificate[] EMPTY_X509CERTIFICATE_ARRAY = new X509Certificate[0];
    private static final X509TrustManager ACCEPT_ALL = new TrustManager(false);
    private static final X509TrustManager CHECK_SERVER_VALIDITY = new TrustManager(true);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/net/util/TrustManagerUtils$TrustManager.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/net/util/TrustManagerUtils$TrustManager.class */
    public static class TrustManager implements X509TrustManager {
        private final boolean checkServerValidity;

        public TrustManager(boolean z10) {
            this.checkServerValidity = z10;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            if (this.checkServerValidity) {
                for (X509Certificate x509Certificate : x509CertificateArr) {
                    x509Certificate.checkValidity();
                }
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return TrustManagerUtils.EMPTY_X509CERTIFICATE_ARRAY;
        }
    }

    public static X509TrustManager getAcceptAllTrustManager() {
        return ACCEPT_ALL;
    }

    public static X509TrustManager getDefaultTrustManager(KeyStore keyStore) {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        return (X509TrustManager) trustManagerFactory.getTrustManagers()[0];
    }

    public static X509TrustManager getValidateServerCertificateTrustManager() {
        return CHECK_SERVER_VALIDITY;
    }
}
