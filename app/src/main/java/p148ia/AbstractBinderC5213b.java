package p148ia;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ga.InterfaceC4993a;
import qa.BinderC7871b;
import qa.C7872c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ia/b.class
 */
/* renamed from: ia.b */
/* loaded from: combined.jar:classes2.jar:ia/b.class */
public abstract class AbstractBinderC5213b extends BinderC7871b implements InterfaceC5214c {
    public AbstractBinderC5213b() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static InterfaceC5214c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        return queryLocalInterface instanceof InterfaceC5214c ? (InterfaceC5214c) queryLocalInterface : new C5212a(iBinder);
    }

    @Override // qa.BinderC7871b
    /* renamed from: Z */
    public final boolean mo26065Z(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            init(InterfaceC4993a.a.m25159y0(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 2) {
            boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), C7872c.m34143b(parcel), parcel.readInt());
            parcel2.writeNoException();
            C7872c.m34142a(parcel2, booleanFlagValue);
            return true;
        }
        if (i10 == 3) {
            int intFlagValue = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
            return true;
        }
        if (i10 == 4) {
            long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
        parcel2.writeNoException();
        parcel2.writeString(stringFlagValue);
        return true;
    }
}
