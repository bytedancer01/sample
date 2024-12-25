package p274pi;

import ci.C1128n;
import java.net.ProtocolException;
import ki.C5634b;
import org.apache.http.protocol.HTTP;
import org.jetbrains.annotations.NotNull;
import p173ji.AbstractC5408e0;
import p173ji.AbstractC5412g0;
import p173ji.C5406d0;
import p173ji.C5410f0;
import p173ji.InterfaceC5434y;
import p253oi.C6979c;
import p372vh.C9367f;
import p411xi.C9772p;
import p411xi.InterfaceC9762f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pi/b.class
 */
/* renamed from: pi.b */
/* loaded from: combined.jar:classes2.jar:pi/b.class */
public final class C7725b implements InterfaceC5434y {

    /* renamed from: a */
    public final boolean f37491a;

    public C7725b(boolean z10) {
        this.f37491a = z10;
    }

    @Override // p173ji.InterfaceC5434y
    @NotNull
    public C5410f0 intercept(@NotNull InterfaceC5434y.a aVar) {
        C5410f0.a aVar2;
        boolean z10;
        C5410f0.a m26914B0;
        AbstractC5412g0 m32023p;
        C5410f0.a aVar3;
        boolean z11;
        C9367f.m39526e(aVar, "chain");
        C7730g c7730g = (C7730g) aVar;
        C6979c m33752f = c7730g.m33752f();
        C9367f.m39524c(m33752f);
        C5406d0 m33754h = c7730g.m33754h();
        AbstractC5408e0 m26871a = m33754h.m26871a();
        long currentTimeMillis = System.currentTimeMillis();
        m33752f.m32029v(m33754h);
        if (!C7729f.m33744a(m33754h.m26877g()) || m26871a == null) {
            m33752f.m32022o();
            aVar2 = null;
            z10 = true;
        } else {
            if (C1128n.m6719l(HTTP.EXPECT_CONTINUE, m33754h.m26874d("Expect"), true)) {
                m33752f.m32013f();
                aVar3 = m33752f.m32024q(true);
                m33752f.m32026s();
                z11 = false;
            } else {
                aVar3 = null;
                z11 = true;
            }
            if (aVar3 != null) {
                m33752f.m32022o();
                aVar2 = aVar3;
                z10 = z11;
                if (!m33752f.m32015h().m32103v()) {
                    m33752f.m32021n();
                    aVar2 = aVar3;
                    z10 = z11;
                }
            } else if (m26871a.m26899g()) {
                m33752f.m32013f();
                m26871a.mo22937i(C9772p.m41228b(m33752f.m32010c(m33754h, true)));
                aVar2 = aVar3;
                z10 = z11;
            } else {
                InterfaceC9762f m41228b = C9772p.m41228b(m33752f.m32010c(m33754h, false));
                m26871a.mo22937i(m41228b);
                m41228b.close();
                aVar2 = aVar3;
                z10 = z11;
            }
        }
        if (m26871a == null || !m26871a.m26899g()) {
            m33752f.m32012e();
        }
        C5410f0.a aVar4 = aVar2;
        boolean z12 = z10;
        if (aVar2 == null) {
            C5410f0.a m32024q = m33752f.m32024q(false);
            C9367f.m39524c(m32024q);
            aVar4 = m32024q;
            z12 = z10;
            if (z10) {
                m33752f.m32026s();
                z12 = false;
                aVar4 = m32024q;
            }
        }
        C5410f0 m26934c = aVar4.m26949r(m33754h).m26940i(m33752f.m32015h().m32099r()).m26950s(currentTimeMillis).m26948q(System.currentTimeMillis()).m26934c();
        int m26925q = m26934c.m26925q();
        int i10 = m26925q;
        if (m26925q == 100) {
            C5410f0.a m32024q2 = m33752f.m32024q(false);
            C9367f.m39524c(m32024q2);
            if (z12) {
                m33752f.m32026s();
            }
            m26934c = m32024q2.m26949r(m33754h).m26940i(m33752f.m32015h().m32099r()).m26950s(currentTimeMillis).m26948q(System.currentTimeMillis()).m26934c();
            i10 = m26934c.m26925q();
        }
        m33752f.m32025r(m26934c);
        if (this.f37491a && i10 == 101) {
            m26914B0 = m26934c.m26914B0();
            m32023p = C5634b.f31706c;
        } else {
            m26914B0 = m26934c.m26914B0();
            m32023p = m33752f.m32023p(m26934c);
        }
        C5410f0 m26934c2 = m26914B0.m26933b(m32023p).m26934c();
        if (C1128n.m6719l("close", m26934c2.m26918F0().m26874d("Connection"), true) || C1128n.m6719l("close", C5410f0.m26912B(m26934c2, "Connection", null, 2, null), true)) {
            m33752f.m32021n();
        }
        if (i10 == 204 || i10 == 205) {
            AbstractC5412g0 m26920f = m26934c2.m26920f();
            if ((m26920f != null ? m26920f.mo22897o() : -1L) > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("HTTP ");
                sb2.append(i10);
                sb2.append(" had non-zero Content-Length: ");
                AbstractC5412g0 m26920f2 = m26934c2.m26920f();
                Long l10 = null;
                if (m26920f2 != null) {
                    l10 = Long.valueOf(m26920f2.mo22897o());
                }
                sb2.append(l10);
                throw new ProtocolException(sb2.toString());
            }
        }
        return m26934c2;
    }
}
