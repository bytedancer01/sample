package p230n9;

import org.json.JSONObject;
import p304r9.C8049s;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/q.class
 */
/* renamed from: n9.q */
/* loaded from: combined.jar:classes2.jar:n9/q.class */
public final class C6737q extends AbstractC6724j0 {

    /* renamed from: t */
    public final int[] f35207t;

    /* renamed from: u */
    public final JSONObject f35208u;

    /* renamed from: v */
    public final C6721i f35209v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6737q(C6721i c6721i, int[] iArr, JSONObject jSONObject) {
        super(c6721i, false);
        this.f35209v = c6721i;
        this.f35207t = iArr;
        this.f35208u = jSONObject;
    }

    @Override // p230n9.AbstractC6724j0
    /* renamed from: q */
    public final void mo30864q() {
        C8049s c8049s;
        c8049s = this.f35209v.f35163c;
        c8049s.m34954R(m31048r(), this.f35207t, this.f35208u);
    }
}
