package p354ue;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import p354ue.C9156a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ue/a.class
 */
/* renamed from: ue.a */
/* loaded from: combined.jar:classes2.jar:ue/a.class */
public final class C9156a {

    /* renamed from: i */
    public static final String f41863i = "a";

    /* renamed from: j */
    public static final Collection<String> f41864j;

    /* renamed from: a */
    public boolean f41865a;

    /* renamed from: b */
    public boolean f41866b;

    /* renamed from: c */
    public final boolean f41867c;

    /* renamed from: d */
    public final Camera f41868d;

    /* renamed from: e */
    public Handler f41869e;

    /* renamed from: f */
    public int f41870f = 1;

    /* renamed from: g */
    public final Handler.Callback f41871g;

    /* renamed from: h */
    public final Camera.AutoFocusCallback f41872h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ue/a$a.class
     */
    /* renamed from: ue.a$a */
    /* loaded from: combined.jar:classes2.jar:ue/a$a.class */
    public class a implements Handler.Callback {

        /* renamed from: b */
        public final C9156a f41873b;

        public a(C9156a c9156a) {
            this.f41873b = c9156a;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != this.f41873b.f41870f) {
                return false;
            }
            this.f41873b.m38508h();
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ue/a$b.class
     */
    /* renamed from: ue.a$b */
    /* loaded from: combined.jar:classes2.jar:ue/a$b.class */
    public class b implements Camera.AutoFocusCallback {

        /* renamed from: a */
        public final C9156a f41874a;

        public b(C9156a c9156a) {
            this.f41874a = c9156a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m38512b() {
            this.f41874a.f41866b = false;
            this.f41874a.m38506f();
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z10, Camera camera) {
            this.f41874a.f41869e.post(new Runnable(this) { // from class: ue.b

                /* renamed from: b */
                public final C9156a.b f41875b;

                {
                    this.f41875b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f41875b.m38512b();
                }
            });
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f41864j = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public C9156a(Camera camera, C9164i c9164i) {
        boolean z10 = true;
        a aVar = new a(this);
        this.f41871g = aVar;
        this.f41872h = new b(this);
        this.f41869e = new Handler(aVar);
        this.f41868d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        z10 = (c9164i.m38582c() && f41864j.contains(focusMode)) ? z10 : false;
        this.f41867c = z10;
        Log.i(f41863i, "Current focus mode '" + focusMode + "'; use auto focus? " + z10);
        m38509i();
    }

    /* renamed from: f */
    public final void m38506f() {
        synchronized (this) {
            if (!this.f41865a && !this.f41869e.hasMessages(this.f41870f)) {
                Handler handler = this.f41869e;
                handler.sendMessageDelayed(handler.obtainMessage(this.f41870f), 2000L);
            }
        }
    }

    /* renamed from: g */
    public final void m38507g() {
        this.f41869e.removeMessages(this.f41870f);
    }

    /* renamed from: h */
    public final void m38508h() {
        if (!this.f41867c || this.f41865a || this.f41866b) {
            return;
        }
        try {
            this.f41868d.autoFocus(this.f41872h);
            this.f41866b = true;
        } catch (RuntimeException e10) {
            Log.w(f41863i, "Unexpected exception while focusing", e10);
            m38506f();
        }
    }

    /* renamed from: i */
    public void m38509i() {
        this.f41865a = false;
        m38508h();
    }

    /* renamed from: j */
    public void m38510j() {
        this.f41865a = true;
        this.f41866b = false;
        m38507g();
        if (this.f41867c) {
            try {
                this.f41868d.cancelAutoFocus();
            } catch (RuntimeException e10) {
                Log.w(f41863i, "Unexpected exception while cancelling focusing", e10);
            }
        }
    }
}
