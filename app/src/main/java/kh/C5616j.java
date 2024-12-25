package kh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205lh.C5879a;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kh/j.class
 */
/* renamed from: kh.j */
/* loaded from: combined.jar:classes2.jar:kh/j.class */
public class C5616j extends C5615i {
    @NotNull
    /* renamed from: c */
    public static final <T> Collection<T> m27697c(@NotNull T[] tArr) {
        C9367f.m39526e(tArr, "<this>");
        return new C5609c(tArr, false);
    }

    /* renamed from: d */
    public static final <T extends Comparable<? super T>> int m27698d(@NotNull List<? extends T> list, @Nullable T t10, int i10, int i11) {
        C9367f.m39526e(list, "<this>");
        m27706l(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int m28688a = C5879a.m28688a(list.get(i13), t10);
            if (m28688a < 0) {
                i10 = i13 + 1;
            } else {
                if (m28688a <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* renamed from: e */
    public static /* synthetic */ int m27699e(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return m27698d(list, comparable, i10, i11);
    }

    @NotNull
    /* renamed from: f */
    public static final <T> List<T> m27700f() {
        return C5626t.f31701b;
    }

    /* renamed from: g */
    public static final <T> int m27701g(@NotNull List<? extends T> list) {
        C9367f.m39526e(list, "<this>");
        return list.size() - 1;
    }

    @NotNull
    /* renamed from: h */
    public static final <T> List<T> m27702h(@NotNull T... tArr) {
        C9367f.m39526e(tArr, "elements");
        return tArr.length > 0 ? C5612f.m27676b(tArr) : m27700f();
    }

    @NotNull
    /* renamed from: i */
    public static final <T> List<T> m27703i(@NotNull T... tArr) {
        C9367f.m39526e(tArr, "elements");
        return C5613g.m27685k(tArr);
    }

    @NotNull
    /* renamed from: j */
    public static final <T> List<T> m27704j(@NotNull T... tArr) {
        C9367f.m39526e(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C5609c(tArr, true));
    }

    @NotNull
    /* renamed from: k */
    public static final <T> List<T> m27705k(@NotNull List<? extends T> list) {
        C9367f.m39526e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            list = m27700f();
        } else if (size == 1) {
            list = C5615i.m27696b(list.get(0));
        }
        return (List<T>) list;
    }

    /* renamed from: l */
    public static final void m27706l(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        }
        if (i12 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
    }

    /* renamed from: m */
    public static final void m27707m() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
