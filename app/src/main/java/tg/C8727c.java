package tg;

import com.amplifyframework.core.model.ModelIdentifier;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.http.client.methods.HttpGet;
import p411xi.AbstractC9766j;
import p411xi.AbstractC9767k;
import p411xi.C9764h;
import p411xi.C9772p;
import p411xi.InterfaceC9756b0;
import p411xi.InterfaceC9762f;
import p411xi.InterfaceC9763g;
import p411xi.InterfaceC9782z;
import tg.C8739o;
import tg.C8743s;
import tg.C8745u;
import ug.C9176a;
import ug.C9183h;
import ug.InterfaceC9178c;
import vg.C9348c;
import vg.C9353h;
import vg.C9355j;
import vg.C9360o;
import vg.InterfaceC9347b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tg/c.class
 */
/* renamed from: tg.c */
/* loaded from: combined.jar:classes2.jar:tg/c.class */
public final class C8727c {

    /* renamed from: a */
    public final InterfaceC9178c f40546a = new a(this);

    /* renamed from: b */
    public final C9176a f40547b;

    /* renamed from: c */
    public int f40548c;

    /* renamed from: d */
    public int f40549d;

    /* renamed from: e */
    public int f40550e;

    /* renamed from: f */
    public int f40551f;

    /* renamed from: g */
    public int f40552g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:tg/c$a.class
     */
    /* renamed from: tg.c$a */
    /* loaded from: combined.jar:classes2.jar:tg/c$a.class */
    public class a implements InterfaceC9178c {

        /* renamed from: a */
        public final C8727c f40553a;

        public a(C8727c c8727c) {
            this.f40553a = c8727c;
        }

        @Override // ug.InterfaceC9178c
        /* renamed from: a */
        public InterfaceC9347b mo37301a(C8745u c8745u) {
            return this.f40553a.m37296k(c8745u);
        }

        @Override // ug.InterfaceC9178c
        /* renamed from: b */
        public void mo37302b(C9348c c9348c) {
            this.f40553a.m37299o(c9348c);
        }

        @Override // ug.InterfaceC9178c
        /* renamed from: c */
        public void mo37303c(C8745u c8745u, C8745u c8745u2) {
            this.f40553a.m37300p(c8745u, c8745u2);
        }

        @Override // ug.InterfaceC9178c
        /* renamed from: d */
        public void mo37304d(C8743s c8743s) {
            this.f40553a.m37297m(c8743s);
        }

        @Override // ug.InterfaceC9178c
        /* renamed from: e */
        public C8745u mo37305e(C8743s c8743s) {
            return this.f40553a.m37295j(c8743s);
        }

        @Override // ug.InterfaceC9178c
        /* renamed from: f */
        public void mo37306f() {
            this.f40553a.m37298n();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:tg/c$b.class
     */
    /* renamed from: tg.c$b */
    /* loaded from: combined.jar:classes2.jar:tg/c$b.class */
    public final class b implements InterfaceC9347b {

        /* renamed from: a */
        public final C9176a.c f40554a;

        /* renamed from: b */
        public InterfaceC9782z f40555b;

        /* renamed from: c */
        public boolean f40556c;

        /* renamed from: d */
        public InterfaceC9782z f40557d;

        /* renamed from: e */
        public final C8727c f40558e;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:tg/c$b$a.class
         */
        /* renamed from: tg.c$b$a */
        /* loaded from: combined.jar:classes2.jar:tg/c$b$a.class */
        public class a extends AbstractC9766j {

            /* renamed from: c */
            public final C8727c f40559c;

            /* renamed from: d */
            public final C9176a.c f40560d;

            /* renamed from: e */
            public final b f40561e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, InterfaceC9782z interfaceC9782z, C8727c c8727c, C9176a.c cVar) {
                super(interfaceC9782z);
                this.f40561e = bVar;
                this.f40559c = c8727c;
                this.f40560d = cVar;
            }

            @Override // p411xi.AbstractC9766j, p411xi.InterfaceC9782z, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                synchronized (this.f40561e.f40558e) {
                    if (this.f40561e.f40556c) {
                        return;
                    }
                    this.f40561e.f40556c = true;
                    C8727c.m37289g(this.f40561e.f40558e);
                    super.close();
                    this.f40560d.m38645e();
                }
            }
        }

        public b(C8727c c8727c, C9176a.c cVar) {
            this.f40558e = c8727c;
            this.f40554a = cVar;
            InterfaceC9782z m38646f = cVar.m38646f(1);
            this.f40555b = m38646f;
            this.f40557d = new a(this, m38646f, c8727c, cVar);
        }

        @Override // vg.InterfaceC9347b
        public void abort() {
            synchronized (this.f40558e) {
                if (this.f40556c) {
                    return;
                }
                this.f40556c = true;
                C8727c.m37290h(this.f40558e);
                C9183h.m38683c(this.f40555b);
                try {
                    this.f40554a.m38644a();
                } catch (IOException e10) {
                }
            }
        }

        @Override // vg.InterfaceC9347b
        public InterfaceC9782z body() {
            return this.f40557d;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:tg/c$c.class
     */
    /* renamed from: tg.c$c */
    /* loaded from: combined.jar:classes2.jar:tg/c$c.class */
    public static class c extends AbstractC8746v {

        /* renamed from: b */
        public final C9176a.e f40562b;

        /* renamed from: c */
        public final InterfaceC9763g f40563c;

        /* renamed from: d */
        public final String f40564d;

        /* renamed from: e */
        public final String f40565e;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:tg/c$c$a.class
         */
        /* renamed from: tg.c$c$a */
        /* loaded from: combined.jar:classes2.jar:tg/c$c$a.class */
        public class a extends AbstractC9767k {

            /* renamed from: c */
            public final C9176a.e f40566c;

            /* renamed from: d */
            public final c f40567d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, InterfaceC9756b0 interfaceC9756b0, C9176a.e eVar) {
                super(interfaceC9756b0);
                this.f40567d = cVar;
                this.f40566c = eVar;
            }

            @Override // p411xi.AbstractC9767k, p411xi.InterfaceC9756b0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f40566c.close();
                super.close();
            }
        }

        public c(C9176a.e eVar, String str, String str2) {
            this.f40562b = eVar;
            this.f40564d = str;
            this.f40565e = str2;
            this.f40563c = C9772p.m41229c(new a(this, eVar.m38662l(1), eVar));
        }

        @Override // tg.AbstractC8746v
        /* renamed from: l */
        public long mo37310l() {
            long j10;
            try {
                String str = this.f40565e;
                j10 = -1;
                if (str != null) {
                    j10 = Long.parseLong(str);
                }
            } catch (NumberFormatException e10) {
                j10 = -1;
            }
            return j10;
        }

        @Override // tg.AbstractC8746v
        /* renamed from: o */
        public InterfaceC9763g mo37311o() {
            return this.f40563c;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:tg/c$d.class
     */
    /* renamed from: tg.c$d */
    /* loaded from: combined.jar:classes2.jar:tg/c$d.class */
    public static final class d {

        /* renamed from: a */
        public final String f40568a;

        /* renamed from: b */
        public final C8739o f40569b;

        /* renamed from: c */
        public final String f40570c;

        /* renamed from: d */
        public final EnumC8742r f40571d;

        /* renamed from: e */
        public final int f40572e;

        /* renamed from: f */
        public final String f40573f;

        /* renamed from: g */
        public final C8739o f40574g;

        /* renamed from: h */
        public final C8738n f40575h;

        public d(C8745u c8745u) {
            this.f40568a = c8745u.m37511y().m37467q();
            this.f40569b = C9355j.m39488m(c8745u);
            this.f40570c = c8745u.m37511y().m37463m();
            this.f40571d = c8745u.m37510x();
            this.f40572e = c8745u.m37501o();
            this.f40573f = c8745u.m37507u();
            this.f40574g = c8745u.m37505s();
            this.f40575h = c8745u.m37502p();
        }

        public d(InterfaceC9756b0 interfaceC9756b0) {
            try {
                InterfaceC9763g m41229c = C9772p.m41229c(interfaceC9756b0);
                this.f40568a = m41229c.mo41143V();
                this.f40570c = m41229c.mo41143V();
                C8739o.b bVar = new C8739o.b();
                int m37292l = C8727c.m37292l(m41229c);
                for (int i10 = 0; i10 < m37292l; i10++) {
                    bVar.m37407d(m41229c.mo41143V());
                }
                this.f40569b = bVar.m37408e();
                C9360o m39518a = C9360o.m39518a(m41229c.mo41143V());
                this.f40571d = m39518a.f42895a;
                this.f40572e = m39518a.f42896b;
                this.f40573f = m39518a.f42897c;
                C8739o.b bVar2 = new C8739o.b();
                int m37292l2 = C8727c.m37292l(m41229c);
                for (int i11 = 0; i11 < m37292l2; i11++) {
                    bVar2.m37407d(m41229c.mo41143V());
                }
                this.f40574g = bVar2.m37408e();
                if (m37312a()) {
                    String mo41143V = m41229c.mo41143V();
                    if (mo41143V.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + mo41143V + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
                    }
                    this.f40575h = C8738n.m37391b(m41229c.mo41143V(), m37314c(m41229c), m37314c(m41229c));
                } else {
                    this.f40575h = null;
                }
            } finally {
                interfaceC9756b0.close();
            }
        }

        /* renamed from: a */
        public final boolean m37312a() {
            return this.f40568a.startsWith("https://");
        }

        /* renamed from: b */
        public boolean m37313b(C8743s c8743s, C8745u c8745u) {
            return this.f40568a.equals(c8743s.m37467q()) && this.f40570c.equals(c8743s.m37463m()) && C9355j.m39489n(c8745u, this.f40569b, c8743s);
        }

        /* renamed from: c */
        public final List<Certificate> m37314c(InterfaceC9763g interfaceC9763g) {
            int m37292l = C8727c.m37292l(interfaceC9763g);
            if (m37292l == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(m37292l);
                for (int i10 = 0; i10 < m37292l; i10++) {
                    arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(C9764h.m41182f(interfaceC9763g.mo41143V()).mo41187C())));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        /* renamed from: d */
        public C8745u m37315d(C8743s c8743s, C9176a.e eVar) {
            String m37397a = this.f40574g.m37397a("Content-Type");
            String m37397a2 = this.f40574g.m37397a("Content-Length");
            return new C8745u.b().m37537z(new C8743s.b().m37481n(this.f40568a).m37479l(this.f40570c, null).m37478k(this.f40569b).m37475h()).m37535x(this.f40571d).m37528q(this.f40572e).m37532u(this.f40573f).m37531t(this.f40574g).m37523l(new c(eVar, m37397a, m37397a2)).m37529r(this.f40575h).m37524m();
        }

        /* renamed from: e */
        public final void m37316e(InterfaceC9762f interfaceC9762f, List<Certificate> list) {
            try {
                interfaceC9762f.mo41136Q(Integer.toString(list.size()));
                interfaceC9762f.writeByte(10);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    interfaceC9762f.mo41136Q(C9764h.m41184t(list.get(i10).getEncoded()).mo41190d());
                    interfaceC9762f.writeByte(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        /* renamed from: f */
        public void m37317f(C9176a.c cVar) {
            InterfaceC9762f m41228b = C9772p.m41228b(cVar.m38646f(0));
            m41228b.mo41136Q(this.f40568a);
            m41228b.writeByte(10);
            m41228b.mo41136Q(this.f40570c);
            m41228b.writeByte(10);
            m41228b.mo41136Q(Integer.toString(this.f40569b.m37401f()));
            m41228b.writeByte(10);
            for (int i10 = 0; i10 < this.f40569b.m37401f(); i10++) {
                m41228b.mo41136Q(this.f40569b.m37399d(i10));
                m41228b.mo41136Q(": ");
                m41228b.mo41136Q(this.f40569b.m37402g(i10));
                m41228b.writeByte(10);
            }
            m41228b.mo41136Q(new C9360o(this.f40571d, this.f40572e, this.f40573f).toString());
            m41228b.writeByte(10);
            m41228b.mo41136Q(Integer.toString(this.f40574g.m37401f()));
            m41228b.writeByte(10);
            for (int i11 = 0; i11 < this.f40574g.m37401f(); i11++) {
                m41228b.mo41136Q(this.f40574g.m37399d(i11));
                m41228b.mo41136Q(": ");
                m41228b.mo41136Q(this.f40574g.m37402g(i11));
                m41228b.writeByte(10);
            }
            if (m37312a()) {
                m41228b.writeByte(10);
                m41228b.mo41136Q(this.f40575h.m37393a());
                m41228b.writeByte(10);
                m37316e(m41228b, this.f40575h.m37395e());
                m37316e(m41228b, this.f40575h.m37394d());
            }
            m41228b.close();
        }
    }

    public C8727c(File file, long j10) {
        this.f40547b = C9176a.m38614G0(file, 201105, 2, j10);
    }

    /* renamed from: g */
    public static /* synthetic */ int m37289g(C8727c c8727c) {
        int i10 = c8727c.f40548c;
        c8727c.f40548c = i10 + 1;
        return i10;
    }

    /* renamed from: h */
    public static /* synthetic */ int m37290h(C8727c c8727c) {
        int i10 = c8727c.f40549d;
        c8727c.f40549d = i10 + 1;
        return i10;
    }

    /* renamed from: l */
    public static int m37292l(InterfaceC9763g interfaceC9763g) {
        String mo41143V = interfaceC9763g.mo41143V();
        try {
            return Integer.parseInt(mo41143V);
        } catch (NumberFormatException e10) {
            throw new IOException("Expected an integer but was \"" + mo41143V + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
    }

    /* renamed from: q */
    public static String m37293q(C8743s c8743s) {
        return C9183h.m38691k(c8743s.m37467q());
    }

    /* renamed from: a */
    public final void m37294a(C9176a.c cVar) {
        if (cVar != null) {
            try {
                cVar.m38644a();
            } catch (IOException e10) {
            }
        }
    }

    /* renamed from: j */
    public C8745u m37295j(C8743s c8743s) {
        try {
            C9176a.e m38629E0 = this.f40547b.m38629E0(m37293q(c8743s));
            if (m38629E0 == null) {
                return null;
            }
            try {
                d dVar = new d(m38629E0.m38662l(0));
                C8745u m37315d = dVar.m37315d(c8743s, m38629E0);
                if (dVar.m37313b(c8743s, m37315d)) {
                    return m37315d;
                }
                C9183h.m38683c(m37315d.m37497k());
                return null;
            } catch (IOException e10) {
                C9183h.m38683c(m38629E0);
                return null;
            }
        } catch (IOException e11) {
            return null;
        }
    }

    /* renamed from: k */
    public final InterfaceC9347b m37296k(C8745u c8745u) {
        C9176a.c cVar;
        String m37463m = c8745u.m37511y().m37463m();
        if (C9353h.m39464a(c8745u.m37511y().m37463m())) {
            try {
                m37297m(c8745u.m37511y());
                return null;
            } catch (IOException e10) {
                return null;
            }
        }
        if (!m37463m.equals(HttpGet.METHOD_NAME) || C9355j.m39481f(c8745u)) {
            return null;
        }
        d dVar = new d(c8745u);
        try {
            cVar = this.f40547b.m38627C0(m37293q(c8745u.m37511y()));
            if (cVar == null) {
                return null;
            }
            try {
                dVar.m37317f(cVar);
                return new b(this, cVar);
            } catch (IOException e11) {
                m37294a(cVar);
                return null;
            }
        } catch (IOException e12) {
            cVar = null;
        }
    }

    /* renamed from: m */
    public final void m37297m(C8743s c8743s) {
        this.f40547b.m38635L0(m37293q(c8743s));
    }

    /* renamed from: n */
    public final void m37298n() {
        synchronized (this) {
            this.f40551f++;
        }
    }

    /* renamed from: o */
    public final void m37299o(C9348c c9348c) {
        synchronized (this) {
            this.f40552g++;
            if (c9348c.f42788a != null) {
                this.f40550e++;
            } else if (c9348c.f42789b != null) {
                this.f40551f++;
            }
        }
    }

    /* renamed from: p */
    public final void m37300p(C8745u c8745u, C8745u c8745u2) {
        C9176a.c cVar;
        d dVar = new d(c8745u2);
        try {
            cVar = ((c) c8745u.m37497k()).f40562b.m38661f();
            if (cVar != null) {
                try {
                    dVar.m37317f(cVar);
                    cVar.m38645e();
                } catch (IOException e10) {
                    m37294a(cVar);
                }
            }
        } catch (IOException e11) {
            cVar = null;
        }
    }
}
