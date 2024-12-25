package p057d7;

import p059d9.C4361f0;
import p059d9.C4392v;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d7/b.class
 */
/* renamed from: d7.b */
/* loaded from: combined.jar:classes2.jar:d7/b.class */
public final class C4319b {
    /* renamed from: a */
    public static void m21797a(long j10, C4361f0 c4361f0, InterfaceC4337t[] interfaceC4337tArr) {
        int m21990f;
        while (c4361f0.m21985a() > 1) {
            int m21799c = m21799c(c4361f0);
            int m21799c2 = m21799c(c4361f0);
            int m21989e = c4361f0.m21989e() + m21799c2;
            if (m21799c2 == -1 || m21799c2 > c4361f0.m21985a()) {
                C4392v.m22275i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                m21990f = c4361f0.m21990f();
            } else {
                m21990f = m21989e;
                if (m21799c == 4) {
                    m21990f = m21989e;
                    if (m21799c2 >= 8) {
                        int m21971D = c4361f0.m21971D();
                        int m21977J = c4361f0.m21977J();
                        int m21998n = m21977J == 49 ? c4361f0.m21998n() : 0;
                        int m21971D2 = c4361f0.m21971D();
                        if (m21977J == 47) {
                            c4361f0.m21984Q(1);
                        }
                        boolean z10 = m21971D == 181 && (m21977J == 49 || m21977J == 47) && m21971D2 == 3;
                        boolean z11 = z10;
                        if (m21977J == 49) {
                            z11 = z10 & (m21998n == 1195456820);
                        }
                        m21990f = m21989e;
                        if (z11) {
                            m21798b(j10, c4361f0, interfaceC4337tArr);
                            m21990f = m21989e;
                        }
                    }
                }
            }
            c4361f0.m21983P(m21990f);
        }
    }

    /* renamed from: b */
    public static void m21798b(long j10, C4361f0 c4361f0, InterfaceC4337t[] interfaceC4337tArr) {
        int m21971D = c4361f0.m21971D();
        if ((m21971D & 64) != 0) {
            c4361f0.m21984Q(1);
            int i10 = (m21971D & 31) * 3;
            int m21989e = c4361f0.m21989e();
            for (InterfaceC4337t interfaceC4337t : interfaceC4337tArr) {
                c4361f0.m21983P(m21989e);
                interfaceC4337t.mo606e(c4361f0, i10);
                interfaceC4337t.mo600b(j10, 1, i10, 0, null);
            }
        }
    }

    /* renamed from: c */
    public static int m21799c(C4361f0 c4361f0) {
        int i10 = 0;
        while (c4361f0.m21985a() != 0) {
            int m21971D = c4361f0.m21971D();
            int i11 = i10 + m21971D;
            i10 = i11;
            if (m21971D != 255) {
                return i11;
            }
        }
        return -1;
    }
}
