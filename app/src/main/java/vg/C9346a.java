package vg;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.util.List;
import tg.C8731g;
import tg.C8736l;
import tg.C8743s;
import tg.C8745u;
import tg.InterfaceC8726b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vg/a.class
 */
/* renamed from: vg.a */
/* loaded from: combined.jar:classes2.jar:vg/a.class */
public final class C9346a implements InterfaceC8726b {

    /* renamed from: a */
    public static final InterfaceC8726b f42787a = new C9346a();

    @Override // tg.InterfaceC8726b
    /* renamed from: a */
    public C8743s mo37282a(Proxy proxy, C8745u c8745u) {
        List<C8731g> m37500n = c8745u.m37500n();
        C8743s m37511y = c8745u.m37511y();
        URL m37466p = m37511y.m37466p();
        int size = m37500n.size();
        for (int i10 = 0; i10 < size; i10++) {
            C8731g c8731g = m37500n.get(i10);
            if ("Basic".equalsIgnoreCase(c8731g.m37338b())) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), m39390c(proxy, m37466p), inetSocketAddress.getPort(), m37466p.getProtocol(), c8731g.m37337a(), c8731g.m37338b(), m37466p, Authenticator.RequestorType.PROXY);
                if (requestPasswordAuthentication != null) {
                    return m37511y.m37464n().m37477j("Proxy-Authorization", C8736l.m37388a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()))).m37475h();
                }
            }
        }
        return null;
    }

    @Override // tg.InterfaceC8726b
    /* renamed from: b */
    public C8743s mo37283b(Proxy proxy, C8745u c8745u) {
        PasswordAuthentication requestPasswordAuthentication;
        List<C8731g> m37500n = c8745u.m37500n();
        C8743s m37511y = c8745u.m37511y();
        URL m37466p = m37511y.m37466p();
        int size = m37500n.size();
        for (int i10 = 0; i10 < size; i10++) {
            C8731g c8731g = m37500n.get(i10);
            if ("Basic".equalsIgnoreCase(c8731g.m37338b()) && (requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(m37466p.getHost(), m39390c(proxy, m37466p), m37466p.getPort(), m37466p.getProtocol(), c8731g.m37337a(), c8731g.m37338b(), m37466p, Authenticator.RequestorType.SERVER)) != null) {
                return m37511y.m37464n().m37477j("Authorization", C8736l.m37388a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()))).m37475h();
            }
        }
        return null;
    }

    /* renamed from: c */
    public final InetAddress m39390c(Proxy proxy, URL url) {
        return (proxy == null || proxy.type() == Proxy.Type.DIRECT) ? InetAddress.getByName(url.getHost()) : ((InetSocketAddress) proxy.address()).getAddress();
    }
}
