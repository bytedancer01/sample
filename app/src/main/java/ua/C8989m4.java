package ua;

import android.content.SharedPreferences;
import android.util.Pair;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/m4.class
 */
/* renamed from: ua.m4 */
/* loaded from: combined.jar:classes2.jar:ua/m4.class */
public final class C8989m4 {

    /* renamed from: a */
    public final String f41403a;

    /* renamed from: b */
    public final String f41404b;

    /* renamed from: c */
    public final String f41405c;

    /* renamed from: d */
    public final long f41406d;

    /* renamed from: e */
    public final C9013o4 f41407e;

    public /* synthetic */ C8989m4(C9013o4 c9013o4, String str, long j10, C8941i4 c8941i4) {
        this.f41407e = c9013o4;
        C9935o.m41846f("health_monitor");
        C9935o.m41841a(j10 > 0);
        this.f41403a = "health_monitor:start";
        this.f41404b = "health_monitor:count";
        this.f41405c = "health_monitor:value";
        this.f41406d = j10;
    }

    /* renamed from: a */
    public final void m38128a(String str, long j10) {
        this.f41407e.mo37811h();
        if (m38131d() == 0) {
            m38130c();
        }
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        long j11 = this.f41407e.m38167p().getLong(this.f41404b, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor edit = this.f41407e.m38167p().edit();
            edit.putString(this.f41405c, str2);
            edit.putLong(this.f41404b, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.f41407e.f41723a.m37765G().m37850h0().nextLong();
        long j12 = j11 + 1;
        long j13 = Long.MAX_VALUE / j12;
        SharedPreferences.Editor edit2 = this.f41407e.m38167p().edit();
        if ((nextLong & Long.MAX_VALUE) < j13) {
            edit2.putString(this.f41405c, str2);
        }
        edit2.putLong(this.f41404b, j12);
        edit2.apply();
    }

    /* renamed from: b */
    public final Pair<String, Long> m38129b() {
        long abs;
        this.f41407e.mo37811h();
        this.f41407e.mo37811h();
        long m38131d = m38131d();
        if (m38131d == 0) {
            m38130c();
            abs = 0;
        } else {
            abs = Math.abs(m38131d - this.f41407e.f41723a.mo37778a().mo22432a());
        }
        long j10 = this.f41406d;
        if (abs < j10) {
            return null;
        }
        if (abs > j10 + j10) {
            m38130c();
            return null;
        }
        String string = this.f41407e.m38167p().getString(this.f41405c, null);
        long j11 = this.f41407e.m38167p().getLong(this.f41404b, 0L);
        m38130c();
        return (string == null || j11 <= 0) ? C9013o4.f41477C : new Pair<>(string, Long.valueOf(j11));
    }

    /* renamed from: c */
    public final void m38130c() {
        this.f41407e.mo37811h();
        long mo22432a = this.f41407e.f41723a.mo37778a().mo22432a();
        SharedPreferences.Editor edit = this.f41407e.m38167p().edit();
        edit.remove(this.f41404b);
        edit.remove(this.f41405c);
        edit.putLong(this.f41403a, mo22432a);
        edit.apply();
    }

    /* renamed from: d */
    public final long m38131d() {
        return this.f41407e.m38167p().getLong(this.f41403a, 0L);
    }
}
