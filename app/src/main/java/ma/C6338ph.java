package ma;

import java.util.Iterator;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ph.class
 */
/* renamed from: ma.ph */
/* loaded from: combined.jar:classes2.jar:ma/ph.class */
public final class C6338ph {
    /* renamed from: a */
    public static final int m29968a(int i10, Object obj, Object obj2) {
        C6317oh c6317oh = (C6317oh) obj;
        if (c6317oh.isEmpty()) {
            return 0;
        }
        Iterator it = c6317oh.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }
}
