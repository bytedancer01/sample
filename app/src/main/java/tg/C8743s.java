package tg;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import org.apache.http.client.methods.HttpGet;
import tg.C8739o;
import ug.C9181f;
import ug.C9183h;
import vg.C9353h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tg/s.class
 */
/* renamed from: tg.s */
/* loaded from: combined.jar:classes2.jar:tg/s.class */
public final class C8743s {

    /* renamed from: a */
    public final String f40672a;

    /* renamed from: b */
    public final String f40673b;

    /* renamed from: c */
    public final C8739o f40674c;

    /* renamed from: d */
    public final AbstractC8744t f40675d;

    /* renamed from: e */
    public final Object f40676e;

    /* renamed from: f */
    public volatile URL f40677f;

    /* renamed from: g */
    public volatile URI f40678g;

    /* renamed from: h */
    public volatile C8728d f40679h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:tg/s$b.class
     */
    /* renamed from: tg.s$b */
    /* loaded from: combined.jar:classes2.jar:tg/s$b.class */
    public static class b {

        /* renamed from: a */
        public String f40680a;

        /* renamed from: b */
        public URL f40681b;

        /* renamed from: c */
        public String f40682c;

        /* renamed from: d */
        public C8739o.b f40683d;

        /* renamed from: e */
        public AbstractC8744t f40684e;

        /* renamed from: f */
        public Object f40685f;

        public b() {
            this.f40682c = HttpGet.METHOD_NAME;
            this.f40683d = new C8739o.b();
        }

        public b(C8743s c8743s) {
            this.f40680a = c8743s.f40672a;
            this.f40681b = c8743s.f40677f;
            this.f40682c = c8743s.f40673b;
            this.f40684e = c8743s.f40675d;
            this.f40685f = c8743s.f40676e;
            this.f40683d = c8743s.f40674c.m37400e();
        }

        /* renamed from: g */
        public b m37474g(String str, String str2) {
            this.f40683d.m37405b(str, str2);
            return this;
        }

        /* renamed from: h */
        public C8743s m37475h() {
            if (this.f40680a != null) {
                return new C8743s(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: i */
        public b m37476i(C8728d c8728d) {
            String c8728d2 = c8728d.toString();
            return c8728d2.isEmpty() ? m37480m("Cache-Control") : m37477j("Cache-Control", c8728d2);
        }

        /* renamed from: j */
        public b m37477j(String str, String str2) {
            this.f40683d.m37410g(str, str2);
            return this;
        }

        /* renamed from: k */
        public b m37478k(C8739o c8739o) {
            this.f40683d = c8739o.m37400e();
            return this;
        }

        /* renamed from: l */
        public b m37479l(String str, AbstractC8744t abstractC8744t) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            }
            if (abstractC8744t != null && !C9353h.m39465b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            }
            AbstractC8744t abstractC8744t2 = abstractC8744t;
            if (abstractC8744t == null) {
                abstractC8744t2 = abstractC8744t;
                if (C9353h.m39465b(str)) {
                    abstractC8744t2 = AbstractC8744t.m37483c(null, C9183h.f42012a);
                }
            }
            this.f40682c = str;
            this.f40684e = abstractC8744t2;
            return this;
        }

        /* renamed from: m */
        public b m37480m(String str) {
            this.f40683d.m37409f(str);
            return this;
        }

        /* renamed from: n */
        public b m37481n(String str) {
            if (str == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.f40680a = str;
            return this;
        }

        /* renamed from: o */
        public b m37482o(URL url) {
            if (url == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.f40681b = url;
            this.f40680a = url.toString();
            return this;
        }
    }

    public C8743s(b bVar) {
        this.f40672a = bVar.f40680a;
        this.f40673b = bVar.f40682c;
        this.f40674c = bVar.f40683d.m37408e();
        this.f40675d = bVar.f40684e;
        this.f40676e = bVar.f40685f != null ? bVar.f40685f : this;
        this.f40677f = bVar.f40681b;
    }

    /* renamed from: g */
    public AbstractC8744t m37457g() {
        return this.f40675d;
    }

    /* renamed from: h */
    public C8728d m37458h() {
        C8728d c8728d = this.f40679h;
        if (c8728d == null) {
            c8728d = C8728d.m37318h(this.f40674c);
            this.f40679h = c8728d;
        }
        return c8728d;
    }

    /* renamed from: i */
    public String m37459i(String str) {
        return this.f40674c.m37397a(str);
    }

    /* renamed from: j */
    public List<String> m37460j(String str) {
        return this.f40674c.m37403h(str);
    }

    /* renamed from: k */
    public C8739o m37461k() {
        return this.f40674c;
    }

    /* renamed from: l */
    public boolean m37462l() {
        return m37466p().getProtocol().equals(ClientConstants.DOMAIN_SCHEME);
    }

    /* renamed from: m */
    public String m37463m() {
        return this.f40673b;
    }

    /* renamed from: n */
    public b m37464n() {
        return new b();
    }

    /* renamed from: o */
    public URI m37465o() {
        try {
            URI uri = this.f40678g;
            if (uri == null) {
                uri = C9181f.m38667e().m38674j(m37466p());
                this.f40678g = uri;
            }
            return uri;
        } catch (URISyntaxException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    /* renamed from: p */
    public URL m37466p() {
        try {
            URL url = this.f40677f;
            if (url == null) {
                url = new URL(this.f40672a);
                this.f40677f = url;
            }
            return url;
        } catch (MalformedURLException e10) {
            throw new RuntimeException("Malformed URL: " + this.f40672a, e10);
        }
    }

    /* renamed from: q */
    public String m37467q() {
        return this.f40672a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(this.f40673b);
        sb2.append(", url=");
        sb2.append(this.f40672a);
        sb2.append(", tag=");
        Object obj = this.f40676e;
        if (obj == this) {
            obj = null;
        }
        sb2.append(obj);
        sb2.append('}');
        return sb2.toString();
    }
}
