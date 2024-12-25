package p181k6;

import java.util.concurrent.Executor;
import p093f6.InterfaceC4770b;
import p153ih.InterfaceC5261a;
import p197l6.InterfaceC5689d;
import p213m6.InterfaceC5931b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k6/w.class
 */
/* renamed from: k6.w */
/* loaded from: combined.jar:classes1.jar:k6/w.class */
public final class C5508w implements InterfaceC4770b<C5507v> {

    /* renamed from: a */
    public final InterfaceC5261a<Executor> f31387a;

    /* renamed from: b */
    public final InterfaceC5261a<InterfaceC5689d> f31388b;

    /* renamed from: c */
    public final InterfaceC5261a<InterfaceC5509x> f31389c;

    /* renamed from: d */
    public final InterfaceC5261a<InterfaceC5931b> f31390d;

    public C5508w(InterfaceC5261a<Executor> interfaceC5261a, InterfaceC5261a<InterfaceC5689d> interfaceC5261a2, InterfaceC5261a<InterfaceC5509x> interfaceC5261a3, InterfaceC5261a<InterfaceC5931b> interfaceC5261a4) {
        this.f31387a = interfaceC5261a;
        this.f31388b = interfaceC5261a2;
        this.f31389c = interfaceC5261a3;
        this.f31390d = interfaceC5261a4;
    }

    /* renamed from: a */
    public static C5508w m27337a(InterfaceC5261a<Executor> interfaceC5261a, InterfaceC5261a<InterfaceC5689d> interfaceC5261a2, InterfaceC5261a<InterfaceC5509x> interfaceC5261a3, InterfaceC5261a<InterfaceC5931b> interfaceC5261a4) {
        return new C5508w(interfaceC5261a, interfaceC5261a2, interfaceC5261a3, interfaceC5261a4);
    }

    /* renamed from: c */
    public static C5507v m27338c(Executor executor, InterfaceC5689d interfaceC5689d, InterfaceC5509x interfaceC5509x, InterfaceC5931b interfaceC5931b) {
        return new C5507v(executor, interfaceC5689d, interfaceC5509x, interfaceC5931b);
    }

    @Override // p153ih.InterfaceC5261a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5507v get() {
        return m27338c(this.f31387a.get(), this.f31388b.get(), this.f31389c.get(), this.f31390d.get());
    }
}
