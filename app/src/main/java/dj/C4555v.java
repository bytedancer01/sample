package dj;

import dj.C4534a;
import dj.InterfaceC4536c;
import dj.InterfaceC4539f;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p173ji.AbstractC5408e0;
import p173ji.AbstractC5412g0;
import p173ji.C5402b0;
import p173ji.C5433x;
import p173ji.InterfaceC5407e;

/* renamed from: dj.v */
/* loaded from: combined.jar:classes3.jar:dj/v.class */
public final class C4555v {

    /* renamed from: a */
    public final Map<Method, AbstractC4556w<?>> f27132a = new ConcurrentHashMap();

    /* renamed from: b */
    public final InterfaceC5407e.a f27133b;

    /* renamed from: c */
    public final C5433x f27134c;

    /* renamed from: d */
    public final List<InterfaceC4539f.a> f27135d;

    /* renamed from: e */
    public final List<InterfaceC4536c.a> f27136e;

    /* renamed from: f */
    public final Executor f27137f;

    /* renamed from: g */
    public final boolean f27138g;

    /* renamed from: dj.v$a */
    /* loaded from: combined.jar:classes3.jar:dj/v$a.class */
    public class a implements InvocationHandler {

        /* renamed from: a */
        public final C4551r f27139a = C4551r.m22915f();

        /* renamed from: b */
        public final Object[] f27140b = new Object[0];

        /* renamed from: c */
        public final Class f27141c;

        /* renamed from: d */
        public final C4555v f27142d;

        public a(C4555v c4555v, Class cls) {
            this.f27142d = c4555v;
            this.f27141c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f27140b;
            }
            return this.f27139a.m22921h(method) ? this.f27139a.mo22920g(method, this.f27141c, obj, objArr) : this.f27142d.m22959c(method).mo22882a(objArr);
        }
    }

    /* renamed from: dj.v$b */
    /* loaded from: combined.jar:classes3.jar:dj/v$b.class */
    public static final class b {

        /* renamed from: a */
        public final C4551r f27143a;

        /* renamed from: b */
        public InterfaceC5407e.a f27144b;

        /* renamed from: c */
        public C5433x f27145c;

        /* renamed from: d */
        public final List<InterfaceC4539f.a> f27146d;

        /* renamed from: e */
        public final List<InterfaceC4536c.a> f27147e;

        /* renamed from: f */
        public Executor f27148f;

        /* renamed from: g */
        public boolean f27149g;

        public b() {
            this(C4551r.m22915f());
        }

        public b(C4551r c4551r) {
            this.f27146d = new ArrayList();
            this.f27147e = new ArrayList();
            this.f27143a = c4551r;
        }

        /* renamed from: a */
        public b m22967a(InterfaceC4539f.a aVar) {
            List<InterfaceC4539f.a> list = this.f27146d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: b */
        public b m22968b(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return m22969c(C5433x.m27104h(str));
        }

        /* renamed from: c */
        public b m22969c(C5433x c5433x) {
            Objects.requireNonNull(c5433x, "baseUrl == null");
            List<String> m27116n = c5433x.m27116n();
            if ("".equals(m27116n.get(m27116n.size() - 1))) {
                this.f27145c = c5433x;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + c5433x);
        }

        /* renamed from: d */
        public C4555v m22970d() {
            if (this.f27145c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            InterfaceC5407e.a aVar = this.f27144b;
            InterfaceC5407e.a aVar2 = aVar;
            if (aVar == null) {
                aVar2 = new C5402b0();
            }
            Executor executor = this.f27148f;
            Executor executor2 = executor;
            if (executor == null) {
                executor2 = this.f27143a.mo22917b();
            }
            ArrayList arrayList = new ArrayList(this.f27147e);
            arrayList.addAll(this.f27143a.m22916a(executor2));
            ArrayList arrayList2 = new ArrayList(this.f27146d.size() + 1 + this.f27143a.m22919d());
            arrayList2.add(new C4534a());
            arrayList2.addAll(this.f27146d);
            arrayList2.addAll(this.f27143a.m22918c());
            return new C4555v(aVar2, this.f27145c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f27149g);
        }

        /* renamed from: e */
        public b m22971e(InterfaceC5407e.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f27144b = aVar;
            return this;
        }

        /* renamed from: f */
        public b m22972f(C5402b0 c5402b0) {
            Objects.requireNonNull(c5402b0, "client == null");
            return m22971e(c5402b0);
        }
    }

    public C4555v(InterfaceC5407e.a aVar, C5433x c5433x, List<InterfaceC4539f.a> list, List<InterfaceC4536c.a> list2, Executor executor, boolean z10) {
        this.f27133b = aVar;
        this.f27134c = c5433x;
        this.f27135d = list;
        this.f27136e = list2;
        this.f27137f = executor;
        this.f27138g = z10;
    }

    /* renamed from: a */
    public InterfaceC4536c<?, ?> m22957a(Type type, Annotation[] annotationArr) {
        return m22960d(null, type, annotationArr);
    }

    /* renamed from: b */
    public <T> T m22958b(Class<T> cls) {
        m22966j(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(this, cls));
    }

    /* renamed from: c */
    public AbstractC4556w<?> m22959c(Method method) {
        AbstractC4556w<?> abstractC4556w;
        AbstractC4556w<?> abstractC4556w2 = this.f27132a.get(method);
        if (abstractC4556w2 != null) {
            return abstractC4556w2;
        }
        synchronized (this.f27132a) {
            AbstractC4556w<?> abstractC4556w3 = this.f27132a.get(method);
            abstractC4556w = abstractC4556w3;
            if (abstractC4556w3 == null) {
                abstractC4556w = AbstractC4556w.m22973b(this, method);
                this.f27132a.put(method, abstractC4556w);
            }
        }
        return abstractC4556w;
    }

    /* renamed from: d */
    public InterfaceC4536c<?, ?> m22960d(InterfaceC4536c.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f27136e.indexOf(aVar) + 1;
        int size = this.f27136e.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            InterfaceC4536c<?, ?> mo22867a = this.f27136e.get(i10).mo22867a(type, annotationArr, this);
            if (mo22867a != null) {
                return mo22867a;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f27136e.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f27136e.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f27136e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: e */
    public <T> InterfaceC4539f<T, AbstractC5408e0> m22961e(InterfaceC4539f.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f27135d.indexOf(aVar) + 1;
        int size = this.f27135d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            InterfaceC4539f<T, AbstractC5408e0> interfaceC4539f = (InterfaceC4539f<T, AbstractC5408e0>) this.f27135d.get(i10).mo22853c(type, annotationArr, annotationArr2, this);
            if (interfaceC4539f != null) {
                return interfaceC4539f;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f27135d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f27135d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f27135d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: f */
    public <T> InterfaceC4539f<AbstractC5412g0, T> m22962f(InterfaceC4539f.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f27135d.indexOf(aVar) + 1;
        int size = this.f27135d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            InterfaceC4539f<AbstractC5412g0, T> interfaceC4539f = (InterfaceC4539f<AbstractC5412g0, T>) this.f27135d.get(i10).mo22854d(type, annotationArr, this);
            if (interfaceC4539f != null) {
                return interfaceC4539f;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f27135d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f27135d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f27135d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: g */
    public <T> InterfaceC4539f<T, AbstractC5408e0> m22963g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return m22961e(null, type, annotationArr, annotationArr2);
    }

    /* renamed from: h */
    public <T> InterfaceC4539f<AbstractC5412g0, T> m22964h(Type type, Annotation[] annotationArr) {
        return m22962f(null, type, annotationArr);
    }

    /* renamed from: i */
    public <T> InterfaceC4539f<T, String> m22965i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f27135d.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC4539f<T, String> interfaceC4539f = (InterfaceC4539f<T, String>) this.f27135d.get(i10).m22872e(type, annotationArr, this);
            if (interfaceC4539f != null) {
                return interfaceC4539f;
            }
        }
        return C4534a.d.f26963a;
    }

    /* renamed from: j */
    public final void m22966j(Class<?> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f27138g) {
            C4551r m22915f = C4551r.m22915f();
            for (Method method : cls.getDeclaredMethods()) {
                if (!m22915f.m22921h(method) && !Modifier.isStatic(method.getModifiers())) {
                    m22959c(method);
                }
            }
        }
    }
}
