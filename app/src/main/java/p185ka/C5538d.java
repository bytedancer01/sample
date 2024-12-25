package p185ka;

import android.os.IBinder;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ka/d.class
 */
/* renamed from: ka.d */
/* loaded from: combined.jar:classes2.jar:ka/d.class */
public final class C5538d extends C5535a implements InterfaceC5540f {
    public C5538d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // p185ka.InterfaceC5540f
    /* renamed from: H */
    public final boolean mo27525H(boolean z10) {
        Parcel m27521Z = m27521Z();
        C5537c.m27523a(m27521Z, true);
        Parcel m27522y0 = m27522y0(2, m27521Z);
        boolean m27524b = C5537c.m27524b(m27522y0);
        m27522y0.recycle();
        return m27524b;
    }

    @Override // p185ka.InterfaceC5540f
    /* renamed from: l */
    public final String mo27526l() {
        Parcel m27522y0 = m27522y0(1, m27521Z());
        String readString = m27522y0.readString();
        m27522y0.recycle();
        return readString;
    }
}
