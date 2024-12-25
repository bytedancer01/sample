package kh;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kh/i.class
 */
/* renamed from: kh.i */
/* loaded from: combined.jar:classes2.jar:kh/i.class */
public class C5615i {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object[]] */
    @NotNull
    /* renamed from: a */
    public static final <T> Object[] m27695a(@NotNull T[] tArr, boolean z10) {
        C9367f.m39526e(tArr, "<this>");
        if (!z10 || !C9367f.m39522a(tArr.getClass(), Object[].class)) {
            tArr = Arrays.copyOf(tArr, tArr.length, Object[].class);
            C9367f.m39525d(tArr, "copyOf(this, this.size, Array<Any?>::class.java)");
        }
        return tArr;
    }

    @NotNull
    /* renamed from: b */
    public static final <T> List<T> m27696b(T t10) {
        List<T> singletonList = Collections.singletonList(t10);
        C9367f.m39525d(singletonList, "singletonList(element)");
        return singletonList;
    }
}
