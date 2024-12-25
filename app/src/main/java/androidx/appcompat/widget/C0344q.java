package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p029c.C0920a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/q.class
 */
/* renamed from: androidx.appcompat.widget.q */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/q.class */
public class C0344q extends RatingBar {

    /* renamed from: b */
    public final C0341p f2218b;

    public C0344q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0920a.f6097L);
    }

    public C0344q(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C0322i1.m1454a(this, getContext());
        C0341p c0341p = new C0341p(this);
        this.f2218b = c0341p;
        c0341p.mo1546c(attributeSet, i10);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onMeasure(int i10, int i11) {
        synchronized (this) {
            super.onMeasure(i10, i11);
            Bitmap m1545b = this.f2218b.m1545b();
            if (m1545b != null) {
                setMeasuredDimension(View.resolveSizeAndState(m1545b.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
            }
        }
    }
}
