package p287qc;

import bd.InterfaceC0890a;
import bd.InterfaceC0891b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qc/b0.class
 */
/* renamed from: qc.b0 */
/* loaded from: combined.jar:classes2.jar:qc/b0.class */
public class C7879b0<T> implements InterfaceC0891b<T> {

    /* renamed from: c */
    public static final InterfaceC0890a<Object> f37962c = C7905z.m34253b();

    /* renamed from: d */
    public static final InterfaceC0891b<Object> f37963d = C7877a0.m34155a();

    /* renamed from: a */
    public InterfaceC0890a<T> f37964a;

    /* renamed from: b */
    public volatile InterfaceC0891b<T> f37965b;

    public C7879b0(InterfaceC0890a<T> interfaceC0890a, InterfaceC0891b<T> interfaceC0891b) {
        this.f37964a = interfaceC0890a;
        this.f37965b = interfaceC0891b;
    }

    /* renamed from: a */
    public static <T> C7879b0<T> m34157a() {
        return new C7879b0<>(f37962c, f37963d);
    }

    /* renamed from: b */
    public static /* synthetic */ void m34158b(InterfaceC0891b interfaceC0891b) {
    }

    /* renamed from: c */
    public static /* synthetic */ Object m34159c() {
        return null;
    }

    /* renamed from: d */
    public void m34160d(InterfaceC0891b<T> interfaceC0891b) {
        InterfaceC0890a<T> interfaceC0890a;
        if (this.f37965b != f37963d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0890a = this.f37964a;
            this.f37964a = null;
            this.f37965b = interfaceC0891b;
        }
        interfaceC0890a.mo5529a(interfaceC0891b);
    }

    @Override // bd.InterfaceC0891b
    public T get() {
        return this.f37965b.get();
    }
}
