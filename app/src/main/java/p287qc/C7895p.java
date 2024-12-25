package p287qc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qc/p.class
 */
/* renamed from: qc.p */
/* loaded from: combined.jar:classes2.jar:qc/p.class */
public class C7895p {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qc/p$b.class
     */
    /* renamed from: qc.p$b */
    /* loaded from: combined.jar:classes2.jar:qc/p$b.class */
    public static class b {

        /* renamed from: a */
        public final C7882d<?> f38010a;

        /* renamed from: b */
        public final Set<b> f38011b = new HashSet();

        /* renamed from: c */
        public final Set<b> f38012c = new HashSet();

        public b(C7882d<?> c7882d) {
            this.f38010a = c7882d;
        }

        /* renamed from: a */
        public void m34224a(b bVar) {
            this.f38011b.add(bVar);
        }

        /* renamed from: b */
        public void m34225b(b bVar) {
            this.f38012c.add(bVar);
        }

        /* renamed from: c */
        public C7882d<?> m34226c() {
            return this.f38010a;
        }

        /* renamed from: d */
        public Set<b> m34227d() {
            return this.f38011b;
        }

        /* renamed from: e */
        public boolean m34228e() {
            return this.f38011b.isEmpty();
        }

        /* renamed from: f */
        public boolean m34229f() {
            return this.f38012c.isEmpty();
        }

        /* renamed from: g */
        public void m34230g(b bVar) {
            this.f38012c.remove(bVar);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qc/p$c.class
     */
    /* renamed from: qc.p$c */
    /* loaded from: combined.jar:classes2.jar:qc/p$c.class */
    public static class c {

        /* renamed from: a */
        public final Class<?> f38013a;

        /* renamed from: b */
        public final boolean f38014b;

        public c(Class<?> cls, boolean z10) {
            this.f38013a = cls;
            this.f38014b = z10;
        }

        public boolean equals(Object obj) {
            boolean z10 = false;
            if (obj instanceof c) {
                c cVar = (c) obj;
                z10 = false;
                if (cVar.f38013a.equals(this.f38013a)) {
                    z10 = false;
                    if (cVar.f38014b == this.f38014b) {
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        public int hashCode() {
            return ((this.f38013a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f38014b).hashCode();
        }
    }

    /* renamed from: a */
    public static void m34221a(List<C7882d<?>> list) {
        Set<b> m34223c = m34223c(list);
        Set<b> m34222b = m34222b(m34223c);
        int i10 = 0;
        while (!m34222b.isEmpty()) {
            b next = m34222b.iterator().next();
            m34222b.remove(next);
            int i11 = i10 + 1;
            Iterator<b> it = next.m34227d().iterator();
            while (true) {
                i10 = i11;
                if (it.hasNext()) {
                    b next2 = it.next();
                    next2.m34230g(next);
                    if (next2.m34229f()) {
                        m34222b.add(next2);
                    }
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar : m34223c) {
            if (!bVar.m34229f() && !bVar.m34228e()) {
                arrayList.add(bVar.m34226c());
            }
        }
        throw new C7897r(arrayList);
    }

    /* renamed from: b */
    public static Set<b> m34222b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.m34229f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    public static Set<b> m34223c(List<C7882d<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        for (C7882d<?> c7882d : list) {
            b bVar = new b(c7882d);
            for (Class<? super Object> cls : c7882d.m34175e()) {
                c cVar = new c(cls, !c7882d.m34179k());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (!set2.isEmpty() && !cVar.f38014b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(bVar);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (b bVar2 : (Set) it.next()) {
                for (C7896q c7896q : bVar2.m34226c().m34173c()) {
                    if (c7896q.m34239d() && (set = (Set) hashMap.get(new c(c7896q.m34237b(), c7896q.m34241f()))) != null) {
                        for (b bVar3 : set) {
                            bVar2.m34224a(bVar3);
                            bVar3.m34225b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        return hashSet;
    }
}
