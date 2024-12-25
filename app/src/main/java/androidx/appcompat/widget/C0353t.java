package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p029c.C0920a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/t.class
 */
/* renamed from: androidx.appcompat.widget.t */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/t.class */
public class C0353t extends SeekBar {

    /* renamed from: b */
    public final C0356u f2266b;

    public C0353t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0920a.f6099N);
    }

    public C0353t(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C0322i1.m1454a(this, getContext());
        C0356u c0356u = new C0356u(this);
        this.f2266b = c0356u;
        c0356u.mo1546c(attributeSet, i10);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f2266b.m1616h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f2266b.m1617i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        synchronized (this) {
            super.onDraw(canvas);
            this.f2266b.m1615g(canvas);
        }
    }
}
