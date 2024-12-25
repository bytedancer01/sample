package p230n9;

import com.facebook.ads.AdError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
import java.util.List;
import p230n9.C6721i;
import p304r9.C8045q;
import p304r9.InterfaceC8054v;
import p368v9.InterfaceC9320f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/j0.class
 */
/* renamed from: n9.j0 */
/* loaded from: combined.jar:classes2.jar:n9/j0.class */
public abstract class AbstractC6724j0 extends BasePendingResult {

    /* renamed from: q */
    public InterfaceC8054v f35182q;

    /* renamed from: r */
    public final boolean f35183r;

    /* renamed from: s */
    public final C6721i f35184s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6724j0(C6721i c6721i, boolean z10) {
        super(null);
        this.f35184s = c6721i;
        this.f35183r = z10;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: e */
    public final /* synthetic */ InterfaceC9320f mo13142e(Status status) {
        return new C6722i0(this, status);
    }

    /* renamed from: q */
    public abstract void mo30864q();

    /* renamed from: r */
    public final InterfaceC8054v m31048r() {
        if (this.f35182q == null) {
            this.f35182q = new C6720h0(this);
        }
        return this.f35182q;
    }

    /* renamed from: s */
    public final void m31049s() {
        Object obj;
        List list;
        if (!this.f35183r) {
            list = this.f35184s.f35168h;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C6721i.b) it.next()).mo23748i();
            }
            Iterator it2 = this.f35184s.f35169i.iterator();
            while (it2.hasNext()) {
                ((C6721i.a) it2.next()).m31038f();
            }
        }
        try {
            obj = this.f35184s.f35161a;
            synchronized (obj) {
                mo30864q();
            }
        } catch (C8045q e10) {
            m13146i(new C6722i0(this, new Status(AdError.BROKEN_MEDIA_ERROR_CODE)));
        }
    }
}
