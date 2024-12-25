package org.apache.commons.net.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.net.ssl.SSLSocket;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/util/SSLSocketUtils.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/util/SSLSocketUtils.class */
public class SSLSocketUtils {
    private SSLSocketUtils() {
    }

    public static boolean enableEndpointNameVerification(SSLSocket sSLSocket) {
        Object invoke;
        try {
            Class<?> cls = Class.forName("javax.net.ssl.SSLParameters");
            Method declaredMethod = cls.getDeclaredMethod("setEndpointIdentificationAlgorithm", String.class);
            Method declaredMethod2 = SSLSocket.class.getDeclaredMethod("getSSLParameters", new Class[0]);
            Method declaredMethod3 = SSLSocket.class.getDeclaredMethod("setSSLParameters", cls);
            if (declaredMethod == null || declaredMethod2 == null || declaredMethod3 == null || (invoke = declaredMethod2.invoke(sSLSocket, new Object[0])) == null) {
                return false;
            }
            declaredMethod.invoke(invoke, "HTTPS");
            declaredMethod3.invoke(sSLSocket, invoke);
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e10) {
            return false;
        }
    }
}
