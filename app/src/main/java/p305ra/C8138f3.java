package p305ra;

import android.os.Binder;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/f3.class
 */
/* renamed from: ra.f3 */
/* loaded from: combined.jar:classes2.jar:ra/f3.class */
public final /* synthetic */ class C8138f3 {
    /* renamed from: a */
    public static <V> V m35359a(InterfaceC8153g3<V> interfaceC8153g3) {
        V zza;
        try {
            zza = interfaceC8153g3.zza();
        } catch (SecurityException e10) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                zza = interfaceC8153g3.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return zza;
    }
}
