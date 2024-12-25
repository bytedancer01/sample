package p305ra;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/o1.class
 */
/* renamed from: ra.o1 */
/* loaded from: combined.jar:classes2.jar:ra/o1.class */
public final class C8271o1 extends C8059a implements InterfaceC8303q3 {
    public C8271o1(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // p305ra.InterfaceC8303q3
    /* renamed from: S0 */
    public final Bundle mo35651S0(Bundle bundle) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35634d(m34985Z, bundle);
        Parcel m34984U0 = m34984U0(1, m34985Z);
        Bundle bundle2 = (Bundle) C8255n0.m35633c(m34984U0, Bundle.CREATOR);
        m34984U0.recycle();
        return bundle2;
    }
}
