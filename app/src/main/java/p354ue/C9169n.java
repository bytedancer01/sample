package p354ue;

import android.graphics.Rect;
import android.util.Log;
import p338te.C8721s;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ue/n.class
 */
/* renamed from: ue.n */
/* loaded from: combined.jar:classes2.jar:ue/n.class */
public class C9169n extends AbstractC9172q {

    /* renamed from: b */
    public static final String f41939b = "n";

    @Override // p354ue.AbstractC9172q
    /* renamed from: c */
    public float mo38596c(C8721s c8721s, C8721s c8721s2) {
        if (c8721s.f40526b <= 0 || c8721s.f40527c <= 0) {
            return 0.0f;
        }
        C8721s m37267f = c8721s.m37267f(c8721s2);
        float f10 = (m37267f.f40526b * 1.0f) / c8721s.f40526b;
        float f11 = f10;
        if (f10 > 1.0f) {
            f11 = (float) Math.pow(1.0f / f10, 1.1d);
        }
        float f12 = ((c8721s2.f40526b * 1.0f) / m37267f.f40526b) * ((c8721s2.f40527c * 1.0f) / m37267f.f40527c);
        return f11 * (((1.0f / f12) / f12) / f12);
    }

    @Override // p354ue.AbstractC9172q
    /* renamed from: d */
    public Rect mo38597d(C8721s c8721s, C8721s c8721s2) {
        C8721s m37267f = c8721s.m37267f(c8721s2);
        Log.i(f41939b, "Preview: " + c8721s + "; Scaled: " + m37267f + "; Want: " + c8721s2);
        int i10 = (m37267f.f40526b - c8721s2.f40526b) / 2;
        int i11 = (m37267f.f40527c - c8721s2.f40527c) / 2;
        return new Rect(-i10, -i11, m37267f.f40526b - i10, m37267f.f40527c - i11);
    }
}
