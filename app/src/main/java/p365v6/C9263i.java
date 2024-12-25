package p365v6;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p027b9.C0865w;
import p027b9.InterfaceC0837d0;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4400z;
import p059d9.C4401z0;
import p099fc.AbstractC4834t;
import p099fc.AbstractC4841w0;
import p099fc.AbstractC4842x;
import p099fc.C4833s0;
import p267p6.C7583h;
import p267p6.C7629w0;
import p365v6.C9261h;
import p365v6.C9263i;
import p365v6.C9273n;
import p365v6.InterfaceC9260g0;
import p365v6.InterfaceC9277p;
import p365v6.InterfaceC9290x;
import p365v6.InterfaceC9292z;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v6/i.class
 */
/* renamed from: v6.i */
/* loaded from: combined.jar:classes2.jar:v6/i.class */
public class C9263i implements InterfaceC9292z {

    /* renamed from: c */
    public final UUID f42296c;

    /* renamed from: d */
    public final InterfaceC9260g0.c f42297d;

    /* renamed from: e */
    public final InterfaceC9276o0 f42298e;

    /* renamed from: f */
    public final HashMap<String, String> f42299f;

    /* renamed from: g */
    public final boolean f42300g;

    /* renamed from: h */
    public final int[] f42301h;

    /* renamed from: i */
    public final boolean f42302i;

    /* renamed from: j */
    public final g f42303j;

    /* renamed from: k */
    public final InterfaceC0837d0 f42304k;

    /* renamed from: l */
    public final h f42305l;

    /* renamed from: m */
    public final long f42306m;

    /* renamed from: n */
    public final List<C9261h> f42307n;

    /* renamed from: o */
    public final Set<f> f42308o;

    /* renamed from: p */
    public final Set<C9261h> f42309p;

    /* renamed from: q */
    public int f42310q;

    /* renamed from: r */
    public InterfaceC9260g0 f42311r;

    /* renamed from: s */
    public C9261h f42312s;

    /* renamed from: t */
    public C9261h f42313t;

    /* renamed from: u */
    public Looper f42314u;

    /* renamed from: v */
    public Handler f42315v;

    /* renamed from: w */
    public int f42316w;

    /* renamed from: x */
    public byte[] f42317x;

    /* renamed from: y */
    public volatile d f42318y;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/i$b.class
     */
    /* renamed from: v6.i$b */
    /* loaded from: combined.jar:classes2.jar:v6/i$b.class */
    public static final class b {

        /* renamed from: d */
        public boolean f42322d;

        /* renamed from: f */
        public boolean f42324f;

        /* renamed from: a */
        public final HashMap<String, String> f42319a = new HashMap<>();

        /* renamed from: b */
        public UUID f42320b = C7583h.f36779d;

        /* renamed from: c */
        public InterfaceC9260g0.c f42321c = C9270l0.f42343d;

        /* renamed from: g */
        public InterfaceC0837d0 f42325g = new C0865w();

        /* renamed from: e */
        public int[] f42323e = new int[0];

        /* renamed from: h */
        public long f42326h = 300000;

        /* renamed from: a */
        public C9263i m39098a(InterfaceC9276o0 interfaceC9276o0) {
            return new C9263i(this.f42320b, this.f42321c, interfaceC9276o0, this.f42319a, this.f42322d, this.f42323e, this.f42324f, this.f42325g, this.f42326h);
        }

        /* renamed from: b */
        public b m39099b(Map<String, String> map) {
            this.f42319a.clear();
            if (map != null) {
                this.f42319a.putAll(map);
            }
            return this;
        }

        /* renamed from: c */
        public b m39100c(boolean z10) {
            this.f42322d = z10;
            return this;
        }

        /* renamed from: d */
        public b m39101d(boolean z10) {
            this.f42324f = z10;
            return this;
        }

        /* renamed from: e */
        public b m39102e(int... iArr) {
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArr[i10];
                boolean z10 = true;
                if (i11 != 2) {
                    z10 = i11 == 1;
                }
                C4349a.m21878a(z10);
            }
            this.f42323e = (int[]) iArr.clone();
            return this;
        }

        /* renamed from: f */
        public b m39103f(UUID uuid, InterfaceC9260g0.c cVar) {
            this.f42320b = (UUID) C4349a.m21882e(uuid);
            this.f42321c = (InterfaceC9260g0.c) C4349a.m21882e(cVar);
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/i$c.class
     */
    /* renamed from: v6.i$c */
    /* loaded from: combined.jar:classes2.jar:v6/i$c.class */
    public class c implements InterfaceC9260g0.b {

        /* renamed from: a */
        public final C9263i f42327a;

        public c(C9263i c9263i) {
            this.f42327a = c9263i;
        }

        @Override // p365v6.InterfaceC9260g0.b
        /* renamed from: a */
        public void mo39032a(InterfaceC9260g0 interfaceC9260g0, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) C4349a.m21882e(this.f42327a.f42318y)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/i$d.class
     */
    @SuppressLint({"HandlerLeak"})
    /* renamed from: v6.i$d */
    /* loaded from: combined.jar:classes2.jar:v6/i$d.class */
    public class d extends Handler {

        /* renamed from: a */
        public final C9263i f42328a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C9263i c9263i, Looper looper) {
            super(looper);
            this.f42328a = c9263i;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (C9261h c9261h : this.f42328a.f42307n) {
                if (c9261h.m39051p(bArr)) {
                    c9261h.m39057x(message.what);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/i$e.class
     */
    /* renamed from: v6.i$e */
    /* loaded from: combined.jar:classes2.jar:v6/i$e.class */
    public static final class e extends Exception {
        public e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/i$f.class
     */
    /* renamed from: v6.i$f */
    /* loaded from: combined.jar:classes2.jar:v6/i$f.class */
    public class f implements InterfaceC9292z.b {

        /* renamed from: b */
        public final InterfaceC9290x.a f42329b;

        /* renamed from: c */
        public InterfaceC9277p f42330c;

        /* renamed from: d */
        public boolean f42331d;

        /* renamed from: e */
        public final C9263i f42332e;

        public f(C9263i c9263i, InterfaceC9290x.a aVar) {
            this.f42332e = c9263i;
            this.f42329b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m39106d(C7629w0 c7629w0) {
            if (this.f42332e.f42310q == 0 || this.f42331d) {
                return;
            }
            C9263i c9263i = this.f42332e;
            this.f42330c = c9263i.m39091r((Looper) C4349a.m21882e(c9263i.f42314u), this.f42329b, c7629w0, false);
            this.f42332e.f42308o.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m39107e() {
            if (this.f42331d) {
                return;
            }
            InterfaceC9277p interfaceC9277p = this.f42330c;
            if (interfaceC9277p != null) {
                interfaceC9277p.mo39028f(this.f42329b);
            }
            this.f42332e.f42308o.remove(this);
            this.f42331d = true;
        }

        /* renamed from: c */
        public void m39108c(final C7629w0 c7629w0) {
            ((Handler) C4349a.m21882e(this.f42332e.f42315v)).post(new Runnable(this, c7629w0) { // from class: v6.k

                /* renamed from: b */
                public final C9263i.f f42338b;

                /* renamed from: c */
                public final C7629w0 f42339c;

                {
                    this.f42338b = this;
                    this.f42339c = c7629w0;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f42338b.m39106d(this.f42339c);
                }
            });
        }

        @Override // p365v6.InterfaceC9292z.b
        public void release() {
            C4401z0.m22336L0((Handler) C4349a.m21882e(this.f42332e.f42315v), new Runnable(this) { // from class: v6.j

                /* renamed from: b */
                public final C9263i.f f42337b;

                {
                    this.f42337b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f42337b.m39107e();
                }
            });
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/i$g.class
     */
    /* renamed from: v6.i$g */
    /* loaded from: combined.jar:classes2.jar:v6/i$g.class */
    public class g implements C9261h.a {

        /* renamed from: a */
        public final Set<C9261h> f42333a = new HashSet();

        /* renamed from: b */
        public C9261h f42334b;

        /* renamed from: c */
        public final C9263i f42335c;

        public g(C9263i c9263i) {
            this.f42335c = c9263i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p365v6.C9261h.a
        /* renamed from: a */
        public void mo39060a(Exception exc, boolean z10) {
            this.f42334b = null;
            AbstractC4834t m24538A = AbstractC4834t.m24538A(this.f42333a);
            this.f42333a.clear();
            AbstractC4841w0 it = m24538A.iterator();
            while (it.hasNext()) {
                ((C9261h) it.next()).m39059z(exc, z10);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p365v6.C9261h.a
        /* renamed from: b */
        public void mo39061b() {
            this.f42334b = null;
            AbstractC4834t m24538A = AbstractC4834t.m24538A(this.f42333a);
            this.f42333a.clear();
            AbstractC4841w0 it = m24538A.iterator();
            while (it.hasNext()) {
                ((C9261h) it.next()).m39058y();
            }
        }

        @Override // p365v6.C9261h.a
        /* renamed from: c */
        public void mo39062c(C9261h c9261h) {
            this.f42333a.add(c9261h);
            if (this.f42334b != null) {
                return;
            }
            this.f42334b = c9261h;
            c9261h.m39046D();
        }

        /* renamed from: d */
        public void m39109d(C9261h c9261h) {
            this.f42333a.remove(c9261h);
            if (this.f42334b == c9261h) {
                this.f42334b = null;
                if (this.f42333a.isEmpty()) {
                    return;
                }
                C9261h next = this.f42333a.iterator().next();
                this.f42334b = next;
                next.m39046D();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/i$h.class
     */
    /* renamed from: v6.i$h */
    /* loaded from: combined.jar:classes2.jar:v6/i$h.class */
    public class h implements C9261h.b {

        /* renamed from: a */
        public final C9263i f42336a;

        public h(C9263i c9263i) {
            this.f42336a = c9263i;
        }

        @Override // p365v6.C9261h.b
        /* renamed from: a */
        public void mo39063a(final C9261h c9261h, int i10) {
            if (i10 == 1 && this.f42336a.f42310q > 0 && this.f42336a.f42306m != -9223372036854775807L) {
                this.f42336a.f42309p.add(c9261h);
                ((Handler) C4349a.m21882e(this.f42336a.f42315v)).postAtTime(new Runnable(c9261h) { // from class: v6.l

                    /* renamed from: b */
                    public final C9261h f42342b;

                    {
                        this.f42342b = c9261h;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f42342b.mo39028f(null);
                    }
                }, c9261h, SystemClock.uptimeMillis() + this.f42336a.f42306m);
            } else if (i10 == 0) {
                this.f42336a.f42307n.remove(c9261h);
                if (this.f42336a.f42312s == c9261h) {
                    this.f42336a.f42312s = null;
                }
                if (this.f42336a.f42313t == c9261h) {
                    this.f42336a.f42313t = null;
                }
                this.f42336a.f42303j.m39109d(c9261h);
                if (this.f42336a.f42306m != -9223372036854775807L) {
                    ((Handler) C4349a.m21882e(this.f42336a.f42315v)).removeCallbacksAndMessages(c9261h);
                    this.f42336a.f42309p.remove(c9261h);
                }
            }
            this.f42336a.m39084A();
        }

        @Override // p365v6.C9261h.b
        /* renamed from: b */
        public void mo39064b(C9261h c9261h, int i10) {
            if (this.f42336a.f42306m != -9223372036854775807L) {
                this.f42336a.f42309p.remove(c9261h);
                ((Handler) C4349a.m21882e(this.f42336a.f42315v)).removeCallbacksAndMessages(c9261h);
            }
        }
    }

    public C9263i(UUID uuid, InterfaceC9260g0.c cVar, InterfaceC9276o0 interfaceC9276o0, HashMap<String, String> hashMap, boolean z10, int[] iArr, boolean z11, InterfaceC0837d0 interfaceC0837d0, long j10) {
        C4349a.m21882e(uuid);
        C4349a.m21879b(!C7583h.f36777b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f42296c = uuid;
        this.f42297d = cVar;
        this.f42298e = interfaceC9276o0;
        this.f42299f = hashMap;
        this.f42300g = z10;
        this.f42301h = iArr;
        this.f42302i = z11;
        this.f42304k = interfaceC0837d0;
        this.f42303j = new g(this);
        this.f42305l = new h();
        this.f42316w = 0;
        this.f42307n = new ArrayList();
        this.f42308o = C4833s0.m24534f();
        this.f42309p = C4833s0.m24534f();
        this.f42306m = j10;
    }

    /* renamed from: s */
    public static boolean m39082s(InterfaceC9277p interfaceC9277p) {
        boolean z10;
        if (interfaceC9277p.getState() == 1) {
            z10 = true;
            if (C4401z0.f26679a >= 19) {
                if (((InterfaceC9277p.a) C4349a.m21882e(interfaceC9277p.getError())).getCause() instanceof ResourceBusyException) {
                    z10 = true;
                }
            }
            return z10;
        }
        z10 = false;
        return z10;
    }

    /* renamed from: w */
    public static List<C9273n.b> m39083w(C9273n c9273n, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(c9273n.f42359e);
        for (int i10 = 0; i10 < c9273n.f42359e; i10++) {
            C9273n.b m39139l = c9273n.m39139l(i10);
            if ((m39139l.m39146k(uuid) || (C7583h.f36778c.equals(uuid) && m39139l.m39146k(C7583h.f36777b))) && (m39139l.f42364f != null || z10)) {
                arrayList.add(m39139l);
            }
        }
        return arrayList;
    }

    /* renamed from: A */
    public final void m39084A() {
        if (this.f42311r != null && this.f42310q == 0 && this.f42307n.isEmpty() && this.f42308o.isEmpty()) {
            ((InterfaceC9260g0) C4349a.m21882e(this.f42311r)).release();
            this.f42311r = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public final void m39085B() {
        AbstractC4841w0 it = AbstractC4842x.m24599x(this.f42308o).iterator();
        while (it.hasNext()) {
            ((f) it.next()).release();
        }
    }

    /* renamed from: C */
    public void m39086C(int i10, byte[] bArr) {
        C4349a.m21884g(this.f42307n.isEmpty());
        if (i10 == 1 || i10 == 3) {
            C4349a.m21882e(bArr);
        }
        this.f42316w = i10;
        this.f42317x = bArr;
    }

    /* renamed from: D */
    public final void m39087D(InterfaceC9277p interfaceC9277p, InterfaceC9290x.a aVar) {
        interfaceC9277p.mo39028f(aVar);
        if (this.f42306m != -9223372036854775807L) {
            interfaceC9277p.mo39028f(null);
        }
    }

    @Override // p365v6.InterfaceC9292z
    /* renamed from: a */
    public Class<? extends ExoMediaCrypto> mo39088a(C7629w0 c7629w0) {
        Class<? extends ExoMediaCrypto> mo39012a = ((InterfaceC9260g0) C4349a.m21882e(this.f42311r)).mo39012a();
        C9273n c9273n = c7629w0.f37089p;
        if (c9273n != null) {
            if (!m39092t(c9273n)) {
                mo39012a = C9284s0.class;
            }
            return mo39012a;
        }
        if (C4401z0.m22422y0(this.f42301h, C4400z.m22304l(c7629w0.f37086m)) == -1) {
            mo39012a = null;
        }
        return mo39012a;
    }

    @Override // p365v6.InterfaceC9292z
    /* renamed from: b */
    public InterfaceC9292z.b mo39089b(Looper looper, InterfaceC9290x.a aVar, C7629w0 c7629w0) {
        C4349a.m21884g(this.f42310q > 0);
        m39095x(looper);
        f fVar = new f(this, aVar);
        fVar.m39108c(c7629w0);
        return fVar;
    }

    @Override // p365v6.InterfaceC9292z
    /* renamed from: c */
    public InterfaceC9277p mo39090c(Looper looper, InterfaceC9290x.a aVar, C7629w0 c7629w0) {
        C4349a.m21884g(this.f42310q > 0);
        m39095x(looper);
        return m39091r(looper, aVar, c7629w0, true);
    }

    @Override // p365v6.InterfaceC9292z
    public final void prepare() {
        int i10 = this.f42310q;
        this.f42310q = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f42311r == null) {
            InterfaceC9260g0 mo39033a = this.f42297d.mo39033a(this.f42296c);
            this.f42311r = mo39033a;
            mo39033a.mo39018g(new c());
        } else if (this.f42306m != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f42307n.size(); i11++) {
                this.f42307n.get(i11).mo39023a(null);
            }
        }
    }

    /* renamed from: r */
    public final InterfaceC9277p m39091r(Looper looper, InterfaceC9290x.a aVar, C7629w0 c7629w0, boolean z10) {
        List<C9273n.b> list;
        C9261h c9261h;
        m39097z(looper);
        C9273n c9273n = c7629w0.f37089p;
        if (c9273n == null) {
            return m39096y(C4400z.m22304l(c7629w0.f37086m), z10);
        }
        if (this.f42317x == null) {
            List<C9273n.b> m39083w = m39083w((C9273n) C4349a.m21882e(c9273n), this.f42296c, false);
            list = m39083w;
            if (m39083w.isEmpty()) {
                e eVar = new e(this.f42296c);
                C4392v.m22271e("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.m39178l(eVar);
                }
                return new C9258f0(new InterfaceC9277p.a(eVar, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            list = null;
        }
        if (this.f42300g) {
            Iterator<C9261h> it = this.f42307n.iterator();
            do {
                c9261h = null;
                if (!it.hasNext()) {
                    break;
                }
                c9261h = it.next();
            } while (!C4401z0.m22371c(c9261h.f42261a, list));
        } else {
            c9261h = this.f42313t;
        }
        if (c9261h == null) {
            c9261h = m39094v(list, false, aVar, z10);
            if (!this.f42300g) {
                this.f42313t = c9261h;
            }
            this.f42307n.add(c9261h);
        } else {
            c9261h.mo39023a(aVar);
        }
        return c9261h;
    }

    @Override // p365v6.InterfaceC9292z
    public final void release() {
        int i10 = this.f42310q - 1;
        this.f42310q = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f42306m != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f42307n);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((C9261h) arrayList.get(i11)).mo39028f(null);
            }
        }
        m39085B();
        m39084A();
    }

    /* renamed from: t */
    public final boolean m39092t(C9273n c9273n) {
        boolean z10 = true;
        if (this.f42317x != null) {
            return true;
        }
        if (m39083w(c9273n, this.f42296c, true).isEmpty()) {
            if (c9273n.f42359e != 1 || !c9273n.m39139l(0).m39146k(C7583h.f36777b)) {
                return false;
            }
            C4392v.m22275i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f42296c);
        }
        String str = c9273n.f42358d;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if (!"cbcs".equals(str)) {
            return ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
        }
        if (C4401z0.f26679a < 25) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: u */
    public final C9261h m39093u(List<C9273n.b> list, boolean z10, InterfaceC9290x.a aVar) {
        C4349a.m21882e(this.f42311r);
        C9261h c9261h = new C9261h(this.f42296c, this.f42311r, this.f42303j, this.f42305l, list, this.f42316w, this.f42302i | z10, z10, this.f42317x, this.f42299f, this.f42298e, (Looper) C4349a.m21882e(this.f42314u), this.f42304k);
        c9261h.mo39023a(aVar);
        if (this.f42306m != -9223372036854775807L) {
            c9261h.mo39023a(null);
        }
        return c9261h;
    }

    /* renamed from: v */
    public final C9261h m39094v(List<C9273n.b> list, boolean z10, InterfaceC9290x.a aVar, boolean z11) {
        C9261h m39093u = m39093u(list, z10, aVar);
        C9261h c9261h = m39093u;
        if (m39082s(m39093u)) {
            c9261h = m39093u;
            if (!this.f42309p.isEmpty()) {
                AbstractC4841w0 it = AbstractC4842x.m24599x(this.f42309p).iterator();
                while (it.hasNext()) {
                    ((InterfaceC9277p) it.next()).mo39028f(null);
                }
                m39087D(m39093u, aVar);
                c9261h = m39093u(list, z10, aVar);
            }
        }
        C9261h c9261h2 = c9261h;
        if (m39082s(c9261h)) {
            c9261h2 = c9261h;
            if (z11) {
                c9261h2 = c9261h;
                if (!this.f42308o.isEmpty()) {
                    m39085B();
                    m39087D(c9261h, aVar);
                    c9261h2 = m39093u(list, z10, aVar);
                }
            }
        }
        return c9261h2;
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    /* renamed from: x */
    public final void m39095x(Looper looper) {
        synchronized (this) {
            Looper looper2 = this.f42314u;
            if (looper2 == null) {
                this.f42314u = looper;
                this.f42315v = new Handler(looper);
            } else {
                C4349a.m21884g(looper2 == looper);
                C4349a.m21882e(this.f42315v);
            }
        }
    }

    /* renamed from: y */
    public final InterfaceC9277p m39096y(int i10, boolean z10) {
        InterfaceC9260g0 interfaceC9260g0 = (InterfaceC9260g0) C4349a.m21882e(this.f42311r);
        if ((C9262h0.class.equals(interfaceC9260g0.mo39012a()) && C9262h0.f42292d) || C4401z0.m22422y0(this.f42301h, i10) == -1 || C9284s0.class.equals(interfaceC9260g0.mo39012a())) {
            return null;
        }
        C9261h c9261h = this.f42312s;
        if (c9261h == null) {
            C9261h m39094v = m39094v(AbstractC4834t.m24539E(), true, null, z10);
            this.f42307n.add(m39094v);
            this.f42312s = m39094v;
        } else {
            c9261h.mo39023a(null);
        }
        return this.f42312s;
    }

    /* renamed from: z */
    public final void m39097z(Looper looper) {
        if (this.f42318y == null) {
            this.f42318y = new d(this, looper);
        }
    }
}
