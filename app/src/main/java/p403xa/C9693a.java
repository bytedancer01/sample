package p403xa;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import p165j9.C5341a;
import p350u9.C8804b;
import p350u9.C8822k;
import p384wa.InterfaceC9556f;
import p422y9.AbstractC9899c;
import p422y9.AbstractC9911g;
import p422y9.C9902d;
import p422y9.C9924k0;
import p422y9.C9935o;
import p422y9.InterfaceC9917i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xa/a.class
 */
/* renamed from: xa.a */
/* loaded from: combined.jar:classes2.jar:xa/a.class */
public class C9693a extends AbstractC9911g<C9699g> implements InterfaceC9556f {

    /* renamed from: f */
    public static final int f44235f = 0;

    /* renamed from: b */
    public final boolean f44236b;

    /* renamed from: c */
    public final C9902d f44237c;

    /* renamed from: d */
    public final Bundle f44238d;

    /* renamed from: e */
    public final Integer f44239e;

    public C9693a(Context context, Looper looper, boolean z10, C9902d c9902d, Bundle bundle, GoogleApiClient.InterfaceC2412b interfaceC2412b, GoogleApiClient.InterfaceC2413c interfaceC2413c) {
        super(context, looper, 44, c9902d, interfaceC2412b, interfaceC2413c);
        this.f44236b = true;
        this.f44237c = c9902d;
        this.f44238d = bundle;
        this.f44239e = c9902d.m41771g();
    }

    /* renamed from: e */
    public static Bundle m40803e(C9902d c9902d) {
        c9902d.m41770f();
        Integer m41771g = c9902d.m41771g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c9902d.m41765a());
        if (m41771g != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", m41771g.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p384wa.InterfaceC9556f
    /* renamed from: a */
    public final void mo40089a(InterfaceC9698f interfaceC9698f) {
        C9935o.m41851k(interfaceC9698f, "Expecting a valid ISignInCallbacks");
        try {
            Account m41766b = this.f44237c.m41766b();
            ((C9699g) getService()).m40806D1(new C9702j(1, new C9924k0(m41766b, ((Integer) C9935o.m41850j(this.f44239e)).intValue(), AbstractC9899c.DEFAULT_ACCOUNT.equals(m41766b.name) ? C5341a.m26618a(getContext()).m26620b() : null)), interfaceC9698f);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                interfaceC9698f.mo39916c1(new C9704l(1, new C8804b(8, null), null));
            } catch (RemoteException e11) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p384wa.InterfaceC9556f
    /* renamed from: b */
    public final void mo40090b() {
        try {
            ((C9699g) getService()).m40804B1(((Integer) C9935o.m41850j(this.f44239e)).intValue());
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // p384wa.InterfaceC9556f
    /* renamed from: c */
    public final void mo40091c() {
        connect(new AbstractC9899c.d(this));
    }

    @Override // p422y9.AbstractC9899c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        C9699g c9699g;
        if (iBinder == null) {
            c9699g = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            c9699g = queryLocalInterface instanceof C9699g ? (C9699g) queryLocalInterface : new C9699g(iBinder);
        }
        return c9699g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p384wa.InterfaceC9556f
    /* renamed from: d */
    public final void mo40092d(InterfaceC9917i interfaceC9917i, boolean z10) {
        try {
            ((C9699g) getService()).m40805C1(interfaceC9917i, ((Integer) C9935o.m41850j(this.f44239e)).intValue(), z10);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // p422y9.AbstractC9899c
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f44237c.m41768d())) {
            this.f44238d.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f44237c.m41768d());
        }
        return this.f44238d;
    }

    @Override // p422y9.AbstractC9899c, com.google.android.gms.common.api.C2414a.f
    public final int getMinApkVersion() {
        return C8822k.f40857a;
    }

    @Override // p422y9.AbstractC9899c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // p422y9.AbstractC9899c
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // p422y9.AbstractC9899c, com.google.android.gms.common.api.C2414a.f
    public final boolean requiresSignIn() {
        return this.f44236b;
    }
}
