package org.apache.http.client.entity;

import org.apache.http.HttpEntity;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/entity/DeflateDecompressingEntity.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/entity/DeflateDecompressingEntity.class */
public class DeflateDecompressingEntity extends DecompressingEntity {
    public DeflateDecompressingEntity(HttpEntity httpEntity) {
        super(httpEntity, DeflateInputStreamFactory.getInstance());
    }
}
