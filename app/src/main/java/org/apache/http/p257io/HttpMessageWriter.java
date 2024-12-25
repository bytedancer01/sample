package org.apache.http.p257io;

import org.apache.http.HttpMessage;

/* loaded from: combined.jar:classes3.jar:org/apache/http/io/HttpMessageWriter.class */
public interface HttpMessageWriter<T extends HttpMessage> {
    void write(T t10);
}
