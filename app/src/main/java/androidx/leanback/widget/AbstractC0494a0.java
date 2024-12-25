package androidx.leanback.widget;

import android.database.Observable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/a0.class
 */
/* renamed from: androidx.leanback.widget.a0 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/a0.class */
public abstract class AbstractC0494a0 {

    /* renamed from: a */
    public final a f3390a = new a();

    /* renamed from: b */
    public boolean f3391b;

    /* renamed from: c */
    public AbstractC0521k0 f3392c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/a0$a.class
     */
    /* renamed from: androidx.leanback.widget.a0$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/a0$a.class */
    public static final class a extends Observable<b> {
        /* renamed from: a */
        public void m2545a() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((b) ((Observable) this).mObservers.get(size)).mo2546a();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/a0$b.class
     */
    /* renamed from: androidx.leanback.widget.a0$b */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/a0$b.class */
    public static abstract class b {
        /* renamed from: a */
        public void mo2546a() {
        }
    }

    public AbstractC0494a0(AbstractC0519j0 abstractC0519j0) {
        m2543h(new C0547w0(abstractC0519j0));
    }

    /* renamed from: a */
    public abstract Object mo2535a(int i10);

    /* renamed from: b */
    public long m2537b(int i10) {
        return -1L;
    }

    /* renamed from: c */
    public final AbstractC0521k0 m2538c() {
        return this.f3392c;
    }

    /* renamed from: d */
    public final boolean m2539d() {
        return this.f3391b;
    }

    /* renamed from: e */
    public final void m2540e() {
        this.f3390a.m2545a();
    }

    /* renamed from: f */
    public void m2541f() {
    }

    /* renamed from: g */
    public final void m2542g(b bVar) {
        this.f3390a.registerObserver(bVar);
    }

    /* renamed from: h */
    public final void m2543h(AbstractC0521k0 abstractC0521k0) {
        if (abstractC0521k0 == null) {
            throw new IllegalArgumentException("Presenter selector must not be null");
        }
        AbstractC0521k0 abstractC0521k02 = this.f3392c;
        boolean z10 = true;
        boolean z11 = abstractC0521k02 != null;
        if (!z11 || abstractC0521k02 == abstractC0521k0) {
            z10 = false;
        }
        this.f3392c = abstractC0521k0;
        if (z10) {
            m2541f();
        }
        if (z11) {
            m2540e();
        }
    }

    /* renamed from: i */
    public abstract int mo2536i();

    /* renamed from: j */
    public final void m2544j(b bVar) {
        this.f3390a.unregisterObserver(bVar);
    }
}
