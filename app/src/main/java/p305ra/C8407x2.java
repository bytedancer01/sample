package p305ra;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/x2.class
 */
/* renamed from: ra.x2 */
/* loaded from: combined.jar:classes2.jar:ra/x2.class */
public final class C8407x2 extends ContentObserver {
    public C8407x2(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = C8422y2.f39397e;
        atomicBoolean.set(true);
    }
}
