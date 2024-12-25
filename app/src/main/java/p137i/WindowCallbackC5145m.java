package p137i;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i/m.class
 */
/* renamed from: i.m */
/* loaded from: combined.jar:classes1.jar:i/m.class */
public class WindowCallbackC5145m implements Window.Callback {

    /* renamed from: b */
    public final Window.Callback f29512b;

    public WindowCallbackC5145m(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f29512b = callback;
    }

    /* renamed from: a */
    public final Window.Callback m25777a() {
        return this.f29512b;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f29512b.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f29512b.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f29512b.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f29512b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f29512b.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f29512b.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f29512b.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f29512b.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f29512b.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f29512b.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        return this.f29512b.onCreatePanelMenu(i10, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i10) {
        return this.f29512b.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f29512b.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f29512b.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return this.f29512b.onMenuOpened(i10, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        this.f29512b.onPanelClosed(i10, menu);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z10) {
        this.f29512b.onPointerCaptureChanged(z10);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return this.f29512b.onPreparePanel(i10, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
        this.f29512b.onProvideKeyboardShortcuts(list, menu, i10);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f29512b.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        boolean onSearchRequested;
        onSearchRequested = this.f29512b.onSearchRequested(searchEvent);
        return onSearchRequested;
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f29512b.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        this.f29512b.onWindowFocusChanged(z10);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f29512b.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        ActionMode onWindowStartingActionMode;
        onWindowStartingActionMode = this.f29512b.onWindowStartingActionMode(callback, i10);
        return onWindowStartingActionMode;
    }
}
