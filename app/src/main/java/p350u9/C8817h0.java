package p350u9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import ga.BinderC4994b;
import ga.InterfaceC4993a;
import p422y9.AbstractBinderC9952t1;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/h0.class
 */
/* renamed from: u9.h0 */
/* loaded from: combined.jar:classes2.jar:u9/h0.class */
public final class C8817h0 extends AbstractC10125a {
    public static final Parcelable.Creator<C8817h0> CREATOR = new C8819i0();

    /* renamed from: d */
    public final String f40851d;

    /* renamed from: e */
    public final AbstractBinderC8837x f40852e;

    /* renamed from: f */
    public final boolean f40853f;

    /* renamed from: g */
    public final boolean f40854g;

    public C8817h0(String str, IBinder iBinder, boolean z10, boolean z11) {
        BinderC8838y binderC8838y;
        this.f40851d = str;
        if (iBinder == null) {
            binderC8838y = null;
        } else {
            try {
                InterfaceC4993a mo37735o = AbstractBinderC9952t1.m41883y0(iBinder).mo37735o();
                byte[] bArr = mo37735o == null ? null : (byte[]) BinderC4994b.m25161U0(mo37735o);
                if (bArr != null) {
                    binderC8838y = new BinderC8838y(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                    binderC8838y = null;
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
                binderC8838y = null;
            }
        }
        this.f40852e = binderC8838y;
        this.f40853f = z10;
        this.f40854g = z11;
    }

    public C8817h0(String str, AbstractBinderC8837x abstractBinderC8837x, boolean z10, boolean z11) {
        this.f40851d = str;
        this.f40852e = abstractBinderC8837x;
        this.f40853f = z10;
        this.f40854g = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42536s(parcel, 1, this.f40851d, false);
        AbstractBinderC8837x abstractBinderC8837x = this.f40852e;
        AbstractBinderC8837x abstractBinderC8837x2 = abstractBinderC8837x;
        if (abstractBinderC8837x == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            abstractBinderC8837x2 = null;
        }
        C10127c.m42528k(parcel, 2, abstractBinderC8837x2, false);
        C10127c.m42520c(parcel, 3, this.f40853f);
        C10127c.m42520c(parcel, 4, this.f40854g);
        C10127c.m42519b(parcel, m42518a);
    }
}
