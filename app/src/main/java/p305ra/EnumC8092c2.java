package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/c2.class
 */
/* renamed from: ra.c2 */
/* loaded from: combined.jar:classes2.jar:ra/c2.class */
public enum EnumC8092c2 implements InterfaceC8261n6 {
    RADS(1),
    PROVISIONING(2);

    private static final InterfaceC8276o6<EnumC8092c2> zzc = new InterfaceC8276o6<EnumC8092c2>() { // from class: ra.a2
    };
    private final int zzd;

    EnumC8092c2(int i10) {
        this.zzd = i10;
    }

    public static EnumC8092c2 zza(int i10) {
        if (i10 == 1) {
            return RADS;
        }
        if (i10 != 2) {
            return null;
        }
        return PROVISIONING;
    }

    public static InterfaceC8291p6 zzb() {
        return C8077b2.f38942a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC8092c2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
    }
}
