package p365v6;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p009a8.C0111o;
import p009a8.C0117r;
import p027b9.InterfaceC0837d0;
import p059d9.C4349a;
import p059d9.C4364h;
import p059d9.C4392v;
import p059d9.C4401z0;
import p059d9.InterfaceC4362g;
import p267p6.C7583h;
import p365v6.C9273n;
import p365v6.InterfaceC9260g0;
import p365v6.InterfaceC9277p;
import p365v6.InterfaceC9290x;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v6/h.class
 */
/* renamed from: v6.h */
/* loaded from: combined.jar:classes2.jar:v6/h.class */
public class C9261h implements InterfaceC9277p {

    /* renamed from: a */
    public final List<C9273n.b> f42261a;

    /* renamed from: b */
    public final InterfaceC9260g0 f42262b;

    /* renamed from: c */
    public final a f42263c;

    /* renamed from: d */
    public final b f42264d;

    /* renamed from: e */
    public final int f42265e;

    /* renamed from: f */
    public final boolean f42266f;

    /* renamed from: g */
    public final boolean f42267g;

    /* renamed from: h */
    public final HashMap<String, String> f42268h;

    /* renamed from: i */
    public final C4364h<InterfaceC9290x.a> f42269i;

    /* renamed from: j */
    public final InterfaceC0837d0 f42270j;

    /* renamed from: k */
    public final InterfaceC9276o0 f42271k;

    /* renamed from: l */
    public final UUID f42272l;

    /* renamed from: m */
    public final e f42273m;

    /* renamed from: n */
    public int f42274n;

    /* renamed from: o */
    public int f42275o;

    /* renamed from: p */
    public HandlerThread f42276p;

    /* renamed from: q */
    public c f42277q;

    /* renamed from: r */
    public ExoMediaCrypto f42278r;

    /* renamed from: s */
    public InterfaceC9277p.a f42279s;

    /* renamed from: t */
    public byte[] f42280t;

    /* renamed from: u */
    public byte[] f42281u;

    /* renamed from: v */
    public InterfaceC9260g0.a f42282v;

    /* renamed from: w */
    public InterfaceC9260g0.d f42283w;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/h$a.class
     */
    /* renamed from: v6.h$a */
    /* loaded from: combined.jar:classes2.jar:v6/h$a.class */
    public interface a {
        /* renamed from: a */
        void mo39060a(Exception exc, boolean z10);

        /* renamed from: b */
        void mo39061b();

        /* renamed from: c */
        void mo39062c(C9261h c9261h);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/h$b.class
     */
    /* renamed from: v6.h$b */
    /* loaded from: combined.jar:classes2.jar:v6/h$b.class */
    public interface b {
        /* renamed from: a */
        void mo39063a(C9261h c9261h, int i10);

        /* renamed from: b */
        void mo39064b(C9261h c9261h, int i10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/h$c.class
     */
    @SuppressLint({"HandlerLeak"})
    /* renamed from: v6.h$c */
    /* loaded from: combined.jar:classes2.jar:v6/h$c.class */
    public class c extends Handler {

        /* renamed from: a */
        public boolean f42284a;

        /* renamed from: b */
        public final C9261h f42285b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C9261h c9261h, Looper looper) {
            super(looper);
            this.f42285b = c9261h;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v36, types: [java.io.IOException] */
        /* renamed from: a */
        public final boolean m39065a(Message message, C9278p0 c9278p0) {
            d dVar = (d) message.obj;
            if (!dVar.f42287b) {
                return false;
            }
            int i10 = dVar.f42290e + 1;
            dVar.f42290e = i10;
            if (i10 > this.f42285b.f42270j.mo5311b(3)) {
                return false;
            }
            long mo5310a = this.f42285b.f42270j.mo5310a(new InterfaceC0837d0.c(new C0111o(dVar.f42286a, c9278p0.f42366b, c9278p0.f42367c, c9278p0.f42368d, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f42288c, c9278p0.f42369e), new C0117r(3), c9278p0.getCause() instanceof IOException ? (IOException) c9278p0.getCause() : new f(c9278p0.getCause()), dVar.f42290e));
            if (mo5310a == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f42284a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), mo5310a);
                return true;
            }
        }

        /* renamed from: b */
        public void m39066b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(C0111o.m525a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /* renamed from: c */
        public void m39067c() {
            synchronized (this) {
                removeCallbacksAndMessages(null);
                this.f42284a = true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v27, types: [byte[]] */
        /* JADX WARN: Type inference failed for: r0v36, types: [byte[]] */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    C9261h c9261h = this.f42285b;
                    e = c9261h.f42271k.mo39133b(c9261h.f42272l, (InterfaceC9260g0.d) dVar.f42289d);
                } else {
                    if (i10 != 1) {
                        throw new RuntimeException();
                    }
                    C9261h c9261h2 = this.f42285b;
                    e = c9261h2.f42271k.mo39132a(c9261h2.f42272l, (InterfaceC9260g0.a) dVar.f42289d);
                }
            } catch (C9278p0 e10) {
                e = e10;
                if (m39065a(message, e10)) {
                    return;
                }
            } catch (Exception e11) {
                e = e11;
                C4392v.m22276j("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e);
            }
            this.f42285b.f42270j.mo5313d(dVar.f42286a);
            synchronized (this) {
                if (!this.f42284a) {
                    this.f42285b.f42273m.obtainMessage(message.what, Pair.create(dVar.f42289d, e)).sendToTarget();
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/h$d.class
     */
    /* renamed from: v6.h$d */
    /* loaded from: combined.jar:classes2.jar:v6/h$d.class */
    public static final class d {

        /* renamed from: a */
        public final long f42286a;

        /* renamed from: b */
        public final boolean f42287b;

        /* renamed from: c */
        public final long f42288c;

        /* renamed from: d */
        public final Object f42289d;

        /* renamed from: e */
        public int f42290e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f42286a = j10;
            this.f42287b = z10;
            this.f42288c = j11;
            this.f42289d = obj;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/h$e.class
     */
    @SuppressLint({"HandlerLeak"})
    /* renamed from: v6.h$e */
    /* loaded from: combined.jar:classes2.jar:v6/h$e.class */
    public class e extends Handler {

        /* renamed from: a */
        public final C9261h f42291a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C9261h c9261h, Looper looper) {
            super(looper);
            this.f42291a = c9261h;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                this.f42291a.m39043A(obj, obj2);
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f42291a.m39054u(obj, obj2);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/h$f.class
     */
    /* renamed from: v6.h$f */
    /* loaded from: combined.jar:classes2.jar:v6/h$f.class */
    public static final class f extends IOException {
        public f(Throwable th2) {
            super(th2);
        }
    }

    public C9261h(UUID uuid, InterfaceC9260g0 interfaceC9260g0, a aVar, b bVar, List<C9273n.b> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> hashMap, InterfaceC9276o0 interfaceC9276o0, Looper looper, InterfaceC0837d0 interfaceC0837d0) {
        List<C9273n.b> unmodifiableList;
        if (i10 == 1 || i10 == 3) {
            C4349a.m21882e(bArr);
        }
        this.f42272l = uuid;
        this.f42263c = aVar;
        this.f42264d = bVar;
        this.f42262b = interfaceC9260g0;
        this.f42265e = i10;
        this.f42266f = z10;
        this.f42267g = z11;
        if (bArr != null) {
            this.f42281u = bArr;
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList((List) C4349a.m21882e(list));
        }
        this.f42261a = unmodifiableList;
        this.f42268h = hashMap;
        this.f42271k = interfaceC9276o0;
        this.f42269i = new C4364h<>();
        this.f42270j = interfaceC0837d0;
        this.f42274n = 2;
        this.f42273m = new e(this, looper);
    }

    /* renamed from: A */
    public final void m39043A(Object obj, Object obj2) {
        if (obj == this.f42283w) {
            if (this.f42274n == 2 || m39052q()) {
                this.f42283w = null;
                if (obj2 instanceof Exception) {
                    this.f42263c.mo39060a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f42262b.mo39019h((byte[]) obj2);
                    this.f42263c.mo39061b();
                } catch (Exception e10) {
                    this.f42263c.mo39060a(e10, true);
                }
            }
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* renamed from: B */
    public final boolean m39044B() {
        if (m39052q()) {
            return true;
        }
        try {
            byte[] mo39016e = this.f42262b.mo39016e();
            this.f42280t = mo39016e;
            this.f42278r = this.f42262b.mo39014c(mo39016e);
            this.f42274n = 3;
            final int i10 = 3;
            m39048m(new InterfaceC4362g(i10) { // from class: v6.e

                /* renamed from: a */
                public final int f42253a;

                {
                    this.f42253a = i10;
                }

                @Override // p059d9.InterfaceC4362g
                public final void accept(Object obj) {
                    ((InterfaceC9290x.a) obj).m39177k(this.f42253a);
                }
            });
            C4349a.m21882e(this.f42280t);
            return true;
        } catch (NotProvisionedException e10) {
            this.f42263c.mo39062c(this);
            return false;
        } catch (Exception e11) {
            m39053t(e11, 1);
            return false;
        }
    }

    /* renamed from: C */
    public final void m39045C(byte[] bArr, int i10, boolean z10) {
        try {
            this.f42282v = this.f42262b.mo39022k(bArr, this.f42261a, i10, this.f42268h);
            ((c) C4401z0.m22391j(this.f42277q)).m39066b(1, C4349a.m21882e(this.f42282v), z10);
        } catch (Exception e10) {
            m39055v(e10, true);
        }
    }

    /* renamed from: D */
    public void m39046D() {
        this.f42283w = this.f42262b.mo39015d();
        ((c) C4401z0.m22391j(this.f42277q)).m39066b(0, C4349a.m21882e(this.f42283w), true);
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    /* renamed from: E */
    public final boolean m39047E() {
        try {
            this.f42262b.mo39017f(this.f42280t, this.f42281u);
            return true;
        } catch (Exception e10) {
            m39053t(e10, 1);
            return false;
        }
    }

    @Override // p365v6.InterfaceC9277p
    /* renamed from: a */
    public void mo39023a(InterfaceC9290x.a aVar) {
        C4349a.m21884g(this.f42275o >= 0);
        if (aVar != null) {
            this.f42269i.m22024a(aVar);
        }
        int i10 = this.f42275o + 1;
        this.f42275o = i10;
        if (i10 == 1) {
            boolean z10 = false;
            if (this.f42274n == 2) {
                z10 = true;
            }
            C4349a.m21884g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f42276p = handlerThread;
            handlerThread.start();
            this.f42277q = new c(this, this.f42276p.getLooper());
            if (m39044B()) {
                m39049n(true);
            }
        } else if (aVar != null && m39052q() && this.f42269i.m22025b(aVar) == 1) {
            aVar.m39177k(this.f42274n);
        }
        this.f42264d.mo39064b(this, this.f42275o);
    }

    @Override // p365v6.InterfaceC9277p
    /* renamed from: b */
    public final UUID mo39024b() {
        return this.f42272l;
    }

    @Override // p365v6.InterfaceC9277p
    /* renamed from: c */
    public boolean mo39025c() {
        return this.f42266f;
    }

    @Override // p365v6.InterfaceC9277p
    /* renamed from: d */
    public final ExoMediaCrypto mo39026d() {
        return this.f42278r;
    }

    @Override // p365v6.InterfaceC9277p
    /* renamed from: e */
    public byte[] mo39027e() {
        return this.f42281u;
    }

    @Override // p365v6.InterfaceC9277p
    /* renamed from: f */
    public void mo39028f(InterfaceC9290x.a aVar) {
        C4349a.m21884g(this.f42275o > 0);
        int i10 = this.f42275o - 1;
        this.f42275o = i10;
        if (i10 == 0) {
            this.f42274n = 0;
            ((e) C4401z0.m22391j(this.f42273m)).removeCallbacksAndMessages(null);
            ((c) C4401z0.m22391j(this.f42277q)).m39067c();
            this.f42277q = null;
            ((HandlerThread) C4401z0.m22391j(this.f42276p)).quit();
            this.f42276p = null;
            this.f42278r = null;
            this.f42279s = null;
            this.f42282v = null;
            this.f42283w = null;
            byte[] bArr = this.f42280t;
            if (bArr != null) {
                this.f42262b.mo39020i(bArr);
                this.f42280t = null;
            }
        }
        if (aVar != null) {
            this.f42269i.m22026d(aVar);
            if (this.f42269i.m22025b(aVar) == 0) {
                aVar.m39179m();
            }
        }
        this.f42264d.mo39063a(this, this.f42275o);
    }

    @Override // p365v6.InterfaceC9277p
    /* renamed from: g */
    public Map<String, String> mo39029g() {
        byte[] bArr = this.f42280t;
        return bArr == null ? null : this.f42262b.mo39013b(bArr);
    }

    @Override // p365v6.InterfaceC9277p
    public final InterfaceC9277p.a getError() {
        return this.f42274n == 1 ? this.f42279s : null;
    }

    @Override // p365v6.InterfaceC9277p
    public final int getState() {
        return this.f42274n;
    }

    /* renamed from: m */
    public final void m39048m(InterfaceC4362g<InterfaceC9290x.a> interfaceC4362g) {
        Iterator<InterfaceC9290x.a> it = this.f42269i.m22023C().iterator();
        while (it.hasNext()) {
            interfaceC4362g.accept(it.next());
        }
    }

    @RequiresNonNull({"sessionId"})
    /* renamed from: n */
    public final void m39049n(boolean z10) {
        if (this.f42267g) {
            return;
        }
        byte[] bArr = (byte[]) C4401z0.m22391j(this.f42280t);
        int i10 = this.f42265e;
        if (i10 == 0 || i10 == 1) {
            if (this.f42281u == null) {
                m39045C(bArr, 1, z10);
                return;
            }
            if (this.f42274n != 4 && !m39047E()) {
                return;
            }
            long m39050o = m39050o();
            if (this.f42265e != 0 || m39050o > 60) {
                if (m39050o <= 0) {
                    m39053t(new C9274n0(), 2);
                    return;
                } else {
                    this.f42274n = 4;
                    m39048m(new InterfaceC4362g() { // from class: v6.g
                        @Override // p059d9.InterfaceC4362g
                        public final void accept(Object obj) {
                            ((InterfaceC9290x.a) obj).m39176j();
                        }
                    });
                    return;
                }
            }
            C4392v.m22268b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + m39050o);
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                C4349a.m21882e(this.f42281u);
                C4349a.m21882e(this.f42280t);
                m39045C(this.f42281u, 3, z10);
                return;
            }
            if (this.f42281u != null && !m39047E()) {
                return;
            }
        }
        m39045C(bArr, 2, z10);
    }

    /* renamed from: o */
    public final long m39050o() {
        if (!C7583h.f36779d.equals(this.f42272l)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) C4349a.m21882e(C9286t0.m39160b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    /* renamed from: p */
    public boolean m39051p(byte[] bArr) {
        return Arrays.equals(this.f42280t, bArr);
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* renamed from: q */
    public final boolean m39052q() {
        int i10 = this.f42274n;
        return i10 == 3 || i10 == 4;
    }

    /* renamed from: t */
    public final void m39053t(final Exception exc, int i10) {
        this.f42279s = new InterfaceC9277p.a(exc, C9254d0.m39006a(exc, i10));
        C4392v.m22271e("DefaultDrmSession", "DRM session error", exc);
        m39048m(new InterfaceC4362g(exc) { // from class: v6.f

            /* renamed from: a */
            public final Exception f42254a;

            {
                this.f42254a = exc;
            }

            @Override // p059d9.InterfaceC4362g
            public final void accept(Object obj) {
                ((InterfaceC9290x.a) obj).m39178l(this.f42254a);
            }
        });
        if (this.f42274n != 4) {
            this.f42274n = 1;
        }
    }

    /* renamed from: u */
    public final void m39054u(Object obj, Object obj2) {
        InterfaceC4362g<InterfaceC9290x.a> interfaceC4362g;
        if (obj == this.f42282v && m39052q()) {
            this.f42282v = null;
            if (obj2 instanceof Exception) {
                m39055v((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f42265e == 3) {
                    this.f42262b.mo39021j((byte[]) C4401z0.m22391j(this.f42281u), bArr);
                    interfaceC4362g = new InterfaceC4362g() { // from class: v6.c
                        @Override // p059d9.InterfaceC4362g
                        public final void accept(Object obj3) {
                            ((InterfaceC9290x.a) obj3).m39175i();
                        }
                    };
                } else {
                    byte[] mo39021j = this.f42262b.mo39021j(this.f42280t, bArr);
                    int i10 = this.f42265e;
                    if ((i10 == 2 || (i10 == 0 && this.f42281u != null)) && mo39021j != null && mo39021j.length != 0) {
                        this.f42281u = mo39021j;
                    }
                    this.f42274n = 4;
                    interfaceC4362g = new InterfaceC4362g() { // from class: v6.d
                        @Override // p059d9.InterfaceC4362g
                        public final void accept(Object obj3) {
                            ((InterfaceC9290x.a) obj3).m39174h();
                        }
                    };
                }
                m39048m(interfaceC4362g);
            } catch (Exception e10) {
                m39055v(e10, true);
            }
        }
    }

    /* renamed from: v */
    public final void m39055v(Exception exc, boolean z10) {
        if (exc instanceof NotProvisionedException) {
            this.f42263c.mo39062c(this);
        } else {
            m39053t(exc, z10 ? 1 : 2);
        }
    }

    /* renamed from: w */
    public final void m39056w() {
        if (this.f42265e == 0 && this.f42274n == 4) {
            C4401z0.m22391j(this.f42280t);
            m39049n(false);
        }
    }

    /* renamed from: x */
    public void m39057x(int i10) {
        if (i10 != 2) {
            return;
        }
        m39056w();
    }

    /* renamed from: y */
    public void m39058y() {
        if (m39044B()) {
            m39049n(true);
        }
    }

    /* renamed from: z */
    public void m39059z(Exception exc, boolean z10) {
        m39053t(exc, z10 ? 1 : 3);
    }
}
