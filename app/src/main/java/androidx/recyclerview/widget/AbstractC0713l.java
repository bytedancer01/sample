package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.apache.http.impl.auth.NTLMEngineImpl;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/l.class
 */
/* renamed from: androidx.recyclerview.widget.l */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/l.class */
public abstract class AbstractC0713l {

    /* renamed from: a */
    public final RecyclerView.AbstractC0685p f4951a;

    /* renamed from: b */
    public int f4952b;

    /* renamed from: c */
    public final Rect f4953c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/l$a.class
     */
    /* renamed from: androidx.recyclerview.widget.l$a */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/l$a.class */
    public class a extends AbstractC0713l {
        public a(RecyclerView.AbstractC0685p abstractC0685p) {
            super(abstractC0685p, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: d */
        public int mo4614d(View view) {
            return this.f4951a.mo2843r0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0686q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: e */
        public int mo4615e(View view) {
            RecyclerView.C0686q c0686q = (RecyclerView.C0686q) view.getLayoutParams();
            return this.f4951a.m4228q0(view) + ((ViewGroup.MarginLayoutParams) c0686q).leftMargin + ((ViewGroup.MarginLayoutParams) c0686q).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: f */
        public int mo4616f(View view) {
            RecyclerView.C0686q c0686q = (RecyclerView.C0686q) view.getLayoutParams();
            return this.f4951a.m4227p0(view) + ((ViewGroup.MarginLayoutParams) c0686q).topMargin + ((ViewGroup.MarginLayoutParams) c0686q).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: g */
        public int mo4617g(View view) {
            return this.f4951a.mo2830o0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0686q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: h */
        public int mo4618h() {
            return this.f4951a.m4169I0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: i */
        public int mo4619i() {
            return this.f4951a.m4169I0() - this.f4951a.m4222k();
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: j */
        public int mo4620j() {
            return this.f4951a.m4222k();
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: k */
        public int mo4621k() {
            return this.f4951a.m4171J0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: l */
        public int mo4622l() {
            return this.f4951a.m4231v0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: m */
        public int mo4623m() {
            return this.f4951a.m4226o();
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: n */
        public int mo4624n() {
            return (this.f4951a.m4169I0() - this.f4951a.m4226o()) - this.f4951a.m4222k();
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: p */
        public int mo4626p(View view) {
            this.f4951a.m4168H0(view, true, this.f4953c);
            return this.f4953c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: q */
        public int mo4627q(View view) {
            this.f4951a.m4168H0(view, true, this.f4953c);
            return this.f4953c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: r */
        public void mo4628r(int i10) {
            this.f4951a.mo4201Y0(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/l$b.class
     */
    /* renamed from: androidx.recyclerview.widget.l$b */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/l$b.class */
    public class b extends AbstractC0713l {
        public b(RecyclerView.AbstractC0685p abstractC0685p) {
            super(abstractC0685p, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: d */
        public int mo4614d(View view) {
            return this.f4951a.mo2820m0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0686q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: e */
        public int mo4615e(View view) {
            RecyclerView.C0686q c0686q = (RecyclerView.C0686q) view.getLayoutParams();
            return this.f4951a.m4227p0(view) + ((ViewGroup.MarginLayoutParams) c0686q).topMargin + ((ViewGroup.MarginLayoutParams) c0686q).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: f */
        public int mo4616f(View view) {
            RecyclerView.C0686q c0686q = (RecyclerView.C0686q) view.getLayoutParams();
            return this.f4951a.m4228q0(view) + ((ViewGroup.MarginLayoutParams) c0686q).leftMargin + ((ViewGroup.MarginLayoutParams) c0686q).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: g */
        public int mo4617g(View view) {
            return this.f4951a.mo2848s0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0686q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: h */
        public int mo4618h() {
            return this.f4951a.m4230u0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: i */
        public int mo4619i() {
            return this.f4951a.m4230u0() - this.f4951a.m4206a();
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: j */
        public int mo4620j() {
            return this.f4951a.m4206a();
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: k */
        public int mo4621k() {
            return this.f4951a.m4231v0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: l */
        public int mo4622l() {
            return this.f4951a.m4171J0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: m */
        public int mo4623m() {
            return this.f4951a.m4225n();
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: n */
        public int mo4624n() {
            return (this.f4951a.m4230u0() - this.f4951a.m4225n()) - this.f4951a.m4206a();
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: p */
        public int mo4626p(View view) {
            this.f4951a.m4168H0(view, true, this.f4953c);
            return this.f4953c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: q */
        public int mo4627q(View view) {
            this.f4951a.m4168H0(view, true, this.f4953c);
            return this.f4953c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC0713l
        /* renamed from: r */
        public void mo4628r(int i10) {
            this.f4951a.mo4204Z0(i10);
        }
    }

    public AbstractC0713l(RecyclerView.AbstractC0685p abstractC0685p) {
        this.f4952b = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        this.f4953c = new Rect();
        this.f4951a = abstractC0685p;
    }

    public /* synthetic */ AbstractC0713l(RecyclerView.AbstractC0685p abstractC0685p, a aVar) {
        this(abstractC0685p);
    }

    /* renamed from: a */
    public static AbstractC0713l m4611a(RecyclerView.AbstractC0685p abstractC0685p) {
        return new a(abstractC0685p);
    }

    /* renamed from: b */
    public static AbstractC0713l m4612b(RecyclerView.AbstractC0685p abstractC0685p, int i10) {
        if (i10 == 0) {
            return m4611a(abstractC0685p);
        }
        if (i10 == 1) {
            return m4613c(abstractC0685p);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static AbstractC0713l m4613c(RecyclerView.AbstractC0685p abstractC0685p) {
        return new b(abstractC0685p);
    }

    /* renamed from: d */
    public abstract int mo4614d(View view);

    /* renamed from: e */
    public abstract int mo4615e(View view);

    /* renamed from: f */
    public abstract int mo4616f(View view);

    /* renamed from: g */
    public abstract int mo4617g(View view);

    /* renamed from: h */
    public abstract int mo4618h();

    /* renamed from: i */
    public abstract int mo4619i();

    /* renamed from: j */
    public abstract int mo4620j();

    /* renamed from: k */
    public abstract int mo4621k();

    /* renamed from: l */
    public abstract int mo4622l();

    /* renamed from: m */
    public abstract int mo4623m();

    /* renamed from: n */
    public abstract int mo4624n();

    /* renamed from: o */
    public int m4625o() {
        return Integer.MIN_VALUE == this.f4952b ? 0 : mo4624n() - this.f4952b;
    }

    /* renamed from: p */
    public abstract int mo4626p(View view);

    /* renamed from: q */
    public abstract int mo4627q(View view);

    /* renamed from: r */
    public abstract void mo4628r(int i10);

    /* renamed from: s */
    public void m4629s() {
        this.f4952b = mo4624n();
    }
}
