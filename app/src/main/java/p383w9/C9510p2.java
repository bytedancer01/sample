package p383w9;

import android.util.Log;
import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC2418a;
import p368v9.InterfaceC9320f;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/p2.class
 */
/* renamed from: w9.p2 */
/* loaded from: combined.jar:classes2.jar:w9/p2.class */
public final class C9510p2<A extends AbstractC2418a<? extends InterfaceC9320f, C2414a.b>> extends AbstractC9526t2 {

    /* renamed from: b */
    public final A f43391b;

    public C9510p2(int i10, A a10) {
        super(i10);
        this.f43391b = (A) C9935o.m41851k(a10, "Null methods are not runnable.");
    }

    @Override // p383w9.AbstractC9526t2
    /* renamed from: a */
    public final void mo39941a(Status status) {
        try {
            this.f43391b.m13171w(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // p383w9.AbstractC9526t2
    /* renamed from: b */
    public final void mo39942b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb2.append(simpleName);
        sb2.append(": ");
        sb2.append(localizedMessage);
        try {
            this.f43391b.m13171w(new Status(10, sb2.toString()));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // p383w9.AbstractC9526t2
    /* renamed from: c */
    public final void mo39943c(C9464g1<?> c9464g1) {
        try {
            this.f43391b.m13169u(c9464g1.m39910s());
        } catch (RuntimeException e10) {
            mo39942b(e10);
        }
    }

    @Override // p383w9.AbstractC9526t2
    /* renamed from: d */
    public final void mo40011d(C9535w c9535w, boolean z10) {
        c9535w.m40065c(this.f43391b, z10);
    }
}
