package p216m9;

import android.content.Context;
import android.os.RemoteException;
import ga.BinderC4994b;
import ga.InterfaceC4993a;
import p304r9.C8015b;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/t.class
 */
/* renamed from: m9.t */
/* loaded from: combined.jar:classes2.jar:m9/t.class */
public class C5991t {

    /* renamed from: c */
    public static final C8015b f33627c = new C8015b("SessionManager");

    /* renamed from: a */
    public final InterfaceC5966k0 f33628a;

    /* renamed from: b */
    public final Context f33629b;

    public C5991t(InterfaceC5966k0 interfaceC5966k0, Context context) {
        this.f33628a = interfaceC5966k0;
        this.f33629b = context;
    }

    /* renamed from: a */
    public <T extends AbstractC5989s> void m29356a(InterfaceC5993u<T> interfaceC5993u, Class<T> cls) {
        if (interfaceC5993u == null) {
            throw new NullPointerException("SessionManagerListener can't be null");
        }
        C9935o.m41850j(cls);
        C9935o.m41845e("Must be called from the main thread.");
        try {
            this.f33628a.mo29313p0(new BinderC5994u0(interfaceC5993u, cls));
        } catch (RemoteException e10) {
            f33627c.m34874b(e10, "Unable to call %s on %s.", "addSessionManagerListener", InterfaceC5966k0.class.getSimpleName());
        }
    }

    /* renamed from: b */
    public void m29357b(boolean z10) {
        C9935o.m41845e("Must be called from the main thread.");
        try {
            f33627c.m34877e("End session for %s", this.f33629b.getPackageName());
            this.f33628a.mo29309E0(true, z10);
        } catch (RemoteException e10) {
            f33627c.m34874b(e10, "Unable to call %s on %s.", "endCurrentSession", InterfaceC5966k0.class.getSimpleName());
        }
    }

    /* renamed from: c */
    public C5947e m29358c() {
        C9935o.m41845e("Must be called from the main thread.");
        AbstractC5989s m29359d = m29359d();
        if (m29359d == null || !(m29359d instanceof C5947e)) {
            return null;
        }
        return (C5947e) m29359d;
    }

    /* renamed from: d */
    public AbstractC5989s m29359d() {
        C9935o.m41845e("Must be called from the main thread.");
        try {
            return (AbstractC5989s) BinderC4994b.m25161U0(this.f33628a.mo29312d());
        } catch (RemoteException e10) {
            f33627c.m34874b(e10, "Unable to call %s on %s.", "getWrappedCurrentSession", InterfaceC5966k0.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: e */
    public <T extends AbstractC5989s> void m29360e(InterfaceC5993u<T> interfaceC5993u, Class<T> cls) {
        C9935o.m41850j(cls);
        C9935o.m41845e("Must be called from the main thread.");
        if (interfaceC5993u == null) {
            return;
        }
        try {
            this.f33628a.mo29310M(new BinderC5994u0(interfaceC5993u, cls));
        } catch (RemoteException e10) {
            f33627c.m34874b(e10, "Unable to call %s on %s.", "removeSessionManagerListener", InterfaceC5966k0.class.getSimpleName());
        }
    }

    /* renamed from: f */
    public final InterfaceC4993a m29361f() {
        try {
            return this.f33628a.mo29311b();
        } catch (RemoteException e10) {
            f33627c.m34874b(e10, "Unable to call %s on %s.", "getWrappedThis", InterfaceC5966k0.class.getSimpleName());
            return null;
        }
    }
}
