package p424yb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yb/e.class
 */
/* renamed from: yb.e */
/* loaded from: combined.jar:classes2.jar:yb/e.class */
public class C9973e {

    /* renamed from: e */
    public static C9973e f45685e;

    /* renamed from: a */
    public final Object f45686a = new Object();

    /* renamed from: b */
    public final Handler f45687b = new Handler(Looper.getMainLooper(), new a(this));

    /* renamed from: c */
    public c f45688c;

    /* renamed from: d */
    public c f45689d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yb/e$a.class
     */
    /* renamed from: yb.e$a */
    /* loaded from: combined.jar:classes2.jar:yb/e$a.class */
    public class a implements Handler.Callback {

        /* renamed from: b */
        public final C9973e f45690b;

        public a(C9973e c9973e) {
            this.f45690b = c9973e;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            this.f45690b.m41907c((c) message.obj);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yb/e$b.class
     */
    /* renamed from: yb.e$b */
    /* loaded from: combined.jar:classes2.jar:yb/e$b.class */
    public interface b {
        /* renamed from: a */
        void m41912a(int i10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yb/e$c.class
     */
    /* renamed from: yb.e$c */
    /* loaded from: combined.jar:classes2.jar:yb/e$c.class */
    public static class c {

        /* renamed from: a */
        public final WeakReference<b> f45691a;

        /* renamed from: b */
        public int f45692b;

        /* renamed from: c */
        public boolean f45693c;

        /* renamed from: a */
        public boolean m41913a(b bVar) {
            return bVar != null && this.f45691a.get() == bVar;
        }
    }

    /* renamed from: b */
    public static C9973e m41905b() {
        if (f45685e == null) {
            f45685e = new C9973e();
        }
        return f45685e;
    }

    /* renamed from: a */
    public final boolean m41906a(c cVar, int i10) {
        b bVar = cVar.f45691a.get();
        if (bVar == null) {
            return false;
        }
        this.f45687b.removeCallbacksAndMessages(cVar);
        bVar.m41912a(i10);
        return true;
    }

    /* renamed from: c */
    public void m41907c(c cVar) {
        synchronized (this.f45686a) {
            if (this.f45688c == cVar || this.f45689d == cVar) {
                m41906a(cVar, 2);
            }
        }
    }

    /* renamed from: d */
    public final boolean m41908d(b bVar) {
        c cVar = this.f45688c;
        return cVar != null && cVar.m41913a(bVar);
    }

    /* renamed from: e */
    public void m41909e(b bVar) {
        synchronized (this.f45686a) {
            if (m41908d(bVar)) {
                c cVar = this.f45688c;
                if (!cVar.f45693c) {
                    cVar.f45693c = true;
                    this.f45687b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    /* renamed from: f */
    public void m41910f(b bVar) {
        synchronized (this.f45686a) {
            if (m41908d(bVar)) {
                c cVar = this.f45688c;
                if (cVar.f45693c) {
                    cVar.f45693c = false;
                    m41911g(cVar);
                }
            }
        }
    }

    /* renamed from: g */
    public final void m41911g(c cVar) {
        int i10 = cVar.f45692b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        this.f45687b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f45687b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }
}
