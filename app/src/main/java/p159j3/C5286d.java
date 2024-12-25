package p159j3;

import com.amazonaws.mobileconnectors.appsync.AppSyncQueryWatcher;
import com.amazonaws.mobileconnectors.appsync.fetcher.AppSyncResponseFetchers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p004a3.C0053g;
import p004a3.InterfaceC0051e;
import p004a3.InterfaceC0052f;
import p021b3.C0790b;
import p053d3.C4301a;
import p072e3.InterfaceC4595a;
import p109g3.C4936b;
import p141i3.InterfaceC5168a;
import p173ji.C5433x;
import p173ji.InterfaceC5407e;
import p264p3.C7550d;
import p434z2.InterfaceC10034c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j3/d.class
 */
/* renamed from: j3.d */
/* loaded from: combined.jar:classes1.jar:j3/d.class */
public final class C5286d {

    /* renamed from: a */
    public final C5284b f30336a;

    /* renamed from: b */
    public final List<C5287e> f30337b;

    /* renamed from: c */
    public List<InterfaceC0051e> f30338c;

    /* renamed from: d */
    public C5283a f30339d;

    /* renamed from: e */
    public final AtomicBoolean f30340e = new AtomicBoolean();

    /* renamed from: f */
    public c f30341f;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:j3/d$a.class
     */
    /* renamed from: j3.d$a */
    /* loaded from: combined.jar:classes1.jar:j3/d$a.class */
    public class a extends InterfaceC10034c.a {

        /* renamed from: a */
        public final AtomicInteger f30342a;

        /* renamed from: b */
        public final c f30343b;

        /* renamed from: c */
        public final C5287e f30344c;

        /* renamed from: d */
        public final C5286d f30345d;

        public a(C5286d c5286d, AtomicInteger atomicInteger, c cVar, C5287e c5287e) {
            this.f30345d = c5286d;
            this.f30342a = atomicInteger;
            this.f30343b = cVar;
            this.f30344c = c5287e;
        }

        @Override // p434z2.InterfaceC10034c.a
        public void onFailure(C4936b c4936b) {
            c cVar;
            if (this.f30345d.f30336a != null) {
                this.f30345d.f30336a.m26389d(c4936b, "Failed to fetch query: %s", this.f30344c.f30357a);
            }
            if (this.f30342a.decrementAndGet() != 0 || (cVar = this.f30343b) == null) {
                return;
            }
            cVar.m26413a();
        }

        @Override // p434z2.InterfaceC10034c.a
        public void onResponse(C0053g c0053g) {
            c cVar;
            if (this.f30342a.decrementAndGet() != 0 || (cVar = this.f30343b) == null) {
                return;
            }
            cVar.m26413a();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:j3/d$b.class
     */
    /* renamed from: j3.d$b */
    /* loaded from: combined.jar:classes1.jar:j3/d$b.class */
    public static final class b {

        /* renamed from: a */
        public List<InterfaceC0052f> f30346a;

        /* renamed from: b */
        public List<InterfaceC0051e> f30347b;

        /* renamed from: c */
        public C5433x f30348c;

        /* renamed from: d */
        public InterfaceC5407e.a f30349d;

        /* renamed from: e */
        public C5291i f30350e;

        /* renamed from: f */
        public C7550d f30351f;

        /* renamed from: g */
        public InterfaceC4595a f30352g;

        /* renamed from: h */
        public Executor f30353h;

        /* renamed from: i */
        public C5284b f30354i;

        /* renamed from: j */
        public List<InterfaceC5168a> f30355j;

        /* renamed from: k */
        public C5283a f30356k;

        public b() {
            this.f30346a = Collections.emptyList();
            this.f30347b = Collections.emptyList();
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: a */
        public b m26401a(InterfaceC4595a interfaceC4595a) {
            this.f30352g = interfaceC4595a;
            return this;
        }

        /* renamed from: b */
        public b m26402b(List<InterfaceC5168a> list) {
            this.f30355j = list;
            return this;
        }

        /* renamed from: c */
        public C5286d m26403c() {
            return new C5286d(this);
        }

        /* renamed from: d */
        public b m26404d(C5283a c5283a) {
            this.f30356k = c5283a;
            return this;
        }

        /* renamed from: e */
        public b m26405e(Executor executor) {
            this.f30353h = executor;
            return this;
        }

        /* renamed from: f */
        public b m26406f(InterfaceC5407e.a aVar) {
            this.f30349d = aVar;
            return this;
        }

        /* renamed from: g */
        public b m26407g(C5284b c5284b) {
            this.f30354i = c5284b;
            return this;
        }

        /* renamed from: h */
        public b m26408h(List<InterfaceC0052f> list) {
            if (list == null) {
                list = Collections.emptyList();
            }
            this.f30346a = list;
            return this;
        }

        /* renamed from: i */
        public b m26409i(List<InterfaceC0051e> list) {
            if (list == null) {
                list = Collections.emptyList();
            }
            this.f30347b = list;
            return this;
        }

        /* renamed from: j */
        public b m26410j(C5291i c5291i) {
            this.f30350e = c5291i;
            return this;
        }

        /* renamed from: k */
        public b m26411k(C7550d c7550d) {
            this.f30351f = c7550d;
            return this;
        }

        /* renamed from: l */
        public b m26412l(C5433x c5433x) {
            this.f30348c = c5433x;
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:j3/d$c.class
     */
    /* renamed from: j3.d$c */
    /* loaded from: combined.jar:classes1.jar:j3/d$c.class */
    public interface c {
        /* renamed from: a */
        void m26413a();
    }

    public C5286d(b bVar) {
        this.f30336a = bVar.f30354i;
        this.f30337b = new ArrayList(bVar.f30346a.size());
        Iterator<InterfaceC0052f> it = bVar.f30346a.iterator();
        while (it.hasNext()) {
            this.f30337b.add(C5287e.m26416d().m26440j(it.next()).m26448r(bVar.f30348c).m26438h(bVar.f30349d).m26445o(bVar.f30350e).m26446p(bVar.f30351f).m26431a(bVar.f30352g).m26437g(C0790b.f5521b).m26444n(AppSyncResponseFetchers.NETWORK_ONLY).m26434d(C4301a.f26420b).m26439i(bVar.f30354i).m26432b(bVar.f30355j).m26450t(bVar.f30356k).m26435e(bVar.f30353h).m26433c());
        }
        this.f30338c = bVar.f30347b;
        this.f30339d = bVar.f30356k;
    }

    /* renamed from: b */
    public static b m26396b() {
        return new b(null);
    }

    /* renamed from: c */
    public void m26397c() {
        Iterator<C5287e> it = this.f30337b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* renamed from: d */
    public void m26398d() {
        if (!this.f30340e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        m26400f();
        m26399e();
    }

    /* renamed from: e */
    public final void m26399e() {
        c cVar = this.f30341f;
        AtomicInteger atomicInteger = new AtomicInteger(this.f30337b.size());
        for (C5287e c5287e : this.f30337b) {
            c5287e.enqueue(new a(this, atomicInteger, cVar, c5287e));
        }
    }

    /* renamed from: f */
    public final void m26400f() {
        try {
            Iterator<InterfaceC0051e> it = this.f30338c.iterator();
            while (it.hasNext()) {
                Iterator<AppSyncQueryWatcher> it2 = this.f30339d.m26372b(it.next()).iterator();
                while (it2.hasNext()) {
                    it2.next().refetch();
                }
            }
        } catch (Exception e10) {
            this.f30336a.m26389d(e10, "Failed to re-fetch query watcher", new Object[0]);
        }
    }
}
