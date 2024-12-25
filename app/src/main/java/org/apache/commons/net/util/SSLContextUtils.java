package org.apache.commons.net.util;

import java.io.IOException;
import java.security.GeneralSecurityException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/util/SSLContextUtils.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/util/SSLContextUtils.class */
public class SSLContextUtils {
    private SSLContextUtils() {
    }

    public static SSLContext createSSLContext(String str, KeyManager keyManager, TrustManager trustManager) {
        return createSSLContext(str, keyManager == null ? null : new KeyManager[]{keyManager}, trustManager == null ? null : new TrustManager[]{trustManager});
    }

    public static SSLContext createSSLContext(String str, KeyManager[] keyManagerArr, TrustManager[] trustManagerArr) {
        try {
            SSLContext sSLContext = SSLContext.getInstance(str);
            sSLContext.init(keyManagerArr, trustManagerArr, null);
            return sSLContext;
        } catch (GeneralSecurityException e10) {
            IOException iOException = new IOException("Could not initialize SSL context");
            iOException.initCause(e10);
            throw iOException;
        }
    }
}
