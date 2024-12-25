package ci;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ci/b.class
 */
/* renamed from: ci.b */
/* loaded from: combined.jar:classes2.jar:ci/b.class */
public class C1116b extends C1115a {
    /* renamed from: d */
    public static final boolean m6694d(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        boolean z11 = true;
        if (upperCase != upperCase2) {
            z11 = Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }
        return z11;
    }
}
