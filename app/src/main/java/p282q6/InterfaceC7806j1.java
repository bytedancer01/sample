package p282q6;

import android.util.SparseArray;
import ec.C4705h;
import java.io.IOException;
import java.util.List;
import p009a8.C0083a1;
import p009a8.C0111o;
import p009a8.C0117r;
import p009a8.InterfaceC0127w;
import p059d9.C4349a;
import p059d9.C4376n;
import p078e9.C4670d0;
import p267p6.AbstractC7574e2;
import p267p6.C7561b1;
import p267p6.C7565c1;
import p267p6.C7597l1;
import p267p6.C7603n1;
import p267p6.C7629w0;
import p267p6.InterfaceC7606o1;
import p283q7.C7839a;
import p301r6.C7972d;
import p332t6.C8636d;
import p332t6.C8639g;
import p421y8.C9888l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:q6/j1.class
 */
/* renamed from: q6.j1 */
/* loaded from: combined.jar:classes2.jar:q6/j1.class */
public interface InterfaceC7806j1 {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:q6/j1$a.class
     */
    /* renamed from: q6.j1$a */
    /* loaded from: combined.jar:classes2.jar:q6/j1$a.class */
    public static final class a {

        /* renamed from: a */
        public final long f37717a;

        /* renamed from: b */
        public final AbstractC7574e2 f37718b;

        /* renamed from: c */
        public final int f37719c;

        /* renamed from: d */
        public final InterfaceC0127w.a f37720d;

        /* renamed from: e */
        public final long f37721e;

        /* renamed from: f */
        public final AbstractC7574e2 f37722f;

        /* renamed from: g */
        public final int f37723g;

        /* renamed from: h */
        public final InterfaceC0127w.a f37724h;

        /* renamed from: i */
        public final long f37725i;

        /* renamed from: j */
        public final long f37726j;

        public a(long j10, AbstractC7574e2 abstractC7574e2, int i10, InterfaceC0127w.a aVar, long j11, AbstractC7574e2 abstractC7574e22, int i11, InterfaceC0127w.a aVar2, long j12, long j13) {
            this.f37717a = j10;
            this.f37718b = abstractC7574e2;
            this.f37719c = i10;
            this.f37720d = aVar;
            this.f37721e = j11;
            this.f37722f = abstractC7574e22;
            this.f37723g = i11;
            this.f37724h = aVar2;
            this.f37725i = j12;
            this.f37726j = j13;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f37717a != aVar.f37717a || this.f37719c != aVar.f37719c || this.f37721e != aVar.f37721e || this.f37723g != aVar.f37723g || this.f37725i != aVar.f37725i || this.f37726j != aVar.f37726j || !C4705h.m23655a(this.f37718b, aVar.f37718b) || !C4705h.m23655a(this.f37720d, aVar.f37720d) || !C4705h.m23655a(this.f37722f, aVar.f37722f) || !C4705h.m23655a(this.f37724h, aVar.f37724h)) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            return C4705h.m23656b(Long.valueOf(this.f37717a), this.f37718b, Integer.valueOf(this.f37719c), this.f37720d, Long.valueOf(this.f37721e), this.f37722f, Integer.valueOf(this.f37723g), this.f37724h, Long.valueOf(this.f37725i), Long.valueOf(this.f37726j));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:q6/j1$b.class
     */
    /* renamed from: q6.j1$b */
    /* loaded from: combined.jar:classes2.jar:q6/j1$b.class */
    public static final class b {

        /* renamed from: a */
        public final C4376n f37727a;

        /* renamed from: b */
        public final SparseArray<a> f37728b;

        public b(C4376n c4376n, SparseArray<a> sparseArray) {
            this.f37727a = c4376n;
            SparseArray<a> sparseArray2 = new SparseArray<>(c4376n.m22155d());
            for (int i10 = 0; i10 < c4376n.m22155d(); i10++) {
                int m22154c = c4376n.m22154c(i10);
                sparseArray2.append(m22154c, (a) C4349a.m21882e(sparseArray.get(m22154c)));
            }
            this.f37728b = sparseArray2;
        }
    }

    /* renamed from: A */
    void mo22070A(a aVar, C7839a c7839a);

    /* renamed from: B */
    void mo22071B(a aVar, InterfaceC7606o1.f fVar, InterfaceC7606o1.f fVar2, int i10);

    /* renamed from: C */
    void mo22072C(a aVar, C4670d0 c4670d0);

    /* renamed from: D */
    void mo22073D(a aVar, int i10);

    @Deprecated
    /* renamed from: E */
    void mo22074E(a aVar, String str, long j10);

    @Deprecated
    /* renamed from: F */
    void mo22076F(a aVar, int i10, int i11, int i12, float f10);

    /* renamed from: G */
    void mo22078G(a aVar, C7565c1 c7565c1);

    /* renamed from: H */
    void mo22080H(InterfaceC7606o1 interfaceC7606o1, b bVar);

    @Deprecated
    /* renamed from: I */
    void mo22082I(a aVar);

    /* renamed from: J */
    void mo22084J(a aVar, C8636d c8636d);

    /* renamed from: K */
    void mo22086K(a aVar, C7597l1 c7597l1);

    /* renamed from: L */
    void mo22088L(a aVar);

    /* renamed from: M */
    void mo22090M(a aVar, Exception exc);

    /* renamed from: N */
    void mo22091N(a aVar, int i10);

    /* renamed from: O */
    void mo22092O(a aVar, boolean z10);

    /* renamed from: P */
    void mo22093P(a aVar, C8636d c8636d);

    @Deprecated
    /* renamed from: Q */
    void mo22094Q(a aVar, int i10, C8636d c8636d);

    /* renamed from: R */
    void mo22095R(a aVar, InterfaceC7606o1.b bVar);

    @Deprecated
    /* renamed from: S */
    void mo22096S(a aVar, int i10, String str, long j10);

    /* renamed from: T */
    void mo22097T(a aVar, String str, long j10, long j11);

    /* renamed from: U */
    void mo22098U(a aVar, Exception exc);

    /* renamed from: V */
    void mo22099V(a aVar, int i10, int i11);

    /* renamed from: W */
    void mo22100W(a aVar, long j10, int i10);

    /* renamed from: X */
    void mo22101X(a aVar);

    @Deprecated
    /* renamed from: Y */
    void mo22102Y(a aVar, int i10, C7629w0 c7629w0);

    /* renamed from: Z */
    void mo22103Z(a aVar, C0083a1 c0083a1, C9888l c9888l);

    @Deprecated
    /* renamed from: a */
    void mo22104a(a aVar, List<C7839a> list);

    /* renamed from: a0 */
    void mo22105a0(a aVar, boolean z10);

    /* renamed from: b */
    void mo22106b(a aVar, int i10);

    /* renamed from: b0 */
    void mo22107b0(a aVar, boolean z10, int i10);

    /* renamed from: c */
    void mo22108c(a aVar);

    /* renamed from: c0 */
    void mo22109c0(a aVar, C7972d c7972d);

    /* renamed from: d */
    void mo22110d(a aVar, String str);

    /* renamed from: d0 */
    void mo22111d0(a aVar, Exception exc);

    /* renamed from: e */
    void mo22112e(a aVar, C7629w0 c7629w0, C8639g c8639g);

    /* renamed from: e0 */
    void mo22113e0(a aVar, boolean z10);

    /* renamed from: f */
    void mo22114f(a aVar, C0111o c0111o, C0117r c0117r);

    @Deprecated
    /* renamed from: f0 */
    void mo22115f0(a aVar, int i10);

    /* renamed from: g */
    void mo22116g(a aVar, C7629w0 c7629w0, C8639g c8639g);

    /* renamed from: g0 */
    void mo22117g0(a aVar, C0117r c0117r);

    /* renamed from: h */
    void mo22118h(a aVar, int i10, long j10, long j11);

    /* renamed from: h0 */
    void mo22119h0(a aVar, C0117r c0117r);

    /* renamed from: i */
    void mo22120i(a aVar, int i10, long j10, long j11);

    @Deprecated
    /* renamed from: i0 */
    void mo22121i0(a aVar, boolean z10, int i10);

    /* renamed from: j */
    void mo22122j(a aVar, int i10);

    /* renamed from: j0 */
    void mo22123j0(a aVar, Object obj, long j10);

    /* renamed from: k */
    void mo22124k(a aVar, int i10, long j10);

    @Deprecated
    /* renamed from: k0 */
    void mo22125k0(a aVar, String str, long j10);

    /* renamed from: l */
    void mo22126l(a aVar, String str);

    /* renamed from: l0 */
    void mo22127l0(a aVar);

    @Deprecated
    /* renamed from: m */
    void mo22128m(a aVar);

    /* renamed from: m0 */
    void mo22129m0(a aVar, boolean z10);

    @Deprecated
    /* renamed from: n */
    void mo22130n(a aVar, int i10, C8636d c8636d);

    @Deprecated
    /* renamed from: n0 */
    void mo22131n0(a aVar);

    /* renamed from: o */
    void mo22132o(a aVar, Exception exc);

    /* renamed from: o0 */
    void mo22133o0(a aVar, C7603n1 c7603n1);

    /* renamed from: p */
    void mo22134p(a aVar);

    /* renamed from: p0 */
    void mo22135p0(a aVar, String str, long j10, long j11);

    @Deprecated
    /* renamed from: q */
    void mo22136q(a aVar, C7629w0 c7629w0);

    /* renamed from: q0 */
    void mo22137q0(a aVar, int i10);

    /* renamed from: r */
    void mo22138r(a aVar, C0111o c0111o, C0117r c0117r);

    /* renamed from: s */
    void mo22139s(a aVar, C0111o c0111o, C0117r c0117r);

    /* renamed from: t */
    void mo22140t(a aVar, C8636d c8636d);

    @Deprecated
    /* renamed from: u */
    void mo22142u(a aVar, C7629w0 c7629w0);

    /* renamed from: v */
    void mo22144v(a aVar, C0111o c0111o, C0117r c0117r, IOException iOException, boolean z10);

    @Deprecated
    /* renamed from: w */
    void mo22145w(a aVar, boolean z10);

    /* renamed from: x */
    void mo22146x(a aVar, C7561b1 c7561b1, int i10);

    /* renamed from: y */
    void mo22147y(a aVar, C8636d c8636d);

    /* renamed from: z */
    void mo22148z(a aVar, long j10);
}
