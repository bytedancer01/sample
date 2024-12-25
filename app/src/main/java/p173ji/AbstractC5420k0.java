package p173ji;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;
import p411xi.C9764h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/k0.class
 */
/* renamed from: ji.k0 */
/* loaded from: combined.jar:classes2.jar:ji/k0.class */
public abstract class AbstractC5420k0 {
    public void onClosed(@NotNull InterfaceC5418j0 interfaceC5418j0, int i10, @NotNull String str) {
        C9367f.m39526e(interfaceC5418j0, "webSocket");
        C9367f.m39526e(str, "reason");
    }

    public void onClosing(@NotNull InterfaceC5418j0 interfaceC5418j0, int i10, @NotNull String str) {
        C9367f.m39526e(interfaceC5418j0, "webSocket");
        C9367f.m39526e(str, "reason");
    }

    public void onFailure(@NotNull InterfaceC5418j0 interfaceC5418j0, @NotNull Throwable th2, @Nullable C5410f0 c5410f0) {
        C9367f.m39526e(interfaceC5418j0, "webSocket");
        C9367f.m39526e(th2, "t");
    }

    public void onMessage(@NotNull InterfaceC5418j0 interfaceC5418j0, @NotNull String str) {
        C9367f.m39526e(interfaceC5418j0, "webSocket");
        C9367f.m39526e(str, "text");
    }

    public void onMessage(@NotNull InterfaceC5418j0 interfaceC5418j0, @NotNull C9764h c9764h) {
        C9367f.m39526e(interfaceC5418j0, "webSocket");
        C9367f.m39526e(c9764h, "bytes");
    }

    public void onOpen(@NotNull InterfaceC5418j0 interfaceC5418j0, @NotNull C5410f0 c5410f0) {
        C9367f.m39526e(interfaceC5418j0, "webSocket");
        C9367f.m39526e(c5410f0, "response");
    }
}
