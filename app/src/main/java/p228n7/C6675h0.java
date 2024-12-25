package p228n7;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p057d7.C4328k;
import p057d7.C4334q;
import p057d7.InterfaceC4323f;
import p057d7.InterfaceC4324g;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4329l;
import p059d9.C4349a;
import p059d9.C4359e0;
import p059d9.C4361f0;
import p059d9.C4389t0;
import p228n7.InterfaceC6677i0;
import p267p6.C7594k1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/h0.class
 */
/* renamed from: n7.h0 */
/* loaded from: combined.jar:classes2.jar:n7/h0.class */
public final class C6675h0 implements InterfaceC4323f {

    /* renamed from: t */
    public static final InterfaceC4329l f34777t = new InterfaceC4329l() { // from class: n7.g0
        @Override // p057d7.InterfaceC4329l
        /* renamed from: a */
        public /* synthetic */ InterfaceC4323f[] mo12020a(Uri uri, Map map) {
            return C4328k.m21824a(this, uri, map);
        }

        @Override // p057d7.InterfaceC4329l
        /* renamed from: b */
        public final InterfaceC4323f[] mo12021b() {
            InterfaceC4323f[] m30728w;
            m30728w = C6675h0.m30728w();
            return m30728w;
        }
    };

    /* renamed from: a */
    public final int f34778a;

    /* renamed from: b */
    public final int f34779b;

    /* renamed from: c */
    public final List<C4389t0> f34780c;

    /* renamed from: d */
    public final C4361f0 f34781d;

    /* renamed from: e */
    public final SparseIntArray f34782e;

    /* renamed from: f */
    public final InterfaceC6677i0.c f34783f;

    /* renamed from: g */
    public final SparseArray<InterfaceC6677i0> f34784g;

    /* renamed from: h */
    public final SparseBooleanArray f34785h;

    /* renamed from: i */
    public final SparseBooleanArray f34786i;

    /* renamed from: j */
    public final C6671f0 f34787j;

    /* renamed from: k */
    public C6669e0 f34788k;

    /* renamed from: l */
    public InterfaceC4325h f34789l;

    /* renamed from: m */
    public int f34790m;

    /* renamed from: n */
    public boolean f34791n;

    /* renamed from: o */
    public boolean f34792o;

    /* renamed from: p */
    public boolean f34793p;

    /* renamed from: q */
    public InterfaceC6677i0 f34794q;

    /* renamed from: r */
    public int f34795r;

    /* renamed from: s */
    public int f34796s;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:n7/h0$a.class
     */
    /* renamed from: n7.h0$a */
    /* loaded from: combined.jar:classes2.jar:n7/h0$a.class */
    public class a implements InterfaceC6663b0 {

        /* renamed from: a */
        public final C4359e0 f34797a = new C4359e0(new byte[4]);

        /* renamed from: b */
        public final C6675h0 f34798b;

        public a(C6675h0 c6675h0) {
            this.f34798b = c6675h0;
        }

        @Override // p228n7.InterfaceC6663b0
        /* renamed from: a */
        public void mo30675a(C4361f0 c4361f0) {
            if (c4361f0.m21971D() == 0 && (c4361f0.m21971D() & 128) != 0) {
                c4361f0.m21984Q(6);
                int m21985a = c4361f0.m21985a() / 4;
                for (int i10 = 0; i10 < m21985a; i10++) {
                    c4361f0.m21993i(this.f34797a, 4);
                    int m21950h = this.f34797a.m21950h(16);
                    this.f34797a.m21960r(3);
                    if (m21950h == 0) {
                        this.f34797a.m21960r(13);
                    } else {
                        int m21950h2 = this.f34797a.m21950h(13);
                        if (this.f34798b.f34784g.get(m21950h2) == null) {
                            this.f34798b.f34784g.put(m21950h2, new C6665c0(new b(this.f34798b, m21950h2)));
                            C6675h0.m30718k(this.f34798b);
                        }
                    }
                }
                if (this.f34798b.f34778a != 2) {
                    this.f34798b.f34784g.remove(0);
                }
            }
        }

        @Override // p228n7.InterfaceC6663b0
        /* renamed from: b */
        public void mo30676b(C4389t0 c4389t0, InterfaceC4325h interfaceC4325h, InterfaceC6677i0.d dVar) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:n7/h0$b.class
     */
    /* renamed from: n7.h0$b */
    /* loaded from: combined.jar:classes2.jar:n7/h0$b.class */
    public class b implements InterfaceC6663b0 {

        /* renamed from: a */
        public final C4359e0 f34799a = new C4359e0(new byte[5]);

        /* renamed from: b */
        public final SparseArray<InterfaceC6677i0> f34800b = new SparseArray<>();

        /* renamed from: c */
        public final SparseIntArray f34801c = new SparseIntArray();

        /* renamed from: d */
        public final int f34802d;

        /* renamed from: e */
        public final C6675h0 f34803e;

        public b(C6675h0 c6675h0, int i10) {
            this.f34803e = c6675h0;
            this.f34802d = i10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0192, code lost:
        
            if (r0 == 5) goto L29;
         */
        @Override // p228n7.InterfaceC6663b0
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo30675a(p059d9.C4361f0 r10) {
            /*
                Method dump skipped, instructions count: 818
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p228n7.C6675h0.b.mo30675a(d9.f0):void");
        }

        @Override // p228n7.InterfaceC6663b0
        /* renamed from: b */
        public void mo30676b(C4389t0 c4389t0, InterfaceC4325h interfaceC4325h, InterfaceC6677i0.d dVar) {
        }

        /* renamed from: c */
        public final InterfaceC6677i0.b m30734c(C4361f0 c4361f0, int i10) {
            String str;
            ArrayList arrayList;
            int m21989e = c4361f0.m21989e();
            int i11 = i10 + m21989e;
            String str2 = null;
            ArrayList arrayList2 = null;
            int i12 = -1;
            while (c4361f0.m21989e() < i11) {
                int m21971D = c4361f0.m21971D();
                int m21989e2 = c4361f0.m21989e() + c4361f0.m21971D();
                if (m21989e2 > i11) {
                    break;
                }
                if (m21971D == 5) {
                    long m21973F = c4361f0.m21973F();
                    if (m21973F != 1094921523) {
                        if (m21973F != 1161904947) {
                            if (m21973F != 1094921524) {
                                str = str2;
                                arrayList = arrayList2;
                                if (m21973F == 1212503619) {
                                    i12 = 36;
                                    str = str2;
                                    arrayList = arrayList2;
                                }
                            }
                            i12 = 172;
                            str = str2;
                            arrayList = arrayList2;
                        }
                        i12 = 135;
                        str = str2;
                        arrayList = arrayList2;
                    }
                    i12 = 129;
                    str = str2;
                    arrayList = arrayList2;
                } else {
                    if (m21971D != 106) {
                        if (m21971D != 122) {
                            if (m21971D == 127) {
                                str = str2;
                                arrayList = arrayList2;
                                if (c4361f0.m21971D() != 21) {
                                }
                                i12 = 172;
                                str = str2;
                                arrayList = arrayList2;
                            } else if (m21971D == 123) {
                                i12 = 138;
                                str = str2;
                                arrayList = arrayList2;
                            } else if (m21971D == 10) {
                                str = c4361f0.m21968A(3).trim();
                                arrayList = arrayList2;
                            } else if (m21971D == 89) {
                                arrayList = new ArrayList();
                                while (c4361f0.m21989e() < m21989e2) {
                                    String trim = c4361f0.m21968A(3).trim();
                                    int m21971D2 = c4361f0.m21971D();
                                    byte[] bArr = new byte[4];
                                    c4361f0.m21994j(bArr, 0, 4);
                                    arrayList.add(new InterfaceC6677i0.a(trim, m21971D2, bArr));
                                }
                                i12 = 89;
                                str = str2;
                            } else {
                                str = str2;
                                arrayList = arrayList2;
                                if (m21971D == 111) {
                                    i12 = 257;
                                    arrayList = arrayList2;
                                    str = str2;
                                }
                            }
                        }
                        i12 = 135;
                        str = str2;
                        arrayList = arrayList2;
                    }
                    i12 = 129;
                    str = str2;
                    arrayList = arrayList2;
                }
                c4361f0.m21984Q(m21989e2 - c4361f0.m21989e());
                str2 = str;
                arrayList2 = arrayList;
            }
            c4361f0.m21983P(i11);
            return new InterfaceC6677i0.b(i12, str2, arrayList2, Arrays.copyOfRange(c4361f0.m21988d(), m21989e, i11));
        }
    }

    public C6675h0() {
        this(0);
    }

    public C6675h0(int i10) {
        this(1, i10, 112800);
    }

    public C6675h0(int i10, int i11, int i12) {
        this(i10, new C4389t0(0L), new C6678j(i11), i12);
    }

    public C6675h0(int i10, C4389t0 c4389t0, InterfaceC6677i0.c cVar) {
        this(i10, c4389t0, cVar, 112800);
    }

    public C6675h0(int i10, C4389t0 c4389t0, InterfaceC6677i0.c cVar, int i11) {
        this.f34783f = (InterfaceC6677i0.c) C4349a.m21882e(cVar);
        this.f34779b = i11;
        this.f34778a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f34780c = Collections.singletonList(c4389t0);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f34780c = arrayList;
            arrayList.add(c4389t0);
        }
        this.f34781d = new C4361f0(new byte[9400], 0);
        this.f34785h = new SparseBooleanArray();
        this.f34786i = new SparseBooleanArray();
        this.f34784g = new SparseArray<>();
        this.f34782e = new SparseIntArray();
        this.f34787j = new C6671f0(i11);
        this.f34796s = -1;
        m30732y();
    }

    /* renamed from: k */
    public static /* synthetic */ int m30718k(C6675h0 c6675h0) {
        int i10 = c6675h0.f34790m;
        c6675h0.f34790m = i10 + 1;
        return i10;
    }

    /* renamed from: w */
    public static /* synthetic */ InterfaceC4323f[] m30728w() {
        return new InterfaceC4323f[]{new C6675h0()};
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: a */
    public void mo12027a(long j10, long j11) {
        C6669e0 c6669e0;
        C4349a.m21884g(this.f34778a != 2);
        int size = this.f34780c.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4389t0 c4389t0 = this.f34780c.get(i10);
            boolean z10 = c4389t0.m22244e() == -9223372036854775807L;
            boolean z11 = z10;
            if (!z10) {
                long m22242c = c4389t0.m22242c();
                z11 = (m22242c == -9223372036854775807L || m22242c == 0 || m22242c == j11) ? false : true;
            }
            if (z11) {
                c4389t0.m22245g(j11);
            }
        }
        if (j11 != 0 && (c6669e0 = this.f34788k) != null) {
            c6669e0.m12064h(j11);
        }
        this.f34781d.m21979L(0);
        this.f34782e.clear();
        for (int i11 = 0; i11 < this.f34784g.size(); i11++) {
            this.f34784g.valueAt(i11).mo30687c();
        }
        this.f34795r = 0;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: c */
    public void mo12028c(InterfaceC4325h interfaceC4325h) {
        this.f34789l = interfaceC4325h;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: d */
    public boolean mo12029d(InterfaceC4324g interfaceC4324g) {
        boolean z10;
        byte[] m21988d = this.f34781d.m21988d();
        interfaceC4324g.mo21811q(m21988d, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                }
                if (m21988d[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (z10) {
                interfaceC4324g.mo21809o(i10);
                return true;
            }
        }
        return false;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: h */
    public int mo12033h(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        long length = interfaceC4324g.getLength();
        if (this.f34791n) {
            if (((length == -1 || this.f34778a == 2) ? false : true) && !this.f34787j.m30699d()) {
                return this.f34787j.m30700e(interfaceC4324g, c4334q, this.f34796s);
            }
            m30731x(length);
            if (this.f34793p) {
                this.f34793p = false;
                mo12027a(0L, 0L);
                if (interfaceC4324g.getPosition() != 0) {
                    c4334q.f26491a = 0L;
                    return 1;
                }
            }
            C6669e0 c6669e0 = this.f34788k;
            if (c6669e0 != null && c6669e0.m12061d()) {
                return this.f34788k.m12060c(interfaceC4324g, c4334q);
            }
        }
        if (!m30729u(interfaceC4324g)) {
            return -1;
        }
        int m30730v = m30730v();
        int m21990f = this.f34781d.m21990f();
        if (m30730v > m21990f) {
            return 0;
        }
        int m21998n = this.f34781d.m21998n();
        if ((8388608 & m21998n) == 0) {
            int i10 = ((4194304 & m21998n) != 0 ? 1 : 0) | 0;
            int i11 = (2096896 & m21998n) >> 8;
            boolean z10 = (m21998n & 32) != 0;
            InterfaceC6677i0 interfaceC6677i0 = (m21998n & 16) != 0 ? this.f34784g.get(i11) : null;
            if (interfaceC6677i0 != null) {
                if (this.f34778a != 2) {
                    int i12 = m21998n & 15;
                    int i13 = this.f34782e.get(i11, i12 - 1);
                    this.f34782e.put(i11, i12);
                    if (i13 != i12) {
                        if (i12 != ((i13 + 1) & 15)) {
                            interfaceC6677i0.mo30687c();
                        }
                    }
                }
                int i14 = i10;
                if (z10) {
                    int m21971D = this.f34781d.m21971D();
                    i14 = i10 | ((this.f34781d.m21971D() & 64) != 0 ? 2 : 0);
                    this.f34781d.m21984Q(m21971D - 1);
                }
                boolean z11 = this.f34791n;
                if (m30733z(i11)) {
                    this.f34781d.m21982O(m30730v);
                    interfaceC6677i0.mo30685a(this.f34781d, i14);
                    this.f34781d.m21982O(m21990f);
                }
                if (this.f34778a != 2 && !z11 && this.f34791n && length != -1) {
                    this.f34793p = true;
                }
            }
        }
        this.f34781d.m21983P(m30730v);
        return 0;
    }

    @Override // p057d7.InterfaceC4323f
    public void release() {
    }

    /* renamed from: u */
    public final boolean m30729u(InterfaceC4324g interfaceC4324g) {
        byte[] m21988d = this.f34781d.m21988d();
        if (9400 - this.f34781d.m21989e() < 188) {
            int m21985a = this.f34781d.m21985a();
            if (m21985a > 0) {
                System.arraycopy(m21988d, this.f34781d.m21989e(), m21988d, 0, m21985a);
            }
            this.f34781d.m21981N(m21988d, m21985a);
        }
        while (this.f34781d.m21985a() < 188) {
            int m21990f = this.f34781d.m21990f();
            int read = interfaceC4324g.read(m21988d, m21990f, 9400 - m21990f);
            if (read == -1) {
                return false;
            }
            this.f34781d.m21982O(m21990f + read);
        }
        return true;
    }

    /* renamed from: v */
    public final int m30730v() {
        int m21989e = this.f34781d.m21989e();
        int m21990f = this.f34781d.m21990f();
        int m30763a = C6679j0.m30763a(this.f34781d.m21988d(), m21989e, m21990f);
        this.f34781d.m21983P(m30763a);
        int i10 = m30763a + 188;
        if (i10 > m21990f) {
            int i11 = this.f34795r + (m30763a - m21989e);
            this.f34795r = i11;
            if (this.f34778a == 2 && i11 > 376) {
                throw C7594k1.m32822a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f34795r = 0;
        }
        return i10;
    }

    /* renamed from: x */
    public final void m30731x(long j10) {
        InterfaceC4325h interfaceC4325h;
        InterfaceC2348g bVar;
        if (this.f34792o) {
            return;
        }
        this.f34792o = true;
        if (this.f34787j.m30697b() != -9223372036854775807L) {
            C6669e0 c6669e0 = new C6669e0(this.f34787j.m30698c(), this.f34787j.m30697b(), j10, this.f34796s, this.f34779b);
            this.f34788k = c6669e0;
            interfaceC4325h = this.f34789l;
            bVar = c6669e0.m12059b();
        } else {
            interfaceC4325h = this.f34789l;
            bVar = new InterfaceC2348g.b(this.f34787j.m30697b());
        }
        interfaceC4325h.mo487p(bVar);
    }

    /* renamed from: y */
    public final void m30732y() {
        this.f34785h.clear();
        this.f34784g.clear();
        SparseArray<InterfaceC6677i0> mo30754b = this.f34783f.mo30754b();
        int size = mo30754b.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f34784g.put(mo30754b.keyAt(i10), mo30754b.valueAt(i10));
        }
        this.f34784g.put(0, new C6665c0(new a(this)));
        this.f34794q = null;
    }

    /* renamed from: z */
    public final boolean m30733z(int i10) {
        boolean z10 = false;
        if (this.f34778a == 2 || this.f34791n || !this.f34786i.get(i10, false)) {
            z10 = true;
        }
        return z10;
    }
}
