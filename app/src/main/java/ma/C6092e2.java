package ma;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/e2.class
 */
/* renamed from: ma.e2 */
/* loaded from: combined.jar:classes2.jar:ma/e2.class */
public final class C6092e2 {
    /* renamed from: a */
    public static String m29560a(String str) {
        Logger logger = C6029b2.f33677a;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public static String m29561b(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e10) {
                    String str3 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str3), (Throwable) e10);
                    str2 = "<" + str3 + " threw " + e10.getClass().getName() + ">";
                }
            }
            objArr[i10] = str2;
            i10++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i11 = 0;
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i12 >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, indexOf);
            sb2.append(objArr[i12]);
            i11 = indexOf + 2;
            i12++;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i12 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i12]);
            for (int i13 = i12 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
