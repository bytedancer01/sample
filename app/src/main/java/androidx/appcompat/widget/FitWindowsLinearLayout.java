package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/FitWindowsLinearLayout.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/FitWindowsLinearLayout.class */
public class FitWindowsLinearLayout extends LinearLayout {

    /* renamed from: b */
    public InterfaceC0345q0 f1785b;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        InterfaceC0345q0 interfaceC0345q0 = this.f1785b;
        if (interfaceC0345q0 != null) {
            interfaceC0345q0.m1562a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(InterfaceC0345q0 interfaceC0345q0) {
        this.f1785b = interfaceC0345q0;
    }
}
