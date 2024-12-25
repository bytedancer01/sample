package p122h4;

import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:h4/c.class
 */
/* renamed from: h4.c */
/* loaded from: combined.jar:classes1.jar:h4/c.class */
public class C5025c<T> implements InterfaceC10048l<T> {

    /* renamed from: a */
    public final T f29068a;

    public C5025c(T t10) {
        if (t10 == null) {
            throw new NullPointerException("Data must not be null");
        }
        this.f29068a = t10;
    }

    @Override // p435z3.InterfaceC10048l
    /* renamed from: b */
    public void mo25232b() {
    }

    @Override // p435z3.InterfaceC10048l
    public final T get() {
        return this.f29068a;
    }

    @Override // p435z3.InterfaceC10048l
    public final int getSize() {
        return 1;
    }
}
