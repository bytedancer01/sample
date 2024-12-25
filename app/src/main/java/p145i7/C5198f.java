package p145i7;

import p057d7.InterfaceC4324g;
import p059d9.C4361f0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:i7/f.class
 */
/* renamed from: i7.f */
/* loaded from: combined.jar:classes2.jar:i7/f.class */
public final class C5198f {

    /* renamed from: a */
    public final C4361f0 f29730a = new C4361f0(8);

    /* renamed from: b */
    public int f29731b;

    /* renamed from: a */
    public final long m25949a(InterfaceC4324g interfaceC4324g) {
        interfaceC4324g.mo21811q(this.f29730a.m21988d(), 0, 1);
        int i10 = this.f29730a.m21988d()[0] & 255;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((i10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = i10 & (i11 ^ (-1));
        interfaceC4324g.mo21811q(this.f29730a.m21988d(), 1, i12);
        int i14 = 0;
        int i15 = i13;
        while (true) {
            int i16 = i15;
            if (i14 >= i12) {
                this.f29731b += i12 + 1;
                return i16;
            }
            i14++;
            i15 = (this.f29730a.m21988d()[i14] & 255) + (i16 << 8);
        }
    }

    /* renamed from: b */
    public boolean m25950b(InterfaceC4324g interfaceC4324g) {
        long length = interfaceC4324g.getLength();
        long j10 = 1024;
        if (length != -1) {
            j10 = length > 1024 ? 1024L : length;
        }
        int i10 = (int) j10;
        interfaceC4324g.mo21811q(this.f29730a.m21988d(), 0, 4);
        long m21973F = this.f29730a.m21973F();
        this.f29731b = 4;
        while (m21973F != 440786851) {
            int i11 = this.f29731b + 1;
            this.f29731b = i11;
            if (i11 == i10) {
                return false;
            }
            interfaceC4324g.mo21811q(this.f29730a.m21988d(), 0, 1);
            m21973F = ((m21973F << 8) & (-256)) | (this.f29730a.m21988d()[0] & 255);
        }
        long m25949a = m25949a(interfaceC4324g);
        long j11 = this.f29731b;
        boolean z10 = false;
        if (m25949a != Long.MIN_VALUE) {
            if (length == -1 || j11 + m25949a < length) {
                while (true) {
                    int i12 = this.f29731b;
                    long j12 = i12;
                    long j13 = j11 + m25949a;
                    if (j12 >= j13) {
                        z10 = false;
                        if (i12 == j13) {
                            z10 = true;
                        }
                    } else {
                        if (m25949a(interfaceC4324g) == Long.MIN_VALUE) {
                            return false;
                        }
                        long m25949a2 = m25949a(interfaceC4324g);
                        if (m25949a2 < 0 || m25949a2 > 2147483647L) {
                            return false;
                        }
                        if (m25949a2 != 0) {
                            int i13 = (int) m25949a2;
                            interfaceC4324g.mo21805k(i13);
                            this.f29731b += i13;
                        }
                    }
                }
            } else {
                z10 = false;
            }
        }
        return z10;
    }
}
