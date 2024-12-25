package mbanje.kurt.fabbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import java.util.List;
import mbanje.kurt.fabbutton.CircleImageView;
import org.achartengine.renderer.DefaultRenderer;
import p154ii.C5262a;
import p154ii.C5263b;
import p154ii.C5264c;
import p154ii.C5265d;
import p154ii.C5266e;
import p154ii.C5267f;
import p235o0.C6824g0;
import p235o0.InterfaceC6866z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:mbanje/kurt/fabbutton/FabButton.class
 */
@CoordinatorLayout.InterfaceC0382d(Behavior.class)
/* loaded from: combined.jar:classes2.jar:mbanje/kurt/fabbutton/FabButton.class */
public class FabButton extends FrameLayout implements CircleImageView.InterfaceC6547b {

    /* renamed from: b */
    public CircleImageView f34235b;

    /* renamed from: c */
    public ProgressRingView f34236c;

    /* renamed from: d */
    public float f34237d;

    /* renamed from: e */
    public boolean f34238e;

    /* renamed from: f */
    public boolean f34239f;

    /* renamed from: g */
    public int f34240g;

    /* renamed from: h */
    public boolean f34241h;

    /* renamed from: i */
    public boolean f34242i;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mbanje/kurt/fabbutton/FabButton$Behavior.class
     */
    /* loaded from: combined.jar:classes2.jar:mbanje/kurt/fabbutton/FabButton$Behavior.class */
    public static class Behavior extends CoordinatorLayout.AbstractC0381c<FabButton> {

        /* renamed from: a */
        public Rect f34243a;

        /* renamed from: b */
        public boolean f34244b;

        /* renamed from: c */
        public float f34245c;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:mbanje/kurt/fabbutton/FabButton$Behavior$a.class
         */
        /* renamed from: mbanje.kurt.fabbutton.FabButton$Behavior$a */
        /* loaded from: combined.jar:classes2.jar:mbanje/kurt/fabbutton/FabButton$Behavior$a.class */
        public class C6548a implements InterfaceC6866z0 {

            /* renamed from: a */
            public final Behavior f34246a;

            public C6548a(Behavior behavior) {
                this.f34246a = behavior;
            }

            @Override // p235o0.InterfaceC6866z0
            /* renamed from: a */
            public void mo1238a(View view) {
                this.f34246a.f34244b = false;
            }

            @Override // p235o0.InterfaceC6866z0
            /* renamed from: b */
            public void mo1239b(View view) {
                this.f34246a.f34244b = false;
                view.setVisibility(8);
            }

            @Override // p235o0.InterfaceC6866z0
            /* renamed from: c */
            public void mo1240c(View view) {
                this.f34246a.f34244b = true;
            }
        }

        /* renamed from: F */
        public final void m30208F(FabButton fabButton) {
            fabButton.setVisibility(0);
            C6824g0.m31514d(fabButton).m31674d(1.0f).m31675e(1.0f).m31671a(1.0f).m31677g(C5262a.f30183b).m31684n().m31678h(null).m31682l();
        }

        /* renamed from: G */
        public final void m30209G(FabButton fabButton) {
            C6824g0.m31514d(fabButton).m31674d(0.0f).m31675e(0.0f).m31671a(0.0f).m31677g(C5262a.f30183b).m31684n().m31678h(new C6548a(this)).m31682l();
        }

        /* renamed from: H */
        public final float m30210H(CoordinatorLayout coordinatorLayout, FabButton fabButton) {
            List<View> m1805s = coordinatorLayout.m1805s(fabButton);
            int size = m1805s.size();
            float f10 = 0.0f;
            int i10 = 0;
            while (i10 < size) {
                View view = m1805s.get(i10);
                float f11 = f10;
                if (view instanceof Snackbar$SnackbarLayout) {
                    f11 = f10;
                    if (coordinatorLayout.m1799h(fabButton, view)) {
                        f11 = Math.min(f10, C6824g0.m31493M(view) - view.getHeight());
                    }
                }
                i10++;
                f10 = f11;
            }
            return f10;
        }

        /* renamed from: I */
        public final int m30211I(AppBarLayout appBarLayout) {
            int m31475D = C6824g0.m31475D(appBarLayout);
            int i10 = 0;
            if (m31475D != 0) {
                return (m31475D * 2) + 0;
            }
            int childCount = appBarLayout.getChildCount();
            if (childCount >= 1) {
                i10 = 0 + (C6824g0.m31475D(appBarLayout.getChildAt(childCount - 1)) * 2);
            }
            return i10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0381c
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public boolean mo1822e(CoordinatorLayout coordinatorLayout, FabButton fabButton, View view) {
            return view instanceof Snackbar$SnackbarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0381c
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public boolean mo1825h(CoordinatorLayout coordinatorLayout, FabButton fabButton, View view) {
            if (view instanceof Snackbar$SnackbarLayout) {
                m30214L(coordinatorLayout, fabButton, view);
                return false;
            }
            if (!(view instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f34243a == null) {
                this.f34243a = new Rect();
            }
            Rect rect = this.f34243a;
            C5267f.m26328a(coordinatorLayout, view, rect);
            if (rect.bottom > m30211I(appBarLayout)) {
                if (fabButton.getVisibility() == 0) {
                    return false;
                }
                m30208F(fabButton);
                return false;
            }
            if (this.f34244b || fabButton.getVisibility() != 0) {
                return false;
            }
            m30209G(fabButton);
            return false;
        }

        /* renamed from: L */
        public final void m30214L(CoordinatorLayout coordinatorLayout, FabButton fabButton, View view) {
            float m30210H = m30210H(coordinatorLayout, fabButton);
            if (m30210H != this.f34245c) {
                C6824g0.m31514d(fabButton).m31672b();
                if (Math.abs(m30210H - this.f34245c) == view.getHeight()) {
                    C6824g0.m31514d(fabButton).m31683m(m30210H).m31677g(C5262a.f30183b).m31678h(null);
                } else {
                    C6824g0.m31484H0(fabButton, m30210H);
                }
                this.f34245c = m30210H;
            }
        }
    }

    public FabButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34237d = 0.14f;
        m30204c(context, attributeSet, 0);
    }

    @Override // mbanje.kurt.fabbutton.CircleImageView.InterfaceC6547b
    /* renamed from: a */
    public void mo30202a() {
        this.f34235b.m30200h(this.f34241h, this.f34242i);
        if (this.f34242i) {
            this.f34236c.setVisibility(8);
        }
    }

    @Override // mbanje.kurt.fabbutton.CircleImageView.InterfaceC6547b
    /* renamed from: b */
    public void mo30203b(boolean z10) {
        if (z10) {
            this.f34236c.setVisibility(0);
            this.f34236c.m30219e();
        } else {
            this.f34236c.m30220f(true);
            this.f34236c.setVisibility(8);
        }
    }

    /* renamed from: c */
    public void m30204c(Context context, AttributeSet attributeSet, int i10) {
        int i11;
        float f10;
        int i12;
        View inflate = View.inflate(context, C5265d.f30188a, this);
        setClipChildren(false);
        this.f34235b = (CircleImageView) inflate.findViewById(C5264c.f30186a);
        this.f34236c = (ProgressRingView) inflate.findViewById(C5264c.f30187b);
        this.f34235b.setFabViewListener(this);
        this.f34236c.setFabViewListener(this);
        float f11 = 0.0f;
        int i13 = -16777216;
        int i14 = 4000;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5266e.f30275z);
            i13 = obtainStyledAttributes.getColor(C5266e.f30205I, DefaultRenderer.BACKGROUND_COLOR);
            i11 = obtainStyledAttributes.getColor(C5266e.f30211M, DefaultRenderer.BACKGROUND_COLOR);
            f11 = obtainStyledAttributes.getFloat(C5266e.f30193C, 0.0f);
            f10 = obtainStyledAttributes.getFloat(C5266e.f30191B, 100.0f);
            this.f34238e = obtainStyledAttributes.getBoolean(C5266e.f30195D, false);
            this.f34239f = obtainStyledAttributes.getBoolean(C5266e.f30207J, true);
            i14 = obtainStyledAttributes.getInteger(C5266e.f30197E, 4000);
            i12 = obtainStyledAttributes.getResourceId(C5266e.f30189A, -1);
            this.f34237d = obtainStyledAttributes.getFloat(C5266e.f30212N, this.f34237d);
            this.f34240g = obtainStyledAttributes.getResourceId(C5266e.f30209K, C5263b.f30185a);
            this.f34241h = obtainStyledAttributes.getBoolean(C5266e.f30213O, false);
            this.f34242i = obtainStyledAttributes.getBoolean(C5266e.f30210L, false);
            this.f34235b.setShowShadow(obtainStyledAttributes.getBoolean(C5266e.f30214P, true));
            obtainStyledAttributes.recycle();
        } else {
            i11 = -16777216;
            f10 = 0.0f;
            i12 = -1;
        }
        this.f34235b.setColor(i13);
        this.f34235b.setShowEndBitmap(this.f34241h);
        this.f34235b.setRingWidthRatio(this.f34237d);
        this.f34236c.setProgressColor(i11);
        this.f34236c.setProgress(f11);
        this.f34236c.setMaxProgress(f10);
        this.f34236c.setAutostartanim(this.f34239f);
        this.f34236c.setAnimDuration(i14);
        this.f34236c.setRingWidthRatio(this.f34237d);
        this.f34236c.setIndeterminate(this.f34238e);
        if (i12 != -1) {
            this.f34235b.m30198f(i12, this.f34240g);
        }
    }

    /* renamed from: d */
    public void m30205d(boolean z10) {
        this.f34235b.m30201i(z10);
    }

    /* renamed from: e */
    public void m30206e(boolean z10) {
        this.f34235b.setShowShadow(z10);
        invalidate();
    }

    public void setColor(int i10) {
        this.f34235b.setColor(i10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f34235b.setEnabled(z10);
        this.f34236c.setEnabled(z10);
    }

    public void setIndeterminate(boolean z10) {
        this.f34238e = z10;
        this.f34236c.setIndeterminate(z10);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f34236c.setOnClickListener(onClickListener);
        this.f34235b.setOnClickListener(onClickListener);
    }

    public void setProgress(float f10) {
        this.f34236c.setProgress(f10);
    }

    public void setProgressColor(int i10) {
        this.f34236c.setProgressColor(i10);
    }

    public void setShadow(boolean z10) {
        this.f34235b.setShowShadow(z10);
    }
}
