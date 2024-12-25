package p200l9;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.AbstractC2416c;
import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import ma.HandlerC6385s1;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p200l9.C5758e;
import p304r9.C8013a;
import p304r9.C8015b;
import p304r9.C8017c;
import p304r9.C8021e;
import p304r9.C8029i;
import p304r9.C8037m;
import p304r9.C8048r0;
import p304r9.InterfaceC8033k;
import p368v9.C9315a;
import p383w9.AbstractC9515r;
import p383w9.C9472i;
import p383w9.C9497n;
import p383w9.InterfaceC9502o;
import p422y9.C9896b;
import p422y9.C9935o;
import za.AbstractC10144i;
import za.C10146j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/w0.class
 */
@SuppressLint({"UseSparseArrays"})
/* renamed from: l9.w0 */
/* loaded from: combined.jar:classes2.jar:l9/w0.class */
public final class C5816w0 extends AbstractC2416c implements InterfaceC5749b2 {

    /* renamed from: A */
    public static final C2414a.a f32417A;

    /* renamed from: B */
    public static final C2414a f32418B;

    /* renamed from: z */
    public static final C8015b f32419z = new C8015b("CastClient");

    /* renamed from: d */
    public final BinderC5813v0 f32420d;

    /* renamed from: e */
    public Handler f32421e;

    /* renamed from: f */
    public boolean f32422f;

    /* renamed from: g */
    public boolean f32423g;

    /* renamed from: h */
    public C10146j f32424h;

    /* renamed from: i */
    public C10146j f32425i;

    /* renamed from: j */
    public final AtomicLong f32426j;

    /* renamed from: k */
    public final Object f32427k;

    /* renamed from: l */
    public final Object f32428l;

    /* renamed from: m */
    public C5754d f32429m;

    /* renamed from: n */
    public String f32430n;

    /* renamed from: o */
    public double f32431o;

    /* renamed from: p */
    public boolean f32432p;

    /* renamed from: q */
    public int f32433q;

    /* renamed from: r */
    public int f32434r;

    /* renamed from: s */
    public C5824z f32435s;

    /* renamed from: t */
    public final CastDevice f32436t;

    /* renamed from: u */
    public final Map f32437u;

    /* renamed from: v */
    public final Map f32438v;

    /* renamed from: w */
    public final C5758e.d f32439w;

    /* renamed from: x */
    public final List f32440x;

    /* renamed from: y */
    public int f32441y;

    static {
        C5789n0 c5789n0 = new C5789n0();
        f32417A = c5789n0;
        f32418B = new C2414a("Cast.API_CXLESS", c5789n0, C8037m.f38831b);
    }

    public C5816w0(Context context, C5758e.c cVar) {
        super(context, (C2414a<C5758e.c>) f32418B, cVar, AbstractC2416c.a.f14810c);
        this.f32420d = new BinderC5813v0(this);
        this.f32427k = new Object();
        this.f32428l = new Object();
        this.f32440x = Collections.synchronizedList(new ArrayList());
        C9935o.m41851k(context, "context cannot be null");
        C9935o.m41851k(cVar, "CastOptions cannot be null");
        this.f32439w = cVar.f32220c;
        this.f32436t = cVar.f32219b;
        this.f32437u = new HashMap();
        this.f32438v = new HashMap();
        this.f32426j = new AtomicLong(0L);
        this.f32441y = 1;
        m28400E();
    }

    /* renamed from: F */
    public static /* bridge */ /* synthetic */ Handler m28376F(C5816w0 c5816w0) {
        if (c5816w0.f32421e == null) {
            c5816w0.f32421e = new HandlerC6385s1(c5816w0.getLooper());
        }
        return c5816w0.f32421e;
    }

    /* renamed from: P */
    public static /* bridge */ /* synthetic */ void m28386P(C5816w0 c5816w0) {
        c5816w0.f32433q = -1;
        c5816w0.f32434r = -1;
        c5816w0.f32429m = null;
        c5816w0.f32430n = null;
        c5816w0.f32431o = 0.0d;
        c5816w0.m28400E();
        c5816w0.f32432p = false;
        c5816w0.f32435s = null;
    }

    /* renamed from: Q */
    public static /* bridge */ /* synthetic */ void m28387Q(C5816w0 c5816w0, C8017c c8017c) {
        boolean z10;
        String m34882P = c8017c.m34882P();
        if (C8013a.m34870k(m34882P, c5816w0.f32430n)) {
            z10 = false;
        } else {
            c5816w0.f32430n = m34882P;
            z10 = true;
        }
        f32419z.m34873a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(c5816w0.f32423g));
        C5758e.d dVar = c5816w0.f32439w;
        if (dVar != null && (z10 || c5816w0.f32423g)) {
            dVar.mo28186d();
        }
        c5816w0.f32423g = false;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m28388b(C5816w0 c5816w0, C8021e c8021e) {
        boolean z10;
        boolean z11;
        boolean z12;
        C5754d m34887T = c8021e.m34887T();
        if (!C8013a.m34870k(m34887T, c5816w0.f32429m)) {
            c5816w0.f32429m = m34887T;
            c5816w0.f32439w.mo28185c(m34887T);
        }
        double m34884Q = c8021e.m34884Q();
        if (Double.isNaN(m34884Q) || Math.abs(m34884Q - c5816w0.f32431o) <= 1.0E-7d) {
            z10 = false;
        } else {
            c5816w0.f32431o = m34884Q;
            z10 = true;
        }
        boolean m34889V = c8021e.m34889V();
        if (m34889V != c5816w0.f32432p) {
            c5816w0.f32432p = m34889V;
            z10 = true;
        }
        C8015b c8015b = f32419z;
        c8015b.m34873a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(c5816w0.f32422f));
        C5758e.d dVar = c5816w0.f32439w;
        if (dVar != null && (z10 || c5816w0.f32422f)) {
            dVar.mo28189g();
        }
        Double.isNaN(c8021e.m34883P());
        int m34885R = c8021e.m34885R();
        if (m34885R != c5816w0.f32433q) {
            c5816w0.f32433q = m34885R;
            z11 = true;
        } else {
            z11 = false;
        }
        c8015b.m34873a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(c5816w0.f32422f));
        C5758e.d dVar2 = c5816w0.f32439w;
        if (dVar2 != null && (z11 || c5816w0.f32422f)) {
            dVar2.mo28183a(c5816w0.f32433q);
        }
        int m34886S = c8021e.m34886S();
        if (m34886S != c5816w0.f32434r) {
            c5816w0.f32434r = m34886S;
            z12 = true;
        } else {
            z12 = false;
        }
        c8015b.m34873a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(c5816w0.f32422f));
        C5758e.d dVar3 = c5816w0.f32439w;
        if (dVar3 != null && (z12 || c5816w0.f32422f)) {
            dVar3.mo28188f(c5816w0.f32434r);
        }
        if (!C8013a.m34870k(c5816w0.f32435s, c8021e.m34888U())) {
            c5816w0.f32435s = c8021e.m34888U();
        }
        c5816w0.f32422f = false;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m28391m(C5816w0 c5816w0, C5758e.a aVar) {
        synchronized (c5816w0.f32427k) {
            C10146j c10146j = c5816w0.f32424h;
            if (c10146j != null) {
                c10146j.m42580c(aVar);
            }
            c5816w0.f32424h = null;
        }
    }

    /* renamed from: n */
    public static /* bridge */ /* synthetic */ void m28392n(C5816w0 c5816w0, long j10, int i10) {
        C10146j c10146j;
        synchronized (c5816w0.f32437u) {
            Map map = c5816w0.f32437u;
            Long valueOf = Long.valueOf(j10);
            c10146j = (C10146j) map.get(valueOf);
            c5816w0.f32437u.remove(valueOf);
        }
        if (c10146j != null) {
            if (i10 == 0) {
                c10146j.m42580c(null);
            } else {
                c10146j.m42579b(m28395x(i10));
            }
        }
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ void m28393o(C5816w0 c5816w0, int i10) {
        synchronized (c5816w0.f32428l) {
            C10146j c10146j = c5816w0.f32425i;
            if (c10146j == null) {
                return;
            }
            if (i10 == 0) {
                c10146j.m42580c(new Status(0));
            } else {
                c10146j.m42579b(m28395x(i10));
            }
            c5816w0.f32425i = null;
        }
    }

    /* renamed from: x */
    public static C9315a m28395x(int i10) {
        return C9896b.m41761a(new Status(i10));
    }

    /* renamed from: A */
    public final void m28396A() {
        f32419z.m34873a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.f32438v) {
            this.f32438v.clear();
        }
    }

    /* renamed from: B */
    public final void m28397B(C10146j c10146j) {
        synchronized (this.f32427k) {
            if (this.f32424h != null) {
                m28398C(2477);
            }
            this.f32424h = c10146j;
        }
    }

    /* renamed from: C */
    public final void m28398C(int i10) {
        synchronized (this.f32427k) {
            C10146j c10146j = this.f32424h;
            if (c10146j != null) {
                c10146j.m42579b(m28395x(i10));
            }
            this.f32424h = null;
        }
    }

    /* renamed from: D */
    public final void m28399D() {
        boolean z10 = true;
        if (this.f32441y == 1) {
            z10 = false;
        }
        C9935o.m41854n(z10, "Not active connection");
    }

    @RequiresNonNull({"device"})
    /* renamed from: E */
    public final double m28400E() {
        if (this.f32436t.m13045W(2048)) {
            return 0.02d;
        }
        return (!this.f32436t.m13045W(4) || this.f32436t.m13045W(1) || "Chromecast Audio".equals(this.f32436t.m13043U())) ? 0.05d : 0.02d;
    }

    @Override // p200l9.InterfaceC5749b2
    /* renamed from: c */
    public final AbstractC10144i mo28156c() {
        C9472i registerListener = registerListener(this.f32420d, "castDeviceControllerListenerKey");
        C9497n.a m39964a = C9497n.m39964a();
        return doRegisterEventListener(m39964a.m39972f(registerListener).m39968b(new InterfaceC9502o(this) { // from class: l9.c0

            /* renamed from: a */
            public final C5816w0 f32205a;

            {
                this.f32205a = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p383w9.InterfaceC9502o
            public final void accept(Object obj, Object obj2) {
                C8048r0 c8048r0 = (C8048r0) obj;
                ((C8029i) c8048r0.getService()).m34895F1(this.f32205a.f32420d);
                ((C8029i) c8048r0.getService()).m34892C1();
                ((C10146j) obj2).m42580c(null);
            }
        }).m39971e(new InterfaceC9502o() { // from class: l9.i0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p383w9.InterfaceC9502o
            public final void accept(Object obj, Object obj2) {
                C8015b c8015b = C5816w0.f32419z;
                ((C8029i) ((C8048r0) obj).getService()).m34900K1();
                ((C10146j) obj2).m42580c(Boolean.TRUE);
            }
        }).m39969c(C5747b0.f32186b).m39970d(8428).m39967a());
    }

    @Override // p200l9.InterfaceC5749b2
    /* renamed from: d */
    public final AbstractC10144i mo28157d() {
        AbstractC10144i doWrite = doWrite(AbstractC9515r.m40018a().m40024b(new InterfaceC9502o() { // from class: l9.j0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p383w9.InterfaceC9502o
            public final void accept(Object obj, Object obj2) {
                C8015b c8015b = C5816w0.f32419z;
                ((C8029i) ((C8048r0) obj).getService()).m34902d();
                ((C10146j) obj2).m42580c(null);
            }
        }).m40027e(8403).m40023a());
        m28396A();
        m28408y(this.f32420d);
        return doWrite;
    }

    @Override // p200l9.InterfaceC5749b2
    /* renamed from: f */
    public final boolean mo28158f() {
        return this.f32441y == 2;
    }

    @Override // p200l9.InterfaceC5749b2
    /* renamed from: g */
    public final boolean mo28159g() {
        m28409z();
        return this.f32432p;
    }

    @Override // p200l9.InterfaceC5749b2
    /* renamed from: h */
    public final void mo28160h(C5745a2 c5745a2) {
        C9935o.m41850j(c5745a2);
        this.f32440x.add(c5745a2);
    }

    @Override // p200l9.InterfaceC5749b2
    /* renamed from: i */
    public final AbstractC10144i mo28161i(final String str, final String str2) {
        C8013a.m34865f(str);
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (str2.length() <= 524288) {
            final String str3 = null;
            return doWrite(AbstractC9515r.m40018a().m40024b(new InterfaceC9502o(this, str3, str, str2) { // from class: l9.f0

                /* renamed from: a */
                public final C5816w0 f32231a;

                /* renamed from: b */
                public final String f32232b;

                /* renamed from: c */
                public final String f32233c;

                {
                    this.f32231a = this;
                    this.f32232b = str;
                    this.f32233c = str2;
                }

                @Override // p383w9.InterfaceC9502o
                public final void accept(Object obj, Object obj2) {
                    this.f32231a.m28404s(null, this.f32232b, this.f32233c, (C8048r0) obj, (C10146j) obj2);
                }
            }).m40027e(8405).m40023a());
        }
        f32419z.m34878f("Message send failed. Message exceeds maximum size", new Object[0]);
        throw new IllegalArgumentException("Message exceeds maximum size524288");
    }

    @Override // p200l9.InterfaceC5749b2
    /* renamed from: j */
    public final AbstractC10144i mo28162j(final String str, final C5758e.e eVar) {
        C8013a.m34865f(str);
        if (eVar != null) {
            synchronized (this.f32438v) {
                this.f32438v.put(str, eVar);
            }
        }
        return doWrite(AbstractC9515r.m40018a().m40024b(new InterfaceC9502o(this, str, eVar) { // from class: l9.m0

            /* renamed from: a */
            public final C5816w0 f32316a;

            /* renamed from: b */
            public final String f32317b;

            /* renamed from: c */
            public final C5758e.e f32318c;

            {
                this.f32316a = this;
                this.f32317b = str;
                this.f32318c = eVar;
            }

            @Override // p383w9.InterfaceC9502o
            public final void accept(Object obj, Object obj2) {
                this.f32316a.m28405t(this.f32317b, this.f32318c, (C8048r0) obj, (C10146j) obj2);
            }
        }).m40027e(8413).m40023a());
    }

    @Override // p200l9.InterfaceC5749b2
    /* renamed from: k */
    public final AbstractC10144i mo28163k(final String str) {
        final C5758e.e eVar;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        synchronized (this.f32438v) {
            eVar = (C5758e.e) this.f32438v.remove(str);
        }
        return doWrite(AbstractC9515r.m40018a().m40024b(new InterfaceC9502o(this, eVar, str) { // from class: l9.l0

            /* renamed from: a */
            public final C5816w0 f32307a;

            /* renamed from: b */
            public final C5758e.e f32308b;

            /* renamed from: c */
            public final String f32309c;

            {
                this.f32307a = this;
                this.f32308b = eVar;
                this.f32309c = str;
            }

            @Override // p383w9.InterfaceC9502o
            public final void accept(Object obj, Object obj2) {
                this.f32307a.m28403r(this.f32308b, this.f32309c, (C8048r0) obj, (C10146j) obj2);
            }
        }).m40027e(8414).m40023a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public final /* synthetic */ void m28401p(String str, String str2, C5819x0 c5819x0, C8048r0 c8048r0, C10146j c10146j) {
        m28409z();
        ((C8029i) c8048r0.getService()).m34893D1(str, str2, null);
        m28397B(c10146j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public final /* synthetic */ void m28402q(String str, C5770h c5770h, C8048r0 c8048r0, C10146j c10146j) {
        m28409z();
        ((C8029i) c8048r0.getService()).m34894E1(str, c5770h);
        m28397B(c10146j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public final /* synthetic */ void m28403r(C5758e.e eVar, String str, C8048r0 c8048r0, C10146j c10146j) {
        m28399D();
        if (eVar != null) {
            ((C8029i) c8048r0.getService()).m34901L1(str);
        }
        c10146j.m42580c(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public final /* synthetic */ void m28404s(String str, String str2, String str3, C8048r0 c8048r0, C10146j c10146j) {
        long incrementAndGet = this.f32426j.incrementAndGet();
        m28409z();
        try {
            this.f32437u.put(Long.valueOf(incrementAndGet), c10146j);
            ((C8029i) c8048r0.getService()).m34897H1(str2, str3, incrementAndGet);
        } catch (RemoteException e10) {
            this.f32437u.remove(Long.valueOf(incrementAndGet));
            c10146j.m42579b(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public final /* synthetic */ void m28405t(String str, C5758e.e eVar, C8048r0 c8048r0, C10146j c10146j) {
        m28399D();
        ((C8029i) c8048r0.getService()).m34901L1(str);
        if (eVar != null) {
            ((C8029i) c8048r0.getService()).m34896G1(str);
        }
        c10146j.m42580c(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    public final /* synthetic */ void m28406u(boolean z10, C8048r0 c8048r0, C10146j c10146j) {
        ((C8029i) c8048r0.getService()).m34898I1(z10, this.f32431o, this.f32432p);
        c10146j.m42580c(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v */
    public final /* synthetic */ void m28407v(String str, C8048r0 c8048r0, C10146j c10146j) {
        m28409z();
        ((C8029i) c8048r0.getService()).m34899J1(str);
        synchronized (this.f32428l) {
            if (this.f32425i != null) {
                c10146j.m42579b(m28395x(AdError.INTERNAL_ERROR_CODE));
            } else {
                this.f32425i = c10146j;
            }
        }
    }

    /* renamed from: y */
    public final AbstractC10144i m28408y(InterfaceC8033k interfaceC8033k) {
        return doUnregisterEventListener((C9472i.a) C9935o.m41851k(registerListener(interfaceC8033k, "castDeviceControllerListenerKey").m39923b(), "Key must not be null"), 8415);
    }

    /* renamed from: z */
    public final void m28409z() {
        C9935o.m41854n(mo28158f(), "Not connected to device");
    }
}
