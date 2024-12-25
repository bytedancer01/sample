package p235o0;

import android.os.Build;
import android.view.DisplayCutout;
import p221n0.C6611c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o0/d.class
 */
/* renamed from: o0.d */
/* loaded from: combined.jar:classes1.jar:o0/d.class */
public final class C6814d {

    /* renamed from: a */
    public final Object f35543a;

    public C6814d(Object obj) {
        this.f35543a = obj;
    }

    /* renamed from: e */
    public static C6814d m31449e(Object obj) {
        return obj == null ? null : new C6814d(obj);
    }

    /* renamed from: a */
    public int m31450a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f35543a).getSafeInsetBottom();
        }
        return 0;
    }

    /* renamed from: b */
    public int m31451b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f35543a).getSafeInsetLeft();
        }
        return 0;
    }

    /* renamed from: c */
    public int m31452c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f35543a).getSafeInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public int m31453d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f35543a).getSafeInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6814d.class != obj.getClass()) {
            return false;
        }
        return C6611c.m30516a(this.f35543a, ((C6814d) obj).f35543a);
    }

    public int hashCode() {
        Object obj = this.f35543a;
        return obj == null ? 0 : obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f35543a + "}";
    }
}
