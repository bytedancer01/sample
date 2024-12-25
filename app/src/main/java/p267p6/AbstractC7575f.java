package p267p6;

import p009a8.InterfaceC0120s0;
import p059d9.C4349a;
import p059d9.InterfaceC4396x;
import p332t6.C8638f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/f.class
 */
/* renamed from: p6.f */
/* loaded from: combined.jar:classes2.jar:p6/f.class */
public abstract class AbstractC7575f implements InterfaceC7627v1, InterfaceC7633x1 {

    /* renamed from: b */
    public final int f36737b;

    /* renamed from: d */
    public C7636y1 f36739d;

    /* renamed from: e */
    public int f36740e;

    /* renamed from: f */
    public int f36741f;

    /* renamed from: g */
    public InterfaceC0120s0 f36742g;

    /* renamed from: h */
    public C7629w0[] f36743h;

    /* renamed from: i */
    public long f36744i;

    /* renamed from: j */
    public long f36745j;

    /* renamed from: l */
    public boolean f36747l;

    /* renamed from: m */
    public boolean f36748m;

    /* renamed from: c */
    public final C7632x0 f36738c = new C7632x0();

    /* renamed from: k */
    public long f36746k = Long.MIN_VALUE;

    public AbstractC7575f(int i10) {
        this.f36737b = i10;
    }

    /* renamed from: A */
    public final C7629w0[] m32696A() {
        return (C7629w0[]) C4349a.m21882e(this.f36743h);
    }

    /* renamed from: B */
    public final boolean m32697B() {
        return mo32700f() ? this.f36747l : ((InterfaceC0120s0) C4349a.m21882e(this.f36742g)).mo356e();
    }

    /* renamed from: C */
    public abstract void mo23405C();

    /* renamed from: D */
    public void mo23406D(boolean z10, boolean z11) {
    }

    /* renamed from: E */
    public abstract void mo23407E(long j10, boolean z10);

    /* renamed from: F */
    public void mo23526F() {
    }

    /* renamed from: G */
    public void mo23408G() {
    }

    /* renamed from: H */
    public void mo23409H() {
    }

    /* renamed from: I */
    public void mo23410I(C7629w0[] c7629w0Arr, long j10, long j11) {
    }

    /* renamed from: J */
    public final int m32698J(C7632x0 c7632x0, C8638f c8638f, int i10) {
        int mo357p = ((InterfaceC0120s0) C4349a.m21882e(this.f36742g)).mo357p(c7632x0, c8638f, i10);
        int i11 = -4;
        if (mo357p == -4) {
            if (c8638f.isEndOfStream()) {
                this.f36746k = Long.MIN_VALUE;
                if (!this.f36747l) {
                    i11 = -3;
                }
                return i11;
            }
            long j10 = c8638f.f40329e + this.f36744i;
            c8638f.f40329e = j10;
            this.f36746k = Math.max(this.f36746k, j10);
        } else if (mo357p == -5) {
            C7629w0 c7629w0 = (C7629w0) C4349a.m21882e(c7632x0.f37132b);
            if (c7629w0.f37090q != Long.MAX_VALUE) {
                c7632x0.f37132b = c7629w0.m33157b().m33224i0(c7629w0.f37090q + this.f36744i).m33194E();
            }
        }
        return mo357p;
    }

    /* renamed from: K */
    public int m32699K(long j10) {
        return ((InterfaceC0120s0) C4349a.m21882e(this.f36742g)).mo358t(j10 - this.f36744i);
    }

    @Override // p267p6.InterfaceC7627v1
    public final void disable() {
        boolean z10 = true;
        if (this.f36741f != 1) {
            z10 = false;
        }
        C4349a.m21884g(z10);
        this.f36738c.m33231a();
        this.f36741f = 0;
        this.f36742g = null;
        this.f36743h = null;
        this.f36747l = false;
        mo23405C();
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: f */
    public final boolean mo32700f() {
        return this.f36746k == Long.MIN_VALUE;
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: g */
    public final void mo32701g() {
        this.f36747l = true;
    }

    @Override // p267p6.InterfaceC7627v1
    public final int getState() {
        return this.f36741f;
    }

    @Override // p267p6.InterfaceC7627v1, p267p6.InterfaceC7633x1
    public final int getTrackType() {
        return this.f36737b;
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: h */
    public final void mo32702h(C7629w0[] c7629w0Arr, InterfaceC0120s0 interfaceC0120s0, long j10, long j11) {
        C4349a.m21884g(!this.f36747l);
        this.f36742g = interfaceC0120s0;
        if (this.f36746k == Long.MIN_VALUE) {
            this.f36746k = j10;
        }
        this.f36743h = c7629w0Arr;
        this.f36744i = j11;
        mo23410I(c7629w0Arr, j10, j11);
    }

    @Override // p267p6.C7615r1.b
    /* renamed from: i */
    public void mo23432i(int i10, Object obj) {
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: j */
    public final void mo32703j() {
        ((InterfaceC0120s0) C4349a.m21882e(this.f36742g)).mo354a();
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: k */
    public final boolean mo32704k() {
        return this.f36747l;
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: l */
    public final void mo32705l(C7636y1 c7636y1, C7629w0[] c7629w0Arr, InterfaceC0120s0 interfaceC0120s0, long j10, boolean z10, boolean z11, long j11, long j12) {
        C4349a.m21884g(this.f36741f == 0);
        this.f36739d = c7636y1;
        this.f36741f = 1;
        this.f36745j = j10;
        mo23406D(z10, z11);
        mo32702h(c7629w0Arr, interfaceC0120s0, j11, j12);
        mo23407E(j10, z10);
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: m */
    public final InterfaceC7633x1 mo32706m() {
        return this;
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: o */
    public /* synthetic */ void mo23561o(float f10, float f11) {
        C7624u1.m33154a(this, f10, f11);
    }

    /* renamed from: p */
    public int mo12010p() {
        return 0;
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: r */
    public final InterfaceC0120s0 mo32707r() {
        return this.f36742g;
    }

    @Override // p267p6.InterfaceC7627v1
    public final void reset() {
        C4349a.m21884g(this.f36741f == 0);
        this.f36738c.m33231a();
        mo23526F();
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: s */
    public final long mo32708s() {
        return this.f36746k;
    }

    @Override // p267p6.InterfaceC7627v1
    public final void setIndex(int i10) {
        this.f36740e = i10;
    }

    @Override // p267p6.InterfaceC7627v1
    public final void start() {
        boolean z10 = true;
        if (this.f36741f != 1) {
            z10 = false;
        }
        C4349a.m21884g(z10);
        this.f36741f = 2;
        mo23408G();
    }

    @Override // p267p6.InterfaceC7627v1
    public final void stop() {
        C4349a.m21884g(this.f36741f == 2);
        this.f36741f = 1;
        mo23409H();
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: t */
    public final void mo32709t(long j10) {
        this.f36747l = false;
        this.f36745j = j10;
        this.f36746k = j10;
        mo23407E(j10, false);
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: u */
    public InterfaceC4396x mo32710u() {
        return null;
    }

    /* renamed from: v */
    public final C7607p m32711v(Throwable th2, C7629w0 c7629w0, int i10) {
        return m32712w(th2, c7629w0, false, i10);
    }

    /* renamed from: w */
    public final C7607p m32712w(Throwable th2, C7629w0 c7629w0, boolean z10, int i10) {
        int i11;
        if (c7629w0 != null && !this.f36748m) {
            this.f36748m = true;
            try {
                i11 = C7630w1.m33229d(mo5981a(c7629w0));
            } catch (C7607p e10) {
            } finally {
                this.f36748m = false;
            }
            return C7607p.m32874d(th2, getName(), m32715z(), c7629w0, i11, z10, i10);
        }
        i11 = 4;
        return C7607p.m32874d(th2, getName(), m32715z(), c7629w0, i11, z10, i10);
    }

    /* renamed from: x */
    public final C7636y1 m32713x() {
        return (C7636y1) C4349a.m21882e(this.f36739d);
    }

    /* renamed from: y */
    public final C7632x0 m32714y() {
        this.f36738c.m33231a();
        return this.f36738c;
    }

    /* renamed from: z */
    public final int m32715z() {
        return this.f36740e;
    }
}
