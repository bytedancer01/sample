package p060da;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:da/f.class
 */
/* renamed from: da.f */
/* loaded from: combined.jar:classes2.jar:da/f.class */
public final class C4407f {
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m22435a() {
        return Collections.emptyList();
    }

    @Deprecated
    /* renamed from: b */
    public static <T> List<T> m22436b(T t10) {
        return Collections.singletonList(t10);
    }

    @Deprecated
    /* renamed from: c */
    public static <T> List<T> m22437c(T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : m22436b(tArr[0]) : m22435a();
    }
}
