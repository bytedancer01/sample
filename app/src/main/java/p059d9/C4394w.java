package p059d9;

import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/w.class
 */
/* renamed from: d9.w */
/* loaded from: combined.jar:classes2.jar:d9/w.class */
public final class C4394w {

    /* renamed from: a */
    public int f26669a;

    /* renamed from: b */
    public long[] f26670b;

    public C4394w() {
        this(32);
    }

    public C4394w(int i10) {
        this.f26670b = new long[i10];
    }

    /* renamed from: a */
    public void m22282a(long j10) {
        int i10 = this.f26669a;
        long[] jArr = this.f26670b;
        if (i10 == jArr.length) {
            this.f26670b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f26670b;
        int i11 = this.f26669a;
        this.f26669a = i11 + 1;
        jArr2[i11] = j10;
    }

    /* renamed from: b */
    public long m22283b(int i10) {
        if (i10 >= 0 && i10 < this.f26669a) {
            return this.f26670b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f26669a);
    }

    /* renamed from: c */
    public int m22284c() {
        return this.f26669a;
    }

    /* renamed from: d */
    public long[] m22285d() {
        return Arrays.copyOf(this.f26670b, this.f26669a);
    }
}
