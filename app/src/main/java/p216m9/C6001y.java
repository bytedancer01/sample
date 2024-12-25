package p216m9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import ma.C6005a;
import ma.C6363r0;
import p200l9.C5754d;
import p350u9.C8804b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/y.class
 */
/* renamed from: m9.y */
/* loaded from: combined.jar:classes2.jar:m9/y.class */
public final class C6001y extends C6005a implements InterfaceC5936a0 {
    public C6001y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    @Override // p216m9.InterfaceC5936a0
    /* renamed from: Q */
    public final void mo29228Q(C8804b c8804b) {
        Parcel m29373Z = m29373Z();
        C6363r0.m29990c(m29373Z, c8804b);
        m29372U0(3, m29373Z);
    }

    @Override // p216m9.InterfaceC5936a0
    /* renamed from: R0 */
    public final void mo29229R0(C5754d c5754d, String str, String str2, boolean z10) {
        Parcel m29373Z = m29373Z();
        C6363r0.m29990c(m29373Z, c5754d);
        m29373Z.writeString(str);
        m29373Z.writeString(str2);
        m29373Z.writeInt(z10 ? 1 : 0);
        m29372U0(4, m29373Z);
    }

    @Override // p216m9.InterfaceC5936a0
    /* renamed from: m */
    public final void mo29230m(int i10) {
        Parcel m29373Z = m29373Z();
        m29373Z.writeInt(i10);
        m29372U0(5, m29373Z);
    }

    @Override // p216m9.InterfaceC5936a0
    /* renamed from: q */
    public final void mo29231q(int i10) {
        Parcel m29373Z = m29373Z();
        m29373Z.writeInt(i10);
        m29372U0(2, m29373Z);
    }

    @Override // p216m9.InterfaceC5936a0
    /* renamed from: s0 */
    public final void mo29232s0(boolean z10, int i10) {
        Parcel m29373Z = m29373Z();
        ClassLoader classLoader = C6363r0.f33991a;
        m29373Z.writeInt(z10 ? 1 : 0);
        m29373Z.writeInt(0);
        m29372U0(6, m29373Z);
    }

    @Override // p216m9.InterfaceC5936a0
    /* renamed from: t */
    public final void mo29233t(Bundle bundle) {
        Parcel m29373Z = m29373Z();
        C6363r0.m29990c(m29373Z, null);
        m29372U0(1, m29373Z);
    }
}
