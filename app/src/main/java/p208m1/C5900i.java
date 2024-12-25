package p208m1;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m1/i.class
 */
/* renamed from: m1.i */
/* loaded from: combined.jar:classes1.jar:m1/i.class */
public final class C5900i {

    /* renamed from: c */
    public static final C5900i f33081c = new C5900i(new Bundle(), null);

    /* renamed from: a */
    public final Bundle f33082a;

    /* renamed from: b */
    public List<String> f33083b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/i$a.class
     */
    /* renamed from: m1.i$a */
    /* loaded from: combined.jar:classes1.jar:m1/i$a.class */
    public static final class a {

        /* renamed from: a */
        public ArrayList<String> f33084a;

        public a() {
        }

        public a(C5900i c5900i) {
            if (c5900i == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            c5900i.m28855c();
            if (c5900i.f33083b.isEmpty()) {
                return;
            }
            this.f33084a = new ArrayList<>(c5900i.f33083b);
        }

        /* renamed from: a */
        public a m28860a(Collection<String> collection) {
            if (collection == null) {
                throw new IllegalArgumentException("categories must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator<String> it = collection.iterator();
                while (it.hasNext()) {
                    m28861b(it.next());
                }
            }
            return this;
        }

        /* renamed from: b */
        public a m28861b(String str) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            if (this.f33084a == null) {
                this.f33084a = new ArrayList<>();
            }
            if (!this.f33084a.contains(str)) {
                this.f33084a.add(str);
            }
            return this;
        }

        /* renamed from: c */
        public a m28862c(C5900i c5900i) {
            if (c5900i == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            m28860a(c5900i.m28856e());
            return this;
        }

        /* renamed from: d */
        public C5900i m28863d() {
            if (this.f33084a == null) {
                return C5900i.f33081c;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", this.f33084a);
            return new C5900i(bundle, this.f33084a);
        }
    }

    public C5900i(Bundle bundle, List<String> list) {
        this.f33082a = bundle;
        this.f33083b = list;
    }

    /* renamed from: d */
    public static C5900i m28852d(Bundle bundle) {
        C5900i c5900i = null;
        if (bundle != null) {
            c5900i = new C5900i(bundle, null);
        }
        return c5900i;
    }

    /* renamed from: a */
    public Bundle m28853a() {
        return this.f33082a;
    }

    /* renamed from: b */
    public boolean m28854b(C5900i c5900i) {
        if (c5900i == null) {
            return false;
        }
        m28855c();
        c5900i.m28855c();
        return this.f33083b.containsAll(c5900i.f33083b);
    }

    /* renamed from: c */
    public void m28855c() {
        if (this.f33083b == null) {
            ArrayList<String> stringArrayList = this.f33082a.getStringArrayList("controlCategories");
            this.f33083b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f33083b = Collections.emptyList();
            }
        }
    }

    /* renamed from: e */
    public List<String> m28856e() {
        m28855c();
        return new ArrayList(this.f33083b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5900i)) {
            return false;
        }
        C5900i c5900i = (C5900i) obj;
        m28855c();
        c5900i.m28855c();
        return this.f33083b.equals(c5900i.f33083b);
    }

    /* renamed from: f */
    public boolean m28857f() {
        m28855c();
        return this.f33083b.isEmpty();
    }

    /* renamed from: g */
    public boolean m28858g() {
        m28855c();
        return !this.f33083b.contains(null);
    }

    /* renamed from: h */
    public boolean m28859h(List<IntentFilter> list) {
        if (list == null) {
            return false;
        }
        m28855c();
        if (this.f33083b.isEmpty()) {
            return false;
        }
        for (IntentFilter intentFilter : list) {
            if (intentFilter != null) {
                Iterator<String> it = this.f33083b.iterator();
                while (it.hasNext()) {
                    if (intentFilter.hasCategory(it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        m28855c();
        return this.f33083b.hashCode();
    }

    public String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(m28856e().toArray()) + " }";
    }
}
