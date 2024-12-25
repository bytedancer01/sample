package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/d8.class
 */
/* renamed from: ua.d8 */
/* loaded from: combined.jar:classes2.jar:ua/d8.class */
public final class C8885d8 extends AbstractC8984m {

    /* renamed from: e */
    public final C9089u8 f41028e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8885d8(C9089u8 c9089u8, InterfaceC9130y5 interfaceC9130y5) {
        super(interfaceC9130y5);
        this.f41028e = c9089u8;
    }

    @Override // ua.AbstractC8984m
    /* renamed from: a */
    public final void mo37809a() {
        C9089u8 c9089u8 = this.f41028e;
        c9089u8.mo37811h();
        if (c9089u8.m38291H()) {
            c9089u8.f41723a.mo37780c().m38416w().m38326a("Inactivity, disconnecting from the service");
            c9089u8.m38312t();
        }
    }
}
