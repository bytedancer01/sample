package org.apache.http.client.entity;

import java.io.InputStream;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/entity/DeflateInputStreamFactory.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/entity/DeflateInputStreamFactory.class */
public class DeflateInputStreamFactory implements InputStreamFactory {
    private static final DeflateInputStreamFactory INSTANCE = new DeflateInputStreamFactory();

    public static DeflateInputStreamFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.apache.http.client.entity.InputStreamFactory
    public InputStream create(InputStream inputStream) {
        return new DeflateInputStream(inputStream);
    }
}
