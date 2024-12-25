package p383w9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/n1.class
 */
/* renamed from: w9.n1 */
/* loaded from: combined.jar:classes2.jar:w9/n1.class */
public final class C9499n1 extends BroadcastReceiver {

    /* renamed from: a */
    public Context f43356a;

    /* renamed from: b */
    public final AbstractC9494m1 f43357b;

    public C9499n1(AbstractC9494m1 abstractC9494m1) {
        this.f43357b = abstractC9494m1;
    }

    /* renamed from: a */
    public final void m39973a(Context context) {
        this.f43356a = context;
    }

    /* renamed from: b */
    public final void m39974b() {
        synchronized (this) {
            Context context = this.f43356a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f43356a = null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f43357b.mo39951a();
            m39974b();
        }
    }
}
