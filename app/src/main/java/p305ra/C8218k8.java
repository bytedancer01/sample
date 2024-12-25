package p305ra;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/k8.class
 */
/* renamed from: ra.k8 */
/* loaded from: combined.jar:classes2.jar:ra/k8.class */
public final class C8218k8 implements Iterator<Map.Entry> {

    /* renamed from: b */
    public int f39152b = -1;

    /* renamed from: c */
    public boolean f39153c;

    /* renamed from: d */
    public Iterator<Map.Entry> f39154d;

    /* renamed from: e */
    public final C8248m8 f39155e;

    public /* synthetic */ C8218k8(C8248m8 c8248m8, C8143f8 c8143f8) {
        this.f39155e = c8248m8;
    }

    /* renamed from: a */
    public final Iterator<Map.Entry> m35537a() {
        Map map;
        if (this.f39154d == null) {
            map = this.f39155e.f39188d;
            this.f39154d = map.entrySet().iterator();
        }
        return this.f39154d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        boolean z10 = true;
        int i10 = this.f39152b + 1;
        list = this.f39155e.f39187c;
        if (i10 >= list.size()) {
            map = this.f39155e.f39188d;
            if (map.isEmpty()) {
                z10 = false;
            } else {
                if (!m35537a().hasNext()) {
                    return false;
                }
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        List list;
        Object next;
        List list2;
        this.f39153c = true;
        int i10 = this.f39152b + 1;
        this.f39152b = i10;
        list = this.f39155e.f39187c;
        if (i10 < list.size()) {
            list2 = this.f39155e.f39187c;
            next = list2.get(this.f39152b);
        } else {
            next = m35537a().next();
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.f39153c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f39153c = false;
        this.f39155e.m35624n();
        int i10 = this.f39152b;
        list = this.f39155e.f39187c;
        if (i10 >= list.size()) {
            m35537a().remove();
            return;
        }
        C8248m8 c8248m8 = this.f39155e;
        int i11 = this.f39152b;
        this.f39152b = i11 - 1;
        c8248m8.m35622l(i11);
    }
}
