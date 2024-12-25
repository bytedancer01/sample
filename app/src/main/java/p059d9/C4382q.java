package p059d9;

import java.util.NoSuchElementException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/q.class
 */
/* renamed from: d9.q */
/* loaded from: combined.jar:classes2.jar:d9/q.class */
public final class C4382q {

    /* renamed from: a */
    public int f26632a = 0;

    /* renamed from: b */
    public int f26633b = -1;

    /* renamed from: c */
    public int f26634c = 0;

    /* renamed from: d */
    public int[] f26635d;

    /* renamed from: e */
    public int f26636e;

    public C4382q() {
        int[] iArr = new int[16];
        this.f26635d = iArr;
        this.f26636e = iArr.length - 1;
    }

    /* renamed from: a */
    public void m22213a(int i10) {
        if (this.f26634c == this.f26635d.length) {
            m22215c();
        }
        int i11 = (this.f26633b + 1) & this.f26636e;
        this.f26633b = i11;
        this.f26635d[i11] = i10;
        this.f26634c++;
    }

    /* renamed from: b */
    public void m22214b() {
        this.f26632a = 0;
        this.f26633b = -1;
        this.f26634c = 0;
    }

    /* renamed from: c */
    public final void m22215c() {
        int[] iArr = this.f26635d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i10 = this.f26632a;
        int i11 = length2 - i10;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
        System.arraycopy(this.f26635d, 0, iArr2, i11, i10);
        this.f26632a = 0;
        this.f26633b = this.f26634c - 1;
        this.f26635d = iArr2;
        this.f26636e = iArr2.length - 1;
    }

    /* renamed from: d */
    public boolean m22216d() {
        return this.f26634c == 0;
    }

    /* renamed from: e */
    public int m22217e() {
        int i10 = this.f26634c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f26635d;
        int i11 = this.f26632a;
        int i12 = iArr[i11];
        this.f26632a = (i11 + 1) & this.f26636e;
        this.f26634c = i10 - 1;
        return i12;
    }
}
