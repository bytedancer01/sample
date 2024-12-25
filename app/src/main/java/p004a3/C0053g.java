package p004a3;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import p033c3.C0986f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a3/g.class
 */
/* renamed from: a3.g */
/* loaded from: combined.jar:classes1.jar:a3/g.class */
public final class C0053g<T> {

    /* renamed from: a */
    public final InterfaceC0050d f184a;

    /* renamed from: b */
    public final T f185b;

    /* renamed from: c */
    public final List<C0047a> f186c;

    /* renamed from: d */
    public Set<String> f187d;

    /* renamed from: e */
    public final boolean f188e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a3/g$a.class
     */
    /* renamed from: a3.g$a */
    /* loaded from: combined.jar:classes1.jar:a3/g$a.class */
    public static final class a<T> {

        /* renamed from: a */
        public final InterfaceC0050d f189a;

        /* renamed from: b */
        public T f190b;

        /* renamed from: c */
        public List<C0047a> f191c;

        /* renamed from: d */
        public Set<String> f192d;

        /* renamed from: e */
        public boolean f193e;

        public a(InterfaceC0050d interfaceC0050d) {
            this.f189a = (InterfaceC0050d) C0986f.m5892c(interfaceC0050d, "operation == null");
        }

        /* renamed from: f */
        public C0053g<T> m221f() {
            return new C0053g<>(this);
        }

        /* renamed from: g */
        public a<T> m222g(T t10) {
            this.f190b = t10;
            return this;
        }

        /* renamed from: h */
        public a<T> m223h(Set<String> set) {
            this.f192d = set;
            return this;
        }

        /* renamed from: i */
        public a<T> m224i(List<C0047a> list) {
            this.f191c = list;
            return this;
        }

        /* renamed from: j */
        public a<T> m225j(boolean z10) {
            this.f193e = z10;
            return this;
        }
    }

    public C0053g(a<T> aVar) {
        this.f184a = (InterfaceC0050d) C0986f.m5892c(aVar.f189a, "operation == null");
        this.f185b = (T) aVar.f190b;
        this.f186c = aVar.f191c != null ? Collections.unmodifiableList(aVar.f191c) : Collections.emptyList();
        this.f187d = aVar.f192d != null ? Collections.unmodifiableSet(aVar.f192d) : Collections.emptySet();
        this.f188e = aVar.f193e;
    }

    /* renamed from: a */
    public static <T> a<T> m210a(InterfaceC0050d interfaceC0050d) {
        return new a<>(interfaceC0050d);
    }

    /* renamed from: b */
    public T m211b() {
        return this.f185b;
    }

    /* renamed from: c */
    public Set<String> m212c() {
        return this.f187d;
    }

    /* renamed from: d */
    public List<C0047a> m213d() {
        return this.f186c;
    }

    /* renamed from: e */
    public boolean m214e() {
        return !this.f186c.isEmpty();
    }

    /* renamed from: f */
    public a<T> m215f() {
        return new a(this.f184a).m222g(this.f185b).m224i(this.f186c).m223h(this.f187d).m225j(this.f188e);
    }
}
