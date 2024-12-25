package p422y9;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p350u9.C8808d;
import p441z9.C10126b;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/i1.class
 */
/* renamed from: y9.i1 */
/* loaded from: combined.jar:classes2.jar:y9/i1.class */
public final class C9919i1 implements Parcelable.Creator<C9908f> {
    /* renamed from: a */
    public static void m41808a(C9908f c9908f, Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42529l(parcel, 1, c9908f.f45548d);
        C10127c.m42529l(parcel, 2, c9908f.f45549e);
        C10127c.m42529l(parcel, 3, c9908f.f45550f);
        C10127c.m42536s(parcel, 4, c9908f.f45551g, false);
        C10127c.m42528k(parcel, 5, c9908f.f45552h, false);
        C10127c.m42539v(parcel, 6, c9908f.f45553i, i10, false);
        C10127c.m42522e(parcel, 7, c9908f.f45554j, false);
        C10127c.m42535r(parcel, 8, c9908f.f45555k, i10, false);
        C10127c.m42539v(parcel, 10, c9908f.f45556l, i10, false);
        C10127c.m42539v(parcel, 11, c9908f.f45557m, i10, false);
        C10127c.m42520c(parcel, 12, c9908f.f45558n);
        C10127c.m42529l(parcel, 13, c9908f.f45559o);
        C10127c.m42520c(parcel, 14, c9908f.f45560p);
        C10127c.m42536s(parcel, 15, c9908f.m41788P(), false);
        C10127c.m42519b(parcel, m42518a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C9908f createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        C8808d[] c8808dArr = null;
        C8808d[] c8808dArr2 = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            switch (C10126b.m42502l(m42509s)) {
                case 1:
                    i10 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 2:
                    i11 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 3:
                    i12 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 4:
                    str = C10126b.m42496f(parcel, m42509s);
                    break;
                case 5:
                    iBinder = C10126b.m42510t(parcel, m42509s);
                    break;
                case 6:
                    scopeArr = (Scope[]) C10126b.m42499i(parcel, m42509s, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C10126b.m42491a(parcel, m42509s);
                    break;
                case 8:
                    account = (Account) C10126b.m42495e(parcel, m42509s, Account.CREATOR);
                    break;
                case 9:
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
                case 10:
                    c8808dArr = (C8808d[]) C10126b.m42499i(parcel, m42509s, C8808d.CREATOR);
                    break;
                case 11:
                    c8808dArr2 = (C8808d[]) C10126b.m42499i(parcel, m42509s, C8808d.CREATOR);
                    break;
                case 12:
                    z10 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 13:
                    i13 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 14:
                    z11 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 15:
                    str2 = C10126b.m42496f(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C9908f(i10, i11, i12, str, iBinder, scopeArr, bundle, account, c8808dArr, c8808dArr2, z10, i13, z11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9908f[] newArray(int i10) {
        return new C9908f[i10];
    }
}
