package p305ra;

import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/t.class
 */
/* renamed from: ra.t */
/* loaded from: combined.jar:classes2.jar:ra/t.class */
public final class C8344t extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final Long f39273f;

    /* renamed from: g */
    public final String f39274g;

    /* renamed from: h */
    public final String f39275h;

    /* renamed from: i */
    public final Bundle f39276i;

    /* renamed from: j */
    public final boolean f39277j;

    /* renamed from: k */
    public final boolean f39278k;

    /* renamed from: l */
    public final C8120e0 f39279l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8344t(C8120e0 c8120e0, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(c8120e0, true);
        this.f39279l = c8120e0;
        this.f39273f = l10;
        this.f39274g = str;
        this.f39275h = str2;
        this.f39276i = bundle;
        this.f39277j = z10;
        this.f39278k = z11;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        InterfaceC8313qd interfaceC8313qd;
        Long l10 = this.f39273f;
        long longValue = l10 == null ? this.f39326b : l10.longValue();
        interfaceC8313qd = this.f39279l.f39051i;
        interfaceC8313qd.logEvent(this.f39274g, this.f39275h, this.f39276i, this.f39277j, this.f39278k, longValue);
    }
}
