package p373w;

import p358v.C9212d;
import p373w.C9385e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:w/j.class
 */
/* renamed from: w.j */
/* loaded from: combined.jar:classes1.jar:w/j.class */
public class C9390j {

    /* renamed from: a */
    public static boolean[] f43054a = new boolean[3];

    /* renamed from: a */
    public static void m39702a(C9386f c9386f, C9212d c9212d, C9385e c9385e) {
        c9385e.f42991j = -1;
        c9385e.f42993k = -1;
        C9385e.b bVar = c9386f.f42959M[0];
        C9385e.b bVar2 = C9385e.b.WRAP_CONTENT;
        if (bVar != bVar2 && c9385e.f42959M[0] == C9385e.b.MATCH_PARENT) {
            int i10 = c9385e.f42948B.f42942e;
            int m39608N = c9386f.m39608N() - c9385e.f42950D.f42942e;
            C9384d c9384d = c9385e.f42948B;
            c9384d.f42944g = c9212d.m38763q(c9384d);
            C9384d c9384d2 = c9385e.f42950D;
            c9384d2.f42944g = c9212d.m38763q(c9384d2);
            c9212d.m38752f(c9385e.f42948B.f42944g, i10);
            c9212d.m38752f(c9385e.f42950D.f42944g, m39608N);
            c9385e.f42991j = 2;
            c9385e.m39631h0(i10, m39608N);
        }
        if (c9386f.f42959M[1] == bVar2 || c9385e.f42959M[1] != C9385e.b.MATCH_PARENT) {
            return;
        }
        int i11 = c9385e.f42949C.f42942e;
        int m39654t = c9386f.m39654t() - c9385e.f42951E.f42942e;
        C9384d c9384d3 = c9385e.f42949C;
        c9384d3.f42944g = c9212d.m38763q(c9384d3);
        C9384d c9384d4 = c9385e.f42951E;
        c9384d4.f42944g = c9212d.m38763q(c9384d4);
        c9212d.m38752f(c9385e.f42949C.f42944g, i11);
        c9212d.m38752f(c9385e.f42951E.f42944g, m39654t);
        if (c9385e.f42971Y > 0 || c9385e.m39607M() == 8) {
            C9384d c9384d5 = c9385e.f42952F;
            c9384d5.f42944g = c9212d.m38763q(c9384d5);
            c9212d.m38752f(c9385e.f42952F.f42944g, c9385e.f42971Y + i11);
        }
        c9385e.f42993k = 2;
        c9385e.m39661w0(i11, m39654t);
    }

    /* renamed from: b */
    public static final boolean m39703b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
