package ua;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import p305ra.AbstractBinderC8287p2;
import p305ra.InterfaceC8303q3;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/q4.class
 */
/* renamed from: ua.q4 */
/* loaded from: combined.jar:classes2.jar:ua/q4.class */
public final class ServiceConnectionC9037q4 implements ServiceConnection {

    /* renamed from: b */
    public final String f41570b;

    /* renamed from: c */
    public final C9049r4 f41571c;

    public ServiceConnectionC9037q4(C9049r4 c9049r4, String str) {
        this.f41571c = c9049r4;
        this.f41570b = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f41571c.f41593a.mo37780c().m38411r().m38326a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            InterfaceC8303q3 m35681y0 = AbstractBinderC8287p2.m35681y0(iBinder);
            if (m35681y0 == null) {
                this.f41571c.f41593a.mo37780c().m38411r().m38326a("Install Referrer Service implementation was not found");
            } else {
                this.f41571c.f41593a.mo37780c().m38416w().m38326a("Install Referrer Service connected");
                this.f41571c.f41593a.mo37782e().m38436r(new RunnableC9025p4(this, m35681y0, this));
            }
        } catch (Exception e10) {
            this.f41571c.f41593a.mo37780c().m38411r().m38327b("Exception occurred while calling Install Referrer API", e10);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f41571c.f41593a.mo37780c().m38416w().m38326a("Install Referrer Service disconnected");
    }
}
