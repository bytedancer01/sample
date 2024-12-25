package ma;

import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p060da.C4409h;
import p060da.InterfaceC4406e;
import p208m1.C5901j;
import p216m9.C5938b;
import p304r9.C8015b;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/sc.class
 */
/* renamed from: ma.sc */
/* loaded from: combined.jar:classes2.jar:ma/sc.class */
public final class C6396sc {

    /* renamed from: n */
    public static final C8015b f34013n = new C8015b("DialogDiscovery");

    /* renamed from: o */
    public static final String f34014o = "21.3.0";

    /* renamed from: p */
    public static C6396sc f34015p;

    /* renamed from: a */
    public final C6176i2 f34016a;

    /* renamed from: b */
    public final String f34017b;

    /* renamed from: f */
    public String f34021f;

    /* renamed from: d */
    public final Map f34019d = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    public int f34028m = 1;

    /* renamed from: g */
    public long f34022g = 1;

    /* renamed from: h */
    public long f34023h = 1;

    /* renamed from: i */
    public long f34024i = -1;

    /* renamed from: j */
    public int f34025j = -1;

    /* renamed from: k */
    public int f34026k = 0;

    /* renamed from: l */
    public int f34027l = 0;

    /* renamed from: c */
    public final C6352qa f34018c = new C6352qa(this);

    /* renamed from: e */
    public final InterfaceC4406e f34020e = C4409h.m22439d();

    public C6396sc(C6176i2 c6176i2, String str) {
        this.f34016a = c6176i2;
        this.f34017b = str;
    }

    /* renamed from: a */
    public static C6151gj m30005a() {
        C6396sc c6396sc = f34015p;
        if (c6396sc == null) {
            return null;
        }
        return c6396sc.f34018c;
    }

    /* renamed from: g */
    public static void m30011g(C6176i2 c6176i2, String str) {
        if (f34015p == null) {
            f34015p = new C6396sc(c6176i2, str);
        }
    }

    /* renamed from: h */
    public final long m30012h() {
        return this.f34020e.mo22432a();
    }

    /* renamed from: i */
    public final C6374rb m30013i(C5901j.h hVar) {
        String str;
        String str2;
        CastDevice m13037S = CastDevice.m13037S(hVar.m28993i());
        if (m13037S == null || m13037S.m13039P() == null) {
            int i10 = this.f34026k;
            this.f34026k = i10 + 1;
            str = "UNKNOWN_DEVICE_ID" + i10;
        } else {
            str = m13037S.m13039P();
        }
        if (m13037S == null || m13037S.m13049a0() == null) {
            int i11 = this.f34027l;
            this.f34027l = i11 + 1;
            str2 = "UNKNOWN_RECEIVER_METRICS_ID" + i11;
        } else {
            str2 = m13037S.m13049a0();
        }
        if (!str.startsWith("UNKNOWN_DEVICE_ID") && this.f34019d.containsKey(str)) {
            return (C6374rb) this.f34019d.get(str);
        }
        C6374rb c6374rb = new C6374rb((String) C9935o.m41850j(str2), m30012h());
        this.f34019d.put(str, c6374rb);
        return c6374rb;
    }

    /* renamed from: j */
    public final C6142ga m30014j(C6205ja c6205ja) {
        C6455v9 m30090y = C6475w9.m30090y();
        m30090y.m30080n(f34014o);
        m30090y.m30079l(this.f34017b);
        C6475w9 c6475w9 = (C6475w9) m30090y.m29837d();
        C6121fa m29634z = C6142ga.m29634z();
        m29634z.m29592n(c6475w9);
        if (c6205ja != null) {
            C5938b m29234d = C5938b.m29234d();
            boolean z10 = false;
            if (m29234d != null) {
                z10 = false;
                if (m29234d.m29241a().m29261Z()) {
                    z10 = true;
                }
            }
            c6205ja.m29782z(z10);
            c6205ja.m29778p(this.f34022g);
            m29634z.m29597x(c6205ja);
        }
        return (C6142ga) m29634z.m29837d();
    }

    /* renamed from: k */
    public final void m30015k() {
        this.f34019d.clear();
        this.f34021f = "";
        this.f34022g = -1L;
        this.f34023h = -1L;
        this.f34024i = -1L;
        this.f34025j = -1;
        this.f34026k = 0;
        this.f34027l = 0;
        this.f34028m = 1;
    }

    /* renamed from: l */
    public final void m30016l(int i10) {
        synchronized (this) {
            m30015k();
            this.f34021f = UUID.randomUUID().toString();
            this.f34022g = m30012h();
            this.f34025j = 1;
            this.f34028m = 2;
            C6205ja m29817y = C6226ka.m29817y();
            m29817y.m29781x(this.f34021f);
            m29817y.m29778p(this.f34022g);
            m29817y.m29776n(1);
            this.f34016a.m29670d(m30014j(m29817y), 351);
        }
    }

    /* renamed from: m */
    public final void m30017m(C5901j.h hVar) {
        synchronized (this) {
            if (this.f34028m == 1) {
                this.f34016a.m29670d(m30014j(null), 353);
                return;
            }
            this.f34028m = 4;
            C6205ja m29817y = C6226ka.m29817y();
            m29817y.m29781x(this.f34021f);
            m29817y.m29778p(this.f34022g);
            m29817y.m29779s(this.f34023h);
            m29817y.m29780u(this.f34024i);
            m29817y.m29776n(this.f34025j);
            m29817y.m29777o(m30012h());
            ArrayList arrayList = new ArrayList();
            for (C6374rb c6374rb : this.f34019d.values()) {
                C6163ha m29675y = C6184ia.m29675y();
                m29675y.m29661n(c6374rb.f33999a);
                m29675y.m29660l(c6374rb.f34000b);
                arrayList.add((C6184ia) m29675y.m29837d());
            }
            m29817y.m29775l(arrayList);
            if (hVar != null) {
                m29817y.m29774A(m30013i(hVar).f33999a);
            }
            C6142ga m30014j = m30014j(m29817y);
            m30015k();
            f34013n.m34873a("logging ClientDiscoverySessionSummary. Device Count: " + this.f34019d.size(), new Object[0]);
            this.f34016a.m29670d(m30014j, 353);
        }
    }

    /* renamed from: n */
    public final void m30018n(List list) {
        synchronized (this) {
            if (this.f34028m != 2) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m30013i((C5901j.h) it.next());
            }
            if (this.f34024i < 0) {
                this.f34024i = m30012h();
            }
        }
    }

    /* renamed from: o */
    public final void m30019o() {
        synchronized (this) {
            if (this.f34028m != 2) {
                this.f34016a.m29670d(m30014j(null), 352);
                return;
            }
            this.f34023h = m30012h();
            this.f34028m = 3;
            C6205ja m29817y = C6226ka.m29817y();
            m29817y.m29781x(this.f34021f);
            m29817y.m29779s(this.f34023h);
            this.f34016a.m29670d(m30014j(m29817y), 352);
        }
    }
}
