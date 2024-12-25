package bi;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;
import p390wh.InterfaceC9591a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:bi/b.class
 */
/* renamed from: bi.b */
/* loaded from: combined.jar:classes2.jar:bi/b.class */
public final class C0904b<T> implements InterfaceC0906d<T>, InterfaceC0905c<T> {

    /* renamed from: a */
    @NotNull
    public final InterfaceC0906d<T> f6053a;

    /* renamed from: b */
    public final int f6054b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:bi/b$a.class
     */
    /* renamed from: bi.b$a */
    /* loaded from: combined.jar:classes2.jar:bi/b$a.class */
    public static final class a implements Iterator<T>, InterfaceC9591a {

        /* renamed from: b */
        @NotNull
        public final Iterator<T> f6055b;

        /* renamed from: c */
        public int f6056c;

        public a(C0904b<T> c0904b) {
            this.f6055b = c0904b.f6053a.iterator();
            this.f6056c = c0904b.f6054b;
        }

        /* renamed from: a */
        public final void m5587a() {
            while (this.f6056c > 0 && this.f6055b.hasNext()) {
                this.f6055b.next();
                this.f6056c--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m5587a();
            return this.f6055b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            m5587a();
            return this.f6055b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0904b(@NotNull InterfaceC0906d<? extends T> interfaceC0906d, int i10) {
        C9367f.m39526e(interfaceC0906d, "sequence");
        this.f6053a = interfaceC0906d;
        this.f6054b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // bi.InterfaceC0905c
    @NotNull
    /* renamed from: a */
    public InterfaceC0906d<T> mo5586a(int i10) {
        int i11 = this.f6054b + i10;
        return i11 < 0 ? new C0904b(this, i10) : new C0904b(this.f6053a, i11);
    }

    @Override // bi.InterfaceC0906d
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
