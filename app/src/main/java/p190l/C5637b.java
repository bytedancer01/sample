package p190l;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l/b.class
 */
/* renamed from: l.b */
/* loaded from: combined.jar:classes1.jar:l/b.class */
public class C5637b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b */
    public c<K, V> f31719b;

    /* renamed from: c */
    public c<K, V> f31720c;

    /* renamed from: d */
    public WeakHashMap<f<K, V>, Boolean> f31721d = new WeakHashMap<>();

    /* renamed from: e */
    public int f31722e = 0;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l/b$a.class
     */
    /* renamed from: l.b$a */
    /* loaded from: combined.jar:classes1.jar:l/b$a.class */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p190l.C5637b.e
        /* renamed from: b */
        public c<K, V> mo27815b(c<K, V> cVar) {
            return cVar.f31726e;
        }

        @Override // p190l.C5637b.e
        /* renamed from: c */
        public c<K, V> mo27816c(c<K, V> cVar) {
            return cVar.f31725d;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l/b$b.class
     */
    /* renamed from: l.b$b */
    /* loaded from: combined.jar:classes1.jar:l/b$b.class */
    public static class b<K, V> extends e<K, V> {
        public b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p190l.C5637b.e
        /* renamed from: b */
        public c<K, V> mo27815b(c<K, V> cVar) {
            return cVar.f31725d;
        }

        @Override // p190l.C5637b.e
        /* renamed from: c */
        public c<K, V> mo27816c(c<K, V> cVar) {
            return cVar.f31726e;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l/b$c.class
     */
    /* renamed from: l.b$c */
    /* loaded from: combined.jar:classes1.jar:l/b$c.class */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        public final K f31723b;

        /* renamed from: c */
        public final V f31724c;

        /* renamed from: d */
        public c<K, V> f31725d;

        /* renamed from: e */
        public c<K, V> f31726e;

        public c(K k10, V v10) {
            this.f31723b = k10;
            this.f31724c = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f31723b.equals(cVar.f31723b) || !this.f31724c.equals(cVar.f31724c)) {
                z10 = false;
            }
            return z10;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f31723b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f31724c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f31723b.hashCode() ^ this.f31724c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f31723b + "=" + this.f31724c;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l/b$d.class
     */
    /* renamed from: l.b$d */
    /* loaded from: combined.jar:classes1.jar:l/b$d.class */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b */
        public c<K, V> f31727b;

        /* renamed from: c */
        public boolean f31728c = true;

        /* renamed from: d */
        public final C5637b f31729d;

        public d(C5637b c5637b) {
            this.f31729d = c5637b;
        }

        @Override // p190l.C5637b.f
        /* renamed from: a */
        public void mo27817a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f31727b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f31726e;
                this.f31727b = cVar3;
                this.f31728c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f31728c) {
                this.f31728c = false;
                cVar = this.f31729d.f31719b;
            } else {
                c<K, V> cVar2 = this.f31727b;
                cVar = cVar2 != null ? cVar2.f31725d : null;
            }
            this.f31727b = cVar;
            return this.f31727b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            boolean z10 = true;
            if (this.f31728c) {
                return this.f31729d.f31719b != null;
            }
            c<K, V> cVar = this.f31727b;
            if (cVar == null || cVar.f31725d == null) {
                z10 = false;
            }
            return z10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l/b$e.class
     */
    /* renamed from: l.b$e */
    /* loaded from: combined.jar:classes1.jar:l/b$e.class */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b */
        public c<K, V> f31730b;

        /* renamed from: c */
        public c<K, V> f31731c;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f31730b = cVar2;
            this.f31731c = cVar;
        }

        @Override // p190l.C5637b.f
        /* renamed from: a */
        public void mo27817a(c<K, V> cVar) {
            if (this.f31730b == cVar && cVar == this.f31731c) {
                this.f31731c = null;
                this.f31730b = null;
            }
            c<K, V> cVar2 = this.f31730b;
            if (cVar2 == cVar) {
                this.f31730b = mo27815b(cVar2);
            }
            if (this.f31731c == cVar) {
                this.f31731c = m27820e();
            }
        }

        /* renamed from: b */
        public abstract c<K, V> mo27815b(c<K, V> cVar);

        /* renamed from: c */
        public abstract c<K, V> mo27816c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f31731c;
            this.f31731c = m27820e();
            return cVar;
        }

        /* renamed from: e */
        public final c<K, V> m27820e() {
            c<K, V> cVar = this.f31731c;
            c<K, V> cVar2 = this.f31730b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo27816c(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31731c != null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l/b$f.class
     */
    /* renamed from: l.b$f */
    /* loaded from: combined.jar:classes1.jar:l/b$f.class */
    public interface f<K, V> {
        /* renamed from: a */
        void mo27817a(c<K, V> cVar);
    }

    /* renamed from: d */
    public Map.Entry<K, V> m27811d() {
        return this.f31719b;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        b bVar = new b(this.f31720c, this.f31719b);
        this.f31721d.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* renamed from: e */
    public c<K, V> mo27807e(K k10) {
        c<K, V> cVar;
        c<K, V> cVar2 = this.f31719b;
        while (true) {
            cVar = cVar2;
            if (cVar == null || cVar.f31723b.equals(k10)) {
                break;
            }
            cVar2 = cVar.f31725d;
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5637b)) {
            return false;
        }
        C5637b c5637b = (C5637b) obj;
        if (size() != c5637b.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c5637b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if (next == null && next2 != null) {
                return false;
            }
            if (next != null && !next.equals(next2)) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: f */
    public C5637b<K, V>.d m27812f() {
        C5637b<K, V>.d dVar = new d(this);
        this.f31721d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* renamed from: g */
    public Map.Entry<K, V> m27813g() {
        return this.f31720c;
    }

    /* renamed from: h */
    public c<K, V> m27814h(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f31722e++;
        c<K, V> cVar2 = this.f31720c;
        if (cVar2 == null) {
            this.f31719b = cVar;
        } else {
            cVar2.f31725d = cVar;
            cVar.f31726e = cVar2;
        }
        this.f31720c = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (!it.hasNext()) {
                return i11;
            }
            i10 = i11 + it.next().hashCode();
        }
    }

    /* renamed from: i */
    public V mo27808i(K k10, V v10) {
        c<K, V> mo27807e = mo27807e(k10);
        if (mo27807e != null) {
            return mo27807e.f31724c;
        }
        m27814h(k10, v10);
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f31719b, this.f31720c);
        this.f31721d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* renamed from: q */
    public V mo27809q(K k10) {
        c<K, V> mo27807e = mo27807e(k10);
        if (mo27807e == null) {
            return null;
        }
        this.f31722e--;
        if (!this.f31721d.isEmpty()) {
            Iterator<f<K, V>> it = this.f31721d.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo27817a(mo27807e);
            }
        }
        c<K, V> cVar = mo27807e.f31726e;
        c<K, V> cVar2 = mo27807e.f31725d;
        if (cVar != null) {
            cVar.f31725d = cVar2;
        } else {
            this.f31719b = cVar2;
        }
        c<K, V> cVar3 = mo27807e.f31725d;
        if (cVar3 != null) {
            cVar3.f31726e = cVar;
        } else {
            this.f31720c = cVar;
        }
        mo27807e.f31725d = null;
        mo27807e.f31726e = null;
        return mo27807e.f31724c;
    }

    public int size() {
        return this.f31722e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
