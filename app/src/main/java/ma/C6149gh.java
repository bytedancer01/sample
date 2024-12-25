package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/gh.class
 */
/* renamed from: ma.gh */
/* loaded from: combined.jar:classes2.jar:ma/gh.class */
public final class C6149gh extends AbstractC6191ih {
    public /* synthetic */ C6149gh(C6128fh c6128fh) {
        super(null);
    }

    @Override // ma.AbstractC6191ih
    /* renamed from: a */
    public final void mo29553a(Object obj, long j10) {
        ((InterfaceC6462vg) C6193ij.m29749k(obj, j10)).mo29640k();
    }

    @Override // ma.AbstractC6191ih
    /* renamed from: b */
    public final void mo29554b(Object obj, Object obj2, long j10) {
        InterfaceC6462vg interfaceC6462vg = (InterfaceC6462vg) C6193ij.m29749k(obj, j10);
        InterfaceC6462vg interfaceC6462vg2 = (InterfaceC6462vg) C6193ij.m29749k(obj2, j10);
        int size = interfaceC6462vg.size();
        int size2 = interfaceC6462vg2.size();
        InterfaceC6462vg interfaceC6462vg3 = interfaceC6462vg;
        if (size > 0) {
            interfaceC6462vg3 = interfaceC6462vg;
            if (size2 > 0) {
                interfaceC6462vg3 = interfaceC6462vg;
                if (!interfaceC6462vg.mo29641l()) {
                    interfaceC6462vg3 = interfaceC6462vg.mo29429m(size2 + size);
                }
                interfaceC6462vg3.addAll(interfaceC6462vg2);
            }
        }
        if (size <= 0) {
            interfaceC6462vg3 = interfaceC6462vg2;
        }
        C6193ij.m29762x(obj, j10, interfaceC6462vg3);
    }
}
