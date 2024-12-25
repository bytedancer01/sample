package ma;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.util.Iterator;
import p208m1.C5901j;
import p304r9.C8015b;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/p.class
 */
/* renamed from: ma.p */
/* loaded from: combined.jar:classes2.jar:ma/p.class */
public final class C6320p extends C5901j.a {

    /* renamed from: b */
    public static final C8015b f33942b = new C8015b("MediaRouterCallback");

    /* renamed from: a */
    public final InterfaceC6299o f33943a;

    public C6320p(InterfaceC6299o interfaceC6299o) {
        this.f33943a = (InterfaceC6299o) C9935o.m41850j(interfaceC6299o);
    }

    @Override // p208m1.C5901j.a
    /* renamed from: d */
    public final void mo3234d(C5901j c5901j, C5901j.h hVar) {
        try {
            this.f33943a.mo29863U(hVar.m28995k(), hVar.m28993i());
        } catch (RemoteException e10) {
            f33942b.m34874b(e10, "Unable to call %s on %s.", "onRouteAdded", InterfaceC6299o.class.getSimpleName());
        }
    }

    @Override // p208m1.C5901j.a
    /* renamed from: e */
    public final void mo3235e(C5901j c5901j, C5901j.h hVar) {
        try {
            this.f33943a.mo29862P(hVar.m28995k(), hVar.m28993i());
        } catch (RemoteException e10) {
            f33942b.m34874b(e10, "Unable to call %s on %s.", "onRouteChanged", InterfaceC6299o.class.getSimpleName());
        }
    }

    @Override // p208m1.C5901j.a
    /* renamed from: g */
    public final void mo3236g(C5901j c5901j, C5901j.h hVar) {
        try {
            this.f33943a.mo29860I(hVar.m28995k(), hVar.m28993i());
        } catch (RemoteException e10) {
            f33942b.m34874b(e10, "Unable to call %s on %s.", "onRouteRemoved", InterfaceC6299o.class.getSimpleName());
        }
    }

    @Override // p208m1.C5901j.a
    /* renamed from: i */
    public final void mo28891i(C5901j c5901j, C5901j.h hVar, int i10) {
        CastDevice m13037S;
        f33942b.m34877e("onRouteSelected with reason = %d, routeId = %s", Integer.valueOf(i10), hVar.m28995k());
        if (hVar.m28999o() != 1) {
            return;
        }
        try {
            String m28995k = hVar.m28995k();
            String m28995k2 = hVar.m28995k();
            String str = m28995k2;
            if (m28995k2 != null) {
                if (m28995k2.endsWith("-groupRoute")) {
                    CastDevice m13037S2 = CastDevice.m13037S(hVar.m28993i());
                    if (m13037S2 != null) {
                        String m13039P = m13037S2.m13039P();
                        Iterator<C5901j.h> it = c5901j.m28879m().iterator();
                        while (true) {
                            str = m28995k2;
                            if (!it.hasNext()) {
                                break;
                            }
                            C5901j.h next = it.next();
                            String m28995k3 = next.m28995k();
                            if (m28995k3 != null && !m28995k3.endsWith("-groupRoute") && (m13037S = CastDevice.m13037S(next.m28993i())) != null && TextUtils.equals(m13037S.m13039P(), m13039P)) {
                                f33942b.m34873a("routeId is changed from %s to %s", m28995k2, next.m28995k());
                                str = next.m28995k();
                                break;
                            }
                        }
                    } else {
                        str = m28995k2;
                    }
                } else {
                    str = m28995k2;
                }
            }
            if (this.f33943a.mo29864c() >= 220400000) {
                this.f33943a.mo29861L0(str, m28995k, hVar.m28993i());
            } else {
                this.f33943a.mo29865z(str, hVar.m28993i());
            }
        } catch (RemoteException e10) {
            f33942b.m34874b(e10, "Unable to call %s on %s.", "onRouteSelected", InterfaceC6299o.class.getSimpleName());
        }
    }

    @Override // p208m1.C5901j.a
    /* renamed from: l */
    public final void mo28893l(C5901j c5901j, C5901j.h hVar, int i10) {
        C8015b c8015b = f33942b;
        c8015b.m34877e("onRouteUnselected with reason = %d, routeId = %s", Integer.valueOf(i10), hVar.m28995k());
        if (hVar.m28999o() != 1) {
            c8015b.m34873a("skip route unselection for non-cast route", new Object[0]);
            return;
        }
        try {
            this.f33943a.mo29866z0(hVar.m28995k(), hVar.m28993i(), i10);
        } catch (RemoteException e10) {
            f33942b.m34874b(e10, "Unable to call %s on %s.", "onRouteUnselected", InterfaceC6299o.class.getSimpleName());
        }
    }
}
