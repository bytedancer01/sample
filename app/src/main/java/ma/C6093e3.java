package ma;

import java.util.Iterator;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/e3.class
 */
/* renamed from: ma.e3 */
/* loaded from: combined.jar:classes2.jar:ma/e3.class */
public final class C6093e3 {
    /* renamed from: a */
    public static int m29562a(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (!it.hasNext()) {
                return i11;
            }
            Object next = it.next();
            i10 = i11 + (next != null ? next.hashCode() : 0);
        }
    }
}
