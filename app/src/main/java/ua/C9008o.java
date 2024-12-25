package ua;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/o.class
 */
/* renamed from: ua.o */
/* loaded from: combined.jar:classes2.jar:ua/o.class */
public final class C9008o {

    /* renamed from: a */
    public final String f41468a;

    /* renamed from: b */
    public final String f41469b;

    /* renamed from: c */
    public final String f41470c;

    /* renamed from: d */
    public final long f41471d;

    /* renamed from: e */
    public final long f41472e;

    /* renamed from: f */
    public final C9044r f41473f;

    public C9008o(C8870c5 c8870c5, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        C9044r c9044r;
        C9935o.m41846f(str2);
        C9935o.m41846f(str3);
        this.f41468a = str2;
        this.f41469b = str3;
        this.f41470c = true == TextUtils.isEmpty(str) ? null : str;
        this.f41471d = j10;
        this.f41472e = j11;
        if (j11 != 0 && j11 > j10) {
            c8870c5.mo37780c().m38411r().m38327b("Event created with reverse previous/current timestamps. appId", C9128y3.m38407x(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            c9044r = new C9044r(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c8870c5.mo37780c().m38408o().m38326a("Param name can't be null");
                } else {
                    Object m37866s = c8870c5.m37765G().m37866s(next, bundle2.get(next));
                    if (m37866s == null) {
                        c8870c5.mo37780c().m38411r().m38327b("Param value can't be null", c8870c5.m37766H().m38232q(next));
                    } else {
                        c8870c5.m37765G().m37876z(bundle2, next, m37866s);
                    }
                }
                it.remove();
            }
            c9044r = new C9044r(bundle2);
        }
        this.f41473f = c9044r;
    }

    public C9008o(C8870c5 c8870c5, String str, String str2, String str3, long j10, long j11, C9044r c9044r) {
        C9935o.m41846f(str2);
        C9935o.m41846f(str3);
        C9935o.m41850j(c9044r);
        this.f41468a = str2;
        this.f41469b = str3;
        this.f41470c = true == TextUtils.isEmpty(str) ? null : str;
        this.f41471d = j10;
        this.f41472e = j11;
        if (j11 != 0 && j11 > j10) {
            c8870c5.mo37780c().m38411r().m38328c("Event created with reverse previous/current timestamps. appId, name", C9128y3.m38407x(str2), C9128y3.m38407x(str3));
        }
        this.f41473f = c9044r;
    }

    /* renamed from: a */
    public final C9008o m38165a(C8870c5 c8870c5, long j10) {
        return new C9008o(c8870c5, this.f41470c, this.f41468a, this.f41469b, this.f41471d, j10, this.f41473f);
    }

    public final String toString() {
        String str = this.f41468a;
        String str2 = this.f41469b;
        String valueOf = String.valueOf(this.f41473f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + valueOf.length());
        sb2.append("Event{appId='");
        sb2.append(str);
        sb2.append("', name='");
        sb2.append(str2);
        sb2.append("', params=");
        sb2.append(valueOf);
        sb2.append('}');
        return sb2.toString();
    }
}
