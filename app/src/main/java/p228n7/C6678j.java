package p228n7;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import p059d9.C4356d;
import p059d9.C4361f0;
import p099fc.AbstractC4834t;
import p228n7.InterfaceC6677i0;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/j.class
 */
/* renamed from: n7.j */
/* loaded from: combined.jar:classes2.jar:n7/j.class */
public final class C6678j implements InterfaceC6677i0.c {

    /* renamed from: a */
    public final int f34838a;

    /* renamed from: b */
    public final List<C7629w0> f34839b;

    public C6678j(int i10) {
        this(i10, AbstractC4834t.m24539E());
    }

    public C6678j(int i10, List<C7629w0> list) {
        this.f34838a = i10;
        this.f34839b = list;
    }

    @Override // p228n7.InterfaceC6677i0.c
    /* renamed from: a */
    public InterfaceC6677i0 mo30753a(int i10, InterfaceC6677i0.b bVar) {
        if (i10 == 2) {
            return new C6693w(new C6684n(m30760d(bVar)));
        }
        if (i10 == 3 || i10 == 4) {
            return new C6693w(new C6690t(bVar.f34830b));
        }
        if (i10 == 21) {
            return new C6693w(new C6688r());
        }
        if (i10 == 27) {
            return m30762f(4) ? null : new C6693w(new C6686p(m30759c(bVar), m30762f(1), m30762f(8)));
        }
        if (i10 == 36) {
            return new C6693w(new C6687q(m30759c(bVar)));
        }
        if (i10 == 89) {
            return new C6693w(new C6682l(bVar.f34831c));
        }
        if (i10 != 138) {
            if (i10 == 172) {
                return new C6693w(new C6670f(bVar.f34830b));
            }
            if (i10 == 257) {
                return new C6665c0(new C6692v("application/vnd.dvb.ait"));
            }
            if (i10 != 129) {
                if (i10 != 130) {
                    if (i10 == 134) {
                        return m30762f(16) ? null : new C6665c0(new C6692v("application/x-scte35"));
                    }
                    if (i10 != 135) {
                        switch (i10) {
                            case 15:
                                return m30762f(2) ? null : new C6693w(new C6676i(false, bVar.f34830b));
                            case 16:
                                return new C6693w(new C6685o(m30760d(bVar)));
                            case 17:
                                return m30762f(2) ? null : new C6693w(new C6689s(bVar.f34830b));
                            default:
                                return null;
                        }
                    }
                } else if (!m30762f(64)) {
                    return null;
                }
            }
            return new C6693w(new C6664c(bVar.f34830b));
        }
        return new C6693w(new C6680k(bVar.f34830b));
    }

    @Override // p228n7.InterfaceC6677i0.c
    /* renamed from: b */
    public SparseArray<InterfaceC6677i0> mo30754b() {
        return new SparseArray<>();
    }

    /* renamed from: c */
    public final C6667d0 m30759c(InterfaceC6677i0.b bVar) {
        return new C6667d0(m30761e(bVar));
    }

    /* renamed from: d */
    public final C6681k0 m30760d(InterfaceC6677i0.b bVar) {
        return new C6681k0(m30761e(bVar));
    }

    /* renamed from: e */
    public final List<C7629w0> m30761e(InterfaceC6677i0.b bVar) {
        String str;
        int i10;
        if (m30762f(32)) {
            return this.f34839b;
        }
        C4361f0 c4361f0 = new C4361f0(bVar.f34832d);
        List<C7629w0> list = this.f34839b;
        while (c4361f0.m21985a() > 0) {
            int m21971D = c4361f0.m21971D();
            int m21971D2 = c4361f0.m21971D();
            int m21989e = c4361f0.m21989e();
            if (m21971D == 134) {
                ArrayList arrayList = new ArrayList();
                int m21971D3 = c4361f0.m21971D();
                int i11 = 0;
                while (true) {
                    list = arrayList;
                    if (i11 < (m21971D3 & 31)) {
                        String m21968A = c4361f0.m21968A(3);
                        int m21971D4 = c4361f0.m21971D();
                        boolean z10 = true;
                        boolean z11 = (m21971D4 & 128) != 0;
                        if (z11) {
                            i10 = m21971D4 & 63;
                            str = "application/cea-708";
                        } else {
                            str = "application/cea-608";
                            i10 = 1;
                        }
                        byte m21971D5 = (byte) c4361f0.m21971D();
                        c4361f0.m21984Q(1);
                        List<byte[]> list2 = null;
                        if (z11) {
                            if ((m21971D5 & 64) == 0) {
                                z10 = false;
                            }
                            list2 = C4356d.m21930b(z10);
                        }
                        arrayList.add(new C7629w0.b().m33220e0(str).m33211V(m21968A).m33195F(i10).m33209T(list2).m33194E());
                        i11++;
                    }
                }
            }
            c4361f0.m21983P(m21989e + m21971D2);
        }
        return list;
    }

    /* renamed from: f */
    public final boolean m30762f(int i10) {
        return (i10 & this.f34838a) != 0;
    }
}
