package p003a2;

import android.view.ViewGroup;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/k.class
 */
/* renamed from: a2.k */
/* loaded from: combined.jar:classes1.jar:a2/k.class */
public class C0025k {

    /* renamed from: a */
    public ViewGroup f82a;

    /* renamed from: b */
    public Runnable f83b;

    /* renamed from: b */
    public static C0025k m110b(ViewGroup viewGroup) {
        return (C0025k) viewGroup.getTag(C0021i.f79b);
    }

    /* renamed from: c */
    public static void m111c(ViewGroup viewGroup, C0025k c0025k) {
        viewGroup.setTag(C0021i.f79b, c0025k);
    }

    /* renamed from: a */
    public void m112a() {
        Runnable runnable;
        if (m110b(this.f82a) != this || (runnable = this.f83b) == null) {
            return;
        }
        runnable.run();
    }
}
