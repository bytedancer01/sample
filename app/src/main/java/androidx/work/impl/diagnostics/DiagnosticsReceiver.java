package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import p071e2.AbstractC4582k;
import p071e2.AbstractC4592u;
import p071e2.C4584m;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/impl/diagnostics/DiagnosticsReceiver.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/work/impl/diagnostics/DiagnosticsReceiver.class */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f5256a = AbstractC4582k.m23128f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        AbstractC4582k.m23126c().mo23129a(f5256a, "Requesting diagnostics", new Throwable[0]);
        try {
            AbstractC4592u.m23142f(context).m23145b(C4584m.m23134d(DiagnosticsWorker.class));
        } catch (IllegalStateException e10) {
            AbstractC4582k.m23126c().mo23130b(f5256a, "WorkManager is not initialized", e10);
        }
    }
}
