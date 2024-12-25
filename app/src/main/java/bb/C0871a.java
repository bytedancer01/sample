package bb;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p393x0.C9613a;
import p393x0.C9614b;
import p393x0.C9615c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:bb/a.class
 */
/* renamed from: bb.a */
/* loaded from: combined.jar:classes2.jar:bb/a.class */
public class C0871a {

    /* renamed from: a */
    public static final TimeInterpolator f5951a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f5952b = new C9614b();

    /* renamed from: c */
    public static final TimeInterpolator f5953c = new C9613a();

    /* renamed from: d */
    public static final TimeInterpolator f5954d = new C9615c();

    /* renamed from: e */
    public static final TimeInterpolator f5955e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m5437a(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    /* renamed from: b */
    public static int m5438b(int i10, int i11, float f10) {
        return i10 + Math.round(f10 * (i11 - i10));
    }
}
