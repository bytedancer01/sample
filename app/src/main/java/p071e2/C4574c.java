package p071e2;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e2/c.class
 */
/* renamed from: e2.c */
/* loaded from: combined.jar:classes1.jar:e2/c.class */
public final class C4574c {

    /* renamed from: a */
    public final Set<a> f27212a = new HashSet();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e2/c$a.class
     */
    /* renamed from: e2.c$a */
    /* loaded from: combined.jar:classes1.jar:e2/c$a.class */
    public static final class a {

        /* renamed from: a */
        public final Uri f27213a;

        /* renamed from: b */
        public final boolean f27214b;

        public a(Uri uri, boolean z10) {
            this.f27213a = uri;
            this.f27214b = z10;
        }

        /* renamed from: a */
        public Uri m23111a() {
            return this.f27213a;
        }

        /* renamed from: b */
        public boolean m23112b() {
            return this.f27214b;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f27214b != aVar.f27214b || !this.f27213a.equals(aVar.f27213a)) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            return (this.f27213a.hashCode() * 31) + (this.f27214b ? 1 : 0);
        }
    }

    /* renamed from: a */
    public void m23108a(Uri uri, boolean z10) {
        this.f27212a.add(new a(uri, z10));
    }

    /* renamed from: b */
    public Set<a> m23109b() {
        return this.f27212a;
    }

    /* renamed from: c */
    public int m23110c() {
        return this.f27212a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4574c.class != obj.getClass()) {
            return false;
        }
        return this.f27212a.equals(((C4574c) obj).f27212a);
    }

    public int hashCode() {
        return this.f27212a.hashCode();
    }
}
