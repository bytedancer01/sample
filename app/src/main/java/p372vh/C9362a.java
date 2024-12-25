package p372vh;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import p390wh.InterfaceC9591a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vh/a.class
 */
/* renamed from: vh.a */
/* loaded from: combined.jar:classes2.jar:vh/a.class */
public final class C9362a<T> implements Iterator<T>, InterfaceC9591a {

    /* renamed from: b */
    @NotNull
    public final T[] f42898b;

    /* renamed from: c */
    public int f42899c;

    public C9362a(@NotNull T[] tArr) {
        C9367f.m39526e(tArr, "array");
        this.f42898b = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f42899c < this.f42898b.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f42898b;
            int i10 = this.f42899c;
            this.f42899c = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f42899c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
