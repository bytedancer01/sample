package ma;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import org.apache.commons.net.nntp.NNTPReply;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.Pure;
import p216m9.C5938b;
import p216m9.C5947e;
import p304r9.C8015b;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/n7.class
 */
/* renamed from: ma.n7 */
/* loaded from: combined.jar:classes2.jar:ma/n7.class */
public final class C6286n7 {

    /* renamed from: k */
    public static final C8015b f33904k = new C8015b("ApplicationAnalytics");

    /* renamed from: a */
    public final C6176i2 f33905a;

    /* renamed from: b */
    public final C6330p9 f33906b;

    /* renamed from: f */
    public final SharedPreferences f33910f;

    /* renamed from: g */
    public C6308o8 f33911g;

    /* renamed from: h */
    public C5947e f33912h;

    /* renamed from: i */
    public boolean f33913i;

    /* renamed from: j */
    public boolean f33914j;

    /* renamed from: c */
    public final C6220k4 f33907c = new C6220k4(this);

    /* renamed from: e */
    public final Handler f33909e = new HandlerC6385s1(Looper.getMainLooper());

    /* renamed from: d */
    public final Runnable f33908d = new Runnable(this) { // from class: ma.j3

        /* renamed from: b */
        public final C6286n7 f33840b;

        {
            this.f33840b = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C6286n7.m29876g(this.f33840b);
        }
    };

    public C6286n7(SharedPreferences sharedPreferences, C6176i2 c6176i2, Bundle bundle, String str) {
        this.f33910f = sharedPreferences;
        this.f33905a = c6176i2;
        this.f33906b = new C6330p9(bundle, str);
    }

    /* renamed from: g */
    public static /* synthetic */ void m29876g(C6286n7 c6286n7) {
        C6308o8 c6308o8 = c6286n7.f33911g;
        if (c6308o8 != null) {
            c6286n7.f33905a.m29670d(c6286n7.f33906b.m29953a(c6308o8), NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY);
        }
        c6286n7.m29893w();
    }

    /* renamed from: n */
    public static /* bridge */ /* synthetic */ void m29883n(C6286n7 c6286n7, int i10) {
        f33904k.m34873a("log session ended with error = %d", Integer.valueOf(i10));
        c6286n7.m29891u();
        c6286n7.f33905a.m29670d(c6286n7.f33906b.m29957e(c6286n7.f33911g, i10), 228);
        c6286n7.m29890t();
        if (c6286n7.f33914j) {
            return;
        }
        c6286n7.f33911g = null;
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ void m29884o(C6286n7 c6286n7, SharedPreferences sharedPreferences, String str) {
        if (c6286n7.m29896z(str)) {
            f33904k.m34873a("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            C9935o.m41850j(c6286n7.f33911g);
            return;
        }
        c6286n7.f33911g = C6308o8.m29925b(sharedPreferences);
        if (c6286n7.m29896z(str)) {
            f33904k.m34873a("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
            C9935o.m41850j(c6286n7.f33911g);
            C6308o8.f33926l = c6286n7.f33911g.f33929c + 1;
            return;
        }
        f33904k.m34873a("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
        C6308o8 m29924a = C6308o8.m29924a(c6286n7.f33913i);
        c6286n7.f33911g = m29924a;
        C6308o8 c6308o8 = (C6308o8) C9935o.m41850j(m29924a);
        C5947e c5947e = c6286n7.f33912h;
        boolean z10 = false;
        if (c5947e != null) {
            z10 = false;
            if (c5947e.m29279C()) {
                z10 = true;
            }
        }
        c6308o8.f33935i = z10;
        ((C6308o8) C9935o.m41850j(c6286n7.f33911g)).f33927a = m29888s();
        ((C6308o8) C9935o.m41850j(c6286n7.f33911g)).f33931e = str;
    }

    /* renamed from: r */
    public static /* bridge */ /* synthetic */ void m29887r(C6286n7 c6286n7, boolean z10) {
        f33904k.m34873a("update app visibility to %s", true != z10 ? "foreground" : "background");
        c6286n7.f33913i = z10;
        C6308o8 c6308o8 = c6286n7.f33911g;
        if (c6308o8 != null) {
            c6308o8.f33934h = z10;
        }
    }

    @Pure
    /* renamed from: s */
    public static String m29888s() {
        return ((C5938b) C9935o.m41850j(C5938b.m29234d())).m29241a().m29254S();
    }

    /* renamed from: c */
    public final C6220k4 m29889c() {
        return this.f33907c;
    }

    /* renamed from: t */
    public final void m29890t() {
        this.f33909e.removeCallbacks(this.f33908d);
    }

    @EnsuresNonNull({"analyticsSession"})
    /* renamed from: u */
    public final void m29891u() {
        if (!m29895y()) {
            f33904k.m34878f("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]);
            m29892v();
            return;
        }
        C5947e c5947e = this.f33912h;
        CastDevice m29289q = c5947e != null ? c5947e.m29289q() : null;
        if (m29289q != null && !TextUtils.equals(this.f33911g.f33928b, m29289q.m13049a0())) {
            m29894x(m29289q);
        }
        C9935o.m41850j(this.f33911g);
    }

    @EnsuresNonNull({"analyticsSession"})
    /* renamed from: v */
    public final void m29892v() {
        int i10 = 0;
        f33904k.m34873a("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        C6308o8 m29924a = C6308o8.m29924a(this.f33913i);
        this.f33911g = m29924a;
        C6308o8 c6308o8 = (C6308o8) C9935o.m41850j(m29924a);
        C5947e c5947e = this.f33912h;
        c6308o8.f33935i = c5947e != null && c5947e.m29279C();
        ((C6308o8) C9935o.m41850j(this.f33911g)).f33927a = m29888s();
        C5947e c5947e2 = this.f33912h;
        CastDevice m29289q = c5947e2 == null ? null : c5947e2.m29289q();
        if (m29289q != null) {
            m29894x(m29289q);
        }
        C6308o8 c6308o82 = (C6308o8) C9935o.m41850j(this.f33911g);
        C5947e c5947e3 = this.f33912h;
        if (c5947e3 != null) {
            i10 = c5947e3.m29354n();
        }
        c6308o82.f33936j = i10;
        C9935o.m41850j(this.f33911g);
    }

    /* renamed from: w */
    public final void m29893w() {
        ((Handler) C9935o.m41850j(this.f33909e)).postDelayed((Runnable) C9935o.m41850j(this.f33908d), 300000L);
    }

    /* renamed from: x */
    public final void m29894x(CastDevice castDevice) {
        C6308o8 c6308o8 = this.f33911g;
        if (c6308o8 == null) {
            return;
        }
        c6308o8.f33928b = castDevice.m13049a0();
        c6308o8.f33932f = castDevice.m13047Y();
        c6308o8.f33933g = castDevice.m13043U();
    }

    @EnsuresNonNullIf(expression = {"analyticsSession"}, result = true)
    /* renamed from: y */
    public final boolean m29895y() {
        String str;
        if (this.f33911g == null) {
            f33904k.m34873a("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        String m29888s = m29888s();
        if (m29888s == null || (str = this.f33911g.f33927a) == null || !TextUtils.equals(str, m29888s)) {
            f33904k.m34873a("The analytics session doesn't match the application ID %s", m29888s);
            return false;
        }
        C9935o.m41850j(this.f33911g);
        return true;
    }

    /* renamed from: z */
    public final boolean m29896z(String str) {
        String str2;
        if (!m29895y()) {
            return false;
        }
        C9935o.m41850j(this.f33911g);
        if (str != null && (str2 = this.f33911g.f33931e) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        f33904k.m34873a("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
