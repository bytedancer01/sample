package p159j3;

import java.util.concurrent.ConcurrentHashMap;
import p004a3.InterfaceC0050d;
import p004a3.InterfaceC0055i;
import p033c3.C0986f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j3/i.class
 */
/* renamed from: j3.i */
/* loaded from: combined.jar:classes1.jar:j3/i.class */
public final class C5291i {

    /* renamed from: a */
    public final ConcurrentHashMap<Class, InterfaceC0055i> f30445a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public InterfaceC0055i m26476a(InterfaceC0050d interfaceC0050d) {
        C0986f.m5892c(interfaceC0050d, "operation == null");
        Class<?> cls = interfaceC0050d.getClass();
        InterfaceC0055i interfaceC0055i = this.f30445a.get(cls);
        if (interfaceC0055i != null) {
            return interfaceC0055i;
        }
        this.f30445a.putIfAbsent(cls, interfaceC0050d.m204a());
        return this.f30445a.get(cls);
    }
}
