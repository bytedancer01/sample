package p286qb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.C2509a;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import p012ab.C0143c;
import p050d0.C4290b;
import p221n0.C6616h;
import p369vb.C9333b;
import p385wb.InterfaceC9559b;
import p404xb.C9712g;
import p404xb.C9716k;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qb/b.class
 */
/* renamed from: qb.b */
/* loaded from: combined.jar:classes2.jar:qb/b.class */
public class C7875b extends C2509a {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qb/b$a.class
     */
    /* renamed from: qb.b$a */
    /* loaded from: combined.jar:classes2.jar:qb/b$a.class */
    public static class a extends C9712g {
        public a(C9716k c9716k) {
            super(c9716k);
        }

        @Override // p404xb.C9712g, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public C7875b(FloatingActionButton floatingActionButton, InterfaceC9559b interfaceC9559b) {
        super(floatingActionButton, interfaceC9559b);
    }

    @Override // com.google.android.material.floatingactionbutton.C2509a
    /* renamed from: B */
    public void mo13838B() {
        m13869e0();
    }

    @Override // com.google.android.material.floatingactionbutton.C2509a
    /* renamed from: D */
    public void mo13840D(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f10 = 0.0f;
            if (this.f15385y.isEnabled()) {
                this.f15385y.setElevation(this.f15368h);
                if (this.f15385y.isPressed()) {
                    floatingActionButton = this.f15385y;
                    f10 = this.f15370j;
                } else if (this.f15385y.isFocused() || this.f15385y.isHovered()) {
                    floatingActionButton = this.f15385y;
                    f10 = this.f15369i;
                }
                floatingActionButton.setTranslationZ(f10);
            }
            this.f15385y.setElevation(0.0f);
            floatingActionButton = this.f15385y;
            floatingActionButton.setTranslationZ(f10);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C2509a
    /* renamed from: E */
    public void mo13841E(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21) {
            this.f15385y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C2509a.f15350G, m34152i0(f10, f12));
            stateListAnimator.addState(C2509a.f15351H, m34152i0(f10, f11));
            stateListAnimator.addState(C2509a.f15352I, m34152i0(f10, f11));
            stateListAnimator.addState(C2509a.f15353J, m34152i0(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f15385y, "elevation", f10).setDuration(0L));
            if (i10 >= 22 && i10 <= 24) {
                FloatingActionButton floatingActionButton = this.f15385y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f15385y, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C2509a.f15349F);
            stateListAnimator.addState(C2509a.f15354K, animatorSet);
            stateListAnimator.addState(C2509a.f15355L, m34152i0(0.0f, 0.0f));
            this.f15385y.setStateListAnimator(stateListAnimator);
        }
        if (mo13861Y()) {
            m13869e0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C2509a
    /* renamed from: J */
    public boolean mo13846J() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.C2509a
    /* renamed from: U */
    public void mo13857U(ColorStateList colorStateList) {
        Drawable drawable = this.f15363c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C9333b.m39330d(colorStateList));
        } else {
            super.mo13857U(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C2509a
    /* renamed from: Y */
    public boolean mo13861Y() {
        return this.f15386z.mo13831c() || !m13863a0();
    }

    @Override // com.google.android.material.floatingactionbutton.C2509a
    /* renamed from: c0 */
    public void mo13865c0() {
    }

    /* renamed from: h0 */
    public C7874a m34151h0(int i10, ColorStateList colorStateList) {
        Context context = this.f15385y.getContext();
        C7874a c7874a = new C7874a((C9716k) C6616h.m30527e(this.f15361a));
        c7874a.m34149e(C4290b.m21724c(context, C0143c.f671e), C4290b.m21724c(context, C0143c.f670d), C4290b.m21724c(context, C0143c.f668b), C4290b.m21724c(context, C0143c.f669c));
        c7874a.m34148d(i10);
        c7874a.m34147c(colorStateList);
        return c7874a;
    }

    /* renamed from: i0 */
    public final Animator m34152i0(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f15385y, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f15385y, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(C2509a.f15349F);
        return animatorSet;
    }

    /* renamed from: j0 */
    public C9712g m34153j0() {
        return new a((C9716k) C6616h.m30527e(this.f15361a));
    }

    @Override // com.google.android.material.floatingactionbutton.C2509a
    /* renamed from: m */
    public float mo13879m() {
        return this.f15385y.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.C2509a
    /* renamed from: r */
    public void mo13884r(Rect rect) {
        if (this.f15386z.mo13831c()) {
            super.mo13884r(rect);
        } else {
            int sizeDimension = !m13863a0() ? (this.f15371k - this.f15385y.getSizeDimension()) / 2 : 0;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C2509a
    /* renamed from: w */
    public void mo13889w(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable drawable;
        C9712g m34153j0 = m34153j0();
        this.f15362b = m34153j0;
        m34153j0.setTintList(colorStateList);
        if (mode != null) {
            this.f15362b.setTintMode(mode);
        }
        this.f15362b.m40831M(this.f15385y.getContext());
        if (i10 > 0) {
            this.f15364d = m34151h0(i10, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) C6616h.m30527e(this.f15364d), (Drawable) C6616h.m30527e(this.f15362b)});
        } else {
            this.f15364d = null;
            drawable = this.f15362b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C9333b.m39330d(colorStateList2), drawable, null);
        this.f15363c = rippleDrawable;
        this.f15365e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.C2509a
    /* renamed from: z */
    public void mo13892z() {
    }
}
