package p287qc;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qc/d.class
 */
/* renamed from: qc.d */
/* loaded from: combined.jar:classes2.jar:qc/d.class */
public final class C7882d<T> {

    /* renamed from: a */
    public final Set<Class<? super T>> f37967a;

    /* renamed from: b */
    public final Set<C7896q> f37968b;

    /* renamed from: c */
    public final int f37969c;

    /* renamed from: d */
    public final int f37970d;

    /* renamed from: e */
    public final InterfaceC7887h<T> f37971e;

    /* renamed from: f */
    public final Set<Class<?>> f37972f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qc/d$b.class
     */
    /* renamed from: qc.d$b */
    /* loaded from: combined.jar:classes2.jar:qc/d$b.class */
    public static class b<T> {

        /* renamed from: a */
        public final Set<Class<? super T>> f37973a;

        /* renamed from: b */
        public final Set<C7896q> f37974b;

        /* renamed from: c */
        public int f37975c;

        /* renamed from: d */
        public int f37976d;

        /* renamed from: e */
        public InterfaceC7887h<T> f37977e;

        /* renamed from: f */
        public Set<Class<?>> f37978f;

        @SafeVarargs
        public b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.f37973a = hashSet;
            this.f37974b = new HashSet();
            this.f37975c = 0;
            this.f37976d = 0;
            this.f37978f = new HashSet();
            C7881c0.m34164c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                C7881c0.m34164c(cls2, "Null interface");
            }
            Collections.addAll(this.f37973a, clsArr);
        }

        /* renamed from: b */
        public b<T> m34181b(C7896q c7896q) {
            C7881c0.m34164c(c7896q, "Null dependency");
            m34188i(c7896q.m34237b());
            this.f37974b.add(c7896q);
            return this;
        }

        /* renamed from: c */
        public b<T> m34182c() {
            return m34187h(1);
        }

        /* renamed from: d */
        public C7882d<T> m34183d() {
            C7881c0.m34165d(this.f37977e != null, "Missing required property: factory.");
            return new C7882d<>(new HashSet(this.f37973a), new HashSet(this.f37974b), this.f37975c, this.f37976d, this.f37977e, this.f37978f);
        }

        /* renamed from: e */
        public b<T> m34184e() {
            return m34187h(2);
        }

        /* renamed from: f */
        public b<T> m34185f(InterfaceC7887h<T> interfaceC7887h) {
            this.f37977e = (InterfaceC7887h) C7881c0.m34164c(interfaceC7887h, "Null factory");
            return this;
        }

        /* renamed from: g */
        public final b<T> m34186g() {
            this.f37976d = 1;
            return this;
        }

        /* renamed from: h */
        public final b<T> m34187h(int i10) {
            C7881c0.m34165d(this.f37975c == 0, "Instantiation type has already been set.");
            this.f37975c = i10;
            return this;
        }

        /* renamed from: i */
        public final void m34188i(Class<?> cls) {
            C7881c0.m34162a(!this.f37973a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }
    }

    public C7882d(Set<Class<? super T>> set, Set<C7896q> set2, int i10, int i11, InterfaceC7887h<T> interfaceC7887h, Set<Class<?>> set3) {
        this.f37967a = Collections.unmodifiableSet(set);
        this.f37968b = Collections.unmodifiableSet(set2);
        this.f37969c = i10;
        this.f37970d = i11;
        this.f37971e = interfaceC7887h;
        this.f37972f = Collections.unmodifiableSet(set3);
    }

    /* renamed from: a */
    public static <T> b<T> m34166a(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: b */
    public static <T> b<T> m34167b(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    /* renamed from: g */
    public static <T> C7882d<T> m34168g(T t10, Class<T> cls) {
        return m34169h(cls).m34185f(C7880c.m34161b(t10)).m34183d();
    }

    /* renamed from: h */
    public static <T> b<T> m34169h(Class<T> cls) {
        return m34166a(cls).m34186g();
    }

    /* renamed from: l */
    public static /* synthetic */ Object m34170l(Object obj, InterfaceC7884e interfaceC7884e) {
        return obj;
    }

    /* renamed from: m */
    public static /* synthetic */ Object m34171m(Object obj, InterfaceC7884e interfaceC7884e) {
        return obj;
    }

    @SafeVarargs
    /* renamed from: n */
    public static <T> C7882d<T> m34172n(T t10, Class<T> cls, Class<? super T>... clsArr) {
        return m34167b(cls, clsArr).m34185f(C7878b.m34156b(t10)).m34183d();
    }

    /* renamed from: c */
    public Set<C7896q> m34173c() {
        return this.f37968b;
    }

    /* renamed from: d */
    public InterfaceC7887h<T> m34174d() {
        return this.f37971e;
    }

    /* renamed from: e */
    public Set<Class<? super T>> m34175e() {
        return this.f37967a;
    }

    /* renamed from: f */
    public Set<Class<?>> m34176f() {
        return this.f37972f;
    }

    /* renamed from: i */
    public boolean m34177i() {
        boolean z10 = true;
        if (this.f37969c != 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: j */
    public boolean m34178j() {
        return this.f37969c == 2;
    }

    /* renamed from: k */
    public boolean m34179k() {
        return this.f37970d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f37967a.toArray()) + ">{" + this.f37969c + ", type=" + this.f37970d + ", deps=" + Arrays.toString(this.f37968b.toArray()) + "}";
    }
}
