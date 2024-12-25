package org.apache.commons.net.p255io;

import java.util.EventListener;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/io/CopyStreamListener.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/io/CopyStreamListener.class */
public interface CopyStreamListener extends EventListener {
    void bytesTransferred(long j10, int i10, long j11);

    void bytesTransferred(CopyStreamEvent copyStreamEvent);
}
