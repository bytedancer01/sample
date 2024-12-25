package p304r9;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/j0.class
 */
/* renamed from: r9.j0 */
/* loaded from: combined.jar:classes2.jar:r9/j0.class */
public class C8032j0 {

    /* renamed from: a */
    public final C8015b f38820a;

    /* renamed from: b */
    public final String f38821b;

    /* renamed from: c */
    public InterfaceC8051t f38822c;

    public C8032j0(String str, String str2, String str3) {
        C8013a.m34865f(str);
        this.f38821b = str;
        this.f38820a = new C8015b("MediaControlChannel", null);
    }

    /* renamed from: a */
    public final long m34903a() {
        InterfaceC8051t interfaceC8051t = this.f38822c;
        if (interfaceC8051t != null) {
            return interfaceC8051t.zza();
        }
        this.f38820a.m34875c("Attempt to generate requestId without a sink", new Object[0]);
        return 0L;
    }

    /* renamed from: b */
    public final String m34904b() {
        return this.f38821b;
    }

    /* renamed from: c */
    public void mo34905c() {
        throw null;
    }

    /* renamed from: d */
    public final void m34906d(String str, long j10, String str2) {
        InterfaceC8051t interfaceC8051t = this.f38822c;
        if (interfaceC8051t == null) {
            this.f38820a.m34875c("Attempt to send text message without a sink", new Object[0]);
        } else {
            interfaceC8051t.mo30910a(this.f38821b, str, j10, null);
        }
    }

    /* renamed from: e */
    public final void m34907e(InterfaceC8051t interfaceC8051t) {
        this.f38822c = interfaceC8051t;
        if (interfaceC8051t == null) {
            mo34905c();
        }
    }
}
