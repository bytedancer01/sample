package ua;

import android.os.Bundle;
import p305ra.C8161gb;
import p305ra.C8206jb;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/h9.class
 */
/* renamed from: ua.h9 */
/* loaded from: combined.jar:classes2.jar:ua/h9.class */
public final class C8934h9 {

    /* renamed from: a */
    public long f41168a;

    /* renamed from: b */
    public long f41169b;

    /* renamed from: c */
    public final AbstractC8984m f41170c;

    /* renamed from: d */
    public final C8970k9 f41171d;

    public C8934h9(C8970k9 c8970k9) {
        this.f41171d = c8970k9;
        this.f41170c = new C8922g9(this, c8970k9.f41723a);
        long mo22433b = c8970k9.f41723a.mo37778a().mo22433b();
        this.f41168a = mo22433b;
        this.f41169b = mo22433b;
    }

    /* renamed from: a */
    public final void m38037a(long j10) {
        this.f41171d.mo37811h();
        this.f41170c.m38123d();
        this.f41168a = j10;
        this.f41169b = j10;
    }

    /* renamed from: b */
    public final void m38038b(long j10) {
        this.f41170c.m38123d();
    }

    /* renamed from: c */
    public final void m38039c() {
        this.f41170c.m38123d();
        this.f41168a = 0L;
        this.f41169b = 0L;
    }

    /* renamed from: d */
    public final boolean m38040d(boolean z10, boolean z11, long j10) {
        this.f41171d.mo37811h();
        this.f41171d.m37905j();
        C8161gb.m35389a();
        if (!this.f41171d.f41723a.m37797z().m37900w(null, C8988m3.f41384q0) || this.f41171d.f41723a.m37787k()) {
            this.f41171d.f41723a.m37759A().f41497t.m38110b(this.f41171d.f41723a.mo37778a().mo22432a());
        }
        long j11 = j10 - this.f41168a;
        if (!z10 && j11 < 1000) {
            this.f41171d.f41723a.mo37780c().m38416w().m38327b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            C8206jb.m35517a();
            if (this.f41171d.f41723a.m37797z().m37900w(null, C8988m3.f41346V)) {
                j11 = j10 - this.f41169b;
                this.f41169b = j10;
            } else {
                j11 = m38041e();
            }
        }
        this.f41171d.f41723a.mo37780c().m38416w().m38327b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        C9088u7.m38264x(this.f41171d.f41723a.m37775Q().m38273s(!this.f41171d.f41723a.m37797z().m37881C()), bundle, true);
        C8900f m37797z = this.f41171d.f41723a.m37797z();
        C8976l3<Boolean> c8976l3 = C8988m3.f41345U;
        if (!m37797z.m37900w(null, c8976l3) && z11) {
            bundle.putLong("_fr", 1L);
        }
        if (!this.f41171d.f41723a.m37797z().m37900w(null, c8976l3) || !z11) {
            this.f41171d.f41723a.m37764F().m37933X("auto", "_e", bundle);
        }
        this.f41168a = j10;
        this.f41170c.m38123d();
        this.f41170c.m38121b(3600000L);
        return true;
    }

    /* renamed from: e */
    public final long m38041e() {
        long mo22433b = this.f41171d.f41723a.mo37778a().mo22433b();
        long j10 = this.f41169b;
        this.f41169b = mo22433b;
        return mo22433b - j10;
    }
}
