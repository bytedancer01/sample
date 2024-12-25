package p305ra;

import android.content.Context;
import android.net.Uri;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/v3.class
 */
/* renamed from: ra.v3 */
/* loaded from: combined.jar:classes2.jar:ra/v3.class */
public final class C8378v3 {

    /* renamed from: b */
    public final Uri f39331b;

    /* renamed from: a */
    public final String f39330a = null;

    /* renamed from: c */
    public final String f39332c = "";

    /* renamed from: d */
    public final String f39333d = "";

    /* renamed from: e */
    public final boolean f39334e = false;

    /* renamed from: f */
    public final boolean f39335f = false;

    /* renamed from: g */
    public final boolean f39336g = false;

    /* renamed from: h */
    public final boolean f39337h = false;

    /* renamed from: i */
    public final InterfaceC8094c4<Context, Boolean> f39338i = null;

    public C8378v3(Uri uri) {
        this.f39331b = uri;
    }

    /* renamed from: a */
    public final AbstractC8408x3<Long> m35958a(String str, long j10) {
        return new C8318r3(this, str, Long.valueOf(j10), true);
    }

    /* renamed from: b */
    public final AbstractC8408x3<Boolean> m35959b(String str, boolean z10) {
        return new C8333s3(this, str, Boolean.valueOf(z10), true);
    }

    /* renamed from: c */
    public final AbstractC8408x3<Double> m35960c(String str, double d10) {
        return new C8348t3(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    /* renamed from: d */
    public final AbstractC8408x3<String> m35961d(String str, String str2) {
        return new C8363u3(this, str, str2, true);
    }
}
