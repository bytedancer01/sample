package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/u0.class
 */
/* renamed from: androidx.leanback.widget.u0 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/u0.class */
public class C0543u0 extends FrameLayout {

    /* renamed from: l */
    public static final Rect f3630l = new Rect();

    /* renamed from: b */
    public boolean f3631b;

    /* renamed from: c */
    public Object f3632c;

    /* renamed from: d */
    public View f3633d;

    /* renamed from: e */
    public boolean f3634e;

    /* renamed from: f */
    public int f3635f;

    /* renamed from: g */
    public float f3636g;

    /* renamed from: h */
    public float f3637h;

    /* renamed from: i */
    public int f3638i;

    /* renamed from: j */
    public Paint f3639j;

    /* renamed from: k */
    public int f3640k;

    public C0543u0(Context context, int i10, boolean z10, float f10, float f11, int i11) {
        super(context);
        this.f3635f = 1;
        this.f3636g = f10;
        this.f3637h = f11;
        m3028a(i10, z10, i11);
    }

    /* renamed from: b */
    public static boolean m3027b() {
        return C0539s0.m2992c();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m3028a(int r6, boolean r7, int r8) {
        /*
            r5 = this;
            r0 = r5
            boolean r0 = r0.f3631b
            if (r0 != 0) goto L92
            r0 = r5
            r1 = 1
            r0.f3631b = r1
            r0 = r5
            r1 = r8
            r0.f3638i = r1
            r0 = r8
            if (r0 <= 0) goto L1b
            r0 = 1
            r9 = r0
            goto L1e
        L1b:
            r0 = 0
            r9 = r0
        L1e:
            r0 = r5
            r1 = r9
            r0.f3634e = r1
            r0 = r5
            r1 = r6
            r0.f3635f = r1
            r0 = r6
            r1 = 2
            if (r0 == r1) goto L48
            r0 = r6
            r1 = 3
            if (r0 == r1) goto L36
            goto L54
        L36:
            r0 = r5
            r1 = r5
            float r1 = r1.f3636g
            r2 = r5
            float r2 = r2.f3637h
            r3 = r8
            java.lang.Object r0 = androidx.leanback.widget.C0539s0.m2990a(r0, r1, r2, r3)
            r10 = r0
            goto L4e
        L48:
            r0 = r5
            java.lang.Object r0 = androidx.leanback.widget.C0498b1.m2565a(r0)
            r10 = r0
        L4e:
            r0 = r5
            r1 = r10
            r0.f3632c = r1
        L54:
            r0 = r7
            if (r0 == 0) goto L87
            r0 = r5
            r1 = 0
            r0.setWillNotDraw(r1)
            r0 = r5
            r1 = 0
            r0.f3640k = r1
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r5
            r1 = r10
            r0.f3639j = r1
            r0 = r10
            r1 = r5
            int r1 = r1.f3640k
            r0.setColor(r1)
            r0 = r5
            android.graphics.Paint r0 = r0.f3639j
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            goto L91
        L87:
            r0 = r5
            r1 = 1
            r0.setWillNotDraw(r1)
            r0 = r5
            r1 = 0
            r0.f3639j = r1
        L91:
            return
        L92:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0543u0.m3028a(int, boolean, int):void");
    }

    /* renamed from: c */
    public void m3029c(View view) {
        if (!this.f3631b || this.f3633d != null) {
            throw new IllegalStateException();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height);
            layoutParams.width = layoutParams.width == -1 ? -1 : -2;
            int i10 = -2;
            if (layoutParams.height == -1) {
                i10 = -1;
            }
            layoutParams.height = i10;
            setLayoutParams(layoutParams);
            addView(view, layoutParams2);
        } else {
            addView(view);
        }
        if (this.f3634e && this.f3635f != 3) {
            C0525m0.m2908a(this, true);
        }
        this.f3633d = view;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f3639j == null || this.f3640k == 0) {
            return;
        }
        canvas.drawRect(this.f3633d.getLeft(), this.f3633d.getTop(), this.f3633d.getRight(), this.f3633d.getBottom(), this.f3639j);
    }

    public int getShadowType() {
        return this.f3635f;
    }

    public View getWrappedView() {
        return this.f3633d;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View view;
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || (view = this.f3633d) == null) {
            return;
        }
        Rect rect = f3630l;
        rect.left = (int) view.getPivotX();
        rect.top = (int) this.f3633d.getPivotY();
        offsetDescendantRectToMyCoords(this.f3633d, rect);
        setPivotX(rect.left);
        setPivotY(rect.top);
    }

    public void setOverlayColor(int i10) {
        Paint paint = this.f3639j;
        if (paint == null || i10 == this.f3640k) {
            return;
        }
        this.f3640k = i10;
        paint.setColor(i10);
        invalidate();
    }

    public void setShadowFocusLevel(float f10) {
        Object obj = this.f3632c;
        if (obj != null) {
            C0545v0.m3033k(obj, this.f3635f, f10);
        }
    }
}
