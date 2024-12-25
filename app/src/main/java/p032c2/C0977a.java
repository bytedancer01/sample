package p032c2;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c2/a.class
 */
/* renamed from: c2.a */
/* loaded from: combined.jar:classes1.jar:c2/a.class */
public class C0977a {
    /* renamed from: a */
    public static <T extends InterfaceC0980d> T m5834a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).m4744b();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    /* renamed from: b */
    public static <T extends InterfaceC0980d> T m5835b(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(C0977a.class.getClassLoader());
            return (T) m5834a(bundle2.getParcelable("a"));
        } catch (RuntimeException e10) {
            return null;
        }
    }

    /* renamed from: c */
    public static void m5836c(Bundle bundle, String str, InterfaceC0980d interfaceC0980d) {
        if (interfaceC0980d == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", m5837d(interfaceC0980d));
        bundle.putParcelable(str, bundle2);
    }

    /* renamed from: d */
    public static Parcelable m5837d(InterfaceC0980d interfaceC0980d) {
        return new ParcelImpl(interfaceC0980d);
    }
}
