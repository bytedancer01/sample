package kh;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kh/k.class
 */
/* renamed from: kh.k */
/* loaded from: combined.jar:classes2.jar:kh/k.class */
public class C5617k extends C5616j {
    /* renamed from: n */
    public static final <T> int m27708n(@NotNull Iterable<? extends T> iterable, int i10) {
        C9367f.m39526e(iterable, "<this>");
        if (iterable instanceof Collection) {
            i10 = ((Collection) iterable).size();
        }
        return i10;
    }
}
