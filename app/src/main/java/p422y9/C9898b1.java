package p422y9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import p350u9.C8804b;
import p422y9.AbstractC9899c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/b1.class
 */
/* renamed from: y9.b1 */
/* loaded from: combined.jar:classes2.jar:y9/b1.class */
public final class C9898b1 extends AbstractC9936o0 {

    /* renamed from: g */
    public final IBinder f45520g;

    /* renamed from: h */
    public final AbstractC9899c f45521h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9898b1(AbstractC9899c abstractC9899c, int i10, IBinder iBinder, Bundle bundle) {
        super(abstractC9899c, i10, bundle);
        this.f45521h = abstractC9899c;
        this.f45520g = iBinder;
    }

    @Override // p422y9.AbstractC9936o0
    /* renamed from: f */
    public final void mo41763f(C8804b c8804b) {
        if (this.f45521h.zzx != null) {
            this.f45521h.zzx.onConnectionFailed(c8804b);
        }
        this.f45521h.onConnectionFailed(c8804b);
    }

    @Override // p422y9.AbstractC9936o0
    /* renamed from: g */
    public final boolean mo41764g() {
        String str;
        String interfaceDescriptor;
        AbstractC9899c.a aVar;
        AbstractC9899c.a aVar2;
        try {
            IBinder iBinder = this.f45520g;
            C9935o.m41850j(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        } catch (RemoteException e10) {
            str = "service probably died";
        }
        if (!this.f45521h.getServiceDescriptor().equals(interfaceDescriptor)) {
            String serviceDescriptor = this.f45521h.getServiceDescriptor();
            StringBuilder sb2 = new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length());
            sb2.append("service descriptor mismatch: ");
            sb2.append(serviceDescriptor);
            sb2.append(" vs. ");
            sb2.append(interfaceDescriptor);
            str = sb2.toString();
            Log.w("GmsClient", str);
            return false;
        }
        IInterface createServiceInterface = this.f45521h.createServiceInterface(this.f45520g);
        if (createServiceInterface == null) {
            return false;
        }
        if (!AbstractC9899c.zzn(this.f45521h, 2, 4, createServiceInterface) && !AbstractC9899c.zzn(this.f45521h, 3, 4, createServiceInterface)) {
            return false;
        }
        this.f45521h.zzB = null;
        Bundle connectionHint = this.f45521h.getConnectionHint();
        AbstractC9899c abstractC9899c = this.f45521h;
        aVar = abstractC9899c.zzw;
        if (aVar == null) {
            return true;
        }
        aVar2 = abstractC9899c.zzw;
        aVar2.onConnected(connectionHint);
        return true;
    }
}
