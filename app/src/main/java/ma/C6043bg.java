package ma;

import java.nio.charset.Charset;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/bg.class
 */
/* renamed from: ma.bg */
/* loaded from: combined.jar:classes2.jar:ma/bg.class */
public final class C6043bg implements InterfaceC6340pj {

    /* renamed from: a */
    public final AbstractC6022ag f33690a;

    public C6043bg(AbstractC6022ag abstractC6022ag) {
        Charset charset = C6482wg.f34130a;
        this.f33690a = abstractC6022ag;
        abstractC6022ag.f33663a = this;
    }

    /* renamed from: I */
    public static C6043bg m29443I(AbstractC6022ag abstractC6022ag) {
        C6043bg c6043bg = abstractC6022ag.f33663a;
        return c6043bg != null ? c6043bg : new C6043bg(abstractC6022ag);
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: A */
    public final void mo29444A(int i10, List list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                AbstractC6022ag abstractC6022ag = this.f33690a;
                long longValue = ((Long) list.get(i11)).longValue();
                abstractC6022ag.mo29425s(i10, (longValue >> 63) ^ (longValue + longValue));
            }
            return;
        }
        this.f33690a.mo29422p(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            long longValue2 = ((Long) list.get(i13)).longValue();
            i12 += AbstractC6022ag.m29407z((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.f33690a.mo29424r(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            AbstractC6022ag abstractC6022ag2 = this.f33690a;
            long longValue3 = ((Long) list.get(i14)).longValue();
            abstractC6022ag2.mo29426t((longValue3 >> 63) ^ (longValue3 + longValue3));
        }
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: B */
    public final void mo29445B(int i10, float f10) {
        this.f33690a.mo29414h(i10, Float.floatToRawIntBits(f10));
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: C */
    public final void mo29446C(int i10, Object obj, InterfaceC6150gi interfaceC6150gi) {
        AbstractC6022ag abstractC6022ag = this.f33690a;
        abstractC6022ag.mo29422p(i10, 3);
        interfaceC6150gi.mo29645d((InterfaceC6443uh) obj, abstractC6022ag.f33663a);
        abstractC6022ag.mo29422p(i10, 4);
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: D */
    public final void mo29447D(int i10, List list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f33690a.mo29416j(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            }
            return;
        }
        this.f33690a.mo29422p(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).doubleValue();
            i12 += 8;
        }
        this.f33690a.mo29424r(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f33690a.mo29417k(Double.doubleToRawLongBits(((Double) list.get(i14)).doubleValue()));
        }
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: E */
    public final void mo29448E(int i10, long j10) {
        this.f33690a.mo29416j(i10, j10);
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: F */
    public final void mo29449F(int i10, AbstractC6399sf abstractC6399sf) {
        this.f33690a.mo29413g(i10, abstractC6399sf);
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: G */
    public final void mo29450G(int i10, List list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f33690a.mo29414h(i10, ((Integer) list.get(i11)).intValue());
            }
            return;
        }
        this.f33690a.mo29422p(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        this.f33690a.mo29424r(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f33690a.mo29415i(((Integer) list.get(i14)).intValue());
        }
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: H */
    public final void mo29451H(int i10, String str) {
        this.f33690a.mo29421o(i10, str);
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: a */
    public final void mo29452a(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f33690a.mo29413g(i10, (AbstractC6399sf) list.get(i11));
        }
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: b */
    public final void mo29453b(int i10, List list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f33690a.mo29418l(i10, ((Integer) list.get(i11)).intValue());
            }
            return;
        }
        this.f33690a.mo29422p(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC6022ag.m29403v(((Integer) list.get(i13)).intValue());
        }
        this.f33690a.mo29424r(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f33690a.mo29419m(((Integer) list.get(i14)).intValue());
        }
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: c */
    public final void mo29454c(int i10, long j10) {
        this.f33690a.mo29425s(i10, j10);
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: d */
    public final void mo29455d(int i10, boolean z10) {
        this.f33690a.mo29412f(i10, z10);
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: e */
    public final void mo29456e(int i10, List list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f33690a.mo29425s(i10, ((Long) list.get(i11)).longValue());
            }
            return;
        }
        this.f33690a.mo29422p(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC6022ag.m29407z(((Long) list.get(i13)).longValue());
        }
        this.f33690a.mo29424r(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f33690a.mo29426t(((Long) list.get(i14)).longValue());
        }
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: f */
    public final void mo29457f(int i10, List list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f33690a.mo29412f(i10, ((Boolean) list.get(i11)).booleanValue());
            }
            return;
        }
        this.f33690a.mo29422p(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).booleanValue();
            i12++;
        }
        this.f33690a.mo29424r(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f33690a.mo29411e(((Boolean) list.get(i14)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: g */
    public final void mo29458g(int i10, List list) {
        if (!(list instanceof InterfaceC6044bh)) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f33690a.mo29421o(i10, (String) list.get(i11));
            }
            return;
        }
        InterfaceC6044bh interfaceC6044bh = (InterfaceC6044bh) list;
        for (int i12 = 0; i12 < list.size(); i12++) {
            Object mo29430n = interfaceC6044bh.mo29430n(i12);
            if (mo29430n instanceof String) {
                this.f33690a.mo29421o(i10, (String) mo29430n);
            } else {
                this.f33690a.mo29413g(i10, (AbstractC6399sf) mo29430n);
            }
        }
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: h */
    public final void mo29459h(int i10, Object obj, InterfaceC6150gi interfaceC6150gi) {
        InterfaceC6443uh interfaceC6443uh = (InterfaceC6443uh) obj;
        C6501xf c6501xf = (C6501xf) this.f33690a;
        c6501xf.mo29424r((i10 << 3) | 2);
        c6501xf.mo29424r(((AbstractC6105ef) interfaceC6443uh).mo29568a(interfaceC6150gi));
        interfaceC6150gi.mo29645d(interfaceC6443uh, c6501xf.f33663a);
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: i */
    public final void mo29460i(int i10, int i11) {
        this.f33690a.mo29418l(i10, i11);
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: j */
    public final void mo29461j(int i10, List list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                AbstractC6022ag abstractC6022ag = this.f33690a;
                int intValue = ((Integer) list.get(i11)).intValue();
                abstractC6022ag.mo29423q(i10, (intValue >> 31) ^ (intValue + intValue));
            }
            return;
        }
        this.f33690a.mo29422p(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            int intValue2 = ((Integer) list.get(i13)).intValue();
            i12 += AbstractC6022ag.m29406y((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.f33690a.mo29424r(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            AbstractC6022ag abstractC6022ag2 = this.f33690a;
            int intValue3 = ((Integer) list.get(i14)).intValue();
            abstractC6022ag2.mo29424r((intValue3 >> 31) ^ (intValue3 + intValue3));
        }
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: k */
    public final void mo29462k(int i10, double d10) {
        this.f33690a.mo29416j(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: l */
    public final void mo29463l(int i10, long j10) {
        this.f33690a.mo29416j(i10, j10);
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: m */
    public final void mo29464m(int i10, List list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f33690a.mo29416j(i10, ((Long) list.get(i11)).longValue());
            }
            return;
        }
        this.f33690a.mo29422p(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            i12 += 8;
        }
        this.f33690a.mo29424r(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f33690a.mo29417k(((Long) list.get(i14)).longValue());
        }
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: n */
    public final void mo29465n(int i10, long j10) {
        this.f33690a.mo29425s(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: o */
    public final void mo29466o(int i10, int i11) {
        this.f33690a.mo29414h(i10, i11);
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: p */
    public final void mo29467p(int i10, List list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f33690a.mo29414h(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            }
            return;
        }
        this.f33690a.mo29422p(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).floatValue();
            i12 += 4;
        }
        this.f33690a.mo29424r(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f33690a.mo29415i(Float.floatToRawIntBits(((Float) list.get(i14)).floatValue()));
        }
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: q */
    public final void mo29468q(int i10, List list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f33690a.mo29423q(i10, ((Integer) list.get(i11)).intValue());
            }
            return;
        }
        this.f33690a.mo29422p(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC6022ag.m29406y(((Integer) list.get(i13)).intValue());
        }
        this.f33690a.mo29424r(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f33690a.mo29424r(((Integer) list.get(i14)).intValue());
        }
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: r */
    public final void mo29469r(int i10, long j10) {
        this.f33690a.mo29425s(i10, j10);
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: s */
    public final void mo29470s(int i10, List list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f33690a.mo29418l(i10, ((Integer) list.get(i11)).intValue());
            }
            return;
        }
        this.f33690a.mo29422p(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC6022ag.m29403v(((Integer) list.get(i13)).intValue());
        }
        this.f33690a.mo29424r(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f33690a.mo29419m(((Integer) list.get(i14)).intValue());
        }
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: t */
    public final void mo29471t(int i10, int i11) {
        this.f33690a.mo29414h(i10, i11);
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: u */
    public final void mo29472u(int i10, List list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f33690a.mo29416j(i10, ((Long) list.get(i11)).longValue());
            }
            return;
        }
        this.f33690a.mo29422p(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            i12 += 8;
        }
        this.f33690a.mo29424r(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f33690a.mo29417k(((Long) list.get(i14)).longValue());
        }
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: v */
    public final void mo29473v(int i10, int i11) {
        this.f33690a.mo29418l(i10, i11);
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: w */
    public final void mo29474w(int i10, List list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f33690a.mo29425s(i10, ((Long) list.get(i11)).longValue());
            }
            return;
        }
        this.f33690a.mo29422p(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC6022ag.m29407z(((Long) list.get(i13)).longValue());
        }
        this.f33690a.mo29424r(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f33690a.mo29426t(((Long) list.get(i14)).longValue());
        }
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: x */
    public final void mo29475x(int i10, int i11) {
        this.f33690a.mo29423q(i10, i11);
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: y */
    public final void mo29476y(int i10, int i11) {
        this.f33690a.mo29423q(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // ma.InterfaceC6340pj
    /* renamed from: z */
    public final void mo29477z(int i10, List list, boolean z10) {
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f33690a.mo29414h(i10, ((Integer) list.get(i11)).intValue());
            }
            return;
        }
        this.f33690a.mo29422p(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        this.f33690a.mo29424r(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f33690a.mo29415i(((Integer) list.get(i14)).intValue());
        }
    }
}
