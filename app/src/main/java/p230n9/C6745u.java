package p230n9;

import org.json.JSONObject;
import p304r9.C8049s;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/u.class
 */
/* renamed from: n9.u */
/* loaded from: combined.jar:classes2.jar:n9/u.class */
public final class C6745u extends AbstractC6724j0 {

    /* renamed from: t */
    public final int f35224t;

    /* renamed from: u */
    public final long f35225u;

    /* renamed from: v */
    public final JSONObject f35226v;

    /* renamed from: w */
    public final C6721i f35227w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6745u(C6721i c6721i, int i10, long j10, JSONObject jSONObject) {
        super(c6721i, false);
        this.f35227w = c6721i;
        this.f35224t = i10;
        this.f35225u = j10;
        this.f35226v = jSONObject;
    }

    @Override // p230n9.AbstractC6724j0
    /* renamed from: q */
    public final void mo30864q() {
        C8049s c8049s;
        c8049s = this.f35227w.f35163c;
        c8049s.m34956i(m31048r(), this.f35224t, this.f35225u, null, 0, null, null, this.f35226v);
    }
}
