package ua;

import android.content.SharedPreferences;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/j4.class
 */
/* renamed from: ua.j4 */
/* loaded from: combined.jar:classes2.jar:ua/j4.class */
public final class C8953j4 {

    /* renamed from: a */
    public final String f41207a;

    /* renamed from: b */
    public final boolean f41208b;

    /* renamed from: c */
    public boolean f41209c;

    /* renamed from: d */
    public boolean f41210d;

    /* renamed from: e */
    public final C9013o4 f41211e;

    public C8953j4(C9013o4 c9013o4, String str, boolean z10) {
        this.f41211e = c9013o4;
        C9935o.m41846f(str);
        this.f41207a = str;
        this.f41208b = z10;
    }

    /* renamed from: a */
    public final boolean m38090a() {
        if (!this.f41209c) {
            this.f41209c = true;
            this.f41210d = this.f41211e.m38167p().getBoolean(this.f41207a, this.f41208b);
        }
        return this.f41210d;
    }

    /* renamed from: b */
    public final void m38091b(boolean z10) {
        SharedPreferences.Editor edit = this.f41211e.m38167p().edit();
        edit.putBoolean(this.f41207a, z10);
        edit.apply();
        this.f41210d = z10;
    }
}
