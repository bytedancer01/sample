package p162j6;

import p093f6.C4772d;
import p093f6.InterfaceC4770b;
import p153ih.InterfaceC5261a;
import p181k6.AbstractC5491f;
import p227n6.InterfaceC6654a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j6/g.class
 */
/* renamed from: j6.g */
/* loaded from: combined.jar:classes1.jar:j6/g.class */
public final class C5302g implements InterfaceC4770b<AbstractC5491f> {

    /* renamed from: a */
    public final InterfaceC5261a<InterfaceC6654a> f30467a;

    public C5302g(InterfaceC5261a<InterfaceC6654a> interfaceC5261a) {
        this.f30467a = interfaceC5261a;
    }

    /* renamed from: a */
    public static AbstractC5491f m26488a(InterfaceC6654a interfaceC6654a) {
        return (AbstractC5491f) C4772d.m24165c(AbstractC5301f.m26487a(interfaceC6654a), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C5302g m26489b(InterfaceC5261a<InterfaceC6654a> interfaceC5261a) {
        return new C5302g(interfaceC5261a);
    }

    @Override // p153ih.InterfaceC5261a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC5491f get() {
        return m26488a(this.f30467a.get());
    }
}
