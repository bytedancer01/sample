package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/j1.class
 */
/* renamed from: ra.j1 */
/* loaded from: combined.jar:classes2.jar:ra/j1.class */
public enum EnumC8196j1 implements InterfaceC8261n6 {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);

    private static final InterfaceC8276o6<EnumC8196j1> zzg = new InterfaceC8276o6<EnumC8196j1>() { // from class: ra.h1
    };
    private final int zzh;

    EnumC8196j1(int i10) {
        this.zzh = i10;
    }

    public static EnumC8196j1 zza(int i10) {
        if (i10 == 0) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN;
        }
        if (i10 == 1) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED;
        }
        if (i10 == 2) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED;
        }
        if (i10 == 3) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED;
        }
        if (i10 == 4) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED;
        }
        if (i10 != 5) {
            return null;
        }
        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED;
    }

    public static InterfaceC8291p6 zzb() {
        return C8181i1.f39114a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC8196j1.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
    }
}
