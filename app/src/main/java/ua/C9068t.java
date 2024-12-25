package ua;

import android.os.Parcel;
import android.os.Parcelable;
import p422y9.C9935o;
import p441z9.AbstractC10125a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/t.class
 */
/* renamed from: ua.t */
/* loaded from: combined.jar:classes2.jar:ua/t.class */
public final class C9068t extends AbstractC10125a {
    public static final Parcelable.Creator<C9068t> CREATOR = new C9080u();

    /* renamed from: d */
    public final String f41627d;

    /* renamed from: e */
    public final C9044r f41628e;

    /* renamed from: f */
    public final String f41629f;

    /* renamed from: g */
    public final long f41630g;

    public C9068t(String str, C9044r c9044r, String str2, long j10) {
        this.f41627d = str;
        this.f41628e = c9044r;
        this.f41629f = str2;
        this.f41630g = j10;
    }

    public C9068t(C9068t c9068t, long j10) {
        C9935o.m41850j(c9068t);
        this.f41627d = c9068t.f41627d;
        this.f41628e = c9068t.f41628e;
        this.f41629f = c9068t.f41629f;
        this.f41630g = j10;
    }

    public final String toString() {
        String str = this.f41629f;
        String str2 = this.f41627d;
        String valueOf = String.valueOf(this.f41628e);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + valueOf.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C9080u.m38243a(this, parcel, i10);
    }
}
