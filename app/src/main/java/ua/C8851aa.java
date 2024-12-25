package ua;

import android.os.Parcel;
import android.os.Parcelable;
import p422y9.C9935o;
import p441z9.AbstractC10125a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/aa.class
 */
/* renamed from: ua.aa */
/* loaded from: combined.jar:classes2.jar:ua/aa.class */
public final class C8851aa extends AbstractC10125a {
    public static final Parcelable.Creator<C8851aa> CREATOR = new C8863ba();

    /* renamed from: d */
    public final int f40905d;

    /* renamed from: e */
    public final String f40906e;

    /* renamed from: f */
    public final long f40907f;

    /* renamed from: g */
    public final Long f40908g;

    /* renamed from: h */
    public final String f40909h;

    /* renamed from: i */
    public final String f40910i;

    /* renamed from: j */
    public final Double f40911j;

    public C8851aa(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f40905d = i10;
        this.f40906e = str;
        this.f40907f = j10;
        this.f40908g = l10;
        if (i10 == 1) {
            this.f40911j = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.f40911j = d10;
        }
        this.f40909h = str2;
        this.f40910i = str3;
    }

    public C8851aa(String str, long j10, Object obj, String str2) {
        C9935o.m41846f(str);
        this.f40905d = 2;
        this.f40906e = str;
        this.f40907f = j10;
        this.f40910i = str2;
        if (obj == null) {
            this.f40908g = null;
            this.f40911j = null;
            this.f40909h = null;
            return;
        }
        if (obj instanceof Long) {
            this.f40908g = (Long) obj;
            this.f40911j = null;
            this.f40909h = null;
        } else if (obj instanceof String) {
            this.f40908g = null;
            this.f40911j = null;
            this.f40909h = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f40908g = null;
            this.f40911j = (Double) obj;
            this.f40909h = null;
        }
    }

    public C8851aa(C8875ca c8875ca) {
        this(c8875ca.f41004c, c8875ca.f41005d, c8875ca.f41006e, c8875ca.f41003b);
    }

    /* renamed from: P */
    public final Object m37750P() {
        Long l10 = this.f40908g;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f40911j;
        if (d10 != null) {
            return d10;
        }
        String str = this.f40909h;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C8863ba.m37752a(this, parcel, i10);
    }
}
