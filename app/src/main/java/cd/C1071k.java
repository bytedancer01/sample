package cd;

import p081ed.AbstractC4716d;
import za.C10146j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cd/k.class
 */
/* renamed from: cd.k */
/* loaded from: combined.jar:classes2.jar:cd/k.class */
public class C1071k implements InterfaceC1074n {

    /* renamed from: a */
    public final C10146j<String> f7103a;

    public C1071k(C10146j<String> c10146j) {
        this.f7103a = c10146j;
    }

    @Override // cd.InterfaceC1074n
    /* renamed from: a */
    public boolean mo6308a(Exception exc) {
        return false;
    }

    @Override // cd.InterfaceC1074n
    /* renamed from: b */
    public boolean mo6309b(AbstractC4716d abstractC4716d) {
        if (!abstractC4716d.m23723l() && !abstractC4716d.m23722k() && !abstractC4716d.m23720i()) {
            return false;
        }
        this.f7103a.m42582e(abstractC4716d.mo23693d());
        return true;
    }
}
