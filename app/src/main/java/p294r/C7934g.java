package p294r;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:r/g.class
 */
/* renamed from: r.g */
/* loaded from: combined.jar:classes1.jar:r/g.class */
public class C7934g<K, V> {

    /* renamed from: a */
    public final LinkedHashMap<K, V> f38168a;

    /* renamed from: b */
    public int f38169b;

    /* renamed from: c */
    public int f38170c;

    /* renamed from: d */
    public int f38171d;

    /* renamed from: e */
    public int f38172e;

    /* renamed from: f */
    public int f38173f;

    /* renamed from: g */
    public int f38174g;

    /* renamed from: h */
    public int f38175h;

    public C7934g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f38170c = i10;
        this.f38168a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* renamed from: a */
    public V m34408a(K k10) {
        return null;
    }

    /* renamed from: b */
    public void m34409b(boolean z10, K k10, V v10, V v11) {
    }

    /* renamed from: c */
    public final void m34410c() {
        m34419l(-1);
    }

    /* renamed from: d */
    public final V m34411d(K k10) {
        V v10;
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v11 = this.f38168a.get(k10);
            if (v11 != null) {
                this.f38174g++;
                return v11;
            }
            this.f38175h++;
            V m34408a = m34408a(k10);
            if (m34408a == null) {
                return null;
            }
            synchronized (this) {
                this.f38172e++;
                v10 = (V) this.f38168a.put(k10, m34408a);
                if (v10 != null) {
                    this.f38168a.put(k10, v10);
                } else {
                    this.f38169b += m34415h(k10, m34408a);
                }
            }
            if (v10 != null) {
                m34409b(false, k10, m34408a, v10);
                return v10;
            }
            m34419l(this.f38170c);
            return m34408a;
        }
    }

    /* renamed from: e */
    public final int m34412e() {
        int i10;
        synchronized (this) {
            i10 = this.f38170c;
        }
        return i10;
    }

    /* renamed from: f */
    public final V m34413f(K k10, V v10) {
        V put;
        if (k10 == null || v10 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f38171d++;
            this.f38169b += m34415h(k10, v10);
            put = this.f38168a.put(k10, v10);
            if (put != null) {
                this.f38169b -= m34415h(k10, put);
            }
        }
        if (put != null) {
            m34409b(false, k10, put, v10);
        }
        m34419l(this.f38170c);
        return put;
    }

    /* renamed from: g */
    public final V m34414g(K k10) {
        V remove;
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            remove = this.f38168a.remove(k10);
            if (remove != null) {
                this.f38169b -= m34415h(k10, remove);
            }
        }
        if (remove != null) {
            m34409b(false, k10, remove, null);
        }
        return remove;
    }

    /* renamed from: h */
    public final int m34415h(K k10, V v10) {
        int m34417j = m34417j(k10, v10);
        if (m34417j >= 0) {
            return m34417j;
        }
        throw new IllegalStateException("Negative size: " + k10 + "=" + v10);
    }

    /* renamed from: i */
    public final int m34416i() {
        int i10;
        synchronized (this) {
            i10 = this.f38169b;
        }
        return i10;
    }

    /* renamed from: j */
    public int m34417j(K k10, V v10) {
        return 1;
    }

    /* renamed from: k */
    public final Map<K, V> m34418k() {
        LinkedHashMap linkedHashMap;
        synchronized (this) {
            linkedHashMap = new LinkedHashMap(this.f38168a);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ac, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m34419l(int r7) {
        /*
            r6 = this;
        L0:
            r0 = r6
            monitor-enter(r0)
            r0 = r6
            int r0 = r0.f38169b     // Catch: java.lang.Throwable -> Lad
            if (r0 < 0) goto L84
            r0 = r6
            java.util.LinkedHashMap<K, V> r0 = r0.f38168a     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L1a
            r0 = r6
            int r0 = r0.f38169b     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto L84
        L1a:
            r0 = r6
            int r0 = r0.f38169b     // Catch: java.lang.Throwable -> Lad
            r1 = r7
            if (r0 <= r1) goto L81
            r0 = r6
            java.util.LinkedHashMap<K, V> r0 = r0.f38168a     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L2f
            goto L81
        L2f:
            r0 = r6
            java.util.LinkedHashMap<K, V> r0 = r0.f38168a     // Catch: java.lang.Throwable -> Lad
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> Lad
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> Lad
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> Lad
            r9 = r0
            r0 = r9
            java.lang.Object r0 = r0.getKey()     // Catch: java.lang.Throwable -> Lad
            r8 = r0
            r0 = r9
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Lad
            r9 = r0
            r0 = r6
            java.util.LinkedHashMap<K, V> r0 = r0.f38168a     // Catch: java.lang.Throwable -> Lad
            r1 = r8
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> Lad
            r0 = r6
            r1 = r6
            int r1 = r1.f38169b     // Catch: java.lang.Throwable -> Lad
            r2 = r6
            r3 = r8
            r4 = r9
            int r2 = r2.m34415h(r3, r4)     // Catch: java.lang.Throwable -> Lad
            int r1 = r1 - r2
            r0.f38169b = r1     // Catch: java.lang.Throwable -> Lad
            r0 = r6
            r1 = r6
            int r1 = r1.f38173f     // Catch: java.lang.Throwable -> Lad
            r2 = 1
            int r1 = r1 + r2
            r0.f38173f = r1     // Catch: java.lang.Throwable -> Lad
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lad
            r0 = r6
            r1 = 1
            r2 = r8
            r3 = r9
            r4 = 0
            r0.m34409b(r1, r2, r3, r4)
            goto L0
        L81:
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lad
            return
        L84:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lad
            r8 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad
            r9 = r0
            r0 = r9
            r0.<init>()     // Catch: java.lang.Throwable -> Lad
            r0 = r9
            r1 = r6
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> Lad
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> Lad
            r0 = r9
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> Lad
            r0 = r8
            r1 = r9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lad
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lad
            r0 = r8
            throw r0     // Catch: java.lang.Throwable -> Lad
        Lad:
            r8 = move-exception
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lad
            r0 = r8
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p294r.C7934g.m34419l(int):void");
    }

    public final String toString() {
        String format;
        synchronized (this) {
            int i10 = this.f38174g;
            int i11 = this.f38175h + i10;
            format = String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f38170c), Integer.valueOf(this.f38174g), Integer.valueOf(this.f38175h), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
        }
        return format;
    }
}
