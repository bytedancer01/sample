package p216m9;

import android.os.Parcel;
import ga.InterfaceC4993a;
import ma.BinderC6485x;
import ma.C6363r0;
import p350u9.C8822k;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/l1.class
 */
/* renamed from: m9.l1 */
/* loaded from: combined.jar:classes2.jar:m9/l1.class */
public abstract class AbstractBinderC5970l1 extends BinderC6485x implements InterfaceC5973m1 {
    public AbstractBinderC5970l1() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener");
    }

    @Override // ma.BinderC6485x
    /* renamed from: Z */
    public final boolean mo29315Z(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            InterfaceC4993a mo29326k = mo29326k();
            parcel2.writeNoException();
            C6363r0.m29992e(parcel2, mo29326k);
            return true;
        }
        if (i10 == 2) {
            mo29328o();
        } else {
            if (i10 != 3) {
                if (i10 != 4) {
                    return false;
                }
                parcel2.writeNoException();
                parcel2.writeInt(C8822k.f40857a);
                return true;
            }
            mo29327l();
        }
        parcel2.writeNoException();
        return true;
    }
}
