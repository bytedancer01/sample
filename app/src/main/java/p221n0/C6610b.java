package p221n0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n0/b.class
 */
/* renamed from: n0.b */
/* loaded from: combined.jar:classes1.jar:n0/b.class */
public class C6610b {
    /* renamed from: a */
    public static void m30515a(Object obj, StringBuilder sb2) {
        String hexString;
        if (obj == null) {
            hexString = "null";
        } else {
            String simpleName = obj.getClass().getSimpleName();
            String str = simpleName;
            if (simpleName.length() <= 0) {
                String name = obj.getClass().getName();
                int lastIndexOf = name.lastIndexOf(46);
                str = name;
                if (lastIndexOf > 0) {
                    str = name.substring(lastIndexOf + 1);
                }
            }
            sb2.append(str);
            sb2.append('{');
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb2.append(hexString);
    }
}
