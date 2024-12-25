package p395x2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x2/o.class
 */
/* renamed from: x2.o */
/* loaded from: combined.jar:classes1.jar:x2/o.class */
public class C9636o {

    /* renamed from: a */
    public final AtomicInteger f44004a;

    /* renamed from: b */
    public final Set<AbstractC9635n<?>> f44005b;

    /* renamed from: c */
    public final PriorityBlockingQueue<AbstractC9635n<?>> f44006c;

    /* renamed from: d */
    public final PriorityBlockingQueue<AbstractC9635n<?>> f44007d;

    /* renamed from: e */
    public final InterfaceC9623b f44008e;

    /* renamed from: f */
    public final InterfaceC9629h f44009f;

    /* renamed from: g */
    public final InterfaceC9638q f44010g;

    /* renamed from: h */
    public final C9630i[] f44011h;

    /* renamed from: i */
    public C9624c f44012i;

    /* renamed from: j */
    public final List<a> f44013j;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x2/o$a.class
     */
    /* renamed from: x2.o$a */
    /* loaded from: combined.jar:classes1.jar:x2/o$a.class */
    public interface a<T> {
        /* renamed from: a */
        void m40572a(AbstractC9635n<T> abstractC9635n);
    }

    public C9636o(InterfaceC9623b interfaceC9623b, InterfaceC9629h interfaceC9629h) {
        this(interfaceC9623b, interfaceC9629h, 4);
    }

    public C9636o(InterfaceC9623b interfaceC9623b, InterfaceC9629h interfaceC9629h, int i10) {
        this(interfaceC9623b, interfaceC9629h, i10, new C9627f(new Handler(Looper.getMainLooper())));
    }

    public C9636o(InterfaceC9623b interfaceC9623b, InterfaceC9629h interfaceC9629h, int i10, InterfaceC9638q interfaceC9638q) {
        this.f44004a = new AtomicInteger();
        this.f44005b = new HashSet();
        this.f44006c = new PriorityBlockingQueue<>();
        this.f44007d = new PriorityBlockingQueue<>();
        this.f44013j = new ArrayList();
        this.f44008e = interfaceC9623b;
        this.f44009f = interfaceC9629h;
        this.f44011h = new C9630i[i10];
        this.f44010g = interfaceC9638q;
    }

    /* renamed from: a */
    public <T> AbstractC9635n<T> m40567a(AbstractC9635n<T> abstractC9635n) {
        abstractC9635n.m40541L(this);
        synchronized (this.f44005b) {
            this.f44005b.add(abstractC9635n);
        }
        abstractC9635n.m40543N(m40569c());
        abstractC9635n.m40546b("add-to-queue");
        (!abstractC9635n.m40544O() ? this.f44007d : this.f44006c).add(abstractC9635n);
        return abstractC9635n;
    }

    /* renamed from: b */
    public <T> void m40568b(AbstractC9635n<T> abstractC9635n) {
        synchronized (this.f44005b) {
            this.f44005b.remove(abstractC9635n);
        }
        synchronized (this.f44013j) {
            Iterator<a> it = this.f44013j.iterator();
            while (it.hasNext()) {
                it.next().m40572a(abstractC9635n);
            }
        }
    }

    /* renamed from: c */
    public int m40569c() {
        return this.f44004a.incrementAndGet();
    }

    /* renamed from: d */
    public void m40570d() {
        m40571e();
        C9624c c9624c = new C9624c(this.f44006c, this.f44007d, this.f44008e, this.f44010g);
        this.f44012i = c9624c;
        c9624c.start();
        for (int i10 = 0; i10 < this.f44011h.length; i10++) {
            C9630i c9630i = new C9630i(this.f44007d, this.f44009f, this.f44008e, this.f44010g);
            this.f44011h[i10] = c9630i;
            c9630i.start();
        }
    }

    /* renamed from: e */
    public void m40571e() {
        C9624c c9624c = this.f44012i;
        if (c9624c != null) {
            c9624c.m40506e();
        }
        for (C9630i c9630i : this.f44011h) {
            if (c9630i != null) {
                c9630i.m40525e();
            }
        }
    }
}
