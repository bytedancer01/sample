package je;

import ae.C0156a;
import ie.AbstractC5245a;
import ie.C5246b;
import ie.C5247c;
import ie.C5250f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ke.AbstractC5580j;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.imap.IMAP;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.http.HttpStatus;
import p132he.AbstractC5069k;
import p444zd.C10193a;
import td.C8695j;
import td.C8699n;
import td.C8701p;
import td.EnumC8686a;
import td.EnumC8690e;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:je/d.class
 */
/* renamed from: je.d */
/* loaded from: combined.jar:classes2.jar:je/d.class */
public final class C5368d extends AbstractC5245a {

    /* renamed from: k */
    public static final int[] f30685k = {7, 5, 4, 3, 1};

    /* renamed from: l */
    public static final int[] f30686l = {4, 20, 52, 104, HttpStatus.SC_NO_CONTENT};

    /* renamed from: m */
    public static final int[] f30687m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n */
    public static final int[][] f30688n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o */
    public static final int[][] f30689o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, IMAP.DEFAULT_PORT, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{FTPReply.FILE_STATUS_OK, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 187, 139, HttpStatus.SC_PARTIAL_CONTENT, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, HttpStatus.SC_NO_CONTENT, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, HttpStatus.SC_MULTI_STATUS, NNTPReply.DEBUG_OUTPUT, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p */
    public static final int[][] f30690p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g */
    public final List<C5366b> f30691g = new ArrayList(11);

    /* renamed from: h */
    public final List<C5367c> f30692h = new ArrayList();

    /* renamed from: i */
    public final int[] f30693i = new int[2];

    /* renamed from: j */
    public boolean f30694j;

    /* renamed from: A */
    public static boolean m26676A(C5247c c5247c, boolean z10, boolean z11) {
        return (c5247c.m26176c() == 0 && z10 && z11) ? false : true;
    }

    /* renamed from: B */
    public static boolean m26677B(Iterable<C5366b> iterable, Iterable<C5367c> iterable2) {
        boolean z10;
        boolean z11;
        for (C5367c c5367c : iterable2) {
            Iterator<C5366b> it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                C5366b next = it.next();
                Iterator<C5366b> it2 = c5367c.m26673a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z11 = false;
                        break;
                    }
                    if (next.equals(it2.next())) {
                        z11 = true;
                        break;
                    }
                }
                if (!z11) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public static boolean m26678C(List<C5366b> list) {
        boolean z10;
        for (int[] iArr : f30690p) {
            if (list.size() <= iArr.length) {
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        z10 = true;
                        break;
                    }
                    if (list.get(i10).m26669a().m26176c() != iArr[i10]) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: E */
    public static void m26679E(Collection<C5366b> collection, Collection<C5367c> collection2) {
        boolean z10;
        Iterator<C5367c> it = collection2.iterator();
        while (it.hasNext()) {
            C5367c next = it.next();
            if (next.m26673a().size() != collection.size()) {
                Iterator<C5366b> it2 = next.m26673a().iterator();
                while (true) {
                    z10 = true;
                    if (!it2.hasNext()) {
                        break;
                    } else if (!collection.contains(it2.next())) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: G */
    public static void m26680G(int[] iArr) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length / 2; i10++) {
            int i11 = iArr[i10];
            int i12 = (length - i10) - 1;
            iArr[i10] = iArr[i12];
            iArr[i12] = i11;
        }
    }

    /* renamed from: v */
    public static C8699n m26681v(List<C5366b> list) {
        String mo27601d = AbstractC5580j.m27607a(C5365a.m26668a(list)).mo27601d();
        C8701p[] m26174a = list.get(0).m26669a().m26174a();
        C8701p[] m26174a2 = list.get(list.size() - 1).m26669a().m26174a();
        return new C8699n(mo27601d, null, new C8701p[]{m26174a[0], m26174a[1], m26174a2[0], m26174a2[1]}, EnumC8686a.RSS_EXPANDED);
    }

    /* renamed from: z */
    public static int m26682z(C10193a c10193a, int i10) {
        return c10193a.m42660c(i10) ? c10193a.m42662e(c10193a.m42663g(i10)) : c10193a.m42663g(c10193a.m42662e(i10));
    }

    /* renamed from: D */
    public final C5247c m26683D(C10193a c10193a, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        if (z10) {
            int i14 = this.f30693i[0] - 1;
            while (i14 >= 0 && !c10193a.m42660c(i14)) {
                i14--;
            }
            i11 = i14 + 1;
            int[] iArr = this.f30693i;
            i13 = iArr[0] - i11;
            i12 = iArr[1];
        } else {
            int[] iArr2 = this.f30693i;
            i11 = iArr2[0];
            int m42663g = c10193a.m42663g(iArr2[1] + 1);
            i12 = m42663g;
            i13 = m42663g - this.f30693i[1];
        }
        int[] m26167j = m26167j();
        System.arraycopy(m26167j, 0, m26167j, 1, m26167j.length - 1);
        m26167j[0] = i13;
        try {
            return new C5247c(AbstractC5245a.m26165q(m26167j, f30688n), new int[]{i11, i12}, i11, i12, i10);
        } catch (C8695j e10) {
            return null;
        }
    }

    /* renamed from: F */
    public C5366b m26684F(C10193a c10193a, List<C5366b> list, int i10) {
        C5247c m26683D;
        boolean z10;
        C5246b c5246b;
        boolean z11 = list.size() % 2 == 0;
        boolean z12 = z11;
        if (this.f30694j) {
            z12 = !z11;
        }
        int i11 = -1;
        boolean z13 = true;
        do {
            m26692y(c10193a, list, i11);
            m26683D = m26683D(c10193a, i10, z12);
            if (m26683D == null) {
                i11 = m26682z(c10193a, this.f30693i[0]);
                z10 = z13;
            } else {
                z10 = false;
            }
            z13 = z10;
        } while (z10);
        C5246b m26690w = m26690w(c10193a, m26683D, z12, true);
        if (!list.isEmpty() && list.get(list.size() - 1).m26672d()) {
            throw C8695j.m37209a();
        }
        try {
            c5246b = m26690w(c10193a, m26683D, z12, false);
        } catch (C8695j e10) {
            c5246b = null;
        }
        return new C5366b(m26690w, c5246b, m26683D);
    }

    /* renamed from: H */
    public final void m26685H(int i10) {
        boolean z10;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            if (i11 >= this.f30692h.size()) {
                z10 = false;
                break;
            }
            C5367c c5367c = this.f30692h.get(i11);
            if (c5367c.m26674b() > i10) {
                z10 = c5367c.m26675c(this.f30691g);
                break;
            } else {
                z11 = c5367c.m26675c(this.f30691g);
                i11++;
            }
        }
        if (z10 || z11 || m26677B(this.f30691g, this.f30692h)) {
            return;
        }
        this.f30692h.add(i11, new C5367c(this.f30691g, i10, false));
        m26679E(this.f30691g, this.f30692h);
    }

    @Override // p132he.AbstractC5069k
    /* renamed from: c */
    public C8699n mo25297c(int i10, C10193a c10193a, Map<EnumC8690e, ?> map) {
        this.f30691g.clear();
        this.f30694j = false;
        try {
            return m26681v(m26691x(i10, c10193a));
        } catch (C8695j e10) {
            this.f30691g.clear();
            this.f30694j = true;
            return m26681v(m26691x(i10, c10193a));
        }
    }

    /* renamed from: r */
    public final void m26686r(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int m678d = C0156a.m678d(m26170m());
        int m678d2 = C0156a.m678d(m26168k());
        boolean z15 = false;
        if (m678d > 13) {
            z10 = false;
            z11 = true;
        } else {
            z10 = m678d < 4;
            z11 = false;
        }
        if (m678d2 > 13) {
            z12 = false;
            z13 = true;
        } else {
            z12 = m678d2 < 4;
            z13 = false;
        }
        int i11 = (m678d + m678d2) - i10;
        boolean z16 = (m678d & 1) == 1;
        if ((m678d2 & 1) == 0) {
            z15 = true;
        }
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw C8695j.m37209a();
                }
                if (z16) {
                    if (z15) {
                        throw C8695j.m37209a();
                    }
                    z14 = z10;
                    z11 = true;
                } else {
                    if (!z15) {
                        throw C8695j.m37209a();
                    }
                    z14 = z10;
                    z13 = true;
                }
            } else if (z16) {
                if (!z15) {
                    throw C8695j.m37209a();
                }
                if (m678d < m678d2) {
                    z14 = true;
                    z13 = true;
                } else {
                    z12 = true;
                    z14 = z10;
                    z11 = true;
                }
            } else {
                if (z15) {
                    throw C8695j.m37209a();
                }
                z14 = z10;
            }
        } else if (z16) {
            if (z15) {
                throw C8695j.m37209a();
            }
            z14 = true;
        } else {
            if (!z15) {
                throw C8695j.m37209a();
            }
            z14 = z10;
            z12 = true;
        }
        if (z14) {
            if (z11) {
                throw C8695j.m37209a();
            }
            AbstractC5245a.m26163o(m26170m(), m26171n());
        }
        if (z11) {
            AbstractC5245a.m26162h(m26170m(), m26171n());
        }
        if (z12) {
            if (z13) {
                throw C8695j.m37209a();
            }
            AbstractC5245a.m26163o(m26168k(), m26171n());
        }
        if (z13) {
            AbstractC5245a.m26162h(m26168k(), m26169l());
        }
    }

    @Override // p132he.AbstractC5069k, td.InterfaceC8697l
    public void reset() {
        this.f30691g.clear();
        this.f30692h.clear();
    }

    /* renamed from: s */
    public final boolean m26687s() {
        C5366b c5366b = this.f30691g.get(0);
        C5246b m26670b = c5366b.m26670b();
        C5246b m26671c = c5366b.m26671c();
        if (m26671c == null) {
            return false;
        }
        int m26172a = m26671c.m26172a();
        int i10 = 2;
        for (int i11 = 1; i11 < this.f30691g.size(); i11++) {
            C5366b c5366b2 = this.f30691g.get(i11);
            int m26172a2 = m26172a + c5366b2.m26670b().m26172a();
            int i12 = i10 + 1;
            C5246b m26671c2 = c5366b2.m26671c();
            m26172a = m26172a2;
            i10 = i12;
            if (m26671c2 != null) {
                m26172a = m26172a2 + m26671c2.m26172a();
                i10 = i12 + 1;
            }
        }
        return ((i10 - 4) * 211) + (m26172a % 211) == m26670b.m26173b();
    }

    /* renamed from: t */
    public final List<C5366b> m26688t(List<C5367c> list, int i10) {
        while (i10 < this.f30692h.size()) {
            C5367c c5367c = this.f30692h.get(i10);
            this.f30691g.clear();
            Iterator<C5367c> it = list.iterator();
            while (it.hasNext()) {
                this.f30691g.addAll(it.next().m26673a());
            }
            this.f30691g.addAll(c5367c.m26673a());
            if (m26678C(this.f30691g)) {
                if (m26687s()) {
                    return this.f30691g;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(c5367c);
                try {
                    return m26688t(arrayList, i10 + 1);
                } catch (C8695j e10) {
                }
            }
            i10++;
        }
        throw C8695j.m37209a();
    }

    /* renamed from: u */
    public final List<C5366b> m26689u(boolean z10) {
        List<C5366b> list = null;
        if (this.f30692h.size() > 25) {
            this.f30692h.clear();
            return null;
        }
        this.f30691g.clear();
        if (z10) {
            Collections.reverse(this.f30692h);
        }
        try {
            list = m26688t(new ArrayList(), 0);
        } catch (C8695j e10) {
        }
        if (z10) {
            Collections.reverse(this.f30692h);
        }
        return list;
    }

    /* renamed from: w */
    public C5246b m26690w(C10193a c10193a, C5247c c5247c, boolean z10, boolean z11) {
        int i10;
        int i11;
        int[] m26166i = m26166i();
        Arrays.fill(m26166i, 0);
        int[] m26175b = c5247c.m26175b();
        if (z11) {
            AbstractC5069k.m25330g(c10193a, m26175b[0], m26166i);
        } else {
            AbstractC5069k.m25329f(c10193a, m26175b[1], m26166i);
            int i12 = 0;
            for (int length = m26166i.length - 1; i12 < length; length--) {
                int i13 = m26166i[i12];
                m26166i[i12] = m26166i[length];
                m26166i[length] = i13;
                i12++;
            }
        }
        float m678d = C0156a.m678d(m26166i) / 17.0f;
        float f10 = (c5247c.m26175b()[1] - c5247c.m26175b()[0]) / 15.0f;
        if (Math.abs(m678d - f10) / f10 > 0.3f) {
            throw C8695j.m37209a();
        }
        int[] m26170m = m26170m();
        int[] m26168k = m26168k();
        float[] m26171n = m26171n();
        float[] m26169l = m26169l();
        for (int i14 = 0; i14 < m26166i.length; i14++) {
            float f11 = (m26166i[i14] * 1.0f) / m678d;
            int i15 = (int) (0.5f + f11);
            if (i15 > 0) {
                i11 = i15;
                if (i15 > 8) {
                    if (f11 > 8.7f) {
                        throw C8695j.m37209a();
                    }
                    i11 = 8;
                }
            } else {
                if (f11 < 0.3f) {
                    throw C8695j.m37209a();
                }
                i11 = 1;
            }
            int i16 = i14 / 2;
            if ((i14 & 1) == 0) {
                m26170m[i16] = i11;
                m26171n[i16] = f11 - i11;
            } else {
                m26168k[i16] = i11;
                m26169l[i16] = f11 - i11;
            }
        }
        m26686r(17);
        int m26176c = (((c5247c.m26176c() * 4) + (z10 ? 0 : 2)) + (!z11 ? 1 : 0)) - 1;
        int length2 = m26170m.length - 1;
        int i17 = 0;
        int i18 = 0;
        while (length2 >= 0) {
            int i19 = i17;
            if (m26676A(c5247c, z10, z11)) {
                i19 = i17 + (m26170m[length2] * f30689o[m26176c][length2 * 2]);
            }
            i18 += m26170m[length2];
            length2--;
            i17 = i19;
        }
        int length3 = m26168k.length - 1;
        int i20 = 0;
        while (true) {
            i10 = i20;
            if (length3 < 0) {
                break;
            }
            int i21 = i10;
            if (m26676A(c5247c, z10, z11)) {
                i21 = i10 + (m26168k[length3] * f30689o[m26176c][(length3 * 2) + 1]);
            }
            length3--;
            i20 = i21;
        }
        if ((i18 & 1) != 0 || i18 > 13 || i18 < 4) {
            throw C8695j.m37209a();
        }
        int i22 = (13 - i18) / 2;
        int i23 = f30685k[i22];
        return new C5246b((C5250f.m26189b(m26170m, i23, true) * f30686l[i22]) + C5250f.m26189b(m26168k, 9 - i23, false) + f30687m[i22], i17 + i10);
    }

    /* renamed from: x */
    public List<C5366b> m26691x(int i10, C10193a c10193a) {
        boolean z10 = false;
        while (!z10) {
            try {
                List<C5366b> list = this.f30691g;
                list.add(m26684F(c10193a, list, i10));
            } catch (C8695j e10) {
                if (this.f30691g.isEmpty()) {
                    throw e10;
                }
                z10 = true;
            }
        }
        if (m26687s()) {
            return this.f30691g;
        }
        boolean isEmpty = this.f30692h.isEmpty();
        m26685H(i10);
        if (!isEmpty) {
            List<C5366b> m26689u = m26689u(false);
            if (m26689u != null) {
                return m26689u;
            }
            List<C5366b> m26689u2 = m26689u(true);
            if (m26689u2 != null) {
                return m26689u2;
            }
        }
        throw C8695j.m37209a();
    }

    /* renamed from: y */
    public final void m26692y(C10193a c10193a, List<C5366b> list, int i10) {
        boolean z10;
        int[] m26167j = m26167j();
        m26167j[0] = 0;
        m26167j[1] = 0;
        m26167j[2] = 0;
        m26167j[3] = 0;
        int m42664h = c10193a.m42664h();
        if (i10 < 0) {
            i10 = list.isEmpty() ? 0 : list.get(list.size() - 1).m26669a().m26175b()[1];
        }
        boolean z11 = list.size() % 2 != 0;
        boolean z12 = z11;
        if (this.f30694j) {
            z12 = !z11;
        }
        boolean z13 = false;
        while (true) {
            z10 = z13;
            if (i10 >= m42664h) {
                break;
            }
            boolean z14 = !c10193a.m42660c(i10);
            z10 = z14;
            if (!z14) {
                break;
            }
            i10++;
            z13 = z14;
        }
        int i11 = 0;
        int i12 = i10;
        for (int i13 = i10; i13 < m42664h; i13++) {
            if (c10193a.m42660c(i13) != z10) {
                m26167j[i11] = m26167j[i11] + 1;
            } else {
                if (i11 == 3) {
                    if (z12) {
                        m26680G(m26167j);
                    }
                    if (AbstractC5245a.m26164p(m26167j)) {
                        int[] iArr = this.f30693i;
                        iArr[0] = i12;
                        iArr[1] = i13;
                        return;
                    }
                    if (z12) {
                        m26680G(m26167j);
                    }
                    i12 += m26167j[0] + m26167j[1];
                    m26167j[0] = m26167j[2];
                    m26167j[1] = m26167j[3];
                    m26167j[2] = 0;
                    m26167j[3] = 0;
                    i11--;
                } else {
                    i11++;
                }
                m26167j[i11] = 1;
                z10 = !z10;
            }
        }
        throw C8695j.m37209a();
    }
}
