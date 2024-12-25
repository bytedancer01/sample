package p311rh;

import org.jetbrains.annotations.NotNull;
import p292qh.C7923a;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:rh/a.class
 */
/* renamed from: rh.a */
/* loaded from: combined.jar:classes2.jar:rh/a.class */
public class C8474a extends C7923a {
    @Override // p292qh.C7923a
    /* renamed from: a */
    public void mo34324a(@NotNull Throwable th2, @NotNull Throwable th3) {
        C9367f.m39526e(th2, "cause");
        C9367f.m39526e(th3, "exception");
        th2.addSuppressed(th3);
    }
}
