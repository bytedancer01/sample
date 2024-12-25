package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.AbstractC0519j0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/l0.class
 */
/* renamed from: androidx.leanback.widget.l0 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/l0.class */
public abstract class AbstractC0523l0 {

    /* renamed from: a */
    public ViewGroup f3471a;

    /* renamed from: b */
    public AbstractC0521k0 f3472b;

    /* renamed from: c */
    public AbstractC0519j0 f3473c;

    /* renamed from: d */
    public AbstractC0519j0.a f3474d;

    /* renamed from: a */
    public void m2698a() {
        AbstractC0519j0 abstractC0519j0 = this.f3473c;
        if (abstractC0519j0 != null) {
            abstractC0519j0.mo2655f(this.f3474d);
            this.f3471a.removeView(this.f3474d.f3459a);
            this.f3474d = null;
            this.f3473c = null;
        }
    }

    /* renamed from: b */
    public final ViewGroup m2699b() {
        return this.f3471a;
    }

    /* renamed from: c */
    public void m2700c(ViewGroup viewGroup, AbstractC0521k0 abstractC0521k0) {
        m2698a();
        this.f3471a = viewGroup;
        this.f3472b = abstractC0521k0;
    }

    /* renamed from: d */
    public abstract void mo2701d(View view);

    /* renamed from: e */
    public abstract void mo2702e(View view);

    /* renamed from: f */
    public void m2703f(Object obj) {
        m2706i(obj);
        m2705h(true);
    }

    /* renamed from: g */
    public void m2704g(View view, boolean z10) {
        view.setVisibility(z10 ? 0 : 8);
    }

    /* renamed from: h */
    public final void m2705h(boolean z10) {
        AbstractC0519j0.a aVar = this.f3474d;
        if (aVar != null) {
            m2704g(aVar.f3459a, z10);
        }
    }

    /* renamed from: i */
    public final void m2706i(Object obj) {
        AbstractC0519j0 mo2661a = this.f3472b.mo2661a(obj);
        AbstractC0519j0 abstractC0519j0 = this.f3473c;
        if (mo2661a != abstractC0519j0) {
            m2705h(false);
            m2698a();
            this.f3473c = mo2661a;
            if (mo2661a == null) {
                return;
            }
            AbstractC0519j0.a mo2654e = mo2661a.mo2654e(this.f3471a);
            this.f3474d = mo2654e;
            mo2701d(mo2654e.f3459a);
        } else if (abstractC0519j0 == null) {
            return;
        } else {
            abstractC0519j0.mo2655f(this.f3474d);
        }
        this.f3473c.mo2652b(this.f3474d, obj);
        mo2702e(this.f3474d.f3459a);
    }

    /* renamed from: j */
    public void m2707j() {
        m2705h(false);
    }
}
