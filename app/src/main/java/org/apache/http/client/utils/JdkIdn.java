package org.apache.http.client.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/utils/JdkIdn.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/utils/JdkIdn.class */
public class JdkIdn implements Idn {
    private final Method toUnicode;

    public JdkIdn() {
        try {
            this.toUnicode = Class.forName("java.net.IDN").getMethod("toUnicode", String.class);
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException(e10.getMessage(), e10);
        } catch (SecurityException e11) {
            throw new IllegalStateException(e11.getMessage(), e11);
        }
    }

    @Override // org.apache.http.client.utils.Idn
    public String toUnicode(String str) {
        try {
            return (String) this.toUnicode.invoke(null, str);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10.getMessage(), e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            throw new RuntimeException(cause.getMessage(), cause);
        }
    }
}
