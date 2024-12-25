package p235o0;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o0/e.class
 */
/* renamed from: o0.e */
/* loaded from: combined.jar:classes1.jar:o0/e.class */
public final class C6817e {

    /* renamed from: a */
    public final a f35544a;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/e$a.class
     */
    /* renamed from: o0.e$a */
    /* loaded from: combined.jar:classes1.jar:o0/e$a.class */
    public interface a {
        boolean onTouchEvent(MotionEvent motionEvent);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/e$b.class
     */
    /* renamed from: o0.e$b */
    /* loaded from: combined.jar:classes1.jar:o0/e$b.class */
    public static class b implements a {

        /* renamed from: a */
        public final GestureDetector f35545a;

        public b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f35545a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // p235o0.C6817e.a
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return this.f35545a.onTouchEvent(motionEvent);
        }
    }

    public C6817e(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public C6817e(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f35544a = new b(context, onGestureListener, handler);
    }

    /* renamed from: a */
    public boolean m31456a(MotionEvent motionEvent) {
        return this.f35544a.onTouchEvent(motionEvent);
    }
}
