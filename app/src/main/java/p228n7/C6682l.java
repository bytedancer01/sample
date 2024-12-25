package p228n7;

import java.util.Collections;
import java.util.List;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4361f0;
import p228n7.InterfaceC6677i0;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/l.class
 */
/* renamed from: n7.l */
/* loaded from: combined.jar:classes2.jar:n7/l.class */
public final class C6682l implements InterfaceC6683m {

    /* renamed from: a */
    public final List<InterfaceC6677i0.a> f34853a;

    /* renamed from: b */
    public final InterfaceC4337t[] f34854b;

    /* renamed from: c */
    public boolean f34855c;

    /* renamed from: d */
    public int f34856d;

    /* renamed from: e */
    public int f34857e;

    /* renamed from: f */
    public long f34858f;

    public C6682l(List<InterfaceC6677i0.a> list) {
        this.f34853a = list;
        this.f34854b = new InterfaceC4337t[list.size()];
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: a */
    public void mo30677a(C4361f0 c4361f0) {
        if (this.f34855c) {
            if (this.f34856d != 2 || m30772b(c4361f0, 32)) {
                if (this.f34856d != 1 || m30772b(c4361f0, 0)) {
                    int m21989e = c4361f0.m21989e();
                    int m21985a = c4361f0.m21985a();
                    for (InterfaceC4337t interfaceC4337t : this.f34854b) {
                        c4361f0.m21983P(m21989e);
                        interfaceC4337t.mo606e(c4361f0, m21985a);
                    }
                    this.f34857e += m21985a;
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean m30772b(C4361f0 c4361f0, int i10) {
        if (c4361f0.m21985a() == 0) {
            return false;
        }
        if (c4361f0.m21971D() != i10) {
            this.f34855c = false;
        }
        this.f34856d--;
        return this.f34855c;
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: c */
    public void mo30679c() {
        this.f34855c = false;
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: d */
    public void mo30680d(InterfaceC4325h interfaceC4325h, InterfaceC6677i0.d dVar) {
        for (int i10 = 0; i10 < this.f34854b.length; i10++) {
            InterfaceC6677i0.a aVar = this.f34853a.get(i10);
            dVar.m30755a();
            InterfaceC4337t mo479e = interfaceC4325h.mo479e(dVar.m30757c(), 3);
            mo479e.mo608f(new C7629w0.b().m33208S(dVar.m30756b()).m33220e0("application/dvbsubs").m33209T(Collections.singletonList(aVar.f34828c)).m33211V(aVar.f34826a).m33194E());
            this.f34854b[i10] = mo479e;
        }
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: e */
    public void mo30681e() {
        if (this.f34855c) {
            for (InterfaceC4337t interfaceC4337t : this.f34854b) {
                interfaceC4337t.mo600b(this.f34858f, 1, this.f34857e, 0, null);
            }
            this.f34855c = false;
        }
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: f */
    public void mo30682f(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f34855c = true;
        this.f34858f = j10;
        this.f34857e = 0;
        this.f34856d = 2;
    }
}
