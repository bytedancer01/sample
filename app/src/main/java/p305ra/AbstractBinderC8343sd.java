package p305ra;

import android.os.Bundle;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/sd.class
 */
/* renamed from: ra.sd */
/* loaded from: combined.jar:classes2.jar:ra/sd.class */
public abstract class AbstractBinderC8343sd extends BinderC8329s implements InterfaceC8358td {
    public AbstractBinderC8343sd() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // p305ra.BinderC8329s
    /* renamed from: Z */
    public final boolean mo35777Z(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        mo35776j((Bundle) C8255n0.m35633c(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
