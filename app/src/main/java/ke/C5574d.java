package ke;

import p444zd.C10193a;
import td.C8695j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ke/d.class
 */
/* renamed from: ke.d */
/* loaded from: combined.jar:classes2.jar:ke/d.class */
public final class C5574d extends AbstractC5578h {
    public C5574d(C10193a c10193a) {
        super(c10193a);
    }

    @Override // ke.AbstractC5580j
    /* renamed from: d */
    public String mo27601d() {
        if (m27609c().m42664h() < 48) {
            throw C8695j.m37209a();
        }
        StringBuilder sb2 = new StringBuilder();
        m27604f(sb2, 8);
        int m27639f = m27608b().m27639f(48, 2);
        sb2.append("(393");
        sb2.append(m27639f);
        sb2.append(')');
        int m27639f2 = m27608b().m27639f(50, 10);
        if (m27639f2 / 100 == 0) {
            sb2.append('0');
        }
        if (m27639f2 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(m27639f2);
        sb2.append(m27608b().m27636c(60, null).m27622b());
        return sb2.toString();
    }
}
