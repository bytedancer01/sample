package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p029c.C0920a;
import p029c.C0929j;
import p235o0.C6824g0;
import p235o0.C6864y0;
import p235o0.InterfaceC6866z0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/a.class
 */
/* renamed from: androidx.appcompat.widget.a */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/a.class */
public abstract class AbstractC0296a extends ViewGroup {

    /* renamed from: b */
    public final a f1958b;

    /* renamed from: c */
    public final Context f1959c;

    /* renamed from: d */
    public ActionMenuView f1960d;

    /* renamed from: e */
    public C0302c f1961e;

    /* renamed from: f */
    public int f1962f;

    /* renamed from: g */
    public C6864y0 f1963g;

    /* renamed from: h */
    public boolean f1964h;

    /* renamed from: i */
    public boolean f1965i;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/a$a.class
     */
    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/a$a.class */
    public class a implements InterfaceC6866z0 {

        /* renamed from: a */
        public boolean f1966a = false;

        /* renamed from: b */
        public int f1967b;

        /* renamed from: c */
        public final AbstractC0296a f1968c;

        public a(AbstractC0296a abstractC0296a) {
            this.f1968c = abstractC0296a;
        }

        @Override // p235o0.InterfaceC6866z0
        /* renamed from: a */
        public void mo1238a(View view) {
            this.f1966a = true;
        }

        @Override // p235o0.InterfaceC6866z0
        /* renamed from: b */
        public void mo1239b(View view) {
            if (this.f1966a) {
                return;
            }
            AbstractC0296a abstractC0296a = this.f1968c;
            abstractC0296a.f1963g = null;
            AbstractC0296a.super.setVisibility(this.f1967b);
        }

        @Override // p235o0.InterfaceC6866z0
        /* renamed from: c */
        public void mo1240c(View view) {
            AbstractC0296a.super.setVisibility(0);
            this.f1966a = false;
        }

        /* renamed from: d */
        public a m1241d(C6864y0 c6864y0, int i10) {
            this.f1968c.f1963g = c6864y0;
            this.f1967b = i10;
            return this;
        }
    }

    public AbstractC0296a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC0296a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1958b = new a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0920a.f6106a, typedValue, true) || typedValue.resourceId == 0) {
            this.f1959c = context;
        } else {
            this.f1959c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: d */
    public static int m1235d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    /* renamed from: c */
    public int m1236c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    /* renamed from: e */
    public int m1237e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        int i14 = measuredWidth;
        if (z10) {
            i14 = -measuredWidth;
        }
        return i14;
    }

    /* renamed from: f */
    public C6864y0 mo1055f(int i10, long j10) {
        C6864y0 m31671a;
        C6864y0 c6864y0 = this.f1963g;
        if (c6864y0 != null) {
            c6864y0.m31672b();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            m31671a = C6824g0.m31514d(this).m31671a(1.0f);
        } else {
            m31671a = C6824g0.m31514d(this).m31671a(0.0f);
        }
        m31671a.m31676f(j10);
        m31671a.m31678h(this.f1958b.m1241d(m31671a, i10));
        return m31671a;
    }

    public int getAnimatedVisibility() {
        return this.f1963g != null ? this.f1958b.f1967b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1962f;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0929j.f6412a, C0920a.f6108c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0929j.f6464j, 0));
        obtainStyledAttributes.recycle();
        C0302c c0302c = this.f1961e;
        if (c0302c != null) {
            c0302c.m1264F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1965i = false;
        }
        if (!this.f1965i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1965i = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1965i = false;
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1964h = false;
        }
        if (!this.f1964h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1964h = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f1964h = false;
        return true;
    }

    public void setContentHeight(int i10) {
        this.f1962f = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            C6864y0 c6864y0 = this.f1963g;
            if (c6864y0 != null) {
                c6864y0.m31672b();
            }
            super.setVisibility(i10);
        }
    }
}
