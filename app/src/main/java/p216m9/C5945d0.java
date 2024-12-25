package p216m9;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import ma.C6005a;
import ma.C6363r0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/d0.class
 */
/* renamed from: m9.d0 */
/* loaded from: combined.jar:classes2.jar:m9/d0.class */
public final class C5945d0 extends C6005a implements InterfaceC5951f0 {
    public C5945d0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService");
    }

    @Override // p216m9.InterfaceC5951f0
    /* renamed from: T */
    public final IBinder mo29268T(Intent intent) {
        Parcel m29373Z = m29373Z();
        C6363r0.m29990c(m29373Z, intent);
        Parcel m29374y0 = m29374y0(3, m29373Z);
        IBinder readStrongBinder = m29374y0.readStrongBinder();
        m29374y0.recycle();
        return readStrongBinder;
    }

    @Override // p216m9.InterfaceC5951f0
    /* renamed from: b */
    public final void mo29269b() {
        m29372U0(1, m29373Z());
    }

    @Override // p216m9.InterfaceC5951f0
    /* renamed from: p */
    public final void mo29270p() {
        m29372U0(4, m29373Z());
    }

    @Override // p216m9.InterfaceC5951f0
    /* renamed from: z1 */
    public final int mo29271z1(Intent intent, int i10, int i11) {
        Parcel m29373Z = m29373Z();
        C6363r0.m29990c(m29373Z, intent);
        m29373Z.writeInt(i10);
        m29373Z.writeInt(i11);
        Parcel m29374y0 = m29374y0(2, m29373Z);
        int readInt = m29374y0.readInt();
        m29374y0.recycle();
        return readInt;
    }
}
