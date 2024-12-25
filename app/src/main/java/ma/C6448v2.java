package ma;

import java.util.NoSuchElementException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/v2.class
 */
/* renamed from: ma.v2 */
/* loaded from: combined.jar:classes2.jar:ma/v2.class */
public final class C6448v2 extends AbstractC6135g3 {

    /* renamed from: b */
    public boolean f34102b;

    /* renamed from: c */
    public final Object f34103c;

    public C6448v2(Object obj) {
        this.f34103c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f34102b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f34102b) {
            throw new NoSuchElementException();
        }
        this.f34102b = true;
        return this.f34103c;
    }
}
