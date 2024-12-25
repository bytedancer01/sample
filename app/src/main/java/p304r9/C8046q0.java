package p304r9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p200l9.C5754d;
import p200l9.C5758e;
import p200l9.C5824z;
import p350u9.C8804b;
import p383w9.InterfaceC9447d;
import p422y9.AbstractC9911g;
import p422y9.C9902d;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/q0.class
 */
/* renamed from: r9.q0 */
/* loaded from: combined.jar:classes2.jar:r9/q0.class */
public final class C8046q0 extends AbstractC9911g {

    /* renamed from: b */
    public C5754d f38853b;

    /* renamed from: c */
    public final CastDevice f38854c;

    /* renamed from: d */
    public final C5758e.d f38855d;

    /* renamed from: e */
    public final Map f38856e;

    /* renamed from: f */
    public final long f38857f;

    /* renamed from: g */
    public final Bundle f38858g;

    /* renamed from: h */
    public BinderC8044p0 f38859h;

    /* renamed from: i */
    public String f38860i;

    /* renamed from: j */
    public boolean f38861j;

    /* renamed from: k */
    public boolean f38862k;

    /* renamed from: l */
    public boolean f38863l;

    /* renamed from: m */
    public boolean f38864m;

    /* renamed from: n */
    public double f38865n;

    /* renamed from: o */
    public C5824z f38866o;

    /* renamed from: p */
    public int f38867p;

    /* renamed from: q */
    public int f38868q;

    /* renamed from: r */
    public final AtomicLong f38869r;

    /* renamed from: s */
    public String f38870s;

    /* renamed from: t */
    public String f38871t;

    /* renamed from: u */
    public Bundle f38872u;

    /* renamed from: v */
    public final Map f38873v;

    /* renamed from: w */
    public InterfaceC9447d f38874w;

    /* renamed from: x */
    public InterfaceC9447d f38875x;

    /* renamed from: y */
    public static final C8015b f38851y = new C8015b("CastClientImpl");

    /* renamed from: z */
    public static final Object f38852z = new Object();

    /* renamed from: A */
    public static final Object f38850A = new Object();

    public C8046q0(Context context, Looper looper, C9902d c9902d, CastDevice castDevice, long j10, C5758e.d dVar, Bundle bundle, GoogleApiClient.InterfaceC2412b interfaceC2412b, GoogleApiClient.InterfaceC2413c interfaceC2413c) {
        super(context, looper, 10, c9902d, interfaceC2412b, interfaceC2413c);
        this.f38854c = castDevice;
        this.f38855d = dVar;
        this.f38857f = j10;
        this.f38858g = bundle;
        this.f38856e = new HashMap();
        this.f38869r = new AtomicLong(0L);
        this.f38873v = new HashMap();
        m34929q();
        m34933u();
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ void m34919l(C8046q0 c8046q0, C8017c c8017c) {
        boolean z10;
        String m34882P = c8017c.m34882P();
        if (C8013a.m34870k(m34882P, c8046q0.f38860i)) {
            z10 = false;
        } else {
            c8046q0.f38860i = m34882P;
            z10 = true;
        }
        f38851y.m34873a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(c8046q0.f38862k));
        C5758e.d dVar = c8046q0.f38855d;
        if (dVar != null && (z10 || c8046q0.f38862k)) {
            dVar.mo28186d();
        }
        c8046q0.f38862k = false;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m34920m(C8046q0 c8046q0, C8021e c8021e) {
        boolean z10;
        boolean z11;
        boolean z12;
        C5754d m34887T = c8021e.m34887T();
        if (!C8013a.m34870k(m34887T, c8046q0.f38853b)) {
            c8046q0.f38853b = m34887T;
            c8046q0.f38855d.mo28185c(m34887T);
        }
        double m34884Q = c8021e.m34884Q();
        if (Double.isNaN(m34884Q) || Math.abs(m34884Q - c8046q0.f38865n) <= 1.0E-7d) {
            z10 = false;
        } else {
            c8046q0.f38865n = m34884Q;
            z10 = true;
        }
        boolean m34889V = c8021e.m34889V();
        if (m34889V != c8046q0.f38861j) {
            c8046q0.f38861j = m34889V;
            z10 = true;
        }
        Double.isNaN(c8021e.m34883P());
        C8015b c8015b = f38851y;
        c8015b.m34873a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(c8046q0.f38863l));
        C5758e.d dVar = c8046q0.f38855d;
        if (dVar != null && (z10 || c8046q0.f38863l)) {
            dVar.mo28189g();
        }
        int m34885R = c8021e.m34885R();
        if (m34885R != c8046q0.f38867p) {
            c8046q0.f38867p = m34885R;
            z11 = true;
        } else {
            z11 = false;
        }
        c8015b.m34873a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(c8046q0.f38863l));
        C5758e.d dVar2 = c8046q0.f38855d;
        if (dVar2 != null && (z11 || c8046q0.f38863l)) {
            dVar2.mo28183a(c8046q0.f38867p);
        }
        int m34886S = c8021e.m34886S();
        if (m34886S != c8046q0.f38868q) {
            c8046q0.f38868q = m34886S;
            z12 = true;
        } else {
            z12 = false;
        }
        c8015b.m34873a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(c8046q0.f38863l));
        C5758e.d dVar3 = c8046q0.f38855d;
        if (dVar3 != null && (z12 || c8046q0.f38863l)) {
            dVar3.mo28188f(c8046q0.f38868q);
        }
        if (!C8013a.m34870k(c8046q0.f38866o, c8021e.m34888U())) {
            c8046q0.f38866o = c8021e.m34888U();
        }
        c8046q0.f38863l = false;
    }

    @Override // p422y9.AbstractC9899c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        C8029i c8029i;
        if (iBinder == null) {
            c8029i = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
            c8029i = queryLocalInterface instanceof C8029i ? (C8029i) queryLocalInterface : new C8029i(iBinder);
        }
        return c8029i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p422y9.AbstractC9899c, com.google.android.gms.common.api.C2414a.f
    public final void disconnect() {
        C8015b c8015b = f38851y;
        c8015b.m34873a("disconnect(); ServiceListener=%s, isConnected=%b", this.f38859h, Boolean.valueOf(isConnected()));
        BinderC8044p0 binderC8044p0 = this.f38859h;
        this.f38859h = null;
        if (binderC8044p0 == null || binderC8044p0.m34911y0() == null) {
            c8015b.m34873a("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        m34930r();
        try {
            try {
                ((C8029i) getService()).m34902d();
            } catch (RemoteException | IllegalStateException e10) {
                f38851y.m34874b(e10, "Error while disconnecting the controller interface", new Object[0]);
            }
        } finally {
            super.disconnect();
        }
    }

    @Override // p422y9.AbstractC9899c
    public final Bundle getConnectionHint() {
        Bundle bundle = this.f38872u;
        if (bundle == null) {
            return super.getConnectionHint();
        }
        this.f38872u = null;
        return bundle;
    }

    @Override // p422y9.AbstractC9899c
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        f38851y.m34873a("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.f38870s, this.f38871t);
        this.f38854c.m13046X(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f38857f);
        Bundle bundle2 = this.f38858g;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        this.f38859h = new BinderC8044p0(this);
        bundle.putParcelable("listener", new BinderWrapper(this.f38859h));
        String str = this.f38870s;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.f38871t;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override // p422y9.AbstractC9899c, com.google.android.gms.common.api.C2414a.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // p422y9.AbstractC9899c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // p422y9.AbstractC9899c
    public final String getStartServiceAction() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // p422y9.AbstractC9899c
    public final void onConnectionFailed(C8804b c8804b) {
        super.onConnectionFailed(c8804b);
        m34930r();
    }

    @Override // p422y9.AbstractC9899c
    public final void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        f38851y.m34873a("in onPostInitHandler; statusCode=%d", Integer.valueOf(i10));
        if (i10 == 0 || i10 == 2300) {
            this.f38864m = true;
            this.f38862k = true;
            this.f38863l = true;
        } else {
            this.f38864m = false;
        }
        int i12 = i10;
        if (i10 == 2300) {
            Bundle bundle2 = new Bundle();
            this.f38872u = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i12 = 0;
        }
        super.onPostInitHandler(i12, iBinder, bundle, i11);
    }

    /* renamed from: p */
    public final void m34928p(int i10) {
        synchronized (f38852z) {
            InterfaceC9447d interfaceC9447d = this.f38874w;
            if (interfaceC9447d != null) {
                interfaceC9447d.mo13164a(new C8034k0(new Status(i10), null, null, null, false));
                this.f38874w = null;
            }
        }
    }

    /* renamed from: q */
    public final void m34929q() {
        this.f38864m = false;
        this.f38867p = -1;
        this.f38868q = -1;
        this.f38853b = null;
        this.f38860i = null;
        this.f38865n = 0.0d;
        m34933u();
        this.f38861j = false;
        this.f38866o = null;
    }

    /* renamed from: r */
    public final void m34930r() {
        f38851y.m34873a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.f38856e) {
            this.f38856e.clear();
        }
    }

    /* renamed from: s */
    public final void m34931s(long j10, int i10) {
        InterfaceC9447d interfaceC9447d;
        synchronized (this.f38873v) {
            interfaceC9447d = (InterfaceC9447d) this.f38873v.remove(Long.valueOf(j10));
        }
        if (interfaceC9447d != null) {
            interfaceC9447d.mo13164a(new Status(i10));
        }
    }

    /* renamed from: t */
    public final void m34932t(int i10) {
        synchronized (f38850A) {
            InterfaceC9447d interfaceC9447d = this.f38875x;
            if (interfaceC9447d != null) {
                interfaceC9447d.mo13164a(new Status(i10));
                this.f38875x = null;
            }
        }
    }

    /* renamed from: u */
    public final double m34933u() {
        C9935o.m41851k(this.f38854c, "device should not be null");
        if (this.f38854c.m13045W(2048)) {
            return 0.02d;
        }
        return (!this.f38854c.m13045W(4) || this.f38854c.m13045W(1) || "Chromecast Audio".equals(this.f38854c.m13043U())) ? 0.05d : 0.02d;
    }
}
