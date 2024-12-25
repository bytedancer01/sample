package org.minidns.util;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: combined.jar:classes3.jar:org/minidns/util/MultipleIoException.class */
public final class MultipleIoException extends IOException {
    public static final boolean $assertionsDisabled = false;
    private static final long serialVersionUID = -5932211337552319515L;
    private final List<IOException> ioExceptions;

    private MultipleIoException(List<? extends IOException> list) {
        super(getMessage(list));
        this.ioExceptions = Collections.unmodifiableList(list);
    }

    private static String getMessage(Collection<? extends Exception> collection) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<? extends Exception> it = collection.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().getMessage());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    public static void throwIfRequired(List<? extends IOException> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (list.size() != 1) {
            throw new MultipleIoException(list);
        }
        throw list.get(0);
    }

    public static IOException toIOException(List<? extends IOException> list) {
        int size = list.size();
        if (size == 1) {
            return list.get(0);
        }
        if (size > 1) {
            return new MultipleIoException(list);
        }
        return null;
    }

    public List<IOException> getExceptions() {
        return this.ioExceptions;
    }
}
