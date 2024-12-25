package p428yg;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import p428yg.AbstractC9988a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/t.class
 */
/* renamed from: yg.t */
/* loaded from: combined.jar:classes2.jar:yg/t.class */
public class C10014t {

    /* renamed from: p */
    public static final Handler f45883p = new a(Looper.getMainLooper());

    /* renamed from: q */
    public static volatile C10014t f45884q = null;

    /* renamed from: a */
    public final d f45885a;

    /* renamed from: b */
    public final g f45886b;

    /* renamed from: c */
    public final c f45887c;

    /* renamed from: d */
    public final List<AbstractC10019y> f45888d;

    /* renamed from: e */
    public final Context f45889e;

    /* renamed from: f */
    public final C10003i f45890f;

    /* renamed from: g */
    public final InterfaceC9994d f45891g;

    /* renamed from: h */
    public final C9989a0 f45892h;

    /* renamed from: i */
    public final Map<Object, AbstractC9988a> f45893i;

    /* renamed from: j */
    public final Map<ImageView, ViewTreeObserverOnPreDrawListenerC10002h> f45894j;

    /* renamed from: k */
    public final ReferenceQueue<Object> f45895k;

    /* renamed from: l */
    public final Bitmap.Config f45896l;

    /* renamed from: m */
    public boolean f45897m;

    /* renamed from: n */
    public volatile boolean f45898n;

    /* renamed from: o */
    public boolean f45899o;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/t$a.class
     */
    /* renamed from: yg.t$a */
    /* loaded from: combined.jar:classes2.jar:yg/t$a.class */
    public static final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 3) {
                AbstractC9988a abstractC9988a = (AbstractC9988a) message.obj;
                if (abstractC9988a.m41977g().f45898n) {
                    C10001g0.m42058v("Main", "canceled", abstractC9988a.f45756b.m42135d(), "target got garbage collected");
                }
                abstractC9988a.f45755a.m42106b(abstractC9988a.m41981k());
                return;
            }
            if (i10 == 8) {
                List list = (List) message.obj;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    RunnableC9992c runnableC9992c = (RunnableC9992c) list.get(i11);
                    runnableC9992c.f45806c.m42109e(runnableC9992c);
                }
                return;
            }
            if (i10 != 13) {
                throw new AssertionError("Unknown handler message received: " + message.what);
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                AbstractC9988a abstractC9988a2 = (AbstractC9988a) list2.get(i12);
                abstractC9988a2.f45755a.m42118n(abstractC9988a2);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/t$b.class
     */
    /* renamed from: yg.t$b */
    /* loaded from: combined.jar:classes2.jar:yg/t$b.class */
    public static class b {

        /* renamed from: a */
        public final Context f45900a;

        /* renamed from: b */
        public InterfaceC10004j f45901b;

        /* renamed from: c */
        public ExecutorService f45902c;

        /* renamed from: d */
        public InterfaceC9994d f45903d;

        /* renamed from: e */
        public d f45904e;

        /* renamed from: f */
        public g f45905f;

        /* renamed from: g */
        public List<AbstractC10019y> f45906g;

        /* renamed from: h */
        public Bitmap.Config f45907h;

        /* renamed from: i */
        public boolean f45908i;

        /* renamed from: j */
        public boolean f45909j;

        public b(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.f45900a = context.getApplicationContext();
        }

        /* renamed from: a */
        public C10014t m42121a() {
            Context context = this.f45900a;
            if (this.f45901b == null) {
                this.f45901b = C10001g0.m42043g(context);
            }
            if (this.f45903d == null) {
                this.f45903d = new C10007m(context);
            }
            if (this.f45902c == null) {
                this.f45902c = new C10016v();
            }
            if (this.f45905f == null) {
                this.f45905f = g.f45914a;
            }
            C9989a0 c9989a0 = new C9989a0(this.f45903d);
            return new C10014t(context, new C10003i(context, this.f45902c, C10014t.f45883p, this.f45901b, this.f45903d, c9989a0), this.f45903d, this.f45904e, this.f45905f, this.f45906g, c9989a0, this.f45907h, this.f45908i, this.f45909j);
        }

        /* renamed from: b */
        public b m42122b(InterfaceC10004j interfaceC10004j) {
            if (interfaceC10004j == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            }
            if (this.f45901b != null) {
                throw new IllegalStateException("Downloader already set.");
            }
            this.f45901b = interfaceC10004j;
            return this;
        }

        /* renamed from: c */
        public b m42123c(d dVar) {
            if (dVar == null) {
                throw new IllegalArgumentException("Listener must not be null.");
            }
            if (this.f45904e != null) {
                throw new IllegalStateException("Listener already set.");
            }
            this.f45904e = dVar;
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/t$c.class
     */
    /* renamed from: yg.t$c */
    /* loaded from: combined.jar:classes2.jar:yg/t$c.class */
    public static class c extends Thread {

        /* renamed from: b */
        public final ReferenceQueue<Object> f45910b;

        /* renamed from: c */
        public final Handler f45911c;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:yg/t$c$a.class
         */
        /* renamed from: yg.t$c$a */
        /* loaded from: combined.jar:classes2.jar:yg/t$c$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final Exception f45912b;

            /* renamed from: c */
            public final c f45913c;

            public a(c cVar, Exception exc) {
                this.f45913c = cVar;
                this.f45912b = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f45912b);
            }
        }

        public c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f45910b = referenceQueue;
            this.f45911c = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    AbstractC9988a.a aVar = (AbstractC9988a.a) this.f45910b.remove(1000L);
                    Message obtainMessage = this.f45911c.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.f45767a;
                        this.f45911c.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException e10) {
                    return;
                } catch (Exception e11) {
                    this.f45911c.post(new a(this, e11));
                    return;
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/t$d.class
     */
    /* renamed from: yg.t$d */
    /* loaded from: combined.jar:classes2.jar:yg/t$d.class */
    public interface d {
        /* renamed from: a */
        void mo41056a(C10014t c10014t, Uri uri, Exception exc);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/t$e.class
     */
    /* renamed from: yg.t$e */
    /* loaded from: combined.jar:classes2.jar:yg/t$e.class */
    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);

        public final int debugColor;

        e(int i10) {
            this.debugColor = i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/t$f.class
     */
    /* renamed from: yg.t$f */
    /* loaded from: combined.jar:classes2.jar:yg/t$f.class */
    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/t$g.class
     */
    /* renamed from: yg.t$g */
    /* loaded from: combined.jar:classes2.jar:yg/t$g.class */
    public interface g {

        /* renamed from: a */
        public static final g f45914a = new a();

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:yg/t$g$a.class
         */
        /* renamed from: yg.t$g$a */
        /* loaded from: combined.jar:classes2.jar:yg/t$g$a.class */
        public static final class a implements g {
            @Override // p428yg.C10014t.g
            /* renamed from: a */
            public C10017w mo42124a(C10017w c10017w) {
                return c10017w;
            }
        }

        /* renamed from: a */
        C10017w mo42124a(C10017w c10017w);
    }

    public C10014t(Context context, C10003i c10003i, InterfaceC9994d interfaceC9994d, d dVar, g gVar, List<AbstractC10019y> list, C9989a0 c9989a0, Bitmap.Config config, boolean z10, boolean z11) {
        this.f45889e = context;
        this.f45890f = c10003i;
        this.f45891g = interfaceC9994d;
        this.f45885a = dVar;
        this.f45886b = gVar;
        this.f45896l = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new C10020z(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C9998f(context));
        arrayList.add(new C10009o(context));
        arrayList.add(new C10000g(context));
        arrayList.add(new C9990b(context));
        arrayList.add(new C10005k(context));
        arrayList.add(new C10012r(c10003i.f45843d, c9989a0));
        this.f45888d = Collections.unmodifiableList(arrayList);
        this.f45892h = c9989a0;
        this.f45893i = new WeakHashMap();
        this.f45894j = new WeakHashMap();
        this.f45897m = z10;
        this.f45898n = z11;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f45895k = referenceQueue;
        c cVar = new c(referenceQueue, f45883p);
        this.f45887c = cVar;
        cVar.start();
    }

    /* renamed from: q */
    public static C10014t m42105q(Context context) {
        if (f45884q == null) {
            synchronized (C10014t.class) {
                try {
                    if (f45884q == null) {
                        f45884q = new b(context).m42121a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f45884q;
    }

    /* renamed from: b */
    public final void m42106b(Object obj) {
        C10001g0.m42039c();
        AbstractC9988a remove = this.f45893i.remove(obj);
        if (remove != null) {
            remove.mo41971a();
            this.f45890f.m42067c(remove);
        }
        if (obj instanceof ImageView) {
            ViewTreeObserverOnPreDrawListenerC10002h remove2 = this.f45894j.remove((ImageView) obj);
            if (remove2 != null) {
                remove2.m42064a();
            }
        }
    }

    /* renamed from: c */
    public void m42107c(ImageView imageView) {
        m42106b(imageView);
    }

    /* renamed from: d */
    public void m42108d(InterfaceC9993c0 interfaceC9993c0) {
        m42106b(interfaceC9993c0);
    }

    /* renamed from: e */
    public void m42109e(RunnableC9992c runnableC9992c) {
        AbstractC9988a m42011h = runnableC9992c.m42011h();
        List<AbstractC9988a> m42012i = runnableC9992c.m42012i();
        boolean z10 = (m42012i == null || m42012i.isEmpty()) ? false : true;
        if (m42011h == null ? z10 : true) {
            Uri uri = runnableC9992c.m42013j().f45928d;
            Exception m42014k = runnableC9992c.m42014k();
            Bitmap m42020q = runnableC9992c.m42020q();
            e m42016m = runnableC9992c.m42016m();
            if (m42011h != null) {
                m42111g(m42020q, m42016m, m42011h);
            }
            if (z10) {
                int size = m42012i.size();
                for (int i10 = 0; i10 < size; i10++) {
                    m42111g(m42020q, m42016m, m42012i.get(i10));
                }
            }
            d dVar = this.f45885a;
            if (dVar == null || m42014k == null) {
                return;
            }
            dVar.mo41056a(this, uri, m42014k);
        }
    }

    /* renamed from: f */
    public void m42110f(ImageView imageView, ViewTreeObserverOnPreDrawListenerC10002h viewTreeObserverOnPreDrawListenerC10002h) {
        this.f45894j.put(imageView, viewTreeObserverOnPreDrawListenerC10002h);
    }

    /* renamed from: g */
    public final void m42111g(Bitmap bitmap, e eVar, AbstractC9988a abstractC9988a) {
        if (abstractC9988a.m41982l()) {
            return;
        }
        if (!abstractC9988a.m41983m()) {
            this.f45893i.remove(abstractC9988a.m41981k());
        }
        if (bitmap == null) {
            abstractC9988a.mo41973c();
            if (this.f45898n) {
                C10001g0.m42057u("Main", "errored", abstractC9988a.f45756b.m42135d());
                return;
            }
            return;
        }
        if (eVar == null) {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        abstractC9988a.mo41972b(bitmap, eVar);
        if (this.f45898n) {
            C10001g0.m42058v("Main", "completed", abstractC9988a.f45756b.m42135d(), "from " + eVar);
        }
    }

    /* renamed from: h */
    public void m42112h(AbstractC9988a abstractC9988a) {
        Object m41981k = abstractC9988a.m41981k();
        if (m41981k != null && this.f45893i.get(m41981k) != abstractC9988a) {
            m42106b(m41981k);
            this.f45893i.put(m41981k, abstractC9988a);
        }
        m42119o(abstractC9988a);
    }

    /* renamed from: i */
    public List<AbstractC10019y> m42113i() {
        return this.f45888d;
    }

    /* renamed from: j */
    public C10018x m42114j(int i10) {
        if (i10 != 0) {
            return new C10018x(this, null, i10);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }

    /* renamed from: k */
    public C10018x m42115k(Uri uri) {
        return new C10018x(this, uri, 0);
    }

    /* renamed from: l */
    public C10018x m42116l(String str) {
        if (str == null) {
            return new C10018x(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return m42115k(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* renamed from: m */
    public Bitmap m42117m(String str) {
        Bitmap bitmap = this.f45891g.get(str);
        C9989a0 c9989a0 = this.f45892h;
        if (bitmap != null) {
            c9989a0.m41988d();
        } else {
            c9989a0.m41989e();
        }
        return bitmap;
    }

    /* renamed from: n */
    public void m42118n(AbstractC9988a abstractC9988a) {
        Bitmap m42117m = EnumC10010p.shouldReadFromMemoryCache(abstractC9988a.f45759e) ? m42117m(abstractC9988a.m41974d()) : null;
        if (m42117m == null) {
            m42112h(abstractC9988a);
            if (this.f45898n) {
                C10001g0.m42057u("Main", "resumed", abstractC9988a.f45756b.m42135d());
                return;
            }
            return;
        }
        e eVar = e.MEMORY;
        m42111g(m42117m, eVar, abstractC9988a);
        if (this.f45898n) {
            C10001g0.m42058v("Main", "completed", abstractC9988a.f45756b.m42135d(), "from " + eVar);
        }
    }

    /* renamed from: o */
    public void m42119o(AbstractC9988a abstractC9988a) {
        this.f45890f.m42072h(abstractC9988a);
    }

    /* renamed from: p */
    public C10017w m42120p(C10017w c10017w) {
        C10017w mo42124a = this.f45886b.mo42124a(c10017w);
        if (mo42124a != null) {
            return mo42124a;
        }
        throw new IllegalStateException("Request transformer " + this.f45886b.getClass().getCanonicalName() + " returned null for " + c10017w);
    }
}
