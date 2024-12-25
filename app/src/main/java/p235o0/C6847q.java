package p235o0;

import android.view.MotionEvent;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o0/q.class
 */
/* renamed from: o0.q */
/* loaded from: combined.jar:classes1.jar:o0/q.class */
public final class C6847q {
    @Deprecated
    /* renamed from: a */
    public static int m31628a(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    /* renamed from: b */
    public static boolean m31629b(MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }
}
