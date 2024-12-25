package p383w9;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p368v9.C9315a;
import za.C10146j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/l2.class
 */
/* renamed from: w9.l2 */
/* loaded from: combined.jar:classes2.jar:w9/l2.class */
public abstract class AbstractC9490l2<T> extends AbstractC9509p1 {

    /* renamed from: b */
    public final C10146j<T> f43327b;

    public AbstractC9490l2(int i10, C10146j<T> c10146j) {
        super(i10);
        this.f43327b = c10146j;
    }

    @Override // p383w9.AbstractC9526t2
    /* renamed from: a */
    public final void mo39941a(Status status) {
        this.f43327b.m42581d(new C9315a(status));
    }

    @Override // p383w9.AbstractC9526t2
    /* renamed from: b */
    public final void mo39942b(Exception exc) {
        this.f43327b.m42581d(exc);
    }

    @Override // p383w9.AbstractC9526t2
    /* renamed from: c */
    public final void mo39943c(C9464g1<?> c9464g1) {
        try {
            mo39944h(c9464g1);
        } catch (DeadObjectException e10) {
            mo39941a(AbstractC9526t2.m40050e(e10));
            throw e10;
        } catch (RemoteException e11) {
            mo39941a(AbstractC9526t2.m40050e(e11));
        } catch (RuntimeException e12) {
            this.f43327b.m42581d(e12);
        }
    }

    /* renamed from: h */
    public abstract void mo39944h(C9464g1<?> c9464g1);
}
