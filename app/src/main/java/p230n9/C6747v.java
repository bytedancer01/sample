package p230n9;

import com.facebook.ads.AdError;
import com.google.android.gms.common.api.Status;
import java.util.Locale;
import org.json.JSONObject;
import p200l9.C5791o;
import p200l9.C5797q;
import p304r9.C8049s;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/v.class
 */
/* renamed from: n9.v */
/* loaded from: combined.jar:classes2.jar:n9/v.class */
public final class C6747v extends AbstractC6724j0 {

    /* renamed from: t */
    public final int f35228t;

    /* renamed from: u */
    public final int f35229u;

    /* renamed from: v */
    public final JSONObject f35230v;

    /* renamed from: w */
    public final C6721i f35231w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6747v(C6721i c6721i, int i10, int i11, JSONObject jSONObject) {
        super(c6721i, false);
        this.f35231w = c6721i;
        this.f35228t = i10;
        this.f35229u = i11;
        this.f35230v = jSONObject;
    }

    @Override // p230n9.AbstractC6724j0
    /* renamed from: q */
    public final void mo30864q() {
        C8049s c8049s;
        C5791o m28320f0;
        C6721i c6721i = this.f35231w;
        int i10 = this.f35228t;
        C9935o.m41845e("Must be called from the main thread.");
        int m30887a = c6721i.m31010k().m30887a(i10);
        if (m30887a == -1) {
            C5797q c5797q = (C5797q) C9935o.m41850j(c6721i.m31012l());
            int i11 = 0;
            while (true) {
                if (i11 >= c5797q.m28322h0()) {
                    m30887a = -1;
                    break;
                }
                m30887a = i11;
                if (((C5791o) C9935o.m41850j(c5797q.m28320f0(i11))).m28282S() == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        int i12 = this.f35229u;
        if (i12 < 0) {
            m13146i(new C6722i0(this, new Status(AdError.INTERNAL_ERROR_CODE, String.format(Locale.ROOT, "Invalid request: Invalid newIndex %d.", Integer.valueOf(this.f35229u)))));
            return;
        }
        if (m30887a == i12) {
            m13146i(new C6722i0(this, new Status(0)));
            return;
        }
        int i13 = i12;
        if (i12 > m30887a) {
            i13 = i12 + 1;
        }
        C6721i c6721i2 = this.f35231w;
        C9935o.m41845e("Must be called from the main thread.");
        int m30888b = c6721i2.m31010k().m30888b(i13);
        if (m30888b == 0) {
            C5797q m31012l = c6721i2.m31012l();
            m30888b = (m31012l == null || (m28320f0 = m31012l.m28320f0(i13)) == null) ? 0 : m28320f0.m28282S();
        }
        c8049s = this.f35231w.f35163c;
        c8049s.m34955S(m31048r(), new int[]{this.f35228t}, m30888b, this.f35230v);
    }
}
