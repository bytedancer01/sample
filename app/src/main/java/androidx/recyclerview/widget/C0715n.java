package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import p235o0.C6805a;
import p235o0.C6824g0;
import p261p0.C7535k;
import p261p0.C7536l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/n.class
 */
/* renamed from: androidx.recyclerview.widget.n */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/n.class */
public class C0715n extends C6805a {

    /* renamed from: d */
    public final RecyclerView f4957d;

    /* renamed from: e */
    public final a f4958e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/n$a.class
     */
    /* renamed from: androidx.recyclerview.widget.n$a */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/n$a.class */
    public static class a extends C6805a {

        /* renamed from: d */
        public final C0715n f4959d;

        /* renamed from: e */
        public Map<View, C6805a> f4960e = new WeakHashMap();

        public a(C0715n c0715n) {
            this.f4959d = c0715n;
        }

        @Override // p235o0.C6805a
        /* renamed from: a */
        public boolean mo4643a(View view, AccessibilityEvent accessibilityEvent) {
            C6805a c6805a = this.f4960e.get(view);
            return c6805a != null ? c6805a.mo4643a(view, accessibilityEvent) : super.mo4643a(view, accessibilityEvent);
        }

        @Override // p235o0.C6805a
        /* renamed from: b */
        public C7536l mo4644b(View view) {
            C6805a c6805a = this.f4960e.get(view);
            return c6805a != null ? c6805a.mo4644b(view) : super.mo4644b(view);
        }

        @Override // p235o0.C6805a
        /* renamed from: f */
        public void mo1935f(View view, AccessibilityEvent accessibilityEvent) {
            C6805a c6805a = this.f4960e.get(view);
            if (c6805a != null) {
                c6805a.mo1935f(view, accessibilityEvent);
            } else {
                super.mo1935f(view, accessibilityEvent);
            }
        }

        @Override // p235o0.C6805a
        /* renamed from: g */
        public void mo1936g(View view, C7535k c7535k) {
            if (!this.f4959d.m4642o() && this.f4959d.f4957d.getLayoutManager() != null) {
                this.f4959d.f4957d.getLayoutManager().m4224k1(view, c7535k);
                C6805a c6805a = this.f4960e.get(view);
                if (c6805a != null) {
                    c6805a.mo1936g(view, c7535k);
                    return;
                }
            }
            super.mo1936g(view, c7535k);
        }

        @Override // p235o0.C6805a
        /* renamed from: h */
        public void mo4645h(View view, AccessibilityEvent accessibilityEvent) {
            C6805a c6805a = this.f4960e.get(view);
            if (c6805a != null) {
                c6805a.mo4645h(view, accessibilityEvent);
            } else {
                super.mo4645h(view, accessibilityEvent);
            }
        }

        @Override // p235o0.C6805a
        /* renamed from: i */
        public boolean mo4646i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C6805a c6805a = this.f4960e.get(viewGroup);
            return c6805a != null ? c6805a.mo4646i(viewGroup, view, accessibilityEvent) : super.mo4646i(viewGroup, view, accessibilityEvent);
        }

        @Override // p235o0.C6805a
        /* renamed from: j */
        public boolean mo1937j(View view, int i10, Bundle bundle) {
            if (this.f4959d.m4642o() || this.f4959d.f4957d.getLayoutManager() == null) {
                return super.mo1937j(view, i10, bundle);
            }
            C6805a c6805a = this.f4960e.get(view);
            if (c6805a != null) {
                if (c6805a.mo1937j(view, i10, bundle)) {
                    return true;
                }
            } else if (super.mo1937j(view, i10, bundle)) {
                return true;
            }
            return this.f4959d.f4957d.getLayoutManager().m4161E1(view, i10, bundle);
        }

        @Override // p235o0.C6805a
        /* renamed from: l */
        public void mo4647l(View view, int i10) {
            C6805a c6805a = this.f4960e.get(view);
            if (c6805a != null) {
                c6805a.mo4647l(view, i10);
            } else {
                super.mo4647l(view, i10);
            }
        }

        @Override // p235o0.C6805a
        /* renamed from: m */
        public void mo4648m(View view, AccessibilityEvent accessibilityEvent) {
            C6805a c6805a = this.f4960e.get(view);
            if (c6805a != null) {
                c6805a.mo4648m(view, accessibilityEvent);
            } else {
                super.mo4648m(view, accessibilityEvent);
            }
        }

        /* renamed from: n */
        public C6805a m4649n(View view) {
            return this.f4960e.remove(view);
        }

        /* renamed from: o */
        public void m4650o(View view) {
            C6805a m31530l = C6824g0.m31530l(view);
            if (m31530l == null || m31530l == this) {
                return;
            }
            this.f4960e.put(view, m31530l);
        }
    }

    public C0715n(RecyclerView recyclerView) {
        this.f4957d = recyclerView;
        C6805a m4641n = m4641n();
        this.f4958e = (m4641n == null || !(m4641n instanceof a)) ? new a(this) : (a) m4641n;
    }

    @Override // p235o0.C6805a
    /* renamed from: f */
    public void mo1935f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1935f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || m4642o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo3822g1(accessibilityEvent);
        }
    }

    @Override // p235o0.C6805a
    /* renamed from: g */
    public void mo1936g(View view, C7535k c7535k) {
        super.mo1936g(view, c7535k);
        if (m4642o() || this.f4957d.getLayoutManager() == null) {
            return;
        }
        this.f4957d.getLayoutManager().m4221j1(c7535k);
    }

    @Override // p235o0.C6805a
    /* renamed from: j */
    public boolean mo1937j(View view, int i10, Bundle bundle) {
        if (super.mo1937j(view, i10, bundle)) {
            return true;
        }
        if (m4642o() || this.f4957d.getLayoutManager() == null) {
            return false;
        }
        return this.f4957d.getLayoutManager().m4158C1(i10, bundle);
    }

    /* renamed from: n */
    public C6805a m4641n() {
        return this.f4958e;
    }

    /* renamed from: o */
    public boolean m4642o() {
        return this.f4957d.m3960q0();
    }
}
