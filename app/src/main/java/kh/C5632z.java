package kh;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kh/z.class
 */
/* renamed from: kh.z */
/* loaded from: combined.jar:classes2.jar:kh/z.class */
public class C5632z extends C5631y {
    @NotNull
    /* renamed from: c */
    public static final <K, V> Map<K, V> m27749c() {
        return C5627u.f31702b;
    }

    @NotNull
    /* renamed from: d */
    public static final <K, V> Map<K, V> m27750d(@NotNull Map<? extends K, ? extends V> map) {
        C9367f.m39526e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? m27751e(map) : C5631y.m27748b(map) : m27749c();
    }

    @NotNull
    /* renamed from: e */
    public static final <K, V> Map<K, V> m27751e(@NotNull Map<? extends K, ? extends V> map) {
        C9367f.m39526e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
