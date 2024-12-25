package org.apache.commons.logging.impl;

import java.io.Serializable;
import org.apache.commons.logging.Log;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/logging/impl/NoOpLog.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/logging/impl/NoOpLog.class */
public class NoOpLog implements Log, Serializable {
    private static final long serialVersionUID = 561423906191706148L;

    public NoOpLog() {
    }

    public NoOpLog(String str) {
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj) {
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj, Throwable th2) {
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj) {
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj, Throwable th2) {
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj) {
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj, Throwable th2) {
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj) {
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj, Throwable th2) {
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isDebugEnabled() {
        return false;
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isErrorEnabled() {
        return false;
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isFatalEnabled() {
        return false;
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isInfoEnabled() {
        return false;
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isTraceEnabled() {
        return false;
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isWarnEnabled() {
        return false;
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj) {
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj, Throwable th2) {
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj) {
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj, Throwable th2) {
    }
}
