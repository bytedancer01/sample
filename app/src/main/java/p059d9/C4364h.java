package p059d9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/h.class
 */
/* renamed from: d9.h */
/* loaded from: combined.jar:classes2.jar:d9/h.class */
public final class C4364h<E> implements Iterable<E> {

    /* renamed from: b */
    public final Object f26574b = new Object();

    /* renamed from: c */
    public final Map<E, Integer> f26575c = new HashMap();

    /* renamed from: d */
    public Set<E> f26576d = Collections.emptySet();

    /* renamed from: e */
    public List<E> f26577e = Collections.emptyList();

    /* renamed from: C */
    public Set<E> m22023C() {
        Set<E> set;
        synchronized (this.f26574b) {
            set = this.f26576d;
        }
        return set;
    }

    /* renamed from: a */
    public void m22024a(E e10) {
        synchronized (this.f26574b) {
            ArrayList arrayList = new ArrayList(this.f26577e);
            arrayList.add(e10);
            this.f26577e = Collections.unmodifiableList(arrayList);
            Integer num = this.f26575c.get(e10);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f26576d);
                hashSet.add(e10);
                this.f26576d = Collections.unmodifiableSet(hashSet);
            }
            Map<E, Integer> map = this.f26575c;
            int i10 = 1;
            if (num != null) {
                i10 = 1 + num.intValue();
            }
            map.put(e10, Integer.valueOf(i10));
        }
    }

    /* renamed from: b */
    public int m22025b(E e10) {
        int intValue;
        synchronized (this.f26574b) {
            intValue = this.f26575c.containsKey(e10) ? this.f26575c.get(e10).intValue() : 0;
        }
        return intValue;
    }

    /* renamed from: d */
    public void m22026d(E e10) {
        synchronized (this.f26574b) {
            Integer num = this.f26575c.get(e10);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f26577e);
            arrayList.remove(e10);
            this.f26577e = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f26575c.remove(e10);
                HashSet hashSet = new HashSet(this.f26576d);
                hashSet.remove(e10);
                this.f26576d = Collections.unmodifiableSet(hashSet);
            } else {
                this.f26575c.put(e10, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f26574b) {
            it = this.f26577e.iterator();
        }
        return it;
    }
}
