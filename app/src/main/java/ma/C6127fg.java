package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/fg.class
 */
/* renamed from: ma.fg */
/* loaded from: combined.jar:classes2.jar:ma/fg.class */
public final class C6127fg {

    /* renamed from: a */
    public static final AbstractC6085dg f33778a = new C6106eg();

    /* renamed from: b */
    public static final AbstractC6085dg f33779b;

    static {
        AbstractC6085dg abstractC6085dg;
        try {
            abstractC6085dg = (AbstractC6085dg) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e10) {
            abstractC6085dg = null;
        }
        f33779b = abstractC6085dg;
    }

    /* renamed from: a */
    public static AbstractC6085dg m29610a() {
        AbstractC6085dg abstractC6085dg = f33779b;
        if (abstractC6085dg != null) {
            return abstractC6085dg;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static AbstractC6085dg m29611b() {
        return f33778a;
    }
}
