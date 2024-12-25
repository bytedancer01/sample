package p001a0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p221n0.C6614f;
import p221n0.InterfaceC6613e;
import p294r.C7936i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a0/a.class
 */
/* renamed from: a0.a */
/* loaded from: combined.jar:classes1.jar:a0/a.class */
public final class C0002a<T> {

    /* renamed from: a */
    public final InterfaceC6613e<ArrayList<T>> f2a = new C6614f(10);

    /* renamed from: b */
    public final C7936i<T, ArrayList<T>> f3b = new C7936i<>();

    /* renamed from: c */
    public final ArrayList<T> f4c = new ArrayList<>();

    /* renamed from: d */
    public final HashSet<T> f5d = new HashSet<>();

    /* renamed from: a */
    public void m6a(T t10, T t11) {
        if (!this.f3b.containsKey(t10) || !this.f3b.containsKey(t11)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.f3b.get(t10);
        ArrayList<T> arrayList2 = arrayList;
        if (arrayList == null) {
            arrayList2 = m11f();
            this.f3b.put(t10, arrayList2);
        }
        arrayList2.add(t11);
    }

    /* renamed from: b */
    public void m7b(T t10) {
        if (this.f3b.containsKey(t10)) {
            return;
        }
        this.f3b.put(t10, null);
    }

    /* renamed from: c */
    public void m8c() {
        int size = this.f3b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> m34443n = this.f3b.m34443n(i10);
            if (m34443n != null) {
                m16k(m34443n);
            }
        }
        this.f3b.clear();
    }

    /* renamed from: d */
    public boolean m9d(T t10) {
        return this.f3b.containsKey(t10);
    }

    /* renamed from: e */
    public final void m10e(T t10, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t10)) {
            return;
        }
        if (hashSet.contains(t10)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t10);
        ArrayList<T> arrayList2 = this.f3b.get(t10);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                m10e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(t10);
        arrayList.add(t10);
    }

    /* renamed from: f */
    public final ArrayList<T> m11f() {
        ArrayList<T> mo30521b = this.f2a.mo30521b();
        ArrayList<T> arrayList = mo30521b;
        if (mo30521b == null) {
            arrayList = new ArrayList<>();
        }
        return arrayList;
    }

    /* renamed from: g */
    public List m12g(T t10) {
        return this.f3b.get(t10);
    }

    /* renamed from: h */
    public List<T> m13h(T t10) {
        int size = this.f3b.size();
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < size) {
            ArrayList<T> m34443n = this.f3b.m34443n(i10);
            ArrayList arrayList2 = arrayList;
            if (m34443n != null) {
                arrayList2 = arrayList;
                if (m34443n.contains(t10)) {
                    arrayList2 = arrayList;
                    if (arrayList == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(this.f3b.m34439j(i10));
                }
            }
            i10++;
            arrayList = arrayList2;
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList<T> m14i() {
        this.f4c.clear();
        this.f5d.clear();
        int size = this.f3b.size();
        for (int i10 = 0; i10 < size; i10++) {
            m10e(this.f3b.m34439j(i10), this.f4c, this.f5d);
        }
        return this.f4c;
    }

    /* renamed from: j */
    public boolean m15j(T t10) {
        int size = this.f3b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> m34443n = this.f3b.m34443n(i10);
            if (m34443n != null && m34443n.contains(t10)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final void m16k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f2a.mo30520a(arrayList);
    }
}
