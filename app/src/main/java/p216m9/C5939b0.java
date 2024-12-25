package p216m9;

import android.os.IBinder;
import android.os.Parcel;
import ga.InterfaceC4993a;
import ma.C6005a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/b0.class
 */
/* renamed from: m9.b0 */
/* loaded from: combined.jar:classes2.jar:m9/b0.class */
public final class C5939b0 extends C6005a implements InterfaceC5942c0 {
    public C5939b0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IDiscoveryManager");
    }

    @Override // p216m9.InterfaceC5942c0
    /* renamed from: c */
    public final InterfaceC4993a mo29250c() {
        Parcel m29374y0 = m29374y0(5, m29373Z());
        InterfaceC4993a m25159y0 = InterfaceC4993a.a.m25159y0(m29374y0.readStrongBinder());
        m29374y0.recycle();
        return m25159y0;
    }
}
