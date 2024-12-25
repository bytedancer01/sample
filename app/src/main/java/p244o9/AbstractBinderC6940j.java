package p244o9;

import android.os.Parcel;
import ma.BinderC6485x;
import ma.C6363r0;
import p350u9.C8822k;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:o9/j.class
 */
/* renamed from: o9.j */
/* loaded from: combined.jar:classes2.jar:o9/j.class */
public abstract class AbstractBinderC6940j extends BinderC6485x implements InterfaceC6941k {
    public AbstractBinderC6940j() {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
    }

    @Override // ma.BinderC6485x
    /* renamed from: Z */
    public final boolean mo29315Z(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(C8822k.f40857a);
            return true;
        }
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        C6363r0.m29989b(parcel);
        mo31905K(readLong, readLong2);
        parcel2.writeNoException();
        return true;
    }
}
