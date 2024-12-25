package ma;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/r0.class
 */
/* renamed from: ma.r0 */
/* loaded from: combined.jar:classes2.jar:ma/r0.class */
public final class C6363r0 {

    /* renamed from: a */
    public static final ClassLoader f33991a = C6363r0.class.getClassLoader();

    /* renamed from: a */
    public static Parcelable m29988a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m29989b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
    }

    /* renamed from: c */
    public static void m29990c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* renamed from: d */
    public static void m29991d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    /* renamed from: e */
    public static void m29992e(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: f */
    public static boolean m29993f(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
