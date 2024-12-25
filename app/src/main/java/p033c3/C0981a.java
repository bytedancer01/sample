package p033c3;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c3/a.class
 */
/* renamed from: c3.a */
/* loaded from: combined.jar:classes1.jar:c3/a.class */
public final class C0981a<T> extends AbstractC0984d<T> {

    /* renamed from: b */
    public static final C0981a<Object> f6738b = new C0981a<>();

    /* renamed from: l */
    public static <T> AbstractC0984d<T> m5878l() {
        return f6738b;
    }

    @Override // p033c3.AbstractC0984d
    /* renamed from: b */
    public AbstractC0984d<T> mo5879b(InterfaceC0982b<T> interfaceC0982b) {
        C0986f.m5891b(interfaceC0982b);
        return AbstractC0984d.m5887a();
    }

    @Override // p033c3.AbstractC0984d
    /* renamed from: c */
    public <V> AbstractC0984d<V> mo5880c(InterfaceC0983c<? super T, AbstractC0984d<V>> interfaceC0983c) {
        C0986f.m5891b(interfaceC0983c);
        return AbstractC0984d.m5887a();
    }

    @Override // p033c3.AbstractC0984d
    /* renamed from: e */
    public T mo5881e() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // p033c3.AbstractC0984d
    /* renamed from: f */
    public boolean mo5882f() {
        return false;
    }

    @Override // p033c3.AbstractC0984d
    /* renamed from: g */
    public <V> AbstractC0984d<V> mo5883g(InterfaceC0983c<? super T, V> interfaceC0983c) {
        C0986f.m5891b(interfaceC0983c);
        return AbstractC0984d.m5887a();
    }

    public int hashCode() {
        return 2040732332;
    }

    @Override // p033c3.AbstractC0984d
    /* renamed from: i */
    public AbstractC0984d<T> mo5884i(AbstractC0984d<? extends T> abstractC0984d) {
        return (AbstractC0984d) C0986f.m5891b(abstractC0984d);
    }

    @Override // p033c3.AbstractC0984d
    /* renamed from: j */
    public T mo5885j(T t10) {
        return (T) C0986f.m5892c(t10, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // p033c3.AbstractC0984d
    /* renamed from: k */
    public T mo5886k() {
        return null;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
