package p305ra;

import java.util.Iterator;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/l7.class
 */
/* renamed from: ra.l7 */
/* loaded from: combined.jar:classes2.jar:ra/l7.class */
public final class C8232l7 {
    /* renamed from: a */
    public static final int m35591a(int i10, Object obj, Object obj2) {
        C8217k7 c8217k7 = (C8217k7) obj;
        if (c8217k7.isEmpty()) {
            return 0;
        }
        Iterator it = c8217k7.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final Object m35592b(Object obj, Object obj2) {
        C8217k7 c8217k7 = (C8217k7) obj;
        C8217k7 c8217k72 = (C8217k7) obj2;
        C8217k7 c8217k73 = c8217k7;
        if (!c8217k72.isEmpty()) {
            c8217k73 = c8217k7;
            if (!c8217k7.m35535g()) {
                c8217k73 = c8217k7.m35533d();
            }
            c8217k73.m35532c(c8217k72);
        }
        return c8217k73;
    }
}
