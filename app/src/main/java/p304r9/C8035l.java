package p304r9;

import android.os.IBinder;
import android.os.Parcel;
import ma.C6005a;
import ma.C6363r0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/l.class
 */
/* renamed from: r9.l */
/* loaded from: combined.jar:classes2.jar:r9/l.class */
public final class C8035l extends C6005a {
    public C8035l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastService");
    }

    /* renamed from: C1 */
    public final void m34908C1(InterfaceC8027h interfaceC8027h, String[] strArr) {
        Parcel m29373Z = m29373Z();
        C6363r0.m29992e(m29373Z, interfaceC8027h);
        m29373Z.writeStringArray(strArr);
        m29371B1(5, m29373Z);
    }

    /* renamed from: D1 */
    public final void m34909D1(InterfaceC8027h interfaceC8027h, String[] strArr) {
        Parcel m29373Z = m29373Z();
        C6363r0.m29992e(m29373Z, interfaceC8027h);
        m29373Z.writeStringArray(strArr);
        m29371B1(7, m29373Z);
    }

    /* renamed from: E1 */
    public final void m34910E1(InterfaceC8027h interfaceC8027h, String[] strArr) {
        Parcel m29373Z = m29373Z();
        C6363r0.m29992e(m29373Z, interfaceC8027h);
        m29373Z.writeStringArray(strArr);
        m29371B1(6, m29373Z);
    }
}
