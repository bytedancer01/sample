package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import p071e2.AbstractC4582k;
import p089f2.C4759i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/impl/background/systemalarm/RescheduleReceiver.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/work/impl/background/systemalarm/RescheduleReceiver.class */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f5214a = AbstractC4582k.m23128f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC4582k.m23126c().mo23129a(f5214a, String.format("Received intent %s", intent), new Throwable[0]);
        if (Build.VERSION.SDK_INT < 23) {
            context.startService(C0763a.m4927d(context));
            return;
        }
        try {
            C4759i.m24111m(context).m24124v(goAsync());
        } catch (IllegalStateException e10) {
            AbstractC4582k.m23126c().mo23130b(f5214a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
