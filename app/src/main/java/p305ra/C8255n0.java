package p305ra;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/n0.class
 */
/* renamed from: ra.n0 */
/* loaded from: combined.jar:classes2.jar:ra/n0.class */
public final class C8255n0 {

    /* renamed from: a */
    public static final ClassLoader f39204a = C8255n0.class.getClassLoader();

    /* renamed from: a */
    public static boolean m35631a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: b */
    public static void m35632b(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    /* renamed from: c */
    public static <T extends Parcelable> T m35633c(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: d */
    public static void m35634d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* renamed from: e */
    public static void m35635e(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: f */
    public static HashMap m35636f(Parcel parcel) {
        return parcel.readHashMap(f39204a);
    }
}
