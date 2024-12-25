package org.apache.http.cookie;

import org.apache.http.ProtocolException;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/cookie/MalformedCookieException.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/cookie/MalformedCookieException.class */
public class MalformedCookieException extends ProtocolException {
    private static final long serialVersionUID = -6695462944287282185L;

    public MalformedCookieException() {
    }

    public MalformedCookieException(String str) {
        super(str);
    }

    public MalformedCookieException(String str, Throwable th2) {
        super(str, th2);
    }
}
