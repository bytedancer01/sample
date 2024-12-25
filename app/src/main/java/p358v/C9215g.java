package p358v;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v/g.class
 */
/* renamed from: v.g */
/* loaded from: combined.jar:classes1.jar:v/g.class */
public class C9215g<T> implements InterfaceC9214f<T> {

    /* renamed from: a */
    public final Object[] f42062a;

    /* renamed from: b */
    public int f42063b;

    public C9215g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f42062a = new Object[i10];
    }

    @Override // p358v.InterfaceC9214f
    /* renamed from: a */
    public boolean mo38771a(T t10) {
        int i10 = this.f42063b;
        Object[] objArr = this.f42062a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = t10;
        this.f42063b = i10 + 1;
        return true;
    }

    @Override // p358v.InterfaceC9214f
    /* renamed from: b */
    public T mo38772b() {
        int i10 = this.f42063b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f42062a;
        T t10 = (T) objArr[i11];
        objArr[i11] = null;
        this.f42063b = i10 - 1;
        return t10;
    }

    @Override // p358v.InterfaceC9214f
    /* renamed from: c */
    public void mo38773c(T[] tArr, int i10) {
        int i11 = i10;
        if (i10 > tArr.length) {
            i11 = tArr.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            T t10 = tArr[i12];
            int i13 = this.f42063b;
            Object[] objArr = this.f42062a;
            if (i13 < objArr.length) {
                objArr[i13] = t10;
                this.f42063b = i13 + 1;
            }
        }
    }
}
