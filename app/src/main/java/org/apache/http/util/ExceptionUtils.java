package org.apache.http.util;

import java.lang.reflect.Method;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/util/ExceptionUtils.class */
public final class ExceptionUtils {
    private static final Method INIT_CAUSE_METHOD = getInitCauseMethod();

    private ExceptionUtils() {
    }

    private static Method getInitCauseMethod() {
        try {
            return Throwable.class.getMethod("initCause", Throwable.class);
        } catch (NoSuchMethodException e10) {
            return null;
        }
    }

    public static void initCause(Throwable th2, Throwable th3) {
        Method method = INIT_CAUSE_METHOD;
        if (method != null) {
            try {
                method.invoke(th2, th3);
            } catch (Exception e10) {
            }
        }
    }
}
