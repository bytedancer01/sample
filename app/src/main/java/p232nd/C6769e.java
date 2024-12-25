package p232nd;

import md.C6562c;
import p188kd.AbstractC5569v;
import p188kd.C5552e;
import p188kd.InterfaceC5556i;
import p188kd.InterfaceC5564q;
import p188kd.InterfaceC5570w;
import p201ld.InterfaceC5840b;
import p308rd.C8462a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:nd/e.class
 */
/* renamed from: nd.e */
/* loaded from: combined.jar:classes2.jar:nd/e.class */
public final class C6769e implements InterfaceC5570w {

    /* renamed from: b */
    public final C6562c f35255b;

    public C6769e(C6562c c6562c) {
        this.f35255b = c6562c;
    }

    @Override // p188kd.InterfaceC5570w
    /* renamed from: a */
    public <T> AbstractC5569v<T> mo27598a(C5552e c5552e, C8462a<T> c8462a) {
        InterfaceC5840b interfaceC5840b = (InterfaceC5840b) c8462a.m36351c().getAnnotation(InterfaceC5840b.class);
        if (interfaceC5840b == null) {
            return null;
        }
        return (AbstractC5569v<T>) m31097b(this.f35255b, c5552e, c8462a, interfaceC5840b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public AbstractC5569v<?> m31097b(C6562c c6562c, C5552e c5552e, C8462a<?> c8462a, InterfaceC5840b interfaceC5840b) {
        AbstractC5569v c6776l;
        Object mo30294a = c6562c.m30290a(C8462a.m36348a(interfaceC5840b.value())).mo30294a();
        if (mo30294a instanceof AbstractC5569v) {
            c6776l = (AbstractC5569v) mo30294a;
        } else if (mo30294a instanceof InterfaceC5570w) {
            c6776l = ((InterfaceC5570w) mo30294a).mo27598a(c5552e, c8462a);
        } else {
            boolean z10 = mo30294a instanceof InterfaceC5564q;
            if (!z10 && !(mo30294a instanceof InterfaceC5556i)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + mo30294a.getClass().getName() + " as a @JsonAdapter for " + c8462a.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            InterfaceC5556i interfaceC5556i = null;
            InterfaceC5564q interfaceC5564q = z10 ? (InterfaceC5564q) mo30294a : null;
            if (mo30294a instanceof InterfaceC5556i) {
                interfaceC5556i = (InterfaceC5556i) mo30294a;
            }
            c6776l = new C6776l(interfaceC5564q, interfaceC5556i, c5552e, c8462a, null);
        }
        AbstractC5569v abstractC5569v = c6776l;
        if (c6776l != null) {
            abstractC5569v = c6776l;
            if (interfaceC5840b.nullSafe()) {
                abstractC5569v = c6776l.m27596a();
            }
        }
        return abstractC5569v;
    }
}
