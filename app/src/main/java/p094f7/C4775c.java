package p094f7;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.C2345d;
import com.google.android.exoplayer2.extractor.C2346e;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import java.util.Map;
import p057d7.C4328k;
import p057d7.C4330m;
import p057d7.C4334q;
import p057d7.InterfaceC4323f;
import p057d7.InterfaceC4324g;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4329l;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4361f0;
import p059d9.C4401z0;
import p283q7.C7839a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:f7/c.class
 */
/* renamed from: f7.c */
/* loaded from: combined.jar:classes2.jar:f7/c.class */
public final class C4775c implements InterfaceC4323f {

    /* renamed from: o */
    public static final InterfaceC4329l f28123o = new InterfaceC4329l() { // from class: f7.b
        @Override // p057d7.InterfaceC4329l
        /* renamed from: a */
        public /* synthetic */ InterfaceC4323f[] mo12020a(Uri uri, Map map) {
            return C4328k.m21824a(this, uri, map);
        }

        @Override // p057d7.InterfaceC4329l
        /* renamed from: b */
        public final InterfaceC4323f[] mo12021b() {
            InterfaceC4323f[] m24168j;
            m24168j = C4775c.m24168j();
            return m24168j;
        }
    };

    /* renamed from: a */
    public final byte[] f28124a;

    /* renamed from: b */
    public final C4361f0 f28125b;

    /* renamed from: c */
    public final boolean f28126c;

    /* renamed from: d */
    public final C4330m.a f28127d;

    /* renamed from: e */
    public InterfaceC4325h f28128e;

    /* renamed from: f */
    public InterfaceC4337t f28129f;

    /* renamed from: g */
    public int f28130g;

    /* renamed from: h */
    public C7839a f28131h;

    /* renamed from: i */
    public FlacStreamMetadata f28132i;

    /* renamed from: j */
    public int f28133j;

    /* renamed from: k */
    public int f28134k;

    /* renamed from: l */
    public C4773a f28135l;

    /* renamed from: m */
    public int f28136m;

    /* renamed from: n */
    public long f28137n;

    public C4775c() {
        this(0);
    }

    public C4775c(int i10) {
        this.f28124a = new byte[42];
        this.f28125b = new C4361f0(new byte[32768], 0);
        this.f28126c = (i10 & 1) == 0 ? false : true;
        this.f28127d = new C4330m.a();
        this.f28130g = 0;
    }

    /* renamed from: j */
    public static /* synthetic */ InterfaceC4323f[] m24168j() {
        return new InterfaceC4323f[]{new C4775c()};
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: a */
    public void mo12027a(long j10, long j11) {
        if (j10 == 0) {
            this.f28130g = 0;
        } else {
            C4773a c4773a = this.f28135l;
            if (c4773a != null) {
                c4773a.m12064h(j11);
            }
        }
        this.f28137n = j11 == 0 ? 0L : -1L;
        this.f28136m = 0;
        this.f28125b.m21979L(0);
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: c */
    public void mo12028c(InterfaceC4325h interfaceC4325h) {
        this.f28128e = interfaceC4325h;
        this.f28129f = interfaceC4325h.mo479e(0, 1);
        interfaceC4325h.mo491u();
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: d */
    public boolean mo12029d(InterfaceC4324g interfaceC4324g) {
        C2345d.m12100c(interfaceC4324g, false);
        return C2345d.m12098a(interfaceC4324g);
    }

    /* renamed from: e */
    public final long m24169e(C4361f0 c4361f0, boolean z10) {
        boolean z11;
        C4349a.m21882e(this.f28132i);
        int m21989e = c4361f0.m21989e();
        while (true) {
            if (m21989e > c4361f0.m21990f() - 16) {
                if (!z10) {
                    c4361f0.m21983P(m21989e);
                    return -1L;
                }
                while (m21989e <= c4361f0.m21990f() - this.f28133j) {
                    c4361f0.m21983P(m21989e);
                    try {
                        z11 = C4330m.m21829d(c4361f0, this.f28132i, this.f28134k, this.f28127d);
                    } catch (IndexOutOfBoundsException e10) {
                        z11 = false;
                    }
                    if (c4361f0.m21989e() > c4361f0.m21990f()) {
                        z11 = false;
                    }
                    if (!z11) {
                        m21989e++;
                    }
                }
                c4361f0.m21983P(c4361f0.m21990f());
                return -1L;
            }
            c4361f0.m21983P(m21989e);
            if (C4330m.m21829d(c4361f0, this.f28132i, this.f28134k, this.f28127d)) {
                break;
            }
            m21989e++;
        }
        c4361f0.m21983P(m21989e);
        return this.f28127d.f26485a;
    }

    /* renamed from: f */
    public final void m24170f(InterfaceC4324g interfaceC4324g) {
        this.f28134k = C2345d.m12099b(interfaceC4324g);
        ((InterfaceC4325h) C4401z0.m22391j(this.f28128e)).mo487p(m24171g(interfaceC4324g.getPosition(), interfaceC4324g.getLength()));
        this.f28130g = 5;
    }

    /* renamed from: g */
    public final InterfaceC2348g m24171g(long j10, long j11) {
        C4349a.m21882e(this.f28132i);
        FlacStreamMetadata flacStreamMetadata = this.f28132i;
        if (flacStreamMetadata.seekTable != null) {
            return new C2346e(flacStreamMetadata, j10);
        }
        if (j11 == -1 || flacStreamMetadata.totalSamples <= 0) {
            return new InterfaceC2348g.b(flacStreamMetadata.getDurationUs());
        }
        C4773a c4773a = new C4773a(flacStreamMetadata, this.f28134k, j10, j11);
        this.f28135l = c4773a;
        return c4773a.m12059b();
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: h */
    public int mo12033h(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        int i10 = this.f28130g;
        if (i10 == 0) {
            m24175m(interfaceC4324g);
            return 0;
        }
        if (i10 == 1) {
            m24172i(interfaceC4324g);
            return 0;
        }
        if (i10 == 2) {
            m24177o(interfaceC4324g);
            return 0;
        }
        if (i10 == 3) {
            m24176n(interfaceC4324g);
            return 0;
        }
        if (i10 == 4) {
            m24170f(interfaceC4324g);
            return 0;
        }
        if (i10 == 5) {
            return m24174l(interfaceC4324g, c4334q);
        }
        throw new IllegalStateException();
    }

    /* renamed from: i */
    public final void m24172i(InterfaceC4324g interfaceC4324g) {
        byte[] bArr = this.f28124a;
        interfaceC4324g.mo21811q(bArr, 0, bArr.length);
        interfaceC4324g.mo21801f();
        this.f28130g = 2;
    }

    /* renamed from: k */
    public final void m24173k() {
        ((InterfaceC4337t) C4401z0.m22391j(this.f28129f)).mo600b((this.f28137n * 1000000) / ((FlacStreamMetadata) C4401z0.m22391j(this.f28132i)).sampleRate, 1, this.f28136m, 0, null);
    }

    /* renamed from: l */
    public final int m24174l(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        boolean z10;
        C4349a.m21882e(this.f28129f);
        C4349a.m21882e(this.f28132i);
        C4773a c4773a = this.f28135l;
        if (c4773a != null && c4773a.m12061d()) {
            return this.f28135l.m12060c(interfaceC4324g, c4334q);
        }
        if (this.f28137n == -1) {
            this.f28137n = C4330m.m21834i(interfaceC4324g, this.f28132i);
            return 0;
        }
        int m21990f = this.f28125b.m21990f();
        if (m21990f < 32768) {
            int read = interfaceC4324g.read(this.f28125b.m21988d(), m21990f, 32768 - m21990f);
            z10 = read == -1;
            if (!z10) {
                this.f28125b.m21982O(m21990f + read);
            } else if (this.f28125b.m21985a() == 0) {
                m24173k();
                return -1;
            }
        } else {
            z10 = false;
        }
        int m21989e = this.f28125b.m21989e();
        int i10 = this.f28136m;
        int i11 = this.f28133j;
        if (i10 < i11) {
            C4361f0 c4361f0 = this.f28125b;
            c4361f0.m21984Q(Math.min(i11 - i10, c4361f0.m21985a()));
        }
        long m24169e = m24169e(this.f28125b, z10);
        int m21989e2 = this.f28125b.m21989e() - m21989e;
        this.f28125b.m21983P(m21989e);
        this.f28129f.mo606e(this.f28125b, m21989e2);
        this.f28136m += m21989e2;
        if (m24169e != -1) {
            m24173k();
            this.f28136m = 0;
            this.f28137n = m24169e;
        }
        if (this.f28125b.m21985a() >= 16) {
            return 0;
        }
        int m21985a = this.f28125b.m21985a();
        System.arraycopy(this.f28125b.m21988d(), this.f28125b.m21989e(), this.f28125b.m21988d(), 0, m21985a);
        this.f28125b.m21983P(0);
        this.f28125b.m21982O(m21985a);
        return 0;
    }

    /* renamed from: m */
    public final void m24175m(InterfaceC4324g interfaceC4324g) {
        this.f28131h = C2345d.m12101d(interfaceC4324g, !this.f28126c);
        this.f28130g = 1;
    }

    /* renamed from: n */
    public final void m24176n(InterfaceC4324g interfaceC4324g) {
        C2345d.a aVar = new C2345d.a(this.f28132i);
        boolean z10 = false;
        while (!z10) {
            z10 = C2345d.m12102e(interfaceC4324g, aVar);
            this.f28132i = (FlacStreamMetadata) C4401z0.m22391j(aVar.f13801a);
        }
        C4349a.m21882e(this.f28132i);
        this.f28133j = Math.max(this.f28132i.minFrameSize, 6);
        ((InterfaceC4337t) C4401z0.m22391j(this.f28129f)).mo608f(this.f28132i.getFormat(this.f28124a, this.f28131h));
        this.f28130g = 4;
    }

    /* renamed from: o */
    public final void m24177o(InterfaceC4324g interfaceC4324g) {
        C2345d.m12107j(interfaceC4324g);
        this.f28130g = 3;
    }

    @Override // p057d7.InterfaceC4323f
    public void release() {
    }
}
