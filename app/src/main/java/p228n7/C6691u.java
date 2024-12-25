package p228n7;

import java.util.Arrays;
import p059d9.C4349a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/u.class
 */
/* renamed from: n7.u */
/* loaded from: combined.jar:classes2.jar:n7/u.class */
public final class C6691u {

    /* renamed from: a */
    public final int f35022a;

    /* renamed from: b */
    public boolean f35023b;

    /* renamed from: c */
    public boolean f35024c;

    /* renamed from: d */
    public byte[] f35025d;

    /* renamed from: e */
    public int f35026e;

    public C6691u(int i10, int i11) {
        this.f35022a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f35025d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void m30828a(byte[] bArr, int i10, int i11) {
        if (this.f35023b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f35025d;
            int length = bArr2.length;
            int i13 = this.f35026e;
            if (length < i13 + i12) {
                this.f35025d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f35025d, this.f35026e, i12);
            this.f35026e += i12;
        }
    }

    /* renamed from: b */
    public boolean m30829b(int i10) {
        if (!this.f35023b) {
            return false;
        }
        this.f35026e -= i10;
        this.f35023b = false;
        this.f35024c = true;
        return true;
    }

    /* renamed from: c */
    public boolean m30830c() {
        return this.f35024c;
    }

    /* renamed from: d */
    public void m30831d() {
        this.f35023b = false;
        this.f35024c = false;
    }

    /* renamed from: e */
    public void m30832e(int i10) {
        boolean z10 = true;
        C4349a.m21884g(!this.f35023b);
        if (i10 != this.f35022a) {
            z10 = false;
        }
        this.f35023b = z10;
        if (z10) {
            this.f35026e = 3;
            this.f35024c = false;
        }
    }
}
