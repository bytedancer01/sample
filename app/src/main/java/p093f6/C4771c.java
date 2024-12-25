package p093f6;

import p075e6.InterfaceC4645a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f6/c.class
 */
/* renamed from: f6.c */
/* loaded from: combined.jar:classes1.jar:f6/c.class */
public final class C4771c<T> implements InterfaceC4770b<T>, InterfaceC4645a<T> {

    /* renamed from: b */
    public static final C4771c<Object> f28118b = new C4771c<>(null);

    /* renamed from: a */
    public final T f28119a;

    public C4771c(T t10) {
        this.f28119a = t10;
    }

    /* renamed from: a */
    public static <T> InterfaceC4770b<T> m24162a(T t10) {
        return new C4771c(C4772d.m24165c(t10, "instance cannot be null"));
    }

    @Override // p153ih.InterfaceC5261a
    public T get() {
        return this.f28119a;
    }
}
