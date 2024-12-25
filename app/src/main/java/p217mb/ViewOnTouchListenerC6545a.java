package p217mb;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:mb/a.class
 */
/* renamed from: mb.a */
/* loaded from: combined.jar:classes2.jar:mb/a.class */
public class ViewOnTouchListenerC6545a implements View.OnTouchListener {

    /* renamed from: b */
    public final Dialog f34208b;

    /* renamed from: c */
    public final int f34209c;

    /* renamed from: d */
    public final int f34210d;

    /* renamed from: e */
    public final int f34211e;

    public ViewOnTouchListenerC6545a(Dialog dialog, Rect rect) {
        this.f34208b = dialog;
        this.f34209c = rect.left;
        this.f34210d = rect.top;
        this.f34211e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = this.f34209c + findViewById.getLeft();
        int width = findViewById.getWidth();
        if (new RectF(left, this.f34210d + findViewById.getTop(), width + left, findViewById.getHeight() + r0).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f34211e;
            obtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f34208b.onTouchEvent(obtain);
    }
}
