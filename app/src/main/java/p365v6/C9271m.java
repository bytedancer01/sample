package p365v6;

import android.net.Uri;
import java.util.Map;
import p027b9.C0864v;
import p027b9.InterfaceC0831a0;
import p059d9.C4349a;
import p059d9.C4401z0;
import p168jc.C5354c;
import p267p6.C7561b1;
import p365v6.C9263i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v6/m.class
 */
/* renamed from: v6.m */
/* loaded from: combined.jar:classes2.jar:v6/m.class */
public final class C9271m implements InterfaceC9252c0 {

    /* renamed from: a */
    public final Object f42347a = new Object();

    /* renamed from: b */
    public C7561b1.e f42348b;

    /* renamed from: c */
    public InterfaceC9292z f42349c;

    /* renamed from: d */
    public InterfaceC0831a0.b f42350d;

    /* renamed from: e */
    public String f42351e;

    @Override // p365v6.InterfaceC9252c0
    /* renamed from: a */
    public InterfaceC9292z mo526a(C7561b1 c7561b1) {
        InterfaceC9292z interfaceC9292z;
        C4349a.m21882e(c7561b1.f36449b);
        C7561b1.e eVar = c7561b1.f36449b.f36506c;
        if (eVar == null || C4401z0.f26679a < 18) {
            return InterfaceC9292z.f42396a;
        }
        synchronized (this.f42347a) {
            if (!C4401z0.m22371c(eVar, this.f42348b)) {
                this.f42348b = eVar;
                this.f42349c = m39129b(eVar);
            }
            interfaceC9292z = (InterfaceC9292z) C4349a.m21882e(this.f42349c);
        }
        return interfaceC9292z;
    }

    /* renamed from: b */
    public final InterfaceC9292z m39129b(C7561b1.e eVar) {
        InterfaceC0831a0.b bVar = this.f42350d;
        if (bVar == null) {
            bVar = new C0864v.b().m5428c(this.f42351e);
        }
        Uri uri = eVar.f36490b;
        C9272m0 c9272m0 = new C9272m0(uri == null ? null : uri.toString(), eVar.f36494f, bVar);
        for (Map.Entry<String, String> entry : eVar.f36491c.entrySet()) {
            c9272m0.m39134e(entry.getKey(), entry.getValue());
        }
        C9263i m39098a = new C9263i.b().m39103f(eVar.f36489a, C9270l0.f42343d).m39100c(eVar.f36492d).m39101d(eVar.f36493e).m39102e(C5354c.m26644j(eVar.f36495g)).m39098a(c9272m0);
        m39098a.m39086C(0, eVar.m32376a());
        return m39098a;
    }
}
