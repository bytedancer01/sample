package p305ra;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ga.InterfaceC4993a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/xc.class
 */
/* renamed from: ra.xc */
/* loaded from: combined.jar:classes2.jar:ra/xc.class */
public abstract class AbstractBinderC8417xc extends BinderC8329s implements InterfaceC8313qd {
    public AbstractBinderC8417xc() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC8313qd asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof InterfaceC8313qd ? (InterfaceC8313qd) queryLocalInterface : new C8401wb(iBinder);
    }

    @Override // p305ra.BinderC8329s
    /* renamed from: Z */
    public final boolean mo35777Z(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC8358td c8328rd;
        InterfaceC8358td c8328rd2;
        InterfaceC8358td c8328rd3;
        InterfaceC8358td c8328rd4;
        InterfaceC8358td c8328rd5;
        InterfaceC8358td c8328rd6;
        InterfaceC8418xd c8403wd;
        InterfaceC8358td c8328rd7;
        InterfaceC8358td c8328rd8;
        InterfaceC8358td c8328rd9;
        InterfaceC8358td c8328rd10;
        InterfaceC8358td c8328rd11;
        InterfaceC8358td c8328rd12;
        InterfaceC8388vd c8373ud;
        InterfaceC8388vd c8373ud2;
        InterfaceC8388vd c8373ud3;
        InterfaceC8358td c8328rd13;
        InterfaceC8358td c8328rd14;
        switch (i10) {
            case 1:
                initialize(InterfaceC4993a.a.m25159y0(parcel.readStrongBinder()), (C8433yd) C8255n0.m35633c(parcel, C8433yd.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) C8255n0.m35633c(parcel, Bundle.CREATOR), C8255n0.m35631a(parcel), C8255n0.m35631a(parcel), parcel.readLong());
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) C8255n0.m35633c(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c8328rd = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c8328rd = queryLocalInterface instanceof InterfaceC8358td ? (InterfaceC8358td) queryLocalInterface : new C8328rd(readStrongBinder);
                }
                logEventAndBundle(readString, readString2, bundle, c8328rd, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), InterfaceC4993a.a.m25159y0(parcel.readStrongBinder()), C8255n0.m35631a(parcel), parcel.readLong());
                break;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean m35631a = C8255n0.m35631a(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    c8328rd2 = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c8328rd2 = queryLocalInterface2 instanceof InterfaceC8358td ? (InterfaceC8358td) queryLocalInterface2 : new C8328rd(readStrongBinder2);
                }
                getUserProperties(readString3, readString4, m35631a, c8328rd2);
                break;
            case 6:
                String readString5 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    c8328rd3 = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c8328rd3 = queryLocalInterface3 instanceof InterfaceC8358td ? (InterfaceC8358td) queryLocalInterface3 : new C8328rd(readStrongBinder3);
                }
                getMaxUserProperties(readString5, c8328rd3);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) C8255n0.m35633c(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) C8255n0.m35633c(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    c8328rd4 = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c8328rd4 = queryLocalInterface4 instanceof InterfaceC8358td ? (InterfaceC8358td) queryLocalInterface4 : new C8328rd(readStrongBinder4);
                }
                getConditionalUserProperties(readString6, readString7, c8328rd4);
                break;
            case 11:
                setMeasurementEnabled(C8255n0.m35631a(parcel), parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(InterfaceC4993a.a.m25159y0(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 == null) {
                    c8328rd5 = null;
                } else {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c8328rd5 = queryLocalInterface5 instanceof InterfaceC8358td ? (InterfaceC8358td) queryLocalInterface5 : new C8328rd(readStrongBinder5);
                }
                getCurrentScreenName(c8328rd5);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 == null) {
                    c8328rd6 = null;
                } else {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c8328rd6 = queryLocalInterface6 instanceof InterfaceC8358td ? (InterfaceC8358td) queryLocalInterface6 : new C8328rd(readStrongBinder6);
                }
                getCurrentScreenClass(c8328rd6);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 == null) {
                    c8403wd = null;
                } else {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    c8403wd = queryLocalInterface7 instanceof InterfaceC8418xd ? (InterfaceC8418xd) queryLocalInterface7 : new C8403wd(readStrongBinder7);
                }
                setInstanceIdProvider(c8403wd);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 == null) {
                    c8328rd7 = null;
                } else {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c8328rd7 = queryLocalInterface8 instanceof InterfaceC8358td ? (InterfaceC8358td) queryLocalInterface8 : new C8328rd(readStrongBinder8);
                }
                getCachedAppInstanceId(c8328rd7);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 == null) {
                    c8328rd8 = null;
                } else {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c8328rd8 = queryLocalInterface9 instanceof InterfaceC8358td ? (InterfaceC8358td) queryLocalInterface9 : new C8328rd(readStrongBinder9);
                }
                getAppInstanceId(c8328rd8);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 == null) {
                    c8328rd9 = null;
                } else {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c8328rd9 = queryLocalInterface10 instanceof InterfaceC8358td ? (InterfaceC8358td) queryLocalInterface10 : new C8328rd(readStrongBinder10);
                }
                getGmpAppId(c8328rd9);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 == null) {
                    c8328rd10 = null;
                } else {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c8328rd10 = queryLocalInterface11 instanceof InterfaceC8358td ? (InterfaceC8358td) queryLocalInterface11 : new C8328rd(readStrongBinder11);
                }
                generateEventId(c8328rd10);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(InterfaceC4993a.a.m25159y0(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(InterfaceC4993a.a.m25159y0(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(InterfaceC4993a.a.m25159y0(parcel.readStrongBinder()), (Bundle) C8255n0.m35633c(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(InterfaceC4993a.a.m25159y0(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(InterfaceC4993a.a.m25159y0(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(InterfaceC4993a.a.m25159y0(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                InterfaceC4993a m25159y0 = InterfaceC4993a.a.m25159y0(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 == null) {
                    c8328rd11 = null;
                } else {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c8328rd11 = queryLocalInterface12 instanceof InterfaceC8358td ? (InterfaceC8358td) queryLocalInterface12 : new C8328rd(readStrongBinder12);
                }
                onActivitySaveInstanceState(m25159y0, c8328rd11, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) C8255n0.m35633c(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 == null) {
                    c8328rd12 = null;
                } else {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c8328rd12 = queryLocalInterface13 instanceof InterfaceC8358td ? (InterfaceC8358td) queryLocalInterface13 : new C8328rd(readStrongBinder13);
                }
                performAction(bundle2, c8328rd12, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), InterfaceC4993a.a.m25159y0(parcel.readStrongBinder()), InterfaceC4993a.a.m25159y0(parcel.readStrongBinder()), InterfaceC4993a.a.m25159y0(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 == null) {
                    c8373ud = null;
                } else {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c8373ud = queryLocalInterface14 instanceof InterfaceC8388vd ? (InterfaceC8388vd) queryLocalInterface14 : new C8373ud(readStrongBinder14);
                }
                setEventInterceptor(c8373ud);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 == null) {
                    c8373ud2 = null;
                } else {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c8373ud2 = queryLocalInterface15 instanceof InterfaceC8388vd ? (InterfaceC8388vd) queryLocalInterface15 : new C8373ud(readStrongBinder15);
                }
                registerOnMeasurementEventListener(c8373ud2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 == null) {
                    c8373ud3 = null;
                } else {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c8373ud3 = queryLocalInterface16 instanceof InterfaceC8388vd ? (InterfaceC8388vd) queryLocalInterface16 : new C8373ud(readStrongBinder16);
                }
                unregisterOnMeasurementEventListener(c8373ud3);
                break;
            case 37:
                initForTests(C8255n0.m35636f(parcel));
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 == null) {
                    c8328rd13 = null;
                } else {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c8328rd13 = queryLocalInterface17 instanceof InterfaceC8358td ? (InterfaceC8358td) queryLocalInterface17 : new C8328rd(readStrongBinder17);
                }
                getTestFlag(c8328rd13, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(C8255n0.m35631a(parcel));
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 == null) {
                    c8328rd14 = null;
                } else {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c8328rd14 = queryLocalInterface18 instanceof InterfaceC8358td ? (InterfaceC8358td) queryLocalInterface18 : new C8328rd(readStrongBinder18);
                }
                isDataCollectionEnabled(c8328rd14);
                break;
            case 41:
            default:
                return false;
            case 42:
                setDefaultEventParameters((Bundle) C8255n0.m35633c(parcel, Bundle.CREATOR));
                break;
            case 43:
                clearMeasurementEnabled(parcel.readLong());
                break;
            case 44:
                setConsent((Bundle) C8255n0.m35633c(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 45:
                setConsentThirdParty((Bundle) C8255n0.m35633c(parcel, Bundle.CREATOR), parcel.readLong());
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
