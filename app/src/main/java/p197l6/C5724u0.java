package p197l6;

import android.content.Context;
import p093f6.InterfaceC4770b;
import p153ih.InterfaceC5261a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l6/u0.class
 */
/* renamed from: l6.u0 */
/* loaded from: combined.jar:classes1.jar:l6/u0.class */
public final class C5724u0 implements InterfaceC4770b<C5722t0> {

    /* renamed from: a */
    public final InterfaceC5261a<Context> f32089a;

    /* renamed from: b */
    public final InterfaceC5261a<String> f32090b;

    /* renamed from: c */
    public final InterfaceC5261a<Integer> f32091c;

    public C5724u0(InterfaceC5261a<Context> interfaceC5261a, InterfaceC5261a<String> interfaceC5261a2, InterfaceC5261a<Integer> interfaceC5261a3) {
        this.f32089a = interfaceC5261a;
        this.f32090b = interfaceC5261a2;
        this.f32091c = interfaceC5261a3;
    }

    /* renamed from: a */
    public static C5724u0 m28080a(InterfaceC5261a<Context> interfaceC5261a, InterfaceC5261a<String> interfaceC5261a2, InterfaceC5261a<Integer> interfaceC5261a3) {
        return new C5724u0(interfaceC5261a, interfaceC5261a2, interfaceC5261a3);
    }

    /* renamed from: c */
    public static C5722t0 m28081c(Context context, String str, int i10) {
        return new C5722t0(context, str, i10);
    }

    @Override // p153ih.InterfaceC5261a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5722t0 get() {
        return m28081c(this.f32089a.get(), this.f32090b.get(), this.f32091c.get().intValue());
    }
}
