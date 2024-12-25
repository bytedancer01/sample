package p274pi;

import ci.C1128n;
import java.util.List;
import kh.C5616j;
import ki.C5634b;
import org.apache.http.HttpHeaders;
import org.apache.http.cookie.InterfaceC7038SM;
import org.apache.http.protocol.HTTP;
import org.jetbrains.annotations.NotNull;
import p173ji.AbstractC5408e0;
import p173ji.AbstractC5412g0;
import p173ji.C5406d0;
import p173ji.C5410f0;
import p173ji.C5424o;
import p173ji.C5435z;
import p173ji.InterfaceC5425p;
import p173ji.InterfaceC5434y;
import p372vh.C9367f;
import p411xi.C9769m;
import p411xi.C9772p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pi/a.class
 */
/* renamed from: pi.a */
/* loaded from: combined.jar:classes2.jar:pi/a.class */
public final class C7724a implements InterfaceC5434y {

    /* renamed from: a */
    public final InterfaceC5425p f37490a;

    public C7724a(@NotNull InterfaceC5425p interfaceC5425p) {
        C9367f.m39526e(interfaceC5425p, "cookieJar");
        this.f37490a = interfaceC5425p;
    }

    /* renamed from: a */
    public final String m33724a(List<C5424o> list) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            if (i10 < 0) {
                C5616j.m27707m();
            }
            C5424o c5424o = (C5424o) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(c5424o.m27015e());
            sb2.append('=');
            sb2.append(c5424o.m27017g());
            i10++;
        }
        String sb3 = sb2.toString();
        C9367f.m39525d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    @Override // p173ji.InterfaceC5434y
    @NotNull
    public C5410f0 intercept(@NotNull InterfaceC5434y.a aVar) {
        AbstractC5412g0 m26920f;
        C9367f.m39526e(aVar, "chain");
        C5406d0 request = aVar.request();
        C5406d0.a m26878h = request.m26878h();
        AbstractC5408e0 m26871a = request.m26871a();
        if (m26871a != null) {
            C5435z mo22936b = m26871a.mo22936b();
            if (mo22936b != null) {
                m26878h.m26886f("Content-Type", mo22936b.toString());
            }
            long mo22935a = m26871a.mo22935a();
            if (mo22935a != -1) {
                m26878h.m26886f("Content-Length", String.valueOf(mo22935a));
                m26878h.m26890j("Transfer-Encoding");
            } else {
                m26878h.m26886f("Transfer-Encoding", HTTP.CHUNK_CODING);
                m26878h.m26890j("Content-Length");
            }
        }
        if (request.m26874d("Host") == null) {
            m26878h.m26886f("Host", C5634b.m27772P(request.m26880j(), false, 1, null));
        }
        if (request.m26874d("Connection") == null) {
            m26878h.m26886f("Connection", HTTP.CONN_KEEP_ALIVE);
        }
        boolean z10 = false;
        if (request.m26874d(HttpHeaders.ACCEPT_ENCODING) == null) {
            z10 = false;
            if (request.m26874d("Range") == null) {
                m26878h.m26886f(HttpHeaders.ACCEPT_ENCODING, "gzip");
                z10 = true;
            }
        }
        List<C5424o> mo27026a = this.f37490a.mo27026a(request.m26880j());
        if (!mo27026a.isEmpty()) {
            m26878h.m26886f(InterfaceC7038SM.COOKIE, m33724a(mo27026a));
        }
        if (request.m26874d("User-Agent") == null) {
            m26878h.m26886f("User-Agent", "okhttp/4.9.3");
        }
        C5410f0 mo27169a = aVar.mo27169a(m26878h.m26883b());
        C7728e.m33741f(this.f37490a, request.m26880j(), mo27169a.m26923o0());
        C5410f0.a m26949r = mo27169a.m26914B0().m26949r(request);
        if (z10 && C1128n.m6719l("gzip", C5410f0.m26912B(mo27169a, "Content-Encoding", null, 2, null), true) && C7728e.m33737b(mo27169a) && (m26920f = mo27169a.m26920f()) != null) {
            C9769m c9769m = new C9769m(m26920f.mo22899v());
            m26949r.m26942k(mo27169a.m26923o0().m27084f().m27094h("Content-Encoding").m27094h("Content-Length").m27092f());
            m26949r.m26933b(new C7731h(C5410f0.m26912B(mo27169a, "Content-Type", null, 2, null), -1L, C9772p.m41229c(c9769m)));
        }
        return m26949r.m26934c();
    }
}
