package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/BrowseFrameLayout.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/BrowseFrameLayout.class */
public class BrowseFrameLayout extends FrameLayout {

    /* renamed from: b */
    public InterfaceC0465b f3185b;

    /* renamed from: c */
    public InterfaceC0464a f3186c;

    /* renamed from: d */
    public View.OnKeyListener f3187d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/BrowseFrameLayout$a.class
     */
    /* renamed from: androidx.leanback.widget.BrowseFrameLayout$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/BrowseFrameLayout$a.class */
    public interface InterfaceC0464a {
        /* renamed from: a */
        boolean m2453a(int i10, Rect rect);

        /* renamed from: b */
        void m2454b(View view, View view2);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/BrowseFrameLayout$b.class
     */
    /* renamed from: androidx.leanback.widget.BrowseFrameLayout$b */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/BrowseFrameLayout$b.class */
    public interface InterfaceC0465b {
        /* renamed from: a */
        View m2455a(View view, int i10);
    }

    public BrowseFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BrowseFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        View.OnKeyListener onKeyListener = this.f3187d;
        return (onKeyListener == null || dispatchKeyEvent) ? dispatchKeyEvent : onKeyListener.onKey(getRootView(), keyEvent.getKeyCode(), keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View m2455a;
        InterfaceC0465b interfaceC0465b = this.f3185b;
        return (interfaceC0465b == null || (m2455a = interfaceC0465b.m2455a(view, i10)) == null) ? super.focusSearch(view, i10) : m2455a;
    }

    public InterfaceC0464a getOnChildFocusListener() {
        return this.f3186c;
    }

    public InterfaceC0465b getOnFocusSearchListener() {
        return this.f3185b;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        InterfaceC0464a interfaceC0464a = this.f3186c;
        if (interfaceC0464a == null || !interfaceC0464a.m2453a(i10, rect)) {
            return super.onRequestFocusInDescendants(i10, rect);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        InterfaceC0464a interfaceC0464a = this.f3186c;
        if (interfaceC0464a != null) {
            interfaceC0464a.m2454b(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public void setOnChildFocusListener(InterfaceC0464a interfaceC0464a) {
        this.f3186c = interfaceC0464a;
    }

    public void setOnDispatchKeyListener(View.OnKeyListener onKeyListener) {
        this.f3187d = onKeyListener;
    }

    public void setOnFocusSearchListener(InterfaceC0465b interfaceC0465b) {
        this.f3185b = interfaceC0465b;
    }
}
