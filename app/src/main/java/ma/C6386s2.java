package ma;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/s2.class
 */
/* renamed from: ma.s2 */
/* loaded from: combined.jar:classes2.jar:ma/s2.class */
public final class C6386s2 {

    /* renamed from: a */
    public Object[] f34007a;

    /* renamed from: b */
    public int f34008b = 0;

    /* renamed from: c */
    public C6365r2 f34009c;

    public C6386s2(int i10) {
        this.f34007a = new Object[i10 + i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final C6386s2 m30000a(Iterable iterable) {
        if (iterable instanceof Collection) {
            m30001b(this.f34008b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            m30001b(this.f34008b + 1);
            C6134g2.m29619a(key, value);
            Object[] objArr = this.f34007a;
            int i10 = this.f34008b;
            int i11 = i10 + i10;
            objArr[i11] = key;
            objArr[i11 + 1] = value;
            this.f34008b = i10 + 1;
        }
        return this;
    }

    /* renamed from: b */
    public final void m30001b(int i10) {
        Object[] objArr = this.f34007a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.f34007a = Arrays.copyOf(objArr, C6239l2.m29828a(length, i11));
        }
    }
}
