package p435z3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p299r4.InterfaceC7957e;
import p363v4.C9242h;
import p396x3.InterfaceC9646c;
import p435z3.RunnableC10045i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:z3/d.class
 */
/* renamed from: z3.d */
/* loaded from: combined.jar:classes1.jar:z3/d.class */
public class C10040d implements RunnableC10045i.a {

    /* renamed from: q */
    public static final b f46068q = new b();

    /* renamed from: r */
    public static final Handler f46069r = new Handler(Looper.getMainLooper(), new c());

    /* renamed from: a */
    public final List<InterfaceC7957e> f46070a;

    /* renamed from: b */
    public final b f46071b;

    /* renamed from: c */
    public final InterfaceC10041e f46072c;

    /* renamed from: d */
    public final InterfaceC9646c f46073d;

    /* renamed from: e */
    public final ExecutorService f46074e;

    /* renamed from: f */
    public final ExecutorService f46075f;

    /* renamed from: g */
    public final boolean f46076g;

    /* renamed from: h */
    public boolean f46077h;

    /* renamed from: i */
    public InterfaceC10048l<?> f46078i;

    /* renamed from: j */
    public boolean f46079j;

    /* renamed from: k */
    public Exception f46080k;

    /* renamed from: l */
    public boolean f46081l;

    /* renamed from: m */
    public Set<InterfaceC7957e> f46082m;

    /* renamed from: n */
    public RunnableC10045i f46083n;

    /* renamed from: o */
    public C10044h<?> f46084o;

    /* renamed from: p */
    public volatile Future<?> f46085p;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:z3/d$b.class
     */
    /* renamed from: z3.d$b */
    /* loaded from: combined.jar:classes1.jar:z3/d$b.class */
    public static class b {
        /* renamed from: a */
        public <R> C10044h<R> m42247a(InterfaceC10048l<R> interfaceC10048l, boolean z10) {
            return new C10044h<>(interfaceC10048l, z10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:z3/d$c.class
     */
    /* renamed from: z3.d$c */
    /* loaded from: combined.jar:classes1.jar:z3/d$c.class */
    public static class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (1 != i10 && 2 != i10) {
                return false;
            }
            C10040d c10040d = (C10040d) message.obj;
            if (1 == i10) {
                c10040d.m42243j();
                return true;
            }
            c10040d.m42242i();
            return true;
        }
    }

    public C10040d(InterfaceC9646c interfaceC9646c, ExecutorService executorService, ExecutorService executorService2, boolean z10, InterfaceC10041e interfaceC10041e) {
        this(interfaceC9646c, executorService, executorService2, z10, interfaceC10041e, f46068q);
    }

    public C10040d(InterfaceC9646c interfaceC9646c, ExecutorService executorService, ExecutorService executorService2, boolean z10, InterfaceC10041e interfaceC10041e, b bVar) {
        this.f46070a = new ArrayList();
        this.f46073d = interfaceC9646c;
        this.f46074e = executorService;
        this.f46075f = executorService2;
        this.f46076g = z10;
        this.f46072c = interfaceC10041e;
        this.f46071b = bVar;
    }

    @Override // p299r4.InterfaceC7957e
    /* renamed from: a */
    public void mo34484a(Exception exc) {
        this.f46080k = exc;
        f46069r.obtainMessage(2, this).sendToTarget();
    }

    /* renamed from: d */
    public void m42238d(InterfaceC7957e interfaceC7957e) {
        C9242h.m38963a();
        if (this.f46079j) {
            interfaceC7957e.mo34488e(this.f46084o);
        } else if (this.f46081l) {
            interfaceC7957e.mo34484a(this.f46080k);
        } else {
            this.f46070a.add(interfaceC7957e);
        }
    }

    @Override // p299r4.InterfaceC7957e
    /* renamed from: e */
    public void mo34488e(InterfaceC10048l<?> interfaceC10048l) {
        this.f46078i = interfaceC10048l;
        f46069r.obtainMessage(1, this).sendToTarget();
    }

    /* renamed from: f */
    public final void m42239f(InterfaceC7957e interfaceC7957e) {
        if (this.f46082m == null) {
            this.f46082m = new HashSet();
        }
        this.f46082m.add(interfaceC7957e);
    }

    @Override // p435z3.RunnableC10045i.a
    /* renamed from: g */
    public void mo42240g(RunnableC10045i runnableC10045i) {
        this.f46085p = this.f46075f.submit(runnableC10045i);
    }

    /* renamed from: h */
    public void m42241h() {
        if (this.f46081l || this.f46079j || this.f46077h) {
            return;
        }
        this.f46083n.m42254a();
        Future<?> future = this.f46085p;
        if (future != null) {
            future.cancel(true);
        }
        this.f46077h = true;
        this.f46072c.mo42226d(this, this.f46073d);
    }

    /* renamed from: i */
    public final void m42242i() {
        if (this.f46077h) {
            return;
        }
        if (this.f46070a.isEmpty()) {
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        }
        this.f46081l = true;
        this.f46072c.mo42225c(this.f46073d, null);
        for (InterfaceC7957e interfaceC7957e : this.f46070a) {
            if (!m42244k(interfaceC7957e)) {
                interfaceC7957e.mo34484a(this.f46080k);
            }
        }
    }

    /* renamed from: j */
    public final void m42243j() {
        if (this.f46077h) {
            this.f46078i.mo25232b();
            return;
        }
        if (this.f46070a.isEmpty()) {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        }
        C10044h<?> m42247a = this.f46071b.m42247a(this.f46078i, this.f46076g);
        this.f46084o = m42247a;
        this.f46079j = true;
        m42247a.m42250a();
        this.f46072c.mo42225c(this.f46073d, this.f46084o);
        for (InterfaceC7957e interfaceC7957e : this.f46070a) {
            if (!m42244k(interfaceC7957e)) {
                this.f46084o.m42250a();
                interfaceC7957e.mo34488e(this.f46084o);
            }
        }
        this.f46084o.m42252d();
    }

    /* renamed from: k */
    public final boolean m42244k(InterfaceC7957e interfaceC7957e) {
        Set<InterfaceC7957e> set = this.f46082m;
        return set != null && set.contains(interfaceC7957e);
    }

    /* renamed from: l */
    public void m42245l(InterfaceC7957e interfaceC7957e) {
        C9242h.m38963a();
        if (this.f46079j || this.f46081l) {
            m42239f(interfaceC7957e);
            return;
        }
        this.f46070a.remove(interfaceC7957e);
        if (this.f46070a.isEmpty()) {
            m42241h();
        }
    }

    /* renamed from: m */
    public void m42246m(RunnableC10045i runnableC10045i) {
        this.f46083n = runnableC10045i;
        this.f46085p = this.f46074e.submit(runnableC10045i);
    }
}
