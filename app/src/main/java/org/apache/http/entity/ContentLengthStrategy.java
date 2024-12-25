package org.apache.http.entity;

import org.apache.http.HttpMessage;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/entity/ContentLengthStrategy.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/entity/ContentLengthStrategy.class */
public interface ContentLengthStrategy {
    public static final int CHUNKED = -2;
    public static final int IDENTITY = -1;

    long determineLength(HttpMessage httpMessage);
}
