package androidx.leanback.widget;

import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.AbstractC0519j0;
import p413y0.C9792e;
import p413y0.C9793f;
import p413y0.C9795h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/q0.class
 */
/* renamed from: androidx.leanback.widget.q0 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/q0.class */
public class C0535q0 extends AbstractC0519j0 {

    /* renamed from: b */
    public final int f3570b;

    /* renamed from: c */
    public final Paint f3571c;

    /* renamed from: d */
    public boolean f3572d;

    /* renamed from: e */
    public final boolean f3573e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/q0$a.class
     */
    /* renamed from: androidx.leanback.widget.q0$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/q0$a.class */
    public static class a extends AbstractC0519j0.a {

        /* renamed from: c */
        public float f3574c;

        /* renamed from: d */
        public int f3575d;

        /* renamed from: e */
        public float f3576e;

        /* renamed from: f */
        public RowHeaderView f3577f;

        /* renamed from: g */
        public TextView f3578g;

        public a(View view) {
            super(view);
            this.f3577f = (RowHeaderView) view.findViewById(C9793f.f45003y);
            this.f3578g = (TextView) view.findViewById(C9793f.f45004z);
            m2939a();
        }

        /* renamed from: a */
        public void m2939a() {
            RowHeaderView rowHeaderView = this.f3577f;
            if (rowHeaderView != null) {
                this.f3575d = rowHeaderView.getCurrentTextColor();
            }
            this.f3576e = this.f3459a.getResources().getFraction(C9792e.f44965a, 1, 1);
        }
    }

    public C0535q0() {
        this(C9795h.f45017h);
    }

    public C0535q0(int i10) {
        this(i10, true);
    }

    public C0535q0(int i10, boolean z10) {
        this.f3571c = new Paint(1);
        this.f3570b = i10;
        this.f3573e = z10;
    }

    /* renamed from: i */
    public static float m2934i(TextView textView, Paint paint) {
        if (paint.getTextSize() != textView.getTextSize()) {
            paint.setTextSize(textView.getTextSize());
        }
        if (paint.getTypeface() != textView.getTypeface()) {
            paint.setTypeface(textView.getTypeface());
        }
        return paint.descent();
    }

    @Override // androidx.leanback.widget.AbstractC0519j0
    /* renamed from: b */
    public void mo2652b(AbstractC0519j0.a aVar, Object obj) {
        if (obj != null) {
            ((C0529o0) obj).m2913a();
        }
        a aVar2 = (a) aVar;
        RowHeaderView rowHeaderView = aVar2.f3577f;
        if (rowHeaderView != null) {
            rowHeaderView.setText((CharSequence) null);
        }
        TextView textView = aVar2.f3578g;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        aVar.f3459a.setContentDescription(null);
        if (this.f3572d) {
            aVar.f3459a.setVisibility(8);
        }
    }

    @Override // androidx.leanback.widget.AbstractC0519j0
    /* renamed from: e */
    public AbstractC0519j0.a mo2654e(ViewGroup viewGroup) {
        a aVar = new a(LayoutInflater.from(viewGroup.getContext()).inflate(this.f3570b, viewGroup, false));
        if (this.f3573e) {
            m2938m(aVar, 0.0f);
        }
        return aVar;
    }

    @Override // androidx.leanback.widget.AbstractC0519j0
    /* renamed from: f */
    public void mo2655f(AbstractC0519j0.a aVar) {
        a aVar2 = (a) aVar;
        RowHeaderView rowHeaderView = aVar2.f3577f;
        if (rowHeaderView != null) {
            rowHeaderView.setText((CharSequence) null);
        }
        TextView textView = aVar2.f3578g;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        if (this.f3573e) {
            m2938m(aVar2, 0.0f);
        }
    }

    /* renamed from: j */
    public int m2935j(a aVar) {
        int paddingBottom = aVar.f3459a.getPaddingBottom();
        View view = aVar.f3459a;
        int i10 = paddingBottom;
        if (view instanceof TextView) {
            i10 = paddingBottom + ((int) m2934i((TextView) view, this.f3571c));
        }
        return i10;
    }

    /* renamed from: k */
    public void m2936k(a aVar) {
        if (this.f3573e) {
            View view = aVar.f3459a;
            float f10 = aVar.f3576e;
            view.setAlpha(f10 + (aVar.f3574c * (1.0f - f10)));
        }
    }

    /* renamed from: l */
    public void m2937l(boolean z10) {
        this.f3572d = z10;
    }

    /* renamed from: m */
    public final void m2938m(a aVar, float f10) {
        aVar.f3574c = f10;
        m2936k(aVar);
    }
}
