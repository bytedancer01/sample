package org.apache.http;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/ProtocolException.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/ProtocolException.class */
public class ProtocolException extends HttpException {
    private static final long serialVersionUID = -2143571074341228994L;

    public ProtocolException() {
    }

    public ProtocolException(String str) {
        super(str);
    }

    public ProtocolException(String str, Throwable th2) {
        super(str, th2);
    }
}
