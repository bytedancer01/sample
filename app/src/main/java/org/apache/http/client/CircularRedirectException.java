package org.apache.http.client;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/CircularRedirectException.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/CircularRedirectException.class */
public class CircularRedirectException extends RedirectException {
    private static final long serialVersionUID = 6830063487001091803L;

    public CircularRedirectException() {
    }

    public CircularRedirectException(String str) {
        super(str);
    }

    public CircularRedirectException(String str, Throwable th2) {
        super(str, th2);
    }
}
