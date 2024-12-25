package p319s5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:s5/a.class
 */
/* renamed from: s5.a */
/* loaded from: combined.jar:classes1.jar:s5/a.class */
public final class C8532a {

    /* renamed from: a */
    public static final Class<?> f39912a = Object.class;

    /* renamed from: b */
    public static final b<?> f39913b = new b<>();

    /* renamed from: c */
    public static final C8534c<Class<?>, Object> f39914c = new C8534c<>(48, 48);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:s5/a$b.class
     */
    /* renamed from: s5.a$b */
    /* loaded from: combined.jar:classes1.jar:s5/a$b.class */
    public static final class b<T> implements Iterator<T> {
        public b() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public static <T> Iterator<T> m36751a() {
        return f39913b;
    }
}
