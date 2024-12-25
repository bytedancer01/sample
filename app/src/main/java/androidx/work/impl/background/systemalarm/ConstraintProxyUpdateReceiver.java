package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import p071e2.AbstractC4582k;
import p089f2.C4759i;
import p237o2.C6872e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver.class */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f5209a = AbstractC4582k.m23128f("ConstrntProxyUpdtRecvr");

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver$a.class
     */
    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver$a.class */
    public class RunnableC0762a implements Runnable {

        /* renamed from: b */
        public final Intent f5210b;

        /* renamed from: c */
        public final Context f5211c;

        /* renamed from: d */
        public final BroadcastReceiver.PendingResult f5212d;

        /* renamed from: e */
        public final ConstraintProxyUpdateReceiver f5213e;

        public RunnableC0762a(ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver, Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f5213e = constraintProxyUpdateReceiver;
            this.f5210b = intent;
            this.f5211c = context;
            this.f5212d = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f5210b.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f5210b.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f5210b.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f5210b.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                AbstractC4582k.m23126c().mo23129a(ConstraintProxyUpdateReceiver.f5209a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                C6872e.m31709a(this.f5211c, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C6872e.m31709a(this.f5211c, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C6872e.m31709a(this.f5211c, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C6872e.m31709a(this.f5211c, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f5212d.finish();
            }
        }
    }

    /* renamed from: a */
    public static Intent m4921a(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C4759i.m24111m(context).m24120r().mo33902b(new RunnableC0762a(this, intent, context, goAsync()));
        } else {
            AbstractC4582k.m23126c().mo23129a(f5209a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}
