package vg;

import org.apache.http.protocol.HTTP;
import p411xi.InterfaceC9756b0;
import p411xi.InterfaceC9782z;
import tg.C8743s;
import tg.C8745u;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vg/i.class
 */
/* renamed from: vg.i */
/* loaded from: combined.jar:classes2.jar:vg/i.class */
public final class C9354i implements InterfaceC9361p {

    /* renamed from: a */
    public final C9352g f42856a;

    /* renamed from: b */
    public final C9350e f42857b;

    public C9354i(C9352g c9352g, C9350e c9350e) {
        this.f42856a = c9352g;
        this.f42857b = c9350e;
    }

    @Override // vg.InterfaceC9361p
    /* renamed from: a */
    public void mo39467a() {
        this.f42857b.m39417o();
    }

    @Override // vg.InterfaceC9361p
    /* renamed from: b */
    public void mo39468b() {
        this.f42857b.m39416n();
    }

    @Override // vg.InterfaceC9361p
    /* renamed from: c */
    public InterfaceC9782z mo39469c(C8743s c8743s, long j10) {
        if (HTTP.CHUNK_CODING.equalsIgnoreCase(c8743s.m37459i("Transfer-Encoding"))) {
            return this.f42857b.m39420r();
        }
        if (j10 != -1) {
            return this.f42857b.m39422t(j10);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // vg.InterfaceC9361p
    /* renamed from: d */
    public C8745u.b mo39470d() {
        return this.f42857b.m39427y();
    }

    @Override // vg.InterfaceC9361p
    /* renamed from: e */
    public void mo39471e(C8743s c8743s) {
        this.f42856a.m39441A();
        this.f42857b.m39411A(c8743s.m37461k(), C9356k.m39491a(c8743s, this.f42856a.m39446f().m37345g().m37540b().type(), this.f42856a.m39446f().m37344f()));
    }

    @Override // vg.InterfaceC9361p
    /* renamed from: f */
    public void mo39472f() {
        if (mo39475i()) {
            this.f42857b.m39425w();
        } else {
            this.f42857b.m39414l();
        }
    }

    @Override // vg.InterfaceC9361p
    /* renamed from: g */
    public void mo39473g(C9357l c9357l) {
        this.f42857b.m39412B(c9357l);
    }

    @Override // vg.InterfaceC9361p
    /* renamed from: h */
    public InterfaceC9756b0 mo39474h(InterfaceC9347b interfaceC9347b) {
        if (!this.f42856a.m39452l()) {
            return this.f42857b.m39423u(interfaceC9347b, 0L);
        }
        if (HTTP.CHUNK_CODING.equalsIgnoreCase(this.f42856a.m39449i().m37503q("Transfer-Encoding"))) {
            return this.f42857b.m39421s(interfaceC9347b, this.f42856a);
        }
        long m39480e = C9355j.m39480e(this.f42856a.m39449i());
        return m39480e != -1 ? this.f42857b.m39423u(interfaceC9347b, m39480e) : this.f42857b.m39424v(interfaceC9347b);
    }

    @Override // vg.InterfaceC9361p
    /* renamed from: i */
    public boolean mo39475i() {
        return ("close".equalsIgnoreCase(this.f42856a.m39447g().m37459i("Connection")) || "close".equalsIgnoreCase(this.f42856a.m39449i().m37503q("Connection")) || this.f42857b.m39418p()) ? false : true;
    }
}
