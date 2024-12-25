package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p413y0.C9793f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/PlaybackTransportRowView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/PlaybackTransportRowView.class */
public class PlaybackTransportRowView extends LinearLayout {

    /* renamed from: b */
    public InterfaceC0474a f3269b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/PlaybackTransportRowView$a.class
     */
    /* renamed from: androidx.leanback.widget.PlaybackTransportRowView$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/PlaybackTransportRowView$a.class */
    public interface InterfaceC0474a {
        /* renamed from: a */
        boolean m2495a(KeyEvent keyEvent);
    }

    public PlaybackTransportRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10 = true;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        InterfaceC0474a interfaceC0474a = this.f3269b;
        if (interfaceC0474a == null || !interfaceC0474a.m2495a(keyEvent)) {
            z10 = false;
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View childAt;
        if (view != null) {
            if (i10 == 33) {
                for (int indexOfChild = indexOfChild(getFocusedChild()) - 1; indexOfChild >= 0; indexOfChild--) {
                    View childAt2 = getChildAt(indexOfChild);
                    if (childAt2.hasFocusable()) {
                        return childAt2;
                    }
                }
            } else {
                if (i10 == 130) {
                    int indexOfChild2 = indexOfChild(getFocusedChild());
                    do {
                        indexOfChild2++;
                        if (indexOfChild2 < getChildCount()) {
                            childAt = getChildAt(indexOfChild2);
                        }
                    } while (!childAt.hasFocusable());
                    return childAt;
                }
                if ((i10 == 17 || i10 == 66) && (getFocusedChild() instanceof ViewGroup)) {
                    return FocusFinder.getInstance().findNextFocus((ViewGroup) getFocusedChild(), view, i10);
                }
            }
        }
        return super.focusSearch(view, i10);
    }

    public InterfaceC0474a getOnUnhandledKeyListener() {
        return this.f3269b;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View findFocus = findFocus();
        if (findFocus != null && findFocus.requestFocus(i10, rect)) {
            return true;
        }
        View findViewById = findViewById(C9793f.f45001w);
        if (findViewById != null && findViewById.isFocusable() && findViewById.requestFocus(i10, rect)) {
            return true;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    public void setOnUnhandledKeyListener(InterfaceC0474a interfaceC0474a) {
        this.f3269b = interfaceC0474a;
    }
}
