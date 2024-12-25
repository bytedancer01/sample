package p312ri;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ki.C5634b;
import ni.AbstractC6794a;
import ni.C6796c;
import ni.C6797d;
import ni.C6798e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jsoup.parser.CharacterReader;
import p172jh.C5398q;
import p312ri.C8482h;
import p356uh.InterfaceC9185a;
import p372vh.C9365d;
import p372vh.C9367f;
import p372vh.C9370i;
import p372vh.C9371j;
import p411xi.C9761e;
import p411xi.C9764h;
import p411xi.InterfaceC9762f;
import p411xi.InterfaceC9763g;
import si.C8588j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ri/f.class
 */
/* renamed from: ri.f */
/* loaded from: combined.jar:classes2.jar:ri/f.class */
public final class C8480f implements Closeable {

    /* renamed from: D */
    @NotNull
    public static final C8487m f39615D;

    /* renamed from: E */
    public static final c f39616E = new c(null);

    /* renamed from: A */
    @NotNull
    public final C8484j f39617A;

    /* renamed from: B */
    @NotNull
    public final e f39618B;

    /* renamed from: C */
    public final Set<Integer> f39619C;

    /* renamed from: b */
    public final boolean f39620b;

    /* renamed from: c */
    @NotNull
    public final d f39621c;

    /* renamed from: d */
    @NotNull
    public final Map<Integer, C8483i> f39622d;

    /* renamed from: e */
    @NotNull
    public final String f39623e;

    /* renamed from: f */
    public int f39624f;

    /* renamed from: g */
    public int f39625g;

    /* renamed from: h */
    public boolean f39626h;

    /* renamed from: i */
    public final C6798e f39627i;

    /* renamed from: j */
    public final C6797d f39628j;

    /* renamed from: k */
    public final C6797d f39629k;

    /* renamed from: l */
    public final C6797d f39630l;

    /* renamed from: m */
    public final InterfaceC8486l f39631m;

    /* renamed from: n */
    public long f39632n;

    /* renamed from: o */
    public long f39633o;

    /* renamed from: p */
    public long f39634p;

    /* renamed from: q */
    public long f39635q;

    /* renamed from: r */
    public long f39636r;

    /* renamed from: s */
    public long f39637s;

    /* renamed from: t */
    @NotNull
    public final C8487m f39638t;

    /* renamed from: u */
    @NotNull
    public C8487m f39639u;

    /* renamed from: v */
    public long f39640v;

    /* renamed from: w */
    public long f39641w;

    /* renamed from: x */
    public long f39642x;

    /* renamed from: y */
    public long f39643y;

    /* renamed from: z */
    @NotNull
    public final Socket f39644z;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/f$a.class
     */
    /* renamed from: ri.f$a */
    /* loaded from: combined.jar:classes2.jar:ri/f$a.class */
    public static final class a extends AbstractC6794a {

        /* renamed from: e */
        public final String f39645e;

        /* renamed from: f */
        public final C8480f f39646f;

        /* renamed from: g */
        public final long f39647g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, C8480f c8480f, long j10) {
            super(str2, false, 2, null);
            this.f39645e = str;
            this.f39646f = c8480f;
            this.f39647g = j10;
        }

        @Override // ni.AbstractC6794a
        /* renamed from: f */
        public long mo31315f() {
            boolean z10;
            long j10;
            synchronized (this.f39646f) {
                if (this.f39646f.f39633o < this.f39646f.f39632n) {
                    z10 = true;
                } else {
                    this.f39646f.f39632n++;
                    z10 = false;
                }
            }
            C8480f c8480f = this.f39646f;
            if (z10) {
                c8480f.m36453G0(null);
                j10 = -1;
            } else {
                c8480f.m36482k1(false, 1, 0);
                j10 = this.f39647g;
            }
            return j10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/f$b.class
     */
    /* renamed from: ri.f$b */
    /* loaded from: combined.jar:classes2.jar:ri/f$b.class */
    public static final class b {

        /* renamed from: a */
        @NotNull
        public Socket f39648a;

        /* renamed from: b */
        @NotNull
        public String f39649b;

        /* renamed from: c */
        @NotNull
        public InterfaceC9763g f39650c;

        /* renamed from: d */
        @NotNull
        public InterfaceC9762f f39651d;

        /* renamed from: e */
        @NotNull
        public d f39652e;

        /* renamed from: f */
        @NotNull
        public InterfaceC8486l f39653f;

        /* renamed from: g */
        public int f39654g;

        /* renamed from: h */
        public boolean f39655h;

        /* renamed from: i */
        @NotNull
        public final C6798e f39656i;

        public b(boolean z10, @NotNull C6798e c6798e) {
            C9367f.m39526e(c6798e, "taskRunner");
            this.f39655h = z10;
            this.f39656i = c6798e;
            this.f39652e = d.f39657a;
            this.f39653f = InterfaceC8486l.f39787a;
        }

        @NotNull
        /* renamed from: a */
        public final C8480f m36486a() {
            return new C8480f(this);
        }

        /* renamed from: b */
        public final boolean m36487b() {
            return this.f39655h;
        }

        @NotNull
        /* renamed from: c */
        public final String m36488c() {
            String str = this.f39649b;
            if (str == null) {
                C9367f.m39538q("connectionName");
            }
            return str;
        }

        @NotNull
        /* renamed from: d */
        public final d m36489d() {
            return this.f39652e;
        }

        /* renamed from: e */
        public final int m36490e() {
            return this.f39654g;
        }

        @NotNull
        /* renamed from: f */
        public final InterfaceC8486l m36491f() {
            return this.f39653f;
        }

        @NotNull
        /* renamed from: g */
        public final InterfaceC9762f m36492g() {
            InterfaceC9762f interfaceC9762f = this.f39651d;
            if (interfaceC9762f == null) {
                C9367f.m39538q("sink");
            }
            return interfaceC9762f;
        }

        @NotNull
        /* renamed from: h */
        public final Socket m36493h() {
            Socket socket = this.f39648a;
            if (socket == null) {
                C9367f.m39538q("socket");
            }
            return socket;
        }

        @NotNull
        /* renamed from: i */
        public final InterfaceC9763g m36494i() {
            InterfaceC9763g interfaceC9763g = this.f39650c;
            if (interfaceC9763g == null) {
                C9367f.m39538q("source");
            }
            return interfaceC9763g;
        }

        @NotNull
        /* renamed from: j */
        public final C6798e m36495j() {
            return this.f39656i;
        }

        @NotNull
        /* renamed from: k */
        public final b m36496k(@NotNull d dVar) {
            C9367f.m39526e(dVar, "listener");
            this.f39652e = dVar;
            return this;
        }

        @NotNull
        /* renamed from: l */
        public final b m36497l(int i10) {
            this.f39654g = i10;
            return this;
        }

        @NotNull
        /* renamed from: m */
        public final b m36498m(@NotNull Socket socket, @NotNull String str, @NotNull InterfaceC9763g interfaceC9763g, @NotNull InterfaceC9762f interfaceC9762f) {
            StringBuilder sb2;
            C9367f.m39526e(socket, "socket");
            C9367f.m39526e(str, "peerName");
            C9367f.m39526e(interfaceC9763g, "source");
            C9367f.m39526e(interfaceC9762f, "sink");
            this.f39648a = socket;
            if (this.f39655h) {
                sb2 = new StringBuilder();
                sb2.append(C5634b.f31712i);
                sb2.append(' ');
            } else {
                sb2 = new StringBuilder();
                sb2.append("MockWebServer ");
            }
            sb2.append(str);
            this.f39649b = sb2.toString();
            this.f39650c = interfaceC9763g;
            this.f39651d = interfaceC9762f;
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/f$c.class
     */
    /* renamed from: ri.f$c */
    /* loaded from: combined.jar:classes2.jar:ri/f$c.class */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(C9365d c9365d) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C8487m m36499a() {
            return C8480f.f39615D;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/f$d.class
     */
    /* renamed from: ri.f$d */
    /* loaded from: combined.jar:classes2.jar:ri/f$d.class */
    public static abstract class d {

        /* renamed from: b */
        public static final b f39658b = new b(null);

        /* renamed from: a */
        @NotNull
        public static final d f39657a = new a();

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ri/f$d$a.class
         */
        /* renamed from: ri.f$d$a */
        /* loaded from: combined.jar:classes2.jar:ri/f$d$a.class */
        public static final class a extends d {
            @Override // p312ri.C8480f.d
            /* renamed from: b */
            public void mo32084b(@NotNull C8483i c8483i) {
                C9367f.m39526e(c8483i, "stream");
                c8483i.m36547d(EnumC8476b.REFUSED_STREAM, null);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ri/f$d$b.class
         */
        /* renamed from: ri.f$d$b */
        /* loaded from: combined.jar:classes2.jar:ri/f$d$b.class */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(C9365d c9365d) {
                this();
            }
        }

        /* renamed from: a */
        public void mo32083a(@NotNull C8480f c8480f, @NotNull C8487m c8487m) {
            C9367f.m39526e(c8480f, "connection");
            C9367f.m39526e(c8487m, "settings");
        }

        /* renamed from: b */
        public abstract void mo32084b(@NotNull C8483i c8483i);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/f$e.class
     */
    /* renamed from: ri.f$e */
    /* loaded from: combined.jar:classes2.jar:ri/f$e.class */
    public final class e implements C8482h.c, InterfaceC9185a<C5398q> {

        /* renamed from: b */
        @NotNull
        public final C8482h f39659b;

        /* renamed from: c */
        public final C8480f f39660c;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ri/f$e$a.class
         */
        /* renamed from: ri.f$e$a */
        /* loaded from: combined.jar:classes2.jar:ri/f$e$a.class */
        public static final class a extends AbstractC6794a {

            /* renamed from: e */
            public final String f39661e;

            /* renamed from: f */
            public final boolean f39662f;

            /* renamed from: g */
            public final e f39663g;

            /* renamed from: h */
            public final C9371j f39664h;

            /* renamed from: i */
            public final boolean f39665i;

            /* renamed from: j */
            public final C8487m f39666j;

            /* renamed from: k */
            public final C9370i f39667k;

            /* renamed from: l */
            public final C9371j f39668l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z10, String str2, boolean z11, e eVar, C9371j c9371j, boolean z12, C8487m c8487m, C9370i c9370i, C9371j c9371j2) {
                super(str2, z11);
                this.f39661e = str;
                this.f39662f = z10;
                this.f39663g = eVar;
                this.f39664h = c9371j;
                this.f39665i = z12;
                this.f39666j = c8487m;
                this.f39667k = c9370i;
                this.f39668l = c9371j2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ni.AbstractC6794a
            /* renamed from: f */
            public long mo31315f() {
                this.f39663g.f39660c.m36457K0().mo32083a(this.f39663g.f39660c, (C8487m) this.f39664h.f42904b);
                return -1L;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ri/f$e$b.class
         */
        /* renamed from: ri.f$e$b */
        /* loaded from: combined.jar:classes2.jar:ri/f$e$b.class */
        public static final class b extends AbstractC6794a {

            /* renamed from: e */
            public final String f39669e;

            /* renamed from: f */
            public final boolean f39670f;

            /* renamed from: g */
            public final C8483i f39671g;

            /* renamed from: h */
            public final e f39672h;

            /* renamed from: i */
            public final C8483i f39673i;

            /* renamed from: j */
            public final int f39674j;

            /* renamed from: k */
            public final List f39675k;

            /* renamed from: l */
            public final boolean f39676l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z10, String str2, boolean z11, C8483i c8483i, e eVar, C8483i c8483i2, int i10, List list, boolean z12) {
                super(str2, z11);
                this.f39669e = str;
                this.f39670f = z10;
                this.f39671g = c8483i;
                this.f39672h = eVar;
                this.f39673i = c8483i2;
                this.f39674j = i10;
                this.f39675k = list;
                this.f39676l = z12;
            }

            @Override // ni.AbstractC6794a
            /* renamed from: f */
            public long mo31315f() {
                try {
                    this.f39672h.f39660c.m36457K0().mo32084b(this.f39671g);
                    return -1L;
                } catch (IOException e10) {
                    C8588j.f40042c.m36880g().m36873j("Http2Connection.Listener failure for " + this.f39672h.f39660c.m36455I0(), 4, e10);
                    try {
                        this.f39671g.m36547d(EnumC8476b.PROTOCOL_ERROR, e10);
                        return -1L;
                    } catch (IOException e11) {
                        return -1L;
                    }
                }
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ri/f$e$c.class
         */
        /* renamed from: ri.f$e$c */
        /* loaded from: combined.jar:classes2.jar:ri/f$e$c.class */
        public static final class c extends AbstractC6794a {

            /* renamed from: e */
            public final String f39677e;

            /* renamed from: f */
            public final boolean f39678f;

            /* renamed from: g */
            public final e f39679g;

            /* renamed from: h */
            public final int f39680h;

            /* renamed from: i */
            public final int f39681i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z10, String str2, boolean z11, e eVar, int i10, int i11) {
                super(str2, z11);
                this.f39677e = str;
                this.f39678f = z10;
                this.f39679g = eVar;
                this.f39680h = i10;
                this.f39681i = i11;
            }

            @Override // ni.AbstractC6794a
            /* renamed from: f */
            public long mo31315f() {
                this.f39679g.f39660c.m36482k1(true, this.f39680h, this.f39681i);
                return -1L;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ri/f$e$d.class
         */
        /* renamed from: ri.f$e$d */
        /* loaded from: combined.jar:classes2.jar:ri/f$e$d.class */
        public static final class d extends AbstractC6794a {

            /* renamed from: e */
            public final String f39682e;

            /* renamed from: f */
            public final boolean f39683f;

            /* renamed from: g */
            public final e f39684g;

            /* renamed from: h */
            public final boolean f39685h;

            /* renamed from: i */
            public final C8487m f39686i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, boolean z10, String str2, boolean z11, e eVar, boolean z12, C8487m c8487m) {
                super(str2, z11);
                this.f39682e = str;
                this.f39683f = z10;
                this.f39684g = eVar;
                this.f39685h = z12;
                this.f39686i = c8487m;
            }

            @Override // ni.AbstractC6794a
            /* renamed from: f */
            public long mo31315f() {
                this.f39684g.m36510o(this.f39685h, this.f39686i);
                return -1L;
            }
        }

        public e(@NotNull C8480f c8480f, C8482h c8482h) {
            C9367f.m39526e(c8482h, "reader");
            this.f39660c = c8480f;
            this.f39659b = c8482h;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v12, types: [ri.f] */
        @Override // p312ri.C8482h.c
        /* renamed from: a */
        public void mo36500a(int i10, long j10) {
            C8483i m36461O0;
            if (i10 == 0) {
                m36461O0 = this.f39660c;
                synchronized (m36461O0) {
                    C8480f c8480f = this.f39660c;
                    c8480f.f39643y = c8480f.m36463Q0() + j10;
                    C8480f c8480f2 = this.f39660c;
                    if (c8480f2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                    c8480f2.notifyAll();
                    C5398q c5398q = C5398q.f30770a;
                }
            } else {
                m36461O0 = this.f39660c.m36461O0(i10);
                if (m36461O0 == null) {
                    return;
                }
                synchronized (m36461O0) {
                    m36461O0.m36544a(j10);
                    C5398q c5398q2 = C5398q.f30770a;
                }
            }
        }

        @Override // p312ri.C8482h.c
        /* renamed from: b */
        public void mo36501b(int i10, int i11, @NotNull List<C8477c> list) {
            C9367f.m39526e(list, "requestHeaders");
            this.f39660c.m36470X0(i11, list);
        }

        @Override // p312ri.C8482h.c
        /* renamed from: c */
        public void mo36502c(boolean z10, int i10, int i11) {
            if (!z10) {
                C6797d c6797d = this.f39660c.f39628j;
                String str = this.f39660c.m36455I0() + " ping";
                c6797d.m31329i(new c(str, true, str, true, this, i10, i11), 0L);
                return;
            }
            synchronized (this.f39660c) {
                if (i10 == 1) {
                    this.f39660c.f39633o++;
                } else if (i10 != 2) {
                    if (i10 == 3) {
                        this.f39660c.f39636r++;
                        C8480f c8480f = this.f39660c;
                        if (c8480f == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                        }
                        c8480f.notifyAll();
                    }
                    C5398q c5398q = C5398q.f30770a;
                } else {
                    this.f39660c.f39635q++;
                }
            }
        }

        @Override // p312ri.C8482h.c
        /* renamed from: e */
        public void mo36503e() {
        }

        @Override // p312ri.C8482h.c
        /* renamed from: f */
        public void mo36504f(int i10, int i11, int i12, boolean z10) {
        }

        @Override // p312ri.C8482h.c
        /* renamed from: g */
        public void mo36505g(boolean z10, int i10, @NotNull InterfaceC9763g interfaceC9763g, int i11) {
            C9367f.m39526e(interfaceC9763g, "source");
            if (this.f39660c.m36472Z0(i10)) {
                this.f39660c.m36468V0(i10, interfaceC9763g, i11, z10);
                return;
            }
            C8483i m36461O0 = this.f39660c.m36461O0(i10);
            if (m36461O0 == null) {
                this.f39660c.m36484m1(i10, EnumC8476b.PROTOCOL_ERROR);
                long j10 = i11;
                this.f39660c.m36479h1(j10);
                interfaceC9763g.skip(j10);
                return;
            }
            m36461O0.m36566w(interfaceC9763g, i11);
            if (z10) {
                m36461O0.m36567x(C5634b.f31705b, true);
            }
        }

        @Override // p356uh.InterfaceC9185a
        /* renamed from: h */
        public /* bridge */ /* synthetic */ C5398q mo20777h() {
            m36511p();
            return C5398q.f30770a;
        }

        @Override // p312ri.C8482h.c
        /* renamed from: i */
        public void mo36506i(boolean z10, int i10, int i11, @NotNull List<C8477c> list) {
            C9367f.m39526e(list, "headerBlock");
            if (this.f39660c.m36472Z0(i10)) {
                this.f39660c.m36469W0(i10, list, z10);
                return;
            }
            synchronized (this.f39660c) {
                C8483i m36461O0 = this.f39660c.m36461O0(i10);
                if (m36461O0 != null) {
                    C5398q c5398q = C5398q.f30770a;
                    m36461O0.m36567x(C5634b.m27768L(list), z10);
                    return;
                }
                if (this.f39660c.f39626h) {
                    return;
                }
                if (i10 <= this.f39660c.m36456J0()) {
                    return;
                }
                if (i10 % 2 == this.f39660c.m36458L0() % 2) {
                    return;
                }
                C8483i c8483i = new C8483i(i10, this.f39660c, false, z10, C5634b.m27768L(list));
                this.f39660c.m36475c1(i10);
                this.f39660c.m36462P0().put(Integer.valueOf(i10), c8483i);
                C6797d m31342i = this.f39660c.f39627i.m31342i();
                String str = this.f39660c.m36455I0() + '[' + i10 + "] onStream";
                m31342i.m31329i(new b(str, true, str, true, c8483i, this, m36461O0, i10, list, z10), 0L);
            }
        }

        @Override // p312ri.C8482h.c
        /* renamed from: j */
        public void mo36507j(boolean z10, @NotNull C8487m c8487m) {
            C9367f.m39526e(c8487m, "settings");
            C6797d c6797d = this.f39660c.f39628j;
            String str = this.f39660c.m36455I0() + " applyAndAckSettings";
            c6797d.m31329i(new d(str, true, str, true, this, z10, c8487m), 0L);
        }

        @Override // p312ri.C8482h.c
        /* renamed from: k */
        public void mo36508k(int i10, @NotNull EnumC8476b enumC8476b, @NotNull C9764h c9764h) {
            int i11;
            C8483i[] c8483iArr;
            C9367f.m39526e(enumC8476b, "errorCode");
            C9367f.m39526e(c9764h, "debugData");
            c9764h.size();
            synchronized (this.f39660c) {
                Object[] array = this.f39660c.m36462P0().values().toArray(new C8483i[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                c8483iArr = (C8483i[]) array;
                this.f39660c.f39626h = true;
                C5398q c5398q = C5398q.f30770a;
            }
            for (C8483i c8483i : c8483iArr) {
                if (c8483i.m36553j() > i10 && c8483i.m36563t()) {
                    c8483i.m36568y(EnumC8476b.REFUSED_STREAM);
                    this.f39660c.m36473a1(c8483i.m36553j());
                }
            }
        }

        @Override // p312ri.C8482h.c
        /* renamed from: n */
        public void mo36509n(int i10, @NotNull EnumC8476b enumC8476b) {
            C9367f.m39526e(enumC8476b, "errorCode");
            if (this.f39660c.m36472Z0(i10)) {
                this.f39660c.m36471Y0(i10, enumC8476b);
                return;
            }
            C8483i m36473a1 = this.f39660c.m36473a1(i10);
            if (m36473a1 != null) {
                m36473a1.m36568y(enumC8476b);
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(21:7|8|(1:10)(1:66)|11|12|13|(2:18|(13:20|21|22|23|24|25|26|27|28|29|30|31|32)(2:62|63))|64|65|21|22|23|24|25|26|27|28|29|30|31|32) */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0155, code lost:
        
            r14 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0156, code lost:
        
            r12.f39660c.m36453G0(r14);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m36510o(boolean r13, @org.jetbrains.annotations.NotNull p312ri.C8487m r14) {
            /*
                Method dump skipped, instructions count: 447
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p312ri.C8480f.e.m36510o(boolean, ri.m):void");
        }

        /* renamed from: p */
        public void m36511p() {
            EnumC8476b enumC8476b;
            Throwable th2;
            EnumC8476b enumC8476b2;
            EnumC8476b enumC8476b3 = EnumC8476b.INTERNAL_ERROR;
            IOException iOException = null;
            IOException iOException2 = null;
            try {
                this.f39659b.m36520o(this);
                do {
                } while (this.f39659b.m36519l(false, this));
                enumC8476b2 = EnumC8476b.NO_ERROR;
                enumC8476b = enumC8476b2;
            } catch (IOException e10) {
                e = e10;
                enumC8476b = enumC8476b3;
            } catch (Throwable th3) {
                enumC8476b = enumC8476b3;
                th2 = th3;
                this.f39660c.m36452F0(enumC8476b, enumC8476b3, iOException);
                C5634b.m27790j(this.f39659b);
                throw th2;
            }
            try {
                try {
                    this.f39660c.m36452F0(enumC8476b2, EnumC8476b.CANCEL, null);
                } catch (Throwable th4) {
                    th2 = th4;
                    iOException = iOException2;
                    this.f39660c.m36452F0(enumC8476b, enumC8476b3, iOException);
                    C5634b.m27790j(this.f39659b);
                    throw th2;
                }
            } catch (IOException e11) {
                e = e11;
                enumC8476b = enumC8476b2;
                iOException2 = e;
                EnumC8476b enumC8476b4 = EnumC8476b.PROTOCOL_ERROR;
                this.f39660c.m36452F0(enumC8476b4, enumC8476b4, e);
                C5634b.m27790j(this.f39659b);
            }
            C5634b.m27790j(this.f39659b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/f$f.class
     */
    /* renamed from: ri.f$f */
    /* loaded from: combined.jar:classes2.jar:ri/f$f.class */
    public static final class f extends AbstractC6794a {

        /* renamed from: e */
        public final String f39687e;

        /* renamed from: f */
        public final boolean f39688f;

        /* renamed from: g */
        public final C8480f f39689g;

        /* renamed from: h */
        public final int f39690h;

        /* renamed from: i */
        public final C9761e f39691i;

        /* renamed from: j */
        public final int f39692j;

        /* renamed from: k */
        public final boolean f39693k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z10, String str2, boolean z11, C8480f c8480f, int i10, C9761e c9761e, int i11, boolean z12) {
            super(str2, z11);
            this.f39687e = str;
            this.f39688f = z10;
            this.f39689g = c8480f;
            this.f39690h = i10;
            this.f39691i = c9761e;
            this.f39692j = i11;
            this.f39693k = z12;
        }

        @Override // ni.AbstractC6794a
        /* renamed from: f */
        public long mo31315f() {
            try {
                boolean mo36602a = this.f39689g.f39631m.mo36602a(this.f39690h, this.f39691i, this.f39692j, this.f39693k);
                if (mo36602a) {
                    this.f39689g.m36464R0().m36592t(this.f39690h, EnumC8476b.CANCEL);
                }
                if (!mo36602a && !this.f39693k) {
                    return -1L;
                }
                synchronized (this.f39689g) {
                    this.f39689g.f39619C.remove(Integer.valueOf(this.f39690h));
                }
                return -1L;
            } catch (IOException e10) {
                return -1L;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/f$g.class
     */
    /* renamed from: ri.f$g */
    /* loaded from: combined.jar:classes2.jar:ri/f$g.class */
    public static final class g extends AbstractC6794a {

        /* renamed from: e */
        public final String f39694e;

        /* renamed from: f */
        public final boolean f39695f;

        /* renamed from: g */
        public final C8480f f39696g;

        /* renamed from: h */
        public final int f39697h;

        /* renamed from: i */
        public final List f39698i;

        /* renamed from: j */
        public final boolean f39699j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z10, String str2, boolean z11, C8480f c8480f, int i10, List list, boolean z12) {
            super(str2, z11);
            this.f39694e = str;
            this.f39695f = z10;
            this.f39696g = c8480f;
            this.f39697h = i10;
            this.f39698i = list;
            this.f39699j = z12;
        }

        @Override // ni.AbstractC6794a
        /* renamed from: f */
        public long mo31315f() {
            boolean mo36604c = this.f39696g.f39631m.mo36604c(this.f39697h, this.f39698i, this.f39699j);
            if (mo36604c) {
                try {
                    this.f39696g.m36464R0().m36592t(this.f39697h, EnumC8476b.CANCEL);
                } catch (IOException e10) {
                    return -1L;
                }
            }
            if (!mo36604c && !this.f39699j) {
                return -1L;
            }
            synchronized (this.f39696g) {
                this.f39696g.f39619C.remove(Integer.valueOf(this.f39697h));
            }
            return -1L;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/f$h.class
     */
    /* renamed from: ri.f$h */
    /* loaded from: combined.jar:classes2.jar:ri/f$h.class */
    public static final class h extends AbstractC6794a {

        /* renamed from: e */
        public final String f39700e;

        /* renamed from: f */
        public final boolean f39701f;

        /* renamed from: g */
        public final C8480f f39702g;

        /* renamed from: h */
        public final int f39703h;

        /* renamed from: i */
        public final List f39704i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, String str2, boolean z11, C8480f c8480f, int i10, List list) {
            super(str2, z11);
            this.f39700e = str;
            this.f39701f = z10;
            this.f39702g = c8480f;
            this.f39703h = i10;
            this.f39704i = list;
        }

        @Override // ni.AbstractC6794a
        /* renamed from: f */
        public long mo31315f() {
            if (!this.f39702g.f39631m.mo36603b(this.f39703h, this.f39704i)) {
                return -1L;
            }
            try {
                this.f39702g.m36464R0().m36592t(this.f39703h, EnumC8476b.CANCEL);
                synchronized (this.f39702g) {
                    this.f39702g.f39619C.remove(Integer.valueOf(this.f39703h));
                }
                return -1L;
            } catch (IOException e10) {
                return -1L;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/f$i.class
     */
    /* renamed from: ri.f$i */
    /* loaded from: combined.jar:classes2.jar:ri/f$i.class */
    public static final class i extends AbstractC6794a {

        /* renamed from: e */
        public final String f39705e;

        /* renamed from: f */
        public final boolean f39706f;

        /* renamed from: g */
        public final C8480f f39707g;

        /* renamed from: h */
        public final int f39708h;

        /* renamed from: i */
        public final EnumC8476b f39709i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z10, String str2, boolean z11, C8480f c8480f, int i10, EnumC8476b enumC8476b) {
            super(str2, z11);
            this.f39705e = str;
            this.f39706f = z10;
            this.f39707g = c8480f;
            this.f39708h = i10;
            this.f39709i = enumC8476b;
        }

        @Override // ni.AbstractC6794a
        /* renamed from: f */
        public long mo31315f() {
            this.f39707g.f39631m.mo36605d(this.f39708h, this.f39709i);
            synchronized (this.f39707g) {
                this.f39707g.f39619C.remove(Integer.valueOf(this.f39708h));
                C5398q c5398q = C5398q.f30770a;
            }
            return -1L;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/f$j.class
     */
    /* renamed from: ri.f$j */
    /* loaded from: combined.jar:classes2.jar:ri/f$j.class */
    public static final class j extends AbstractC6794a {

        /* renamed from: e */
        public final String f39710e;

        /* renamed from: f */
        public final boolean f39711f;

        /* renamed from: g */
        public final C8480f f39712g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, boolean z10, String str2, boolean z11, C8480f c8480f) {
            super(str2, z11);
            this.f39710e = str;
            this.f39711f = z10;
            this.f39712g = c8480f;
        }

        @Override // ni.AbstractC6794a
        /* renamed from: f */
        public long mo31315f() {
            this.f39712g.m36482k1(false, 2, 0);
            return -1L;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/f$k.class
     */
    /* renamed from: ri.f$k */
    /* loaded from: combined.jar:classes2.jar:ri/f$k.class */
    public static final class k extends AbstractC6794a {

        /* renamed from: e */
        public final String f39713e;

        /* renamed from: f */
        public final boolean f39714f;

        /* renamed from: g */
        public final C8480f f39715g;

        /* renamed from: h */
        public final int f39716h;

        /* renamed from: i */
        public final EnumC8476b f39717i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z10, String str2, boolean z11, C8480f c8480f, int i10, EnumC8476b enumC8476b) {
            super(str2, z11);
            this.f39713e = str;
            this.f39714f = z10;
            this.f39715g = c8480f;
            this.f39716h = i10;
            this.f39717i = enumC8476b;
        }

        @Override // ni.AbstractC6794a
        /* renamed from: f */
        public long mo31315f() {
            try {
                this.f39715g.m36483l1(this.f39716h, this.f39717i);
                return -1L;
            } catch (IOException e10) {
                this.f39715g.m36453G0(e10);
                return -1L;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/f$l.class
     */
    /* renamed from: ri.f$l */
    /* loaded from: combined.jar:classes2.jar:ri/f$l.class */
    public static final class l extends AbstractC6794a {

        /* renamed from: e */
        public final String f39718e;

        /* renamed from: f */
        public final boolean f39719f;

        /* renamed from: g */
        public final C8480f f39720g;

        /* renamed from: h */
        public final int f39721h;

        /* renamed from: i */
        public final long f39722i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z10, String str2, boolean z11, C8480f c8480f, int i10, long j10) {
            super(str2, z11);
            this.f39718e = str;
            this.f39719f = z10;
            this.f39720g = c8480f;
            this.f39721h = i10;
            this.f39722i = j10;
        }

        @Override // ni.AbstractC6794a
        /* renamed from: f */
        public long mo31315f() {
            try {
                this.f39720g.m36464R0().m36582a(this.f39721h, this.f39722i);
                return -1L;
            } catch (IOException e10) {
                this.f39720g.m36453G0(e10);
                return -1L;
            }
        }
    }

    static {
        C8487m c8487m = new C8487m();
        c8487m.m36613h(7, CharacterReader.EOF);
        c8487m.m36613h(5, 16384);
        f39615D = c8487m;
    }

    public C8480f(@NotNull b bVar) {
        C9367f.m39526e(bVar, "builder");
        boolean m36487b = bVar.m36487b();
        this.f39620b = m36487b;
        this.f39621c = bVar.m36489d();
        this.f39622d = new LinkedHashMap();
        String m36488c = bVar.m36488c();
        this.f39623e = m36488c;
        this.f39625g = bVar.m36487b() ? 3 : 2;
        C6798e m36495j = bVar.m36495j();
        this.f39627i = m36495j;
        C6797d m31342i = m36495j.m31342i();
        this.f39628j = m31342i;
        this.f39629k = m36495j.m31342i();
        this.f39630l = m36495j.m31342i();
        this.f39631m = bVar.m36491f();
        C8487m c8487m = new C8487m();
        if (bVar.m36487b()) {
            c8487m.m36613h(7, 16777216);
        }
        C5398q c5398q = C5398q.f30770a;
        this.f39638t = c8487m;
        this.f39639u = f39615D;
        this.f39643y = r0.m36608c();
        this.f39644z = bVar.m36493h();
        this.f39617A = new C8484j(bVar.m36492g(), m36487b);
        this.f39618B = new e(this, new C8482h(bVar.m36494i(), m36487b));
        this.f39619C = new LinkedHashSet();
        if (bVar.m36490e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(bVar.m36490e());
            String str = m36488c + " ping";
            m31342i.m31329i(new a(str, str, this, nanos), nanos);
        }
    }

    /* renamed from: g1 */
    public static /* synthetic */ void m36440g1(C8480f c8480f, boolean z10, C6798e c6798e, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            c6798e = C6798e.f35432h;
        }
        c8480f.m36478f1(z10, c6798e);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:37:0x0105
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* renamed from: F0 */
    public final void m36452F0(@org.jetbrains.annotations.NotNull p312ri.EnumC8476b r5, @org.jetbrains.annotations.NotNull p312ri.EnumC8476b r6, @org.jetbrains.annotations.Nullable java.io.IOException r7) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p312ri.C8480f.m36452F0(ri.b, ri.b, java.io.IOException):void");
    }

    /* renamed from: G0 */
    public final void m36453G0(IOException iOException) {
        EnumC8476b enumC8476b = EnumC8476b.PROTOCOL_ERROR;
        m36452F0(enumC8476b, enumC8476b, iOException);
    }

    /* renamed from: H0 */
    public final boolean m36454H0() {
        return this.f39620b;
    }

    @NotNull
    /* renamed from: I0 */
    public final String m36455I0() {
        return this.f39623e;
    }

    /* renamed from: J0 */
    public final int m36456J0() {
        return this.f39624f;
    }

    @NotNull
    /* renamed from: K0 */
    public final d m36457K0() {
        return this.f39621c;
    }

    /* renamed from: L0 */
    public final int m36458L0() {
        return this.f39625g;
    }

    @NotNull
    /* renamed from: M0 */
    public final C8487m m36459M0() {
        return this.f39638t;
    }

    @NotNull
    /* renamed from: N0 */
    public final C8487m m36460N0() {
        return this.f39639u;
    }

    @Nullable
    /* renamed from: O0 */
    public final C8483i m36461O0(int i10) {
        C8483i c8483i;
        synchronized (this) {
            c8483i = this.f39622d.get(Integer.valueOf(i10));
        }
        return c8483i;
    }

    @NotNull
    /* renamed from: P0 */
    public final Map<Integer, C8483i> m36462P0() {
        return this.f39622d;
    }

    /* renamed from: Q0 */
    public final long m36463Q0() {
        return this.f39643y;
    }

    @NotNull
    /* renamed from: R0 */
    public final C8484j m36464R0() {
        return this.f39617A;
    }

    /* renamed from: S0 */
    public final boolean m36465S0(long j10) {
        synchronized (this) {
            if (this.f39626h) {
                return false;
            }
            if (this.f39635q < this.f39634p) {
                if (j10 >= this.f39637s) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0079 A[Catch: all -> 0x00e4, TryCatch #0 {, blocks: (B:8:0x0011, B:10:0x001a, B:12:0x0022, B:14:0x0028, B:16:0x004b, B:18:0x0057, B:22:0x0071, B:24:0x0079, B:25:0x008a, B:25:0x008a, B:46:0x00da, B:47:0x00dd, B:48:0x00e3), top: B:7:0x0011, outer: #1 }] */
    /* renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p312ri.C8483i m36466T0(int r8, java.util.List<p312ri.C8477c> r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p312ri.C8480f.m36466T0(int, java.util.List, boolean):ri.i");
    }

    @NotNull
    /* renamed from: U0 */
    public final C8483i m36467U0(@NotNull List<C8477c> list, boolean z10) {
        C9367f.m39526e(list, "requestHeaders");
        return m36466T0(0, list, z10);
    }

    /* renamed from: V0 */
    public final void m36468V0(int i10, @NotNull InterfaceC9763g interfaceC9763g, int i11, boolean z10) {
        C9367f.m39526e(interfaceC9763g, "source");
        C9761e c9761e = new C9761e();
        long j10 = i11;
        interfaceC9763g.mo41151b0(j10);
        interfaceC9763g.mo22901x(c9761e, j10);
        C6797d c6797d = this.f39629k;
        String str = this.f39623e + '[' + i10 + "] onData";
        c6797d.m31329i(new f(str, true, str, true, this, i10, c9761e, i11, z10), 0L);
    }

    /* renamed from: W0 */
    public final void m36469W0(int i10, @NotNull List<C8477c> list, boolean z10) {
        C9367f.m39526e(list, "requestHeaders");
        C6797d c6797d = this.f39629k;
        String str = this.f39623e + '[' + i10 + "] onHeaders";
        c6797d.m31329i(new g(str, true, str, true, this, i10, list, z10), 0L);
    }

    /* renamed from: X0 */
    public final void m36470X0(int i10, @NotNull List<C8477c> list) {
        C9367f.m39526e(list, "requestHeaders");
        synchronized (this) {
            if (this.f39619C.contains(Integer.valueOf(i10))) {
                m36484m1(i10, EnumC8476b.PROTOCOL_ERROR);
                return;
            }
            this.f39619C.add(Integer.valueOf(i10));
            C6797d c6797d = this.f39629k;
            String str = this.f39623e + '[' + i10 + "] onRequest";
            c6797d.m31329i(new h(str, true, str, true, this, i10, list), 0L);
        }
    }

    /* renamed from: Y0 */
    public final void m36471Y0(int i10, @NotNull EnumC8476b enumC8476b) {
        C9367f.m39526e(enumC8476b, "errorCode");
        C6797d c6797d = this.f39629k;
        String str = this.f39623e + '[' + i10 + "] onReset";
        c6797d.m31329i(new i(str, true, str, true, this, i10, enumC8476b), 0L);
    }

    /* renamed from: Z0 */
    public final boolean m36472Z0(int i10) {
        boolean z10 = true;
        if (i10 == 0 || (i10 & 1) != 0) {
            z10 = false;
        }
        return z10;
    }

    @Nullable
    /* renamed from: a1 */
    public final C8483i m36473a1(int i10) {
        C8483i remove;
        synchronized (this) {
            remove = this.f39622d.remove(Integer.valueOf(i10));
            notifyAll();
        }
        return remove;
    }

    /* renamed from: b1 */
    public final void m36474b1() {
        synchronized (this) {
            long j10 = this.f39635q;
            long j11 = this.f39634p;
            if (j10 < j11) {
                return;
            }
            this.f39634p = j11 + 1;
            this.f39637s = System.nanoTime() + 1000000000;
            C5398q c5398q = C5398q.f30770a;
            C6797d c6797d = this.f39628j;
            String str = this.f39623e + " ping";
            c6797d.m31329i(new j(str, true, str, true, this), 0L);
        }
    }

    /* renamed from: c1 */
    public final void m36475c1(int i10) {
        this.f39624f = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m36452F0(EnumC8476b.NO_ERROR, EnumC8476b.CANCEL, null);
    }

    /* renamed from: d1 */
    public final void m36476d1(@NotNull C8487m c8487m) {
        C9367f.m39526e(c8487m, "<set-?>");
        this.f39639u = c8487m;
    }

    /* renamed from: e1 */
    public final void m36477e1(@NotNull EnumC8476b enumC8476b) {
        C9367f.m39526e(enumC8476b, "statusCode");
        synchronized (this.f39617A) {
            synchronized (this) {
                if (this.f39626h) {
                    return;
                }
                this.f39626h = true;
                int i10 = this.f39624f;
                C5398q c5398q = C5398q.f30770a;
                this.f39617A.m36590p(i10, enumC8476b, C5634b.f31704a);
            }
        }
    }

    /* renamed from: f1 */
    public final void m36478f1(boolean z10, @NotNull C6798e c6798e) {
        C9367f.m39526e(c6798e, "taskRunner");
        if (z10) {
            this.f39617A.m36581J();
            this.f39617A.m36593v(this.f39638t);
            if (this.f39638t.m36608c() != 65535) {
                this.f39617A.m36582a(0, r0 - CharacterReader.EOF);
            }
        }
        C6797d m31342i = c6798e.m31342i();
        String str = this.f39623e;
        m31342i.m31329i(new C6796c(this.f39618B, str, true, str, true), 0L);
    }

    public final void flush() {
        this.f39617A.flush();
    }

    /* renamed from: h1 */
    public final void m36479h1(long j10) {
        synchronized (this) {
            long j11 = this.f39640v + j10;
            this.f39640v = j11;
            long j12 = j11 - this.f39641w;
            if (j12 >= this.f39638t.m36608c() / 2) {
                m36485n1(0, j12);
                this.f39641w += j12;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r0 = java.lang.Math.min((int) java.lang.Math.min(r15, r0 - r0), r7.f39617A.m36583a0());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        r7.f39642x += r0;
        r0 = p172jh.C5398q.f30770a;
     */
    /* renamed from: i1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m36480i1(int r8, boolean r9, @org.jetbrains.annotations.Nullable p411xi.C9761e r10, long r11) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p312ri.C8480f.m36480i1(int, boolean, xi.e, long):void");
    }

    /* renamed from: j1 */
    public final void m36481j1(int i10, boolean z10, @NotNull List<C8477c> list) {
        C9367f.m39526e(list, "alternating");
        this.f39617A.m36591q(z10, i10, list);
    }

    /* renamed from: k1 */
    public final void m36482k1(boolean z10, int i10, int i11) {
        try {
            this.f39617A.m36585c(z10, i10, i11);
        } catch (IOException e10) {
            m36453G0(e10);
        }
    }

    /* renamed from: l1 */
    public final void m36483l1(int i10, @NotNull EnumC8476b enumC8476b) {
        C9367f.m39526e(enumC8476b, "statusCode");
        this.f39617A.m36592t(i10, enumC8476b);
    }

    /* renamed from: m1 */
    public final void m36484m1(int i10, @NotNull EnumC8476b enumC8476b) {
        C9367f.m39526e(enumC8476b, "errorCode");
        C6797d c6797d = this.f39628j;
        String str = this.f39623e + '[' + i10 + "] writeSynReset";
        c6797d.m31329i(new k(str, true, str, true, this, i10, enumC8476b), 0L);
    }

    /* renamed from: n1 */
    public final void m36485n1(int i10, long j10) {
        C6797d c6797d = this.f39628j;
        String str = this.f39623e + '[' + i10 + "] windowUpdate";
        c6797d.m31329i(new l(str, true, str, true, this, i10, j10), 0L);
    }
}
