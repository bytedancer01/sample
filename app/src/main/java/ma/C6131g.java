package ma;

import android.app.Service;
import android.content.Context;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.services.p045s3.internal.Constants;
import com.google.android.gms.dynamite.DynamiteModule;
import ga.BinderC4994b;
import ga.InterfaceC4993a;
import java.util.Map;
import p216m9.C5941c;
import p216m9.C5956h;
import p216m9.InterfaceC5936a0;
import p216m9.InterfaceC5951f0;
import p216m9.InterfaceC5960i0;
import p216m9.InterfaceC5979o1;
import p216m9.InterfaceC5984q0;
import p216m9.InterfaceC5988r1;
import p244o9.InterfaceC6939i;
import p244o9.InterfaceC6941k;
import p304r9.C8015b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/g.class
 */
/* renamed from: ma.g */
/* loaded from: combined.jar:classes2.jar:ma/g.class */
public final class C6131g {

    /* renamed from: a */
    public static final C8015b f33781a = new C8015b("CastDynamiteModule");

    /* renamed from: a */
    public static InterfaceC5988r1 m29612a(Context context, C5941c c5941c, InterfaceC6257m interfaceC6257m, Map map) {
        return m29617f(context).mo29765D0(BinderC4994b.m25160B1(context.getApplicationContext()), c5941c, interfaceC6257m, map);
    }

    /* renamed from: b */
    public static InterfaceC5936a0 m29613b(Context context, C5941c c5941c, InterfaceC4993a interfaceC4993a, InterfaceC5979o1 interfaceC5979o1) {
        if (interfaceC4993a == null) {
            return null;
        }
        try {
            return m29617f(context).mo29769t0(c5941c, interfaceC4993a, interfaceC5979o1);
        } catch (RemoteException | C5956h e10) {
            f33781a.m34874b(e10, "Unable to call %s on %s.", "newCastSessionImpl", InterfaceC6215k.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: c */
    public static InterfaceC5951f0 m29614c(Service service, InterfaceC4993a interfaceC4993a, InterfaceC4993a interfaceC4993a2) {
        if (interfaceC4993a == null || interfaceC4993a2 == null) {
            return null;
        }
        try {
            return m29617f(service.getApplicationContext()).mo29766Y(BinderC4994b.m25160B1(service), interfaceC4993a, interfaceC4993a2);
        } catch (RemoteException | C5956h e10) {
            f33781a.m34874b(e10, "Unable to call %s on %s.", "newReconnectionServiceImpl", InterfaceC6215k.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: d */
    public static InterfaceC5960i0 m29615d(Context context, String str, String str2, InterfaceC5984q0 interfaceC5984q0) {
        try {
            return m29617f(context).mo29768s1(str, str2, interfaceC5984q0);
        } catch (RemoteException | C5956h e10) {
            f33781a.m34874b(e10, "Unable to call %s on %s.", "newSessionImpl", InterfaceC6215k.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: e */
    public static InterfaceC6939i m29616e(Context context, AsyncTask asyncTask, InterfaceC6941k interfaceC6941k, int i10, int i11, boolean z10, long j10, int i12, int i13, int i14) {
        try {
            return m29617f(context.getApplicationContext()).mo29767q0(BinderC4994b.m25160B1(asyncTask), interfaceC6941k, i10, i11, false, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 5, 333, Constants.MAXIMUM_UPLOAD_PARTS);
        } catch (RemoteException | C5956h e10) {
            f33781a.m34874b(e10, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", InterfaceC6215k.class.getSimpleName());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [ma.k] */
    /* renamed from: f */
    public static InterfaceC6215k m29617f(Context context) {
        C6194j c6194j;
        try {
            IBinder m13182d = DynamiteModule.m13174e(context, DynamiteModule.f14835b, "com.google.android.gms.cast.framework.dynamite").m13182d("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (m13182d == null) {
                c6194j = null;
            } else {
                IInterface queryLocalInterface = m13182d.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                c6194j = queryLocalInterface instanceof InterfaceC6215k ? (InterfaceC6215k) queryLocalInterface : new C6194j(m13182d);
            }
            return c6194j;
        } catch (DynamiteModule.C2419a e10) {
            throw new C5956h(e10);
        }
    }
}
