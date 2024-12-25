package p154ii;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ii/g.class
 */
/* renamed from: ii.g */
/* loaded from: combined.jar:classes2.jar:ii/g.class */
public class C5268g {

    /* renamed from: a */
    public static final ThreadLocal<Matrix> f30278a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<RectF> f30279b = new ThreadLocal<>();

    /* renamed from: c */
    public static final Matrix f30280c = new Matrix();

    /* renamed from: a */
    public static void m26331a(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            m26331a(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    /* renamed from: b */
    public static void m26332b(ViewGroup viewGroup, View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = f30278a;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.set(f30280c);
        }
        m26331a(viewGroup, view, matrix);
        RectF rectF = f30279b.get();
        RectF rectF2 = rectF;
        if (rectF == null) {
            rectF2 = new RectF();
        }
        rectF2.set(rect);
        matrix.mapRect(rectF2);
        rect.set((int) (rectF2.left + 0.5f), (int) (rectF2.top + 0.5f), (int) (rectF2.right + 0.5f), (int) (rectF2.bottom + 0.5f));
    }
}
