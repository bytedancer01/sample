package org.apache.commons.logging.impl;

import org.apache.avalon.framework.logger.Logger;
import org.apache.commons.logging.Log;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/logging/impl/AvalonLogger.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/logging/impl/AvalonLogger.class */
public class AvalonLogger implements Log {
    private static volatile Logger defaultLogger;
    private final transient Logger logger;

    public AvalonLogger(String str) {
        if (defaultLogger == null) {
            throw new NullPointerException("default logger has to be specified if this constructor is used!");
        }
        this.logger = defaultLogger.getChildLogger(str);
    }

    public AvalonLogger(Logger logger) {
        this.logger = logger;
    }

    public static void setDefaultLogger(Logger logger) {
        defaultLogger = logger;
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj) {
        if (getLogger().isDebugEnabled()) {
            getLogger().debug(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj, Throwable th2) {
        if (getLogger().isDebugEnabled()) {
            getLogger().debug(String.valueOf(obj), th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj) {
        if (getLogger().isErrorEnabled()) {
            getLogger().error(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj, Throwable th2) {
        if (getLogger().isErrorEnabled()) {
            getLogger().error(String.valueOf(obj), th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj) {
        if (getLogger().isFatalErrorEnabled()) {
            getLogger().fatalError(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj, Throwable th2) {
        if (getLogger().isFatalErrorEnabled()) {
            getLogger().fatalError(String.valueOf(obj), th2);
        }
    }

    public Logger getLogger() {
        return this.logger;
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj) {
        if (getLogger().isInfoEnabled()) {
            getLogger().info(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj, Throwable th2) {
        if (getLogger().isInfoEnabled()) {
            getLogger().info(String.valueOf(obj), th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public boolean isDebugEnabled() {
        return getLogger().isDebugEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isErrorEnabled() {
        return getLogger().isErrorEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isFatalEnabled() {
        return getLogger().isFatalErrorEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isInfoEnabled() {
        return getLogger().isInfoEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isTraceEnabled() {
        return getLogger().isDebugEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isWarnEnabled() {
        return getLogger().isWarnEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj) {
        if (getLogger().isDebugEnabled()) {
            getLogger().debug(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj, Throwable th2) {
        if (getLogger().isDebugEnabled()) {
            getLogger().debug(String.valueOf(obj), th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj) {
        if (getLogger().isWarnEnabled()) {
            getLogger().warn(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj, Throwable th2) {
        if (getLogger().isWarnEnabled()) {
            getLogger().warn(String.valueOf(obj), th2);
        }
    }
}
