package p305ra;

import android.os.Bundle;
import android.os.IInterface;
import ga.InterfaceC4993a;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/qd.class
 */
/* renamed from: ra.qd */
/* loaded from: combined.jar:classes2.jar:ra/qd.class */
public interface InterfaceC8313qd extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(InterfaceC8358td interfaceC8358td);

    void getAppInstanceId(InterfaceC8358td interfaceC8358td);

    void getCachedAppInstanceId(InterfaceC8358td interfaceC8358td);

    void getConditionalUserProperties(String str, String str2, InterfaceC8358td interfaceC8358td);

    void getCurrentScreenClass(InterfaceC8358td interfaceC8358td);

    void getCurrentScreenName(InterfaceC8358td interfaceC8358td);

    void getGmpAppId(InterfaceC8358td interfaceC8358td);

    void getMaxUserProperties(String str, InterfaceC8358td interfaceC8358td);

    void getTestFlag(InterfaceC8358td interfaceC8358td, int i10);

    void getUserProperties(String str, String str2, boolean z10, InterfaceC8358td interfaceC8358td);

    void initForTests(Map map);

    void initialize(InterfaceC4993a interfaceC4993a, C8433yd c8433yd, long j10);

    void isDataCollectionEnabled(InterfaceC8358td interfaceC8358td);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC8358td interfaceC8358td, long j10);

    void logHealthData(int i10, String str, InterfaceC4993a interfaceC4993a, InterfaceC4993a interfaceC4993a2, InterfaceC4993a interfaceC4993a3);

    void onActivityCreated(InterfaceC4993a interfaceC4993a, Bundle bundle, long j10);

    void onActivityDestroyed(InterfaceC4993a interfaceC4993a, long j10);

    void onActivityPaused(InterfaceC4993a interfaceC4993a, long j10);

    void onActivityResumed(InterfaceC4993a interfaceC4993a, long j10);

    void onActivitySaveInstanceState(InterfaceC4993a interfaceC4993a, InterfaceC8358td interfaceC8358td, long j10);

    void onActivityStarted(InterfaceC4993a interfaceC4993a, long j10);

    void onActivityStopped(InterfaceC4993a interfaceC4993a, long j10);

    void performAction(Bundle bundle, InterfaceC8358td interfaceC8358td, long j10);

    void registerOnMeasurementEventListener(InterfaceC8388vd interfaceC8388vd);

    void resetAnalyticsData(long j10);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(InterfaceC4993a interfaceC4993a, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(InterfaceC8388vd interfaceC8388vd);

    void setInstanceIdProvider(InterfaceC8418xd interfaceC8418xd);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, InterfaceC4993a interfaceC4993a, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(InterfaceC8388vd interfaceC8388vd);
}
