package p403xa;

import android.os.Parcel;
import la.BinderC5828b;
import la.C5829c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xa/e.class
 */
/* renamed from: xa.e */
/* loaded from: combined.jar:classes2.jar:xa/e.class */
public abstract class AbstractBinderC9697e extends BinderC5828b implements InterfaceC9698f {
    public AbstractBinderC9697e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // la.BinderC5828b
    /* renamed from: y0 */
    public final boolean mo28413y0(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                break;
            case 4:
            case 6:
                break;
            case 5:
            default:
                return false;
            case 7:
                break;
            case 8:
                mo39916c1((C9704l) C5829c.m28414a(parcel, C9704l.CREATOR));
                break;
            case 9:
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
