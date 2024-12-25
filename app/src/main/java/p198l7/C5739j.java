package p198l7;

import com.google.android.exoplayer2.extractor.C2349h;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p059d9.C4349a;
import p059d9.C4361f0;
import p198l7.AbstractC5738i;
import p267p6.C7594k1;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l7/j.class
 */
/* renamed from: l7.j */
/* loaded from: combined.jar:classes2.jar:l7/j.class */
public final class C5739j extends AbstractC5738i {

    /* renamed from: n */
    public a f32153n;

    /* renamed from: o */
    public int f32154o;

    /* renamed from: p */
    public boolean f32155p;

    /* renamed from: q */
    public C2349h.d f32156q;

    /* renamed from: r */
    public C2349h.b f32157r;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:l7/j$a.class
     */
    /* renamed from: l7.j$a */
    /* loaded from: combined.jar:classes2.jar:l7/j$a.class */
    public static final class a {

        /* renamed from: a */
        public final C2349h.d f32158a;

        /* renamed from: b */
        public final C2349h.b f32159b;

        /* renamed from: c */
        public final byte[] f32160c;

        /* renamed from: d */
        public final C2349h.c[] f32161d;

        /* renamed from: e */
        public final int f32162e;

        public a(C2349h.d dVar, C2349h.b bVar, byte[] bArr, C2349h.c[] cVarArr, int i10) {
            this.f32158a = dVar;
            this.f32159b = bVar;
            this.f32160c = bArr;
            this.f32161d = cVarArr;
            this.f32162e = i10;
        }
    }

    /* renamed from: n */
    public static void m28127n(C4361f0 c4361f0, long j10) {
        if (c4361f0.m21986b() < c4361f0.m21990f() + 4) {
            c4361f0.m21980M(Arrays.copyOf(c4361f0.m21988d(), c4361f0.m21990f() + 4));
        } else {
            c4361f0.m21982O(c4361f0.m21990f() + 4);
        }
        byte[] m21988d = c4361f0.m21988d();
        m21988d[c4361f0.m21990f() - 4] = (byte) (j10 & 255);
        m21988d[c4361f0.m21990f() - 3] = (byte) ((j10 >>> 8) & 255);
        m21988d[c4361f0.m21990f() - 2] = (byte) ((j10 >>> 16) & 255);
        m21988d[c4361f0.m21990f() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    /* renamed from: o */
    public static int m28128o(byte b10, a aVar) {
        return !aVar.f32161d[m28129p(b10, aVar.f32162e, 1)].f13820a ? aVar.f32158a.f13830g : aVar.f32158a.f13831h;
    }

    /* renamed from: p */
    public static int m28129p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    /* renamed from: r */
    public static boolean m28130r(C4361f0 c4361f0) {
        try {
            return C2349h.m12121l(1, c4361f0, true);
        } catch (C7594k1 e10) {
            return false;
        }
    }

    @Override // p198l7.AbstractC5738i
    /* renamed from: e */
    public void mo28121e(long j10) {
        super.mo28121e(j10);
        int i10 = 0;
        this.f32155p = j10 != 0;
        C2349h.d dVar = this.f32156q;
        if (dVar != null) {
            i10 = dVar.f13830g;
        }
        this.f32154o = i10;
    }

    @Override // p198l7.AbstractC5738i
    /* renamed from: f */
    public long mo28096f(C4361f0 c4361f0) {
        int i10 = 0;
        if ((c4361f0.m21988d()[0] & 1) == 1) {
            return -1L;
        }
        int m28128o = m28128o(c4361f0.m21988d()[0], (a) C4349a.m21886i(this.f32153n));
        if (this.f32155p) {
            i10 = (this.f32154o + m28128o) / 4;
        }
        long j10 = i10;
        m28127n(c4361f0, j10);
        this.f32155p = true;
        this.f32154o = m28128o;
        return j10;
    }

    @Override // p198l7.AbstractC5738i
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: i */
    public boolean mo28097i(C4361f0 c4361f0, long j10, AbstractC5738i.b bVar) {
        if (this.f32153n != null) {
            C4349a.m21882e(bVar.f32151a);
            return false;
        }
        a m28131q = m28131q(c4361f0);
        this.f32153n = m28131q;
        if (m28131q == null) {
            return true;
        }
        C2349h.d dVar = m28131q.f32158a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f13833j);
        arrayList.add(m28131q.f32160c);
        bVar.f32151a = new C7629w0.b().m33220e0("audio/vorbis").m33196G(dVar.f13828e).m33215Z(dVar.f13827d).m33197H(dVar.f13825b).m33221f0(dVar.f13826c).m33209T(arrayList).m33194E();
        return true;
    }

    @Override // p198l7.AbstractC5738i
    /* renamed from: l */
    public void mo28098l(boolean z10) {
        super.mo28098l(z10);
        if (z10) {
            this.f32153n = null;
            this.f32156q = null;
            this.f32157r = null;
        }
        this.f32154o = 0;
        this.f32155p = false;
    }

    /* renamed from: q */
    public a m28131q(C4361f0 c4361f0) {
        C2349h.d dVar = this.f32156q;
        if (dVar == null) {
            this.f32156q = C2349h.m12119j(c4361f0);
            return null;
        }
        C2349h.b bVar = this.f32157r;
        if (bVar == null) {
            this.f32157r = C2349h.m12117h(c4361f0);
            return null;
        }
        byte[] bArr = new byte[c4361f0.m21990f()];
        System.arraycopy(c4361f0.m21988d(), 0, bArr, 0, c4361f0.m21990f());
        C2349h.c[] m12120k = C2349h.m12120k(c4361f0, dVar.f13825b);
        return new a(dVar, bVar, bArr, m12120k, C2349h.m12110a(m12120k.length - 1));
    }
}
