package ma;

import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/p2.class
 */
/* renamed from: ma.p2 */
/* loaded from: combined.jar:classes2.jar:ma/p2.class */
public final class C6323p2 extends AbstractC6344q2 {

    /* renamed from: d */
    public final transient int f33954d;

    /* renamed from: e */
    public final transient int f33955e;

    /* renamed from: f */
    public final AbstractC6344q2 f33956f;

    public C6323p2(AbstractC6344q2 abstractC6344q2, int i10, int i11) {
        this.f33956f = abstractC6344q2;
        this.f33954d = i10;
        this.f33955e = i11;
    }

    @Override // ma.AbstractC6260m2
    /* renamed from: d */
    public final int mo29541d() {
        return this.f33956f.mo29542f() + this.f33954d + this.f33955e;
    }

    @Override // ma.AbstractC6260m2
    /* renamed from: f */
    public final int mo29542f() {
        return this.f33956f.mo29542f() + this.f33954d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C6050c2.m29478a(i10, this.f33955e, "index");
        return this.f33956f.get(i10 + this.f33954d);
    }

    @Override // ma.AbstractC6260m2
    /* renamed from: i */
    public final Object[] mo29543i() {
        return this.f33956f.mo29543i();
    }

    @Override // ma.AbstractC6344q2
    /* renamed from: q */
    public final AbstractC6344q2 subList(int i10, int i11) {
        C6050c2.m29481d(i10, i11, this.f33955e);
        AbstractC6344q2 abstractC6344q2 = this.f33956f;
        int i12 = this.f33954d;
        return abstractC6344q2.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33955e;
    }

    @Override // ma.AbstractC6344q2, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
