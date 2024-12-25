package ma;

import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/q2.class
 */
/* renamed from: ma.q2 */
/* loaded from: combined.jar:classes2.jar:ma/q2.class */
public abstract class AbstractC6344q2 extends AbstractC6260m2 implements List, RandomAccess {

    /* renamed from: c */
    public static final AbstractC6156h3 f33979c = new C6302o2(C6488x2.f34147f, 0);

    /* renamed from: t */
    public static AbstractC6344q2 m29975t(Object[] objArr, int i10) {
        return i10 == 0 ? C6488x2.f34147f : new C6488x2(objArr, i10);
    }

    /* renamed from: v */
    public static AbstractC6344q2 m29976v(Object obj, Object obj2) {
        Object[] objArr = {MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING};
        C6468w2.m30085b(objArr, 2);
        return m29975t(objArr, 2);
    }

    @Override // ma.AbstractC6260m2
    /* renamed from: a */
    public int mo29380a(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // ma.AbstractC6260m2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj == this) {
            z10 = true;
        } else {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (list instanceof RandomAccess) {
                        int i10 = 0;
                        while (true) {
                            z10 = true;
                            if (i10 >= size) {
                                break;
                            }
                            if (!C6487x1.m30105a(get(i10), list.get(i10))) {
                                break;
                            }
                            i10++;
                        }
                    } else {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!it2.hasNext() || !C6487x1.m30105a(it.next(), it2.next())) {
                                    break;
                                }
                            } else if (!it2.hasNext()) {
                                z10 = true;
                            }
                        }
                    }
                }
            }
            z10 = false;
        }
        return z10;
    }

    @Override // ma.AbstractC6260m2
    @Deprecated
    /* renamed from: g */
    public final AbstractC6344q2 mo29381g() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i10;
        if (obj == null) {
            return -1;
        }
        int size = size();
        int i11 = 0;
        while (true) {
            i10 = -1;
            if (i11 >= size) {
                break;
            }
            if (obj.equals(get(i11))) {
                i10 = i11;
                break;
            }
            i11++;
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i10;
        if (obj == null) {
            return -1;
        }
        int size = size() - 1;
        while (true) {
            i10 = -1;
            if (size < 0) {
                break;
            }
            if (obj.equals(get(size))) {
                i10 = size;
                break;
            }
            size--;
        }
        return i10;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC6344q2 subList(int i10, int i11) {
        C6050c2.m29481d(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? C6488x2.f34147f : new C6323p2(this, i10, i12);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final AbstractC6156h3 listIterator(int i10) {
        C6050c2.m29479b(i10, size(), "index");
        return isEmpty() ? f33979c : new C6302o2(this, i10);
    }
}
