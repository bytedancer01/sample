package androidx.leanback.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/t0.class
 */
/* renamed from: androidx.leanback.widget.t0 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/t0.class */
public class C0541t0 {

    /* renamed from: a */
    public static final ViewOutlineProvider f3610a = new a();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/t0$a.class
     */
    /* renamed from: androidx.leanback.widget.t0$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/t0$a.class */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(1.0f);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/t0$b.class
     */
    /* renamed from: androidx.leanback.widget.t0$b */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/t0$b.class */
    public static class b {

        /* renamed from: a */
        public View f3611a;

        /* renamed from: b */
        public float f3612b;

        /* renamed from: c */
        public float f3613c;
    }

    /* renamed from: a */
    public static Object m2994a(View view, float f10, float f11, int i10) {
        if (i10 > 0) {
            C0527n0.m2912a(view, true, i10);
        } else {
            view.setOutlineProvider(f3610a);
        }
        b bVar = new b();
        bVar.f3611a = view;
        bVar.f3612b = f10;
        bVar.f3613c = f11;
        view.setZ(f10);
        return bVar;
    }

    /* renamed from: b */
    public static void m2995b(Object obj, float f10) {
        b bVar = (b) obj;
        View view = bVar.f3611a;
        float f11 = bVar.f3612b;
        view.setZ(f11 + (f10 * (bVar.f3613c - f11)));
    }
}
