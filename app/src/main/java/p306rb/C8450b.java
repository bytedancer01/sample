package p306rb;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:rb/b.class
 */
/* renamed from: rb.b */
/* loaded from: combined.jar:classes2.jar:rb/b.class */
public class C8450b {

    /* renamed from: a */
    public static final ThreadLocal<Matrix> f39503a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<RectF> f39504b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m36305a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m36307c(viewGroup, view, rect);
    }

    /* renamed from: b */
    public static void m36306b(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            m36306b(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    /* renamed from: c */
    public static void m36307c(ViewGroup viewGroup, View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = f39503a;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        m36306b(viewGroup, view, matrix);
        ThreadLocal<RectF> threadLocal2 = f39504b;
        RectF rectF = threadLocal2.get();
        RectF rectF2 = rectF;
        if (rectF == null) {
            rectF2 = new RectF();
            threadLocal2.set(rectF2);
        }
        rectF2.set(rect);
        matrix.mapRect(rectF2);
        rect.set((int) (rectF2.left + 0.5f), (int) (rectF2.top + 0.5f), (int) (rectF2.right + 0.5f), (int) (rectF2.bottom + 0.5f));
    }
}
