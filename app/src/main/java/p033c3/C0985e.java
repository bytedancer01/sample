package p033c3;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c3/e.class
 */
/* renamed from: c3.e */
/* loaded from: combined.jar:classes1.jar:c3/e.class */
public final class C0985e<T> extends AbstractC0984d<T> {

    /* renamed from: b */
    public final T f6739b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c3/e$a.class
     */
    /* renamed from: c3.e$a */
    /* loaded from: combined.jar:classes1.jar:c3/e$a.class */
    public class a implements InterfaceC0983c<T, T> {

        /* renamed from: a */
        public final InterfaceC0982b f6740a;

        /* renamed from: b */
        public final C0985e f6741b;

        public a(C0985e c0985e, InterfaceC0982b interfaceC0982b) {
            this.f6741b = c0985e;
            this.f6740a = interfaceC0982b;
        }

        @Override // p033c3.InterfaceC0983c
        public T apply(T t10) {
            this.f6740a.apply(t10);
            return t10;
        }
    }

    public C0985e(T t10) {
        this.f6739b = t10;
    }

    @Override // p033c3.AbstractC0984d
    /* renamed from: b */
    public AbstractC0984d<T> mo5879b(InterfaceC0982b<T> interfaceC0982b) {
        C0986f.m5891b(interfaceC0982b);
        return (AbstractC0984d<T>) mo5883g(new a(this, interfaceC0982b));
    }

    @Override // p033c3.AbstractC0984d
    /* renamed from: c */
    public <V> AbstractC0984d<V> mo5880c(InterfaceC0983c<? super T, AbstractC0984d<V>> interfaceC0983c) {
        C0986f.m5891b(interfaceC0983c);
        return (AbstractC0984d) C0986f.m5892c(interfaceC0983c.apply(this.f6739b), "the Function passed to Optional.flatMap() must not return null.");
    }

    @Override // p033c3.AbstractC0984d
    /* renamed from: e */
    public T mo5881e() {
        return this.f6739b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0985e) {
            return this.f6739b.equals(((C0985e) obj).f6739b);
        }
        return false;
    }

    @Override // p033c3.AbstractC0984d
    /* renamed from: f */
    public boolean mo5882f() {
        return true;
    }

    @Override // p033c3.AbstractC0984d
    /* renamed from: g */
    public <V> AbstractC0984d<V> mo5883g(InterfaceC0983c<? super T, V> interfaceC0983c) {
        return new C0985e(C0986f.m5892c(interfaceC0983c.apply(this.f6739b), "the Function passed to Optional.map() must not return null."));
    }

    public int hashCode() {
        return this.f6739b.hashCode() + 1502476572;
    }

    @Override // p033c3.AbstractC0984d
    /* renamed from: i */
    public AbstractC0984d<T> mo5884i(AbstractC0984d<? extends T> abstractC0984d) {
        C0986f.m5891b(abstractC0984d);
        return this;
    }

    @Override // p033c3.AbstractC0984d
    /* renamed from: j */
    public T mo5885j(T t10) {
        C0986f.m5892c(t10, "use Optional.orNull() instead of Optional.or(null)");
        return this.f6739b;
    }

    @Override // p033c3.AbstractC0984d
    /* renamed from: k */
    public T mo5886k() {
        return this.f6739b;
    }

    public String toString() {
        return "Optional.of(" + this.f6739b + ")";
    }
}
