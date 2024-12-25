package p306rb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:rb/l.class
 */
@SuppressLint({"AppCompatCustomView"})
/* renamed from: rb.l */
/* loaded from: combined.jar:classes2.jar:rb/l.class */
public class C8460l extends ImageButton {

    /* renamed from: b */
    public int f39550b;

    public C8460l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C8460l(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39550b = getVisibility();
    }

    /* renamed from: b */
    public final void m36346b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f39550b = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f39550b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        m36346b(i10, true);
    }
}
