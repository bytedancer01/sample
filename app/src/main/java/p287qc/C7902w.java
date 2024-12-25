package p287qc;

import bd.InterfaceC0891b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qc/w.class
 */
/* renamed from: qc.w */
/* loaded from: combined.jar:classes2.jar:qc/w.class */
public class C7902w<T> implements InterfaceC0891b<T> {

    /* renamed from: c */
    public static final Object f38024c = new Object();

    /* renamed from: a */
    public volatile Object f38025a = f38024c;

    /* renamed from: b */
    public volatile InterfaceC0891b<T> f38026b;

    public C7902w(InterfaceC0891b<T> interfaceC0891b) {
        this.f38026b = interfaceC0891b;
    }

    @Override // bd.InterfaceC0891b
    public T get() {
        Object obj = this.f38025a;
        Object obj2 = f38024c;
        Object obj3 = obj;
        if (obj == obj2) {
            synchronized (this) {
                Object obj4 = this.f38025a;
                obj3 = obj4;
                if (obj4 == obj2) {
                    obj3 = this.f38026b.get();
                    this.f38025a = obj3;
                    this.f38026b = null;
                }
            }
        }
        return (T) obj3;
    }
}
