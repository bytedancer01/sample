package ci;

import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;
import p448zh.C10240e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ci/q.class
 */
/* renamed from: ci.q */
/* loaded from: combined.jar:classes2.jar:ci/q.class */
public class C1131q extends C1130p {
    @NotNull
    /* renamed from: w0 */
    public static final String m6785w0(@NotNull String str, int i10) {
        C9367f.m39526e(str, "<this>");
        if (i10 >= 0) {
            String substring = str.substring(0, C10240e.m42836d(i10, str.length()));
            C9367f.m39525d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}
