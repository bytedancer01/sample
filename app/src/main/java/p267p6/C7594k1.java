package p267p6;

import java.io.IOException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/k1.class
 */
/* renamed from: p6.k1 */
/* loaded from: combined.jar:classes2.jar:p6/k1.class */
public class C7594k1 extends IOException {

    /* renamed from: b */
    public final boolean f36839b;

    /* renamed from: c */
    public final int f36840c;

    public C7594k1(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f36839b = z10;
        this.f36840c = i10;
    }

    /* renamed from: a */
    public static C7594k1 m32822a(String str, Throwable th2) {
        return new C7594k1(str, th2, true, 1);
    }

    /* renamed from: b */
    public static C7594k1 m32823b(String str, Throwable th2) {
        return new C7594k1(str, th2, true, 0);
    }

    /* renamed from: c */
    public static C7594k1 m32824c(String str, Throwable th2) {
        return new C7594k1(str, th2, true, 4);
    }

    /* renamed from: d */
    public static C7594k1 m32825d(String str, Throwable th2) {
        return new C7594k1(str, th2, false, 4);
    }

    /* renamed from: e */
    public static C7594k1 m32826e(String str) {
        return new C7594k1(str, null, false, 1);
    }
}
