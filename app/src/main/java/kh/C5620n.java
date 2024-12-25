package kh;

import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kh/n.class
 */
/* renamed from: kh.n */
/* loaded from: combined.jar:classes2.jar:kh/n.class */
public class C5620n extends C5619m {
    /* renamed from: o */
    public static final <T extends Comparable<? super T>> void m27709o(@NotNull List<T> list) {
        C9367f.m39526e(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
