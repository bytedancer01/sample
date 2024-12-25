package ec;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ec/n.class
 */
/* renamed from: ec.n */
/* loaded from: combined.jar:classes2.jar:ec/n.class */
public final class C4711n {
    /* renamed from: a */
    public static String m23688a(@NullableDecl String str, @NullableDecl Object... objArr) {
        Object[] objArr2;
        int indexOf;
        String valueOf = String.valueOf(str);
        if (objArr != null) {
            int i10 = 0;
            while (true) {
                objArr2 = objArr;
                if (i10 >= objArr.length) {
                    break;
                }
                objArr[i10] = m23689b(objArr[i10]);
                i10++;
            }
        } else {
            objArr2 = new Object[]{"(Object[])null"};
        }
        StringBuilder sb2 = new StringBuilder(valueOf.length() + (objArr2.length * 16));
        int i11 = 0;
        int i12 = 0;
        while (i12 < objArr2.length && (indexOf = valueOf.indexOf("%s", i11)) != -1) {
            sb2.append((CharSequence) valueOf, i11, indexOf);
            sb2.append(objArr2[i12]);
            i11 = indexOf + 2;
            i12++;
        }
        sb2.append((CharSequence) valueOf, i11, valueOf.length());
        if (i12 < objArr2.length) {
            sb2.append(" [");
            sb2.append(objArr2[i12]);
            for (int i13 = i12 + 1; i13 < objArr2.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr2[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static String m23689b(@NullableDecl Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception e10) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e10);
            return "<" + str + " threw " + e10.getClass().getName() + ">";
        }
    }

    /* renamed from: c */
    public static String m23690c(@NullableDecl String str) {
        return C4707j.m23658b(str);
    }
}
