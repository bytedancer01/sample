package ua;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
import p422y9.C9935o;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/ja.class
 */
/* renamed from: ua.ja */
/* loaded from: combined.jar:classes2.jar:ua/ja.class */
public final class C8959ja extends AbstractC10125a {
    public static final Parcelable.Creator<C8959ja> CREATOR = new C8971ka();

    /* renamed from: d */
    public final String f41228d;

    /* renamed from: e */
    public final String f41229e;

    /* renamed from: f */
    public final String f41230f;

    /* renamed from: g */
    public final String f41231g;

    /* renamed from: h */
    public final long f41232h;

    /* renamed from: i */
    public final long f41233i;

    /* renamed from: j */
    public final String f41234j;

    /* renamed from: k */
    public final boolean f41235k;

    /* renamed from: l */
    public final boolean f41236l;

    /* renamed from: m */
    public final long f41237m;

    /* renamed from: n */
    public final String f41238n;

    /* renamed from: o */
    public final long f41239o;

    /* renamed from: p */
    public final long f41240p;

    /* renamed from: q */
    public final int f41241q;

    /* renamed from: r */
    public final boolean f41242r;

    /* renamed from: s */
    public final boolean f41243s;

    /* renamed from: t */
    public final String f41244t;

    /* renamed from: u */
    public final Boolean f41245u;

    /* renamed from: v */
    public final long f41246v;

    /* renamed from: w */
    public final List<String> f41247w;

    /* renamed from: x */
    public final String f41248x;

    /* renamed from: y */
    public final String f41249y;

    public C8959ja(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List<String> list, String str8, String str9) {
        C9935o.m41846f(str);
        this.f41228d = str;
        this.f41229e = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f41230f = str3;
        this.f41237m = j10;
        this.f41231g = str4;
        this.f41232h = j11;
        this.f41233i = j12;
        this.f41234j = str5;
        this.f41235k = z10;
        this.f41236l = z11;
        this.f41238n = str6;
        this.f41239o = j13;
        this.f41240p = j14;
        this.f41241q = i10;
        this.f41242r = z12;
        this.f41243s = z13;
        this.f41244t = str7;
        this.f41245u = bool;
        this.f41246v = j15;
        this.f41247w = list;
        this.f41248x = str8;
        this.f41249y = str9;
    }

    public C8959ja(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List<String> list, String str8, String str9) {
        this.f41228d = str;
        this.f41229e = str2;
        this.f41230f = str3;
        this.f41237m = j12;
        this.f41231g = str4;
        this.f41232h = j10;
        this.f41233i = j11;
        this.f41234j = str5;
        this.f41235k = z10;
        this.f41236l = z11;
        this.f41238n = str6;
        this.f41239o = j13;
        this.f41240p = j14;
        this.f41241q = i10;
        this.f41242r = z12;
        this.f41243s = z13;
        this.f41244t = str7;
        this.f41245u = bool;
        this.f41246v = j15;
        this.f41247w = list;
        this.f41248x = str8;
        this.f41249y = str9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42536s(parcel, 2, this.f41228d, false);
        C10127c.m42536s(parcel, 3, this.f41229e, false);
        C10127c.m42536s(parcel, 4, this.f41230f, false);
        C10127c.m42536s(parcel, 5, this.f41231g, false);
        C10127c.m42532o(parcel, 6, this.f41232h);
        C10127c.m42532o(parcel, 7, this.f41233i);
        C10127c.m42536s(parcel, 8, this.f41234j, false);
        C10127c.m42520c(parcel, 9, this.f41235k);
        C10127c.m42520c(parcel, 10, this.f41236l);
        C10127c.m42532o(parcel, 11, this.f41237m);
        C10127c.m42536s(parcel, 12, this.f41238n, false);
        C10127c.m42532o(parcel, 13, this.f41239o);
        C10127c.m42532o(parcel, 14, this.f41240p);
        C10127c.m42529l(parcel, 15, this.f41241q);
        C10127c.m42520c(parcel, 16, this.f41242r);
        C10127c.m42520c(parcel, 18, this.f41243s);
        C10127c.m42536s(parcel, 19, this.f41244t, false);
        C10127c.m42521d(parcel, 21, this.f41245u, false);
        C10127c.m42532o(parcel, 22, this.f41246v);
        C10127c.m42538u(parcel, 23, this.f41247w, false);
        C10127c.m42536s(parcel, 24, this.f41248x, false);
        C10127c.m42536s(parcel, 25, this.f41249y, false);
        C10127c.m42519b(parcel, m42518a);
    }
}
