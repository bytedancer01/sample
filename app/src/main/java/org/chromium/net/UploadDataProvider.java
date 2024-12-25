package org.chromium.net;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: combined.jar:classes3.jar:org/chromium/net/UploadDataProvider.class */
public abstract class UploadDataProvider implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract long getLength();

    public abstract void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer);

    public abstract void rewind(UploadDataSink uploadDataSink);
}
