package p383w9;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/t2.class
 */
/* renamed from: w9.t2 */
/* loaded from: combined.jar:classes2.jar:w9/t2.class */
public abstract class AbstractC9526t2 {

    /* renamed from: a */
    public final int f43433a;

    public AbstractC9526t2(int i10) {
        this.f43433a = i10;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ Status m40050e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo39941a(Status status);

    /* renamed from: b */
    public abstract void mo39942b(Exception exc);

    /* renamed from: c */
    public abstract void mo39943c(C9464g1<?> c9464g1);

    /* renamed from: d */
    public abstract void mo40011d(C9535w c9535w, boolean z10);
}
