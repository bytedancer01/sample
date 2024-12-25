package p411xi;

import java.util.List;
import java.util.RandomAccess;
import kh.AbstractC5607b;
import org.jetbrains.annotations.NotNull;
import p372vh.C9365d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/s.class
 */
/* renamed from: xi.s */
/* loaded from: combined.jar:classes2.jar:xi/s.class */
public final class C9775s extends AbstractC5607b<C9764h> implements RandomAccess {

    /* renamed from: e */
    public static final a f44553e = new a(null);

    /* renamed from: c */
    @NotNull
    public final C9764h[] f44554c;

    /* renamed from: d */
    @NotNull
    public final int[] f44555d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xi/s$a.class
     */
    /* renamed from: xi.s$a */
    /* loaded from: combined.jar:classes2.jar:xi/s$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m41257b(a aVar, long j10, C9761e c9761e, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j10 = 0;
            }
            if ((i13 & 4) != 0) {
                i10 = 0;
            }
            if ((i13 & 16) != 0) {
                i11 = 0;
            }
            if ((i13 & 32) != 0) {
                i12 = list.size();
            }
            aVar.m41258a(j10, c9761e, i10, list, i11, i12, list2);
        }

        /* renamed from: a */
        public final void m41258a(long j10, C9761e c9761e, int i10, List<? extends C9764h> list, int i11, int i12, List<Integer> list2) {
            int i13;
            int i14;
            int i15;
            int i16 = i10;
            if (!(i11 < i12)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (!(list.get(i17).size() >= i16)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            C9764h c9764h = list.get(i11);
            C9764h c9764h2 = list.get(i12 - 1);
            if (i16 == c9764h.size()) {
                int intValue = list2.get(i11).intValue();
                i13 = i11 + 1;
                c9764h = list.get(i13);
                i14 = intValue;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (c9764h.m41193i(i16) == c9764h2.m41193i(i16)) {
                int min = Math.min(c9764h.size(), c9764h2.size());
                int i18 = 0;
                for (int i19 = i16; i19 < min && c9764h.m41193i(i19) == c9764h2.m41193i(i19); i19++) {
                    i18++;
                }
                long m41259c = j10 + m41259c(c9761e) + 2 + i18 + 1;
                c9761e.writeInt(-i18);
                c9761e.writeInt(i14);
                int i20 = i16 + i18;
                while (i16 < i20) {
                    c9761e.writeInt(c9764h.m41193i(i16) & 255);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (!(i20 == list.get(i13).size())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    c9761e.writeInt(list2.get(i13).intValue());
                    return;
                } else {
                    C9761e c9761e2 = new C9761e();
                    c9761e.writeInt(((int) (m41259c(c9761e2) + m41259c)) * (-1));
                    m41258a(m41259c, c9761e2, i20, list, i13, i12, list2);
                    c9761e.mo41127I(c9761e2);
                    return;
                }
            }
            int i21 = i13 + 1;
            int i22 = 1;
            while (true) {
                i15 = i22;
                if (i21 >= i12) {
                    break;
                }
                int i23 = i15;
                if (list.get(i21 - 1).m41193i(i16) != list.get(i21).m41193i(i16)) {
                    i23 = i15 + 1;
                }
                i21++;
                i22 = i23;
            }
            long m41259c2 = j10 + m41259c(c9761e) + 2 + (i15 * 2);
            c9761e.writeInt(i15);
            c9761e.writeInt(i14);
            for (int i24 = i13; i24 < i12; i24++) {
                byte m41193i = list.get(i24).m41193i(i16);
                if (i24 == i13 || m41193i != list.get(i24 - 1).m41193i(i16)) {
                    c9761e.writeInt(m41193i & 255);
                }
            }
            C9761e c9761e3 = new C9761e();
            while (true) {
                int i25 = i13;
                if (i25 >= i12) {
                    c9761e.mo41127I(c9761e3);
                    return;
                }
                byte m41193i2 = list.get(i25).m41193i(i16);
                int i26 = i25 + 1;
                i13 = i26;
                while (true) {
                    if (i13 >= i12) {
                        i13 = i12;
                        break;
                    } else if (m41193i2 != list.get(i13).m41193i(i16)) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i26 == i13 && i16 + 1 == list.get(i25).size()) {
                    c9761e.writeInt(list2.get(i25).intValue());
                } else {
                    c9761e.writeInt(((int) (m41259c2 + m41259c(c9761e3))) * (-1));
                    m41258a(m41259c2, c9761e3, i16 + 1, list, i25, i13, list2);
                }
            }
        }

        /* renamed from: c */
        public final long m41259c(C9761e c9761e) {
            return c9761e.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:52:0x01a4, code lost:
        
            continue;
         */
        @org.jetbrains.annotations.NotNull
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p411xi.C9775s m41260d(@org.jetbrains.annotations.NotNull p411xi.C9764h... r13) {
            /*
                Method dump skipped, instructions count: 539
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p411xi.C9775s.a.m41260d(xi.h[]):xi.s");
        }
    }

    public C9775s(C9764h[] c9764hArr, int[] iArr) {
        this.f44554c = c9764hArr;
        this.f44555d = iArr;
    }

    public /* synthetic */ C9775s(C9764h[] c9764hArr, int[] iArr, C9365d c9365d) {
        this(c9764hArr, iArr);
    }

    @Override // kh.AbstractC5605a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C9764h) {
            return m41251e((C9764h) obj);
        }
        return false;
    }

    @Override // kh.AbstractC5605a
    /* renamed from: d */
    public int mo27662d() {
        return this.f44554c.length;
    }

    /* renamed from: e */
    public /* bridge */ boolean m41251e(C9764h c9764h) {
        return super.contains(c9764h);
    }

    @Override // kh.AbstractC5607b, java.util.List
    @NotNull
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C9764h get(int i10) {
        return this.f44554c[i10];
    }

    @NotNull
    /* renamed from: i */
    public final C9764h[] m41253i() {
        return this.f44554c;
    }

    @Override // kh.AbstractC5607b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C9764h) {
            return m41255t((C9764h) obj);
        }
        return -1;
    }

    @Override // kh.AbstractC5607b, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C9764h) {
            return m41256v((C9764h) obj);
        }
        return -1;
    }

    @NotNull
    /* renamed from: q */
    public final int[] m41254q() {
        return this.f44555d;
    }

    /* renamed from: t */
    public /* bridge */ int m41255t(C9764h c9764h) {
        return super.indexOf(c9764h);
    }

    /* renamed from: v */
    public /* bridge */ int m41256v(C9764h c9764h) {
        return super.lastIndexOf(c9764h);
    }
}
