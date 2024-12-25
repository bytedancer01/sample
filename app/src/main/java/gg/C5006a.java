package gg;

import com.onesignal.InterfaceC4216t2;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:gg/a.class
 */
/* renamed from: gg.a */
/* loaded from: combined.jar:classes2.jar:gg/a.class */
public class C5006a {

    /* renamed from: b */
    public static C5006a f29037b;

    /* renamed from: a */
    public InterfaceC5007b f29038a;

    public C5006a(InterfaceC4216t2 interfaceC4216t2) {
        f29037b = this;
        if (interfaceC4216t2.mo20885d(interfaceC4216t2.mo20890i(), "PREFS_OS_LANGUAGE", null) != null) {
            this.f29038a = new C5008c(interfaceC4216t2);
        } else {
            this.f29038a = new C5009d();
        }
    }

    /* renamed from: a */
    public static C5006a m25201a() {
        return f29037b;
    }

    /* renamed from: b */
    public String m25202b() {
        return this.f29038a.getLanguage();
    }
}
