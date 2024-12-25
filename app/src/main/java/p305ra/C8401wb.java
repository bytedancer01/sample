package p305ra;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import ga.InterfaceC4993a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/wb.class
 */
/* renamed from: ra.wb */
/* loaded from: combined.jar:classes2.jar:ra/wb.class */
public final class C8401wb extends C8059a implements InterfaceC8313qd {
    public C8401wb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // p305ra.InterfaceC8313qd
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel m34985Z = m34985Z();
        m34985Z.writeString(str);
        m34985Z.writeLong(j10);
        m34986y0(23, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel m34985Z = m34985Z();
        m34985Z.writeString(str);
        m34985Z.writeString(str2);
        C8255n0.m35634d(m34985Z, bundle);
        m34986y0(9, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void endAdUnitExposure(String str, long j10) {
        Parcel m34985Z = m34985Z();
        m34985Z.writeString(str);
        m34985Z.writeLong(j10);
        m34986y0(24, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void generateEventId(InterfaceC8358td interfaceC8358td) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35635e(m34985Z, interfaceC8358td);
        m34986y0(22, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void getCachedAppInstanceId(InterfaceC8358td interfaceC8358td) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35635e(m34985Z, interfaceC8358td);
        m34986y0(19, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void getConditionalUserProperties(String str, String str2, InterfaceC8358td interfaceC8358td) {
        Parcel m34985Z = m34985Z();
        m34985Z.writeString(str);
        m34985Z.writeString(str2);
        C8255n0.m35635e(m34985Z, interfaceC8358td);
        m34986y0(10, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void getCurrentScreenClass(InterfaceC8358td interfaceC8358td) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35635e(m34985Z, interfaceC8358td);
        m34986y0(17, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void getCurrentScreenName(InterfaceC8358td interfaceC8358td) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35635e(m34985Z, interfaceC8358td);
        m34986y0(16, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void getGmpAppId(InterfaceC8358td interfaceC8358td) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35635e(m34985Z, interfaceC8358td);
        m34986y0(21, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void getMaxUserProperties(String str, InterfaceC8358td interfaceC8358td) {
        Parcel m34985Z = m34985Z();
        m34985Z.writeString(str);
        C8255n0.m35635e(m34985Z, interfaceC8358td);
        m34986y0(6, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void getUserProperties(String str, String str2, boolean z10, InterfaceC8358td interfaceC8358td) {
        Parcel m34985Z = m34985Z();
        m34985Z.writeString(str);
        m34985Z.writeString(str2);
        C8255n0.m35632b(m34985Z, z10);
        C8255n0.m35635e(m34985Z, interfaceC8358td);
        m34986y0(5, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void initialize(InterfaceC4993a interfaceC4993a, C8433yd c8433yd, long j10) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35635e(m34985Z, interfaceC4993a);
        C8255n0.m35634d(m34985Z, c8433yd);
        m34985Z.writeLong(j10);
        m34986y0(1, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Parcel m34985Z = m34985Z();
        m34985Z.writeString(str);
        m34985Z.writeString(str2);
        C8255n0.m35634d(m34985Z, bundle);
        C8255n0.m35632b(m34985Z, z10);
        C8255n0.m35632b(m34985Z, z11);
        m34985Z.writeLong(j10);
        m34986y0(2, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void logHealthData(int i10, String str, InterfaceC4993a interfaceC4993a, InterfaceC4993a interfaceC4993a2, InterfaceC4993a interfaceC4993a3) {
        Parcel m34985Z = m34985Z();
        m34985Z.writeInt(5);
        m34985Z.writeString(str);
        C8255n0.m35635e(m34985Z, interfaceC4993a);
        C8255n0.m35635e(m34985Z, interfaceC4993a2);
        C8255n0.m35635e(m34985Z, interfaceC4993a3);
        m34986y0(33, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void onActivityCreated(InterfaceC4993a interfaceC4993a, Bundle bundle, long j10) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35635e(m34985Z, interfaceC4993a);
        C8255n0.m35634d(m34985Z, bundle);
        m34985Z.writeLong(j10);
        m34986y0(27, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void onActivityDestroyed(InterfaceC4993a interfaceC4993a, long j10) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35635e(m34985Z, interfaceC4993a);
        m34985Z.writeLong(j10);
        m34986y0(28, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void onActivityPaused(InterfaceC4993a interfaceC4993a, long j10) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35635e(m34985Z, interfaceC4993a);
        m34985Z.writeLong(j10);
        m34986y0(29, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void onActivityResumed(InterfaceC4993a interfaceC4993a, long j10) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35635e(m34985Z, interfaceC4993a);
        m34985Z.writeLong(j10);
        m34986y0(30, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void onActivitySaveInstanceState(InterfaceC4993a interfaceC4993a, InterfaceC8358td interfaceC8358td, long j10) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35635e(m34985Z, interfaceC4993a);
        C8255n0.m35635e(m34985Z, interfaceC8358td);
        m34985Z.writeLong(j10);
        m34986y0(31, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void onActivityStarted(InterfaceC4993a interfaceC4993a, long j10) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35635e(m34985Z, interfaceC4993a);
        m34985Z.writeLong(j10);
        m34986y0(25, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void onActivityStopped(InterfaceC4993a interfaceC4993a, long j10) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35635e(m34985Z, interfaceC4993a);
        m34985Z.writeLong(j10);
        m34986y0(26, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35634d(m34985Z, bundle);
        m34985Z.writeLong(j10);
        m34986y0(8, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void setCurrentScreen(InterfaceC4993a interfaceC4993a, String str, String str2, long j10) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35635e(m34985Z, interfaceC4993a);
        m34985Z.writeString(str);
        m34985Z.writeString(str2);
        m34985Z.writeLong(j10);
        m34986y0(15, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void setDataCollectionEnabled(boolean z10) {
        Parcel m34985Z = m34985Z();
        C8255n0.m35632b(m34985Z, z10);
        m34986y0(39, m34985Z);
    }

    @Override // p305ra.InterfaceC8313qd
    public final void setUserProperty(String str, String str2, InterfaceC4993a interfaceC4993a, boolean z10, long j10) {
        Parcel m34985Z = m34985Z();
        m34985Z.writeString(str);
        m34985Z.writeString(str2);
        C8255n0.m35635e(m34985Z, interfaceC4993a);
        C8255n0.m35632b(m34985Z, z10);
        m34985Z.writeLong(j10);
        m34986y0(4, m34985Z);
    }
}
