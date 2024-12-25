package p305ra;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/h4.class
 */
/* renamed from: ra.h4 */
/* loaded from: combined.jar:classes2.jar:ra/h4.class */
public final class C8169h4<T> implements InterfaceC8139f4<T> {

    /* renamed from: b */
    public volatile InterfaceC8139f4<T> f39099b;

    /* renamed from: c */
    public volatile boolean f39100c;

    /* renamed from: d */
    @NullableDecl
    public T f39101d;

    public C8169h4(InterfaceC8139f4<T> interfaceC8139f4) {
        interfaceC8139f4.getClass();
        this.f39099b = interfaceC8139f4;
    }

    public final String toString() {
        Object obj = this.f39099b;
        Object obj2 = obj;
        if (obj == null) {
            String valueOf = String.valueOf(this.f39101d);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(valueOf);
            sb2.append(">");
            obj2 = sb2.toString();
        }
        String valueOf2 = String.valueOf(obj2);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(valueOf2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // p305ra.InterfaceC8139f4
    public final T zza() {
        if (!this.f39100c) {
            synchronized (this) {
                if (!this.f39100c) {
                    T zza = this.f39099b.zza();
                    this.f39101d = zza;
                    this.f39100c = true;
                    this.f39099b = null;
                    return zza;
                }
            }
        }
        return this.f39101d;
    }
}
