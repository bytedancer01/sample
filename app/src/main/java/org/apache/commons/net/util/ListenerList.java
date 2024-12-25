package org.apache.commons.net.util;

import java.io.Serializable;
import java.util.EventListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/util/ListenerList.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/util/ListenerList.class */
public class ListenerList implements Serializable, Iterable<EventListener> {
    private static final long serialVersionUID = -1934227607974228213L;
    private final CopyOnWriteArrayList<EventListener> __listeners = new CopyOnWriteArrayList<>();

    public void addListener(EventListener eventListener) {
        this.__listeners.add(eventListener);
    }

    public int getListenerCount() {
        return this.__listeners.size();
    }

    @Override // java.lang.Iterable
    public Iterator<EventListener> iterator() {
        return this.__listeners.iterator();
    }

    public void removeListener(EventListener eventListener) {
        this.__listeners.remove(eventListener);
    }
}
