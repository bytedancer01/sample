package p368v9;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import p368v9.InterfaceC9320f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v9/h.class
 */
/* renamed from: v9.h */
/* loaded from: combined.jar:classes2.jar:v9/h.class */
public abstract class AbstractC9322h<R extends InterfaceC9320f> implements InterfaceC9321g<R> {
    @Override // p368v9.InterfaceC9321g
    /* renamed from: a */
    public final void mo30871a(R r10) {
        Status mo13127w = r10.mo13127w();
        if (mo13127w.m13125T()) {
            m39318c(r10);
            return;
        }
        m39317b(mo13127w);
        if (r10 instanceof InterfaceC9318d) {
            try {
                ((InterfaceC9318d) r10).release();
            } catch (RuntimeException e10) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r10)), e10);
            }
        }
    }

    /* renamed from: b */
    public abstract void m39317b(Status status);

    /* renamed from: c */
    public abstract void m39318c(R r10);
}
