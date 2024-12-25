package p197l6;

import p075e6.InterfaceC4645a;
import p093f6.C4769a;
import p093f6.InterfaceC4770b;
import p153ih.InterfaceC5261a;
import p227n6.InterfaceC6654a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l6/n0.class
 */
/* renamed from: l6.n0 */
/* loaded from: combined.jar:classes1.jar:l6/n0.class */
public final class C5710n0 implements InterfaceC4770b<C5708m0> {

    /* renamed from: a */
    public final InterfaceC5261a<InterfaceC6654a> f32062a;

    /* renamed from: b */
    public final InterfaceC5261a<InterfaceC6654a> f32063b;

    /* renamed from: c */
    public final InterfaceC5261a<AbstractC5691e> f32064c;

    /* renamed from: d */
    public final InterfaceC5261a<C5722t0> f32065d;

    /* renamed from: e */
    public final InterfaceC5261a<String> f32066e;

    public C5710n0(InterfaceC5261a<InterfaceC6654a> interfaceC5261a, InterfaceC5261a<InterfaceC6654a> interfaceC5261a2, InterfaceC5261a<AbstractC5691e> interfaceC5261a3, InterfaceC5261a<C5722t0> interfaceC5261a4, InterfaceC5261a<String> interfaceC5261a5) {
        this.f32062a = interfaceC5261a;
        this.f32063b = interfaceC5261a2;
        this.f32064c = interfaceC5261a3;
        this.f32065d = interfaceC5261a4;
        this.f32066e = interfaceC5261a5;
    }

    /* renamed from: a */
    public static C5710n0 m28063a(InterfaceC5261a<InterfaceC6654a> interfaceC5261a, InterfaceC5261a<InterfaceC6654a> interfaceC5261a2, InterfaceC5261a<AbstractC5691e> interfaceC5261a3, InterfaceC5261a<C5722t0> interfaceC5261a4, InterfaceC5261a<String> interfaceC5261a5) {
        return new C5710n0(interfaceC5261a, interfaceC5261a2, interfaceC5261a3, interfaceC5261a4, interfaceC5261a5);
    }

    /* renamed from: c */
    public static C5708m0 m28064c(InterfaceC6654a interfaceC6654a, InterfaceC6654a interfaceC6654a2, Object obj, Object obj2, InterfaceC4645a<String> interfaceC4645a) {
        return new C5708m0(interfaceC6654a, interfaceC6654a2, (AbstractC5691e) obj, (C5722t0) obj2, interfaceC4645a);
    }

    @Override // p153ih.InterfaceC5261a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5708m0 get() {
        return m28064c(this.f32062a.get(), this.f32063b.get(), this.f32064c.get(), this.f32065d.get(), C4769a.m24159a(this.f32066e));
    }
}
