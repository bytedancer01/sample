package p027b9;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import org.apache.commons.net.tftp.TFTP;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p059d9.C4349a;
import p059d9.C4391u0;
import p059d9.C4392v;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/e0.class
 */
/* renamed from: b9.e0 */
/* loaded from: combined.jar:classes2.jar:b9/e0.class */
public final class C0839e0 implements InterfaceC0841f0 {

    /* renamed from: d */
    public static final c f5768d = m5319h(false, -9223372036854775807L);

    /* renamed from: e */
    public static final c f5769e = m5319h(true, -9223372036854775807L);

    /* renamed from: f */
    public static final c f5770f = new c(2, -9223372036854775807L);

    /* renamed from: g */
    public static final c f5771g = new c(3, -9223372036854775807L);

    /* renamed from: a */
    public final ExecutorService f5772a;

    /* renamed from: b */
    public d<? extends e> f5773b;

    /* renamed from: c */
    public IOException f5774c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/e0$b.class
     */
    /* renamed from: b9.e0$b */
    /* loaded from: combined.jar:classes2.jar:b9/e0$b.class */
    public interface b<T extends e> {
        /* renamed from: k */
        void mo485k(T t10, long j10, long j11, boolean z10);

        /* renamed from: o */
        c mo486o(T t10, long j10, long j11, IOException iOException, int i10);

        /* renamed from: r */
        void mo489r(T t10, long j10, long j11);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/e0$c.class
     */
    /* renamed from: b9.e0$c */
    /* loaded from: combined.jar:classes2.jar:b9/e0$c.class */
    public static final class c {

        /* renamed from: a */
        public final int f5775a;

        /* renamed from: b */
        public final long f5776b;

        public c(int i10, long j10) {
            this.f5775a = i10;
            this.f5776b = j10;
        }

        /* renamed from: c */
        public boolean m5331c() {
            int i10 = this.f5775a;
            boolean z10 = true;
            if (i10 != 0) {
                z10 = i10 == 1;
            }
            return z10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/e0$d.class
     */
    @SuppressLint({"HandlerLeak"})
    /* renamed from: b9.e0$d */
    /* loaded from: combined.jar:classes2.jar:b9/e0$d.class */
    public final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: b */
        public final int f5777b;

        /* renamed from: c */
        public final T f5778c;

        /* renamed from: d */
        public final long f5779d;

        /* renamed from: e */
        public b<T> f5780e;

        /* renamed from: f */
        public IOException f5781f;

        /* renamed from: g */
        public int f5782g;

        /* renamed from: h */
        public Thread f5783h;

        /* renamed from: i */
        public boolean f5784i;

        /* renamed from: j */
        public volatile boolean f5785j;

        /* renamed from: k */
        public final C0839e0 f5786k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0839e0 c0839e0, Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f5786k = c0839e0;
            this.f5778c = t10;
            this.f5780e = bVar;
            this.f5777b = i10;
            this.f5779d = j10;
        }

        /* renamed from: a */
        public void m5332a(boolean z10) {
            this.f5785j = z10;
            this.f5781f = null;
            if (hasMessages(0)) {
                this.f5784i = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f5784i = true;
                    this.f5778c.mo500c();
                    Thread thread = this.f5783h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                m5334c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) C4349a.m21882e(this.f5780e)).mo485k(this.f5778c, elapsedRealtime, elapsedRealtime - this.f5779d, true);
                this.f5780e = null;
            }
        }

        /* renamed from: b */
        public final void m5333b() {
            this.f5781f = null;
            this.f5786k.f5772a.execute((Runnable) C4349a.m21882e(this.f5786k.f5773b));
        }

        /* renamed from: c */
        public final void m5334c() {
            this.f5786k.f5773b = null;
        }

        /* renamed from: d */
        public final long m5335d() {
            return Math.min((this.f5782g - 1) * 1000, TFTP.DEFAULT_TIMEOUT);
        }

        /* renamed from: e */
        public void m5336e(int i10) {
            IOException iOException = this.f5781f;
            if (iOException != null && this.f5782g > i10) {
                throw iOException;
            }
        }

        /* renamed from: f */
        public void m5337f(long j10) {
            C4349a.m21884g(this.f5786k.f5773b == null);
            this.f5786k.f5773b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                m5333b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f5785j) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                m5333b();
                return;
            }
            if (i10 == 3) {
                throw ((Error) message.obj);
            }
            m5334c();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f5779d;
            b bVar = (b) C4349a.m21882e(this.f5780e);
            if (this.f5784i) {
                bVar.mo485k(this.f5778c, elapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                try {
                    bVar.mo489r(this.f5778c, elapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    C4392v.m22271e("LoadTask", "Unexpected exception handling load completed", e10);
                    this.f5786k.f5774c = new h(e10);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f5781f = iOException;
            int i12 = this.f5782g + 1;
            this.f5782g = i12;
            c mo486o = bVar.mo486o(this.f5778c, elapsedRealtime, j10, iOException, i12);
            if (mo486o.f5775a == 3) {
                this.f5786k.f5774c = this.f5781f;
            } else if (mo486o.f5775a != 2) {
                if (mo486o.f5775a == 1) {
                    this.f5782g = 1;
                }
                m5337f(mo486o.f5776b != -9223372036854775807L ? mo486o.f5776b : m5335d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar;
            Message obtainMessage;
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.f5784i;
                    this.f5783h = Thread.currentThread();
                }
                if (z10) {
                    C4391u0.m22263a("load:" + this.f5778c.getClass().getSimpleName());
                    try {
                        this.f5778c.mo498a();
                        C4391u0.m22265c();
                    } catch (Throwable th2) {
                        C4391u0.m22265c();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f5783h = null;
                    Thread.interrupted();
                }
                if (this.f5785j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e10) {
                if (this.f5785j) {
                    return;
                }
                obtainMessage = obtainMessage(2, e10);
                obtainMessage.sendToTarget();
            } catch (Error e11) {
                if (!this.f5785j) {
                    C4392v.m22271e("LoadTask", "Unexpected error loading stream", e11);
                    obtainMessage(3, e11).sendToTarget();
                }
                throw e11;
            } catch (Exception e12) {
                if (this.f5785j) {
                    return;
                }
                C4392v.m22271e("LoadTask", "Unexpected exception loading stream", e12);
                hVar = new h(e12);
                obtainMessage = obtainMessage(2, hVar);
                obtainMessage.sendToTarget();
            } catch (OutOfMemoryError e13) {
                if (this.f5785j) {
                    return;
                }
                C4392v.m22271e("LoadTask", "OutOfMemory error loading stream", e13);
                hVar = new h(e13);
                obtainMessage = obtainMessage(2, hVar);
                obtainMessage.sendToTarget();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/e0$e.class
     */
    /* renamed from: b9.e0$e */
    /* loaded from: combined.jar:classes2.jar:b9/e0$e.class */
    public interface e {
        /* renamed from: a */
        void mo498a();

        /* renamed from: c */
        void mo500c();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/e0$f.class
     */
    /* renamed from: b9.e0$f */
    /* loaded from: combined.jar:classes2.jar:b9/e0$f.class */
    public interface f {
        /* renamed from: q */
        void mo488q();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/e0$g.class
     */
    /* renamed from: b9.e0$g */
    /* loaded from: combined.jar:classes2.jar:b9/e0$g.class */
    public static final class g implements Runnable {

        /* renamed from: b */
        public final f f5787b;

        public g(f fVar) {
            this.f5787b = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5787b.mo488q();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/e0$h.class
     */
    /* renamed from: b9.e0$h */
    /* loaded from: combined.jar:classes2.jar:b9/e0$h.class */
    public static final class h extends IOException {
        public h(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    public C0839e0(String str) {
        this.f5772a = C4401z0.m22320D0("ExoPlayer:Loader:" + str);
    }

    /* renamed from: h */
    public static c m5319h(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    @Override // p027b9.InterfaceC0841f0
    /* renamed from: a */
    public void mo5320a() {
        m5325k(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
    }

    /* renamed from: f */
    public void m5321f() {
        ((d) C4349a.m21886i(this.f5773b)).m5332a(false);
    }

    /* renamed from: g */
    public void m5322g() {
        this.f5774c = null;
    }

    /* renamed from: i */
    public boolean m5323i() {
        return this.f5774c != null;
    }

    /* renamed from: j */
    public boolean m5324j() {
        return this.f5773b != null;
    }

    /* renamed from: k */
    public void m5325k(int i10) {
        IOException iOException = this.f5774c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f5773b;
        if (dVar != null) {
            int i11 = i10;
            if (i10 == Integer.MIN_VALUE) {
                i11 = dVar.f5777b;
            }
            dVar.m5336e(i11);
        }
    }

    /* renamed from: l */
    public void m5326l() {
        m5327m(null);
    }

    /* renamed from: m */
    public void m5327m(f fVar) {
        d<? extends e> dVar = this.f5773b;
        if (dVar != null) {
            dVar.m5332a(true);
        }
        if (fVar != null) {
            this.f5772a.execute(new g(fVar));
        }
        this.f5772a.shutdown();
    }

    /* renamed from: n */
    public <T extends e> long m5328n(T t10, b<T> bVar, int i10) {
        Looper looper = (Looper) C4349a.m21886i(Looper.myLooper());
        this.f5774c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(this, looper, t10, bVar, i10, elapsedRealtime).m5337f(0L);
        return elapsedRealtime;
    }
}
