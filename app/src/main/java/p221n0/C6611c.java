package p221n0;

import java.util.Objects;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n0/c.class
 */
/* renamed from: n0.c */
/* loaded from: combined.jar:classes1.jar:n0/c.class */
public class C6611c {
    /* renamed from: a */
    public static boolean m30516a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    /* renamed from: b */
    public static int m30517b(Object... objArr) {
        return Objects.hash(objArr);
    }

    /* renamed from: c */
    public static String m30518c(Object obj, String str) {
        if (obj != null) {
            str = obj.toString();
        }
        return str;
    }
}
