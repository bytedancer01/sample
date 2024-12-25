package p162j6;

import android.content.Context;
import p093f6.C4772d;
import p093f6.InterfaceC4770b;
import p153ih.InterfaceC5261a;
import p181k6.AbstractC5491f;
import p181k6.InterfaceC5509x;
import p197l6.InterfaceC5689d;
import p227n6.InterfaceC6654a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j6/i.class
 */
/* renamed from: j6.i */
/* loaded from: combined.jar:classes1.jar:j6/i.class */
public final class C5304i implements InterfaceC4770b<InterfaceC5509x> {

    /* renamed from: a */
    public final InterfaceC5261a<Context> f30468a;

    /* renamed from: b */
    public final InterfaceC5261a<InterfaceC5689d> f30469b;

    /* renamed from: c */
    public final InterfaceC5261a<AbstractC5491f> f30470c;

    /* renamed from: d */
    public final InterfaceC5261a<InterfaceC6654a> f30471d;

    public C5304i(InterfaceC5261a<Context> interfaceC5261a, InterfaceC5261a<InterfaceC5689d> interfaceC5261a2, InterfaceC5261a<AbstractC5491f> interfaceC5261a3, InterfaceC5261a<InterfaceC6654a> interfaceC5261a4) {
        this.f30468a = interfaceC5261a;
        this.f30469b = interfaceC5261a2;
        this.f30470c = interfaceC5261a3;
        this.f30471d = interfaceC5261a4;
    }

    /* renamed from: a */
    public static C5304i m26492a(InterfaceC5261a<Context> interfaceC5261a, InterfaceC5261a<InterfaceC5689d> interfaceC5261a2, InterfaceC5261a<AbstractC5491f> interfaceC5261a3, InterfaceC5261a<InterfaceC6654a> interfaceC5261a4) {
        return new C5304i(interfaceC5261a, interfaceC5261a2, interfaceC5261a3, interfaceC5261a4);
    }

    /* renamed from: c */
    public static InterfaceC5509x m26493c(Context context, InterfaceC5689d interfaceC5689d, AbstractC5491f abstractC5491f, InterfaceC6654a interfaceC6654a) {
        return (InterfaceC5509x) C4772d.m24165c(AbstractC5303h.m26491a(context, interfaceC5689d, abstractC5491f, interfaceC6654a), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p153ih.InterfaceC5261a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC5509x get() {
        return m26493c(this.f30468a.get(), this.f30469b.get(), this.f30470c.get(), this.f30471d.get());
    }
}
