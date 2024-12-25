package pg;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pg/a.class
 */
/* renamed from: pg.a */
/* loaded from: combined.jar:classes2.jar:pg/a.class */
public class C7712a {

    /* renamed from: a */
    public final String f37476a;

    /* renamed from: b */
    public final int f37477b;

    /* renamed from: c */
    public final View.OnClickListener f37478c;

    /* renamed from: a */
    public int m33700a() {
        return this.f37477b;
    }

    /* renamed from: b */
    public View.OnClickListener m33701b() {
        return this.f37478c;
    }

    /* renamed from: c */
    public String m33702c() {
        return this.f37476a;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7712a c7712a = (C7712a) obj;
        if (this.f37477b != c7712a.f37477b || !this.f37476a.equals(c7712a.f37476a)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return (this.f37476a.hashCode() * 31) + this.f37477b;
    }
}
