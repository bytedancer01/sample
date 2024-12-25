package p168jc;

import ec.C4708k;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jc/c.class
 */
/* renamed from: jc.c */
/* loaded from: combined.jar:classes2.jar:jc/c.class */
public final class C5354c {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jc/c$a.class
     */
    /* renamed from: jc.c$a */
    /* loaded from: combined.jar:classes2.jar:jc/c$a.class */
    public static class a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: b */
        public final int[] f30667b;

        /* renamed from: c */
        public final int f30668c;

        /* renamed from: d */
        public final int f30669d;

        public a(int[] iArr, int i10, int i11) {
            this.f30667b = iArr;
            this.f30668c = i10;
            this.f30669d = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(int i10) {
            C4708k.m23666h(i10, size());
            return Integer.valueOf(this.f30667b[this.f30668c + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer set(int i10, Integer num) {
            C4708k.m23666h(i10, size());
            int[] iArr = this.f30667b;
            int i11 = this.f30668c;
            int i12 = iArr[i11 + i10];
            iArr[i11 + i10] = ((Integer) C4708k.m23668j(num)).intValue();
            return Integer.valueOf(i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && C5354c.m26641g(this.f30667b, ((Integer) obj).intValue(), this.f30668c, this.f30669d) != -1;
        }

        /* renamed from: d */
        public int[] m26647d() {
            return Arrays.copyOfRange(this.f30667b, this.f30668c, this.f30669d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f30667b[this.f30668c + i10] != aVar.f30667b[aVar.f30668c + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i10 = 1;
            for (int i11 = this.f30668c; i11 < this.f30669d; i11++) {
                i10 = (i10 * 31) + C5354c.m26639e(this.f30667b[i11]);
            }
            return i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int m26641g;
            if (!(obj instanceof Integer) || (m26641g = C5354c.m26641g(this.f30667b, ((Integer) obj).intValue(), this.f30668c, this.f30669d)) < 0) {
                return -1;
            }
            return m26641g - this.f30668c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int m26642h;
            if (!(obj instanceof Integer) || (m26642h = C5354c.m26642h(this.f30667b, ((Integer) obj).intValue(), this.f30668c, this.f30669d)) < 0) {
                return -1;
            }
            return m26642h - this.f30668c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f30669d - this.f30668c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i10, int i11) {
            C4708k.m23672n(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.f30667b;
            int i12 = this.f30668c;
            return new a(iArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f30667b[this.f30668c]);
            int i10 = this.f30668c;
            while (true) {
                i10++;
                if (i10 >= this.f30669d) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f30667b[i10]);
            }
        }
    }

    /* renamed from: c */
    public static int m26637c(long j10) {
        int i10 = (int) j10;
        C4708k.m23664f(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    /* renamed from: d */
    public static int m26638d(int i10, int i11) {
        return i10 < i11 ? -1 : i10 > i11 ? 1 : 0;
    }

    /* renamed from: e */
    public static int m26639e(int i10) {
        return i10;
    }

    /* renamed from: f */
    public static int m26640f(int[] iArr, int i10) {
        return m26641g(iArr, i10, 0, iArr.length);
    }

    /* renamed from: g */
    public static int m26641g(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* renamed from: h */
    public static int m26642h(int[] iArr, int i10, int i11, int i12) {
        do {
            i12--;
            if (i12 < i11) {
                return -1;
            }
        } while (iArr[i12] != i10);
        return i12;
    }

    /* renamed from: i */
    public static int m26643i(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j10 < -2147483648L ? NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION : (int) j10;
    }

    /* renamed from: j */
    public static int[] m26644j(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).m26647d();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) C4708k.m23668j(array[i10])).intValue();
        }
        return iArr;
    }
}
