package p422y9;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p350u9.C8808d;
import p350u9.C8814g;
import p422y9.InterfaceC9917i;
import p441z9.AbstractC10125a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/f.class
 */
/* renamed from: y9.f */
/* loaded from: combined.jar:classes2.jar:y9/f.class */
public class C9908f extends AbstractC10125a {
    public static final Parcelable.Creator<C9908f> CREATOR = new C9919i1();

    /* renamed from: d */
    public final int f45548d;

    /* renamed from: e */
    public final int f45549e;

    /* renamed from: f */
    public int f45550f;

    /* renamed from: g */
    public String f45551g;

    /* renamed from: h */
    public IBinder f45552h;

    /* renamed from: i */
    public Scope[] f45553i;

    /* renamed from: j */
    public Bundle f45554j;

    /* renamed from: k */
    public Account f45555k;

    /* renamed from: l */
    public C8808d[] f45556l;

    /* renamed from: m */
    public C8808d[] f45557m;

    /* renamed from: n */
    public boolean f45558n;

    /* renamed from: o */
    public int f45559o;

    /* renamed from: p */
    public boolean f45560p;

    /* renamed from: q */
    public String f45561q;

    public C9908f(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C8808d[] c8808dArr, C8808d[] c8808dArr2, boolean z10, int i13, boolean z11, String str2) {
        this.f45548d = i10;
        this.f45549e = i11;
        this.f45550f = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f45551g = "com.google.android.gms";
        } else {
            this.f45551g = str;
        }
        if (i10 < 2) {
            this.f45555k = iBinder != null ? BinderC9893a.m41751U0(InterfaceC9917i.a.m41804y0(iBinder)) : null;
        } else {
            this.f45552h = iBinder;
            this.f45555k = account;
        }
        this.f45553i = scopeArr;
        this.f45554j = bundle;
        this.f45556l = c8808dArr;
        this.f45557m = c8808dArr2;
        this.f45558n = z10;
        this.f45559o = i13;
        this.f45560p = z11;
        this.f45561q = str2;
    }

    public C9908f(int i10, String str) {
        this.f45548d = 6;
        this.f45550f = C8814g.f40848a;
        this.f45549e = i10;
        this.f45558n = true;
        this.f45561q = str;
    }

    /* renamed from: P */
    public final String m41788P() {
        return this.f45561q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C9919i1.m41808a(this, parcel, i10);
    }
}
