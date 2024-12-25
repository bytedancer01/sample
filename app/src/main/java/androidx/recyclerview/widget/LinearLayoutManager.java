package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.C0707f;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import org.apache.http.impl.auth.NTLMEngineImpl;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/LinearLayoutManager.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/LinearLayoutManager.class */
public class LinearLayoutManager extends RecyclerView.AbstractC0685p implements C0707f.h, RecyclerView.AbstractC0666a0.b {

    /* renamed from: A */
    public int f4449A;

    /* renamed from: B */
    public int f4450B;

    /* renamed from: C */
    public boolean f4451C;

    /* renamed from: D */
    public C0664d f4452D;

    /* renamed from: E */
    public final C0661a f4453E;

    /* renamed from: F */
    public final C0662b f4454F;

    /* renamed from: G */
    public int f4455G;

    /* renamed from: H */
    public int[] f4456H;

    /* renamed from: s */
    public int f4457s;

    /* renamed from: t */
    public C0663c f4458t;

    /* renamed from: u */
    public AbstractC0713l f4459u;

    /* renamed from: v */
    public boolean f4460v;

    /* renamed from: w */
    public boolean f4461w;

    /* renamed from: x */
    public boolean f4462x;

    /* renamed from: y */
    public boolean f4463y;

    /* renamed from: z */
    public boolean f4464z;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/LinearLayoutManager$a.class
     */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/LinearLayoutManager$a.class */
    public static class C0661a {

        /* renamed from: a */
        public AbstractC0713l f4465a;

        /* renamed from: b */
        public int f4466b;

        /* renamed from: c */
        public int f4467c;

        /* renamed from: d */
        public boolean f4468d;

        /* renamed from: e */
        public boolean f4469e;

        public C0661a() {
            m3845e();
        }

        /* renamed from: a */
        public void m3841a() {
            this.f4467c = this.f4468d ? this.f4465a.mo4619i() : this.f4465a.mo4623m();
        }

        /* renamed from: b */
        public void m3842b(View view, int i10) {
            this.f4467c = this.f4468d ? this.f4465a.mo4614d(view) + this.f4465a.m4625o() : this.f4465a.mo4617g(view);
            this.f4466b = i10;
        }

        /* renamed from: c */
        public void m3843c(View view, int i10) {
            int m4625o = this.f4465a.m4625o();
            if (m4625o >= 0) {
                m3842b(view, i10);
                return;
            }
            this.f4466b = i10;
            if (this.f4468d) {
                int mo4619i = (this.f4465a.mo4619i() - m4625o) - this.f4465a.mo4614d(view);
                this.f4467c = this.f4465a.mo4619i() - mo4619i;
                if (mo4619i > 0) {
                    int mo4615e = this.f4465a.mo4615e(view);
                    int i11 = this.f4467c;
                    int mo4623m = this.f4465a.mo4623m();
                    int min = (i11 - mo4615e) - (mo4623m + Math.min(this.f4465a.mo4617g(view) - mo4623m, 0));
                    if (min < 0) {
                        this.f4467c += Math.min(mo4619i, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int mo4617g = this.f4465a.mo4617g(view);
            int mo4623m2 = mo4617g - this.f4465a.mo4623m();
            this.f4467c = mo4617g;
            if (mo4623m2 > 0) {
                int mo4615e2 = this.f4465a.mo4615e(view);
                int mo4619i2 = (this.f4465a.mo4619i() - Math.min(0, (this.f4465a.mo4619i() - m4625o) - this.f4465a.mo4614d(view))) - (mo4617g + mo4615e2);
                if (mo4619i2 < 0) {
                    this.f4467c -= Math.min(mo4623m2, -mo4619i2);
                }
            }
        }

        /* renamed from: d */
        public boolean m3844d(View view, RecyclerView.C0668b0 c0668b0) {
            RecyclerView.C0686q c0686q = (RecyclerView.C0686q) view.getLayoutParams();
            return !c0686q.m4249k() && c0686q.m4247c() >= 0 && c0686q.m4247c() < c0668b0.m4009c();
        }

        /* renamed from: e */
        public void m3845e() {
            this.f4466b = -1;
            this.f4467c = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            this.f4468d = false;
            this.f4469e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f4466b + ", mCoordinate=" + this.f4467c + ", mLayoutFromEnd=" + this.f4468d + ", mValid=" + this.f4469e + '}';
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/LinearLayoutManager$b.class
     */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/LinearLayoutManager$b.class */
    public static class C0662b {

        /* renamed from: a */
        public int f4470a;

        /* renamed from: b */
        public boolean f4471b;

        /* renamed from: c */
        public boolean f4472c;

        /* renamed from: d */
        public boolean f4473d;

        /* renamed from: a */
        public void m3846a() {
            this.f4470a = 0;
            this.f4471b = false;
            this.f4472c = false;
            this.f4473d = false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/LinearLayoutManager$c.class
     */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/LinearLayoutManager$c.class */
    public static class C0663c {

        /* renamed from: b */
        public int f4475b;

        /* renamed from: c */
        public int f4476c;

        /* renamed from: d */
        public int f4477d;

        /* renamed from: e */
        public int f4478e;

        /* renamed from: f */
        public int f4479f;

        /* renamed from: g */
        public int f4480g;

        /* renamed from: k */
        public int f4484k;

        /* renamed from: m */
        public boolean f4486m;

        /* renamed from: a */
        public boolean f4474a = true;

        /* renamed from: h */
        public int f4481h = 0;

        /* renamed from: i */
        public int f4482i = 0;

        /* renamed from: j */
        public boolean f4483j = false;

        /* renamed from: l */
        public List<RecyclerView.AbstractC0674e0> f4485l = null;

        /* renamed from: a */
        public void m3847a() {
            m3848b(null);
        }

        /* renamed from: b */
        public void m3848b(View view) {
            View m3852f = m3852f(view);
            this.f4477d = m3852f == null ? -1 : ((RecyclerView.C0686q) m3852f.getLayoutParams()).m4247c();
        }

        /* renamed from: c */
        public boolean m3849c(RecyclerView.C0668b0 c0668b0) {
            int i10 = this.f4477d;
            return i10 >= 0 && i10 < c0668b0.m4009c();
        }

        /* renamed from: d */
        public View m3850d(RecyclerView.C0692w c0692w) {
            if (this.f4485l != null) {
                return m3851e();
            }
            View m4300o = c0692w.m4300o(this.f4477d);
            this.f4477d += this.f4478e;
            return m4300o;
        }

        /* renamed from: e */
        public final View m3851e() {
            int size = this.f4485l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.f4485l.get(i10).f4620a;
                RecyclerView.C0686q c0686q = (RecyclerView.C0686q) view.getLayoutParams();
                if (!c0686q.m4249k() && this.f4477d == c0686q.m4247c()) {
                    m3848b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: f */
        public View m3852f(View view) {
            View view2;
            int size = this.f4485l.size();
            View view3 = null;
            int i10 = Integer.MAX_VALUE;
            int i11 = 0;
            while (true) {
                view2 = view3;
                if (i11 >= size) {
                    break;
                }
                View view4 = this.f4485l.get(i11).f4620a;
                RecyclerView.C0686q c0686q = (RecyclerView.C0686q) view4.getLayoutParams();
                View view5 = view3;
                int i12 = i10;
                if (view4 != view) {
                    if (c0686q.m4249k()) {
                        view5 = view3;
                        i12 = i10;
                    } else {
                        int m4247c = (c0686q.m4247c() - this.f4477d) * this.f4478e;
                        if (m4247c < 0) {
                            view5 = view3;
                            i12 = i10;
                        } else {
                            view5 = view3;
                            i12 = i10;
                            if (m4247c >= i10) {
                                continue;
                            } else {
                                if (m4247c == 0) {
                                    view2 = view4;
                                    break;
                                }
                                i12 = m4247c;
                                view5 = view4;
                            }
                        }
                    }
                }
                i11++;
                view3 = view5;
                i10 = i12;
            }
            return view2;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/LinearLayoutManager$d.class
     */
    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/LinearLayoutManager$d.class */
    public static class C0664d implements Parcelable {
        public static final Parcelable.Creator<C0664d> CREATOR = new a();

        /* renamed from: b */
        public int f4487b;

        /* renamed from: c */
        public int f4488c;

        /* renamed from: d */
        public boolean f4489d;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/recyclerview/widget/LinearLayoutManager$d$a.class
         */
        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/LinearLayoutManager$d$a.class */
        public class a implements Parcelable.Creator<C0664d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0664d createFromParcel(Parcel parcel) {
                return new C0664d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0664d[] newArray(int i10) {
                return new C0664d[i10];
            }
        }

        public C0664d() {
        }

        public C0664d(Parcel parcel) {
            this.f4487b = parcel.readInt();
            this.f4488c = parcel.readInt();
            this.f4489d = parcel.readInt() != 1 ? false : true;
        }

        public C0664d(C0664d c0664d) {
            this.f4487b = c0664d.f4487b;
            this.f4488c = c0664d.f4488c;
            this.f4489d = c0664d.f4489d;
        }

        /* renamed from: b */
        public boolean m3853b() {
            return this.f4487b >= 0;
        }

        /* renamed from: c */
        public void m3854c() {
            this.f4487b = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4487b);
            parcel.writeInt(this.f4488c);
            parcel.writeInt(this.f4489d ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.f4457s = 1;
        this.f4461w = false;
        this.f4462x = false;
        this.f4463y = false;
        this.f4464z = true;
        this.f4449A = -1;
        this.f4450B = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        this.f4452D = null;
        this.f4453E = new C0661a();
        this.f4454F = new C0662b();
        this.f4455G = 2;
        this.f4456H = new int[2];
        m3810X2(i10);
        m3811Y2(z10);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f4457s = 1;
        this.f4461w = false;
        this.f4462x = false;
        this.f4463y = false;
        this.f4464z = true;
        this.f4449A = -1;
        this.f4450B = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        this.f4452D = null;
        this.f4453E = new C0661a();
        this.f4454F = new C0662b();
        this.f4455G = 2;
        this.f4456H = new int[2];
        RecyclerView.AbstractC0685p.d m4147C0 = RecyclerView.AbstractC0685p.m4147C0(context, attributeSet, i10, i11);
        m3810X2(m4147C0.f4675a);
        m3811Y2(m4147C0.f4677c);
        mo3754Z2(m4147C0.f4678d);
    }

    /* renamed from: A2 */
    public View m3786A2(int i10, int i11, boolean z10, boolean z11) {
        m3832r2();
        int i12 = 320;
        int i13 = z10 ? 24579 : 320;
        if (!z11) {
            i12 = 0;
        }
        return (this.f4457s == 0 ? this.f4659e : this.f4660f).m4676a(i10, i11, i13, i12);
    }

    /* renamed from: B2 */
    public final View m3787B2() {
        return this.f4462x ? m3834t2() : m3838x2();
    }

    /* renamed from: C2 */
    public final View m3788C2() {
        return this.f4462x ? m3838x2() : m3834t2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: D */
    public void mo3789D(String str) {
        if (this.f4452D == null) {
            super.mo3789D(str);
        }
    }

    /* renamed from: D2 */
    public View mo3746D2(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0, boolean z10, boolean z11) {
        int i10;
        int i11;
        m3832r2();
        int m4217h0 = m4217h0();
        int i12 = -1;
        if (z11) {
            i10 = m4217h0() - 1;
            i11 = -1;
        } else {
            i12 = m4217h0;
            i10 = 0;
            i11 = 1;
        }
        int m4009c = c0668b0.m4009c();
        int mo4623m = this.f4459u.mo4623m();
        int mo4619i = this.f4459u.mo4619i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (true) {
            View view4 = view3;
            if (i10 == i12) {
                if (view == null) {
                    view = view2 != null ? view2 : view4;
                }
                return view;
            }
            View m4216g0 = m4216g0(i10);
            int m4155B0 = m4155B0(m4216g0);
            int mo4617g = this.f4459u.mo4617g(m4216g0);
            int mo4614d = this.f4459u.mo4614d(m4216g0);
            View view5 = view;
            View view6 = view2;
            View view7 = view4;
            if (m4155B0 >= 0) {
                view5 = view;
                view6 = view2;
                view7 = view4;
                if (m4155B0 >= m4009c) {
                    continue;
                } else if (((RecyclerView.C0686q) m4216g0.getLayoutParams()).m4249k()) {
                    view5 = view;
                    view6 = view2;
                    view7 = view4;
                    if (view4 == null) {
                        view5 = view;
                        view6 = view2;
                        view7 = m4216g0;
                    }
                } else {
                    boolean z12 = mo4614d <= mo4623m && mo4617g < mo4623m;
                    boolean z13 = mo4617g >= mo4619i && mo4614d > mo4619i;
                    if (!z12 && !z13) {
                        return m4216g0;
                    }
                    if (z10) {
                        if (!z13) {
                            view5 = view;
                            view6 = view2;
                            view7 = view4;
                            if (view != null) {
                            }
                            view7 = view4;
                            view6 = view2;
                            view5 = m4216g0;
                        }
                        view5 = view;
                        view6 = m4216g0;
                        view7 = view4;
                    } else {
                        if (!z12) {
                            view5 = view;
                            view6 = view2;
                            view7 = view4;
                            if (view != null) {
                            }
                            view7 = view4;
                            view6 = view2;
                            view5 = m4216g0;
                        }
                        view5 = view;
                        view6 = m4216g0;
                        view7 = view4;
                    }
                }
            }
            i10 += i11;
            view = view5;
            view2 = view6;
            view3 = view7;
        }
    }

    /* renamed from: E2 */
    public final int m3790E2(int i10, RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0, boolean z10) {
        int mo4619i;
        int mo4619i2 = this.f4459u.mo4619i() - i10;
        if (mo4619i2 <= 0) {
            return 0;
        }
        int i11 = -m3808V2(-mo4619i2, c0692w, c0668b0);
        if (!z10 || (mo4619i = this.f4459u.mo4619i() - (i10 + i11)) <= 0) {
            return i11;
        }
        this.f4459u.mo4628r(mo4619i);
        return mo4619i + i11;
    }

    /* renamed from: F2 */
    public final int m3791F2(int i10, RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0, boolean z10) {
        int mo4623m = i10 - this.f4459u.mo4623m();
        if (mo4623m <= 0) {
            return 0;
        }
        int i11 = -m3808V2(mo4623m, c0692w, c0668b0);
        int i12 = i11;
        if (z10) {
            int mo4623m2 = (i10 + i11) - this.f4459u.mo4623m();
            i12 = i11;
            if (mo4623m2 > 0) {
                this.f4459u.mo4628r(-mo4623m2);
                i12 = i11 - mo4623m2;
            }
        }
        return i12;
    }

    /* renamed from: G2 */
    public final View m3792G2() {
        return m4216g0(this.f4462x ? 0 : m4217h0() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: H */
    public boolean mo2731H() {
        return this.f4457s == 0;
    }

    /* renamed from: H2 */
    public final View m3793H2() {
        return m4216g0(this.f4462x ? m4217h0() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: I */
    public boolean mo2736I() {
        boolean z10 = true;
        if (this.f4457s != 1) {
            z10 = false;
        }
        return z10;
    }

    @Deprecated
    /* renamed from: I2 */
    public int m3794I2(RecyclerView.C0668b0 c0668b0) {
        if (c0668b0.m4013g()) {
            return this.f4459u.mo4624n();
        }
        return 0;
    }

    /* renamed from: J2 */
    public int m3795J2() {
        return this.f4457s;
    }

    /* renamed from: K2 */
    public boolean m3796K2() {
        boolean z10 = true;
        if (m4234x0() != 1) {
            z10 = false;
        }
        return z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: L */
    public void mo2746L(int i10, int i11, RecyclerView.C0668b0 c0668b0, RecyclerView.AbstractC0685p.c cVar) {
        if (this.f4457s != 0) {
            i10 = i11;
        }
        if (m4217h0() == 0 || i10 == 0) {
            return;
        }
        m3832r2();
        m3817d3(i10 > 0 ? 1 : -1, Math.abs(i10), true, c0668b0);
        mo3760l2(c0668b0, this.f4458t, cVar);
    }

    /* renamed from: L2 */
    public boolean m3797L2() {
        return this.f4464z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: M */
    public void mo2750M(int i10, RecyclerView.AbstractC0685p.c cVar) {
        int i11;
        boolean z10;
        C0664d c0664d = this.f4452D;
        if (c0664d == null || !c0664d.m3853b()) {
            m3807U2();
            boolean z11 = this.f4462x;
            int i12 = this.f4449A;
            i11 = i12;
            z10 = z11;
            if (i12 == -1) {
                if (z11) {
                    i11 = i10 - 1;
                    z10 = z11;
                } else {
                    i11 = 0;
                    z10 = z11;
                }
            }
        } else {
            C0664d c0664d2 = this.f4452D;
            z10 = c0664d2.f4489d;
            i11 = c0664d2.f4487b;
        }
        int i13 = z10 ? -1 : 1;
        for (int i14 = 0; i14 < this.f4455G && i11 >= 0 && i11 < i10; i14++) {
            cVar.mo4245a(i11, 0);
            i11 += i13;
        }
    }

    /* renamed from: M2 */
    public void mo3748M2(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0, C0663c c0663c, C0662b c0662b) {
        int i10;
        int i11;
        int i12;
        int i13;
        int m4226o;
        int mo4616f;
        View m3850d = c0663c.m3850d(c0692w);
        if (m3850d == null) {
            c0662b.f4471b = true;
            return;
        }
        RecyclerView.C0686q c0686q = (RecyclerView.C0686q) m3850d.getLayoutParams();
        if (c0663c.f4485l == null) {
            if (this.f4462x == (c0663c.f4479f == -1)) {
                m4151A(m3850d);
            } else {
                m4154B(m3850d, 0);
            }
        } else {
            if (this.f4462x == (c0663c.f4479f == -1)) {
                m4236y(m3850d);
            } else {
                m4238z(m3850d, 0);
            }
        }
        m4195W0(m3850d, 0, 0);
        c0662b.f4470a = this.f4459u.mo4615e(m3850d);
        if (this.f4457s == 1) {
            if (m3796K2()) {
                mo4616f = m4169I0() - m4222k();
                m4226o = mo4616f - this.f4459u.mo4616f(m3850d);
            } else {
                m4226o = m4226o();
                mo4616f = this.f4459u.mo4616f(m3850d) + m4226o;
            }
            int i14 = c0663c.f4479f;
            int i15 = c0663c.f4475b;
            if (i14 == -1) {
                i10 = i15;
                int i16 = mo4616f;
                i12 = i15 - c0662b.f4470a;
                i13 = m4226o;
                i11 = i16;
            } else {
                int i17 = mo4616f;
                i13 = m4226o;
                i12 = i15;
                i11 = i17;
                i10 = c0662b.f4470a + i15;
            }
        } else {
            int m4225n = m4225n();
            int mo4616f2 = this.f4459u.mo4616f(m3850d) + m4225n;
            int i18 = c0663c.f4479f;
            int i19 = c0663c.f4475b;
            if (i18 == -1) {
                i13 = i19 - c0662b.f4470a;
                i12 = m4225n;
                i11 = i19;
                i10 = mo4616f2;
            } else {
                i10 = mo4616f2;
                i11 = c0662b.f4470a + i19;
                i12 = m4225n;
                i13 = i19;
            }
        }
        m4193V0(m3850d, i13, i12, i11, i10);
        if (c0686q.m4249k() || c0686q.m4248j()) {
            c0662b.f4472c = true;
        }
        c0662b.f4473d = m3850d.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: N */
    public int mo3798N(RecyclerView.C0668b0 c0668b0) {
        return m3827m2(c0668b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: N0 */
    public boolean mo3799N0() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N2 */
    public final void m3800N2(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0, int i10, int i11) {
        if (!c0668b0.m4016j() || m4217h0() == 0 || c0668b0.m4014h() || !mo2809j2()) {
            return;
        }
        List<RecyclerView.AbstractC0674e0> m4296k = c0692w.m4296k();
        int size = m4296k.size();
        int m4155B0 = m4155B0(m4216g0(0));
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            RecyclerView.AbstractC0674e0 abstractC0674e0 = m4296k.get(i14);
            if (!abstractC0674e0.m4037A()) {
                boolean z10 = (abstractC0674e0.m4068r() < m4155B0) != this.f4462x ? -1 : true;
                int mo4615e = this.f4459u.mo4615e(abstractC0674e0.f4620a);
                if (z10 == -1) {
                    i12 += mo4615e;
                } else {
                    i13 += mo4615e;
                }
            }
        }
        this.f4458t.f4485l = m4296k;
        if (i12 > 0) {
            m3823g3(m4155B0(m3793H2()), i10);
            C0663c c0663c = this.f4458t;
            c0663c.f4481h = i12;
            c0663c.f4476c = 0;
            c0663c.m3847a();
            m3833s2(c0692w, this.f4458t, c0668b0, false);
        }
        if (i13 > 0) {
            m3820e3(m4155B0(m3792G2()), i11);
            C0663c c0663c2 = this.f4458t;
            c0663c2.f4481h = i13;
            c0663c2.f4476c = 0;
            c0663c2.m3847a();
            m3833s2(c0692w, this.f4458t, c0668b0, false);
        }
        this.f4458t.f4485l = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: O */
    public int mo3749O(RecyclerView.C0668b0 c0668b0) {
        return m3828n2(c0668b0);
    }

    /* renamed from: O2 */
    public void mo3750O2(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0, C0661a c0661a, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: P */
    public int mo3751P(RecyclerView.C0668b0 c0668b0) {
        return m3829o2(c0668b0);
    }

    /* renamed from: P2 */
    public final void m3801P2(RecyclerView.C0692w c0692w, C0663c c0663c) {
        if (!c0663c.f4474a || c0663c.f4486m) {
            return;
        }
        int i10 = c0663c.f4480g;
        int i11 = c0663c.f4482i;
        if (c0663c.f4479f == -1) {
            m3804R2(c0692w, i10, i11);
        } else {
            m3805S2(c0692w, i10, i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: Q */
    public int mo3802Q(RecyclerView.C0668b0 c0668b0) {
        return m3827m2(c0668b0);
    }

    /* renamed from: Q2 */
    public final void m3803Q2(RecyclerView.C0692w c0692w, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            for (int i12 = i10; i12 > i11; i12--) {
                m4174K1(i12, c0692w);
            }
        } else {
            while (true) {
                i11--;
                if (i11 < i10) {
                    return;
                } else {
                    m4174K1(i11, c0692w);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: R */
    public int mo3752R(RecyclerView.C0668b0 c0668b0) {
        return m3828n2(c0668b0);
    }

    /* renamed from: R2 */
    public final void m3804R2(RecyclerView.C0692w c0692w, int i10, int i11) {
        int m4217h0 = m4217h0();
        if (i10 < 0) {
            return;
        }
        int mo4618h = (this.f4459u.mo4618h() - i10) + i11;
        if (this.f4462x) {
            for (int i12 = 0; i12 < m4217h0; i12++) {
                View m4216g0 = m4216g0(i12);
                if (this.f4459u.mo4617g(m4216g0) < mo4618h || this.f4459u.mo4627q(m4216g0) < mo4618h) {
                    m3803Q2(c0692w, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = m4217h0 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View m4216g02 = m4216g0(i14);
            if (this.f4459u.mo4617g(m4216g02) < mo4618h || this.f4459u.mo4627q(m4216g02) < mo4618h) {
                m3803Q2(c0692w, i13, i14);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: S */
    public int mo3753S(RecyclerView.C0668b0 c0668b0) {
        return m3829o2(c0668b0);
    }

    /* renamed from: S2 */
    public final void m3805S2(RecyclerView.C0692w c0692w, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int m4217h0 = m4217h0();
        if (!this.f4462x) {
            for (int i13 = 0; i13 < m4217h0; i13++) {
                View m4216g0 = m4216g0(i13);
                if (this.f4459u.mo4614d(m4216g0) > i12 || this.f4459u.mo4626p(m4216g0) > i12) {
                    m3803Q2(c0692w, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = m4217h0 - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View m4216g02 = m4216g0(i15);
            if (this.f4459u.mo4614d(m4216g02) > i12 || this.f4459u.mo4626p(m4216g02) > i12) {
                m3803Q2(c0692w, i14, i15);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: T1 */
    public int mo2766T1(int i10, RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0) {
        if (this.f4457s == 1) {
            return 0;
        }
        return m3808V2(i10, c0692w, c0668b0);
    }

    /* renamed from: T2 */
    public boolean m3806T2() {
        return this.f4459u.mo4621k() == 0 && this.f4459u.mo4618h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: U1 */
    public void mo2769U1(int i10) {
        this.f4449A = i10;
        this.f4450B = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        C0664d c0664d = this.f4452D;
        if (c0664d != null) {
            c0664d.m3854c();
        }
        m4184Q1();
    }

    /* renamed from: U2 */
    public final void m3807U2() {
        this.f4462x = (this.f4457s == 1 || !m3796K2()) ? this.f4461w : !this.f4461w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: V1 */
    public int mo2772V1(int i10, RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0) {
        if (this.f4457s == 0) {
            return 0;
        }
        return m3808V2(i10, c0692w, c0668b0);
    }

    /* renamed from: V2 */
    public int m3808V2(int i10, RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0) {
        if (m4217h0() == 0 || i10 == 0) {
            return 0;
        }
        m3832r2();
        this.f4458t.f4474a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        m3817d3(i11, abs, true, c0668b0);
        C0663c c0663c = this.f4458t;
        int m3833s2 = c0663c.f4480g + m3833s2(c0692w, c0663c, c0668b0, false);
        if (m3833s2 < 0) {
            return 0;
        }
        if (abs > m3833s2) {
            i10 = i11 * m3833s2;
        }
        this.f4459u.mo4628r(-i10);
        this.f4458t.f4484k = i10;
        return i10;
    }

    /* renamed from: W2 */
    public void m3809W2(int i10, int i11) {
        this.f4449A = i10;
        this.f4450B = i11;
        C0664d c0664d = this.f4452D;
        if (c0664d != null) {
            c0664d.m3854c();
        }
        m4184Q1();
    }

    /* renamed from: X2 */
    public void m3810X2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        mo3789D(null);
        if (i10 != this.f4457s || this.f4459u == null) {
            AbstractC0713l m4612b = AbstractC0713l.m4612b(this, i10);
            this.f4459u = m4612b;
            this.f4453E.f4465a = m4612b;
            this.f4457s = i10;
            m4184Q1();
        }
    }

    /* renamed from: Y2 */
    public void m3811Y2(boolean z10) {
        mo3789D(null);
        if (z10 == this.f4461w) {
            return;
        }
        this.f4461w = z10;
        m4184Q1();
    }

    /* renamed from: Z2 */
    public void mo3754Z2(boolean z10) {
        mo3789D(null);
        if (this.f4463y == z10) {
            return;
        }
        this.f4463y = z10;
        m4184Q1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: a0 */
    public View mo3812a0(int i10) {
        int m4217h0 = m4217h0();
        if (m4217h0 == 0) {
            return null;
        }
        int m4155B0 = i10 - m4155B0(m4216g0(0));
        if (m4155B0 >= 0 && m4155B0 < m4217h0) {
            View m4216g0 = m4216g0(m4155B0);
            if (m4155B0(m4216g0) == i10) {
                return m4216g0;
            }
        }
        return super.mo3812a0(i10);
    }

    /* renamed from: a3 */
    public final boolean m3813a3(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0, C0661a c0661a) {
        View mo3746D2;
        if (m4217h0() == 0) {
            return false;
        }
        View m4229t0 = m4229t0();
        if (m4229t0 != null && c0661a.m3844d(m4229t0, c0668b0)) {
            c0661a.m3843c(m4229t0, m4155B0(m4229t0));
            return true;
        }
        boolean z10 = this.f4460v;
        boolean z11 = this.f4463y;
        if (z10 != z11 || (mo3746D2 = mo3746D2(c0692w, c0668b0, c0661a.f4468d, z11)) == null) {
            return false;
        }
        c0661a.m3842b(mo3746D2, m4155B0(mo3746D2));
        if (c0668b0.m4014h() || !mo2809j2()) {
            return true;
        }
        int mo4617g = this.f4459u.mo4617g(mo3746D2);
        int mo4614d = this.f4459u.mo4614d(mo3746D2);
        int mo4623m = this.f4459u.mo4623m();
        int mo4619i = this.f4459u.mo4619i();
        boolean z12 = mo4614d <= mo4623m && mo4617g < mo4623m;
        boolean z13 = false;
        if (mo4617g >= mo4619i) {
            z13 = false;
            if (mo4614d > mo4619i) {
                z13 = true;
            }
        }
        if (!z12 && !z13) {
            return true;
        }
        int i10 = mo4623m;
        if (c0661a.f4468d) {
            i10 = mo4619i;
        }
        c0661a.f4467c = i10;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: b0 */
    public RecyclerView.C0686q mo2786b0() {
        return new RecyclerView.C0686q(-2, -2);
    }

    /* renamed from: b3 */
    public final boolean m3814b3(RecyclerView.C0668b0 c0668b0, C0661a c0661a) {
        int i10;
        boolean z10 = false;
        if (c0668b0.m4014h() || (i10 = this.f4449A) == -1) {
            return false;
        }
        if (i10 < 0 || i10 >= c0668b0.m4009c()) {
            this.f4449A = -1;
            this.f4450B = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            return false;
        }
        c0661a.f4466b = this.f4449A;
        C0664d c0664d = this.f4452D;
        if (c0664d != null && c0664d.m3853b()) {
            boolean z11 = this.f4452D.f4489d;
            c0661a.f4468d = z11;
            c0661a.f4467c = z11 ? this.f4459u.mo4619i() - this.f4452D.f4488c : this.f4459u.mo4623m() + this.f4452D.f4488c;
            return true;
        }
        if (this.f4450B != Integer.MIN_VALUE) {
            boolean z12 = this.f4462x;
            c0661a.f4468d = z12;
            c0661a.f4467c = z12 ? this.f4459u.mo4619i() - this.f4450B : this.f4459u.mo4623m() + this.f4450B;
            return true;
        }
        View mo3812a0 = mo3812a0(this.f4449A);
        if (mo3812a0 == null) {
            if (m4217h0() > 0) {
                if ((this.f4449A < m4155B0(m4216g0(0))) == this.f4462x) {
                    z10 = true;
                }
                c0661a.f4468d = z10;
            }
            c0661a.m3841a();
            return true;
        }
        if (this.f4459u.mo4615e(mo3812a0) > this.f4459u.mo4624n()) {
            c0661a.m3841a();
            return true;
        }
        if (this.f4459u.mo4617g(mo3812a0) - this.f4459u.mo4623m() < 0) {
            c0661a.f4467c = this.f4459u.mo4623m();
            c0661a.f4468d = false;
            return true;
        }
        if (this.f4459u.mo4619i() - this.f4459u.mo4614d(mo3812a0) >= 0) {
            c0661a.f4467c = c0661a.f4468d ? this.f4459u.mo4614d(mo3812a0) + this.f4459u.m4625o() : this.f4459u.mo4617g(mo3812a0);
            return true;
        }
        c0661a.f4467c = this.f4459u.mo4619i();
        c0661a.f4468d = true;
        return true;
    }

    /* renamed from: c3 */
    public final void m3815c3(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0, C0661a c0661a) {
        if (m3814b3(c0668b0, c0661a) || m3813a3(c0692w, c0668b0, c0661a)) {
            return;
        }
        c0661a.m3841a();
        c0661a.f4466b = this.f4463y ? c0668b0.m4009c() - 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0666a0.b
    /* renamed from: d */
    public PointF mo3816d(int i10) {
        if (m4217h0() == 0) {
            return null;
        }
        boolean z10 = false;
        if (i10 < m4155B0(m4216g0(0))) {
            z10 = true;
        }
        int i11 = 1;
        if (z10 != this.f4462x) {
            i11 = -1;
        }
        return this.f4457s == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    /* renamed from: d3 */
    public final void m3817d3(int i10, int i11, boolean z10, RecyclerView.C0668b0 c0668b0) {
        int mo4623m;
        this.f4458t.f4486m = m3806T2();
        this.f4458t.f4479f = i10;
        int[] iArr = this.f4456H;
        boolean z11 = false;
        iArr[0] = 0;
        iArr[1] = 0;
        mo3826k2(c0668b0, iArr);
        int max = Math.max(0, this.f4456H[0]);
        int max2 = Math.max(0, this.f4456H[1]);
        if (i10 == 1) {
            z11 = true;
        }
        C0663c c0663c = this.f4458t;
        int i12 = z11 ? max2 : max;
        c0663c.f4481h = i12;
        if (!z11) {
            max = max2;
        }
        c0663c.f4482i = max;
        if (z11) {
            c0663c.f4481h = i12 + this.f4459u.mo4620j();
            View m3792G2 = m3792G2();
            C0663c c0663c2 = this.f4458t;
            int i13 = 1;
            if (this.f4462x) {
                i13 = -1;
            }
            c0663c2.f4478e = i13;
            int m4155B0 = m4155B0(m3792G2);
            C0663c c0663c3 = this.f4458t;
            c0663c2.f4477d = m4155B0 + c0663c3.f4478e;
            c0663c3.f4475b = this.f4459u.mo4614d(m3792G2);
            mo4623m = this.f4459u.mo4614d(m3792G2) - this.f4459u.mo4619i();
        } else {
            View m3793H2 = m3793H2();
            this.f4458t.f4481h += this.f4459u.mo4623m();
            C0663c c0663c4 = this.f4458t;
            c0663c4.f4478e = this.f4462x ? 1 : -1;
            int m4155B02 = m4155B0(m3793H2);
            C0663c c0663c5 = this.f4458t;
            c0663c4.f4477d = m4155B02 + c0663c5.f4478e;
            c0663c5.f4475b = this.f4459u.mo4617g(m3793H2);
            mo4623m = (-this.f4459u.mo4617g(m3793H2)) + this.f4459u.mo4623m();
        }
        C0663c c0663c6 = this.f4458t;
        c0663c6.f4476c = i11;
        if (z10) {
            c0663c6.f4476c = i11 - mo4623m;
        }
        c0663c6.f4480g = mo4623m;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: e1 */
    public void mo3818e1(RecyclerView recyclerView, RecyclerView.C0692w c0692w) {
        super.mo3818e1(recyclerView, c0692w);
        if (this.f4451C) {
            mo2732H1(c0692w);
            c0692w.m4288c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: e2 */
    public boolean mo3819e2() {
        return (m4231v0() == 1073741824 || m4171J0() == 1073741824 || !m4173K0()) ? false : true;
    }

    /* renamed from: e3 */
    public final void m3820e3(int i10, int i11) {
        this.f4458t.f4476c = this.f4459u.mo4619i() - i11;
        C0663c c0663c = this.f4458t;
        c0663c.f4478e = this.f4462x ? -1 : 1;
        c0663c.f4477d = i10;
        c0663c.f4479f = 1;
        c0663c.f4475b = i11;
        c0663c.f4480g = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: f1 */
    public View mo3756f1(View view, int i10, RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0) {
        int m3830p2;
        m3807U2();
        if (m4217h0() == 0 || (m3830p2 = m3830p2(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        m3832r2();
        m3817d3(m3830p2, (int) (this.f4459u.mo4624n() * 0.33333334f), false, c0668b0);
        C0663c c0663c = this.f4458t;
        c0663c.f4480g = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        c0663c.f4474a = false;
        m3833s2(c0692w, c0663c, c0668b0, true);
        View m3788C2 = m3830p2 == -1 ? m3788C2() : m3787B2();
        View m3793H2 = m3830p2 == -1 ? m3793H2() : m3792G2();
        if (!m3793H2.hasFocusable()) {
            return m3788C2;
        }
        if (m3788C2 == null) {
            return null;
        }
        return m3793H2;
    }

    /* renamed from: f3 */
    public final void m3821f3(C0661a c0661a) {
        m3820e3(c0661a.f4466b, c0661a.f4467c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: g1 */
    public void mo3822g1(AccessibilityEvent accessibilityEvent) {
        super.mo3822g1(accessibilityEvent);
        if (m4217h0() > 0) {
            accessibilityEvent.setFromIndex(m3837w2());
            accessibilityEvent.setToIndex(m3839y2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: g2 */
    public void mo2800g2(RecyclerView recyclerView, RecyclerView.C0668b0 c0668b0, int i10) {
        C0711j c0711j = new C0711j(recyclerView.getContext());
        c0711j.m3999p(i10);
        mo2803h2(c0711j);
    }

    /* renamed from: g3 */
    public final void m3823g3(int i10, int i11) {
        this.f4458t.f4476c = i11 - this.f4459u.mo4623m();
        C0663c c0663c = this.f4458t;
        c0663c.f4477d = i10;
        c0663c.f4478e = this.f4462x ? 1 : -1;
        c0663c.f4479f = -1;
        c0663c.f4475b = i11;
        c0663c.f4480g = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
    }

    /* renamed from: h3 */
    public final void m3824h3(C0661a c0661a) {
        m3823g3(c0661a.f4466b, c0661a.f4467c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.C0707f.h
    /* renamed from: i */
    public void mo3825i(View view, View view2, int i10, int i11) {
        int mo4617g;
        mo3789D("Cannot drop a view during a scroll or layout calculation");
        m3832r2();
        m3807U2();
        int m4155B0 = m4155B0(view);
        int m4155B02 = m4155B0(view2);
        boolean z10 = m4155B0 < m4155B02 ? true : -1;
        if (this.f4462x) {
            if (z10) {
                m3809W2(m4155B02, this.f4459u.mo4619i() - (this.f4459u.mo4617g(view2) + this.f4459u.mo4615e(view)));
                return;
            }
            mo4617g = this.f4459u.mo4619i() - this.f4459u.mo4614d(view2);
        } else {
            if (z10 != -1) {
                m3809W2(m4155B02, this.f4459u.mo4614d(view2) - this.f4459u.mo4615e(view));
                return;
            }
            mo4617g = this.f4459u.mo4617g(view2);
        }
        m3809W2(m4155B02, mo4617g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: j2 */
    public boolean mo2809j2() {
        return this.f4452D == null && this.f4460v == this.f4463y;
    }

    /* renamed from: k2 */
    public void mo3826k2(RecyclerView.C0668b0 c0668b0, int[] iArr) {
        int i10;
        int m3794I2 = m3794I2(c0668b0);
        if (this.f4458t.f4479f == -1) {
            i10 = 0;
        } else {
            i10 = m3794I2;
            m3794I2 = 0;
        }
        iArr[0] = m3794I2;
        iArr[1] = i10;
    }

    /* renamed from: l2 */
    public void mo3760l2(RecyclerView.C0668b0 c0668b0, C0663c c0663c, RecyclerView.AbstractC0685p.c cVar) {
        int i10 = c0663c.f4477d;
        if (i10 < 0 || i10 >= c0668b0.m4009c()) {
            return;
        }
        cVar.mo4245a(i10, Math.max(0, c0663c.f4480g));
    }

    /* renamed from: m2 */
    public final int m3827m2(RecyclerView.C0668b0 c0668b0) {
        if (m4217h0() == 0) {
            return 0;
        }
        m3832r2();
        return C0716o.m4651a(c0668b0, this.f4459u, m3836v2(!this.f4464z, true), m3835u2(!this.f4464z, true), this, this.f4464z);
    }

    /* renamed from: n2 */
    public final int m3828n2(RecyclerView.C0668b0 c0668b0) {
        if (m4217h0() == 0) {
            return 0;
        }
        m3832r2();
        return C0716o.m4652b(c0668b0, this.f4459u, m3836v2(!this.f4464z, true), m3835u2(!this.f4464z, true), this, this.f4464z, this.f4462x);
    }

    /* renamed from: o2 */
    public final int m3829o2(RecyclerView.C0668b0 c0668b0) {
        if (m4217h0() == 0) {
            return 0;
        }
        m3832r2();
        return C0716o.m4653c(c0668b0, this.f4459u, m3836v2(!this.f4464z, true), m3835u2(!this.f4464z, true), this, this.f4464z);
    }

    /* renamed from: p2 */
    public int m3830p2(int i10) {
        int i11 = -1;
        if (i10 == 1) {
            return (this.f4457s != 1 && m3796K2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f4457s != 1 && m3796K2()) ? -1 : 1;
        }
        if (i10 == 17) {
            if (this.f4457s != 0) {
                i11 = Integer.MIN_VALUE;
            }
            return i11;
        }
        if (i10 == 33) {
            if (this.f4457s != 1) {
                i11 = Integer.MIN_VALUE;
            }
            return i11;
        }
        if (i10 == 66) {
            return this.f4457s == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i10 != 130) {
            return NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        }
        return this.f4457s == 1 ? 1 : Integer.MIN_VALUE;
    }

    /* renamed from: q2 */
    public C0663c m3831q2() {
        return new C0663c();
    }

    /* renamed from: r2 */
    public void m3832r2() {
        if (this.f4458t == null) {
            this.f4458t = m3831q2();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        if (r9.m4014h() == false) goto L24;
     */
    /* renamed from: s2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m3833s2(androidx.recyclerview.widget.RecyclerView.C0692w r7, androidx.recyclerview.widget.LinearLayoutManager.C0663c r8, androidx.recyclerview.widget.RecyclerView.C0668b0 r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.m3833s2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.RecyclerView$b0, boolean):int");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: t1 */
    public void mo2852t1(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0) {
        int i10;
        int i11;
        int i12;
        int i13;
        int m3790E2;
        int mo4617g;
        int i14;
        int i15 = -1;
        if (!(this.f4452D == null && this.f4449A == -1) && c0668b0.m4009c() == 0) {
            mo2732H1(c0692w);
            return;
        }
        C0664d c0664d = this.f4452D;
        if (c0664d != null && c0664d.m3853b()) {
            this.f4449A = this.f4452D.f4487b;
        }
        m3832r2();
        this.f4458t.f4474a = false;
        m3807U2();
        View m4229t0 = m4229t0();
        C0661a c0661a = this.f4453E;
        if (!c0661a.f4469e || this.f4449A != -1 || this.f4452D != null) {
            c0661a.m3845e();
            C0661a c0661a2 = this.f4453E;
            c0661a2.f4468d = this.f4462x ^ this.f4463y;
            m3815c3(c0692w, c0668b0, c0661a2);
            this.f4453E.f4469e = true;
        } else if (m4229t0 != null && (this.f4459u.mo4617g(m4229t0) >= this.f4459u.mo4619i() || this.f4459u.mo4614d(m4229t0) <= this.f4459u.mo4623m())) {
            this.f4453E.m3843c(m4229t0, m4155B0(m4229t0));
        }
        C0663c c0663c = this.f4458t;
        c0663c.f4479f = c0663c.f4484k >= 0 ? 1 : -1;
        int[] iArr = this.f4456H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo3826k2(c0668b0, iArr);
        int max = Math.max(0, this.f4456H[0]) + this.f4459u.mo4623m();
        int max2 = Math.max(0, this.f4456H[1]) + this.f4459u.mo4620j();
        int i16 = max;
        int i17 = max2;
        if (c0668b0.m4014h()) {
            int i18 = this.f4449A;
            i16 = max;
            i17 = max2;
            if (i18 != -1) {
                i16 = max;
                i17 = max2;
                if (this.f4450B != Integer.MIN_VALUE) {
                    View mo3812a0 = mo3812a0(i18);
                    i16 = max;
                    i17 = max2;
                    if (mo3812a0 != null) {
                        if (this.f4462x) {
                            i14 = this.f4459u.mo4619i() - this.f4459u.mo4614d(mo3812a0);
                            mo4617g = this.f4450B;
                        } else {
                            mo4617g = this.f4459u.mo4617g(mo3812a0) - this.f4459u.mo4623m();
                            i14 = this.f4450B;
                        }
                        int i19 = i14 - mo4617g;
                        if (i19 > 0) {
                            i16 = max + i19;
                            i17 = max2;
                        } else {
                            i17 = max2 - i19;
                            i16 = max;
                        }
                    }
                }
            }
        }
        C0661a c0661a3 = this.f4453E;
        if (!c0661a3.f4468d ? !this.f4462x : this.f4462x) {
            i15 = 1;
        }
        mo3750O2(c0692w, c0668b0, c0661a3, i15);
        m4188T(c0692w);
        this.f4458t.f4486m = m3806T2();
        this.f4458t.f4483j = c0668b0.m4014h();
        this.f4458t.f4482i = 0;
        C0661a c0661a4 = this.f4453E;
        if (c0661a4.f4468d) {
            m3824h3(c0661a4);
            C0663c c0663c2 = this.f4458t;
            c0663c2.f4481h = i16;
            m3833s2(c0692w, c0663c2, c0668b0, false);
            C0663c c0663c3 = this.f4458t;
            int i20 = c0663c3.f4475b;
            int i21 = c0663c3.f4477d;
            int i22 = c0663c3.f4476c;
            int i23 = i17;
            if (i22 > 0) {
                i23 = i17 + i22;
            }
            m3821f3(this.f4453E);
            C0663c c0663c4 = this.f4458t;
            c0663c4.f4481h = i23;
            c0663c4.f4477d += c0663c4.f4478e;
            m3833s2(c0692w, c0663c4, c0668b0, false);
            C0663c c0663c5 = this.f4458t;
            int i24 = c0663c5.f4475b;
            int i25 = c0663c5.f4476c;
            i10 = i20;
            i11 = i24;
            if (i25 > 0) {
                m3823g3(i21, i20);
                C0663c c0663c6 = this.f4458t;
                c0663c6.f4481h = i25;
                m3833s2(c0692w, c0663c6, c0668b0, false);
                i10 = this.f4458t.f4475b;
                i11 = i24;
            }
        } else {
            m3821f3(c0661a4);
            C0663c c0663c7 = this.f4458t;
            c0663c7.f4481h = i17;
            m3833s2(c0692w, c0663c7, c0668b0, false);
            C0663c c0663c8 = this.f4458t;
            int i26 = c0663c8.f4475b;
            int i27 = c0663c8.f4477d;
            int i28 = c0663c8.f4476c;
            int i29 = i16;
            if (i28 > 0) {
                i29 = i16 + i28;
            }
            m3824h3(this.f4453E);
            C0663c c0663c9 = this.f4458t;
            c0663c9.f4481h = i29;
            c0663c9.f4477d += c0663c9.f4478e;
            m3833s2(c0692w, c0663c9, c0668b0, false);
            C0663c c0663c10 = this.f4458t;
            int i30 = c0663c10.f4475b;
            int i31 = c0663c10.f4476c;
            i10 = i30;
            i11 = i26;
            if (i31 > 0) {
                m3820e3(i27, i26);
                C0663c c0663c11 = this.f4458t;
                c0663c11.f4481h = i31;
                m3833s2(c0692w, c0663c11, c0668b0, false);
                i11 = this.f4458t.f4475b;
                i10 = i30;
            }
        }
        int i32 = i10;
        int i33 = i11;
        if (m4217h0() > 0) {
            if (this.f4462x ^ this.f4463y) {
                int m3790E22 = m3790E2(i11, c0692w, c0668b0, true);
                i12 = i10 + m3790E22;
                i13 = i11 + m3790E22;
                m3790E2 = m3791F2(i12, c0692w, c0668b0, false);
            } else {
                int m3791F2 = m3791F2(i10, c0692w, c0668b0, true);
                i12 = i10 + m3791F2;
                i13 = i11 + m3791F2;
                m3790E2 = m3790E2(i13, c0692w, c0668b0, false);
            }
            i32 = i12 + m3790E2;
            i33 = i13 + m3790E2;
        }
        m3800N2(c0692w, c0668b0, i32, i33);
        if (c0668b0.m4014h()) {
            this.f4453E.m3845e();
        } else {
            this.f4459u.m4629s();
        }
        this.f4460v = this.f4463y;
    }

    /* renamed from: t2 */
    public final View m3834t2() {
        return m3840z2(0, m4217h0());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: u1 */
    public void mo2856u1(RecyclerView.C0668b0 c0668b0) {
        super.mo2856u1(c0668b0);
        this.f4452D = null;
        this.f4449A = -1;
        this.f4450B = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        this.f4453E.m3845e();
    }

    /* renamed from: u2 */
    public View m3835u2(boolean z10, boolean z11) {
        int m4217h0;
        int i10;
        if (this.f4462x) {
            m4217h0 = 0;
            i10 = m4217h0();
        } else {
            m4217h0 = m4217h0() - 1;
            i10 = -1;
        }
        return m3786A2(m4217h0, i10, z10, z11);
    }

    /* renamed from: v2 */
    public View m3836v2(boolean z10, boolean z11) {
        int i10;
        int m4217h0;
        if (this.f4462x) {
            i10 = m4217h0() - 1;
            m4217h0 = -1;
        } else {
            i10 = 0;
            m4217h0 = m4217h0();
        }
        return m3786A2(i10, m4217h0, z10, z11);
    }

    /* renamed from: w2 */
    public int m3837w2() {
        View m3786A2 = m3786A2(0, m4217h0(), false, true);
        return m3786A2 == null ? -1 : m4155B0(m3786A2);
    }

    /* renamed from: x2 */
    public final View m3838x2() {
        return m3840z2(m4217h0() - 1, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: y1 */
    public void mo2871y1(Parcelable parcelable) {
        if (parcelable instanceof C0664d) {
            C0664d c0664d = (C0664d) parcelable;
            this.f4452D = c0664d;
            if (this.f4449A != -1) {
                c0664d.m3854c();
            }
            m4184Q1();
        }
    }

    /* renamed from: y2 */
    public int m3839y2() {
        int i10 = -1;
        View m3786A2 = m3786A2(m4217h0() - 1, -1, false, true);
        if (m3786A2 != null) {
            i10 = m4155B0(m3786A2);
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: z1 */
    public Parcelable mo2875z1() {
        if (this.f4452D != null) {
            return new C0664d(this.f4452D);
        }
        C0664d c0664d = new C0664d();
        if (m4217h0() > 0) {
            m3832r2();
            boolean z10 = this.f4460v ^ this.f4462x;
            c0664d.f4489d = z10;
            if (z10) {
                View m3792G2 = m3792G2();
                c0664d.f4488c = this.f4459u.mo4619i() - this.f4459u.mo4614d(m3792G2);
                c0664d.f4487b = m4155B0(m3792G2);
            } else {
                View m3793H2 = m3793H2();
                c0664d.f4487b = m4155B0(m3793H2);
                c0664d.f4488c = this.f4459u.mo4617g(m3793H2) - this.f4459u.mo4623m();
            }
        } else {
            c0664d.m3854c();
        }
        return c0664d;
    }

    /* renamed from: z2 */
    public View m3840z2(int i10, int i11) {
        int i12;
        int i13;
        m3832r2();
        if (!(i11 > i10 ? true : i11 < i10 ? -1 : false)) {
            return m4216g0(i10);
        }
        if (this.f4459u.mo4617g(m4216g0(i10)) < this.f4459u.mo4623m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return (this.f4457s == 0 ? this.f4659e : this.f4660f).m4676a(i10, i11, i12, i13);
    }
}
