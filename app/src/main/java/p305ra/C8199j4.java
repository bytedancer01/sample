package p305ra;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/j4.class
 */
/* renamed from: ra.j4 */
/* loaded from: combined.jar:classes2.jar:ra/j4.class */
public final class C8199j4 {
    /* renamed from: a */
    public static <T> InterfaceC8139f4<T> m35508a(InterfaceC8139f4<T> interfaceC8139f4) {
        if ((interfaceC8139f4 instanceof C8169h4) || (interfaceC8139f4 instanceof C8154g4)) {
            return interfaceC8139f4;
        }
        return interfaceC8139f4 instanceof Serializable ? new C8154g4(interfaceC8139f4) : new C8169h4(interfaceC8139f4);
    }

    /* renamed from: b */
    public static <T> InterfaceC8139f4<T> m35509b(@NullableDecl T t10) {
        return new C8184i4(t10);
    }
}
