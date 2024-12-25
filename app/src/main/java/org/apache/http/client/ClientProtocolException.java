package org.apache.http.client;

import java.io.IOException;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/ClientProtocolException.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/ClientProtocolException.class */
public class ClientProtocolException extends IOException {
    private static final long serialVersionUID = -5596590843227115865L;

    public ClientProtocolException() {
    }

    public ClientProtocolException(String str) {
        super(str);
    }

    public ClientProtocolException(String str, Throwable th2) {
        super(str);
        initCause(th2);
    }

    public ClientProtocolException(Throwable th2) {
        initCause(th2);
    }
}
