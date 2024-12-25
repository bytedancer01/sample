package ke;

import p444zd.C10193a;
import td.C8695j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ke/e.class
 */
/* renamed from: ke.e */
/* loaded from: combined.jar:classes2.jar:ke/e.class */
public final class C5575e extends AbstractC5579i {

    /* renamed from: c */
    public final String f31652c;

    /* renamed from: d */
    public final String f31653d;

    public C5575e(C10193a c10193a, String str, String str2) {
        super(c10193a);
        this.f31652c = str2;
        this.f31653d = str;
    }

    @Override // ke.AbstractC5580j
    /* renamed from: d */
    public String mo27601d() {
        if (m27609c().m42664h() != 84) {
            throw C8695j.m37209a();
        }
        StringBuilder sb2 = new StringBuilder();
        m27604f(sb2, 8);
        m27606j(sb2, 48, 20);
        m27602k(sb2, 68);
        return sb2.toString();
    }

    @Override // ke.AbstractC5579i
    /* renamed from: h */
    public void mo27599h(StringBuilder sb2, int i10) {
        sb2.append('(');
        sb2.append(this.f31653d);
        sb2.append(i10 / 100000);
        sb2.append(')');
    }

    @Override // ke.AbstractC5579i
    /* renamed from: i */
    public int mo27600i(int i10) {
        return i10 % 100000;
    }

    /* renamed from: k */
    public final void m27602k(StringBuilder sb2, int i10) {
        int m27639f = m27608b().m27639f(i10, 16);
        if (m27639f == 38400) {
            return;
        }
        sb2.append('(');
        sb2.append(this.f31652c);
        sb2.append(')');
        int i11 = m27639f % 32;
        int i12 = m27639f / 32;
        int i13 = (i12 % 12) + 1;
        int i14 = i12 / 12;
        if (i14 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i14);
        if (i13 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i13);
        if (i11 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i11);
    }
}
