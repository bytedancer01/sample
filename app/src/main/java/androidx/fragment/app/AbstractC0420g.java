package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/g.class
 */
/* renamed from: androidx.fragment.app.g */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/g.class */
public abstract class AbstractC0420g {
    @Deprecated
    /* renamed from: b */
    public Fragment m2076b(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    /* renamed from: c */
    public abstract View mo1940c(int i10);

    /* renamed from: d */
    public abstract boolean mo1941d();
}
