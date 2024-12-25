package p383w9;

import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import p368v9.AbstractC9322h;
import p368v9.AbstractC9323i;
import p368v9.AbstractC9324j;
import p368v9.InterfaceC9318d;
import p368v9.InterfaceC9320f;
import p368v9.InterfaceC9321g;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/m2.class
 */
/* renamed from: w9.m2 */
/* loaded from: combined.jar:classes2.jar:w9/m2.class */
public final class C9495m2<R extends InterfaceC9320f> extends AbstractC9324j<R> implements InterfaceC9321g<R> {

    /* renamed from: a */
    public AbstractC9323i<? super R, ? extends InterfaceC9320f> f43336a;

    /* renamed from: b */
    public C9495m2<? extends InterfaceC9320f> f43337b;

    /* renamed from: c */
    public volatile AbstractC9322h<? super R> f43338c;

    /* renamed from: d */
    public final Object f43339d;

    /* renamed from: e */
    public Status f43340e;

    /* renamed from: f */
    public final WeakReference<GoogleApiClient> f43341f;

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ HandlerC9485k2 m39953c(C9495m2 c9495m2) {
        c9495m2.getClass();
        return null;
    }

    /* renamed from: j */
    public static final void m39956j(InterfaceC9320f interfaceC9320f) {
        if (interfaceC9320f instanceof InterfaceC9318d) {
            try {
                ((InterfaceC9318d) interfaceC9320f).release();
            } catch (RuntimeException e10) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(interfaceC9320f)), e10);
            }
        }
    }

    @Override // p368v9.InterfaceC9321g
    /* renamed from: a */
    public final void mo30871a(R r10) {
        synchronized (this.f43339d) {
            if (!r10.mo13127w().m13125T()) {
                m39958g(r10.mo13127w());
                m39956j(r10);
            } else if (this.f43336a != null) {
                C9445c2.m39824a().submit(new RunnableC9480j2(this, r10));
            } else if (m39960i()) {
                ((AbstractC9322h) C9935o.m41850j(this.f43338c)).m39318c(r10);
            }
        }
    }

    /* renamed from: f */
    public final void m39957f() {
        this.f43338c = null;
    }

    /* renamed from: g */
    public final void m39958g(Status status) {
        synchronized (this.f43339d) {
            this.f43340e = status;
            m39959h(status);
        }
    }

    /* renamed from: h */
    public final void m39959h(Status status) {
        synchronized (this.f43339d) {
            AbstractC9323i<? super R, ? extends InterfaceC9320f> abstractC9323i = this.f43336a;
            if (abstractC9323i != null) {
                ((C9495m2) C9935o.m41850j(this.f43337b)).m39958g((Status) C9935o.m41851k(abstractC9323i.m39319a(status), "onFailure must not return null"));
            } else if (m39960i()) {
                ((AbstractC9322h) C9935o.m41850j(this.f43338c)).m39317b(status);
            }
        }
    }

    /* renamed from: i */
    public final boolean m39960i() {
        return (this.f43338c == null || this.f43341f.get() == null) ? false : true;
    }
}
