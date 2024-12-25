package p099fc;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/y.class
 */
/* renamed from: fc.y */
/* loaded from: combined.jar:classes2.jar:fc/y.class */
public final class C4844y {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Collection] */
    /* renamed from: a */
    public static <E> Collection<E> m24601a(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : C4799b0.m24301j(iterable.iterator());
    }

    @NullableDecl
    /* renamed from: b */
    public static <T> T m24602b(Iterable<? extends T> iterable, @NullableDecl T t10) {
        return (T) C4845z.m24616i(iterable.iterator(), t10);
    }

    /* renamed from: c */
    public static <T> T m24603c(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) C4845z.m24614g(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) m24605e(list);
    }

    @NullableDecl
    /* renamed from: d */
    public static <T> T m24604d(Iterable<? extends T> iterable, @NullableDecl T t10) {
        if (iterable instanceof Collection) {
            if (C4816k.m24405a(iterable).isEmpty()) {
                return t10;
            }
            if (iterable instanceof List) {
                return (T) m24605e(C4799b0.m24292a(iterable));
            }
        }
        return (T) C4845z.m24615h(iterable.iterator(), t10);
    }

    /* renamed from: e */
    public static <T> T m24605e(List<T> list) {
        return list.get(list.size() - 1);
    }

    /* renamed from: f */
    public static Object[] m24606f(Iterable<?> iterable) {
        return m24601a(iterable).toArray();
    }

    /* renamed from: g */
    public static String m24607g(Iterable<?> iterable) {
        return C4845z.m24620m(iterable.iterator());
    }
}
