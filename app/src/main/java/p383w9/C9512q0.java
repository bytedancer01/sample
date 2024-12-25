package p383w9;

import android.os.Bundle;
import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.internal.AbstractC2418a;
import java.util.Collections;
import java.util.Iterator;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p350u9.C8804b;
import p368v9.InterfaceC9320f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/q0.class
 */
/* renamed from: w9.q0 */
/* loaded from: combined.jar:classes2.jar:w9/q0.class */
public final class C9512q0 implements InterfaceC9532v0 {

    /* renamed from: a */
    @NotOnlyInitialized
    public final C9544y0 f43392a;

    public C9512q0(C9544y0 c9544y0) {
        this.f43392a = c9544y0;
    }

    @Override // p383w9.InterfaceC9532v0
    /* renamed from: a */
    public final void mo39816a(C8804b c8804b, C2414a<?> c2414a, boolean z10) {
    }

    @Override // p383w9.InterfaceC9532v0
    /* renamed from: b */
    public final void mo39817b(Bundle bundle) {
    }

    @Override // p383w9.InterfaceC9532v0
    /* renamed from: c */
    public final void mo39818c() {
        Iterator<C2414a.f> it = this.f43392a.f43496g.values().iterator();
        while (it.hasNext()) {
            it.next().disconnect();
        }
        this.f43392a.f43504o.f43450p = Collections.emptySet();
    }

    @Override // p383w9.InterfaceC9532v0
    /* renamed from: d */
    public final void mo39819d() {
        this.f43392a.m40084j();
    }

    @Override // p383w9.InterfaceC9532v0
    /* renamed from: e */
    public final void mo39820e(int i10) {
    }

    @Override // p383w9.InterfaceC9532v0
    /* renamed from: f */
    public final boolean mo39821f() {
        return true;
    }

    @Override // p383w9.InterfaceC9532v0
    /* renamed from: g */
    public final <A extends C2414a.b, T extends AbstractC2418a<? extends InterfaceC9320f, A>> T mo39822g(T t10) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
