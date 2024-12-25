package p245oa;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:oa/c.class
 */
/* renamed from: oa.c */
/* loaded from: combined.jar:classes2.jar:oa/c.class */
public final class C6956c {

    /* renamed from: a */
    public static final ClassLoader f35931a = C6956c.class.getClassLoader();

    /* renamed from: a */
    public static <T extends Parcelable> T m31950a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m31951b(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    /* renamed from: c */
    public static void m31952c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* renamed from: d */
    public static void m31953d(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: e */
    public static boolean m31954e(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
