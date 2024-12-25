package org.apache.http.client;

import org.apache.http.ProtocolException;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/RedirectException.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/RedirectException.class */
public class RedirectException extends ProtocolException {
    private static final long serialVersionUID = 4418824536372559326L;

    public RedirectException() {
    }

    public RedirectException(String str) {
        super(str);
    }

    public RedirectException(String str, Throwable th2) {
        super(str, th2);
    }
}
