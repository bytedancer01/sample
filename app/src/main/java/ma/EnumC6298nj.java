package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/nj.class
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
/* renamed from: ma.nj */
/* loaded from: combined.jar:classes2.jar:ma/nj.class */
public final class EnumC6298nj {
    public static final EnumC6298nj zza;
    public static final EnumC6298nj zzb;
    public static final EnumC6298nj zzc;
    public static final EnumC6298nj zzd;
    public static final EnumC6298nj zze;
    public static final EnumC6298nj zzf;
    public static final EnumC6298nj zzg;
    public static final EnumC6298nj zzh;
    public static final EnumC6298nj zzi;
    public static final EnumC6298nj zzj;
    public static final EnumC6298nj zzk;
    public static final EnumC6298nj zzl;
    public static final EnumC6298nj zzm;
    public static final EnumC6298nj zzn;
    public static final EnumC6298nj zzo;
    public static final EnumC6298nj zzp;
    public static final EnumC6298nj zzq;
    public static final EnumC6298nj zzr;
    private static final EnumC6298nj[] zzs;
    private final EnumC6319oj zzt;

    static {
        EnumC6298nj enumC6298nj = new EnumC6298nj("DOUBLE", 0, EnumC6319oj.DOUBLE, 1);
        zza = enumC6298nj;
        EnumC6298nj enumC6298nj2 = new EnumC6298nj("FLOAT", 1, EnumC6319oj.FLOAT, 5);
        zzb = enumC6298nj2;
        EnumC6319oj enumC6319oj = EnumC6319oj.LONG;
        EnumC6298nj enumC6298nj3 = new EnumC6298nj("INT64", 2, enumC6319oj, 0);
        zzc = enumC6298nj3;
        EnumC6298nj enumC6298nj4 = new EnumC6298nj("UINT64", 3, enumC6319oj, 0);
        zzd = enumC6298nj4;
        EnumC6319oj enumC6319oj2 = EnumC6319oj.INT;
        EnumC6298nj enumC6298nj5 = new EnumC6298nj("INT32", 4, enumC6319oj2, 0);
        zze = enumC6298nj5;
        EnumC6298nj enumC6298nj6 = new EnumC6298nj("FIXED64", 5, enumC6319oj, 1);
        zzf = enumC6298nj6;
        EnumC6298nj enumC6298nj7 = new EnumC6298nj("FIXED32", 6, enumC6319oj2, 5);
        zzg = enumC6298nj7;
        EnumC6298nj enumC6298nj8 = new EnumC6298nj("BOOL", 7, EnumC6319oj.BOOLEAN, 0);
        zzh = enumC6298nj8;
        EnumC6298nj enumC6298nj9 = new EnumC6298nj("STRING", 8, EnumC6319oj.STRING, 2);
        zzi = enumC6298nj9;
        EnumC6319oj enumC6319oj3 = EnumC6319oj.MESSAGE;
        EnumC6298nj enumC6298nj10 = new EnumC6298nj("GROUP", 9, enumC6319oj3, 3);
        zzj = enumC6298nj10;
        EnumC6298nj enumC6298nj11 = new EnumC6298nj("MESSAGE", 10, enumC6319oj3, 2);
        zzk = enumC6298nj11;
        EnumC6298nj enumC6298nj12 = new EnumC6298nj("BYTES", 11, EnumC6319oj.BYTE_STRING, 2);
        zzl = enumC6298nj12;
        EnumC6298nj enumC6298nj13 = new EnumC6298nj("UINT32", 12, enumC6319oj2, 0);
        zzm = enumC6298nj13;
        EnumC6298nj enumC6298nj14 = new EnumC6298nj("ENUM", 13, EnumC6319oj.ENUM, 0);
        zzn = enumC6298nj14;
        EnumC6298nj enumC6298nj15 = new EnumC6298nj("SFIXED32", 14, enumC6319oj2, 5);
        zzo = enumC6298nj15;
        EnumC6298nj enumC6298nj16 = new EnumC6298nj("SFIXED64", 15, enumC6319oj, 1);
        zzp = enumC6298nj16;
        EnumC6298nj enumC6298nj17 = new EnumC6298nj("SINT32", 16, enumC6319oj2, 0);
        zzq = enumC6298nj17;
        EnumC6298nj enumC6298nj18 = new EnumC6298nj("SINT64", 17, enumC6319oj, 0);
        zzr = enumC6298nj18;
        zzs = new EnumC6298nj[]{enumC6298nj, enumC6298nj2, enumC6298nj3, enumC6298nj4, enumC6298nj5, enumC6298nj6, enumC6298nj7, enumC6298nj8, enumC6298nj9, enumC6298nj10, enumC6298nj11, enumC6298nj12, enumC6298nj13, enumC6298nj14, enumC6298nj15, enumC6298nj16, enumC6298nj17, enumC6298nj18};
    }

    private EnumC6298nj(String str, int i10, EnumC6319oj enumC6319oj, int i11) {
        this.zzt = enumC6319oj;
    }

    public static EnumC6298nj[] values() {
        return (EnumC6298nj[]) zzs.clone();
    }

    public final EnumC6319oj zza() {
        return this.zzt;
    }
}
