package p383w9;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.Status;
import p350u9.C8808d;
import za.C10146j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/r2.class
 */
/* renamed from: w9.r2 */
/* loaded from: combined.jar:classes2.jar:w9/r2.class */
public final class C9518r2<ResultT> extends AbstractC9509p1 {

    /* renamed from: b */
    public final AbstractC9515r<C2414a.b, ResultT> f43407b;

    /* renamed from: c */
    public final C10146j<ResultT> f43408c;

    /* renamed from: d */
    public final InterfaceC9511q f43409d;

    public C9518r2(int i10, AbstractC9515r<C2414a.b, ResultT> abstractC9515r, C10146j<ResultT> c10146j, InterfaceC9511q interfaceC9511q) {
        super(i10);
        this.f43408c = c10146j;
        this.f43407b = abstractC9515r;
        this.f43409d = interfaceC9511q;
        if (i10 == 2 && abstractC9515r.m40019c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // p383w9.AbstractC9526t2
    /* renamed from: a */
    public final void mo39941a(Status status) {
        this.f43408c.m42581d(this.f43409d.mo39796a(status));
    }

    @Override // p383w9.AbstractC9526t2
    /* renamed from: b */
    public final void mo39942b(Exception exc) {
        this.f43408c.m42581d(exc);
    }

    @Override // p383w9.AbstractC9526t2
    /* renamed from: c */
    public final void mo39943c(C9464g1<?> c9464g1) {
        try {
            this.f43407b.mo39921b(c9464g1.m39910s(), this.f43408c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            mo39941a(AbstractC9526t2.m40050e(e11));
        } catch (RuntimeException e12) {
            this.f43408c.m42581d(e12);
        }
    }

    @Override // p383w9.AbstractC9526t2
    /* renamed from: d */
    public final void mo40011d(C9535w c9535w, boolean z10) {
        c9535w.m40066d(this.f43408c, z10);
    }

    @Override // p383w9.AbstractC9509p1
    /* renamed from: f */
    public final boolean mo40009f(C9464g1<?> c9464g1) {
        return this.f43407b.m40019c();
    }

    @Override // p383w9.AbstractC9509p1
    /* renamed from: g */
    public final C8808d[] mo40010g(C9464g1<?> c9464g1) {
        return this.f43407b.m40021e();
    }
}
