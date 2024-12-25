package p422y9;

import android.os.IBinder;
import android.os.Parcel;
import ga.InterfaceC4993a;
import p245oa.C6954a;
import p245oa.C6956c;
import p350u9.C8807c0;
import p350u9.C8813f0;
import p350u9.C8817h0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/r0.class
 */
/* renamed from: y9.r0 */
/* loaded from: combined.jar:classes2.jar:y9/r0.class */
public final class C9945r0 extends C6954a implements InterfaceC9951t0 {
    public C9945r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // p422y9.InterfaceC9951t0
    /* renamed from: A1 */
    public final boolean mo41874A1(C8817h0 c8817h0, InterfaceC4993a interfaceC4993a) {
        Parcel m31948y0 = m31948y0();
        C6956c.m31952c(m31948y0, c8817h0);
        C6956c.m31953d(m31948y0, interfaceC4993a);
        Parcel m31947Z = m31947Z(5, m31948y0);
        boolean m31954e = C6956c.m31954e(m31947Z);
        m31947Z.recycle();
        return m31954e;
    }

    @Override // p422y9.InterfaceC9951t0
    /* renamed from: b */
    public final boolean mo41875b() {
        Parcel m31947Z = m31947Z(7, m31948y0());
        boolean m31954e = C6956c.m31954e(m31947Z);
        m31947Z.recycle();
        return m31954e;
    }

    @Override // p422y9.InterfaceC9951t0
    /* renamed from: b1 */
    public final C8813f0 mo41876b1(C8807c0 c8807c0) {
        Parcel m31948y0 = m31948y0();
        C6956c.m31952c(m31948y0, c8807c0);
        Parcel m31947Z = m31947Z(6, m31948y0);
        C8813f0 c8813f0 = (C8813f0) C6956c.m31950a(m31947Z, C8813f0.CREATOR);
        m31947Z.recycle();
        return c8813f0;
    }
}
