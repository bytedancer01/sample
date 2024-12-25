package p383w9;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import la.HandlerC5836j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/x0.class
 */
/* renamed from: w9.x0 */
/* loaded from: combined.jar:classes2.jar:w9/x0.class */
public final class HandlerC9540x0 extends HandlerC5836j {

    /* renamed from: a */
    public final C9544y0 f43485a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC9540x0(C9544y0 c9544y0, Looper looper) {
        super(looper);
        this.f43485a = c9544y0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            ((AbstractC9536w0) message.obj).m40071b(this.f43485a);
        } else {
            if (i10 == 2) {
                throw ((RuntimeException) message.obj);
            }
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Unknown message id: ");
            sb2.append(i10);
            Log.w("GACStateManager", sb2.toString());
        }
    }
}
