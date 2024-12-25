package ma;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/pi.class
 */
/* renamed from: ma.pi */
/* loaded from: combined.jar:classes2.jar:ma/pi.class */
public final class C6339pi implements Iterator {

    /* renamed from: b */
    public int f33967b = -1;

    /* renamed from: c */
    public boolean f33968c;

    /* renamed from: d */
    public Iterator f33969d;

    /* renamed from: e */
    public final C6423ti f33970e;

    public /* synthetic */ C6339pi(C6423ti c6423ti, C6318oi c6318oi) {
        this.f33970e = c6423ti;
    }

    /* renamed from: a */
    public final Iterator m29969a() {
        Map map;
        if (this.f33969d == null) {
            map = this.f33970e.f34073d;
            this.f33969d = map.entrySet().iterator();
        }
        return this.f33969d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        boolean z10 = true;
        int i10 = this.f33967b + 1;
        list = this.f33970e.f34072c;
        if (i10 >= list.size()) {
            map = this.f33970e.f34073d;
            if (map.isEmpty()) {
                z10 = false;
            } else {
                if (!m29969a().hasNext()) {
                    return false;
                }
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        Object next;
        List list2;
        this.f33968c = true;
        int i10 = this.f33967b + 1;
        this.f33967b = i10;
        list = this.f33970e.f34072c;
        if (i10 < list.size()) {
            list2 = this.f33970e.f34072c;
            next = list2.get(this.f33967b);
        } else {
            next = m29969a().next();
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.f33968c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f33968c = false;
        this.f33970e.m30057o();
        int i10 = this.f33967b;
        list = this.f33970e.f34072c;
        if (i10 >= list.size()) {
            m29969a().remove();
            return;
        }
        C6423ti c6423ti = this.f33970e;
        int i11 = this.f33967b;
        this.f33967b = i11 - 1;
        c6423ti.m30055m(i11);
    }
}
