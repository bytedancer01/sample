package p224n3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p004a3.C0053g;
import p004a3.InterfaceC0055i;
import p033c3.AbstractC0984d;
import p033c3.C0986f;
import p033c3.InterfaceC0983c;
import p072e3.C4603i;
import p072e3.InterfaceC4595a;
import p109g3.C4936b;
import p141i3.InterfaceC5168a;
import p141i3.InterfaceC5169b;
import p159j3.C5284b;
import p178k3.AbstractC5469h;
import p178k3.InterfaceC5470i;
import p178k3.InterfaceC5471j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n3/a.class
 */
/* renamed from: n3.a */
/* loaded from: combined.jar:classes1.jar:n3/a.class */
public final class C6643a implements InterfaceC5168a {

    /* renamed from: a */
    public final InterfaceC4595a f34627a;

    /* renamed from: b */
    public final InterfaceC0055i f34628b;

    /* renamed from: c */
    public final Executor f34629c;

    /* renamed from: d */
    public final C5284b f34630d;

    /* renamed from: e */
    public volatile boolean f34631e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n3/a$a.class
     */
    /* renamed from: n3.a$a */
    /* loaded from: combined.jar:classes1.jar:n3/a$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final InterfaceC5168a.c f34632b;

        /* renamed from: c */
        public final InterfaceC5168a.a f34633c;

        /* renamed from: d */
        public final InterfaceC5169b f34634d;

        /* renamed from: e */
        public final Executor f34635e;

        /* renamed from: f */
        public final C6643a f34636f;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:n3/a$a$a.class
         */
        /* renamed from: n3.a$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:n3/a$a$a.class */
        public class C10323a implements InterfaceC5168a.a {

            /* renamed from: a */
            public final a f34637a;

            public C10323a(a aVar) {
                this.f34637a = aVar;
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onCompleted() {
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onFailure(C4936b c4936b) {
                this.f34637a.f34633c.onFailure(c4936b);
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onFetch(InterfaceC5168a.b bVar) {
                this.f34637a.f34633c.onFetch(bVar);
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onResponse(InterfaceC5168a.d dVar) {
                if (this.f34637a.f34636f.f34631e) {
                    return;
                }
                try {
                    a aVar = this.f34637a;
                    Set m30634g = aVar.f34636f.m30634g(dVar, aVar.f34632b);
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(m30634g);
                    this.f34637a.f34636f.m30635h(hashSet);
                    this.f34637a.f34633c.onResponse(dVar);
                    this.f34637a.f34633c.onCompleted();
                } catch (Exception e10) {
                    throw e10;
                }
            }
        }

        public a(C6643a c6643a, InterfaceC5168a.c cVar, InterfaceC5168a.a aVar, InterfaceC5169b interfaceC5169b, Executor executor) {
            this.f34636f = c6643a;
            this.f34632b = cVar;
            this.f34633c = aVar;
            this.f34634d = interfaceC5169b;
            this.f34635e = executor;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f34636f.f34631e) {
                return;
            }
            InterfaceC5168a.c cVar = this.f34632b;
            if (!cVar.f29538d) {
                this.f34634d.mo25821a(cVar, this.f34635e, new C10323a(this));
                return;
            }
            this.f34633c.onFetch(InterfaceC5168a.b.CACHE);
            try {
                this.f34633c.onResponse(this.f34636f.m30636i(this.f34632b));
                this.f34633c.onCompleted();
            } catch (C4936b e10) {
                this.f34633c.onFailure(e10);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n3/a$b.class
     */
    /* renamed from: n3.a$b */
    /* loaded from: combined.jar:classes1.jar:n3/a$b.class */
    public class b implements InterfaceC0983c<Collection<C4603i>, List<C4603i>> {

        /* renamed from: a */
        public final InterfaceC5168a.c f34638a;

        /* renamed from: b */
        public final C6643a f34639b;

        public b(C6643a c6643a, InterfaceC5168a.c cVar) {
            this.f34639b = c6643a;
            this.f34638a = cVar;
        }

        @Override // p033c3.InterfaceC0983c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<C4603i> apply(Collection<C4603i> collection) {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator<C4603i> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m23215g().m23218c(this.f34638a.f29535a).m23217b());
            }
            return arrayList;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n3/a$c.class
     */
    /* renamed from: n3.a$c */
    /* loaded from: combined.jar:classes1.jar:n3/a$c.class */
    public class c implements InterfaceC5470i<InterfaceC5471j, Set<String>> {

        /* renamed from: a */
        public final AbstractC0984d f34640a;

        /* renamed from: b */
        public final InterfaceC5168a.c f34641b;

        /* renamed from: c */
        public final C6643a f34642c;

        public c(C6643a c6643a, AbstractC0984d abstractC0984d, InterfaceC5168a.c cVar) {
            this.f34642c = c6643a;
            this.f34640a = abstractC0984d;
            this.f34641b = cVar;
        }

        @Override // p178k3.InterfaceC5470i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Set<String> mo27249a(InterfaceC5471j interfaceC5471j) {
            return interfaceC5471j.mo27229a((Collection) this.f34640a.mo5881e(), this.f34641b.f29537c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n3/a$d.class
     */
    /* renamed from: n3.a$d */
    /* loaded from: combined.jar:classes1.jar:n3/a$d.class */
    public class d implements Runnable {

        /* renamed from: b */
        public final Set f34643b;

        /* renamed from: c */
        public final C6643a f34644c;

        public d(C6643a c6643a, Set set) {
            this.f34644c = c6643a;
            this.f34643b = set;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f34644c.f34627a.mo23172p(this.f34643b);
            } catch (Exception e10) {
                this.f34644c.f34630d.m26389d(e10, "Failed to publish cache changes", new Object[0]);
            }
        }
    }

    public C6643a(InterfaceC4595a interfaceC4595a, InterfaceC0055i interfaceC0055i, Executor executor, C5284b c5284b) {
        this.f34627a = (InterfaceC4595a) C0986f.m5892c(interfaceC4595a, "cache == null");
        this.f34628b = (InterfaceC0055i) C0986f.m5892c(interfaceC0055i, "responseFieldMapper == null");
        this.f34629c = (Executor) C0986f.m5892c(executor, "dispatcher == null");
        this.f34630d = (C5284b) C0986f.m5892c(c5284b, "logger == null");
    }

    @Override // p141i3.InterfaceC5168a
    public void dispose() {
        this.f34631e = true;
    }

    /* renamed from: g */
    public final Set<String> m30634g(InterfaceC5168a.d dVar, InterfaceC5168a.c cVar) {
        AbstractC0984d<V> mo5883g = dVar.f29546c.mo5883g(new b(this, cVar));
        if (!mo5883g.mo5882f()) {
            return Collections.emptySet();
        }
        try {
            return (Set) this.f34627a.mo23177v(new c(this, mo5883g, cVar));
        } catch (Exception e10) {
            this.f34630d.m26388c("Failed to cache operation response", e10);
            return Collections.emptySet();
        }
    }

    /* renamed from: h */
    public final void m30635h(Set<String> set) {
        this.f34629c.execute(new d(this, set));
    }

    /* renamed from: i */
    public final InterfaceC5168a.d m30636i(InterfaceC5168a.c cVar) {
        AbstractC5469h<C4603i> mo23165h = this.f34627a.mo23165h();
        C0053g c0053g = (C0053g) this.f34627a.mo23161c(cVar.f29536b, this.f34628b, mo23165h, cVar.f29537c).m23188c();
        if (c0053g.m211b() != null) {
            this.f34630d.m26386a("Cache HIT for operation %s", cVar.f29536b);
            return new InterfaceC5168a.d(null, c0053g, mo23165h.mo27271c());
        }
        this.f34630d.m26386a("Cache MISS for operation %s", cVar.f29536b);
        throw new C4936b(String.format("Cache miss for operation %s", cVar.f29536b));
    }

    @Override // p141i3.InterfaceC5168a
    public void interceptAsync(InterfaceC5168a.c cVar, InterfaceC5169b interfaceC5169b, Executor executor, InterfaceC5168a.a aVar) {
        executor.execute(new a(this, cVar, aVar, interfaceC5169b, executor));
    }
}
