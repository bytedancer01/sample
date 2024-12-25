package ma;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/n.class
 */
/* renamed from: ma.n */
/* loaded from: combined.jar:classes2.jar:ma/n.class */
public final class C6278n extends C6005a implements InterfaceC6299o {
    public C6278n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
    }

    @Override // ma.InterfaceC6299o
    /* renamed from: I */
    public final void mo29860I(String str, Bundle bundle) {
        Parcel m29373Z = m29373Z();
        m29373Z.writeString(str);
        C6363r0.m29990c(m29373Z, bundle);
        m29372U0(3, m29373Z);
    }

    @Override // ma.InterfaceC6299o
    /* renamed from: L0 */
    public final void mo29861L0(String str, String str2, Bundle bundle) {
        Parcel m29373Z = m29373Z();
        m29373Z.writeString(str);
        m29373Z.writeString(str2);
        C6363r0.m29990c(m29373Z, bundle);
        m29372U0(8, m29373Z);
    }

    @Override // ma.InterfaceC6299o
    /* renamed from: P */
    public final void mo29862P(String str, Bundle bundle) {
        Parcel m29373Z = m29373Z();
        m29373Z.writeString(str);
        C6363r0.m29990c(m29373Z, bundle);
        m29372U0(2, m29373Z);
    }

    @Override // ma.InterfaceC6299o
    /* renamed from: U */
    public final void mo29863U(String str, Bundle bundle) {
        Parcel m29373Z = m29373Z();
        m29373Z.writeString(str);
        C6363r0.m29990c(m29373Z, bundle);
        m29372U0(1, m29373Z);
    }

    @Override // ma.InterfaceC6299o
    /* renamed from: c */
    public final int mo29864c() {
        Parcel m29374y0 = m29374y0(7, m29373Z());
        int readInt = m29374y0.readInt();
        m29374y0.recycle();
        return readInt;
    }

    @Override // ma.InterfaceC6299o
    /* renamed from: z */
    public final void mo29865z(String str, Bundle bundle) {
        Parcel m29373Z = m29373Z();
        m29373Z.writeString(str);
        C6363r0.m29990c(m29373Z, bundle);
        m29372U0(4, m29373Z);
    }

    @Override // ma.InterfaceC6299o
    /* renamed from: z0 */
    public final void mo29866z0(String str, Bundle bundle, int i10) {
        Parcel m29373Z = m29373Z();
        m29373Z.writeString(str);
        C6363r0.m29990c(m29373Z, bundle);
        m29373Z.writeInt(i10);
        m29372U0(6, m29373Z);
    }
}
