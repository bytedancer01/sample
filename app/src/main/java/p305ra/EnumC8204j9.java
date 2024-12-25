package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/j9.class
 */
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: ra.j9 */
/* loaded from: combined.jar:classes2.jar:ra/j9.class */
public final class EnumC8204j9 {
    public static final EnumC8204j9 zza;
    public static final EnumC8204j9 zzb;
    public static final EnumC8204j9 zzc;
    public static final EnumC8204j9 zzd;
    public static final EnumC8204j9 zze;
    public static final EnumC8204j9 zzf;
    public static final EnumC8204j9 zzg;
    public static final EnumC8204j9 zzh;
    public static final EnumC8204j9 zzi;
    public static final EnumC8204j9 zzj;
    public static final EnumC8204j9 zzk;
    public static final EnumC8204j9 zzl;
    public static final EnumC8204j9 zzm;
    public static final EnumC8204j9 zzn;
    public static final EnumC8204j9 zzo;
    public static final EnumC8204j9 zzp;
    public static final EnumC8204j9 zzq;
    public static final EnumC8204j9 zzr;
    private static final EnumC8204j9[] zzt;
    private final EnumC8219k9 zzs;

    static {
        EnumC8204j9 enumC8204j9 = new EnumC8204j9("DOUBLE", 0, EnumC8219k9.DOUBLE, 1);
        zza = enumC8204j9;
        EnumC8204j9 enumC8204j92 = new EnumC8204j9("FLOAT", 1, EnumC8219k9.FLOAT, 5);
        zzb = enumC8204j92;
        EnumC8219k9 enumC8219k9 = EnumC8219k9.LONG;
        EnumC8204j9 enumC8204j93 = new EnumC8204j9("INT64", 2, enumC8219k9, 0);
        zzc = enumC8204j93;
        EnumC8204j9 enumC8204j94 = new EnumC8204j9("UINT64", 3, enumC8219k9, 0);
        zzd = enumC8204j94;
        EnumC8219k9 enumC8219k92 = EnumC8219k9.INT;
        EnumC8204j9 enumC8204j95 = new EnumC8204j9("INT32", 4, enumC8219k92, 0);
        zze = enumC8204j95;
        EnumC8204j9 enumC8204j96 = new EnumC8204j9("FIXED64", 5, enumC8219k9, 1);
        zzf = enumC8204j96;
        EnumC8204j9 enumC8204j97 = new EnumC8204j9("FIXED32", 6, enumC8219k92, 5);
        zzg = enumC8204j97;
        EnumC8204j9 enumC8204j98 = new EnumC8204j9("BOOL", 7, EnumC8219k9.BOOLEAN, 0);
        zzh = enumC8204j98;
        EnumC8204j9 enumC8204j99 = new EnumC8204j9("STRING", 8, EnumC8219k9.STRING, 2);
        zzi = enumC8204j99;
        EnumC8219k9 enumC8219k93 = EnumC8219k9.MESSAGE;
        EnumC8204j9 enumC8204j910 = new EnumC8204j9("GROUP", 9, enumC8219k93, 3);
        zzj = enumC8204j910;
        EnumC8204j9 enumC8204j911 = new EnumC8204j9("MESSAGE", 10, enumC8219k93, 2);
        zzk = enumC8204j911;
        EnumC8204j9 enumC8204j912 = new EnumC8204j9("BYTES", 11, EnumC8219k9.BYTE_STRING, 2);
        zzl = enumC8204j912;
        EnumC8204j9 enumC8204j913 = new EnumC8204j9("UINT32", 12, enumC8219k92, 0);
        zzm = enumC8204j913;
        EnumC8204j9 enumC8204j914 = new EnumC8204j9("ENUM", 13, EnumC8219k9.ENUM, 0);
        zzn = enumC8204j914;
        EnumC8204j9 enumC8204j915 = new EnumC8204j9("SFIXED32", 14, enumC8219k92, 5);
        zzo = enumC8204j915;
        EnumC8204j9 enumC8204j916 = new EnumC8204j9("SFIXED64", 15, enumC8219k9, 1);
        zzp = enumC8204j916;
        EnumC8204j9 enumC8204j917 = new EnumC8204j9("SINT32", 16, enumC8219k92, 0);
        zzq = enumC8204j917;
        EnumC8204j9 enumC8204j918 = new EnumC8204j9("SINT64", 17, enumC8219k9, 0);
        zzr = enumC8204j918;
        zzt = new EnumC8204j9[]{enumC8204j9, enumC8204j92, enumC8204j93, enumC8204j94, enumC8204j95, enumC8204j96, enumC8204j97, enumC8204j98, enumC8204j99, enumC8204j910, enumC8204j911, enumC8204j912, enumC8204j913, enumC8204j914, enumC8204j915, enumC8204j916, enumC8204j917, enumC8204j918};
    }

    private EnumC8204j9(String str, int i10, EnumC8219k9 enumC8219k9, int i11) {
        this.zzs = enumC8219k9;
    }

    public static EnumC8204j9[] values() {
        return (EnumC8204j9[]) zzt.clone();
    }

    public final EnumC8219k9 zza() {
        return this.zzs;
    }
}
