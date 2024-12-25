package p067di;

import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/f1.class
 */
/* renamed from: di.f1 */
/* loaded from: combined.jar:classes2.jar:di/f1.class */
public class C4475f1 extends C4487j1 implements InterfaceC4515t {

    /* renamed from: c */
    public final boolean f26884c;

    public C4475f1(@Nullable InterfaceC4466c1 interfaceC4466c1) {
        super(true);
        m22694N(interfaceC4466c1);
        this.f26884c = m22658p0();
    }

    @Override // p067di.C4487j1
    /* renamed from: G */
    public boolean mo22656G() {
        return this.f26884c;
    }

    @Override // p067di.C4487j1
    /* renamed from: H */
    public boolean mo22657H() {
        return true;
    }

    /* renamed from: p0 */
    public final boolean m22658p0() {
        C4500o c4500o;
        InterfaceC4497n m22691J = m22691J();
        C4500o c4500o2 = m22691J instanceof C4500o ? (C4500o) m22691J : null;
        C4500o c4500o3 = c4500o2;
        if (c4500o2 == null) {
            return false;
        }
        do {
            C4487j1 m22674u = c4500o3.m22674u();
            if (m22674u.mo22656G()) {
                return true;
            }
            InterfaceC4497n m22691J2 = m22674u.m22691J();
            c4500o = m22691J2 instanceof C4500o ? (C4500o) m22691J2 : null;
            c4500o3 = c4500o;
        } while (c4500o != null);
        return false;
    }
}
