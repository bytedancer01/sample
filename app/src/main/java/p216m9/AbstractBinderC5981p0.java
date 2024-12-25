package p216m9;

import android.os.Bundle;
import android.os.Parcel;
import ga.InterfaceC4993a;
import ma.BinderC6485x;
import ma.C6363r0;
import p350u9.C8822k;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/p0.class
 */
/* renamed from: m9.p0 */
/* loaded from: combined.jar:classes2.jar:m9/p0.class */
public abstract class AbstractBinderC5981p0 extends BinderC6485x implements InterfaceC5984q0 {
    public AbstractBinderC5981p0() {
        super("com.google.android.gms.cast.framework.ISessionProxy");
    }

    @Override // ma.BinderC6485x
    /* renamed from: Z */
    public final boolean mo29315Z(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                InterfaceC4993a mo29343l = mo29343l();
                parcel2.writeNoException();
                C6363r0.m29992e(parcel2, mo29343l);
                return true;
            case 2:
                Bundle bundle = (Bundle) C6363r0.m29988a(parcel, Bundle.CREATOR);
                C6363r0.m29989b(parcel);
                mo29344t(bundle);
                break;
            case 3:
                Bundle bundle2 = (Bundle) C6363r0.m29988a(parcel, Bundle.CREATOR);
                C6363r0.m29989b(parcel);
                mo29341e(bundle2);
                break;
            case 4:
                boolean m29993f = C6363r0.m29993f(parcel);
                C6363r0.m29989b(parcel);
                mo29338B(m29993f);
                break;
            case 5:
                long mo29342k = mo29342k();
                parcel2.writeNoException();
                parcel2.writeLong(mo29342k);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeInt(C8822k.f40857a);
                return true;
            case 7:
                Bundle bundle3 = (Bundle) C6363r0.m29988a(parcel, Bundle.CREATOR);
                C6363r0.m29989b(parcel);
                mo29339H0(bundle3);
                break;
            case 8:
                Bundle bundle4 = (Bundle) C6363r0.m29988a(parcel, Bundle.CREATOR);
                C6363r0.m29989b(parcel);
                mo29340O0(bundle4);
                break;
            case 9:
                Bundle bundle5 = (Bundle) C6363r0.m29988a(parcel, Bundle.CREATOR);
                C6363r0.m29989b(parcel);
                mo29345x0(bundle5);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
