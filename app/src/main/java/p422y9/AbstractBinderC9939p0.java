package p422y9;

import android.os.Bundle;
import android.os.Parcel;
import p245oa.BinderC6955b;
import p245oa.C6956c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/p0.class
 */
/* renamed from: y9.p0 */
/* loaded from: combined.jar:classes2.jar:y9/p0.class */
public abstract class AbstractBinderC9939p0 extends BinderC6955b implements InterfaceC9923k {
    public AbstractBinderC9939p0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // p245oa.BinderC6955b
    /* renamed from: Z */
    public final boolean mo31949Z(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            mo41814X(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C6956c.m31950a(parcel, Bundle.CREATOR));
        } else if (i10 == 2) {
            mo41813M0(parcel.readInt(), (Bundle) C6956c.m31950a(parcel, Bundle.CREATOR));
        } else {
            if (i10 != 3) {
                return false;
            }
            mo41815f1(parcel.readInt(), parcel.readStrongBinder(), (C9910f1) C6956c.m31950a(parcel, C9910f1.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
