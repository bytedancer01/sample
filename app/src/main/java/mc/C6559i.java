package mc;

import android.content.Context;
import android.text.TextUtils;
import p060da.C4416o;
import p422y9.C9932n;
import p422y9.C9935o;
import p422y9.C9944r;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:mc/i.class
 */
/* renamed from: mc.i */
/* loaded from: combined.jar:classes2.jar:mc/i.class */
public final class C6559i {

    /* renamed from: a */
    public final String f34306a;

    /* renamed from: b */
    public final String f34307b;

    /* renamed from: c */
    public final String f34308c;

    /* renamed from: d */
    public final String f34309d;

    /* renamed from: e */
    public final String f34310e;

    /* renamed from: f */
    public final String f34311f;

    /* renamed from: g */
    public final String f34312g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mc/i$b.class
     */
    /* renamed from: mc.i$b */
    /* loaded from: combined.jar:classes2.jar:mc/i$b.class */
    public static final class b {

        /* renamed from: a */
        public String f34313a;

        /* renamed from: b */
        public String f34314b;

        /* renamed from: c */
        public String f34315c;

        /* renamed from: d */
        public String f34316d;

        /* renamed from: e */
        public String f34317e;

        /* renamed from: f */
        public String f34318f;

        /* renamed from: g */
        public String f34319g;

        /* renamed from: a */
        public C6559i m30262a() {
            return new C6559i(this.f34314b, this.f34313a, this.f34315c, this.f34316d, this.f34317e, this.f34318f, this.f34319g);
        }

        /* renamed from: b */
        public b m30263b(String str) {
            this.f34313a = C9935o.m41847g(str, "ApiKey must be set.");
            return this;
        }

        /* renamed from: c */
        public b m30264c(String str) {
            this.f34314b = C9935o.m41847g(str, "ApplicationId must be set.");
            return this;
        }

        /* renamed from: d */
        public b m30265d(String str) {
            this.f34317e = str;
            return this;
        }

        /* renamed from: e */
        public b m30266e(String str) {
            this.f34319g = str;
            return this;
        }
    }

    public C6559i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C9935o.m41854n(!C4416o.m22463a(str), "ApplicationId must be set.");
        this.f34307b = str;
        this.f34306a = str2;
        this.f34308c = str3;
        this.f34309d = str4;
        this.f34310e = str5;
        this.f34311f = str6;
        this.f34312g = str7;
    }

    /* renamed from: a */
    public static C6559i m30257a(Context context) {
        C9944r c9944r = new C9944r(context);
        String m41873a = c9944r.m41873a("google_app_id");
        if (TextUtils.isEmpty(m41873a)) {
            return null;
        }
        return new C6559i(m41873a, c9944r.m41873a("google_api_key"), c9944r.m41873a("firebase_database_url"), c9944r.m41873a("ga_trackingId"), c9944r.m41873a("gcm_defaultSenderId"), c9944r.m41873a("google_storage_bucket"), c9944r.m41873a("project_id"));
    }

    /* renamed from: b */
    public String m30258b() {
        return this.f34306a;
    }

    /* renamed from: c */
    public String m30259c() {
        return this.f34307b;
    }

    /* renamed from: d */
    public String m30260d() {
        return this.f34310e;
    }

    /* renamed from: e */
    public String m30261e() {
        return this.f34312g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6559i)) {
            return false;
        }
        C6559i c6559i = (C6559i) obj;
        boolean z10 = false;
        if (C9932n.m41832b(this.f34307b, c6559i.f34307b)) {
            z10 = false;
            if (C9932n.m41832b(this.f34306a, c6559i.f34306a)) {
                z10 = false;
                if (C9932n.m41832b(this.f34308c, c6559i.f34308c)) {
                    z10 = false;
                    if (C9932n.m41832b(this.f34309d, c6559i.f34309d)) {
                        z10 = false;
                        if (C9932n.m41832b(this.f34310e, c6559i.f34310e)) {
                            z10 = false;
                            if (C9932n.m41832b(this.f34311f, c6559i.f34311f)) {
                                z10 = false;
                                if (C9932n.m41832b(this.f34312g, c6559i.f34312g)) {
                                    z10 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return z10;
    }

    public int hashCode() {
        return C9932n.m41833c(this.f34307b, this.f34306a, this.f34308c, this.f34309d, this.f34310e, this.f34311f, this.f34312g);
    }

    public String toString() {
        return C9932n.m41834d(this).m41835a("applicationId", this.f34307b).m41835a("apiKey", this.f34306a).m41835a("databaseUrl", this.f34308c).m41835a("gcmSenderId", this.f34310e).m41835a("storageBucket", this.f34311f).m41835a("projectId", this.f34312g).toString();
    }
}
