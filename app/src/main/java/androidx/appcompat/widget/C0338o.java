package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p029c.C0929j;
import p314s0.C8503k;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/o.class
 */
/* renamed from: androidx.appcompat.widget.o */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/o.class */
public class C0338o extends PopupWindow {

    /* renamed from: b */
    public static final boolean f2171b = false;

    /* renamed from: a */
    public boolean f2172a;

    public C0338o(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        m1526a(context, attributeSet, i10, i11);
    }

    /* renamed from: a */
    public final void m1526a(Context context, AttributeSet attributeSet, int i10, int i11) {
        C0337n1 m1505v = C0337n1.m1505v(context, attributeSet, C0929j.f6467j2, i10, i11);
        int i12 = C0929j.f6477l2;
        if (m1505v.m1524s(i12)) {
            m1527b(m1505v.m1506a(i12, false));
        }
        setBackgroundDrawable(m1505v.m1512g(C0929j.f6472k2));
        m1505v.m1525w();
    }

    /* renamed from: b */
    public final void m1527b(boolean z10) {
        if (f2171b) {
            this.f2172a = z10;
        } else {
            C8503k.m36697a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        int i12 = i11;
        if (f2171b) {
            i12 = i11;
            if (this.f2172a) {
                i12 = i11 - view.getHeight();
            }
        }
        super.showAsDropDown(view, i10, i12);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        int i13 = i11;
        if (f2171b) {
            i13 = i11;
            if (this.f2172a) {
                i13 = i11 - view.getHeight();
            }
        }
        super.showAsDropDown(view, i10, i13, i12);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        int i14 = i11;
        if (f2171b) {
            i14 = i11;
            if (this.f2172a) {
                i14 = i11 - view.getHeight();
            }
        }
        super.update(view, i10, i14, i12, i13);
    }
}
