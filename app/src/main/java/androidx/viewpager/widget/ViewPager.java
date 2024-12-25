package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p052d2.AbstractC4300a;
import p235o0.C6805a;
import p235o0.C6813c1;
import p235o0.C6824g0;
import p235o0.InterfaceC6859w;
import p261p0.C7535k;
import p341u0.AbstractC8783a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/viewpager/widget/ViewPager.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/viewpager/widget/ViewPager.class */
public class ViewPager extends ViewGroup {

    /* renamed from: n0 */
    public static final int[] f5045n0 = {R.attr.layout_gravity};

    /* renamed from: o0 */
    public static final Comparator<C0741f> f5046o0 = new C0736a();

    /* renamed from: p0 */
    public static final Interpolator f5047p0 = new InterpolatorC0737b();

    /* renamed from: q0 */
    public static final C0749n f5048q0 = new C0749n();

    /* renamed from: A */
    public boolean f5049A;

    /* renamed from: B */
    public int f5050B;

    /* renamed from: C */
    public int f5051C;

    /* renamed from: D */
    public int f5052D;

    /* renamed from: E */
    public float f5053E;

    /* renamed from: F */
    public float f5054F;

    /* renamed from: G */
    public float f5055G;

    /* renamed from: H */
    public float f5056H;

    /* renamed from: I */
    public int f5057I;

    /* renamed from: J */
    public VelocityTracker f5058J;

    /* renamed from: K */
    public int f5059K;

    /* renamed from: L */
    public int f5060L;

    /* renamed from: M */
    public int f5061M;

    /* renamed from: N */
    public int f5062N;

    /* renamed from: O */
    public boolean f5063O;

    /* renamed from: P */
    public EdgeEffect f5064P;

    /* renamed from: Q */
    public EdgeEffect f5065Q;

    /* renamed from: R */
    public boolean f5066R;

    /* renamed from: S */
    public boolean f5067S;

    /* renamed from: T */
    public boolean f5068T;

    /* renamed from: U */
    public int f5069U;

    /* renamed from: V */
    public List<InterfaceC0745j> f5070V;

    /* renamed from: W */
    public InterfaceC0745j f5071W;

    /* renamed from: b */
    public int f5072b;

    /* renamed from: c */
    public final ArrayList<C0741f> f5073c;

    /* renamed from: d */
    public final C0741f f5074d;

    /* renamed from: e */
    public final Rect f5075e;

    /* renamed from: f */
    public AbstractC4300a f5076f;

    /* renamed from: f0 */
    public InterfaceC0745j f5077f0;

    /* renamed from: g */
    public int f5078g;

    /* renamed from: g0 */
    public List<InterfaceC0744i> f5079g0;

    /* renamed from: h */
    public int f5080h;

    /* renamed from: h0 */
    public InterfaceC0746k f5081h0;

    /* renamed from: i */
    public Parcelable f5082i;

    /* renamed from: i0 */
    public int f5083i0;

    /* renamed from: j */
    public ClassLoader f5084j;

    /* renamed from: j0 */
    public int f5085j0;

    /* renamed from: k */
    public Scroller f5086k;

    /* renamed from: k0 */
    public ArrayList<View> f5087k0;

    /* renamed from: l */
    public boolean f5088l;

    /* renamed from: l0 */
    public final Runnable f5089l0;

    /* renamed from: m */
    public C0747l f5090m;

    /* renamed from: m0 */
    public int f5091m0;

    /* renamed from: n */
    public int f5092n;

    /* renamed from: o */
    public Drawable f5093o;

    /* renamed from: p */
    public int f5094p;

    /* renamed from: q */
    public int f5095q;

    /* renamed from: r */
    public float f5096r;

    /* renamed from: s */
    public float f5097s;

    /* renamed from: t */
    public int f5098t;

    /* renamed from: u */
    public int f5099u;

    /* renamed from: v */
    public boolean f5100v;

    /* renamed from: w */
    public boolean f5101w;

    /* renamed from: x */
    public boolean f5102x;

    /* renamed from: y */
    public int f5103y;

    /* renamed from: z */
    public boolean f5104z;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/viewpager/widget/ViewPager$a.class
     */
    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    /* loaded from: combined.jar:classes1.jar:androidx/viewpager/widget/ViewPager$a.class */
    public static final class C0736a implements Comparator<C0741f> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C0741f c0741f, C0741f c0741f2) {
            return c0741f.f5109b - c0741f2.f5109b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/viewpager/widget/ViewPager$b.class
     */
    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    /* loaded from: combined.jar:classes1.jar:androidx/viewpager/widget/ViewPager$b.class */
    public static final class InterpolatorC0737b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/viewpager/widget/ViewPager$c.class
     */
    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    /* loaded from: combined.jar:classes1.jar:androidx/viewpager/widget/ViewPager$c.class */
    public class RunnableC0738c implements Runnable {

        /* renamed from: b */
        public final ViewPager f5105b;

        public RunnableC0738c(ViewPager viewPager) {
            this.f5105b = viewPager;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5105b.setScrollState(0);
            this.f5105b.m4752E();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/viewpager/widget/ViewPager$d.class
     */
    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    /* loaded from: combined.jar:classes1.jar:androidx/viewpager/widget/ViewPager$d.class */
    public class C0739d implements InterfaceC6859w {

        /* renamed from: a */
        public final Rect f5106a = new Rect();

        /* renamed from: b */
        public final ViewPager f5107b;

        public C0739d(ViewPager viewPager) {
            this.f5107b = viewPager;
        }

        @Override // p235o0.InterfaceC6859w
        /* renamed from: a */
        public C6813c1 mo1813a(View view, C6813c1 c6813c1) {
            C6813c1 m31511b0 = C6824g0.m31511b0(view, c6813c1);
            if (m31511b0.m31404o()) {
                return m31511b0;
            }
            Rect rect = this.f5106a;
            rect.left = m31511b0.m31400j();
            rect.top = m31511b0.m31402l();
            rect.right = m31511b0.m31401k();
            rect.bottom = m31511b0.m31399i();
            int childCount = this.f5107b.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                C6813c1 m31522h = C6824g0.m31522h(this.f5107b.getChildAt(i10), m31511b0);
                rect.left = Math.min(m31522h.m31400j(), rect.left);
                rect.top = Math.min(m31522h.m31402l(), rect.top);
                rect.right = Math.min(m31522h.m31401k(), rect.right);
                rect.bottom = Math.min(m31522h.m31399i(), rect.bottom);
            }
            return m31511b0.m31405p(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/viewpager/widget/ViewPager$e.class
     */
    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    /* loaded from: combined.jar:classes1.jar:androidx/viewpager/widget/ViewPager$e.class */
    public @interface InterfaceC0740e {
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/viewpager/widget/ViewPager$f.class
     */
    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    /* loaded from: combined.jar:classes1.jar:androidx/viewpager/widget/ViewPager$f.class */
    public static class C0741f {

        /* renamed from: a */
        public Object f5108a;

        /* renamed from: b */
        public int f5109b;

        /* renamed from: c */
        public boolean f5110c;

        /* renamed from: d */
        public float f5111d;

        /* renamed from: e */
        public float f5112e;
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/viewpager/widget/ViewPager$g.class
     */
    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    /* loaded from: combined.jar:classes1.jar:androidx/viewpager/widget/ViewPager$g.class */
    public static class C0742g extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f5113a;

        /* renamed from: b */
        public int f5114b;

        /* renamed from: c */
        public float f5115c;

        /* renamed from: d */
        public boolean f5116d;

        /* renamed from: e */
        public int f5117e;

        /* renamed from: f */
        public int f5118f;

        public C0742g() {
            super(-1, -1);
            this.f5115c = 0.0f;
        }

        public C0742g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5115c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f5045n0);
            this.f5114b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/viewpager/widget/ViewPager$h.class
     */
    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    /* loaded from: combined.jar:classes1.jar:androidx/viewpager/widget/ViewPager$h.class */
    public class C0743h extends C6805a {

        /* renamed from: d */
        public final ViewPager f5119d;

        public C0743h(ViewPager viewPager) {
            this.f5119d = viewPager;
        }

        @Override // p235o0.C6805a
        /* renamed from: f */
        public void mo1935f(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC4300a abstractC4300a;
            super.mo1935f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m4792n());
            if (accessibilityEvent.getEventType() != 4096 || (abstractC4300a = this.f5119d.f5076f) == null) {
                return;
            }
            accessibilityEvent.setItemCount(abstractC4300a.mo21760c());
            accessibilityEvent.setFromIndex(this.f5119d.f5078g);
            accessibilityEvent.setToIndex(this.f5119d.f5078g);
        }

        @Override // p235o0.C6805a
        /* renamed from: g */
        public void mo1936g(View view, C7535k c7535k) {
            super.mo1936g(view, c7535k);
            c7535k.m32199X(ViewPager.class.getName());
            c7535k.m32231p0(m4792n());
            if (this.f5119d.canScrollHorizontally(1)) {
                c7535k.m32202a(4096);
            }
            if (this.f5119d.canScrollHorizontally(-1)) {
                c7535k.m32202a(NTLMEngineImpl.FLAG_WORKSTATION_PRESENT);
            }
        }

        @Override // p235o0.C6805a
        /* renamed from: j */
        public boolean mo1937j(View view, int i10, Bundle bundle) {
            ViewPager viewPager;
            int i11;
            if (super.mo1937j(view, i10, bundle)) {
                return true;
            }
            if (i10 != 4096) {
                if (i10 != 8192 || !this.f5119d.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = this.f5119d;
                i11 = viewPager.f5078g - 1;
            } else {
                if (!this.f5119d.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager = this.f5119d;
                i11 = viewPager.f5078g + 1;
            }
            viewPager.setCurrentItem(i11);
            return true;
        }

        /* renamed from: n */
        public final boolean m4792n() {
            AbstractC4300a abstractC4300a = this.f5119d.f5076f;
            boolean z10 = true;
            if (abstractC4300a == null || abstractC4300a.mo21760c() <= 1) {
                z10 = false;
            }
            return z10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/viewpager/widget/ViewPager$i.class
     */
    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    /* loaded from: combined.jar:classes1.jar:androidx/viewpager/widget/ViewPager$i.class */
    public interface InterfaceC0744i {
        /* renamed from: a */
        void mo4793a(ViewPager viewPager, AbstractC4300a abstractC4300a, AbstractC4300a abstractC4300a2);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/viewpager/widget/ViewPager$j.class
     */
    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    /* loaded from: combined.jar:classes1.jar:androidx/viewpager/widget/ViewPager$j.class */
    public interface InterfaceC0745j {
        /* renamed from: a */
        void mo4794a(int i10, float f10, int i11);

        /* renamed from: b */
        void mo4795b(int i10);

        /* renamed from: c */
        void mo4796c(int i10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/viewpager/widget/ViewPager$k.class
     */
    /* renamed from: androidx.viewpager.widget.ViewPager$k */
    /* loaded from: combined.jar:classes1.jar:androidx/viewpager/widget/ViewPager$k.class */
    public interface InterfaceC0746k {
        /* renamed from: a */
        void m4797a(View view, float f10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/viewpager/widget/ViewPager$l.class
     */
    /* renamed from: androidx.viewpager.widget.ViewPager$l */
    /* loaded from: combined.jar:classes1.jar:androidx/viewpager/widget/ViewPager$l.class */
    public class C0747l extends DataSetObserver {

        /* renamed from: a */
        public final ViewPager f5120a;

        public C0747l(ViewPager viewPager) {
            this.f5120a = viewPager;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            this.f5120a.m4773h();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            this.f5120a.m4773h();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/viewpager/widget/ViewPager$m.class
     */
    /* renamed from: androidx.viewpager.widget.ViewPager$m */
    /* loaded from: combined.jar:classes1.jar:androidx/viewpager/widget/ViewPager$m.class */
    public static class C0748m extends AbstractC8783a {
        public static final Parcelable.Creator<C0748m> CREATOR = new a();

        /* renamed from: d */
        public int f5121d;

        /* renamed from: e */
        public Parcelable f5122e;

        /* renamed from: f */
        public ClassLoader f5123f;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/viewpager/widget/ViewPager$m$a.class
         */
        /* renamed from: androidx.viewpager.widget.ViewPager$m$a */
        /* loaded from: combined.jar:classes1.jar:androidx/viewpager/widget/ViewPager$m$a.class */
        public static final class a implements Parcelable.ClassLoaderCreator<C0748m> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0748m createFromParcel(Parcel parcel) {
                return new C0748m(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0748m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0748m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C0748m[] newArray(int i10) {
                return new C0748m[i10];
            }
        }

        public C0748m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            ClassLoader classLoader2 = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f5121d = parcel.readInt();
            this.f5122e = parcel.readParcelable(classLoader2);
            this.f5123f = classLoader2;
        }

        public C0748m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f5121d + "}";
        }

        @Override // p341u0.AbstractC8783a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f5121d);
            parcel.writeParcelable(this.f5122e, i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/viewpager/widget/ViewPager$n.class
     */
    /* renamed from: androidx.viewpager.widget.ViewPager$n */
    /* loaded from: combined.jar:classes1.jar:androidx/viewpager/widget/ViewPager$n.class */
    public static class C0749n implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0742g c0742g = (C0742g) view.getLayoutParams();
            C0742g c0742g2 = (C0742g) view2.getLayoutParams();
            boolean z10 = c0742g.f5113a;
            if (z10 != c0742g2.f5113a) {
                return z10 ? 1 : -1;
            }
            return c0742g.f5117e - c0742g2.f5117e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5073c = new ArrayList<>();
        this.f5074d = new C0741f();
        this.f5075e = new Rect();
        this.f5080h = -1;
        this.f5082i = null;
        this.f5084j = null;
        this.f5096r = -3.4028235E38f;
        this.f5097s = Float.MAX_VALUE;
        this.f5103y = 1;
        this.f5057I = -1;
        this.f5066R = true;
        this.f5067S = false;
        this.f5089l0 = new RunnableC0738c(this);
        this.f5091m0 = 0;
        m4787v();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f5101w != z10) {
            this.f5101w = z10;
        }
    }

    /* renamed from: w */
    public static boolean m4747w(View view) {
        return view.getClass().getAnnotation(InterfaceC0740e.class) != null;
    }

    /* renamed from: A */
    public boolean m4748A() {
        int i10 = this.f5078g;
        if (i10 <= 0) {
            return false;
        }
        m4761N(i10 - 1, true);
        return true;
    }

    /* renamed from: B */
    public boolean m4749B() {
        AbstractC4300a abstractC4300a = this.f5076f;
        if (abstractC4300a == null || this.f5078g >= abstractC4300a.mo21760c() - 1) {
            return false;
        }
        m4761N(this.f5078g + 1, true);
        return true;
    }

    /* renamed from: C */
    public final boolean m4750C(int i10) {
        if (this.f5073c.size() == 0) {
            if (this.f5066R) {
                return false;
            }
            this.f5068T = false;
            m4789y(0, 0.0f, 0);
            if (this.f5068T) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C0741f m4785t = m4785t();
        int clientWidth = getClientWidth();
        float f10 = this.f5092n;
        float f11 = clientWidth;
        float f12 = f10 / f11;
        int i11 = m4785t.f5109b;
        float f13 = ((i10 / f11) - m4785t.f5112e) / (m4785t.f5111d + f12);
        this.f5068T = false;
        m4789y(i11, f13, (int) ((clientWidth + r0) * f13));
        if (this.f5068T) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* renamed from: D */
    public final boolean m4751D(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.f5053E;
        this.f5053E = f10;
        float scrollX = getScrollX() + (f11 - f10);
        float clientWidth = getClientWidth();
        float f12 = this.f5096r * clientWidth;
        float f13 = this.f5097s * clientWidth;
        boolean z12 = false;
        C0741f c0741f = this.f5073c.get(0);
        ArrayList<C0741f> arrayList = this.f5073c;
        C0741f c0741f2 = arrayList.get(arrayList.size() - 1);
        if (c0741f.f5109b != 0) {
            f12 = c0741f.f5112e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (c0741f2.f5109b != this.f5076f.mo21760c() - 1) {
            f13 = c0741f2.f5112e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            z12 = false;
            if (z10) {
                this.f5064P.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
        } else {
            f12 = scrollX;
            if (scrollX > f13) {
                z12 = false;
                if (z11) {
                    this.f5065Q.onPull(Math.abs(scrollX - f13) / clientWidth);
                    z12 = true;
                }
                f12 = f13;
            }
        }
        int i10 = (int) f12;
        this.f5053E += f12 - i10;
        scrollTo(i10, getScrollY());
        m4750C(i10);
        return z12;
    }

    /* renamed from: E */
    public void m4752E() {
        m4753F(this.f5078g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0333, code lost:
    
        if (r12 < r6.f5073c.size()) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x035d, code lost:
    
        if (r12 < r6.f5073c.size()) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c4, code lost:
    
        if (r12 >= 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e8, code lost:
    
        if (r12 >= 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        if (r0 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b7, code lost:
    
        r19 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0199, code lost:
    
        if (r12 >= 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01fe, code lost:
    
        r19 = null;
        r12 = r13;
        r7 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01eb, code lost:
    
        r19 = r6.f5073c.get(r12);
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02ea, code lost:
    
        if (r12 < r6.f5073c.size()) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02ed, code lost:
    
        r19 = r6.f5073c.get(r12);
        r8 = r9;
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0304, code lost:
    
        r19 = null;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m4753F(int r7) {
        /*
            Method dump skipped, instructions count: 1269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m4753F(int):void");
    }

    /* renamed from: G */
    public final void m4754G(int i10, int i11, int i12, int i13) {
        int min;
        if (i11 <= 0 || this.f5073c.isEmpty()) {
            C0741f m4786u = m4786u(this.f5078g);
            min = (int) ((m4786u != null ? Math.min(m4786u.f5112e, this.f5097s) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
            if (min == getScrollX()) {
                return;
            } else {
                m4772g(false);
            }
        } else {
            if (!this.f5086k.isFinished()) {
                this.f5086k.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            min = (int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - paddingLeft) - paddingRight) + i12));
        }
        scrollTo(min, getScrollY());
    }

    /* renamed from: H */
    public final void m4755H() {
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 >= getChildCount()) {
                return;
            }
            int i12 = i11;
            if (!((C0742g) getChildAt(i11).getLayoutParams()).f5113a) {
                removeViewAt(i11);
                i12 = i11 - 1;
            }
            i10 = i12 + 1;
        }
    }

    /* renamed from: I */
    public void m4756I(InterfaceC0744i interfaceC0744i) {
        List<InterfaceC0744i> list = this.f5079g0;
        if (list != null) {
            list.remove(interfaceC0744i);
        }
    }

    /* renamed from: J */
    public void m4757J(InterfaceC0745j interfaceC0745j) {
        List<InterfaceC0745j> list = this.f5070V;
        if (list != null) {
            list.remove(interfaceC0745j);
        }
    }

    /* renamed from: K */
    public final void m4758K(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    /* renamed from: L */
    public final boolean m4759L() {
        this.f5057I = -1;
        m4780o();
        this.f5064P.onRelease();
        this.f5065Q.onRelease();
        return this.f5064P.isFinished() || this.f5065Q.isFinished();
    }

    /* renamed from: M */
    public final void m4760M(int i10, boolean z10, int i11, boolean z11) {
        C0741f m4786u = m4786u(i10);
        int clientWidth = m4786u != null ? (int) (getClientWidth() * Math.max(this.f5096r, Math.min(m4786u.f5112e, this.f5097s))) : 0;
        if (z10) {
            m4764Q(clientWidth, 0, i11);
            if (z11) {
                m4776k(i10);
                return;
            }
            return;
        }
        if (z11) {
            m4776k(i10);
        }
        m4772g(false);
        scrollTo(clientWidth, 0);
        m4750C(clientWidth);
    }

    /* renamed from: N */
    public void m4761N(int i10, boolean z10) {
        this.f5102x = false;
        m4762O(i10, z10, false);
    }

    /* renamed from: O */
    public void m4762O(int i10, boolean z10, boolean z11) {
        m4763P(i10, z10, z11, 0);
    }

    /* renamed from: P */
    public void m4763P(int i10, boolean z10, boolean z11, int i11) {
        int i12;
        AbstractC4300a abstractC4300a = this.f5076f;
        if (abstractC4300a == null || abstractC4300a.mo21760c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z11 && this.f5078g == i10 && this.f5073c.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i12 = 0;
        } else {
            i12 = i10;
            if (i10 >= this.f5076f.mo21760c()) {
                i12 = this.f5076f.mo21760c() - 1;
            }
        }
        int i13 = this.f5103y;
        int i14 = this.f5078g;
        if (i12 > i14 + i13 || i12 < i14 - i13) {
            for (int i15 = 0; i15 < this.f5073c.size(); i15++) {
                this.f5073c.get(i15).f5110c = true;
            }
        }
        boolean z12 = this.f5078g != i12;
        if (!this.f5066R) {
            m4753F(i12);
            m4760M(i12, z10, i11, z12);
        } else {
            this.f5078g = i12;
            if (z12) {
                m4776k(i12);
            }
            requestLayout();
        }
    }

    /* renamed from: Q */
    public void m4764Q(int i10, int i11, int i12) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f5086k;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f5088l ? this.f5086k.getCurrX() : this.f5086k.getStartX();
            this.f5086k.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i13 = i10 - scrollX;
        int i14 = i11 - scrollY;
        if (i13 == 0 && i14 == 0) {
            m4772g(false);
            m4752E();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i15 = clientWidth / 2;
        float abs = Math.abs(i13);
        float f10 = clientWidth;
        float min = Math.min(1.0f, (abs * 1.0f) / f10);
        float f11 = i15;
        float m4778m = m4778m(min);
        int abs2 = Math.abs(i12);
        int min2 = Math.min(abs2 > 0 ? Math.round(Math.abs((f11 + (m4778m * f11)) / abs2) * 1000.0f) * 4 : (int) (((Math.abs(i13) / ((f10 * this.f5076f.m21763f(this.f5078g)) + this.f5092n)) + 1.0f) * 100.0f), 600);
        this.f5088l = false;
        this.f5086k.startScroll(scrollX, scrollY, i13, i14, min2);
        C6824g0.m31521g0(this);
    }

    /* renamed from: R */
    public final void m4765R() {
        if (this.f5085j0 != 0) {
            ArrayList<View> arrayList = this.f5087k0;
            if (arrayList == null) {
                this.f5087k0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f5087k0.add(getChildAt(i10));
            }
            Collections.sort(this.f5087k0, f5048q0);
        }
    }

    /* renamed from: a */
    public C0741f m4766a(int i10, int i11) {
        C0741f c0741f = new C0741f();
        c0741f.f5109b = i10;
        c0741f.f5108a = this.f5076f.mo2302g(this, i10);
        c0741f.f5111d = this.f5076f.m21763f(i10);
        if (i11 < 0 || i11 >= this.f5073c.size()) {
            this.f5073c.add(c0741f);
        } else {
            this.f5073c.add(i11, c0741f);
        }
        return c0741f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        C0741f m4784s;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (m4784s = m4784s(childAt)) != null && m4784s.f5109b == this.f5078g) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C0741f m4784s;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (m4784s = m4784s(childAt)) != null && m4784s.f5109b == this.f5078g) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams2 = generateLayoutParams(layoutParams);
        }
        C0742g c0742g = (C0742g) layoutParams2;
        boolean m4747w = c0742g.f5113a | m4747w(view);
        c0742g.f5113a = m4747w;
        if (!this.f5100v) {
            super.addView(view, i10, layoutParams2);
        } else {
            if (m4747w) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0742g.f5116d = true;
            addViewInLayout(view, i10, layoutParams2);
        }
    }

    /* renamed from: b */
    public void m4767b(InterfaceC0744i interfaceC0744i) {
        if (this.f5079g0 == null) {
            this.f5079g0 = new ArrayList();
        }
        this.f5079g0.add(interfaceC0744i);
    }

    /* renamed from: c */
    public void m4768c(InterfaceC0745j interfaceC0745j) {
        if (this.f5070V == null) {
            this.f5070V = new ArrayList();
        }
        this.f5070V.add(interfaceC0745j);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        boolean z10 = false;
        if (this.f5076f == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            if (scrollX > ((int) (clientWidth * this.f5096r))) {
                z10 = true;
            }
            return z10;
        }
        boolean z11 = false;
        if (i10 > 0) {
            z11 = false;
            if (scrollX < ((int) (clientWidth * this.f5097s))) {
                z11 = true;
            }
        }
        return z11;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0742g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f5088l = true;
        if (this.f5086k.isFinished() || !this.f5086k.computeScrollOffset()) {
            m4772g(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f5086k.getCurrX();
        int currY = this.f5086k.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m4750C(currX)) {
                this.f5086k.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C6824g0.m31521g0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x017c  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m4769d(int r6) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m4769d(int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo4781p(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0741f m4784s;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (m4784s = m4784s(childAt)) != null && m4784s.f5109b == this.f5078g && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC4300a abstractC4300a;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z10 = false;
        boolean z11 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC4300a = this.f5076f) != null && abstractC4300a.mo21760c() > 1)) {
            if (!this.f5064P.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f5096r * width);
                this.f5064P.setSize(height, width);
                z11 = false | this.f5064P.draw(canvas);
                canvas.restoreToCount(save);
            }
            z10 = z11;
            if (!this.f5065Q.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f5097s + 1.0f)) * width2);
                this.f5065Q.setSize((height2 - paddingTop) - paddingBottom, width2);
                z10 = z11 | this.f5065Q.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f5064P.finish();
            this.f5065Q.finish();
        }
        if (z10) {
            C6824g0.m31521g0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5093o;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* renamed from: e */
    public final void m4770e(C0741f c0741f, int i10, C0741f c0741f2) {
        int i11;
        int i12;
        C0741f c0741f3;
        int i13;
        float f10;
        C0741f c0741f4;
        int i14;
        float f11;
        int mo21760c = this.f5076f.mo21760c();
        int clientWidth = getClientWidth();
        float f12 = clientWidth > 0 ? this.f5092n / clientWidth : 0.0f;
        if (c0741f2 != null) {
            int i15 = c0741f2.f5109b;
            int i16 = c0741f.f5109b;
            if (i15 < i16) {
                float f13 = c0741f2.f5112e + c0741f2.f5111d + f12;
                int i17 = 0;
                for (int i18 = i15 + 1; i18 <= c0741f.f5109b && i17 < this.f5073c.size(); i18 = i14 + 1) {
                    while (true) {
                        c0741f4 = this.f5073c.get(i17);
                        i14 = i18;
                        f11 = f13;
                        if (i18 <= c0741f4.f5109b) {
                            break;
                        }
                        i14 = i18;
                        f11 = f13;
                        if (i17 >= this.f5073c.size() - 1) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                    while (i14 < c0741f4.f5109b) {
                        f11 += this.f5076f.m21763f(i14) + f12;
                        i14++;
                    }
                    c0741f4.f5112e = f11;
                    f13 = f11 + c0741f4.f5111d + f12;
                }
            } else if (i15 > i16) {
                int size = this.f5073c.size() - 1;
                float f14 = c0741f2.f5112e;
                for (int i19 = i15 - 1; i19 >= c0741f.f5109b && size >= 0; i19 = i13 - 1) {
                    while (true) {
                        c0741f3 = this.f5073c.get(size);
                        i13 = i19;
                        f10 = f14;
                        if (i19 >= c0741f3.f5109b) {
                            break;
                        }
                        i13 = i19;
                        f10 = f14;
                        if (size <= 0) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    while (i13 > c0741f3.f5109b) {
                        f10 -= this.f5076f.m21763f(i13) + f12;
                        i13--;
                    }
                    f14 = f10 - (c0741f3.f5111d + f12);
                    c0741f3.f5112e = f14;
                }
            }
        }
        int size2 = this.f5073c.size();
        float f15 = c0741f.f5112e;
        int i20 = c0741f.f5109b;
        int i21 = i20 - 1;
        this.f5096r = i20 == 0 ? f15 : -3.4028235E38f;
        int i22 = mo21760c - 1;
        this.f5097s = i20 == i22 ? (c0741f.f5111d + f15) - 1.0f : Float.MAX_VALUE;
        int i23 = i10 - 1;
        while (i23 >= 0) {
            C0741f c0741f5 = this.f5073c.get(i23);
            while (true) {
                i12 = c0741f5.f5109b;
                if (i21 <= i12) {
                    break;
                }
                f15 -= this.f5076f.m21763f(i21) + f12;
                i21--;
            }
            f15 -= c0741f5.f5111d + f12;
            c0741f5.f5112e = f15;
            if (i12 == 0) {
                this.f5096r = f15;
            }
            i23--;
            i21--;
        }
        float f16 = c0741f.f5112e + c0741f.f5111d + f12;
        int i24 = i10 + 1;
        int i25 = c0741f.f5109b + 1;
        while (i24 < size2) {
            C0741f c0741f6 = this.f5073c.get(i24);
            while (true) {
                i11 = c0741f6.f5109b;
                if (i25 >= i11) {
                    break;
                }
                f16 += this.f5076f.m21763f(i25) + f12;
                i25++;
            }
            if (i11 == i22) {
                this.f5097s = (c0741f6.f5111d + f16) - 1.0f;
            }
            c0741f6.f5112e = f16;
            f16 += c0741f6.f5111d + f12;
            i24++;
            i25++;
        }
        this.f5067S = false;
    }

    /* renamed from: f */
    public boolean m4771f(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && m4771f(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    /* renamed from: g */
    public final void m4772g(boolean z10) {
        boolean z11 = this.f5091m0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f5086k.isFinished()) {
                this.f5086k.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f5086k.getCurrX();
                int currY = this.f5086k.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m4750C(currX);
                    }
                }
            }
        }
        this.f5102x = false;
        for (int i10 = 0; i10 < this.f5073c.size(); i10++) {
            C0741f c0741f = this.f5073c.get(i10);
            if (c0741f.f5110c) {
                c0741f.f5110c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                C6824g0.m31523h0(this, this.f5089l0);
            } else {
                this.f5089l0.run();
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0742g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0742g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC4300a getAdapter() {
        return this.f5076f;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        int i12 = i11;
        if (this.f5085j0 == 2) {
            i12 = (i10 - 1) - i11;
        }
        return ((C0742g) this.f5087k0.get(i12).getLayoutParams()).f5118f;
    }

    public int getCurrentItem() {
        return this.f5078g;
    }

    public int getOffscreenPageLimit() {
        return this.f5103y;
    }

    public int getPageMargin() {
        return this.f5092n;
    }

    /* renamed from: h */
    public void m4773h() {
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        int mo21760c = this.f5076f.mo21760c();
        this.f5072b = mo21760c;
        boolean z12 = this.f5073c.size() < (this.f5103y * 2) + 1 && this.f5073c.size() < mo21760c;
        int i12 = this.f5078g;
        int i13 = 0;
        boolean z13 = false;
        while (true) {
            z10 = z13;
            if (i13 >= this.f5073c.size()) {
                break;
            }
            C0741f c0741f = this.f5073c.get(i13);
            int m21761d = this.f5076f.m21761d(c0741f.f5108a);
            if (m21761d == -1) {
                i10 = i12;
                i11 = i13;
                z11 = z10;
            } else {
                if (m21761d == -2) {
                    this.f5073c.remove(i13);
                    int i14 = i13 - 1;
                    boolean z14 = z10;
                    if (!z10) {
                        this.f5076f.mo2307n(this);
                        z14 = true;
                    }
                    this.f5076f.mo2300a(this, c0741f.f5109b, c0741f.f5108a);
                    int i15 = this.f5078g;
                    i13 = i14;
                    z10 = z14;
                    if (i15 == c0741f.f5109b) {
                        i12 = Math.max(0, Math.min(i15, mo21760c - 1));
                        z10 = z14;
                        i13 = i14;
                    }
                } else {
                    int i16 = c0741f.f5109b;
                    i10 = i12;
                    i11 = i13;
                    z11 = z10;
                    if (i16 != m21761d) {
                        if (i16 == this.f5078g) {
                            i12 = m21761d;
                        }
                        c0741f.f5109b = m21761d;
                    }
                }
                z12 = true;
                i10 = i12;
                i11 = i13;
                z11 = z10;
            }
            i13 = i11 + 1;
            i12 = i10;
            z13 = z11;
        }
        if (z10) {
            this.f5076f.mo2301b(this);
        }
        Collections.sort(this.f5073c, f5046o0);
        if (z12) {
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                C0742g c0742g = (C0742g) getChildAt(i17).getLayoutParams();
                if (!c0742g.f5113a) {
                    c0742g.f5115c = 0.0f;
                }
            }
            m4762O(i12, false, true);
            requestLayout();
        }
    }

    /* renamed from: i */
    public final int m4774i(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.f5061M || Math.abs(i11) <= this.f5059K) {
            i10 += (int) (f10 + (i10 >= this.f5078g ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        int i13 = i10;
        if (this.f5073c.size() > 0) {
            C0741f c0741f = this.f5073c.get(0);
            ArrayList<C0741f> arrayList = this.f5073c;
            i13 = Math.max(c0741f.f5109b, Math.min(i10, arrayList.get(arrayList.size() - 1).f5109b));
        }
        return i13;
    }

    /* renamed from: j */
    public final void m4775j(int i10, float f10, int i11) {
        InterfaceC0745j interfaceC0745j = this.f5071W;
        if (interfaceC0745j != null) {
            interfaceC0745j.mo4794a(i10, f10, i11);
        }
        List<InterfaceC0745j> list = this.f5070V;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                InterfaceC0745j interfaceC0745j2 = this.f5070V.get(i12);
                if (interfaceC0745j2 != null) {
                    interfaceC0745j2.mo4794a(i10, f10, i11);
                }
            }
        }
        InterfaceC0745j interfaceC0745j3 = this.f5077f0;
        if (interfaceC0745j3 != null) {
            interfaceC0745j3.mo4794a(i10, f10, i11);
        }
    }

    /* renamed from: k */
    public final void m4776k(int i10) {
        InterfaceC0745j interfaceC0745j = this.f5071W;
        if (interfaceC0745j != null) {
            interfaceC0745j.mo4796c(i10);
        }
        List<InterfaceC0745j> list = this.f5070V;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                InterfaceC0745j interfaceC0745j2 = this.f5070V.get(i11);
                if (interfaceC0745j2 != null) {
                    interfaceC0745j2.mo4796c(i10);
                }
            }
        }
        InterfaceC0745j interfaceC0745j3 = this.f5077f0;
        if (interfaceC0745j3 != null) {
            interfaceC0745j3.mo4796c(i10);
        }
    }

    /* renamed from: l */
    public final void m4777l(int i10) {
        InterfaceC0745j interfaceC0745j = this.f5071W;
        if (interfaceC0745j != null) {
            interfaceC0745j.mo4795b(i10);
        }
        List<InterfaceC0745j> list = this.f5070V;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                InterfaceC0745j interfaceC0745j2 = this.f5070V.get(i11);
                if (interfaceC0745j2 != null) {
                    interfaceC0745j2.mo4795b(i10);
                }
            }
        }
        InterfaceC0745j interfaceC0745j3 = this.f5077f0;
        if (interfaceC0745j3 != null) {
            interfaceC0745j3.mo4795b(i10);
        }
    }

    /* renamed from: m */
    public float m4778m(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    /* renamed from: n */
    public final void m4779n(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setLayerType(z10 ? this.f5083i0 : 0, null);
        }
    }

    /* renamed from: o */
    public final void m4780o() {
        this.f5104z = false;
        this.f5049A = false;
        VelocityTracker velocityTracker = this.f5058J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5058J = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5066R = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f5089l0);
        Scroller scroller = this.f5086k;
        if (scroller != null && !scroller.isFinished()) {
            this.f5086k.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        float f10;
        super.onDraw(canvas);
        if (this.f5092n <= 0 || this.f5093o == null || this.f5073c.size() <= 0 || this.f5076f == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f11 = this.f5092n / width;
        int i11 = 0;
        C0741f c0741f = this.f5073c.get(0);
        float f12 = c0741f.f5112e;
        int size = this.f5073c.size();
        int i12 = this.f5073c.get(size - 1).f5109b;
        for (int i13 = c0741f.f5109b; i13 < i12; i13++) {
            while (true) {
                i10 = c0741f.f5109b;
                if (i13 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                c0741f = this.f5073c.get(i11);
            }
            if (i13 == i10) {
                float f13 = c0741f.f5112e;
                float f14 = c0741f.f5111d;
                f10 = (f13 + f14) * width;
                f12 = f13 + f14 + f11;
            } else {
                float m21763f = this.f5076f.m21763f(i13);
                f10 = (f12 + m21763f) * width;
                f12 += m21763f + f11;
            }
            if (this.f5092n + f10 > scrollX) {
                this.f5093o.setBounds(Math.round(f10), this.f5094p, Math.round(this.f5092n + f10), this.f5095q);
                this.f5093o.draw(canvas);
            }
            if (f10 > scrollX + r0) {
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m4759L();
            return false;
        }
        if (action != 0) {
            if (this.f5104z) {
                return true;
            }
            if (this.f5049A) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.f5055G = x10;
            this.f5053E = x10;
            float y10 = motionEvent.getY();
            this.f5056H = y10;
            this.f5054F = y10;
            this.f5057I = motionEvent.getPointerId(0);
            this.f5049A = false;
            this.f5088l = true;
            this.f5086k.computeScrollOffset();
            if (this.f5091m0 != 2 || Math.abs(this.f5086k.getFinalX() - this.f5086k.getCurrX()) <= this.f5062N) {
                m4772g(false);
                this.f5104z = false;
            } else {
                this.f5086k.abortAnimation();
                this.f5102x = false;
                m4752E();
                this.f5104z = true;
                m4758K(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.f5057I;
            if (i10 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i10);
                float x11 = motionEvent.getX(findPointerIndex);
                float f10 = x11 - this.f5053E;
                float abs = Math.abs(f10);
                float y11 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y11 - this.f5056H);
                if (f10 != 0.0f && !m4788x(this.f5053E, f10) && m4771f(this, false, (int) f10, (int) x11, (int) y11)) {
                    this.f5053E = x11;
                    this.f5054F = y11;
                    this.f5049A = true;
                    return false;
                }
                int i11 = this.f5052D;
                if (abs > i11 && abs * 0.5f > abs2) {
                    this.f5104z = true;
                    m4758K(true);
                    setScrollState(1);
                    float f11 = this.f5055G;
                    float f12 = this.f5052D;
                    this.f5053E = f10 > 0.0f ? f11 + f12 : f11 - f12;
                    this.f5054F = y11;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i11) {
                    this.f5049A = true;
                }
                if (this.f5104z && m4751D(x11)) {
                    C6824g0.m31521g0(this);
                }
            }
        } else if (action == 6) {
            m4790z(motionEvent);
        }
        if (this.f5058J == null) {
            this.f5058J = VelocityTracker.obtain();
        }
        this.f5058J.addMovement(motionEvent);
        return this.f5104z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0143  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r6, int r7) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        C0741f m4784s;
        int childCount = getChildCount();
        int i13 = -1;
        if ((i10 & 2) != 0) {
            i13 = childCount;
            i11 = 0;
            i12 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
        }
        while (i11 != i13) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (m4784s = m4784s(childAt)) != null && m4784s.f5109b == this.f5078g && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0748m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0748m c0748m = (C0748m) parcelable;
        super.onRestoreInstanceState(c0748m.m37586b());
        AbstractC4300a abstractC4300a = this.f5076f;
        if (abstractC4300a != null) {
            abstractC4300a.mo2304j(c0748m.f5122e, c0748m.f5123f);
            m4762O(c0748m.f5121d, false, true);
        } else {
            this.f5080h = c0748m.f5121d;
            this.f5082i = c0748m.f5122e;
            this.f5084j = c0748m.f5123f;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0748m c0748m = new C0748m(super.onSaveInstanceState());
        c0748m.f5121d = this.f5078g;
        AbstractC4300a abstractC4300a = this.f5076f;
        if (abstractC4300a != null) {
            c0748m.f5122e = abstractC4300a.mo2305k();
        }
        return c0748m;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f5092n;
            m4754G(i10, i12, i14, i14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public boolean mo4781p(KeyEvent keyEvent) {
        boolean z10;
        int i10;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            z10 = m4769d(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            z10 = m4769d(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    z10 = m4749B();
                } else {
                    i10 = 66;
                    z10 = m4769d(i10);
                }
            } else if (keyEvent.hasModifiers(2)) {
                z10 = m4748A();
            } else {
                i10 = 17;
                z10 = m4769d(i10);
            }
            return z10;
        }
        z10 = false;
        return z10;
    }

    /* renamed from: q */
    public final Rect m4782q(Rect rect, View view) {
        Rect rect2 = rect;
        if (rect == null) {
            rect2 = new Rect();
        }
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        int bottom = view.getBottom();
        while (true) {
            rect2.bottom = bottom;
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || parent == this) {
                break;
            }
            view = (ViewGroup) parent;
            rect2.left += view.getLeft();
            rect2.right += view.getRight();
            rect2.top += view.getTop();
            bottom = rect2.bottom + view.getBottom();
        }
        return rect2;
    }

    /* renamed from: r */
    public C0741f m4783r(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return m4784s(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f5100v) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: s */
    public C0741f m4784s(View view) {
        for (int i10 = 0; i10 < this.f5073c.size(); i10++) {
            C0741f c0741f = this.f5073c.get(i10);
            if (this.f5076f.mo2303h(view, c0741f.f5108a)) {
                return c0741f;
            }
        }
        return null;
    }

    public void setAdapter(AbstractC4300a abstractC4300a) {
        AbstractC4300a abstractC4300a2 = this.f5076f;
        if (abstractC4300a2 != null) {
            abstractC4300a2.m21765m(null);
            this.f5076f.mo2307n(this);
            for (int i10 = 0; i10 < this.f5073c.size(); i10++) {
                C0741f c0741f = this.f5073c.get(i10);
                this.f5076f.mo2300a(this, c0741f.f5109b, c0741f.f5108a);
            }
            this.f5076f.mo2301b(this);
            this.f5073c.clear();
            m4755H();
            this.f5078g = 0;
            scrollTo(0, 0);
        }
        AbstractC4300a abstractC4300a3 = this.f5076f;
        this.f5076f = abstractC4300a;
        this.f5072b = 0;
        if (abstractC4300a != null) {
            if (this.f5090m == null) {
                this.f5090m = new C0747l(this);
            }
            this.f5076f.m21765m(this.f5090m);
            this.f5102x = false;
            boolean z10 = this.f5066R;
            this.f5066R = true;
            this.f5072b = this.f5076f.mo21760c();
            if (this.f5080h >= 0) {
                this.f5076f.mo2304j(this.f5082i, this.f5084j);
                m4762O(this.f5080h, false, true);
                this.f5080h = -1;
                this.f5082i = null;
                this.f5084j = null;
            } else if (z10) {
                requestLayout();
            } else {
                m4752E();
            }
        }
        List<InterfaceC0744i> list = this.f5079g0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f5079g0.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f5079g0.get(i11).mo4793a(this, abstractC4300a3, abstractC4300a);
        }
    }

    public void setCurrentItem(int i10) {
        this.f5102x = false;
        m4762O(i10, !this.f5066R, false);
    }

    public void setOffscreenPageLimit(int i10) {
        int i11 = i10;
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i11 = 1;
        }
        if (i11 != this.f5103y) {
            this.f5103y = i11;
            m4752E();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC0745j interfaceC0745j) {
        this.f5071W = interfaceC0745j;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f5092n;
        this.f5092n = i10;
        int width = getWidth();
        m4754G(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(C4290b.m21726e(getContext(), i10));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f5093o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.f5091m0 == i10) {
            return;
        }
        this.f5091m0 = i10;
        if (this.f5081h0 != null) {
            m4779n(i10 != 0);
        }
        m4777l(i10);
    }

    /* renamed from: t */
    public final C0741f m4785t() {
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.f5092n / clientWidth : 0.0f;
        C0741f c0741f = null;
        float f12 = 0.0f;
        int i10 = -1;
        int i11 = 0;
        boolean z10 = true;
        while (i11 < this.f5073c.size()) {
            C0741f c0741f2 = this.f5073c.get(i11);
            int i12 = i11;
            C0741f c0741f3 = c0741f2;
            if (!z10) {
                int i13 = i10 + 1;
                i12 = i11;
                c0741f3 = c0741f2;
                if (c0741f2.f5109b != i13) {
                    c0741f3 = this.f5074d;
                    c0741f3.f5112e = f10 + f12 + f11;
                    c0741f3.f5109b = i13;
                    c0741f3.f5111d = this.f5076f.m21763f(i13);
                    i12 = i11 - 1;
                }
            }
            f10 = c0741f3.f5112e;
            float f13 = c0741f3.f5111d;
            if (!z10 && scrollX < f10) {
                return c0741f;
            }
            if (scrollX < f13 + f10 + f11 || i12 == this.f5073c.size() - 1) {
                return c0741f3;
            }
            i10 = c0741f3.f5109b;
            f12 = c0741f3.f5111d;
            i11 = i12 + 1;
            z10 = false;
            c0741f = c0741f3;
        }
        return c0741f;
    }

    /* renamed from: u */
    public C0741f m4786u(int i10) {
        for (int i11 = 0; i11 < this.f5073c.size(); i11++) {
            C0741f c0741f = this.f5073c.get(i11);
            if (c0741f.f5109b == i10) {
                return c0741f;
            }
        }
        return null;
    }

    /* renamed from: v */
    public void m4787v() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f5086k = new Scroller(context, f5047p0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f5052D = viewConfiguration.getScaledPagingTouchSlop();
        this.f5059K = (int) (400.0f * f10);
        this.f5060L = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5064P = new EdgeEffect(context);
        this.f5065Q = new EdgeEffect(context);
        this.f5061M = (int) (25.0f * f10);
        this.f5062N = (int) (2.0f * f10);
        this.f5050B = (int) (f10 * 16.0f);
        C6824g0.m31539p0(this, new C0743h(this));
        if (C6824g0.m31469A(this) == 0) {
            C6824g0.m31557y0(this, 1);
        }
        C6824g0.m31470A0(this, new C0739d(this));
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5093o;
    }

    /* renamed from: x */
    public final boolean m4788x(float f10, float f11) {
        return (f10 < ((float) this.f5051C) && f11 > 0.0f) || (f10 > ((float) (getWidth() - this.f5051C)) && f11 < 0.0f);
    }

    /* renamed from: y */
    public void m4789y(int i10, float f10, int i11) {
        int max;
        if (this.f5069U > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                C0742g c0742g = (C0742g) childAt.getLayoutParams();
                if (c0742g.f5113a) {
                    int i13 = c0742g.f5114b & 7;
                    if (i13 == 1) {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else if (i13 == 3) {
                        max = paddingLeft;
                        paddingLeft = childAt.getWidth() + paddingLeft;
                    } else if (i13 != 5) {
                        max = paddingLeft;
                        paddingLeft = paddingLeft;
                    } else {
                        max = (width - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    int left = (max + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                }
            }
        }
        m4775j(i10, f10, i11);
        if (this.f5081h0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = getChildAt(i14);
                if (!((C0742g) childAt2.getLayoutParams()).f5113a) {
                    this.f5081h0.m4797a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.f5068T = true;
    }

    /* renamed from: z */
    public final void m4790z(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5057I) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f5053E = motionEvent.getX(i10);
            this.f5057I = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f5058J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }
}
