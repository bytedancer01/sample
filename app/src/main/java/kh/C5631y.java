package kh;

import java.util.Collections;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kh/y.class
 */
/* renamed from: kh.y */
/* loaded from: combined.jar:classes2.jar:kh/y.class */
public class C5631y extends C5630x {
    /* renamed from: a */
    public static final int m27747a(int i10) {
        if (i10 >= 0) {
            i10 = i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : Integer.MAX_VALUE;
        }
        return i10;
    }

    @NotNull
    /* renamed from: b */
    public static final <K, V> Map<K, V> m27748b(@NotNull Map<? extends K, ? extends V> map) {
        C9367f.m39526e(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C9367f.m39525d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
