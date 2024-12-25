package p027b9;

import java.util.ArrayList;
import java.util.Map;
import p059d9.C4349a;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/g.class
 */
/* renamed from: b9.g */
/* loaded from: combined.jar:classes2.jar:b9/g.class */
public abstract class AbstractC0842g implements InterfaceC0854m {

    /* renamed from: a */
    public final boolean f5792a;

    /* renamed from: b */
    public final ArrayList<InterfaceC0853l0> f5793b = new ArrayList<>(1);

    /* renamed from: c */
    public int f5794c;

    /* renamed from: d */
    public C0858p f5795d;

    public AbstractC0842g(boolean z10) {
        this.f5792a = z10;
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: c */
    public final void mo522c(InterfaceC0853l0 interfaceC0853l0) {
        C4349a.m21882e(interfaceC0853l0);
        if (this.f5793b.contains(interfaceC0853l0)) {
            return;
        }
        this.f5793b.add(interfaceC0853l0);
        this.f5794c++;
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: e */
    public /* synthetic */ Map mo523e() {
        return C0852l.m5369a(this);
    }

    /* renamed from: r */
    public final void m5353r(int i10) {
        C0858p c0858p = (C0858p) C4401z0.m22391j(this.f5795d);
        for (int i11 = 0; i11 < this.f5794c; i11++) {
            this.f5793b.get(i11).mo5370f(this, c0858p, this.f5792a, i10);
        }
    }

    /* renamed from: s */
    public final void m5354s() {
        C0858p c0858p = (C0858p) C4401z0.m22391j(this.f5795d);
        for (int i10 = 0; i10 < this.f5794c; i10++) {
            this.f5793b.get(i10).mo5373i(this, c0858p, this.f5792a);
        }
        this.f5795d = null;
    }

    /* renamed from: t */
    public final void m5355t(C0858p c0858p) {
        for (int i10 = 0; i10 < this.f5794c; i10++) {
            this.f5793b.get(i10).mo5371g(this, c0858p, this.f5792a);
        }
    }

    /* renamed from: u */
    public final void m5356u(C0858p c0858p) {
        this.f5795d = c0858p;
        for (int i10 = 0; i10 < this.f5794c; i10++) {
            this.f5793b.get(i10).mo5372h(this, c0858p, this.f5792a);
        }
    }
}
