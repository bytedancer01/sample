package cd;

import android.text.TextUtils;
import gd.C4999b;
import gd.InterfaceC4998a;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p081ed.AbstractC4716d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cd/o.class
 */
/* renamed from: cd.o */
/* loaded from: combined.jar:classes2.jar:cd/o.class */
public final class C1075o {

    /* renamed from: b */
    public static final long f7106b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    public static final Pattern f7107c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    public static C1075o f7108d;

    /* renamed from: a */
    public final InterfaceC4998a f7109a;

    public C1075o(InterfaceC4998a interfaceC4998a) {
        this.f7109a = interfaceC4998a;
    }

    /* renamed from: c */
    public static C1075o m6314c() {
        return m6315d(C4999b.m25164b());
    }

    /* renamed from: d */
    public static C1075o m6315d(InterfaceC4998a interfaceC4998a) {
        if (f7108d == null) {
            f7108d = new C1075o(interfaceC4998a);
        }
        return f7108d;
    }

    /* renamed from: g */
    public static boolean m6316g(String str) {
        return f7107c.matcher(str).matches();
    }

    /* renamed from: h */
    public static boolean m6317h(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long m6318a() {
        return this.f7109a.mo25163a();
    }

    /* renamed from: b */
    public long m6319b() {
        return TimeUnit.MILLISECONDS.toSeconds(m6318a());
    }

    /* renamed from: e */
    public long m6320e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean m6321f(AbstractC4716d abstractC4716d) {
        return TextUtils.isEmpty(abstractC4716d.mo23691b()) || abstractC4716d.mo23697h() + abstractC4716d.mo23692c() < m6319b() + f7106b;
    }
}
