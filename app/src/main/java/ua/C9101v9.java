package ua;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/v9.class
 */
/* renamed from: ua.v9 */
/* loaded from: combined.jar:classes2.jar:ua/v9.class */
public final class C9101v9 implements InterfaceC8887da {

    /* renamed from: a */
    public final C9123x9 f41712a;

    public C9101v9(C9123x9 c9123x9) {
        this.f41712a = c9123x9;
    }

    @Override // ua.InterfaceC8887da
    /* renamed from: a */
    public final void mo37810a(String str, Bundle bundle) {
        C8870c5 c8870c5;
        if (!TextUtils.isEmpty(str)) {
            this.f41712a.mo37782e().m38436r(new RunnableC9090u9(this, str, bundle));
        } else {
            c8870c5 = this.f41712a.f41766j;
            c8870c5.mo37780c().m38408o().m38326a("AppId not known when logging error event");
        }
    }
}
