package p305ra;

import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/u5.class
 */
/* renamed from: ra.u5 */
/* loaded from: combined.jar:classes2.jar:ra/u5.class */
public final class C8365u5 {

    /* renamed from: a */
    public final AbstractC8350t5 f39297a;

    public C8365u5(AbstractC8350t5 abstractC8350t5) {
        C8366u6.m35903b(abstractC8350t5, "output");
        this.f39297a = abstractC8350t5;
        abstractC8350t5.f39282a = this;
    }

    /* renamed from: l */
    public static C8365u5 m35865l(AbstractC8350t5 abstractC8350t5) {
        C8365u5 c8365u5 = abstractC8350t5.f39282a;
        return c8365u5 != null ? c8365u5 : new C8365u5(abstractC8350t5);
    }

    /* renamed from: A */
    public final void m35866A(int i10, int i11) {
        this.f39297a.mo35717k(i10, AbstractC8350t5.m35820c(i11));
    }

    /* renamed from: B */
    public final void m35867B(int i10, long j10) {
        this.f39297a.mo35719m(i10, AbstractC8350t5.m35821d(j10));
    }

    /* renamed from: C */
    public final void m35868C(int i10, Object obj, InterfaceC8098c8 interfaceC8098c8) {
        InterfaceC8307q7 interfaceC8307q7 = (InterfaceC8307q7) obj;
        C8305q5 c8305q5 = (C8305q5) this.f39297a;
        c8305q5.mo35726t((i10 << 3) | 2);
        AbstractC8349t4 abstractC8349t4 = (AbstractC8349t4) interfaceC8307q7;
        int mo35587h = abstractC8349t4.mo35587h();
        int i11 = mo35587h;
        if (mo35587h == -1) {
            i11 = interfaceC8098c8.mo35096a(abstractC8349t4);
            abstractC8349t4.mo35588i(i11);
        }
        c8305q5.mo35726t(i11);
        interfaceC8098c8.mo35097b(interfaceC8307q7, c8305q5.f39282a);
    }

    /* renamed from: D */
    public final void m35869D(int i10, Object obj, InterfaceC8098c8 interfaceC8098c8) {
        AbstractC8350t5 abstractC8350t5 = this.f39297a;
        abstractC8350t5.mo35715i(i10, 3);
        interfaceC8098c8.mo35097b((InterfaceC8307q7) obj, abstractC8350t5.f39282a);
        abstractC8350t5.mo35715i(i10, 4);
    }

    /* renamed from: E */
    public final void m35870E(int i10) {
        this.f39297a.mo35715i(i10, 3);
    }

    /* renamed from: F */
    public final void m35871F(int i10) {
        this.f39297a.mo35715i(i10, 4);
    }

    /* renamed from: G */
    public final void m35872G(int i10, List<Integer> list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f39297a.mo35716j(i10, list.get(i11).intValue());
            }
            return;
        }
        this.f39297a.mo35715i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC8350t5.m35813B(list.get(i13).intValue());
        }
        this.f39297a.mo35726t(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f39297a.mo35725s(list.get(i14).intValue());
        }
    }

    /* renamed from: H */
    public final void m35873H(int i10, List<Integer> list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f39297a.mo35718l(i10, list.get(i11).intValue());
            }
            return;
        }
        this.f39297a.mo35715i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).intValue();
            i12 += 4;
        }
        this.f39297a.mo35726t(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f39297a.mo35727u(list.get(i14).intValue());
        }
    }

    /* renamed from: I */
    public final void m35874I(int i10, List<Long> list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f39297a.mo35719m(i10, list.get(i11).longValue());
            }
            return;
        }
        this.f39297a.mo35715i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC8350t5.m35815D(list.get(i13).longValue());
        }
        this.f39297a.mo35726t(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f39297a.mo35728v(list.get(i14).longValue());
        }
    }

    /* renamed from: J */
    public final void m35875J(int i10, List<Long> list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f39297a.mo35719m(i10, list.get(i11).longValue());
            }
            return;
        }
        this.f39297a.mo35715i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC8350t5.m35815D(list.get(i13).longValue());
        }
        this.f39297a.mo35726t(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f39297a.mo35728v(list.get(i14).longValue());
        }
    }

    /* renamed from: K */
    public final void m35876K(int i10, List<Long> list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f39297a.mo35720n(i10, list.get(i11).longValue());
            }
            return;
        }
        this.f39297a.mo35715i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).longValue();
            i12 += 8;
        }
        this.f39297a.mo35726t(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f39297a.mo35729w(list.get(i14).longValue());
        }
    }

    /* renamed from: a */
    public final void m35877a(int i10, List<Float> list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f39297a.mo35718l(i10, Float.floatToRawIntBits(list.get(i11).floatValue()));
            }
            return;
        }
        this.f39297a.mo35715i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).floatValue();
            i12 += 4;
        }
        this.f39297a.mo35726t(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f39297a.mo35727u(Float.floatToRawIntBits(list.get(i14).floatValue()));
        }
    }

    /* renamed from: b */
    public final void m35878b(int i10, List<Double> list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f39297a.mo35720n(i10, Double.doubleToRawLongBits(list.get(i11).doubleValue()));
            }
            return;
        }
        this.f39297a.mo35715i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).doubleValue();
            i12 += 8;
        }
        this.f39297a.mo35726t(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f39297a.mo35729w(Double.doubleToRawLongBits(list.get(i14).doubleValue()));
        }
    }

    /* renamed from: c */
    public final void m35879c(int i10, List<Integer> list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f39297a.mo35716j(i10, list.get(i11).intValue());
            }
            return;
        }
        this.f39297a.mo35715i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC8350t5.m35813B(list.get(i13).intValue());
        }
        this.f39297a.mo35726t(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f39297a.mo35725s(list.get(i14).intValue());
        }
    }

    /* renamed from: d */
    public final void m35880d(int i10, List<Boolean> list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f39297a.mo35721o(i10, list.get(i11).booleanValue());
            }
            return;
        }
        this.f39297a.mo35715i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).booleanValue();
            i12++;
        }
        this.f39297a.mo35726t(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f39297a.mo35724r(list.get(i14).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    /* renamed from: e */
    public final void m35881e(int i10, List<String> list) {
        if (!(list instanceof InterfaceC8067a7)) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f39297a.mo35722p(i10, list.get(i11));
            }
            return;
        }
        InterfaceC8067a7 interfaceC8067a7 = (InterfaceC8067a7) list;
        for (int i12 = 0; i12 < list.size(); i12++) {
            Object mo35000m = interfaceC8067a7.mo35000m(i12);
            if (mo35000m instanceof String) {
                this.f39297a.mo35722p(i10, (String) mo35000m);
            } else {
                this.f39297a.mo35723q(i10, (AbstractC8230l5) mo35000m);
            }
        }
    }

    /* renamed from: f */
    public final void m35882f(int i10, List<AbstractC8230l5> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f39297a.mo35723q(i10, list.get(i11));
        }
    }

    /* renamed from: g */
    public final void m35883g(int i10, List<Integer> list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f39297a.mo35717k(i10, list.get(i11).intValue());
            }
            return;
        }
        this.f39297a.mo35715i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC8350t5.m35814C(list.get(i13).intValue());
        }
        this.f39297a.mo35726t(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f39297a.mo35726t(list.get(i14).intValue());
        }
    }

    /* renamed from: h */
    public final void m35884h(int i10, List<Integer> list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f39297a.mo35718l(i10, list.get(i11).intValue());
            }
            return;
        }
        this.f39297a.mo35715i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).intValue();
            i12 += 4;
        }
        this.f39297a.mo35726t(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f39297a.mo35727u(list.get(i14).intValue());
        }
    }

    /* renamed from: i */
    public final void m35885i(int i10, List<Long> list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f39297a.mo35720n(i10, list.get(i11).longValue());
            }
            return;
        }
        this.f39297a.mo35715i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).longValue();
            i12 += 8;
        }
        this.f39297a.mo35726t(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f39297a.mo35729w(list.get(i14).longValue());
        }
    }

    /* renamed from: j */
    public final void m35886j(int i10, List<Integer> list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f39297a.mo35717k(i10, AbstractC8350t5.m35820c(list.get(i11).intValue()));
            }
            return;
        }
        this.f39297a.mo35715i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC8350t5.m35814C(AbstractC8350t5.m35820c(list.get(i13).intValue()));
        }
        this.f39297a.mo35726t(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f39297a.mo35726t(AbstractC8350t5.m35820c(list.get(i14).intValue()));
        }
    }

    /* renamed from: k */
    public final void m35887k(int i10, List<Long> list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f39297a.mo35719m(i10, AbstractC8350t5.m35821d(list.get(i11).longValue()));
            }
            return;
        }
        this.f39297a.mo35715i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC8350t5.m35815D(AbstractC8350t5.m35821d(list.get(i13).longValue()));
        }
        this.f39297a.mo35726t(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f39297a.mo35728v(AbstractC8350t5.m35821d(list.get(i14).longValue()));
        }
    }

    /* renamed from: m */
    public final void m35888m(int i10, int i11) {
        this.f39297a.mo35718l(i10, i11);
    }

    /* renamed from: n */
    public final void m35889n(int i10, long j10) {
        this.f39297a.mo35719m(i10, j10);
    }

    /* renamed from: o */
    public final void m35890o(int i10, long j10) {
        this.f39297a.mo35720n(i10, j10);
    }

    /* renamed from: p */
    public final void m35891p(int i10, float f10) {
        this.f39297a.mo35718l(i10, Float.floatToRawIntBits(f10));
    }

    /* renamed from: q */
    public final void m35892q(int i10, double d10) {
        this.f39297a.mo35720n(i10, Double.doubleToRawLongBits(d10));
    }

    /* renamed from: r */
    public final void m35893r(int i10, int i11) {
        this.f39297a.mo35716j(i10, i11);
    }

    /* renamed from: s */
    public final void m35894s(int i10, long j10) {
        this.f39297a.mo35719m(i10, j10);
    }

    /* renamed from: t */
    public final void m35895t(int i10, int i11) {
        this.f39297a.mo35716j(i10, i11);
    }

    /* renamed from: u */
    public final void m35896u(int i10, long j10) {
        this.f39297a.mo35720n(i10, j10);
    }

    /* renamed from: v */
    public final void m35897v(int i10, int i11) {
        this.f39297a.mo35718l(i10, i11);
    }

    /* renamed from: w */
    public final void m35898w(int i10, boolean z10) {
        this.f39297a.mo35721o(i10, z10);
    }

    /* renamed from: x */
    public final void m35899x(int i10, String str) {
        this.f39297a.mo35722p(i10, str);
    }

    /* renamed from: y */
    public final void m35900y(int i10, AbstractC8230l5 abstractC8230l5) {
        this.f39297a.mo35723q(i10, abstractC8230l5);
    }

    /* renamed from: z */
    public final void m35901z(int i10, int i11) {
        this.f39297a.mo35717k(i10, i11);
    }
}
