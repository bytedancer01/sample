package p230n9;

import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;
import p304r9.C8015b;
import p304r9.C8047r;
import p304r9.InterfaceC8054v;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/h0.class
 */
/* renamed from: n9.h0 */
/* loaded from: combined.jar:classes2.jar:n9/h0.class */
public final class C6720h0 implements InterfaceC8054v {

    /* renamed from: a */
    public final AbstractC6724j0 f35158a;

    public C6720h0(AbstractC6724j0 abstractC6724j0) {
        this.f35158a = abstractC6724j0;
    }

    @Override // p304r9.InterfaceC8054v
    /* renamed from: a */
    public final void mo30962a(long j10) {
        C8015b c8015b;
        try {
            AbstractC6724j0 abstractC6724j0 = this.f35158a;
            abstractC6724j0.m13146i(new C6722i0(abstractC6724j0, new Status(2103)));
        } catch (IllegalStateException e10) {
            c8015b = C6721i.f35160n;
            c8015b.m34876d(e10, "Result already set when calling onRequestReplaced", new Object[0]);
        }
    }

    @Override // p304r9.InterfaceC8054v
    /* renamed from: b */
    public final void mo30963b(long j10, int i10, Object obj) {
        C8015b c8015b;
        MediaError mediaError = null;
        if (true != (obj instanceof C8047r)) {
            obj = null;
        }
        try {
            AbstractC6724j0 abstractC6724j0 = this.f35158a;
            Status status = new Status(i10);
            JSONObject jSONObject = obj != null ? ((C8047r) obj).f38876a : null;
            if (obj != null) {
                mediaError = ((C8047r) obj).f38877b;
            }
            abstractC6724j0.m13146i(new C6726k0(status, jSONObject, mediaError));
        } catch (IllegalStateException e10) {
            c8015b = C6721i.f35160n;
            c8015b.m34876d(e10, "Result already set when calling onRequestCompleted", new Object[0]);
        }
    }
}
