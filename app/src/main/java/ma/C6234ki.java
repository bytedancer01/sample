package ma;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ki.class
 */
/* renamed from: ma.ki */
/* loaded from: combined.jar:classes2.jar:ma/ki.class */
public final class C6234ki implements Iterator {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
