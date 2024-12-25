package ua;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import p305ra.BinderC8329s;
import p305ra.C8255n0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/o3.class
 */
/* renamed from: ua.o3 */
/* loaded from: combined.jar:classes2.jar:ua/o3.class */
public abstract class AbstractBinderC9012o3 extends BinderC8329s implements InterfaceC9024p3 {
    public AbstractBinderC9012o3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // p305ra.BinderC8329s
    /* renamed from: Z */
    public final boolean mo35777Z(int i10, Parcel parcel, Parcel parcel2, int i11) {
        List<C8852b> mo38180c0;
        switch (i10) {
            case 1:
                mo38153t1((C9068t) C8255n0.m35633c(parcel, C9068t.CREATOR), (C8959ja) C8255n0.m35633c(parcel, C8959ja.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                mo38152q1((C8851aa) C8255n0.m35633c(parcel, C8851aa.CREATOR), (C8959ja) C8255n0.m35633c(parcel, C8959ja.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                mo38143P0((C8959ja) C8255n0.m35633c(parcel, C8959ja.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                mo38181n1((C9068t) C8255n0.m35633c(parcel, C9068t.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                mo38140B0((C8959ja) C8255n0.m35633c(parcel, C8959ja.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                mo38180c0 = mo38180c0((C8959ja) C8255n0.m35633c(parcel, C8959ja.CREATOR), C8255n0.m35631a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo38180c0);
                return true;
            case 9:
                byte[] mo38151i1 = mo38151i1((C9068t) C8255n0.m35633c(parcel, C9068t.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(mo38151i1);
                return true;
            case 10:
                mo38144Q0(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String mo38149f0 = mo38149f0((C8959ja) C8255n0.m35633c(parcel, C8959ja.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(mo38149f0);
                return true;
            case 12:
                mo38141C0((C8852b) C8255n0.m35633c(parcel, C8852b.CREATOR), (C8959ja) C8255n0.m35633c(parcel, C8959ja.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                mo38179a0((C8852b) C8255n0.m35633c(parcel, C8852b.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                mo38180c0 = mo38142D(parcel.readString(), parcel.readString(), C8255n0.m35631a(parcel), (C8959ja) C8255n0.m35633c(parcel, C8959ja.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo38180c0);
                return true;
            case 15:
                mo38180c0 = mo38154w0(parcel.readString(), parcel.readString(), parcel.readString(), C8255n0.m35631a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo38180c0);
                return true;
            case 16:
                mo38180c0 = mo38146X0(parcel.readString(), parcel.readString(), (C8959ja) C8255n0.m35633c(parcel, C8959ja.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo38180c0);
                return true;
            case 17:
                mo38180c0 = mo38145S(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(mo38180c0);
                return true;
            case 18:
                mo38148d1((C8959ja) C8255n0.m35633c(parcel, C8959ja.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                mo38150g1((Bundle) C8255n0.m35633c(parcel, Bundle.CREATOR), (C8959ja) C8255n0.m35633c(parcel, C8959ja.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                mo38147Y0((C8959ja) C8255n0.m35633c(parcel, C8959ja.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
