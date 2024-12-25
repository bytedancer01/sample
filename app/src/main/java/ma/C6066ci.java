package ma;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ci.class
 */
/* renamed from: ma.ci */
/* loaded from: combined.jar:classes2.jar:ma/ci.class */
public final class C6066ci {

    /* renamed from: c */
    public static final C6066ci f33713c = new C6066ci();

    /* renamed from: b */
    public final ConcurrentMap f33715b = new ConcurrentHashMap();

    /* renamed from: a */
    public final InterfaceC6171hi f33714a = new C6275mh();

    /* renamed from: a */
    public static C6066ci m29511a() {
        return f33713c;
    }

    /* renamed from: b */
    public final InterfaceC6150gi m29512b(Class cls) {
        C6482wg.m30096c(cls, "messageType");
        InterfaceC6150gi interfaceC6150gi = (InterfaceC6150gi) this.f33715b.get(cls);
        InterfaceC6150gi interfaceC6150gi2 = interfaceC6150gi;
        if (interfaceC6150gi == null) {
            interfaceC6150gi2 = this.f33714a.mo29665a(cls);
            C6482wg.m30096c(cls, "messageType");
            C6482wg.m30096c(interfaceC6150gi2, "schema");
            InterfaceC6150gi interfaceC6150gi3 = (InterfaceC6150gi) this.f33715b.putIfAbsent(cls, interfaceC6150gi2);
            if (interfaceC6150gi3 != null) {
                return interfaceC6150gi3;
            }
        }
        return interfaceC6150gi2;
    }
}
