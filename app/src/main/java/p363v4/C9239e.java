package p363v4;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v4/e.class
 */
/* renamed from: v4.e */
/* loaded from: combined.jar:classes1.jar:v4/e.class */
public class C9239e<T, Y> {

    /* renamed from: b */
    public int f42230b;

    /* renamed from: c */
    public final int f42231c;

    /* renamed from: a */
    public final LinkedHashMap<T, Y> f42229a = new LinkedHashMap<>(100, 0.75f, true);

    /* renamed from: d */
    public int f42232d = 0;

    public C9239e(int i10) {
        this.f42231c = i10;
        this.f42230b = i10;
    }

    /* renamed from: c */
    public void m38953c() {
        m38959m(0);
    }

    /* renamed from: f */
    public final void m38954f() {
        m38959m(this.f42230b);
    }

    /* renamed from: g */
    public Y m38955g(T t10) {
        return this.f42229a.get(t10);
    }

    /* renamed from: h */
    public int m38956h() {
        return this.f42232d;
    }

    /* renamed from: i */
    public int mo5104i(Y y10) {
        return 1;
    }

    /* renamed from: j */
    public void mo5105j(T t10, Y y10) {
    }

    /* renamed from: k */
    public Y m38957k(T t10, Y y10) {
        if (mo5104i(y10) >= this.f42230b) {
            mo5105j(t10, y10);
            return null;
        }
        Y put = this.f42229a.put(t10, y10);
        if (y10 != null) {
            this.f42232d += mo5104i(y10);
        }
        if (put != null) {
            this.f42232d -= mo5104i(put);
        }
        m38954f();
        return put;
    }

    /* renamed from: l */
    public Y m38958l(T t10) {
        Y remove = this.f42229a.remove(t10);
        if (remove != null) {
            this.f42232d -= mo5104i(remove);
        }
        return remove;
    }

    /* renamed from: m */
    public void m38959m(int i10) {
        while (this.f42232d > i10) {
            Map.Entry<T, Y> next = this.f42229a.entrySet().iterator().next();
            Y value = next.getValue();
            this.f42232d -= mo5104i(value);
            T key = next.getKey();
            this.f42229a.remove(key);
            mo5105j(key, value);
        }
    }
}
