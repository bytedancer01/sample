package p227n6;

import p093f6.C4772d;
import p093f6.InterfaceC4770b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n6/d.class
 */
/* renamed from: n6.d */
/* loaded from: combined.jar:classes1.jar:n6/d.class */
public final class C6657d implements InterfaceC4770b<InterfaceC6654a> {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n6/d$a.class
     */
    /* renamed from: n6.d$a */
    /* loaded from: combined.jar:classes1.jar:n6/d$a.class */
    public static final class a {

        /* renamed from: a */
        public static final C6657d f34689a = new C6657d();
    }

    /* renamed from: a */
    public static C6657d m30662a() {
        return a.f34689a;
    }

    /* renamed from: c */
    public static InterfaceC6654a m30663c() {
        return (InterfaceC6654a) C4772d.m24165c(AbstractC6655b.m30657b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p153ih.InterfaceC5261a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC6654a get() {
        return m30663c();
    }
}
