package p268p7;

import java.nio.ByteBuffer;
import p059d9.C4349a;
import p059d9.C4392v;
import p267p6.C7629w0;
import p301r6.C7985j0;
import p332t6.C8638f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p7/k.class
 */
/* renamed from: p7.k */
/* loaded from: combined.jar:classes2.jar:p7/k.class */
public final class C7650k {

    /* renamed from: a */
    public long f37189a;

    /* renamed from: b */
    public long f37190b;

    /* renamed from: c */
    public boolean f37191c;

    /* renamed from: a */
    public final long m33308a(C7629w0 c7629w0) {
        return (this.f37189a * 1000000) / c7629w0.f37068A;
    }

    /* renamed from: b */
    public void m33309b() {
        this.f37189a = 0L;
        this.f37190b = 0L;
        this.f37191c = false;
    }

    /* renamed from: c */
    public long m33310c(C7629w0 c7629w0, C8638f c8638f) {
        if (this.f37191c) {
            return c8638f.f40329e;
        }
        ByteBuffer byteBuffer = (ByteBuffer) C4349a.m21882e(c8638f.f40327c);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & 255);
        }
        int m34728m = C7985j0.m34728m(i10);
        if (m34728m == -1) {
            this.f37191c = true;
            C4392v.m22275i("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return c8638f.f40329e;
        }
        if (this.f37189a != 0) {
            long m33308a = m33308a(c7629w0);
            this.f37189a += m34728m;
            return this.f37190b + m33308a;
        }
        long j10 = c8638f.f40329e;
        this.f37190b = j10;
        this.f37189a = m34728m - 529;
        return j10;
    }
}
