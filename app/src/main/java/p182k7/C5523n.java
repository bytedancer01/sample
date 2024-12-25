package p182k7;

import p057d7.InterfaceC4324g;
import p059d9.C4361f0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:k7/n.class
 */
/* renamed from: k7.n */
/* loaded from: combined.jar:classes2.jar:k7/n.class */
public final class C5523n {

    /* renamed from: a */
    public static final int[] f31524a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    public static boolean m27487a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f31524a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m27488b(InterfaceC4324g interfaceC4324g) {
        return m27489c(interfaceC4324g, true, false);
    }

    /* renamed from: c */
    public static boolean m27489c(InterfaceC4324g interfaceC4324g, boolean z10, boolean z11) {
        boolean z12;
        long j10;
        boolean z13;
        long length = interfaceC4324g.getLength();
        long j11 = 4096;
        if (length != -1) {
            j11 = length > 4096 ? 4096L : length;
        }
        int i10 = (int) j11;
        C4361f0 c4361f0 = new C4361f0(64);
        int i11 = 0;
        boolean z14 = false;
        while (i11 < i10) {
            c4361f0.m21979L(8);
            if (!interfaceC4324g.mo21800d(c4361f0.m21988d(), 0, 8, true)) {
                break;
            }
            long m21973F = c4361f0.m21973F();
            int m21998n = c4361f0.m21998n();
            int i12 = 16;
            if (m21973F == 1) {
                interfaceC4324g.mo21811q(c4361f0.m21988d(), 8, 8);
                c4361f0.m21982O(16);
                j10 = c4361f0.m22007w();
            } else {
                j10 = m21973F;
                if (m21973F == 0) {
                    long length2 = interfaceC4324g.getLength();
                    j10 = m21973F;
                    if (length2 != -1) {
                        j10 = (length2 - interfaceC4324g.mo21804i()) + 8;
                    }
                }
                i12 = 8;
            }
            long j12 = i12;
            if (j10 < j12) {
                return false;
            }
            int i13 = i11 + i12;
            if (m21998n == 1836019574) {
                int i14 = i10 + ((int) j10);
                int i15 = i14;
                if (length != -1) {
                    i15 = i14;
                    if (i14 > length) {
                        i15 = (int) length;
                    }
                }
                i10 = i15;
                i11 = i13;
            } else {
                if (m21998n == 1836019558 || m21998n == 1836475768) {
                    z12 = true;
                    break;
                }
                if ((i13 + j10) - j12 >= i10) {
                    break;
                }
                int i16 = (int) (j10 - j12);
                int i17 = i13 + i16;
                if (m21998n != 1718909296) {
                    z13 = z14;
                    if (i16 != 0) {
                        interfaceC4324g.mo21805k(i16);
                        z13 = z14;
                    }
                } else {
                    if (i16 < 8) {
                        return false;
                    }
                    c4361f0.m21979L(i16);
                    interfaceC4324g.mo21811q(c4361f0.m21988d(), 0, i16);
                    int i18 = i16 / 4;
                    int i19 = 0;
                    while (true) {
                        if (i19 >= i18) {
                            break;
                        }
                        if (i19 == 1) {
                            c4361f0.m21984Q(4);
                        } else if (m27487a(c4361f0.m21998n(), z11)) {
                            z14 = true;
                            break;
                        }
                        i19++;
                    }
                    z13 = z14;
                    if (!z14) {
                        return false;
                    }
                }
                i11 = i17;
                z14 = z13;
            }
        }
        z12 = false;
        return z14 && z10 == z12;
    }

    /* renamed from: d */
    public static boolean m27490d(InterfaceC4324g interfaceC4324g, boolean z10) {
        return m27489c(interfaceC4324g, false, z10);
    }
}
