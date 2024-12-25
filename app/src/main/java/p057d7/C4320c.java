package p057d7;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p027b9.InterfaceC0846i;
import p059d9.C4349a;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d7/c.class
 */
/* renamed from: d7.c */
/* loaded from: combined.jar:classes2.jar:d7/c.class */
public final class C4320c implements InterfaceC4324g {

    /* renamed from: b */
    public final InterfaceC0846i f26463b;

    /* renamed from: c */
    public final long f26464c;

    /* renamed from: d */
    public long f26465d;

    /* renamed from: f */
    public int f26467f;

    /* renamed from: g */
    public int f26468g;

    /* renamed from: e */
    public byte[] f26466e = new byte[65536];

    /* renamed from: a */
    public final byte[] f26462a = new byte[4096];

    public C4320c(InterfaceC0846i interfaceC0846i, long j10, long j11) {
        this.f26463b = interfaceC0846i;
        this.f26465d = j10;
        this.f26464c = j11;
    }

    @Override // p057d7.InterfaceC4324g
    /* renamed from: d */
    public boolean mo21800d(byte[] bArr, int i10, int i11, boolean z10) {
        if (!mo21810p(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f26466e, this.f26467f - i11, bArr, i10, i11);
        return true;
    }

    @Override // p057d7.InterfaceC4324g
    /* renamed from: f */
    public void mo21801f() {
        this.f26467f = 0;
    }

    @Override // p057d7.InterfaceC4324g
    /* renamed from: g */
    public boolean mo21802g(byte[] bArr, int i10, int i11, boolean z10) {
        int i12;
        int m21813s = m21813s(bArr, i10, i11);
        while (true) {
            i12 = m21813s;
            if (i12 >= i11 || i12 == -1) {
                break;
            }
            m21813s = m21814t(bArr, i10, i11, i12, z10);
        }
        m21803h(i12);
        return i12 != -1;
    }

    @Override // p057d7.InterfaceC4324g
    public long getLength() {
        return this.f26464c;
    }

    @Override // p057d7.InterfaceC4324g
    public long getPosition() {
        return this.f26465d;
    }

    /* renamed from: h */
    public final void m21803h(int i10) {
        if (i10 != -1) {
            this.f26465d += i10;
        }
    }

    @Override // p057d7.InterfaceC4324g
    /* renamed from: i */
    public long mo21804i() {
        return this.f26465d + this.f26467f;
    }

    @Override // p057d7.InterfaceC4324g
    /* renamed from: k */
    public void mo21805k(int i10) {
        mo21810p(i10, false);
    }

    @Override // p057d7.InterfaceC4324g
    /* renamed from: l */
    public int mo21806l(int i10) {
        int m21815u = m21815u(i10);
        int i11 = m21815u;
        if (m21815u == 0) {
            byte[] bArr = this.f26462a;
            i11 = m21814t(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        m21803h(i11);
        return i11;
    }

    @Override // p057d7.InterfaceC4324g
    /* renamed from: m */
    public <E extends Throwable> void mo21807m(long j10, E e10) {
        C4349a.m21878a(j10 >= 0);
        this.f26465d = j10;
        throw e10;
    }

    @Override // p057d7.InterfaceC4324g
    /* renamed from: n */
    public int mo21808n(byte[] bArr, int i10, int i11) {
        int min;
        m21812r(i11);
        int i12 = this.f26468g;
        int i13 = this.f26467f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            min = m21814t(this.f26466e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f26468g += min;
        } else {
            min = Math.min(i11, i14);
        }
        System.arraycopy(this.f26466e, this.f26467f, bArr, i10, min);
        this.f26467f += min;
        return min;
    }

    @Override // p057d7.InterfaceC4324g
    /* renamed from: o */
    public void mo21809o(int i10) {
        m21816v(i10, false);
    }

    @Override // p057d7.InterfaceC4324g
    /* renamed from: p */
    public boolean mo21810p(int i10, boolean z10) {
        m21812r(i10);
        int i11 = this.f26468g - this.f26467f;
        while (i11 < i10) {
            i11 = m21814t(this.f26466e, this.f26467f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f26468g = this.f26467f + i11;
        }
        this.f26467f += i10;
        return true;
    }

    @Override // p057d7.InterfaceC4324g
    /* renamed from: q */
    public void mo21811q(byte[] bArr, int i10, int i11) {
        mo21800d(bArr, i10, i11, false);
    }

    /* renamed from: r */
    public final void m21812r(int i10) {
        int i11 = this.f26467f + i10;
        byte[] bArr = this.f26466e;
        if (i11 > bArr.length) {
            this.f26466e = Arrays.copyOf(this.f26466e, C4401z0.m22409s(bArr.length * 2, 65536 + i11, i11 + NTLMEngineImpl.FLAG_REQUEST_NTLM2_SESSION));
        }
    }

    @Override // p057d7.InterfaceC4324g, p027b9.InterfaceC0846i
    public int read(byte[] bArr, int i10, int i11) {
        int m21813s = m21813s(bArr, i10, i11);
        int i12 = m21813s;
        if (m21813s == 0) {
            i12 = m21814t(bArr, i10, i11, 0, true);
        }
        m21803h(i12);
        return i12;
    }

    @Override // p057d7.InterfaceC4324g
    public void readFully(byte[] bArr, int i10, int i11) {
        mo21802g(bArr, i10, i11, false);
    }

    /* renamed from: s */
    public final int m21813s(byte[] bArr, int i10, int i11) {
        int i12 = this.f26468g;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.f26466e, 0, bArr, i10, min);
        m21817w(min);
        return min;
    }

    /* renamed from: t */
    public final int m21814t(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.f26463b.read(bArr, i10 + i12, i11 - i12);
        if (read != -1) {
            return i12 + read;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: u */
    public final int m21815u(int i10) {
        int min = Math.min(this.f26468g, i10);
        m21817w(min);
        return min;
    }

    /* renamed from: v */
    public boolean m21816v(int i10, boolean z10) {
        int i11;
        int m21815u = m21815u(i10);
        while (true) {
            i11 = m21815u;
            if (i11 >= i10 || i11 == -1) {
                break;
            }
            m21815u = m21814t(this.f26462a, -i11, Math.min(i10, this.f26462a.length + i11), i11, z10);
        }
        m21803h(i11);
        return i11 != -1;
    }

    /* renamed from: w */
    public final void m21817w(int i10) {
        int i11 = this.f26468g - i10;
        this.f26468g = i11;
        this.f26467f = 0;
        byte[] bArr = this.f26466e;
        byte[] bArr2 = i11 < bArr.length - NTLMEngineImpl.FLAG_REQUEST_NTLM2_SESSION ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f26466e = bArr2;
    }
}
