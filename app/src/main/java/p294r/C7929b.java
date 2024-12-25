package p294r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.slf4j.helpers.MessageFormatter;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:r/b.class
 */
/* renamed from: r.b */
/* loaded from: combined.jar:classes1.jar:r/b.class */
public final class C7929b<E> implements Collection<E>, Set<E> {

    /* renamed from: f */
    public static final int[] f38141f = new int[0];

    /* renamed from: g */
    public static final Object[] f38142g = new Object[0];

    /* renamed from: h */
    public static Object[] f38143h;

    /* renamed from: i */
    public static int f38144i;

    /* renamed from: j */
    public static Object[] f38145j;

    /* renamed from: k */
    public static int f38146k;

    /* renamed from: b */
    public int[] f38147b;

    /* renamed from: c */
    public Object[] f38148c;

    /* renamed from: d */
    public int f38149d;

    /* renamed from: e */
    public AbstractC7935h<E, E> f38150e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:r/b$a.class
     */
    /* renamed from: r.b$a */
    /* loaded from: combined.jar:classes1.jar:r/b$a.class */
    public class a extends AbstractC7935h<E, E> {

        /* renamed from: d */
        public final C7929b f38151d;

        public a(C7929b c7929b) {
            this.f38151d = c7929b;
        }

        @Override // p294r.AbstractC7935h
        /* renamed from: a */
        public void mo34357a() {
            this.f38151d.clear();
        }

        @Override // p294r.AbstractC7935h
        /* renamed from: b */
        public Object mo34358b(int i10, int i11) {
            return this.f38151d.f38148c[i10];
        }

        @Override // p294r.AbstractC7935h
        /* renamed from: c */
        public Map<E, E> mo34359c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // p294r.AbstractC7935h
        /* renamed from: d */
        public int mo34360d() {
            return this.f38151d.f38149d;
        }

        @Override // p294r.AbstractC7935h
        /* renamed from: e */
        public int mo34361e(Object obj) {
            return this.f38151d.indexOf(obj);
        }

        @Override // p294r.AbstractC7935h
        /* renamed from: f */
        public int mo34362f(Object obj) {
            return this.f38151d.indexOf(obj);
        }

        @Override // p294r.AbstractC7935h
        /* renamed from: g */
        public void mo34363g(E e10, E e11) {
            this.f38151d.add(e10);
        }

        @Override // p294r.AbstractC7935h
        /* renamed from: h */
        public void mo34364h(int i10) {
            this.f38151d.m34372q(i10);
        }

        @Override // p294r.AbstractC7935h
        /* renamed from: i */
        public E mo34365i(int i10, E e10) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C7929b() {
        this(0);
    }

    public C7929b(int i10) {
        if (i10 == 0) {
            this.f38147b = f38141f;
            this.f38148c = f38142g;
        } else {
            m34367a(i10);
        }
        this.f38149d = 0;
    }

    /* renamed from: d */
    public static void m34366d(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (C7929b.class) {
                try {
                    if (f38146k < 10) {
                        objArr[0] = f38145j;
                        objArr[1] = iArr;
                        while (true) {
                            i10--;
                            if (i10 < 2) {
                                break;
                            } else {
                                objArr[i10] = null;
                            }
                        }
                        f38145j = objArr;
                        f38146k++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C7929b.class) {
                try {
                    if (f38144i < 10) {
                        objArr[0] = f38143h;
                        objArr[1] = iArr;
                        while (true) {
                            i10--;
                            if (i10 < 2) {
                                break;
                            } else {
                                objArr[i10] = null;
                            }
                        }
                        f38143h = objArr;
                        f38144i++;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final void m34367a(int i10) {
        if (i10 == 8) {
            synchronized (C7929b.class) {
                try {
                    Object[] objArr = f38145j;
                    if (objArr != null) {
                        this.f38148c = objArr;
                        f38145j = (Object[]) objArr[0];
                        this.f38147b = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f38146k--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i10 == 4) {
            synchronized (C7929b.class) {
                try {
                    Object[] objArr2 = f38143h;
                    if (objArr2 != null) {
                        this.f38148c = objArr2;
                        f38143h = (Object[]) objArr2[0];
                        this.f38147b = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f38144i--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f38147b = new int[i10];
        this.f38148c = new Object[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int hashCode;
        int m34370g;
        if (e10 == null) {
            m34370g = m34371i();
            hashCode = 0;
        } else {
            hashCode = e10.hashCode();
            m34370g = m34370g(e10, hashCode);
        }
        if (m34370g >= 0) {
            return false;
        }
        int i10 = m34370g ^ (-1);
        int i11 = this.f38149d;
        int[] iArr = this.f38147b;
        if (i11 >= iArr.length) {
            int i12 = 4;
            if (i11 >= 8) {
                i12 = (i11 >> 1) + i11;
            } else if (i11 >= 4) {
                i12 = 8;
            }
            Object[] objArr = this.f38148c;
            m34367a(i12);
            int[] iArr2 = this.f38147b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f38148c, 0, objArr.length);
            }
            m34366d(iArr, objArr, this.f38149d);
        }
        int i13 = this.f38149d;
        if (i10 < i13) {
            int[] iArr3 = this.f38147b;
            int i14 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i14, i13 - i10);
            Object[] objArr2 = this.f38148c;
            System.arraycopy(objArr2, i10, objArr2, i14, this.f38149d - i10);
        }
        this.f38147b[i10] = hashCode;
        this.f38148c[i10] = e10;
        this.f38149d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m34368b(this.f38149d + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z10 = false;
        while (true) {
            boolean z11 = z10;
            if (!it.hasNext()) {
                return z11;
            }
            z10 = z11 | add(it.next());
        }
    }

    /* renamed from: b */
    public void m34368b(int i10) {
        int[] iArr = this.f38147b;
        if (iArr.length < i10) {
            Object[] objArr = this.f38148c;
            m34367a(i10);
            int i11 = this.f38149d;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f38147b, 0, i11);
                System.arraycopy(objArr, 0, this.f38148c, 0, this.f38149d);
            }
            m34366d(iArr, objArr, this.f38149d);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f38149d;
        if (i10 != 0) {
            m34366d(this.f38147b, this.f38148c, i10);
            this.f38147b = f38141f;
            this.f38148c = f38142g;
            this.f38149d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f38149d; i10++) {
            try {
                if (!set.contains(m34373t(i10))) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException e10) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final AbstractC7935h<E, E> m34369f() {
        if (this.f38150e == null) {
            this.f38150e = new a(this);
        }
        return this.f38150e;
    }

    /* renamed from: g */
    public final int m34370g(Object obj, int i10) {
        int i11 = this.f38149d;
        if (i11 == 0) {
            return -1;
        }
        int m34389a = C7932e.m34389a(this.f38147b, i11, i10);
        if (m34389a >= 0 && !obj.equals(this.f38148c[m34389a])) {
            int i12 = m34389a + 1;
            while (i12 < i11 && this.f38147b[i12] == i10) {
                if (obj.equals(this.f38148c[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = m34389a - 1; i13 >= 0 && this.f38147b[i13] == i10; i13--) {
                if (obj.equals(this.f38148c[i13])) {
                    return i13;
                }
            }
            return i12 ^ (-1);
        }
        return m34389a;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f38147b;
        int i10 = this.f38149d;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    /* renamed from: i */
    public final int m34371i() {
        int i10 = this.f38149d;
        if (i10 == 0) {
            return -1;
        }
        int m34389a = C7932e.m34389a(this.f38147b, i10, 0);
        if (m34389a >= 0 && this.f38148c[m34389a] != null) {
            int i11 = m34389a + 1;
            while (i11 < i10 && this.f38147b[i11] == 0) {
                if (this.f38148c[i11] == null) {
                    return i11;
                }
                i11++;
            }
            do {
                m34389a--;
                if (m34389a < 0 || this.f38147b[m34389a] != 0) {
                    return i11 ^ (-1);
                }
            } while (this.f38148c[m34389a] != null);
            return m34389a;
        }
        return m34389a;
    }

    public int indexOf(Object obj) {
        return obj == null ? m34371i() : m34370g(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f38149d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m34369f().m34425m().iterator();
    }

    /* renamed from: q */
    public E m34372q(int i10) {
        Object[] objArr = this.f38148c;
        E e10 = (E) objArr[i10];
        int i11 = this.f38149d;
        if (i11 <= 1) {
            m34366d(this.f38147b, objArr, i11);
            this.f38147b = f38141f;
            this.f38148c = f38142g;
            this.f38149d = 0;
        } else {
            int[] iArr = this.f38147b;
            int i12 = 8;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                int i13 = i11 - 1;
                this.f38149d = i13;
                if (i10 < i13) {
                    int i14 = i10 + 1;
                    System.arraycopy(iArr, i14, iArr, i10, i13 - i10);
                    Object[] objArr2 = this.f38148c;
                    System.arraycopy(objArr2, i14, objArr2, i10, this.f38149d - i10);
                }
                this.f38148c[this.f38149d] = null;
            } else {
                if (i11 > 8) {
                    i12 = i11 + (i11 >> 1);
                }
                m34367a(i12);
                this.f38149d--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f38147b, 0, i10);
                    System.arraycopy(objArr, 0, this.f38148c, 0, i10);
                }
                int i15 = this.f38149d;
                if (i10 < i15) {
                    int i16 = i10 + 1;
                    System.arraycopy(iArr, i16, this.f38147b, i10, i15 - i10);
                    System.arraycopy(objArr, i16, this.f38148c, i10, this.f38149d - i10);
                }
            }
        }
        return e10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        m34372q(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (true) {
            boolean z11 = z10;
            if (!it.hasNext()) {
                return z11;
            }
            z10 = z11 | remove(it.next());
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f38149d - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f38148c[i10])) {
                m34372q(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f38149d;
    }

    /* renamed from: t */
    public E m34373t(int i10) {
        return (E) this.f38148c[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f38149d;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f38148c, 0, objArr, 0, i10);
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object[]] */
    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        T[] tArr2 = tArr;
        if (tArr.length < this.f38149d) {
            tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f38149d);
        }
        System.arraycopy(this.f38148c, 0, tArr2, 0, this.f38149d);
        int length = tArr2.length;
        int i10 = this.f38149d;
        if (length > i10) {
            tArr2[i10] = null;
        }
        return tArr2;
    }

    public String toString() {
        if (isEmpty()) {
            return MessageFormatter.DELIM_STR;
        }
        StringBuilder sb2 = new StringBuilder(this.f38149d * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f38149d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E m34373t = m34373t(i10);
            if (m34373t != this) {
                sb2.append(m34373t);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
