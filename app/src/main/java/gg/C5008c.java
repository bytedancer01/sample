package gg;

import com.onesignal.InterfaceC4216t2;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:gg/c.class
 */
/* renamed from: gg.c */
/* loaded from: combined.jar:classes2.jar:gg/c.class */
public class C5008c implements InterfaceC5007b {

    /* renamed from: a */
    public final InterfaceC4216t2 f29039a;

    public C5008c(InterfaceC4216t2 interfaceC4216t2) {
        this.f29039a = interfaceC4216t2;
    }

    @Override // gg.InterfaceC5007b
    public String getLanguage() {
        InterfaceC4216t2 interfaceC4216t2 = this.f29039a;
        return interfaceC4216t2.mo20885d(interfaceC4216t2.mo20890i(), "PREFS_OS_LANGUAGE", "en");
    }
}
