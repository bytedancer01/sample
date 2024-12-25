package p289qe;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qe/f.class
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Found several "values" enum fields: [] */
/* renamed from: qe.f */
/* loaded from: combined.jar:classes2.jar:qe/f.class */
public final class EnumC7915f {
    private static final EnumC7915f[] $VALUES;
    private static final EnumC7915f[] FOR_BITS;

    /* renamed from: H */
    public static final EnumC7915f f38051H;

    /* renamed from: L */
    public static final EnumC7915f f38052L;

    /* renamed from: M */
    public static final EnumC7915f f38053M;

    /* renamed from: Q */
    public static final EnumC7915f f38054Q;
    private final int bits;

    static {
        EnumC7915f enumC7915f = new EnumC7915f("L", 0, 1);
        f38052L = enumC7915f;
        EnumC7915f enumC7915f2 = new EnumC7915f("M", 1, 0);
        f38053M = enumC7915f2;
        EnumC7915f enumC7915f3 = new EnumC7915f("Q", 2, 3);
        f38054Q = enumC7915f3;
        EnumC7915f enumC7915f4 = new EnumC7915f("H", 3, 2);
        f38051H = enumC7915f4;
        $VALUES = new EnumC7915f[]{enumC7915f, enumC7915f2, enumC7915f3, enumC7915f4};
        FOR_BITS = new EnumC7915f[]{enumC7915f2, enumC7915f, enumC7915f4, enumC7915f3};
    }

    private EnumC7915f(String str, int i10, int i11) {
        this.bits = i11;
    }

    public static EnumC7915f forBits(int i10) {
        if (i10 >= 0) {
            EnumC7915f[] enumC7915fArr = FOR_BITS;
            if (i10 < enumC7915fArr.length) {
                return enumC7915fArr[i10];
            }
        }
        throw new IllegalArgumentException();
    }

    public static EnumC7915f valueOf(String str) {
        return (EnumC7915f) Enum.valueOf(EnumC7915f.class, str);
    }

    public static EnumC7915f[] values() {
        return (EnumC7915f[]) $VALUES.clone();
    }

    public int getBits() {
        return this.bits;
    }
}
