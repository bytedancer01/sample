package vg;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p389wg.C9577d;
import p389wg.C9588o;
import p389wg.C9589p;
import p389wg.EnumC9574a;
import p411xi.C9758c0;
import p411xi.C9761e;
import p411xi.C9764h;
import p411xi.InterfaceC9756b0;
import p411xi.InterfaceC9782z;
import tg.C8739o;
import tg.C8743s;
import tg.C8745u;
import tg.EnumC8742r;
import ug.C9183h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vg/n.class
 */
/* renamed from: vg.n */
/* loaded from: combined.jar:classes2.jar:vg/n.class */
public final class C9359n implements InterfaceC9361p {

    /* renamed from: d */
    public static final List<C9764h> f42884d = C9183h.m38693m(C9764h.m41183h("connection"), C9764h.m41183h("host"), C9764h.m41183h("keep-alive"), C9764h.m41183h("proxy-connection"), C9764h.m41183h("transfer-encoding"));

    /* renamed from: e */
    public static final List<C9764h> f42885e = C9183h.m38693m(C9764h.m41183h("connection"), C9764h.m41183h("host"), C9764h.m41183h("keep-alive"), C9764h.m41183h("proxy-connection"), C9764h.m41183h("te"), C9764h.m41183h("transfer-encoding"), C9764h.m41183h("encoding"), C9764h.m41183h("upgrade"));

    /* renamed from: a */
    public final C9352g f42886a;

    /* renamed from: b */
    public final C9588o f42887b;

    /* renamed from: c */
    public C9589p f42888c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:vg/n$a.class
     */
    /* renamed from: vg.n$a */
    /* loaded from: combined.jar:classes2.jar:vg/n$a.class */
    public static class a implements InterfaceC9756b0 {

        /* renamed from: b */
        public final C9589p f42889b;

        /* renamed from: c */
        public final InterfaceC9756b0 f42890c;

        /* renamed from: d */
        public final InterfaceC9347b f42891d;

        /* renamed from: e */
        public final InterfaceC9782z f42892e;

        /* renamed from: f */
        public boolean f42893f;

        /* renamed from: g */
        public boolean f42894g;

        public a(C9589p c9589p, InterfaceC9347b interfaceC9347b) {
            this.f42889b = c9589p;
            this.f42890c = c9589p.m40376r();
            InterfaceC9782z body = interfaceC9347b != null ? interfaceC9347b.body() : null;
            interfaceC9347b = body == null ? null : interfaceC9347b;
            this.f42892e = body;
            this.f42891d = interfaceC9347b;
        }

        @Override // p411xi.InterfaceC9756b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f42894g) {
                return;
            }
            if (!this.f42893f && this.f42892e != null) {
                m39517f();
            }
            this.f42894g = true;
            if (this.f42893f) {
                return;
            }
            this.f42889b.m40372n(EnumC9574a.CANCEL);
            InterfaceC9347b interfaceC9347b = this.f42891d;
            if (interfaceC9347b != null) {
                interfaceC9347b.abort();
            }
        }

        /* renamed from: f */
        public final boolean m39517f() {
            boolean z10;
            long mo41093h = this.f42889b.m40379u().mo41093h();
            this.f42889b.m40379u().mo41092g(100L, TimeUnit.MILLISECONDS);
            try {
                C9183h.m38697q(this, 100);
                z10 = true;
            } catch (IOException e10) {
                z10 = false;
            } catch (Throwable th2) {
                this.f42889b.m40379u().mo41092g(mo41093h, TimeUnit.NANOSECONDS);
                throw th2;
            }
            this.f42889b.m40379u().mo41092g(mo41093h, TimeUnit.NANOSECONDS);
            return z10;
        }

        @Override // p411xi.InterfaceC9756b0
        public C9758c0 timeout() {
            return this.f42890c.timeout();
        }

        @Override // p411xi.InterfaceC9756b0
        /* renamed from: x */
        public long mo22901x(C9761e c9761e, long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f42894g) {
                throw new IllegalStateException("closed");
            }
            if (this.f42893f) {
                return -1L;
            }
            long mo22901x = this.f42890c.mo22901x(c9761e, j10);
            if (mo22901x != -1) {
                InterfaceC9782z interfaceC9782z = this.f42892e;
                if (interfaceC9782z != null) {
                    interfaceC9782z.mo32031h(c9761e.clone(), mo22901x);
                }
                return mo22901x;
            }
            this.f42893f = true;
            if (this.f42891d == null) {
                return -1L;
            }
            this.f42892e.close();
            return -1L;
        }
    }

    public C9359n(C9352g c9352g, C9588o c9588o) {
        this.f42886a = c9352g;
        this.f42887b = c9588o;
    }

    /* renamed from: j */
    public static boolean m39513j(EnumC8742r enumC8742r, C9764h c9764h) {
        List<C9764h> list;
        if (enumC8742r == EnumC8742r.SPDY_3) {
            list = f42884d;
        } else {
            if (enumC8742r != EnumC8742r.HTTP_2) {
                throw new AssertionError(enumC8742r);
            }
            list = f42885e;
        }
        return list.contains(c9764h);
    }

    /* renamed from: k */
    public static String m39514k(String str, String str2) {
        return str + (char) 0 + str2;
    }

    /* renamed from: l */
    public static C8745u.b m39515l(List<C9577d> list, EnumC8742r enumC8742r) {
        String str;
        String str2;
        C8739o.b bVar = new C8739o.b();
        bVar.m37410g(C9355j.f42862e, enumC8742r.toString());
        String str3 = null;
        String str4 = "HTTP/1.1";
        for (int i10 = 0; i10 < list.size(); i10++) {
            C9764h c9764h = list.get(i10).f43608a;
            String m41188D = list.get(i10).f43609b.m41188D();
            int i11 = 0;
            while (i11 < m41188D.length()) {
                int indexOf = m41188D.indexOf(0, i11);
                int i12 = indexOf;
                if (indexOf == -1) {
                    i12 = m41188D.length();
                }
                String substring = m41188D.substring(i11, i12);
                if (c9764h.equals(C9577d.f43601d)) {
                    str = substring;
                    str2 = str4;
                } else if (c9764h.equals(C9577d.f43607j)) {
                    str2 = substring;
                    str = str3;
                } else {
                    str = str3;
                    str2 = str4;
                    if (!m39513j(enumC8742r, c9764h)) {
                        bVar.m37405b(c9764h.m41188D(), substring);
                        str2 = str4;
                        str = str3;
                    }
                }
                i11 = i12 + 1;
                str3 = str;
                str4 = str2;
            }
        }
        if (str3 == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        if (str4 == null) {
            throw new ProtocolException("Expected ':version' header not present");
        }
        C9360o m39518a = C9360o.m39518a(str4 + " " + str3);
        return new C8745u.b().m37535x(enumC8742r).m37528q(m39518a.f42896b).m37532u(m39518a.f42897c).m37531t(bVar.m37408e());
    }

    /* renamed from: m */
    public static List<C9577d> m39516m(C8743s c8743s, EnumC8742r enumC8742r, String str) {
        C9577d c9577d;
        C8739o m37461k = c8743s.m37461k();
        ArrayList arrayList = new ArrayList(m37461k.m37401f() + 10);
        arrayList.add(new C9577d(C9577d.f43602e, c8743s.m37463m()));
        arrayList.add(new C9577d(C9577d.f43603f, C9356k.m39493c(c8743s.m37466p())));
        String m39438m = C9352g.m39438m(c8743s.m37466p());
        if (EnumC8742r.SPDY_3 == enumC8742r) {
            arrayList.add(new C9577d(C9577d.f43607j, str));
            c9577d = new C9577d(C9577d.f43606i, m39438m);
        } else {
            if (EnumC8742r.HTTP_2 != enumC8742r) {
                throw new AssertionError();
            }
            c9577d = new C9577d(C9577d.f43605h, m39438m);
        }
        arrayList.add(c9577d);
        arrayList.add(new C9577d(C9577d.f43604g, c8743s.m37466p().getProtocol()));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i10 = 0; i10 < m37461k.m37401f(); i10++) {
            C9764h m41183h = C9764h.m41183h(m37461k.m37399d(i10).toLowerCase(Locale.US));
            String m37402g = m37461k.m37402g(i10);
            if (!m39513j(enumC8742r, m41183h) && !m41183h.equals(C9577d.f43602e) && !m41183h.equals(C9577d.f43603f) && !m41183h.equals(C9577d.f43604g) && !m41183h.equals(C9577d.f43605h) && !m41183h.equals(C9577d.f43606i) && !m41183h.equals(C9577d.f43607j)) {
                if (linkedHashSet.add(m41183h)) {
                    arrayList.add(new C9577d(m41183h, m37402g));
                } else {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        if (((C9577d) arrayList.get(i11)).f43608a.equals(m41183h)) {
                            arrayList.set(i11, new C9577d(m41183h, m39514k(((C9577d) arrayList.get(i11)).f43609b.m41188D(), m37402g)));
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // vg.InterfaceC9361p
    /* renamed from: a */
    public void mo39467a() {
        this.f42888c.m40375q().close();
    }

    @Override // vg.InterfaceC9361p
    /* renamed from: b */
    public void mo39468b() {
    }

    @Override // vg.InterfaceC9361p
    /* renamed from: c */
    public InterfaceC9782z mo39469c(C8743s c8743s, long j10) {
        return this.f42888c.m40375q();
    }

    @Override // vg.InterfaceC9361p
    /* renamed from: d */
    public C8745u.b mo39470d() {
        return m39515l(this.f42888c.m40374p(), this.f42887b.m40329M0());
    }

    @Override // vg.InterfaceC9361p
    /* renamed from: e */
    public void mo39471e(C8743s c8743s) {
        if (this.f42888c != null) {
            return;
        }
        this.f42886a.m39441A();
        boolean m39457r = this.f42886a.m39457r();
        String m39494d = C9356k.m39494d(this.f42886a.m39446f().m37344f());
        C9588o c9588o = this.f42887b;
        C9589p m40333Q0 = c9588o.m40333Q0(m39516m(c8743s, c9588o.m40329M0(), m39494d), m39457r, true);
        this.f42888c = m40333Q0;
        m40333Q0.m40379u().mo41092g(this.f42886a.f42834a.m37436u(), TimeUnit.MILLISECONDS);
    }

    @Override // vg.InterfaceC9361p
    /* renamed from: f */
    public void mo39472f() {
    }

    @Override // vg.InterfaceC9361p
    /* renamed from: g */
    public void mo39473g(C9357l c9357l) {
        c9357l.m39496l(this.f42888c.m40375q());
    }

    @Override // vg.InterfaceC9361p
    /* renamed from: h */
    public InterfaceC9756b0 mo39474h(InterfaceC9347b interfaceC9347b) {
        return new a(this.f42888c, interfaceC9347b);
    }

    @Override // vg.InterfaceC9361p
    /* renamed from: i */
    public boolean mo39475i() {
        return true;
    }
}
