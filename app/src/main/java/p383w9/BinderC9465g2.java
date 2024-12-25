package p383w9;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p350u9.C8804b;
import p384wa.C9551a;
import p384wa.C9555e;
import p384wa.InterfaceC9556f;
import p403xa.BinderC9696d;
import p403xa.C9704l;
import p422y9.C9902d;
import p422y9.C9930m0;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/g2.class
 */
/* renamed from: w9.g2 */
/* loaded from: combined.jar:classes2.jar:w9/g2.class */
public final class BinderC9465g2 extends BinderC9696d implements GoogleApiClient.InterfaceC2412b, GoogleApiClient.InterfaceC2413c {

    /* renamed from: i */
    public static final C2414a.a<? extends InterfaceC9556f, C9551a> f43278i = C9555e.f43526c;

    /* renamed from: b */
    public final Context f43279b;

    /* renamed from: c */
    public final Handler f43280c;

    /* renamed from: d */
    public final C2414a.a<? extends InterfaceC9556f, C9551a> f43281d;

    /* renamed from: e */
    public final Set<Scope> f43282e;

    /* renamed from: f */
    public final C9902d f43283f;

    /* renamed from: g */
    public InterfaceC9556f f43284g;

    /* renamed from: h */
    public InterfaceC9460f2 f43285h;

    public BinderC9465g2(Context context, Handler handler, C9902d c9902d) {
        C2414a.a<? extends InterfaceC9556f, C9551a> aVar = f43278i;
        this.f43279b = context;
        this.f43280c = handler;
        this.f43283f = (C9902d) C9935o.m41851k(c9902d, "ClientSettings must not be null");
        this.f43282e = c9902d.m41769e();
        this.f43281d = aVar;
    }

    /* renamed from: B1 */
    public static /* bridge */ /* synthetic */ void m39912B1(BinderC9465g2 binderC9465g2, C9704l c9704l) {
        C8804b m40807P = c9704l.m40807P();
        C8804b c8804b = m40807P;
        if (m40807P.m37663T()) {
            C9930m0 c9930m0 = (C9930m0) C9935o.m41850j(c9704l.m40808Q());
            c8804b = c9930m0.m41827P();
            if (c8804b.m37663T()) {
                binderC9465g2.f43285h.mo39864a(c9930m0.m41828Q(), binderC9465g2.f43282e);
                binderC9465g2.f43284g.disconnect();
            } else {
                String valueOf = String.valueOf(c8804b);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
            }
        }
        binderC9465g2.f43285h.mo39865b(c8804b);
        binderC9465g2.f43284g.disconnect();
    }

    /* renamed from: C1 */
    public final void m39914C1(InterfaceC9460f2 interfaceC9460f2) {
        InterfaceC9556f interfaceC9556f = this.f43284g;
        if (interfaceC9556f != null) {
            interfaceC9556f.disconnect();
        }
        this.f43283f.m41774j(Integer.valueOf(System.identityHashCode(this)));
        C2414a.a<? extends InterfaceC9556f, C9551a> aVar = this.f43281d;
        Context context = this.f43279b;
        Looper looper = this.f43280c.getLooper();
        C9902d c9902d = this.f43283f;
        this.f43284g = aVar.buildClient(context, looper, c9902d, (C9902d) c9902d.m41770f(), (GoogleApiClient.InterfaceC2412b) this, (GoogleApiClient.InterfaceC2413c) this);
        this.f43285h = interfaceC9460f2;
        Set<Scope> set = this.f43282e;
        if (set == null || set.isEmpty()) {
            this.f43280c.post(new RunnableC9450d2(this));
        } else {
            this.f43284g.mo40091c();
        }
    }

    /* renamed from: D1 */
    public final void m39915D1() {
        InterfaceC9556f interfaceC9556f = this.f43284g;
        if (interfaceC9556f != null) {
            interfaceC9556f.disconnect();
        }
    }

    @Override // p403xa.InterfaceC9698f
    /* renamed from: c1 */
    public final void mo39916c1(C9704l c9704l) {
        this.f43280c.post(new RunnableC9455e2(this, c9704l));
    }

    @Override // p383w9.InterfaceC9452e
    public final void onConnected(Bundle bundle) {
        this.f43284g.mo40089a(this);
    }

    @Override // p383w9.InterfaceC9487l
    public final void onConnectionFailed(C8804b c8804b) {
        this.f43285h.mo39865b(c8804b);
    }

    @Override // p383w9.InterfaceC9452e
    public final void onConnectionSuspended(int i10) {
        this.f43284g.disconnect();
    }
}
