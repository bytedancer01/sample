package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p412y.C9786d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/constraintlayout/widget/d.class
 */
/* renamed from: androidx.constraintlayout.widget.d */
/* loaded from: combined.jar:classes1.jar:androidx/constraintlayout/widget/d.class */
public class C0377d extends ViewGroup {

    /* renamed from: b */
    public C0376c f2582b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/constraintlayout/widget/d$a.class
     */
    /* renamed from: androidx.constraintlayout.widget.d$a */
    /* loaded from: combined.jar:classes1.jar:androidx/constraintlayout/widget/d$a.class */
    public static class a extends ConstraintLayout.C0372b {

        /* renamed from: A0 */
        public float f2583A0;

        /* renamed from: B0 */
        public float f2584B0;

        /* renamed from: p0 */
        public float f2585p0;

        /* renamed from: q0 */
        public boolean f2586q0;

        /* renamed from: r0 */
        public float f2587r0;

        /* renamed from: s0 */
        public float f2588s0;

        /* renamed from: t0 */
        public float f2589t0;

        /* renamed from: u0 */
        public float f2590u0;

        /* renamed from: v0 */
        public float f2591v0;

        /* renamed from: w0 */
        public float f2592w0;

        /* renamed from: x0 */
        public float f2593x0;

        /* renamed from: y0 */
        public float f2594y0;

        /* renamed from: z0 */
        public float f2595z0;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f2585p0 = 1.0f;
            this.f2586q0 = false;
            this.f2587r0 = 0.0f;
            this.f2588s0 = 0.0f;
            this.f2589t0 = 0.0f;
            this.f2590u0 = 0.0f;
            this.f2591v0 = 1.0f;
            this.f2592w0 = 1.0f;
            this.f2593x0 = 0.0f;
            this.f2594y0 = 0.0f;
            this.f2595z0 = 0.0f;
            this.f2583A0 = 0.0f;
            this.f2584B0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2585p0 = 1.0f;
            this.f2586q0 = false;
            this.f2587r0 = 0.0f;
            this.f2588s0 = 0.0f;
            this.f2589t0 = 0.0f;
            this.f2590u0 = 0.0f;
            this.f2591v0 = 1.0f;
            this.f2592w0 = 1.0f;
            this.f2593x0 = 0.0f;
            this.f2594y0 = 0.0f;
            this.f2595z0 = 0.0f;
            this.f2583A0 = 0.0f;
            this.f2584B0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9786d.f44847o2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C9786d.f44853p2) {
                    this.f2585p0 = obtainStyledAttributes.getFloat(index, this.f2585p0);
                } else if (index == C9786d.f44598A2) {
                    this.f2587r0 = obtainStyledAttributes.getFloat(index, this.f2587r0);
                    this.f2586q0 = true;
                } else if (index == C9786d.f44901x2) {
                    this.f2589t0 = obtainStyledAttributes.getFloat(index, this.f2589t0);
                } else if (index == C9786d.f44907y2) {
                    this.f2590u0 = obtainStyledAttributes.getFloat(index, this.f2590u0);
                } else if (index == C9786d.f44895w2) {
                    this.f2588s0 = obtainStyledAttributes.getFloat(index, this.f2588s0);
                } else if (index == C9786d.f44883u2) {
                    this.f2591v0 = obtainStyledAttributes.getFloat(index, this.f2591v0);
                } else if (index == C9786d.f44889v2) {
                    this.f2592w0 = obtainStyledAttributes.getFloat(index, this.f2592w0);
                } else if (index == C9786d.f44859q2) {
                    this.f2593x0 = obtainStyledAttributes.getFloat(index, this.f2593x0);
                } else if (index == C9786d.f44865r2) {
                    this.f2594y0 = obtainStyledAttributes.getFloat(index, this.f2594y0);
                } else if (index == C9786d.f44871s2) {
                    this.f2595z0 = obtainStyledAttributes.getFloat(index, this.f2595z0);
                } else if (index == C9786d.f44877t2) {
                    this.f2583A0 = obtainStyledAttributes.getFloat(index, this.f2583A0);
                } else if (index == C9786d.f44913z2) {
                    this.f2584B0 = obtainStyledAttributes.getFloat(index, this.f2584B0);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0372b(layoutParams);
    }

    public C0376c getConstraintSet() {
        if (this.f2582b == null) {
            this.f2582b = new C0376c();
        }
        this.f2582b.m1740h(this);
        return this.f2582b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
