package p274pi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.AbstractC5412g0;
import p173ji.C5435z;
import p372vh.C9367f;
import p411xi.InterfaceC9763g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pi/h.class
 */
/* renamed from: pi.h */
/* loaded from: combined.jar:classes2.jar:pi/h.class */
public final class C7731h extends AbstractC5412g0 {

    /* renamed from: d */
    public final String f37507d;

    /* renamed from: e */
    public final long f37508e;

    /* renamed from: f */
    public final InterfaceC9763g f37509f;

    public C7731h(@Nullable String str, long j10, @NotNull InterfaceC9763g interfaceC9763g) {
        C9367f.m39526e(interfaceC9763g, "source");
        this.f37507d = str;
        this.f37508e = j10;
        this.f37509f = interfaceC9763g;
    }

    @Override // p173ji.AbstractC5412g0
    /* renamed from: o */
    public long mo22897o() {
        return this.f37508e;
    }

    @Override // p173ji.AbstractC5412g0
    @Nullable
    /* renamed from: p */
    public C5435z mo22898p() {
        String str = this.f37507d;
        return str != null ? C5435z.f31169g.m27179b(str) : null;
    }

    @Override // p173ji.AbstractC5412g0
    @NotNull
    /* renamed from: v */
    public InterfaceC9763g mo22899v() {
        return this.f37509f;
    }
}
