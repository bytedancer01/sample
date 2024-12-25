package p099fc;

import ec.C4705h;
import ec.C4708k;
import ec.InterfaceC4703f;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p099fc.C4833s0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/d0.class
 */
/* renamed from: fc.d0 */
/* loaded from: combined.jar:classes2.jar:fc/d0.class */
public final class C4803d0 {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/d0$a.class
     */
    /* renamed from: fc.d0$a */
    /* loaded from: combined.jar:classes2.jar:fc/d0$a.class */
    public static final class a<K, V> extends AbstractC4837u0<Map.Entry<K, V>, V> {
        public a(Iterator it) {
            super(it);
        }

        @Override // p099fc.AbstractC4837u0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public V mo24371a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/d0$b.class
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: fc.d0$b */
    /* loaded from: combined.jar:classes2.jar:fc/d0$b.class */
    public static abstract class b implements InterfaceC4703f<Map.Entry<?, ?>, Object> {
        private static final b[] $VALUES;
        public static final b KEY;
        public static final b VALUE;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:fc/d0$b$a.class
         */
        /* renamed from: fc.d0$b$a */
        /* loaded from: combined.jar:classes2.jar:fc/d0$b$a.class */
        public enum a extends b {
            public a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // p099fc.C4803d0.b, ec.InterfaceC4703f
            @NullableDecl
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:fc/d0$b$b.class
         */
        /* renamed from: fc.d0$b$b, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:fc/d0$b$b.class */
        public enum C10291b extends b {
            public C10291b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // p099fc.C4803d0.b, ec.InterfaceC4703f
            @NullableDecl
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        static {
            a aVar = new a("KEY", 0);
            KEY = aVar;
            C10291b c10291b = new C10291b("VALUE", 1);
            VALUE = c10291b;
            $VALUES = new b[]{aVar, c10291b};
        }

        private b(String str, int i10) {
        }

        public /* synthetic */ b(String str, int i10, C4801c0 c4801c0) {
            this(str, i10);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        @Override // ec.InterfaceC4703f
        @NullableDecl
        public abstract /* synthetic */ Object apply(@NullableDecl Map.Entry<?, ?> entry);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/d0$c.class
     */
    /* renamed from: fc.d0$c */
    /* loaded from: combined.jar:classes2.jar:fc/d0$c.class */
    public static abstract class c<K, V> extends C4833s0.b<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo24332d().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        /* renamed from: d */
        public abstract Map<K, V> mo24332d();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo24332d().isEmpty();
        }

        @Override // p099fc.C4833s0.b, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C4708k.m23668j(collection));
            } catch (UnsupportedOperationException e10) {
                return C4833s0.m24536h(this, collection.iterator());
            }
        }

        @Override // p099fc.C4833s0.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C4708k.m23668j(collection));
            } catch (UnsupportedOperationException e10) {
                HashSet m24533e = C4833s0.m24533e(collection.size());
                for (Object obj : collection) {
                    if (contains(obj)) {
                        m24533e.add(((Map.Entry) obj).getKey());
                    }
                }
                return mo24332d().keySet().retainAll(m24533e);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo24332d().size();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/d0$d.class
     */
    /* renamed from: fc.d0$d */
    /* loaded from: combined.jar:classes2.jar:fc/d0$d.class */
    public static class d<K, V> extends C4833s0.b<K> {

        /* renamed from: b */
        public final Map<K, V> f28298b;

        public d(Map<K, V> map) {
            this.f28298b = (Map) C4708k.m23668j(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return m24373d().containsKey(obj);
        }

        /* renamed from: d */
        public Map<K, V> m24373d() {
            return this.f28298b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return m24373d().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return m24373d().size();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/d0$e.class
     */
    /* renamed from: fc.d0$e */
    /* loaded from: combined.jar:classes2.jar:fc/d0$e.class */
    public static class e<K, V> extends AbstractCollection<V> {

        /* renamed from: b */
        public final Map<K, V> f28299b;

        public e(Map<K, V> map) {
            this.f28299b = (Map) C4708k.m23668j(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            m24374d().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return m24374d().containsValue(obj);
        }

        /* renamed from: d */
        public final Map<K, V> m24374d() {
            return this.f28299b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return m24374d().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return C4803d0.m24370m(m24374d().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException e10) {
                for (Map.Entry<K, V> entry : m24374d().entrySet()) {
                    if (C4705h.m23655a(obj, entry.getValue())) {
                        m24374d().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C4708k.m23668j(collection));
            } catch (UnsupportedOperationException e10) {
                HashSet m24532d = C4833s0.m24532d();
                for (Map.Entry<K, V> entry : m24374d().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        m24532d.add(entry.getKey());
                    }
                }
                return m24374d().keySet().removeAll(m24532d);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C4708k.m23668j(collection));
            } catch (UnsupportedOperationException e10) {
                HashSet m24532d = C4833s0.m24532d();
                for (Map.Entry<K, V> entry : m24374d().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        m24532d.add(entry.getKey());
                    }
                }
                return m24374d().keySet().retainAll(m24532d);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return m24374d().size();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/d0$f.class
     */
    /* renamed from: fc.d0$f */
    /* loaded from: combined.jar:classes2.jar:fc/d0$f.class */
    public static abstract class f<K, V> extends AbstractMap<K, V> {

        /* renamed from: b */
        @MonotonicNonNullDecl
        public transient Set<Map.Entry<K, V>> f28300b;

        /* renamed from: c */
        @MonotonicNonNullDecl
        public transient Collection<V> f28301c;

        /* renamed from: b */
        public abstract Set<Map.Entry<K, V>> mo24328b();

        /* renamed from: c */
        public Collection<V> m24375c() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f28300b;
            Set<Map.Entry<K, V>> set2 = set;
            if (set == null) {
                set2 = mo24328b();
                this.f28300b = set2;
            }
            return set2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f28301c;
            Collection<V> collection2 = collection;
            if (collection == null) {
                collection2 = m24375c();
                this.f28301c = collection2;
            }
            return collection2;
        }
    }

    /* renamed from: a */
    public static int m24358a(int i10) {
        if (i10 < 3) {
            C4814j.m24399b(i10, "expectedSize");
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static boolean m24359b(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: c */
    public static <K, V> Map.Entry<K, V> m24360c(@NullableDecl K k10, @NullableDecl V v10) {
        return new C4832s(k10, v10);
    }

    /* renamed from: d */
    public static <K> InterfaceC4703f<Map.Entry<K, ?>, K> m24361d() {
        return b.KEY;
    }

    /* renamed from: e */
    public static <K, V> HashMap<K, V> m24362e() {
        return new HashMap<>();
    }

    /* renamed from: f */
    public static <K, V> IdentityHashMap<K, V> m24363f() {
        return new IdentityHashMap<>();
    }

    /* renamed from: g */
    public static <K, V> LinkedHashMap<K, V> m24364g() {
        return new LinkedHashMap<>();
    }

    /* renamed from: h */
    public static boolean m24365h(Map<?, ?> map, Object obj) {
        C4708k.m23668j(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException e10) {
            return false;
        }
    }

    /* renamed from: i */
    public static <V> V m24366i(Map<?, V> map, @NullableDecl Object obj) {
        C4708k.m23668j(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException e10) {
            return null;
        }
    }

    /* renamed from: j */
    public static <V> V m24367j(Map<?, V> map, Object obj) {
        C4708k.m23668j(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException e10) {
            return null;
        }
    }

    /* renamed from: k */
    public static String m24368k(Map<?, ?> map) {
        StringBuilder m24406b = C4816k.m24406b(map.size());
        m24406b.append('{');
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                m24406b.append(", ");
            }
            z10 = false;
            m24406b.append(entry.getKey());
            m24406b.append('=');
            m24406b.append(entry.getValue());
        }
        m24406b.append('}');
        return m24406b.toString();
    }

    /* renamed from: l */
    public static <V> InterfaceC4703f<Map.Entry<?, V>, V> m24369l() {
        return b.VALUE;
    }

    /* renamed from: m */
    public static <K, V> Iterator<V> m24370m(Iterator<Map.Entry<K, V>> it) {
        return new a(it);
    }
}
