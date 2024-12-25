package p099fc;

import ec.C4708k;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/j.class
 */
/* renamed from: fc.j */
/* loaded from: combined.jar:classes2.jar:fc/j.class */
public final class C4814j {
    /* renamed from: a */
    public static void m24398a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    /* renamed from: b */
    public static int m24399b(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    /* renamed from: c */
    public static void m24400c(boolean z10) {
        C4708k.m23674p(z10, "no calls to next() since the last call to remove()");
    }
}
