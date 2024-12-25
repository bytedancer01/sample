package p135hh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import java.util.Iterator;
import java.util.LinkedList;
import p135hh.C5095d0;
import p135hh.InterfaceC5106n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/f.class
 */
/* renamed from: hh.f */
/* loaded from: combined.jar:classes2.jar:hh/f.class */
public class C5098f extends BroadcastReceiver implements C5095d0.b, InterfaceC5106n.a {

    /* renamed from: b */
    public final Handler f29263b;

    /* renamed from: d */
    public InterfaceC5106n f29265d;

    /* renamed from: i */
    public c f29270i;

    /* renamed from: j */
    public c f29271j;

    /* renamed from: k */
    public String f29272k;

    /* renamed from: l */
    public Runnable f29273l;

    /* renamed from: m */
    public NetworkInfo f29274m;

    /* renamed from: n */
    public LinkedList<b> f29275n;

    /* renamed from: c */
    public int f29264c = -1;

    /* renamed from: e */
    public final int f29266e = 60;

    /* renamed from: f */
    public final long f29267f = 65536;

    /* renamed from: g */
    public final int f29268g = 20;

    /* renamed from: h */
    public c f29269h = c.DISCONNECTED;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/f$a.class
     */
    /* renamed from: hh.f$a */
    /* loaded from: combined.jar:classes2.jar:hh/f$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final C5098f f29276b;

        public a(C5098f c5098f) {
            this.f29276b = c5098f;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5098f c5098f = this.f29276b;
            c cVar = c5098f.f29269h;
            c cVar2 = c.PENDINGDISCONNECT;
            if (cVar != cVar2) {
                return;
            }
            c cVar3 = c.DISCONNECTED;
            c5098f.f29269h = cVar3;
            if (c5098f.f29270i == cVar2) {
                c5098f.f29270i = cVar3;
            }
            c5098f.f29265d.mo25551c(this.f29276b.m25494g());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/f$b.class
     */
    /* renamed from: hh.f$b */
    /* loaded from: combined.jar:classes2.jar:hh/f$b.class */
    public static class b {

        /* renamed from: a */
        public long f29277a;

        /* renamed from: b */
        public long f29278b;

        public b(long j10, long j11) {
            this.f29277a = j10;
            this.f29278b = j11;
        }

        public /* synthetic */ b(long j10, long j11, a aVar) {
            this(j10, j11);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/f$c.class
     */
    /* renamed from: hh.f$c */
    /* loaded from: combined.jar:classes2.jar:hh/f$c.class */
    public enum c {
        SHOULDBECONNECTED,
        PENDINGDISCONNECT,
        DISCONNECTED
    }

    public C5098f(InterfaceC5106n interfaceC5106n) {
        c cVar = c.SHOULDBECONNECTED;
        this.f29270i = cVar;
        this.f29271j = cVar;
        this.f29272k = null;
        this.f29273l = new a(this);
        this.f29275n = new LinkedList<>();
        this.f29265d = interfaceC5106n;
        interfaceC5106n.mo25552d(this);
        this.f29263b = new Handler();
    }

    /* renamed from: d */
    public static boolean m25490d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // p135hh.C5095d0.b
    /* renamed from: Z */
    public void mo22570Z(long j10, long j11, long j12, long j13) {
        if (this.f29270i != c.PENDINGDISCONNECT) {
            return;
        }
        this.f29275n.add(new b(System.currentTimeMillis(), j12 + j13, null));
        while (this.f29275n.getFirst().f29277a <= System.currentTimeMillis() - 60000) {
            this.f29275n.removeFirst();
        }
        long j14 = 0;
        Iterator<b> it = this.f29275n.iterator();
        while (it.hasNext()) {
            j14 += it.next().f29278b;
        }
        if (j14 < 65536) {
            this.f29270i = c.DISCONNECTED;
            C5095d0.m25477t(2132018509, "64 kB", 60);
            this.f29265d.mo25551c(m25494g());
        }
    }

    @Override // p135hh.InterfaceC5106n.a
    /* renamed from: a */
    public boolean mo25491a() {
        return m25497j();
    }

    /* renamed from: e */
    public final void m25492e() {
        this.f29275n.add(new b(System.currentTimeMillis(), 65536L, null));
    }

    /* renamed from: f */
    public final NetworkInfo m25493f(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    /* renamed from: g */
    public final InterfaceC5106n.b m25494g() {
        c cVar = this.f29271j;
        c cVar2 = c.DISCONNECTED;
        return cVar == cVar2 ? InterfaceC5106n.b.userPause : this.f29270i == cVar2 ? InterfaceC5106n.b.screenOff : this.f29269h == cVar2 ? InterfaceC5106n.b.noNetwork : InterfaceC5106n.b.userPause;
    }

    /* renamed from: h */
    public boolean m25495h() {
        return this.f29271j == c.DISCONNECTED;
    }

    /* renamed from: i */
    public void m25496i(Context context) {
        String format;
        NetworkInfo m25493f = m25493f(context);
        boolean z10 = C5117y.m25656a(context).getBoolean("netchangereconnect", true);
        if (m25493f == null) {
            format = "not connected";
        } else {
            String subtypeName = m25493f.getSubtypeName();
            String str = subtypeName;
            if (subtypeName == null) {
                str = "";
            }
            String extraInfo = m25493f.getExtraInfo();
            format = String.format("%2$s %4$s to %1$s %3$s", m25493f.getTypeName(), m25493f.getDetailedState(), extraInfo != null ? extraInfo : "", str);
        }
        if (m25493f != null && m25493f.getState() == NetworkInfo.State.CONNECTED) {
            int type = m25493f.getType();
            c cVar = this.f29269h;
            c cVar2 = c.PENDINGDISCONNECT;
            boolean z11 = cVar == cVar2;
            this.f29269h = c.SHOULDBECONNECTED;
            NetworkInfo networkInfo = this.f29274m;
            boolean z12 = networkInfo != null && networkInfo.getType() == m25493f.getType() && m25490d(this.f29274m.getExtraInfo(), m25493f.getExtraInfo());
            if (z11 && z12) {
                this.f29263b.removeCallbacks(this.f29273l);
                this.f29265d.mo25553e(true);
            } else {
                if (this.f29270i == cVar2) {
                    this.f29270i = c.DISCONNECTED;
                }
                if (m25497j()) {
                    this.f29263b.removeCallbacks(this.f29273l);
                    if (z11 || !z12) {
                        this.f29265d.mo25553e(z12);
                    } else {
                        this.f29265d.resume();
                    }
                }
                this.f29264c = type;
                this.f29274m = m25493f;
            }
        } else if (m25493f == null) {
            this.f29264c = -1;
            if (z10) {
                this.f29269h = c.PENDINGDISCONNECT;
                this.f29263b.postDelayed(this.f29273l, 20000L);
            }
        }
        if (!format.equals(this.f29272k)) {
            C5095d0.m25477t(2132018175, format);
        }
        C5095d0.m25470m(String.format("Debug state info: %s, pause: %s, shouldbeconnected: %s, network: %s ", format, m25494g(), Boolean.valueOf(m25497j()), this.f29269h));
        this.f29272k = format;
    }

    /* renamed from: j */
    public final boolean m25497j() {
        c cVar = this.f29270i;
        c cVar2 = c.SHOULDBECONNECTED;
        return cVar == cVar2 && this.f29271j == cVar2 && this.f29269h == cVar2;
    }

    /* renamed from: k */
    public void m25498k(boolean z10) {
        if (z10) {
            this.f29271j = c.DISCONNECTED;
        } else {
            boolean m25497j = m25497j();
            this.f29271j = c.SHOULDBECONNECTED;
            if (m25497j() && !m25497j) {
                this.f29265d.resume();
                return;
            }
        }
        this.f29265d.mo25551c(m25494g());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        SharedPreferences m25656a = C5117y.m25656a(context);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            m25496i(context);
            return;
        }
        if (!"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean m25497j = m25497j();
                this.f29270i = c.SHOULDBECONNECTED;
                this.f29263b.removeCallbacks(this.f29273l);
                if (m25497j() != m25497j) {
                    this.f29265d.resume();
                    return;
                } else {
                    if (m25497j()) {
                        return;
                    }
                    this.f29265d.mo25551c(m25494g());
                    return;
                }
            }
            return;
        }
        if (m25656a.getBoolean("screenoff", false)) {
            if (C5118z.m25665i() != null && !C5118z.m25665i().f27811N) {
                C5095d0.m25471n(2132018508);
            }
            this.f29270i = c.PENDINGDISCONNECT;
            m25492e();
            c cVar = this.f29269h;
            c cVar2 = c.DISCONNECTED;
            if (cVar == cVar2 || this.f29271j == cVar2) {
                this.f29270i = cVar2;
            }
        }
    }
}
