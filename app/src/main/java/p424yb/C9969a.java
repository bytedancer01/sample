package p424yb;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p424yb.C9973e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yb/a.class
 */
/* renamed from: yb.a */
/* loaded from: combined.jar:classes2.jar:yb/a.class */
public class C9969a {

    /* renamed from: a */
    public C9973e.b f45676a;

    public C9969a(SwipeDismissBehavior<?> swipeDismissBehavior) {
        swipeDismissBehavior.m13270K(0.1f);
        swipeDismissBehavior.m13269J(0.6f);
        swipeDismissBehavior.m13271L(0);
    }

    /* renamed from: a */
    public boolean m41901a(View view) {
        return view instanceof C9972d;
    }

    /* renamed from: b */
    public void m41902b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (coordinatorLayout.m1777C(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C9973e.m41905b().m41909e(this.f45676a);
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            C9973e.m41905b().m41910f(this.f45676a);
        }
    }
}
