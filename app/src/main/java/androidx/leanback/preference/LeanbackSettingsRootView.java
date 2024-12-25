package androidx.leanback.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/preference/LeanbackSettingsRootView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/preference/LeanbackSettingsRootView.class */
public class LeanbackSettingsRootView extends FrameLayout {

    /* renamed from: b */
    public View.OnKeyListener f3141b;

    public LeanbackSettingsRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View.OnKeyListener onKeyListener;
        boolean z10 = true;
        if (!((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4 && (onKeyListener = this.f3141b) != null) ? onKeyListener.onKey(this, keyEvent.getKeyCode(), keyEvent) : false)) {
            z10 = super.dispatchKeyEvent(keyEvent);
        }
        return z10;
    }

    public void setOnBackKeyListener(View.OnKeyListener onKeyListener) {
        this.f3141b = onKeyListener;
    }
}
