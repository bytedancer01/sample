package p067di;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/p0.class
 */
/* renamed from: di.p0 */
/* loaded from: combined.jar:classes2.jar:di/p0.class */
public final class C4504p0 implements InterfaceC4528x0 {

    /* renamed from: b */
    public final boolean f26921b;

    public C4504p0(boolean z10) {
        this.f26921b = z10;
    }

    @Override // p067di.InterfaceC4528x0
    @Nullable
    /* renamed from: a */
    public C4499n1 mo22673a() {
        return null;
    }

    @Override // p067di.InterfaceC4528x0
    public boolean isActive() {
        return this.f26921b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(isActive() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
