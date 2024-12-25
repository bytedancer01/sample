package p338te;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import p354ue.C9162g;
import p354ue.InterfaceC9171p;
import p406xd.C9734k;
import td.AbstractC8693h;
import td.C8699n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:te/l.class
 */
/* renamed from: te.l */
/* loaded from: combined.jar:classes2.jar:te/l.class */
public class C8714l {

    /* renamed from: k */
    public static final String f40500k = "l";

    /* renamed from: a */
    public C9162g f40501a;

    /* renamed from: b */
    public HandlerThread f40502b;

    /* renamed from: c */
    public Handler f40503c;

    /* renamed from: d */
    public C8711i f40504d;

    /* renamed from: e */
    public Handler f40505e;

    /* renamed from: f */
    public Rect f40506f;

    /* renamed from: g */
    public boolean f40507g = false;

    /* renamed from: h */
    public final Object f40508h = new Object();

    /* renamed from: i */
    public final Handler.Callback f40509i = new a(this);

    /* renamed from: j */
    public final InterfaceC9171p f40510j = new b(this);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:te/l$a.class
     */
    /* renamed from: te.l$a */
    /* loaded from: combined.jar:classes2.jar:te/l$a.class */
    public class a implements Handler.Callback {

        /* renamed from: b */
        public final C8714l f40511b;

        public a(C8714l c8714l) {
            this.f40511b = c8714l;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == C9734k.f44416e) {
                this.f40511b.m37242g((C8722t) message.obj);
                return true;
            }
            if (i10 != C9734k.f44420i) {
                return true;
            }
            this.f40511b.m37243h();
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:te/l$b.class
     */
    /* renamed from: te.l$b */
    /* loaded from: combined.jar:classes2.jar:te/l$b.class */
    public class b implements InterfaceC9171p {

        /* renamed from: a */
        public final C8714l f40512a;

        public b(C8714l c8714l) {
            this.f40512a = c8714l;
        }

        @Override // p354ue.InterfaceC9171p
        /* renamed from: a */
        public void mo37248a(C8722t c8722t) {
            synchronized (this.f40512a.f40508h) {
                if (this.f40512a.f40507g) {
                    this.f40512a.f40503c.obtainMessage(C9734k.f44416e, c8722t).sendToTarget();
                }
            }
        }

        @Override // p354ue.InterfaceC9171p
        /* renamed from: b */
        public void mo37249b(Exception exc) {
            synchronized (this.f40512a.f40508h) {
                if (this.f40512a.f40507g) {
                    this.f40512a.f40503c.obtainMessage(C9734k.f44420i).sendToTarget();
                }
            }
        }
    }

    public C8714l(C9162g c9162g, C8711i c8711i, Handler handler) {
        C8723u.m37274a();
        this.f40501a = c9162g;
        this.f40504d = c8711i;
        this.f40505e = handler;
    }

    /* renamed from: f */
    public AbstractC8693h m37241f(C8722t c8722t) {
        if (this.f40506f == null) {
            return null;
        }
        return c8722t.m37268a();
    }

    /* renamed from: g */
    public final void m37242g(C8722t c8722t) {
        Message obtain;
        long currentTimeMillis = System.currentTimeMillis();
        c8722t.m37271d(this.f40506f);
        AbstractC8693h m37241f = m37241f(c8722t);
        C8699n m37231c = m37241f != null ? this.f40504d.m37231c(m37241f) : null;
        if (m37231c != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            Log.d(f40500k, "Found barcode in " + (currentTimeMillis2 - currentTimeMillis) + " ms");
            if (this.f40505e != null) {
                obtain = Message.obtain(this.f40505e, C9734k.f44418g, new C8704b(m37231c, c8722t));
                obtain.setData(new Bundle());
                obtain.sendToTarget();
            }
        } else {
            Handler handler = this.f40505e;
            if (handler != null) {
                obtain = Message.obtain(handler, C9734k.f44417f);
                obtain.sendToTarget();
            }
        }
        if (this.f40505e != null) {
            Message.obtain(this.f40505e, C9734k.f44419h, C8704b.m37225e(this.f40504d.m37232d(), c8722t)).sendToTarget();
        }
        m37243h();
    }

    /* renamed from: h */
    public final void m37243h() {
        this.f40501a.m38551v(this.f40510j);
    }

    /* renamed from: i */
    public void m37244i(Rect rect) {
        this.f40506f = rect;
    }

    /* renamed from: j */
    public void m37245j(C8711i c8711i) {
        this.f40504d = c8711i;
    }

    /* renamed from: k */
    public void m37246k() {
        C8723u.m37274a();
        HandlerThread handlerThread = new HandlerThread(f40500k);
        this.f40502b = handlerThread;
        handlerThread.start();
        this.f40503c = new Handler(this.f40502b.getLooper(), this.f40509i);
        this.f40507g = true;
        m37243h();
    }

    /* renamed from: l */
    public void m37247l() {
        C8723u.m37274a();
        synchronized (this.f40508h) {
            this.f40507g = false;
            this.f40503c.removeCallbacksAndMessages(null);
            this.f40502b.quit();
        }
    }
}
