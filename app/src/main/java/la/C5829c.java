package la;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:la/c.class
 */
/* renamed from: la.c */
/* loaded from: combined.jar:classes2.jar:la/c.class */
public final class C5829c {

    /* renamed from: a */
    public static final ClassLoader f32450a = C5829c.class.getClassLoader();

    /* renamed from: a */
    public static <T extends Parcelable> T m28414a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m28415b(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    /* renamed from: c */
    public static void m28416c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* renamed from: d */
    public static void m28417d(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
