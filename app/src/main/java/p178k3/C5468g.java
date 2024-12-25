package p178k3;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import p072e3.C4598d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k3/g.class
 */
/* renamed from: k3.g */
/* loaded from: combined.jar:classes1.jar:k3/g.class */
public final class C5468g {
    /* renamed from: a */
    public static int m27268a(Object obj, Object obj2) {
        return m27269b(obj) - m27269b(obj2);
    }

    /* renamed from: b */
    public static int m27269b(Object obj) {
        int i10 = 16;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i10 += m27269b(it.next());
            }
            return i10;
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes().length;
        }
        if (obj instanceof Boolean) {
            return 16;
        }
        if (obj instanceof BigDecimal) {
            return 32;
        }
        if (obj instanceof C4598d) {
            return ((C4598d) obj).m23184c().getBytes().length + 16;
        }
        if (obj == null) {
            return 4;
        }
        throw new IllegalStateException("Unknown field type in Record. " + obj.getClass().getName());
    }
}
