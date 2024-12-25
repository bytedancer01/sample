package p230n9;

import android.os.Parcel;
import ga.InterfaceC4993a;
import ma.BinderC6485x;
import ma.C6363r0;
import p200l9.C5782l;
import p350u9.C8822k;
import p402x9.C9691a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/u0.class
 */
/* renamed from: n9.u0 */
/* loaded from: combined.jar:classes2.jar:n9/u0.class */
public abstract class AbstractBinderC6746u0 extends BinderC6485x implements InterfaceC6748v0 {
    public AbstractBinderC6746u0() {
        super("com.google.android.gms.cast.framework.media.IImagePicker");
    }

    @Override // ma.BinderC6485x
    /* renamed from: Z */
    public final boolean mo29315Z(int i10, Parcel parcel, Parcel parcel2, int i11) {
        C9691a mo30867i0;
        if (i10 == 1) {
            C5782l c5782l = (C5782l) C6363r0.m29988a(parcel, C5782l.CREATOR);
            int readInt = parcel.readInt();
            C6363r0.m29989b(parcel);
            mo30867i0 = mo30867i0(c5782l, readInt);
        } else {
            if (i10 == 2) {
                InterfaceC4993a mo30866b = mo30866b();
                parcel2.writeNoException();
                C6363r0.m29992e(parcel2, mo30866b);
                return true;
            }
            if (i10 == 3) {
                parcel2.writeNoException();
                parcel2.writeInt(C8822k.f40857a);
                return true;
            }
            if (i10 != 4) {
                return false;
            }
            C5782l c5782l2 = (C5782l) C6363r0.m29988a(parcel, C5782l.CREATOR);
            C6701b c6701b = (C6701b) C6363r0.m29988a(parcel, C6701b.CREATOR);
            C6363r0.m29989b(parcel);
            mo30867i0 = mo30865R(c5782l2, c6701b);
        }
        parcel2.writeNoException();
        C6363r0.m29991d(parcel2, mo30867i0);
        return true;
    }
}
