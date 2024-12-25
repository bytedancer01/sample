package ma;

import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/d3.class
 */
/* renamed from: ma.d3 */
/* loaded from: combined.jar:classes2.jar:ma/d3.class */
public final class C6072d3 extends AbstractC6428u2 {

    /* renamed from: i */
    public static final Object[] f33727i;

    /* renamed from: j */
    public static final C6072d3 f33728j;

    /* renamed from: d */
    public final transient Object[] f33729d;

    /* renamed from: e */
    public final transient int f33730e;

    /* renamed from: f */
    public final transient Object[] f33731f;

    /* renamed from: g */
    public final transient int f33732g;

    /* renamed from: h */
    public final transient int f33733h;

    static {
        Object[] objArr = new Object[0];
        f33727i = objArr;
        f33728j = new C6072d3(objArr, 0, objArr, 0, 0);
    }

    public C6072d3(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f33729d = objArr;
        this.f33730e = i10;
        this.f33731f = objArr2;
        this.f33732g = i11;
        this.f33733h = i12;
    }

    @Override // ma.AbstractC6260m2
    /* renamed from: a */
    public final int mo29380a(Object[] objArr, int i10) {
        System.arraycopy(this.f33729d, 0, objArr, 0, this.f33733h);
        return this.f33733h;
    }

    @Override // ma.AbstractC6260m2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.f33731f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int m29771a = C6197j2.m29771a(obj.hashCode());
        while (true) {
            int i10 = m29771a & this.f33732g;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m29771a = i10 + 1;
        }
    }

    @Override // ma.AbstractC6260m2
    /* renamed from: d */
    public final int mo29541d() {
        return this.f33733h;
    }

    @Override // ma.AbstractC6260m2
    /* renamed from: f */
    public final int mo29542f() {
        return 0;
    }

    @Override // ma.AbstractC6428u2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f33730e;
    }

    @Override // ma.AbstractC6260m2
    /* renamed from: i */
    public final Object[] mo29543i() {
        return this.f33729d;
    }

    @Override // ma.AbstractC6428u2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo29381g().listIterator(0);
    }

    @Override // ma.AbstractC6428u2
    /* renamed from: q */
    public final AbstractC6135g3 iterator() {
        return mo29381g().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f33733h;
    }

    @Override // ma.AbstractC6428u2
    /* renamed from: v */
    public final AbstractC6344q2 mo29544v() {
        return AbstractC6344q2.m29975t(this.f33729d, this.f33733h);
    }

    @Override // ma.AbstractC6428u2
    /* renamed from: y */
    public final boolean mo29545y() {
        return true;
    }
}
