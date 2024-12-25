package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/v2.class
 */
/* renamed from: ra.v2 */
/* loaded from: combined.jar:classes2.jar:ra/v2.class */
public enum EnumC8377v2 implements InterfaceC8261n6 {
    UNKNOWN(0),
    STRING(1),
    NUMBER(2),
    BOOLEAN(3),
    STATEMENT(4);

    private static final InterfaceC8276o6<EnumC8377v2> zzf = new InterfaceC8276o6<EnumC8377v2>() { // from class: ra.t2
    };
    private final int zzg;

    EnumC8377v2(int i10) {
        this.zzg = i10;
    }

    public static EnumC8377v2 zza(int i10) {
        if (i10 == 0) {
            return UNKNOWN;
        }
        if (i10 == 1) {
            return STRING;
        }
        if (i10 == 2) {
            return NUMBER;
        }
        if (i10 == 3) {
            return BOOLEAN;
        }
        if (i10 != 4) {
            return null;
        }
        return STATEMENT;
    }

    public static InterfaceC8291p6 zzb() {
        return C8362u2.f39295a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC8377v2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
    }
}
