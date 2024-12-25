package p228n7;

import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4361f0;
import p059d9.C4392v;
import p228n7.InterfaceC6677i0;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/r.class
 */
/* renamed from: n7.r */
/* loaded from: combined.jar:classes2.jar:n7/r.class */
public final class C6688r implements InterfaceC6683m {

    /* renamed from: a */
    public final C4361f0 f34983a = new C4361f0(10);

    /* renamed from: b */
    public InterfaceC4337t f34984b;

    /* renamed from: c */
    public boolean f34985c;

    /* renamed from: d */
    public long f34986d;

    /* renamed from: e */
    public int f34987e;

    /* renamed from: f */
    public int f34988f;

    @Override // p228n7.InterfaceC6683m
    /* renamed from: a */
    public void mo30677a(C4361f0 c4361f0) {
        C4349a.m21886i(this.f34984b);
        if (this.f34985c) {
            int m21985a = c4361f0.m21985a();
            int i10 = this.f34988f;
            if (i10 < 10) {
                int min = Math.min(m21985a, 10 - i10);
                System.arraycopy(c4361f0.m21988d(), c4361f0.m21989e(), this.f34983a.m21988d(), this.f34988f, min);
                if (this.f34988f + min == 10) {
                    this.f34983a.m21983P(0);
                    if (73 != this.f34983a.m21971D() || 68 != this.f34983a.m21971D() || 51 != this.f34983a.m21971D()) {
                        C4392v.m22275i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f34985c = false;
                        return;
                    } else {
                        this.f34983a.m21984Q(3);
                        this.f34987e = this.f34983a.m21970C() + 10;
                    }
                }
            }
            int min2 = Math.min(m21985a, this.f34987e - this.f34988f);
            this.f34984b.mo606e(c4361f0, min2);
            this.f34988f += min2;
        }
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: c */
    public void mo30679c() {
        this.f34985c = false;
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: d */
    public void mo30680d(InterfaceC4325h interfaceC4325h, InterfaceC6677i0.d dVar) {
        dVar.m30755a();
        InterfaceC4337t mo479e = interfaceC4325h.mo479e(dVar.m30757c(), 5);
        this.f34984b = mo479e;
        mo479e.mo608f(new C7629w0.b().m33208S(dVar.m30756b()).m33220e0("application/id3").m33194E());
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: e */
    public void mo30681e() {
        int i10;
        C4349a.m21886i(this.f34984b);
        if (this.f34985c && (i10 = this.f34987e) != 0 && this.f34988f == i10) {
            this.f34984b.mo600b(this.f34986d, 1, i10, 0, null);
            this.f34985c = false;
        }
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: f */
    public void mo30682f(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f34985c = true;
        this.f34986d = j10;
        this.f34987e = 0;
        this.f34988f = 0;
    }
}
