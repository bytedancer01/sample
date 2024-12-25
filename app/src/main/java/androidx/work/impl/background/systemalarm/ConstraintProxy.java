package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;
import p071e2.AbstractC4582k;
import p071e2.C4573b;
import p071e2.EnumC4583l;
import p223n2.C6636p;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/impl/background/systemalarm/ConstraintProxy.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/work/impl/background/systemalarm/ConstraintProxy.class */
public abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f5208a = AbstractC4582k.m23128f("ConstraintProxy");

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/background/systemalarm/ConstraintProxy$BatteryChargingProxy.class
     */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/background/systemalarm/ConstraintProxy$BatteryChargingProxy.class */
    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/background/systemalarm/ConstraintProxy$BatteryNotLowProxy.class
     */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/background/systemalarm/ConstraintProxy$BatteryNotLowProxy.class */
    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/background/systemalarm/ConstraintProxy$NetworkStateProxy.class
     */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/background/systemalarm/ConstraintProxy$NetworkStateProxy.class */
    public static class NetworkStateProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/background/systemalarm/ConstraintProxy$StorageNotLowProxy.class
     */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/background/systemalarm/ConstraintProxy$StorageNotLowProxy.class */
    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* renamed from: a */
    public static void m4920a(Context context, List<C6636p> list) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Iterator<C6636p> it = list.iterator();
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        while (true) {
            z10 = z14;
            z11 = z15;
            z12 = z16;
            z13 = z17;
            if (!it.hasNext()) {
                break;
            }
            C4573b c4573b = it.next().f34582j;
            z10 = z14 | c4573b.m23094f();
            z11 = z15 | c4573b.m23095g();
            z12 = z16 | c4573b.m23097i();
            z13 = z17 | (c4573b.m23090b() != EnumC4583l.NOT_REQUIRED);
            z14 = z10;
            z15 = z11;
            z16 = z12;
            z17 = z13;
            if (z10) {
                z14 = z10;
                z15 = z11;
                z16 = z12;
                z17 = z13;
                if (z11) {
                    z14 = z10;
                    z15 = z11;
                    z16 = z12;
                    z17 = z13;
                    if (z12) {
                        z14 = z10;
                        z15 = z11;
                        z16 = z12;
                        z17 = z13;
                        if (z13) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.m4921a(context, z10, z11, z12, z13));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC4582k.m23126c().mo23129a(f5208a, String.format("onReceive : %s", intent), new Throwable[0]);
        context.startService(C0763a.m4924a(context));
    }
}
