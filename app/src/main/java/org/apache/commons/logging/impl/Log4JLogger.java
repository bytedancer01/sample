package org.apache.commons.logging.impl;

import java.io.Serializable;
import org.apache.commons.logging.Log;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/logging/impl/Log4JLogger.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/logging/impl/Log4JLogger.class */
public class Log4JLogger implements Log, Serializable {
    private static final String FQCN = null;
    public static Class class$org$apache$commons$logging$impl$Log4JLogger;
    public static Class class$org$apache$log4j$Level;
    public static Class class$org$apache$log4j$Priority;
    private static final long serialVersionUID = 5160705895411730424L;
    private static final Priority traceLevel = null;
    private volatile transient Logger logger;
    private final String name;

    static {
        throw null;
    }

    public Log4JLogger() {
        this.logger = null;
        this.name = null;
    }

    public Log4JLogger(String str) {
        this.logger = null;
        this.name = str;
        this.logger = getLogger();
    }

    public Log4JLogger(Logger logger) {
        this.logger = null;
        if (logger == null) {
            throw new IllegalArgumentException("Warning - null logger in constructor; possible log4j misconfiguration.");
        }
        this.name = logger.getName();
        this.logger = logger;
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            throw new NoClassDefFoundError(e10.getMessage());
        }
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj) {
        getLogger().log(FQCN, Level.DEBUG, obj, (Throwable) null);
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj, Throwable th2) {
        getLogger().log(FQCN, Level.DEBUG, obj, th2);
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj) {
        getLogger().log(FQCN, Level.ERROR, obj, (Throwable) null);
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj, Throwable th2) {
        getLogger().log(FQCN, Level.ERROR, obj, th2);
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj) {
        getLogger().log(FQCN, Level.FATAL, obj, (Throwable) null);
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj, Throwable th2) {
        getLogger().log(FQCN, Level.FATAL, obj, th2);
    }

    public Logger getLogger() {
        Logger logger = this.logger;
        Logger logger2 = logger;
        if (logger == null) {
            synchronized (this) {
                Logger logger3 = this.logger;
                logger2 = logger3;
                if (logger3 == null) {
                    logger2 = Logger.getLogger(this.name);
                    this.logger = logger2;
                }
            }
        }
        return logger2;
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj) {
        getLogger().log(FQCN, Level.INFO, obj, (Throwable) null);
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj, Throwable th2) {
        getLogger().log(FQCN, Level.INFO, obj, th2);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isDebugEnabled() {
        return getLogger().isDebugEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isErrorEnabled() {
        return getLogger().isEnabledFor(Level.ERROR);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isFatalEnabled() {
        return getLogger().isEnabledFor(Level.FATAL);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isInfoEnabled() {
        return getLogger().isInfoEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isTraceEnabled() {
        return getLogger().isEnabledFor(traceLevel);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isWarnEnabled() {
        return getLogger().isEnabledFor(Level.WARN);
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj) {
        getLogger().log(FQCN, traceLevel, obj, (Throwable) null);
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj, Throwable th2) {
        getLogger().log(FQCN, traceLevel, obj, th2);
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj) {
        getLogger().log(FQCN, Level.WARN, obj, (Throwable) null);
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj, Throwable th2) {
        getLogger().log(FQCN, Level.WARN, obj, th2);
    }
}
