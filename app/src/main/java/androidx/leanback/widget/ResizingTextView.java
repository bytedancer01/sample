package androidx.leanback.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import p314s0.C8513u;
import p413y0.C9799l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/ResizingTextView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/ResizingTextView.class */
class ResizingTextView extends TextView {

    /* renamed from: b */
    public int f3270b;

    /* renamed from: c */
    public int f3271c;

    /* renamed from: d */
    public boolean f3272d;

    /* renamed from: e */
    public int f3273e;

    /* renamed from: f */
    public int f3274f;

    /* renamed from: g */
    public boolean f3275g;

    /* renamed from: h */
    public boolean f3276h;

    /* renamed from: i */
    public int f3277i;

    /* renamed from: j */
    public float f3278j;

    /* renamed from: k */
    public int f3279k;

    /* renamed from: l */
    public int f3280l;

    public ResizingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public ResizingTextView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ResizingTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.f3275g = false;
        this.f3276h = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9799l.f45052T, i10, i11);
        try {
            this.f3270b = obtainStyledAttributes.getInt(C9799l.f45054V, 1);
            this.f3271c = obtainStyledAttributes.getDimensionPixelSize(C9799l.f45057Y, -1);
            this.f3272d = obtainStyledAttributes.getBoolean(C9799l.f45053U, false);
            this.f3273e = obtainStyledAttributes.getDimensionPixelOffset(C9799l.f45056X, 0);
            this.f3274f = obtainStyledAttributes.getDimensionPixelOffset(C9799l.f45055W, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public final void m2496a(int i10, int i11) {
        if (isPaddingRelative()) {
            setPaddingRelative(getPaddingStart(), i10, getPaddingEnd(), i11);
        } else {
            setPadding(getPaddingLeft(), i10, getPaddingRight(), i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0139  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r5, int r6) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.ResizingTextView.onMeasure(int, int):void");
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C8513u.m36725q(this, callback));
    }
}
