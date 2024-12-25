package androidx.leanback.widget;

import android.graphics.Outline;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/n0.class
 */
/* renamed from: androidx.leanback.widget.n0 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/n0.class */
public class C0527n0 {

    /* renamed from: a */
    public static SparseArray<ViewOutlineProvider> f3539a;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/n0$a.class
     */
    /* renamed from: androidx.leanback.widget.n0$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/n0$a.class */
    public static final class a extends ViewOutlineProvider {

        /* renamed from: a */
        public int f3540a;

        public a(int i10) {
            this.f3540a = i10;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f3540a);
            outline.setAlpha(1.0f);
        }
    }

    /* renamed from: a */
    public static void m2912a(View view, boolean z10, int i10) {
        if (z10) {
            if (f3539a == null) {
                f3539a = new SparseArray<>();
            }
            ViewOutlineProvider viewOutlineProvider = f3539a.get(i10);
            ViewOutlineProvider viewOutlineProvider2 = viewOutlineProvider;
            if (viewOutlineProvider == null) {
                a aVar = new a(i10);
                viewOutlineProvider2 = aVar;
                if (f3539a.size() < 32) {
                    f3539a.put(i10, aVar);
                    viewOutlineProvider2 = aVar;
                }
            }
            view.setOutlineProvider(viewOutlineProvider2);
        } else {
            view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        }
        view.setClipToOutline(z10);
    }
}
