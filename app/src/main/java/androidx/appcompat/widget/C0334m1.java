package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/m1.class
 */
/* renamed from: androidx.appcompat.widget.m1 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/m1.class */
public class C0334m1 extends C0310e1 {

    /* renamed from: b */
    public final WeakReference<Context> f2164b;

    public C0334m1(Context context, Resources resources) {
        super(resources);
        this.f2164b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.C0310e1, android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Drawable drawable = super.getDrawable(i10);
        Context context = this.f2164b.get();
        if (drawable != null && context != null) {
            C0307d1.m1285h().m1306x(context, i10, drawable);
        }
        return drawable;
    }
}
