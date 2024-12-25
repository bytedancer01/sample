package p305ra;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/va.class
 */
/* renamed from: ra.va */
/* loaded from: combined.jar:classes2.jar:ra/va.class */
public final class BinderC8385va extends AbstractBinderC8343sd {

    /* renamed from: b */
    public final AtomicReference<Bundle> f39352b = new AtomicReference<>();

    /* renamed from: c */
    public boolean f39353c;

    /* renamed from: B1 */
    public static final <T> T m35971B1(Bundle bundle, Class<T> cls) {
        T t10 = null;
        if (bundle != null) {
            Object obj = bundle.get("r");
            t10 = null;
            if (obj != null) {
                try {
                    t10 = cls.cast(obj);
                } catch (ClassCastException e10) {
                    Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e10);
                    throw e10;
                }
            }
        }
        return t10;
    }

    /* renamed from: U0 */
    public final Bundle m35972U0(long j10) {
        Bundle bundle;
        synchronized (this.f39352b) {
            if (!this.f39353c) {
                try {
                    this.f39352b.wait(j10);
                } catch (InterruptedException e10) {
                    return null;
                }
            }
            bundle = this.f39352b.get();
        }
        return bundle;
    }

    @Override // p305ra.InterfaceC8358td
    /* renamed from: j */
    public final void mo35776j(Bundle bundle) {
        synchronized (this.f39352b) {
            try {
                this.f39352b.set(bundle);
                this.f39353c = true;
            } finally {
                this.f39352b.notify();
            }
        }
    }

    /* renamed from: y0 */
    public final String m35973y0(long j10) {
        return (String) m35971B1(m35972U0(j10), String.class);
    }
}
