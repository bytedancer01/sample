package p420y7;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.apache.commons.net.tftp.TFTP;
import p027b9.InterfaceC0854m;
import p039c9.C1033c;
import p039c9.InterfaceC1031a;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4401z0;
import p320s6.InterfaceC8539b;
import p420y7.InterfaceC9844b0;
import p439z7.C10067c;
import p439z7.C10068d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y7/t.class
 */
/* renamed from: y7.t */
/* loaded from: combined.jar:classes2.jar:y7/t.class */
public final class C9870t {

    /* renamed from: q */
    public static final C10067c f45265q = new C10067c(1);

    /* renamed from: a */
    public final Context f45266a;

    /* renamed from: b */
    public final InterfaceC9860j0 f45267b;

    /* renamed from: c */
    public final Handler f45268c;

    /* renamed from: d */
    public final c f45269d;

    /* renamed from: e */
    public final C10068d.c f45270e;

    /* renamed from: f */
    public final CopyOnWriteArraySet<d> f45271f;

    /* renamed from: g */
    public int f45272g;

    /* renamed from: h */
    public int f45273h;

    /* renamed from: i */
    public boolean f45274i;

    /* renamed from: j */
    public boolean f45275j;

    /* renamed from: k */
    public int f45276k;

    /* renamed from: l */
    public int f45277l;

    /* renamed from: m */
    public int f45278m;

    /* renamed from: n */
    public boolean f45279n;

    /* renamed from: o */
    public List<C9849e> f45280o;

    /* renamed from: p */
    public C10068d f45281p;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/t$b.class
     */
    /* renamed from: y7.t$b */
    /* loaded from: combined.jar:classes2.jar:y7/t$b.class */
    public static final class b {

        /* renamed from: a */
        public final C9849e f45282a;

        /* renamed from: b */
        public final boolean f45283b;

        /* renamed from: c */
        public final List<C9849e> f45284c;

        /* renamed from: d */
        public final Exception f45285d;

        public b(C9849e c9849e, boolean z10, List<C9849e> list, Exception exc) {
            this.f45282a = c9849e;
            this.f45283b = z10;
            this.f45284c = list;
            this.f45285d = exc;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/t$c.class
     */
    /* renamed from: y7.t$c */
    /* loaded from: combined.jar:classes2.jar:y7/t$c.class */
    public static final class c extends Handler {

        /* renamed from: a */
        public boolean f45286a;

        /* renamed from: b */
        public final HandlerThread f45287b;

        /* renamed from: c */
        public final InterfaceC9860j0 f45288c;

        /* renamed from: d */
        public final InterfaceC9846c0 f45289d;

        /* renamed from: e */
        public final Handler f45290e;

        /* renamed from: f */
        public final ArrayList<C9849e> f45291f;

        /* renamed from: g */
        public final HashMap<String, e> f45292g;

        /* renamed from: h */
        public int f45293h;

        /* renamed from: i */
        public boolean f45294i;

        /* renamed from: j */
        public int f45295j;

        /* renamed from: k */
        public int f45296k;

        /* renamed from: l */
        public int f45297l;

        public c(HandlerThread handlerThread, InterfaceC9860j0 interfaceC9860j0, InterfaceC9846c0 interfaceC9846c0, Handler handler, int i10, int i11, boolean z10) {
            super(handlerThread.getLooper());
            this.f45287b = handlerThread;
            this.f45288c = interfaceC9860j0;
            this.f45289d = interfaceC9846c0;
            this.f45290e = handler;
            this.f45295j = i10;
            this.f45296k = i11;
            this.f45294i = z10;
            this.f45291f = new ArrayList<>();
            this.f45292g = new HashMap<>();
        }

        /* renamed from: d */
        public static int m41494d(C9849e c9849e, C9849e c9849e2) {
            return C4401z0.m22405q(c9849e.f45184c, c9849e2.f45184c);
        }

        /* renamed from: e */
        public static C9849e m41495e(C9849e c9849e, int i10, int i11) {
            return new C9849e(c9849e.f45182a, i10, c9849e.f45184c, System.currentTimeMillis(), c9849e.f45186e, i11, 0, c9849e.f45189h);
        }

        /* renamed from: A */
        public final void m41496A(e eVar) {
            if (eVar != null) {
                C4349a.m21884g(!eVar.f45301e);
                eVar.m41527f(false);
            }
        }

        /* renamed from: B */
        public final void m41497B() {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = i11;
                if (i10 >= this.f45291f.size()) {
                    return;
                }
                C9849e c9849e = this.f45291f.get(i10);
                e eVar = this.f45292g.get(c9849e.f45182a.f45309b);
                int i13 = c9849e.f45183b;
                if (i13 == 0) {
                    eVar = m41520y(eVar, c9849e);
                } else if (i13 == 1) {
                    m41496A(eVar);
                } else if (i13 == 2) {
                    C4349a.m21882e(eVar);
                    m41519x(eVar, c9849e, i12);
                } else {
                    if (i13 != 5 && i13 != 7) {
                        throw new IllegalStateException();
                    }
                    m41521z(eVar, c9849e);
                }
                int i14 = i12;
                if (eVar != null) {
                    i14 = i12;
                    if (!eVar.f45301e) {
                        i14 = i12 + 1;
                    }
                }
                i10++;
                i11 = i14;
            }
        }

        /* renamed from: C */
        public final void m41498C() {
            for (int i10 = 0; i10 < this.f45291f.size(); i10++) {
                C9849e c9849e = this.f45291f.get(i10);
                if (c9849e.f45183b == 2) {
                    try {
                        this.f45288c.mo41384a(c9849e);
                    } catch (IOException e10) {
                        C4392v.m22271e("DownloadManager", "Failed to update index.", e10);
                    }
                }
            }
            sendEmptyMessageDelayed(11, 5000L);
        }

        /* renamed from: b */
        public final void m41499b(C9874x c9874x, int i10) {
            C9849e m41501f = m41501f(c9874x.f45309b, true);
            long currentTimeMillis = System.currentTimeMillis();
            if (m41501f != null) {
                m41508m(C9870t.m41469m(m41501f, c9874x, i10, currentTimeMillis));
            } else {
                m41508m(new C9849e(c9874x, i10 != 0 ? 1 : 0, currentTimeMillis, currentTimeMillis, -1L, i10, 0));
            }
            m41497B();
        }

        /* renamed from: c */
        public final boolean m41500c() {
            return !this.f45294i && this.f45293h == 0;
        }

        /* renamed from: f */
        public final C9849e m41501f(String str, boolean z10) {
            int m41502g = m41502g(str);
            if (m41502g != -1) {
                return this.f45291f.get(m41502g);
            }
            if (!z10) {
                return null;
            }
            try {
                return this.f45288c.mo41391h(str);
            } catch (IOException e10) {
                C4392v.m22271e("DownloadManager", "Failed to load download: " + str, e10);
                return null;
            }
        }

        /* renamed from: g */
        public final int m41502g(String str) {
            for (int i10 = 0; i10 < this.f45291f.size(); i10++) {
                if (this.f45291f.get(i10).f45182a.f45309b.equals(str)) {
                    return i10;
                }
            }
            return -1;
        }

        /* renamed from: h */
        public final void m41503h(int i10) {
            InterfaceC9853g interfaceC9853g;
            this.f45293h = i10;
            InterfaceC9853g interfaceC9853g2 = null;
            InterfaceC9853g interfaceC9853g3 = null;
            try {
                try {
                    this.f45288c.mo41390g();
                    InterfaceC9853g mo41388e = this.f45288c.mo41388e(0, 1, 2, 5, 7);
                    while (true) {
                        interfaceC9853g2 = mo41388e;
                        interfaceC9853g3 = mo41388e;
                        interfaceC9853g = mo41388e;
                        if (!mo41388e.moveToNext()) {
                            break;
                        } else {
                            this.f45291f.add(mo41388e.mo41396Y());
                        }
                    }
                } catch (IOException e10) {
                    C4392v.m22271e("DownloadManager", "Failed to load index.", e10);
                    interfaceC9853g2 = interfaceC9853g3;
                    this.f45291f.clear();
                    interfaceC9853g = interfaceC9853g3;
                }
                C4401z0.m22403p(interfaceC9853g);
                this.f45290e.obtainMessage(0, new ArrayList(this.f45291f)).sendToTarget();
                m41497B();
            } catch (Throwable th2) {
                C4401z0.m22403p(interfaceC9853g2);
                throw th2;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = 0;
            boolean z10 = false;
            switch (message.what) {
                case 0:
                    m41503h(message.arg1);
                    i10 = 1;
                    this.f45290e.obtainMessage(1, i10, this.f45292g.size()).sendToTarget();
                    return;
                case 1:
                    if (message.arg1 != 0) {
                        z10 = true;
                    }
                    m41513r(z10);
                    i10 = 1;
                    this.f45290e.obtainMessage(1, i10, this.f45292g.size()).sendToTarget();
                    return;
                case 2:
                    m41516u(message.arg1);
                    i10 = 1;
                    this.f45290e.obtainMessage(1, i10, this.f45292g.size()).sendToTarget();
                    return;
                case 3:
                    m41517v((String) message.obj, message.arg1);
                    i10 = 1;
                    this.f45290e.obtainMessage(1, i10, this.f45292g.size()).sendToTarget();
                    return;
                case 4:
                    m41514s(message.arg1);
                    i10 = 1;
                    this.f45290e.obtainMessage(1, i10, this.f45292g.size()).sendToTarget();
                    return;
                case 5:
                    m41515t(message.arg1);
                    i10 = 1;
                    this.f45290e.obtainMessage(1, i10, this.f45292g.size()).sendToTarget();
                    return;
                case 6:
                    m41499b((C9874x) message.obj, message.arg1);
                    i10 = 1;
                    this.f45290e.obtainMessage(1, i10, this.f45292g.size()).sendToTarget();
                    return;
                case 7:
                    m41512q((String) message.obj);
                    i10 = 1;
                    this.f45290e.obtainMessage(1, i10, this.f45292g.size()).sendToTarget();
                    return;
                case 8:
                    m41511p();
                    i10 = 1;
                    this.f45290e.obtainMessage(1, i10, this.f45292g.size()).sendToTarget();
                    return;
                case 9:
                    m41507l((e) message.obj);
                    this.f45290e.obtainMessage(1, i10, this.f45292g.size()).sendToTarget();
                    return;
                case 10:
                    m41504i((e) message.obj, C4401z0.m22376d1(message.arg1, message.arg2));
                    return;
                case 11:
                    m41498C();
                    return;
                case 12:
                    m41510o();
                    return;
                default:
                    throw new IllegalStateException();
            }
        }

        /* renamed from: i */
        public final void m41504i(e eVar, long j10) {
            C9849e c9849e = (C9849e) C4349a.m21882e(m41501f(eVar.f45298b.f45309b, false));
            if (j10 == c9849e.f45186e || j10 == -1) {
                return;
            }
            m41508m(new C9849e(c9849e.f45182a, c9849e.f45183b, c9849e.f45184c, System.currentTimeMillis(), j10, c9849e.f45187f, c9849e.f45188g, c9849e.f45189h));
        }

        /* renamed from: j */
        public final void m41505j(C9849e c9849e, Exception exc) {
            C9849e c9849e2 = new C9849e(c9849e.f45182a, exc == null ? 3 : 4, c9849e.f45184c, System.currentTimeMillis(), c9849e.f45186e, c9849e.f45187f, exc == null ? 0 : 1, c9849e.f45189h);
            this.f45291f.remove(m41502g(c9849e2.f45182a.f45309b));
            try {
                this.f45288c.mo41384a(c9849e2);
            } catch (IOException e10) {
                C4392v.m22271e("DownloadManager", "Failed to update index.", e10);
            }
            this.f45290e.obtainMessage(2, new b(c9849e2, false, new ArrayList(this.f45291f), exc)).sendToTarget();
        }

        /* renamed from: k */
        public final void m41506k(C9849e c9849e) {
            int i10 = 1;
            if (c9849e.f45183b == 7) {
                int i11 = c9849e.f45187f;
                if (i11 == 0) {
                    i10 = 0;
                }
                m41509n(c9849e, i10, i11);
                m41497B();
                return;
            }
            this.f45291f.remove(m41502g(c9849e.f45182a.f45309b));
            try {
                this.f45288c.mo41386c(c9849e.f45182a.f45309b);
            } catch (IOException e10) {
                C4392v.m22270d("DownloadManager", "Failed to remove from database");
            }
            this.f45290e.obtainMessage(2, new b(c9849e, true, new ArrayList(this.f45291f), null)).sendToTarget();
        }

        /* renamed from: l */
        public final void m41507l(e eVar) {
            String str = eVar.f45298b.f45309b;
            this.f45292g.remove(str);
            boolean z10 = eVar.f45301e;
            if (!z10) {
                int i10 = this.f45297l - 1;
                this.f45297l = i10;
                if (i10 == 0) {
                    removeMessages(11);
                }
            }
            if (eVar.f45304h) {
                m41497B();
                return;
            }
            Exception exc = eVar.f45305i;
            if (exc != null) {
                C4392v.m22271e("DownloadManager", "Task failed: " + eVar.f45298b + ", " + z10, exc);
            }
            C9849e c9849e = (C9849e) C4349a.m21882e(m41501f(str, false));
            int i11 = c9849e.f45183b;
            if (i11 == 2) {
                C4349a.m21884g(!z10);
                m41505j(c9849e, exc);
            } else {
                if (i11 != 5 && i11 != 7) {
                    throw new IllegalStateException();
                }
                C4349a.m21884g(z10);
                m41506k(c9849e);
            }
            m41497B();
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(1:24)(1:5)|6|(1:8)(8:18|(1:20)|21|(1:23)|10|11|12|13)|9|10|11|12|13) */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
        
            r13 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x009c, code lost:
        
            p059d9.C4392v.m22271e("DownloadManager", "Failed to update index.", r13);
         */
        /* renamed from: m */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p420y7.C9849e m41508m(p420y7.C9849e r9) {
            /*
                r8 = this;
                r0 = r9
                int r0 = r0.f45183b
                r11 = r0
                r0 = 1
                r10 = r0
                r0 = r11
                r1 = 3
                if (r0 == r1) goto L17
                r0 = r11
                r1 = 4
                if (r0 == r1) goto L17
                r0 = 1
                r12 = r0
                goto L1a
            L17:
                r0 = 0
                r12 = r0
            L1a:
                r0 = r12
                p059d9.C4349a.m21884g(r0)
                r0 = r8
                r1 = r9
                y7.x r1 = r1.f45182a
                java.lang.String r1 = r1.f45309b
                int r0 = r0.m41502g(r1)
                r11 = r0
                r0 = r11
                r1 = -1
                if (r0 != r1) goto L52
                r0 = r8
                java.util.ArrayList<y7.e> r0 = r0.f45291f
                r1 = r9
                boolean r0 = r0.add(r1)
                r0 = r8
                java.util.ArrayList<y7.e> r0 = r0.f45291f
                r14 = r0
                y7.u r0 = new y7.u
                r1 = r0
                r1.<init>()
                r13 = r0
            L48:
                r0 = r14
                r1 = r13
                java.util.Collections.sort(r0, r1)
                goto L8d
            L52:
                r0 = r9
                long r0 = r0.f45184c
                r1 = r8
                java.util.ArrayList<y7.e> r1 = r1.f45291f
                r2 = r11
                java.lang.Object r1 = r1.get(r2)
                y7.e r1 = (p420y7.C9849e) r1
                long r1 = r1.f45184c
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L6b
                goto L6d
            L6b:
                r0 = 0
                r10 = r0
            L6d:
                r0 = r8
                java.util.ArrayList<y7.e> r0 = r0.f45291f
                r1 = r11
                r2 = r9
                java.lang.Object r0 = r0.set(r1, r2)
                r0 = r10
                if (r0 == 0) goto L8d
                r0 = r8
                java.util.ArrayList<y7.e> r0 = r0.f45291f
                r14 = r0
                y7.u r0 = new y7.u
                r1 = r0
                r1.<init>()
                r13 = r0
                goto L48
            L8d:
                r0 = r8
                y7.j0 r0 = r0.f45288c     // Catch: java.io.IOException -> L9a
                r1 = r9
                r0.mo41384a(r1)     // Catch: java.io.IOException -> L9a
                goto La5
            L9a:
                r13 = move-exception
                java.lang.String r0 = "DownloadManager"
                java.lang.String r1 = "Failed to update index."
                r2 = r13
                p059d9.C4392v.m22271e(r0, r1, r2)
            La5:
                y7.t$b r0 = new y7.t$b
                r1 = r0
                r2 = r9
                r3 = 0
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = r4
                r6 = r8
                java.util.ArrayList<y7.e> r6 = r6.f45291f
                r5.<init>(r6)
                r5 = 0
                r1.<init>(r2, r3, r4, r5)
                r13 = r0
                r0 = r8
                android.os.Handler r0 = r0.f45290e
                r1 = 2
                r2 = r13
                android.os.Message r0 = r0.obtainMessage(r1, r2)
                r0.sendToTarget()
                r0 = r9
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p420y7.C9870t.c.m41508m(y7.e):y7.e");
        }

        /* renamed from: n */
        public final C9849e m41509n(C9849e c9849e, int i10, int i11) {
            C4349a.m21884g((i10 == 3 || i10 == 4) ? false : true);
            return m41508m(m41495e(c9849e, i10, i11));
        }

        /* renamed from: o */
        public final void m41510o() {
            Iterator<e> it = this.f45292g.values().iterator();
            while (it.hasNext()) {
                it.next().m41527f(true);
            }
            try {
                this.f45288c.mo41390g();
            } catch (IOException e10) {
                C4392v.m22271e("DownloadManager", "Failed to update index.", e10);
            }
            this.f45291f.clear();
            this.f45287b.quit();
            synchronized (this) {
                this.f45286a = true;
                notifyAll();
            }
        }

        /* renamed from: p */
        public final void m41511p() {
            ArrayList arrayList = new ArrayList();
            try {
                InterfaceC9853g mo41388e = this.f45288c.mo41388e(3, 4);
                while (mo41388e.moveToNext()) {
                    try {
                        arrayList.add(mo41388e.mo41396Y());
                    } finally {
                    }
                }
                mo41388e.close();
            } catch (IOException e10) {
                C4392v.m22270d("DownloadManager", "Failed to load downloads.");
            }
            for (int i10 = 0; i10 < this.f45291f.size(); i10++) {
                ArrayList<C9849e> arrayList2 = this.f45291f;
                arrayList2.set(i10, m41495e(arrayList2.get(i10), 5, 0));
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                this.f45291f.add(m41495e((C9849e) arrayList.get(i11), 5, 0));
            }
            Collections.sort(this.f45291f, new C9871u());
            try {
                this.f45288c.mo41389f();
            } catch (IOException e11) {
                C4392v.m22271e("DownloadManager", "Failed to update index.", e11);
            }
            ArrayList arrayList3 = new ArrayList(this.f45291f);
            for (int i12 = 0; i12 < this.f45291f.size(); i12++) {
                this.f45290e.obtainMessage(2, new b(this.f45291f.get(i12), false, arrayList3, null)).sendToTarget();
            }
            m41497B();
        }

        /* renamed from: q */
        public final void m41512q(String str) {
            C9849e m41501f = m41501f(str, true);
            if (m41501f != null) {
                m41509n(m41501f, 5, 0);
                m41497B();
            } else {
                C4392v.m22270d("DownloadManager", "Failed to remove nonexistent download: " + str);
            }
        }

        /* renamed from: r */
        public final void m41513r(boolean z10) {
            this.f45294i = z10;
            m41497B();
        }

        /* renamed from: s */
        public final void m41514s(int i10) {
            this.f45295j = i10;
            m41497B();
        }

        /* renamed from: t */
        public final void m41515t(int i10) {
            this.f45296k = i10;
        }

        /* renamed from: u */
        public final void m41516u(int i10) {
            this.f45293h = i10;
            m41497B();
        }

        /* renamed from: v */
        public final void m41517v(String str, int i10) {
            if (str == null) {
                for (int i11 = 0; i11 < this.f45291f.size(); i11++) {
                    m41518w(this.f45291f.get(i11), i10);
                }
                try {
                    this.f45288c.mo41387d(i10);
                } catch (IOException e10) {
                    C4392v.m22271e("DownloadManager", "Failed to set manual stop reason", e10);
                }
            } else {
                C9849e m41501f = m41501f(str, false);
                if (m41501f != null) {
                    m41518w(m41501f, i10);
                } else {
                    try {
                        this.f45288c.mo41385b(str, i10);
                    } catch (IOException e11) {
                        C4392v.m22271e("DownloadManager", "Failed to set manual stop reason: " + str, e11);
                    }
                }
            }
            m41497B();
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        
            if (r0 == 2) goto L13;
         */
        /* renamed from: w */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m41518w(p420y7.C9849e r16, int r17) {
            /*
                r15 = this;
                r0 = r17
                if (r0 != 0) goto L17
                r0 = r16
                int r0 = r0.f45183b
                r1 = 1
                if (r0 != r1) goto L57
                r0 = r15
                r1 = r16
                r2 = 0
                r3 = 0
                y7.e r0 = r0.m41509n(r1, r2, r3)
                goto L57
            L17:
                r0 = r17
                r1 = r16
                int r1 = r1.f45187f
                if (r0 == r1) goto L57
                r0 = r16
                int r0 = r0.f45183b
                r19 = r0
                r0 = r19
                if (r0 == 0) goto L33
                r0 = r19
                r18 = r0
                r0 = r19
                r1 = 2
                if (r0 != r1) goto L35
            L33:
                r0 = 1
                r18 = r0
            L35:
                r0 = r15
                y7.e r1 = new y7.e
                r2 = r1
                r3 = r16
                y7.x r3 = r3.f45182a
                r4 = r18
                r5 = r16
                long r5 = r5.f45184c
                long r6 = java.lang.System.currentTimeMillis()
                r7 = r16
                long r7 = r7.f45186e
                r8 = r17
                r9 = 0
                r10 = r16
                y7.w r10 = r10.f45189h
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                y7.e r0 = r0.m41508m(r1)
            L57:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p420y7.C9870t.c.m41518w(y7.e, int):void");
        }

        /* renamed from: x */
        public final void m41519x(e eVar, C9849e c9849e, int i10) {
            C4349a.m21884g(!eVar.f45301e);
            if (!m41500c() || i10 >= this.f45295j) {
                m41509n(c9849e, 0, 0);
                eVar.m41527f(false);
            }
        }

        /* renamed from: y */
        public final e m41520y(e eVar, C9849e c9849e) {
            if (eVar != null) {
                C4349a.m21884g(!eVar.f45301e);
                eVar.m41527f(false);
                return eVar;
            }
            if (!m41500c() || this.f45297l >= this.f45295j) {
                return null;
            }
            C9849e m41509n = m41509n(c9849e, 2, 0);
            e eVar2 = new e(m41509n.f45182a, this.f45289d.mo41397a(m41509n.f45182a), m41509n.f45189h, false, this.f45296k, this);
            this.f45292g.put(m41509n.f45182a.f45309b, eVar2);
            int i10 = this.f45297l;
            this.f45297l = i10 + 1;
            if (i10 == 0) {
                sendEmptyMessageDelayed(11, 5000L);
            }
            eVar2.start();
            return eVar2;
        }

        /* renamed from: z */
        public final void m41521z(e eVar, C9849e c9849e) {
            if (eVar != null) {
                if (eVar.f45301e) {
                    return;
                }
                eVar.m41527f(false);
            } else {
                e eVar2 = new e(c9849e.f45182a, this.f45289d.mo41397a(c9849e.f45182a), c9849e.f45189h, true, this.f45296k, this);
                this.f45292g.put(c9849e.f45182a.f45309b, eVar2);
                eVar2.start();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/t$d.class
     */
    /* renamed from: y7.t$d */
    /* loaded from: combined.jar:classes2.jar:y7/t$d.class */
    public interface d {
        /* renamed from: a */
        void mo18030a(C9870t c9870t, C9849e c9849e, Exception exc);

        /* renamed from: b */
        void mo18031b(C9870t c9870t, C10067c c10067c, int i10);

        /* renamed from: c */
        void mo18032c(C9870t c9870t, boolean z10);

        /* renamed from: d */
        void mo18033d(C9870t c9870t, C9849e c9849e);

        /* renamed from: e */
        void mo18034e(C9870t c9870t, boolean z10);

        /* renamed from: f */
        void mo18035f(C9870t c9870t);

        /* renamed from: g */
        void mo18036g(C9870t c9870t);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/t$e.class
     */
    /* renamed from: y7.t$e */
    /* loaded from: combined.jar:classes2.jar:y7/t$e.class */
    public static class e extends Thread implements InterfaceC9844b0.a {

        /* renamed from: b */
        public final C9874x f45298b;

        /* renamed from: c */
        public final InterfaceC9844b0 f45299c;

        /* renamed from: d */
        public final C9873w f45300d;

        /* renamed from: e */
        public final boolean f45301e;

        /* renamed from: f */
        public final int f45302f;

        /* renamed from: g */
        public volatile c f45303g;

        /* renamed from: h */
        public volatile boolean f45304h;

        /* renamed from: i */
        public Exception f45305i;

        /* renamed from: j */
        public long f45306j;

        public e(C9874x c9874x, InterfaceC9844b0 interfaceC9844b0, C9873w c9873w, boolean z10, int i10, c cVar) {
            this.f45298b = c9874x;
            this.f45299c = interfaceC9844b0;
            this.f45300d = c9873w;
            this.f45301e = z10;
            this.f45302f = i10;
            this.f45303g = cVar;
            this.f45306j = -1L;
        }

        /* renamed from: g */
        public static int m41526g(int i10) {
            return Math.min((i10 - 1) * 1000, TFTP.DEFAULT_TIMEOUT);
        }

        @Override // p420y7.InterfaceC9844b0.a
        /* renamed from: a */
        public void mo41376a(long j10, long j11, float f10) {
            this.f45300d.f45307a = j11;
            this.f45300d.f45308b = f10;
            if (j10 != this.f45306j) {
                this.f45306j = j10;
                c cVar = this.f45303g;
                if (cVar != null) {
                    cVar.obtainMessage(10, (int) (j10 >> 32), (int) j10, this).sendToTarget();
                }
            }
        }

        /* renamed from: f */
        public void m41527f(boolean z10) {
            if (z10) {
                this.f45303g = null;
            }
            if (this.f45304h) {
                return;
            }
            this.f45304h = true;
            this.f45299c.cancel();
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.f45301e) {
                    this.f45299c.remove();
                } else {
                    long j10 = -1;
                    int i10 = 0;
                    while (!this.f45304h) {
                        try {
                            this.f45299c.mo41375a(this);
                            break;
                        } catch (IOException e10) {
                            if (!this.f45304h) {
                                long j11 = this.f45300d.f45307a;
                                long j12 = j10;
                                if (j11 != j10) {
                                    j12 = j11;
                                    i10 = 0;
                                }
                                i10++;
                                if (i10 > this.f45302f) {
                                    throw e10;
                                }
                                Thread.sleep(m41526g(i10));
                                j10 = j12;
                            }
                        }
                    }
                }
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
            } catch (Exception e12) {
                this.f45305i = e12;
            }
            c cVar = this.f45303g;
            if (cVar != null) {
                cVar.obtainMessage(9, this).sendToTarget();
            }
        }
    }

    public C9870t(Context context, InterfaceC8539b interfaceC8539b, InterfaceC1031a interfaceC1031a, InterfaceC0854m.a aVar, Executor executor) {
        this(context, new C9845c(interfaceC8539b), new C9847d(new C1033c.c().m6094i(interfaceC1031a).m6097l(aVar), executor));
    }

    public C9870t(Context context, InterfaceC9860j0 interfaceC9860j0, InterfaceC9846c0 interfaceC9846c0) {
        this.f45266a = context.getApplicationContext();
        this.f45267b = interfaceC9860j0;
        this.f45276k = 3;
        this.f45277l = 5;
        this.f45275j = true;
        this.f45280o = Collections.emptyList();
        this.f45271f = new CopyOnWriteArraySet<>();
        Handler m22315B = C4401z0.m22315B(new Handler.Callback(this) { // from class: y7.r

            /* renamed from: b */
            public final C9870t f45263b;

            {
                this.f45263b = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m41476i;
                m41476i = this.f45263b.m41476i(message);
                return m41476i;
            }
        });
        this.f45268c = m22315B;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        c cVar = new c(handlerThread, interfaceC9860j0, interfaceC9846c0, m22315B, this.f45276k, this.f45277l, this.f45275j);
        this.f45269d = cVar;
        C10068d.c cVar2 = new C10068d.c(this) { // from class: y7.s

            /* renamed from: a */
            public final C9870t f45264a;

            {
                this.f45264a = this;
            }

            @Override // p439z7.C10068d.c
            /* renamed from: a */
            public final void mo41466a(C10068d c10068d, int i10) {
                this.f45264a.m41484r(c10068d, i10);
            }
        };
        this.f45270e = cVar2;
        C10068d c10068d = new C10068d(context, cVar2, f45265q);
        this.f45281p = c10068d;
        int m42386i = c10068d.m42386i();
        this.f45278m = m42386i;
        this.f45272g = 1;
        cVar.obtainMessage(0, m42386i, 0).sendToTarget();
    }

    /* renamed from: m */
    public static C9849e m41469m(C9849e c9849e, C9874x c9874x, int i10, long j10) {
        int i11 = c9849e.f45183b;
        return new C9849e(c9849e.f45182a.m41536j(c9874x), (i11 == 5 || i11 == 7) ? 7 : i10 != 0 ? 1 : 0, (i11 == 5 || c9849e.m41403c()) ? j10 : c9849e.f45184c, j10, -1L, i10, 0);
    }

    /* renamed from: c */
    public void m41470c(C9874x c9874x, int i10) {
        this.f45272g++;
        this.f45269d.obtainMessage(6, i10, 0, c9874x).sendToTarget();
    }

    /* renamed from: d */
    public void m41471d(d dVar) {
        C4349a.m21882e(dVar);
        this.f45271f.add(dVar);
    }

    /* renamed from: e */
    public List<C9849e> m41472e() {
        return this.f45280o;
    }

    /* renamed from: f */
    public InterfaceC9867q m41473f() {
        return this.f45267b;
    }

    /* renamed from: g */
    public boolean m41474g() {
        return this.f45275j;
    }

    /* renamed from: h */
    public C10067c m41475h() {
        return this.f45281p.m42383f();
    }

    /* renamed from: i */
    public final boolean m41476i(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            m41482p((List) message.obj);
            return true;
        }
        if (i10 == 1) {
            m41483q(message.arg1, message.arg2);
            return true;
        }
        if (i10 != 2) {
            throw new IllegalStateException();
        }
        m41481o((b) message.obj);
        return true;
    }

    /* renamed from: j */
    public boolean m41477j() {
        return this.f45273h == 0 && this.f45272g == 0;
    }

    /* renamed from: k */
    public boolean m41478k() {
        return this.f45274i;
    }

    /* renamed from: l */
    public boolean m41479l() {
        return this.f45279n;
    }

    /* renamed from: n */
    public final void m41480n() {
        Iterator<d> it = this.f45271f.iterator();
        while (it.hasNext()) {
            it.next().mo18032c(this, this.f45279n);
        }
    }

    /* renamed from: o */
    public final void m41481o(b bVar) {
        this.f45280o = Collections.unmodifiableList(bVar.f45284c);
        C9849e c9849e = bVar.f45282a;
        boolean m41492z = m41492z();
        if (bVar.f45283b) {
            Iterator<d> it = this.f45271f.iterator();
            while (it.hasNext()) {
                it.next().mo18033d(this, c9849e);
            }
        } else {
            Iterator<d> it2 = this.f45271f.iterator();
            while (it2.hasNext()) {
                it2.next().mo18030a(this, c9849e, bVar.f45285d);
            }
        }
        if (m41492z) {
            m41480n();
        }
    }

    /* renamed from: p */
    public final void m41482p(List<C9849e> list) {
        this.f45274i = true;
        this.f45280o = Collections.unmodifiableList(list);
        boolean m41492z = m41492z();
        Iterator<d> it = this.f45271f.iterator();
        while (it.hasNext()) {
            it.next().mo18036g(this);
        }
        if (m41492z) {
            m41480n();
        }
    }

    /* renamed from: q */
    public final void m41483q(int i10, int i11) {
        this.f45272g -= i10;
        this.f45273h = i11;
        if (m41477j()) {
            Iterator<d> it = this.f45271f.iterator();
            while (it.hasNext()) {
                it.next().mo18035f(this);
            }
        }
    }

    /* renamed from: r */
    public final void m41484r(C10068d c10068d, int i10) {
        C10067c m42383f = c10068d.m42383f();
        if (this.f45278m != i10) {
            this.f45278m = i10;
            this.f45272g++;
            this.f45269d.obtainMessage(2, i10, 0).sendToTarget();
        }
        boolean m41492z = m41492z();
        Iterator<d> it = this.f45271f.iterator();
        while (it.hasNext()) {
            it.next().mo18031b(this, m42383f, i10);
        }
        if (m41492z) {
            m41480n();
        }
    }

    /* renamed from: s */
    public void m41485s() {
        m41489w(true);
    }

    /* renamed from: t */
    public void m41486t() {
        this.f45272g++;
        this.f45269d.obtainMessage(8).sendToTarget();
    }

    /* renamed from: u */
    public void m41487u(String str) {
        this.f45272g++;
        this.f45269d.obtainMessage(7, str).sendToTarget();
    }

    /* renamed from: v */
    public void m41488v() {
        m41489w(false);
    }

    /* renamed from: w */
    public final void m41489w(boolean z10) {
        if (this.f45275j == z10) {
            return;
        }
        this.f45275j = z10;
        this.f45272g++;
        this.f45269d.obtainMessage(1, z10 ? 1 : 0, 0).sendToTarget();
        boolean m41492z = m41492z();
        Iterator<d> it = this.f45271f.iterator();
        while (it.hasNext()) {
            it.next().mo18034e(this, z10);
        }
        if (m41492z) {
            m41480n();
        }
    }

    /* renamed from: x */
    public void m41490x(C10067c c10067c) {
        if (c10067c.equals(this.f45281p.m42383f())) {
            return;
        }
        this.f45281p.m42387j();
        C10068d c10068d = new C10068d(this.f45266a, this.f45270e, c10067c);
        this.f45281p = c10068d;
        m41484r(this.f45281p, c10068d.m42386i());
    }

    /* renamed from: y */
    public void m41491y(String str, int i10) {
        this.f45272g++;
        this.f45269d.obtainMessage(3, i10, 0, str).sendToTarget();
    }

    /* renamed from: z */
    public final boolean m41492z() {
        boolean z10;
        if (!this.f45275j && this.f45278m != 0) {
            for (int i10 = 0; i10 < this.f45280o.size(); i10++) {
                if (this.f45280o.get(i10).f45183b == 0) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        boolean z11 = this.f45279n != z10;
        this.f45279n = z10;
        return z11;
    }
}
