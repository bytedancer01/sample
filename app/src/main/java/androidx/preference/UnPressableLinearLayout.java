package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/preference/UnPressableLinearLayout.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/preference/UnPressableLinearLayout.class */
public class UnPressableLinearLayout extends LinearLayout {
    public UnPressableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z10) {
    }
}
