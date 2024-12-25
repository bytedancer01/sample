package p301r6;

import android.os.Handler;
import p059d9.C4349a;
import p059d9.C4401z0;
import p267p6.C7629w0;
import p301r6.InterfaceC8002t;
import p332t6.C8636d;
import p332t6.C8639g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/t.class
 */
/* renamed from: r6.t */
/* loaded from: combined.jar:classes2.jar:r6/t.class */
public interface InterfaceC8002t {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/t$a.class
     */
    /* renamed from: r6.t$a */
    /* loaded from: combined.jar:classes2.jar:r6/t$a.class */
    public static final class a {

        /* renamed from: a */
        public final Handler f38715a;

        /* renamed from: b */
        public final InterfaceC8002t f38716b;

        public a(Handler handler, InterfaceC8002t interfaceC8002t) {
            this.f38715a = interfaceC8002t != null ? (Handler) C4349a.m21882e(handler) : null;
            this.f38716b = interfaceC8002t;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: A */
        public /* synthetic */ void m34780A(int i10, long j10, long j11) {
            ((InterfaceC8002t) C4401z0.m22391j(this.f38716b)).mo32522j0(i10, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m34791r(Exception exc) {
            ((InterfaceC8002t) C4401z0.m22391j(this.f38716b)).mo32520f0(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m34792s(Exception exc) {
            ((InterfaceC8002t) C4401z0.m22391j(this.f38716b)).mo32518b(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public /* synthetic */ void m34793t(String str, long j10, long j11) {
            ((InterfaceC8002t) C4401z0.m22391j(this.f38716b)).mo32524r(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public /* synthetic */ void m34794u(String str) {
            ((InterfaceC8002t) C4401z0.m22391j(this.f38716b)).mo32523q(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public /* synthetic */ void m34795v(C8636d c8636d) {
            c8636d.m37078c();
            ((InterfaceC8002t) C4401z0.m22391j(this.f38716b)).mo32527z(c8636d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public /* synthetic */ void m34796w(C8636d c8636d) {
            ((InterfaceC8002t) C4401z0.m22391j(this.f38716b)).mo32511B(c8636d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ void m34797x(C7629w0 c7629w0, C8639g c8639g) {
            ((InterfaceC8002t) C4401z0.m22391j(this.f38716b)).mo32525u(c7629w0);
            ((InterfaceC8002t) C4401z0.m22391j(this.f38716b)).mo32519d(c7629w0, c8639g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public /* synthetic */ void m34798y(long j10) {
            ((InterfaceC8002t) C4401z0.m22391j(this.f38716b)).mo32513F(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public /* synthetic */ void m34799z(boolean z10) {
            ((InterfaceC8002t) C4401z0.m22391j(this.f38716b)).mo32517a(z10);
        }

        /* renamed from: B */
        public void m34800B(final long j10) {
            Handler handler = this.f38715a;
            if (handler != null) {
                handler.post(new Runnable(this, j10) { // from class: r6.l

                    /* renamed from: b */
                    public final InterfaceC8002t.a f38639b;

                    /* renamed from: c */
                    public final long f38640c;

                    {
                        this.f38639b = this;
                        this.f38640c = j10;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38639b.m34798y(this.f38640c);
                    }
                });
            }
        }

        /* renamed from: C */
        public void m34801C(final boolean z10) {
            Handler handler = this.f38715a;
            if (handler != null) {
                handler.post(new Runnable(this, z10) { // from class: r6.r

                    /* renamed from: b */
                    public final InterfaceC8002t.a f38709b;

                    /* renamed from: c */
                    public final boolean f38710c;

                    {
                        this.f38709b = this;
                        this.f38710c = z10;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38709b.m34799z(this.f38710c);
                    }
                });
            }
        }

        /* renamed from: D */
        public void m34802D(final int i10, final long j10, final long j11) {
            Handler handler = this.f38715a;
            if (handler != null) {
                handler.post(new Runnable(this, i10, j10, j11) { // from class: r6.s

                    /* renamed from: b */
                    public final InterfaceC8002t.a f38711b;

                    /* renamed from: c */
                    public final int f38712c;

                    /* renamed from: d */
                    public final long f38713d;

                    /* renamed from: e */
                    public final long f38714e;

                    {
                        this.f38711b = this;
                        this.f38712c = i10;
                        this.f38713d = j10;
                        this.f38714e = j11;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38711b.m34780A(this.f38712c, this.f38713d, this.f38714e);
                    }
                });
            }
        }

        /* renamed from: k */
        public void m34803k(final Exception exc) {
            Handler handler = this.f38715a;
            if (handler != null) {
                handler.post(new Runnable(this, exc) { // from class: r6.p

                    /* renamed from: b */
                    public final InterfaceC8002t.a f38696b;

                    /* renamed from: c */
                    public final Exception f38697c;

                    {
                        this.f38696b = this;
                        this.f38697c = exc;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38696b.m34791r(this.f38697c);
                    }
                });
            }
        }

        /* renamed from: l */
        public void m34804l(final Exception exc) {
            Handler handler = this.f38715a;
            if (handler != null) {
                handler.post(new Runnable(this, exc) { // from class: r6.o

                    /* renamed from: b */
                    public final InterfaceC8002t.a f38679b;

                    /* renamed from: c */
                    public final Exception f38680c;

                    {
                        this.f38679b = this;
                        this.f38680c = exc;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38679b.m34792s(this.f38680c);
                    }
                });
            }
        }

        /* renamed from: m */
        public void m34805m(final String str, final long j10, final long j11) {
            Handler handler = this.f38715a;
            if (handler != null) {
                handler.post(new Runnable(this, str, j10, j11) { // from class: r6.q

                    /* renamed from: b */
                    public final InterfaceC8002t.a f38705b;

                    /* renamed from: c */
                    public final String f38706c;

                    /* renamed from: d */
                    public final long f38707d;

                    /* renamed from: e */
                    public final long f38708e;

                    {
                        this.f38705b = this;
                        this.f38706c = str;
                        this.f38707d = j10;
                        this.f38708e = j11;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38705b.m34793t(this.f38706c, this.f38707d, this.f38708e);
                    }
                });
            }
        }

        /* renamed from: n */
        public void m34806n(final String str) {
            Handler handler = this.f38715a;
            if (handler != null) {
                handler.post(new Runnable(this, str) { // from class: r6.j

                    /* renamed from: b */
                    public final InterfaceC8002t.a f38620b;

                    /* renamed from: c */
                    public final String f38621c;

                    {
                        this.f38620b = this;
                        this.f38621c = str;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38620b.m34794u(this.f38621c);
                    }
                });
            }
        }

        /* renamed from: o */
        public void m34807o(final C8636d c8636d) {
            c8636d.m37078c();
            Handler handler = this.f38715a;
            if (handler != null) {
                handler.post(new Runnable(this, c8636d) { // from class: r6.m

                    /* renamed from: b */
                    public final InterfaceC8002t.a f38641b;

                    /* renamed from: c */
                    public final C8636d f38642c;

                    {
                        this.f38641b = this;
                        this.f38642c = c8636d;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38641b.m34795v(this.f38642c);
                    }
                });
            }
        }

        /* renamed from: p */
        public void m34808p(final C8636d c8636d) {
            Handler handler = this.f38715a;
            if (handler != null) {
                handler.post(new Runnable(this, c8636d) { // from class: r6.n

                    /* renamed from: b */
                    public final InterfaceC8002t.a f38655b;

                    /* renamed from: c */
                    public final C8636d f38656c;

                    {
                        this.f38655b = this;
                        this.f38656c = c8636d;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38655b.m34796w(this.f38656c);
                    }
                });
            }
        }

        /* renamed from: q */
        public void m34809q(final C7629w0 c7629w0, final C8639g c8639g) {
            Handler handler = this.f38715a;
            if (handler != null) {
                handler.post(new Runnable(this, c7629w0, c8639g) { // from class: r6.k

                    /* renamed from: b */
                    public final InterfaceC8002t.a f38636b;

                    /* renamed from: c */
                    public final C7629w0 f38637c;

                    /* renamed from: d */
                    public final C8639g f38638d;

                    {
                        this.f38636b = this;
                        this.f38637c = c7629w0;
                        this.f38638d = c8639g;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38636b.m34797x(this.f38637c, this.f38638d);
                    }
                });
            }
        }
    }

    /* renamed from: B */
    void mo32511B(C8636d c8636d);

    /* renamed from: F */
    void mo32513F(long j10);

    /* renamed from: a */
    void mo32517a(boolean z10);

    /* renamed from: b */
    void mo32518b(Exception exc);

    /* renamed from: d */
    void mo32519d(C7629w0 c7629w0, C8639g c8639g);

    /* renamed from: f0 */
    void mo32520f0(Exception exc);

    /* renamed from: j0 */
    void mo32522j0(int i10, long j10, long j11);

    /* renamed from: q */
    void mo32523q(String str);

    /* renamed from: r */
    void mo32524r(String str, long j10, long j11);

    @Deprecated
    /* renamed from: u */
    void mo32525u(C7629w0 c7629w0);

    /* renamed from: z */
    void mo32527z(C8636d c8636d);
}
