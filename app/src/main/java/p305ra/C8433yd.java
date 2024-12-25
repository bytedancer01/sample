package p305ra;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/yd.class
 */
/* renamed from: ra.yd */
/* loaded from: combined.jar:classes2.jar:ra/yd.class */
public final class C8433yd extends AbstractC10125a {
    public static final Parcelable.Creator<C8433yd> CREATOR = new C8448zd();

    /* renamed from: d */
    public final long f39426d;

    /* renamed from: e */
    public final long f39427e;

    /* renamed from: f */
    public final boolean f39428f;

    /* renamed from: g */
    public final String f39429g;

    /* renamed from: h */
    public final String f39430h;

    /* renamed from: i */
    public final String f39431i;

    /* renamed from: j */
    public final Bundle f39432j;

    /* renamed from: k */
    public final String f39433k;

    public C8433yd(long j10, long j11, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f39426d = j10;
        this.f39427e = j11;
        this.f39428f = z10;
        this.f39429g = str;
        this.f39430h = str2;
        this.f39431i = str3;
        this.f39432j = bundle;
        this.f39433k = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42532o(parcel, 1, this.f39426d);
        C10127c.m42532o(parcel, 2, this.f39427e);
        C10127c.m42520c(parcel, 3, this.f39428f);
        C10127c.m42536s(parcel, 4, this.f39429g, false);
        C10127c.m42536s(parcel, 5, this.f39430h, false);
        C10127c.m42536s(parcel, 6, this.f39431i, false);
        C10127c.m42522e(parcel, 7, this.f39432j, false);
        C10127c.m42536s(parcel, 8, this.f39433k, false);
        C10127c.m42519b(parcel, m42518a);
    }
}
