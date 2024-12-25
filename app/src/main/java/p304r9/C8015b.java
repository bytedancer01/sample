package p304r9;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/b.class
 */
/* renamed from: r9.b */
/* loaded from: combined.jar:classes2.jar:r9/b.class */
public class C8015b {

    /* renamed from: a */
    public final String f38798a;

    /* renamed from: b */
    public final boolean f38799b;

    /* renamed from: c */
    public boolean f38800c;

    /* renamed from: d */
    public final String f38801d;

    public C8015b(String str) {
        this(str, null);
    }

    public C8015b(String str, String str2) {
        C9935o.m41847g(str, "The log tag cannot be null or empty.");
        this.f38798a = str;
        this.f38799b = str.length() <= 23;
        this.f38800c = false;
        this.f38801d = TextUtils.isEmpty(null) ? null : String.format("[%s] ", null);
    }

    /* renamed from: a */
    public void m34873a(String str, Object... objArr) {
        if (m34881i()) {
            Log.d(this.f38798a, m34880h(str, objArr));
        }
    }

    /* renamed from: b */
    public void m34874b(Throwable th2, String str, Object... objArr) {
        if (m34881i()) {
            Log.d(this.f38798a, m34880h(str, objArr), th2);
        }
    }

    /* renamed from: c */
    public void m34875c(String str, Object... objArr) {
        Log.e(this.f38798a, m34880h(str, objArr));
    }

    /* renamed from: d */
    public void m34876d(Throwable th2, String str, Object... objArr) {
        Log.e(this.f38798a, m34880h(str, objArr), th2);
    }

    /* renamed from: e */
    public void m34877e(String str, Object... objArr) {
        Log.i(this.f38798a, m34880h(str, objArr));
    }

    /* renamed from: f */
    public void m34878f(String str, Object... objArr) {
        Log.w(this.f38798a, m34880h(str, objArr));
    }

    /* renamed from: g */
    public void m34879g(Throwable th2, String str, Object... objArr) {
        Log.w(this.f38798a, m34880h(str, objArr), th2);
    }

    /* renamed from: h */
    public final String m34880h(String str, Object... objArr) {
        String str2 = str;
        if (objArr.length != 0) {
            str2 = String.format(Locale.ROOT, str, objArr);
        }
        String str3 = str2;
        if (!TextUtils.isEmpty(this.f38801d)) {
            str3 = String.valueOf(this.f38801d).concat(String.valueOf(str2));
        }
        return str3;
    }

    /* renamed from: i */
    public final boolean m34881i() {
        boolean z10 = true;
        if (!Build.TYPE.equals("user")) {
            if (!this.f38800c) {
                if (this.f38799b && Log.isLoggable(this.f38798a, 3)) {
                    return true;
                }
            }
            return z10;
        }
        z10 = false;
        return z10;
    }
}
