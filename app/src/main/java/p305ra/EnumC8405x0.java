package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/x0.class
 */
/* renamed from: ra.x0 */
/* loaded from: combined.jar:classes2.jar:ra/x0.class */
public enum EnumC8405x0 implements InterfaceC8261n6 {
    UNKNOWN_MATCH_TYPE(0),
    REGEXP(1),
    BEGINS_WITH(2),
    ENDS_WITH(3),
    PARTIAL(4),
    EXACT(5),
    IN_LIST(6);

    private static final InterfaceC8276o6<EnumC8405x0> zzh = new InterfaceC8276o6<EnumC8405x0>() { // from class: ra.v0
    };
    private final int zzi;

    EnumC8405x0(int i10) {
        this.zzi = i10;
    }

    public static EnumC8405x0 zza(int i10) {
        switch (i10) {
            case 0:
                return UNKNOWN_MATCH_TYPE;
            case 1:
                return REGEXP;
            case 2:
                return BEGINS_WITH;
            case 3:
                return ENDS_WITH;
            case 4:
                return PARTIAL;
            case 5:
                return EXACT;
            case 6:
                return IN_LIST;
            default:
                return null;
        }
    }

    public static InterfaceC8291p6 zzb() {
        return C8390w0.f39359a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC8405x0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + '>';
    }
}
