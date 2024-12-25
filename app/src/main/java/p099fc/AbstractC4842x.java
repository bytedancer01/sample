package p099fc;

import ec.C4708k;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/x.class
 */
/* renamed from: fc.x */
/* loaded from: combined.jar:classes2.jar:fc/x.class */
public abstract class AbstractC4842x<E> extends AbstractC4830r<E> implements Set<E> {

    /* renamed from: c */
    @NullableDecl
    public transient AbstractC4834t<E> f28445c;

    /* renamed from: D */
    public static <E> AbstractC4842x<E> m24592D() {
        return C4825o0.f28364i;
    }

    /* renamed from: E */
    public static <E> AbstractC4842x<E> m24593E(E e10) {
        return new C4835t0(e10);
    }

    /* renamed from: F */
    public static <E> AbstractC4842x<E> m24594F(E e10, E e11) {
        return m24598w(2, e10, e11);
    }

    /* renamed from: G */
    public static <E> AbstractC4842x<E> m24595G(E e10, E e11, E e12) {
        return m24598w(3, e10, e11, e12);
    }

    /* renamed from: H */
    public static boolean m24596H(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    /* renamed from: v */
    public static int m24597v(int i10) {
        int max = Math.max(i10, 2);
        boolean z10 = true;
        if (max >= 751619276) {
            if (max >= 1073741824) {
                z10 = false;
            }
            C4708k.m23663e(z10, "collection too large");
            return NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        while (true) {
            int i11 = highestOneBit << 1;
            if (i11 * 0.7d >= max) {
                return i11;
            }
            highestOneBit = i11;
        }
    }

    /* renamed from: w */
    public static <E> AbstractC4842x<E> m24598w(int i10, Object... objArr) {
        if (i10 == 0) {
            return m24592D();
        }
        if (i10 == 1) {
            return m24593E(objArr[0]);
        }
        int m24597v = m24597v(i10);
        Object[] objArr2 = new Object[m24597v];
        int i11 = m24597v - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object m24401a = C4815j0.m24401a(objArr[i14], i14);
            int hashCode = m24401a.hashCode();
            int m24524b = C4828q.m24524b(hashCode);
            while (true) {
                int i15 = m24524b & i11;
                Object obj = objArr2[i15];
                if (obj == null) {
                    objArr[i13] = m24401a;
                    objArr2[i15] = m24401a;
                    i12 += hashCode;
                    i13++;
                    break;
                }
                if (obj.equals(m24401a)) {
                    break;
                }
                m24524b++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            return new C4835t0(objArr[0], i12);
        }
        if (m24597v(i13) < m24597v / 2) {
            return m24598w(i13, objArr);
        }
        Object[] objArr3 = objArr;
        if (m24596H(i13, objArr.length)) {
            objArr3 = Arrays.copyOf(objArr, i13);
        }
        return new C4825o0(objArr3, i12, objArr2, i11, i13);
    }

    /* renamed from: x */
    public static <E> AbstractC4842x<E> m24599x(Collection<? extends E> collection) {
        if ((collection instanceof AbstractC4842x) && !(collection instanceof SortedSet)) {
            AbstractC4842x<E> abstractC4842x = (AbstractC4842x) collection;
            if (!abstractC4842x.mo24455q()) {
                return abstractC4842x;
            }
        }
        Object[] array = collection.toArray();
        return m24598w(array.length, array);
    }

    /* renamed from: y */
    public static <E> AbstractC4842x<E> m24600y(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? m24598w(eArr.length, (Object[]) eArr.clone()) : m24593E(eArr[0]) : m24592D();
    }

    /* renamed from: A */
    public AbstractC4834t<E> mo24477A() {
        return AbstractC4834t.m24546v(toArray());
    }

    /* renamed from: B */
    public boolean mo24481B() {
        return false;
    }

    @Override // p099fc.AbstractC4830r
    /* renamed from: d */
    public AbstractC4834t<E> mo24480d() {
        AbstractC4834t<E> abstractC4834t = this.f28445c;
        AbstractC4834t<E> abstractC4834t2 = abstractC4834t;
        if (abstractC4834t == null) {
            abstractC4834t2 = mo24477A();
            this.f28445c = abstractC4834t2;
        }
        return abstractC4834t2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC4842x) && mo24481B() && ((AbstractC4842x) obj).mo24481B() && hashCode() != obj.hashCode()) {
            return false;
        }
        return C4833s0.m24529a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C4833s0.m24530b(this);
    }

    @Override // p099fc.AbstractC4830r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: t */
    public abstract AbstractC4841w0<E> iterator();
}
