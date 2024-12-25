package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/h7.class
 */
/* renamed from: ra.h7 */
/* loaded from: combined.jar:classes2.jar:ra/h7.class */
public final class C8172h7 implements InterfaceC8277o7 {

    /* renamed from: a */
    public final InterfaceC8277o7[] f39105a;

    public C8172h7(InterfaceC8277o7... interfaceC8277o7Arr) {
        this.f39105a = interfaceC8277o7Arr;
    }

    @Override // p305ra.InterfaceC8277o7
    /* renamed from: a */
    public final boolean mo35387a(Class<?> cls) {
        InterfaceC8277o7[] interfaceC8277o7Arr = this.f39105a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (interfaceC8277o7Arr[i10].mo35387a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p305ra.InterfaceC8277o7
    /* renamed from: b */
    public final InterfaceC8262n7 mo35388b(Class<?> cls) {
        InterfaceC8277o7[] interfaceC8277o7Arr = this.f39105a;
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC8277o7 interfaceC8277o7 = interfaceC8277o7Arr[i10];
            if (interfaceC8277o7.mo35387a(cls)) {
                return interfaceC8277o7.mo35388b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
