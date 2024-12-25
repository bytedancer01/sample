package p099fc;

import ec.C4705h;
import ec.C4708k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p168jc.C5354c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/b0.class
 */
/* renamed from: fc.b0 */
/* loaded from: combined.jar:classes2.jar:fc/b0.class */
public final class C4799b0 {
    /* renamed from: a */
    public static <T> List<T> m24292a(Iterable<T> iterable) {
        return (List) iterable;
    }

    /* renamed from: b */
    public static int m24293b(int i10) {
        C4814j.m24399b(i10, "arraySize");
        return C5354c.m26643i(i10 + 5 + (i10 / 10));
    }

    /* renamed from: c */
    public static boolean m24294c(List<?> list, @NullableDecl Object obj) {
        if (obj == C4708k.m23668j(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return C4845z.m24610c(list.iterator(), list2.iterator());
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!C4705h.m23655a(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static int m24295d(List<?> list, @NullableDecl Object obj) {
        if (list instanceof RandomAccess) {
            return m24296e(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (C4705h.m23655a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static int m24296e(List<?> list, @NullableDecl Object obj) {
        int size = list.size();
        if (obj != null) {
            for (int i10 = 0; i10 < size; i10++) {
                if (obj.equals(list.get(i10))) {
                    return i10;
                }
            }
            return -1;
        }
        for (int i11 = 0; i11 < size; i11++) {
            if (list.get(i11) == null) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public static int m24297f(List<?> list, @NullableDecl Object obj) {
        if (list instanceof RandomAccess) {
            return m24298g(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (C4705h.m23655a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* renamed from: g */
    public static int m24298g(List<?> list, @NullableDecl Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static <E> ArrayList<E> m24299h() {
        return new ArrayList<>();
    }

    /* renamed from: i */
    public static <E> ArrayList<E> m24300i(Iterable<? extends E> iterable) {
        C4708k.m23668j(iterable);
        return iterable instanceof Collection ? new ArrayList<>(C4816k.m24405a(iterable)) : m24301j(iterable.iterator());
    }

    /* renamed from: j */
    public static <E> ArrayList<E> m24301j(Iterator<? extends E> it) {
        ArrayList<E> m24299h = m24299h();
        C4845z.m24608a(m24299h, it);
        return m24299h;
    }

    @SafeVarargs
    /* renamed from: k */
    public static <E> ArrayList<E> m24302k(E... eArr) {
        C4708k.m23668j(eArr);
        ArrayList<E> arrayList = new ArrayList<>(m24293b(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }
}
