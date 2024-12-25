package p182k7;

import org.apache.http.impl.auth.NTLMEngineImpl;
import p059d9.C4349a;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:k7/r.class
 */
/* renamed from: k7.r */
/* loaded from: combined.jar:classes2.jar:k7/r.class */
public final class C5527r {

    /* renamed from: a */
    public final C5524o f31560a;

    /* renamed from: b */
    public final int f31561b;

    /* renamed from: c */
    public final long[] f31562c;

    /* renamed from: d */
    public final int[] f31563d;

    /* renamed from: e */
    public final int f31564e;

    /* renamed from: f */
    public final long[] f31565f;

    /* renamed from: g */
    public final int[] f31566g;

    /* renamed from: h */
    public final long f31567h;

    public C5527r(C5524o c5524o, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        C4349a.m21878a(iArr.length == jArr2.length);
        C4349a.m21878a(jArr.length == jArr2.length);
        C4349a.m21878a(iArr2.length == jArr2.length);
        this.f31560a = c5524o;
        this.f31562c = jArr;
        this.f31563d = iArr;
        this.f31564e = i10;
        this.f31565f = jArr2;
        this.f31566g = iArr2;
        this.f31567h = j10;
        this.f31561b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | NTLMEngineImpl.FLAG_REQUEST_128BIT_KEY_EXCH;
        }
    }

    /* renamed from: a */
    public int m27500a(long j10) {
        for (int m22389i = C4401z0.m22389i(this.f31565f, j10, true, false); m22389i >= 0; m22389i--) {
            if ((this.f31566g[m22389i] & 1) != 0) {
                return m22389i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int m27501b(long j10) {
        for (int m22377e = C4401z0.m22377e(this.f31565f, j10, true, false); m22377e < this.f31565f.length; m22377e++) {
            if ((this.f31566g[m22377e] & 1) != 0) {
                return m22377e;
            }
        }
        return -1;
    }
}
