package p422y9;

import android.os.Bundle;
import p350u9.C8804b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/c1.class
 */
/* renamed from: y9.c1 */
/* loaded from: combined.jar:classes2.jar:y9/c1.class */
public final class C9901c1 extends AbstractC9936o0 {

    /* renamed from: g */
    public final AbstractC9899c f45525g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9901c1(AbstractC9899c abstractC9899c, int i10, Bundle bundle) {
        super(abstractC9899c, i10, null);
        this.f45525g = abstractC9899c;
    }

    @Override // p422y9.AbstractC9936o0
    /* renamed from: f */
    public final void mo41763f(C8804b c8804b) {
        if (this.f45525g.enableLocalFallback() && AbstractC9899c.zzo(this.f45525g)) {
            AbstractC9899c.zzk(this.f45525g, 16);
        } else {
            this.f45525g.zzc.mo39826c(c8804b);
            this.f45525g.onConnectionFailed(c8804b);
        }
    }

    @Override // p422y9.AbstractC9936o0
    /* renamed from: g */
    public final boolean mo41764g() {
        this.f45525g.zzc.mo39826c(C8804b.f40818h);
        return true;
    }
}
