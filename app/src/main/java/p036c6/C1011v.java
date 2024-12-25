package p036c6;

import p093f6.InterfaceC4770b;
import p153ih.InterfaceC5261a;
import p162j6.InterfaceC5300e;
import p181k6.C5503r;
import p181k6.C5507v;
import p227n6.InterfaceC6654a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c6/v.class
 */
/* renamed from: c6.v */
/* loaded from: combined.jar:classes1.jar:c6/v.class */
public final class C1011v implements InterfaceC4770b<C1009t> {

    /* renamed from: a */
    public final InterfaceC5261a<InterfaceC6654a> f6831a;

    /* renamed from: b */
    public final InterfaceC5261a<InterfaceC6654a> f6832b;

    /* renamed from: c */
    public final InterfaceC5261a<InterfaceC5300e> f6833c;

    /* renamed from: d */
    public final InterfaceC5261a<C5503r> f6834d;

    /* renamed from: e */
    public final InterfaceC5261a<C5507v> f6835e;

    public C1011v(InterfaceC5261a<InterfaceC6654a> interfaceC5261a, InterfaceC5261a<InterfaceC6654a> interfaceC5261a2, InterfaceC5261a<InterfaceC5300e> interfaceC5261a3, InterfaceC5261a<C5503r> interfaceC5261a4, InterfaceC5261a<C5507v> interfaceC5261a5) {
        this.f6831a = interfaceC5261a;
        this.f6832b = interfaceC5261a2;
        this.f6833c = interfaceC5261a3;
        this.f6834d = interfaceC5261a4;
        this.f6835e = interfaceC5261a5;
    }

    /* renamed from: a */
    public static C1011v m5976a(InterfaceC5261a<InterfaceC6654a> interfaceC5261a, InterfaceC5261a<InterfaceC6654a> interfaceC5261a2, InterfaceC5261a<InterfaceC5300e> interfaceC5261a3, InterfaceC5261a<C5503r> interfaceC5261a4, InterfaceC5261a<C5507v> interfaceC5261a5) {
        return new C1011v(interfaceC5261a, interfaceC5261a2, interfaceC5261a3, interfaceC5261a4, interfaceC5261a5);
    }

    /* renamed from: c */
    public static C1009t m5977c(InterfaceC6654a interfaceC6654a, InterfaceC6654a interfaceC6654a2, InterfaceC5300e interfaceC5300e, C5503r c5503r, C5507v c5507v) {
        return new C1009t(interfaceC6654a, interfaceC6654a2, interfaceC5300e, c5503r, c5507v);
    }

    @Override // p153ih.InterfaceC5261a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1009t get() {
        return m5977c(this.f6831a.get(), this.f6832b.get(), this.f6833c.get(), this.f6834d.get(), this.f6835e.get());
    }
}
