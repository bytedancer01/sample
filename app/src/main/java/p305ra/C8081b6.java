package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/b6.class
 */
/* renamed from: ra.b6 */
/* loaded from: combined.jar:classes2.jar:ra/b6.class */
public final class C8081b6 {

    /* renamed from: a */
    public static final AbstractC8440z5<?> f38945a = new C8066a6();

    /* renamed from: b */
    public static final AbstractC8440z5<?> f38946b;

    static {
        AbstractC8440z5<?> abstractC8440z5;
        try {
            abstractC8440z5 = (AbstractC8440z5) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e10) {
            abstractC8440z5 = null;
        }
        f38946b = abstractC8440z5;
    }

    /* renamed from: a */
    public static AbstractC8440z5<?> m35035a() {
        return f38945a;
    }

    /* renamed from: b */
    public static AbstractC8440z5<?> m35036b() {
        AbstractC8440z5<?> abstractC8440z5 = f38946b;
        if (abstractC8440z5 != null) {
            return abstractC8440z5;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
