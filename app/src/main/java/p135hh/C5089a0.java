package p135hh;

import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import p083eh.C4726a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/a0.class
 */
/* renamed from: hh.a0 */
/* loaded from: combined.jar:classes2.jar:hh/a0.class */
public class C5089a0 {
    /* renamed from: a */
    public static SocketAddress m25398a(C4726a c4726a) {
        try {
            Proxy m25399b = m25399b(new URL(String.format("https://%s:%s", c4726a.f27851q0, c4726a.f27853r0)));
            if (m25399b == null) {
                return null;
            }
            SocketAddress address = m25399b.address();
            if (address instanceof InetSocketAddress) {
                return address;
            }
            return null;
        } catch (MalformedURLException e10) {
            C5095d0.m25472o(2132017825, e10.getLocalizedMessage());
            return null;
        } catch (URISyntaxException e11) {
            C5095d0.m25472o(2132017825, e11.getLocalizedMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static Proxy m25399b(URL url) {
        System.setProperty("java.net.useSystemProxies", "true");
        List<Proxy> select = ProxySelector.getDefault().select(url.toURI());
        if (select == null) {
            return null;
        }
        for (Proxy proxy : select) {
            if (proxy.address() != null) {
                return proxy;
            }
        }
        return null;
    }
}
