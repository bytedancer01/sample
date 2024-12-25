package p230n9;

import org.json.JSONObject;
import p200l9.C5791o;
import p304r9.C8049s;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/p.class
 */
/* renamed from: n9.p */
/* loaded from: combined.jar:classes2.jar:n9/p.class */
public final class C6735p extends AbstractC6724j0 {

    /* renamed from: t */
    public final C5791o[] f35200t;

    /* renamed from: u */
    public final int f35201u;

    /* renamed from: v */
    public final int f35202v;

    /* renamed from: w */
    public final long f35203w;

    /* renamed from: x */
    public final JSONObject f35204x;

    /* renamed from: y */
    public final C6721i f35205y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6735p(C6721i c6721i, C5791o[] c5791oArr, int i10, int i11, long j10, JSONObject jSONObject) {
        super(c6721i, false);
        this.f35205y = c6721i;
        this.f35200t = c5791oArr;
        this.f35201u = i10;
        this.f35202v = i11;
        this.f35203w = j10;
        this.f35204x = jSONObject;
    }

    @Override // p230n9.AbstractC6724j0
    /* renamed from: q */
    public final void mo30864q() {
        C8049s c8049s;
        c8049s = this.f35205y.f35163c;
        c8049s.m34953Q(m31048r(), this.f35200t, this.f35201u, this.f35202v, this.f35203w, this.f35204x);
    }
}
