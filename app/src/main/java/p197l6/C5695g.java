package p197l6;

import p093f6.C4772d;
import p093f6.InterfaceC4770b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l6/g.class
 */
/* renamed from: l6.g */
/* loaded from: combined.jar:classes1.jar:l6/g.class */
public final class C5695g implements InterfaceC4770b<String> {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l6/g$a.class
     */
    /* renamed from: l6.g$a */
    /* loaded from: combined.jar:classes1.jar:l6/g$a.class */
    public static final class a {

        /* renamed from: a */
        public static final C5695g f32037a = new C5695g();
    }

    /* renamed from: a */
    public static C5695g m27973a() {
        return a.f32037a;
    }

    /* renamed from: b */
    public static String m27974b() {
        return (String) C4772d.m24165c(AbstractC5693f.m27969a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p153ih.InterfaceC5261a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m27974b();
    }
}
