package org.apache.http.client;

import org.apache.http.ProtocolException;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/NonRepeatableRequestException.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/NonRepeatableRequestException.class */
public class NonRepeatableRequestException extends ProtocolException {
    private static final long serialVersionUID = 82685265288806048L;

    public NonRepeatableRequestException() {
    }

    public NonRepeatableRequestException(String str) {
        super(str);
    }

    public NonRepeatableRequestException(String str, Throwable th2) {
        super(str, th2);
    }
}
