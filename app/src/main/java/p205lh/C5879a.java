package p205lh;

import java.util.Comparator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lh/a.class
 */
/* renamed from: lh.a */
/* loaded from: combined.jar:classes2.jar:lh/a.class */
public class C5879a {
    /* renamed from: a */
    public static final <T extends Comparable<?>> int m28688a(@Nullable T t10, @Nullable T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return -1;
        }
        if (t11 == null) {
            return 1;
        }
        return t10.compareTo(t11);
    }

    @NotNull
    /* renamed from: b */
    public static final <T extends Comparable<? super T>> Comparator<T> m28689b() {
        return C5880b.f32958b;
    }
}
