package p383w9;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import la.HandlerC5836j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/s0.class
 */
/* renamed from: w9.s0 */
/* loaded from: combined.jar:classes2.jar:w9/s0.class */
public final class HandlerC9520s0 extends HandlerC5836j {

    /* renamed from: a */
    public final C9528u0 f43411a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC9520s0(C9528u0 c9528u0, Looper looper) {
        super(looper);
        this.f43411a = c9528u0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            C9528u0.m40054p(this.f43411a);
            return;
        }
        if (i10 == 2) {
            C9528u0.m40053o(this.f43411a);
            return;
        }
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("Unknown message id: ");
        sb2.append(i10);
        Log.w("GoogleApiClientImpl", sb2.toString());
    }
}
