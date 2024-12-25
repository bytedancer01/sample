package p216m9;

import android.os.Parcel;
import ga.InterfaceC4993a;
import ma.BinderC6485x;
import ma.C6363r0;
import p350u9.C8822k;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/l0.class
 */
/* renamed from: m9.l0 */
/* loaded from: combined.jar:classes2.jar:m9/l0.class */
public abstract class AbstractBinderC5969l0 extends BinderC6485x implements InterfaceC5972m0 {
    public AbstractBinderC5969l0() {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
    }

    @Override // ma.BinderC6485x
    /* renamed from: Z */
    public final boolean mo29315Z(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                InterfaceC4993a mo29322k = mo29322k();
                parcel2.writeNoException();
                C6363r0.m29992e(parcel2, mo29322k);
                return true;
            case 2:
                InterfaceC4993a m25159y0 = InterfaceC4993a.a.m25159y0(parcel.readStrongBinder());
                C6363r0.m29989b(parcel);
                mo29325w1(m25159y0);
                break;
            case 3:
                InterfaceC4993a m25159y02 = InterfaceC4993a.a.m25159y0(parcel.readStrongBinder());
                String readString = parcel.readString();
                C6363r0.m29989b(parcel);
                mo29319b0(m25159y02, readString);
                break;
            case 4:
                InterfaceC4993a m25159y03 = InterfaceC4993a.a.m25159y0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                C6363r0.m29989b(parcel);
                mo29321j1(m25159y03, readInt);
                break;
            case 5:
                InterfaceC4993a m25159y04 = InterfaceC4993a.a.m25159y0(parcel.readStrongBinder());
                C6363r0.m29989b(parcel);
                mo29320g0(m25159y04);
                break;
            case 6:
                InterfaceC4993a m25159y05 = InterfaceC4993a.a.m25159y0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                C6363r0.m29989b(parcel);
                mo29323m0(m25159y05, readInt2);
                break;
            case 7:
                InterfaceC4993a m25159y06 = InterfaceC4993a.a.m25159y0(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                C6363r0.m29989b(parcel);
                mo29317N(m25159y06, readString2);
                break;
            case 8:
                InterfaceC4993a m25159y07 = InterfaceC4993a.a.m25159y0(parcel.readStrongBinder());
                boolean m29993f = C6363r0.m29993f(parcel);
                C6363r0.m29989b(parcel);
                mo29318T0(m25159y07, m29993f);
                break;
            case 9:
                InterfaceC4993a m25159y08 = InterfaceC4993a.a.m25159y0(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                C6363r0.m29989b(parcel);
                mo29316A0(m25159y08, readInt3);
                break;
            case 10:
                InterfaceC4993a m25159y09 = InterfaceC4993a.a.m25159y0(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                C6363r0.m29989b(parcel);
                mo29324r1(m25159y09, readInt4);
                break;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(C8822k.f40857a);
                return true;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
