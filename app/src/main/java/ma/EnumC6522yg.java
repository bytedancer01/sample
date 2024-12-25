package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/yg.class
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
/* renamed from: ma.yg */
/* loaded from: combined.jar:classes2.jar:ma/yg.class */
public final class EnumC6522yg {
    public static final EnumC6522yg zza;
    public static final EnumC6522yg zzb;
    public static final EnumC6522yg zzc;
    public static final EnumC6522yg zzd;
    public static final EnumC6522yg zze;
    public static final EnumC6522yg zzf;
    public static final EnumC6522yg zzg;
    public static final EnumC6522yg zzh;
    public static final EnumC6522yg zzi;
    public static final EnumC6522yg zzj;
    private static final EnumC6522yg[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        EnumC6522yg enumC6522yg = new EnumC6522yg("VOID", 0, Void.class, Void.class, null);
        zza = enumC6522yg;
        Class cls = Integer.TYPE;
        EnumC6522yg enumC6522yg2 = new EnumC6522yg("INT", 1, cls, Integer.class, 0);
        zzb = enumC6522yg2;
        EnumC6522yg enumC6522yg3 = new EnumC6522yg("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = enumC6522yg3;
        EnumC6522yg enumC6522yg4 = new EnumC6522yg("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = enumC6522yg4;
        EnumC6522yg enumC6522yg5 = new EnumC6522yg("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = enumC6522yg5;
        EnumC6522yg enumC6522yg6 = new EnumC6522yg("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = enumC6522yg6;
        EnumC6522yg enumC6522yg7 = new EnumC6522yg("STRING", 6, String.class, String.class, "");
        zzg = enumC6522yg7;
        EnumC6522yg enumC6522yg8 = new EnumC6522yg("BYTE_STRING", 7, AbstractC6399sf.class, AbstractC6399sf.class, AbstractC6399sf.f34033c);
        zzh = enumC6522yg8;
        EnumC6522yg enumC6522yg9 = new EnumC6522yg("ENUM", 8, cls, Integer.class, null);
        zzi = enumC6522yg9;
        EnumC6522yg enumC6522yg10 = new EnumC6522yg("MESSAGE", 9, Object.class, Object.class, null);
        zzj = enumC6522yg10;
        zzk = new EnumC6522yg[]{enumC6522yg, enumC6522yg2, enumC6522yg3, enumC6522yg4, enumC6522yg5, enumC6522yg6, enumC6522yg7, enumC6522yg8, enumC6522yg9, enumC6522yg10};
    }

    private EnumC6522yg(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static EnumC6522yg[] values() {
        return (EnumC6522yg[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}
