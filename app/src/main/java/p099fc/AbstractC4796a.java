package p099fc;

import ec.C4708k;
import java.util.NoSuchElementException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/a.class
 */
/* renamed from: fc.a */
/* loaded from: combined.jar:classes2.jar:fc/a.class */
public abstract class AbstractC4796a<E> extends AbstractC4843x0<E> {

    /* renamed from: b */
    public final int f28258b;

    /* renamed from: c */
    public int f28259c;

    public AbstractC4796a(int i10, int i11) {
        C4708k.m23670l(i11, i10);
        this.f28258b = i10;
        this.f28259c = i11;
    }

    /* renamed from: a */
    public abstract E mo24288a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f28259c < this.f28258b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f28259c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f28259c;
        this.f28259c = i10 + 1;
        return mo24288a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f28259c;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f28259c - 1;
        this.f28259c = i10;
        return mo24288a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f28259c - 1;
    }
}
