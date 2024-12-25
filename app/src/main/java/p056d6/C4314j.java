package p056d6;

import android.content.Context;
import p093f6.InterfaceC4770b;
import p153ih.InterfaceC5261a;
import p227n6.InterfaceC6654a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d6/j.class
 */
/* renamed from: d6.j */
/* loaded from: combined.jar:classes1.jar:d6/j.class */
public final class C4314j implements InterfaceC4770b<C4313i> {

    /* renamed from: a */
    public final InterfaceC5261a<Context> f26452a;

    /* renamed from: b */
    public final InterfaceC5261a<InterfaceC6654a> f26453b;

    /* renamed from: c */
    public final InterfaceC5261a<InterfaceC6654a> f26454c;

    public C4314j(InterfaceC5261a<Context> interfaceC5261a, InterfaceC5261a<InterfaceC6654a> interfaceC5261a2, InterfaceC5261a<InterfaceC6654a> interfaceC5261a3) {
        this.f26452a = interfaceC5261a;
        this.f26453b = interfaceC5261a2;
        this.f26454c = interfaceC5261a3;
    }

    /* renamed from: a */
    public static C4314j m21786a(InterfaceC5261a<Context> interfaceC5261a, InterfaceC5261a<InterfaceC6654a> interfaceC5261a2, InterfaceC5261a<InterfaceC6654a> interfaceC5261a3) {
        return new C4314j(interfaceC5261a, interfaceC5261a2, interfaceC5261a3);
    }

    /* renamed from: c */
    public static C4313i m21787c(Context context, InterfaceC6654a interfaceC6654a, InterfaceC6654a interfaceC6654a2) {
        return new C4313i(context, interfaceC6654a, interfaceC6654a2);
    }

    @Override // p153ih.InterfaceC5261a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4313i get() {
        return m21787c(this.f26452a.get(), this.f26453b.get(), this.f26454c.get());
    }
}
