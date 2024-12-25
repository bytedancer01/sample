package cg;

import java.util.NoSuchElementException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cg/b.class
 */
/* renamed from: cg.b */
/* loaded from: combined.jar:classes2.jar:cg/b.class */
public abstract class AbstractC1089b<T> extends AbstractC1110w<T> {

    /* renamed from: b */
    public T f7289b;

    public AbstractC1089b(T t10) {
        this.f7289b = t10;
    }

    /* renamed from: a */
    public abstract T mo6510a(T t10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7289b != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            T t10 = this.f7289b;
            this.f7289b = mo6510a(t10);
            return t10;
        } catch (Throwable th2) {
            this.f7289b = mo6510a(this.f7289b);
            throw th2;
        }
    }
}
