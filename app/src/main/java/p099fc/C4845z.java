package p099fc;

import ec.C4705h;
import ec.C4708k;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/z.class
 */
/* renamed from: fc.z */
/* loaded from: combined.jar:classes2.jar:fc/z.class */
public final class C4845z {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/z$a.class
     */
    /* renamed from: fc.z$a */
    /* loaded from: combined.jar:classes2.jar:fc/z$a.class */
    public static final class a<T> extends AbstractC4841w0<T> {

        /* renamed from: b */
        public boolean f28446b;

        /* renamed from: c */
        public final Object f28447c;

        public a(Object obj) {
            this.f28447c = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f28446b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f28446b) {
                throw new NoSuchElementException();
            }
            this.f28446b = true;
            return (T) this.f28447c;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/z$b.class
     */
    /* renamed from: fc.z$b */
    /* loaded from: combined.jar:classes2.jar:fc/z$b.class */
    public static final class b<T> extends AbstractC4796a<T> {

        /* renamed from: f */
        public static final AbstractC4843x0<Object> f28448f = new b(new Object[0], 0, 0, 0);

        /* renamed from: d */
        public final T[] f28449d;

        /* renamed from: e */
        public final int f28450e;

        public b(T[] tArr, int i10, int i11, int i12) {
            super(i11, i12);
            this.f28449d = tArr;
            this.f28450e = i10;
        }

        @Override // p099fc.AbstractC4796a
        /* renamed from: a */
        public T mo24288a(int i10) {
            return this.f28449d[this.f28450e + i10];
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/z$c.class
     */
    /* renamed from: fc.z$c */
    /* loaded from: combined.jar:classes2.jar:fc/z$c.class */
    public enum c implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            C4814j.m24400c(false);
        }
    }

    /* renamed from: a */
    public static <T> boolean m24608a(Collection<T> collection, Iterator<? extends T> it) {
        C4708k.m23668j(collection);
        C4708k.m23668j(it);
        boolean z10 = false;
        while (true) {
            boolean z11 = z10;
            if (!it.hasNext()) {
                return z11;
            }
            z10 = z11 | collection.add(it.next());
        }
    }

    /* renamed from: b */
    public static void m24609b(Iterator<?> it) {
        C4708k.m23668j(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: c */
    public static boolean m24610c(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !C4705h.m23655a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    /* renamed from: d */
    public static <T> AbstractC4841w0<T> m24611d() {
        return m24612e();
    }

    /* renamed from: e */
    public static <T> AbstractC4843x0<T> m24612e() {
        return (AbstractC4843x0<T>) b.f28448f;
    }

    /* renamed from: f */
    public static <T> Iterator<T> m24613f() {
        return c.INSTANCE;
    }

    /* renamed from: g */
    public static <T> T m24614g(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NullableDecl
    /* renamed from: h */
    public static <T> T m24615h(Iterator<? extends T> it, @NullableDecl T t10) {
        if (it.hasNext()) {
            t10 = m24614g(it);
        }
        return t10;
    }

    @NullableDecl
    /* renamed from: i */
    public static <T> T m24616i(Iterator<? extends T> it, @NullableDecl T t10) {
        if (it.hasNext()) {
            t10 = it.next();
        }
        return t10;
    }

    @NullableDecl
    /* renamed from: j */
    public static <T> T m24617j(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    /* renamed from: k */
    public static boolean m24618k(Iterator<?> it, Collection<?> collection) {
        C4708k.m23668j(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: l */
    public static <T> AbstractC4841w0<T> m24619l(@NullableDecl T t10) {
        return new a(t10);
    }

    /* renamed from: m */
    public static String m24620m(Iterator<?> it) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sb2.append(", ");
            }
            z10 = false;
            sb2.append(it.next());
        }
        sb2.append(']');
        return sb2.toString();
    }
}
