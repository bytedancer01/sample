package p305ra;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/g4.class
 */
/* renamed from: ra.g4 */
/* loaded from: combined.jar:classes2.jar:ra/g4.class */
public final class C8154g4<T> implements Serializable, InterfaceC8139f4 {

    /* renamed from: b */
    public final InterfaceC8139f4<T> f39086b;

    /* renamed from: c */
    public volatile transient boolean f39087c;

    /* renamed from: d */
    @NullableDecl
    public transient T f39088d;

    public C8154g4(InterfaceC8139f4<T> interfaceC8139f4) {
        interfaceC8139f4.getClass();
        this.f39086b = interfaceC8139f4;
    }

    public final String toString() {
        Object obj;
        if (this.f39087c) {
            String valueOf = String.valueOf(this.f39088d);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(valueOf);
            sb2.append(">");
            obj = sb2.toString();
        } else {
            obj = this.f39086b;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(valueOf2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // p305ra.InterfaceC8139f4
    public final T zza() {
        if (!this.f39087c) {
            synchronized (this) {
                if (!this.f39087c) {
                    T zza = this.f39086b.zza();
                    this.f39088d = zza;
                    this.f39087c = true;
                    return zza;
                }
            }
        }
        return this.f39088d;
    }
}
