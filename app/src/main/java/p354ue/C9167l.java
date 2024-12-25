package p354ue;

import android.graphics.Rect;
import android.util.Log;
import p338te.C8721s;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ue/l.class
 */
/* renamed from: ue.l */
/* loaded from: combined.jar:classes2.jar:ue/l.class */
public class C9167l extends AbstractC9172q {

    /* renamed from: b */
    public static final String f41934b = "l";

    @Override // p354ue.AbstractC9172q
    /* renamed from: c */
    public float mo38596c(C8721s c8721s, C8721s c8721s2) {
        if (c8721s.f40526b <= 0 || c8721s.f40527c <= 0) {
            return 0.0f;
        }
        C8721s m37266e = c8721s.m37266e(c8721s2);
        float f10 = (m37266e.f40526b * 1.0f) / c8721s.f40526b;
        float f11 = f10;
        if (f10 > 1.0f) {
            f11 = (float) Math.pow(1.0f / f10, 1.1d);
        }
        float f12 = ((m37266e.f40526b * 1.0f) / c8721s2.f40526b) + ((m37266e.f40527c * 1.0f) / c8721s2.f40527c);
        return f11 * ((1.0f / f12) / f12);
    }

    @Override // p354ue.AbstractC9172q
    /* renamed from: d */
    public Rect mo38597d(C8721s c8721s, C8721s c8721s2) {
        C8721s m37266e = c8721s.m37266e(c8721s2);
        Log.i(f41934b, "Preview: " + c8721s + "; Scaled: " + m37266e + "; Want: " + c8721s2);
        int i10 = (m37266e.f40526b - c8721s2.f40526b) / 2;
        int i11 = (m37266e.f40527c - c8721s2.f40527c) / 2;
        return new Rect(-i10, -i11, m37266e.f40526b - i10, m37266e.f40527c - i11);
    }
}
