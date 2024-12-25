package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/mediarouter/app/OverlayListView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/OverlayListView.class */
final class OverlayListView extends ListView {

    /* renamed from: b */
    public final List<C0603a> f3869b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/OverlayListView$a.class
     */
    /* renamed from: androidx.mediarouter.app.OverlayListView$a */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/OverlayListView$a.class */
    public static class C0603a {

        /* renamed from: a */
        public BitmapDrawable f3870a;

        /* renamed from: c */
        public Rect f3872c;

        /* renamed from: d */
        public Interpolator f3873d;

        /* renamed from: e */
        public long f3874e;

        /* renamed from: f */
        public Rect f3875f;

        /* renamed from: g */
        public int f3876g;

        /* renamed from: j */
        public long f3879j;

        /* renamed from: k */
        public boolean f3880k;

        /* renamed from: l */
        public boolean f3881l;

        /* renamed from: m */
        public a f3882m;

        /* renamed from: b */
        public float f3871b = 1.0f;

        /* renamed from: h */
        public float f3877h = 1.0f;

        /* renamed from: i */
        public float f3878i = 1.0f;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/mediarouter/app/OverlayListView$a$a.class
         */
        /* renamed from: androidx.mediarouter.app.OverlayListView$a$a */
        /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/OverlayListView$a$a.class */
        public interface a {
            /* renamed from: a */
            void mo3273a();
        }

        public C0603a(BitmapDrawable bitmapDrawable, Rect rect) {
            this.f3870a = bitmapDrawable;
            this.f3875f = rect;
            this.f3872c = new Rect(rect);
            BitmapDrawable bitmapDrawable2 = this.f3870a;
            if (bitmapDrawable2 != null) {
                bitmapDrawable2.setAlpha((int) (this.f3871b * 255.0f));
                this.f3870a.setBounds(this.f3872c);
            }
        }

        /* renamed from: a */
        public BitmapDrawable m3263a() {
            return this.f3870a;
        }

        /* renamed from: b */
        public boolean m3264b() {
            return this.f3880k;
        }

        /* renamed from: c */
        public C0603a m3265c(float f10, float f11) {
            this.f3877h = f10;
            this.f3878i = f11;
            return this;
        }

        /* renamed from: d */
        public C0603a m3266d(a aVar) {
            this.f3882m = aVar;
            return this;
        }

        /* renamed from: e */
        public C0603a m3267e(long j10) {
            this.f3874e = j10;
            return this;
        }

        /* renamed from: f */
        public C0603a m3268f(Interpolator interpolator) {
            this.f3873d = interpolator;
            return this;
        }

        /* renamed from: g */
        public C0603a m3269g(int i10) {
            this.f3876g = i10;
            return this;
        }

        /* renamed from: h */
        public void m3270h(long j10) {
            this.f3879j = j10;
            this.f3880k = true;
        }

        /* renamed from: i */
        public void m3271i() {
            this.f3880k = true;
            this.f3881l = true;
            a aVar = this.f3882m;
            if (aVar != null) {
                aVar.mo3273a();
            }
        }

        /* renamed from: j */
        public boolean m3272j(long j10) {
            if (this.f3881l) {
                return false;
            }
            float f10 = 0.0f;
            float max = Math.max(0.0f, Math.min(1.0f, (j10 - this.f3879j) / this.f3874e));
            if (this.f3880k) {
                f10 = max;
            }
            Interpolator interpolator = this.f3873d;
            float interpolation = interpolator == null ? f10 : interpolator.getInterpolation(f10);
            int i10 = (int) (this.f3876g * interpolation);
            Rect rect = this.f3872c;
            Rect rect2 = this.f3875f;
            rect.top = rect2.top + i10;
            rect.bottom = rect2.bottom + i10;
            float f11 = this.f3877h;
            float f12 = f11 + ((this.f3878i - f11) * interpolation);
            this.f3871b = f12;
            BitmapDrawable bitmapDrawable = this.f3870a;
            if (bitmapDrawable != null && rect != null) {
                bitmapDrawable.setAlpha((int) (f12 * 255.0f));
                this.f3870a.setBounds(this.f3872c);
            }
            if (this.f3880k && f10 >= 1.0f) {
                this.f3881l = true;
                a aVar = this.f3882m;
                if (aVar != null) {
                    aVar.mo3273a();
                }
            }
            return !this.f3881l;
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3869b = new ArrayList();
    }

    /* renamed from: a */
    public void m3260a(C0603a c0603a) {
        this.f3869b.add(c0603a);
    }

    /* renamed from: b */
    public void m3261b() {
        for (C0603a c0603a : this.f3869b) {
            if (!c0603a.m3264b()) {
                c0603a.m3270h(getDrawingTime());
            }
        }
    }

    /* renamed from: c */
    public void m3262c() {
        Iterator<C0603a> it = this.f3869b.iterator();
        while (it.hasNext()) {
            it.next().m3271i();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3869b.size() > 0) {
            Iterator<C0603a> it = this.f3869b.iterator();
            while (it.hasNext()) {
                C0603a next = it.next();
                BitmapDrawable m3263a = next.m3263a();
                if (m3263a != null) {
                    m3263a.draw(canvas);
                }
                if (!next.m3272j(getDrawingTime())) {
                    it.remove();
                }
            }
        }
    }
}
