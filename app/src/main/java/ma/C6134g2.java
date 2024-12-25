package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/g2.class
 */
/* renamed from: ma.g2 */
/* loaded from: combined.jar:classes2.jar:ma/g2.class */
public final class C6134g2 {
    /* renamed from: a */
    public static void m29619a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj.toString() + "=null");
    }
}
