package ke;

import p444zd.C10193a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ke/i.class
 */
/* renamed from: ke.i */
/* loaded from: combined.jar:classes2.jar:ke/i.class */
public abstract class AbstractC5579i extends AbstractC5578h {
    public AbstractC5579i(C10193a c10193a) {
        super(c10193a);
    }

    /* renamed from: h */
    public abstract void mo27599h(StringBuilder sb2, int i10);

    /* renamed from: i */
    public abstract int mo27600i(int i10);

    /* renamed from: j */
    public final void m27606j(StringBuilder sb2, int i10, int i11) {
        int m27639f = m27608b().m27639f(i10, i11);
        mo27599h(sb2, m27639f);
        int mo27600i = mo27600i(m27639f);
        int i12 = 100000;
        for (int i13 = 0; i13 < 5; i13++) {
            if (mo27600i / i12 == 0) {
                sb2.append('0');
            }
            i12 /= 10;
        }
        sb2.append(mo27600i);
    }
}
