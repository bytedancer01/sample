package p402x9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:x9/a.class
 */
/* renamed from: x9.a */
/* loaded from: combined.jar:classes2.jar:x9/a.class */
public final class C9691a extends AbstractC10125a {
    public static final Parcelable.Creator<C9691a> CREATOR = new C9692b();

    /* renamed from: d */
    public final int f44231d;

    /* renamed from: e */
    public final Uri f44232e;

    /* renamed from: f */
    public final int f44233f;

    /* renamed from: g */
    public final int f44234g;

    public C9691a(int i10, Uri uri, int i11, int i12) {
        this.f44231d = i10;
        this.f44232e = uri;
        this.f44233f = i11;
        this.f44234g = i12;
    }

    public C9691a(Uri uri) {
        this(uri, 0, 0);
    }

    public C9691a(Uri uri, int i10, int i11) {
        this(1, uri, i10, i11);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C9691a(org.json.JSONObject r8) {
        /*
            r7 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            r10 = r0
            r0 = r10
            r9 = r0
            r0 = r8
            java.lang.String r1 = "url"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L19
            r0 = r8
            java.lang.String r1 = "url"
            java.lang.String r0 = r0.getString(r1)     // Catch: org.json.JSONException -> L2d
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: org.json.JSONException -> L2d
            r9 = r0
        L19:
            r0 = r7
            r1 = r9
            r2 = r8
            java.lang.String r3 = "width"
            r4 = 0
            int r2 = r2.optInt(r3, r4)
            r3 = r8
            java.lang.String r4 = "height"
            r5 = 0
            int r3 = r3.optInt(r4, r5)
            r0.<init>(r1, r2, r3)
            return
        L2d:
            r9 = move-exception
            r0 = r10
            r9 = r0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: p402x9.C9691a.<init>(org.json.JSONObject):void");
    }

    /* renamed from: P */
    public Uri m40801P() {
        return this.f44232e;
    }

    /* renamed from: Q */
    public JSONObject m40802Q() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.f44232e.toString());
            jSONObject.put("width", this.f44233f);
            jSONObject.put("height", this.f44234g);
        } catch (JSONException e10) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C9691a)) {
            return false;
        }
        C9691a c9691a = (C9691a) obj;
        return C9932n.m41832b(this.f44232e, c9691a.f44232e) && this.f44233f == c9691a.f44233f && this.f44234g == c9691a.f44234g;
    }

    public int getHeight() {
        return this.f44234g;
    }

    public int getWidth() {
        return this.f44233f;
    }

    public int hashCode() {
        return C9932n.m41833c(this.f44232e, Integer.valueOf(this.f44233f), Integer.valueOf(this.f44234g));
    }

    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.f44233f), Integer.valueOf(this.f44234g), this.f44232e.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42529l(parcel, 1, this.f44231d);
        C10127c.m42535r(parcel, 2, m40801P(), i10, false);
        C10127c.m42529l(parcel, 3, getWidth());
        C10127c.m42529l(parcel, 4, getHeight());
        C10127c.m42519b(parcel, m42518a);
    }
}
