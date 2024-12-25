package p289qe;

import be.C0892a;
import be.C0894c;
import be.C0895d;
import java.util.Map;
import p444zd.C10194b;
import p444zd.C10197e;
import td.C8689d;
import td.C8691f;
import td.EnumC8690e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qe/e.class
 */
/* renamed from: qe.e */
/* loaded from: combined.jar:classes2.jar:qe/e.class */
public final class C7914e {

    /* renamed from: a */
    public final C0894c f38050a = new C0894c(C0892a.f6014l);

    /* renamed from: a */
    public final void m34278a(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f38050a.m5548a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (C0895d e10) {
            throw C8689d.m37196a();
        }
    }

    /* renamed from: b */
    public final C10197e m34279b(C7910a c7910a, Map<EnumC8690e, ?> map) {
        C7919j m34264e = c7910a.m34264e();
        EnumC7915f m34285d = c7910a.m34263d().m34285d();
        C7911b[] m34267b = C7911b.m34267b(c7910a.m34262c(), m34264e, m34285d);
        int i10 = 0;
        for (C7911b c7911b : m34267b) {
            i10 += c7911b.m34269c();
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (C7911b c7911b2 : m34267b) {
            byte[] m34268a = c7911b2.m34268a();
            int m34269c = c7911b2.m34269c();
            m34278a(m34268a, m34269c);
            int i12 = 0;
            while (i12 < m34269c) {
                bArr[i11] = m34268a[i12];
                i12++;
                i11++;
            }
        }
        return C7913d.m34270a(bArr, m34264e, m34285d, map);
    }

    /* renamed from: c */
    public C10197e m34280c(C10194b c10194b, Map<EnumC8690e, ?> map) {
        C8689d e10;
        C7910a c7910a = new C7910a(c10194b);
        C8691f e11 = null;
        try {
            return m34279b(c7910a, map);
        } catch (C8689d e12) {
            e10 = e12;
            try {
                c7910a.m34265f();
                c7910a.m34266g(true);
                c7910a.m34264e();
                c7910a.m34263d();
                c7910a.m34261b();
                C10197e m34279b = m34279b(c7910a, map);
                m34279b.m42700m(new C7918i(true));
                return m34279b;
            } catch (C8689d | C8691f e13) {
                if (e11 != null) {
                    throw e11;
                }
                throw e10;
            }
        } catch (C8691f e14) {
            e11 = e14;
            e10 = null;
            c7910a.m34265f();
            c7910a.m34266g(true);
            c7910a.m34264e();
            c7910a.m34263d();
            c7910a.m34261b();
            C10197e m34279b2 = m34279b(c7910a, map);
            m34279b2.m42700m(new C7918i(true));
            return m34279b2;
        }
    }
}
