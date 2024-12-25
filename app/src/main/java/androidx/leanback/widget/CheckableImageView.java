package androidx.leanback.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/CheckableImageView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/CheckableImageView.class */
class CheckableImageView extends ImageView implements Checkable {

    /* renamed from: c */
    public static final int[] f3188c = {R.attr.state_checked};

    /* renamed from: b */
    public boolean f3189b;

    public CheckableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckableImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f3189b;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f3188c);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f3189b != z10) {
            this.f3189b = z10;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f3189b);
    }
}
