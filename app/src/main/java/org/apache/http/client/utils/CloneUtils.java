package org.apache.http.client.utils;

import java.lang.reflect.InvocationTargetException;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/utils/CloneUtils.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/utils/CloneUtils.class */
public class CloneUtils {
    private CloneUtils() {
    }

    public static Object clone(Object obj) {
        return cloneObject(obj);
    }

    public static <T> T cloneObject(T t10) {
        if (t10 == null) {
            return null;
        }
        if (!(t10 instanceof Cloneable)) {
            throw new CloneNotSupportedException();
        }
        try {
            try {
                return (T) t10.getClass().getMethod("clone", null).invoke(t10, null);
            } catch (IllegalAccessException e10) {
                throw new IllegalAccessError(e10.getMessage());
            } catch (InvocationTargetException e11) {
                Throwable cause = e11.getCause();
                if (cause instanceof CloneNotSupportedException) {
                    throw ((CloneNotSupportedException) cause);
                }
                throw new Error("Unexpected exception", cause);
            }
        } catch (NoSuchMethodException e12) {
            throw new NoSuchMethodError(e12.getMessage());
        }
    }
}
