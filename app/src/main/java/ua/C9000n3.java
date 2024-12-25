package ua;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p305ra.C8059a;
import p305ra.C8255n0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/n3.class
 */
/* renamed from: ua.n3 */
/* loaded from: combined.jar:classes2.jar:ua/n3.class */
public final class C9000n3 extends C8059a implements InterfaceC9024p3 {
    public C9000n3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: B0 */
    public final void mo38140B0(C8959ja c8959ja) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35634d(m34985Z, c8959ja);
        m34986y0(6, m34985Z);
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: C0 */
    public final void mo38141C0(C8852b c8852b, C8959ja c8959ja) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35634d(m34985Z, c8852b);
        C8255n0.m35634d(m34985Z, c8959ja);
        m34986y0(12, m34985Z);
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: D */
    public final List<C8851aa> mo38142D(String str, String str2, boolean z10, C8959ja c8959ja) {
        Parcel m34985Z = m34985Z();
        m34985Z.writeString(str);
        m34985Z.writeString(str2);
        C8255n0.m35632b(m34985Z, z10);
        C8255n0.m35634d(m34985Z, c8959ja);
        Parcel m34984U0 = m34984U0(14, m34985Z);
        ArrayList createTypedArrayList = m34984U0.createTypedArrayList(C8851aa.CREATOR);
        m34984U0.recycle();
        return createTypedArrayList;
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: P0 */
    public final void mo38143P0(C8959ja c8959ja) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35634d(m34985Z, c8959ja);
        m34986y0(4, m34985Z);
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: Q0 */
    public final void mo38144Q0(long j10, String str, String str2, String str3) {
        Parcel m34985Z = m34985Z();
        m34985Z.writeLong(j10);
        m34985Z.writeString(str);
        m34985Z.writeString(str2);
        m34985Z.writeString(str3);
        m34986y0(10, m34985Z);
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: S */
    public final List<C8852b> mo38145S(String str, String str2, String str3) {
        Parcel m34985Z = m34985Z();
        m34985Z.writeString(null);
        m34985Z.writeString(str2);
        m34985Z.writeString(str3);
        Parcel m34984U0 = m34984U0(17, m34985Z);
        ArrayList createTypedArrayList = m34984U0.createTypedArrayList(C8852b.CREATOR);
        m34984U0.recycle();
        return createTypedArrayList;
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: X0 */
    public final List<C8852b> mo38146X0(String str, String str2, C8959ja c8959ja) {
        Parcel m34985Z = m34985Z();
        m34985Z.writeString(str);
        m34985Z.writeString(str2);
        C8255n0.m35634d(m34985Z, c8959ja);
        Parcel m34984U0 = m34984U0(16, m34985Z);
        ArrayList createTypedArrayList = m34984U0.createTypedArrayList(C8852b.CREATOR);
        m34984U0.recycle();
        return createTypedArrayList;
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: Y0 */
    public final void mo38147Y0(C8959ja c8959ja) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35634d(m34985Z, c8959ja);
        m34986y0(20, m34985Z);
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: d1 */
    public final void mo38148d1(C8959ja c8959ja) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35634d(m34985Z, c8959ja);
        m34986y0(18, m34985Z);
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: f0 */
    public final String mo38149f0(C8959ja c8959ja) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35634d(m34985Z, c8959ja);
        Parcel m34984U0 = m34984U0(11, m34985Z);
        String readString = m34984U0.readString();
        m34984U0.recycle();
        return readString;
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: g1 */
    public final void mo38150g1(Bundle bundle, C8959ja c8959ja) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35634d(m34985Z, bundle);
        C8255n0.m35634d(m34985Z, c8959ja);
        m34986y0(19, m34985Z);
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: i1 */
    public final byte[] mo38151i1(C9068t c9068t, String str) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35634d(m34985Z, c9068t);
        m34985Z.writeString(str);
        Parcel m34984U0 = m34984U0(9, m34985Z);
        byte[] createByteArray = m34984U0.createByteArray();
        m34984U0.recycle();
        return createByteArray;
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: q1 */
    public final void mo38152q1(C8851aa c8851aa, C8959ja c8959ja) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35634d(m34985Z, c8851aa);
        C8255n0.m35634d(m34985Z, c8959ja);
        m34986y0(2, m34985Z);
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: t1 */
    public final void mo38153t1(C9068t c9068t, C8959ja c8959ja) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35634d(m34985Z, c9068t);
        C8255n0.m35634d(m34985Z, c8959ja);
        m34986y0(1, m34985Z);
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: w0 */
    public final List<C8851aa> mo38154w0(String str, String str2, String str3, boolean z10) {
        Parcel m34985Z = m34985Z();
        m34985Z.writeString(null);
        m34985Z.writeString(str2);
        m34985Z.writeString(str3);
        C8255n0.m35632b(m34985Z, z10);
        Parcel m34984U0 = m34984U0(15, m34985Z);
        ArrayList createTypedArrayList = m34984U0.createTypedArrayList(C8851aa.CREATOR);
        m34984U0.recycle();
        return createTypedArrayList;
    }
}
