package org.apache.http.client.entity;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/entity/GZIPInputStreamFactory.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/entity/GZIPInputStreamFactory.class */
public class GZIPInputStreamFactory implements InputStreamFactory {
    private static final GZIPInputStreamFactory INSTANCE = new GZIPInputStreamFactory();

    public static GZIPInputStreamFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.apache.http.client.entity.InputStreamFactory
    public InputStream create(InputStream inputStream) {
        return new GZIPInputStream(inputStream);
    }
}
