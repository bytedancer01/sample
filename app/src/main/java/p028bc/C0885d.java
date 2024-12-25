package p028bc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import bb.C0871a;
import bb.C0872b;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import p012ab.C0144d;
import p012ab.C0146f;
import p235o0.C6824g0;
import p314s0.C8513u;
import p351ub.C9148c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:bc/d.class
 */
/* renamed from: bc.d */
/* loaded from: combined.jar:classes2.jar:bc/d.class */
public final class C0885d {

    /* renamed from: a */
    public final Context f5980a;

    /* renamed from: b */
    public final TextInputLayout f5981b;

    /* renamed from: c */
    public LinearLayout f5982c;

    /* renamed from: d */
    public int f5983d;

    /* renamed from: e */
    public FrameLayout f5984e;

    /* renamed from: f */
    public Animator f5985f;

    /* renamed from: g */
    public final float f5986g;

    /* renamed from: h */
    public int f5987h;

    /* renamed from: i */
    public int f5988i;

    /* renamed from: j */
    public CharSequence f5989j;

    /* renamed from: k */
    public boolean f5990k;

    /* renamed from: l */
    public TextView f5991l;

    /* renamed from: m */
    public CharSequence f5992m;

    /* renamed from: n */
    public int f5993n;

    /* renamed from: o */
    public ColorStateList f5994o;

    /* renamed from: p */
    public CharSequence f5995p;

    /* renamed from: q */
    public boolean f5996q;

    /* renamed from: r */
    public TextView f5997r;

    /* renamed from: s */
    public int f5998s;

    /* renamed from: t */
    public ColorStateList f5999t;

    /* renamed from: u */
    public Typeface f6000u;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:bc/d$a.class
     */
    /* renamed from: bc.d$a */
    /* loaded from: combined.jar:classes2.jar:bc/d$a.class */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final int f6001b;

        /* renamed from: c */
        public final TextView f6002c;

        /* renamed from: d */
        public final int f6003d;

        /* renamed from: e */
        public final TextView f6004e;

        /* renamed from: f */
        public final C0885d f6005f;

        public a(C0885d c0885d, int i10, TextView textView, int i11, TextView textView2) {
            this.f6005f = c0885d;
            this.f6001b = i10;
            this.f6002c = textView;
            this.f6003d = i11;
            this.f6004e = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6005f.f5987h = this.f6001b;
            this.f6005f.f5985f = null;
            TextView textView = this.f6002c;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f6003d == 1 && this.f6005f.f5991l != null) {
                    this.f6005f.f5991l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f6004e;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f6004e.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f6004e;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C0885d(TextInputLayout textInputLayout) {
        this.f5980a = textInputLayout.getContext();
        this.f5981b = textInputLayout;
        this.f5986g = r0.getResources().getDimensionPixelSize(C0144d.f711j);
    }

    /* renamed from: A */
    public final void m5484A(int i10, int i11) {
        TextView m5507l;
        TextView m5507l2;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (m5507l2 = m5507l(i11)) != null) {
            m5507l2.setVisibility(0);
            m5507l2.setAlpha(1.0f);
        }
        if (i10 != 0 && (m5507l = m5507l(i10)) != null) {
            m5507l.setVisibility(4);
            if (i10 == 1) {
                m5507l.setText((CharSequence) null);
            }
        }
        this.f5987h = i11;
    }

    /* renamed from: B */
    public void m5485B(CharSequence charSequence) {
        this.f5992m = charSequence;
        TextView textView = this.f5991l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* renamed from: C */
    public void m5486C(boolean z10) {
        if (this.f5990k == z10) {
            return;
        }
        m5502g();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f5980a);
            this.f5991l = appCompatTextView;
            appCompatTextView.setId(C0146f.f746L);
            this.f5991l.setTextAlignment(5);
            Typeface typeface = this.f6000u;
            if (typeface != null) {
                this.f5991l.setTypeface(typeface);
            }
            m5487D(this.f5993n);
            m5488E(this.f5994o);
            m5485B(this.f5992m);
            this.f5991l.setVisibility(4);
            C6824g0.m31543r0(this.f5991l, 1);
            m5499d(this.f5991l, 0);
        } else {
            m5515t();
            m5521z(this.f5991l, 0);
            this.f5991l = null;
            this.f5981b.m14080r0();
            this.f5981b.m14032E0();
        }
        this.f5990k = z10;
    }

    /* renamed from: D */
    public void m5487D(int i10) {
        this.f5993n = i10;
        TextView textView = this.f5991l;
        if (textView != null) {
            this.f5981b.m14055e0(textView, i10);
        }
    }

    /* renamed from: E */
    public void m5488E(ColorStateList colorStateList) {
        this.f5994o = colorStateList;
        TextView textView = this.f5991l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* renamed from: F */
    public void m5489F(int i10) {
        this.f5998s = i10;
        TextView textView = this.f5997r;
        if (textView != null) {
            C8513u.m36723o(textView, i10);
        }
    }

    /* renamed from: G */
    public void m5490G(boolean z10) {
        if (this.f5996q == z10) {
            return;
        }
        m5502g();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f5980a);
            this.f5997r = appCompatTextView;
            appCompatTextView.setId(C0146f.f747M);
            this.f5997r.setTextAlignment(5);
            Typeface typeface = this.f6000u;
            if (typeface != null) {
                this.f5997r.setTypeface(typeface);
            }
            this.f5997r.setVisibility(4);
            C6824g0.m31543r0(this.f5997r, 1);
            m5489F(this.f5998s);
            m5491H(this.f5999t);
            m5499d(this.f5997r, 1);
        } else {
            m5516u();
            m5521z(this.f5997r, 1);
            this.f5997r = null;
            this.f5981b.m14080r0();
            this.f5981b.m14032E0();
        }
        this.f5996q = z10;
    }

    /* renamed from: H */
    public void m5491H(ColorStateList colorStateList) {
        this.f5999t = colorStateList;
        TextView textView = this.f5997r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* renamed from: I */
    public final void m5492I(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: J */
    public void m5493J(Typeface typeface) {
        if (typeface != this.f6000u) {
            this.f6000u = typeface;
            m5492I(this.f5991l, typeface);
            m5492I(this.f5997r, typeface);
        }
    }

    /* renamed from: K */
    public final void m5494K(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: L */
    public final boolean m5495L(TextView textView, CharSequence charSequence) {
        return C6824g0.m31502U(this.f5981b) && this.f5981b.isEnabled() && !(this.f5988i == this.f5987h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: M */
    public void m5496M(CharSequence charSequence) {
        m5502g();
        this.f5989j = charSequence;
        this.f5991l.setText(charSequence);
        int i10 = this.f5987h;
        if (i10 != 1) {
            this.f5988i = 1;
        }
        m5498O(i10, this.f5988i, m5495L(this.f5991l, charSequence));
    }

    /* renamed from: N */
    public void m5497N(CharSequence charSequence) {
        m5502g();
        this.f5995p = charSequence;
        this.f5997r.setText(charSequence);
        int i10 = this.f5987h;
        if (i10 != 2) {
            this.f5988i = 2;
        }
        m5498O(i10, this.f5988i, m5495L(this.f5997r, charSequence));
    }

    /* renamed from: O */
    public final void m5498O(int i10, int i11, boolean z10) {
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f5985f = animatorSet;
            ArrayList arrayList = new ArrayList();
            m5503h(arrayList, this.f5996q, this.f5997r, 2, i10, i11);
            m5503h(arrayList, this.f5990k, this.f5991l, 1, i10, i11);
            C0872b.m5439a(animatorSet, arrayList);
            animatorSet.addListener(new a(this, i11, m5507l(i10), i10, m5507l(i11)));
            animatorSet.start();
        } else {
            m5484A(i10, i11);
        }
        this.f5981b.m14080r0();
        this.f5981b.m14086u0(z10);
        this.f5981b.m14032E0();
    }

    /* renamed from: d */
    public void m5499d(TextView textView, int i10) {
        if (this.f5982c == null && this.f5984e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f5980a);
            this.f5982c = linearLayout;
            linearLayout.setOrientation(0);
            this.f5981b.addView(this.f5982c, -1, -2);
            this.f5984e = new FrameLayout(this.f5980a);
            this.f5982c.addView(this.f5984e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f5981b.getEditText() != null) {
                m5500e();
            }
        }
        if (m5518w(i10)) {
            this.f5984e.setVisibility(0);
            this.f5984e.addView(textView);
        } else {
            this.f5982c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f5982c.setVisibility(0);
        this.f5983d++;
    }

    /* renamed from: e */
    public void m5500e() {
        if (m5501f()) {
            EditText editText = this.f5981b.getEditText();
            boolean m38482g = C9148c.m38482g(this.f5980a);
            LinearLayout linearLayout = this.f5982c;
            int i10 = C0144d.f722u;
            C6824g0.m31472B0(linearLayout, m5514s(m38482g, i10, C6824g0.m31485I(editText)), m5514s(m38482g, C0144d.f723v, this.f5980a.getResources().getDimensionPixelSize(C0144d.f721t)), m5514s(m38482g, i10, C6824g0.m31483H(editText)), 0);
        }
    }

    /* renamed from: f */
    public final boolean m5501f() {
        return (this.f5982c == null || this.f5981b.getEditText() == null) ? false : true;
    }

    /* renamed from: g */
    public void m5502g() {
        Animator animator = this.f5985f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: h */
    public final void m5503h(List<Animator> list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            list.add(m5504i(textView, i12 == i10));
            if (i12 == i10) {
                list.add(m5505j(textView));
            }
        }
    }

    /* renamed from: i */
    public final ObjectAnimator m5504i(TextView textView, boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(C0871a.f5951a);
        return ofFloat;
    }

    /* renamed from: j */
    public final ObjectAnimator m5505j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f5986g, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(C0871a.f5954d);
        return ofFloat;
    }

    /* renamed from: k */
    public boolean m5506k() {
        return m5517v(this.f5988i);
    }

    /* renamed from: l */
    public final TextView m5507l(int i10) {
        if (i10 == 1) {
            return this.f5991l;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f5997r;
    }

    /* renamed from: m */
    public CharSequence m5508m() {
        return this.f5992m;
    }

    /* renamed from: n */
    public CharSequence m5509n() {
        return this.f5989j;
    }

    /* renamed from: o */
    public int m5510o() {
        TextView textView = this.f5991l;
        return textView != null ? textView.getCurrentTextColor() : -1;
    }

    /* renamed from: p */
    public ColorStateList m5511p() {
        TextView textView = this.f5991l;
        return textView != null ? textView.getTextColors() : null;
    }

    /* renamed from: q */
    public CharSequence m5512q() {
        return this.f5995p;
    }

    /* renamed from: r */
    public int m5513r() {
        TextView textView = this.f5997r;
        return textView != null ? textView.getCurrentTextColor() : -1;
    }

    /* renamed from: s */
    public final int m5514s(boolean z10, int i10, int i11) {
        if (z10) {
            i11 = this.f5980a.getResources().getDimensionPixelSize(i10);
        }
        return i11;
    }

    /* renamed from: t */
    public void m5515t() {
        this.f5989j = null;
        m5502g();
        if (this.f5987h == 1) {
            this.f5988i = (!this.f5996q || TextUtils.isEmpty(this.f5995p)) ? 0 : 2;
        }
        m5498O(this.f5987h, this.f5988i, m5495L(this.f5991l, null));
    }

    /* renamed from: u */
    public void m5516u() {
        m5502g();
        int i10 = this.f5987h;
        if (i10 == 2) {
            this.f5988i = 0;
        }
        m5498O(i10, this.f5988i, m5495L(this.f5997r, null));
    }

    /* renamed from: v */
    public final boolean m5517v(int i10) {
        boolean z10 = true;
        if (i10 != 1 || this.f5991l == null || TextUtils.isEmpty(this.f5989j)) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: w */
    public boolean m5518w(int i10) {
        boolean z10 = true;
        if (i10 != 0) {
            z10 = i10 == 1;
        }
        return z10;
    }

    /* renamed from: x */
    public boolean m5519x() {
        return this.f5990k;
    }

    /* renamed from: y */
    public boolean m5520y() {
        return this.f5996q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r7 != null) goto L11;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m5521z(android.widget.TextView r5, int r6) {
        /*
            r4 = this;
            r0 = r4
            android.widget.LinearLayout r0 = r0.f5982c
            if (r0 != 0) goto L8
            return
        L8:
            r0 = r4
            r1 = r6
            boolean r0 = r0.m5518w(r1)
            if (r0 == 0) goto L1c
            r0 = r4
            android.widget.FrameLayout r0 = r0.f5984e
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L1c
            goto L21
        L1c:
            r0 = r4
            android.widget.LinearLayout r0 = r0.f5982c
            r7 = r0
        L21:
            r0 = r7
            r1 = r5
            r0.removeView(r1)
            r0 = r4
            int r0 = r0.f5983d
            r1 = 1
            int r0 = r0 - r1
            r6 = r0
            r0 = r4
            r1 = r6
            r0.f5983d = r1
            r0 = r4
            r1 = r4
            android.widget.LinearLayout r1 = r1.f5982c
            r2 = r6
            r0.m5494K(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p028bc.C0885d.m5521z(android.widget.TextView, int):void");
    }
}
