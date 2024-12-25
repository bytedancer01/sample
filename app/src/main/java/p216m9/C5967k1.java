package p216m9;

import android.os.RemoteException;
import ga.InterfaceC4993a;
import p304r9.C8015b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/k1.class
 */
/* renamed from: m9.k1 */
/* loaded from: combined.jar:classes2.jar:m9/k1.class */
public final class C5967k1 {

    /* renamed from: b */
    public static final C8015b f33455b = new C8015b("DiscoveryManager");

    /* renamed from: a */
    public final InterfaceC5942c0 f33456a;

    public C5967k1(InterfaceC5942c0 interfaceC5942c0) {
        this.f33456a = interfaceC5942c0;
    }

    /* renamed from: a */
    public final InterfaceC4993a m29314a() {
        try {
            return this.f33456a.mo29250c();
        } catch (RemoteException e10) {
            f33455b.m34874b(e10, "Unable to call %s on %s.", "getWrappedThis", InterfaceC5942c0.class.getSimpleName());
            return null;
        }
    }
}
