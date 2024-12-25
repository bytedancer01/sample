package p082ef;

import android.content.Context;
import android.util.Log;
import android.view.View;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p200l9.C5791o;
import p200l9.C5797q;
import p216m9.C5938b;
import p216m9.C5947e;
import p216m9.InterfaceC5993u;
import p230n9.C6721i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ef/b.class
 */
/* renamed from: ef.b */
/* loaded from: combined.jar:classes2.jar:ef/b.class */
public class C4719b {

    /* renamed from: l */
    public static C4719b f27770l;

    /* renamed from: a */
    public final Context f27771a;

    /* renamed from: b */
    public final List<C5791o> f27772b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final Object f27773c = new Object();

    /* renamed from: d */
    public final InterfaceC5993u<C5947e> f27774d;

    /* renamed from: e */
    public final C6721i.a f27775e;

    /* renamed from: f */
    public int f27776f;

    /* renamed from: g */
    public boolean f27777g;

    /* renamed from: h */
    public C5791o f27778h;

    /* renamed from: i */
    public C5791o f27779i;

    /* renamed from: j */
    public d f27780j;

    /* renamed from: k */
    public boolean f27781k;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ef/b$b.class
     */
    /* renamed from: ef.b$b */
    /* loaded from: combined.jar:classes2.jar:ef/b$b.class */
    public class b extends C6721i.a {

        /* renamed from: a */
        public final C4719b f27782a;

        public b(C4719b c4719b) {
            this.f27782a = c4719b;
        }

        @Override // p230n9.C6721i.a
        /* renamed from: d */
        public void mo23778d() {
            C5797q m31012l;
            C6721i m23769r = this.f27782a.m23769r();
            if (m23769r == null || (m31012l = m23769r.m31012l()) == null) {
                return;
            }
            this.f27782a.f27779i = m31012l.m28321g0(m31012l.m28318d0());
            Log.d("QueueDataProvider", "onRemoteMediaPreloadStatusUpdated() with item=" + this.f27782a.f27779i);
            if (this.f27782a.f27780j != null) {
                this.f27782a.f27780j.mo23789a();
            }
        }

        @Override // p230n9.C6721i.a
        /* renamed from: e */
        public void mo14732e() {
            m23779o();
            if (this.f27782a.f27780j != null) {
                this.f27782a.f27780j.mo23789a();
            }
            Log.d("QueueDataProvider", "Queue was updated");
        }

        @Override // p230n9.C6721i.a
        /* renamed from: g */
        public void mo14733g() {
            m23779o();
            if (this.f27782a.f27780j != null) {
                this.f27782a.f27780j.mo23789a();
            }
        }

        /* renamed from: o */
        public final void m23779o() {
            List<C5791o> list;
            C4719b c4719b;
            boolean z10;
            C5797q m31012l;
            C6721i m23769r = this.f27782a.m23769r();
            if (m23769r == null || (m31012l = m23769r.m31012l()) == null) {
                list = null;
            } else {
                list = m31012l.m28323i0();
                this.f27782a.f27776f = m31012l.m28324j0();
                this.f27782a.f27778h = m31012l.m28321g0(m31012l.m28307S());
            }
            this.f27782a.f27772b.clear();
            if (list == null) {
                Log.d("QueueDataProvider", "Queue is cleared");
                return;
            }
            Log.d("QueueDataProvider", "Queue is updated with a list of size: " + list.size());
            if (list.size() > 0) {
                this.f27782a.f27772b.addAll(list);
                c4719b = this.f27782a;
                z10 = false;
            } else {
                c4719b = this.f27782a;
                z10 = true;
            }
            c4719b.f27781k = z10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ef/b$c.class
     */
    /* renamed from: ef.b$c */
    /* loaded from: combined.jar:classes2.jar:ef/b$c.class */
    public class c implements InterfaceC5993u<C5947e> {

        /* renamed from: a */
        public final C4719b f27783a;

        public c(C4719b c4719b) {
            this.f27783a = c4719b;
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo14735a(C5947e c5947e, int i10) {
            this.f27783a.m23762j();
            if (this.f27783a.f27780j != null) {
                this.f27783a.f27780j.mo23789a();
            }
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo14736b(C5947e c5947e) {
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo14740f(C5947e c5947e, int i10) {
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo14744j(C5947e c5947e, boolean z10) {
            this.f27783a.m23761A();
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo14746l(C5947e c5947e, String str) {
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo14748n(C5947e c5947e, int i10) {
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo14738d(C5947e c5947e, String str) {
            this.f27783a.m23761A();
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo14749o(C5947e c5947e) {
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public void mo14739e(C5947e c5947e, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ef/b$d.class
     */
    /* renamed from: ef.b$d */
    /* loaded from: combined.jar:classes2.jar:ef/b$d.class */
    public interface d {
        /* renamed from: a */
        void mo23789a();
    }

    public C4719b(Context context) {
        c cVar = new c();
        this.f27774d = cVar;
        this.f27775e = new b();
        this.f27781k = true;
        Context applicationContext = context.getApplicationContext();
        this.f27771a = applicationContext;
        this.f27776f = 0;
        this.f27777g = false;
        this.f27778h = null;
        C5938b.m29235e(applicationContext).m29243c().m29356a(cVar, C5947e.class);
        m23761A();
    }

    /* renamed from: n */
    public static C4719b m23760n(Context context) {
        C4719b c4719b;
        synchronized (C4719b.class) {
            try {
                if (f27770l == null) {
                    f27770l = new C4719b(context);
                }
                c4719b = f27770l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c4719b;
    }

    /* renamed from: A */
    public final void m23761A() {
        List<C5791o> m28323i0;
        C6721i m23769r = m23769r();
        if (m23769r != null) {
            m23769r.m30986M(this.f27775e);
            C5797q m31012l = m23769r.m31012l();
            if (m31012l == null || (m28323i0 = m31012l.m28323i0()) == null || m28323i0.isEmpty()) {
                return;
            }
            this.f27772b.clear();
            this.f27772b.addAll(m28323i0);
            this.f27776f = m31012l.m28324j0();
            this.f27778h = m31012l.m28321g0(m31012l.m28307S());
            this.f27781k = false;
            this.f27779i = m31012l.m28321g0(m31012l.m28318d0());
        }
    }

    /* renamed from: j */
    public void m23762j() {
        this.f27772b.clear();
        this.f27781k = true;
        this.f27778h = null;
    }

    /* renamed from: k */
    public int m23763k() {
        return this.f27772b.size();
    }

    /* renamed from: l */
    public C5791o m23764l() {
        return this.f27778h;
    }

    /* renamed from: m */
    public int m23765m() {
        return this.f27778h.m28282S();
    }

    /* renamed from: o */
    public C5791o m23766o(int i10) {
        return this.f27772b.get(i10);
    }

    /* renamed from: p */
    public List<C5791o> m23767p() {
        return this.f27772b;
    }

    /* renamed from: q */
    public int m23768q(int i10) {
        if (this.f27772b.isEmpty()) {
            return -1;
        }
        for (int i11 = 0; i11 < this.f27772b.size(); i11++) {
            if (this.f27772b.get(i11).m28282S() == i10) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: r */
    public final C6721i m23769r() {
        C5947e m29358c = C5938b.m29235e(this.f27771a).m29243c().m29358c();
        if (m29358c != null && m29358c.m29348c()) {
            return m29358c.m29290r();
        }
        Log.w("QueueDataProvider", "Trying to get a RemoteMediaClient when no CastSession is started.");
        return null;
    }

    /* renamed from: s */
    public C5791o m23770s() {
        Log.d("QueueDataProvider", "[upcoming] getUpcomingItem() returning " + this.f27779i);
        return this.f27779i;
    }

    /* renamed from: t */
    public boolean m23771t() {
        return this.f27781k;
    }

    /* renamed from: u */
    public void m23772u(int i10, int i11) {
        C6721i m23769r;
        if (i10 == i11 || (m23769r = m23769r()) == null) {
            return;
        }
        m23769r.m30981H(this.f27772b.get(i10).m28282S(), i11, null);
        this.f27772b.add(i11, this.f27772b.remove(i10));
    }

    /* renamed from: v */
    public void m23773v(View view, C5791o c5791o) {
        C6721i m23769r = m23769r();
        if (m23769r == null) {
            return;
        }
        m23769r.m30978E(c5791o.m28282S(), null);
    }

    /* renamed from: w */
    public void m23774w(View view, C5791o c5791o) {
        C6721i m23769r = m23769r();
        if (m23769r == null) {
            return;
        }
        int m23768q = m23768q(c5791o.m28282S());
        int m23763k = m23763k() - m23768q;
        int[] iArr = new int[m23763k];
        for (int i10 = 0; i10 < m23763k; i10++) {
            iArr[i10] = this.f27772b.get(i10 + m23768q).m28282S();
        }
        m23769r.m30985L(iArr, null);
    }

    /* renamed from: x */
    public void m23775x() {
        synchronized (this.f27773c) {
            if (this.f27772b.isEmpty()) {
                return;
            }
            C6721i m23769r = m23769r();
            if (m23769r == null) {
                return;
            }
            int[] iArr = new int[this.f27772b.size()];
            for (int i10 = 0; i10 < this.f27772b.size(); i10++) {
                iArr[i10] = this.f27772b.get(i10).m28282S();
            }
            m23769r.m30985L(iArr, null);
            this.f27772b.clear();
        }
    }

    /* renamed from: y */
    public void m23776y(int i10) {
        synchronized (this.f27773c) {
            C6721i m23769r = m23769r();
            if (m23769r == null) {
                return;
            }
            m23769r.m30984K(this.f27772b.get(i10).m28282S(), null);
        }
    }

    /* renamed from: z */
    public void m23777z(d dVar) {
        this.f27780j = dVar;
    }
}
