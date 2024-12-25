package ua;

import p060da.InterfaceC4406e;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/l9.class
 */
/* renamed from: ua.l9 */
/* loaded from: combined.jar:classes2.jar:ua/l9.class */
public final class C8982l9 {

    /* renamed from: a */
    public final InterfaceC4406e f41300a;

    /* renamed from: b */
    public long f41301b;

    public C8982l9(InterfaceC4406e interfaceC4406e) {
        C9935o.m41850j(interfaceC4406e);
        this.f41300a = interfaceC4406e;
    }

    /* renamed from: a */
    public final void m38112a() {
        this.f41301b = this.f41300a.mo22433b();
    }

    /* renamed from: b */
    public final void m38113b() {
        this.f41301b = 0L;
    }

    /* renamed from: c */
    public final boolean m38114c(long j10) {
        return this.f41301b == 0 || this.f41300a.mo22433b() - this.f41301b >= 3600000;
    }
}
