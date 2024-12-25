package p078e9;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e9/o.class
 */
/* renamed from: e9.o */
/* loaded from: combined.jar:classes2.jar:e9/o.class */
public final class C4681o {

    /* renamed from: a */
    public final C4672f f27653a = new C4672f();

    /* renamed from: b */
    public final a f27654b;

    /* renamed from: c */
    public final d f27655c;

    /* renamed from: d */
    public boolean f27656d;

    /* renamed from: e */
    public Surface f27657e;

    /* renamed from: f */
    public float f27658f;

    /* renamed from: g */
    public float f27659g;

    /* renamed from: h */
    public float f27660h;

    /* renamed from: i */
    public float f27661i;

    /* renamed from: j */
    public long f27662j;

    /* renamed from: k */
    public long f27663k;

    /* renamed from: l */
    public long f27664l;

    /* renamed from: m */
    public long f27665m;

    /* renamed from: n */
    public long f27666n;

    /* renamed from: o */
    public long f27667o;

    /* renamed from: p */
    public long f27668p;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:e9/o$a.class
     */
    /* renamed from: e9.o$a */
    /* loaded from: combined.jar:classes2.jar:e9/o$a.class */
    public interface a {

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:e9/o$a$a.class
         */
        /* renamed from: e9.o$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:e9/o$a$a.class */
        public interface InterfaceC10288a {
            /* renamed from: a */
            void mo23577a(Display display);
        }

        /* renamed from: a */
        void mo23598a(InterfaceC10288a interfaceC10288a);

        /* renamed from: b */
        void mo23599b();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:e9/o$b.class
     */
    /* renamed from: e9.o$b */
    /* loaded from: combined.jar:classes2.jar:e9/o$b.class */
    public static final class b implements a {

        /* renamed from: a */
        public final WindowManager f27669a;

        public b(WindowManager windowManager) {
            this.f27669a = windowManager;
        }

        /* renamed from: c */
        public static a m23600c(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            return windowManager != null ? new b(windowManager) : null;
        }

        @Override // p078e9.C4681o.a
        /* renamed from: a */
        public void mo23598a(a.InterfaceC10288a interfaceC10288a) {
            interfaceC10288a.mo23577a(this.f27669a.getDefaultDisplay());
        }

        @Override // p078e9.C4681o.a
        /* renamed from: b */
        public void mo23599b() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:e9/o$c.class
     */
    /* renamed from: e9.o$c */
    /* loaded from: combined.jar:classes2.jar:e9/o$c.class */
    public static final class c implements a, DisplayManager.DisplayListener {

        /* renamed from: a */
        public final DisplayManager f27670a;

        /* renamed from: b */
        public a.InterfaceC10288a f27671b;

        public c(DisplayManager displayManager) {
            this.f27670a = displayManager;
        }

        /* renamed from: d */
        public static a m23601d(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            return displayManager != null ? new c(displayManager) : null;
        }

        @Override // p078e9.C4681o.a
        /* renamed from: a */
        public void mo23598a(a.InterfaceC10288a interfaceC10288a) {
            this.f27671b = interfaceC10288a;
            this.f27670a.registerDisplayListener(this, C4401z0.m22421y());
            interfaceC10288a.mo23577a(m23602c());
        }

        @Override // p078e9.C4681o.a
        /* renamed from: b */
        public void mo23599b() {
            this.f27670a.unregisterDisplayListener(this);
            this.f27671b = null;
        }

        /* renamed from: c */
        public final Display m23602c() {
            return this.f27670a.getDisplay(0);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            a.InterfaceC10288a interfaceC10288a = this.f27671b;
            if (interfaceC10288a == null || i10 != 0) {
                return;
            }
            interfaceC10288a.mo23577a(m23602c());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:e9/o$d.class
     */
    /* renamed from: e9.o$d */
    /* loaded from: combined.jar:classes2.jar:e9/o$d.class */
    public static final class d implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: g */
        public static final d f27672g = new d();

        /* renamed from: b */
        public volatile long f27673b = -9223372036854775807L;

        /* renamed from: c */
        public final Handler f27674c;

        /* renamed from: d */
        public final HandlerThread f27675d;

        /* renamed from: e */
        public Choreographer f27676e;

        /* renamed from: f */
        public int f27677f;

        public d() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f27675d = handlerThread;
            handlerThread.start();
            Handler m22419x = C4401z0.m22419x(handlerThread.getLooper(), this);
            this.f27674c = m22419x;
            m22419x.sendEmptyMessage(0);
        }

        /* renamed from: d */
        public static d m23603d() {
            return f27672g;
        }

        /* renamed from: a */
        public void m23604a() {
            this.f27674c.sendEmptyMessage(1);
        }

        /* renamed from: b */
        public final void m23605b() {
            int i10 = this.f27677f + 1;
            this.f27677f = i10;
            if (i10 == 1) {
                ((Choreographer) C4349a.m21882e(this.f27676e)).postFrameCallback(this);
            }
        }

        /* renamed from: c */
        public final void m23606c() {
            this.f27676e = Choreographer.getInstance();
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f27673b = j10;
            ((Choreographer) C4349a.m21882e(this.f27676e)).postFrameCallbackDelayed(this, 500L);
        }

        /* renamed from: e */
        public void m23607e() {
            this.f27674c.sendEmptyMessage(2);
        }

        /* renamed from: f */
        public final void m23608f() {
            int i10 = this.f27677f - 1;
            this.f27677f = i10;
            if (i10 == 0) {
                ((Choreographer) C4349a.m21882e(this.f27676e)).removeFrameCallback(this);
                this.f27673b = -9223372036854775807L;
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                m23606c();
                return true;
            }
            if (i10 == 1) {
                m23605b();
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            m23608f();
            return true;
        }
    }

    public C4681o(Context context) {
        a m23581f = m23581f(context);
        this.f27654b = m23581f;
        this.f27655c = m23581f != null ? d.m23603d() : null;
        this.f27662j = -9223372036854775807L;
        this.f27663k = -9223372036854775807L;
        this.f27658f = -1.0f;
        this.f27661i = 1.0f;
    }

    /* renamed from: c */
    public static boolean m23579c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    /* renamed from: e */
    public static long m23580e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            long j15 = j12 + j14;
            j13 = j14;
            j14 = j15;
        }
        if (j14 - j10 >= j10 - j13) {
            j14 = j13;
        }
        return j14;
    }

    /* renamed from: f */
    public static a m23581f(Context context) {
        a aVar = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            a aVar2 = null;
            if (C4401z0.f26679a >= 17) {
                aVar2 = c.m23601d(applicationContext);
            }
            aVar = aVar2;
            if (aVar2 == null) {
                aVar = b.m23600c(applicationContext);
            }
        }
        return aVar;
    }

    /* renamed from: q */
    public static void m23582q(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e10) {
            C4392v.m22271e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }

    /* renamed from: b */
    public long m23583b(long j10) {
        if (this.f27667o != -1 && this.f27653a.m23500e()) {
            long m23496a = this.f27668p + ((long) ((this.f27653a.m23496a() * (this.f27664l - this.f27667o)) / this.f27661i));
            if (m23579c(j10, m23496a)) {
                j10 = m23496a;
            } else {
                m23594p();
            }
        }
        this.f27665m = this.f27664l;
        this.f27666n = j10;
        d dVar = this.f27655c;
        if (dVar == null || this.f27662j == -9223372036854775807L) {
            return j10;
        }
        long j11 = dVar.f27673b;
        return j11 == -9223372036854775807L ? j10 : m23580e(j10, j11, this.f27662j) - this.f27663k;
    }

    /* renamed from: d */
    public final void m23584d() {
        Surface surface;
        if (C4401z0.f26679a < 30 || (surface = this.f27657e) == null || this.f27660h == 0.0f) {
            return;
        }
        this.f27660h = 0.0f;
        m23582q(surface, 0.0f);
    }

    /* renamed from: g */
    public void m23585g() {
        a aVar = this.f27654b;
        if (aVar != null) {
            aVar.mo23599b();
            ((d) C4349a.m21882e(this.f27655c)).m23607e();
        }
    }

    /* renamed from: h */
    public void m23586h() {
        if (this.f27654b != null) {
            ((d) C4349a.m21882e(this.f27655c)).m23604a();
            this.f27654b.mo23598a(new a.InterfaceC10288a(this) { // from class: e9.n

                /* renamed from: a */
                public final C4681o f27652a;

                {
                    this.f27652a = this;
                }

                @Override // p078e9.C4681o.a.InterfaceC10288a
                /* renamed from: a */
                public final void mo23577a(Display display) {
                    this.f27652a.m23595r(display);
                }
            });
        }
    }

    /* renamed from: i */
    public void m23587i(float f10) {
        this.f27658f = f10;
        this.f27653a.m23502g();
        m23596s();
    }

    /* renamed from: j */
    public void m23588j(long j10) {
        long j11 = this.f27665m;
        if (j11 != -1) {
            this.f27667o = j11;
            this.f27668p = this.f27666n;
        }
        this.f27664l++;
        this.f27653a.m23501f(j10 * 1000);
        m23596s();
    }

    /* renamed from: k */
    public void m23589k(float f10) {
        this.f27661i = f10;
        m23594p();
        m23597t(false);
    }

    /* renamed from: l */
    public void m23590l() {
        m23594p();
    }

    /* renamed from: m */
    public void m23591m() {
        this.f27656d = true;
        m23594p();
        m23597t(false);
    }

    /* renamed from: n */
    public void m23592n() {
        this.f27656d = false;
        m23584d();
    }

    /* renamed from: o */
    public void m23593o(Surface surface) {
        Surface surface2 = surface;
        if (surface instanceof C4671e) {
            surface2 = null;
        }
        if (this.f27657e == surface2) {
            return;
        }
        m23584d();
        this.f27657e = surface2;
        m23597t(true);
    }

    /* renamed from: p */
    public final void m23594p() {
        this.f27664l = 0L;
        this.f27667o = -1L;
        this.f27665m = -1L;
    }

    /* renamed from: r */
    public final void m23595r(Display display) {
        long j10;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f27662j = refreshRate;
            j10 = (refreshRate * 80) / 100;
        } else {
            C4392v.m22275i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j10 = -9223372036854775807L;
            this.f27662j = -9223372036854775807L;
        }
        this.f27663k = j10;
    }

    /* renamed from: s */
    public final void m23596s() {
        boolean z10;
        if (C4401z0.f26679a < 30 || this.f27657e == null) {
            return;
        }
        float m23497b = this.f27653a.m23500e() ? this.f27653a.m23497b() : this.f27658f;
        float f10 = this.f27659g;
        if (m23497b == f10) {
            return;
        }
        float f11 = m23497b;
        if (f11 != -1.0f && f10 != -1.0f) {
            if (Math.abs(m23497b - this.f27659g) >= (this.f27653a.m23500e() && (this.f27653a.m23499d() > 5000000000L ? 1 : (this.f27653a.m23499d() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) {
                z10 = true;
            }
            z10 = false;
        } else if (f11 != -1.0f) {
            z10 = true;
        } else {
            if (this.f27653a.m23498c() >= 30) {
                z10 = true;
            }
            z10 = false;
        }
        if (z10) {
            this.f27659g = m23497b;
            m23597t(false);
        }
    }

    /* renamed from: t */
    public final void m23597t(boolean z10) {
        Surface surface;
        if (C4401z0.f26679a < 30 || (surface = this.f27657e) == null) {
            return;
        }
        float f10 = 0.0f;
        if (this.f27656d) {
            float f11 = this.f27659g;
            f10 = 0.0f;
            if (f11 != -1.0f) {
                f10 = this.f27661i * f11;
            }
        }
        if (z10 || this.f27660h != f10) {
            this.f27660h = f10;
            m23582q(surface, f10);
        }
    }
}
