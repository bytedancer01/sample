package p304r9;

import android.os.Bundle;
import android.os.Parcel;
import ma.BinderC6485x;
import ma.C6363r0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/g.class
 */
/* renamed from: r9.g */
/* loaded from: combined.jar:classes2.jar:r9/g.class */
public abstract class AbstractBinderC8025g extends BinderC6485x implements InterfaceC8027h {
    public AbstractBinderC8025g() {
        super("com.google.android.gms.cast.internal.IBundleCallback");
    }

    @Override // ma.BinderC6485x
    /* renamed from: Z */
    public final boolean mo29315Z(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) C6363r0.m29988a(parcel, Bundle.CREATOR);
        C6363r0.m29989b(parcel);
        mo34890j(bundle);
        return true;
    }
}
