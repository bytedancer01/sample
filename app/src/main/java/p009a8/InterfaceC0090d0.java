package p009a8;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p009a8.InterfaceC0090d0;
import p009a8.InterfaceC0127w;
import p059d9.C4349a;
import p059d9.C4401z0;
import p267p6.C7583h;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/d0.class
 */
/* renamed from: a8.d0 */
/* loaded from: combined.jar:classes2.jar:a8/d0.class */
public interface InterfaceC0090d0 {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/d0$a.class
     */
    /* renamed from: a8.d0$a */
    /* loaded from: combined.jar:classes2.jar:a8/d0$a.class */
    public static class a {

        /* renamed from: a */
        public final int f285a;

        /* renamed from: b */
        public final InterfaceC0127w.a f286b;

        /* renamed from: c */
        public final CopyOnWriteArrayList<C10249a> f287c;

        /* renamed from: d */
        public final long f288d;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:a8/d0$a$a.class
         */
        /* renamed from: a8.d0$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:a8/d0$a$a.class */
        public static final class C10249a {

            /* renamed from: a */
            public Handler f289a;

            /* renamed from: b */
            public InterfaceC0090d0 f290b;

            public C10249a(Handler handler, InterfaceC0090d0 interfaceC0090d0) {
                this.f289a = handler;
                this.f290b = interfaceC0090d0;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public a(CopyOnWriteArrayList<C10249a> copyOnWriteArrayList, int i10, InterfaceC0127w.a aVar, long j10) {
            this.f287c = copyOnWriteArrayList;
            this.f285a = i10;
            this.f286b = aVar;
            this.f288d = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m371k(InterfaceC0090d0 interfaceC0090d0, C0117r c0117r) {
            interfaceC0090d0.mo360K(this.f285a, this.f286b, c0117r);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m372l(InterfaceC0090d0 interfaceC0090d0, C0111o c0111o, C0117r c0117r) {
            interfaceC0090d0.mo361U(this.f285a, this.f286b, c0111o, c0117r);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m373m(InterfaceC0090d0 interfaceC0090d0, C0111o c0111o, C0117r c0117r) {
            interfaceC0090d0.mo359J(this.f285a, this.f286b, c0111o, c0117r);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m374n(InterfaceC0090d0 interfaceC0090d0, C0111o c0111o, C0117r c0117r, IOException iOException, boolean z10) {
            interfaceC0090d0.mo363Z(this.f285a, this.f286b, c0111o, c0117r, iOException, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void m375o(InterfaceC0090d0 interfaceC0090d0, C0111o c0111o, C0117r c0117r) {
            interfaceC0090d0.mo364h0(this.f285a, this.f286b, c0111o, c0117r);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ void m376p(InterfaceC0090d0 interfaceC0090d0, InterfaceC0127w.a aVar, C0117r c0117r) {
            interfaceC0090d0.mo362W(this.f285a, aVar, c0117r);
        }

        /* renamed from: A */
        public void m377A(C0111o c0111o, int i10, int i11, C7629w0 c7629w0, int i12, Object obj, long j10, long j11) {
            m378B(c0111o, new C0117r(i10, i11, c7629w0, i12, obj, m384h(j10), m384h(j11)));
        }

        /* renamed from: B */
        public void m378B(final C0111o c0111o, final C0117r c0117r) {
            Iterator<C10249a> it = this.f287c.iterator();
            while (it.hasNext()) {
                C10249a next = it.next();
                final InterfaceC0090d0 interfaceC0090d0 = next.f290b;
                C4401z0.m22336L0(next.f289a, new Runnable(this, interfaceC0090d0, c0111o, c0117r) { // from class: a8.x

                    /* renamed from: b */
                    public final InterfaceC0090d0.a f588b;

                    /* renamed from: c */
                    public final InterfaceC0090d0 f589c;

                    /* renamed from: d */
                    public final C0111o f590d;

                    /* renamed from: e */
                    public final C0117r f591e;

                    {
                        this.f588b = this;
                        this.f589c = interfaceC0090d0;
                        this.f590d = c0111o;
                        this.f591e = c0117r;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f588b.m375o(this.f589c, this.f590d, this.f591e);
                    }
                });
            }
        }

        /* renamed from: C */
        public void m379C(InterfaceC0090d0 interfaceC0090d0) {
            Iterator<C10249a> it = this.f287c.iterator();
            while (it.hasNext()) {
                C10249a next = it.next();
                if (next.f290b == interfaceC0090d0) {
                    this.f287c.remove(next);
                }
            }
        }

        /* renamed from: D */
        public void m380D(int i10, long j10, long j11) {
            m381E(new C0117r(1, i10, null, 3, null, m384h(j10), m384h(j11)));
        }

        /* renamed from: E */
        public void m381E(final C0117r c0117r) {
            final InterfaceC0127w.a aVar = (InterfaceC0127w.a) C4349a.m21882e(this.f286b);
            Iterator<C10249a> it = this.f287c.iterator();
            while (it.hasNext()) {
                C10249a next = it.next();
                final InterfaceC0090d0 interfaceC0090d0 = next.f290b;
                C4401z0.m22336L0(next.f289a, new Runnable(this, interfaceC0090d0, aVar, c0117r) { // from class: a8.c0

                    /* renamed from: b */
                    public final InterfaceC0090d0.a f272b;

                    /* renamed from: c */
                    public final InterfaceC0090d0 f273c;

                    /* renamed from: d */
                    public final InterfaceC0127w.a f274d;

                    /* renamed from: e */
                    public final C0117r f275e;

                    {
                        this.f272b = this;
                        this.f273c = interfaceC0090d0;
                        this.f274d = aVar;
                        this.f275e = c0117r;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f272b.m376p(this.f273c, this.f274d, this.f275e);
                    }
                });
            }
        }

        /* renamed from: F */
        public a m382F(int i10, InterfaceC0127w.a aVar, long j10) {
            return new a(this.f287c, i10, aVar, j10);
        }

        /* renamed from: g */
        public void m383g(Handler handler, InterfaceC0090d0 interfaceC0090d0) {
            C4349a.m21882e(handler);
            C4349a.m21882e(interfaceC0090d0);
            this.f287c.add(new C10249a(handler, interfaceC0090d0));
        }

        /* renamed from: h */
        public final long m384h(long j10) {
            long m32761e = C7583h.m32761e(j10);
            long j11 = -9223372036854775807L;
            if (m32761e != -9223372036854775807L) {
                j11 = this.f288d + m32761e;
            }
            return j11;
        }

        /* renamed from: i */
        public void m385i(int i10, C7629w0 c7629w0, int i11, Object obj, long j10) {
            m386j(new C0117r(1, i10, c7629w0, i11, obj, m384h(j10), -9223372036854775807L));
        }

        /* renamed from: j */
        public void m386j(final C0117r c0117r) {
            Iterator<C10249a> it = this.f287c.iterator();
            while (it.hasNext()) {
                C10249a next = it.next();
                final InterfaceC0090d0 interfaceC0090d0 = next.f290b;
                C4401z0.m22336L0(next.f289a, new Runnable(this, interfaceC0090d0, c0117r) { // from class: a8.y

                    /* renamed from: b */
                    public final InterfaceC0090d0.a f606b;

                    /* renamed from: c */
                    public final InterfaceC0090d0 f607c;

                    /* renamed from: d */
                    public final C0117r f608d;

                    {
                        this.f606b = this;
                        this.f607c = interfaceC0090d0;
                        this.f608d = c0117r;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f606b.m371k(this.f607c, this.f608d);
                    }
                });
            }
        }

        /* renamed from: q */
        public void m387q(C0111o c0111o, int i10) {
            m388r(c0111o, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: r */
        public void m388r(C0111o c0111o, int i10, int i11, C7629w0 c7629w0, int i12, Object obj, long j10, long j11) {
            m389s(c0111o, new C0117r(i10, i11, c7629w0, i12, obj, m384h(j10), m384h(j11)));
        }

        /* renamed from: s */
        public void m389s(final C0111o c0111o, final C0117r c0117r) {
            Iterator<C10249a> it = this.f287c.iterator();
            while (it.hasNext()) {
                C10249a next = it.next();
                final InterfaceC0090d0 interfaceC0090d0 = next.f290b;
                C4401z0.m22336L0(next.f289a, new Runnable(this, interfaceC0090d0, c0111o, c0117r) { // from class: a8.b0

                    /* renamed from: b */
                    public final InterfaceC0090d0.a f264b;

                    /* renamed from: c */
                    public final InterfaceC0090d0 f265c;

                    /* renamed from: d */
                    public final C0111o f266d;

                    /* renamed from: e */
                    public final C0117r f267e;

                    {
                        this.f264b = this;
                        this.f265c = interfaceC0090d0;
                        this.f266d = c0111o;
                        this.f267e = c0117r;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f264b.m372l(this.f265c, this.f266d, this.f267e);
                    }
                });
            }
        }

        /* renamed from: t */
        public void m390t(C0111o c0111o, int i10) {
            m391u(c0111o, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: u */
        public void m391u(C0111o c0111o, int i10, int i11, C7629w0 c7629w0, int i12, Object obj, long j10, long j11) {
            m392v(c0111o, new C0117r(i10, i11, c7629w0, i12, obj, m384h(j10), m384h(j11)));
        }

        /* renamed from: v */
        public void m392v(final C0111o c0111o, final C0117r c0117r) {
            Iterator<C10249a> it = this.f287c.iterator();
            while (it.hasNext()) {
                C10249a next = it.next();
                final InterfaceC0090d0 interfaceC0090d0 = next.f290b;
                C4401z0.m22336L0(next.f289a, new Runnable(this, interfaceC0090d0, c0111o, c0117r) { // from class: a8.a0

                    /* renamed from: b */
                    public final InterfaceC0090d0.a f256b;

                    /* renamed from: c */
                    public final InterfaceC0090d0 f257c;

                    /* renamed from: d */
                    public final C0111o f258d;

                    /* renamed from: e */
                    public final C0117r f259e;

                    {
                        this.f256b = this;
                        this.f257c = interfaceC0090d0;
                        this.f258d = c0111o;
                        this.f259e = c0117r;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f256b.m373m(this.f257c, this.f258d, this.f259e);
                    }
                });
            }
        }

        /* renamed from: w */
        public void m393w(C0111o c0111o, int i10, int i11, C7629w0 c7629w0, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            m395y(c0111o, new C0117r(i10, i11, c7629w0, i12, obj, m384h(j10), m384h(j11)), iOException, z10);
        }

        /* renamed from: x */
        public void m394x(C0111o c0111o, int i10, IOException iOException, boolean z10) {
            m393w(c0111o, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        /* renamed from: y */
        public void m395y(final C0111o c0111o, final C0117r c0117r, final IOException iOException, final boolean z10) {
            Iterator<C10249a> it = this.f287c.iterator();
            while (it.hasNext()) {
                C10249a next = it.next();
                final InterfaceC0090d0 interfaceC0090d0 = next.f290b;
                C4401z0.m22336L0(next.f289a, new Runnable(this, interfaceC0090d0, c0111o, c0117r, iOException, z10) { // from class: a8.z

                    /* renamed from: b */
                    public final InterfaceC0090d0.a f612b;

                    /* renamed from: c */
                    public final InterfaceC0090d0 f613c;

                    /* renamed from: d */
                    public final C0111o f614d;

                    /* renamed from: e */
                    public final C0117r f615e;

                    /* renamed from: f */
                    public final IOException f616f;

                    /* renamed from: g */
                    public final boolean f617g;

                    {
                        this.f612b = this;
                        this.f613c = interfaceC0090d0;
                        this.f614d = c0111o;
                        this.f615e = c0117r;
                        this.f616f = iOException;
                        this.f617g = z10;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f612b.m374n(this.f613c, this.f614d, this.f615e, this.f616f, this.f617g);
                    }
                });
            }
        }

        /* renamed from: z */
        public void m396z(C0111o c0111o, int i10) {
            m377A(c0111o, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
    }

    /* renamed from: J */
    void mo359J(int i10, InterfaceC0127w.a aVar, C0111o c0111o, C0117r c0117r);

    /* renamed from: K */
    void mo360K(int i10, InterfaceC0127w.a aVar, C0117r c0117r);

    /* renamed from: U */
    void mo361U(int i10, InterfaceC0127w.a aVar, C0111o c0111o, C0117r c0117r);

    /* renamed from: W */
    void mo362W(int i10, InterfaceC0127w.a aVar, C0117r c0117r);

    /* renamed from: Z */
    void mo363Z(int i10, InterfaceC0127w.a aVar, C0111o c0111o, C0117r c0117r, IOException iOException, boolean z10);

    /* renamed from: h0 */
    void mo364h0(int i10, InterfaceC0127w.a aVar, C0111o c0111o, C0117r c0117r);
}
