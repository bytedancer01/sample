package p227n6;

import p093f6.C4772d;
import p093f6.InterfaceC4770b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n6/c.class
 */
/* renamed from: n6.c */
/* loaded from: combined.jar:classes1.jar:n6/c.class */
public final class C6656c implements InterfaceC4770b<InterfaceC6654a> {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n6/c$a.class
     */
    /* renamed from: n6.c$a */
    /* loaded from: combined.jar:classes1.jar:n6/c$a.class */
    public static final class a {

        /* renamed from: a */
        public static final C6656c f34688a = new C6656c();
    }

    /* renamed from: a */
    public static C6656c m30658a() {
        return a.f34688a;
    }

    /* renamed from: b */
    public static InterfaceC6654a m30659b() {
        return (InterfaceC6654a) C4772d.m24165c(AbstractC6655b.m30656a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p153ih.InterfaceC5261a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6654a get() {
        return m30659b();
    }
}
