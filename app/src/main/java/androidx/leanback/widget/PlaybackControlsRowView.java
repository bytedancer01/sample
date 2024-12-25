package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/PlaybackControlsRowView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/PlaybackControlsRowView.class */
class PlaybackControlsRowView extends LinearLayout {

    /* renamed from: b */
    public InterfaceC0473a f3268b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/PlaybackControlsRowView$a.class
     */
    /* renamed from: androidx.leanback.widget.PlaybackControlsRowView$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/PlaybackControlsRowView$a.class */
    public interface InterfaceC0473a {
        /* renamed from: a */
        boolean m2494a(KeyEvent keyEvent);
    }

    public PlaybackControlsRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10 = true;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        InterfaceC0473a interfaceC0473a = this.f3268b;
        if (interfaceC0473a == null || !interfaceC0473a.m2494a(keyEvent)) {
            z10 = false;
        }
        return z10;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View findFocus = findFocus();
        if (findFocus == null || !findFocus.requestFocus(i10, rect)) {
            return super.onRequestFocusInDescendants(i10, rect);
        }
        return true;
    }
}
