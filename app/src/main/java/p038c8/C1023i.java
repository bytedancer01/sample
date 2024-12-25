package p038c8;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p009a8.C0111o;
import p009a8.C0118r0;
import p009a8.InterfaceC0090d0;
import p009a8.InterfaceC0120s0;
import p009a8.InterfaceC0122t0;
import p027b9.C0839e0;
import p027b9.InterfaceC0832b;
import p027b9.InterfaceC0837d0;
import p038c8.InterfaceC1024j;
import p059d9.C4349a;
import p059d9.C4401z0;
import p267p6.C7558a2;
import p267p6.C7629w0;
import p267p6.C7632x0;
import p332t6.C8638f;
import p365v6.InterfaceC9290x;
import p365v6.InterfaceC9292z;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c8/i.class
 */
/* renamed from: c8.i */
/* loaded from: combined.jar:classes2.jar:c8/i.class */
public class C1023i<T extends InterfaceC1024j> implements InterfaceC0120s0, InterfaceC0122t0, C0839e0.b<AbstractC1020f>, C0839e0.f {

    /* renamed from: b */
    public final int f6879b;

    /* renamed from: c */
    public final int[] f6880c;

    /* renamed from: d */
    public final C7629w0[] f6881d;

    /* renamed from: e */
    public final boolean[] f6882e;

    /* renamed from: f */
    public final T f6883f;

    /* renamed from: g */
    public final InterfaceC0122t0.a<C1023i<T>> f6884g;

    /* renamed from: h */
    public final InterfaceC0090d0.a f6885h;

    /* renamed from: i */
    public final InterfaceC0837d0 f6886i;

    /* renamed from: j */
    public final C0839e0 f6887j;

    /* renamed from: k */
    public final C1022h f6888k;

    /* renamed from: l */
    public final ArrayList<AbstractC1015a> f6889l;

    /* renamed from: m */
    public final List<AbstractC1015a> f6890m;

    /* renamed from: n */
    public final C0118r0 f6891n;

    /* renamed from: o */
    public final C0118r0[] f6892o;

    /* renamed from: p */
    public final C1017c f6893p;

    /* renamed from: q */
    public AbstractC1020f f6894q;

    /* renamed from: r */
    public C7629w0 f6895r;

    /* renamed from: s */
    public b<T> f6896s;

    /* renamed from: t */
    public long f6897t;

    /* renamed from: u */
    public long f6898u;

    /* renamed from: v */
    public int f6899v;

    /* renamed from: w */
    public AbstractC1015a f6900w;

    /* renamed from: x */
    public boolean f6901x;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:c8/i$a.class
     */
    /* renamed from: c8.i$a */
    /* loaded from: combined.jar:classes2.jar:c8/i$a.class */
    public final class a implements InterfaceC0120s0 {

        /* renamed from: b */
        public final C1023i<T> f6902b;

        /* renamed from: c */
        public final C0118r0 f6903c;

        /* renamed from: d */
        public final int f6904d;

        /* renamed from: e */
        public boolean f6905e;

        /* renamed from: f */
        public final C1023i f6906f;

        public a(C1023i c1023i, C1023i<T> c1023i2, C0118r0 c0118r0, int i10) {
            this.f6906f = c1023i;
            this.f6902b = c1023i2;
            this.f6903c = c0118r0;
            this.f6904d = i10;
        }

        @Override // p009a8.InterfaceC0120s0
        /* renamed from: a */
        public void mo354a() {
        }

        /* renamed from: b */
        public final void m6035b() {
            if (this.f6905e) {
                return;
            }
            this.f6906f.f6885h.m385i(this.f6906f.f6880c[this.f6904d], this.f6906f.f6881d[this.f6904d], 0, null, this.f6906f.f6898u);
            this.f6905e = true;
        }

        /* renamed from: c */
        public void m6036c() {
            C4349a.m21884g(this.f6906f.f6882e[this.f6904d]);
            this.f6906f.f6882e[this.f6904d] = false;
        }

        @Override // p009a8.InterfaceC0120s0
        /* renamed from: e */
        public boolean mo356e() {
            return !this.f6906f.m6021J() && this.f6903c.m583K(this.f6906f.f6901x);
        }

        @Override // p009a8.InterfaceC0120s0
        /* renamed from: p */
        public int mo357p(C7632x0 c7632x0, C8638f c8638f, int i10) {
            if (this.f6906f.m6021J()) {
                return -3;
            }
            if (this.f6906f.f6900w != null && this.f6906f.f6900w.m5985i(this.f6904d + 1) <= this.f6903c.m575C()) {
                return -3;
            }
            m6035b();
            return this.f6903c.m590S(c7632x0, c8638f, i10, this.f6906f.f6901x);
        }

        @Override // p009a8.InterfaceC0120s0
        /* renamed from: t */
        public int mo358t(long j10) {
            if (this.f6906f.m6021J()) {
                return 0;
            }
            int m577E = this.f6903c.m577E(j10, this.f6906f.f6901x);
            int i10 = m577E;
            if (this.f6906f.f6900w != null) {
                i10 = Math.min(m577E, this.f6906f.f6900w.m5985i(this.f6904d + 1) - this.f6903c.m575C());
            }
            this.f6903c.m607e0(i10);
            if (i10 > 0) {
                m6035b();
            }
            return i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:c8/i$b.class
     */
    /* renamed from: c8.i$b */
    /* loaded from: combined.jar:classes2.jar:c8/i$b.class */
    public interface b<T extends InterfaceC1024j> {
        /* renamed from: e */
        void mo6037e(C1023i<T> c1023i);
    }

    public C1023i(int i10, int[] iArr, C7629w0[] c7629w0Arr, T t10, InterfaceC0122t0.a<C1023i<T>> aVar, InterfaceC0832b interfaceC0832b, long j10, InterfaceC9292z interfaceC9292z, InterfaceC9290x.a aVar2, InterfaceC0837d0 interfaceC0837d0, InterfaceC0090d0.a aVar3) {
        this.f6879b = i10;
        int i11 = 0;
        int[] iArr2 = iArr == null ? new int[0] : iArr;
        this.f6880c = iArr2;
        this.f6881d = c7629w0Arr == null ? new C7629w0[0] : c7629w0Arr;
        this.f6883f = t10;
        this.f6884g = aVar;
        this.f6885h = aVar3;
        this.f6886i = interfaceC0837d0;
        this.f6887j = new C0839e0("ChunkSampleStream");
        this.f6888k = new C1022h();
        ArrayList<AbstractC1015a> arrayList = new ArrayList<>();
        this.f6889l = arrayList;
        this.f6890m = Collections.unmodifiableList(arrayList);
        int length = iArr2.length;
        this.f6892o = new C0118r0[length];
        this.f6882e = new boolean[length];
        int i12 = length + 1;
        int[] iArr3 = new int[i12];
        C0118r0[] c0118r0Arr = new C0118r0[i12];
        C0118r0 m571k = C0118r0.m571k(interfaceC0832b, (Looper) C4349a.m21882e(Looper.myLooper()), interfaceC9292z, aVar2);
        this.f6891n = m571k;
        iArr3[0] = i10;
        c0118r0Arr[0] = m571k;
        while (true) {
            int i13 = i11;
            if (i13 >= length) {
                this.f6893p = new C1017c(iArr3, c0118r0Arr);
                this.f6897t = j10;
                this.f6898u = j10;
                return;
            } else {
                C0118r0 m572l = C0118r0.m572l(interfaceC0832b);
                this.f6892o[i13] = m572l;
                i11 = i13 + 1;
                c0118r0Arr[i11] = m572l;
                iArr3[i11] = this.f6880c[i13];
            }
        }
    }

    /* renamed from: C */
    public final void m6014C(int i10) {
        int min = Math.min(m6027P(i10, 0), this.f6899v);
        if (min > 0) {
            C4401z0.m22342O0(this.f6889l, 0, min);
            this.f6899v -= min;
        }
    }

    /* renamed from: D */
    public final void m6015D(int i10) {
        C4349a.m21884g(!this.f6887j.m5324j());
        int size = this.f6889l.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (!m6019H(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = m6018G().f6875h;
        AbstractC1015a m6016E = m6016E(i10);
        if (this.f6889l.isEmpty()) {
            this.f6897t = this.f6898u;
        }
        this.f6901x = false;
        this.f6885h.m380D(this.f6879b, m6016E.f6874g, j10);
    }

    /* renamed from: E */
    public final AbstractC1015a m6016E(int i10) {
        AbstractC1015a abstractC1015a = this.f6889l.get(i10);
        ArrayList<AbstractC1015a> arrayList = this.f6889l;
        C4401z0.m22342O0(arrayList, i10, arrayList.size());
        this.f6899v = Math.max(this.f6899v, this.f6889l.size());
        C0118r0 c0118r0 = this.f6891n;
        int i11 = 0;
        while (true) {
            c0118r0.m622u(abstractC1015a.m5985i(i11));
            C0118r0[] c0118r0Arr = this.f6892o;
            if (i11 >= c0118r0Arr.length) {
                return abstractC1015a;
            }
            c0118r0 = c0118r0Arr[i11];
            i11++;
        }
    }

    /* renamed from: F */
    public T m6017F() {
        return this.f6883f;
    }

    /* renamed from: G */
    public final AbstractC1015a m6018G() {
        ArrayList<AbstractC1015a> arrayList = this.f6889l;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: H */
    public final boolean m6019H(int i10) {
        int m575C;
        int i11;
        AbstractC1015a abstractC1015a = this.f6889l.get(i10);
        if (this.f6891n.m575C() > abstractC1015a.m5985i(0)) {
            return true;
        }
        int i12 = 0;
        do {
            C0118r0[] c0118r0Arr = this.f6892o;
            if (i12 >= c0118r0Arr.length) {
                return false;
            }
            m575C = c0118r0Arr[i12].m575C();
            i11 = i12 + 1;
            i12 = i11;
        } while (m575C <= abstractC1015a.m5985i(i11));
        return true;
    }

    /* renamed from: I */
    public final boolean m6020I(AbstractC1020f abstractC1020f) {
        return abstractC1020f instanceof AbstractC1015a;
    }

    /* renamed from: J */
    public boolean m6021J() {
        return this.f6897t != -9223372036854775807L;
    }

    /* renamed from: K */
    public final void m6022K() {
        int m6027P = m6027P(this.f6891n.m575C(), this.f6899v - 1);
        while (true) {
            int i10 = this.f6899v;
            if (i10 > m6027P) {
                return;
            }
            this.f6899v = i10 + 1;
            m6023L(i10);
        }
    }

    /* renamed from: L */
    public final void m6023L(int i10) {
        AbstractC1015a abstractC1015a = this.f6889l.get(i10);
        C7629w0 c7629w0 = abstractC1015a.f6871d;
        if (!c7629w0.equals(this.f6895r)) {
            this.f6885h.m385i(this.f6879b, c7629w0, abstractC1015a.f6872e, abstractC1015a.f6873f, abstractC1015a.f6874g);
        }
        this.f6895r = c7629w0;
    }

    @Override // p027b9.C0839e0.b
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo485k(AbstractC1020f abstractC1020f, long j10, long j11, boolean z10) {
        this.f6894q = null;
        this.f6900w = null;
        C0111o c0111o = new C0111o(abstractC1020f.f6868a, abstractC1020f.f6869b, abstractC1020f.m6006f(), abstractC1020f.m6005e(), j10, j11, abstractC1020f.m6003b());
        this.f6886i.mo5313d(abstractC1020f.f6868a);
        this.f6885h.m388r(c0111o, abstractC1020f.f6870c, this.f6879b, abstractC1020f.f6871d, abstractC1020f.f6872e, abstractC1020f.f6873f, abstractC1020f.f6874g, abstractC1020f.f6875h);
        if (z10) {
            return;
        }
        if (m6021J()) {
            m6030S();
        } else if (m6020I(abstractC1020f)) {
            m6016E(this.f6889l.size() - 1);
            if (this.f6889l.isEmpty()) {
                this.f6897t = this.f6898u;
            }
        }
        this.f6884g.mo334a(this);
    }

    @Override // p027b9.C0839e0.b
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo489r(AbstractC1020f abstractC1020f, long j10, long j11) {
        this.f6894q = null;
        this.f6883f.mo6040d(abstractC1020f);
        C0111o c0111o = new C0111o(abstractC1020f.f6868a, abstractC1020f.f6869b, abstractC1020f.m6006f(), abstractC1020f.m6005e(), j10, j11, abstractC1020f.m6003b());
        this.f6886i.mo5313d(abstractC1020f.f6868a);
        this.f6885h.m391u(c0111o, abstractC1020f.f6870c, this.f6879b, abstractC1020f.f6871d, abstractC1020f.f6872e, abstractC1020f.f6873f, abstractC1020f.f6874g, abstractC1020f.f6875h);
        this.f6884g.mo334a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015a  */
    @Override // p027b9.C0839e0.b
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p027b9.C0839e0.c mo486o(p038c8.AbstractC1020f r16, long r17, long r19, java.io.IOException r21, int r22) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p038c8.C1023i.mo486o(c8.f, long, long, java.io.IOException, int):b9.e0$c");
    }

    /* renamed from: P */
    public final int m6027P(int i10, int i11) {
        int i12;
        do {
            i12 = i11 + 1;
            if (i12 >= this.f6889l.size()) {
                return this.f6889l.size() - 1;
            }
            i11 = i12;
        } while (this.f6889l.get(i12).m5985i(0) <= i10);
        return i12 - 1;
    }

    /* renamed from: Q */
    public void m6028Q() {
        m6029R(null);
    }

    /* renamed from: R */
    public void m6029R(b<T> bVar) {
        this.f6896s = bVar;
        this.f6891n.m589R();
        for (C0118r0 c0118r0 : this.f6892o) {
            c0118r0.m589R();
        }
        this.f6887j.m5327m(this);
    }

    /* renamed from: S */
    public final void m6030S() {
        this.f6891n.m593V();
        for (C0118r0 c0118r0 : this.f6892o) {
            c0118r0.m593V();
        }
    }

    /* renamed from: T */
    public void m6031T(long j10) {
        AbstractC1015a abstractC1015a;
        this.f6898u = j10;
        if (m6021J()) {
            this.f6897t = j10;
            return;
        }
        int i10 = 0;
        while (true) {
            abstractC1015a = null;
            if (i10 >= this.f6889l.size()) {
                break;
            }
            abstractC1015a = this.f6889l.get(i10);
            long j11 = abstractC1015a.f6874g;
            if (j11 == j10 && abstractC1015a.f6841k == -9223372036854775807L) {
                break;
            }
            if (j11 > j10) {
                abstractC1015a = null;
                break;
            }
            i10++;
        }
        if (abstractC1015a != null ? this.f6891n.m596Y(abstractC1015a.m5985i(0)) : this.f6891n.m597Z(j10, j10 < mo336c())) {
            this.f6899v = m6027P(this.f6891n.m575C(), 0);
            for (C0118r0 c0118r0 : this.f6892o) {
                c0118r0.m597Z(j10, true);
            }
            return;
        }
        this.f6897t = j10;
        this.f6901x = false;
        this.f6889l.clear();
        this.f6899v = 0;
        if (!this.f6887j.m5324j()) {
            this.f6887j.m5322g();
            m6030S();
            return;
        }
        this.f6891n.m619r();
        for (C0118r0 c0118r02 : this.f6892o) {
            c0118r02.m619r();
        }
        this.f6887j.m5321f();
    }

    /* renamed from: U */
    public C1023i<T>.a m6032U(long j10, int i10) {
        for (int i11 = 0; i11 < this.f6892o.length; i11++) {
            if (this.f6880c[i11] == i10) {
                C4349a.m21884g(!this.f6882e[i11]);
                this.f6882e[i11] = true;
                this.f6892o[i11].m597Z(j10, true);
                return new a(this, this, this.f6892o[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    @Override // p009a8.InterfaceC0120s0
    /* renamed from: a */
    public void mo354a() {
        this.f6887j.mo5320a();
        this.f6891n.m585N();
        if (this.f6887j.m5324j()) {
            return;
        }
        this.f6883f.mo6038a();
    }

    @Override // p009a8.InterfaceC0122t0
    /* renamed from: b */
    public boolean mo335b() {
        return this.f6887j.m5324j();
    }

    @Override // p009a8.InterfaceC0122t0
    /* renamed from: c */
    public long mo336c() {
        if (m6021J()) {
            return this.f6897t;
        }
        return this.f6901x ? Long.MIN_VALUE : m6018G().f6875h;
    }

    @Override // p009a8.InterfaceC0122t0
    /* renamed from: d */
    public boolean mo337d(long j10) {
        List<AbstractC1015a> list;
        long j11;
        if (this.f6901x || this.f6887j.m5324j() || this.f6887j.m5323i()) {
            return false;
        }
        boolean m6021J = m6021J();
        if (m6021J) {
            list = Collections.emptyList();
            j11 = this.f6897t;
        } else {
            list = this.f6890m;
            j11 = m6018G().f6875h;
        }
        this.f6883f.mo6041e(j10, j11, list, this.f6888k);
        C1022h c1022h = this.f6888k;
        boolean z10 = c1022h.f6878b;
        AbstractC1020f abstractC1020f = c1022h.f6877a;
        c1022h.m6007a();
        if (z10) {
            this.f6897t = -9223372036854775807L;
            this.f6901x = true;
            return true;
        }
        if (abstractC1020f == null) {
            return false;
        }
        this.f6894q = abstractC1020f;
        if (m6020I(abstractC1020f)) {
            AbstractC1015a abstractC1015a = (AbstractC1015a) abstractC1020f;
            if (m6021J) {
                long j12 = abstractC1015a.f6874g;
                long j13 = this.f6897t;
                if (j12 != j13) {
                    this.f6891n.m601b0(j13);
                    for (C0118r0 c0118r0 : this.f6892o) {
                        c0118r0.m601b0(this.f6897t);
                    }
                }
                this.f6897t = -9223372036854775807L;
            }
            abstractC1015a.m5987k(this.f6893p);
            this.f6889l.add(abstractC1015a);
        } else if (abstractC1020f instanceof C1027m) {
            ((C1027m) abstractC1020f).m6051g(this.f6893p);
        }
        this.f6885h.m377A(new C0111o(abstractC1020f.f6868a, abstractC1020f.f6869b, this.f6887j.m5328n(abstractC1020f, this, this.f6886i.mo5311b(abstractC1020f.f6870c))), abstractC1020f.f6870c, this.f6879b, abstractC1020f.f6871d, abstractC1020f.f6872e, abstractC1020f.f6873f, abstractC1020f.f6874g, abstractC1020f.f6875h);
        return true;
    }

    @Override // p009a8.InterfaceC0120s0
    /* renamed from: e */
    public boolean mo356e() {
        return !m6021J() && this.f6891n.m583K(this.f6901x);
    }

    /* renamed from: f */
    public long m6033f(long j10, C7558a2 c7558a2) {
        return this.f6883f.mo6042f(j10, c7558a2);
    }

    @Override // p009a8.InterfaceC0122t0
    /* renamed from: g */
    public long mo340g() {
        if (this.f6901x) {
            return Long.MIN_VALUE;
        }
        if (m6021J()) {
            return this.f6897t;
        }
        long j10 = this.f6898u;
        AbstractC1015a m6018G = m6018G();
        if (!m6018G.mo6046h()) {
            if (this.f6889l.size() > 1) {
                ArrayList<AbstractC1015a> arrayList = this.f6889l;
                m6018G = arrayList.get(arrayList.size() - 2);
            } else {
                m6018G = null;
            }
        }
        long j11 = j10;
        if (m6018G != null) {
            j11 = Math.max(j10, m6018G.f6875h);
        }
        return Math.max(j11, this.f6891n.m627z());
    }

    @Override // p009a8.InterfaceC0122t0
    /* renamed from: h */
    public void mo341h(long j10) {
        if (this.f6887j.m5323i() || m6021J()) {
            return;
        }
        if (!this.f6887j.m5324j()) {
            int mo6044j = this.f6883f.mo6044j(j10, this.f6890m);
            if (mo6044j < this.f6889l.size()) {
                m6015D(mo6044j);
                return;
            }
            return;
        }
        AbstractC1020f abstractC1020f = (AbstractC1020f) C4349a.m21882e(this.f6894q);
        if (!(m6020I(abstractC1020f) && m6019H(this.f6889l.size() - 1)) && this.f6883f.mo6039c(j10, abstractC1020f, this.f6890m)) {
            this.f6887j.m5321f();
            if (m6020I(abstractC1020f)) {
                this.f6900w = (AbstractC1015a) abstractC1020f;
            }
        }
    }

    @Override // p009a8.InterfaceC0120s0
    /* renamed from: p */
    public int mo357p(C7632x0 c7632x0, C8638f c8638f, int i10) {
        if (m6021J()) {
            return -3;
        }
        AbstractC1015a abstractC1015a = this.f6900w;
        if (abstractC1015a != null && abstractC1015a.m5985i(0) <= this.f6891n.m575C()) {
            return -3;
        }
        m6022K();
        return this.f6891n.m590S(c7632x0, c8638f, i10, this.f6901x);
    }

    @Override // p027b9.C0839e0.f
    /* renamed from: q */
    public void mo488q() {
        this.f6891n.m591T();
        for (C0118r0 c0118r0 : this.f6892o) {
            c0118r0.m591T();
        }
        this.f6883f.release();
        b<T> bVar = this.f6896s;
        if (bVar != null) {
            bVar.mo6037e(this);
        }
    }

    @Override // p009a8.InterfaceC0120s0
    /* renamed from: t */
    public int mo358t(long j10) {
        if (m6021J()) {
            return 0;
        }
        int m577E = this.f6891n.m577E(j10, this.f6901x);
        AbstractC1015a abstractC1015a = this.f6900w;
        int i10 = m577E;
        if (abstractC1015a != null) {
            i10 = Math.min(m577E, abstractC1015a.m5985i(0) - this.f6891n.m575C());
        }
        this.f6891n.m607e0(i10);
        m6022K();
        return i10;
    }

    /* renamed from: w */
    public void m6034w(long j10, boolean z10) {
        if (m6021J()) {
            return;
        }
        int m625x = this.f6891n.m625x();
        this.f6891n.m618q(j10, z10, true);
        int m625x2 = this.f6891n.m625x();
        if (m625x2 > m625x) {
            long m626y = this.f6891n.m626y();
            int i10 = 0;
            while (true) {
                C0118r0[] c0118r0Arr = this.f6892o;
                if (i10 >= c0118r0Arr.length) {
                    break;
                }
                c0118r0Arr[i10].m618q(m626y, z10, this.f6882e[i10]);
                i10++;
            }
        }
        m6014C(m625x2);
    }
}
