package p216m9;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import ga.InterfaceC4993a;
import ma.C6131g;
import p304r9.C8015b;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/s.class
 */
/* renamed from: m9.s */
/* loaded from: combined.jar:classes2.jar:m9/s.class */
public abstract class AbstractC5989s {

    /* renamed from: c */
    public static final C8015b f33624c = new C8015b("Session");

    /* renamed from: a */
    public final InterfaceC5960i0 f33625a;

    /* renamed from: b */
    public final BinderC5992t0 f33626b;

    public AbstractC5989s(Context context, String str, String str2) {
        BinderC5992t0 binderC5992t0 = new BinderC5992t0(this, null);
        this.f33626b = binderC5992t0;
        this.f33625a = C6131g.m29615d(context, str, str2, binderC5992t0);
    }

    /* renamed from: a */
    public abstract void mo29281a(boolean z10);

    /* renamed from: b */
    public long mo29282b() {
        C9935o.m41845e("Must be called from the main thread.");
        return 0L;
    }

    /* renamed from: c */
    public boolean m29348c() {
        C9935o.m41845e("Must be called from the main thread.");
        InterfaceC5960i0 interfaceC5960i0 = this.f33625a;
        if (interfaceC5960i0 == null) {
            return false;
        }
        try {
            return interfaceC5960i0.mo29306v();
        } catch (RemoteException e10) {
            f33624c.m34874b(e10, "Unable to call %s on %s.", "isConnected", InterfaceC5960i0.class.getSimpleName());
            return false;
        }
    }

    /* renamed from: d */
    public boolean m29349d() {
        C9935o.m41845e("Must be called from the main thread.");
        InterfaceC5960i0 interfaceC5960i0 = this.f33625a;
        if (interfaceC5960i0 == null) {
            return false;
        }
        try {
            return interfaceC5960i0.mo29303i();
        } catch (RemoteException e10) {
            f33624c.m34874b(e10, "Unable to call %s on %s.", "isConnecting", InterfaceC5960i0.class.getSimpleName());
            return false;
        }
    }

    /* renamed from: e */
    public boolean m29350e() {
        C9935o.m41845e("Must be called from the main thread.");
        InterfaceC5960i0 interfaceC5960i0 = this.f33625a;
        if (interfaceC5960i0 == null) {
            return false;
        }
        try {
            return interfaceC5960i0.mo29305r();
        } catch (RemoteException e10) {
            f33624c.m34874b(e10, "Unable to call %s on %s.", "isResuming", InterfaceC5960i0.class.getSimpleName());
            return false;
        }
    }

    /* renamed from: f */
    public final void m29351f(int i10) {
        InterfaceC5960i0 interfaceC5960i0 = this.f33625a;
        if (interfaceC5960i0 != null) {
            try {
                interfaceC5960i0.mo29304q(i10);
            } catch (RemoteException e10) {
                f33624c.m34874b(e10, "Unable to call %s on %s.", "notifyFailedToResumeSession", InterfaceC5960i0.class.getSimpleName());
            }
        }
    }

    /* renamed from: g */
    public final void m29352g(int i10) {
        InterfaceC5960i0 interfaceC5960i0 = this.f33625a;
        if (interfaceC5960i0 != null) {
            try {
                interfaceC5960i0.mo29307x(i10);
            } catch (RemoteException e10) {
                f33624c.m34874b(e10, "Unable to call %s on %s.", "notifyFailedToStartSession", InterfaceC5960i0.class.getSimpleName());
            }
        }
    }

    /* renamed from: h */
    public final void m29353h(int i10) {
        InterfaceC5960i0 interfaceC5960i0 = this.f33625a;
        if (interfaceC5960i0 != null) {
            try {
                interfaceC5960i0.mo29299V0(i10);
            } catch (RemoteException e10) {
                f33624c.m34874b(e10, "Unable to call %s on %s.", "notifySessionEnded", InterfaceC5960i0.class.getSimpleName());
            }
        }
    }

    /* renamed from: i */
    public void mo29283i(Bundle bundle) {
    }

    /* renamed from: j */
    public void mo29284j(Bundle bundle) {
    }

    /* renamed from: k */
    public abstract void mo29285k(Bundle bundle);

    /* renamed from: l */
    public abstract void mo29286l(Bundle bundle);

    /* renamed from: m */
    public void mo29287m(Bundle bundle) {
    }

    /* renamed from: n */
    public final int m29354n() {
        C9935o.m41845e("Must be called from the main thread.");
        InterfaceC5960i0 interfaceC5960i0 = this.f33625a;
        if (interfaceC5960i0 == null) {
            return 0;
        }
        try {
            if (interfaceC5960i0.mo29301c() >= 211100000) {
                return this.f33625a.mo29302d();
            }
            return 0;
        } catch (RemoteException e10) {
            f33624c.m34874b(e10, "Unable to call %s on %s.", "getSessionStartType", InterfaceC5960i0.class.getSimpleName());
            return 0;
        }
    }

    /* renamed from: o */
    public final InterfaceC4993a m29355o() {
        InterfaceC5960i0 interfaceC5960i0 = this.f33625a;
        if (interfaceC5960i0 == null) {
            return null;
        }
        try {
            return interfaceC5960i0.mo29300b();
        } catch (RemoteException e10) {
            f33624c.m34874b(e10, "Unable to call %s on %s.", "getWrappedObject", InterfaceC5960i0.class.getSimpleName());
            return null;
        }
    }
}
