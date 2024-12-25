package p099fc;

import ec.C4708k;
import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/u0.class
 */
/* renamed from: fc.u0 */
/* loaded from: combined.jar:classes2.jar:fc/u0.class */
public abstract class AbstractC4837u0<F, T> implements Iterator<T> {

    /* renamed from: b */
    public final Iterator<? extends F> f28422b;

    public AbstractC4837u0(Iterator<? extends F> it) {
        this.f28422b = (Iterator) C4708k.m23668j(it);
    }

    /* renamed from: a */
    public abstract T mo24371a(F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28422b.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return mo24371a(this.f28422b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f28422b.remove();
    }
}
