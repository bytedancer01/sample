package p365v6;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p009a8.InterfaceC0127w;
import p059d9.C4349a;
import p059d9.C4401z0;
import p365v6.InterfaceC9290x;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v6/x.class
 */
/* renamed from: v6.x */
/* loaded from: combined.jar:classes2.jar:v6/x.class */
public interface InterfaceC9290x {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/x$a.class
     */
    /* renamed from: v6.x$a */
    /* loaded from: combined.jar:classes2.jar:v6/x$a.class */
    public static class a {

        /* renamed from: a */
        public final int f42391a;

        /* renamed from: b */
        public final InterfaceC0127w.a f42392b;

        /* renamed from: c */
        public final CopyOnWriteArrayList<C10332a> f42393c;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:v6/x$a$a.class
         */
        /* renamed from: v6.x$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:v6/x$a$a.class */
        public static final class C10332a {

            /* renamed from: a */
            public Handler f42394a;

            /* renamed from: b */
            public InterfaceC9290x f42395b;

            public C10332a(Handler handler, InterfaceC9290x interfaceC9290x) {
                this.f42394a = handler;
                this.f42395b = interfaceC9290x;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public a(CopyOnWriteArrayList<C10332a> copyOnWriteArrayList, int i10, InterfaceC0127w.a aVar) {
            this.f42393c = copyOnWriteArrayList;
            this.f42391a = i10;
            this.f42392b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m39167n(InterfaceC9290x interfaceC9290x) {
            interfaceC9290x.mo429k0(this.f42391a, this.f42392b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void m39168o(InterfaceC9290x interfaceC9290x) {
            interfaceC9290x.mo425X(this.f42391a, this.f42392b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ void m39169p(InterfaceC9290x interfaceC9290x) {
            interfaceC9290x.mo423P(this.f42391a, this.f42392b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void m39170q(InterfaceC9290x interfaceC9290x, int i10) {
            interfaceC9290x.mo424T(this.f42391a, this.f42392b);
            interfaceC9290x.mo430l(this.f42391a, this.f42392b, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m39171r(InterfaceC9290x interfaceC9290x, Exception exc) {
            interfaceC9290x.mo428g(this.f42391a, this.f42392b, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m39172s(InterfaceC9290x interfaceC9290x) {
            interfaceC9290x.mo431n(this.f42391a, this.f42392b);
        }

        /* renamed from: g */
        public void m39173g(Handler handler, InterfaceC9290x interfaceC9290x) {
            C4349a.m21882e(handler);
            C4349a.m21882e(interfaceC9290x);
            this.f42393c.add(new C10332a(handler, interfaceC9290x));
        }

        /* renamed from: h */
        public void m39174h() {
            Iterator<C10332a> it = this.f42393c.iterator();
            while (it.hasNext()) {
                C10332a next = it.next();
                final InterfaceC9290x interfaceC9290x = next.f42395b;
                C4401z0.m22336L0(next.f42394a, new Runnable(this, interfaceC9290x) { // from class: v6.v

                    /* renamed from: b */
                    public final InterfaceC9290x.a f42387b;

                    /* renamed from: c */
                    public final InterfaceC9290x f42388c;

                    {
                        this.f42387b = this;
                        this.f42388c = interfaceC9290x;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f42387b.m39167n(this.f42388c);
                    }
                });
            }
        }

        /* renamed from: i */
        public void m39175i() {
            Iterator<C10332a> it = this.f42393c.iterator();
            while (it.hasNext()) {
                C10332a next = it.next();
                final InterfaceC9290x interfaceC9290x = next.f42395b;
                C4401z0.m22336L0(next.f42394a, new Runnable(this, interfaceC9290x) { // from class: v6.u

                    /* renamed from: b */
                    public final InterfaceC9290x.a f42385b;

                    /* renamed from: c */
                    public final InterfaceC9290x f42386c;

                    {
                        this.f42385b = this;
                        this.f42386c = interfaceC9290x;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f42385b.m39168o(this.f42386c);
                    }
                });
            }
        }

        /* renamed from: j */
        public void m39176j() {
            Iterator<C10332a> it = this.f42393c.iterator();
            while (it.hasNext()) {
                C10332a next = it.next();
                final InterfaceC9290x interfaceC9290x = next.f42395b;
                C4401z0.m22336L0(next.f42394a, new Runnable(this, interfaceC9290x) { // from class: v6.w

                    /* renamed from: b */
                    public final InterfaceC9290x.a f42389b;

                    /* renamed from: c */
                    public final InterfaceC9290x f42390c;

                    {
                        this.f42389b = this;
                        this.f42390c = interfaceC9290x;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f42389b.m39169p(this.f42390c);
                    }
                });
            }
        }

        /* renamed from: k */
        public void m39177k(final int i10) {
            Iterator<C10332a> it = this.f42393c.iterator();
            while (it.hasNext()) {
                C10332a next = it.next();
                final InterfaceC9290x interfaceC9290x = next.f42395b;
                C4401z0.m22336L0(next.f42394a, new Runnable(this, interfaceC9290x, i10) { // from class: v6.t

                    /* renamed from: b */
                    public final InterfaceC9290x.a f42382b;

                    /* renamed from: c */
                    public final InterfaceC9290x f42383c;

                    /* renamed from: d */
                    public final int f42384d;

                    {
                        this.f42382b = this;
                        this.f42383c = interfaceC9290x;
                        this.f42384d = i10;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f42382b.m39170q(this.f42383c, this.f42384d);
                    }
                });
            }
        }

        /* renamed from: l */
        public void m39178l(final Exception exc) {
            Iterator<C10332a> it = this.f42393c.iterator();
            while (it.hasNext()) {
                C10332a next = it.next();
                final InterfaceC9290x interfaceC9290x = next.f42395b;
                C4401z0.m22336L0(next.f42394a, new Runnable(this, interfaceC9290x, exc) { // from class: v6.s

                    /* renamed from: b */
                    public final InterfaceC9290x.a f42379b;

                    /* renamed from: c */
                    public final InterfaceC9290x f42380c;

                    /* renamed from: d */
                    public final Exception f42381d;

                    {
                        this.f42379b = this;
                        this.f42380c = interfaceC9290x;
                        this.f42381d = exc;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f42379b.m39171r(this.f42380c, this.f42381d);
                    }
                });
            }
        }

        /* renamed from: m */
        public void m39179m() {
            Iterator<C10332a> it = this.f42393c.iterator();
            while (it.hasNext()) {
                C10332a next = it.next();
                final InterfaceC9290x interfaceC9290x = next.f42395b;
                C4401z0.m22336L0(next.f42394a, new Runnable(this, interfaceC9290x) { // from class: v6.r

                    /* renamed from: b */
                    public final InterfaceC9290x.a f42376b;

                    /* renamed from: c */
                    public final InterfaceC9290x f42377c;

                    {
                        this.f42376b = this;
                        this.f42377c = interfaceC9290x;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f42376b.m39172s(this.f42377c);
                    }
                });
            }
        }

        /* renamed from: t */
        public void m39180t(InterfaceC9290x interfaceC9290x) {
            Iterator<C10332a> it = this.f42393c.iterator();
            while (it.hasNext()) {
                C10332a next = it.next();
                if (next.f42395b == interfaceC9290x) {
                    this.f42393c.remove(next);
                }
            }
        }

        /* renamed from: u */
        public a m39181u(int i10, InterfaceC0127w.a aVar) {
            return new a(this.f42393c, i10, aVar);
        }
    }

    /* renamed from: P */
    void mo423P(int i10, InterfaceC0127w.a aVar);

    @Deprecated
    /* renamed from: T */
    void mo424T(int i10, InterfaceC0127w.a aVar);

    /* renamed from: X */
    void mo425X(int i10, InterfaceC0127w.a aVar);

    /* renamed from: g */
    void mo428g(int i10, InterfaceC0127w.a aVar, Exception exc);

    /* renamed from: k0 */
    void mo429k0(int i10, InterfaceC0127w.a aVar);

    /* renamed from: l */
    void mo430l(int i10, InterfaceC0127w.a aVar, int i11);

    /* renamed from: n */
    void mo431n(int i10, InterfaceC0127w.a aVar);
}
