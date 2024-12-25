package org.apache.commons.logging;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/logging/Log.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/logging/Log.class */
public interface Log {
    void debug(Object obj);

    void debug(Object obj, Throwable th2);

    void error(Object obj);

    void error(Object obj, Throwable th2);

    void fatal(Object obj);

    void fatal(Object obj, Throwable th2);

    void info(Object obj);

    void info(Object obj, Throwable th2);

    boolean isDebugEnabled();

    boolean isErrorEnabled();

    boolean isFatalEnabled();

    boolean isInfoEnabled();

    boolean isTraceEnabled();

    boolean isWarnEnabled();

    void trace(Object obj);

    void trace(Object obj, Throwable th2);

    void warn(Object obj);

    void warn(Object obj, Throwable th2);
}
