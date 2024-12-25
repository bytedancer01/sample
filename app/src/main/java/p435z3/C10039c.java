package p435z3;

import android.os.Looper;
import android.os.MessageQueue;
import android.util.Log;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p022b4.C0792b;
import p022b4.InterfaceC0791a;
import p022b4.InterfaceC0798h;
import p225n4.InterfaceC6650c;
import p280q4.InterfaceC7753b;
import p299r4.InterfaceC7957e;
import p329t3.EnumC8619i;
import p363v4.C9238d;
import p363v4.C9242h;
import p396x3.InterfaceC9646c;
import p396x3.InterfaceC9650g;
import p416y3.InterfaceC9817c;
import p435z3.C10037a;
import p435z3.C10044h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:z3/c.class
 */
/* renamed from: z3.c */
/* loaded from: combined.jar:classes1.jar:z3/c.class */
public class C10039c implements InterfaceC10041e, InterfaceC0798h.a, C10044h.a {

    /* renamed from: a */
    public final Map<InterfaceC9646c, C10040d> f46050a;

    /* renamed from: b */
    public final C10043g f46051b;

    /* renamed from: c */
    public final InterfaceC0798h f46052c;

    /* renamed from: d */
    public final a f46053d;

    /* renamed from: e */
    public final Map<InterfaceC9646c, WeakReference<C10044h<?>>> f46054e;

    /* renamed from: f */
    public final C10049m f46055f;

    /* renamed from: g */
    public final b f46056g;

    /* renamed from: h */
    public ReferenceQueue<C10044h<?>> f46057h;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:z3/c$a.class
     */
    /* renamed from: z3.c$a */
    /* loaded from: combined.jar:classes1.jar:z3/c$a.class */
    public static class a {

        /* renamed from: a */
        public final ExecutorService f46058a;

        /* renamed from: b */
        public final ExecutorService f46059b;

        /* renamed from: c */
        public final InterfaceC10041e f46060c;

        public a(ExecutorService executorService, ExecutorService executorService2, InterfaceC10041e interfaceC10041e) {
            this.f46058a = executorService;
            this.f46059b = executorService2;
            this.f46060c = interfaceC10041e;
        }

        /* renamed from: a */
        public C10040d m42233a(InterfaceC9646c interfaceC9646c, boolean z10) {
            return new C10040d(interfaceC9646c, this.f46058a, this.f46059b, z10, this.f46060c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:z3/c$b.class
     */
    /* renamed from: z3.c$b */
    /* loaded from: combined.jar:classes1.jar:z3/c$b.class */
    public static class b implements C10037a.a {

        /* renamed from: a */
        public final InterfaceC0791a.a f46061a;

        /* renamed from: b */
        public volatile InterfaceC0791a f46062b;

        public b(InterfaceC0791a.a aVar) {
            this.f46061a = aVar;
        }

        @Override // p435z3.C10037a.a
        /* renamed from: a */
        public InterfaceC0791a mo42221a() {
            if (this.f46062b == null) {
                synchronized (this) {
                    if (this.f46062b == null) {
                        this.f46062b = this.f46061a.build();
                    }
                    if (this.f46062b == null) {
                        this.f46062b = new C0792b();
                    }
                }
            }
            return this.f46062b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:z3/c$c.class
     */
    /* renamed from: z3.c$c */
    /* loaded from: combined.jar:classes1.jar:z3/c$c.class */
    public static class c {

        /* renamed from: a */
        public final C10040d f46063a;

        /* renamed from: b */
        public final InterfaceC7957e f46064b;

        public c(InterfaceC7957e interfaceC7957e, C10040d c10040d) {
            this.f46064b = interfaceC7957e;
            this.f46063a = c10040d;
        }

        /* renamed from: a */
        public void m42234a() {
            this.f46063a.m42245l(this.f46064b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:z3/c$d.class
     */
    /* renamed from: z3.c$d */
    /* loaded from: combined.jar:classes1.jar:z3/c$d.class */
    public static class d implements MessageQueue.IdleHandler {

        /* renamed from: a */
        public final Map<InterfaceC9646c, WeakReference<C10044h<?>>> f46065a;

        /* renamed from: b */
        public final ReferenceQueue<C10044h<?>> f46066b;

        public d(Map<InterfaceC9646c, WeakReference<C10044h<?>>> map, ReferenceQueue<C10044h<?>> referenceQueue) {
            this.f46065a = map;
            this.f46066b = referenceQueue;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            e eVar = (e) this.f46066b.poll();
            if (eVar == null) {
                return true;
            }
            this.f46065a.remove(eVar.f46067a);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:z3/c$e.class
     */
    /* renamed from: z3.c$e */
    /* loaded from: combined.jar:classes1.jar:z3/c$e.class */
    public static class e extends WeakReference<C10044h<?>> {

        /* renamed from: a */
        public final InterfaceC9646c f46067a;

        public e(InterfaceC9646c interfaceC9646c, C10044h<?> c10044h, ReferenceQueue<? super C10044h<?>> referenceQueue) {
            super(c10044h, referenceQueue);
            this.f46067a = interfaceC9646c;
        }
    }

    public C10039c(InterfaceC0798h interfaceC0798h, InterfaceC0791a.a aVar, ExecutorService executorService, ExecutorService executorService2) {
        this(interfaceC0798h, aVar, executorService, executorService2, null, null, null, null, null);
    }

    public C10039c(InterfaceC0798h interfaceC0798h, InterfaceC0791a.a aVar, ExecutorService executorService, ExecutorService executorService2, Map<InterfaceC9646c, C10040d> map, C10043g c10043g, Map<InterfaceC9646c, WeakReference<C10044h<?>>> map2, a aVar2, C10049m c10049m) {
        this.f46052c = interfaceC0798h;
        this.f46056g = new b(aVar);
        this.f46054e = map2 == null ? new HashMap() : map2;
        this.f46051b = c10043g == null ? new C10043g() : c10043g;
        this.f46050a = map == null ? new HashMap() : map;
        this.f46053d = aVar2 == null ? new a(executorService, executorService2, this) : aVar2;
        this.f46055f = c10049m == null ? new C10049m() : c10049m;
        interfaceC0798h.mo5103e(this);
    }

    /* renamed from: j */
    public static void m42223j(String str, long j10, InterfaceC9646c interfaceC9646c) {
        Log.v("Engine", str + " in " + C9238d.m38951a(j10) + "ms, key: " + interfaceC9646c);
    }

    @Override // p022b4.InterfaceC0798h.a
    /* renamed from: a */
    public void mo5109a(InterfaceC10048l<?> interfaceC10048l) {
        C9242h.m38963a();
        this.f46055f.m42262a(interfaceC10048l);
    }

    @Override // p435z3.C10044h.a
    /* renamed from: b */
    public void mo42224b(InterfaceC9646c interfaceC9646c, C10044h c10044h) {
        C9242h.m38963a();
        this.f46054e.remove(interfaceC9646c);
        if (c10044h.m42251c()) {
            this.f46052c.mo5102d(interfaceC9646c, c10044h);
        } else {
            this.f46055f.m42262a(c10044h);
        }
    }

    @Override // p435z3.InterfaceC10041e
    /* renamed from: c */
    public void mo42225c(InterfaceC9646c interfaceC9646c, C10044h<?> c10044h) {
        C9242h.m38963a();
        if (c10044h != null) {
            c10044h.m42253e(interfaceC9646c, this);
            if (c10044h.m42251c()) {
                this.f46054e.put(interfaceC9646c, new e(interfaceC9646c, c10044h, m42228f()));
            }
        }
        this.f46050a.remove(interfaceC9646c);
    }

    @Override // p435z3.InterfaceC10041e
    /* renamed from: d */
    public void mo42226d(C10040d c10040d, InterfaceC9646c interfaceC9646c) {
        C9242h.m38963a();
        if (c10040d.equals(this.f46050a.get(interfaceC9646c))) {
            this.f46050a.remove(interfaceC9646c);
        }
    }

    /* renamed from: e */
    public final C10044h<?> m42227e(InterfaceC9646c interfaceC9646c) {
        InterfaceC10048l<?> mo5100a = this.f46052c.mo5100a(interfaceC9646c);
        return mo5100a == null ? null : mo5100a instanceof C10044h ? (C10044h) mo5100a : new C10044h<>(mo5100a, true);
    }

    /* renamed from: f */
    public final ReferenceQueue<C10044h<?>> m42228f() {
        if (this.f46057h == null) {
            this.f46057h = new ReferenceQueue<>();
            Looper.myQueue().addIdleHandler(new d(this.f46054e, this.f46057h));
        }
        return this.f46057h;
    }

    /* renamed from: g */
    public <T, Z, R> c m42229g(InterfaceC9646c interfaceC9646c, int i10, int i11, InterfaceC9817c<T> interfaceC9817c, InterfaceC7753b<T, Z> interfaceC7753b, InterfaceC9650g<Z> interfaceC9650g, InterfaceC6650c<Z, R> interfaceC6650c, EnumC8619i enumC8619i, boolean z10, EnumC10038b enumC10038b, InterfaceC7957e interfaceC7957e) {
        C9242h.m38963a();
        long m38952b = C9238d.m38952b();
        C10042f m42249a = this.f46051b.m42249a(interfaceC9817c.getId(), interfaceC9646c, i10, i11, interfaceC7753b.mo25842e(), interfaceC7753b.mo25841d(), interfaceC9650g, interfaceC7753b.mo25840c(), interfaceC6650c, interfaceC7753b.mo25839a());
        C10044h<?> m42231i = m42231i(m42249a, z10);
        if (m42231i != null) {
            interfaceC7957e.mo34488e(m42231i);
            if (!Log.isLoggable("Engine", 2)) {
                return null;
            }
            m42223j("Loaded resource from cache", m38952b, m42249a);
            return null;
        }
        C10044h<?> m42230h = m42230h(m42249a, z10);
        if (m42230h != null) {
            interfaceC7957e.mo34488e(m42230h);
            if (!Log.isLoggable("Engine", 2)) {
                return null;
            }
            m42223j("Loaded resource from active resources", m38952b, m42249a);
            return null;
        }
        C10040d c10040d = this.f46050a.get(m42249a);
        if (c10040d != null) {
            c10040d.m42238d(interfaceC7957e);
            if (Log.isLoggable("Engine", 2)) {
                m42223j("Added to existing load", m38952b, m42249a);
            }
            return new c(interfaceC7957e, c10040d);
        }
        C10040d m42233a = this.f46053d.m42233a(m42249a, z10);
        RunnableC10045i runnableC10045i = new RunnableC10045i(m42233a, new C10037a(m42249a, i10, i11, interfaceC9817c, interfaceC7753b, interfaceC9650g, interfaceC6650c, this.f46056g, enumC10038b, enumC8619i), enumC8619i);
        this.f46050a.put(m42249a, m42233a);
        m42233a.m42238d(interfaceC7957e);
        m42233a.m42246m(runnableC10045i);
        if (Log.isLoggable("Engine", 2)) {
            m42223j("Started new load", m38952b, m42249a);
        }
        return new c(interfaceC7957e, m42233a);
    }

    /* renamed from: h */
    public final C10044h<?> m42230h(InterfaceC9646c interfaceC9646c, boolean z10) {
        C10044h<?> c10044h = null;
        if (!z10) {
            return null;
        }
        WeakReference<C10044h<?>> weakReference = this.f46054e.get(interfaceC9646c);
        if (weakReference != null) {
            c10044h = weakReference.get();
            if (c10044h != null) {
                c10044h.m42250a();
            } else {
                this.f46054e.remove(interfaceC9646c);
            }
        }
        return c10044h;
    }

    /* renamed from: i */
    public final C10044h<?> m42231i(InterfaceC9646c interfaceC9646c, boolean z10) {
        if (!z10) {
            return null;
        }
        C10044h<?> m42227e = m42227e(interfaceC9646c);
        if (m42227e != null) {
            m42227e.m42250a();
            this.f46054e.put(interfaceC9646c, new e(interfaceC9646c, m42227e, m42228f()));
        }
        return m42227e;
    }

    /* renamed from: k */
    public void m42232k(InterfaceC10048l interfaceC10048l) {
        C9242h.m38963a();
        if (!(interfaceC10048l instanceof C10044h)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C10044h) interfaceC10048l).m42252d();
    }
}
