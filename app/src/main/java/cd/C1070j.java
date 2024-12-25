package cd;

import p081ed.AbstractC4716d;
import za.C10146j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cd/j.class
 */
/* renamed from: cd.j */
/* loaded from: combined.jar:classes2.jar:cd/j.class */
public class C1070j implements InterfaceC1074n {

    /* renamed from: a */
    public final C1075o f7101a;

    /* renamed from: b */
    public final C10146j<AbstractC1072l> f7102b;

    public C1070j(C1075o c1075o, C10146j<AbstractC1072l> c10146j) {
        this.f7101a = c1075o;
        this.f7102b = c10146j;
    }

    @Override // cd.InterfaceC1074n
    /* renamed from: a */
    public boolean mo6308a(Exception exc) {
        this.f7102b.m42581d(exc);
        return true;
    }

    @Override // cd.InterfaceC1074n
    /* renamed from: b */
    public boolean mo6309b(AbstractC4716d abstractC4716d) {
        if (!abstractC4716d.m23722k() || this.f7101a.m6321f(abstractC4716d)) {
            return false;
        }
        this.f7102b.m42580c(AbstractC1072l.m6310a().mo6272b(abstractC4716d.mo23691b()).mo6274d(abstractC4716d.mo23692c()).mo6273c(abstractC4716d.mo23697h()).mo6271a());
        return true;
    }
}
