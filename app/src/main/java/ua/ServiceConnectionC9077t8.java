package ua;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import ca.C1052b;
import p350u9.C8804b;
import p422y9.AbstractC9899c;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/t8.class
 */
/* renamed from: ua.t8 */
/* loaded from: combined.jar:classes2.jar:ua/t8.class */
public final class ServiceConnectionC9077t8 implements ServiceConnection, AbstractC9899c.a, AbstractC9899c.b {

    /* renamed from: b */
    public volatile boolean f41646b;

    /* renamed from: c */
    public volatile C9084u3 f41647c;

    /* renamed from: d */
    public final C9089u8 f41648d;

    public ServiceConnectionC9077t8(C9089u8 c9089u8) {
        this.f41648d = c9089u8;
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m38238d(ServiceConnectionC9077t8 serviceConnectionC9077t8, boolean z10) {
        serviceConnectionC9077t8.f41646b = false;
        return false;
    }

    /* renamed from: a */
    public final void m38239a(Intent intent) {
        ServiceConnectionC9077t8 serviceConnectionC9077t8;
        this.f41648d.mo37811h();
        Context mo37779b = this.f41648d.f41723a.mo37779b();
        C1052b m6223b = C1052b.m6223b();
        synchronized (this) {
            if (this.f41646b) {
                this.f41648d.f41723a.mo37780c().m38416w().m38326a("Connection attempt already in progress");
                return;
            }
            this.f41648d.f41723a.mo37780c().m38416w().m38326a("Using local app measurement service");
            this.f41646b = true;
            serviceConnectionC9077t8 = this.f41648d.f41678c;
            m6223b.m6227a(mo37779b, intent, serviceConnectionC9077t8, 129);
        }
    }

    /* renamed from: b */
    public final void m38240b() {
        if (this.f41647c != null && (this.f41647c.isConnected() || this.f41647c.isConnecting())) {
            this.f41647c.disconnect();
        }
        this.f41647c = null;
    }

    /* renamed from: c */
    public final void m38241c() {
        this.f41648d.mo37811h();
        Context mo37779b = this.f41648d.f41723a.mo37779b();
        synchronized (this) {
            if (this.f41646b) {
                this.f41648d.f41723a.mo37780c().m38416w().m38326a("Connection attempt already in progress");
                return;
            }
            if (this.f41647c != null && (this.f41647c.isConnecting() || this.f41647c.isConnected())) {
                this.f41648d.f41723a.mo37780c().m38416w().m38326a("Already awaiting connection attempt");
                return;
            }
            this.f41647c = new C9084u3(mo37779b, Looper.getMainLooper(), this, this);
            this.f41648d.f41723a.mo37780c().m38416w().m38326a("Connecting to remote service");
            this.f41646b = true;
            C9935o.m41850j(this.f41647c);
            this.f41647c.checkAvailabilityAndConnect();
        }
    }

    @Override // p422y9.AbstractC9899c.a
    public final void onConnected(Bundle bundle) {
        C9935o.m41845e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C9935o.m41850j(this.f41647c);
                this.f41648d.f41723a.mo37782e().m38436r(new RunnableC9041q8(this, this.f41647c.getService()));
            } catch (DeadObjectException | IllegalStateException e10) {
                this.f41647c = null;
                this.f41646b = false;
            }
        }
    }

    @Override // p422y9.AbstractC9899c.b
    public final void onConnectionFailed(C8804b c8804b) {
        C9935o.m41845e("MeasurementServiceConnection.onConnectionFailed");
        C9128y3 m37760B = this.f41648d.f41723a.m37760B();
        if (m37760B != null) {
            m37760B.m38411r().m38327b("Service connection failed", c8804b);
        }
        synchronized (this) {
            this.f41646b = false;
            this.f41647c = null;
        }
        this.f41648d.f41723a.mo37782e().m38436r(new RunnableC9065s8(this));
    }

    @Override // p422y9.AbstractC9899c.a
    public final void onConnectionSuspended(int i10) {
        C9935o.m41845e("MeasurementServiceConnection.onConnectionSuspended");
        this.f41648d.f41723a.mo37780c().m38415v().m38326a("Service connection suspended");
        this.f41648d.f41723a.mo37782e().m38436r(new RunnableC9053r8(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ServiceConnectionC9077t8 serviceConnectionC9077t8;
        C9935o.m41845e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f41646b = false;
                this.f41648d.f41723a.mo37780c().m38408o().m38326a("Service connected with null binder");
                return;
            }
            InterfaceC9024p3 interfaceC9024p3 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    InterfaceC9024p3 c9000n3 = queryLocalInterface instanceof InterfaceC9024p3 ? (InterfaceC9024p3) queryLocalInterface : new C9000n3(iBinder);
                    this.f41648d.f41723a.mo37780c().m38416w().m38326a("Bound to IMeasurementService interface");
                    interfaceC9024p3 = c9000n3;
                } else {
                    this.f41648d.f41723a.mo37780c().m38408o().m38327b("Got binder with a wrong descriptor", interfaceDescriptor);
                    interfaceC9024p3 = null;
                }
            } catch (RemoteException e10) {
                this.f41648d.f41723a.mo37780c().m38408o().m38326a("Service connect failed to get IMeasurementService");
            }
            if (interfaceC9024p3 == null) {
                this.f41646b = false;
                try {
                    C1052b m6223b = C1052b.m6223b();
                    Context mo37779b = this.f41648d.f41723a.mo37779b();
                    serviceConnectionC9077t8 = this.f41648d.f41678c;
                    m6223b.m6228c(mo37779b, serviceConnectionC9077t8);
                } catch (IllegalArgumentException e11) {
                }
            } else {
                this.f41648d.f41723a.mo37782e().m38436r(new RunnableC9017o8(this, interfaceC9024p3));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C9935o.m41845e("MeasurementServiceConnection.onServiceDisconnected");
        this.f41648d.f41723a.mo37780c().m38415v().m38326a("Service disconnected");
        this.f41648d.f41723a.mo37782e().m38436r(new RunnableC9029p8(this, componentName));
    }
}
