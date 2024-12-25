package p422y9;

import android.os.IBinder;
import android.os.Parcel;
import ga.InterfaceC4993a;
import p245oa.C6954a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/s1.class
 */
/* renamed from: y9.s1 */
/* loaded from: combined.jar:classes2.jar:y9/s1.class */
public final class C9949s1 extends C6954a implements InterfaceC9955u1 {
    public C9949s1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // p422y9.InterfaceC9955u1
    /* renamed from: l */
    public final int mo37734l() {
        Parcel m31947Z = m31947Z(2, m31948y0());
        int readInt = m31947Z.readInt();
        m31947Z.recycle();
        return readInt;
    }

    @Override // p422y9.InterfaceC9955u1
    /* renamed from: o */
    public final InterfaceC4993a mo37735o() {
        Parcel m31947Z = m31947Z(1, m31948y0());
        InterfaceC4993a m25159y0 = InterfaceC4993a.a.m25159y0(m31947Z.readStrongBinder());
        m31947Z.recycle();
        return m25159y0;
    }
}
