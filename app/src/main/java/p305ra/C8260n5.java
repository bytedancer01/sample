package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/n5.class
 */
/* renamed from: ra.n5 */
/* loaded from: combined.jar:classes2.jar:ra/n5.class */
public final class C8260n5 extends C8275o5 {

    /* renamed from: a */
    public final byte[] f39207a;

    /* renamed from: b */
    public int f39208b;

    /* renamed from: c */
    public int f39209c;

    /* renamed from: d */
    public int f39210d;

    public /* synthetic */ C8260n5(byte[] bArr, int i10, int i11, boolean z10, C8245m5 c8245m5) {
        super(null);
        this.f39210d = Integer.MAX_VALUE;
        this.f39207a = bArr;
        this.f39208b = 0;
    }

    /* renamed from: c */
    public final int m35646c(int i10) {
        int i11 = this.f39210d;
        this.f39210d = 0;
        int i12 = this.f39208b + this.f39209c;
        this.f39208b = i12;
        if (i12 > 0) {
            this.f39209c = i12;
            this.f39208b = 0;
        } else {
            this.f39209c = 0;
        }
        return i11;
    }
}
