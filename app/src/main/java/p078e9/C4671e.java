package p078e9;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import p059d9.C4349a;
import p059d9.C4378o;
import p059d9.C4392v;
import p059d9.RunnableC4368j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e9/e.class
 */
/* renamed from: e9.e */
/* loaded from: combined.jar:classes2.jar:e9/e.class */
public final class C4671e extends Surface {

    /* renamed from: e */
    public static int f27563e;

    /* renamed from: f */
    public static boolean f27564f;

    /* renamed from: b */
    public final boolean f27565b;

    /* renamed from: c */
    public final b f27566c;

    /* renamed from: d */
    public boolean f27567d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:e9/e$b.class
     */
    /* renamed from: e9.e$b */
    /* loaded from: combined.jar:classes2.jar:e9/e$b.class */
    public static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: b */
        public RunnableC4368j f27568b;

        /* renamed from: c */
        public Handler f27569c;

        /* renamed from: d */
        public Error f27570d;

        /* renamed from: e */
        public RuntimeException f27571e;

        /* renamed from: f */
        public C4671e f27572f;

        public b() {
            super("ExoPlayer:DummySurface");
        }

        /* renamed from: a */
        public C4671e m23492a(int i10) {
            boolean z10;
            start();
            this.f27569c = new Handler(getLooper(), this);
            this.f27568b = new RunnableC4368j(this.f27569c);
            synchronized (this) {
                this.f27569c.obtainMessage(1, i10, 0).sendToTarget();
                z10 = false;
                while (this.f27572f == null && this.f27571e == null && this.f27570d == null) {
                    try {
                        wait();
                    } catch (InterruptedException e10) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f27571e;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f27570d;
            if (error == null) {
                return (C4671e) C4349a.m21882e(this.f27572f);
            }
            throw error;
        }

        /* renamed from: b */
        public final void m23493b(int i10) {
            C4349a.m21882e(this.f27568b);
            this.f27568b.m22050h(i10);
            this.f27572f = new C4671e(this, this.f27568b.m22049g(), i10 != 0);
        }

        /* renamed from: c */
        public void m23494c() {
            C4349a.m21882e(this.f27569c);
            this.f27569c.sendEmptyMessage(2);
        }

        /* renamed from: d */
        public final void m23495d() {
            C4349a.m21882e(this.f27568b);
            this.f27568b.m22051i();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        m23495d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    m23493b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (Error e10) {
                    C4392v.m22271e("DummySurface", "Failed to initialize dummy surface", e10);
                    this.f27570d = e10;
                    synchronized (this) {
                        notify();
                        return true;
                    }
                } catch (RuntimeException e11) {
                    C4392v.m22271e("DummySurface", "Failed to initialize dummy surface", e11);
                    this.f27571e = e11;
                    synchronized (this) {
                        notify();
                        return true;
                    }
                }
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    public C4671e(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f27566c = bVar;
        this.f27565b = z10;
    }

    /* renamed from: b */
    public static int m23489b(Context context) {
        if (C4378o.m22177h(context)) {
            return C4378o.m22178i() ? 1 : 2;
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m23490c(Context context) {
        boolean z10;
        synchronized (C4671e.class) {
            try {
                z10 = true;
                if (!f27564f) {
                    f27563e = m23489b(context);
                    f27564f = true;
                }
                if (f27563e == 0) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* renamed from: j */
    public static C4671e m23491j(Context context, boolean z10) {
        int i10 = 0;
        C4349a.m21884g(!z10 || m23490c(context));
        b bVar = new b();
        if (z10) {
            i10 = f27563e;
        }
        return bVar.m23492a(i10);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f27566c) {
            if (!this.f27567d) {
                this.f27566c.m23494c();
                this.f27567d = true;
            }
        }
    }
}
