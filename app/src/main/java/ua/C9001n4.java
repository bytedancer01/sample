package ua;

import android.content.SharedPreferences;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/n4.class
 */
/* renamed from: ua.n4 */
/* loaded from: combined.jar:classes2.jar:ua/n4.class */
public final class C9001n4 {

    /* renamed from: a */
    public final String f41434a;

    /* renamed from: b */
    public boolean f41435b;

    /* renamed from: c */
    public String f41436c;

    /* renamed from: d */
    public final C9013o4 f41437d;

    public C9001n4(C9013o4 c9013o4, String str, String str2) {
        this.f41437d = c9013o4;
        C9935o.m41846f(str);
        this.f41434a = str;
    }

    /* renamed from: a */
    public final String m38155a() {
        if (!this.f41435b) {
            this.f41435b = true;
            this.f41436c = this.f41437d.m38167p().getString(this.f41434a, null);
        }
        return this.f41436c;
    }

    /* renamed from: b */
    public final void m38156b(String str) {
        SharedPreferences.Editor edit = this.f41437d.m38167p().edit();
        edit.putString(this.f41434a, str);
        edit.apply();
        this.f41436c = str;
    }
}
