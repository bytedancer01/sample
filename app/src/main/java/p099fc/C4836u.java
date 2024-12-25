package p099fc;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p099fc.AbstractC4838v;
import p099fc.AbstractC4840w;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/u.class
 */
/* renamed from: fc.u */
/* loaded from: combined.jar:classes2.jar:fc/u.class */
public class C4836u<K, V> extends AbstractC4840w<K, V> implements InterfaceC4797a0<K, V> {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/u$a.class
     */
    /* renamed from: fc.u$a */
    /* loaded from: combined.jar:classes2.jar:fc/u$a.class */
    public static final class a<K, V> extends AbstractC4840w.c<K, V> {
        /* renamed from: f */
        public C4836u<K, V> m24561f() {
            return (C4836u) super.m24588a();
        }

        /* renamed from: g */
        public a<K, V> m24562g(K k10, V v10) {
            super.m24590c(k10, v10);
            return this;
        }

        @Override // p099fc.AbstractC4840w.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a<K, V> mo24560d(K k10, Iterable<? extends V> iterable) {
            super.mo24560d(k10, iterable);
            return this;
        }

        /* renamed from: i */
        public a<K, V> m24564i(K k10, V... vArr) {
            super.m24591e(k10, vArr);
            return this;
        }
    }

    public C4836u(AbstractC4838v<K, AbstractC4834t<V>> abstractC4838v, int i10) {
        super(abstractC4838v, i10);
    }

    /* renamed from: s */
    public static <K, V> a<K, V> m24556s() {
        return new a<>();
    }

    /* renamed from: t */
    public static <K, V> C4836u<K, V> m24557t(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, @NullableDecl Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return m24558v();
        }
        AbstractC4838v.a aVar = new AbstractC4838v.a(collection.size());
        int i10 = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            AbstractC4834t m24538A = comparator == null ? AbstractC4834t.m24538A(value) : AbstractC4834t.m24545K(comparator, value);
            if (!m24538A.isEmpty()) {
                aVar.m24575c(key, m24538A);
                i10 += m24538A.size();
            }
        }
        return new C4836u<>(aVar.m24573a(), i10);
    }

    /* renamed from: v */
    public static <K, V> C4836u<K, V> m24558v() {
        return C4824o.f28363h;
    }

    @Override // p099fc.InterfaceC4805e0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public AbstractC4834t<V> get(@NullableDecl K k10) {
        AbstractC4834t<V> abstractC4834t = (AbstractC4834t) this.f28431f.get(k10);
        AbstractC4834t<V> abstractC4834t2 = abstractC4834t;
        if (abstractC4834t == null) {
            abstractC4834t2 = AbstractC4834t.m24539E();
        }
        return abstractC4834t2;
    }
}
