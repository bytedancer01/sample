package p078e9;

import android.os.Handler;
import android.os.SystemClock;
import p059d9.C4349a;
import p059d9.C4401z0;
import p078e9.InterfaceC4668c0;
import p267p6.C7629w0;
import p332t6.C8636d;
import p332t6.C8639g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e9/c0.class
 */
/* renamed from: e9.c0 */
/* loaded from: combined.jar:classes2.jar:e9/c0.class */
public interface InterfaceC4668c0 {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:e9/c0$a.class
     */
    /* renamed from: e9.c0$a */
    /* loaded from: combined.jar:classes2.jar:e9/c0$a.class */
    public static final class a {

        /* renamed from: a */
        public final Handler f27552a;

        /* renamed from: b */
        public final InterfaceC4668c0 f27553b;

        public a(Handler handler, InterfaceC4668c0 interfaceC4668c0) {
            this.f27552a = interfaceC4668c0 != null ? (Handler) C4349a.m21882e(handler) : null;
            this.f27553b = interfaceC4668c0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void m23468q(String str, long j10, long j11) {
            ((InterfaceC4668c0) C4401z0.m22391j(this.f27553b)).mo23454k(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m23469r(String str) {
            ((InterfaceC4668c0) C4401z0.m22391j(this.f27553b)).mo23453i(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m23470s(C8636d c8636d) {
            c8636d.m37078c();
            ((InterfaceC4668c0) C4401z0.m22391j(this.f27553b)).mo23450b0(c8636d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public /* synthetic */ void m23471t(int i10, long j10) {
            ((InterfaceC4668c0) C4401z0.m22391j(this.f27553b)).mo23449V(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public /* synthetic */ void m23472u(C8636d c8636d) {
            ((InterfaceC4668c0) C4401z0.m22391j(this.f27553b)).mo23448H(c8636d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public /* synthetic */ void m23473v(C7629w0 c7629w0, C8639g c8639g) {
            ((InterfaceC4668c0) C4401z0.m22391j(this.f27553b)).mo23457v(c7629w0);
            ((InterfaceC4668c0) C4401z0.m22391j(this.f27553b)).mo23456t(c7629w0, c8639g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public /* synthetic */ void m23474w(Object obj, long j10) {
            ((InterfaceC4668c0) C4401z0.m22391j(this.f27553b)).mo23452c0(obj, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ void m23475x(long j10, int i10) {
            ((InterfaceC4668c0) C4401z0.m22391j(this.f27553b)).mo23455l0(j10, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public /* synthetic */ void m23476y(Exception exc) {
            ((InterfaceC4668c0) C4401z0.m22391j(this.f27553b)).mo23447G(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public /* synthetic */ void m23477z(C4670d0 c4670d0) {
            ((InterfaceC4668c0) C4401z0.m22391j(this.f27553b)).mo23451c(c4670d0);
        }

        /* renamed from: A */
        public void m23478A(final Object obj) {
            if (this.f27552a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f27552a.post(new Runnable(this, obj, elapsedRealtime) { // from class: e9.z

                    /* renamed from: b */
                    public final InterfaceC4668c0.a f27694b;

                    /* renamed from: c */
                    public final Object f27695c;

                    /* renamed from: d */
                    public final long f27696d;

                    {
                        this.f27694b = this;
                        this.f27695c = obj;
                        this.f27696d = elapsedRealtime;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27694b.m23474w(this.f27695c, this.f27696d);
                    }
                });
            }
        }

        /* renamed from: B */
        public void m23479B(final long j10, final int i10) {
            Handler handler = this.f27552a;
            if (handler != null) {
                handler.post(new Runnable(this, j10, i10) { // from class: e9.w

                    /* renamed from: b */
                    public final InterfaceC4668c0.a f27686b;

                    /* renamed from: c */
                    public final long f27687c;

                    /* renamed from: d */
                    public final int f27688d;

                    {
                        this.f27686b = this;
                        this.f27687c = j10;
                        this.f27688d = i10;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27686b.m23475x(this.f27687c, this.f27688d);
                    }
                });
            }
        }

        /* renamed from: C */
        public void m23480C(final Exception exc) {
            Handler handler = this.f27552a;
            if (handler != null) {
                handler.post(new Runnable(this, exc) { // from class: e9.y

                    /* renamed from: b */
                    public final InterfaceC4668c0.a f27692b;

                    /* renamed from: c */
                    public final Exception f27693c;

                    {
                        this.f27692b = this;
                        this.f27693c = exc;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27692b.m23476y(this.f27693c);
                    }
                });
            }
        }

        /* renamed from: D */
        public void m23481D(final C4670d0 c4670d0) {
            Handler handler = this.f27552a;
            if (handler != null) {
                handler.post(new Runnable(this, c4670d0) { // from class: e9.v

                    /* renamed from: b */
                    public final InterfaceC4668c0.a f27684b;

                    /* renamed from: c */
                    public final C4670d0 f27685c;

                    {
                        this.f27684b = this;
                        this.f27685c = c4670d0;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27684b.m23477z(this.f27685c);
                    }
                });
            }
        }

        /* renamed from: k */
        public void m23482k(final String str, final long j10, final long j11) {
            Handler handler = this.f27552a;
            if (handler != null) {
                handler.post(new Runnable(this, str, j10, j11) { // from class: e9.b0

                    /* renamed from: b */
                    public final InterfaceC4668c0.a f27513b;

                    /* renamed from: c */
                    public final String f27514c;

                    /* renamed from: d */
                    public final long f27515d;

                    /* renamed from: e */
                    public final long f27516e;

                    {
                        this.f27513b = this;
                        this.f27514c = str;
                        this.f27515d = j10;
                        this.f27516e = j11;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27513b.m23468q(this.f27514c, this.f27515d, this.f27516e);
                    }
                });
            }
        }

        /* renamed from: l */
        public void m23483l(final String str) {
            Handler handler = this.f27552a;
            if (handler != null) {
                handler.post(new Runnable(this, str) { // from class: e9.u

                    /* renamed from: b */
                    public final InterfaceC4668c0.a f27682b;

                    /* renamed from: c */
                    public final String f27683c;

                    {
                        this.f27682b = this;
                        this.f27683c = str;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27682b.m23469r(this.f27683c);
                    }
                });
            }
        }

        /* renamed from: m */
        public void m23484m(final C8636d c8636d) {
            c8636d.m37078c();
            Handler handler = this.f27552a;
            if (handler != null) {
                handler.post(new Runnable(this, c8636d) { // from class: e9.s

                    /* renamed from: b */
                    public final InterfaceC4668c0.a f27678b;

                    /* renamed from: c */
                    public final C8636d f27679c;

                    {
                        this.f27678b = this;
                        this.f27679c = c8636d;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27678b.m23470s(this.f27679c);
                    }
                });
            }
        }

        /* renamed from: n */
        public void m23485n(final int i10, final long j10) {
            Handler handler = this.f27552a;
            if (handler != null) {
                handler.post(new Runnable(this, i10, j10) { // from class: e9.a0

                    /* renamed from: b */
                    public final InterfaceC4668c0.a f27505b;

                    /* renamed from: c */
                    public final int f27506c;

                    /* renamed from: d */
                    public final long f27507d;

                    {
                        this.f27505b = this;
                        this.f27506c = i10;
                        this.f27507d = j10;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27505b.m23471t(this.f27506c, this.f27507d);
                    }
                });
            }
        }

        /* renamed from: o */
        public void m23486o(final C8636d c8636d) {
            Handler handler = this.f27552a;
            if (handler != null) {
                handler.post(new Runnable(this, c8636d) { // from class: e9.t

                    /* renamed from: b */
                    public final InterfaceC4668c0.a f27680b;

                    /* renamed from: c */
                    public final C8636d f27681c;

                    {
                        this.f27680b = this;
                        this.f27681c = c8636d;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27680b.m23472u(this.f27681c);
                    }
                });
            }
        }

        /* renamed from: p */
        public void m23487p(final C7629w0 c7629w0, final C8639g c8639g) {
            Handler handler = this.f27552a;
            if (handler != null) {
                handler.post(new Runnable(this, c7629w0, c8639g) { // from class: e9.x

                    /* renamed from: b */
                    public final InterfaceC4668c0.a f27689b;

                    /* renamed from: c */
                    public final C7629w0 f27690c;

                    /* renamed from: d */
                    public final C8639g f27691d;

                    {
                        this.f27689b = this;
                        this.f27690c = c7629w0;
                        this.f27691d = c8639g;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27689b.m23473v(this.f27690c, this.f27691d);
                    }
                });
            }
        }
    }

    /* renamed from: G */
    void mo23447G(Exception exc);

    /* renamed from: H */
    void mo23448H(C8636d c8636d);

    /* renamed from: V */
    void mo23449V(int i10, long j10);

    /* renamed from: b0 */
    void mo23450b0(C8636d c8636d);

    /* renamed from: c */
    void mo23451c(C4670d0 c4670d0);

    /* renamed from: c0 */
    void mo23452c0(Object obj, long j10);

    /* renamed from: i */
    void mo23453i(String str);

    /* renamed from: k */
    void mo23454k(String str, long j10, long j11);

    /* renamed from: l0 */
    void mo23455l0(long j10, int i10);

    /* renamed from: t */
    void mo23456t(C7629w0 c7629w0, C8639g c8639g);

    @Deprecated
    /* renamed from: v */
    void mo23457v(C7629w0 c7629w0);
}
