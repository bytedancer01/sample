package p216m9;

import android.os.IBinder;
import android.os.Parcel;
import ga.InterfaceC4993a;
import ma.C6005a;
import ma.C6363r0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/g0.class
 */
/* renamed from: m9.g0 */
/* loaded from: combined.jar:classes2.jar:m9/g0.class */
public final class C5954g0 extends C6005a implements InterfaceC5960i0 {
    public C5954g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    @Override // p216m9.InterfaceC5960i0
    /* renamed from: V0 */
    public final void mo29299V0(int i10) {
        Parcel m29373Z = m29373Z();
        m29373Z.writeInt(i10);
        m29372U0(13, m29373Z);
    }

    @Override // p216m9.InterfaceC5960i0
    /* renamed from: b */
    public final InterfaceC4993a mo29300b() {
        Parcel m29374y0 = m29374y0(1, m29373Z());
        InterfaceC4993a m25159y0 = InterfaceC4993a.a.m25159y0(m29374y0.readStrongBinder());
        m29374y0.recycle();
        return m25159y0;
    }

    @Override // p216m9.InterfaceC5960i0
    /* renamed from: c */
    public final int mo29301c() {
        Parcel m29374y0 = m29374y0(17, m29373Z());
        int readInt = m29374y0.readInt();
        m29374y0.recycle();
        return readInt;
    }

    @Override // p216m9.InterfaceC5960i0
    /* renamed from: d */
    public final int mo29302d() {
        Parcel m29374y0 = m29374y0(18, m29373Z());
        int readInt = m29374y0.readInt();
        m29374y0.recycle();
        return readInt;
    }

    @Override // p216m9.InterfaceC5960i0
    /* renamed from: i */
    public final boolean mo29303i() {
        Parcel m29374y0 = m29374y0(6, m29373Z());
        boolean m29993f = C6363r0.m29993f(m29374y0);
        m29374y0.recycle();
        return m29993f;
    }

    @Override // p216m9.InterfaceC5960i0
    /* renamed from: q */
    public final void mo29304q(int i10) {
        Parcel m29373Z = m29373Z();
        m29373Z.writeInt(i10);
        m29372U0(15, m29373Z);
    }

    @Override // p216m9.InterfaceC5960i0
    /* renamed from: r */
    public final boolean mo29305r() {
        Parcel m29374y0 = m29374y0(9, m29373Z());
        boolean m29993f = C6363r0.m29993f(m29374y0);
        m29374y0.recycle();
        return m29993f;
    }

    @Override // p216m9.InterfaceC5960i0
    /* renamed from: v */
    public final boolean mo29306v() {
        Parcel m29374y0 = m29374y0(5, m29373Z());
        boolean m29993f = C6363r0.m29993f(m29374y0);
        m29374y0.recycle();
        return m29993f;
    }

    @Override // p216m9.InterfaceC5960i0
    /* renamed from: x */
    public final void mo29307x(int i10) {
        Parcel m29373Z = m29373Z();
        m29373Z.writeInt(i10);
        m29372U0(12, m29373Z);
    }
}
