package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/d7.class
 */
/* renamed from: ra.d7 */
/* loaded from: combined.jar:classes2.jar:ra/d7.class */
public final class C8112d7 extends AbstractC8127e7 {
    public /* synthetic */ C8112d7(C8082b7 c8082b7) {
        super(null);
    }

    @Override // p305ra.AbstractC8127e7
    /* renamed from: a */
    public final void mo35094a(Object obj, long j10) {
        ((InterfaceC8351t6) C8099c9.m35139y(obj, j10)).mo35827k();
    }

    @Override // p305ra.AbstractC8127e7
    /* renamed from: b */
    public final <E> void mo35095b(Object obj, Object obj2, long j10) {
        InterfaceC8351t6 interfaceC8351t6 = (InterfaceC8351t6) C8099c9.m35139y(obj, j10);
        InterfaceC8351t6 interfaceC8351t62 = (InterfaceC8351t6) C8099c9.m35139y(obj2, j10);
        int size = interfaceC8351t6.size();
        int size2 = interfaceC8351t62.size();
        InterfaceC8351t6 interfaceC8351t63 = interfaceC8351t6;
        if (size > 0) {
            interfaceC8351t63 = interfaceC8351t6;
            if (size2 > 0) {
                interfaceC8351t63 = interfaceC8351t6;
                if (!interfaceC8351t6.zza()) {
                    interfaceC8351t63 = interfaceC8351t6.mo35006n(size2 + size);
                }
                interfaceC8351t63.addAll(interfaceC8351t62);
            }
        }
        if (size <= 0) {
            interfaceC8351t63 = interfaceC8351t62;
        }
        C8099c9.m35140z(obj, j10, interfaceC8351t63);
    }
}
