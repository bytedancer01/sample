package p403xa;

import android.os.IBinder;
import android.os.Parcel;
import la.C5827a;
import la.C5829c;
import p422y9.InterfaceC9917i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xa/g.class
 */
/* renamed from: xa.g */
/* loaded from: combined.jar:classes2.jar:xa/g.class */
public final class C9699g extends C5827a {
    public C9699g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: B1 */
    public final void m40804B1(int i10) {
        Parcel m28411Z = m28411Z();
        m28411Z.writeInt(i10);
        m28412y0(7, m28411Z);
    }

    /* renamed from: C1 */
    public final void m40805C1(InterfaceC9917i interfaceC9917i, int i10, boolean z10) {
        Parcel m28411Z = m28411Z();
        C5829c.m28417d(m28411Z, interfaceC9917i);
        m28411Z.writeInt(i10);
        C5829c.m28415b(m28411Z, z10);
        m28412y0(9, m28411Z);
    }

    /* renamed from: D1 */
    public final void m40806D1(C9702j c9702j, InterfaceC9698f interfaceC9698f) {
        Parcel m28411Z = m28411Z();
        C5829c.m28416c(m28411Z, c9702j);
        C5829c.m28417d(m28411Z, interfaceC9698f);
        m28412y0(12, m28411Z);
    }
}
