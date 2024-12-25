package ma;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ag.class
 */
/* renamed from: ma.ag */
/* loaded from: combined.jar:classes2.jar:ma/ag.class */
public abstract class AbstractC6022ag extends C6189if {

    /* renamed from: b */
    public static final Logger f33661b = Logger.getLogger(AbstractC6022ag.class.getName());

    /* renamed from: c */
    public static final boolean f33662c = C6193ij.m29736C();

    /* renamed from: a */
    public C6043bg f33663a;

    public AbstractC6022ag() {
    }

    public /* synthetic */ AbstractC6022ag(C6541zf c6541zf) {
    }

    /* renamed from: A */
    public static AbstractC6022ag m29400A(byte[] bArr, int i10, int i11) {
        return new C6501xf(bArr, 0, i11);
    }

    @Deprecated
    /* renamed from: u */
    public static int m29402u(int i10, InterfaceC6443uh interfaceC6443uh, InterfaceC6150gi interfaceC6150gi) {
        int mo29568a = ((AbstractC6105ef) interfaceC6443uh).mo29568a(interfaceC6150gi);
        int m29406y = m29406y(i10 << 3);
        return m29406y + m29406y + mo29568a;
    }

    /* renamed from: v */
    public static int m29403v(int i10) {
        if (i10 >= 0) {
            return m29406y(i10);
        }
        return 10;
    }

    /* renamed from: w */
    public static int m29404w(InterfaceC6443uh interfaceC6443uh, InterfaceC6150gi interfaceC6150gi) {
        int mo29568a = ((AbstractC6105ef) interfaceC6443uh).mo29568a(interfaceC6150gi);
        return m29406y(mo29568a) + mo29568a;
    }

    /* renamed from: x */
    public static int m29405x(String str) {
        int length;
        try {
            length = C6277mj.m29857c(str);
        } catch (C6256lj e10) {
            length = str.getBytes(C6482wg.f34131b).length;
        }
        return m29406y(length) + length;
    }

    /* renamed from: y */
    public static int m29406y(int i10) {
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

    /* renamed from: z */
    public static int m29407z(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            i10 = 6;
            j10 >>>= 28;
        } else {
            i10 = 2;
        }
        int i11 = i10;
        long j11 = j10;
        if (((-2097152) & j10) != 0) {
            j11 = j10 >>> 14;
            i11 = i10 + 2;
        }
        int i12 = i11;
        if ((j11 & (-16384)) != 0) {
            i12 = i11 + 1;
        }
        return i12;
    }

    /* renamed from: a */
    public final void m29408a() {
        if (mo29410d() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: b */
    public final void m29409b(String str, C6256lj c6256lj) {
        f33661b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c6256lj);
        byte[] bytes = str.getBytes(C6482wg.f34131b);
        try {
            int length = bytes.length;
            mo29424r(length);
            mo29420n(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new C6521yf(e10);
        }
    }

    /* renamed from: d */
    public abstract int mo29410d();

    /* renamed from: e */
    public abstract void mo29411e(byte b10);

    /* renamed from: f */
    public abstract void mo29412f(int i10, boolean z10);

    /* renamed from: g */
    public abstract void mo29413g(int i10, AbstractC6399sf abstractC6399sf);

    /* renamed from: h */
    public abstract void mo29414h(int i10, int i11);

    /* renamed from: i */
    public abstract void mo29415i(int i10);

    /* renamed from: j */
    public abstract void mo29416j(int i10, long j10);

    /* renamed from: k */
    public abstract void mo29417k(long j10);

    /* renamed from: l */
    public abstract void mo29418l(int i10, int i11);

    /* renamed from: m */
    public abstract void mo29419m(int i10);

    /* renamed from: n */
    public abstract void mo29420n(byte[] bArr, int i10, int i11);

    /* renamed from: o */
    public abstract void mo29421o(int i10, String str);

    /* renamed from: p */
    public abstract void mo29422p(int i10, int i11);

    /* renamed from: q */
    public abstract void mo29423q(int i10, int i11);

    /* renamed from: r */
    public abstract void mo29424r(int i10);

    /* renamed from: s */
    public abstract void mo29425s(int i10, long j10);

    /* renamed from: t */
    public abstract void mo29426t(long j10);
}
