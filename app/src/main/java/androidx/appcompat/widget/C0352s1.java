package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.ads.AdError;
import p029c.C0923d;
import p029c.C0925f;
import p029c.C0926g;
import p029c.C0928i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/s1.class
 */
/* renamed from: androidx.appcompat.widget.s1 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/s1.class */
public class C0352s1 {

    /* renamed from: a */
    public final Context f2259a;

    /* renamed from: b */
    public final View f2260b;

    /* renamed from: c */
    public final TextView f2261c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f2262d;

    /* renamed from: e */
    public final Rect f2263e;

    /* renamed from: f */
    public final int[] f2264f;

    /* renamed from: g */
    public final int[] f2265g;

    public C0352s1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f2262d = layoutParams;
        this.f2263e = new Rect();
        this.f2264f = new int[2];
        this.f2265g = new int[2];
        this.f2259a = context;
        View inflate = LayoutInflater.from(context).inflate(C0926g.f6261s, (ViewGroup) null);
        this.f2260b = inflate;
        this.f2261c = (TextView) inflate.findViewById(C0925f.f6235s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0928i.f6277a;
        layoutParams.flags = 24;
    }

    /* renamed from: b */
    public static View m1605b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        Context context = view.getContext();
        while (true) {
            Context context2 = context;
            if (!(context2 instanceof ContextWrapper)) {
                return rootView;
            }
            if (context2 instanceof Activity) {
                return ((Activity) context2).getWindow().getDecorView();
            }
            context = ((ContextWrapper) context2).getBaseContext();
        }
    }

    /* renamed from: a */
    public final void m1606a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f2259a.getResources().getDimensionPixelOffset(C0923d.f6153m);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f2259a.getResources().getDimensionPixelOffset(C0923d.f6152l);
            int i13 = i11 + dimensionPixelOffset2;
            int i14 = i11 - dimensionPixelOffset2;
            height = i13;
            i12 = i14;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f2259a.getResources().getDimensionPixelOffset(z10 ? C0923d.f6155o : C0923d.f6154n);
        View m1605b = m1605b(view);
        if (m1605b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        m1605b.getWindowVisibleDisplayFrame(this.f2263e);
        Rect rect = this.f2263e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f2259a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f2263e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        m1605b.getLocationOnScreen(this.f2265g);
        view.getLocationOnScreen(this.f2264f);
        int[] iArr = this.f2264f;
        int i15 = iArr[0];
        int[] iArr2 = this.f2265g;
        int i16 = i15 - iArr2[0];
        iArr[0] = i16;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i16 + i10) - (m1605b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f2260b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f2260b.getMeasuredHeight();
        int i17 = this.f2264f[1];
        int i18 = ((i12 + i17) - dimensionPixelOffset3) - measuredHeight;
        int i19 = i17 + height + dimensionPixelOffset3;
        if (!z10 ? measuredHeight + i19 <= this.f2263e.height() : i18 < 0) {
            layoutParams.y = i18;
        } else {
            layoutParams.y = i19;
        }
    }

    /* renamed from: c */
    public void m1607c() {
        if (m1608d()) {
            ((WindowManager) this.f2259a.getSystemService("window")).removeView(this.f2260b);
        }
    }

    /* renamed from: d */
    public boolean m1608d() {
        return this.f2260b.getParent() != null;
    }

    /* renamed from: e */
    public void m1609e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (m1608d()) {
            m1607c();
        }
        this.f2261c.setText(charSequence);
        m1606a(view, i10, i11, z10, this.f2262d);
        ((WindowManager) this.f2259a.getSystemService("window")).addView(this.f2260b, this.f2262d);
    }
}
