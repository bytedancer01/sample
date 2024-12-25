package p099fc;

import ec.InterfaceC4703f;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/k0.class
 */
/* renamed from: fc.k0 */
/* loaded from: combined.jar:classes2.jar:fc/k0.class */
public abstract class AbstractC4817k0<T> implements Comparator<T> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [fc.k0] */
    /* renamed from: a */
    public static <T> AbstractC4817k0<T> m24408a(Comparator<T> comparator) {
        return comparator instanceof AbstractC4817k0 ? (AbstractC4817k0) comparator : new C4820m(comparator);
    }

    /* renamed from: c */
    public static <C extends Comparable> AbstractC4817k0<C> m24409c() {
        return C4813i0.f28316b;
    }

    /* renamed from: b */
    public <E extends T> AbstractC4834t<E> m24410b(Iterable<E> iterable) {
        return AbstractC4834t.m24545K(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(@NullableDecl T t10, @NullableDecl T t11);

    /* renamed from: d */
    public <T2 extends T> AbstractC4817k0<Map.Entry<T2, ?>> m24411d() {
        return (AbstractC4817k0<Map.Entry<T2, ?>>) m24412e(C4803d0.m24361d());
    }

    /* renamed from: e */
    public <F> AbstractC4817k0<F> m24412e(InterfaceC4703f<F, ? extends T> interfaceC4703f) {
        return new C4812i(interfaceC4703f, this);
    }

    /* renamed from: f */
    public <S extends T> AbstractC4817k0<S> mo24396f() {
        return new C4829q0(this);
    }
}
