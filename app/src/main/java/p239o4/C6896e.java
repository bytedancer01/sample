package p239o4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import p239o4.InterfaceC6894c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o4/e.class
 */
/* renamed from: o4.e */
/* loaded from: combined.jar:classes1.jar:o4/e.class */
public class C6896e implements InterfaceC6894c {

    /* renamed from: a */
    public final Context f35718a;

    /* renamed from: b */
    public final InterfaceC6894c.a f35719b;

    /* renamed from: c */
    public boolean f35720c;

    /* renamed from: d */
    public boolean f35721d;

    /* renamed from: e */
    public final BroadcastReceiver f35722e = new a(this);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o4/e$a.class
     */
    /* renamed from: o4.e$a */
    /* loaded from: combined.jar:classes1.jar:o4/e$a.class */
    public class a extends BroadcastReceiver {

        /* renamed from: a */
        public final C6896e f35723a;

        public a(C6896e c6896e) {
            this.f35723a = c6896e;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z10 = this.f35723a.f35720c;
            C6896e c6896e = this.f35723a;
            c6896e.f35720c = c6896e.m31807l(context);
            if (z10 != this.f35723a.f35720c) {
                this.f35723a.f35719b.onConnectivityChanged(this.f35723a.f35720c);
            }
        }
    }

    public C6896e(Context context, InterfaceC6894c.a aVar) {
        this.f35718a = context.getApplicationContext();
        this.f35719b = aVar;
    }

    /* renamed from: l */
    public final boolean m31807l(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: m */
    public final void m31808m() {
        if (this.f35721d) {
            return;
        }
        this.f35720c = m31807l(this.f35718a);
        this.f35718a.registerReceiver(this.f35722e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f35721d = true;
    }

    /* renamed from: n */
    public final void m31809n() {
        if (this.f35721d) {
            this.f35718a.unregisterReceiver(this.f35722e);
            this.f35721d = false;
        }
    }

    @Override // p239o4.InterfaceC6899h
    public void onDestroy() {
    }

    @Override // p239o4.InterfaceC6899h
    public void onStart() {
        m31808m();
    }

    @Override // p239o4.InterfaceC6899h
    public void onStop() {
        m31809n();
    }
}
