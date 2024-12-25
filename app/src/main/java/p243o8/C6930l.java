package p243o8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4400z;
import p059d9.C4401z0;
import p267p6.AbstractC7575f;
import p267p6.C7629w0;
import p267p6.C7630w1;
import p267p6.C7632x0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:o8/l.class
 */
/* renamed from: o8.l */
/* loaded from: combined.jar:classes2.jar:o8/l.class */
public final class C6930l extends AbstractC7575f implements Handler.Callback {

    /* renamed from: A */
    public int f35837A;

    /* renamed from: B */
    public long f35838B;

    /* renamed from: n */
    public final Handler f35839n;

    /* renamed from: o */
    public final InterfaceC6929k f35840o;

    /* renamed from: p */
    public final InterfaceC6926h f35841p;

    /* renamed from: q */
    public final C7632x0 f35842q;

    /* renamed from: r */
    public boolean f35843r;

    /* renamed from: s */
    public boolean f35844s;

    /* renamed from: t */
    public boolean f35845t;

    /* renamed from: u */
    public int f35846u;

    /* renamed from: v */
    public C7629w0 f35847v;

    /* renamed from: w */
    public InterfaceC6924f f35848w;

    /* renamed from: x */
    public C6927i f35849x;

    /* renamed from: y */
    public AbstractC6928j f35850y;

    /* renamed from: z */
    public AbstractC6928j f35851z;

    public C6930l(InterfaceC6929k interfaceC6929k, Looper looper) {
        this(interfaceC6929k, looper, InterfaceC6926h.f35833a);
    }

    public C6930l(InterfaceC6929k interfaceC6929k, Looper looper, InterfaceC6926h interfaceC6926h) {
        super(3);
        this.f35840o = (InterfaceC6929k) C4349a.m21882e(interfaceC6929k);
        this.f35839n = looper == null ? null : C4401z0.m22419x(looper, this);
        this.f35841p = interfaceC6926h;
        this.f35842q = new C7632x0();
        this.f35838B = -9223372036854775807L;
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: C */
    public void mo23405C() {
        this.f35847v = null;
        this.f35838B = -9223372036854775807L;
        m31890L();
        m31896R();
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: E */
    public void mo23407E(long j10, boolean z10) {
        m31890L();
        this.f35843r = false;
        this.f35844s = false;
        this.f35838B = -9223372036854775807L;
        if (this.f35846u != 0) {
            m31897S();
        } else {
            m31895Q();
            ((InterfaceC6924f) C4349a.m21882e(this.f35848w)).flush();
        }
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: I */
    public void mo23410I(C7629w0[] c7629w0Arr, long j10, long j11) {
        this.f35847v = c7629w0Arr[0];
        if (this.f35848w != null) {
            this.f35846u = 1;
        } else {
            m31893O();
        }
    }

    /* renamed from: L */
    public final void m31890L() {
        m31899U(Collections.emptyList());
    }

    /* renamed from: M */
    public final long m31891M() {
        long j10 = Long.MAX_VALUE;
        if (this.f35837A == -1) {
            return Long.MAX_VALUE;
        }
        C4349a.m21882e(this.f35850y);
        if (this.f35837A < this.f35850y.mo31886d()) {
            j10 = this.f35850y.mo31885c(this.f35837A);
        }
        return j10;
    }

    /* renamed from: N */
    public final void m31892N(C6925g c6925g) {
        C4392v.m22271e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f35847v, c6925g);
        m31890L();
        m31897S();
    }

    /* renamed from: O */
    public final void m31893O() {
        this.f35845t = true;
        this.f35848w = this.f35841p.mo31888b((C7629w0) C4349a.m21882e(this.f35847v));
    }

    /* renamed from: P */
    public final void m31894P(List<C6919a> list) {
        this.f35840o.mo12517E(list);
    }

    /* renamed from: Q */
    public final void m31895Q() {
        this.f35849x = null;
        this.f35837A = -1;
        AbstractC6928j abstractC6928j = this.f35850y;
        if (abstractC6928j != null) {
            abstractC6928j.release();
            this.f35850y = null;
        }
        AbstractC6928j abstractC6928j2 = this.f35851z;
        if (abstractC6928j2 != null) {
            abstractC6928j2.release();
            this.f35851z = null;
        }
    }

    /* renamed from: R */
    public final void m31896R() {
        m31895Q();
        ((InterfaceC6924f) C4349a.m21882e(this.f35848w)).release();
        this.f35848w = null;
        this.f35846u = 0;
    }

    /* renamed from: S */
    public final void m31897S() {
        m31896R();
        m31893O();
    }

    /* renamed from: T */
    public void m31898T(long j10) {
        C4349a.m21884g(mo32704k());
        this.f35838B = j10;
    }

    /* renamed from: U */
    public final void m31899U(List<C6919a> list) {
        Handler handler = this.f35839n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            m31894P(list);
        }
    }

    @Override // p267p6.InterfaceC7633x1
    /* renamed from: a */
    public int mo5981a(C7629w0 c7629w0) {
        if (this.f35841p.mo31887a(c7629w0)) {
            return C7630w1.m33226a(c7629w0.f37073F == null ? 4 : 2);
        }
        return C7630w1.m33226a(C4400z.m22310r(c7629w0.f37086m) ? 1 : 0);
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: d */
    public boolean mo23425d() {
        return this.f35844s;
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: e */
    public boolean mo23427e() {
        return true;
    }

    @Override // p267p6.InterfaceC7627v1, p267p6.InterfaceC7633x1
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        m31894P((List) message.obj);
        return true;
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: q */
    public void mo23439q(long j10, long j11) {
        boolean z10;
        if (mo32704k()) {
            long j12 = this.f35838B;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                m31895Q();
                this.f35844s = true;
            }
        }
        if (this.f35844s) {
            return;
        }
        if (this.f35851z == null) {
            ((InterfaceC6924f) C4349a.m21882e(this.f35848w)).mo31878a(j10);
            try {
                this.f35851z = ((InterfaceC6924f) C4349a.m21882e(this.f35848w)).mo33481b();
            } catch (C6925g e10) {
                m31892N(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f35850y != null) {
            long m31891M = m31891M();
            boolean z11 = false;
            while (true) {
                z10 = z11;
                if (m31891M > j10) {
                    break;
                }
                this.f35837A++;
                m31891M = m31891M();
                z11 = true;
            }
        } else {
            z10 = false;
        }
        AbstractC6928j abstractC6928j = this.f35851z;
        boolean z12 = z10;
        if (abstractC6928j != null) {
            if (abstractC6928j.isEndOfStream()) {
                z12 = z10;
                if (!z10) {
                    z12 = z10;
                    if (m31891M() == Long.MAX_VALUE) {
                        if (this.f35846u == 2) {
                            m31897S();
                            z12 = z10;
                        } else {
                            m31895Q();
                            this.f35844s = true;
                            z12 = z10;
                        }
                    }
                }
            } else {
                z12 = z10;
                if (abstractC6928j.timeUs <= j10) {
                    AbstractC6928j abstractC6928j2 = this.f35850y;
                    if (abstractC6928j2 != null) {
                        abstractC6928j2.release();
                    }
                    this.f35837A = abstractC6928j.mo31883a(j10);
                    this.f35850y = abstractC6928j;
                    this.f35851z = null;
                    z12 = true;
                }
            }
        }
        if (z12) {
            C4349a.m21882e(this.f35850y);
            m31899U(this.f35850y.mo31884b(j10));
        }
        if (this.f35846u == 2) {
            return;
        }
        while (!this.f35843r) {
            try {
                C6927i c6927i = this.f35849x;
                C6927i c6927i2 = c6927i;
                if (c6927i == null) {
                    c6927i2 = ((InterfaceC6924f) C4349a.m21882e(this.f35848w)).mo33547d();
                    if (c6927i2 == null) {
                        return;
                    } else {
                        this.f35849x = c6927i2;
                    }
                }
                if (this.f35846u == 1) {
                    c6927i2.setFlags(4);
                    ((InterfaceC6924f) C4349a.m21882e(this.f35848w)).mo33546c(c6927i2);
                    this.f35849x = null;
                    this.f35846u = 2;
                    return;
                }
                int m32698J = m32698J(this.f35842q, c6927i2, 0);
                if (m32698J == -4) {
                    if (c6927i2.isEndOfStream()) {
                        this.f35843r = true;
                        this.f35845t = false;
                    } else {
                        C7629w0 c7629w0 = this.f35842q.f37132b;
                        if (c7629w0 == null) {
                            return;
                        }
                        c6927i2.f35834i = c7629w0.f37090q;
                        c6927i2.m37082g();
                        this.f35845t &= !c6927i2.isKeyFrame();
                    }
                    if (!this.f35845t) {
                        ((InterfaceC6924f) C4349a.m21882e(this.f35848w)).mo33546c(c6927i2);
                        this.f35849x = null;
                    }
                } else if (m32698J == -3) {
                    return;
                }
            } catch (C6925g e11) {
                m31892N(e11);
                return;
            }
        }
    }
}
