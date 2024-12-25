package org.apache.http;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/HttpEntity.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/HttpEntity.class */
public interface HttpEntity {
    @Deprecated
    void consumeContent();

    InputStream getContent();

    Header getContentEncoding();

    long getContentLength();

    Header getContentType();

    boolean isChunked();

    boolean isRepeatable();

    boolean isStreaming();

    void writeTo(OutputStream outputStream);
}
