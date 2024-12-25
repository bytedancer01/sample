package ma;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import org.apache.http.impl.auth.NTLMEngineImpl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/u2.class
 */
/* renamed from: ma.u2 */
/* loaded from: combined.jar:classes2.jar:ma/u2.class */
public abstract class AbstractC6428u2 extends AbstractC6260m2 implements Set {

    /* renamed from: c */
    public transient AbstractC6344q2 f34082c;

    /* renamed from: A */
    public static AbstractC6428u2 m30060A(int i10, Object... objArr) {
        int i11;
        int i12;
        int i13;
        if (i10 == 0) {
            return C6072d3.f33728j;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new C6114f3(obj);
        }
        int m30061t = m30061t(i10);
        Object[] objArr2 = new Object[m30061t];
        int i14 = m30061t - 1;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            i11 = i17;
            if (i15 >= i10) {
                break;
            }
            Object obj2 = objArr[i15];
            C6468w2.m30084a(obj2, i15);
            int hashCode = obj2.hashCode();
            int m29771a = C6197j2.m29771a(hashCode);
            while (true) {
                int i18 = m29771a & i14;
                Object obj3 = objArr2[i18];
                if (obj3 == null) {
                    objArr[i11] = obj2;
                    objArr2[i18] = obj2;
                    i12 = i16 + hashCode;
                    i13 = i11 + 1;
                    break;
                }
                i12 = i16;
                i13 = i11;
                if (!obj3.equals(obj2)) {
                    m29771a++;
                }
            }
            i15++;
            i16 = i12;
            i17 = i13;
        }
        Arrays.fill(objArr, i11, i10, (Object) null);
        if (i11 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new C6114f3(obj4);
        }
        if (m30061t(i11) < m30061t / 2) {
            return m30060A(i11, objArr);
        }
        int length = objArr.length;
        Object[] objArr3 = objArr;
        if (i11 < (length >> 1) + (length >> 2)) {
            objArr3 = Arrays.copyOf(objArr, i11);
        }
        return new C6072d3(objArr3, i16, objArr2, i14, i11);
    }

    /* renamed from: t */
    public static int m30061t(int i10) {
        int max = Math.max(i10, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    /* renamed from: w */
    public static AbstractC6428u2 m30062w(Collection collection) {
        Object[] array = collection.toArray();
        return m30060A(array.length, array);
    }

    /* renamed from: x */
    public static AbstractC6428u2 m30063x() {
        return C6072d3.f33728j;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC6428u2) && mo29545y() && ((AbstractC6428u2) obj).mo29545y() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                            return true;
                        }
                    }
                } catch (ClassCastException | NullPointerException e10) {
                }
            }
            z10 = false;
        }
        return z10;
    }

    @Override // ma.AbstractC6260m2
    /* renamed from: g */
    public AbstractC6344q2 mo29381g() {
        AbstractC6344q2 abstractC6344q2 = this.f34082c;
        AbstractC6344q2 abstractC6344q22 = abstractC6344q2;
        if (abstractC6344q2 == null) {
            abstractC6344q22 = mo29544v();
            this.f34082c = abstractC6344q22;
        }
        return abstractC6344q22;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C6093e3.m29562a(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC6135g3 iterator();

    /* renamed from: v */
    public AbstractC6344q2 mo29544v() {
        Object[] array = toArray();
        AbstractC6156h3 abstractC6156h3 = AbstractC6344q2.f33979c;
        return AbstractC6344q2.m29975t(array, array.length);
    }

    /* renamed from: y */
    public boolean mo29545y() {
        return false;
    }
}
