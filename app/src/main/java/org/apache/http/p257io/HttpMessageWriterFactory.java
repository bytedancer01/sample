package org.apache.http.p257io;

import org.apache.http.HttpMessage;

/* loaded from: combined.jar:classes3.jar:org/apache/http/io/HttpMessageWriterFactory.class */
public interface HttpMessageWriterFactory<T extends HttpMessage> {
    HttpMessageWriter<T> create(SessionOutputBuffer sessionOutputBuffer);
}
