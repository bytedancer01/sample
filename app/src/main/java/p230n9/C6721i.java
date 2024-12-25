package p230n9;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.AdError;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import ma.HandlerC6385s1;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import org.json.JSONObject;
import p200l9.C5746b;
import p200l9.C5758e;
import p200l9.C5776j;
import p200l9.C5779k;
import p200l9.C5791o;
import p200l9.C5794p;
import p200l9.C5797q;
import p200l9.C5800r;
import p200l9.InterfaceC5749b2;
import p304r9.C8015b;
import p304r9.C8045q;
import p304r9.C8049s;
import p368v9.AbstractC9317c;
import p368v9.InterfaceC9320f;
import p422y9.C9935o;
import za.AbstractC10144i;
import za.C10146j;
import za.C10148l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/i.class
 */
/* renamed from: n9.i */
/* loaded from: combined.jar:classes2.jar:n9/i.class */
public class C6721i implements C5758e.e {

    /* renamed from: c */
    public final C8049s f35163c;

    /* renamed from: d */
    public final C6711e0 f35164d;

    /* renamed from: e */
    @NotOnlyInitialized
    public final C6707d f35165e;

    /* renamed from: f */
    public InterfaceC5749b2 f35166f;

    /* renamed from: g */
    public C10146j f35167g;

    /* renamed from: l */
    public d f35172l;

    /* renamed from: n */
    public static final C8015b f35160n = new C8015b("RemoteMediaClient");

    /* renamed from: m */
    public static final String f35159m = C8049s.f38883C;

    /* renamed from: h */
    public final List f35168h = new CopyOnWriteArrayList();

    /* renamed from: i */
    public final List f35169i = new CopyOnWriteArrayList();

    /* renamed from: j */
    public final Map f35170j = new ConcurrentHashMap();

    /* renamed from: k */
    public final Map f35171k = new ConcurrentHashMap();

    /* renamed from: a */
    public final Object f35161a = new Object();

    /* renamed from: b */
    public final Handler f35162b = new HandlerC6385s1(Looper.getMainLooper());

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:n9/i$a.class
     */
    /* renamed from: n9.i$a */
    /* loaded from: combined.jar:classes2.jar:n9/i$a.class */
    public static abstract class a {
        /* renamed from: a */
        public void mo31035a() {
        }

        /* renamed from: b */
        public void m31036b(MediaError mediaError) {
        }

        /* renamed from: c */
        public void mo31037c() {
        }

        /* renamed from: d */
        public void mo23778d() {
        }

        /* renamed from: e */
        public void mo14732e() {
        }

        /* renamed from: f */
        public void m31038f() {
        }

        /* renamed from: g */
        public void mo14733g() {
        }

        /* renamed from: h */
        public void mo30915h(int[] iArr) {
        }

        /* renamed from: i */
        public void mo30916i(int[] iArr, int i10) {
        }

        /* renamed from: j */
        public void mo30917j(C5791o[] c5791oArr) {
        }

        /* renamed from: k */
        public void mo30918k(int[] iArr) {
        }

        /* renamed from: l */
        public void mo30919l(List list, List list2, int i10) {
        }

        /* renamed from: m */
        public void mo30920m(int[] iArr) {
        }

        /* renamed from: n */
        public void mo30921n() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:n9/i$b.class
     */
    @Deprecated
    /* renamed from: n9.i$b */
    /* loaded from: combined.jar:classes2.jar:n9/i$b.class */
    public interface b {
        /* renamed from: c */
        void mo23745c();

        /* renamed from: g */
        void mo23746g();

        /* renamed from: h */
        void mo23747h();

        /* renamed from: i */
        void mo23748i();

        /* renamed from: k */
        void mo23749k();

        /* renamed from: m */
        void mo23750m();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:n9/i$c.class
     */
    /* renamed from: n9.i$c */
    /* loaded from: combined.jar:classes2.jar:n9/i$c.class */
    public interface c extends InterfaceC9320f {
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:n9/i$d.class
     */
    /* renamed from: n9.i$d */
    /* loaded from: combined.jar:classes2.jar:n9/i$d.class */
    public interface d {
        /* renamed from: a */
        List<C5746b> m31039a(C5797q c5797q);

        /* renamed from: b */
        boolean m31040b(C5797q c5797q);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:n9/i$e.class
     */
    /* renamed from: n9.i$e */
    /* loaded from: combined.jar:classes2.jar:n9/i$e.class */
    public interface e {
        /* renamed from: a */
        void mo29582a(long j10, long j11);
    }

    public C6721i(C8049s c8049s) {
        C6711e0 c6711e0 = new C6711e0(this);
        this.f35164d = c6711e0;
        C8049s c8049s2 = (C8049s) C9935o.m41850j(c8049s);
        this.f35163c = c8049s2;
        c8049s2.m34965t(new C6730m0(this, null));
        c8049s2.m34907e(c6711e0);
        this.f35165e = new C6707d(this, 20, 20);
    }

    /* renamed from: c0 */
    public static AbstractC9317c m30968c0(int i10, String str) {
        C6717g0 c6717g0 = new C6717g0();
        c6717g0.m13146i(new C6714f0(c6717g0, new Status(i10, str)));
        return c6717g0;
    }

    /* renamed from: i0 */
    public static /* bridge */ /* synthetic */ void m30971i0(C6721i c6721i) {
        for (C6734o0 c6734o0 : c6721i.f35171k.values()) {
            if (c6721i.m31020p() && !c6734o0.m31071i()) {
                c6734o0.m31068f();
            } else if (!c6721i.m31020p() && c6734o0.m31071i()) {
                c6734o0.m31069g();
            }
            if (c6734o0.m31071i() && (c6721i.m31022q() || c6721i.m31021p0() || c6721i.m31028t() || c6721i.m31026s())) {
                c6721i.m31025r0(c6734o0.f35195a);
            }
        }
    }

    /* renamed from: t0 */
    public static final AbstractC6724j0 m30973t0(AbstractC6724j0 abstractC6724j0) {
        try {
            abstractC6724j0.m31049s();
        } catch (IllegalArgumentException e10) {
            throw e10;
        } catch (Throwable th2) {
            abstractC6724j0.m13146i(new C6722i0(abstractC6724j0, new Status(AdError.BROKEN_MEDIA_ERROR_CODE)));
        }
        return abstractC6724j0;
    }

    /* renamed from: A */
    public AbstractC9317c<c> m30974A(JSONObject jSONObject) {
        C9935o.m41845e("Must be called from the main thread.");
        if (!m31027s0()) {
            return m30968c0(17, null);
        }
        C6755z c6755z = new C6755z(this, jSONObject);
        m30973t0(c6755z);
        return c6755z;
    }

    /* renamed from: B */
    public AbstractC9317c<c> m30975B() {
        return m30976C(null);
    }

    /* renamed from: C */
    public AbstractC9317c<c> m30976C(JSONObject jSONObject) {
        C9935o.m41845e("Must be called from the main thread.");
        if (!m31027s0()) {
            return m30968c0(17, null);
        }
        C6699a0 c6699a0 = new C6699a0(this, jSONObject);
        m30973t0(c6699a0);
        return c6699a0;
    }

    /* renamed from: D */
    public AbstractC9317c<c> m30977D(int i10, long j10, JSONObject jSONObject) {
        C9935o.m41845e("Must be called from the main thread.");
        if (!m31027s0()) {
            return m30968c0(17, null);
        }
        C6745u c6745u = new C6745u(this, i10, j10, jSONObject);
        m30973t0(c6745u);
        return c6745u;
    }

    /* renamed from: E */
    public AbstractC9317c<c> m30978E(int i10, JSONObject jSONObject) {
        return m30977D(i10, -1L, jSONObject);
    }

    /* renamed from: F */
    public AbstractC9317c<c> m30979F(C5791o[] c5791oArr, int i10, int i11, long j10, JSONObject jSONObject) {
        C9935o.m41845e("Must be called from the main thread.");
        if (!m31027s0()) {
            return m30968c0(17, null);
        }
        C6735p c6735p = new C6735p(this, c5791oArr, i10, i11, j10, jSONObject);
        m30973t0(c6735p);
        return c6735p;
    }

    /* renamed from: G */
    public AbstractC9317c<c> m30980G(C5791o[] c5791oArr, int i10, int i11, JSONObject jSONObject) {
        return m30979F(c5791oArr, i10, i11, -1L, jSONObject);
    }

    /* renamed from: H */
    public AbstractC9317c<c> m30981H(int i10, int i11, JSONObject jSONObject) {
        C9935o.m41845e("Must be called from the main thread.");
        if (!m31027s0()) {
            return m30968c0(17, null);
        }
        C6747v c6747v = new C6747v(this, i10, i11, jSONObject);
        m30973t0(c6747v);
        return c6747v;
    }

    /* renamed from: I */
    public AbstractC9317c<c> m30982I(JSONObject jSONObject) {
        C9935o.m41845e("Must be called from the main thread.");
        if (!m31027s0()) {
            return m30968c0(17, null);
        }
        C6741s c6741s = new C6741s(this, jSONObject);
        m30973t0(c6741s);
        return c6741s;
    }

    /* renamed from: J */
    public AbstractC9317c<c> m30983J(JSONObject jSONObject) {
        C9935o.m41845e("Must be called from the main thread.");
        if (!m31027s0()) {
            return m30968c0(17, null);
        }
        C6739r c6739r = new C6739r(this, jSONObject);
        m30973t0(c6739r);
        return c6739r;
    }

    /* renamed from: K */
    public AbstractC9317c<c> m30984K(int i10, JSONObject jSONObject) {
        C9935o.m41845e("Must be called from the main thread.");
        if (!m31027s0()) {
            return m30968c0(17, null);
        }
        C6743t c6743t = new C6743t(this, i10, jSONObject);
        m30973t0(c6743t);
        return c6743t;
    }

    /* renamed from: L */
    public AbstractC9317c<c> m30985L(int[] iArr, JSONObject jSONObject) {
        C9935o.m41845e("Must be called from the main thread.");
        if (!m31027s0()) {
            return m30968c0(17, null);
        }
        C6737q c6737q = new C6737q(this, iArr, jSONObject);
        m30973t0(c6737q);
        return c6737q;
    }

    /* renamed from: M */
    public void m30986M(a aVar) {
        C9935o.m41845e("Must be called from the main thread.");
        if (aVar != null) {
            this.f35169i.add(aVar);
        }
    }

    @Deprecated
    /* renamed from: N */
    public void m30987N(b bVar) {
        C9935o.m41845e("Must be called from the main thread.");
        if (bVar != null) {
            this.f35168h.remove(bVar);
        }
    }

    /* renamed from: O */
    public void m30988O(e eVar) {
        C9935o.m41845e("Must be called from the main thread.");
        C6734o0 c6734o0 = (C6734o0) this.f35170j.remove(eVar);
        if (c6734o0 != null) {
            c6734o0.m31067e(eVar);
            if (c6734o0.m31070h()) {
                return;
            }
            this.f35171k.remove(Long.valueOf(c6734o0.m31065b()));
            c6734o0.m31069g();
        }
    }

    /* renamed from: P */
    public AbstractC9317c<c> m30989P() {
        C9935o.m41845e("Must be called from the main thread.");
        if (!m31027s0()) {
            return m30968c0(17, null);
        }
        C6731n c6731n = new C6731n(this);
        m30973t0(c6731n);
        return c6731n;
    }

    @Deprecated
    /* renamed from: Q */
    public AbstractC9317c<c> m30990Q(long j10) {
        return m30991R(j10, 0, null);
    }

    @Deprecated
    /* renamed from: R */
    public AbstractC9317c<c> m30991R(long j10, int i10, JSONObject jSONObject) {
        C5794p.a aVar = new C5794p.a();
        aVar.m28301d(j10);
        aVar.m28302e(i10);
        aVar.m28299b(jSONObject);
        return m30992S(aVar.m28298a());
    }

    /* renamed from: S */
    public AbstractC9317c<c> m30992S(C5794p c5794p) {
        C9935o.m41845e("Must be called from the main thread.");
        if (!m31027s0()) {
            return m30968c0(17, null);
        }
        C6705c0 c6705c0 = new C6705c0(this, c5794p);
        m30973t0(c6705c0);
        return c6705c0;
    }

    /* renamed from: T */
    public AbstractC9317c<c> m30993T(long[] jArr) {
        C9935o.m41845e("Must be called from the main thread.");
        if (!m31027s0()) {
            return m30968c0(17, null);
        }
        C6733o c6733o = new C6733o(this, jArr);
        m30973t0(c6733o);
        return c6733o;
    }

    /* renamed from: U */
    public AbstractC9317c<c> m30994U() {
        C9935o.m41845e("Must be called from the main thread.");
        if (!m31027s0()) {
            return m30968c0(17, null);
        }
        C6729m c6729m = new C6729m(this);
        m30973t0(c6729m);
        return c6729m;
    }

    /* renamed from: V */
    public void m30995V() {
        C9935o.m41845e("Must be called from the main thread.");
        int m31016n = m31016n();
        if (m31016n == 4 || m31016n == 2) {
            m31034z();
        } else {
            m30975B();
        }
    }

    /* renamed from: W */
    public void m30996W(a aVar) {
        C9935o.m41845e("Must be called from the main thread.");
        if (aVar != null) {
            this.f35169i.remove(aVar);
        }
    }

    /* renamed from: X */
    public final int m30997X() {
        C5791o m31008i;
        if (m31009j() == null || !m31020p()) {
            return 0;
        }
        if (m31022q()) {
            return 6;
        }
        if (m31029u()) {
            return 3;
        }
        if (m31028t()) {
            return 2;
        }
        return (!m31026s() || (m31008i = m31008i()) == null || m31008i.m28283T() == null) ? 0 : 6;
    }

    @Override // p200l9.C5758e.e
    /* renamed from: a */
    public void mo28190a(CastDevice castDevice, String str, String str2) {
        this.f35163c.m34963r(str2);
    }

    @Deprecated
    /* renamed from: b */
    public void m30998b(b bVar) {
        C9935o.m41845e("Must be called from the main thread.");
        if (bVar != null) {
            this.f35168h.add(bVar);
        }
    }

    /* renamed from: c */
    public boolean m30999c(e eVar, long j10) {
        C9935o.m41845e("Must be called from the main thread.");
        if (eVar == null || this.f35170j.containsKey(eVar)) {
            return false;
        }
        Map map = this.f35171k;
        Long valueOf = Long.valueOf(j10);
        C6734o0 c6734o0 = (C6734o0) map.get(valueOf);
        C6734o0 c6734o02 = c6734o0;
        if (c6734o0 == null) {
            c6734o02 = new C6734o0(this, j10);
            this.f35171k.put(valueOf, c6734o02);
        }
        c6734o02.m31066d(eVar);
        this.f35170j.put(eVar, c6734o02);
        if (!m31020p()) {
            return true;
        }
        c6734o02.m31068f();
        return true;
    }

    /* renamed from: d */
    public long m31000d() {
        long m34942F;
        synchronized (this.f35161a) {
            C9935o.m41845e("Must be called from the main thread.");
            m34942F = this.f35163c.m34942F();
        }
        return m34942F;
    }

    /* renamed from: d0 */
    public final AbstractC9317c m31001d0() {
        C9935o.m41845e("Must be called from the main thread.");
        if (!m31027s0()) {
            return m30968c0(17, null);
        }
        C6749w c6749w = new C6749w(this, true);
        m30973t0(c6749w);
        return c6749w;
    }

    /* renamed from: e */
    public long m31002e() {
        long m34943G;
        synchronized (this.f35161a) {
            C9935o.m41845e("Must be called from the main thread.");
            m34943G = this.f35163c.m34943G();
        }
        return m34943G;
    }

    /* renamed from: e0 */
    public final AbstractC9317c m31003e0(int[] iArr) {
        C9935o.m41845e("Must be called from the main thread.");
        if (!m31027s0()) {
            return m30968c0(17, null);
        }
        C6751x c6751x = new C6751x(this, true, iArr);
        m30973t0(c6751x);
        return c6751x;
    }

    /* renamed from: f */
    public long m31004f() {
        long m34944H;
        synchronized (this.f35161a) {
            C9935o.m41845e("Must be called from the main thread.");
            m34944H = this.f35163c.m34944H();
        }
        return m34944H;
    }

    /* renamed from: f0 */
    public final AbstractC10144i m31005f0(JSONObject jSONObject) {
        C9935o.m41845e("Must be called from the main thread.");
        if (!m31027s0()) {
            return C10148l.m42586d(new C8045q());
        }
        this.f35167g = new C10146j();
        f35160n.m34873a("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
        MediaInfo m31009j = m31009j();
        C5797q m31012l = m31012l();
        C5800r c5800r = null;
        if (m31009j != null) {
            if (m31012l == null) {
                c5800r = null;
            } else {
                C5779k.a aVar = new C5779k.a();
                aVar.m28239h(m31009j);
                aVar.m28237f(m31006g());
                aVar.m28241j(m31012l.m28319e0());
                aVar.m28240i(m31012l.m28316b0());
                aVar.m28233b(m31012l.m28304P());
                aVar.m28238g(m31012l.m28308T());
                C5779k m28232a = aVar.m28232a();
                C5800r.a aVar2 = new C5800r.a();
                aVar2.m28339b(m28232a);
                c5800r = aVar2.m28338a();
            }
        }
        C10146j c10146j = this.f35167g;
        if (c5800r != null) {
            c10146j.m42580c(c5800r);
        } else {
            c10146j.m42579b(new C8045q());
        }
        return this.f35167g.m42578a();
    }

    /* renamed from: g */
    public long m31006g() {
        long m34945I;
        synchronized (this.f35161a) {
            C9935o.m41845e("Must be called from the main thread.");
            m34945I = this.f35163c.m34945I();
        }
        return m34945I;
    }

    /* renamed from: h */
    public int m31007h() {
        int m28309U;
        synchronized (this.f35161a) {
            C9935o.m41845e("Must be called from the main thread.");
            C5797q m31012l = m31012l();
            m28309U = m31012l != null ? m31012l.m28309U() : 0;
        }
        return m28309U;
    }

    /* renamed from: i */
    public C5791o m31008i() {
        C9935o.m41845e("Must be called from the main thread.");
        C5797q m31012l = m31012l();
        if (m31012l == null) {
            return null;
        }
        return m31012l.m28321g0(m31012l.m28314Z());
    }

    /* renamed from: j */
    public MediaInfo m31009j() {
        MediaInfo m34961n;
        synchronized (this.f35161a) {
            C9935o.m41845e("Must be called from the main thread.");
            m34961n = this.f35163c.m34961n();
        }
        return m34961n;
    }

    /* renamed from: k */
    public C6707d m31010k() {
        C6707d c6707d;
        synchronized (this.f35161a) {
            C9935o.m41845e("Must be called from the main thread.");
            c6707d = this.f35165e;
        }
        return c6707d;
    }

    /* renamed from: k0 */
    public final void m31011k0() {
        InterfaceC5749b2 interfaceC5749b2 = this.f35166f;
        if (interfaceC5749b2 == null) {
            return;
        }
        interfaceC5749b2.mo28162j(m31014m(), this);
        m30989P();
    }

    /* renamed from: l */
    public C5797q m31012l() {
        C5797q m34962o;
        synchronized (this.f35161a) {
            C9935o.m41845e("Must be called from the main thread.");
            m34962o = this.f35163c.m34962o();
        }
        return m34962o;
    }

    /* renamed from: l0 */
    public final void m31013l0(C5800r c5800r) {
        C5779k m28337P;
        if (c5800r == null || (m28337P = c5800r.m28337P()) == null) {
            return;
        }
        f35160n.m34873a("resume SessionState", new Object[0]);
        m31033y(m28337P);
    }

    /* renamed from: m */
    public String m31014m() {
        C9935o.m41845e("Must be called from the main thread.");
        return this.f35163c.m34904b();
    }

    /* renamed from: m0 */
    public final void m31015m0(InterfaceC5749b2 interfaceC5749b2) {
        InterfaceC5749b2 interfaceC5749b22 = this.f35166f;
        if (interfaceC5749b22 == interfaceC5749b2) {
            return;
        }
        if (interfaceC5749b22 != null) {
            this.f35163c.mo34905c();
            this.f35165e.m30889n();
            interfaceC5749b22.mo28163k(m31014m());
            this.f35164d.m30911b(null);
            this.f35162b.removeCallbacksAndMessages(null);
        }
        this.f35166f = interfaceC5749b2;
        if (interfaceC5749b2 != null) {
            this.f35164d.m30911b(interfaceC5749b2);
        }
    }

    /* renamed from: n */
    public int m31016n() {
        int m28317c0;
        synchronized (this.f35161a) {
            C9935o.m41845e("Must be called from the main thread.");
            C5797q m31012l = m31012l();
            m28317c0 = m31012l != null ? m31012l.m28317c0() : 1;
        }
        return m28317c0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r0.intValue() < (r0.m28322h0() - 1)) goto L16;
     */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m31017n0() {
        /*
            r4 = this;
            r0 = r4
            boolean r0 = r0.m31020p()
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r4
            l9.q r0 = r0.m31012l()
            java.lang.Object r0 = p422y9.C9935o.m41850j(r0)
            l9.q r0 = (p200l9.C5797q) r0
            r8 = r0
            r0 = r8
            r1 = 64
            boolean r0 = r0.m28329o0(r1)
            if (r0 == 0) goto L26
            r0 = 1
            return r0
        L26:
            r0 = r8
            int r0 = r0.m28324j0()
            if (r0 != 0) goto L4f
            r0 = r8
            r1 = r8
            int r1 = r1.m28307S()
            java.lang.Integer r0 = r0.m28310V(r1)
            r7 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            if (r0 == 0) goto L51
            r0 = r6
            r5 = r0
            r0 = r7
            int r0 = r0.intValue()
            r1 = r8
            int r1 = r1.m28322h0()
            r2 = 1
            int r1 = r1 - r2
            if (r0 >= r1) goto L51
        L4f:
            r0 = 1
            r5 = r0
        L51:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p230n9.C6721i.m31017n0():boolean");
    }

    /* renamed from: o */
    public long m31018o() {
        long m34947K;
        synchronized (this.f35161a) {
            C9935o.m41845e("Must be called from the main thread.");
            m34947K = this.f35163c.m34947K();
        }
        return m34947K;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r0.intValue() > 0) goto L16;
     */
    /* renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m31019o0() {
        /*
            r4 = this;
            r0 = r4
            boolean r0 = r0.m31020p()
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r4
            l9.q r0 = r0.m31012l()
            java.lang.Object r0 = p422y9.C9935o.m41850j(r0)
            l9.q r0 = (p200l9.C5797q) r0
            r7 = r0
            r0 = r7
            r1 = 128(0x80, double:6.3E-322)
            boolean r0 = r0.m28329o0(r1)
            if (r0 == 0) goto L24
            r0 = 1
            return r0
        L24:
            r0 = r7
            int r0 = r0.m28324j0()
            if (r0 != 0) goto L43
            r0 = r7
            r1 = r7
            int r1 = r1.m28307S()
            java.lang.Integer r0 = r0.m28310V(r1)
            r7 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            if (r0 == 0) goto L45
            r0 = r6
            r5 = r0
            r0 = r7
            int r0 = r0.intValue()
            if (r0 <= 0) goto L45
        L43:
            r0 = 1
            r5 = r0
        L45:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p230n9.C6721i.m31019o0():boolean");
    }

    /* renamed from: p */
    public boolean m31020p() {
        C9935o.m41845e("Must be called from the main thread.");
        return m31022q() || m31021p0() || m31029u() || m31028t() || m31026s();
    }

    /* renamed from: p0 */
    public final boolean m31021p0() {
        C9935o.m41845e("Must be called from the main thread.");
        C5797q m31012l = m31012l();
        return m31012l != null && m31012l.m28317c0() == 5;
    }

    /* renamed from: q */
    public boolean m31022q() {
        C9935o.m41845e("Must be called from the main thread.");
        C5797q m31012l = m31012l();
        return m31012l != null && m31012l.m28317c0() == 4;
    }

    /* renamed from: q0 */
    public final boolean m31023q0() {
        C9935o.m41845e("Must be called from the main thread.");
        if (!m31024r()) {
            return true;
        }
        C5797q m31012l = m31012l();
        return (m31012l == null || !m31012l.m28329o0(2L) || m31012l.m28313Y() == null) ? false : true;
    }

    /* renamed from: r */
    public boolean m31024r() {
        C9935o.m41845e("Must be called from the main thread.");
        MediaInfo m31009j = m31009j();
        return m31009j != null && m31009j.m13068b0() == 2;
    }

    /* renamed from: r0 */
    public final void m31025r0(Set set) {
        MediaInfo m28283T;
        HashSet hashSet = new HashSet(set);
        if (m31029u() || m31028t() || m31022q() || m31021p0()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((e) it.next()).mo29582a(m31006g(), m31018o());
            }
        } else {
            if (!m31026s()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).mo29582a(0L, 0L);
                }
                return;
            }
            C5791o m31008i = m31008i();
            if (m31008i == null || (m28283T = m31008i.m28283T()) == null) {
                return;
            }
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                ((e) it3.next()).mo29582a(0L, m28283T.m13067a0());
            }
        }
    }

    /* renamed from: s */
    public boolean m31026s() {
        C9935o.m41845e("Must be called from the main thread.");
        C5797q m31012l = m31012l();
        return (m31012l == null || m31012l.m28314Z() == 0) ? false : true;
    }

    /* renamed from: s0 */
    public final boolean m31027s0() {
        return this.f35166f != null;
    }

    /* renamed from: t */
    public boolean m31028t() {
        C9935o.m41845e("Must be called from the main thread.");
        C5797q m31012l = m31012l();
        boolean z10 = true;
        if (m31012l != null) {
            if (m31012l.m28317c0() != 3) {
                if (m31024r() && m31007h() == 2) {
                    return true;
                }
            }
            return z10;
        }
        z10 = false;
        return z10;
    }

    /* renamed from: u */
    public boolean m31029u() {
        C9935o.m41845e("Must be called from the main thread.");
        C5797q m31012l = m31012l();
        return m31012l != null && m31012l.m28317c0() == 2;
    }

    /* renamed from: v */
    public boolean m31030v() {
        C9935o.m41845e("Must be called from the main thread.");
        C5797q m31012l = m31012l();
        return m31012l != null && m31012l.m28331q0();
    }

    /* renamed from: w */
    public AbstractC9317c<c> m31031w(MediaInfo mediaInfo, C5776j c5776j) {
        C5779k.a aVar = new C5779k.a();
        aVar.m28239h(mediaInfo);
        aVar.m28234c(Boolean.valueOf(c5776j.m28213b()));
        aVar.m28237f(c5776j.m28217f());
        aVar.m28240i(c5776j.m28218g());
        aVar.m28233b(c5776j.m28212a());
        aVar.m28238g(c5776j.m28216e());
        aVar.m28235d(c5776j.m28214c());
        aVar.m28236e(c5776j.m28215d());
        return m31033y(aVar.m28232a());
    }

    @Deprecated
    /* renamed from: x */
    public AbstractC9317c<c> m31032x(MediaInfo mediaInfo, boolean z10, long j10) {
        C5776j.a aVar = new C5776j.a();
        aVar.m28220b(z10);
        aVar.m28221c(j10);
        return m31031w(mediaInfo, aVar.m28219a());
    }

    /* renamed from: y */
    public AbstractC9317c<c> m31033y(C5779k c5779k) {
        C9935o.m41845e("Must be called from the main thread.");
        if (!m31027s0()) {
            return m30968c0(17, null);
        }
        C6753y c6753y = new C6753y(this, c5779k);
        m30973t0(c6753y);
        return c6753y;
    }

    /* renamed from: z */
    public AbstractC9317c<c> m31034z() {
        return m30974A(null);
    }
}
