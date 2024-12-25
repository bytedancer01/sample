package p061db;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:db/b.class
 */
/* renamed from: db.b */
/* loaded from: combined.jar:classes2.jar:db/b.class */
public class C4422b {

    /* renamed from: a */
    public static final boolean f26749a = false;

    /* renamed from: a */
    public static void m22518a(C4421a c4421a, View view, FrameLayout frameLayout) {
        m22520c(c4421a, view, frameLayout);
        if (c4421a.m22482h() != null) {
            c4421a.m22482h().setForeground(c4421a);
        } else {
            if (f26749a) {
                throw new IllegalArgumentException("Trying to reference null customBadgeParent");
            }
            view.getOverlay().add(c4421a);
        }
    }

    /* renamed from: b */
    public static void m22519b(C4421a c4421a, View view) {
        if (c4421a == null) {
            return;
        }
        if (f26749a || c4421a.m22482h() != null) {
            c4421a.m22482h().setForeground(null);
        } else {
            view.getOverlay().remove(c4421a);
        }
    }

    /* renamed from: c */
    public static void m22520c(C4421a c4421a, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c4421a.setBounds(rect);
        c4421a.m22497y(view, frameLayout);
    }

    /* renamed from: d */
    public static void m22521d(Rect rect, float f10, float f11, float f12, float f13) {
        rect.set((int) (f10 - f12), (int) (f11 - f13), (int) (f10 + f12), (int) (f11 + f13));
    }
}
