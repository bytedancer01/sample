package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/lh.class
 */
/* renamed from: ma.lh */
/* loaded from: combined.jar:classes2.jar:ma/lh.class */
public final class C6254lh implements InterfaceC6401sh {

    /* renamed from: a */
    public final InterfaceC6401sh[] f33878a;

    public C6254lh(InterfaceC6401sh... interfaceC6401shArr) {
        this.f33878a = interfaceC6401shArr;
    }

    @Override // ma.InterfaceC6401sh
    /* renamed from: a */
    public final InterfaceC6380rh mo29821a(Class cls) {
        InterfaceC6401sh[] interfaceC6401shArr = this.f33878a;
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC6401sh interfaceC6401sh = interfaceC6401shArr[i10];
            if (interfaceC6401sh.mo29822b(cls)) {
                return interfaceC6401sh.mo29821a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // ma.InterfaceC6401sh
    /* renamed from: b */
    public final boolean mo29822b(Class cls) {
        InterfaceC6401sh[] interfaceC6401shArr = this.f33878a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (interfaceC6401shArr[i10].mo29822b(cls)) {
                return true;
            }
        }
        return false;
    }
}
