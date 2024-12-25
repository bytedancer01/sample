package p033c3;

import java.util.Iterator;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c3/f.class
 */
/* renamed from: c3.f */
/* loaded from: combined.jar:classes1.jar:c3/f.class */
public final class C0986f {
    /* renamed from: a */
    public static <E> boolean m5890a(Set<E> set, Set<E> set2) {
        if (set == null || set2 == null) {
            return true;
        }
        Set<E> set3 = set;
        Set<E> set4 = set2;
        if (set.size() > set2.size()) {
            set4 = set;
            set3 = set2;
        }
        Iterator<E> it = set3.iterator();
        while (it.hasNext()) {
            if (set4.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static <T> T m5891b(T t10) {
        t10.getClass();
        return t10;
    }

    /* renamed from: c */
    public static <T> T m5892c(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
