package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/b3.class
 */
/* renamed from: ma.b3 */
/* loaded from: combined.jar:classes2.jar:ma/b3.class */
public final class C6030b3 extends AbstractC6344q2 {

    /* renamed from: d */
    public final transient Object[] f33679d;

    /* renamed from: e */
    public final transient int f33680e;

    /* renamed from: f */
    public final transient int f33681f;

    public C6030b3(Object[] objArr, int i10, int i11) {
        this.f33679d = objArr;
        this.f33680e = i10;
        this.f33681f = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C6050c2.m29478a(i10, this.f33681f, "index");
        Object obj = this.f33679d[i10 + i10 + this.f33680e];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33681f;
    }
}
