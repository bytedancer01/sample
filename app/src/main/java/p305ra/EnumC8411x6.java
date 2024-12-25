package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/x6.class
 */
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: ra.x6 */
/* loaded from: combined.jar:classes2.jar:ra/x6.class */
public final class EnumC8411x6 {
    public static final EnumC8411x6 zza;
    public static final EnumC8411x6 zzb;
    public static final EnumC8411x6 zzc;
    public static final EnumC8411x6 zzd;
    public static final EnumC8411x6 zze;
    public static final EnumC8411x6 zzf;
    public static final EnumC8411x6 zzg;
    public static final EnumC8411x6 zzh;
    public static final EnumC8411x6 zzi;
    public static final EnumC8411x6 zzj;
    private static final EnumC8411x6[] zzn;
    private final Class<?> zzk;
    private final Class<?> zzl;
    private final Object zzm;

    static {
        EnumC8411x6 enumC8411x6 = new EnumC8411x6("VOID", 0, Void.class, Void.class, null);
        zza = enumC8411x6;
        Class cls = Integer.TYPE;
        EnumC8411x6 enumC8411x62 = new EnumC8411x6("INT", 1, cls, Integer.class, 0);
        zzb = enumC8411x62;
        EnumC8411x6 enumC8411x63 = new EnumC8411x6("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = enumC8411x63;
        EnumC8411x6 enumC8411x64 = new EnumC8411x6("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = enumC8411x64;
        EnumC8411x6 enumC8411x65 = new EnumC8411x6("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = enumC8411x65;
        EnumC8411x6 enumC8411x66 = new EnumC8411x6("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = enumC8411x66;
        EnumC8411x6 enumC8411x67 = new EnumC8411x6("STRING", 6, String.class, String.class, "");
        zzg = enumC8411x67;
        EnumC8411x6 enumC8411x68 = new EnumC8411x6("BYTE_STRING", 7, AbstractC8230l5.class, AbstractC8230l5.class, AbstractC8230l5.f39165c);
        zzh = enumC8411x68;
        EnumC8411x6 enumC8411x69 = new EnumC8411x6("ENUM", 8, cls, Integer.class, null);
        zzi = enumC8411x69;
        EnumC8411x6 enumC8411x610 = new EnumC8411x6("MESSAGE", 9, Object.class, Object.class, null);
        zzj = enumC8411x610;
        zzn = new EnumC8411x6[]{enumC8411x6, enumC8411x62, enumC8411x63, enumC8411x64, enumC8411x65, enumC8411x66, enumC8411x67, enumC8411x68, enumC8411x69, enumC8411x610};
    }

    private EnumC8411x6(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzk = cls;
        this.zzl = cls2;
        this.zzm = obj;
    }

    public static EnumC8411x6[] values() {
        return (EnumC8411x6[]) zzn.clone();
    }

    public final Class<?> zza() {
        return this.zzl;
    }
}
