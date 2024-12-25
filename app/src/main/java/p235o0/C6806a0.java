package p235o0;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o0/a0.class
 */
/* renamed from: o0.a0 */
/* loaded from: combined.jar:classes1.jar:o0/a0.class */
public final class C6806a0 {

    /* renamed from: a */
    public Object f35495a;

    public C6806a0(Object obj) {
        this.f35495a = obj;
    }

    /* renamed from: b */
    public static C6806a0 m31371b(Context context, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? new C6806a0(PointerIcon.getSystemIcon(context, i10)) : new C6806a0(null);
    }

    /* renamed from: a */
    public Object m31372a() {
        return this.f35495a;
    }
}
