package p428yg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicInteger;
import p428yg.C10014t;
import p428yg.C10017w;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/x.class
 */
/* renamed from: yg.x */
/* loaded from: combined.jar:classes2.jar:yg/x.class */
public class C10018x {

    /* renamed from: m */
    public static final AtomicInteger f45958m = new AtomicInteger();

    /* renamed from: a */
    public final C10014t f45959a;

    /* renamed from: b */
    public final C10017w.b f45960b;

    /* renamed from: c */
    public boolean f45961c;

    /* renamed from: d */
    public boolean f45962d;

    /* renamed from: e */
    public boolean f45963e = true;

    /* renamed from: f */
    public int f45964f;

    /* renamed from: g */
    public int f45965g;

    /* renamed from: h */
    public int f45966h;

    /* renamed from: i */
    public int f45967i;

    /* renamed from: j */
    public Drawable f45968j;

    /* renamed from: k */
    public Drawable f45969k;

    /* renamed from: l */
    public Object f45970l;

    public C10018x(C10014t c10014t, Uri uri, int i10) {
        if (c10014t.f45899o) {
            throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
        }
        this.f45959a = c10014t;
        this.f45960b = new C10017w.b(uri, i10, c10014t.f45896l);
    }

    /* renamed from: a */
    public C10018x m42145a() {
        this.f45960b.m42140b();
        return this;
    }

    /* renamed from: b */
    public C10018x m42146b() {
        this.f45960b.m42141c();
        return this;
    }

    /* renamed from: c */
    public final C10017w m42147c(long j10) {
        int andIncrement = f45958m.getAndIncrement();
        C10017w m42139a = this.f45960b.m42139a();
        m42139a.f45925a = andIncrement;
        m42139a.f45926b = j10;
        boolean z10 = this.f45959a.f45898n;
        if (z10) {
            C10001g0.m42058v("Main", "created", m42139a.m42138g(), m42139a.toString());
        }
        C10017w m42120p = this.f45959a.m42120p(m42139a);
        if (m42120p != m42139a) {
            m42120p.f45925a = andIncrement;
            m42120p.f45926b = j10;
            if (z10) {
                C10001g0.m42058v("Main", "changed", m42120p.m42135d(), "into " + m42120p);
            }
        }
        return m42120p;
    }

    /* renamed from: d */
    public C10018x m42148d(int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        }
        if (this.f45969k != null) {
            throw new IllegalStateException("Error image already set.");
        }
        this.f45965g = i10;
        return this;
    }

    /* renamed from: e */
    public C10018x m42149e() {
        this.f45962d = true;
        return this;
    }

    /* renamed from: f */
    public final Drawable m42150f() {
        return this.f45964f != 0 ? this.f45959a.f45889e.getResources().getDrawable(this.f45964f) : this.f45968j;
    }

    /* renamed from: g */
    public void m42151g(ImageView imageView) {
        m42152h(imageView, null);
    }

    /* renamed from: h */
    public void m42152h(ImageView imageView, InterfaceC9996e interfaceC9996e) {
        Bitmap m42117m;
        long nanoTime = System.nanoTime();
        C10001g0.m42039c();
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (!this.f45960b.m42142d()) {
            this.f45959a.m42107c(imageView);
            if (this.f45963e) {
                C10015u.m42127d(imageView, m42150f());
                return;
            }
            return;
        }
        if (this.f45962d) {
            if (this.f45960b.m42143e()) {
                throw new IllegalStateException("Fit cannot be used with resize.");
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                if (this.f45963e) {
                    C10015u.m42127d(imageView, m42150f());
                }
                this.f45959a.m42110f(imageView, new ViewTreeObserverOnPreDrawListenerC10002h(this, imageView, interfaceC9996e));
                return;
            }
            this.f45960b.m42144f(width, height);
        }
        C10017w m42147c = m42147c(nanoTime);
        String m42044h = C10001g0.m42044h(m42147c);
        if (!EnumC10010p.shouldReadFromMemoryCache(this.f45966h) || (m42117m = this.f45959a.m42117m(m42044h)) == null) {
            if (this.f45963e) {
                C10015u.m42127d(imageView, m42150f());
            }
            this.f45959a.m42112h(new C10006l(this.f45959a, imageView, m42147c, this.f45966h, this.f45967i, this.f45965g, this.f45969k, m42044h, this.f45970l, interfaceC9996e, this.f45961c));
            return;
        }
        this.f45959a.m42107c(imageView);
        C10014t c10014t = this.f45959a;
        Context context = c10014t.f45889e;
        C10014t.e eVar = C10014t.e.MEMORY;
        C10015u.m42126c(imageView, context, m42117m, eVar, this.f45961c, c10014t.f45897m);
        if (this.f45959a.f45898n) {
            C10001g0.m42058v("Main", "completed", m42147c.m42138g(), "from " + eVar);
        }
        if (interfaceC9996e != null) {
            interfaceC9996e.onSuccess();
        }
    }

    /* renamed from: i */
    public void m42153i(InterfaceC9993c0 interfaceC9993c0) {
        Bitmap m42117m;
        long nanoTime = System.nanoTime();
        C10001g0.m42039c();
        if (interfaceC9993c0 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (this.f45962d) {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        Drawable drawable = null;
        if (!this.f45960b.m42142d()) {
            this.f45959a.m42108d(interfaceC9993c0);
            Drawable drawable2 = null;
            if (this.f45963e) {
                drawable2 = m42150f();
            }
            interfaceC9993c0.mo16618c(drawable2);
            return;
        }
        C10017w m42147c = m42147c(nanoTime);
        String m42044h = C10001g0.m42044h(m42147c);
        if (EnumC10010p.shouldReadFromMemoryCache(this.f45966h) && (m42117m = this.f45959a.m42117m(m42044h)) != null) {
            this.f45959a.m42108d(interfaceC9993c0);
            interfaceC9993c0.mo16617b(m42117m, C10014t.e.MEMORY);
        } else {
            if (this.f45963e) {
                drawable = m42150f();
            }
            interfaceC9993c0.mo16618c(drawable);
            this.f45959a.m42112h(new C9995d0(this.f45959a, interfaceC9993c0, m42147c, this.f45966h, this.f45967i, this.f45969k, m42044h, this.f45970l, this.f45965g));
        }
    }

    /* renamed from: j */
    public C10018x m42154j(int i10) {
        if (!this.f45963e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (i10 == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        }
        if (this.f45968j != null) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.f45964f = i10;
        return this;
    }

    /* renamed from: k */
    public C10018x m42155k(int i10, int i11) {
        this.f45960b.m42144f(i10, i11);
        return this;
    }

    /* renamed from: l */
    public C10018x m42156l() {
        this.f45962d = false;
        return this;
    }
}
