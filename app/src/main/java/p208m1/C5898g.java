package p208m1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m1/g.class
 */
/* renamed from: m1.g */
/* loaded from: combined.jar:classes1.jar:m1/g.class */
public final class C5898g {

    /* renamed from: a */
    public final List<C5895d> f33077a;

    /* renamed from: b */
    public final boolean f33078b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/g$a.class
     */
    /* renamed from: m1.g$a */
    /* loaded from: combined.jar:classes1.jar:m1/g$a.class */
    public static final class a {

        /* renamed from: a */
        public List<C5895d> f33079a;

        /* renamed from: b */
        public boolean f33080b = false;

        /* renamed from: a */
        public a m28847a(C5895d c5895d) {
            if (c5895d == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            List<C5895d> list = this.f33079a;
            if (list == null) {
                this.f33079a = new ArrayList();
            } else if (list.contains(c5895d)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            this.f33079a.add(c5895d);
            return this;
        }

        /* renamed from: b */
        public a m28848b(Collection<C5895d> collection) {
            if (collection == null) {
                throw new IllegalArgumentException("routes must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator<C5895d> it = collection.iterator();
                while (it.hasNext()) {
                    m28847a(it.next());
                }
            }
            return this;
        }

        /* renamed from: c */
        public C5898g m28849c() {
            return new C5898g(this.f33079a, this.f33080b);
        }

        /* renamed from: d */
        public a m28850d(boolean z10) {
            this.f33080b = z10;
            return this;
        }
    }

    public C5898g(List<C5895d> list, boolean z10) {
        this.f33077a = list == null ? Collections.emptyList() : list;
        this.f33078b = z10;
    }

    /* renamed from: a */
    public static C5898g m28843a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        ArrayList arrayList = null;
        if (parcelableArrayList != null) {
            arrayList = null;
            if (!parcelableArrayList.isEmpty()) {
                int size = parcelableArrayList.size();
                arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(C5895d.m28762d((Bundle) parcelableArrayList.get(i10)));
                }
            }
        }
        return new C5898g(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    /* renamed from: b */
    public List<C5895d> m28844b() {
        return this.f33077a;
    }

    /* renamed from: c */
    public boolean m28845c() {
        int size = m28844b().size();
        for (int i10 = 0; i10 < size; i10++) {
            C5895d c5895d = this.f33077a.get(i10);
            if (c5895d == null || !c5895d.m28785x()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public boolean m28846d() {
        return this.f33078b;
    }

    public String toString() {
        return "MediaRouteProviderDescriptor{ routes=" + Arrays.toString(m28844b().toArray()) + ", isValid=" + m28845c() + " }";
    }
}
