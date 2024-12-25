package p009a8;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import p009a8.InterfaceC0090d0;
import p009a8.InterfaceC0127w;
import p027b9.InterfaceC0853l0;
import p059d9.C4349a;
import p059d9.C4401z0;
import p267p6.AbstractC7574e2;
import p365v6.C9279q;
import p365v6.InterfaceC9290x;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/g.class
 */
/* renamed from: a8.g */
/* loaded from: combined.jar:classes2.jar:a8/g.class */
public abstract class AbstractC0095g<T> extends AbstractC0081a {

    /* renamed from: h */
    public final HashMap<T, b<T>> f323h = new HashMap<>();

    /* renamed from: i */
    public Handler f324i;

    /* renamed from: j */
    public InterfaceC0853l0 f325j;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/g$a.class
     */
    /* renamed from: a8.g$a */
    /* loaded from: combined.jar:classes2.jar:a8/g$a.class */
    public final class a implements InterfaceC0090d0, InterfaceC9290x {

        /* renamed from: b */
        public final T f326b;

        /* renamed from: c */
        public InterfaceC0090d0.a f327c;

        /* renamed from: d */
        public InterfaceC9290x.a f328d;

        /* renamed from: e */
        public final AbstractC0095g f329e;

        public a(AbstractC0095g abstractC0095g, T t10) {
            this.f329e = abstractC0095g;
            this.f327c = abstractC0095g.m319w(null);
            this.f328d = abstractC0095g.m317u(null);
            this.f326b = t10;
        }

        @Override // p009a8.InterfaceC0090d0
        /* renamed from: J */
        public void mo359J(int i10, InterfaceC0127w.a aVar, C0111o c0111o, C0117r c0117r) {
            if (m426a(i10, aVar)) {
                this.f327c.m392v(c0111o, m427b(c0117r));
            }
        }

        @Override // p009a8.InterfaceC0090d0
        /* renamed from: K */
        public void mo360K(int i10, InterfaceC0127w.a aVar, C0117r c0117r) {
            if (m426a(i10, aVar)) {
                this.f327c.m386j(m427b(c0117r));
            }
        }

        @Override // p365v6.InterfaceC9290x
        /* renamed from: P */
        public void mo423P(int i10, InterfaceC0127w.a aVar) {
            if (m426a(i10, aVar)) {
                this.f328d.m39176j();
            }
        }

        @Override // p365v6.InterfaceC9290x
        /* renamed from: T */
        public /* synthetic */ void mo424T(int i10, InterfaceC0127w.a aVar) {
            C9279q.m39150a(this, i10, aVar);
        }

        @Override // p009a8.InterfaceC0090d0
        /* renamed from: U */
        public void mo361U(int i10, InterfaceC0127w.a aVar, C0111o c0111o, C0117r c0117r) {
            if (m426a(i10, aVar)) {
                this.f327c.m389s(c0111o, m427b(c0117r));
            }
        }

        @Override // p009a8.InterfaceC0090d0
        /* renamed from: W */
        public void mo362W(int i10, InterfaceC0127w.a aVar, C0117r c0117r) {
            if (m426a(i10, aVar)) {
                this.f327c.m381E(m427b(c0117r));
            }
        }

        @Override // p365v6.InterfaceC9290x
        /* renamed from: X */
        public void mo425X(int i10, InterfaceC0127w.a aVar) {
            if (m426a(i10, aVar)) {
                this.f328d.m39175i();
            }
        }

        @Override // p009a8.InterfaceC0090d0
        /* renamed from: Z */
        public void mo363Z(int i10, InterfaceC0127w.a aVar, C0111o c0111o, C0117r c0117r, IOException iOException, boolean z10) {
            if (m426a(i10, aVar)) {
                this.f327c.m395y(c0111o, m427b(c0117r), iOException, z10);
            }
        }

        /* renamed from: a */
        public final boolean m426a(int i10, InterfaceC0127w.a aVar) {
            InterfaceC0127w.a aVar2;
            if (aVar != null) {
                InterfaceC0127w.a mo418F = this.f329e.mo418F(this.f326b, aVar);
                aVar2 = mo418F;
                if (mo418F == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int m420H = this.f329e.m420H(this.f326b, i10);
            InterfaceC0090d0.a aVar3 = this.f327c;
            if (aVar3.f285a != m420H || !C4401z0.m22371c(aVar3.f286b, aVar2)) {
                this.f327c = this.f329e.m318v(m420H, aVar2, 0L);
            }
            InterfaceC9290x.a aVar4 = this.f328d;
            if (aVar4.f42391a == m420H && C4401z0.m22371c(aVar4.f42392b, aVar2)) {
                return true;
            }
            this.f328d = this.f329e.m316t(m420H, aVar2);
            return true;
        }

        /* renamed from: b */
        public final C0117r m427b(C0117r c0117r) {
            long m419G = this.f329e.m419G(this.f326b, c0117r.f503f);
            long m419G2 = this.f329e.m419G(this.f326b, c0117r.f504g);
            return (m419G == c0117r.f503f && m419G2 == c0117r.f504g) ? c0117r : new C0117r(c0117r.f498a, c0117r.f499b, c0117r.f500c, c0117r.f501d, c0117r.f502e, m419G, m419G2);
        }

        @Override // p365v6.InterfaceC9290x
        /* renamed from: g */
        public void mo428g(int i10, InterfaceC0127w.a aVar, Exception exc) {
            if (m426a(i10, aVar)) {
                this.f328d.m39178l(exc);
            }
        }

        @Override // p009a8.InterfaceC0090d0
        /* renamed from: h0 */
        public void mo364h0(int i10, InterfaceC0127w.a aVar, C0111o c0111o, C0117r c0117r) {
            if (m426a(i10, aVar)) {
                this.f327c.m378B(c0111o, m427b(c0117r));
            }
        }

        @Override // p365v6.InterfaceC9290x
        /* renamed from: k0 */
        public void mo429k0(int i10, InterfaceC0127w.a aVar) {
            if (m426a(i10, aVar)) {
                this.f328d.m39174h();
            }
        }

        @Override // p365v6.InterfaceC9290x
        /* renamed from: l */
        public void mo430l(int i10, InterfaceC0127w.a aVar, int i11) {
            if (m426a(i10, aVar)) {
                this.f328d.m39177k(i11);
            }
        }

        @Override // p365v6.InterfaceC9290x
        /* renamed from: n */
        public void mo431n(int i10, InterfaceC0127w.a aVar) {
            if (m426a(i10, aVar)) {
                this.f328d.m39179m();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/g$b.class
     */
    /* renamed from: a8.g$b */
    /* loaded from: combined.jar:classes2.jar:a8/g$b.class */
    public static final class b<T> {

        /* renamed from: a */
        public final InterfaceC0127w f330a;

        /* renamed from: b */
        public final InterfaceC0127w.b f331b;

        /* renamed from: c */
        public final AbstractC0095g<T>.a f332c;

        public b(InterfaceC0127w interfaceC0127w, InterfaceC0127w.b bVar, AbstractC0095g<T>.a aVar) {
            this.f330a = interfaceC0127w;
            this.f331b = bVar;
            this.f332c = aVar;
        }
    }

    @Override // p009a8.AbstractC0081a
    /* renamed from: B */
    public void mo303B(InterfaceC0853l0 interfaceC0853l0) {
        this.f325j = interfaceC0853l0;
        this.f324i = C4401z0.m22421y();
    }

    @Override // p009a8.AbstractC0081a
    /* renamed from: D */
    public void mo305D() {
        for (b<T> bVar : this.f323h.values()) {
            bVar.f330a.mo311i(bVar.f331b);
            bVar.f330a.mo310g(bVar.f332c);
            bVar.f330a.mo307c(bVar.f332c);
        }
        this.f323h.clear();
    }

    /* renamed from: F */
    public InterfaceC0127w.a mo418F(T t10, InterfaceC0127w.a aVar) {
        return aVar;
    }

    /* renamed from: G */
    public long m419G(T t10, long j10) {
        return j10;
    }

    /* renamed from: H */
    public int m420H(T t10, int i10) {
        return i10;
    }

    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public abstract void m417I(T t10, InterfaceC0127w interfaceC0127w, AbstractC7574e2 abstractC7574e2);

    /* renamed from: K */
    public final void m421K(final T t10, InterfaceC0127w interfaceC0127w) {
        C4349a.m21878a(!this.f323h.containsKey(t10));
        InterfaceC0127w.b bVar = new InterfaceC0127w.b(this, t10) { // from class: a8.f

            /* renamed from: b */
            public final AbstractC0095g f308b;

            /* renamed from: c */
            public final Object f309c;

            {
                this.f308b = this;
                this.f309c = t10;
            }

            @Override // p009a8.InterfaceC0127w.b
            /* renamed from: b */
            public final void mo410b(InterfaceC0127w interfaceC0127w2, AbstractC7574e2 abstractC7574e2) {
                this.f308b.m417I(this.f309c, interfaceC0127w2, abstractC7574e2);
            }
        };
        a aVar = new a(this, t10);
        this.f323h.put(t10, new b<>(interfaceC0127w, bVar, aVar));
        interfaceC0127w.mo309f((Handler) C4349a.m21882e(this.f324i), aVar);
        interfaceC0127w.mo312l((Handler) C4349a.m21882e(this.f324i), aVar);
        interfaceC0127w.mo306a(bVar, this.f325j);
        if (m302A()) {
            return;
        }
        interfaceC0127w.mo308e(bVar);
    }

    /* renamed from: L */
    public final void m422L(T t10) {
        b bVar = (b) C4349a.m21882e(this.f323h.remove(t10));
        bVar.f330a.mo311i(bVar.f331b);
        bVar.f330a.mo310g(bVar.f332c);
        bVar.f330a.mo307c(bVar.f332c);
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: m */
    public void mo402m() {
        Iterator<b<T>> it = this.f323h.values().iterator();
        while (it.hasNext()) {
            it.next().f330a.mo402m();
        }
    }

    @Override // p009a8.AbstractC0081a
    /* renamed from: y */
    public void mo321y() {
        for (b<T> bVar : this.f323h.values()) {
            bVar.f330a.mo308e(bVar.f331b);
        }
    }

    @Override // p009a8.AbstractC0081a
    /* renamed from: z */
    public void mo322z() {
        for (b<T> bVar : this.f323h.values()) {
            bVar.f330a.mo315s(bVar.f331b);
        }
    }
}
