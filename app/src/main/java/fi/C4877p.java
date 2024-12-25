package fi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p067di.AbstractC4496m1;
import p172jh.C5384c;
import p233nh.InterfaceC6792g;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fi/p.class
 */
/* renamed from: fi.p */
/* loaded from: combined.jar:classes2.jar:fi/p.class */
public final class C4877p extends AbstractC4496m1 {

    /* renamed from: c */
    @Nullable
    public final Throwable f28581c;

    /* renamed from: d */
    @Nullable
    public final String f28582d;

    public C4877p(@Nullable Throwable th2, @Nullable String str) {
        this.f28581c = th2;
        this.f28582d = str;
    }

    @Override // p067di.AbstractC4462b0
    /* renamed from: B0 */
    public boolean mo22633B0(@NotNull InterfaceC6792g interfaceC6792g) {
        m24800F0();
        throw new C5384c();
    }

    @Override // p067di.AbstractC4496m1
    @NotNull
    /* renamed from: C0 */
    public AbstractC4496m1 mo22788C0() {
        return this;
    }

    @Override // p067di.AbstractC4462b0
    @NotNull
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public Void mo22632A0(@NotNull InterfaceC6792g interfaceC6792g, @NotNull Runnable runnable) {
        m24800F0();
        throw new C5384c();
    }

    /* renamed from: F0 */
    public final Void m24800F0() {
        if (this.f28581c == null) {
            C4876o.m24797c();
            throw new C5384c();
        }
        String str = this.f28582d;
        String str2 = "";
        if (str != null) {
            str2 = C9367f.m39532k(". ", str);
            if (str2 == null) {
                str2 = "";
            }
        }
        throw new IllegalStateException(C9367f.m39532k("Module with the Main dispatcher had failed to initialize", str2), this.f28581c);
    }

    @Override // p067di.AbstractC4496m1, p067di.AbstractC4462b0
    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        Throwable th2 = this.f28581c;
        sb2.append(th2 != null ? C9367f.m39532k(", cause=", th2) : "");
        sb2.append(']');
        return sb2.toString();
    }
}
