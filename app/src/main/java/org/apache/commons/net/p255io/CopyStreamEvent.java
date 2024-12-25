package org.apache.commons.net.p255io;

import java.util.EventObject;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/io/CopyStreamEvent.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/io/CopyStreamEvent.class */
public class CopyStreamEvent extends EventObject {
    public static final long UNKNOWN_STREAM_SIZE = -1;
    private static final long serialVersionUID = -964927635655051867L;
    private final int bytesTransferred;
    private final long streamSize;
    private final long totalBytesTransferred;

    public CopyStreamEvent(Object obj, long j10, int i10, long j11) {
        super(obj);
        this.bytesTransferred = i10;
        this.totalBytesTransferred = j10;
        this.streamSize = j11;
    }

    public int getBytesTransferred() {
        return this.bytesTransferred;
    }

    public long getStreamSize() {
        return this.streamSize;
    }

    public long getTotalBytesTransferred() {
        return this.totalBytesTransferred;
    }

    @Override // java.util.EventObject
    public String toString() {
        return getClass().getName() + "[source=" + ((EventObject) this).source + ", total=" + this.totalBytesTransferred + ", bytes=" + this.bytesTransferred + ", size=" + this.streamSize + "]";
    }
}
