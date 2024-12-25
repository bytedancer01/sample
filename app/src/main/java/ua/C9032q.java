package ua;

import android.os.Bundle;
import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/q.class
 */
/* renamed from: ua.q */
/* loaded from: combined.jar:classes2.jar:ua/q.class */
public final class C9032q implements Iterator<String> {

    /* renamed from: b */
    public final Iterator<String> f41553b;

    /* renamed from: c */
    public final C9044r f41554c;

    public C9032q(C9044r c9044r) {
        Bundle bundle;
        this.f41554c = c9044r;
        bundle = c9044r.f41588d;
        this.f41553b = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return this.f41553b.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41553b.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
