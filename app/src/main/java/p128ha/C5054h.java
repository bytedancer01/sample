package p128ha;

import android.os.IBinder;
import android.os.Parcel;
import ga.InterfaceC4993a;
import p245oa.C6954a;
import p245oa.C6956c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ha/h.class
 */
/* renamed from: ha.h */
/* loaded from: combined.jar:classes2.jar:ha/h.class */
public final class C5054h extends C6954a {
    public C5054h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: B1 */
    public final int m25277B1(InterfaceC4993a interfaceC4993a, String str, boolean z10) {
        Parcel m31948y0 = m31948y0();
        C6956c.m31953d(m31948y0, interfaceC4993a);
        m31948y0.writeString(str);
        C6956c.m31951b(m31948y0, z10);
        Parcel m31947Z = m31947Z(5, m31948y0);
        int readInt = m31947Z.readInt();
        m31947Z.recycle();
        return readInt;
    }

    /* renamed from: C1 */
    public final InterfaceC4993a m25278C1(InterfaceC4993a interfaceC4993a, String str, int i10) {
        Parcel m31948y0 = m31948y0();
        C6956c.m31953d(m31948y0, interfaceC4993a);
        m31948y0.writeString(str);
        m31948y0.writeInt(i10);
        Parcel m31947Z = m31947Z(2, m31948y0);
        InterfaceC4993a m25159y0 = InterfaceC4993a.a.m25159y0(m31947Z.readStrongBinder());
        m31947Z.recycle();
        return m25159y0;
    }

    /* renamed from: D1 */
    public final InterfaceC4993a m25279D1(InterfaceC4993a interfaceC4993a, String str, int i10, InterfaceC4993a interfaceC4993a2) {
        Parcel m31948y0 = m31948y0();
        C6956c.m31953d(m31948y0, interfaceC4993a);
        m31948y0.writeString(str);
        m31948y0.writeInt(i10);
        C6956c.m31953d(m31948y0, interfaceC4993a2);
        Parcel m31947Z = m31947Z(8, m31948y0);
        InterfaceC4993a m25159y0 = InterfaceC4993a.a.m25159y0(m31947Z.readStrongBinder());
        m31947Z.recycle();
        return m25159y0;
    }

    /* renamed from: E1 */
    public final InterfaceC4993a m25280E1(InterfaceC4993a interfaceC4993a, String str, int i10) {
        Parcel m31948y0 = m31948y0();
        C6956c.m31953d(m31948y0, interfaceC4993a);
        m31948y0.writeString(str);
        m31948y0.writeInt(i10);
        Parcel m31947Z = m31947Z(4, m31948y0);
        InterfaceC4993a m25159y0 = InterfaceC4993a.a.m25159y0(m31947Z.readStrongBinder());
        m31947Z.recycle();
        return m25159y0;
    }

    /* renamed from: F1 */
    public final InterfaceC4993a m25281F1(InterfaceC4993a interfaceC4993a, String str, boolean z10, long j10) {
        Parcel m31948y0 = m31948y0();
        C6956c.m31953d(m31948y0, interfaceC4993a);
        m31948y0.writeString(str);
        C6956c.m31951b(m31948y0, z10);
        m31948y0.writeLong(j10);
        Parcel m31947Z = m31947Z(7, m31948y0);
        InterfaceC4993a m25159y0 = InterfaceC4993a.a.m25159y0(m31947Z.readStrongBinder());
        m31947Z.recycle();
        return m25159y0;
    }

    /* renamed from: U0 */
    public final int m25282U0(InterfaceC4993a interfaceC4993a, String str, boolean z10) {
        Parcel m31948y0 = m31948y0();
        C6956c.m31953d(m31948y0, interfaceC4993a);
        m31948y0.writeString(str);
        C6956c.m31951b(m31948y0, z10);
        Parcel m31947Z = m31947Z(3, m31948y0);
        int readInt = m31947Z.readInt();
        m31947Z.recycle();
        return readInt;
    }

    /* renamed from: c */
    public final int m25283c() {
        Parcel m31947Z = m31947Z(6, m31948y0());
        int readInt = m31947Z.readInt();
        m31947Z.recycle();
        return readInt;
    }
}
