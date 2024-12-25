package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/h6.class
 */
/* renamed from: ra.h6 */
/* loaded from: combined.jar:classes2.jar:ra/h6.class */
public final class C8171h6 implements InterfaceC8277o7 {

    /* renamed from: a */
    public static final C8171h6 f39104a = new C8171h6();

    /* renamed from: c */
    public static C8171h6 m35416c() {
        return f39104a;
    }

    @Override // p305ra.InterfaceC8277o7
    /* renamed from: a */
    public final boolean mo35387a(Class<?> cls) {
        return AbstractC8231l6.class.isAssignableFrom(cls);
    }

    @Override // p305ra.InterfaceC8277o7
    /* renamed from: b */
    public final InterfaceC8262n7 mo35388b(Class<?> cls) {
        if (!AbstractC8231l6.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (InterfaceC8262n7) AbstractC8231l6.m35580s(cls.asSubclass(AbstractC8231l6.class)).mo35030x(3, null, null);
        } catch (Exception e10) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e10);
        }
    }
}
