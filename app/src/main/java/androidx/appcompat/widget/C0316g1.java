package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C0351s0;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p029c.C0920a;
import p049d.AbstractC4275a;
import p137i.C5133a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/g1.class
 */
/* renamed from: androidx.appcompat.widget.g1 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/g1.class */
public class C0316g1 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: k */
    public static final Interpolator f2066k = new DecelerateInterpolator();

    /* renamed from: b */
    public Runnable f2067b;

    /* renamed from: c */
    public c f2068c;

    /* renamed from: d */
    public C0351s0 f2069d;

    /* renamed from: e */
    public Spinner f2070e;

    /* renamed from: f */
    public boolean f2071f;

    /* renamed from: g */
    public int f2072g;

    /* renamed from: h */
    public int f2073h;

    /* renamed from: i */
    public int f2074i;

    /* renamed from: j */
    public int f2075j;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/g1$a.class
     */
    /* renamed from: androidx.appcompat.widget.g1$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/g1$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final View f2076b;

        /* renamed from: c */
        public final C0316g1 f2077c;

        public a(C0316g1 c0316g1, View view) {
            this.f2077c = c0316g1;
            this.f2076b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2077c.smoothScrollTo(this.f2076b.getLeft() - ((this.f2077c.getWidth() - this.f2076b.getWidth()) / 2), 0);
            this.f2077c.f2067b = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/g1$b.class
     */
    /* renamed from: androidx.appcompat.widget.g1$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/g1$b.class */
    public class b extends BaseAdapter {

        /* renamed from: b */
        public final C0316g1 f2078b;

        public b(C0316g1 c0316g1) {
            this.f2078b = c0316g1;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f2078b.f2069d.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return ((d) this.f2078b.f2069d.getChildAt(i10)).m1374b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.f2078b.m1369c((AbstractC4275a.c) getItem(i10), true);
            } else {
                ((d) view).m1373a((AbstractC4275a.c) getItem(i10));
            }
            return view;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/g1$c.class
     */
    /* renamed from: androidx.appcompat.widget.g1$c */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/g1$c.class */
    public class c implements View.OnClickListener {

        /* renamed from: b */
        public final C0316g1 f2079b;

        public c(C0316g1 c0316g1) {
            this.f2079b = c0316g1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).m1374b().m21532e();
            int childCount = this.f2079b.f2069d.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f2079b.f2069d.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/g1$d.class
     */
    /* renamed from: androidx.appcompat.widget.g1$d */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/g1$d.class */
    public class d extends LinearLayout {

        /* renamed from: b */
        public final int[] f2080b;

        /* renamed from: c */
        public AbstractC4275a.c f2081c;

        /* renamed from: d */
        public TextView f2082d;

        /* renamed from: e */
        public ImageView f2083e;

        /* renamed from: f */
        public View f2084f;

        /* renamed from: g */
        public final C0316g1 f2085g;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(androidx.appcompat.widget.C0316g1 r7, android.content.Context r8, p049d.AbstractC4275a.c r9, boolean r10) {
            /*
                r6 = this;
                r0 = r6
                r1 = r7
                r0.f2085g = r1
                int r0 = p029c.C0920a.f6109d
                r11 = r0
                r0 = r6
                r1 = r8
                r2 = 0
                r3 = r11
                r0.<init>(r1, r2, r3)
                r0 = 1
                int[] r0 = new int[r0]
                r7 = r0
                r0 = r7
                r1 = 0
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r0[r1] = r2
                r0 = r6
                r1 = r7
                r0.f2080b = r1
                r0 = r6
                r1 = r9
                r0.f2081c = r1
                r0 = r8
                r1 = 0
                r2 = r7
                r3 = r11
                r4 = 0
                androidx.appcompat.widget.n1 r0 = androidx.appcompat.widget.C0337n1.m1505v(r0, r1, r2, r3, r4)
                r7 = r0
                r0 = r7
                r1 = 0
                boolean r0 = r0.m1524s(r1)
                if (r0 == 0) goto L40
                r0 = r6
                r1 = r7
                r2 = 0
                android.graphics.drawable.Drawable r1 = r1.m1512g(r2)
                r0.setBackgroundDrawable(r1)
            L40:
                r0 = r7
                r0.m1525w()
                r0 = r10
                if (r0 == 0) goto L4f
                r0 = r6
                r1 = 8388627(0x800013, float:1.175497E-38)
                r0.setGravity(r1)
            L4f:
                r0 = r6
                r0.m1375c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0316g1.d.<init>(androidx.appcompat.widget.g1, android.content.Context, d.a$c, boolean):void");
        }

        /* renamed from: a */
        public void m1373a(AbstractC4275a.c cVar) {
            this.f2081c = cVar;
            m1375c();
        }

        /* renamed from: b */
        public AbstractC4275a.c m1374b() {
            return this.f2081c;
        }

        /* renamed from: c */
        public void m1375c() {
            AbstractC4275a.c cVar = this.f2081c;
            View m21529b = cVar.m21529b();
            CharSequence charSequence = null;
            if (m21529b != null) {
                ViewParent parent = m21529b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(m21529b);
                    }
                    addView(m21529b);
                }
                this.f2084f = m21529b;
                TextView textView = this.f2082d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f2083e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f2083e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f2084f;
            if (view != null) {
                removeView(view);
                this.f2084f = null;
            }
            Drawable m21530c = cVar.m21530c();
            CharSequence m21531d = cVar.m21531d();
            if (m21530c != null) {
                if (this.f2083e == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f2083e = appCompatImageView;
                }
                this.f2083e.setImageDrawable(m21530c);
                this.f2083e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f2083e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f2083e.setImageDrawable(null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(m21531d);
            if (z10) {
                if (this.f2082d == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, C0920a.f6110e);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f2082d = appCompatTextView;
                }
                this.f2082d.setText(m21531d);
                this.f2082d.setVisibility(0);
            } else {
                TextView textView2 = this.f2082d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f2082d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f2083e;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.m21528a());
            }
            if (!z10) {
                charSequence = cVar.m21528a();
            }
            C0346q1.m1563a(this, charSequence);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f2085g.f2072g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f2085g.f2072g;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH), i11);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: a */
    public void m1367a(int i10) {
        View childAt = this.f2069d.getChildAt(i10);
        Runnable runnable = this.f2067b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(this, childAt);
        this.f2067b = aVar;
        post(aVar);
    }

    /* renamed from: b */
    public final Spinner m1368b() {
        C0359v c0359v = new C0359v(getContext(), null, C0920a.f6113h);
        c0359v.setLayoutParams(new C0351s0.a(-2, -1));
        c0359v.setOnItemSelectedListener(this);
        return c0359v;
    }

    /* renamed from: c */
    public d m1369c(AbstractC4275a.c cVar, boolean z10) {
        d dVar = new d(this, getContext(), cVar, z10);
        if (z10) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f2074i));
        } else {
            dVar.setFocusable(true);
            if (this.f2068c == null) {
                this.f2068c = new c(this);
            }
            dVar.setOnClickListener(this.f2068c);
        }
        return dVar;
    }

    /* renamed from: d */
    public final boolean m1370d() {
        Spinner spinner = this.f2070e;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    public final void m1371e() {
        if (m1370d()) {
            return;
        }
        if (this.f2070e == null) {
            this.f2070e = m1368b();
        }
        removeView(this.f2069d);
        addView(this.f2070e, new ViewGroup.LayoutParams(-2, -1));
        if (this.f2070e.getAdapter() == null) {
            this.f2070e.setAdapter((SpinnerAdapter) new b(this));
        }
        Runnable runnable = this.f2067b;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f2067b = null;
        }
        this.f2070e.setSelection(this.f2075j);
    }

    /* renamed from: f */
    public final boolean m1372f() {
        if (!m1370d()) {
            return false;
        }
        removeView(this.f2070e);
        addView(this.f2069d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f2070e.getSelectedItemPosition());
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f2067b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C5133a m25734b = C5133a.m25734b(getContext());
        setContentHeight(m25734b.m25739f());
        this.f2073h = m25734b.m25738e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f2067b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((d) view).m1374b().m21532e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = mode == 1073741824;
        setFillViewport(z10);
        int childCount = this.f2069d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i12 = -1;
        } else {
            if (childCount > 2) {
                this.f2072g = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f2072g = View.MeasureSpec.getSize(i10) / 2;
            }
            i12 = Math.min(this.f2072g, this.f2073h);
        }
        this.f2072g = i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f2074i, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH);
        if (!z10 && this.f2071f) {
            this.f2069d.measure(0, makeMeasureSpec);
            if (this.f2069d.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                m1371e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i10, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z10 || measuredWidth == measuredWidth2) {
                }
                setTabSelected(this.f2075j);
                return;
            }
        }
        m1372f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i10, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z10) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z10) {
        this.f2071f = z10;
    }

    public void setContentHeight(int i10) {
        this.f2074i = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f2075j = i10;
        int childCount = this.f2069d.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f2069d.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                m1367a(i10);
            }
            i11++;
        }
        Spinner spinner = this.f2070e;
        if (spinner == null || i10 < 0) {
            return;
        }
        spinner.setSelection(i10);
    }
}
