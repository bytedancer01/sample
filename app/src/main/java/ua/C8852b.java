package ua;

import android.os.Parcel;
import android.os.Parcelable;
import p422y9.C9935o;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/b.class
 */
/* renamed from: ua.b */
/* loaded from: combined.jar:classes2.jar:ua/b.class */
public final class C8852b extends AbstractC10125a {
    public static final Parcelable.Creator<C8852b> CREATOR = new C8864c();

    /* renamed from: d */
    public String f40912d;

    /* renamed from: e */
    public String f40913e;

    /* renamed from: f */
    public C8851aa f40914f;

    /* renamed from: g */
    public long f40915g;

    /* renamed from: h */
    public boolean f40916h;

    /* renamed from: i */
    public String f40917i;

    /* renamed from: j */
    public final C9068t f40918j;

    /* renamed from: k */
    public long f40919k;

    /* renamed from: l */
    public C9068t f40920l;

    /* renamed from: m */
    public final long f40921m;

    /* renamed from: n */
    public final C9068t f40922n;

    public C8852b(String str, String str2, C8851aa c8851aa, long j10, boolean z10, String str3, C9068t c9068t, long j11, C9068t c9068t2, long j12, C9068t c9068t3) {
        this.f40912d = str;
        this.f40913e = str2;
        this.f40914f = c8851aa;
        this.f40915g = j10;
        this.f40916h = z10;
        this.f40917i = str3;
        this.f40918j = c9068t;
        this.f40919k = j11;
        this.f40920l = c9068t2;
        this.f40921m = j12;
        this.f40922n = c9068t3;
    }

    public C8852b(C8852b c8852b) {
        C9935o.m41850j(c8852b);
        this.f40912d = c8852b.f40912d;
        this.f40913e = c8852b.f40913e;
        this.f40914f = c8852b.f40914f;
        this.f40915g = c8852b.f40915g;
        this.f40916h = c8852b.f40916h;
        this.f40917i = c8852b.f40917i;
        this.f40918j = c8852b.f40918j;
        this.f40919k = c8852b.f40919k;
        this.f40920l = c8852b.f40920l;
        this.f40921m = c8852b.f40921m;
        this.f40922n = c8852b.f40922n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42536s(parcel, 2, this.f40912d, false);
        C10127c.m42536s(parcel, 3, this.f40913e, false);
        C10127c.m42535r(parcel, 4, this.f40914f, i10, false);
        C10127c.m42532o(parcel, 5, this.f40915g);
        C10127c.m42520c(parcel, 6, this.f40916h);
        C10127c.m42536s(parcel, 7, this.f40917i, false);
        C10127c.m42535r(parcel, 8, this.f40918j, i10, false);
        C10127c.m42532o(parcel, 9, this.f40919k);
        C10127c.m42535r(parcel, 10, this.f40920l, i10, false);
        C10127c.m42532o(parcel, 11, this.f40921m);
        C10127c.m42535r(parcel, 12, this.f40922n, i10, false);
        C10127c.m42519b(parcel, m42518a);
    }
}
