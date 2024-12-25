package p395x2;

import android.text.TextUtils;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x2/g.class
 */
/* renamed from: x2.g */
/* loaded from: combined.jar:classes1.jar:x2/g.class */
public final class C9628g {

    /* renamed from: a */
    public final String f43973a;

    /* renamed from: b */
    public final String f43974b;

    public C9628g(String str, String str2) {
        this.f43973a = str;
        this.f43974b = str2;
    }

    /* renamed from: a */
    public final String m40518a() {
        return this.f43973a;
    }

    /* renamed from: b */
    public final String m40519b() {
        return this.f43974b;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C9628g.class != obj.getClass()) {
            return false;
        }
        C9628g c9628g = (C9628g) obj;
        if (!TextUtils.equals(this.f43973a, c9628g.f43973a) || !TextUtils.equals(this.f43974b, c9628g.f43974b)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return (this.f43973a.hashCode() * 31) + this.f43974b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f43973a + ",value=" + this.f43974b + "]";
    }
}
