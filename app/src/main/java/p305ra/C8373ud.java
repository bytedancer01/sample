package p305ra;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/ud.class
 */
/* renamed from: ra.ud */
/* loaded from: combined.jar:classes2.jar:ra/ud.class */
public final class C8373ud extends C8059a implements InterfaceC8388vd {
    public C8373ud(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // p305ra.InterfaceC8388vd
    /* renamed from: F */
    public final void mo35954F(String str, String str2, Bundle bundle, long j10) {
        Parcel m34985Z = m34985Z();
        m34985Z.writeString(str);
        m34985Z.writeString(str2);
        C8255n0.m35634d(m34985Z, bundle);
        m34985Z.writeLong(j10);
        m34986y0(1, m34985Z);
    }

    @Override // p305ra.InterfaceC8388vd
    /* renamed from: c */
    public final int mo35955c() {
        Parcel m34984U0 = m34984U0(2, m34985Z());
        int readInt = m34984U0.readInt();
        m34984U0.recycle();
        return readInt;
    }
}
