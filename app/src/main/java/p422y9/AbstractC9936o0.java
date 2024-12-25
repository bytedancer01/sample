package p422y9;

import android.app.PendingIntent;
import android.os.Bundle;
import p350u9.C8804b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/o0.class
 */
/* renamed from: y9.o0 */
/* loaded from: combined.jar:classes2.jar:y9/o0.class */
public abstract class AbstractC9936o0 extends AbstractC9963y0<Boolean> {

    /* renamed from: d */
    public final int f45624d;

    /* renamed from: e */
    public final Bundle f45625e;

    /* renamed from: f */
    public final AbstractC9899c f45626f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9936o0(AbstractC9899c abstractC9899c, int i10, Bundle bundle) {
        super(abstractC9899c, Boolean.TRUE);
        this.f45626f = abstractC9899c;
        this.f45624d = i10;
        this.f45625e = bundle;
    }

    @Override // p422y9.AbstractC9963y0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo41856a(Boolean bool) {
        C8804b c8804b;
        PendingIntent pendingIntent = null;
        if (this.f45624d != 0) {
            this.f45626f.zzp(1, null);
            Bundle bundle = this.f45625e;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable(AbstractC9899c.KEY_PENDING_INTENT);
            }
            c8804b = new C8804b(this.f45624d, pendingIntent);
        } else {
            if (mo41764g()) {
                return;
            }
            this.f45626f.zzp(1, null);
            c8804b = new C8804b(8, null);
        }
        mo41763f(c8804b);
    }

    @Override // p422y9.AbstractC9963y0
    /* renamed from: b */
    public final void mo41857b() {
    }

    /* renamed from: f */
    public abstract void mo41763f(C8804b c8804b);

    /* renamed from: g */
    public abstract boolean mo41764g();
}
