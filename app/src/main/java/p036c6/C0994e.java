package p036c6;

import android.content.Context;
import java.util.concurrent.Executor;
import p036c6.AbstractC1010u;
import p056d6.C4314j;
import p056d6.C4316l;
import p093f6.C4769a;
import p093f6.C4771c;
import p093f6.C4772d;
import p093f6.InterfaceC4770b;
import p153ih.InterfaceC5261a;
import p162j6.C5298c;
import p162j6.C5299d;
import p162j6.C5302g;
import p162j6.C5304i;
import p181k6.AbstractC5491f;
import p181k6.C5503r;
import p181k6.C5504s;
import p181k6.C5507v;
import p181k6.C5508w;
import p181k6.InterfaceC5509x;
import p197l6.C5695g;
import p197l6.C5697h;
import p197l6.C5699i;
import p197l6.C5701j;
import p197l6.C5708m0;
import p197l6.C5710n0;
import p197l6.C5724u0;
import p197l6.InterfaceC5689d;
import p227n6.C6656c;
import p227n6.C6657d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c6/e.class
 */
/* renamed from: c6.e */
/* loaded from: combined.jar:classes1.jar:c6/e.class */
public final class C0994e extends AbstractC1010u {

    /* renamed from: b */
    public InterfaceC5261a<Executor> f6798b;

    /* renamed from: c */
    public InterfaceC5261a<Context> f6799c;

    /* renamed from: d */
    public InterfaceC5261a f6800d;

    /* renamed from: e */
    public InterfaceC5261a f6801e;

    /* renamed from: f */
    public InterfaceC5261a f6802f;

    /* renamed from: g */
    public InterfaceC5261a<String> f6803g;

    /* renamed from: h */
    public InterfaceC5261a<C5708m0> f6804h;

    /* renamed from: i */
    public InterfaceC5261a<AbstractC5491f> f6805i;

    /* renamed from: j */
    public InterfaceC5261a<InterfaceC5509x> f6806j;

    /* renamed from: k */
    public InterfaceC5261a<C5298c> f6807k;

    /* renamed from: l */
    public InterfaceC5261a<C5503r> f6808l;

    /* renamed from: m */
    public InterfaceC5261a<C5507v> f6809m;

    /* renamed from: n */
    public InterfaceC5261a<C1009t> f6810n;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c6/e$b.class
     */
    /* renamed from: c6.e$b */
    /* loaded from: combined.jar:classes1.jar:c6/e$b.class */
    public static final class b implements AbstractC1010u.a {

        /* renamed from: a */
        public Context f6811a;

        public b() {
        }

        @Override // p036c6.AbstractC1010u.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b mo5938a(Context context) {
            this.f6811a = (Context) C4772d.m24164b(context);
            return this;
        }

        @Override // p036c6.AbstractC1010u.a
        public AbstractC1010u build() {
            C4772d.m24163a(this.f6811a, Context.class);
            return new C0994e(this.f6811a);
        }
    }

    public C0994e(Context context) {
        m5937p(context);
    }

    /* renamed from: o */
    public static AbstractC1010u.a m5934o() {
        return new b();
    }

    @Override // p036c6.AbstractC1010u
    /* renamed from: f */
    public InterfaceC5689d mo5935f() {
        return this.f6804h.get();
    }

    @Override // p036c6.AbstractC1010u
    /* renamed from: l */
    public C1009t mo5936l() {
        return this.f6810n.get();
    }

    /* renamed from: p */
    public final void m5937p(Context context) {
        this.f6798b = C4769a.m24160b(C1000k.m5952a());
        InterfaceC4770b m24162a = C4771c.m24162a(context);
        this.f6799c = m24162a;
        C4314j m21786a = C4314j.m21786a(m24162a, C6656c.m30658a(), C6657d.m30662a());
        this.f6800d = m21786a;
        this.f6801e = C4769a.m24160b(C4316l.m21793a(this.f6799c, m21786a));
        this.f6802f = C5724u0.m28080a(this.f6799c, C5695g.m27973a(), C5699i.m27981a());
        this.f6803g = C5697h.m27978a(this.f6799c);
        this.f6804h = C4769a.m24160b(C5710n0.m28063a(C6656c.m30658a(), C6657d.m30662a(), C5701j.m27985a(), this.f6802f, this.f6803g));
        C5302g m26489b = C5302g.m26489b(C6656c.m30658a());
        this.f6805i = m26489b;
        C5304i m26492a = C5304i.m26492a(this.f6799c, this.f6804h, m26489b, C6657d.m30662a());
        this.f6806j = m26492a;
        InterfaceC5261a<Executor> interfaceC5261a = this.f6798b;
        InterfaceC5261a interfaceC5261a2 = this.f6801e;
        InterfaceC5261a<C5708m0> interfaceC5261a3 = this.f6804h;
        this.f6807k = C5299d.m26484a(interfaceC5261a, interfaceC5261a2, m26492a, interfaceC5261a3, interfaceC5261a3);
        InterfaceC5261a<Context> interfaceC5261a4 = this.f6799c;
        InterfaceC5261a interfaceC5261a5 = this.f6801e;
        InterfaceC5261a<C5708m0> interfaceC5261a6 = this.f6804h;
        this.f6808l = C5504s.m27329a(interfaceC5261a4, interfaceC5261a5, interfaceC5261a6, this.f6806j, this.f6798b, interfaceC5261a6, C6656c.m30658a(), C6657d.m30662a(), this.f6804h);
        InterfaceC5261a<Executor> interfaceC5261a7 = this.f6798b;
        InterfaceC5261a<C5708m0> interfaceC5261a8 = this.f6804h;
        this.f6809m = C5508w.m27337a(interfaceC5261a7, interfaceC5261a8, this.f6806j, interfaceC5261a8);
        this.f6810n = C4769a.m24160b(C1011v.m5976a(C6656c.m30658a(), C6657d.m30662a(), this.f6807k, this.f6808l, this.f6809m));
    }
}
