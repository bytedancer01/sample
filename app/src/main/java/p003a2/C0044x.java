package p003a2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/x.class
 */
/* renamed from: a2.x */
/* loaded from: combined.jar:classes1.jar:a2/x.class */
public class C0044x {

    /* renamed from: a */
    public static boolean f177a = true;

    /* renamed from: a */
    public static InterfaceC0042v m199a(ViewGroup viewGroup) {
        return new C0041u(viewGroup);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public static void m200b(ViewGroup viewGroup, boolean z10) {
        if (f177a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError e10) {
                f177a = false;
            }
        }
    }

    /* renamed from: c */
    public static void m201c(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
        } else {
            m200b(viewGroup, z10);
        }
    }
}
