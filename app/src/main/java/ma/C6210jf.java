package ma;

import java.util.NoSuchElementException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/jf.class
 */
/* renamed from: ma.jf */
/* loaded from: combined.jar:classes2.jar:ma/jf.class */
public final class C6210jf extends AbstractC6252lf {

    /* renamed from: b */
    public int f33845b = 0;

    /* renamed from: c */
    public final int f33846c;

    /* renamed from: d */
    public final AbstractC6399sf f33847d;

    public C6210jf(AbstractC6399sf abstractC6399sf) {
        this.f33847d = abstractC6399sf;
        this.f33846c = abstractC6399sf.mo29850d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33845b < this.f33846c;
    }

    @Override // ma.InterfaceC6294nf
    public final byte zza() {
        int i10 = this.f33845b;
        if (i10 >= this.f33846c) {
            throw new NoSuchElementException();
        }
        this.f33845b = i10 + 1;
        return this.f33847d.mo29849b(i10);
    }
}
