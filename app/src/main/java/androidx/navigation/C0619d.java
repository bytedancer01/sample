package androidx.navigation;

import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/navigation/d.class
 */
/* renamed from: androidx.navigation.d */
/* loaded from: combined.jar:classes1.jar:androidx/navigation/d.class */
public final class C0619d {

    /* renamed from: a */
    public final AbstractC0637q f4170a;

    /* renamed from: b */
    public final boolean f4171b;

    /* renamed from: c */
    public final boolean f4172c;

    /* renamed from: d */
    public final Object f4173d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/d$a.class
     */
    /* renamed from: androidx.navigation.d$a */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/d$a.class */
    public static final class a {

        /* renamed from: a */
        public AbstractC0637q<?> f4174a;

        /* renamed from: c */
        public Object f4176c;

        /* renamed from: b */
        public boolean f4175b = false;

        /* renamed from: d */
        public boolean f4177d = false;

        /* renamed from: a */
        public C0619d m3492a() {
            if (this.f4174a == null) {
                this.f4174a = AbstractC0637q.m3609e(this.f4176c);
            }
            return new C0619d(this.f4174a, this.f4175b, this.f4176c, this.f4177d);
        }

        /* renamed from: b */
        public a m3493b(Object obj) {
            this.f4176c = obj;
            this.f4177d = true;
            return this;
        }

        /* renamed from: c */
        public a m3494c(boolean z10) {
            this.f4175b = z10;
            return this;
        }

        /* renamed from: d */
        public a m3495d(AbstractC0637q<?> abstractC0637q) {
            this.f4174a = abstractC0637q;
            return this;
        }
    }

    public C0619d(AbstractC0637q<?> abstractC0637q, boolean z10, Object obj, boolean z11) {
        if (!abstractC0637q.m3612f() && z10) {
            throw new IllegalArgumentException(abstractC0637q.mo3611c() + " does not allow nullable values");
        }
        if (!z10 && z11 && obj == null) {
            throw new IllegalArgumentException("Argument with type " + abstractC0637q.mo3611c() + " has null value but is not nullable.");
        }
        this.f4170a = abstractC0637q;
        this.f4171b = z10;
        this.f4173d = obj;
        this.f4172c = z11;
    }

    /* renamed from: a */
    public AbstractC0637q<?> m3488a() {
        return this.f4170a;
    }

    /* renamed from: b */
    public boolean m3489b() {
        return this.f4172c;
    }

    /* renamed from: c */
    public void m3490c(String str, Bundle bundle) {
        if (this.f4172c) {
            this.f4170a.mo3615i(bundle, str, this.f4173d);
        }
    }

    /* renamed from: d */
    public boolean m3491d(String str, Bundle bundle) {
        if (!this.f4171b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.f4170a.mo3610b(bundle, str);
            return true;
        } catch (ClassCastException e10) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0619d.class != obj.getClass()) {
            return false;
        }
        C0619d c0619d = (C0619d) obj;
        if (this.f4171b != c0619d.f4171b || this.f4172c != c0619d.f4172c || !this.f4170a.equals(c0619d.f4170a)) {
            return false;
        }
        Object obj2 = this.f4173d;
        Object obj3 = c0619d.f4173d;
        if (obj2 != null) {
            z10 = obj2.equals(obj3);
        } else if (obj3 != null) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        int hashCode = this.f4170a.hashCode();
        boolean z10 = this.f4171b;
        boolean z11 = this.f4172c;
        Object obj = this.f4173d;
        return (((((hashCode * 31) + (z10 ? 1 : 0)) * 31) + (z11 ? 1 : 0)) * 31) + (obj != null ? obj.hashCode() : 0);
    }
}
