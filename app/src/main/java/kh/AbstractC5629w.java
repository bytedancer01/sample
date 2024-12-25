package kh;

import java.util.Iterator;
import p390wh.InterfaceC9591a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kh/w.class
 */
/* renamed from: kh.w */
/* loaded from: combined.jar:classes2.jar:kh/w.class */
public abstract class AbstractC5629w implements Iterator<Integer>, InterfaceC9591a {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
