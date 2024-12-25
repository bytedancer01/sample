package p162j6;

import java.util.concurrent.Executor;
import p056d6.InterfaceC4309e;
import p093f6.InterfaceC4770b;
import p153ih.InterfaceC5261a;
import p181k6.InterfaceC5509x;
import p197l6.InterfaceC5689d;
import p213m6.InterfaceC5931b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j6/d.class
 */
/* renamed from: j6.d */
/* loaded from: combined.jar:classes1.jar:j6/d.class */
public final class C5299d implements InterfaceC4770b<C5298c> {

    /* renamed from: a */
    public final InterfaceC5261a<Executor> f30462a;

    /* renamed from: b */
    public final InterfaceC5261a<InterfaceC4309e> f30463b;

    /* renamed from: c */
    public final InterfaceC5261a<InterfaceC5509x> f30464c;

    /* renamed from: d */
    public final InterfaceC5261a<InterfaceC5689d> f30465d;

    /* renamed from: e */
    public final InterfaceC5261a<InterfaceC5931b> f30466e;

    public C5299d(InterfaceC5261a<Executor> interfaceC5261a, InterfaceC5261a<InterfaceC4309e> interfaceC5261a2, InterfaceC5261a<InterfaceC5509x> interfaceC5261a3, InterfaceC5261a<InterfaceC5689d> interfaceC5261a4, InterfaceC5261a<InterfaceC5931b> interfaceC5261a5) {
        this.f30462a = interfaceC5261a;
        this.f30463b = interfaceC5261a2;
        this.f30464c = interfaceC5261a3;
        this.f30465d = interfaceC5261a4;
        this.f30466e = interfaceC5261a5;
    }

    /* renamed from: a */
    public static C5299d m26484a(InterfaceC5261a<Executor> interfaceC5261a, InterfaceC5261a<InterfaceC4309e> interfaceC5261a2, InterfaceC5261a<InterfaceC5509x> interfaceC5261a3, InterfaceC5261a<InterfaceC5689d> interfaceC5261a4, InterfaceC5261a<InterfaceC5931b> interfaceC5261a5) {
        return new C5299d(interfaceC5261a, interfaceC5261a2, interfaceC5261a3, interfaceC5261a4, interfaceC5261a5);
    }

    /* renamed from: c */
    public static C5298c m26485c(Executor executor, InterfaceC4309e interfaceC4309e, InterfaceC5509x interfaceC5509x, InterfaceC5689d interfaceC5689d, InterfaceC5931b interfaceC5931b) {
        return new C5298c(executor, interfaceC4309e, interfaceC5509x, interfaceC5689d, interfaceC5931b);
    }

    @Override // p153ih.InterfaceC5261a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5298c get() {
        return m26485c(this.f30462a.get(), this.f30463b.get(), this.f30464c.get(), this.f30465d.get(), this.f30466e.get());
    }
}
