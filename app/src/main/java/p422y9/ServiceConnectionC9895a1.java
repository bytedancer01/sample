package p422y9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/a1.class
 */
/* renamed from: y9.a1 */
/* loaded from: combined.jar:classes2.jar:y9/a1.class */
public final class ServiceConnectionC9895a1 implements ServiceConnection {

    /* renamed from: b */
    public final int f45515b;

    /* renamed from: c */
    public final AbstractC9899c f45516c;

    public ServiceConnectionC9895a1(AbstractC9899c abstractC9899c, int i10) {
        this.f45516c = abstractC9899c;
        this.f45515b = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [y9.l] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        AbstractC9899c abstractC9899c = this.f45516c;
        if (iBinder == null) {
            AbstractC9899c.zzk(abstractC9899c, 16);
            return;
        }
        obj = abstractC9899c.zzq;
        synchronized (obj) {
            AbstractC9899c abstractC9899c2 = this.f45516c;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            abstractC9899c2.zzr = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC9926l)) ? new C9942q0(iBinder) : (InterfaceC9926l) queryLocalInterface;
        }
        this.f45516c.zzl(0, null, this.f45515b);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f45516c.zzq;
        synchronized (obj) {
            this.f45516c.zzr = null;
        }
        Handler handler = this.f45516c.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.f45515b, 1));
    }
}
