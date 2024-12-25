package p056d6;

import android.content.Context;
import p093f6.InterfaceC4770b;
import p153ih.InterfaceC5261a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d6/l.class
 */
/* renamed from: d6.l */
/* loaded from: combined.jar:classes1.jar:d6/l.class */
public final class C4316l implements InterfaceC4770b<C4315k> {

    /* renamed from: a */
    public final InterfaceC5261a<Context> f26460a;

    /* renamed from: b */
    public final InterfaceC5261a<C4313i> f26461b;

    public C4316l(InterfaceC5261a<Context> interfaceC5261a, InterfaceC5261a<C4313i> interfaceC5261a2) {
        this.f26460a = interfaceC5261a;
        this.f26461b = interfaceC5261a2;
    }

    /* renamed from: a */
    public static C4316l m21793a(InterfaceC5261a<Context> interfaceC5261a, InterfaceC5261a<C4313i> interfaceC5261a2) {
        return new C4316l(interfaceC5261a, interfaceC5261a2);
    }

    /* renamed from: c */
    public static C4315k m21794c(Context context, Object obj) {
        return new C4315k(context, (C4313i) obj);
    }

    @Override // p153ih.InterfaceC5261a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4315k get() {
        return m21794c(this.f26460a.get(), this.f26461b.get());
    }
}
