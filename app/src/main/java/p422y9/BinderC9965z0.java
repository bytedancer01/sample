package p422y9;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/z0.class
 */
/* renamed from: y9.z0 */
/* loaded from: combined.jar:classes2.jar:y9/z0.class */
public final class BinderC9965z0 extends AbstractBinderC9939p0 {

    /* renamed from: b */
    public AbstractC9899c f45658b;

    /* renamed from: c */
    public final int f45659c;

    public BinderC9965z0(AbstractC9899c abstractC9899c, int i10) {
        this.f45658b = abstractC9899c;
        this.f45659c = i10;
    }

    @Override // p422y9.InterfaceC9923k
    /* renamed from: M0 */
    public final void mo41813M0(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // p422y9.InterfaceC9923k
    /* renamed from: X */
    public final void mo41814X(int i10, IBinder iBinder, Bundle bundle) {
        C9935o.m41851k(this.f45658b, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f45658b.onPostInitHandler(i10, iBinder, bundle, this.f45659c);
        this.f45658b = null;
    }

    @Override // p422y9.InterfaceC9923k
    /* renamed from: f1 */
    public final void mo41815f1(int i10, IBinder iBinder, C9910f1 c9910f1) {
        AbstractC9899c abstractC9899c = this.f45658b;
        C9935o.m41851k(abstractC9899c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C9935o.m41850j(c9910f1);
        AbstractC9899c.zzj(abstractC9899c, c9910f1);
        mo41814X(i10, iBinder, c9910f1.f45563d);
    }
}
