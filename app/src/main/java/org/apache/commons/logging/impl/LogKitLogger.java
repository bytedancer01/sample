package org.apache.commons.logging.impl;

import java.io.Serializable;
import org.apache.commons.logging.Log;
import org.apache.log.Hierarchy;
import org.apache.log.Logger;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/logging/impl/LogKitLogger.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/logging/impl/LogKitLogger.class */
public class LogKitLogger implements Log, Serializable {
    private static final long serialVersionUID = 3768538055836059519L;
    public volatile transient Logger logger;
    public String name;

    public LogKitLogger(String str) {
        this.logger = null;
        this.name = str;
        this.logger = getLogger();
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj) {
        if (obj != null) {
            getLogger().debug(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj, Throwable th2) {
        if (obj != null) {
            getLogger().debug(String.valueOf(obj), th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj) {
        if (obj != null) {
            getLogger().error(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj, Throwable th2) {
        if (obj != null) {
            getLogger().error(String.valueOf(obj), th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj) {
        if (obj != null) {
            getLogger().fatalError(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj, Throwable th2) {
        if (obj != null) {
            getLogger().fatalError(String.valueOf(obj), th2);
        }
    }

    public Logger getLogger() {
        Logger logger = this.logger;
        Logger logger2 = logger;
        if (logger == null) {
            synchronized (this) {
                Logger logger3 = this.logger;
                logger2 = logger3;
                if (logger3 == null) {
                    logger2 = Hierarchy.getDefaultHierarchy().getLoggerFor(this.name);
                    this.logger = logger2;
                }
            }
        }
        return logger2;
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj) {
        if (obj != null) {
            getLogger().info(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj, Throwable th2) {
        if (obj != null) {
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
        debug(obj);
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj, Throwable th2) {
        debug(obj, th2);
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj) {
        if (obj != null) {
            getLogger().warn(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj, Throwable th2) {
        if (obj != null) {
            getLogger().warn(String.valueOf(obj), th2);
        }
    }
}
