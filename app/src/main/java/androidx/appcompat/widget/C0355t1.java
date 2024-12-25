package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/t1.class
 */
/* renamed from: androidx.appcompat.widget.t1 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/t1.class */
public class C0355t1 extends Resources {

    /* renamed from: b */
    public static boolean f2267b;

    /* renamed from: a */
    public final WeakReference<Context> f2268a;

    public C0355t1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f2268a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m1611a() {
        return f2267b;
    }

    /* renamed from: b */
    public static boolean m1612b() {
        m1611a();
        return false;
    }

    /* renamed from: c */
    public final Drawable m1613c(int i10) {
        return super.getDrawable(i10);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Context context = this.f2268a.get();
        return context != null ? C0307d1.m1285h().m1303t(context, this, i10) : super.getDrawable(i10);
    }
}
