package p059d9;

import p267p6.C7583h;
import p267p6.C7603n1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/p0.class
 */
/* renamed from: d9.p0 */
/* loaded from: combined.jar:classes2.jar:d9/p0.class */
public final class C4381p0 implements InterfaceC4396x {

    /* renamed from: b */
    public final InterfaceC4354c f26627b;

    /* renamed from: c */
    public boolean f26628c;

    /* renamed from: d */
    public long f26629d;

    /* renamed from: e */
    public long f26630e;

    /* renamed from: f */
    public C7603n1 f26631f = C7603n1.f36894d;

    public C4381p0(InterfaceC4354c interfaceC4354c) {
        this.f26627b = interfaceC4354c;
    }

    /* renamed from: a */
    public void m22207a(long j10) {
        this.f26629d = j10;
        if (this.f26628c) {
            this.f26630e = this.f26627b.mo21913b();
        }
    }

    @Override // p059d9.InterfaceC4396x
    /* renamed from: b */
    public C7603n1 mo22208b() {
        return this.f26631f;
    }

    @Override // p059d9.InterfaceC4396x
    /* renamed from: c */
    public void mo22209c(C7603n1 c7603n1) {
        if (this.f26628c) {
            m22207a(mo22212n());
        }
        this.f26631f = c7603n1;
    }

    /* renamed from: d */
    public void m22210d() {
        if (this.f26628c) {
            return;
        }
        this.f26630e = this.f26627b.mo21913b();
        this.f26628c = true;
    }

    /* renamed from: e */
    public void m22211e() {
        if (this.f26628c) {
            m22207a(mo22212n());
            this.f26628c = false;
        }
    }

    @Override // p059d9.InterfaceC4396x
    /* renamed from: n */
    public long mo22212n() {
        long j10 = this.f26629d;
        long j11 = j10;
        if (this.f26628c) {
            long mo21913b = this.f26627b.mo21913b() - this.f26630e;
            C7603n1 c7603n1 = this.f26631f;
            j11 = j10 + (c7603n1.f36896a == 1.0f ? C7583h.m32760d(mo21913b) : c7603n1.m32863a(mo21913b));
        }
        return j11;
    }
}
