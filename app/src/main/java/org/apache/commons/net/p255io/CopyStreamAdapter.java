package org.apache.commons.net.p255io;

import java.util.EventListener;
import java.util.Iterator;
import org.apache.commons.net.util.ListenerList;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/io/CopyStreamAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/io/CopyStreamAdapter.class */
public class CopyStreamAdapter implements CopyStreamListener {
    private final ListenerList internalListeners = new ListenerList();

    public void addCopyStreamListener(CopyStreamListener copyStreamListener) {
        this.internalListeners.addListener(copyStreamListener);
    }

    @Override // org.apache.commons.net.p255io.CopyStreamListener
    public void bytesTransferred(long j10, int i10, long j11) {
        Iterator<EventListener> it = this.internalListeners.iterator();
        while (it.hasNext()) {
            ((CopyStreamListener) it.next()).bytesTransferred(j10, i10, j11);
        }
    }

    @Override // org.apache.commons.net.p255io.CopyStreamListener
    public void bytesTransferred(CopyStreamEvent copyStreamEvent) {
        Iterator<EventListener> it = this.internalListeners.iterator();
        while (it.hasNext()) {
            ((CopyStreamListener) it.next()).bytesTransferred(copyStreamEvent);
        }
    }

    public void removeCopyStreamListener(CopyStreamListener copyStreamListener) {
        this.internalListeners.removeListener(copyStreamListener);
    }
}
