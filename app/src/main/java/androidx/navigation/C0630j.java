package androidx.navigation;

import android.content.Intent;
import android.net.Uri;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/navigation/j.class
 */
/* renamed from: androidx.navigation.j */
/* loaded from: combined.jar:classes1.jar:androidx/navigation/j.class */
public class C0630j {

    /* renamed from: a */
    public final Uri f4256a;

    /* renamed from: b */
    public final String f4257b;

    /* renamed from: c */
    public final String f4258c;

    public C0630j(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
    }

    public C0630j(Uri uri, String str, String str2) {
        this.f4256a = uri;
        this.f4257b = str;
        this.f4258c = str2;
    }

    /* renamed from: a */
    public String m3553a() {
        return this.f4257b;
    }

    /* renamed from: b */
    public String m3554b() {
        return this.f4258c;
    }

    /* renamed from: c */
    public Uri m3555c() {
        return this.f4256a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NavDeepLinkRequest");
        sb2.append("{");
        if (this.f4256a != null) {
            sb2.append(" uri=");
            sb2.append(this.f4256a.toString());
        }
        if (this.f4257b != null) {
            sb2.append(" action=");
            sb2.append(this.f4257b);
        }
        if (this.f4258c != null) {
            sb2.append(" mimetype=");
            sb2.append(this.f4258c);
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
