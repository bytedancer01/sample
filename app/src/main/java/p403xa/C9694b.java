package p403xa;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p368v9.InterfaceC9320f;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xa/b.class
 */
/* renamed from: xa.b */
/* loaded from: combined.jar:classes2.jar:xa/b.class */
public final class C9694b extends AbstractC10125a implements InterfaceC9320f {
    public static final Parcelable.Creator<C9694b> CREATOR = new C9695c();

    /* renamed from: d */
    public final int f44240d;

    /* renamed from: e */
    public int f44241e;

    /* renamed from: f */
    public Intent f44242f;

    public C9694b() {
        this(2, 0, null);
    }

    public C9694b(int i10, int i11, Intent intent) {
        this.f44240d = i10;
        this.f44241e = i11;
        this.f44242f = intent;
    }

    @Override // p368v9.InterfaceC9320f
    /* renamed from: w */
    public final Status mo13127w() {
        return this.f44241e == 0 ? Status.f14793i : Status.f14797m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42529l(parcel, 1, this.f44240d);
        C10127c.m42529l(parcel, 2, this.f44241e);
        C10127c.m42535r(parcel, 3, this.f44242f, i10, false);
        C10127c.m42519b(parcel, m42518a);
    }
}
