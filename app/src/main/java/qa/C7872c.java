package qa;

import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qa/c.class
 */
/* renamed from: qa.c */
/* loaded from: combined.jar:classes2.jar:qa/c.class */
public final class C7872c {

    /* renamed from: a */
    public static final ClassLoader f37942a = C7872c.class.getClassLoader();

    /* renamed from: a */
    public static void m34142a(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    /* renamed from: b */
    public static boolean m34143b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
