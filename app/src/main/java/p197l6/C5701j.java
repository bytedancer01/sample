package p197l6;

import p093f6.C4772d;
import p093f6.InterfaceC4770b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l6/j.class
 */
/* renamed from: l6.j */
/* loaded from: combined.jar:classes1.jar:l6/j.class */
public final class C5701j implements InterfaceC4770b<AbstractC5691e> {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l6/j$a.class
     */
    /* renamed from: l6.j$a */
    /* loaded from: combined.jar:classes1.jar:l6/j$a.class */
    public static final class a {

        /* renamed from: a */
        public static final C5701j f32044a = new C5701j();
    }

    /* renamed from: a */
    public static C5701j m27985a() {
        return a.f32044a;
    }

    /* renamed from: c */
    public static AbstractC5691e m27986c() {
        return (AbstractC5691e) C4772d.m24165c(AbstractC5693f.m27972d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p153ih.InterfaceC5261a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC5691e get() {
        return m27986c();
    }
}
