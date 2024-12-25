package p145i7;

import p057d7.InterfaceC4324g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:i7/g.class
 */
/* renamed from: i7.g */
/* loaded from: combined.jar:classes2.jar:i7/g.class */
public final class C5199g {

    /* renamed from: d */
    public static final long[] f29732d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f29733a = new byte[8];

    /* renamed from: b */
    public int f29734b;

    /* renamed from: c */
    public int f29735c;

    /* renamed from: a */
    public static long m25951a(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        long j11 = j10;
        if (z10) {
            j11 = j10 & (f29732d[i10 - 1] ^ (-1));
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j11 = (j11 << 8) | (bArr[i11] & 255);
        }
        return j11;
    }

    /* renamed from: c */
    public static int m25952c(int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            long[] jArr = f29732d;
            if (i12 >= jArr.length) {
                i11 = -1;
                break;
            }
            i11 = i12 + 1;
            i12 = i11;
            if ((jArr[i12] & i10) != 0) {
                break;
            }
        }
        return i11;
    }

    /* renamed from: b */
    public int m25953b() {
        return this.f29735c;
    }

    /* renamed from: d */
    public long m25954d(InterfaceC4324g interfaceC4324g, boolean z10, boolean z11, int i10) {
        if (this.f29734b == 0) {
            if (!interfaceC4324g.mo21802g(this.f29733a, 0, 1, z10)) {
                return -1L;
            }
            int m25952c = m25952c(this.f29733a[0] & 255);
            this.f29735c = m25952c;
            if (m25952c == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f29734b = 1;
        }
        int i11 = this.f29735c;
        if (i11 > i10) {
            this.f29734b = 0;
            return -2L;
        }
        if (i11 != 1) {
            interfaceC4324g.readFully(this.f29733a, 1, i11 - 1);
        }
        this.f29734b = 0;
        return m25951a(this.f29733a, this.f29735c, z11);
    }

    /* renamed from: e */
    public void m25955e() {
        this.f29734b = 0;
        this.f29735c = 0;
    }
}
