package p301r6;

import java.nio.ByteBuffer;
import p059d9.C4349a;
import p059d9.C4401z0;
import p301r6.InterfaceC7980h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/m0.class
 */
/* renamed from: r6.m0 */
/* loaded from: combined.jar:classes2.jar:r6/m0.class */
public final class C7991m0 extends AbstractC8008z {

    /* renamed from: i */
    public final long f38643i;

    /* renamed from: j */
    public final long f38644j;

    /* renamed from: k */
    public final short f38645k;

    /* renamed from: l */
    public int f38646l;

    /* renamed from: m */
    public boolean f38647m;

    /* renamed from: n */
    public byte[] f38648n;

    /* renamed from: o */
    public byte[] f38649o;

    /* renamed from: p */
    public int f38650p;

    /* renamed from: q */
    public int f38651q;

    /* renamed from: r */
    public int f38652r;

    /* renamed from: s */
    public boolean f38653s;

    /* renamed from: t */
    public long f38654t;

    public C7991m0() {
        this(150000L, 20000L, (short) 1024);
    }

    public C7991m0(long j10, long j11, short s10) {
        C4349a.m21878a(j11 <= j10);
        this.f38643i = j10;
        this.f38644j = j11;
        this.f38645k = s10;
        byte[] bArr = C4401z0.f26684f;
        this.f38648n = bArr;
        this.f38649o = bArr;
    }

    @Override // p301r6.InterfaceC7980h
    /* renamed from: c */
    public void mo34531c(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !m34845f()) {
            int i10 = this.f38650p;
            if (i10 == 0) {
                m34746s(byteBuffer);
            } else if (i10 == 1) {
                m34745r(byteBuffer);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                m34747t(byteBuffer);
            }
        }
    }

    @Override // p301r6.AbstractC8008z
    /* renamed from: g */
    public InterfaceC7980h.a mo34532g(InterfaceC7980h.a aVar) {
        if (aVar.f38604c != 2) {
            throw new InterfaceC7980h.b(aVar);
        }
        if (!this.f38647m) {
            aVar = InterfaceC7980h.a.f38601e;
        }
        return aVar;
    }

    @Override // p301r6.AbstractC8008z
    /* renamed from: h */
    public void mo34533h() {
        if (this.f38647m) {
            this.f38646l = this.f38771b.f38605d;
            int m34739l = m34739l(this.f38643i) * this.f38646l;
            if (this.f38648n.length != m34739l) {
                this.f38648n = new byte[m34739l];
            }
            int m34739l2 = m34739l(this.f38644j) * this.f38646l;
            this.f38652r = m34739l2;
            if (this.f38649o.length != m34739l2) {
                this.f38649o = new byte[m34739l2];
            }
        }
        this.f38650p = 0;
        this.f38654t = 0L;
        this.f38651q = 0;
        this.f38653s = false;
    }

    @Override // p301r6.AbstractC8008z
    /* renamed from: i */
    public void mo34738i() {
        int i10 = this.f38651q;
        if (i10 > 0) {
            m34744q(this.f38648n, i10);
        }
        if (this.f38653s) {
            return;
        }
        this.f38654t += this.f38652r / this.f38646l;
    }

    @Override // p301r6.AbstractC8008z, p301r6.InterfaceC7980h
    public boolean isActive() {
        return this.f38647m;
    }

    @Override // p301r6.AbstractC8008z
    /* renamed from: j */
    public void mo34534j() {
        this.f38647m = false;
        this.f38652r = 0;
        byte[] bArr = C4401z0.f26684f;
        this.f38648n = bArr;
        this.f38649o = bArr;
    }

    /* renamed from: l */
    public final int m34739l(long j10) {
        return (int) ((j10 * this.f38771b.f38602a) / 1000000);
    }

    /* renamed from: m */
    public final int m34740m(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 2; limit >= byteBuffer.position(); limit -= 2) {
            if (Math.abs((int) byteBuffer.getShort(limit)) > this.f38645k) {
                int i10 = this.f38646l;
                return ((limit / i10) * i10) + i10;
            }
        }
        return byteBuffer.position();
    }

    /* renamed from: n */
    public final int m34741n(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f38645k) {
                int i10 = this.f38646l;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: o */
    public long m34742o() {
        return this.f38654t;
    }

    /* renamed from: p */
    public final void m34743p(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        m34846k(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f38653s = true;
        }
    }

    /* renamed from: q */
    public final void m34744q(byte[] bArr, int i10) {
        m34846k(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f38653s = true;
        }
    }

    /* renamed from: r */
    public final void m34745r(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int m34741n = m34741n(byteBuffer);
        int position = m34741n - byteBuffer.position();
        byte[] bArr = this.f38648n;
        int length = bArr.length;
        int i10 = this.f38651q;
        int i11 = length - i10;
        if (m34741n < limit && position < i11) {
            m34744q(bArr, i10);
            this.f38651q = 0;
            this.f38650p = 0;
            return;
        }
        int min = Math.min(position, i11);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f38648n, this.f38651q, min);
        int i12 = this.f38651q + min;
        this.f38651q = i12;
        byte[] bArr2 = this.f38648n;
        if (i12 == bArr2.length) {
            if (this.f38653s) {
                m34744q(bArr2, this.f38652r);
                this.f38654t += (this.f38651q - (this.f38652r * 2)) / this.f38646l;
            } else {
                this.f38654t += (i12 - this.f38652r) / this.f38646l;
            }
            m34749v(byteBuffer, this.f38648n, this.f38651q);
            this.f38651q = 0;
            this.f38650p = 2;
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: s */
    public final void m34746s(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f38648n.length));
        int m34740m = m34740m(byteBuffer);
        if (m34740m == byteBuffer.position()) {
            this.f38650p = 1;
        } else {
            byteBuffer.limit(m34740m);
            m34743p(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: t */
    public final void m34747t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int m34741n = m34741n(byteBuffer);
        byteBuffer.limit(m34741n);
        this.f38654t += byteBuffer.remaining() / this.f38646l;
        m34749v(byteBuffer, this.f38649o, this.f38652r);
        if (m34741n < limit) {
            m34744q(this.f38649o, this.f38652r);
            this.f38650p = 0;
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: u */
    public void m34748u(boolean z10) {
        this.f38647m = z10;
    }

    /* renamed from: v */
    public final void m34749v(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f38652r);
        int i11 = this.f38652r - min;
        System.arraycopy(bArr, i10 - i11, this.f38649o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f38649o, i11, min);
    }
}
