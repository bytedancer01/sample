package p267p6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import p059d9.C4392v;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/f2.class
 */
/* renamed from: p6.f2 */
/* loaded from: combined.jar:classes2.jar:p6/f2.class */
public final class C7578f2 {

    /* renamed from: a */
    public final PowerManager f36753a;

    /* renamed from: b */
    public PowerManager.WakeLock f36754b;

    /* renamed from: c */
    public boolean f36755c;

    /* renamed from: d */
    public boolean f36756d;

    public C7578f2(Context context) {
        this.f36753a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* renamed from: a */
    public void m32717a(boolean z10) {
        if (z10 && this.f36754b == null) {
            PowerManager powerManager = this.f36753a;
            if (powerManager == null) {
                C4392v.m22275i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f36754b = newWakeLock;
                newWakeLock.setReferenceCounted(false);
            }
        }
        this.f36755c = z10;
        m32719c();
    }

    /* renamed from: b */
    public void m32718b(boolean z10) {
        this.f36756d = z10;
        m32719c();
    }

    @SuppressLint({"WakelockTimeout"})
    /* renamed from: c */
    public final void m32719c() {
        PowerManager.WakeLock wakeLock = this.f36754b;
        if (wakeLock == null) {
            return;
        }
        if (this.f36755c && this.f36756d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
