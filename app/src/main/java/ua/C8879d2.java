package ua;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import p294r.C7928a;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/d2.class
 */
/* renamed from: ua.d2 */
/* loaded from: combined.jar:classes2.jar:ua/d2.class */
public final class C8879d2 extends C8892e3 {

    /* renamed from: b */
    public final Map<String, Long> f41010b;

    /* renamed from: c */
    public final Map<String, Integer> f41011c;

    /* renamed from: d */
    public long f41012d;

    public C8879d2(C8870c5 c8870c5) {
        super(c8870c5);
        this.f41011c = new C7928a();
        this.f41010b = new C7928a();
    }

    /* renamed from: l */
    public static /* synthetic */ void m37799l(C8879d2 c8879d2, String str, long j10) {
        c8879d2.mo37811h();
        C9935o.m41846f(str);
        if (c8879d2.f41011c.isEmpty()) {
            c8879d2.f41012d = j10;
        }
        Integer num = c8879d2.f41011c.get(str);
        if (num != null) {
            c8879d2.f41011c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (c8879d2.f41011c.size() >= 100) {
            c8879d2.f41723a.mo37780c().m38411r().m38326a("Too many ads visible");
        } else {
            c8879d2.f41011c.put(str, 1);
            c8879d2.f41010b.put(str, Long.valueOf(j10));
        }
    }

    /* renamed from: m */
    public static /* synthetic */ void m37800m(C8879d2 c8879d2, String str, long j10) {
        c8879d2.mo37811h();
        C9935o.m41846f(str);
        Integer num = c8879d2.f41011c.get(str);
        if (num == null) {
            c8879d2.f41723a.mo37780c().m38408o().m38327b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        C9004n7 m38273s = c8879d2.f41723a.m37775Q().m38273s(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            c8879d2.f41011c.put(str, Integer.valueOf(intValue));
            return;
        }
        c8879d2.f41011c.remove(str);
        Long l10 = c8879d2.f41010b.get(str);
        if (l10 == null) {
            c8879d2.f41723a.mo37780c().m38408o().m38326a("First ad unit exposure time was never set");
        } else {
            long longValue = l10.longValue();
            c8879d2.f41010b.remove(str);
            c8879d2.m37806p(str, j10 - longValue, m38273s);
        }
        if (c8879d2.f41011c.isEmpty()) {
            long j11 = c8879d2.f41012d;
            if (j11 == 0) {
                c8879d2.f41723a.mo37780c().m38408o().m38326a("First ad exposure time was never set");
            } else {
                c8879d2.m37805o(j10 - j11, m38273s);
                c8879d2.f41012d = 0L;
            }
        }
    }

    /* renamed from: i */
    public final void m37802i(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f41723a.mo37780c().m38408o().m38326a("Ad unit id must be a non-empty string");
        } else {
            this.f41723a.mo37782e().m38436r(new RunnableC8840a(this, str, j10));
        }
    }

    /* renamed from: j */
    public final void m37803j(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f41723a.mo37780c().m38408o().m38326a("Ad unit id must be a non-empty string");
        } else {
            this.f41723a.mo37782e().m38436r(new RunnableC8853b0(this, str, j10));
        }
    }

    /* renamed from: k */
    public final void m37804k(long j10) {
        C9004n7 m38273s = this.f41723a.m37775Q().m38273s(false);
        for (String str : this.f41010b.keySet()) {
            m37806p(str, j10 - this.f41010b.get(str).longValue(), m38273s);
        }
        if (!this.f41010b.isEmpty()) {
            m37805o(j10 - this.f41012d, m38273s);
        }
        m37807q(j10);
    }

    /* renamed from: o */
    public final void m37805o(long j10, C9004n7 c9004n7) {
        if (c9004n7 == null) {
            this.f41723a.mo37780c().m38416w().m38326a("Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f41723a.mo37780c().m38416w().m38327b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        C9088u7.m38264x(c9004n7, bundle, true);
        this.f41723a.m37764F().m37933X("am", "_xa", bundle);
    }

    /* renamed from: p */
    public final void m37806p(String str, long j10, C9004n7 c9004n7) {
        if (c9004n7 == null) {
            this.f41723a.mo37780c().m38416w().m38326a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f41723a.mo37780c().m38416w().m38327b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        C9088u7.m38264x(c9004n7, bundle, true);
        this.f41723a.m37764F().m37933X("am", "_xu", bundle);
    }

    /* renamed from: q */
    public final void m37807q(long j10) {
        Iterator<String> it = this.f41010b.keySet().iterator();
        while (it.hasNext()) {
            this.f41010b.put(it.next(), Long.valueOf(j10));
        }
        if (this.f41010b.isEmpty()) {
            return;
        }
        this.f41012d = j10;
    }
}
