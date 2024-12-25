package p267p6;

import android.content.Context;
import android.net.wifi.WifiManager;
import p059d9.C4392v;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/g2.class
 */
/* renamed from: p6.g2 */
/* loaded from: combined.jar:classes2.jar:p6/g2.class */
public final class C7582g2 {

    /* renamed from: a */
    public final WifiManager f36772a;

    /* renamed from: b */
    public WifiManager.WifiLock f36773b;

    /* renamed from: c */
    public boolean f36774c;

    /* renamed from: d */
    public boolean f36775d;

    public C7582g2(Context context) {
        this.f36772a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    /* renamed from: a */
    public void m32754a(boolean z10) {
        if (z10 && this.f36773b == null) {
            WifiManager wifiManager = this.f36772a;
            if (wifiManager == null) {
                C4392v.m22275i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f36773b = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        this.f36774c = z10;
        m32756c();
    }

    /* renamed from: b */
    public void m32755b(boolean z10) {
        this.f36775d = z10;
        m32756c();
    }

    /* renamed from: c */
    public final void m32756c() {
        WifiManager.WifiLock wifiLock = this.f36773b;
        if (wifiLock == null) {
            return;
        }
        if (this.f36774c && this.f36775d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
