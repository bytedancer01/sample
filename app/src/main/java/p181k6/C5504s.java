package p181k6;

import android.content.Context;
import java.util.concurrent.Executor;
import p056d6.InterfaceC4309e;
import p093f6.InterfaceC4770b;
import p153ih.InterfaceC5261a;
import p197l6.InterfaceC5687c;
import p197l6.InterfaceC5689d;
import p213m6.InterfaceC5931b;
import p227n6.InterfaceC6654a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k6/s.class
 */
/* renamed from: k6.s */
/* loaded from: combined.jar:classes1.jar:k6/s.class */
public final class C5504s implements InterfaceC4770b<C5503r> {

    /* renamed from: a */
    public final InterfaceC5261a<Context> f31372a;

    /* renamed from: b */
    public final InterfaceC5261a<InterfaceC4309e> f31373b;

    /* renamed from: c */
    public final InterfaceC5261a<InterfaceC5689d> f31374c;

    /* renamed from: d */
    public final InterfaceC5261a<InterfaceC5509x> f31375d;

    /* renamed from: e */
    public final InterfaceC5261a<Executor> f31376e;

    /* renamed from: f */
    public final InterfaceC5261a<InterfaceC5931b> f31377f;

    /* renamed from: g */
    public final InterfaceC5261a<InterfaceC6654a> f31378g;

    /* renamed from: h */
    public final InterfaceC5261a<InterfaceC6654a> f31379h;

    /* renamed from: i */
    public final InterfaceC5261a<InterfaceC5687c> f31380i;

    public C5504s(InterfaceC5261a<Context> interfaceC5261a, InterfaceC5261a<InterfaceC4309e> interfaceC5261a2, InterfaceC5261a<InterfaceC5689d> interfaceC5261a3, InterfaceC5261a<InterfaceC5509x> interfaceC5261a4, InterfaceC5261a<Executor> interfaceC5261a5, InterfaceC5261a<InterfaceC5931b> interfaceC5261a6, InterfaceC5261a<InterfaceC6654a> interfaceC5261a7, InterfaceC5261a<InterfaceC6654a> interfaceC5261a8, InterfaceC5261a<InterfaceC5687c> interfaceC5261a9) {
        this.f31372a = interfaceC5261a;
        this.f31373b = interfaceC5261a2;
        this.f31374c = interfaceC5261a3;
        this.f31375d = interfaceC5261a4;
        this.f31376e = interfaceC5261a5;
        this.f31377f = interfaceC5261a6;
        this.f31378g = interfaceC5261a7;
        this.f31379h = interfaceC5261a8;
        this.f31380i = interfaceC5261a9;
    }

    /* renamed from: a */
    public static C5504s m27329a(InterfaceC5261a<Context> interfaceC5261a, InterfaceC5261a<InterfaceC4309e> interfaceC5261a2, InterfaceC5261a<InterfaceC5689d> interfaceC5261a3, InterfaceC5261a<InterfaceC5509x> interfaceC5261a4, InterfaceC5261a<Executor> interfaceC5261a5, InterfaceC5261a<InterfaceC5931b> interfaceC5261a6, InterfaceC5261a<InterfaceC6654a> interfaceC5261a7, InterfaceC5261a<InterfaceC6654a> interfaceC5261a8, InterfaceC5261a<InterfaceC5687c> interfaceC5261a9) {
        return new C5504s(interfaceC5261a, interfaceC5261a2, interfaceC5261a3, interfaceC5261a4, interfaceC5261a5, interfaceC5261a6, interfaceC5261a7, interfaceC5261a8, interfaceC5261a9);
    }

    /* renamed from: c */
    public static C5503r m27330c(Context context, InterfaceC4309e interfaceC4309e, InterfaceC5689d interfaceC5689d, InterfaceC5509x interfaceC5509x, Executor executor, InterfaceC5931b interfaceC5931b, InterfaceC6654a interfaceC6654a, InterfaceC6654a interfaceC6654a2, InterfaceC5687c interfaceC5687c) {
        return new C5503r(context, interfaceC4309e, interfaceC5689d, interfaceC5509x, executor, interfaceC5931b, interfaceC6654a, interfaceC6654a2, interfaceC5687c);
    }

    @Override // p153ih.InterfaceC5261a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5503r get() {
        return m27330c(this.f31372a.get(), this.f31373b.get(), this.f31374c.get(), this.f31375d.get(), this.f31376e.get(), this.f31377f.get(), this.f31378g.get(), this.f31379h.get(), this.f31380i.get());
    }
}
