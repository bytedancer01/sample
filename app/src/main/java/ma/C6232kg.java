package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/kg.class
 */
/* renamed from: ma.kg */
/* loaded from: combined.jar:classes2.jar:ma/kg.class */
public final class C6232kg implements InterfaceC6401sh {

    /* renamed from: a */
    public static final C6232kg f33867a = new C6232kg();

    /* renamed from: c */
    public static C6232kg m29820c() {
        return f33867a;
    }

    @Override // ma.InterfaceC6401sh
    /* renamed from: a */
    public final InterfaceC6380rh mo29821a(Class cls) {
        if (!AbstractC6295ng.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC6380rh) AbstractC6295ng.m29903t(cls.asSubclass(AbstractC6295ng.class)).mo29386o(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // ma.InterfaceC6401sh
    /* renamed from: b */
    public final boolean mo29822b(Class cls) {
        return AbstractC6295ng.class.isAssignableFrom(cls);
    }
}
