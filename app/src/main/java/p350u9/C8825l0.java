package p350u9;

import android.util.Log;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/l0.class
 */
/* renamed from: u9.l0 */
/* loaded from: combined.jar:classes2.jar:u9/l0.class */
public class C8825l0 {

    /* renamed from: d */
    public static final C8825l0 f40866d = new C8825l0(true, null, null);

    /* renamed from: a */
    public final boolean f40867a;

    /* renamed from: b */
    public final String f40868b;

    /* renamed from: c */
    public final Throwable f40869c;

    public C8825l0(boolean z10, String str, Throwable th2) {
        this.f40867a = z10;
        this.f40868b = str;
        this.f40869c = th2;
    }

    /* renamed from: b */
    public static C8825l0 m37726b() {
        return f40866d;
    }

    /* renamed from: c */
    public static C8825l0 m37727c(String str) {
        return new C8825l0(false, str, null);
    }

    /* renamed from: d */
    public static C8825l0 m37728d(String str, Throwable th2) {
        return new C8825l0(false, str, th2);
    }

    /* renamed from: a */
    public String mo37719a() {
        return this.f40868b;
    }

    /* renamed from: e */
    public final void m37729e() {
        if (this.f40867a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f40869c != null) {
            Log.d("GoogleCertificatesRslt", mo37719a(), this.f40869c);
        } else {
            Log.d("GoogleCertificatesRslt", mo37719a());
        }
    }
}
