package p078e9;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.video.VideoDecoderOutputBuffer;
import p059d9.C4349a;
import p059d9.C4387s0;
import p059d9.C4391u0;
import p059d9.C4392v;
import p078e9.InterfaceC4668c0;
import p267p6.AbstractC7575f;
import p267p6.C7583h;
import p267p6.C7629w0;
import p267p6.C7632x0;
import p332t6.C8636d;
import p332t6.C8637e;
import p332t6.C8638f;
import p332t6.C8639g;
import p332t6.InterfaceC8635c;
import p365v6.C9275o;
import p365v6.InterfaceC9277p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e9/c.class
 */
/* renamed from: e9.c */
/* loaded from: combined.jar:classes2.jar:e9/c.class */
public abstract class AbstractC4667c extends AbstractC7575f {

    /* renamed from: A */
    public InterfaceC4678l f27517A;

    /* renamed from: B */
    public InterfaceC4679m f27518B;

    /* renamed from: C */
    public InterfaceC9277p f27519C;

    /* renamed from: D */
    public InterfaceC9277p f27520D;

    /* renamed from: E */
    public int f27521E;

    /* renamed from: F */
    public boolean f27522F;

    /* renamed from: G */
    public boolean f27523G;

    /* renamed from: H */
    public boolean f27524H;

    /* renamed from: I */
    public boolean f27525I;

    /* renamed from: J */
    public long f27526J;

    /* renamed from: K */
    public long f27527K;

    /* renamed from: L */
    public boolean f27528L;

    /* renamed from: M */
    public boolean f27529M;

    /* renamed from: N */
    public boolean f27530N;

    /* renamed from: O */
    public C4670d0 f27531O;

    /* renamed from: P */
    public long f27532P;

    /* renamed from: Q */
    public int f27533Q;

    /* renamed from: R */
    public int f27534R;

    /* renamed from: S */
    public int f27535S;

    /* renamed from: T */
    public long f27536T;

    /* renamed from: U */
    public long f27537U;

    /* renamed from: V */
    public C8636d f27538V;

    /* renamed from: n */
    public final long f27539n;

    /* renamed from: o */
    public final int f27540o;

    /* renamed from: p */
    public final InterfaceC4668c0.a f27541p;

    /* renamed from: q */
    public final C4387s0<C7629w0> f27542q;

    /* renamed from: r */
    public final C8638f f27543r;

    /* renamed from: s */
    public C7629w0 f27544s;

    /* renamed from: t */
    public C7629w0 f27545t;

    /* renamed from: u */
    public InterfaceC8635c<C4677k, ? extends VideoDecoderOutputBuffer, ? extends C8637e> f27546u;

    /* renamed from: v */
    public C4677k f27547v;

    /* renamed from: w */
    public VideoDecoderOutputBuffer f27548w;

    /* renamed from: x */
    public int f27549x;

    /* renamed from: y */
    public Object f27550y;

    /* renamed from: z */
    public Surface f27551z;

    public AbstractC4667c(long j10, Handler handler, InterfaceC4668c0 interfaceC4668c0, int i10) {
        super(2);
        this.f27539n = j10;
        this.f27540o = i10;
        this.f27527K = -9223372036854775807L;
        m23412N();
        this.f27542q = new C4387s0<>();
        this.f27543r = C8638f.m37079i();
        this.f27541p = new InterfaceC4668c0.a(handler, interfaceC4668c0);
        this.f27521E = 0;
        this.f27549x = -1;
    }

    /* renamed from: U */
    public static boolean m23403U(long j10) {
        return j10 < -30000;
    }

    /* renamed from: V */
    public static boolean m23404V(long j10) {
        return j10 < -500000;
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: C */
    public void mo23405C() {
        this.f27544s = null;
        m23412N();
        m23411M();
        try {
            m23441r0(null);
            m23435k0();
        } finally {
            this.f27541p.m23484m(this.f27538V);
        }
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: D */
    public void mo23406D(boolean z10, boolean z11) {
        C8636d c8636d = new C8636d();
        this.f27538V = c8636d;
        this.f27541p.m23486o(c8636d);
        this.f27524H = z11;
        this.f27525I = false;
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: E */
    public void mo23407E(long j10, boolean z10) {
        this.f27529M = false;
        this.f27530N = false;
        m23411M();
        this.f27526J = -9223372036854775807L;
        this.f27534R = 0;
        if (this.f27546u != null) {
            m23416S();
        }
        if (z10) {
            m23438p0();
        } else {
            this.f27527K = -9223372036854775807L;
        }
        this.f27542q.m22228c();
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: G */
    public void mo23408G() {
        this.f27533Q = 0;
        this.f27532P = SystemClock.elapsedRealtime();
        this.f27536T = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: H */
    public void mo23409H() {
        this.f27527K = -9223372036854775807L;
        m23420Y();
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: I */
    public void mo23410I(C7629w0[] c7629w0Arr, long j10, long j11) {
        this.f27537U = j11;
        super.mo23410I(c7629w0Arr, j10, j11);
    }

    /* renamed from: L */
    public C8639g mo5979L(String str, C7629w0 c7629w0, C7629w0 c7629w02) {
        return new C8639g(str, c7629w0, c7629w02, 0, 1);
    }

    /* renamed from: M */
    public final void m23411M() {
        this.f27523G = false;
    }

    /* renamed from: N */
    public final void m23412N() {
        this.f27531O = null;
    }

    /* renamed from: O */
    public abstract InterfaceC8635c<C4677k, ? extends VideoDecoderOutputBuffer, ? extends C8637e> mo5980O(C7629w0 c7629w0, ExoMediaCrypto exoMediaCrypto);

    /* renamed from: P */
    public final boolean m23413P(long j10, long j11) {
        if (this.f27548w == null) {
            VideoDecoderOutputBuffer mo33481b = this.f27546u.mo33481b();
            this.f27548w = mo33481b;
            if (mo33481b == null) {
                return false;
            }
            C8636d c8636d = this.f27538V;
            int i10 = c8636d.f40320f;
            int i11 = mo33481b.skippedOutputBufferCount;
            c8636d.f40320f = i10 + i11;
            this.f27535S -= i11;
        }
        if (!this.f27548w.isEndOfStream()) {
            boolean m23434j0 = m23434j0(j10, j11);
            if (m23434j0) {
                m23431h0(this.f27548w.timeUs);
                this.f27548w = null;
            }
            return m23434j0;
        }
        if (this.f27521E == 2) {
            m23435k0();
            m23419X();
            return false;
        }
        this.f27548w.release();
        this.f27548w = null;
        this.f27530N = true;
        return false;
    }

    /* renamed from: Q */
    public void m23414Q(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        m23446w0(1);
        videoDecoderOutputBuffer.release();
    }

    /* renamed from: R */
    public final boolean m23415R() {
        InterfaceC8635c<C4677k, ? extends VideoDecoderOutputBuffer, ? extends C8637e> interfaceC8635c = this.f27546u;
        if (interfaceC8635c == null || this.f27521E == 2 || this.f27529M) {
            return false;
        }
        if (this.f27547v == null) {
            C4677k mo33547d = interfaceC8635c.mo33547d();
            this.f27547v = mo33547d;
            if (mo33547d == null) {
                return false;
            }
        }
        if (this.f27521E == 1) {
            this.f27547v.setFlags(4);
            this.f27546u.mo33546c(this.f27547v);
            this.f27547v = null;
            this.f27521E = 2;
            return false;
        }
        C7632x0 m32714y = m32714y();
        int m32698J = m32698J(m32714y, this.f27547v, 0);
        if (m32698J == -5) {
            m23426d0(m32714y);
            return true;
        }
        if (m32698J != -4) {
            if (m32698J == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (this.f27547v.isEndOfStream()) {
            this.f27529M = true;
            this.f27546u.mo33546c(this.f27547v);
            this.f27547v = null;
            return false;
        }
        if (this.f27528L) {
            this.f27542q.m22226a(this.f27547v.f40329e, this.f27544s);
            this.f27528L = false;
        }
        this.f27547v.m37082g();
        C4677k c4677k = this.f27547v;
        c4677k.f27651i = this.f27544s;
        m23433i0(c4677k);
        this.f27546u.mo33546c(this.f27547v);
        this.f27535S++;
        this.f27522F = true;
        this.f27538V.f40317c++;
        this.f27547v = null;
        return true;
    }

    /* renamed from: S */
    public void m23416S() {
        this.f27535S = 0;
        if (this.f27521E != 0) {
            m23435k0();
            m23419X();
            return;
        }
        this.f27547v = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.f27548w;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.f27548w = null;
        }
        this.f27546u.flush();
        this.f27522F = false;
    }

    /* renamed from: T */
    public final boolean m23417T() {
        return this.f27549x != -1;
    }

    /* renamed from: W */
    public boolean m23418W(long j10) {
        int m32699K = m32699K(j10);
        if (m32699K == 0) {
            return false;
        }
        this.f27538V.f40323i++;
        m23446w0(this.f27535S + m32699K);
        m23416S();
        return true;
    }

    /* renamed from: X */
    public final void m23419X() {
        if (this.f27546u != null) {
            return;
        }
        m23437n0(this.f27520D);
        ExoMediaCrypto exoMediaCrypto = null;
        InterfaceC9277p interfaceC9277p = this.f27519C;
        if (interfaceC9277p != null) {
            ExoMediaCrypto mo39026d = interfaceC9277p.mo39026d();
            exoMediaCrypto = mo39026d;
            if (mo39026d == null) {
                if (this.f27519C.getError() == null) {
                    return;
                } else {
                    exoMediaCrypto = mo39026d;
                }
            }
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f27546u = mo5980O(this.f27544s, exoMediaCrypto);
            mo5983o0(this.f27549x);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f27541p.m23482k(this.f27546u.getName(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            this.f27538V.f40315a++;
        } catch (OutOfMemoryError e10) {
            throw m32711v(e10, this.f27544s, 4001);
        } catch (C8637e e11) {
            C4392v.m22271e("DecoderVideoRenderer", "Video codec error", e11);
            this.f27541p.m23480C(e11);
            throw m32711v(e11, this.f27544s, 4001);
        }
    }

    /* renamed from: Y */
    public final void m23420Y() {
        if (this.f27533Q > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f27541p.m23485n(this.f27533Q, elapsedRealtime - this.f27532P);
            this.f27533Q = 0;
            this.f27532P = elapsedRealtime;
        }
    }

    /* renamed from: Z */
    public final void m23421Z() {
        this.f27525I = true;
        if (this.f27523G) {
            return;
        }
        this.f27523G = true;
        this.f27541p.m23478A(this.f27550y);
    }

    /* renamed from: a0 */
    public final void m23422a0(int i10, int i11) {
        C4670d0 c4670d0 = this.f27531O;
        if (c4670d0 != null && c4670d0.f27559a == i10 && c4670d0.f27560b == i11) {
            return;
        }
        C4670d0 c4670d02 = new C4670d0(i10, i11);
        this.f27531O = c4670d02;
        this.f27541p.m23481D(c4670d02);
    }

    /* renamed from: b0 */
    public final void m23423b0() {
        if (this.f27523G) {
            this.f27541p.m23478A(this.f27550y);
        }
    }

    /* renamed from: c0 */
    public final void m23424c0() {
        C4670d0 c4670d0 = this.f27531O;
        if (c4670d0 != null) {
            this.f27541p.m23481D(c4670d0);
        }
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: d */
    public boolean mo23425d() {
        return this.f27530N;
    }

    /* renamed from: d0 */
    public void m23426d0(C7632x0 c7632x0) {
        C8639g c8639g;
        InterfaceC4668c0.a aVar;
        C7629w0 c7629w0;
        this.f27528L = true;
        C7629w0 c7629w02 = (C7629w0) C4349a.m21882e(c7632x0.f37132b);
        m23441r0(c7632x0.f37131a);
        C7629w0 c7629w03 = this.f27544s;
        this.f27544s = c7629w02;
        InterfaceC8635c<C4677k, ? extends VideoDecoderOutputBuffer, ? extends C8637e> interfaceC8635c = this.f27546u;
        if (interfaceC8635c == null) {
            m23419X();
            aVar = this.f27541p;
            c7629w0 = this.f27544s;
            c8639g = null;
        } else {
            c8639g = this.f27520D != this.f27519C ? new C8639g(interfaceC8635c.getName(), c7629w03, c7629w02, 0, 128) : mo5979L(interfaceC8635c.getName(), c7629w03, c7629w02);
            if (c8639g.f40338d == 0) {
                if (this.f27522F) {
                    this.f27521E = 1;
                } else {
                    m23435k0();
                    m23419X();
                }
            }
            aVar = this.f27541p;
            c7629w0 = this.f27544s;
        }
        aVar.m23487p(c7629w0, c8639g);
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: e */
    public boolean mo23427e() {
        if (this.f27544s != null && ((m32697B() || this.f27548w != null) && (this.f27523G || !m23417T()))) {
            this.f27527K = -9223372036854775807L;
            return true;
        }
        if (this.f27527K == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f27527K) {
            return true;
        }
        this.f27527K = -9223372036854775807L;
        return false;
    }

    /* renamed from: e0 */
    public final void m23428e0() {
        m23424c0();
        m23411M();
        if (getState() == 2) {
            m23438p0();
        }
    }

    /* renamed from: f0 */
    public final void m23429f0() {
        m23412N();
        m23411M();
    }

    /* renamed from: g0 */
    public final void m23430g0() {
        m23424c0();
        m23423b0();
    }

    /* renamed from: h0 */
    public void m23431h0(long j10) {
        this.f27535S--;
    }

    @Override // p267p6.AbstractC7575f, p267p6.C7615r1.b
    /* renamed from: i */
    public void mo23432i(int i10, Object obj) {
        if (i10 == 1) {
            m23440q0(obj);
        } else if (i10 == 6) {
            this.f27518B = (InterfaceC4679m) obj;
        } else {
            super.mo23432i(i10, obj);
        }
    }

    /* renamed from: i0 */
    public void m23433i0(C4677k c4677k) {
    }

    /* renamed from: j0 */
    public final boolean m23434j0(long j10, long j11) {
        if (this.f27526J == -9223372036854775807L) {
            this.f27526J = j10;
        }
        long j12 = this.f27548w.timeUs - j10;
        if (!m23417T()) {
            if (!m23403U(j12)) {
                return false;
            }
            m23445v0(this.f27548w);
            return true;
        }
        long j13 = this.f27548w.timeUs - this.f27537U;
        C7629w0 m22234j = this.f27542q.m22234j(j13);
        if (m22234j != null) {
            this.f27545t = m22234j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j14 = this.f27536T;
        boolean z10 = getState() == 2;
        if ((this.f27525I ? !this.f27523G : z10 || this.f27524H) || (z10 && m23444u0(j12, (elapsedRealtime * 1000) - j14))) {
            m23436l0(this.f27548w, j13, this.f27545t);
            return true;
        }
        if (!z10 || j10 == this.f27526J) {
            return false;
        }
        if (m23442s0(j12, j11) && m23418W(j10)) {
            return false;
        }
        if (m23443t0(j12, j11)) {
            m23414Q(this.f27548w);
            return true;
        }
        if (j12 >= 30000) {
            return false;
        }
        m23436l0(this.f27548w, j13, this.f27545t);
        return true;
    }

    /* renamed from: k0 */
    public void m23435k0() {
        this.f27547v = null;
        this.f27548w = null;
        this.f27521E = 0;
        this.f27522F = false;
        this.f27535S = 0;
        InterfaceC8635c<C4677k, ? extends VideoDecoderOutputBuffer, ? extends C8637e> interfaceC8635c = this.f27546u;
        if (interfaceC8635c != null) {
            this.f27538V.f40316b++;
            interfaceC8635c.release();
            this.f27541p.m23483l(this.f27546u.getName());
            this.f27546u = null;
        }
        m23437n0(null);
    }

    /* renamed from: l0 */
    public void m23436l0(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j10, C7629w0 c7629w0) {
        InterfaceC4679m interfaceC4679m = this.f27518B;
        if (interfaceC4679m != null) {
            interfaceC4679m.mo23576a(j10, System.nanoTime(), c7629w0, null);
        }
        this.f27536T = C7583h.m32760d(SystemClock.elapsedRealtime() * 1000);
        int i10 = videoDecoderOutputBuffer.mode;
        boolean z10 = i10 == 1 && this.f27551z != null;
        boolean z11 = i10 == 0 && this.f27517A != null;
        if (!z11 && !z10) {
            m23414Q(videoDecoderOutputBuffer);
            return;
        }
        m23422a0(videoDecoderOutputBuffer.width, videoDecoderOutputBuffer.height);
        if (z11) {
            this.f27517A.setOutputBuffer(videoDecoderOutputBuffer);
        } else {
            mo5982m0(videoDecoderOutputBuffer, this.f27551z);
        }
        this.f27534R = 0;
        this.f27538V.f40319e++;
        m23421Z();
    }

    /* renamed from: m0 */
    public abstract void mo5982m0(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface);

    /* renamed from: n0 */
    public final void m23437n0(InterfaceC9277p interfaceC9277p) {
        C9275o.m39149a(this.f27519C, interfaceC9277p);
        this.f27519C = interfaceC9277p;
    }

    /* renamed from: o0 */
    public abstract void mo5983o0(int i10);

    /* renamed from: p0 */
    public final void m23438p0() {
        this.f27527K = this.f27539n > 0 ? SystemClock.elapsedRealtime() + this.f27539n : -9223372036854775807L;
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: q */
    public void mo23439q(long j10, long j11) {
        if (this.f27530N) {
            return;
        }
        if (this.f27544s == null) {
            C7632x0 m32714y = m32714y();
            this.f27543r.clear();
            int m32698J = m32698J(m32714y, this.f27543r, 2);
            if (m32698J != -5) {
                if (m32698J == -4) {
                    C4349a.m21884g(this.f27543r.isEndOfStream());
                    this.f27529M = true;
                    this.f27530N = true;
                    return;
                }
                return;
            }
            m23426d0(m32714y);
        }
        m23419X();
        if (this.f27546u != null) {
            try {
                C4391u0.m22263a("drainAndFeed");
                do {
                } while (m23413P(j10, j11));
                while (m23415R()) {
                }
                C4391u0.m22265c();
                this.f27538V.m37078c();
            } catch (C8637e e10) {
                C4392v.m22271e("DecoderVideoRenderer", "Video codec error", e10);
                this.f27541p.m23480C(e10);
                throw m32711v(e10, this.f27544s, 4003);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004d  */
    /* renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m23440q0(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof android.view.Surface
            if (r0 == 0) goto L1e
            r0 = r3
            r1 = r4
            android.view.Surface r1 = (android.view.Surface) r1
            r0.f27551z = r1
            r0 = r3
            r1 = 0
            r0.f27517A = r1
            r0 = 1
            r5 = r0
        L16:
            r0 = r3
            r1 = r5
            r0.f27549x = r1
            goto L45
        L1e:
            r0 = r4
            boolean r0 = r0 instanceof p078e9.InterfaceC4678l
            r6 = r0
            r0 = r3
            r1 = 0
            r0.f27551z = r1
            r0 = r6
            if (r0 == 0) goto L39
            r0 = r3
            r1 = r4
            e9.l r1 = (p078e9.InterfaceC4678l) r1
            r0.f27517A = r1
            r0 = 0
            r5 = r0
            goto L16
        L39:
            r0 = r3
            r1 = 0
            r0.f27517A = r1
            r0 = r3
            r1 = -1
            r0.f27549x = r1
            r0 = 0
            r4 = r0
        L45:
            r0 = r3
            java.lang.Object r0 = r0.f27550y
            r1 = r4
            if (r0 == r1) goto L73
            r0 = r3
            r1 = r4
            r0.f27550y = r1
            r0 = r4
            if (r0 == 0) goto L6c
            r0 = r3
            t6.c<e9.k, ? extends com.google.android.exoplayer2.video.VideoDecoderOutputBuffer, ? extends t6.e> r0 = r0.f27546u
            if (r0 == 0) goto L65
            r0 = r3
            r1 = r3
            int r1 = r1.f27549x
            r0.mo5983o0(r1)
        L65:
            r0 = r3
            r0.m23428e0()
            goto L7b
        L6c:
            r0 = r3
            r0.m23429f0()
            goto L7b
        L73:
            r0 = r4
            if (r0 == 0) goto L7b
            r0 = r3
            r0.m23430g0()
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p078e9.AbstractC4667c.m23440q0(java.lang.Object):void");
    }

    /* renamed from: r0 */
    public final void m23441r0(InterfaceC9277p interfaceC9277p) {
        C9275o.m39149a(this.f27520D, interfaceC9277p);
        this.f27520D = interfaceC9277p;
    }

    /* renamed from: s0 */
    public boolean m23442s0(long j10, long j11) {
        return m23404V(j10);
    }

    /* renamed from: t0 */
    public boolean m23443t0(long j10, long j11) {
        return m23403U(j10);
    }

    /* renamed from: u0 */
    public boolean m23444u0(long j10, long j11) {
        return m23403U(j10) && j11 > 100000;
    }

    /* renamed from: v0 */
    public void m23445v0(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        this.f27538V.f40320f++;
        videoDecoderOutputBuffer.release();
    }

    /* renamed from: w0 */
    public void m23446w0(int i10) {
        C8636d c8636d = this.f27538V;
        c8636d.f40321g += i10;
        this.f27533Q += i10;
        int i11 = this.f27534R + i10;
        this.f27534R = i11;
        c8636d.f40322h = Math.max(i11, c8636d.f40322h);
        int i12 = this.f27540o;
        if (i12 <= 0 || this.f27533Q < i12) {
            return;
        }
        m23420Y();
    }
}
