package p059d9;

import android.util.SparseBooleanArray;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/n.class
 */
/* renamed from: d9.n */
/* loaded from: combined.jar:classes2.jar:d9/n.class */
public final class C4376n {

    /* renamed from: a */
    public final SparseBooleanArray f26606a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d9/n$b.class
     */
    /* renamed from: d9.n$b */
    /* loaded from: combined.jar:classes2.jar:d9/n$b.class */
    public static final class b {

        /* renamed from: a */
        public final SparseBooleanArray f26607a = new SparseBooleanArray();

        /* renamed from: b */
        public boolean f26608b;

        /* renamed from: a */
        public b m22156a(int i10) {
            C4349a.m21884g(!this.f26608b);
            this.f26607a.append(i10, true);
            return this;
        }

        /* renamed from: b */
        public b m22157b(C4376n c4376n) {
            for (int i10 = 0; i10 < c4376n.m22155d(); i10++) {
                m22156a(c4376n.m22154c(i10));
            }
            return this;
        }

        /* renamed from: c */
        public b m22158c(int... iArr) {
            for (int i10 : iArr) {
                m22156a(i10);
            }
            return this;
        }

        /* renamed from: d */
        public b m22159d(int i10, boolean z10) {
            return z10 ? m22156a(i10) : this;
        }

        /* renamed from: e */
        public C4376n m22160e() {
            C4349a.m21884g(!this.f26608b);
            this.f26608b = true;
            return new C4376n(this.f26607a);
        }
    }

    public C4376n(SparseBooleanArray sparseBooleanArray) {
        this.f26606a = sparseBooleanArray;
    }

    /* renamed from: a */
    public boolean m22152a(int i10) {
        return this.f26606a.get(i10);
    }

    /* renamed from: b */
    public boolean m22153b(int... iArr) {
        for (int i10 : iArr) {
            if (m22152a(i10)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public int m22154c(int i10) {
        C4349a.m21880c(i10, 0, m22155d());
        return this.f26606a.keyAt(i10);
    }

    /* renamed from: d */
    public int m22155d() {
        return this.f26606a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4376n) {
            return this.f26606a.equals(((C4376n) obj).f26606a);
        }
        return false;
    }

    public int hashCode() {
        return this.f26606a.hashCode();
    }
}
