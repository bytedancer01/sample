package p428yg;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/a0.class
 */
/* renamed from: yg.a0 */
/* loaded from: combined.jar:classes2.jar:yg/a0.class */
public class C9989a0 {

    /* renamed from: a */
    public final HandlerThread f45768a;

    /* renamed from: b */
    public final InterfaceC9994d f45769b;

    /* renamed from: c */
    public final Handler f45770c;

    /* renamed from: d */
    public long f45771d;

    /* renamed from: e */
    public long f45772e;

    /* renamed from: f */
    public long f45773f;

    /* renamed from: g */
    public long f45774g;

    /* renamed from: h */
    public long f45775h;

    /* renamed from: i */
    public long f45776i;

    /* renamed from: j */
    public long f45777j;

    /* renamed from: k */
    public long f45778k;

    /* renamed from: l */
    public int f45779l;

    /* renamed from: m */
    public int f45780m;

    /* renamed from: n */
    public int f45781n;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/a0$a.class
     */
    /* renamed from: yg.a0$a */
    /* loaded from: combined.jar:classes2.jar:yg/a0$a.class */
    public static class a extends Handler {

        /* renamed from: a */
        public final C9989a0 f45782a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:yg/a0$a$a.class
         */
        /* renamed from: yg.a0$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:yg/a0$a$a.class */
        public class RunnableC10336a implements Runnable {

            /* renamed from: b */
            public final Message f45783b;

            /* renamed from: c */
            public final a f45784c;

            public RunnableC10336a(a aVar, Message message) {
                this.f45784c = aVar;
                this.f45783b = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f45783b.what);
            }
        }

        public a(Looper looper, C9989a0 c9989a0) {
            super(looper);
            this.f45782a = c9989a0;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                this.f45782a.m41993j();
                return;
            }
            if (i10 == 1) {
                this.f45782a.m41994k();
                return;
            }
            if (i10 == 2) {
                this.f45782a.m41991h(message.arg1);
                return;
            }
            if (i10 == 3) {
                this.f45782a.m41992i(message.arg1);
            } else if (i10 != 4) {
                C10014t.f45883p.post(new RunnableC10336a(this, message));
            } else {
                this.f45782a.m41995l((Long) message.obj);
            }
        }
    }

    public C9989a0(InterfaceC9994d interfaceC9994d) {
        this.f45769b = interfaceC9994d;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f45768a = handlerThread;
        handlerThread.start();
        C10001g0.m42046j(handlerThread.getLooper());
        this.f45770c = new a(handlerThread.getLooper(), this);
    }

    /* renamed from: g */
    public static long m41984g(int i10, long j10) {
        return j10 / i10;
    }

    /* renamed from: a */
    public C9991b0 m41985a() {
        return new C9991b0(this.f45769b.mo42026a(), this.f45769b.size(), this.f45771d, this.f45772e, this.f45773f, this.f45774g, this.f45775h, this.f45776i, this.f45777j, this.f45778k, this.f45779l, this.f45780m, this.f45781n, System.currentTimeMillis());
    }

    /* renamed from: b */
    public void m41986b(Bitmap bitmap) {
        m41996m(bitmap, 2);
    }

    /* renamed from: c */
    public void m41987c(Bitmap bitmap) {
        m41996m(bitmap, 3);
    }

    /* renamed from: d */
    public void m41988d() {
        this.f45770c.sendEmptyMessage(0);
    }

    /* renamed from: e */
    public void m41989e() {
        this.f45770c.sendEmptyMessage(1);
    }

    /* renamed from: f */
    public void m41990f(long j10) {
        Handler handler = this.f45770c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j10)));
    }

    /* renamed from: h */
    public void m41991h(long j10) {
        int i10 = this.f45780m + 1;
        this.f45780m = i10;
        long j11 = this.f45774g + j10;
        this.f45774g = j11;
        this.f45777j = m41984g(i10, j11);
    }

    /* renamed from: i */
    public void m41992i(long j10) {
        this.f45781n++;
        long j11 = this.f45775h + j10;
        this.f45775h = j11;
        this.f45778k = m41984g(this.f45780m, j11);
    }

    /* renamed from: j */
    public void m41993j() {
        this.f45771d++;
    }

    /* renamed from: k */
    public void m41994k() {
        this.f45772e++;
    }

    /* renamed from: l */
    public void m41995l(Long l10) {
        this.f45779l++;
        long longValue = this.f45773f + l10.longValue();
        this.f45773f = longValue;
        this.f45776i = m41984g(this.f45779l, longValue);
    }

    /* renamed from: m */
    public final void m41996m(Bitmap bitmap, int i10) {
        int m42047k = C10001g0.m42047k(bitmap);
        Handler handler = this.f45770c;
        handler.sendMessage(handler.obtainMessage(i10, m42047k, 0));
    }
}
