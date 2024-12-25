package org.apache.http.client.entity;

import org.apache.http.HttpEntity;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/entity/GzipDecompressingEntity.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/entity/GzipDecompressingEntity.class */
public class GzipDecompressingEntity extends DecompressingEntity {
    public GzipDecompressingEntity(HttpEntity httpEntity) {
        super(httpEntity, GZIPInputStreamFactory.getInstance());
    }
}
