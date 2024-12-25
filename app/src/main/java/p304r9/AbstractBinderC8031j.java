package p304r9;

import android.os.Parcel;
import ma.BinderC6485x;
import ma.C6363r0;
import p200l9.C5754d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/j.class
 */
/* renamed from: r9.j */
/* loaded from: combined.jar:classes2.jar:r9/j.class */
public abstract class AbstractBinderC8031j extends BinderC6485x implements InterfaceC8033k {
    public AbstractBinderC8031j() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    @Override // ma.BinderC6485x
    /* renamed from: Z */
    public final boolean mo29315Z(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                int readInt = parcel.readInt();
                C6363r0.m29989b(parcel);
                mo28374x(readInt);
                return true;
            case 2:
                C5754d c5754d = (C5754d) C6363r0.m29988a(parcel, C5754d.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean m29993f = C6363r0.m29993f(parcel);
                C6363r0.m29989b(parcel);
                mo28366k0(c5754d, readString, readString2, m29993f);
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                C6363r0.m29989b(parcel);
                mo28371u(readInt2);
                return true;
            case 4:
                String readString3 = parcel.readString();
                double readDouble = parcel.readDouble();
                boolean m29993f2 = C6363r0.m29993f(parcel);
                C6363r0.m29989b(parcel);
                mo28363h0(readString3, readDouble, m29993f2);
                return true;
            case 5:
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                C6363r0.m29989b(parcel);
                mo28375y(readString4, readString5);
                return true;
            case 6:
                String readString6 = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                C6363r0.m29989b(parcel);
                mo28373v1(readString6, createByteArray);
                return true;
            case 7:
                int readInt3 = parcel.readInt();
                C6363r0.m29989b(parcel);
                mo28368n(readInt3);
                return true;
            case 8:
                int readInt4 = parcel.readInt();
                C6363r0.m29989b(parcel);
                mo28367m(readInt4);
                return true;
            case 9:
                int readInt5 = parcel.readInt();
                C6363r0.m29989b(parcel);
                mo28370s(readInt5);
                return true;
            case 10:
                String readString7 = parcel.readString();
                long readLong = parcel.readLong();
                int readInt6 = parcel.readInt();
                C6363r0.m29989b(parcel);
                mo28361E(readString7, readLong, readInt6);
                return true;
            case 11:
                String readString8 = parcel.readString();
                long readLong2 = parcel.readLong();
                C6363r0.m29989b(parcel);
                mo28364h1(readString8, readLong2);
                return true;
            case 12:
                C8017c c8017c = (C8017c) C6363r0.m29988a(parcel, C8017c.CREATOR);
                C6363r0.m29989b(parcel);
                mo28365j0(c8017c);
                return true;
            case 13:
                C8021e c8021e = (C8021e) C6363r0.m29988a(parcel, C8021e.CREATOR);
                C6363r0.m29989b(parcel);
                mo28372u1(c8021e);
                return true;
            case 14:
                int readInt7 = parcel.readInt();
                C6363r0.m29989b(parcel);
                mo28362d0(readInt7);
                return true;
            case 15:
                int readInt8 = parcel.readInt();
                C6363r0.m29989b(parcel);
                mo28369p1(readInt8);
                return true;
            default:
                return false;
        }
    }
}
