package p003a2;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/a0.class
 */
/* renamed from: a2.a0 */
/* loaded from: combined.jar:classes1.jar:a2/a0.class */
public class C0006a0 {

    /* renamed from: a */
    public static final C0030m0 f13a;

    /* renamed from: b */
    public static final Property<View, Float> f14b;

    /* renamed from: c */
    public static final Property<View, Rect> f15c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/a0$a.class
     */
    /* renamed from: a2.a0$a */
    /* loaded from: combined.jar:classes1.jar:a2/a0$a.class */
    public static final class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(C0006a0.m32c(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            C0006a0.m36g(view, f10.floatValue());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/a0$b.class
     */
    /* renamed from: a2.a0$b */
    /* loaded from: combined.jar:classes1.jar:a2/a0$b.class */
    public static final class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return C6824g0.m31548u(view);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            C6824g0.m31551v0(view, rect);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f13a = i10 >= 29 ? new C0028l0() : i10 >= 23 ? new C0026k0() : i10 >= 22 ? new C0022i0() : new C0018g0();
        f14b = new a(Float.class, "translationAlpha");
        f15c = new b(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    public static void m30a(View view) {
        f13a.mo76a(view);
    }

    /* renamed from: b */
    public static InterfaceC0046z m31b(View view) {
        return new C0045y(view);
    }

    /* renamed from: c */
    public static float m32c(View view) {
        return f13a.mo77c(view);
    }

    /* renamed from: d */
    public static InterfaceC0036p0 m33d(View view) {
        return new C0034o0(view);
    }

    /* renamed from: e */
    public static void m34e(View view) {
        f13a.mo78d(view);
    }

    /* renamed from: f */
    public static void m35f(View view, int i10, int i11, int i12, int i13) {
        f13a.mo107e(view, i10, i11, i12, i13);
    }

    /* renamed from: g */
    public static void m36g(View view, float f10) {
        f13a.mo79f(view, f10);
    }

    /* renamed from: h */
    public static void m37h(View view, int i10) {
        f13a.mo113g(view, i10);
    }

    /* renamed from: i */
    public static void m38i(View view, Matrix matrix) {
        f13a.mo103h(view, matrix);
    }

    /* renamed from: j */
    public static void m39j(View view, Matrix matrix) {
        f13a.mo104i(view, matrix);
    }
}
