package p428yg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import p428yg.C10012r;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/i.class
 */
/* renamed from: yg.i */
/* loaded from: combined.jar:classes2.jar:yg/i.class */
public class C10003i {

    /* renamed from: a */
    public final b f45840a;

    /* renamed from: b */
    public final Context f45841b;

    /* renamed from: c */
    public final ExecutorService f45842c;

    /* renamed from: d */
    public final InterfaceC10004j f45843d;

    /* renamed from: e */
    public final Map<String, RunnableC9992c> f45844e;

    /* renamed from: f */
    public final Map<Object, AbstractC9988a> f45845f;

    /* renamed from: g */
    public final Map<Object, AbstractC9988a> f45846g;

    /* renamed from: h */
    public final Set<Object> f45847h;

    /* renamed from: i */
    public final Handler f45848i;

    /* renamed from: j */
    public final Handler f45849j;

    /* renamed from: k */
    public final InterfaceC9994d f45850k;

    /* renamed from: l */
    public final C9989a0 f45851l;

    /* renamed from: m */
    public final List<RunnableC9992c> f45852m;

    /* renamed from: n */
    public final c f45853n;

    /* renamed from: o */
    public final boolean f45854o;

    /* renamed from: p */
    public boolean f45855p;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/i$a.class
     */
    /* renamed from: yg.i$a */
    /* loaded from: combined.jar:classes2.jar:yg/i$a.class */
    public static class a extends Handler {

        /* renamed from: a */
        public final C10003i f45856a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:yg/i$a$a.class
         */
        /* renamed from: yg.i$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:yg/i$a$a.class */
        public class RunnableC10337a implements Runnable {

            /* renamed from: b */
            public final Message f45857b;

            /* renamed from: c */
            public final a f45858c;

            public RunnableC10337a(a aVar, Message message) {
                this.f45858c = aVar;
                this.f45857b = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f45857b.what);
            }
        }

        public a(Looper looper, C10003i c10003i) {
            super(looper);
            this.f45856a = c10003i;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z10 = false;
            switch (message.what) {
                case 1:
                    this.f45856a.m42086v((AbstractC9988a) message.obj);
                    break;
                case 2:
                    this.f45856a.m42079o((AbstractC9988a) message.obj);
                    break;
                case 3:
                case 8:
                default:
                    C10014t.f45883p.post(new RunnableC10337a(this, message));
                    break;
                case 4:
                    this.f45856a.m42080p((RunnableC9992c) message.obj);
                    break;
                case 5:
                    this.f45856a.m42085u((RunnableC9992c) message.obj);
                    break;
                case 6:
                    this.f45856a.m42081q((RunnableC9992c) message.obj, false);
                    break;
                case 7:
                    this.f45856a.m42078n();
                    break;
                case 9:
                    this.f45856a.m42082r((NetworkInfo) message.obj);
                    break;
                case 10:
                    C10003i c10003i = this.f45856a;
                    if (message.arg1 == 1) {
                        z10 = true;
                    }
                    c10003i.m42077m(z10);
                    break;
                case 11:
                    this.f45856a.m42083s(message.obj);
                    break;
                case 12:
                    this.f45856a.m42084t(message.obj);
                    break;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/i$b.class
     */
    /* renamed from: yg.i$b */
    /* loaded from: combined.jar:classes2.jar:yg/i$b.class */
    public static class b extends HandlerThread {
        public b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/i$c.class
     */
    /* renamed from: yg.i$c */
    /* loaded from: combined.jar:classes2.jar:yg/i$c.class */
    public static class c extends BroadcastReceiver {

        /* renamed from: a */
        public final C10003i f45859a;

        public c(C10003i c10003i) {
            this.f45859a = c10003i;
        }

        /* renamed from: a */
        public void m42088a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f45859a.f45854o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f45859a.f45841b.registerReceiver(this, intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra("state")) {
                    this.f45859a.m42066b(intent.getBooleanExtra("state", false));
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.f45859a.m42070f(((ConnectivityManager) C10001g0.m42052p(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }

    public C10003i(Context context, ExecutorService executorService, Handler handler, InterfaceC10004j interfaceC10004j, InterfaceC9994d interfaceC9994d, C9989a0 c9989a0) {
        b bVar = new b();
        this.f45840a = bVar;
        bVar.start();
        C10001g0.m42046j(bVar.getLooper());
        this.f45841b = context;
        this.f45842c = executorService;
        this.f45844e = new LinkedHashMap();
        this.f45845f = new WeakHashMap();
        this.f45846g = new WeakHashMap();
        this.f45847h = new HashSet();
        this.f45848i = new a(bVar.getLooper(), this);
        this.f45843d = interfaceC10004j;
        this.f45849j = handler;
        this.f45850k = interfaceC9994d;
        this.f45851l = c9989a0;
        this.f45852m = new ArrayList(4);
        this.f45855p = C10001g0.m42054r(context);
        this.f45854o = C10001g0.m42053q(context, "android.permission.ACCESS_NETWORK_STATE");
        c cVar = new c(this);
        this.f45853n = cVar;
        cVar.m42088a();
    }

    /* renamed from: a */
    public final void m42065a(RunnableC9992c runnableC9992c) {
        if (runnableC9992c.m42022s()) {
            return;
        }
        this.f45852m.add(runnableC9992c);
        if (this.f45848i.hasMessages(7)) {
            return;
        }
        this.f45848i.sendEmptyMessageDelayed(7, 200L);
    }

    /* renamed from: b */
    public void m42066b(boolean z10) {
        Handler handler = this.f45848i;
        handler.sendMessage(handler.obtainMessage(10, z10 ? 1 : 0, 0));
    }

    /* renamed from: c */
    public void m42067c(AbstractC9988a abstractC9988a) {
        Handler handler = this.f45848i;
        handler.sendMessage(handler.obtainMessage(2, abstractC9988a));
    }

    /* renamed from: d */
    public void m42068d(RunnableC9992c runnableC9992c) {
        Handler handler = this.f45848i;
        handler.sendMessage(handler.obtainMessage(4, runnableC9992c));
    }

    /* renamed from: e */
    public void m42069e(RunnableC9992c runnableC9992c) {
        Handler handler = this.f45848i;
        handler.sendMessage(handler.obtainMessage(6, runnableC9992c));
    }

    /* renamed from: f */
    public void m42070f(NetworkInfo networkInfo) {
        Handler handler = this.f45848i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* renamed from: g */
    public void m42071g(RunnableC9992c runnableC9992c) {
        Handler handler = this.f45848i;
        handler.sendMessageDelayed(handler.obtainMessage(5, runnableC9992c), 500L);
    }

    /* renamed from: h */
    public void m42072h(AbstractC9988a abstractC9988a) {
        Handler handler = this.f45848i;
        handler.sendMessage(handler.obtainMessage(1, abstractC9988a));
    }

    /* renamed from: i */
    public final void m42073i() {
        if (this.f45845f.isEmpty()) {
            return;
        }
        Iterator<AbstractC9988a> it = this.f45845f.values().iterator();
        while (it.hasNext()) {
            AbstractC9988a next = it.next();
            it.remove();
            if (next.m41977g().f45898n) {
                C10001g0.m42057u("Dispatcher", "replaying", next.m41979i().m42135d());
            }
            m42087w(next, false);
        }
    }

    /* renamed from: j */
    public final void m42074j(List<RunnableC9992c> list) {
        if (list == null || list.isEmpty() || !list.get(0).m42018o().f45898n) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (RunnableC9992c runnableC9992c : list) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(C10001g0.m42048l(runnableC9992c));
        }
        C10001g0.m42057u("Dispatcher", "delivered", sb2.toString());
    }

    /* renamed from: k */
    public final void m42075k(AbstractC9988a abstractC9988a) {
        Object m41981k = abstractC9988a.m41981k();
        if (m41981k != null) {
            abstractC9988a.f45765k = true;
            this.f45845f.put(m41981k, abstractC9988a);
        }
    }

    /* renamed from: l */
    public final void m42076l(RunnableC9992c runnableC9992c) {
        AbstractC9988a m42011h = runnableC9992c.m42011h();
        if (m42011h != null) {
            m42075k(m42011h);
        }
        List<AbstractC9988a> m42012i = runnableC9992c.m42012i();
        if (m42012i != null) {
            int size = m42012i.size();
            for (int i10 = 0; i10 < size; i10++) {
                m42075k(m42012i.get(i10));
            }
        }
    }

    /* renamed from: m */
    public void m42077m(boolean z10) {
        this.f45855p = z10;
    }

    /* renamed from: n */
    public void m42078n() {
        ArrayList arrayList = new ArrayList(this.f45852m);
        this.f45852m.clear();
        Handler handler = this.f45849j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        m42074j(arrayList);
    }

    /* renamed from: o */
    public void m42079o(AbstractC9988a abstractC9988a) {
        String m41974d = abstractC9988a.m41974d();
        RunnableC9992c runnableC9992c = this.f45844e.get(m41974d);
        if (runnableC9992c != null) {
            runnableC9992c.m42010f(abstractC9988a);
            if (runnableC9992c.m42008c()) {
                this.f45844e.remove(m41974d);
                if (abstractC9988a.m41977g().f45898n) {
                    C10001g0.m42057u("Dispatcher", "canceled", abstractC9988a.m41979i().m42135d());
                }
            }
        }
        if (this.f45847h.contains(abstractC9988a.m41980j())) {
            this.f45846g.remove(abstractC9988a.m41981k());
            if (abstractC9988a.m41977g().f45898n) {
                C10001g0.m42058v("Dispatcher", "canceled", abstractC9988a.m41979i().m42135d(), "because paused request got canceled");
            }
        }
        AbstractC9988a remove = this.f45845f.remove(abstractC9988a.m41981k());
        if (remove == null || !remove.m41977g().f45898n) {
            return;
        }
        C10001g0.m42058v("Dispatcher", "canceled", remove.m41979i().m42135d(), "from replaying");
    }

    /* renamed from: p */
    public void m42080p(RunnableC9992c runnableC9992c) {
        if (EnumC10010p.shouldWriteToMemoryCache(runnableC9992c.m42017n())) {
            this.f45850k.mo42027b(runnableC9992c.m42015l(), runnableC9992c.m42020q());
        }
        this.f45844e.remove(runnableC9992c.m42015l());
        m42065a(runnableC9992c);
        if (runnableC9992c.m42018o().f45898n) {
            C10001g0.m42058v("Dispatcher", "batched", C10001g0.m42048l(runnableC9992c), "for completion");
        }
    }

    /* renamed from: q */
    public void m42081q(RunnableC9992c runnableC9992c, boolean z10) {
        if (runnableC9992c.m42018o().f45898n) {
            String m42048l = C10001g0.m42048l(runnableC9992c);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("for error");
            sb2.append(z10 ? " (will replay)" : "");
            C10001g0.m42058v("Dispatcher", "batched", m42048l, sb2.toString());
        }
        this.f45844e.remove(runnableC9992c.m42015l());
        m42065a(runnableC9992c);
    }

    /* renamed from: r */
    public void m42082r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f45842c;
        if (executorService instanceof C10016v) {
            ((C10016v) executorService).m42129a(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        m42073i();
    }

    /* renamed from: s */
    public void m42083s(Object obj) {
        if (this.f45847h.add(obj)) {
            Iterator<RunnableC9992c> it = this.f45844e.values().iterator();
            while (it.hasNext()) {
                RunnableC9992c next = it.next();
                boolean z10 = next.m42018o().f45898n;
                AbstractC9988a m42011h = next.m42011h();
                List<AbstractC9988a> m42012i = next.m42012i();
                boolean z11 = (m42012i == null || m42012i.isEmpty()) ? false : true;
                if (m42011h != null || z11) {
                    if (m42011h != null && m42011h.m41980j().equals(obj)) {
                        next.m42010f(m42011h);
                        this.f45846g.put(m42011h.m41981k(), m42011h);
                        if (z10) {
                            C10001g0.m42058v("Dispatcher", "paused", m42011h.f45756b.m42135d(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z11) {
                        for (int size = m42012i.size() - 1; size >= 0; size--) {
                            AbstractC9988a abstractC9988a = m42012i.get(size);
                            if (abstractC9988a.m41980j().equals(obj)) {
                                next.m42010f(abstractC9988a);
                                this.f45846g.put(abstractC9988a.m41981k(), abstractC9988a);
                                if (z10) {
                                    C10001g0.m42058v("Dispatcher", "paused", abstractC9988a.f45756b.m42135d(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (next.m42008c()) {
                        it.remove();
                        if (z10) {
                            C10001g0.m42058v("Dispatcher", "canceled", C10001g0.m42048l(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: t */
    public void m42084t(Object obj) {
        if (this.f45847h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator<AbstractC9988a> it = this.f45846g.values().iterator();
            while (it.hasNext()) {
                AbstractC9988a next = it.next();
                if (next.m41980j().equals(obj)) {
                    ArrayList arrayList2 = arrayList;
                    if (arrayList == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(next);
                    it.remove();
                    arrayList = arrayList2;
                }
            }
            if (arrayList != null) {
                Handler handler = this.f45849j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    /* renamed from: u */
    public void m42085u(RunnableC9992c runnableC9992c) {
        if (runnableC9992c.m42022s()) {
            return;
        }
        if (this.f45842c.isShutdown()) {
            m42081q(runnableC9992c, false);
            return;
        }
        NetworkInfo networkInfo = null;
        if (this.f45854o) {
            networkInfo = ((ConnectivityManager) C10001g0.m42052p(this.f45841b, "connectivity")).getActiveNetworkInfo();
        }
        boolean z10 = networkInfo != null && networkInfo.isConnected();
        boolean m42023u = runnableC9992c.m42023u(this.f45855p, networkInfo);
        boolean m42024v = runnableC9992c.m42024v();
        if (!m42023u) {
            boolean z11 = false;
            if (this.f45854o) {
                z11 = false;
                if (m42024v) {
                    z11 = true;
                }
            }
            m42081q(runnableC9992c, z11);
            if (z11) {
                m42076l(runnableC9992c);
                return;
            }
            return;
        }
        if (this.f45854o && !z10) {
            m42081q(runnableC9992c, m42024v);
            if (m42024v) {
                m42076l(runnableC9992c);
                return;
            }
            return;
        }
        if (runnableC9992c.m42018o().f45898n) {
            C10001g0.m42057u("Dispatcher", "retrying", C10001g0.m42048l(runnableC9992c));
        }
        if (runnableC9992c.m42014k() instanceof C10012r.a) {
            runnableC9992c.f45813j |= EnumC10011q.NO_CACHE.index;
        }
        runnableC9992c.f45818o = this.f45842c.submit(runnableC9992c);
    }

    /* renamed from: v */
    public void m42086v(AbstractC9988a abstractC9988a) {
        m42087w(abstractC9988a, true);
    }

    /* renamed from: w */
    public void m42087w(AbstractC9988a abstractC9988a, boolean z10) {
        if (this.f45847h.contains(abstractC9988a.m41980j())) {
            this.f45846g.put(abstractC9988a.m41981k(), abstractC9988a);
            if (abstractC9988a.m41977g().f45898n) {
                C10001g0.m42058v("Dispatcher", "paused", abstractC9988a.f45756b.m42135d(), "because tag '" + abstractC9988a.m41980j() + "' is paused");
                return;
            }
            return;
        }
        RunnableC9992c runnableC9992c = this.f45844e.get(abstractC9988a.m41974d());
        if (runnableC9992c != null) {
            runnableC9992c.m42007b(abstractC9988a);
            return;
        }
        if (this.f45842c.isShutdown()) {
            if (abstractC9988a.m41977g().f45898n) {
                C10001g0.m42058v("Dispatcher", "ignored", abstractC9988a.f45756b.m42135d(), "because shut down");
                return;
            }
            return;
        }
        RunnableC9992c m42003g = RunnableC9992c.m42003g(abstractC9988a.m41977g(), this, this.f45850k, this.f45851l, abstractC9988a);
        m42003g.f45818o = this.f45842c.submit(m42003g);
        this.f45844e.put(abstractC9988a.m41974d(), m42003g);
        if (z10) {
            this.f45845f.remove(abstractC9988a.m41981k());
        }
        if (abstractC9988a.m41977g().f45898n) {
            C10001g0.m42057u("Dispatcher", "enqueued", abstractC9988a.f45756b.m42135d());
        }
    }
}
