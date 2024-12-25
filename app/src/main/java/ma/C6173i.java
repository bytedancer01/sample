package ma;

import android.content.Context;
import p200l9.C5762f;
import p216m9.AbstractC5989s;
import p216m9.AbstractC5995v;
import p216m9.C5941c;
import p216m9.C5947e;
import p244o9.C6952v;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/i.class
 */
/* renamed from: ma.i */
/* loaded from: combined.jar:classes2.jar:ma/i.class */
public final class C6173i extends AbstractC5995v {

    /* renamed from: d */
    public final C5941c f33801d;

    /* renamed from: e */
    public final BinderC6069d0 f33802e;

    public C6173i(Context context, C5941c c5941c, BinderC6069d0 binderC6069d0) {
        super(context, c5941c.m29257V().isEmpty() ? C5762f.m28194a(c5941c.m29254S()) : C5762f.m28195b(c5941c.m29254S(), c5941c.m29257V()));
        this.f33801d = c5941c;
        this.f33802e = binderC6069d0;
    }

    @Override // p216m9.AbstractC5995v
    /* renamed from: a */
    public final AbstractC5989s mo29362a(String str) {
        return new C5947e(m29364c(), m29363b(), str, this.f33801d, this.f33802e, new C6952v(m29364c(), this.f33801d, this.f33802e));
    }

    @Override // p216m9.AbstractC5995v
    /* renamed from: d */
    public final boolean mo29365d() {
        return this.f33801d.m29255T();
    }
}
