package org.apache.http;

import java.io.IOException;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/ConnectionClosedException.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/ConnectionClosedException.class */
public class ConnectionClosedException extends IOException {
    private static final long serialVersionUID = 617550366255636674L;

    public ConnectionClosedException(String str) {
        super(HttpException.clean(str));
    }
}
