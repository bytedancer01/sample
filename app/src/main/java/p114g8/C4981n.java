package p114g8;

import p009a8.InterfaceC0120s0;
import p059d9.C4349a;
import p267p6.C7632x0;
import p332t6.C8638f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:g8/n.class
 */
/* renamed from: g8.n */
/* loaded from: combined.jar:classes2.jar:g8/n.class */
public final class C4981n implements InterfaceC0120s0 {

    /* renamed from: b */
    public final int f28904b;

    /* renamed from: c */
    public final C4985r f28905c;

    /* renamed from: d */
    public int f28906d = -1;

    public C4981n(C4985r c4985r, int i10) {
        this.f28905c = c4985r;
        this.f28904b = i10;
    }

    @Override // p009a8.InterfaceC0120s0
    /* renamed from: a */
    public void mo354a() {
        int i10 = this.f28906d;
        if (i10 == -2) {
            throw new C4987t(this.f28905c.m25132v().m323b(this.f28904b).m663b(0).f37086m);
        }
        if (i10 == -1) {
            this.f28905c.m25108V();
        } else if (i10 != -3) {
            this.f28905c.m25109W(i10);
        }
    }

    /* renamed from: b */
    public void m25082b() {
        C4349a.m21878a(this.f28906d == -1);
        this.f28906d = this.f28905c.m25135z(this.f28904b);
    }

    /* renamed from: c */
    public final boolean m25083c() {
        int i10 = this.f28906d;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    /* renamed from: d */
    public void m25084d() {
        if (this.f28906d != -1) {
            this.f28905c.m25129q0(this.f28904b);
            this.f28906d = -1;
        }
    }

    @Override // p009a8.InterfaceC0120s0
    /* renamed from: e */
    public boolean mo356e() {
        return this.f28906d == -3 || (m25083c() && this.f28905c.m25105S(this.f28906d));
    }

    @Override // p009a8.InterfaceC0120s0
    /* renamed from: p */
    public int mo357p(C7632x0 c7632x0, C8638f c8638f, int i10) {
        int i11 = -3;
        if (this.f28906d == -3) {
            c8638f.addFlag(4);
            return -4;
        }
        if (m25083c()) {
            i11 = this.f28905c.m25118f0(this.f28906d, c7632x0, c8638f, i10);
        }
        return i11;
    }

    @Override // p009a8.InterfaceC0120s0
    /* renamed from: t */
    public int mo358t(long j10) {
        return m25083c() ? this.f28905c.m25128p0(this.f28906d, j10) : 0;
    }
}
