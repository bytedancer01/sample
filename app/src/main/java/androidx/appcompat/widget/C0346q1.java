package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/q1.class
 */
/* renamed from: androidx.appcompat.widget.q1 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/q1.class */
public class C0346q1 {
    /* renamed from: a */
    public static void m1563a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            ViewOnLongClickListenerC0349r1.m1579f(view, charSequence);
        }
    }
}
