package p033c3;

import java.io.Serializable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c3/d.class
 */
/* renamed from: c3.d */
/* loaded from: combined.jar:classes1.jar:c3/d.class */
public abstract class AbstractC0984d<T> implements Serializable {
    /* renamed from: a */
    public static <T> AbstractC0984d<T> m5887a() {
        return C0981a.m5878l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [c3.d] */
    /* renamed from: d */
    public static <T> AbstractC0984d<T> m5888d(T t10) {
        return t10 == null ? m5887a() : new C0985e(t10);
    }

    /* renamed from: h */
    public static <T> AbstractC0984d<T> m5889h(T t10) {
        return new C0985e(C0986f.m5891b(t10));
    }

    /* renamed from: b */
    public abstract AbstractC0984d<T> mo5879b(InterfaceC0982b<T> interfaceC0982b);

    /* renamed from: c */
    public abstract <V> AbstractC0984d<V> mo5880c(InterfaceC0983c<? super T, AbstractC0984d<V>> interfaceC0983c);

    /* renamed from: e */
    public abstract T mo5881e();

    /* renamed from: f */
    public abstract boolean mo5882f();

    /* renamed from: g */
    public abstract <V> AbstractC0984d<V> mo5883g(InterfaceC0983c<? super T, V> interfaceC0983c);

    /* renamed from: i */
    public abstract AbstractC0984d<T> mo5884i(AbstractC0984d<? extends T> abstractC0984d);

    /* renamed from: j */
    public abstract T mo5885j(T t10);

    /* renamed from: k */
    public abstract T mo5886k();
}
