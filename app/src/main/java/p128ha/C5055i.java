package p128ha;

import android.os.IBinder;
import android.os.Parcel;
import ga.InterfaceC4993a;
import p245oa.C6954a;
import p245oa.C6956c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ha/i.class
 */
/* renamed from: ha.i */
/* loaded from: combined.jar:classes2.jar:ha/i.class */
public final class C5055i extends C6954a {
    public C5055i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: B1 */
    public final InterfaceC4993a m25284B1(InterfaceC4993a interfaceC4993a, String str, int i10, InterfaceC4993a interfaceC4993a2) {
        Parcel m31948y0 = m31948y0();
        C6956c.m31953d(m31948y0, interfaceC4993a);
        m31948y0.writeString(str);
        m31948y0.writeInt(i10);
        C6956c.m31953d(m31948y0, interfaceC4993a2);
        Parcel m31947Z = m31947Z(3, m31948y0);
        InterfaceC4993a m25159y0 = InterfaceC4993a.a.m25159y0(m31947Z.readStrongBinder());
        m31947Z.recycle();
        return m25159y0;
    }

    /* renamed from: U0 */
    public final InterfaceC4993a m25285U0(InterfaceC4993a interfaceC4993a, String str, int i10, InterfaceC4993a interfaceC4993a2) {
        Parcel m31948y0 = m31948y0();
        C6956c.m31953d(m31948y0, interfaceC4993a);
        m31948y0.writeString(str);
        m31948y0.writeInt(i10);
        C6956c.m31953d(m31948y0, interfaceC4993a2);
        Parcel m31947Z = m31947Z(2, m31948y0);
        InterfaceC4993a m25159y0 = InterfaceC4993a.a.m25159y0(m31947Z.readStrongBinder());
        m31947Z.recycle();
        return m25159y0;
    }
}
