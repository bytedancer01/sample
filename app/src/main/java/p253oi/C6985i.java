package p253oi;

import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p173ji.C5414h0;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:oi/i.class
 */
/* renamed from: oi.i */
/* loaded from: combined.jar:classes2.jar:oi/i.class */
public final class C6985i {

    /* renamed from: a */
    public final Set<C5414h0> f36086a = new LinkedHashSet();

    /* renamed from: a */
    public final void m32115a(@NotNull C5414h0 c5414h0) {
        synchronized (this) {
            C9367f.m39526e(c5414h0, "route");
            this.f36086a.remove(c5414h0);
        }
    }

    /* renamed from: b */
    public final void m32116b(@NotNull C5414h0 c5414h0) {
        synchronized (this) {
            C9367f.m39526e(c5414h0, "failedRoute");
            this.f36086a.add(c5414h0);
        }
    }

    /* renamed from: c */
    public final boolean m32117c(@NotNull C5414h0 c5414h0) {
        boolean contains;
        synchronized (this) {
            C9367f.m39526e(c5414h0, "route");
            contains = this.f36086a.contains(c5414h0);
        }
        return contains;
    }
}
