package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/x2.class
 */
/* renamed from: ma.x2 */
/* loaded from: combined.jar:classes2.jar:ma/x2.class */
public final class C6488x2 extends AbstractC6344q2 {

    /* renamed from: f */
    public static final AbstractC6344q2 f34147f = new C6488x2(new Object[0], 0);

    /* renamed from: d */
    public final transient Object[] f34148d;

    /* renamed from: e */
    public final transient int f34149e;

    public C6488x2(Object[] objArr, int i10) {
        this.f34148d = objArr;
        this.f34149e = i10;
    }

    @Override // ma.AbstractC6344q2, ma.AbstractC6260m2
    /* renamed from: a */
    public final int mo29380a(Object[] objArr, int i10) {
        System.arraycopy(this.f34148d, 0, objArr, 0, this.f34149e);
        return this.f34149e;
    }

    @Override // ma.AbstractC6260m2
    /* renamed from: d */
    public final int mo29541d() {
        return this.f34149e;
    }

    @Override // ma.AbstractC6260m2
    /* renamed from: f */
    public final int mo29542f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C6050c2.m29478a(i10, this.f34149e, "index");
        Object obj = this.f34148d[i10];
        obj.getClass();
        return obj;
    }

    @Override // ma.AbstractC6260m2
    /* renamed from: i */
    public final Object[] mo29543i() {
        return this.f34148d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34149e;
    }
}
