package p216m9;

import android.os.Parcel;
import ma.BinderC6485x;
import ma.C6363r0;
import p200l9.C5770h;
import p350u9.C8822k;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/n1.class
 */
/* renamed from: m9.n1 */
/* loaded from: combined.jar:classes2.jar:m9/n1.class */
public abstract class AbstractBinderC5976n1 extends BinderC6485x implements InterfaceC5979o1 {
    public AbstractBinderC5976n1() {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
    }

    @Override // ma.BinderC6485x
    /* renamed from: Z */
    public final boolean mo29315Z(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            C6363r0.m29989b(parcel);
            mo29297m1(readString, readString2);
        } else if (i10 == 2) {
            String readString3 = parcel.readString();
            C5770h c5770h = (C5770h) C6363r0.m29988a(parcel, C5770h.CREATOR);
            C6363r0.m29989b(parcel);
            mo29298v0(readString3, c5770h);
        } else if (i10 == 3) {
            String readString4 = parcel.readString();
            C6363r0.m29989b(parcel);
            mo29296g(readString4);
        } else {
            if (i10 != 4) {
                if (i10 != 5) {
                    return false;
                }
                parcel2.writeNoException();
                parcel2.writeInt(C8822k.f40857a);
                return true;
            }
            int readInt = parcel.readInt();
            C6363r0.m29989b(parcel);
            mo29295L(readInt);
        }
        parcel2.writeNoException();
        return true;
    }
}
