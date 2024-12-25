package fi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p067di.C4483i0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fi/q.class
 */
/* renamed from: fi.q */
/* loaded from: combined.jar:classes2.jar:fi/q.class */
public abstract class AbstractC4878q {
    @Nullable
    /* renamed from: a */
    public abstract AbstractC4864c<?> mo24738a();

    /* renamed from: b */
    public final boolean m24801b(@NotNull AbstractC4878q abstractC4878q) {
        AbstractC4864c<?> mo24738a;
        AbstractC4864c<?> mo24738a2 = mo24738a();
        boolean z10 = false;
        if (mo24738a2 == null || (mo24738a = abstractC4878q.mo24738a()) == null) {
            return false;
        }
        if (mo24738a2.m24742f() < mo24738a.m24742f()) {
            z10 = true;
        }
        return z10;
    }

    @Nullable
    /* renamed from: c */
    public abstract Object mo24739c(@Nullable Object obj);

    @NotNull
    public String toString() {
        return C4483i0.m22670a(this) + '@' + C4483i0.m22671b(this);
    }
}
