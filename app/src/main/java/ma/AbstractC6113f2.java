package ma;

import java.util.NoSuchElementException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/f2.class
 */
/* renamed from: ma.f2 */
/* loaded from: combined.jar:classes2.jar:ma/f2.class */
public abstract class AbstractC6113f2 extends AbstractC6156h3 {

    /* renamed from: b */
    public final int f33759b;

    /* renamed from: c */
    public int f33760c;

    public AbstractC6113f2(int i10, int i11) {
        C6050c2.m29479b(i11, i10, "index");
        this.f33759b = i10;
        this.f33760c = i11;
    }

    /* renamed from: a */
    public abstract Object mo29584a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f33760c < this.f33759b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f33760c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f33760c;
        this.f33760c = i10 + 1;
        return mo29584a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f33760c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f33760c - 1;
        this.f33760c = i10;
        return mo29584a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f33760c - 1;
    }
}
