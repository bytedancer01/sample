package p230n9;

import android.os.Handler;
import java.util.TimerTask;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/n0.class
 */
/* renamed from: n9.n0 */
/* loaded from: combined.jar:classes2.jar:n9/n0.class */
public final class C6732n0 extends TimerTask {

    /* renamed from: b */
    public final C6721i f35191b;

    /* renamed from: c */
    public final C6734o0 f35192c;

    public C6732n0(C6734o0 c6734o0, C6721i c6721i) {
        this.f35192c = c6734o0;
        this.f35191b = c6721i;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Handler handler;
        long j10;
        C6734o0 c6734o0 = this.f35192c;
        c6734o0.f35199e.m31025r0(c6734o0.f35195a);
        C6734o0 c6734o02 = this.f35192c;
        handler = c6734o02.f35199e.f35162b;
        j10 = c6734o02.f35196b;
        handler.postDelayed(this, j10);
    }
}
