package p428yg;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpHost;
import p428yg.AbstractC10019y;
import p428yg.C10014t;
import p428yg.InterfaceC10004j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/r.class
 */
/* renamed from: yg.r */
/* loaded from: combined.jar:classes2.jar:yg/r.class */
public class C10012r extends AbstractC10019y {

    /* renamed from: a */
    public final InterfaceC10004j f45880a;

    /* renamed from: b */
    public final C9989a0 f45881b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/r$a.class
     */
    /* renamed from: yg.r$a */
    /* loaded from: combined.jar:classes2.jar:yg/r$a.class */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public C10012r(InterfaceC10004j interfaceC10004j, C9989a0 c9989a0) {
        this.f45880a = interfaceC10004j;
        this.f45881b = c9989a0;
    }

    @Override // p428yg.AbstractC10019y
    /* renamed from: c */
    public boolean mo41998c(C10017w c10017w) {
        String scheme = c10017w.f45928d.getScheme();
        return HttpHost.DEFAULT_SCHEME_NAME.equals(scheme) || ClientConstants.DOMAIN_SCHEME.equals(scheme);
    }

    @Override // p428yg.AbstractC10019y
    /* renamed from: e */
    public int mo42100e() {
        return 2;
    }

    @Override // p428yg.AbstractC10019y
    /* renamed from: f */
    public AbstractC10019y.a mo41999f(C10017w c10017w, int i10) {
        InterfaceC10004j.a mo42032a = this.f45880a.mo42032a(c10017w.f45928d, c10017w.f45927c);
        if (mo42032a == null) {
            return null;
        }
        C10014t.e eVar = mo42032a.f45862c ? C10014t.e.DISK : C10014t.e.NETWORK;
        Bitmap m42089a = mo42032a.m42089a();
        if (m42089a != null) {
            return new AbstractC10019y.a(m42089a, eVar);
        }
        InputStream m42091c = mo42032a.m42091c();
        if (m42091c == null) {
            return null;
        }
        if (eVar == C10014t.e.DISK && mo42032a.m42090b() == 0) {
            C10001g0.m42041e(m42091c);
            throw new a("Received response with 0 content-length header.");
        }
        if (eVar == C10014t.e.NETWORK && mo42032a.m42090b() > 0) {
            this.f45881b.m41990f(mo42032a.m42090b());
        }
        return new AbstractC10019y.a(m42091c, eVar);
    }

    @Override // p428yg.AbstractC10019y
    /* renamed from: h */
    public boolean mo42101h(boolean z10, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // p428yg.AbstractC10019y
    /* renamed from: i */
    public boolean mo42102i() {
        return true;
    }
}
