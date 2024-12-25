package p221n0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n0/g.class
 */
/* renamed from: n0.g */
/* loaded from: combined.jar:classes1.jar:n0/g.class */
public class C6615g<T> extends C6614f<T> {

    /* renamed from: c */
    public final Object f34525c;

    public C6615g(int i10) {
        super(i10);
        this.f34525c = new Object();
    }

    @Override // p221n0.C6614f, p221n0.InterfaceC6613e
    /* renamed from: a */
    public boolean mo30520a(T t10) {
        boolean mo30520a;
        synchronized (this.f34525c) {
            mo30520a = super.mo30520a(t10);
        }
        return mo30520a;
    }

    @Override // p221n0.C6614f, p221n0.InterfaceC6613e
    /* renamed from: b */
    public T mo30521b() {
        T t10;
        synchronized (this.f34525c) {
            t10 = (T) super.mo30521b();
        }
        return t10;
    }
}
