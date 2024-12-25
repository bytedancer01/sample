package p294r;

import java.util.ConcurrentModificationException;
import java.util.Map;
import org.slf4j.helpers.MessageFormatter;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:r/i.class
 */
/* renamed from: r.i */
/* loaded from: combined.jar:classes1.jar:r/i.class */
public class C7936i<K, V> {

    /* renamed from: e */
    public static Object[] f38191e;

    /* renamed from: f */
    public static int f38192f;

    /* renamed from: g */
    public static Object[] f38193g;

    /* renamed from: h */
    public static int f38194h;

    /* renamed from: b */
    public int[] f38195b;

    /* renamed from: c */
    public Object[] f38196c;

    /* renamed from: d */
    public int f38197d;

    public C7936i() {
        this.f38195b = C7932e.f38160a;
        this.f38196c = C7932e.f38162c;
        this.f38197d = 0;
    }

    public C7936i(int i10) {
        if (i10 == 0) {
            this.f38195b = C7932e.f38160a;
            this.f38196c = C7932e.f38162c;
        } else {
            m34431b(i10);
        }
        this.f38197d = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7936i(C7936i<K, V> c7936i) {
        this();
        if (c7936i != 0) {
            m34440k(c7936i);
        }
    }

    /* renamed from: b */
    private void m34431b(int i10) {
        if (i10 == 8) {
            synchronized (C7936i.class) {
                try {
                    Object[] objArr = f38193g;
                    if (objArr != null) {
                        this.f38196c = objArr;
                        f38193g = (Object[]) objArr[0];
                        this.f38195b = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f38194h--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i10 == 4) {
            synchronized (C7936i.class) {
                try {
                    Object[] objArr2 = f38191e;
                    if (objArr2 != null) {
                        this.f38196c = objArr2;
                        f38191e = (Object[]) objArr2[0];
                        this.f38195b = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f38192f--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f38195b = new int[i10];
        this.f38196c = new Object[i10 << 1];
    }

    /* renamed from: c */
    public static int m34432c(int[] iArr, int i10, int i11) {
        try {
            return C7932e.m34389a(iArr, i10, i11);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    public static void m34433e(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (C7936i.class) {
                try {
                    if (f38194h < 10) {
                        objArr[0] = f38193g;
                        objArr[1] = iArr;
                        for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        f38193g = objArr;
                        f38194h++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C7936i.class) {
                try {
                    if (f38192f < 10) {
                        objArr[0] = f38191e;
                        objArr[1] = iArr;
                        for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                            objArr[i12] = null;
                        }
                        f38191e = objArr;
                        f38192f++;
                    }
                } finally {
                }
            }
        }
    }

    public void clear() {
        int i10 = this.f38197d;
        if (i10 > 0) {
            int[] iArr = this.f38195b;
            Object[] objArr = this.f38196c;
            this.f38195b = C7932e.f38160a;
            this.f38196c = C7932e.f38162c;
            this.f38197d = 0;
            m34433e(iArr, objArr, i10);
        }
        if (this.f38197d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m34436g(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m34438i(obj) >= 0;
    }

    /* renamed from: d */
    public void m34434d(int i10) {
        int i11 = this.f38197d;
        int[] iArr = this.f38195b;
        if (iArr.length < i10) {
            Object[] objArr = this.f38196c;
            m34431b(i10);
            if (this.f38197d > 0) {
                System.arraycopy(iArr, 0, this.f38195b, 0, i11);
                System.arraycopy(objArr, 0, this.f38196c, 0, i11 << 1);
            }
            m34433e(iArr, objArr, i11);
        }
        if (this.f38197d != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7936i) {
            C7936i c7936i = (C7936i) obj;
            if (size() != c7936i.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f38197d; i10++) {
                try {
                    K m34439j = m34439j(i10);
                    V m34443n = m34443n(i10);
                    Object obj2 = c7936i.get(m34439j);
                    if (m34443n == null) {
                        if (obj2 != null || !c7936i.containsKey(m34439j)) {
                            return false;
                        }
                    } else if (!m34443n.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException e10) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        for (int i11 = 0; i11 < this.f38197d; i11++) {
            try {
                K m34439j2 = m34439j(i11);
                V m34443n2 = m34443n(i11);
                Object obj3 = map.get(m34439j2);
                if (m34443n2 == null) {
                    if (obj3 != null || !map.containsKey(m34439j2)) {
                        return false;
                    }
                } else if (!m34443n2.equals(obj3)) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException e11) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public int m34435f(Object obj, int i10) {
        int i11 = this.f38197d;
        if (i11 == 0) {
            return -1;
        }
        int m34432c = m34432c(this.f38195b, i11, i10);
        if (m34432c >= 0 && !obj.equals(this.f38196c[m34432c << 1])) {
            int i12 = m34432c + 1;
            while (i12 < i11 && this.f38195b[i12] == i10) {
                if (obj.equals(this.f38196c[i12 << 1])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = m34432c - 1; i13 >= 0 && this.f38195b[i13] == i10; i13--) {
                if (obj.equals(this.f38196c[i13 << 1])) {
                    return i13;
                }
            }
            return i12 ^ (-1);
        }
        return m34432c;
    }

    /* renamed from: g */
    public int m34436g(Object obj) {
        return obj == null ? m34437h() : m34435f(obj, obj.hashCode());
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public V getOrDefault(Object obj, V v10) {
        int m34436g = m34436g(obj);
        if (m34436g >= 0) {
            v10 = this.f38196c[(m34436g << 1) + 1];
        }
        return v10;
    }

    /* renamed from: h */
    public int m34437h() {
        int i10 = this.f38197d;
        if (i10 == 0) {
            return -1;
        }
        int m34432c = m34432c(this.f38195b, i10, 0);
        if (m34432c >= 0 && this.f38196c[m34432c << 1] != null) {
            int i11 = m34432c + 1;
            while (i11 < i10 && this.f38195b[i11] == 0) {
                if (this.f38196c[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = m34432c - 1; i12 >= 0 && this.f38195b[i12] == 0; i12--) {
                if (this.f38196c[i12 << 1] == null) {
                    return i12;
                }
            }
            return i11 ^ (-1);
        }
        return m34432c;
    }

    public int hashCode() {
        int[] iArr = this.f38195b;
        Object[] objArr = this.f38196c;
        int i10 = this.f38197d;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    /* renamed from: i */
    public int m34438i(Object obj) {
        int i10 = this.f38197d * 2;
        Object[] objArr = this.f38196c;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f38197d <= 0;
    }

    /* renamed from: j */
    public K m34439j(int i10) {
        return (K) this.f38196c[i10 << 1];
    }

    /* renamed from: k */
    public void m34440k(C7936i<? extends K, ? extends V> c7936i) {
        int i10 = c7936i.f38197d;
        m34434d(this.f38197d + i10);
        if (this.f38197d != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(c7936i.m34439j(i11), c7936i.m34443n(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(c7936i.f38195b, 0, this.f38195b, 0, i10);
            System.arraycopy(c7936i.f38196c, 0, this.f38196c, 0, i10 << 1);
            this.f38197d = i10;
        }
    }

    /* renamed from: l */
    public V m34441l(int i10) {
        int i11;
        Object[] objArr = this.f38196c;
        int i12 = i10 << 1;
        V v10 = (V) objArr[i12 + 1];
        int i13 = this.f38197d;
        if (i13 <= 1) {
            m34433e(this.f38195b, objArr, i13);
            this.f38195b = C7932e.f38160a;
            this.f38196c = C7932e.f38162c;
            i11 = 0;
        } else {
            int i14 = i13 - 1;
            int[] iArr = this.f38195b;
            int i15 = 8;
            if (iArr.length <= 8 || i13 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i16 = i10 + 1;
                    int i17 = i14 - i10;
                    System.arraycopy(iArr, i16, iArr, i10, i17);
                    Object[] objArr2 = this.f38196c;
                    System.arraycopy(objArr2, i16 << 1, objArr2, i12, i17 << 1);
                }
                Object[] objArr3 = this.f38196c;
                int i18 = i14 << 1;
                objArr3[i18] = null;
                objArr3[i18 + 1] = null;
            } else {
                if (i13 > 8) {
                    i15 = i13 + (i13 >> 1);
                }
                m34431b(i15);
                if (i13 != this.f38197d) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f38195b, 0, i10);
                    System.arraycopy(objArr, 0, this.f38196c, 0, i12);
                }
                if (i10 < i14) {
                    int i19 = i10 + 1;
                    int i20 = i14 - i10;
                    System.arraycopy(iArr, i19, this.f38195b, i10, i20);
                    System.arraycopy(objArr, i19 << 1, this.f38196c, i12, i20 << 1);
                }
            }
            i11 = i14;
        }
        if (i13 != this.f38197d) {
            throw new ConcurrentModificationException();
        }
        this.f38197d = i11;
        return v10;
    }

    /* renamed from: m */
    public V m34442m(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f38196c;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    /* renamed from: n */
    public V m34443n(int i10) {
        return (V) this.f38196c[(i10 << 1) + 1];
    }

    public V put(K k10, V v10) {
        int hashCode;
        int m34435f;
        int i10 = this.f38197d;
        if (k10 == null) {
            m34435f = m34437h();
            hashCode = 0;
        } else {
            hashCode = k10.hashCode();
            m34435f = m34435f(k10, hashCode);
        }
        if (m34435f >= 0) {
            int i11 = (m34435f << 1) + 1;
            Object[] objArr = this.f38196c;
            V v11 = (V) objArr[i11];
            objArr[i11] = v10;
            return v11;
        }
        int i12 = m34435f ^ (-1);
        int[] iArr = this.f38195b;
        if (i10 >= iArr.length) {
            int i13 = 4;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 >= 4) {
                i13 = 8;
            }
            Object[] objArr2 = this.f38196c;
            m34431b(i13);
            if (i10 != this.f38197d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f38195b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f38196c, 0, objArr2.length);
            }
            m34433e(iArr, objArr2, i10);
        }
        if (i12 < i10) {
            int[] iArr3 = this.f38195b;
            int i14 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i14, i10 - i12);
            Object[] objArr3 = this.f38196c;
            System.arraycopy(objArr3, i12 << 1, objArr3, i14 << 1, (this.f38197d - i12) << 1);
        }
        int i15 = this.f38197d;
        if (i10 == i15) {
            int[] iArr4 = this.f38195b;
            if (i12 < iArr4.length) {
                iArr4[i12] = hashCode;
                Object[] objArr4 = this.f38196c;
                int i16 = i12 << 1;
                objArr4[i16] = k10;
                objArr4[i16 + 1] = v10;
                this.f38197d = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        V v12 = v11;
        if (v11 == null) {
            v12 = put(k10, v10);
        }
        return v12;
    }

    public V remove(Object obj) {
        int m34436g = m34436g(obj);
        if (m34436g >= 0) {
            return m34441l(m34436g);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int m34436g = m34436g(obj);
        if (m34436g < 0) {
            return false;
        }
        V m34443n = m34443n(m34436g);
        if (obj2 != m34443n && (obj2 == null || !obj2.equals(m34443n))) {
            return false;
        }
        m34441l(m34436g);
        return true;
    }

    public V replace(K k10, V v10) {
        int m34436g = m34436g(k10);
        if (m34436g >= 0) {
            return m34442m(m34436g, v10);
        }
        return null;
    }

    public boolean replace(K k10, V v10, V v11) {
        int m34436g = m34436g(k10);
        if (m34436g < 0) {
            return false;
        }
        V m34443n = m34443n(m34436g);
        if (m34443n != v10 && (v10 == null || !v10.equals(m34443n))) {
            return false;
        }
        m34442m(m34436g, v11);
        return true;
    }

    public int size() {
        return this.f38197d;
    }

    public String toString() {
        if (isEmpty()) {
            return MessageFormatter.DELIM_STR;
        }
        StringBuilder sb2 = new StringBuilder(this.f38197d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f38197d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            K m34439j = m34439j(i10);
            if (m34439j != this) {
                sb2.append(m34439j);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V m34443n = m34443n(i10);
            if (m34443n != this) {
                sb2.append(m34443n);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
