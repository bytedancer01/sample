package org.apache.http.ssl;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;

/* loaded from: combined.jar:classes3.jar:org/apache/http/ssl/SSLContexts.class */
public class SSLContexts {
    public static SSLContext createDefault() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            return sSLContext;
        } catch (KeyManagementException e10) {
            throw new SSLInitializationException(e10.getMessage(), e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new SSLInitializationException(e11.getMessage(), e11);
        }
    }

    public static SSLContext createSystemDefault() {
        try {
            return SSLContext.getDefault();
        } catch (NoSuchAlgorithmException e10) {
            return createDefault();
        }
    }

    public static SSLContextBuilder custom() {
        return SSLContextBuilder.create();
    }
}
