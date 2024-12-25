package p267p6;

import android.os.Handler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p009a8.C0111o;
import p009a8.C0113p;
import p009a8.C0115q;
import p009a8.C0117r;
import p009a8.InterfaceC0090d0;
import p009a8.InterfaceC0121t;
import p009a8.InterfaceC0124u0;
import p009a8.InterfaceC0127w;
import p027b9.InterfaceC0832b;
import p027b9.InterfaceC0853l0;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4401z0;
import p282q6.C7800h1;
import p365v6.C9279q;
import p365v6.InterfaceC9290x;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/j1.class
 */
/* renamed from: p6.j1 */
/* loaded from: combined.jar:classes2.jar:p6/j1.class */
public final class C7591j1 {

    /* renamed from: d */
    public final d f36792d;

    /* renamed from: e */
    public final InterfaceC0090d0.a f36793e;

    /* renamed from: f */
    public final InterfaceC9290x.a f36794f;

    /* renamed from: g */
    public final HashMap<c, b> f36795g;

    /* renamed from: h */
    public final Set<c> f36796h;

    /* renamed from: j */
    public boolean f36798j;

    /* renamed from: k */
    public InterfaceC0853l0 f36799k;

    /* renamed from: i */
    public InterfaceC0124u0 f36797i = new InterfaceC0124u0.a(0);

    /* renamed from: b */
    public final IdentityHashMap<InterfaceC0121t, c> f36790b = new IdentityHashMap<>();

    /* renamed from: c */
    public final Map<Object, c> f36791c = new HashMap();

    /* renamed from: a */
    public final List<c> f36789a = new ArrayList();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/j1$a.class
     */
    /* renamed from: p6.j1$a */
    /* loaded from: combined.jar:classes2.jar:p6/j1$a.class */
    public final class a implements InterfaceC0090d0, InterfaceC9290x {

        /* renamed from: b */
        public final c f36800b;

        /* renamed from: c */
        public InterfaceC0090d0.a f36801c;

        /* renamed from: d */
        public InterfaceC9290x.a f36802d;

        /* renamed from: e */
        public final C7591j1 f36803e;

        public a(C7591j1 c7591j1, c cVar) {
            this.f36803e = c7591j1;
            this.f36801c = c7591j1.f36793e;
            this.f36802d = c7591j1.f36794f;
            this.f36800b = cVar;
        }

        @Override // p009a8.InterfaceC0090d0
        /* renamed from: J */
        public void mo359J(int i10, InterfaceC0127w.a aVar, C0111o c0111o, C0117r c0117r) {
            if (m32809a(i10, aVar)) {
                this.f36801c.m392v(c0111o, c0117r);
            }
        }

        @Override // p009a8.InterfaceC0090d0
        /* renamed from: K */
        public void mo360K(int i10, InterfaceC0127w.a aVar, C0117r c0117r) {
            if (m32809a(i10, aVar)) {
                this.f36801c.m386j(c0117r);
            }
        }

        @Override // p365v6.InterfaceC9290x
        /* renamed from: P */
        public void mo423P(int i10, InterfaceC0127w.a aVar) {
            if (m32809a(i10, aVar)) {
                this.f36802d.m39176j();
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
            if (m32809a(i10, aVar)) {
                this.f36801c.m389s(c0111o, c0117r);
            }
        }

        @Override // p009a8.InterfaceC0090d0
        /* renamed from: W */
        public void mo362W(int i10, InterfaceC0127w.a aVar, C0117r c0117r) {
            if (m32809a(i10, aVar)) {
                this.f36801c.m381E(c0117r);
            }
        }

        @Override // p365v6.InterfaceC9290x
        /* renamed from: X */
        public void mo425X(int i10, InterfaceC0127w.a aVar) {
            if (m32809a(i10, aVar)) {
                this.f36802d.m39175i();
            }
        }

        @Override // p009a8.InterfaceC0090d0
        /* renamed from: Z */
        public void mo363Z(int i10, InterfaceC0127w.a aVar, C0111o c0111o, C0117r c0117r, IOException iOException, boolean z10) {
            if (m32809a(i10, aVar)) {
                this.f36801c.m395y(c0111o, c0117r, iOException, z10);
            }
        }

        /* renamed from: a */
        public final boolean m32809a(int i10, InterfaceC0127w.a aVar) {
            InterfaceC0127w.a aVar2;
            if (aVar != null) {
                InterfaceC0127w.a m32785n = C7591j1.m32785n(this.f36800b, aVar);
                aVar2 = m32785n;
                if (m32785n == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int m32788r = C7591j1.m32788r(this.f36800b, i10);
            InterfaceC0090d0.a aVar3 = this.f36801c;
            if (aVar3.f285a != m32788r || !C4401z0.m22371c(aVar3.f286b, aVar2)) {
                this.f36801c = this.f36803e.f36793e.m382F(m32788r, aVar2, 0L);
            }
            InterfaceC9290x.a aVar4 = this.f36802d;
            if (aVar4.f42391a == m32788r && C4401z0.m22371c(aVar4.f42392b, aVar2)) {
                return true;
            }
            this.f36802d = this.f36803e.f36794f.m39181u(m32788r, aVar2);
            return true;
        }

        @Override // p365v6.InterfaceC9290x
        /* renamed from: g */
        public void mo428g(int i10, InterfaceC0127w.a aVar, Exception exc) {
            if (m32809a(i10, aVar)) {
                this.f36802d.m39178l(exc);
            }
        }

        @Override // p009a8.InterfaceC0090d0
        /* renamed from: h0 */
        public void mo364h0(int i10, InterfaceC0127w.a aVar, C0111o c0111o, C0117r c0117r) {
            if (m32809a(i10, aVar)) {
                this.f36801c.m378B(c0111o, c0117r);
            }
        }

        @Override // p365v6.InterfaceC9290x
        /* renamed from: k0 */
        public void mo429k0(int i10, InterfaceC0127w.a aVar) {
            if (m32809a(i10, aVar)) {
                this.f36802d.m39174h();
            }
        }

        @Override // p365v6.InterfaceC9290x
        /* renamed from: l */
        public void mo430l(int i10, InterfaceC0127w.a aVar, int i11) {
            if (m32809a(i10, aVar)) {
                this.f36802d.m39177k(i11);
            }
        }

        @Override // p365v6.InterfaceC9290x
        /* renamed from: n */
        public void mo431n(int i10, InterfaceC0127w.a aVar) {
            if (m32809a(i10, aVar)) {
                this.f36802d.m39179m();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/j1$b.class
     */
    /* renamed from: p6.j1$b */
    /* loaded from: combined.jar:classes2.jar:p6/j1$b.class */
    public static final class b {

        /* renamed from: a */
        public final InterfaceC0127w f36804a;

        /* renamed from: b */
        public final InterfaceC0127w.b f36805b;

        /* renamed from: c */
        public final a f36806c;

        public b(InterfaceC0127w interfaceC0127w, InterfaceC0127w.b bVar, a aVar) {
            this.f36804a = interfaceC0127w;
            this.f36805b = bVar;
            this.f36806c = aVar;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/j1$c.class
     */
    /* renamed from: p6.j1$c */
    /* loaded from: combined.jar:classes2.jar:p6/j1$c.class */
    public static final class c implements InterfaceC7585h1 {

        /* renamed from: a */
        public final C0115q f36807a;

        /* renamed from: d */
        public int f36810d;

        /* renamed from: e */
        public boolean f36811e;

        /* renamed from: c */
        public final List<InterfaceC0127w.a> f36809c = new ArrayList();

        /* renamed from: b */
        public final Object f36808b = new Object();

        public c(InterfaceC0127w interfaceC0127w, boolean z10) {
            this.f36807a = new C0115q(interfaceC0127w, z10);
        }

        @Override // p267p6.InterfaceC7585h1
        /* renamed from: a */
        public Object mo32762a() {
            return this.f36808b;
        }

        @Override // p267p6.InterfaceC7585h1
        /* renamed from: b */
        public AbstractC7574e2 mo32763b() {
            return this.f36807a.m562Q();
        }

        /* renamed from: c */
        public void m32810c(int i10) {
            this.f36810d = i10;
            this.f36811e = false;
            this.f36809c.clear();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/j1$d.class
     */
    /* renamed from: p6.j1$d */
    /* loaded from: combined.jar:classes2.jar:p6/j1$d.class */
    public interface d {
        /* renamed from: c */
        void mo32811c();
    }

    public C7591j1(d dVar, C7800h1 c7800h1, Handler handler) {
        this.f36792d = dVar;
        InterfaceC0090d0.a aVar = new InterfaceC0090d0.a();
        this.f36793e = aVar;
        InterfaceC9290x.a aVar2 = new InterfaceC9290x.a();
        this.f36794f = aVar2;
        this.f36795g = new HashMap<>();
        this.f36796h = new HashSet();
        if (c7800h1 != null) {
            aVar.m383g(handler, c7800h1);
            aVar2.m39173g(handler, c7800h1);
        }
    }

    /* renamed from: m */
    public static Object m32784m(Object obj) {
        return AbstractC7555a.m32319v(obj);
    }

    /* renamed from: n */
    public static InterfaceC0127w.a m32785n(c cVar, InterfaceC0127w.a aVar) {
        for (int i10 = 0; i10 < cVar.f36809c.size(); i10++) {
            if (cVar.f36809c.get(i10).f547d == aVar.f547d) {
                return aVar.m641c(m32787p(cVar, aVar.f544a));
            }
        }
        return null;
    }

    /* renamed from: o */
    public static Object m32786o(Object obj) {
        return AbstractC7555a.m32320w(obj);
    }

    /* renamed from: p */
    public static Object m32787p(c cVar, Object obj) {
        return AbstractC7555a.m32321y(cVar.f36808b, obj);
    }

    /* renamed from: r */
    public static int m32788r(c cVar, int i10) {
        return i10 + cVar.f36810d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m32789t(InterfaceC0127w interfaceC0127w, AbstractC7574e2 abstractC7574e2) {
        this.f36792d.mo32811c();
    }

    /* renamed from: A */
    public AbstractC7574e2 m32790A(int i10, int i11, InterfaceC0124u0 interfaceC0124u0) {
        C4349a.m21878a(i10 >= 0 && i10 <= i11 && i11 <= m32801q());
        this.f36797i = interfaceC0124u0;
        m32791B(i10, i11);
        return m32797i();
    }

    /* renamed from: B */
    public final void m32791B(int i10, int i11) {
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            }
            c remove = this.f36789a.remove(i11);
            this.f36791c.remove(remove.f36808b);
            m32795g(i11, -remove.f36807a.m562Q().mo512p());
            remove.f36811e = true;
            if (this.f36798j) {
                m32803u(remove);
            }
        }
    }

    /* renamed from: C */
    public AbstractC7574e2 m32792C(List<c> list, InterfaceC0124u0 interfaceC0124u0) {
        m32791B(0, this.f36789a.size());
        return m32794f(this.f36789a.size(), list, interfaceC0124u0);
    }

    /* renamed from: D */
    public AbstractC7574e2 m32793D(InterfaceC0124u0 interfaceC0124u0) {
        int m32801q = m32801q();
        InterfaceC0124u0 interfaceC0124u02 = interfaceC0124u0;
        if (interfaceC0124u0.getLength() != m32801q) {
            interfaceC0124u02 = interfaceC0124u0.mo635e().mo637g(0, m32801q);
        }
        this.f36797i = interfaceC0124u02;
        return m32797i();
    }

    /* renamed from: f */
    public AbstractC7574e2 m32794f(int i10, List<c> list, InterfaceC0124u0 interfaceC0124u0) {
        int i11;
        if (!list.isEmpty()) {
            this.f36797i = interfaceC0124u0;
            for (int i12 = i10; i12 < list.size() + i10; i12++) {
                c cVar = list.get(i12 - i10);
                if (i12 > 0) {
                    c cVar2 = this.f36789a.get(i12 - 1);
                    i11 = cVar2.f36810d + cVar2.f36807a.m562Q().mo512p();
                } else {
                    i11 = 0;
                }
                cVar.m32810c(i11);
                m32795g(i12, cVar.f36807a.m562Q().mo512p());
                this.f36789a.add(i12, cVar);
                this.f36791c.put(cVar.f36808b, cVar);
                if (this.f36798j) {
                    m32806x(cVar);
                    if (this.f36790b.isEmpty()) {
                        this.f36796h.add(cVar);
                    } else {
                        m32798j(cVar);
                    }
                }
            }
        }
        return m32797i();
    }

    /* renamed from: g */
    public final void m32795g(int i10, int i11) {
        while (i10 < this.f36789a.size()) {
            this.f36789a.get(i10).f36810d += i11;
            i10++;
        }
    }

    /* renamed from: h */
    public InterfaceC0121t m32796h(InterfaceC0127w.a aVar, InterfaceC0832b interfaceC0832b, long j10) {
        Object m32786o = m32786o(aVar.f544a);
        InterfaceC0127w.a m641c = aVar.m641c(m32784m(aVar.f544a));
        c cVar = (c) C4349a.m21882e(this.f36791c.get(m32786o));
        m32800l(cVar);
        cVar.f36809c.add(m641c);
        C0113p mo401h = cVar.f36807a.mo401h(m641c, interfaceC0832b, j10);
        this.f36790b.put(mo401h, cVar);
        m32799k();
        return mo401h;
    }

    /* renamed from: i */
    public AbstractC7574e2 m32797i() {
        if (this.f36789a.isEmpty()) {
            return AbstractC7574e2.f36706a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f36789a.size(); i11++) {
            c cVar = this.f36789a.get(i11);
            cVar.f36810d = i10;
            i10 += cVar.f36807a.m562Q().mo512p();
        }
        return new C7618s1(this.f36789a, this.f36797i);
    }

    /* renamed from: j */
    public final void m32798j(c cVar) {
        b bVar = this.f36795g.get(cVar);
        if (bVar != null) {
            bVar.f36804a.mo308e(bVar.f36805b);
        }
    }

    /* renamed from: k */
    public final void m32799k() {
        Iterator<c> it = this.f36796h.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f36809c.isEmpty()) {
                m32798j(next);
                it.remove();
            }
        }
    }

    /* renamed from: l */
    public final void m32800l(c cVar) {
        this.f36796h.add(cVar);
        b bVar = this.f36795g.get(cVar);
        if (bVar != null) {
            bVar.f36804a.mo315s(bVar.f36805b);
        }
    }

    /* renamed from: q */
    public int m32801q() {
        return this.f36789a.size();
    }

    /* renamed from: s */
    public boolean m32802s() {
        return this.f36798j;
    }

    /* renamed from: u */
    public final void m32803u(c cVar) {
        if (cVar.f36811e && cVar.f36809c.isEmpty()) {
            b bVar = (b) C4349a.m21882e(this.f36795g.remove(cVar));
            bVar.f36804a.mo311i(bVar.f36805b);
            bVar.f36804a.mo310g(bVar.f36806c);
            bVar.f36804a.mo307c(bVar.f36806c);
            this.f36796h.remove(cVar);
        }
    }

    /* renamed from: v */
    public AbstractC7574e2 m32804v(int i10, int i11, int i12, InterfaceC0124u0 interfaceC0124u0) {
        C4349a.m21878a(i10 >= 0 && i10 <= i11 && i11 <= m32801q() && i12 >= 0);
        this.f36797i = interfaceC0124u0;
        if (i10 == i11 || i10 == i12) {
            return m32797i();
        }
        int min = Math.min(i10, i12);
        int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int i13 = this.f36789a.get(min).f36810d;
        C4401z0.m22318C0(this.f36789a, i10, i11, i12);
        int i14 = i13;
        for (int i15 = min; i15 <= max; i15++) {
            c cVar = this.f36789a.get(i15);
            cVar.f36810d = i14;
            i14 += cVar.f36807a.m562Q().mo512p();
        }
        return m32797i();
    }

    /* renamed from: w */
    public void m32805w(InterfaceC0853l0 interfaceC0853l0) {
        C4349a.m21884g(!this.f36798j);
        this.f36799k = interfaceC0853l0;
        for (int i10 = 0; i10 < this.f36789a.size(); i10++) {
            c cVar = this.f36789a.get(i10);
            m32806x(cVar);
            this.f36796h.add(cVar);
        }
        this.f36798j = true;
    }

    /* renamed from: x */
    public final void m32806x(c cVar) {
        C0115q c0115q = cVar.f36807a;
        InterfaceC0127w.b bVar = new InterfaceC0127w.b(this) { // from class: p6.i1

            /* renamed from: b */
            public final C7591j1 f36783b;

            {
                this.f36783b = this;
            }

            @Override // p009a8.InterfaceC0127w.b
            /* renamed from: b */
            public final void mo410b(InterfaceC0127w interfaceC0127w, AbstractC7574e2 abstractC7574e2) {
                this.f36783b.m32789t(interfaceC0127w, abstractC7574e2);
            }
        };
        a aVar = new a(this, cVar);
        this.f36795g.put(cVar, new b(c0115q, bVar, aVar));
        c0115q.mo309f(C4401z0.m22313A(), aVar);
        c0115q.mo312l(C4401z0.m22313A(), aVar);
        c0115q.mo306a(bVar, this.f36799k);
    }

    /* renamed from: y */
    public void m32807y() {
        for (b bVar : this.f36795g.values()) {
            try {
                bVar.f36804a.mo311i(bVar.f36805b);
            } catch (RuntimeException e10) {
                C4392v.m22271e("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f36804a.mo310g(bVar.f36806c);
            bVar.f36804a.mo307c(bVar.f36806c);
        }
        this.f36795g.clear();
        this.f36796h.clear();
        this.f36798j = false;
    }

    /* renamed from: z */
    public void m32808z(InterfaceC0121t interfaceC0121t) {
        c cVar = (c) C4349a.m21882e(this.f36790b.remove(interfaceC0121t));
        cVar.f36807a.mo403q(interfaceC0121t);
        cVar.f36809c.remove(((C0113p) interfaceC0121t).f464b);
        if (!this.f36790b.isEmpty()) {
            m32799k();
        }
        m32803u(cVar);
    }
}
