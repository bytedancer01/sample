package id;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;
import p422y9.C9932n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:id/v.class
 */
/* renamed from: id.v */
/* loaded from: combined.jar:classes2.jar:id/v.class */
public final class C5240v {

    /* renamed from: d */
    public static final Pattern f29948d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    public final String f29949a;

    /* renamed from: b */
    public final String f29950b;

    /* renamed from: c */
    public final String f29951c;

    public C5240v(String str, String str2) {
        this.f29949a = m26126d(str2, str);
        this.f29950b = str;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append("!");
        sb2.append(str2);
        this.f29951c = sb2.toString();
    }

    /* renamed from: a */
    public static C5240v m26125a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new C5240v(split[0], split[1]);
    }

    /* renamed from: d */
    public static String m26126d(String str, String str2) {
        String str3 = str;
        if (str != null) {
            str3 = str;
            if (str.startsWith("/topics/")) {
                Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
                str3 = str.substring(8);
            }
        }
        if (str3 == null || !f29948d.matcher(str3).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str3, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str3;
    }

    /* renamed from: b */
    public String m26127b() {
        return this.f29950b;
    }

    /* renamed from: c */
    public String m26128c() {
        return this.f29949a;
    }

    /* renamed from: e */
    public String m26129e() {
        return this.f29951c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5240v)) {
            return false;
        }
        C5240v c5240v = (C5240v) obj;
        return this.f29949a.equals(c5240v.f29949a) && this.f29950b.equals(c5240v.f29950b);
    }

    public int hashCode() {
        return C9932n.m41833c(this.f29950b, this.f29949a);
    }
}
