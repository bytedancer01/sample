package androidx.leanback.widget;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import java.util.Map;
import p294r.C7934g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/f1.class
 */
/* renamed from: androidx.leanback.widget.f1 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/f1.class */
public class C0510f1 {

    /* renamed from: a */
    public int f3416a = 0;

    /* renamed from: b */
    public int f3417b = 100;

    /* renamed from: c */
    public C7934g<String, SparseArray<Parcelable>> f3418c;

    /* renamed from: e */
    public static String m2584e(int i10) {
        return Integer.toString(i10);
    }

    /* renamed from: a */
    public void m2585a() {
        C7934g<String, SparseArray<Parcelable>> c7934g;
        int i10 = this.f3416a;
        if (i10 == 2) {
            if (this.f3417b <= 0) {
                throw new IllegalArgumentException();
            }
            C7934g<String, SparseArray<Parcelable>> c7934g2 = this.f3418c;
            if (c7934g2 != null && c7934g2.m34412e() == this.f3417b) {
                return;
            } else {
                c7934g = new C7934g<>(this.f3417b);
            }
        } else if (i10 == 3 || i10 == 1) {
            C7934g<String, SparseArray<Parcelable>> c7934g3 = this.f3418c;
            if (c7934g3 != null && c7934g3.m34412e() == Integer.MAX_VALUE) {
                return;
            } else {
                c7934g = new C7934g<>(Integer.MAX_VALUE);
            }
        } else {
            c7934g = null;
        }
        this.f3418c = c7934g;
    }

    /* renamed from: b */
    public void m2586b() {
        C7934g<String, SparseArray<Parcelable>> c7934g = this.f3418c;
        if (c7934g != null) {
            c7934g.m34410c();
        }
    }

    /* renamed from: c */
    public final int m2587c() {
        return this.f3417b;
    }

    /* renamed from: d */
    public final int m2588d() {
        return this.f3416a;
    }

    /* renamed from: f */
    public final void m2589f(Bundle bundle) {
        C7934g<String, SparseArray<Parcelable>> c7934g = this.f3418c;
        if (c7934g == null || bundle == null) {
            return;
        }
        c7934g.m34410c();
        for (String str : bundle.keySet()) {
            this.f3418c.m34413f(str, bundle.getSparseParcelableArray(str));
        }
    }

    /* renamed from: g */
    public final void m2590g(View view, int i10) {
        if (this.f3418c != null) {
            SparseArray<Parcelable> m34414g = this.f3418c.m34414g(m2584e(i10));
            if (m34414g != null) {
                view.restoreHierarchyState(m34414g);
            }
        }
    }

    /* renamed from: h */
    public void m2591h(int i10) {
        C7934g<String, SparseArray<Parcelable>> c7934g = this.f3418c;
        if (c7934g == null || c7934g.m34416i() == 0) {
            return;
        }
        this.f3418c.m34414g(m2584e(i10));
    }

    /* renamed from: i */
    public final Bundle m2592i() {
        C7934g<String, SparseArray<Parcelable>> c7934g = this.f3418c;
        if (c7934g == null || c7934g.m34416i() == 0) {
            return null;
        }
        Map<String, SparseArray<Parcelable>> m34418k = this.f3418c.m34418k();
        Bundle bundle = new Bundle();
        for (Map.Entry<String, SparseArray<Parcelable>> entry : m34418k.entrySet()) {
            bundle.putSparseParcelableArray(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    /* renamed from: j */
    public final void m2593j(View view, int i10) {
        int i11 = this.f3416a;
        if (i11 == 1) {
            m2591h(i10);
        } else if (i11 == 2 || i11 == 3) {
            m2595l(view, i10);
        }
    }

    /* renamed from: k */
    public final Bundle m2594k(Bundle bundle, View view, int i10) {
        Bundle bundle2 = bundle;
        if (this.f3416a != 0) {
            String m2584e = m2584e(i10);
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            view.saveHierarchyState(sparseArray);
            Bundle bundle3 = bundle;
            if (bundle == null) {
                bundle3 = new Bundle();
            }
            bundle3.putSparseParcelableArray(m2584e, sparseArray);
            bundle2 = bundle3;
        }
        return bundle2;
    }

    /* renamed from: l */
    public final void m2595l(View view, int i10) {
        if (this.f3418c != null) {
            String m2584e = m2584e(i10);
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            view.saveHierarchyState(sparseArray);
            this.f3418c.m34413f(m2584e, sparseArray);
        }
    }

    /* renamed from: m */
    public final void m2596m(int i10) {
        this.f3417b = i10;
        m2585a();
    }

    /* renamed from: n */
    public final void m2597n(int i10) {
        this.f3416a = i10;
        m2585a();
    }
}
