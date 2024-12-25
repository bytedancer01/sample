package p354ue;

import android.graphics.Rect;
import p338te.C8721s;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ue/o.class
 */
/* renamed from: ue.o */
/* loaded from: combined.jar:classes2.jar:ue/o.class */
public class C9170o extends AbstractC9172q {
    /* renamed from: e */
    public static float m38603e(float f10) {
        return f10 < 1.0f ? 1.0f / f10 : f10;
    }

    @Override // p354ue.AbstractC9172q
    /* renamed from: c */
    public float mo38596c(C8721s c8721s, C8721s c8721s2) {
        int i10 = c8721s.f40526b;
        if (i10 <= 0 || c8721s.f40527c <= 0) {
            return 0.0f;
        }
        float m38603e = (1.0f / m38603e((i10 * 1.0f) / c8721s2.f40526b)) / m38603e((c8721s.f40527c * 1.0f) / c8721s2.f40527c);
        float m38603e2 = m38603e(((c8721s.f40526b * 1.0f) / c8721s.f40527c) / ((c8721s2.f40526b * 1.0f) / c8721s2.f40527c));
        return m38603e * (((1.0f / m38603e2) / m38603e2) / m38603e2);
    }

    @Override // p354ue.AbstractC9172q
    /* renamed from: d */
    public Rect mo38597d(C8721s c8721s, C8721s c8721s2) {
        return new Rect(0, 0, c8721s2.f40526b, c8721s2.f40527c);
    }
}
