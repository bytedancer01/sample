package p216m9;

import android.os.Parcel;
import ga.InterfaceC4993a;
import ma.BinderC6485x;
import ma.C6363r0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/n0.class
 */
/* renamed from: m9.n0 */
/* loaded from: combined.jar:classes2.jar:m9/n0.class */
public abstract class AbstractBinderC5975n0 extends BinderC6485x implements InterfaceC5978o0 {
    public AbstractBinderC5975n0() {
        super("com.google.android.gms.cast.framework.ISessionProvider");
    }

    @Override // ma.BinderC6485x
    /* renamed from: Z */
    public final boolean mo29315Z(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean mo29330o;
        if (i10 == 1) {
            String readString = parcel.readString();
            C6363r0.m29989b(parcel);
            InterfaceC4993a mo29331w = mo29331w(readString);
            parcel2.writeNoException();
            C6363r0.m29992e(parcel2, mo29331w);
            return true;
        }
        if (i10 == 2) {
            mo29330o = mo29330o();
            parcel2.writeNoException();
            ClassLoader classLoader = C6363r0.f33991a;
        } else {
            if (i10 == 3) {
                String mo29329l = mo29329l();
                parcel2.writeNoException();
                parcel2.writeString(mo29329l);
                return true;
            }
            if (i10 != 4) {
                return false;
            }
            parcel2.writeNoException();
            mo29330o = 12451000;
        }
        parcel2.writeInt(mo29330o ? 1 : 0);
        return true;
    }
}
