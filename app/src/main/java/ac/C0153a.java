package ac;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import bb.C0871a;
import com.google.android.material.tabs.C2524a;
import com.google.android.material.tabs.TabLayout;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ac/a.class
 */
/* renamed from: ac.a */
/* loaded from: combined.jar:classes2.jar:ac/a.class */
public class C0153a extends C2524a {
    /* renamed from: e */
    public static float m672e(float f10) {
        return (float) (1.0d - Math.cos((f10 * 3.141592653589793d) / 2.0d));
    }

    /* renamed from: f */
    public static float m673f(float f10) {
        return (float) Math.sin((f10 * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.C2524a
    /* renamed from: c */
    public void mo674c(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        float m672e;
        float f11;
        RectF m14010a = C2524a.m14010a(tabLayout, view);
        RectF m14010a2 = C2524a.m14010a(tabLayout, view2);
        if (m14010a.left < m14010a2.left) {
            float m672e2 = m672e(f10);
            float m673f = m673f(f10);
            f11 = m672e2;
            m672e = m673f;
        } else {
            float m673f2 = m673f(f10);
            m672e = m672e(f10);
            f11 = m673f2;
        }
        drawable.setBounds(C0871a.m5438b((int) m14010a.left, (int) m14010a2.left, f11), drawable.getBounds().top, C0871a.m5438b((int) m14010a.right, (int) m14010a2.right, m672e), drawable.getBounds().bottom);
    }
}
