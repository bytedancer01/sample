package p221n0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n0/f.class
 */
/* renamed from: n0.f */
/* loaded from: combined.jar:classes1.jar:n0/f.class */
public class C6614f<T> implements InterfaceC6613e<T> {

    /* renamed from: a */
    public final Object[] f34523a;

    /* renamed from: b */
    public int f34524b;

    public C6614f(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f34523a = new Object[i10];
    }

    @Override // p221n0.InterfaceC6613e
    /* renamed from: a */
    public boolean mo30520a(T t10) {
        if (m30522c(t10)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i10 = this.f34524b;
        Object[] objArr = this.f34523a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = t10;
        this.f34524b = i10 + 1;
        return true;
    }

    @Override // p221n0.InterfaceC6613e
    /* renamed from: b */
    public T mo30521b() {
        int i10 = this.f34524b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f34523a;
        T t10 = (T) objArr[i11];
        objArr[i11] = null;
        this.f34524b = i10 - 1;
        return t10;
    }

    /* renamed from: c */
    public final boolean m30522c(T t10) {
        for (int i10 = 0; i10 < this.f34524b; i10++) {
            if (this.f34523a[i10] == t10) {
                return true;
            }
        }
        return false;
    }
}
