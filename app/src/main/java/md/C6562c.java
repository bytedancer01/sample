package md;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p188kd.C5558k;
import p188kd.InterfaceC5553f;
import p273pd.AbstractC7702b;
import p308rd.C8462a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:md/c.class
 */
/* renamed from: md.c */
/* loaded from: combined.jar:classes2.jar:md/c.class */
public final class C6562c {

    /* renamed from: a */
    public final Map<Type, InterfaceC5553f<?>> f34327a;

    /* renamed from: b */
    public final AbstractC7702b f34328b = AbstractC7702b.m33645a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/c$a.class
     */
    /* renamed from: md.c$a */
    /* loaded from: combined.jar:classes2.jar:md/c$a.class */
    public class a<T> implements InterfaceC6568i<T> {

        /* renamed from: a */
        public final C6562c f34329a;

        public a(C6562c c6562c) {
            this.f34329a = c6562c;
        }

        @Override // md.InterfaceC6568i
        /* renamed from: a */
        public T mo30294a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/c$b.class
     */
    /* renamed from: md.c$b */
    /* loaded from: combined.jar:classes2.jar:md/c$b.class */
    public class b<T> implements InterfaceC6568i<T> {

        /* renamed from: a */
        public final C6562c f34330a;

        public b(C6562c c6562c) {
            this.f34330a = c6562c;
        }

        @Override // md.InterfaceC6568i
        /* renamed from: a */
        public T mo30294a() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/c$c.class
     */
    /* renamed from: md.c$c */
    /* loaded from: combined.jar:classes2.jar:md/c$c.class */
    public class c<T> implements InterfaceC6568i<T> {

        /* renamed from: a */
        public final C6562c f34331a;

        public c(C6562c c6562c) {
            this.f34331a = c6562c;
        }

        @Override // md.InterfaceC6568i
        /* renamed from: a */
        public T mo30294a() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/c$d.class
     */
    /* renamed from: md.c$d */
    /* loaded from: combined.jar:classes2.jar:md/c$d.class */
    public class d<T> implements InterfaceC6568i<T> {

        /* renamed from: a */
        public final C6562c f34332a;

        public d(C6562c c6562c) {
            this.f34332a = c6562c;
        }

        @Override // md.InterfaceC6568i
        /* renamed from: a */
        public T mo30294a() {
            return (T) new C6567h();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/c$e.class
     */
    /* renamed from: md.c$e */
    /* loaded from: combined.jar:classes2.jar:md/c$e.class */
    public class e<T> implements InterfaceC6568i<T> {

        /* renamed from: a */
        public final AbstractC6572m f34333a = AbstractC6572m.m30338b();

        /* renamed from: b */
        public final Class f34334b;

        /* renamed from: c */
        public final Type f34335c;

        /* renamed from: d */
        public final C6562c f34336d;

        public e(C6562c c6562c, Class cls, Type type) {
            this.f34336d = c6562c;
            this.f34334b = cls;
            this.f34335c = type;
        }

        @Override // md.InterfaceC6568i
        /* renamed from: a */
        public T mo30294a() {
            try {
                return (T) this.f34333a.mo30339c(this.f34334b);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f34335c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e10);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/c$f.class
     */
    /* renamed from: md.c$f */
    /* loaded from: combined.jar:classes2.jar:md/c$f.class */
    public class f<T> implements InterfaceC6568i<T> {

        /* renamed from: a */
        public final InterfaceC5553f f34337a;

        /* renamed from: b */
        public final Type f34338b;

        /* renamed from: c */
        public final C6562c f34339c;

        public f(C6562c c6562c, InterfaceC5553f interfaceC5553f, Type type) {
            this.f34339c = c6562c;
            this.f34337a = interfaceC5553f;
            this.f34338b = type;
        }

        @Override // md.InterfaceC6568i
        /* renamed from: a */
        public T mo30294a() {
            return (T) this.f34337a.m27574a(this.f34338b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/c$g.class
     */
    /* renamed from: md.c$g */
    /* loaded from: combined.jar:classes2.jar:md/c$g.class */
    public class g<T> implements InterfaceC6568i<T> {

        /* renamed from: a */
        public final InterfaceC5553f f34340a;

        /* renamed from: b */
        public final Type f34341b;

        /* renamed from: c */
        public final C6562c f34342c;

        public g(C6562c c6562c, InterfaceC5553f interfaceC5553f, Type type) {
            this.f34342c = c6562c;
            this.f34340a = interfaceC5553f;
            this.f34341b = type;
        }

        @Override // md.InterfaceC6568i
        /* renamed from: a */
        public T mo30294a() {
            return (T) this.f34340a.m27574a(this.f34341b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/c$h.class
     */
    /* renamed from: md.c$h */
    /* loaded from: combined.jar:classes2.jar:md/c$h.class */
    public class h<T> implements InterfaceC6568i<T> {

        /* renamed from: a */
        public final Constructor f34343a;

        /* renamed from: b */
        public final C6562c f34344b;

        public h(C6562c c6562c, Constructor constructor) {
            this.f34344b = c6562c;
            this.f34343a = constructor;
        }

        @Override // md.InterfaceC6568i
        /* renamed from: a */
        public T mo30294a() {
            try {
                return (T) this.f34343a.newInstance(null);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Failed to invoke " + this.f34343a + " with no args", e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke " + this.f34343a + " with no args", e12.getTargetException());
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/c$i.class
     */
    /* renamed from: md.c$i */
    /* loaded from: combined.jar:classes2.jar:md/c$i.class */
    public class i<T> implements InterfaceC6568i<T> {

        /* renamed from: a */
        public final C6562c f34345a;

        public i(C6562c c6562c) {
            this.f34345a = c6562c;
        }

        @Override // md.InterfaceC6568i
        /* renamed from: a */
        public T mo30294a() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/c$j.class
     */
    /* renamed from: md.c$j */
    /* loaded from: combined.jar:classes2.jar:md/c$j.class */
    public class j<T> implements InterfaceC6568i<T> {

        /* renamed from: a */
        public final Type f34346a;

        /* renamed from: b */
        public final C6562c f34347b;

        public j(C6562c c6562c, Type type) {
            this.f34347b = c6562c;
            this.f34346a = type;
        }

        @Override // md.InterfaceC6568i
        /* renamed from: a */
        public T mo30294a() {
            Type type = this.f34346a;
            if (!(type instanceof ParameterizedType)) {
                throw new C5558k("Invalid EnumSet type: " + this.f34346a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) EnumSet.noneOf((Class) type2);
            }
            throw new C5558k("Invalid EnumSet type: " + this.f34346a.toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/c$k.class
     */
    /* renamed from: md.c$k */
    /* loaded from: combined.jar:classes2.jar:md/c$k.class */
    public class k<T> implements InterfaceC6568i<T> {

        /* renamed from: a */
        public final C6562c f34348a;

        public k(C6562c c6562c) {
            this.f34348a = c6562c;
        }

        @Override // md.InterfaceC6568i
        /* renamed from: a */
        public T mo30294a() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/c$l.class
     */
    /* renamed from: md.c$l */
    /* loaded from: combined.jar:classes2.jar:md/c$l.class */
    public class l<T> implements InterfaceC6568i<T> {

        /* renamed from: a */
        public final C6562c f34349a;

        public l(C6562c c6562c) {
            this.f34349a = c6562c;
        }

        @Override // md.InterfaceC6568i
        /* renamed from: a */
        public T mo30294a() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/c$m.class
     */
    /* renamed from: md.c$m */
    /* loaded from: combined.jar:classes2.jar:md/c$m.class */
    public class m<T> implements InterfaceC6568i<T> {

        /* renamed from: a */
        public final C6562c f34350a;

        public m(C6562c c6562c) {
            this.f34350a = c6562c;
        }

        @Override // md.InterfaceC6568i
        /* renamed from: a */
        public T mo30294a() {
            return (T) new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/c$n.class
     */
    /* renamed from: md.c$n */
    /* loaded from: combined.jar:classes2.jar:md/c$n.class */
    public class n<T> implements InterfaceC6568i<T> {

        /* renamed from: a */
        public final C6562c f34351a;

        public n(C6562c c6562c) {
            this.f34351a = c6562c;
        }

        @Override // md.InterfaceC6568i
        /* renamed from: a */
        public T mo30294a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    public C6562c(Map<Type, InterfaceC5553f<?>> map) {
        this.f34327a = map;
    }

    /* renamed from: a */
    public <T> InterfaceC6568i<T> m30290a(C8462a<T> c8462a) {
        Type m36352e = c8462a.m36352e();
        Class<? super T> m36351c = c8462a.m36351c();
        InterfaceC5553f<?> interfaceC5553f = this.f34327a.get(m36352e);
        if (interfaceC5553f != null) {
            return new f(this, interfaceC5553f, m36352e);
        }
        InterfaceC5553f<?> interfaceC5553f2 = this.f34327a.get(m36351c);
        if (interfaceC5553f2 != null) {
            return new g(this, interfaceC5553f2, m36352e);
        }
        InterfaceC6568i<T> m30291b = m30291b(m36351c);
        if (m30291b != null) {
            return m30291b;
        }
        InterfaceC6568i<T> m30292c = m30292c(m36352e, m36351c);
        return m30292c != null ? m30292c : m30293d(m36352e, m36351c);
    }

    /* renamed from: b */
    public final <T> InterfaceC6568i<T> m30291b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f34328b.mo33644b(declaredConstructor);
            }
            return new h(this, declaredConstructor);
        } catch (NoSuchMethodException e10) {
            return null;
        }
    }

    /* renamed from: c */
    public final <T> InterfaceC6568i<T> m30292c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new i(this) : EnumSet.class.isAssignableFrom(cls) ? new j(this, type) : Set.class.isAssignableFrom(cls) ? new k(this) : Queue.class.isAssignableFrom(cls) ? new l(this) : new m(this);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new n(this) : ConcurrentMap.class.isAssignableFrom(cls) ? new a(this) : SortedMap.class.isAssignableFrom(cls) ? new b(this) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C8462a.m36349b(((ParameterizedType) type).getActualTypeArguments()[0]).m36351c())) ? new d(this) : new c(this);
        }
        return null;
    }

    /* renamed from: d */
    public final <T> InterfaceC6568i<T> m30293d(Type type, Class<? super T> cls) {
        return new e(this, cls, type);
    }

    public String toString() {
        return this.f34327a.toString();
    }
}
