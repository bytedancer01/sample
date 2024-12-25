package kh;

import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kh/b0.class
 */
/* renamed from: kh.b0 */
/* loaded from: combined.jar:classes2.jar:kh/b0.class */
public class C5608b0 extends C5606a0 {
    @NotNull
    /* renamed from: b */
    public static final <T> Set<T> m27672b() {
        return C5628v.f31703b;
    }

    @NotNull
    /* renamed from: c */
    public static final <T> Set<T> m27673c(@NotNull Set<? extends T> set) {
        C9367f.m39526e(set, "<this>");
        int size = set.size();
        if (size == 0) {
            set = m27672b();
        } else if (size == 1) {
            set = C5606a0.m27664a(set.iterator().next());
        }
        return (Set<T>) set;
    }
}
