package cd;

import android.text.TextUtils;
import bd.InterfaceC0891b;
import cd.C1068h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import mc.C6553c;
import p063dd.InterfaceC4425a;
import p081ed.AbstractC4716d;
import p081ed.C4714b;
import p081ed.C4715c;
import p100fd.AbstractC4849d;
import p100fd.AbstractC4851f;
import p100fd.C4848c;
import p169jd.InterfaceC5364i;
import p422y9.C9935o;
import p425yc.InterfaceC9979f;
import za.AbstractC10144i;
import za.C10146j;
import za.C10148l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cd/f.class
 */
/* renamed from: cd.f */
/* loaded from: combined.jar:classes2.jar:cd/f.class */
public class C1066f implements InterfaceC1067g {

    /* renamed from: m */
    public static final Object f7082m = new Object();

    /* renamed from: n */
    public static final ThreadFactory f7083n = new a();

    /* renamed from: a */
    public final C6553c f7084a;

    /* renamed from: b */
    public final C4848c f7085b;

    /* renamed from: c */
    public final C4715c f7086c;

    /* renamed from: d */
    public final C1075o f7087d;

    /* renamed from: e */
    public final C4714b f7088e;

    /* renamed from: f */
    public final C1073m f7089f;

    /* renamed from: g */
    public final Object f7090g;

    /* renamed from: h */
    public final ExecutorService f7091h;

    /* renamed from: i */
    public final ExecutorService f7092i;

    /* renamed from: j */
    public String f7093j;

    /* renamed from: k */
    public Set<InterfaceC4425a> f7094k;

    /* renamed from: l */
    public final List<InterfaceC1074n> f7095l;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cd/f$a.class
     */
    /* renamed from: cd.f$a */
    /* loaded from: combined.jar:classes2.jar:cd/f$a.class */
    public class a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f7096a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f7096a.getAndIncrement())));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cd/f$b.class
     */
    /* renamed from: cd.f$b */
    /* loaded from: combined.jar:classes2.jar:cd/f$b.class */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final int[] f7097a;

        /* renamed from: b */
        public static final int[] f7098b;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x004e
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                fd.f$b[] r0 = p100fd.AbstractC4851f.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                cd.C1066f.b.f7098b = r0
                r0 = r4
                fd.f$b r1 = p100fd.AbstractC4851f.b.OK     // Catch: java.lang.NoSuchFieldError -> L4a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4a
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4a
            L14:
                int[] r0 = cd.C1066f.b.f7098b     // Catch: java.lang.NoSuchFieldError -> L4a java.lang.NoSuchFieldError -> L4e
                fd.f$b r1 = p100fd.AbstractC4851f.b.BAD_CONFIG     // Catch: java.lang.NoSuchFieldError -> L4e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4e
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4e
            L1f:
                int[] r0 = cd.C1066f.b.f7098b     // Catch: java.lang.NoSuchFieldError -> L4e java.lang.NoSuchFieldError -> L52
                fd.f$b r1 = p100fd.AbstractC4851f.b.AUTH_ERROR     // Catch: java.lang.NoSuchFieldError -> L52
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L52
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L52
            L2a:
                fd.d$b[] r0 = p100fd.AbstractC4849d.b.values()     // Catch: java.lang.NoSuchFieldError -> L52
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                cd.C1066f.b.f7097a = r0
                r0 = r4
                fd.d$b r1 = p100fd.AbstractC4849d.b.OK     // Catch: java.lang.NoSuchFieldError -> L56
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L56
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L56
            L3e:
                int[] r0 = cd.C1066f.b.f7097a     // Catch: java.lang.NoSuchFieldError -> L56 java.lang.NoSuchFieldError -> L5a
                fd.d$b r1 = p100fd.AbstractC4849d.b.BAD_CONFIG     // Catch: java.lang.NoSuchFieldError -> L5a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5a
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5a
            L49:
                return
            L4a:
                r4 = move-exception
                goto L14
            L4e:
                r4 = move-exception
                goto L1f
            L52:
                r4 = move-exception
                goto L2a
            L56:
                r4 = move-exception
                goto L3e
            L5a:
                r4 = move-exception
                goto L49
            */
            throw new UnsupportedOperationException("Method not decompiled: cd.C1066f.b.m43187clinit():void");
        }
    }

    public C1066f(ExecutorService executorService, C6553c c6553c, C4848c c4848c, C4715c c4715c, C1075o c1075o, C4714b c4714b, C1073m c1073m) {
        this.f7090g = new Object();
        this.f7094k = new HashSet();
        this.f7095l = new ArrayList();
        this.f7084a = c6553c;
        this.f7085b = c4848c;
        this.f7086c = c4715c;
        this.f7087d = c1075o;
        this.f7088e = c4714b;
        this.f7089f = c1073m;
        this.f7091h = executorService;
        this.f7092i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f7083n);
    }

    public C1066f(C6553c c6553c, InterfaceC0891b<InterfaceC5364i> interfaceC0891b, InterfaceC0891b<InterfaceC9979f> interfaceC0891b2) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f7083n), c6553c, new C4848c(c6553c.m30238g(), interfaceC0891b, interfaceC0891b2), new C4715c(c6553c), C1075o.m6314c(), new C4714b(c6553c), new C1073m());
    }

    /* renamed from: k */
    public static C1066f m6280k() {
        return m6281l(C6553c.m30230h());
    }

    /* renamed from: l */
    public static C1066f m6281l(C6553c c6553c) {
        C9935o.m41842b(c6553c != null, "Null is not a valid value of FirebaseApp.");
        return (C1066f) c6553c.m30237f(InterfaceC1067g.class);
    }

    @Override // cd.InterfaceC1067g
    /* renamed from: a */
    public AbstractC10144i<AbstractC1072l> mo6285a(boolean z10) {
        m6299t();
        AbstractC10144i<AbstractC1072l> m6286b = m6286b();
        this.f7091h.execute(RunnableC1064d.m6278a(this, z10));
        return m6286b;
    }

    /* renamed from: b */
    public final AbstractC10144i<AbstractC1072l> m6286b() {
        C10146j c10146j = new C10146j();
        m6288d(new C1070j(this.f7087d, c10146j));
        return c10146j.m42578a();
    }

    /* renamed from: c */
    public final AbstractC10144i<String> m6287c() {
        C10146j c10146j = new C10146j();
        m6288d(new C1071k(c10146j));
        return c10146j.m42578a();
    }

    /* renamed from: d */
    public final void m6288d(InterfaceC1074n interfaceC1074n) {
        synchronized (this.f7090g) {
            this.f7095l.add(interfaceC1074n);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6289e(boolean r5) {
        /*
            r4 = this;
            r0 = r4
            ed.d r0 = r0.m6295m()
            r7 = r0
            r0 = r7
            boolean r0 = r0.m23720i()     // Catch: cd.C1068h -> L86
            if (r0 != 0) goto L32
            r0 = r7
            boolean r0 = r0.m23723l()     // Catch: cd.C1068h -> L86
            if (r0 == 0) goto L16
            goto L32
        L16:
            r0 = r5
            if (r0 != 0) goto L29
            r0 = r4
            cd.o r0 = r0.f7087d     // Catch: cd.C1068h -> L86
            r1 = r7
            boolean r0 = r0.m6321f(r1)     // Catch: cd.C1068h -> L86
            if (r0 == 0) goto L28
            goto L29
        L28:
            return
        L29:
            r0 = r4
            r1 = r7
            ed.d r0 = r0.m6291g(r1)     // Catch: cd.C1068h -> L86
            r6 = r0
            goto L38
        L32:
            r0 = r4
            r1 = r7
            ed.d r0 = r0.m6301v(r1)     // Catch: cd.C1068h -> L86
            r6 = r0
        L38:
            r0 = r4
            r1 = r6
            r0.m6298p(r1)
            r0 = r4
            r1 = r7
            r2 = r6
            r0.m6305z(r1, r2)
            r0 = r6
            boolean r0 = r0.m23722k()
            if (r0 == 0) goto L52
            r0 = r4
            r1 = r6
            java.lang.String r1 = r1.mo23693d()
            r0.m6304y(r1)
        L52:
            r0 = r6
            boolean r0 = r0.m23720i()
            if (r0 == 0) goto L6c
            cd.h r0 = new cd.h
            r1 = r0
            cd.h$a r2 = cd.C1068h.a.BAD_CONFIG
            r1.<init>(r2)
            r6 = r0
        L64:
            r0 = r4
            r1 = r6
            r0.m6302w(r1)
            goto L85
        L6c:
            r0 = r6
            boolean r0 = r0.m23721j()
            if (r0 == 0) goto L80
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            r6 = r0
            goto L64
        L80:
            r0 = r4
            r1 = r6
            r0.m6303x(r1)
        L85:
            return
        L86:
            r6 = move-exception
            r0 = r4
            r1 = r6
            r0.m6302w(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.C1066f.m6289e(boolean):void");
    }

    /* renamed from: f */
    public final void m6290f(boolean z10) {
        AbstractC4716d m6296n = m6296n();
        AbstractC4716d abstractC4716d = m6296n;
        if (z10) {
            abstractC4716d = m6296n.m23726p();
        }
        m6303x(abstractC4716d);
        this.f7092i.execute(RunnableC1065e.m6279a(this, z10));
    }

    /* renamed from: g */
    public final AbstractC4716d m6291g(AbstractC4716d abstractC4716d) {
        AbstractC4851f m24650e = this.f7085b.m24650e(m6292h(), abstractC4716d.mo23693d(), m6297o(), abstractC4716d.mo23695f());
        int i10 = b.f7098b[m24650e.mo24632b().ordinal()];
        if (i10 == 1) {
            return abstractC4716d.m23725o(m24650e.mo24633c(), m24650e.mo24634d(), this.f7087d.m6319b());
        }
        if (i10 == 2) {
            return abstractC4716d.m23727q("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new C1068h("Firebase Installations Service is unavailable. Please try again later.", C1068h.a.UNAVAILABLE);
        }
        m6304y(null);
        return abstractC4716d.m23728r();
    }

    @Override // cd.InterfaceC1067g
    public AbstractC10144i<String> getId() {
        m6299t();
        String m6294j = m6294j();
        if (m6294j != null) {
            return C10148l.m42587e(m6294j);
        }
        AbstractC10144i<String> m6287c = m6287c();
        this.f7091h.execute(RunnableC1063c.m6277a(this));
        return m6287c;
    }

    /* renamed from: h */
    public String m6292h() {
        return this.f7084a.m30240j().m30258b();
    }

    /* renamed from: i */
    public String m6293i() {
        return this.f7084a.m30240j().m30259c();
    }

    /* renamed from: j */
    public final String m6294j() {
        String str;
        synchronized (this) {
            str = this.f7093j;
        }
        return str;
    }

    /* renamed from: m */
    public final AbstractC4716d m6295m() {
        AbstractC4716d m23718c;
        synchronized (f7082m) {
            C1062b m6275a = C1062b.m6275a(this.f7084a.m30238g(), "generatefid.lock");
            try {
                m23718c = this.f7086c.m23718c();
                if (m6275a != null) {
                    m6275a.m6276b();
                }
            } catch (Throwable th2) {
                if (m6275a != null) {
                    m6275a.m6276b();
                }
                throw th2;
            }
        }
        return m23718c;
    }

    /* renamed from: n */
    public final AbstractC4716d m6296n() {
        AbstractC4716d abstractC4716d;
        synchronized (f7082m) {
            C1062b m6275a = C1062b.m6275a(this.f7084a.m30238g(), "generatefid.lock");
            try {
                AbstractC4716d m23718c = this.f7086c.m23718c();
                abstractC4716d = m23718c;
                if (m23718c.m23721j()) {
                    abstractC4716d = this.f7086c.m23716a(m23718c.m23730t(m6300u(m23718c)));
                }
            } finally {
                if (m6275a != null) {
                    m6275a.m6276b();
                }
            }
        }
        return abstractC4716d;
    }

    /* renamed from: o */
    public String m6297o() {
        return this.f7084a.m30240j().m30261e();
    }

    /* renamed from: p */
    public final void m6298p(AbstractC4716d abstractC4716d) {
        synchronized (f7082m) {
            C1062b m6275a = C1062b.m6275a(this.f7084a.m30238g(), "generatefid.lock");
            try {
                this.f7086c.m23716a(abstractC4716d);
                if (m6275a != null) {
                    m6275a.m6276b();
                }
            } catch (Throwable th2) {
                if (m6275a != null) {
                    m6275a.m6276b();
                }
                throw th2;
            }
        }
    }

    /* renamed from: t */
    public final void m6299t() {
        C9935o.m41847g(m6293i(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C9935o.m41847g(m6297o(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C9935o.m41847g(m6292h(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C9935o.m41842b(C1075o.m6317h(m6293i()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C9935o.m41842b(C1075o.m6316g(m6292h()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: u */
    public final String m6300u(AbstractC4716d abstractC4716d) {
        if ((!this.f7084a.m30239i().equals("CHIME_ANDROID_SDK") && !this.f7084a.m30244q()) || !abstractC4716d.m23724m()) {
            return this.f7089f.m6313a();
        }
        String m23712f = this.f7088e.m23712f();
        String str = m23712f;
        if (TextUtils.isEmpty(m23712f)) {
            str = this.f7089f.m6313a();
        }
        return str;
    }

    /* renamed from: v */
    public final AbstractC4716d m6301v(AbstractC4716d abstractC4716d) {
        AbstractC4849d m24649d = this.f7085b.m24649d(m6292h(), abstractC4716d.mo23693d(), m6297o(), m6293i(), (abstractC4716d.mo23693d() == null || abstractC4716d.mo23693d().length() != 11) ? null : this.f7088e.m23715i());
        int i10 = b.f7097a[m24649d.mo24624e().ordinal()];
        if (i10 == 1) {
            return abstractC4716d.m23729s(m24649d.mo24622c(), m24649d.mo24623d(), this.f7087d.m6319b(), m24649d.mo24621b().mo24633c(), m24649d.mo24621b().mo24634d());
        }
        if (i10 == 2) {
            return abstractC4716d.m23727q("BAD CONFIG");
        }
        throw new C1068h("Firebase Installations Service is unavailable. Please try again later.", C1068h.a.UNAVAILABLE);
    }

    /* renamed from: w */
    public final void m6302w(Exception exc) {
        synchronized (this.f7090g) {
            Iterator<InterfaceC1074n> it = this.f7095l.iterator();
            while (it.hasNext()) {
                if (it.next().mo6308a(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: x */
    public final void m6303x(AbstractC4716d abstractC4716d) {
        synchronized (this.f7090g) {
            Iterator<InterfaceC1074n> it = this.f7095l.iterator();
            while (it.hasNext()) {
                if (it.next().mo6309b(abstractC4716d)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: y */
    public final void m6304y(String str) {
        synchronized (this) {
            this.f7093j = str;
        }
    }

    /* renamed from: z */
    public final void m6305z(AbstractC4716d abstractC4716d, AbstractC4716d abstractC4716d2) {
        synchronized (this) {
            if (this.f7094k.size() != 0 && !abstractC4716d.mo23693d().equals(abstractC4716d2.mo23693d())) {
                Iterator<InterfaceC4425a> it = this.f7094k.iterator();
                while (it.hasNext()) {
                    it.next().m22522a(abstractC4716d2.mo23693d());
                }
            }
        }
    }
}
