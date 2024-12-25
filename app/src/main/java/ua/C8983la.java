package ua;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/la.class
 */
/* renamed from: ua.la */
/* loaded from: combined.jar:classes2.jar:ua/la.class */
public final class C8983la {

    /* renamed from: a */
    public final C8870c5 f41302a;

    public C8983la(C8870c5 c8870c5) {
        this.f41302a = c8870c5;
    }

    /* renamed from: a */
    public final void m38115a() {
        this.f41302a.mo37782e().mo37811h();
        if (m38119e()) {
            if (m38118d()) {
                this.f41302a.m37759A().f41503z.m38156b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f41302a.m37764F().m37933X("auto", "_cmpx", bundle);
            } else {
                String m38155a = this.f41302a.m37759A().f41503z.m38155a();
                if (TextUtils.isEmpty(m38155a)) {
                    this.f41302a.mo37780c().m38409p().m38326a("Cache still valid but referrer not found");
                } else {
                    long m38109a = this.f41302a.m37759A().f41478A.m38109a() / 3600000;
                    Uri parse = Uri.parse(m38155a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (m38109a - 1) * 3600000);
                    this.f41302a.m37764F().m37933X((String) pair.first, "_cmp", (Bundle) pair.second);
                }
                this.f41302a.m37759A().f41503z.m38156b(null);
            }
            this.f41302a.m37759A().f41478A.m38110b(0L);
        }
    }

    /* renamed from: b */
    public final void m38116b(String str, Bundle bundle) {
        String uri;
        this.f41302a.mo37782e().mo37811h();
        if (this.f41302a.m37787k()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            String str2 = str;
            if (true == str.isEmpty()) {
                str2 = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str2);
            for (String str3 : bundle.keySet()) {
                builder.appendQueryParameter(str3, bundle.getString(str3));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        this.f41302a.m37759A().f41503z.m38156b(uri);
        this.f41302a.m37759A().f41478A.m38110b(this.f41302a.mo37778a().mo22432a());
    }

    /* renamed from: c */
    public final void m38117c() {
        if (m38119e() && m38118d()) {
            this.f41302a.m37759A().f41503z.m38156b(null);
        }
    }

    /* renamed from: d */
    public final boolean m38118d() {
        return m38119e() && this.f41302a.mo37778a().mo22432a() - this.f41302a.m37759A().f41478A.m38109a() > this.f41302a.m37797z().m37896s(null, C8988m3.f41319E0);
    }

    /* renamed from: e */
    public final boolean m38119e() {
        return this.f41302a.m37759A().f41478A.m38109a() > 0;
    }
}
