package ma;

import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.services.p045s3.internal.Constants;
import ga.InterfaceC4993a;
import java.util.Map;
import p216m9.AbstractBinderC5948e0;
import p216m9.AbstractBinderC5957h0;
import p216m9.AbstractBinderC5985q1;
import p216m9.AbstractBinderC6003z;
import p216m9.C5941c;
import p216m9.InterfaceC5936a0;
import p216m9.InterfaceC5951f0;
import p216m9.InterfaceC5960i0;
import p216m9.InterfaceC5979o1;
import p216m9.InterfaceC5984q0;
import p216m9.InterfaceC5988r1;
import p244o9.AbstractBinderC6938h;
import p244o9.InterfaceC6939i;
import p244o9.InterfaceC6941k;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/j.class
 */
/* renamed from: ma.j */
/* loaded from: combined.jar:classes2.jar:ma/j.class */
public final class C6194j extends C6005a implements InterfaceC6215k {
    public C6194j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    @Override // ma.InterfaceC6215k
    /* renamed from: D0 */
    public final InterfaceC5988r1 mo29765D0(InterfaceC4993a interfaceC4993a, C5941c c5941c, InterfaceC6257m interfaceC6257m, Map map) {
        Parcel m29373Z = m29373Z();
        C6363r0.m29992e(m29373Z, interfaceC4993a);
        C6363r0.m29990c(m29373Z, c5941c);
        C6363r0.m29992e(m29373Z, interfaceC6257m);
        m29373Z.writeMap(map);
        Parcel m29374y0 = m29374y0(1, m29373Z);
        InterfaceC5988r1 m29346y0 = AbstractBinderC5985q1.m29346y0(m29374y0.readStrongBinder());
        m29374y0.recycle();
        return m29346y0;
    }

    @Override // ma.InterfaceC6215k
    /* renamed from: Y */
    public final InterfaceC5951f0 mo29766Y(InterfaceC4993a interfaceC4993a, InterfaceC4993a interfaceC4993a2, InterfaceC4993a interfaceC4993a3) {
        Parcel m29373Z = m29373Z();
        C6363r0.m29992e(m29373Z, interfaceC4993a);
        C6363r0.m29992e(m29373Z, interfaceC4993a2);
        C6363r0.m29992e(m29373Z, interfaceC4993a3);
        Parcel m29374y0 = m29374y0(5, m29373Z);
        InterfaceC5951f0 m29294y0 = AbstractBinderC5948e0.m29294y0(m29374y0.readStrongBinder());
        m29374y0.recycle();
        return m29294y0;
    }

    @Override // ma.InterfaceC6215k
    /* renamed from: q0 */
    public final InterfaceC6939i mo29767q0(InterfaceC4993a interfaceC4993a, InterfaceC6941k interfaceC6941k, int i10, int i11, boolean z10, long j10, int i12, int i13, int i14) {
        Parcel m29373Z = m29373Z();
        C6363r0.m29992e(m29373Z, interfaceC4993a);
        C6363r0.m29992e(m29373Z, interfaceC6941k);
        m29373Z.writeInt(i10);
        m29373Z.writeInt(i11);
        m29373Z.writeInt(0);
        m29373Z.writeLong(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        m29373Z.writeInt(5);
        m29373Z.writeInt(333);
        m29373Z.writeInt(Constants.MAXIMUM_UPLOAD_PARTS);
        Parcel m29374y0 = m29374y0(6, m29373Z);
        InterfaceC6939i m31908y0 = AbstractBinderC6938h.m31908y0(m29374y0.readStrongBinder());
        m29374y0.recycle();
        return m31908y0;
    }

    @Override // ma.InterfaceC6215k
    /* renamed from: s1 */
    public final InterfaceC5960i0 mo29768s1(String str, String str2, InterfaceC5984q0 interfaceC5984q0) {
        Parcel m29373Z = m29373Z();
        m29373Z.writeString(str);
        m29373Z.writeString(str2);
        C6363r0.m29992e(m29373Z, interfaceC5984q0);
        Parcel m29374y0 = m29374y0(2, m29373Z);
        InterfaceC5960i0 m29308y0 = AbstractBinderC5957h0.m29308y0(m29374y0.readStrongBinder());
        m29374y0.recycle();
        return m29308y0;
    }

    @Override // ma.InterfaceC6215k
    /* renamed from: t0 */
    public final InterfaceC5936a0 mo29769t0(C5941c c5941c, InterfaceC4993a interfaceC4993a, InterfaceC5979o1 interfaceC5979o1) {
        Parcel m29373Z = m29373Z();
        C6363r0.m29990c(m29373Z, c5941c);
        C6363r0.m29992e(m29373Z, interfaceC4993a);
        C6363r0.m29992e(m29373Z, interfaceC5979o1);
        Parcel m29374y0 = m29374y0(3, m29373Z);
        InterfaceC5936a0 m29370y0 = AbstractBinderC6003z.m29370y0(m29374y0.readStrongBinder());
        m29374y0.recycle();
        return m29370y0;
    }
}
