package ua;

import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/z5.class
 */
/* renamed from: ua.z5 */
/* loaded from: combined.jar:classes2.jar:ua/z5.class */
public final class C9141z5 {
    /* renamed from: a */
    public static void m38440a(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    /* renamed from: b */
    public static <T> T m38441b(Bundle bundle, String str, Class<T> cls, T t10) {
        T t11 = (T) bundle.get(str);
        if (t11 == null) {
            return t10;
        }
        if (cls.isAssignableFrom(t11.getClass())) {
            return t11;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), t11.getClass().getCanonicalName()));
    }
}
