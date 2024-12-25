package p132he;

import java.util.Arrays;
import java.util.Map;
import p444zd.C10193a;
import td.AbstractC8698m;
import td.C8689d;
import td.C8691f;
import td.C8695j;
import td.C8699n;
import td.C8701p;
import td.EnumC8686a;
import td.EnumC8690e;
import td.EnumC8700o;
import td.InterfaceC8702q;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:he/p.class
 */
/* renamed from: he.p */
/* loaded from: combined.jar:classes2.jar:he/p.class */
public abstract class AbstractC5074p extends AbstractC5069k {

    /* renamed from: d */
    public static final int[] f29180d = {1, 1, 1};

    /* renamed from: e */
    public static final int[] f29181e = {1, 1, 1, 1, 1};

    /* renamed from: f */
    public static final int[] f29182f = {1, 1, 1, 1, 1, 1};

    /* renamed from: g */
    public static final int[][] f29183g;

    /* renamed from: h */
    public static final int[][] f29184h;

    /* renamed from: a */
    public final StringBuilder f29185a = new StringBuilder(20);

    /* renamed from: b */
    public final C5073o f29186b = new C5073o();

    /* renamed from: c */
    public final C5065g f29187c = new C5065g();

    /* JADX WARN: Type inference failed for: r0v21, types: [int[], int[][], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int[], int[][], java.lang.Object] */
    static {
        ?? r02 = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f29183g = r02;
        ?? r03 = new int[20];
        f29184h = r03;
        System.arraycopy(r02, 0, r03, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr = f29183g[i10 - 10];
            int[] iArr2 = new int[iArr.length];
            for (int i11 = 0; i11 < iArr.length; i11++) {
                iArr2[i11] = iArr[(iArr.length - i11) - 1];
            }
            f29184h[i10] = iArr2;
        }
    }

    /* renamed from: i */
    public static boolean m25344i(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i10 = length - 1;
        return m25349r(charSequence.subSequence(0, i10)) == Character.digit(charSequence.charAt(i10), 10);
    }

    /* renamed from: j */
    public static int m25345j(C10193a c10193a, int[] iArr, int i10, int[][] iArr2) {
        AbstractC5069k.m25329f(c10193a, i10, iArr);
        int length = iArr2.length;
        float f10 = 0.48f;
        int i11 = -1;
        int i12 = 0;
        while (i12 < length) {
            float m25328e = AbstractC5069k.m25328e(iArr, iArr2[i12], 0.7f);
            float f11 = f10;
            if (m25328e < f10) {
                i11 = i12;
                f11 = m25328e;
            }
            i12++;
            f10 = f11;
        }
        if (i11 >= 0) {
            return i11;
        }
        throw C8695j.m37209a();
    }

    /* renamed from: n */
    public static int[] m25346n(C10193a c10193a, int i10, boolean z10, int[] iArr) {
        return m25347o(c10193a, i10, z10, iArr, new int[iArr.length]);
    }

    /* renamed from: o */
    public static int[] m25347o(C10193a c10193a, int i10, boolean z10, int[] iArr, int[] iArr2) {
        int m42664h = c10193a.m42664h();
        int m42663g = z10 ? c10193a.m42663g(i10) : c10193a.m42662e(i10);
        int length = iArr.length;
        int i11 = m42663g;
        int i12 = 0;
        for (int i13 = m42663g; i13 < m42664h; i13++) {
            if (c10193a.m42660c(i13) != z10) {
                iArr2[i12] = iArr2[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else {
                    if (AbstractC5069k.m25328e(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i11, i13};
                    }
                    i11 += iArr2[0] + iArr2[1];
                    int i14 = i12 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i14);
                    iArr2[i14] = 0;
                    iArr2[i12] = 0;
                    i12--;
                }
                iArr2[i12] = 1;
                z10 = !z10;
            }
        }
        throw C8695j.m37209a();
    }

    /* renamed from: p */
    public static int[] m25348p(C10193a c10193a) {
        int[] iArr = new int[f29180d.length];
        int[] iArr2 = null;
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            int[] iArr3 = f29180d;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = m25347o(c10193a, i10, false, iArr3, iArr);
            int i11 = iArr2[0];
            i10 = iArr2[1];
            int i12 = i11 - (i10 - i11);
            if (i12 >= 0) {
                z10 = c10193a.m42665i(i12, i11, false);
            }
        }
        return iArr2;
    }

    /* renamed from: r */
    public static int m25349r(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            int charAt = charSequence.charAt(i11) - '0';
            if (charAt < 0 || charAt > 9) {
                throw C8691f.m37197a();
            }
            i10 += charAt;
        }
        int i12 = i10 * 3;
        for (int i13 = length - 2; i13 >= 0; i13 -= 2) {
            int charAt2 = charSequence.charAt(i13) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw C8691f.m37197a();
            }
            i12 += charAt2;
        }
        return (1000 - i12) % 10;
    }

    @Override // p132he.AbstractC5069k
    /* renamed from: c */
    public C8699n mo25297c(int i10, C10193a c10193a, Map<EnumC8690e, ?> map) {
        return mo25333m(i10, c10193a, m25348p(c10193a), map);
    }

    /* renamed from: h */
    public boolean mo25350h(String str) {
        return m25344i(str);
    }

    /* renamed from: k */
    public int[] mo25351k(C10193a c10193a, int i10) {
        return m25346n(c10193a, i10, false, f29180d);
    }

    /* renamed from: l */
    public abstract int mo25316l(C10193a c10193a, int[] iArr, StringBuilder sb2);

    /* renamed from: m */
    public C8699n mo25333m(int i10, C10193a c10193a, int[] iArr, Map<EnumC8690e, ?> map) {
        int i11;
        String m25320c;
        boolean z10;
        InterfaceC8702q interfaceC8702q = map == null ? null : (InterfaceC8702q) map.get(EnumC8690e.NEED_RESULT_POINT_CALLBACK);
        if (interfaceC8702q != null) {
            interfaceC8702q.mo37224a(new C8701p((iArr[0] + iArr[1]) / 2.0f, i10));
        }
        StringBuilder sb2 = this.f29185a;
        sb2.setLength(0);
        int mo25316l = mo25316l(c10193a, iArr, sb2);
        if (interfaceC8702q != null) {
            interfaceC8702q.mo37224a(new C8701p(mo25316l, i10));
        }
        int[] mo25351k = mo25351k(c10193a, mo25316l);
        if (interfaceC8702q != null) {
            interfaceC8702q.mo37224a(new C8701p((mo25351k[0] + mo25351k[1]) / 2.0f, i10));
        }
        int i12 = mo25351k[1];
        int i13 = (i12 - mo25351k[0]) + i12;
        if (i13 >= c10193a.m42664h() || !c10193a.m42665i(i12, i13, false)) {
            throw C8695j.m37209a();
        }
        String sb3 = sb2.toString();
        if (sb3.length() < 8) {
            throw C8691f.m37197a();
        }
        if (!mo25350h(sb3)) {
            throw C8689d.m37196a();
        }
        float f10 = (mo25351k[1] + mo25351k[0]) / 2.0f;
        EnumC8686a mo25317q = mo25317q();
        float f11 = i10;
        C8699n c8699n = new C8699n(sb3, null, new C8701p[]{new C8701p((iArr[1] + iArr[0]) / 2.0f, f11), new C8701p(f10, f11)}, mo25317q);
        try {
            C8699n m25343a = this.f29186b.m25343a(i10, c10193a, mo25351k[1]);
            c8699n.m37218h(EnumC8700o.UPC_EAN_EXTENSION, m25343a.m37216f());
            c8699n.m37217g(m25343a.m37214d());
            c8699n.m37211a(m25343a.m37215e());
            i11 = m25343a.m37216f().length();
        } catch (AbstractC8698m e10) {
            i11 = 0;
        }
        int[] iArr2 = map == null ? null : (int[]) map.get(EnumC8690e.ALLOWED_EAN_EXTENSIONS);
        if (iArr2 != null) {
            int length = iArr2.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    z10 = false;
                    break;
                }
                if (i11 == iArr2[i14]) {
                    z10 = true;
                    break;
                }
                i14++;
            }
            if (!z10) {
                throw C8695j.m37209a();
            }
        }
        if ((mo25317q == EnumC8686a.EAN_13 || mo25317q == EnumC8686a.UPC_A) && (m25320c = this.f29187c.m25320c(sb3)) != null) {
            c8699n.m37218h(EnumC8700o.POSSIBLE_COUNTRY, m25320c);
        }
        return c8699n;
    }

    /* renamed from: q */
    public abstract EnumC8686a mo25317q();
}
