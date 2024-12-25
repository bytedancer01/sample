package tg;

import java.io.IOException;
import java.net.ProtocolException;
import org.apache.http.protocol.HTTP;
import p411xi.InterfaceC9763g;
import tg.C8743s;
import vg.C9352g;
import vg.C9355j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tg/e.class
 */
/* renamed from: tg.e */
/* loaded from: combined.jar:classes2.jar:tg/e.class */
public class C8729e {

    /* renamed from: a */
    public final C8741q f40595a;

    /* renamed from: b */
    public int f40596b;

    /* renamed from: c */
    public boolean f40597c;

    /* renamed from: d */
    public volatile boolean f40598d;

    /* renamed from: e */
    public C8743s f40599e;

    /* renamed from: f */
    public C9352g f40600f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:tg/e$a.class
     */
    /* renamed from: tg.e$a */
    /* loaded from: combined.jar:classes2.jar:tg/e$a.class */
    public static class a extends AbstractC8746v {

        /* renamed from: b */
        public final C8745u f40601b;

        /* renamed from: c */
        public final InterfaceC9763g f40602c;

        public a(C8745u c8745u, InterfaceC9763g interfaceC9763g) {
            this.f40601b = c8745u;
            this.f40602c = interfaceC9763g;
        }

        @Override // tg.AbstractC8746v
        /* renamed from: l */
        public long mo37310l() {
            return C9355j.m39480e(this.f40601b);
        }

        @Override // tg.AbstractC8746v
        /* renamed from: o */
        public InterfaceC9763g mo37311o() {
            return this.f40602c;
        }
    }

    public C8729e(C8741q c8741q, C8743s c8743s) {
        this.f40595a = c8741q.m37421c();
        this.f40599e = c8743s;
    }

    /* renamed from: a */
    public C8745u m37331a() {
        synchronized (this) {
            if (this.f40597c) {
                throw new IllegalStateException("Already Executed");
            }
            this.f40597c = true;
        }
        try {
            this.f40595a.m37429l().m37389a(this);
            C8745u m37332b = m37332b();
            this.f40600f.m39461v();
            if (m37332b != null) {
                return m37332b;
            }
            throw new IOException("Canceled");
        } finally {
            this.f40595a.m37429l().m37390b(this);
        }
    }

    /* renamed from: b */
    public final C8745u m37332b() {
        AbstractC8744t m37457g = this.f40599e.m37457g();
        if (m37457g != null) {
            C8743s.b m37464n = this.f40599e.m37464n();
            m37457g.mo37485b();
            long mo37484a = m37457g.mo37484a();
            if (mo37484a != -1) {
                m37464n.m37477j("Content-Length", Long.toString(mo37484a));
                m37464n.m37480m("Transfer-Encoding");
            } else {
                m37464n.m37477j("Transfer-Encoding", HTTP.CHUNK_CODING);
                m37464n.m37480m("Content-Length");
            }
            this.f40599e = m37464n.m37475h();
        }
        C9352g c9352g = new C9352g(this.f40595a, this.f40599e, false, null, null, null, null);
        while (true) {
            this.f40600f = c9352g;
            while (!this.f40598d) {
                try {
                    this.f40600f.m39463x();
                    if (this.f40599e.m37457g() != null) {
                        this.f40599e.m37457g().mo37486d(this.f40600f.m39445e());
                    }
                    this.f40600f.m39458s();
                    C8745u m39449i = this.f40600f.m39449i();
                    C8743s m39444d = this.f40600f.m39444d();
                    if (m39444d == null) {
                        this.f40600f.m39461v();
                        return m39449i.m37509w().m37523l(new a(m39449i, this.f40600f.m39450j())).m37524m();
                    }
                    if (this.f40600f.m39449i().m37506t()) {
                        int i10 = this.f40596b + 1;
                        this.f40596b = i10;
                        if (i10 > 20) {
                            throw new ProtocolException("Too many redirects: " + this.f40596b);
                        }
                    }
                    if (!this.f40600f.m39462w(m39444d.m37466p())) {
                        this.f40600f.m39461v();
                    }
                    C8733i m39442a = this.f40600f.m39442a();
                    this.f40599e = m39444d;
                    c9352g = new C9352g(this.f40595a, this.f40599e, false, m39442a, null, null, m39449i);
                } catch (IOException e10) {
                    C9352g m39460u = this.f40600f.m39460u(e10, null);
                    if (m39460u == null) {
                        throw e10;
                    }
                    this.f40600f = m39460u;
                }
            }
            return null;
        }
    }
}
