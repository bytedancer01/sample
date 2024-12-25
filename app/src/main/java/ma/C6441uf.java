package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/uf.class
 */
/* renamed from: ma.uf */
/* loaded from: combined.jar:classes2.jar:ma/uf.class */
public final class C6441uf extends C6481wf {

    /* renamed from: b */
    public final byte[] f34091b;

    /* renamed from: c */
    public int f34092c;

    /* renamed from: d */
    public int f34093d;

    /* renamed from: e */
    public int f34094e;

    public /* synthetic */ C6441uf(byte[] bArr, int i10, int i11, boolean z10, C6420tf c6420tf) {
        super(null);
        this.f34094e = Integer.MAX_VALUE;
        this.f34091b = bArr;
        this.f34092c = 0;
    }

    /* renamed from: a */
    public final int m30068a(int i10) {
        int i11 = this.f34094e;
        this.f34094e = 0;
        int i12 = this.f34092c + this.f34093d;
        this.f34092c = i12;
        if (i12 > 0) {
            this.f34093d = i12;
            this.f34092c = i12 - i12;
        } else {
            this.f34093d = 0;
        }
        return i11;
    }
}
