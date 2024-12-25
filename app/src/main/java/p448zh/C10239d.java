package p448zh;

import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zh/d.class
 */
/* renamed from: zh.d */
/* loaded from: combined.jar:classes2.jar:zh/d.class */
public class C10239d {
    /* renamed from: a */
    public static final void m42833a(boolean z10, @NotNull Number number) {
        C9367f.m39526e(number, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }
}
