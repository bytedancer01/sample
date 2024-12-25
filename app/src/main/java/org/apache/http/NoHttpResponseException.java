package org.apache.http;

import java.io.IOException;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/NoHttpResponseException.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/NoHttpResponseException.class */
public class NoHttpResponseException extends IOException {
    private static final long serialVersionUID = -7658940387386078766L;

    public NoHttpResponseException(String str) {
        super(HttpException.clean(str));
    }
}
