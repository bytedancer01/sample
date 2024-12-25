package p383w9;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC2416c;
import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC2418a;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import la.HandlerC5836j;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p060da.C4410i;
import p294r.C7929b;
import p350u9.C8804b;
import p350u9.C8812f;
import p368v9.InterfaceC9320f;
import p383w9.C9472i;
import p422y9.AbstractC9914h;
import p422y9.C9918i0;
import p422y9.C9929m;
import p422y9.C9938p;
import p422y9.C9941q;
import p422y9.C9947s;
import p422y9.C9950t;
import p422y9.InterfaceC9953u;
import za.AbstractC10144i;
import za.C10146j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/f.class
 */
/* renamed from: w9.f */
/* loaded from: combined.jar:classes2.jar:w9/f.class */
public class C9457f implements Handler.Callback {

    /* renamed from: s */
    public static final Status f43236s = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: t */
    public static final Status f43237t = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: u */
    public static final Object f43238u = new Object();

    /* renamed from: v */
    public static C9457f f43239v;

    /* renamed from: f */
    public C9947s f43244f;

    /* renamed from: g */
    public InterfaceC9953u f43245g;

    /* renamed from: h */
    public final Context f43246h;

    /* renamed from: i */
    public final C8812f f43247i;

    /* renamed from: j */
    public final C9918i0 f43248j;

    /* renamed from: q */
    @NotOnlyInitialized
    public final Handler f43255q;

    /* renamed from: r */
    public volatile boolean f43256r;

    /* renamed from: b */
    public long f43240b = 5000;

    /* renamed from: c */
    public long f43241c = 120000;

    /* renamed from: d */
    public long f43242d = 10000;

    /* renamed from: e */
    public boolean f43243e = false;

    /* renamed from: k */
    public final AtomicInteger f43249k = new AtomicInteger(1);

    /* renamed from: l */
    public final AtomicInteger f43250l = new AtomicInteger(0);

    /* renamed from: m */
    public final Map<C9437b<?>, C9464g1<?>> f43251m = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: n */
    public C9539x f43252n = null;

    /* renamed from: o */
    public final Set<C9437b<?>> f43253o = new C7929b();

    /* renamed from: p */
    public final Set<C9437b<?>> f43254p = new C7929b();

    public C9457f(Context context, Looper looper, C8812f c8812f) {
        this.f43256r = true;
        this.f43246h = context;
        HandlerC5836j handlerC5836j = new HandlerC5836j(looper, this);
        this.f43255q = handlerC5836j;
        this.f43247i = c8812f;
        this.f43248j = new C9918i0(c8812f);
        if (C4410i.m22440a(context)) {
            this.f43256r = false;
        }
        handlerC5836j.sendMessage(handlerC5836j.obtainMessage(6));
    }

    /* renamed from: h */
    public static Status m39832h(C9437b<?> c9437b, C8804b c8804b) {
        String m39800b = c9437b.m39800b();
        String valueOf = String.valueOf(c8804b);
        StringBuilder sb2 = new StringBuilder(String.valueOf(m39800b).length() + 63 + valueOf.length());
        sb2.append("API: ");
        sb2.append(m39800b);
        sb2.append(" is not available on this device. Connection failed with: ");
        sb2.append(valueOf);
        return new Status(c8804b, sb2.toString());
    }

    /* renamed from: x */
    public static C9457f m39842x(Context context) {
        C9457f c9457f;
        synchronized (f43238u) {
            if (f43239v == null) {
                f43239v = new C9457f(context.getApplicationContext(), AbstractC9914h.m41791c().getLooper(), C8812f.m37675q());
            }
            c9457f = f43239v;
        }
        return c9457f;
    }

    /* renamed from: A */
    public final <O extends C2414a.d> AbstractC10144i<Void> m39844A(AbstractC2416c<O> abstractC2416c, AbstractC9492m<C2414a.b, ?> abstractC9492m, AbstractC9519s<C2414a.b, ?> abstractC9519s, Runnable runnable) {
        C10146j c10146j = new C10146j();
        m39859l(c10146j, abstractC9492m.m39949e(), abstractC2416c);
        C9514q2 c9514q2 = new C9514q2(new C9537w1(abstractC9492m, abstractC9519s, runnable), c10146j);
        Handler handler = this.f43255q;
        handler.sendMessage(handler.obtainMessage(8, new C9533v1(c9514q2, this.f43250l.get(), abstractC2416c)));
        return c10146j.m42578a();
    }

    /* renamed from: B */
    public final <O extends C2414a.d> AbstractC10144i<Boolean> m39845B(AbstractC2416c<O> abstractC2416c, C9472i.a aVar, int i10) {
        C10146j c10146j = new C10146j();
        m39859l(c10146j, i10, abstractC2416c);
        C9522s2 c9522s2 = new C9522s2(aVar, c10146j);
        Handler handler = this.f43255q;
        handler.sendMessage(handler.obtainMessage(13, new C9533v1(c9522s2, this.f43250l.get(), abstractC2416c)));
        return c10146j.m42578a();
    }

    /* renamed from: G */
    public final <O extends C2414a.d> void m39846G(AbstractC2416c<O> abstractC2416c, int i10, AbstractC2418a<? extends InterfaceC9320f, C2414a.b> abstractC2418a) {
        C9510p2 c9510p2 = new C9510p2(i10, abstractC2418a);
        Handler handler = this.f43255q;
        handler.sendMessage(handler.obtainMessage(4, new C9533v1(c9510p2, this.f43250l.get(), abstractC2416c)));
    }

    /* renamed from: H */
    public final <O extends C2414a.d, ResultT> void m39847H(AbstractC2416c<O> abstractC2416c, int i10, AbstractC9515r<C2414a.b, ResultT> abstractC9515r, C10146j<ResultT> c10146j, InterfaceC9511q interfaceC9511q) {
        m39859l(c10146j, abstractC9515r.m40020d(), abstractC2416c);
        C9518r2 c9518r2 = new C9518r2(i10, abstractC9515r, c10146j, interfaceC9511q);
        Handler handler = this.f43255q;
        handler.sendMessage(handler.obtainMessage(4, new C9533v1(c9518r2, this.f43250l.get(), abstractC2416c)));
    }

    /* renamed from: I */
    public final void m39848I(C9929m c9929m, int i10, long j10, int i11) {
        Handler handler = this.f43255q;
        handler.sendMessage(handler.obtainMessage(18, new C9521s1(c9929m, i10, j10, i11)));
    }

    /* renamed from: J */
    public final void m39849J(C8804b c8804b, int i10) {
        if (m39855g(c8804b, i10)) {
            return;
        }
        Handler handler = this.f43255q;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, c8804b));
    }

    /* renamed from: a */
    public final void m39850a() {
        Handler handler = this.f43255q;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: b */
    public final void m39851b(AbstractC2416c<?> abstractC2416c) {
        Handler handler = this.f43255q;
        handler.sendMessage(handler.obtainMessage(7, abstractC2416c));
    }

    /* renamed from: c */
    public final void m39852c(C9539x c9539x) {
        synchronized (f43238u) {
            if (this.f43252n != c9539x) {
                this.f43252n = c9539x;
                this.f43253o.clear();
            }
            this.f43253o.addAll(c9539x.m40075t());
        }
    }

    /* renamed from: d */
    public final void m39853d(C9539x c9539x) {
        synchronized (f43238u) {
            if (this.f43252n == c9539x) {
                this.f43252n = null;
                this.f43253o.clear();
            }
        }
    }

    /* renamed from: f */
    public final boolean m39854f() {
        if (this.f43243e) {
            return false;
        }
        C9941q m41859a = C9938p.m41858b().m41859a();
        if (m41859a != null && !m41859a.m41866R()) {
            return false;
        }
        int m41805a = this.f43248j.m41805a(this.f43246h, 203400000);
        return m41805a == -1 || m41805a == 0;
    }

    /* renamed from: g */
    public final boolean m39855g(C8804b c8804b, int i10) {
        return this.f43247i.m37676A(this.f43246h, c8804b, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03e2  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r9) {
        /*
            Method dump skipped, instructions count: 1453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p383w9.C9457f.handleMessage(android.os.Message):boolean");
    }

    /* renamed from: i */
    public final C9464g1<?> m39856i(AbstractC2416c<?> abstractC2416c) {
        C9437b<?> apiKey = abstractC2416c.getApiKey();
        C9464g1<?> c9464g1 = this.f43251m.get(apiKey);
        C9464g1<?> c9464g12 = c9464g1;
        if (c9464g1 == null) {
            c9464g12 = new C9464g1<>(this, abstractC2416c);
            this.f43251m.put(apiKey, c9464g12);
        }
        if (c9464g12.m39891M()) {
            this.f43254p.add(apiKey);
        }
        c9464g12.m39881B();
        return c9464g12;
    }

    /* renamed from: j */
    public final InterfaceC9953u m39857j() {
        if (this.f43245g == null) {
            this.f43245g = C9950t.m41881a(this.f43246h);
        }
        return this.f43245g;
    }

    /* renamed from: k */
    public final void m39858k() {
        C9947s c9947s = this.f43244f;
        if (c9947s != null) {
            if (c9947s.m41877P() > 0 || m39854f()) {
                m39857j().mo671a(c9947s);
            }
            this.f43244f = null;
        }
    }

    /* renamed from: l */
    public final <T> void m39859l(C10146j<T> c10146j, int i10, AbstractC2416c abstractC2416c) {
        C9517r1 m40028b;
        if (i10 == 0 || (m40028b = C9517r1.m40028b(this, i10, abstractC2416c.getApiKey())) == null) {
            return;
        }
        AbstractC10144i<T> m42578a = c10146j.m42578a();
        final Handler handler = this.f43255q;
        handler.getClass();
        m42578a.mo42553b(new Executor(handler) { // from class: w9.a1

            /* renamed from: b */
            public final Handler f43205b;

            {
                this.f43205b = handler;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f43205b.post(runnable);
            }
        }, m40028b);
    }

    /* renamed from: m */
    public final int m39860m() {
        return this.f43249k.getAndIncrement();
    }

    /* renamed from: w */
    public final C9464g1 m39861w(C9437b<?> c9437b) {
        return this.f43251m.get(c9437b);
    }

    /* renamed from: z */
    public final AbstractC10144i<Boolean> m39862z(AbstractC2416c<?> abstractC2416c) {
        C9543y c9543y = new C9543y(abstractC2416c.getApiKey());
        Handler handler = this.f43255q;
        handler.sendMessage(handler.obtainMessage(14, c9543y));
        return c9543y.m40080b().m42578a();
    }
}
