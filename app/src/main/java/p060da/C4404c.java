package p060da;

import android.util.Base64;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:da/c.class
 */
/* renamed from: da.c */
/* loaded from: combined.jar:classes2.jar:da/c.class */
public final class C4404c {
    /* renamed from: a */
    public static String m22430a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
