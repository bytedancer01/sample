package p267p6;

import p059d9.C4349a;
import p059d9.C4381p0;
import p059d9.InterfaceC4354c;
import p059d9.InterfaceC4396x;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/m.class
 */
/* renamed from: p6.m */
/* loaded from: combined.jar:classes2.jar:p6/m.class */
public final class C7598m implements InterfaceC4396x {

    /* renamed from: b */
    public final C4381p0 f36856b;

    /* renamed from: c */
    public final a f36857c;

    /* renamed from: d */
    public InterfaceC7627v1 f36858d;

    /* renamed from: e */
    public InterfaceC4396x f36859e;

    /* renamed from: f */
    public boolean f36860f = true;

    /* renamed from: g */
    public boolean f36861g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/m$a.class
     */
    /* renamed from: p6.m$a */
    /* loaded from: combined.jar:classes2.jar:p6/m$a.class */
    public interface a {
        /* renamed from: e */
        void mo32841e(C7603n1 c7603n1);
    }

    public C7598m(a aVar, InterfaceC4354c interfaceC4354c) {
        this.f36857c = aVar;
        this.f36856b = new C4381p0(interfaceC4354c);
    }

    /* renamed from: a */
    public void m32833a(InterfaceC7627v1 interfaceC7627v1) {
        if (interfaceC7627v1 == this.f36858d) {
            this.f36859e = null;
            this.f36858d = null;
            this.f36860f = true;
        }
    }

    @Override // p059d9.InterfaceC4396x
    /* renamed from: b */
    public C7603n1 mo22208b() {
        InterfaceC4396x interfaceC4396x = this.f36859e;
        return interfaceC4396x != null ? interfaceC4396x.mo22208b() : this.f36856b.mo22208b();
    }

    @Override // p059d9.InterfaceC4396x
    /* renamed from: c */
    public void mo22209c(C7603n1 c7603n1) {
        InterfaceC4396x interfaceC4396x = this.f36859e;
        C7603n1 c7603n12 = c7603n1;
        if (interfaceC4396x != null) {
            interfaceC4396x.mo22209c(c7603n1);
            c7603n12 = this.f36859e.mo22208b();
        }
        this.f36856b.mo22209c(c7603n12);
    }

    /* renamed from: d */
    public void m32834d(InterfaceC7627v1 interfaceC7627v1) {
        InterfaceC4396x interfaceC4396x;
        InterfaceC4396x mo32710u = interfaceC7627v1.mo32710u();
        if (mo32710u == null || mo32710u == (interfaceC4396x = this.f36859e)) {
            return;
        }
        if (interfaceC4396x != null) {
            throw C7607p.m32876f(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f36859e = mo32710u;
        this.f36858d = interfaceC7627v1;
        mo32710u.mo22209c(this.f36856b.mo22208b());
    }

    /* renamed from: e */
    public void m32835e(long j10) {
        this.f36856b.m22207a(j10);
    }

    /* renamed from: f */
    public final boolean m32836f(boolean z10) {
        InterfaceC7627v1 interfaceC7627v1 = this.f36858d;
        return interfaceC7627v1 == null || interfaceC7627v1.mo23425d() || (!this.f36858d.mo23427e() && (z10 || this.f36858d.mo32700f()));
    }

    /* renamed from: g */
    public void m32837g() {
        this.f36861g = true;
        this.f36856b.m22210d();
    }

    /* renamed from: h */
    public void m32838h() {
        this.f36861g = false;
        this.f36856b.m22211e();
    }

    /* renamed from: i */
    public long m32839i(boolean z10) {
        m32840j(z10);
        return mo22212n();
    }

    /* renamed from: j */
    public final void m32840j(boolean z10) {
        if (m32836f(z10)) {
            this.f36860f = true;
            if (this.f36861g) {
                this.f36856b.m22210d();
                return;
            }
            return;
        }
        InterfaceC4396x interfaceC4396x = (InterfaceC4396x) C4349a.m21882e(this.f36859e);
        long mo22212n = interfaceC4396x.mo22212n();
        if (this.f36860f) {
            if (mo22212n < this.f36856b.mo22212n()) {
                this.f36856b.m22211e();
                return;
            } else {
                this.f36860f = false;
                if (this.f36861g) {
                    this.f36856b.m22210d();
                }
            }
        }
        this.f36856b.m22207a(mo22212n);
        C7603n1 mo22208b = interfaceC4396x.mo22208b();
        if (mo22208b.equals(this.f36856b.mo22208b())) {
            return;
        }
        this.f36856b.mo22209c(mo22208b);
        this.f36857c.mo32841e(mo22208b);
    }

    @Override // p059d9.InterfaceC4396x
    /* renamed from: n */
    public long mo22212n() {
        return this.f36860f ? this.f36856b.mo22212n() : ((InterfaceC4396x) C4349a.m21882e(this.f36859e)).mo22212n();
    }
}
