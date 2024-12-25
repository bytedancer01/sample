package p305ra;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/t5.class
 */
/* renamed from: ra.t5 */
/* loaded from: combined.jar:classes2.jar:ra/t5.class */
public abstract class AbstractC8350t5 extends C8439z4 {

    /* renamed from: b */
    public static final Logger f39280b = Logger.getLogger(AbstractC8350t5.class.getName());

    /* renamed from: c */
    public static final boolean f39281c = C8099c9.m35126l();

    /* renamed from: a */
    public C8365u5 f39282a;

    public AbstractC8350t5() {
    }

    public /* synthetic */ AbstractC8350t5(C8290p5 c8290p5) {
    }

    /* renamed from: A */
    public static int m35812A(int i10) {
        return m35814C(i10 << 3);
    }

    /* renamed from: B */
    public static int m35813B(int i10) {
        if (i10 >= 0) {
            return m35814C(i10);
        }
        return 10;
    }

    /* renamed from: C */
    public static int m35814C(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: D */
    public static int m35815D(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        int i11 = i10;
        long j11 = j10;
        if (((-2097152) & j10) != 0) {
            i11 = i10 + 2;
            j11 = j10 >>> 14;
        }
        int i12 = i11;
        if ((j11 & (-16384)) != 0) {
            i12 = i11 + 1;
        }
        return i12;
    }

    /* renamed from: E */
    public static int m35816E(String str) {
        int length;
        try {
            length = C8189i9.m35457c(str);
        } catch (C8159g9 e10) {
            length = str.getBytes(C8366u6.f39298a).length;
        }
        return m35814C(length) + length;
    }

    /* renamed from: F */
    public static int m35817F(C8426y6 c8426y6) {
        int m36229a = c8426y6.m36229a();
        return m35814C(m36229a) + m36229a;
    }

    /* renamed from: a */
    public static int m35818a(AbstractC8230l5 abstractC8230l5) {
        int mo35264d = abstractC8230l5.mo35264d();
        return m35814C(mo35264d) + mo35264d;
    }

    /* renamed from: b */
    public static int m35819b(InterfaceC8307q7 interfaceC8307q7, InterfaceC8098c8 interfaceC8098c8) {
        AbstractC8349t4 abstractC8349t4 = (AbstractC8349t4) interfaceC8307q7;
        int mo35587h = abstractC8349t4.mo35587h();
        int i10 = mo35587h;
        if (mo35587h == -1) {
            i10 = interfaceC8098c8.mo35096a(abstractC8349t4);
            abstractC8349t4.mo35588i(i10);
        }
        return m35814C(i10) + i10;
    }

    /* renamed from: c */
    public static int m35820c(int i10) {
        return (i10 >> 31) ^ (i10 + i10);
    }

    /* renamed from: d */
    public static long m35821d(long j10) {
        return (j10 >> 63) ^ (j10 + j10);
    }

    @Deprecated
    /* renamed from: g */
    public static int m35822g(int i10, InterfaceC8307q7 interfaceC8307q7, InterfaceC8098c8 interfaceC8098c8) {
        int m35814C = m35814C(i10 << 3);
        AbstractC8349t4 abstractC8349t4 = (AbstractC8349t4) interfaceC8307q7;
        int mo35587h = abstractC8349t4.mo35587h();
        int i11 = mo35587h;
        if (mo35587h == -1) {
            i11 = interfaceC8098c8.mo35096a(abstractC8349t4);
            abstractC8349t4.mo35588i(i11);
        }
        return m35814C + m35814C + i11;
    }

    /* renamed from: z */
    public static AbstractC8350t5 m35824z(byte[] bArr) {
        return new C8305q5(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public final void m35825e() {
        if (mo35731y() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: f */
    public final void m35826f(String str, C8159g9 c8159g9) {
        f39280b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c8159g9);
        byte[] bytes = str.getBytes(C8366u6.f39298a);
        try {
            int length = bytes.length;
            mo35726t(length);
            mo35730x(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new C8320r5(e10);
        } catch (C8320r5 e11) {
            throw e11;
        }
    }

    /* renamed from: i */
    public abstract void mo35715i(int i10, int i11);

    /* renamed from: j */
    public abstract void mo35716j(int i10, int i11);

    /* renamed from: k */
    public abstract void mo35717k(int i10, int i11);

    /* renamed from: l */
    public abstract void mo35718l(int i10, int i11);

    /* renamed from: m */
    public abstract void mo35719m(int i10, long j10);

    /* renamed from: n */
    public abstract void mo35720n(int i10, long j10);

    /* renamed from: o */
    public abstract void mo35721o(int i10, boolean z10);

    /* renamed from: p */
    public abstract void mo35722p(int i10, String str);

    /* renamed from: q */
    public abstract void mo35723q(int i10, AbstractC8230l5 abstractC8230l5);

    /* renamed from: r */
    public abstract void mo35724r(byte b10);

    /* renamed from: s */
    public abstract void mo35725s(int i10);

    /* renamed from: t */
    public abstract void mo35726t(int i10);

    /* renamed from: u */
    public abstract void mo35727u(int i10);

    /* renamed from: v */
    public abstract void mo35728v(long j10);

    /* renamed from: w */
    public abstract void mo35729w(long j10);

    /* renamed from: x */
    public abstract void mo35730x(byte[] bArr, int i10, int i11);

    /* renamed from: y */
    public abstract int mo35731y();
}
