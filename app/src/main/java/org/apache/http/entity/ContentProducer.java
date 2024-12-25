package org.apache.http.entity;

import java.io.OutputStream;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/entity/ContentProducer.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/entity/ContentProducer.class */
public interface ContentProducer {
    void writeTo(OutputStream outputStream);
}
