package p301r6;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.decoder.SimpleOutputBuffer;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import p059d9.C4349a;
import p059d9.C4391u0;
import p059d9.C4392v;
import p059d9.C4400z;
import p059d9.C4401z0;
import p059d9.InterfaceC4396x;
import p267p6.AbstractC7575f;
import p267p6.C7603n1;
import p267p6.C7629w0;
import p267p6.C7630w1;
import p267p6.C7632x0;
import p301r6.InterfaceC8002t;
import p301r6.InterfaceC8003u;
import p332t6.C8636d;
import p332t6.C8637e;
import p332t6.C8638f;
import p332t6.C8639g;
import p332t6.InterfaceC8635c;
import p365v6.C9275o;
import p365v6.InterfaceC9277p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/b0.class
 */
/* renamed from: r6.b0 */
/* loaded from: combined.jar:classes2.jar:r6/b0.class */
public abstract class AbstractC7969b0<T extends InterfaceC8635c<C8638f, ? extends SimpleOutputBuffer, ? extends C8637e>> extends AbstractC7575f implements InterfaceC4396x {

    /* renamed from: A */
    public int f38473A;

    /* renamed from: B */
    public boolean f38474B;

    /* renamed from: C */
    public boolean f38475C;

    /* renamed from: D */
    public long f38476D;

    /* renamed from: E */
    public boolean f38477E;

    /* renamed from: F */
    public boolean f38478F;

    /* renamed from: G */
    public boolean f38479G;

    /* renamed from: H */
    public boolean f38480H;

    /* renamed from: n */
    public final InterfaceC8002t.a f38481n;

    /* renamed from: o */
    public final InterfaceC8003u f38482o;

    /* renamed from: p */
    public final C8638f f38483p;

    /* renamed from: q */
    public C8636d f38484q;

    /* renamed from: r */
    public C7629w0 f38485r;

    /* renamed from: s */
    public int f38486s;

    /* renamed from: t */
    public int f38487t;

    /* renamed from: u */
    public boolean f38488u;

    /* renamed from: v */
    public T f38489v;

    /* renamed from: w */
    public C8638f f38490w;

    /* renamed from: x */
    public SimpleOutputBuffer f38491x;

    /* renamed from: y */
    public InterfaceC9277p f38492y;

    /* renamed from: z */
    public InterfaceC9277p f38493z;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/b0$b.class
     */
    /* renamed from: r6.b0$b */
    /* loaded from: combined.jar:classes2.jar:r6/b0$b.class */
    public final class b implements InterfaceC8003u.c {

        /* renamed from: a */
        public final AbstractC7969b0 f38494a;

        public b(AbstractC7969b0 abstractC7969b0) {
            this.f38494a = abstractC7969b0;
        }

        @Override // p301r6.InterfaceC8003u.c
        /* renamed from: a */
        public void mo34561a(boolean z10) {
            this.f38494a.f38481n.m34801C(z10);
        }

        @Override // p301r6.InterfaceC8003u.c
        /* renamed from: b */
        public void mo34562b(Exception exc) {
            C4392v.m22271e("DecoderAudioRenderer", "Audio sink error", exc);
            this.f38494a.f38481n.m34804l(exc);
        }

        @Override // p301r6.InterfaceC8003u.c
        /* renamed from: c */
        public void mo34563c(long j10) {
            this.f38494a.f38481n.m34800B(j10);
        }

        @Override // p301r6.InterfaceC8003u.c
        /* renamed from: d */
        public /* synthetic */ void mo34564d(long j10) {
            C8004v.m34811b(this, j10);
        }

        @Override // p301r6.InterfaceC8003u.c
        /* renamed from: e */
        public void mo34565e(int i10, long j10, long j11) {
            this.f38494a.f38481n.m34802D(i10, j10, j11);
        }

        @Override // p301r6.InterfaceC8003u.c
        /* renamed from: f */
        public void mo34566f() {
            this.f38494a.m34553V();
        }

        @Override // p301r6.InterfaceC8003u.c
        /* renamed from: g */
        public /* synthetic */ void mo34567g() {
            C8004v.m34810a(this);
        }
    }

    public AbstractC7969b0(Handler handler, InterfaceC8002t interfaceC8002t, C7976f c7976f, InterfaceC7980h... interfaceC7980hArr) {
        this(handler, interfaceC8002t, new C7977f0(c7976f, interfaceC7980hArr));
    }

    public AbstractC7969b0(Handler handler, InterfaceC8002t interfaceC8002t, InterfaceC8003u interfaceC8003u) {
        super(1);
        this.f38481n = new InterfaceC8002t.a(handler, interfaceC8002t);
        this.f38482o = interfaceC8003u;
        interfaceC8003u.mo34633f(new b());
        this.f38483p = C8638f.m37079i();
        this.f38473A = 0;
        this.f38475C = true;
    }

    public AbstractC7969b0(Handler handler, InterfaceC8002t interfaceC8002t, InterfaceC7980h... interfaceC7980hArr) {
        this(handler, interfaceC8002t, null, interfaceC7980hArr);
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: C */
    public void mo23405C() {
        this.f38485r = null;
        this.f38475C = true;
        try {
            m34558a0(null);
            m34556Y();
            this.f38482o.reset();
        } finally {
            this.f38481n.m34807o(this.f38484q);
        }
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: D */
    public void mo23406D(boolean z10, boolean z11) {
        C8636d c8636d = new C8636d();
        this.f38484q = c8636d;
        this.f38481n.m34808p(c8636d);
        if (m32713x().f37138a) {
            this.f38482o.mo34652q();
        } else {
            this.f38482o.mo34637h();
        }
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: E */
    public void mo23407E(long j10, boolean z10) {
        if (this.f38488u) {
            this.f38482o.mo34643l();
        } else {
            this.f38482o.flush();
        }
        this.f38476D = j10;
        this.f38477E = true;
        this.f38478F = true;
        this.f38479G = false;
        this.f38480H = false;
        if (this.f38489v != null) {
            m34549Q();
        }
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: G */
    public void mo23408G() {
        this.f38482o.play();
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: H */
    public void mo23409H() {
        m34560d0();
        this.f38482o.pause();
    }

    /* renamed from: M */
    public C8639g m34546M(String str, C7629w0 c7629w0, C7629w0 c7629w02) {
        return new C8639g(str, c7629w0, c7629w02, 0, 1);
    }

    /* renamed from: N */
    public abstract T mo296N(C7629w0 c7629w0, ExoMediaCrypto exoMediaCrypto);

    /* renamed from: O */
    public final boolean m34547O() {
        if (this.f38491x == null) {
            SimpleOutputBuffer simpleOutputBuffer = (SimpleOutputBuffer) this.f38489v.mo33481b();
            this.f38491x = simpleOutputBuffer;
            if (simpleOutputBuffer == null) {
                return false;
            }
            int i10 = simpleOutputBuffer.skippedOutputBufferCount;
            if (i10 > 0) {
                this.f38484q.f40320f += i10;
                this.f38482o.mo34649o();
            }
        }
        if (this.f38491x.isEndOfStream()) {
            if (this.f38473A == 2) {
                m34556Y();
                m34551T();
                this.f38475C = true;
                return false;
            }
            this.f38491x.release();
            this.f38491x = null;
            try {
                m34555X();
                return false;
            } catch (InterfaceC8003u.e e10) {
                throw m32712w(e10, e10.f38725d, e10.f38724c, 5002);
            }
        }
        if (this.f38475C) {
            this.f38482o.mo34638i(mo297R(this.f38489v).m33157b().m33202M(this.f38486s).m33203N(this.f38487t).m33194E(), 0, null);
            this.f38475C = false;
        }
        InterfaceC8003u interfaceC8003u = this.f38482o;
        SimpleOutputBuffer simpleOutputBuffer2 = this.f38491x;
        if (!interfaceC8003u.mo34641k(simpleOutputBuffer2.data, simpleOutputBuffer2.timeUs, 1)) {
            return false;
        }
        this.f38484q.f40319e++;
        this.f38491x.release();
        this.f38491x = null;
        return true;
    }

    /* renamed from: P */
    public final boolean m34548P() {
        T t10 = this.f38489v;
        if (t10 == null || this.f38473A == 2 || this.f38479G) {
            return false;
        }
        if (this.f38490w == null) {
            C8638f c8638f = (C8638f) t10.mo33547d();
            this.f38490w = c8638f;
            if (c8638f == null) {
                return false;
            }
        }
        if (this.f38473A == 1) {
            this.f38490w.setFlags(4);
            this.f38489v.mo33546c(this.f38490w);
            this.f38490w = null;
            this.f38473A = 2;
            return false;
        }
        C7632x0 m32714y = m32714y();
        int m32698J = m32698J(m32714y, this.f38490w, 0);
        if (m32698J == -5) {
            m34552U(m32714y);
            return true;
        }
        if (m32698J != -4) {
            if (m32698J == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (this.f38490w.isEndOfStream()) {
            this.f38479G = true;
            this.f38489v.mo33546c(this.f38490w);
            this.f38490w = null;
            return false;
        }
        this.f38490w.m37082g();
        m34554W(this.f38490w);
        this.f38489v.mo33546c(this.f38490w);
        this.f38474B = true;
        this.f38484q.f40317c++;
        this.f38490w = null;
        return true;
    }

    /* renamed from: Q */
    public final void m34549Q() {
        if (this.f38473A != 0) {
            m34556Y();
            m34551T();
            return;
        }
        this.f38490w = null;
        SimpleOutputBuffer simpleOutputBuffer = this.f38491x;
        if (simpleOutputBuffer != null) {
            simpleOutputBuffer.release();
            this.f38491x = null;
        }
        this.f38489v.flush();
        this.f38474B = false;
    }

    /* renamed from: R */
    public abstract C7629w0 mo297R(T t10);

    /* renamed from: S */
    public final int m34550S(C7629w0 c7629w0) {
        return this.f38482o.mo34650p(c7629w0);
    }

    /* renamed from: T */
    public final void m34551T() {
        if (this.f38489v != null) {
            return;
        }
        m34557Z(this.f38493z);
        ExoMediaCrypto exoMediaCrypto = null;
        InterfaceC9277p interfaceC9277p = this.f38492y;
        if (interfaceC9277p != null) {
            ExoMediaCrypto mo39026d = interfaceC9277p.mo39026d();
            exoMediaCrypto = mo39026d;
            if (mo39026d == null) {
                if (this.f38492y.getError() == null) {
                    return;
                } else {
                    exoMediaCrypto = mo39026d;
                }
            }
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C4391u0.m22263a("createAudioDecoder");
            this.f38489v = mo296N(this.f38485r, exoMediaCrypto);
            C4391u0.m22265c();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f38481n.m34805m(this.f38489v.getName(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            this.f38484q.f40315a++;
        } catch (OutOfMemoryError e10) {
            throw m32711v(e10, this.f38485r, 4001);
        } catch (C8637e e11) {
            C4392v.m22271e("DecoderAudioRenderer", "Audio codec error", e11);
            this.f38481n.m34803k(e11);
            throw m32711v(e11, this.f38485r, 4001);
        }
    }

    /* renamed from: U */
    public final void m34552U(C7632x0 c7632x0) {
        C7629w0 c7629w0 = (C7629w0) C4349a.m21882e(c7632x0.f37132b);
        m34558a0(c7632x0.f37131a);
        C7629w0 c7629w02 = this.f38485r;
        this.f38485r = c7629w0;
        this.f38486s = c7629w0.f37070C;
        this.f38487t = c7629w0.f37071D;
        T t10 = this.f38489v;
        if (t10 == null) {
            m34551T();
            this.f38481n.m34809q(this.f38485r, null);
            return;
        }
        C8639g c8639g = this.f38493z != this.f38492y ? new C8639g(t10.getName(), c7629w02, c7629w0, 0, 128) : m34546M(t10.getName(), c7629w02, c7629w0);
        if (c8639g.f40338d == 0) {
            if (this.f38474B) {
                this.f38473A = 1;
            } else {
                m34556Y();
                m34551T();
                this.f38475C = true;
            }
        }
        this.f38481n.m34809q(this.f38485r, c8639g);
    }

    /* renamed from: V */
    public void m34553V() {
        this.f38478F = true;
    }

    /* renamed from: W */
    public void m34554W(C8638f c8638f) {
        if (!this.f38477E || c8638f.isDecodeOnly()) {
            return;
        }
        if (Math.abs(c8638f.f40329e - this.f38476D) > 500000) {
            this.f38476D = c8638f.f40329e;
        }
        this.f38477E = false;
    }

    /* renamed from: X */
    public final void m34555X() {
        this.f38480H = true;
        this.f38482o.mo34645m();
    }

    /* renamed from: Y */
    public final void m34556Y() {
        this.f38490w = null;
        this.f38491x = null;
        this.f38473A = 0;
        this.f38474B = false;
        T t10 = this.f38489v;
        if (t10 != null) {
            this.f38484q.f40316b++;
            t10.release();
            this.f38481n.m34806n(this.f38489v.getName());
            this.f38489v = null;
        }
        m34557Z(null);
    }

    /* renamed from: Z */
    public final void m34557Z(InterfaceC9277p interfaceC9277p) {
        C9275o.m39149a(this.f38492y, interfaceC9277p);
        this.f38492y = interfaceC9277p;
    }

    @Override // p267p6.InterfaceC7633x1
    /* renamed from: a */
    public final int mo5981a(C7629w0 c7629w0) {
        int i10 = 0;
        if (!C4400z.m22308p(c7629w0.f37086m)) {
            return C7630w1.m33226a(0);
        }
        int mo298c0 = mo298c0(c7629w0);
        if (mo298c0 <= 2) {
            return C7630w1.m33226a(mo298c0);
        }
        if (C4401z0.f26679a >= 21) {
            i10 = 32;
        }
        return C7630w1.m33227b(mo298c0, 8, i10);
    }

    /* renamed from: a0 */
    public final void m34558a0(InterfaceC9277p interfaceC9277p) {
        C9275o.m39149a(this.f38493z, interfaceC9277p);
        this.f38493z = interfaceC9277p;
    }

    @Override // p059d9.InterfaceC4396x
    /* renamed from: b */
    public C7603n1 mo22208b() {
        return this.f38482o.mo34625b();
    }

    /* renamed from: b0 */
    public final boolean m34559b0(C7629w0 c7629w0) {
        return this.f38482o.mo34623a(c7629w0);
    }

    @Override // p059d9.InterfaceC4396x
    /* renamed from: c */
    public void mo22209c(C7603n1 c7603n1) {
        this.f38482o.mo34627c(c7603n1);
    }

    /* renamed from: c0 */
    public abstract int mo298c0(C7629w0 c7629w0);

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: d */
    public boolean mo23425d() {
        return this.f38480H && this.f38482o.mo34629d();
    }

    /* renamed from: d0 */
    public final void m34560d0() {
        long mo34647n = this.f38482o.mo34647n(mo23425d());
        if (mo34647n != Long.MIN_VALUE) {
            if (!this.f38478F) {
                mo34647n = Math.max(this.f38476D, mo34647n);
            }
            this.f38476D = mo34647n;
            this.f38478F = false;
        }
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: e */
    public boolean mo23427e() {
        return this.f38482o.mo34631e() || (this.f38485r != null && (m32697B() || this.f38491x != null));
    }

    @Override // p267p6.AbstractC7575f, p267p6.C7615r1.b
    /* renamed from: i */
    public void mo23432i(int i10, Object obj) {
        if (i10 == 2) {
            this.f38482o.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i10 == 3) {
            this.f38482o.mo34653r((C7972d) obj);
            return;
        }
        if (i10 == 5) {
            this.f38482o.mo34639j((C8007y) obj);
        } else if (i10 == 101) {
            this.f38482o.mo34654s(((Boolean) obj).booleanValue());
        } else if (i10 != 102) {
            super.mo23432i(i10, obj);
        } else {
            this.f38482o.mo34635g(((Integer) obj).intValue());
        }
    }

    @Override // p059d9.InterfaceC4396x
    /* renamed from: n */
    public long mo22212n() {
        if (getState() == 2) {
            m34560d0();
        }
        return this.f38476D;
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: q */
    public void mo23439q(long j10, long j11) {
        if (this.f38480H) {
            try {
                this.f38482o.mo34645m();
                return;
            } catch (InterfaceC8003u.e e10) {
                throw m32712w(e10, e10.f38725d, e10.f38724c, 5002);
            }
        }
        if (this.f38485r == null) {
            C7632x0 m32714y = m32714y();
            this.f38483p.clear();
            int m32698J = m32698J(m32714y, this.f38483p, 2);
            if (m32698J != -5) {
                if (m32698J == -4) {
                    C4349a.m21884g(this.f38483p.isEndOfStream());
                    this.f38479G = true;
                    try {
                        m34555X();
                        return;
                    } catch (InterfaceC8003u.e e11) {
                        throw m32711v(e11, null, 5002);
                    }
                }
                return;
            }
            m34552U(m32714y);
        }
        m34551T();
        if (this.f38489v != null) {
            try {
                C4391u0.m22263a("drainAndFeed");
                do {
                } while (m34547O());
                while (m34548P()) {
                }
                C4391u0.m22265c();
                this.f38484q.m37078c();
            } catch (InterfaceC8003u.a e12) {
                throw m32711v(e12, e12.f38717b, 5001);
            } catch (InterfaceC8003u.b e13) {
                throw m32712w(e13, e13.f38720d, e13.f38719c, 5001);
            } catch (InterfaceC8003u.e e14) {
                throw m32712w(e14, e14.f38725d, e14.f38724c, 5002);
            } catch (C8637e e15) {
                C4392v.m22271e("DecoderAudioRenderer", "Audio codec error", e15);
                this.f38481n.m34803k(e15);
                throw m32711v(e15, this.f38485r, 4003);
            }
        }
    }

    @Override // p267p6.AbstractC7575f, p267p6.InterfaceC7627v1
    /* renamed from: u */
    public InterfaceC4396x mo32710u() {
        return this;
    }
}
