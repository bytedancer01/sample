package p067di;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5398q;
import p356uh.InterfaceC9196l;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/w.class
 */
/* renamed from: di.w */
/* loaded from: combined.jar:classes2.jar:di/w.class */
public final class C4524w {

    /* renamed from: a */
    @Nullable
    public final Object f26951a;

    /* renamed from: b */
    @NotNull
    public final InterfaceC9196l<Throwable, C5398q> f26952b;

    /* JADX WARN: Multi-variable type inference failed */
    public C4524w(@Nullable Object obj, @NotNull InterfaceC9196l<? super Throwable, C5398q> interfaceC9196l) {
        this.f26951a = obj;
        this.f26952b = interfaceC9196l;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4524w)) {
            return false;
        }
        C4524w c4524w = (C4524w) obj;
        return C9367f.m39522a(this.f26951a, c4524w.f26951a) && C9367f.m39522a(this.f26952b, c4524w.f26952b);
    }

    public int hashCode() {
        Object obj = this.f26951a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f26952b.hashCode();
    }

    @NotNull
    public String toString() {
        return "CompletedWithCancellation(result=" + this.f26951a + ", onCancellation=" + this.f26952b + ')';
    }
}
