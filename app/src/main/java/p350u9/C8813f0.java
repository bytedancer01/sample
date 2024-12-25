package p350u9;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/f0.class
 */
/* renamed from: u9.f0 */
/* loaded from: combined.jar:classes2.jar:u9/f0.class */
public final class C8813f0 extends AbstractC10125a {
    public static final Parcelable.Creator<C8813f0> CREATOR = new C8815g0();

    /* renamed from: d */
    public final boolean f40845d;

    /* renamed from: e */
    public final String f40846e;

    /* renamed from: f */
    public final int f40847f;

    public C8813f0(boolean z10, String str, int i10) {
        this.f40845d = z10;
        this.f40846e = str;
        this.f40847f = C8811e0.m37674a(i10) - 1;
    }

    /* renamed from: P */
    public final String m37694P() {
        return this.f40846e;
    }

    /* renamed from: Q */
    public final boolean m37695Q() {
        return this.f40845d;
    }

    /* renamed from: R */
    public final int m37696R() {
        return C8811e0.m37674a(this.f40847f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42520c(parcel, 1, this.f40845d);
        C10127c.m42536s(parcel, 2, this.f40846e, false);
        C10127c.m42529l(parcel, 3, this.f40847f);
        C10127c.m42519b(parcel, m42518a);
    }
}
