package p287qc;

import bd.InterfaceC0891b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p405xc.InterfaceC9722c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qc/d0.class
 */
/* renamed from: qc.d0 */
/* loaded from: combined.jar:classes2.jar:qc/d0.class */
public final class C7883d0 extends AbstractC7876a {

    /* renamed from: a */
    public final Set<Class<?>> f37979a;

    /* renamed from: b */
    public final Set<Class<?>> f37980b;

    /* renamed from: c */
    public final Set<Class<?>> f37981c;

    /* renamed from: d */
    public final Set<Class<?>> f37982d;

    /* renamed from: e */
    public final Set<Class<?>> f37983e;

    /* renamed from: f */
    public final Set<Class<?>> f37984f;

    /* renamed from: g */
    public final InterfaceC7884e f37985g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qc/d0$a.class
     */
    /* renamed from: qc.d0$a */
    /* loaded from: combined.jar:classes2.jar:qc/d0$a.class */
    public static class a implements InterfaceC9722c {

        /* renamed from: a */
        public final Set<Class<?>> f37986a;

        /* renamed from: b */
        public final InterfaceC9722c f37987b;

        public a(Set<Class<?>> set, InterfaceC9722c interfaceC9722c) {
            this.f37986a = set;
            this.f37987b = interfaceC9722c;
        }
    }

    public C7883d0(C7882d<?> c7882d, InterfaceC7884e interfaceC7884e) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C7896q c7896q : c7882d.m34173c()) {
            if (c7896q.m34239d()) {
                boolean m34241f = c7896q.m34241f();
                Class<?> m34237b = c7896q.m34237b();
                if (m34241f) {
                    hashSet4.add(m34237b);
                } else {
                    hashSet.add(m34237b);
                }
            } else if (c7896q.m34238c()) {
                hashSet3.add(c7896q.m34237b());
            } else {
                boolean m34241f2 = c7896q.m34241f();
                Class<?> m34237b2 = c7896q.m34237b();
                if (m34241f2) {
                    hashSet5.add(m34237b2);
                } else {
                    hashSet2.add(m34237b2);
                }
            }
        }
        if (!c7882d.m34176f().isEmpty()) {
            hashSet.add(InterfaceC9722c.class);
        }
        this.f37979a = Collections.unmodifiableSet(hashSet);
        this.f37980b = Collections.unmodifiableSet(hashSet2);
        this.f37981c = Collections.unmodifiableSet(hashSet3);
        this.f37982d = Collections.unmodifiableSet(hashSet4);
        this.f37983e = Collections.unmodifiableSet(hashSet5);
        this.f37984f = c7882d.m34176f();
        this.f37985g = interfaceC7884e;
    }

    @Override // p287qc.InterfaceC7884e
    /* renamed from: a */
    public <T> InterfaceC0891b<Set<T>> mo34189a(Class<T> cls) {
        if (this.f37983e.contains(cls)) {
            return this.f37985g.mo34189a(cls);
        }
        throw new C7898s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // p287qc.AbstractC7876a, p287qc.InterfaceC7884e
    /* renamed from: b */
    public <T> Set<T> mo34154b(Class<T> cls) {
        if (this.f37982d.contains(cls)) {
            return this.f37985g.mo34154b(cls);
        }
        throw new C7898s(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // p287qc.InterfaceC7884e
    /* renamed from: c */
    public <T> InterfaceC0891b<T> mo34190c(Class<T> cls) {
        if (this.f37980b.contains(cls)) {
            return this.f37985g.mo34190c(cls);
        }
        throw new C7898s(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // p287qc.AbstractC7876a, p287qc.InterfaceC7884e
    public <T> T get(Class<T> cls) {
        if (!this.f37979a.contains(cls)) {
            throw new C7898s(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t10 = (T) this.f37985g.get(cls);
        return !cls.equals(InterfaceC9722c.class) ? t10 : (T) new a(this.f37984f, (InterfaceC9722c) t10);
    }
}
