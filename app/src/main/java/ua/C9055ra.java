package ua;

import p305ra.C8197j2;
import p305ra.C8225l0;
import p305ra.C8345t0;
import p305ra.C8355ta;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/ra.class
 */
/* renamed from: ua.ra */
/* loaded from: combined.jar:classes2.jar:ua/ra.class */
public final class C9055ra extends AbstractC9043qa {

    /* renamed from: g */
    public final C8345t0 f41604g;

    /* renamed from: h */
    public final C9067sa f41605h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9055ra(C9067sa c9067sa, String str, int i10, C8345t0 c8345t0) {
        super(str, i10);
        this.f41605h = c9067sa;
        this.f41604g = c8345t0;
    }

    @Override // ua.AbstractC9043qa
    /* renamed from: a */
    public final int mo38185a() {
        return this.f41604g.m35791A();
    }

    @Override // ua.AbstractC9043qa
    /* renamed from: b */
    public final boolean mo38186b() {
        return true;
    }

    @Override // ua.AbstractC9043qa
    /* renamed from: c */
    public final boolean mo38187c() {
        return false;
    }

    /* renamed from: k */
    public final boolean m38215k(Long l10, Long l11, C8197j2 c8197j2, boolean z10) {
        C9106w3 m38411r;
        String m38233r;
        String str;
        Boolean m38201f;
        Boolean bool;
        C8355ta.m35833a();
        boolean m37900w = this.f41605h.f41723a.m37797z().m37900w(this.f41582a, C8988m3.f41352a0);
        boolean m35794E = this.f41604g.m35794E();
        boolean m35795F = this.f41604g.m35795F();
        boolean m35797H = this.f41604g.m35797H();
        boolean z11 = m35794E || m35795F || m35797H;
        if (z10 && !z11) {
            C9106w3 m38416w = this.f41605h.f41723a.mo37780c().m38416w();
            int i10 = this.f41583b;
            Integer num = null;
            if (this.f41604g.m35798z()) {
                num = Integer.valueOf(this.f41604g.m35791A());
            }
            m38416w.m38328c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(i10), num);
            return true;
        }
        C8225l0 m35793D = this.f41604g.m35793D();
        boolean m35550F = m35793D.m35550F();
        if (c8197j2.m35503F()) {
            if (m35793D.m35547C()) {
                m38201f = AbstractC9043qa.m38202g(c8197j2.m35504G(), m35793D.m35548D());
                bool = AbstractC9043qa.m38200e(m38201f, m35550F);
            } else {
                m38411r = this.f41605h.f41723a.mo37780c().m38411r();
                m38233r = this.f41605h.f41723a.m37766H().m38233r(c8197j2.m35500C());
                str = "No number filter for long property. property";
                m38411r.m38327b(str, m38233r);
                bool = null;
            }
        } else if (!c8197j2.m35505H()) {
            if (c8197j2.m35501D()) {
                if (m35793D.m35553z()) {
                    m38201f = AbstractC9043qa.m38201f(c8197j2.m35502E(), m35793D.m35546A(), this.f41605h.f41723a.mo37780c());
                } else if (!m35793D.m35547C()) {
                    m38411r = this.f41605h.f41723a.mo37780c().m38411r();
                    m38233r = this.f41605h.f41723a.m37766H().m38233r(c8197j2.m35500C());
                    str = "No string or number filter defined. property";
                } else if (C9145z9.m38442B(c8197j2.m35502E())) {
                    m38201f = AbstractC9043qa.m38204i(c8197j2.m35502E(), m35793D.m35548D());
                } else {
                    this.f41605h.f41723a.mo37780c().m38411r().m38328c("Invalid user property value for Numeric number filter. property, value", this.f41605h.f41723a.m37766H().m38233r(c8197j2.m35500C()), c8197j2.m35502E());
                    bool = null;
                }
                bool = AbstractC9043qa.m38200e(m38201f, m35550F);
            } else {
                m38411r = this.f41605h.f41723a.mo37780c().m38411r();
                m38233r = this.f41605h.f41723a.m37766H().m38233r(c8197j2.m35500C());
                str = "User property has no value, property";
            }
            m38411r.m38327b(str, m38233r);
            bool = null;
        } else if (m35793D.m35547C()) {
            m38201f = AbstractC9043qa.m38203h(c8197j2.m35506I(), m35793D.m35548D());
            bool = AbstractC9043qa.m38200e(m38201f, m35550F);
        } else {
            m38411r = this.f41605h.f41723a.mo37780c().m38411r();
            m38233r = this.f41605h.f41723a.m37766H().m38233r(c8197j2.m35500C());
            str = "No number filter for double property. property";
            m38411r.m38327b(str, m38233r);
            bool = null;
        }
        this.f41605h.f41723a.mo37780c().m38416w().m38327b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.f41584c = Boolean.TRUE;
        if (m35797H && !bool.booleanValue()) {
            return true;
        }
        if (!z10 || this.f41604g.m35794E()) {
            this.f41585d = bool;
        }
        if (!bool.booleanValue() || !z11 || !c8197j2.m35507z()) {
            return true;
        }
        long m35499A = c8197j2.m35499A();
        if (l10 != null) {
            m35499A = l10.longValue();
        }
        long j10 = m35499A;
        if (m37900w) {
            j10 = m35499A;
            if (this.f41604g.m35794E()) {
                j10 = m35499A;
                if (!this.f41604g.m35795F()) {
                    j10 = m35499A;
                    if (l11 != null) {
                        j10 = l11.longValue();
                    }
                }
            }
        }
        if (this.f41604g.m35795F()) {
            this.f41587f = Long.valueOf(j10);
            return true;
        }
        this.f41586e = Long.valueOf(j10);
        return true;
    }
}
