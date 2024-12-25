package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import p413y0.C9793f;
import p413y0.C9795h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/y.class
 */
/* renamed from: androidx.leanback.widget.y */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/y.class */
public final class C0550y extends LinearLayout {

    /* renamed from: b */
    public HorizontalGridView f3696b;

    public C0550y(Context context) {
        this(context, null);
    }

    public C0550y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0550y(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(C9795h.f45010a, this);
        HorizontalGridView horizontalGridView = (HorizontalGridView) findViewById(C9793f.f45002x);
        this.f3696b = horizontalGridView;
        horizontalGridView.setHasFixedSize(false);
        setOrientation(1);
        setDescendantFocusability(262144);
    }

    public HorizontalGridView getGridView() {
        return this.f3696b;
    }
}
