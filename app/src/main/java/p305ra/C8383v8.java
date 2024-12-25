package p305ra;

import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/v8.class
 */
/* renamed from: ra.v8 */
/* loaded from: combined.jar:classes2.jar:ra/v8.class */
public final class C8383v8 implements Iterator<String> {

    /* renamed from: b */
    public final Iterator<String> f39348b;

    /* renamed from: c */
    public final C8398w8 f39349c;

    public C8383v8(C8398w8 c8398w8) {
        InterfaceC8067a7 interfaceC8067a7;
        this.f39349c = c8398w8;
        interfaceC8067a7 = c8398w8.f39364b;
        this.f39348b = interfaceC8067a7.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39348b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.f39348b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
