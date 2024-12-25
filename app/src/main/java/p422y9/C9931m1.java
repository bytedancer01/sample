package p422y9;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/m1.class
 */
/* renamed from: y9.m1 */
/* loaded from: combined.jar:classes2.jar:y9/m1.class */
public final class C9931m1 implements Handler.Callback {

    /* renamed from: b */
    public final C9934n1 f45614b;

    public /* synthetic */ C9931m1(C9934n1 c9934n1, C9928l1 c9928l1) {
        this.f45614b = c9934n1;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i10 = message.what;
        if (i10 == 0) {
            hashMap = this.f45614b.f45617f;
            synchronized (hashMap) {
                C9922j1 c9922j1 = (C9922j1) message.obj;
                hashMap2 = this.f45614b.f45617f;
                ServiceConnectionC9925k1 serviceConnectionC9925k1 = (ServiceConnectionC9925k1) hashMap2.get(c9922j1);
                if (serviceConnectionC9925k1 != null && serviceConnectionC9925k1.m41824i()) {
                    if (serviceConnectionC9925k1.m41825j()) {
                        serviceConnectionC9925k1.m41822g("GmsClientSupervisor");
                    }
                    hashMap3 = this.f45614b.f45617f;
                    hashMap3.remove(c9922j1);
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        hashMap4 = this.f45614b.f45617f;
        synchronized (hashMap4) {
            C9922j1 c9922j12 = (C9922j1) message.obj;
            hashMap5 = this.f45614b.f45617f;
            ServiceConnectionC9925k1 serviceConnectionC9925k12 = (ServiceConnectionC9925k1) hashMap5.get(c9922j12);
            if (serviceConnectionC9925k12 != null && serviceConnectionC9925k12.m41816a() == 3) {
                String valueOf = String.valueOf(c9922j12);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
                sb2.append("Timeout waiting for ServiceConnection callback ");
                sb2.append(valueOf);
                Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                ComponentName m41817b = serviceConnectionC9925k12.m41817b();
                ComponentName componentName = m41817b;
                if (m41817b == null) {
                    componentName = c9922j12.m41810b();
                }
                ComponentName componentName2 = componentName;
                if (componentName == null) {
                    String m41812d = c9922j12.m41812d();
                    C9935o.m41850j(m41812d);
                    componentName2 = new ComponentName(m41812d, "unknown");
                }
                serviceConnectionC9925k12.onServiceDisconnected(componentName2);
            }
        }
        return true;
    }
}
