package p383w9;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.lang.ref.WeakReference;
import p368v9.AbstractC9323i;
import p368v9.InterfaceC9320f;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/j2.class
 */
/* renamed from: w9.j2 */
/* loaded from: combined.jar:classes2.jar:w9/j2.class */
public final class RunnableC9480j2 implements Runnable {

    /* renamed from: b */
    public final InterfaceC9320f f43304b;

    /* renamed from: c */
    public final C9495m2 f43305c;

    public RunnableC9480j2(C9495m2 c9495m2, InterfaceC9320f interfaceC9320f) {
        this.f43305c = c9495m2;
        this.f43304b = interfaceC9320f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        AbstractC9323i abstractC9323i;
        try {
            try {
                BasePendingResult.f14815p.set(Boolean.TRUE);
                abstractC9323i = this.f43305c.f43336a;
                ((AbstractC9323i) C9935o.m41850j(abstractC9323i)).m39320b(this.f43304b);
                C9495m2 c9495m2 = this.f43305c;
                C9495m2.m39953c(c9495m2);
                C9495m2.m39953c(c9495m2);
                throw null;
            } catch (RuntimeException e10) {
                C9495m2 c9495m22 = this.f43305c;
                C9495m2.m39953c(c9495m22);
                C9495m2.m39953c(c9495m22);
                throw null;
            }
        } catch (Throwable th2) {
            BasePendingResult.f14815p.set(Boolean.FALSE);
            C9495m2 c9495m23 = this.f43305c;
            C9495m2.m39956j(this.f43304b);
            weakReference = this.f43305c.f43341f;
            GoogleApiClient googleApiClient = (GoogleApiClient) weakReference.get();
            if (googleApiClient != null) {
                googleApiClient.mo13113j(this.f43305c);
            }
            throw th2;
        }
    }
}
