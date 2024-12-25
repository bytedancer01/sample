package p335t9;

import android.os.Looper;
import android.os.Message;
import na.HandlerC6761e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t9/c0.class
 */
/* renamed from: t9.c0 */
/* loaded from: combined.jar:classes2.jar:t9/c0.class */
public final class HandlerC8651c0 extends HandlerC6761e {

    /* renamed from: a */
    public final C8652d f40398a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC8651c0(C8652d c8652d, Looper looper) {
        super(looper);
        this.f40398a = c8652d;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f40398a.m37140g(message);
    }
}
