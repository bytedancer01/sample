package org.apache.commons.logging.impl;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import org.apache.commons.logging.Log;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/logging/impl/Jdk13LumberjackLogger.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/logging/impl/Jdk13LumberjackLogger.class */
public class Jdk13LumberjackLogger implements Log, Serializable {
    public static final Level dummyLevel = Level.FINE;
    private static final long serialVersionUID = -8649807923527610591L;
    public transient Logger logger;
    public String name;
    private String sourceClassName = "unknown";
    private String sourceMethodName = "unknown";
    private boolean classAndMethodFound = false;

    public Jdk13LumberjackLogger(String str) {
        this.logger = null;
        this.name = str;
        this.logger = getLogger();
    }

    private void getClassAndMethod() {
        String nextToken;
        String str;
        try {
            Throwable th2 = new Throwable();
            th2.fillInStackTrace();
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            StringTokenizer stringTokenizer = new StringTokenizer(stringWriter.getBuffer().toString(), "\n");
            stringTokenizer.nextToken();
            do {
                nextToken = stringTokenizer.nextToken();
                str = nextToken;
            } while (nextToken.indexOf(getClass().getName()) == -1);
            while (str.indexOf(getClass().getName()) >= 0) {
                str = stringTokenizer.nextToken();
            }
            String substring = str.substring(str.indexOf("at ") + 3, str.indexOf(40));
            int lastIndexOf = substring.lastIndexOf(46);
            this.sourceClassName = substring.substring(0, lastIndexOf);
            this.sourceMethodName = substring.substring(lastIndexOf + 1);
        } catch (Exception e10) {
        }
        this.classAndMethodFound = true;
    }

    private void log(Level level, String str, Throwable th2) {
        if (getLogger().isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, str);
            if (!this.classAndMethodFound) {
                getClassAndMethod();
            }
            logRecord.setSourceClassName(this.sourceClassName);
            logRecord.setSourceMethodName(this.sourceMethodName);
            if (th2 != null) {
                logRecord.setThrown(th2);
            }
            getLogger().log(logRecord);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj) {
        log(Level.FINE, String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj, Throwable th2) {
        log(Level.FINE, String.valueOf(obj), th2);
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj) {
        log(Level.SEVERE, String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj, Throwable th2) {
        log(Level.SEVERE, String.valueOf(obj), th2);
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj) {
        log(Level.SEVERE, String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj, Throwable th2) {
        log(Level.SEVERE, String.valueOf(obj), th2);
    }

    public Logger getLogger() {
        if (this.logger == null) {
            this.logger = Logger.getLogger(this.name);
        }
        return this.logger;
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj) {
        log(Level.INFO, String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj, Throwable th2) {
        log(Level.INFO, String.valueOf(obj), th2);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isDebugEnabled() {
        return getLogger().isLoggable(Level.FINE);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isErrorEnabled() {
        return getLogger().isLoggable(Level.SEVERE);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isFatalEnabled() {
        return getLogger().isLoggable(Level.SEVERE);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isInfoEnabled() {
        return getLogger().isLoggable(Level.INFO);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isTraceEnabled() {
        return getLogger().isLoggable(Level.FINEST);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isWarnEnabled() {
        return getLogger().isLoggable(Level.WARNING);
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj) {
        log(Level.FINEST, String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj, Throwable th2) {
        log(Level.FINEST, String.valueOf(obj), th2);
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj) {
        log(Level.WARNING, String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj, Throwable th2) {
        log(Level.WARNING, String.valueOf(obj), th2);
    }
}
