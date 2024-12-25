package p389wg;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jsoup.parser.CharacterReader;
import p389wg.InterfaceC9575b;
import p411xi.C9761e;
import p411xi.C9764h;
import p411xi.C9772p;
import p411xi.InterfaceC9763g;
import tg.EnumC8742r;
import ug.AbstractRunnableC9179d;
import ug.C9183h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wg/o.class
 */
/* renamed from: wg.o */
/* loaded from: combined.jar:classes2.jar:wg/o.class */
public final class C9588o implements Closeable {

    /* renamed from: y */
    public static final ExecutorService f43672y = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C9183h.m38698r("OkHttp SpdyConnection", true));

    /* renamed from: b */
    public final EnumC8742r f43673b;

    /* renamed from: c */
    public final boolean f43674c;

    /* renamed from: d */
    public final InterfaceC9582i f43675d;

    /* renamed from: e */
    public final Map<Integer, C9589p> f43676e;

    /* renamed from: f */
    public final String f43677f;

    /* renamed from: g */
    public int f43678g;

    /* renamed from: h */
    public int f43679h;

    /* renamed from: i */
    public boolean f43680i;

    /* renamed from: j */
    public long f43681j;

    /* renamed from: k */
    public final ExecutorService f43682k;

    /* renamed from: l */
    public Map<Integer, C9584k> f43683l;

    /* renamed from: m */
    public final InterfaceC9585l f43684m;

    /* renamed from: n */
    public int f43685n;

    /* renamed from: o */
    public long f43686o;

    /* renamed from: p */
    public long f43687p;

    /* renamed from: q */
    public final C9586m f43688q;

    /* renamed from: r */
    public final C9586m f43689r;

    /* renamed from: s */
    public boolean f43690s;

    /* renamed from: t */
    public final InterfaceC9590q f43691t;

    /* renamed from: u */
    public final Socket f43692u;

    /* renamed from: v */
    public final InterfaceC9576c f43693v;

    /* renamed from: w */
    public final i f43694w;

    /* renamed from: x */
    public final Set<Integer> f43695x;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/o$a.class
     */
    /* renamed from: wg.o$a */
    /* loaded from: combined.jar:classes2.jar:wg/o$a.class */
    public class a extends AbstractRunnableC9179d {

        /* renamed from: c */
        public final int f43696c;

        /* renamed from: d */
        public final EnumC9574a f43697d;

        /* renamed from: e */
        public final C9588o f43698e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C9588o c9588o, String str, Object[] objArr, int i10, EnumC9574a enumC9574a) {
            super(str, objArr);
            this.f43698e = c9588o;
            this.f43696c = i10;
            this.f43697d = enumC9574a;
        }

        @Override // ug.AbstractRunnableC9179d
        /* renamed from: k */
        public void mo38663k() {
            try {
                this.f43698e.m40347e1(this.f43696c, this.f43697d);
            } catch (IOException e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/o$b.class
     */
    /* renamed from: wg.o$b */
    /* loaded from: combined.jar:classes2.jar:wg/o$b.class */
    public class b extends AbstractRunnableC9179d {

        /* renamed from: c */
        public final int f43699c;

        /* renamed from: d */
        public final long f43700d;

        /* renamed from: e */
        public final C9588o f43701e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C9588o c9588o, String str, Object[] objArr, int i10, long j10) {
            super(str, objArr);
            this.f43701e = c9588o;
            this.f43699c = i10;
            this.f43700d = j10;
        }

        @Override // ug.AbstractRunnableC9179d
        /* renamed from: k */
        public void mo38663k() {
            try {
                this.f43701e.f43693v.mo40193a(this.f43699c, this.f43700d);
            } catch (IOException e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/o$c.class
     */
    /* renamed from: wg.o$c */
    /* loaded from: combined.jar:classes2.jar:wg/o$c.class */
    public class c extends AbstractRunnableC9179d {

        /* renamed from: c */
        public final boolean f43702c;

        /* renamed from: d */
        public final int f43703d;

        /* renamed from: e */
        public final int f43704e;

        /* renamed from: f */
        public final C9584k f43705f;

        /* renamed from: g */
        public final C9588o f43706g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C9588o c9588o, String str, Object[] objArr, boolean z10, int i10, int i11, C9584k c9584k) {
            super(str, objArr);
            this.f43706g = c9588o;
            this.f43702c = z10;
            this.f43703d = i10;
            this.f43704e = i11;
            this.f43705f = c9584k;
        }

        @Override // ug.AbstractRunnableC9179d
        /* renamed from: k */
        public void mo38663k() {
            try {
                this.f43706g.m40345c1(this.f43702c, this.f43703d, this.f43704e, this.f43705f);
            } catch (IOException e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/o$d.class
     */
    /* renamed from: wg.o$d */
    /* loaded from: combined.jar:classes2.jar:wg/o$d.class */
    public class d extends AbstractRunnableC9179d {

        /* renamed from: c */
        public final int f43707c;

        /* renamed from: d */
        public final List f43708d;

        /* renamed from: e */
        public final C9588o f43709e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C9588o c9588o, String str, Object[] objArr, int i10, List list) {
            super(str, objArr);
            this.f43709e = c9588o;
            this.f43707c = i10;
            this.f43708d = list;
        }

        @Override // ug.AbstractRunnableC9179d
        /* renamed from: k */
        public void mo38663k() {
            if (this.f43709e.f43684m.mo40278b(this.f43707c, this.f43708d)) {
                try {
                    this.f43709e.f43693v.mo40197d(this.f43707c, EnumC9574a.CANCEL);
                    synchronized (this.f43709e) {
                        this.f43709e.f43695x.remove(Integer.valueOf(this.f43707c));
                    }
                } catch (IOException e10) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/o$e.class
     */
    /* renamed from: wg.o$e */
    /* loaded from: combined.jar:classes2.jar:wg/o$e.class */
    public class e extends AbstractRunnableC9179d {

        /* renamed from: c */
        public final int f43710c;

        /* renamed from: d */
        public final List f43711d;

        /* renamed from: e */
        public final boolean f43712e;

        /* renamed from: f */
        public final C9588o f43713f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C9588o c9588o, String str, Object[] objArr, int i10, List list, boolean z10) {
            super(str, objArr);
            this.f43713f = c9588o;
            this.f43710c = i10;
            this.f43711d = list;
            this.f43712e = z10;
        }

        @Override // ug.AbstractRunnableC9179d
        /* renamed from: k */
        public void mo38663k() {
            boolean mo40279c = this.f43713f.f43684m.mo40279c(this.f43710c, this.f43711d, this.f43712e);
            if (mo40279c) {
                try {
                    this.f43713f.f43693v.mo40197d(this.f43710c, EnumC9574a.CANCEL);
                } catch (IOException e10) {
                    return;
                }
            }
            if (mo40279c || this.f43712e) {
                synchronized (this.f43713f) {
                    this.f43713f.f43695x.remove(Integer.valueOf(this.f43710c));
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/o$f.class
     */
    /* renamed from: wg.o$f */
    /* loaded from: combined.jar:classes2.jar:wg/o$f.class */
    public class f extends AbstractRunnableC9179d {

        /* renamed from: c */
        public final int f43714c;

        /* renamed from: d */
        public final C9761e f43715d;

        /* renamed from: e */
        public final int f43716e;

        /* renamed from: f */
        public final boolean f43717f;

        /* renamed from: g */
        public final C9588o f43718g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C9588o c9588o, String str, Object[] objArr, int i10, C9761e c9761e, int i11, boolean z10) {
            super(str, objArr);
            this.f43718g = c9588o;
            this.f43714c = i10;
            this.f43715d = c9761e;
            this.f43716e = i11;
            this.f43717f = z10;
        }

        @Override // ug.AbstractRunnableC9179d
        /* renamed from: k */
        public void mo38663k() {
            try {
                boolean mo40277a = this.f43718g.f43684m.mo40277a(this.f43714c, this.f43715d, this.f43716e, this.f43717f);
                if (mo40277a) {
                    this.f43718g.f43693v.mo40197d(this.f43714c, EnumC9574a.CANCEL);
                }
                if (mo40277a || this.f43717f) {
                    synchronized (this.f43718g) {
                        this.f43718g.f43695x.remove(Integer.valueOf(this.f43714c));
                    }
                }
            } catch (IOException e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/o$g.class
     */
    /* renamed from: wg.o$g */
    /* loaded from: combined.jar:classes2.jar:wg/o$g.class */
    public class g extends AbstractRunnableC9179d {

        /* renamed from: c */
        public final int f43719c;

        /* renamed from: d */
        public final EnumC9574a f43720d;

        /* renamed from: e */
        public final C9588o f43721e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C9588o c9588o, String str, Object[] objArr, int i10, EnumC9574a enumC9574a) {
            super(str, objArr);
            this.f43721e = c9588o;
            this.f43719c = i10;
            this.f43720d = enumC9574a;
        }

        @Override // ug.AbstractRunnableC9179d
        /* renamed from: k */
        public void mo38663k() {
            this.f43721e.f43684m.mo40280d(this.f43719c, this.f43720d);
            synchronized (this.f43721e) {
                this.f43721e.f43695x.remove(Integer.valueOf(this.f43719c));
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/o$h.class
     */
    /* renamed from: wg.o$h */
    /* loaded from: combined.jar:classes2.jar:wg/o$h.class */
    public static class h {

        /* renamed from: a */
        public String f43722a;

        /* renamed from: b */
        public Socket f43723b;

        /* renamed from: c */
        public InterfaceC9582i f43724c = InterfaceC9582i.f43649a;

        /* renamed from: d */
        public EnumC8742r f43725d = EnumC8742r.SPDY_3;

        /* renamed from: e */
        public InterfaceC9585l f43726e = InterfaceC9585l.f43658a;

        /* renamed from: f */
        public boolean f43727f;

        public h(String str, boolean z10, Socket socket) {
            this.f43722a = str;
            this.f43727f = z10;
            this.f43723b = socket;
        }

        /* renamed from: g */
        public C9588o m40356g() {
            return new C9588o(this, null);
        }

        /* renamed from: h */
        public h m40357h(EnumC8742r enumC8742r) {
            this.f43725d = enumC8742r;
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/o$i.class
     */
    /* renamed from: wg.o$i */
    /* loaded from: combined.jar:classes2.jar:wg/o$i.class */
    public class i extends AbstractRunnableC9179d implements InterfaceC9575b.a {

        /* renamed from: c */
        public InterfaceC9575b f43728c;

        /* renamed from: d */
        public final C9588o f43729d;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:wg/o$i$a.class
         */
        /* renamed from: wg.o$i$a */
        /* loaded from: combined.jar:classes2.jar:wg/o$i$a.class */
        public class a extends AbstractRunnableC9179d {

            /* renamed from: c */
            public final C9589p f43730c;

            /* renamed from: d */
            public final i f43731d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, String str, Object[] objArr, C9589p c9589p) {
                super(str, objArr);
                this.f43731d = iVar;
                this.f43730c = c9589p;
            }

            @Override // ug.AbstractRunnableC9179d
            /* renamed from: k */
            public void mo38663k() {
                try {
                    this.f43731d.f43729d.f43675d.mo40267a(this.f43730c);
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:wg/o$i$b.class
         */
        /* renamed from: wg.o$i$b */
        /* loaded from: combined.jar:classes2.jar:wg/o$i$b.class */
        public class b extends AbstractRunnableC9179d {

            /* renamed from: c */
            public final C9586m f43732c;

            /* renamed from: d */
            public final i f43733d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(i iVar, String str, Object[] objArr, C9586m c9586m) {
                super(str, objArr);
                this.f43733d = iVar;
                this.f43732c = c9586m;
            }

            @Override // ug.AbstractRunnableC9179d
            /* renamed from: k */
            public void mo38663k() {
                try {
                    this.f43733d.f43729d.f43693v.mo40198e(this.f43732c);
                } catch (IOException e10) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C9588o c9588o) {
            super("OkHttp %s", c9588o.f43677f);
            this.f43729d = c9588o;
        }

        public /* synthetic */ i(C9588o c9588o, a aVar) {
            this(c9588o);
        }

        @Override // p389wg.InterfaceC9575b.a
        /* renamed from: a */
        public void mo40182a(int i10, long j10) {
            C9588o c9588o = this.f43729d;
            if (i10 == 0) {
                synchronized (c9588o) {
                    C9588o c9588o2 = this.f43729d;
                    c9588o2.f43687p += j10;
                    c9588o2.notifyAll();
                }
                return;
            }
            C9589p m40330N0 = c9588o.m40330N0(i10);
            if (m40330N0 != null) {
                synchronized (m40330N0) {
                    m40330N0.m40367i(j10);
                }
            }
        }

        @Override // p389wg.InterfaceC9575b.a
        /* renamed from: b */
        public void mo40183b(int i10, int i11, List<C9577d> list) {
            this.f43729d.m40336T0(i11, list);
        }

        @Override // p389wg.InterfaceC9575b.a
        /* renamed from: c */
        public void mo40184c(boolean z10, int i10, int i11) {
            if (!z10) {
                this.f43729d.m40346d1(true, i10, i11, null);
                return;
            }
            C9584k m40339W0 = this.f43729d.m40339W0(i10);
            if (m40339W0 != null) {
                m40339W0.m40275b();
            }
        }

        @Override // p389wg.InterfaceC9575b.a
        /* renamed from: d */
        public void mo40185d(int i10, EnumC9574a enumC9574a) {
            if (this.f43729d.m40338V0(i10)) {
                this.f43729d.m40337U0(i10, enumC9574a);
                return;
            }
            C9589p m40340X0 = this.f43729d.m40340X0(i10);
            if (m40340X0 != null) {
                m40340X0.m40383y(enumC9574a);
            }
        }

        @Override // p389wg.InterfaceC9575b.a
        /* renamed from: e */
        public void mo40186e() {
        }

        @Override // p389wg.InterfaceC9575b.a
        /* renamed from: f */
        public void mo40187f(int i10, int i11, int i12, boolean z10) {
        }

        @Override // p389wg.InterfaceC9575b.a
        /* renamed from: g */
        public void mo40188g(boolean z10, int i10, InterfaceC9763g interfaceC9763g, int i11) {
            if (this.f43729d.m40338V0(i10)) {
                this.f43729d.m40334R0(i10, interfaceC9763g, i11, z10);
                return;
            }
            C9589p m40330N0 = this.f43729d.m40330N0(i10);
            if (m40330N0 == null) {
                this.f43729d.m40348f1(i10, EnumC9574a.INVALID_STREAM);
                interfaceC9763g.skip(i11);
            } else {
                m40330N0.m40380v(interfaceC9763g, i11);
                if (z10) {
                    m40330N0.m40381w();
                }
            }
        }

        @Override // p389wg.InterfaceC9575b.a
        /* renamed from: h */
        public void mo40189h(boolean z10, C9586m c9586m) {
            C9589p[] c9589pArr;
            long j10;
            synchronized (this.f43729d) {
                int m40285e = this.f43729d.f43689r.m40285e(65536);
                if (z10) {
                    this.f43729d.f43689r.m40281a();
                }
                this.f43729d.f43689r.m40289i(c9586m);
                if (this.f43729d.m40329M0() == EnumC8742r.HTTP_2) {
                    m40358l(c9586m);
                }
                int m40285e2 = this.f43729d.f43689r.m40285e(65536);
                c9589pArr = null;
                if (m40285e2 == -1 || m40285e2 == m40285e) {
                    j10 = 0;
                } else {
                    long j11 = m40285e2 - m40285e;
                    if (!this.f43729d.f43690s) {
                        this.f43729d.m40326J0(j11);
                        this.f43729d.f43690s = true;
                    }
                    j10 = j11;
                    if (!this.f43729d.f43676e.isEmpty()) {
                        c9589pArr = (C9589p[]) this.f43729d.f43676e.values().toArray(new C9589p[this.f43729d.f43676e.size()]);
                        j10 = j11;
                    }
                }
            }
            if (c9589pArr == null || j10 == 0) {
                return;
            }
            for (C9589p c9589p : c9589pArr) {
                synchronized (c9589p) {
                    c9589p.m40367i(j10);
                }
            }
        }

        @Override // p389wg.InterfaceC9575b.a
        /* renamed from: i */
        public void mo40190i(int i10, EnumC9574a enumC9574a, C9764h c9764h) {
            C9589p[] c9589pArr;
            c9764h.size();
            synchronized (this.f43729d) {
                c9589pArr = (C9589p[]) this.f43729d.f43676e.values().toArray(new C9589p[this.f43729d.f43676e.size()]);
                this.f43729d.f43680i = true;
            }
            for (C9589p c9589p : c9589pArr) {
                if (c9589p.m40373o() > i10 && c9589p.m40377s()) {
                    c9589p.m40383y(EnumC9574a.REFUSED_STREAM);
                    this.f43729d.m40340X0(c9589p.m40373o());
                }
            }
        }

        @Override // p389wg.InterfaceC9575b.a
        /* renamed from: j */
        public void mo40191j(boolean z10, boolean z11, int i10, int i11, List<C9577d> list, EnumC9578e enumC9578e) {
            if (this.f43729d.m40338V0(i10)) {
                this.f43729d.m40335S0(i10, list, z11);
                return;
            }
            synchronized (this.f43729d) {
                if (this.f43729d.f43680i) {
                    return;
                }
                C9589p m40330N0 = this.f43729d.m40330N0(i10);
                if (m40330N0 != null) {
                    if (enumC9578e.failIfStreamPresent()) {
                        m40330N0.m40372n(EnumC9574a.PROTOCOL_ERROR);
                        this.f43729d.m40340X0(i10);
                        return;
                    } else {
                        m40330N0.m40382x(list, enumC9578e);
                        if (z11) {
                            m40330N0.m40381w();
                            return;
                        }
                        return;
                    }
                }
                if (enumC9578e.failIfStreamAbsent()) {
                    this.f43729d.m40348f1(i10, EnumC9574a.INVALID_STREAM);
                    return;
                }
                if (i10 <= this.f43729d.f43678g) {
                    return;
                }
                if (i10 % 2 == this.f43729d.f43679h % 2) {
                    return;
                }
                C9589p c9589p = new C9589p(i10, this.f43729d, z10, z11, list);
                this.f43729d.f43678g = i10;
                this.f43729d.f43676e.put(Integer.valueOf(i10), c9589p);
                C9588o.f43672y.submit(new a(this, "OkHttp %s stream %d", new Object[]{this.f43729d.f43677f, Integer.valueOf(i10)}, c9589p));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.io.IOException] */
        /* JADX WARN: Type inference failed for: r5v12 */
        /* JADX WARN: Type inference failed for: r5v15 */
        /* JADX WARN: Type inference failed for: r5v4 */
        /* JADX WARN: Type inference failed for: r5v9 */
        @Override // ug.AbstractRunnableC9179d
        /* renamed from: k */
        public void mo38663k() {
            EnumC9574a enumC9574a;
            Throwable th2;
            EnumC9574a enumC9574a2;
            EnumC9574a enumC9574a3;
            EnumC9574a enumC9574a4 = EnumC9574a.INTERNAL_ERROR;
            try {
            } catch (IOException e10) {
                e = e10;
            }
            try {
                try {
                    C9588o c9588o = this.f43729d;
                    InterfaceC9575b mo40240a = c9588o.f43691t.mo40240a(C9772p.m41229c(C9772p.m41238l(c9588o.f43692u)), this.f43729d.f43674c);
                    this.f43728c = mo40240a;
                    if (!this.f43729d.f43674c) {
                        mo40240a.mo40180U();
                    }
                    do {
                    } while (this.f43728c.mo40181n(this));
                    enumC9574a3 = EnumC9574a.NO_ERROR;
                    e = enumC9574a3;
                } catch (IOException e11) {
                    enumC9574a2 = enumC9574a4;
                } catch (Throwable th3) {
                    th2 = th3;
                    enumC9574a = enumC9574a4;
                    try {
                        this.f43729d.m40327K0(enumC9574a, enumC9574a4);
                    } catch (IOException e12) {
                    }
                    C9183h.m38683c(this.f43728c);
                    throw th2;
                }
                try {
                    this.f43729d.m40327K0(enumC9574a3, EnumC9574a.CANCEL);
                } catch (IOException e13) {
                    enumC9574a2 = enumC9574a3;
                    EnumC9574a enumC9574a5 = EnumC9574a.PROTOCOL_ERROR;
                    this.f43729d.m40327K0(enumC9574a5, enumC9574a5);
                    e = enumC9574a2;
                    C9183h.m38683c(this.f43728c);
                }
                C9183h.m38683c(this.f43728c);
            } catch (Throwable th4) {
                enumC9574a = e;
                th2 = th4;
                this.f43729d.m40327K0(enumC9574a, enumC9574a4);
                C9183h.m38683c(this.f43728c);
                throw th2;
            }
        }

        /* renamed from: l */
        public final void m40358l(C9586m c9586m) {
            C9588o.f43672y.submit(new b(this, "OkHttp %s ACK Settings", new Object[]{this.f43729d.f43677f}, c9586m));
        }
    }

    public C9588o(h hVar) {
        this.f43676e = new HashMap();
        this.f43681j = System.nanoTime();
        this.f43686o = 0L;
        C9586m c9586m = new C9586m();
        this.f43688q = c9586m;
        C9586m c9586m2 = new C9586m();
        this.f43689r = c9586m2;
        this.f43690s = false;
        this.f43695x = new LinkedHashSet();
        EnumC8742r enumC8742r = hVar.f43725d;
        this.f43673b = enumC8742r;
        this.f43684m = hVar.f43726e;
        boolean z10 = hVar.f43727f;
        this.f43674c = z10;
        this.f43675d = hVar.f43724c;
        this.f43679h = hVar.f43727f ? 1 : 2;
        if (hVar.f43727f && enumC8742r == EnumC8742r.HTTP_2) {
            this.f43679h += 2;
        }
        this.f43685n = hVar.f43727f ? 1 : 2;
        if (hVar.f43727f) {
            c9586m.m40291k(7, 0, 16777216);
        }
        String str = hVar.f43722a;
        this.f43677f = str;
        if (enumC8742r == EnumC8742r.HTTP_2) {
            this.f43691t = new C9580g();
            this.f43682k = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C9183h.m38698r(String.format("OkHttp %s Push Observer", str), true));
            c9586m2.m40291k(7, 0, CharacterReader.EOF);
            c9586m2.m40291k(5, 0, 16384);
        } else {
            if (enumC8742r != EnumC8742r.SPDY_3) {
                throw new AssertionError(enumC8742r);
            }
            this.f43691t = new C9587n();
            this.f43682k = null;
        }
        this.f43687p = c9586m2.m40285e(65536);
        this.f43692u = hVar.f43723b;
        this.f43693v = this.f43691t.mo40241b(C9772p.m41228b(C9772p.m41234h(hVar.f43723b)), z10);
        i iVar = new i(this, null);
        this.f43694w = iVar;
        new Thread(iVar).start();
    }

    public /* synthetic */ C9588o(h hVar, a aVar) {
        this(hVar);
    }

    /* renamed from: J0 */
    public void m40326J0(long j10) {
        this.f43687p += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    /* renamed from: K0 */
    public final void m40327K0(EnumC9574a enumC9574a, EnumC9574a enumC9574a2) {
        C9589p[] c9589pArr;
        IOException e10;
        IOException iOException;
        C9584k[] c9584kArr = null;
        try {
            m40343a1(enumC9574a);
            e = null;
        } catch (IOException e11) {
            e = e11;
        }
        synchronized (this) {
            if (this.f43676e.isEmpty()) {
                c9589pArr = null;
            } else {
                c9589pArr = (C9589p[]) this.f43676e.values().toArray(new C9589p[this.f43676e.size()]);
                this.f43676e.clear();
                m40342Z0(false);
            }
            Map<Integer, C9584k> map = this.f43683l;
            if (map != null) {
                c9584kArr = (C9584k[]) map.values().toArray(new C9584k[this.f43683l.size()]);
                this.f43683l = null;
            }
        }
        IOException iOException2 = e;
        if (c9589pArr != null) {
            int length = c9589pArr.length;
            int i10 = 0;
            while (true) {
                iOException2 = e;
                if (i10 >= length) {
                    break;
                }
                try {
                    c9589pArr[i10].m40370l(enumC9574a2);
                    iOException = e;
                } catch (IOException e12) {
                    iOException = e;
                    if (e != null) {
                        iOException = e12;
                    }
                }
                i10++;
                e = iOException;
            }
        }
        if (c9584kArr != null) {
            for (C9584k c9584k : c9584kArr) {
                c9584k.m40274a();
            }
        }
        try {
            this.f43693v.close();
            e10 = iOException2;
        } catch (IOException e13) {
            e10 = iOException2;
            if (iOException2 == null) {
                e10 = e13;
            }
        }
        try {
            this.f43692u.close();
        } catch (IOException e14) {
            e10 = e14;
        }
        if (e10 != null) {
            throw e10;
        }
    }

    /* renamed from: L0 */
    public long m40328L0() {
        long j10;
        synchronized (this) {
            j10 = this.f43681j;
        }
        return j10;
    }

    /* renamed from: M0 */
    public EnumC8742r m40329M0() {
        return this.f43673b;
    }

    /* renamed from: N0 */
    public C9589p m40330N0(int i10) {
        C9589p c9589p;
        synchronized (this) {
            c9589p = this.f43676e.get(Integer.valueOf(i10));
        }
        return c9589p;
    }

    /* renamed from: O0 */
    public boolean m40331O0() {
        boolean z10;
        synchronized (this) {
            z10 = this.f43681j != Long.MAX_VALUE;
        }
        return z10;
    }

    /* renamed from: P0 */
    public final C9589p m40332P0(int i10, List<C9577d> list, boolean z10, boolean z11) {
        int i11;
        C9589p c9589p;
        boolean z12 = !z10;
        boolean z13 = !z11;
        synchronized (this.f43693v) {
            synchronized (this) {
                if (this.f43680i) {
                    throw new IOException("shutdown");
                }
                i11 = this.f43679h;
                this.f43679h = i11 + 2;
                c9589p = new C9589p(i11, this, z12, z13, list);
                if (c9589p.m40378t()) {
                    this.f43676e.put(Integer.valueOf(i11), c9589p);
                    m40342Z0(false);
                }
            }
            if (i10 == 0) {
                this.f43693v.mo40201x0(z12, z13, i11, i10, list);
            } else {
                if (this.f43674c) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                }
                this.f43693v.mo40195b(i10, i11, list);
            }
        }
        if (!z10) {
            this.f43693v.flush();
        }
        return c9589p;
    }

    /* renamed from: Q0 */
    public C9589p m40333Q0(List<C9577d> list, boolean z10, boolean z11) {
        return m40332P0(0, list, z10, z11);
    }

    /* renamed from: R0 */
    public final void m40334R0(int i10, InterfaceC9763g interfaceC9763g, int i11, boolean z10) {
        C9761e c9761e = new C9761e();
        long j10 = i11;
        interfaceC9763g.mo41151b0(j10);
        interfaceC9763g.mo22901x(c9761e, j10);
        if (c9761e.size() == j10) {
            this.f43682k.submit(new f(this, "OkHttp %s Push Data[%s]", new Object[]{this.f43677f, Integer.valueOf(i10)}, i10, c9761e, i11, z10));
            return;
        }
        throw new IOException(c9761e.size() + " != " + i11);
    }

    /* renamed from: S0 */
    public final void m40335S0(int i10, List<C9577d> list, boolean z10) {
        this.f43682k.submit(new e(this, "OkHttp %s Push Headers[%s]", new Object[]{this.f43677f, Integer.valueOf(i10)}, i10, list, z10));
    }

    /* renamed from: T0 */
    public final void m40336T0(int i10, List<C9577d> list) {
        synchronized (this) {
            if (this.f43695x.contains(Integer.valueOf(i10))) {
                m40348f1(i10, EnumC9574a.PROTOCOL_ERROR);
            } else {
                this.f43695x.add(Integer.valueOf(i10));
                this.f43682k.submit(new d(this, "OkHttp %s Push Request[%s]", new Object[]{this.f43677f, Integer.valueOf(i10)}, i10, list));
            }
        }
    }

    /* renamed from: U0 */
    public final void m40337U0(int i10, EnumC9574a enumC9574a) {
        this.f43682k.submit(new g(this, "OkHttp %s Push Reset[%s]", new Object[]{this.f43677f, Integer.valueOf(i10)}, i10, enumC9574a));
    }

    /* renamed from: V0 */
    public final boolean m40338V0(int i10) {
        boolean z10 = true;
        if (this.f43673b != EnumC8742r.HTTP_2 || i10 == 0 || (i10 & 1) != 0) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: W0 */
    public final C9584k m40339W0(int i10) {
        C9584k remove;
        synchronized (this) {
            Map<Integer, C9584k> map = this.f43683l;
            remove = map != null ? map.remove(Integer.valueOf(i10)) : null;
        }
        return remove;
    }

    /* renamed from: X0 */
    public C9589p m40340X0(int i10) {
        C9589p remove;
        synchronized (this) {
            remove = this.f43676e.remove(Integer.valueOf(i10));
            if (remove != null && this.f43676e.isEmpty()) {
                m40342Z0(true);
            }
        }
        return remove;
    }

    /* renamed from: Y0 */
    public void m40341Y0() {
        this.f43693v.mo40192J();
        this.f43693v.mo40199g(this.f43688q);
        if (this.f43688q.m40285e(65536) != 65536) {
            this.f43693v.mo40193a(0, r0 - 65536);
        }
    }

    /* renamed from: Z0 */
    public final void m40342Z0(boolean z10) {
        synchronized (this) {
            this.f43681j = z10 ? System.nanoTime() : Long.MAX_VALUE;
        }
    }

    /* renamed from: a1 */
    public void m40343a1(EnumC9574a enumC9574a) {
        synchronized (this.f43693v) {
            synchronized (this) {
                if (this.f43680i) {
                    return;
                }
                this.f43680i = true;
                this.f43693v.mo40202y0(this.f43678g, enumC9574a, C9183h.f42012a);
            }
        }
    }

    /* renamed from: b1 */
    public void m40344b1(int i10, boolean z10, C9761e c9761e, long j10) {
        long j11;
        int min;
        long j12;
        long j13 = j10;
        if (j10 == 0) {
            this.f43693v.mo40200j(z10, i10, c9761e, 0);
            return;
        }
        while (j13 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j11 = this.f43687p;
                        if (j11 > 0) {
                            break;
                        } else {
                            wait();
                        }
                    } catch (InterruptedException e10) {
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j13, j11), this.f43693v.mo40194a0());
                j12 = min;
                this.f43687p -= j12;
            }
            j13 -= j12;
            this.f43693v.mo40200j(z10 && j13 == 0, i10, c9761e, min);
        }
    }

    /* renamed from: c1 */
    public final void m40345c1(boolean z10, int i10, int i11, C9584k c9584k) {
        synchronized (this.f43693v) {
            if (c9584k != null) {
                c9584k.m40276c();
            }
            this.f43693v.mo40196c(z10, i10, i11);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m40327K0(EnumC9574a.NO_ERROR, EnumC9574a.CANCEL);
    }

    /* renamed from: d1 */
    public final void m40346d1(boolean z10, int i10, int i11, C9584k c9584k) {
        f43672y.submit(new c(this, "OkHttp %s ping %08x%08x", new Object[]{this.f43677f, Integer.valueOf(i10), Integer.valueOf(i11)}, z10, i10, i11, c9584k));
    }

    /* renamed from: e1 */
    public void m40347e1(int i10, EnumC9574a enumC9574a) {
        this.f43693v.mo40197d(i10, enumC9574a);
    }

    /* renamed from: f1 */
    public void m40348f1(int i10, EnumC9574a enumC9574a) {
        f43672y.submit(new a(this, "OkHttp %s stream %d", new Object[]{this.f43677f, Integer.valueOf(i10)}, i10, enumC9574a));
    }

    public void flush() {
        this.f43693v.flush();
    }

    /* renamed from: g1 */
    public void m40349g1(int i10, long j10) {
        f43672y.submit(new b(this, "OkHttp Window Update %s stream %d", new Object[]{this.f43677f, Integer.valueOf(i10)}, i10, j10));
    }
}
