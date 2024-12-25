package p188kd;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kd/s.class
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: kd.s */
/* loaded from: combined.jar:classes2.jar:kd/s.class */
public abstract class EnumC5566s {
    private static final EnumC5566s[] $VALUES;
    public static final EnumC5566s DEFAULT;
    public static final EnumC5566s STRING;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:kd/s$a.class
     */
    /* renamed from: kd.s$a */
    /* loaded from: combined.jar:classes2.jar:kd/s$a.class */
    public enum a extends EnumC5566s {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p188kd.EnumC5566s
        public AbstractC5557j serialize(Long l10) {
            return l10 == null ? C5559l.f31648b : new C5562o(l10);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        DEFAULT = aVar;
        EnumC5566s enumC5566s = new EnumC5566s("STRING", 1) { // from class: kd.s.b
            {
                a aVar2 = null;
            }

            @Override // p188kd.EnumC5566s
            public AbstractC5557j serialize(Long l10) {
                return l10 == null ? C5559l.f31648b : new C5562o(l10.toString());
            }
        };
        STRING = enumC5566s;
        $VALUES = new EnumC5566s[]{aVar, enumC5566s};
    }

    private EnumC5566s(String str, int i10) {
    }

    public /* synthetic */ EnumC5566s(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static EnumC5566s valueOf(String str) {
        return (EnumC5566s) Enum.valueOf(EnumC5566s.class, str);
    }

    public static EnumC5566s[] values() {
        return (EnumC5566s[]) $VALUES.clone();
    }

    public abstract AbstractC5557j serialize(Long l10);
}
