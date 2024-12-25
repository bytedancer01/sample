package ua;

import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import p127h9.C5043a;
import p305ra.C8175ha;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/v8.class
 */
/* renamed from: ua.v8 */
/* loaded from: combined.jar:classes2.jar:ua/v8.class */
public final class C9100v8 extends AbstractC9030p9 {

    /* renamed from: d */
    public String f41709d;

    /* renamed from: e */
    public boolean f41710e;

    /* renamed from: f */
    public long f41711f;

    public C9100v8(C9123x9 c9123x9) {
        super(c9123x9);
    }

    @Override // ua.AbstractC9030p9
    /* renamed from: l */
    public final boolean mo37812l() {
        return false;
    }

    /* renamed from: m */
    public final Pair<String, Boolean> m38323m(String str, C8912g c8912g) {
        C8175ha.m35418a();
        return (!this.f41723a.m37797z().m37900w(null, C8988m3.f41327I0) || c8912g.m37965f()) ? m38324n(str) : new Pair<>("", Boolean.FALSE);
    }

    @Deprecated
    /* renamed from: n */
    public final Pair<String, Boolean> m38324n(String str) {
        mo37811h();
        long mo22433b = this.f41723a.mo37778a().mo22433b();
        String str2 = this.f41709d;
        if (str2 != null && mo22433b < this.f41711f) {
            return new Pair<>(str2, Boolean.valueOf(this.f41710e));
        }
        this.f41711f = mo22433b + this.f41723a.m37797z().m37896s(str, C8988m3.f41355c);
        C5043a.m25263c(true);
        try {
            C5043a.a m25262a = C5043a.m25262a(this.f41723a.mo37779b());
            if (m25262a != null) {
                this.f41709d = m25262a.m25270a();
                this.f41710e = m25262a.m25271b();
            }
            if (this.f41709d == null) {
                this.f41709d = "";
            }
        } catch (Exception e10) {
            this.f41723a.mo37780c().m38415v().m38327b("Unable to get advertising id", e10);
            this.f41709d = "";
        }
        C5043a.m25263c(false);
        return new Pair<>(this.f41709d, Boolean.valueOf(this.f41710e));
    }

    @Deprecated
    /* renamed from: o */
    public final String m38325o(String str) {
        mo37811h();
        String str2 = (String) m38324n(str).first;
        MessageDigest m37816B = C8899ea.m37816B();
        if (m37816B == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, m37816B.digest(str2.getBytes())));
    }
}
