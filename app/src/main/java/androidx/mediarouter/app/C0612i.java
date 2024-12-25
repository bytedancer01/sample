package androidx.mediarouter.app;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ProgressBar;
import p029c.C0920a;
import p050d0.C4290b;
import p068e.C4561b;
import p087f0.C4738a;
import p106g0.C4917c;
import p192l1.C5645a;
import p192l1.C5647c;
import p192l1.C5649e;
import p192l1.C5655k;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/mediarouter/app/i.class
 */
/* renamed from: androidx.mediarouter.app.i */
/* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/i.class */
public final class C0612i {

    /* renamed from: a */
    public static final int f4144a = C5647c.f31795g;

    /* renamed from: a */
    public static Context m3407a(Context context) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, m3418l(context));
        int m3422p = m3422p(contextThemeWrapper, C5645a.f31786h);
        ContextThemeWrapper contextThemeWrapper2 = contextThemeWrapper;
        if (m3422p != 0) {
            contextThemeWrapper2 = new ContextThemeWrapper(contextThemeWrapper, m3422p);
        }
        return contextThemeWrapper2;
    }

    /* renamed from: b */
    public static Context m3408b(Context context, int i10, boolean z10) {
        int i11 = i10;
        if (i10 == 0) {
            i11 = m3422p(context, !z10 ? C0920a.f6086A : C0920a.f6120o);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i11);
        ContextThemeWrapper contextThemeWrapper2 = contextThemeWrapper;
        if (m3422p(contextThemeWrapper, C5645a.f31786h) != 0) {
            contextThemeWrapper2 = new ContextThemeWrapper(contextThemeWrapper, m3418l(contextThemeWrapper));
        }
        return contextThemeWrapper2;
    }

    /* renamed from: c */
    public static int m3409c(Context context) {
        int m3422p = m3422p(context, C5645a.f31786h);
        int i10 = m3422p;
        if (m3422p == 0) {
            i10 = m3418l(context);
        }
        return i10;
    }

    /* renamed from: d */
    public static int m3410d(Context context) {
        int m3421o = m3421o(context, 0, C0920a.f6129x);
        return C4738a.m23964c(m3421o, m3421o(context, 0, R.attr.colorBackground)) < 3.0d ? m3421o(context, 0, C0920a.f6124s) : m3421o;
    }

    /* renamed from: e */
    public static Drawable m3411e(Context context) {
        return m3416j(context, C5649e.f31805a);
    }

    /* renamed from: f */
    public static int m3412f(Context context, int i10) {
        return C4738a.m23964c(-1, m3421o(context, i10, C0920a.f6129x)) >= 3.0d ? -1 : -570425344;
    }

    /* renamed from: g */
    public static Drawable m3413g(Context context) {
        return m3415i(context, C5645a.f31780b);
    }

    /* renamed from: h */
    public static float m3414h(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true) ? typedValue.getFloat() : 0.5f;
    }

    /* renamed from: i */
    public static Drawable m3415i(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i10});
        Drawable m24854r = C4917c.m24854r(C4561b.m22999d(context, obtainStyledAttributes.getResourceId(0, 0)));
        if (m3424r(context)) {
            C4917c.m24850n(m24854r, C4290b.m21724c(context, f4144a));
        }
        obtainStyledAttributes.recycle();
        return m24854r;
    }

    /* renamed from: j */
    public static Drawable m3416j(Context context, int i10) {
        Drawable m24854r = C4917c.m24854r(C4561b.m22999d(context, i10));
        if (m3424r(context)) {
            C4917c.m24850n(m24854r, C4290b.m21724c(context, f4144a));
        }
        return m24854r;
    }

    /* renamed from: k */
    public static Drawable m3417k(Context context) {
        return m3416j(context, C5649e.f31806b);
    }

    /* renamed from: l */
    public static int m3418l(Context context) {
        boolean m3424r = m3424r(context);
        int m3412f = m3412f(context, 0);
        return m3424r ? m3412f == -570425344 ? C5655k.f31900b : C5655k.f31902d : m3412f == -570425344 ? C5655k.f31901c : C5655k.f31899a;
    }

    /* renamed from: m */
    public static Drawable m3419m(Context context) {
        return m3415i(context, C5645a.f31784f);
    }

    /* renamed from: n */
    public static Drawable m3420n(Context context) {
        return m3415i(context, C5645a.f31783e);
    }

    /* renamed from: o */
    public static int m3421o(Context context, int i10, int i11) {
        if (i10 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, new int[]{i11});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i11, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    /* renamed from: p */
    public static int m3422p(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(i10, typedValue, true) ? typedValue.resourceId : 0;
    }

    /* renamed from: q */
    public static Drawable m3423q(Context context) {
        return m3415i(context, C5645a.f31787i);
    }

    /* renamed from: r */
    public static boolean m3424r(Context context) {
        TypedValue typedValue = new TypedValue();
        boolean z10 = true;
        if (!context.getTheme().resolveAttribute(C0920a.f6091F, typedValue, true) || typedValue.data == 0) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: s */
    public static void m3425s(Context context, Dialog dialog) {
        dialog.getWindow().getDecorView().setBackgroundColor(C4290b.m21724c(context, m3424r(context) ? C5647c.f31794f : C5647c.f31793e));
    }

    /* renamed from: t */
    public static void m3426t(Context context, ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar.getIndeterminateDrawable().setColorFilter(C4290b.m21724c(context, m3424r(context) ? C5647c.f31792d : C5647c.f31791c), PorterDuff.Mode.SRC_IN);
        }
    }

    /* renamed from: u */
    public static void m3427u(Context context, View view, View view2, boolean z10) {
        int m3421o = m3421o(context, 0, C0920a.f6129x);
        int m3421o2 = m3421o(context, 0, C0920a.f6130y);
        int i10 = m3421o;
        int i11 = m3421o2;
        if (z10) {
            i10 = m3421o;
            i11 = m3421o2;
            if (m3412f(context, 0) == -570425344) {
                i11 = m3421o;
                i10 = -1;
            }
        }
        view.setBackgroundColor(i10);
        view2.setBackgroundColor(i11);
        view.setTag(Integer.valueOf(i10));
        view2.setTag(Integer.valueOf(i11));
    }

    /* renamed from: v */
    public static void m3428v(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        int m21724c;
        int i10;
        if (m3424r(context)) {
            m21724c = C4290b.m21724c(context, C5647c.f31792d);
            i10 = C5647c.f31790b;
        } else {
            m21724c = C4290b.m21724c(context, C5647c.f31791c);
            i10 = C5647c.f31789a;
        }
        mediaRouteVolumeSlider.m3258b(m21724c, C4290b.m21724c(context, i10));
    }

    /* renamed from: w */
    public static void m3429w(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int m3412f = m3412f(context, 0);
        int i10 = m3412f;
        if (Color.alpha(m3412f) != 255) {
            i10 = C4738a.m23970i(m3412f, ((Integer) view.getTag()).intValue());
        }
        mediaRouteVolumeSlider.m3257a(i10);
    }
}
