package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import p314s0.C8513u;
import p413y0.C9788a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/RowHeaderView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/RowHeaderView.class */
public final class RowHeaderView extends TextView {
    public RowHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9788a.f44919b);
    }

    public RowHeaderView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C8513u.m36725q(this, callback));
    }
}
