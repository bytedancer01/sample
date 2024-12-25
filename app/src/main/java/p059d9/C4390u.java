package p059d9;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p059d9.C4376n;
import p059d9.C4390u;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/u.class
 */
/* renamed from: d9.u */
/* loaded from: combined.jar:classes2.jar:d9/u.class */
public final class C4390u<T> {

    /* renamed from: a */
    public final InterfaceC4354c f26656a;

    /* renamed from: b */
    public final InterfaceC4380p f26657b;

    /* renamed from: c */
    public final b<T> f26658c;

    /* renamed from: d */
    public final CopyOnWriteArraySet<c<T>> f26659d;

    /* renamed from: e */
    public final ArrayDeque<Runnable> f26660e;

    /* renamed from: f */
    public final ArrayDeque<Runnable> f26661f;

    /* renamed from: g */
    public boolean f26662g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d9/u$a.class
     */
    /* renamed from: d9.u$a */
    /* loaded from: combined.jar:classes2.jar:d9/u$a.class */
    public interface a<T> {
        /* renamed from: d */
        void mo22258d(T t10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d9/u$b.class
     */
    /* renamed from: d9.u$b */
    /* loaded from: combined.jar:classes2.jar:d9/u$b.class */
    public interface b<T> {
        /* renamed from: a */
        void mo22259a(T t10, C4376n c4376n);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d9/u$c.class
     */
    /* renamed from: d9.u$c */
    /* loaded from: combined.jar:classes2.jar:d9/u$c.class */
    public static final class c<T> {

        /* renamed from: a */
        public final T f26663a;

        /* renamed from: b */
        public C4376n.b f26664b = new C4376n.b();

        /* renamed from: c */
        public boolean f26665c;

        /* renamed from: d */
        public boolean f26666d;

        public c(T t10) {
            this.f26663a = t10;
        }

        /* renamed from: a */
        public void m22260a(int i10, a<T> aVar) {
            if (this.f26666d) {
                return;
            }
            if (i10 != -1) {
                this.f26664b.m22156a(i10);
            }
            this.f26665c = true;
            aVar.mo22258d(this.f26663a);
        }

        /* renamed from: b */
        public void m22261b(b<T> bVar) {
            if (this.f26666d || !this.f26665c) {
                return;
            }
            C4376n m22160e = this.f26664b.m22160e();
            this.f26664b = new C4376n.b();
            this.f26665c = false;
            bVar.mo22259a(this.f26663a, m22160e);
        }

        /* renamed from: c */
        public void m22262c(b<T> bVar) {
            this.f26666d = true;
            if (this.f26665c) {
                bVar.mo22259a(this.f26663a, this.f26664b.m22160e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f26663a.equals(((c) obj).f26663a);
        }

        public int hashCode() {
            return this.f26663a.hashCode();
        }
    }

    public C4390u(Looper looper, InterfaceC4354c interfaceC4354c, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, interfaceC4354c, bVar);
    }

    public C4390u(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, InterfaceC4354c interfaceC4354c, b<T> bVar) {
        this.f26656a = interfaceC4354c;
        this.f26659d = copyOnWriteArraySet;
        this.f26658c = bVar;
        this.f26660e = new ArrayDeque<>();
        this.f26661f = new ArrayDeque<>();
        this.f26657b = interfaceC4354c.mo21915d(looper, new Handler.Callback(this) { // from class: d9.s

            /* renamed from: b */
            public final C4390u f26644b;

            {
                this.f26644b = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m22253f;
                m22253f = this.f26644b.m22253f(message);
                return m22253f;
            }
        });
    }

    /* renamed from: g */
    public static /* synthetic */ void m22249g(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).m22260a(i10, aVar);
        }
    }

    /* renamed from: c */
    public void m22250c(T t10) {
        if (this.f26662g) {
            return;
        }
        C4349a.m21882e(t10);
        this.f26659d.add(new c<>(t10));
    }

    /* renamed from: d */
    public C4390u<T> m22251d(Looper looper, b<T> bVar) {
        return new C4390u<>(this.f26659d, looper, this.f26656a, bVar);
    }

    /* renamed from: e */
    public void m22252e() {
        if (this.f26661f.isEmpty()) {
            return;
        }
        if (!this.f26657b.mo22197c(0)) {
            InterfaceC4380p interfaceC4380p = this.f26657b;
            interfaceC4380p.mo22195a(interfaceC4380p.mo22196b(0));
        }
        boolean isEmpty = this.f26660e.isEmpty();
        this.f26660e.addAll(this.f26661f);
        this.f26661f.clear();
        if (!isEmpty) {
            return;
        }
        while (!this.f26660e.isEmpty()) {
            this.f26660e.peekFirst().run();
            this.f26660e.removeFirst();
        }
    }

    /* renamed from: f */
    public final boolean m22253f(Message message) {
        Iterator<c<T>> it = this.f26659d.iterator();
        while (it.hasNext()) {
            it.next().m22261b(this.f26658c);
            if (this.f26657b.mo22197c(0)) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: h */
    public void m22254h(final int i10, final a<T> aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f26659d);
        this.f26661f.add(new Runnable(copyOnWriteArraySet, i10, aVar) { // from class: d9.t

            /* renamed from: b */
            public final CopyOnWriteArraySet f26649b;

            /* renamed from: c */
            public final int f26650c;

            /* renamed from: d */
            public final C4390u.a f26651d;

            {
                this.f26649b = copyOnWriteArraySet;
                this.f26650c = i10;
                this.f26651d = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C4390u.m22249g(this.f26649b, this.f26650c, this.f26651d);
            }
        });
    }

    /* renamed from: i */
    public void m22255i() {
        Iterator<c<T>> it = this.f26659d.iterator();
        while (it.hasNext()) {
            it.next().m22262c(this.f26658c);
        }
        this.f26659d.clear();
        this.f26662g = true;
    }

    /* renamed from: j */
    public void m22256j(T t10) {
        Iterator<c<T>> it = this.f26659d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.f26663a.equals(t10)) {
                next.m22262c(this.f26658c);
                this.f26659d.remove(next);
            }
        }
    }

    /* renamed from: k */
    public void m22257k(int i10, a<T> aVar) {
        m22254h(i10, aVar);
        m22252e();
    }
}
