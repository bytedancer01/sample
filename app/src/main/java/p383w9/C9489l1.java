package p383w9;

import android.os.Looper;
import com.google.android.gms.common.api.AbstractC2416c;
import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.C2414a.d;
import com.google.android.gms.common.api.internal.AbstractC2418a;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p368v9.InterfaceC9320f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/l1.class
 */
/* renamed from: w9.l1 */
/* loaded from: combined.jar:classes2.jar:w9/l1.class */
public final class C9489l1<O extends C2414a.d> extends C9547z {

    /* renamed from: c */
    @NotOnlyInitialized
    public final AbstractC2416c<O> f43326c;

    public C9489l1(AbstractC2416c<O> abstractC2416c) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f43326c = abstractC2416c;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: e */
    public final <A extends C2414a.b, T extends AbstractC2418a<? extends InterfaceC9320f, A>> T mo13108e(T t10) {
        return (T) this.f43326c.doWrite((AbstractC2416c<O>) t10);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: f */
    public final Looper mo13109f() {
        return this.f43326c.getLooper();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: j */
    public final void mo13113j(C9495m2 c9495m2) {
    }
}
