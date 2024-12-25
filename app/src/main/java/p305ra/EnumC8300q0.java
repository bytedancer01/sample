package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/q0.class
 */
/* renamed from: ra.q0 */
/* loaded from: combined.jar:classes2.jar:ra/q0.class */
public enum EnumC8300q0 implements InterfaceC8261n6 {
    UNKNOWN_COMPARISON_TYPE(0),
    LESS_THAN(1),
    GREATER_THAN(2),
    EQUAL(3),
    BETWEEN(4);

    private static final InterfaceC8276o6<EnumC8300q0> zzf = new InterfaceC8276o6<EnumC8300q0>() { // from class: ra.o0
    };
    private final int zzg;

    EnumC8300q0(int i10) {
        this.zzg = i10;
    }

    public static EnumC8300q0 zza(int i10) {
        if (i10 == 0) {
            return UNKNOWN_COMPARISON_TYPE;
        }
        if (i10 == 1) {
            return LESS_THAN;
        }
        if (i10 == 2) {
            return GREATER_THAN;
        }
        if (i10 == 3) {
            return EQUAL;
        }
        if (i10 != 4) {
            return null;
        }
        return BETWEEN;
    }

    public static InterfaceC8291p6 zzb() {
        return C8285p0.f39232a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC8300q0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
    }
}
