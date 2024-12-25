package ua;

import android.text.TextUtils;
import android.util.Log;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/y3.class
 */
/* renamed from: ua.y3 */
/* loaded from: combined.jar:classes2.jar:ua/y3.class */
public final class C9128y3 extends AbstractC9119x5 {

    /* renamed from: c */
    public char f41787c;

    /* renamed from: d */
    public long f41788d;

    /* renamed from: e */
    public String f41789e;

    /* renamed from: f */
    public final C9106w3 f41790f;

    /* renamed from: g */
    public final C9106w3 f41791g;

    /* renamed from: h */
    public final C9106w3 f41792h;

    /* renamed from: i */
    public final C9106w3 f41793i;

    /* renamed from: j */
    public final C9106w3 f41794j;

    /* renamed from: k */
    public final C9106w3 f41795k;

    /* renamed from: l */
    public final C9106w3 f41796l;

    /* renamed from: m */
    public final C9106w3 f41797m;

    /* renamed from: n */
    public final C9106w3 f41798n;

    public C9128y3(C8870c5 c8870c5) {
        super(c8870c5);
        this.f41787c = (char) 0;
        this.f41788d = -1L;
        this.f41790f = new C9106w3(this, 6, false, false);
        this.f41791g = new C9106w3(this, 6, true, false);
        this.f41792h = new C9106w3(this, 6, false, true);
        this.f41793i = new C9106w3(this, 5, false, false);
        this.f41794j = new C9106w3(this, 5, true, false);
        this.f41795k = new C9106w3(this, 5, false, true);
        this.f41796l = new C9106w3(this, 4, false, false);
        this.f41797m = new C9106w3(this, 3, false, false);
        this.f41798n = new C9106w3(this, 2, false, false);
    }

    /* renamed from: A */
    public static String m38400A(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        String m38401B = m38401B(z10, obj);
        String m38401B2 = m38401B(z10, obj2);
        String m38401B3 = m38401B(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        String str3 = "";
        if (!TextUtils.isEmpty(str2)) {
            sb2.append(str2);
            str3 = ": ";
        }
        String str4 = str3;
        if (!TextUtils.isEmpty(m38401B)) {
            sb2.append(str3);
            sb2.append(m38401B);
            str4 = ", ";
        }
        if (!TextUtils.isEmpty(m38401B2)) {
            sb2.append(str4);
            sb2.append(m38401B2);
            str4 = ", ";
        }
        if (!TextUtils.isEmpty(m38401B3)) {
            sb2.append(str4);
            sb2.append(m38401B3);
        }
        return sb2.toString();
    }

    /* renamed from: B */
    public static String m38401B(boolean z10, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        Object obj2 = obj;
        if (obj instanceof Integer) {
            obj2 = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj2 instanceof Long) {
            if (!z10) {
                return String.valueOf(obj2);
            }
            Long l10 = (Long) obj2;
            if (Math.abs(l10.longValue()) < 100) {
                return String.valueOf(obj2);
            }
            String str2 = String.valueOf(obj2).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb2 = new StringBuilder(str2.length() + 43 + str2.length());
            sb2.append(str2);
            sb2.append(round);
            sb2.append("...");
            sb2.append(str2);
            sb2.append(round2);
            return sb2.toString();
        }
        if (obj2 instanceof Boolean) {
            return String.valueOf(obj2);
        }
        if (!(obj2 instanceof Throwable)) {
            if (!(obj2 instanceof C9117x3)) {
                return z10 ? "-" : String.valueOf(obj2);
            }
            str = ((C9117x3) obj2).f41743a;
            return str;
        }
        Throwable th2 = (Throwable) obj2;
        StringBuilder sb3 = new StringBuilder(z10 ? th2.getClass().getName() : th2.toString());
        String m38406G = m38406G(C8870c5.class.getCanonicalName());
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m38406G(className).equals(m38406G)) {
                sb3.append(": ");
                sb3.append(stackTraceElement);
                break;
            }
            i10++;
        }
        return sb3.toString();
    }

    /* renamed from: F */
    public static /* synthetic */ long m38405F(C9128y3 c9128y3, long j10) {
        c9128y3.f41788d = 37000L;
        return 37000L;
    }

    /* renamed from: G */
    public static String m38406G(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    /* renamed from: x */
    public static Object m38407x(String str) {
        if (str == null) {
            return null;
        }
        return new C9117x3(str);
    }

    @Override // ua.AbstractC9119x5
    /* renamed from: i */
    public final boolean mo37851i() {
        return false;
    }

    /* renamed from: o */
    public final C9106w3 m38408o() {
        return this.f41790f;
    }

    /* renamed from: p */
    public final C9106w3 m38409p() {
        return this.f41791g;
    }

    /* renamed from: q */
    public final C9106w3 m38410q() {
        return this.f41792h;
    }

    /* renamed from: r */
    public final C9106w3 m38411r() {
        return this.f41793i;
    }

    /* renamed from: s */
    public final C9106w3 m38412s() {
        return this.f41794j;
    }

    /* renamed from: t */
    public final C9106w3 m38413t() {
        return this.f41795k;
    }

    /* renamed from: u */
    public final C9106w3 m38414u() {
        return this.f41796l;
    }

    /* renamed from: v */
    public final C9106w3 m38415v() {
        return this.f41797m;
    }

    /* renamed from: w */
    public final C9106w3 m38416w() {
        return this.f41798n;
    }

    /* renamed from: y */
    public final void m38417y(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(m38418z(), i10)) {
            Log.println(i10, m38418z(), m38400A(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        C9935o.m41850j(str);
        C9140z4 m37763E = this.f41723a.m37763E();
        if (m37763E == null) {
            Log.println(6, m38418z(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!m37763E.m38334k()) {
                Log.println(6, m38418z(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i10 >= 9) {
                i10 = 8;
            }
            m37763E.m38436r(new RunnableC9095v3(this, i10, str, obj, obj2, obj3));
        }
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    /* renamed from: z */
    public final String m38418z() {
        String str;
        synchronized (this) {
            if (this.f41789e == null) {
                this.f41789e = this.f41723a.m37772N() != null ? this.f41723a.m37772N() : this.f41723a.m37797z().m37889l();
            }
            C9935o.m41850j(this.f41789e);
            str = this.f41789e;
        }
        return str;
    }
}
