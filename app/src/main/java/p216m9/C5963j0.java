package p216m9;

import android.os.IBinder;
import android.os.Parcel;
import ga.InterfaceC4993a;
import ma.C6005a;
import ma.C6363r0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/j0.class
 */
/* renamed from: m9.j0 */
/* loaded from: combined.jar:classes2.jar:m9/j0.class */
public final class C5963j0 extends C6005a implements InterfaceC5966k0 {
    public C5963j0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    @Override // p216m9.InterfaceC5966k0
    /* renamed from: E0 */
    public final void mo29309E0(boolean z10, boolean z11) {
        Parcel m29373Z = m29373Z();
        ClassLoader classLoader = C6363r0.f33991a;
        m29373Z.writeInt(1);
        m29373Z.writeInt(z11 ? 1 : 0);
        m29372U0(6, m29373Z);
    }

    @Override // p216m9.InterfaceC5966k0
    /* renamed from: M */
    public final void mo29310M(InterfaceC5972m0 interfaceC5972m0) {
        Parcel m29373Z = m29373Z();
        C6363r0.m29992e(m29373Z, interfaceC5972m0);
        m29372U0(3, m29373Z);
    }

    @Override // p216m9.InterfaceC5966k0
    /* renamed from: b */
    public final InterfaceC4993a mo29311b() {
        Parcel m29374y0 = m29374y0(7, m29373Z());
        InterfaceC4993a m25159y0 = InterfaceC4993a.a.m25159y0(m29374y0.readStrongBinder());
        m29374y0.recycle();
        return m25159y0;
    }

    @Override // p216m9.InterfaceC5966k0
    /* renamed from: d */
    public final InterfaceC4993a mo29312d() {
        Parcel m29374y0 = m29374y0(1, m29373Z());
        InterfaceC4993a m25159y0 = InterfaceC4993a.a.m25159y0(m29374y0.readStrongBinder());
        m29374y0.recycle();
        return m25159y0;
    }

    @Override // p216m9.InterfaceC5966k0
    /* renamed from: p0 */
    public final void mo29313p0(InterfaceC5972m0 interfaceC5972m0) {
        Parcel m29373Z = m29373Z();
        C6363r0.m29992e(m29373Z, interfaceC5972m0);
        m29372U0(2, m29373Z);
    }
}
