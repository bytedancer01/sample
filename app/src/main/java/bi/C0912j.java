package bi;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p356uh.InterfaceC9196l;
import p372vh.C9367f;
import p390wh.InterfaceC9591a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:bi/j.class
 */
/* renamed from: bi.j */
/* loaded from: combined.jar:classes2.jar:bi/j.class */
public final class C0912j<T, R> implements InterfaceC0906d<R> {

    /* renamed from: a */
    @NotNull
    public final InterfaceC0906d<T> f6059a;

    /* renamed from: b */
    @NotNull
    public final InterfaceC9196l<T, R> f6060b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:bi/j$a.class
     */
    /* renamed from: bi.j$a */
    /* loaded from: combined.jar:classes2.jar:bi/j$a.class */
    public static final class a implements Iterator<R>, InterfaceC9591a {

        /* renamed from: b */
        @NotNull
        public final Iterator<T> f6061b;

        /* renamed from: c */
        public final C0912j<T, R> f6062c;

        public a(C0912j<T, R> c0912j) {
            this.f6062c = c0912j;
            this.f6061b = c0912j.f6059a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6061b.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) this.f6062c.f6060b.mo6711d(this.f6061b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0912j(@NotNull InterfaceC0906d<? extends T> interfaceC0906d, @NotNull InterfaceC9196l<? super T, ? extends R> interfaceC9196l) {
        C9367f.m39526e(interfaceC0906d, "sequence");
        C9367f.m39526e(interfaceC9196l, "transformer");
        this.f6059a = interfaceC0906d;
        this.f6060b = interfaceC9196l;
    }

    @Override // bi.InterfaceC0906d
    @NotNull
    public Iterator<R> iterator() {
        return new a(this);
    }
}
