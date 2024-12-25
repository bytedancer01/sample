package androidx.leanback.widget;

import android.animation.TimeAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import org.apache.commons.net.ftp.FTPReply;
import p413y0.C9792e;
import p413y0.C9793f;
import p432z0.C10028a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/h.class
 */
/* renamed from: androidx.leanback.widget.h */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/h.class */
public class C0514h {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/h$a.class
     */
    /* renamed from: androidx.leanback.widget.h$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/h$a.class */
    public static class a implements InterfaceC0511g {

        /* renamed from: a */
        public int f3442a;

        /* renamed from: b */
        public final boolean f3443b;

        public a(int i10, boolean z10) {
            if (!C0514h.m2636b(i10)) {
                throw new IllegalArgumentException("Unhandled zoom index");
            }
            this.f3442a = i10;
            this.f3443b = z10;
        }

        @Override // androidx.leanback.widget.InterfaceC0511g
        /* renamed from: a */
        public void mo2598a(View view, boolean z10) {
            view.setSelected(z10);
            m2638c(view).m2640a(z10, false);
        }

        @Override // androidx.leanback.widget.InterfaceC0511g
        /* renamed from: b */
        public void mo2599b(View view) {
            m2638c(view).m2640a(false, true);
        }

        /* renamed from: c */
        public final b m2638c(View view) {
            int i10 = C9793f.f44989k;
            b bVar = (b) view.getTag(i10);
            b bVar2 = bVar;
            if (bVar == null) {
                bVar2 = new b(view, m2639d(view.getResources()), this.f3443b, FTPReply.FILE_STATUS_OK);
                view.setTag(i10, bVar2);
            }
            return bVar2;
        }

        /* renamed from: d */
        public final float m2639d(Resources resources) {
            int i10 = this.f3442a;
            return i10 == 0 ? 1.0f : resources.getFraction(C0514h.m2635a(i10), 1, 1);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/h$b.class
     */
    /* renamed from: androidx.leanback.widget.h$b */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/h$b.class */
    public static class b implements TimeAnimator.TimeListener {

        /* renamed from: a */
        public final View f3444a;

        /* renamed from: b */
        public final int f3445b;

        /* renamed from: c */
        public final C0543u0 f3446c;

        /* renamed from: d */
        public final float f3447d;

        /* renamed from: e */
        public float f3448e = 0.0f;

        /* renamed from: f */
        public float f3449f;

        /* renamed from: g */
        public float f3450g;

        /* renamed from: h */
        public final TimeAnimator f3451h;

        /* renamed from: i */
        public final Interpolator f3452i;

        /* renamed from: j */
        public final C10028a f3453j;

        public b(View view, float f10, boolean z10, int i10) {
            TimeAnimator timeAnimator = new TimeAnimator();
            this.f3451h = timeAnimator;
            this.f3452i = new AccelerateDecelerateInterpolator();
            this.f3444a = view;
            this.f3445b = i10;
            this.f3447d = f10 - 1.0f;
            if (view instanceof C0543u0) {
                this.f3446c = (C0543u0) view;
            } else {
                this.f3446c = null;
            }
            timeAnimator.setTimeListener(this);
            if (z10) {
                this.f3453j = C10028a.m42178a(view.getContext());
            } else {
                this.f3453j = null;
            }
        }

        /* renamed from: a */
        public void m2640a(boolean z10, boolean z11) {
            m2641b();
            float f10 = z10 ? 1.0f : 0.0f;
            if (z11) {
                m2642c(f10);
                return;
            }
            float f11 = this.f3448e;
            if (f11 != f10) {
                this.f3449f = f11;
                this.f3450g = f10 - f11;
                this.f3451h.start();
            }
        }

        /* renamed from: b */
        public void m2641b() {
            this.f3451h.end();
        }

        /* renamed from: c */
        public void m2642c(float f10) {
            this.f3448e = f10;
            float f11 = (this.f3447d * f10) + 1.0f;
            this.f3444a.setScaleX(f11);
            this.f3444a.setScaleY(f11);
            C0543u0 c0543u0 = this.f3446c;
            if (c0543u0 != null) {
                c0543u0.setShadowFocusLevel(f10);
            } else {
                C0545v0.m3032i(this.f3444a, f10);
            }
            C10028a c10028a = this.f3453j;
            if (c10028a != null) {
                c10028a.m42180c(f10);
                int color = this.f3453j.m42179b().getColor();
                C0543u0 c0543u02 = this.f3446c;
                if (c0543u02 != null) {
                    c0543u02.setOverlayColor(color);
                } else {
                    C0545v0.m3031h(this.f3444a, color);
                }
            }
        }

        @Override // android.animation.TimeAnimator.TimeListener
        public void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
            float f10;
            int i10 = this.f3445b;
            if (j10 >= i10) {
                f10 = 1.0f;
                this.f3451h.end();
            } else {
                f10 = (float) (j10 / i10);
            }
            Interpolator interpolator = this.f3452i;
            float f11 = f10;
            if (interpolator != null) {
                f11 = interpolator.getInterpolation(f10);
            }
            m2642c(this.f3449f + (f11 * this.f3450g));
        }
    }

    /* renamed from: a */
    public static int m2635a(int i10) {
        if (i10 == 1) {
            return C9792e.f44968d;
        }
        if (i10 == 2) {
            return C9792e.f44967c;
        }
        if (i10 == 3) {
            return C9792e.f44966b;
        }
        if (i10 != 4) {
            return 0;
        }
        return C9792e.f44969e;
    }

    /* renamed from: b */
    public static boolean m2636b(int i10) {
        return i10 == 0 || m2635a(i10) > 0;
    }

    /* renamed from: c */
    public static void m2637c(C0542u c0542u, int i10, boolean z10) {
        c0542u.m3014n0(new a(i10, z10));
    }
}
