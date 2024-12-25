package p077e8;

import android.net.Uri;
import p059d9.C4393v0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e8/i.class
 */
/* renamed from: e8.i */
/* loaded from: combined.jar:classes2.jar:e8/i.class */
public final class C4656i {

    /* renamed from: a */
    public final long f27454a;

    /* renamed from: b */
    public final long f27455b;

    /* renamed from: c */
    public final String f27456c;

    /* renamed from: d */
    public int f27457d;

    public C4656i(String str, long j10, long j11) {
        this.f27456c = str == null ? "" : str;
        this.f27454a = j10;
        this.f27455b = j11;
    }

    /* renamed from: a */
    public C4656i m23372a(C4656i c4656i, String str) {
        String m23374c = m23374c(str);
        if (c4656i == null || !m23374c.equals(c4656i.m23374c(str))) {
            return null;
        }
        long j10 = this.f27455b;
        long j11 = -1;
        if (j10 != -1) {
            long j12 = this.f27454a;
            if (j12 + j10 == c4656i.f27454a) {
                long j13 = c4656i.f27455b;
                if (j13 != -1) {
                    j11 = j10 + j13;
                }
                return new C4656i(m23374c, j12, j11);
            }
        }
        long j14 = c4656i.f27455b;
        if (j14 == -1) {
            return null;
        }
        long j15 = c4656i.f27454a;
        if (j15 + j14 != this.f27454a) {
            return null;
        }
        if (j10 != -1) {
            j11 = j14 + j10;
        }
        return new C4656i(m23374c, j15, j11);
    }

    /* renamed from: b */
    public Uri m23373b(String str) {
        return C4393v0.m22281e(str, this.f27456c);
    }

    /* renamed from: c */
    public String m23374c(String str) {
        return C4393v0.m22280d(str, this.f27456c);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C4656i.class != obj.getClass()) {
            return false;
        }
        C4656i c4656i = (C4656i) obj;
        if (this.f27454a != c4656i.f27454a || this.f27455b != c4656i.f27455b || !this.f27456c.equals(c4656i.f27456c)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        if (this.f27457d == 0) {
            this.f27457d = ((((527 + ((int) this.f27454a)) * 31) + ((int) this.f27455b)) * 31) + this.f27456c.hashCode();
        }
        return this.f27457d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f27456c + ", start=" + this.f27454a + ", length=" + this.f27455b + ")";
    }
}
