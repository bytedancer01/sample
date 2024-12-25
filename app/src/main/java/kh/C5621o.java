package kh;

import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kh/o.class
 */
/* renamed from: kh.o */
/* loaded from: combined.jar:classes2.jar:kh/o.class */
public class C5621o extends C5620n {
    /* renamed from: p */
    public static final <T> boolean m27710p(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        C9367f.m39526e(collection, "<this>");
        C9367f.m39526e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z10 = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: q */
    public static final <T> boolean m27711q(@NotNull Collection<? super T> collection, @NotNull T[] tArr) {
        C9367f.m39526e(collection, "<this>");
        C9367f.m39526e(tArr, "elements");
        return collection.addAll(C5612f.m27676b(tArr));
    }
}
