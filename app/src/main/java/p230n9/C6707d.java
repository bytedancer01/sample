package p230n9;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;
import ma.HandlerC6385s1;
import p200l9.C5797q;
import p230n9.C6721i;
import p304r9.C8013a;
import p304r9.C8015b;
import p368v9.AbstractC9317c;
import p368v9.InterfaceC9320f;
import p368v9.InterfaceC9321g;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/d.class
 */
/* renamed from: n9.d */
/* loaded from: combined.jar:classes2.jar:n9/d.class */
public class C6707d {

    /* renamed from: b */
    public long f35076b;

    /* renamed from: c */
    public final C6721i f35077c;

    /* renamed from: f */
    public LruCache f35080f;

    /* renamed from: l */
    public AbstractC9317c f35086l;

    /* renamed from: m */
    public AbstractC9317c f35087m;

    /* renamed from: n */
    public final Set f35088n = Collections.synchronizedSet(new HashSet());

    /* renamed from: a */
    public final C8015b f35075a = new C8015b("MediaQueue");

    /* renamed from: i */
    public final int f35083i = Math.max(20, 1);

    /* renamed from: d */
    public List f35078d = new ArrayList();

    /* renamed from: e */
    public final SparseIntArray f35079e = new SparseIntArray();

    /* renamed from: g */
    public final List f35081g = new ArrayList();

    /* renamed from: h */
    public final Deque f35082h = new ArrayDeque(20);

    /* renamed from: j */
    public final Handler f35084j = new HandlerC6385s1(Looper.getMainLooper());

    /* renamed from: k */
    public final TimerTask f35085k = new C6709d1(this);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:n9/d$a.class
     */
    /* renamed from: n9.d$a */
    /* loaded from: combined.jar:classes2.jar:n9/d$a.class */
    public static abstract class a {
        /* renamed from: a */
        public void m30902a(int i10, int i11) {
        }

        /* renamed from: b */
        public void m30903b() {
        }

        /* renamed from: c */
        public void m30904c(int[] iArr) {
        }

        /* renamed from: d */
        public void m30905d(List<Integer> list, int i10) {
        }

        /* renamed from: e */
        public void m30906e(int[] iArr) {
        }

        /* renamed from: f */
        public void m30907f() {
        }

        /* renamed from: g */
        public void m30908g() {
        }
    }

    public C6707d(C6721i c6721i, int i10, int i11) {
        this.f35077c = c6721i;
        c6721i.m30986M(new C6715f1(this));
        m30897v(20);
        this.f35076b = m30893r();
        m30892q();
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ void m30879g(C6707d c6707d, int i10, int i11) {
        synchronized (c6707d.f35088n) {
            Iterator it = c6707d.f35088n.iterator();
            while (it.hasNext()) {
                ((a) it.next()).m30902a(i10, i11);
            }
        }
    }

    /* renamed from: h */
    public static /* bridge */ /* synthetic */ void m30880h(C6707d c6707d, int[] iArr) {
        synchronized (c6707d.f35088n) {
            Iterator it = c6707d.f35088n.iterator();
            while (it.hasNext()) {
                ((a) it.next()).m30904c(iArr);
            }
        }
    }

    /* renamed from: i */
    public static /* bridge */ /* synthetic */ void m30881i(C6707d c6707d, List list, int i10) {
        synchronized (c6707d.f35088n) {
            Iterator it = c6707d.f35088n.iterator();
            while (it.hasNext()) {
                ((a) it.next()).m30905d(list, i10);
            }
        }
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ void m30884l(final C6707d c6707d) {
        if (c6707d.f35082h.isEmpty() || c6707d.f35086l != null || c6707d.f35076b == 0) {
            return;
        }
        AbstractC9317c m31003e0 = c6707d.f35077c.m31003e0(C8013a.m34871l(c6707d.f35082h));
        c6707d.f35086l = m31003e0;
        m31003e0.mo13141d(new InterfaceC9321g(c6707d) { // from class: n9.c1

            /* renamed from: a */
            public final C6707d f35074a;

            {
                this.f35074a = c6707d;
            }

            @Override // p368v9.InterfaceC9321g
            /* renamed from: a */
            public final void mo30871a(InterfaceC9320f interfaceC9320f) {
                this.f35074a.m30891p((C6721i.c) interfaceC9320f);
            }
        });
        c6707d.f35082h.clear();
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m30885m(C6707d c6707d) {
        c6707d.f35079e.clear();
        for (int i10 = 0; i10 < c6707d.f35078d.size(); i10++) {
            c6707d.f35079e.put(((Integer) c6707d.f35078d.get(i10)).intValue(), i10);
        }
    }

    /* renamed from: A */
    public final void m30886A() {
        m30894s();
        this.f35084j.postDelayed(this.f35085k, 500L);
    }

    /* renamed from: a */
    public int m30887a(int i10) {
        C9935o.m41845e("Must be called from the main thread.");
        return this.f35079e.get(i10, -1);
    }

    /* renamed from: b */
    public int m30888b(int i10) {
        C9935o.m41845e("Must be called from the main thread.");
        if (i10 < 0 || i10 >= this.f35078d.size()) {
            return 0;
        }
        return ((Integer) this.f35078d.get(i10)).intValue();
    }

    /* renamed from: n */
    public final void m30889n() {
        m30901z();
        this.f35078d.clear();
        this.f35079e.clear();
        this.f35080f.evictAll();
        this.f35081g.clear();
        m30894s();
        this.f35082h.clear();
        m30895t();
        m30896u();
        m30899x();
        m30898w();
    }

    /* renamed from: o */
    public final void m30890o(C6721i.c cVar) {
        Status mo13127w = cVar.mo13127w();
        int m13122Q = mo13127w.m13122Q();
        if (m13122Q != 0) {
            this.f35075a.m34878f(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", Integer.valueOf(m13122Q), mo13127w.m13123R()), new Object[0]);
        }
        this.f35087m = null;
        if (this.f35082h.isEmpty()) {
            return;
        }
        m30886A();
    }

    /* renamed from: p */
    public final void m30891p(C6721i.c cVar) {
        Status mo13127w = cVar.mo13127w();
        int m13122Q = mo13127w.m13122Q();
        if (m13122Q != 0) {
            this.f35075a.m34878f(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", Integer.valueOf(m13122Q), mo13127w.m13123R()), new Object[0]);
        }
        this.f35086l = null;
        if (this.f35082h.isEmpty()) {
            return;
        }
        m30886A();
    }

    /* renamed from: q */
    public final void m30892q() {
        C9935o.m41845e("Must be called from the main thread.");
        if (this.f35076b != 0 && this.f35087m == null) {
            m30895t();
            m30896u();
            AbstractC9317c m31001d0 = this.f35077c.m31001d0();
            this.f35087m = m31001d0;
            m31001d0.mo13141d(new InterfaceC9321g(this) { // from class: n9.b1

                /* renamed from: a */
                public final C6707d f35070a;

                {
                    this.f35070a = this;
                }

                @Override // p368v9.InterfaceC9321g
                /* renamed from: a */
                public final void mo30871a(InterfaceC9320f interfaceC9320f) {
                    this.f35070a.m30890o((C6721i.c) interfaceC9320f);
                }
            });
        }
    }

    /* renamed from: r */
    public final long m30893r() {
        C5797q m31012l = this.f35077c.m31012l();
        if (m31012l == null || m31012l.m28334t0()) {
            return 0L;
        }
        return m31012l.m28333s0();
    }

    /* renamed from: s */
    public final void m30894s() {
        this.f35084j.removeCallbacks(this.f35085k);
    }

    /* renamed from: t */
    public final void m30895t() {
        AbstractC9317c abstractC9317c = this.f35087m;
        if (abstractC9317c != null) {
            abstractC9317c.mo13140c();
            this.f35087m = null;
        }
    }

    /* renamed from: u */
    public final void m30896u() {
        AbstractC9317c abstractC9317c = this.f35086l;
        if (abstractC9317c != null) {
            abstractC9317c.mo13140c();
            this.f35086l = null;
        }
    }

    /* renamed from: v */
    public final void m30897v(int i10) {
        this.f35080f = new C6712e1(this, i10);
    }

    /* renamed from: w */
    public final void m30898w() {
        synchronized (this.f35088n) {
            Iterator it = this.f35088n.iterator();
            while (it.hasNext()) {
                ((a) it.next()).m30907f();
            }
        }
    }

    /* renamed from: x */
    public final void m30899x() {
        synchronized (this.f35088n) {
            Iterator it = this.f35088n.iterator();
            while (it.hasNext()) {
                ((a) it.next()).m30903b();
            }
        }
    }

    /* renamed from: y */
    public final void m30900y(int[] iArr) {
        synchronized (this.f35088n) {
            Iterator it = this.f35088n.iterator();
            while (it.hasNext()) {
                ((a) it.next()).m30906e(iArr);
            }
        }
    }

    /* renamed from: z */
    public final void m30901z() {
        synchronized (this.f35088n) {
            Iterator it = this.f35088n.iterator();
            while (it.hasNext()) {
                ((a) it.next()).m30908g();
            }
        }
    }
}
