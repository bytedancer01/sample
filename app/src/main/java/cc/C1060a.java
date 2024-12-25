package cc;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p012ab.C0142b;
import p137i.C5136d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cc/a.class
 */
/* renamed from: cc.a */
/* loaded from: combined.jar:classes2.jar:cc/a.class */
public class C1060a {

    /* renamed from: a */
    public static final int[] f7067a = {R.attr.theme, C0142b.f639H};

    /* renamed from: b */
    public static final int[] f7068b = {C0142b.f663w};

    /* renamed from: a */
    public static int m6265a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7067a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        return resourceId;
    }

    /* renamed from: b */
    public static int m6266b(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7068b, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static Context m6267c(Context context, AttributeSet attributeSet, int i10, int i11) {
        int m6266b = m6266b(context, attributeSet, i10, i11);
        boolean z10 = (context instanceof C5136d) && ((C5136d) context).m25747c() == m6266b;
        if (m6266b == 0 || z10) {
            return context;
        }
        C5136d c5136d = new C5136d(context, m6266b);
        int m6265a = m6265a(context, attributeSet);
        if (m6265a != 0) {
            c5136d.getTheme().applyStyle(m6265a, true);
        }
        return c5136d;
    }
}
