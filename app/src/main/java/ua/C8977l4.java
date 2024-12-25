package ua;

import android.content.SharedPreferences;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/l4.class
 */
/* renamed from: ua.l4 */
/* loaded from: combined.jar:classes2.jar:ua/l4.class */
public final class C8977l4 {

    /* renamed from: a */
    public final String f41286a;

    /* renamed from: b */
    public final long f41287b;

    /* renamed from: c */
    public boolean f41288c;

    /* renamed from: d */
    public long f41289d;

    /* renamed from: e */
    public final C9013o4 f41290e;

    public C8977l4(C9013o4 c9013o4, String str, long j10) {
        this.f41290e = c9013o4;
        C9935o.m41846f(str);
        this.f41286a = str;
        this.f41287b = j10;
    }

    /* renamed from: a */
    public final long m38109a() {
        if (!this.f41288c) {
            this.f41288c = true;
            this.f41289d = this.f41290e.m38167p().getLong(this.f41286a, this.f41287b);
        }
        return this.f41289d;
    }

    /* renamed from: b */
    public final void m38110b(long j10) {
        SharedPreferences.Editor edit = this.f41290e.m38167p().edit();
        edit.putLong(this.f41286a, j10);
        edit.apply();
        this.f41289d = j10;
    }
}
