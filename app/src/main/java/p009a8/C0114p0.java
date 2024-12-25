package p009a8;

import java.io.EOFException;
import java.nio.ByteBuffer;
import p009a8.C0118r0;
import p027b9.C0830a;
import p027b9.InterfaceC0832b;
import p027b9.InterfaceC0846i;
import p059d9.C4361f0;
import p332t6.C8638f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/p0.class
 */
/* renamed from: a8.p0 */
/* loaded from: combined.jar:classes2.jar:a8/p0.class */
public class C0114p0 {

    /* renamed from: a */
    public final InterfaceC0832b f473a;

    /* renamed from: b */
    public final int f474b;

    /* renamed from: c */
    public final C4361f0 f475c;

    /* renamed from: d */
    public a f476d;

    /* renamed from: e */
    public a f477e;

    /* renamed from: f */
    public a f478f;

    /* renamed from: g */
    public long f479g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/p0$a.class
     */
    /* renamed from: a8.p0$a */
    /* loaded from: combined.jar:classes2.jar:a8/p0$a.class */
    public static final class a {

        /* renamed from: a */
        public final long f480a;

        /* renamed from: b */
        public final long f481b;

        /* renamed from: c */
        public boolean f482c;

        /* renamed from: d */
        public C0830a f483d;

        /* renamed from: e */
        public a f484e;

        public a(long j10, int i10) {
            this.f480a = j10;
            this.f481b = j10 + i10;
        }

        /* renamed from: a */
        public a m555a() {
            this.f483d = null;
            a aVar = this.f484e;
            this.f484e = null;
            return aVar;
        }

        /* renamed from: b */
        public void m556b(C0830a c0830a, a aVar) {
            this.f483d = c0830a;
            this.f484e = aVar;
            this.f482c = true;
        }

        /* renamed from: c */
        public int m557c(long j10) {
            return ((int) (j10 - this.f480a)) + this.f483d.f5737b;
        }
    }

    public C0114p0(InterfaceC0832b interfaceC0832b) {
        this.f473a = interfaceC0832b;
        int mo5304e = interfaceC0832b.mo5304e();
        this.f474b = mo5304e;
        this.f475c = new C4361f0(32);
        a aVar = new a(0L, mo5304e);
        this.f476d = aVar;
        this.f477e = aVar;
        this.f478f = aVar;
    }

    /* renamed from: d */
    public static a m538d(a aVar, long j10) {
        while (j10 >= aVar.f481b) {
            aVar = aVar.f484e;
        }
        return aVar;
    }

    /* renamed from: i */
    public static a m539i(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a m538d = m538d(aVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (m538d.f481b - j10));
            byteBuffer.put(m538d.f483d.f5736a, m538d.m557c(j10), min);
            int i11 = i10 - min;
            long j11 = j10 + min;
            j10 = j11;
            i10 = i11;
            if (j11 == m538d.f481b) {
                m538d = m538d.f484e;
                j10 = j11;
                i10 = i11;
            }
        }
        return m538d;
    }

    /* renamed from: j */
    public static a m540j(a aVar, long j10, byte[] bArr, int i10) {
        a m538d = m538d(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (m538d.f481b - j10));
            System.arraycopy(m538d.f483d.f5736a, m538d.m557c(j10), bArr, i10 - i11, min);
            int i12 = i11 - min;
            long j11 = j10 + min;
            i11 = i12;
            j10 = j11;
            if (j11 == m538d.f481b) {
                m538d = m538d.f484e;
                i11 = i12;
                j10 = j11;
            }
        }
        return m538d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ba, code lost:
    
        if (r0.length < r15) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d7, code lost:
    
        if (r0.length < r15) goto L23;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p009a8.C0114p0.a m541k(p009a8.C0114p0.a r10, p332t6.C8638f r11, p009a8.C0118r0.b r12, p059d9.C4361f0 r13) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0114p0.m541k(a8.p0$a, t6.f, a8.r0$b, d9.f0):a8.p0$a");
    }

    /* renamed from: l */
    public static a m542l(a aVar, C8638f c8638f, C0118r0.b bVar, C4361f0 c4361f0) {
        long j10;
        ByteBuffer byteBuffer;
        a aVar2 = aVar;
        if (c8638f.m37083h()) {
            aVar2 = m541k(aVar, c8638f, bVar, c4361f0);
        }
        if (c8638f.hasSupplementalData()) {
            c4361f0.m21979L(4);
            a m540j = m540j(aVar2, bVar.f540b, c4361f0.m21988d(), 4);
            int m21975H = c4361f0.m21975H();
            bVar.f540b += 4;
            bVar.f539a -= 4;
            c8638f.m37081f(m21975H);
            aVar2 = m539i(m540j, bVar.f540b, c8638f.f40327c, m21975H);
            bVar.f540b += m21975H;
            int i10 = bVar.f539a - m21975H;
            bVar.f539a = i10;
            c8638f.m37084j(i10);
            j10 = bVar.f540b;
            byteBuffer = c8638f.f40330f;
        } else {
            c8638f.m37081f(bVar.f539a);
            j10 = bVar.f540b;
            byteBuffer = c8638f.f40327c;
        }
        return m539i(aVar2, j10, byteBuffer, bVar.f539a);
    }

    /* renamed from: a */
    public final void m543a(a aVar) {
        if (aVar.f482c) {
            a aVar2 = this.f478f;
            int i10 = (aVar2.f482c ? 1 : 0) + (((int) (aVar2.f480a - aVar.f480a)) / this.f474b);
            C0830a[] c0830aArr = new C0830a[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                c0830aArr[i11] = aVar.f483d;
                aVar = aVar.m555a();
            }
            this.f473a.mo5301b(c0830aArr);
        }
    }

    /* renamed from: b */
    public void m544b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f476d;
            if (j10 < aVar.f481b) {
                break;
            }
            this.f473a.mo5302c(aVar.f483d);
            this.f476d = this.f476d.m555a();
        }
        if (this.f477e.f480a < aVar.f480a) {
            this.f477e = aVar;
        }
    }

    /* renamed from: c */
    public void m545c(long j10) {
        this.f479g = j10;
        if (j10 != 0) {
            a aVar = this.f476d;
            a aVar2 = aVar;
            if (j10 != aVar.f480a) {
                while (this.f479g > aVar2.f481b) {
                    aVar2 = aVar2.f484e;
                }
                a aVar3 = aVar2.f484e;
                m543a(aVar3);
                a aVar4 = new a(aVar2.f481b, this.f474b);
                aVar2.f484e = aVar4;
                a aVar5 = aVar2;
                if (this.f479g == aVar2.f481b) {
                    aVar5 = aVar4;
                }
                this.f478f = aVar5;
                if (this.f477e == aVar3) {
                    this.f477e = aVar4;
                    return;
                }
                return;
            }
        }
        m543a(this.f476d);
        a aVar6 = new a(this.f479g, this.f474b);
        this.f476d = aVar6;
        this.f477e = aVar6;
        this.f478f = aVar6;
    }

    /* renamed from: e */
    public long m546e() {
        return this.f479g;
    }

    /* renamed from: f */
    public void m547f(C8638f c8638f, C0118r0.b bVar) {
        m542l(this.f477e, c8638f, bVar, this.f475c);
    }

    /* renamed from: g */
    public final void m548g(int i10) {
        long j10 = this.f479g + i10;
        this.f479g = j10;
        a aVar = this.f478f;
        if (j10 == aVar.f481b) {
            this.f478f = aVar.f484e;
        }
    }

    /* renamed from: h */
    public final int m549h(int i10) {
        a aVar = this.f478f;
        if (!aVar.f482c) {
            aVar.m556b(this.f473a.mo5300a(), new a(this.f478f.f481b, this.f474b));
        }
        return Math.min(i10, (int) (this.f478f.f481b - this.f479g));
    }

    /* renamed from: m */
    public void m550m(C8638f c8638f, C0118r0.b bVar) {
        this.f477e = m542l(this.f477e, c8638f, bVar, this.f475c);
    }

    /* renamed from: n */
    public void m551n() {
        m543a(this.f476d);
        a aVar = new a(0L, this.f474b);
        this.f476d = aVar;
        this.f477e = aVar;
        this.f478f = aVar;
        this.f479g = 0L;
        this.f473a.mo5303d();
    }

    /* renamed from: o */
    public void m552o() {
        this.f477e = this.f476d;
    }

    /* renamed from: p */
    public int m553p(InterfaceC0846i interfaceC0846i, int i10, boolean z10) {
        int m549h = m549h(i10);
        a aVar = this.f478f;
        int read = interfaceC0846i.read(aVar.f483d.f5736a, aVar.m557c(this.f479g), m549h);
        if (read != -1) {
            m548g(read);
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: q */
    public void m554q(C4361f0 c4361f0, int i10) {
        while (i10 > 0) {
            int m549h = m549h(i10);
            a aVar = this.f478f;
            c4361f0.m21994j(aVar.f483d.f5736a, aVar.m557c(this.f479g), m549h);
            i10 -= m549h;
            m548g(m549h);
        }
    }
}
