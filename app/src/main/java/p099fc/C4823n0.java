package p099fc;

import ec.C4708k;
import java.util.AbstractMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/n0.class
 */
/* renamed from: fc.n0 */
/* loaded from: combined.jar:classes2.jar:fc/n0.class */
public final class C4823n0<K, V> extends AbstractC4838v<K, V> {

    /* renamed from: i */
    public static final AbstractC4838v<Object, Object> f28349i = new C4823n0(null, new Object[0], 0);

    /* renamed from: f */
    public final transient int[] f28350f;

    /* renamed from: g */
    public final transient Object[] f28351g;

    /* renamed from: h */
    public final transient int f28352h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/n0$a.class
     */
    /* renamed from: fc.n0$a */
    /* loaded from: combined.jar:classes2.jar:fc/n0$a.class */
    public static class a<K, V> extends AbstractC4842x<Map.Entry<K, V>> {

        /* renamed from: d */
        public final transient AbstractC4838v<K, V> f28353d;

        /* renamed from: e */
        public final transient Object[] f28354e;

        /* renamed from: f */
        public final transient int f28355f;

        /* renamed from: g */
        public final transient int f28356g;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:fc/n0$a$a.class
         */
        /* renamed from: fc.n0$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:fc/n0$a$a.class */
        public class C10292a extends AbstractC4834t<Map.Entry<K, V>> {

            /* renamed from: d */
            public final a f28357d;

            public C10292a(a aVar) {
                this.f28357d = aVar;
            }

            @Override // java.util.List
            /* renamed from: N, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i10) {
                C4708k.m23666h(i10, this.f28357d.f28356g);
                int i11 = i10 * 2;
                return new AbstractMap.SimpleImmutableEntry(this.f28357d.f28354e[this.f28357d.f28355f + i11], this.f28357d.f28354e[i11 + (this.f28357d.f28355f ^ 1)]);
            }

            @Override // p099fc.AbstractC4830r
            /* renamed from: q */
            public boolean mo24455q() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.f28357d.f28356g;
            }
        }

        public a(AbstractC4838v<K, V> abstractC4838v, Object[] objArr, int i10, int i11) {
            this.f28353d = abstractC4838v;
            this.f28354e = objArr;
            this.f28355f = i10;
            this.f28356g = i11;
        }

        @Override // p099fc.AbstractC4842x
        /* renamed from: A */
        public AbstractC4834t<Map.Entry<K, V>> mo24477A() {
            return new C10292a(this);
        }

        @Override // p099fc.AbstractC4830r, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            boolean z10 = false;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                z10 = false;
                if (value != null) {
                    z10 = false;
                    if (value.equals(this.f28353d.get(key))) {
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        @Override // p099fc.AbstractC4830r
        /* renamed from: e */
        public int mo24451e(Object[] objArr, int i10) {
            return mo24480d().mo24451e(objArr, i10);
        }

        @Override // p099fc.AbstractC4830r
        /* renamed from: q */
        public boolean mo24455q() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f28356g;
        }

        @Override // p099fc.AbstractC4842x, p099fc.AbstractC4830r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: t */
        public AbstractC4841w0<Map.Entry<K, V>> iterator() {
            return mo24480d().iterator();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/n0$b.class
     */
    /* renamed from: fc.n0$b */
    /* loaded from: combined.jar:classes2.jar:fc/n0$b.class */
    public static final class b<K> extends AbstractC4842x<K> {

        /* renamed from: d */
        public final transient AbstractC4838v<K, ?> f28358d;

        /* renamed from: e */
        public final transient AbstractC4834t<K> f28359e;

        public b(AbstractC4838v<K, ?> abstractC4838v, AbstractC4834t<K> abstractC4834t) {
            this.f28358d = abstractC4838v;
            this.f28359e = abstractC4834t;
        }

        @Override // p099fc.AbstractC4830r, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return this.f28358d.get(obj) != null;
        }

        @Override // p099fc.AbstractC4842x, p099fc.AbstractC4830r
        /* renamed from: d */
        public AbstractC4834t<K> mo24480d() {
            return this.f28359e;
        }

        @Override // p099fc.AbstractC4830r
        /* renamed from: e */
        public int mo24451e(Object[] objArr, int i10) {
            return mo24480d().mo24451e(objArr, i10);
        }

        @Override // p099fc.AbstractC4830r
        /* renamed from: q */
        public boolean mo24455q() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f28358d.size();
        }

        @Override // p099fc.AbstractC4842x, p099fc.AbstractC4830r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: t */
        public AbstractC4841w0<K> iterator() {
            return mo24480d().iterator();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/n0$c.class
     */
    /* renamed from: fc.n0$c */
    /* loaded from: combined.jar:classes2.jar:fc/n0$c.class */
    public static final class c extends AbstractC4834t<Object> {

        /* renamed from: d */
        public final transient Object[] f28360d;

        /* renamed from: e */
        public final transient int f28361e;

        /* renamed from: f */
        public final transient int f28362f;

        public c(Object[] objArr, int i10, int i11) {
            this.f28360d = objArr;
            this.f28361e = i10;
            this.f28362f = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            C4708k.m23666h(i10, this.f28362f);
            return this.f28360d[(i10 * 2) + this.f28361e];
        }

        @Override // p099fc.AbstractC4830r
        /* renamed from: q */
        public boolean mo24455q() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f28362f;
        }
    }

    public C4823n0(int[] iArr, Object[] objArr, int i10) {
        this.f28350f = iArr;
        this.f28351g = objArr;
        this.f28352h = i10;
    }

    /* renamed from: n */
    public static <K, V> C4823n0<K, V> m24467n(int i10, Object[] objArr) {
        if (i10 == 0) {
            return (C4823n0) f28349i;
        }
        if (i10 == 1) {
            C4814j.m24398a(objArr[0], objArr[1]);
            return new C4823n0<>(null, objArr, 1);
        }
        C4708k.m23670l(i10, objArr.length >> 1);
        return new C4823n0<>(m24468o(objArr, i10, AbstractC4842x.m24597v(i10), 0), objArr, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        r0[r0] = r0;
        r9 = r9 + 1;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] m24468o(java.lang.Object[] r5, int r6, int r7, int r8) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p099fc.C4823n0.m24468o(java.lang.Object[], int, int, int):int[]");
    }

    /* renamed from: p */
    public static Object m24469p(@NullableDecl int[] iArr, @NullableDecl Object[] objArr, int i10, int i11, @NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj2 = null;
            if (objArr[i11].equals(obj)) {
                obj2 = objArr[i11 ^ 1];
            }
            return obj2;
        }
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        int m24524b = C4828q.m24524b(obj.hashCode());
        while (true) {
            int i12 = m24524b & (length - 1);
            int i13 = iArr[i12];
            if (i13 == -1) {
                return null;
            }
            if (objArr[i13].equals(obj)) {
                return objArr[i13 ^ 1];
            }
            m24524b = i12 + 1;
        }
    }

    @Override // p099fc.AbstractC4838v
    /* renamed from: e */
    public AbstractC4842x<Map.Entry<K, V>> mo24470e() {
        return new a(this, this.f28351g, 0, this.f28352h);
    }

    @Override // p099fc.AbstractC4838v
    /* renamed from: f */
    public AbstractC4842x<K> mo24471f() {
        return new b(this, new c(this.f28351g, 0, this.f28352h));
    }

    @Override // p099fc.AbstractC4838v
    /* renamed from: g */
    public AbstractC4830r<V> mo24472g() {
        return new c(this.f28351g, 1, this.f28352h);
    }

    @Override // p099fc.AbstractC4838v, java.util.Map
    @NullableDecl
    public V get(@NullableDecl Object obj) {
        return (V) m24469p(this.f28350f, this.f28351g, this.f28352h, 0, obj);
    }

    @Override // p099fc.AbstractC4838v
    /* renamed from: i */
    public boolean mo24473i() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f28352h;
    }
}
