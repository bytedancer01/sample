package p216m9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ma.C6005a;
import ma.C6363r0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/p1.class
 */
/* renamed from: m9.p1 */
/* loaded from: combined.jar:classes2.jar:m9/p1.class */
public final class C5982p1 extends C6005a implements InterfaceC5988r1 {
    public C5982p1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }

    @Override // p216m9.InterfaceC5988r1
    /* renamed from: J0 */
    public final void mo29332J0(boolean z10) {
        Parcel m29373Z = m29373Z();
        ClassLoader classLoader = C6363r0.f33991a;
        m29373Z.writeInt(0);
        m29372U0(14, m29373Z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [m9.c0] */
    @Override // p216m9.InterfaceC5988r1
    /* renamed from: b */
    public final InterfaceC5942c0 mo29333b() {
        C5939b0 c5939b0;
        Parcel m29374y0 = m29374y0(6, m29373Z());
        IBinder readStrongBinder = m29374y0.readStrongBinder();
        if (readStrongBinder == null) {
            c5939b0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            c5939b0 = queryLocalInterface instanceof InterfaceC5942c0 ? (InterfaceC5942c0) queryLocalInterface : new C5939b0(readStrongBinder);
        }
        m29374y0.recycle();
        return c5939b0;
    }

    @Override // p216m9.InterfaceC5988r1
    /* renamed from: c */
    public final int mo29334c() {
        Parcel m29374y0 = m29374y0(13, m29373Z());
        int readInt = m29374y0.readInt();
        m29374y0.recycle();
        return readInt;
    }

    @Override // p216m9.InterfaceC5988r1
    /* renamed from: d */
    public final Bundle mo29335d() {
        Parcel m29374y0 = m29374y0(1, m29373Z());
        Bundle bundle = (Bundle) C6363r0.m29988a(m29374y0, Bundle.CREATOR);
        m29374y0.recycle();
        return bundle;
    }

    @Override // p216m9.InterfaceC5988r1
    /* renamed from: e1 */
    public final void mo29336e1(InterfaceC5973m1 interfaceC5973m1) {
        Parcel m29373Z = m29373Z();
        C6363r0.m29992e(m29373Z, interfaceC5973m1);
        m29372U0(3, m29373Z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [m9.k0] */
    @Override // p216m9.InterfaceC5988r1
    /* renamed from: p */
    public final InterfaceC5966k0 mo29337p() {
        C5963j0 c5963j0;
        Parcel m29374y0 = m29374y0(5, m29373Z());
        IBinder readStrongBinder = m29374y0.readStrongBinder();
        if (readStrongBinder == null) {
            c5963j0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            c5963j0 = queryLocalInterface instanceof InterfaceC5966k0 ? (InterfaceC5966k0) queryLocalInterface : new C5963j0(readStrongBinder);
        }
        m29374y0.recycle();
        return c5963j0;
    }
}
