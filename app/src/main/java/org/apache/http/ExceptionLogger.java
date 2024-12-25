package org.apache.http;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/ExceptionLogger.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/ExceptionLogger.class */
public interface ExceptionLogger {
    public static final ExceptionLogger NO_OP = new ExceptionLogger() { // from class: org.apache.http.ExceptionLogger.1
        @Override // org.apache.http.ExceptionLogger
        public void log(Exception exc) {
        }
    };
    public static final ExceptionLogger STD_ERR = new ExceptionLogger() { // from class: org.apache.http.ExceptionLogger.2
        @Override // org.apache.http.ExceptionLogger
        public void log(Exception exc) {
            exc.printStackTrace();
        }
    };

    void log(Exception exc);
}
