package si;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kh.C5616j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.EnumC5404c0;
import p339ti.C8750a;
import p339ti.C8751b;
import p339ti.C8755f;
import p339ti.C8756g;
import p339ti.C8758i;
import p339ti.C8759j;
import p339ti.InterfaceC8760k;
import p372vh.C9365d;
import p372vh.C9367f;
import vi.AbstractC9378c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:si/a.class
 */
/* renamed from: si.a */
/* loaded from: combined.jar:classes2.jar:si/a.class */
public final class C8579a extends C8588j {

    /* renamed from: e */
    public static final boolean f40010e;

    /* renamed from: f */
    public static final a f40011f = new a(null);

    /* renamed from: d */
    public final List<InterfaceC8760k> f40012d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:si/a$a.class
     */
    /* renamed from: si.a$a */
    /* loaded from: combined.jar:classes2.jar:si/a$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @Nullable
        /* renamed from: a */
        public final C8588j m36839a() {
            return m36840b() ? new C8579a() : null;
        }

        /* renamed from: b */
        public final boolean m36840b() {
            return C8579a.f40010e;
        }
    }

    static {
        f40010e = C8588j.f40042c.m36881h() && Build.VERSION.SDK_INT >= 29;
    }

    public C8579a() {
        List m27703i = C5616j.m27703i(C8750a.f40712a.m37547a(), new C8759j(C8755f.f40721g.m37561d()), new C8759j(C8758i.f40735b.m37570a()), new C8759j(C8756g.f40729b.m37565a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : m27703i) {
            if (((InterfaceC8760k) obj).mo37544b()) {
                arrayList.add(obj);
            }
        }
        this.f40012d = arrayList;
    }

    @Override // si.C8588j
    @NotNull
    /* renamed from: c */
    public AbstractC9378c mo36835c(@NotNull X509TrustManager x509TrustManager) {
        C9367f.m39526e(x509TrustManager, "trustManager");
        C8751b m37550a = C8751b.f40713d.m37550a(x509TrustManager);
        return m37550a != null ? m37550a : super.mo36835c(x509TrustManager);
    }

    @Override // si.C8588j
    /* renamed from: e */
    public void mo36836e(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends EnumC5404c0> list) {
        Object obj;
        C9367f.m39526e(sSLSocket, "sslSocket");
        C9367f.m39526e(list, "protocols");
        Iterator<T> it = this.f40012d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((InterfaceC8760k) obj).mo37543a(sSLSocket)) {
                    break;
                }
            }
        }
        InterfaceC8760k interfaceC8760k = (InterfaceC8760k) obj;
        if (interfaceC8760k != null) {
            interfaceC8760k.mo37546d(sSLSocket, str, list);
        }
    }

    @Override // si.C8588j
    @Nullable
    /* renamed from: g */
    public String mo36837g(@NotNull SSLSocket sSLSocket) {
        Object obj;
        C9367f.m39526e(sSLSocket, "sslSocket");
        Iterator<T> it = this.f40012d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((InterfaceC8760k) obj).mo37543a(sSLSocket)) {
                break;
            }
        }
        InterfaceC8760k interfaceC8760k = (InterfaceC8760k) obj;
        String str = null;
        if (interfaceC8760k != null) {
            str = interfaceC8760k.mo37545c(sSLSocket);
        }
        return str;
    }

    @Override // si.C8588j
    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public boolean mo36838i(@NotNull String str) {
        boolean isCleartextTrafficPermitted;
        C9367f.m39526e(str, "hostname");
        isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        return isCleartextTrafficPermitted;
    }
}
