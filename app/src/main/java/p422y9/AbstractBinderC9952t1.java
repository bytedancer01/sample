package p422y9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ga.InterfaceC4993a;
import p245oa.BinderC6955b;
import p245oa.C6956c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/t1.class
 */
/* renamed from: y9.t1 */
/* loaded from: combined.jar:classes2.jar:y9/t1.class */
public abstract class AbstractBinderC9952t1 extends BinderC6955b implements InterfaceC9955u1 {
    public AbstractBinderC9952t1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: y0 */
    public static InterfaceC9955u1 m41883y0(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof InterfaceC9955u1 ? (InterfaceC9955u1) queryLocalInterface : new C9949s1(iBinder);
    }

    @Override // p245oa.BinderC6955b
    /* renamed from: Z */
    public final boolean mo31949Z(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            InterfaceC4993a mo37735o = mo37735o();
            parcel2.writeNoException();
            C6956c.m31953d(parcel2, mo37735o);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        int mo37734l = mo37734l();
        parcel2.writeNoException();
        parcel2.writeInt(mo37734l);
        return true;
    }
}
