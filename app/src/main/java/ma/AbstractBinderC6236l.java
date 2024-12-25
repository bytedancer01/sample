package ma;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/l.class
 */
/* renamed from: ma.l */
/* loaded from: combined.jar:classes2.jar:ma/l.class */
public abstract class AbstractBinderC6236l extends BinderC6485x implements InterfaceC6257m {
    public AbstractBinderC6236l() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    @Override // ma.BinderC6485x
    /* renamed from: Z */
    public final boolean mo29315Z(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC6299o c6278n;
        boolean mo29523N0;
        switch (i10) {
            case 1:
                Bundle bundle = (Bundle) C6363r0.m29988a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c6278n = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    c6278n = queryLocalInterface instanceof InterfaceC6299o ? (InterfaceC6299o) queryLocalInterface : new C6278n(readStrongBinder);
                }
                C6363r0.m29989b(parcel);
                mo29526Z0(bundle, c6278n);
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle2 = (Bundle) C6363r0.m29988a(parcel, Bundle.CREATOR);
                int readInt = parcel.readInt();
                C6363r0.m29989b(parcel);
                mo29525W(bundle2, readInt);
                parcel2.writeNoException();
                return true;
            case 3:
                Bundle bundle3 = (Bundle) C6363r0.m29988a(parcel, Bundle.CREATOR);
                C6363r0.m29989b(parcel);
                mo29528e(bundle3);
                parcel2.writeNoException();
                return true;
            case 4:
                Bundle bundle4 = (Bundle) C6363r0.m29988a(parcel, Bundle.CREATOR);
                int readInt2 = parcel.readInt();
                C6363r0.m29989b(parcel);
                mo29523N0 = mo29523N0(bundle4, readInt2);
                parcel2.writeNoException();
                parcel2.writeInt(mo29523N0 ? 1 : 0);
                return true;
            case 5:
                String readString = parcel.readString();
                C6363r0.m29989b(parcel);
                mo29536y1(readString);
                parcel2.writeNoException();
                return true;
            case 6:
                mo29532p();
                parcel2.writeNoException();
                return true;
            case 7:
                mo29523N0 = mo29529f();
                parcel2.writeNoException();
                ClassLoader classLoader = C6363r0.f33991a;
                parcel2.writeInt(mo29523N0 ? 1 : 0);
                return true;
            case 8:
                String readString2 = parcel.readString();
                C6363r0.m29989b(parcel);
                Bundle mo29534w = mo29534w(readString2);
                parcel2.writeNoException();
                C6363r0.m29991d(parcel2, mo29534w);
                return true;
            case 9:
                String mo29531l = mo29531l();
                parcel2.writeNoException();
                parcel2.writeString(mo29531l);
                return true;
            case 10:
                parcel2.writeNoException();
                mo29523N0 = 12451000;
                parcel2.writeInt(mo29523N0 ? 1 : 0);
                return true;
            case 11:
                mo29527d();
                parcel2.writeNoException();
                return true;
            case 12:
                mo29523N0 = mo29530h();
                parcel2.writeNoException();
                ClassLoader classLoader2 = C6363r0.f33991a;
                parcel2.writeInt(mo29523N0 ? 1 : 0);
                return true;
            case 13:
                int readInt3 = parcel.readInt();
                C6363r0.m29989b(parcel);
                mo29533q(readInt3);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
