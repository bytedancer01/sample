package p267p6;

import android.util.Pair;
import p009a8.InterfaceC0124u0;
import p059d9.C4349a;
import p267p6.AbstractC7574e2;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/a.class
 */
/* renamed from: p6.a */
/* loaded from: combined.jar:classes2.jar:p6/a.class */
public abstract class AbstractC7555a extends AbstractC7574e2 {

    /* renamed from: c */
    public final int f36429c;

    /* renamed from: d */
    public final InterfaceC0124u0 f36430d;

    /* renamed from: e */
    public final boolean f36431e;

    public AbstractC7555a(boolean z10, InterfaceC0124u0 interfaceC0124u0) {
        this.f36431e = z10;
        this.f36430d = interfaceC0124u0;
        this.f36429c = interfaceC0124u0.getLength();
    }

    /* renamed from: v */
    public static Object m32319v(Object obj) {
        return ((Pair) obj).second;
    }

    /* renamed from: w */
    public static Object m32320w(Object obj) {
        return ((Pair) obj).first;
    }

    /* renamed from: y */
    public static Object m32321y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    /* renamed from: A */
    public abstract int mo32322A(int i10);

    /* renamed from: B */
    public final int m32323B(int i10, boolean z10) {
        return z10 ? this.f36430d.mo633c(i10) : i10 < this.f36429c - 1 ? i10 + 1 : -1;
    }

    /* renamed from: C */
    public final int m32324C(int i10, boolean z10) {
        return z10 ? this.f36430d.mo632b(i10) : i10 > 0 ? i10 - 1 : -1;
    }

    /* renamed from: D */
    public abstract AbstractC7574e2 mo32325D(int i10);

    @Override // p267p6.AbstractC7574e2
    /* renamed from: a */
    public int mo505a(boolean z10) {
        if (this.f36429c == 0) {
            return -1;
        }
        int i10 = 0;
        if (this.f36431e) {
            z10 = false;
        }
        if (z10) {
            i10 = this.f36430d.mo636f();
        }
        while (mo32325D(i10).m32667q()) {
            int m32323B = m32323B(i10, z10);
            i10 = m32323B;
            if (m32323B == -1) {
                return -1;
            }
        }
        return mo32322A(i10) + mo32325D(i10).mo505a(z10);
    }

    @Override // p267p6.AbstractC7574e2
    /* renamed from: b */
    public final int mo506b(Object obj) {
        int i10 = -1;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object m32320w = m32320w(obj);
        Object m32319v = m32319v(obj);
        int mo32327s = mo32327s(m32320w);
        if (mo32327s == -1) {
            return -1;
        }
        int mo506b = mo32325D(mo32327s).mo506b(m32319v);
        if (mo506b != -1) {
            i10 = mo32331z(mo32327s) + mo506b;
        }
        return i10;
    }

    @Override // p267p6.AbstractC7574e2
    /* renamed from: c */
    public int mo507c(boolean z10) {
        int i10 = this.f36429c;
        if (i10 == 0) {
            return -1;
        }
        if (this.f36431e) {
            z10 = false;
        }
        int mo634d = z10 ? this.f36430d.mo634d() : i10 - 1;
        while (mo32325D(mo634d).m32667q()) {
            int m32324C = m32324C(mo634d, z10);
            mo634d = m32324C;
            if (m32324C == -1) {
                return -1;
            }
        }
        return mo32322A(mo634d) + mo32325D(mo634d).mo507c(z10);
    }

    @Override // p267p6.AbstractC7574e2
    /* renamed from: e */
    public int mo508e(int i10, int i11, boolean z10) {
        int i12;
        int i13 = i11;
        if (this.f36431e) {
            i13 = i11;
            if (i11 == 1) {
                i13 = 2;
            }
            z10 = false;
        }
        int mo32329u = mo32329u(i10);
        int mo32322A = mo32322A(mo32329u);
        int mo508e = mo32325D(mo32329u).mo508e(i10 - mo32322A, i13 == 2 ? 0 : i13, z10);
        if (mo508e != -1) {
            return mo32322A + mo508e;
        }
        int m32323B = m32323B(mo32329u, z10);
        while (true) {
            i12 = m32323B;
            if (i12 == -1 || !mo32325D(i12).m32667q()) {
                break;
            }
            m32323B = m32323B(i12, z10);
        }
        if (i12 != -1) {
            return mo32322A(i12) + mo32325D(i12).mo505a(z10);
        }
        if (i13 == 2) {
            return mo505a(z10);
        }
        return -1;
    }

    @Override // p267p6.AbstractC7574e2
    /* renamed from: g */
    public final AbstractC7574e2.b mo404g(int i10, AbstractC7574e2.b bVar, boolean z10) {
        int mo32328t = mo32328t(i10);
        int mo32322A = mo32322A(mo32328t);
        mo32325D(mo32328t).mo404g(i10 - mo32331z(mo32328t), bVar, z10);
        bVar.f36711c += mo32322A;
        if (z10) {
            bVar.f36710b = m32321y(mo32330x(mo32328t), C4349a.m21882e(bVar.f36710b));
        }
        return bVar;
    }

    @Override // p267p6.AbstractC7574e2
    /* renamed from: h */
    public final AbstractC7574e2.b mo32326h(Object obj, AbstractC7574e2.b bVar) {
        Object m32320w = m32320w(obj);
        Object m32319v = m32319v(obj);
        int mo32327s = mo32327s(m32320w);
        int mo32322A = mo32322A(mo32327s);
        mo32325D(mo32327s).mo32326h(m32319v, bVar);
        bVar.f36711c += mo32322A;
        bVar.f36710b = obj;
        return bVar;
    }

    @Override // p267p6.AbstractC7574e2
    /* renamed from: l */
    public int mo510l(int i10, int i11, boolean z10) {
        int i12;
        int i13 = i11;
        if (this.f36431e) {
            i13 = i11;
            if (i11 == 1) {
                i13 = 2;
            }
            z10 = false;
        }
        int mo32329u = mo32329u(i10);
        int mo32322A = mo32322A(mo32329u);
        int mo510l = mo32325D(mo32329u).mo510l(i10 - mo32322A, i13 == 2 ? 0 : i13, z10);
        if (mo510l != -1) {
            return mo32322A + mo510l;
        }
        int m32324C = m32324C(mo32329u, z10);
        while (true) {
            i12 = m32324C;
            if (i12 == -1 || !mo32325D(i12).m32667q()) {
                break;
            }
            m32324C = m32324C(i12, z10);
        }
        if (i12 != -1) {
            return mo32322A(i12) + mo32325D(i12).mo507c(z10);
        }
        if (i13 == 2) {
            return mo507c(z10);
        }
        return -1;
    }

    @Override // p267p6.AbstractC7574e2
    /* renamed from: m */
    public final Object mo511m(int i10) {
        int mo32328t = mo32328t(i10);
        return m32321y(mo32330x(mo32328t), mo32325D(mo32328t).mo511m(i10 - mo32331z(mo32328t)));
    }

    @Override // p267p6.AbstractC7574e2
    /* renamed from: o */
    public final AbstractC7574e2.c mo405o(int i10, AbstractC7574e2.c cVar, long j10) {
        int mo32329u = mo32329u(i10);
        int mo32322A = mo32322A(mo32329u);
        int mo32331z = mo32331z(mo32329u);
        mo32325D(mo32329u).mo405o(i10 - mo32322A, cVar, j10);
        Object mo32330x = mo32330x(mo32329u);
        if (!AbstractC7574e2.c.f36716r.equals(cVar.f36720a)) {
            mo32330x = m32321y(mo32330x, cVar.f36720a);
        }
        cVar.f36720a = mo32330x;
        cVar.f36734o += mo32331z;
        cVar.f36735p += mo32331z;
        return cVar;
    }

    /* renamed from: s */
    public abstract int mo32327s(Object obj);

    /* renamed from: t */
    public abstract int mo32328t(int i10);

    /* renamed from: u */
    public abstract int mo32329u(int i10);

    /* renamed from: x */
    public abstract Object mo32330x(int i10);

    /* renamed from: z */
    public abstract int mo32331z(int i10);
}
