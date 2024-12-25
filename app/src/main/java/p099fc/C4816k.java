package p099fc;

import ec.C4708k;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/k.class
 */
/* renamed from: fc.k */
/* loaded from: combined.jar:classes2.jar:fc/k.class */
public final class C4816k {
    /* renamed from: a */
    public static <T> Collection<T> m24405a(Iterable<T> iterable) {
        return (Collection) iterable;
    }

    /* renamed from: b */
    public static StringBuilder m24406b(int i10) {
        C4814j.m24399b(i10, "size");
        return new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
    }

    /* renamed from: c */
    public static boolean m24407c(Collection<?> collection, @NullableDecl Object obj) {
        C4708k.m23668j(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException e10) {
            return false;
        }
    }
}
