package p230n9;

import java.util.concurrent.atomic.AtomicLong;
import p200l9.InterfaceC5749b2;
import p304r9.C8013a;
import p304r9.C8049s;
import p304r9.InterfaceC8051t;
import p368v9.C9315a;
import za.InterfaceC10136e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/e0.class
 */
/* renamed from: n9.e0 */
/* loaded from: combined.jar:classes2.jar:n9/e0.class */
public final class C6711e0 implements InterfaceC8051t {

    /* renamed from: a */
    public InterfaceC5749b2 f35092a;

    /* renamed from: b */
    public final AtomicLong f35093b = new AtomicLong((C8013a.m34866g() & 65535) * 10000);

    /* renamed from: c */
    public final C6721i f35094c;

    public C6711e0(C6721i c6721i) {
        this.f35094c = c6721i;
    }

    @Override // p304r9.InterfaceC8051t
    /* renamed from: a */
    public final void mo30910a(String str, String str2, final long j10, String str3) {
        InterfaceC5749b2 interfaceC5749b2 = this.f35092a;
        if (interfaceC5749b2 == null) {
            throw new IllegalStateException("Device is not connected");
        }
        interfaceC5749b2.mo28161i(str, str2).mo42556e(new InterfaceC10136e(this, j10) { // from class: n9.d0

            /* renamed from: a */
            public final C6711e0 f35089a;

            /* renamed from: b */
            public final long f35090b;

            {
                this.f35089a = this;
                this.f35090b = j10;
            }

            @Override // za.InterfaceC10136e
            public final void onFailure(Exception exc) {
                C8049s c8049s;
                C6711e0 c6711e0 = this.f35089a;
                long j11 = this.f35090b;
                int m39314b = exc instanceof C9315a ? ((C9315a) exc).m39314b() : 13;
                c8049s = c6711e0.f35094c.f35163c;
                c8049s.m34964s(j11, m39314b);
            }
        });
    }

    /* renamed from: b */
    public final void m30911b(InterfaceC5749b2 interfaceC5749b2) {
        this.f35092a = interfaceC5749b2;
    }

    @Override // p304r9.InterfaceC8051t
    public final long zza() {
        return this.f35093b.getAndIncrement();
    }
}
