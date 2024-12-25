package p404xb;

import android.graphics.drawable.Drawable;
import android.view.View;
import p306rb.C8459k;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xb/h.class
 */
/* renamed from: xb.h */
/* loaded from: combined.jar:classes2.jar:xb/h.class */
public class C9713h {
    /* renamed from: a */
    public static C9709d m40875a(int i10) {
        return i10 != 0 ? i10 != 1 ? m40876b() : new C9710e() : new C9715j();
    }

    /* renamed from: b */
    public static C9709d m40876b() {
        return new C9715j();
    }

    /* renamed from: c */
    public static C9711f m40877c() {
        return new C9711f();
    }

    /* renamed from: d */
    public static void m40878d(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof C9712g) {
            ((C9712g) background).m40840W(f10);
        }
    }

    /* renamed from: e */
    public static void m40879e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C9712g) {
            m40880f(view, (C9712g) background);
        }
    }

    /* renamed from: f */
    public static void m40880f(View view, C9712g c9712g) {
        if (c9712g.m40833O()) {
            c9712g.m40844a0(C8459k.m36342c(view));
        }
    }
}
