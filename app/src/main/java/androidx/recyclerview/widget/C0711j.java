package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.services.p045s3.internal.Constants;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/j.class
 */
/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/j.class */
public class C0711j extends RecyclerView.AbstractC0666a0 {

    /* renamed from: k */
    public PointF f4944k;

    /* renamed from: l */
    public final DisplayMetrics f4945l;

    /* renamed from: n */
    public float f4947n;

    /* renamed from: i */
    public final LinearInterpolator f4942i = new LinearInterpolator();

    /* renamed from: j */
    public final DecelerateInterpolator f4943j = new DecelerateInterpolator();

    /* renamed from: m */
    public boolean f4946m = false;

    /* renamed from: o */
    public int f4948o = 0;

    /* renamed from: p */
    public int f4949p = 0;

    public C0711j(Context context) {
        this.f4945l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: A */
    public final float m4596A() {
        if (!this.f4946m) {
            this.f4947n = mo4601v(this.f4945l);
            this.f4946m = true;
        }
        return this.f4947n;
    }

    /* renamed from: B */
    public int m4597B() {
        int i10;
        PointF pointF = this.f4944k;
        if (pointF != null) {
            float f10 = pointF.y;
            if (f10 != 0.0f) {
                i10 = f10 > 0.0f ? 1 : -1;
                return i10;
            }
        }
        i10 = 0;
        return i10;
    }

    /* renamed from: C */
    public void mo2901C(RecyclerView.AbstractC0666a0.a aVar) {
        PointF mo2879a = mo2879a(m3991f());
        if (mo2879a == null || (mo2879a.x == 0.0f && mo2879a.y == 0.0f)) {
            aVar.m4003b(m3991f());
            m4001r();
            return;
        }
        m3994i(mo2879a);
        this.f4944k = mo2879a;
        this.f4948o = (int) (mo2879a.x * 10000.0f);
        this.f4949p = (int) (mo2879a.y * 10000.0f);
        aVar.m4005d((int) (this.f4948o * 1.2f), (int) (this.f4949p * 1.2f), (int) (mo2883x(Constants.MAXIMUM_UPLOAD_PARTS) * 1.2f), this.f4942i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0666a0
    /* renamed from: l */
    public void mo3997l(int i10, int i11, RecyclerView.C0668b0 c0668b0, RecyclerView.AbstractC0666a0.a aVar) {
        if (m3988c() == 0) {
            m4001r();
            return;
        }
        this.f4948o = m4603y(this.f4948o, i10);
        int m4603y = m4603y(this.f4949p, i11);
        this.f4949p = m4603y;
        if (this.f4948o == 0 && m4603y == 0) {
            mo2901C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0666a0
    /* renamed from: m */
    public void mo3998m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0666a0
    /* renamed from: n */
    public void mo2881n() {
        this.f4949p = 0;
        this.f4948o = 0;
        this.f4944k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0666a0
    /* renamed from: o */
    public void mo2882o(View view, RecyclerView.C0668b0 c0668b0, RecyclerView.AbstractC0666a0.a aVar) {
        int m4599t = m4599t(view, m4604z());
        int m4600u = m4600u(view, m4597B());
        int m4602w = m4602w((int) Math.sqrt((m4599t * m4599t) + (m4600u * m4600u)));
        if (m4602w > 0) {
            aVar.m4005d(-m4599t, -m4600u, m4602w, this.f4943j);
        }
    }

    /* renamed from: s */
    public int m4598s(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    /* renamed from: t */
    public int m4599t(View view, int i10) {
        RecyclerView.AbstractC0685p m3990e = m3990e();
        if (m3990e == null || !m3990e.mo2731H()) {
            return 0;
        }
        RecyclerView.C0686q c0686q = (RecyclerView.C0686q) view.getLayoutParams();
        return m4598s(m3990e.mo2830o0(view) - ((ViewGroup.MarginLayoutParams) c0686q).leftMargin, m3990e.mo2843r0(view) + ((ViewGroup.MarginLayoutParams) c0686q).rightMargin, m3990e.m4226o(), m3990e.m4169I0() - m3990e.m4222k(), i10);
    }

    /* renamed from: u */
    public int m4600u(View view, int i10) {
        RecyclerView.AbstractC0685p m3990e = m3990e();
        if (m3990e == null || !m3990e.mo2736I()) {
            return 0;
        }
        RecyclerView.C0686q c0686q = (RecyclerView.C0686q) view.getLayoutParams();
        return m4598s(m3990e.mo2848s0(view) - ((ViewGroup.MarginLayoutParams) c0686q).topMargin, m3990e.mo2820m0(view) + ((ViewGroup.MarginLayoutParams) c0686q).bottomMargin, m3990e.m4225n(), m3990e.m4230u0() - m3990e.m4206a(), i10);
    }

    /* renamed from: v */
    public float mo4601v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* renamed from: w */
    public int m4602w(int i10) {
        return (int) Math.ceil(mo2883x(i10) / 0.3356d);
    }

    /* renamed from: x */
    public int mo2883x(int i10) {
        return (int) Math.ceil(Math.abs(i10) * m4596A());
    }

    /* renamed from: y */
    public final int m4603y(int i10, int i11) {
        int i12 = i10 - i11;
        if (i10 * i12 <= 0) {
            return 0;
        }
        return i12;
    }

    /* renamed from: z */
    public int m4604z() {
        int i10;
        PointF pointF = this.f4944k;
        if (pointF != null) {
            float f10 = pointF.x;
            if (f10 != 0.0f) {
                i10 = f10 > 0.0f ? 1 : -1;
                return i10;
            }
        }
        i10 = 0;
        return i10;
    }
}
