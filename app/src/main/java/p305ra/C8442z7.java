package p305ra;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/z7.class
 */
/* renamed from: ra.z7 */
/* loaded from: combined.jar:classes2.jar:ra/z7.class */
public final class C8442z7 {

    /* renamed from: c */
    public static final C8442z7 f39440c = new C8442z7();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, InterfaceC8098c8<?>> f39442b = new ConcurrentHashMap();

    /* renamed from: a */
    public final InterfaceC8113d8 f39441a = new C8187i7();

    /* renamed from: a */
    public static C8442z7 m36242a() {
        return f39440c;
    }

    /* renamed from: b */
    public final <T> InterfaceC8098c8<T> m36243b(Class<T> cls) {
        C8366u6.m35903b(cls, "messageType");
        InterfaceC8098c8<?> interfaceC8098c8 = this.f39442b.get(cls);
        InterfaceC8098c8<?> interfaceC8098c82 = interfaceC8098c8;
        if (interfaceC8098c8 == null) {
            interfaceC8098c82 = this.f39441a.mo35207a(cls);
            C8366u6.m35903b(cls, "messageType");
            C8366u6.m35903b(interfaceC8098c82, "schema");
            InterfaceC8098c8<T> interfaceC8098c83 = (InterfaceC8098c8) this.f39442b.putIfAbsent(cls, interfaceC8098c82);
            if (interfaceC8098c83 != null) {
                return interfaceC8098c83;
            }
        }
        return (InterfaceC8098c8<T>) interfaceC8098c82;
    }
}
