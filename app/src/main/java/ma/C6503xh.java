package ma;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/xh.class
 */
/* renamed from: ma.xh */
/* loaded from: combined.jar:classes2.jar:ma/xh.class */
public final class C6503xh<T> implements InterfaceC6150gi<T> {

    /* renamed from: m */
    public static final int[] f34158m = new int[0];

    /* renamed from: n */
    public static final Unsafe f34159n = C6193ij.m29750l();

    /* renamed from: a */
    public final int[] f34160a;

    /* renamed from: b */
    public final Object[] f34161b;

    /* renamed from: c */
    public final InterfaceC6443uh f34162c;

    /* renamed from: d */
    public final boolean f34163d;

    /* renamed from: e */
    public final boolean f34164e;

    /* renamed from: f */
    public final int[] f34165f;

    /* renamed from: g */
    public final int f34166g;

    /* renamed from: h */
    public final AbstractC6191ih f34167h;

    /* renamed from: i */
    public final AbstractC6504xi f34168i;

    /* renamed from: j */
    public final AbstractC6085dg f34169j;

    /* renamed from: k */
    public final C6543zh f34170k;

    /* renamed from: l */
    public final C6338ph f34171l;

    public C6503xh(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC6443uh interfaceC6443uh, boolean z10, boolean z11, int[] iArr2, int i12, int i13, C6543zh c6543zh, AbstractC6191ih abstractC6191ih, AbstractC6504xi abstractC6504xi, AbstractC6085dg abstractC6085dg, C6338ph c6338ph) {
        this.f34160a = iArr;
        this.f34161b = objArr;
        this.f34164e = z10;
        boolean z12 = false;
        if (abstractC6085dg != null) {
            z12 = false;
            if (abstractC6085dg.mo29552c(interfaceC6443uh)) {
                z12 = true;
            }
        }
        this.f34163d = z12;
        this.f34165f = iArr2;
        this.f34166g = i12;
        this.f34170k = c6543zh;
        this.f34167h = abstractC6191ih;
        this.f34168i = abstractC6504xi;
        this.f34169j = abstractC6085dg;
        this.f34162c = interfaceC6443uh;
        this.f34171l = c6338ph;
    }

    /* renamed from: A */
    public static Field m30122A(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: j */
    public static boolean m30123j(Object obj, int i10, InterfaceC6150gi interfaceC6150gi) {
        return interfaceC6150gi.mo29648g(C6193ij.m29749k(obj, i10 & 1048575));
    }

    /* renamed from: k */
    public static boolean m30124k(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC6295ng) {
            return ((AbstractC6295ng) obj).m29912l();
        }
        return true;
    }

    /* renamed from: n */
    public static boolean m30125n(Object obj, long j10) {
        return ((Boolean) C6193ij.m29749k(obj, j10)).booleanValue();
    }

    /* renamed from: o */
    public static final void m30126o(int i10, Object obj, InterfaceC6340pj interfaceC6340pj) {
        if (obj instanceof String) {
            interfaceC6340pj.mo29451H(i10, (String) obj);
        } else {
            interfaceC6340pj.mo29449F(i10, (AbstractC6399sf) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x06e0  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ma.C6503xh m30127p(java.lang.Class r18, ma.InterfaceC6380rh r19, ma.C6543zh r20, ma.AbstractC6191ih r21, ma.AbstractC6504xi r22, ma.AbstractC6085dg r23, ma.C6338ph r24) {
        /*
            Method dump skipped, instructions count: 2561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.C6503xh.m30127p(java.lang.Class, ma.rh, ma.zh, ma.ih, ma.xi, ma.dg, ma.ph):ma.xh");
    }

    /* renamed from: q */
    public static double m30128q(Object obj, long j10) {
        return ((Double) C6193ij.m29749k(obj, j10)).doubleValue();
    }

    /* renamed from: r */
    public static float m30129r(Object obj, long j10) {
        return ((Float) C6193ij.m29749k(obj, j10)).floatValue();
    }

    /* renamed from: t */
    public static int m30130t(Object obj, long j10) {
        return ((Integer) C6193ij.m29749k(obj, j10)).intValue();
    }

    /* renamed from: v */
    public static int m30131v(int i10) {
        return (i10 >>> 20) & 255;
    }

    /* renamed from: x */
    public static long m30132x(Object obj, long j10) {
        return ((Long) C6193ij.m29749k(obj, j10)).longValue();
    }

    /* renamed from: B */
    public final void m30133B(Object obj, Object obj2, int i10) {
        if (m30139h(obj2, i10)) {
            int m30144w = m30144w(i10);
            Unsafe unsafe = f34159n;
            long j10 = m30144w & 1048575;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f34160a[i10] + " is present but null: " + obj2.toString());
            }
            InterfaceC6150gi m30145y = m30145y(i10);
            if (!m30139h(obj, i10)) {
                if (m30124k(object)) {
                    Object mo29649l = m30145y.mo29649l();
                    m30145y.mo29647f(mo29649l, object);
                    unsafe.putObject(obj, j10, mo29649l);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                m30135D(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            Object obj3 = object2;
            if (!m30124k(object2)) {
                obj3 = m30145y.mo29649l();
                m30145y.mo29647f(obj3, object2);
                unsafe.putObject(obj, j10, obj3);
            }
            m30145y.mo29647f(obj3, object);
        }
    }

    /* renamed from: C */
    public final void m30134C(Object obj, Object obj2, int i10) {
        int i11 = this.f34160a[i10];
        if (m30141m(obj2, i11, i10)) {
            int m30144w = m30144w(i10);
            Unsafe unsafe = f34159n;
            long j10 = m30144w & 1048575;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f34160a[i10] + " is present but null: " + obj2.toString());
            }
            InterfaceC6150gi m30145y = m30145y(i10);
            if (!m30141m(obj, i11, i10)) {
                if (m30124k(object)) {
                    Object mo29649l = m30145y.mo29649l();
                    m30145y.mo29647f(mo29649l, object);
                    unsafe.putObject(obj, j10, mo29649l);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                m30136E(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            Object obj3 = object2;
            if (!m30124k(object2)) {
                obj3 = m30145y.mo29649l();
                m30145y.mo29647f(obj3, object2);
                unsafe.putObject(obj, j10, obj3);
            }
            m30145y.mo29647f(obj3, object);
        }
    }

    /* renamed from: D */
    public final void m30135D(Object obj, int i10) {
        int m30143u = m30143u(i10);
        long j10 = 1048575 & m30143u;
        if (j10 == 1048575) {
            return;
        }
        C6193ij.m29760v(obj, j10, (1 << (m30143u >>> 20)) | C6193ij.m29746h(obj, j10));
    }

    /* renamed from: E */
    public final void m30136E(Object obj, int i10, int i11) {
        C6193ij.m29760v(obj, m30143u(i11) & 1048575, i10);
    }

    /* renamed from: F */
    public final void m30137F(InterfaceC6340pj interfaceC6340pj, int i10, Object obj, int i11) {
        if (obj == null) {
            return;
        }
        throw null;
    }

    /* renamed from: G */
    public final boolean m30138G(Object obj, Object obj2, int i10) {
        return m30139h(obj, i10) == m30139h(obj2, i10);
    }

    @Override // ma.InterfaceC6150gi
    /* renamed from: a */
    public final void mo29642a(Object obj) {
        int i10;
        if (m30124k(obj)) {
            if (obj instanceof AbstractC6295ng) {
                AbstractC6295ng abstractC6295ng = (AbstractC6295ng) obj;
                abstractC6295ng.m29911k(Integer.MAX_VALUE);
                abstractC6295ng.zza = 0;
                abstractC6295ng.m29910h();
            }
            int length = this.f34160a.length;
            for (0; i10 < length; i10 + 3) {
                int m30144w = m30144w(i10);
                int m30131v = m30131v(m30144w);
                long j10 = 1048575 & m30144w;
                if (m30131v != 9) {
                    if (m30131v == 60 || m30131v == 68) {
                        if (!m30141m(obj, this.f34160a[i10], i10)) {
                        }
                        m30145y(i10).mo29642a(f34159n.getObject(obj, j10));
                    } else {
                        switch (m30131v) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f34167h.mo29553a(obj, j10);
                                continue;
                            case 50:
                                Unsafe unsafe = f34159n;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((C6317oh) object).m29939c();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        m30145y(i10).mo29642a(f34159n.getObject(obj, j10));
                    }
                }
                i10 = m30139h(obj, i10) ? 0 : i10 + 3;
                m30145y(i10).mo29642a(f34159n.getObject(obj, j10));
            }
            this.f34168i.mo30151e(obj);
            if (this.f34163d) {
                this.f34169j.mo29551b(obj);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x031c, code lost:
    
        if (r21 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x034f, code lost:
    
        r12 = (r13 * 53) + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0348, code lost:
    
        r12 = r21.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0345, code lost:
    
        if (r21 != null) goto L69;
     */
    @Override // ma.InterfaceC6150gi
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo29643b(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.C6503xh.mo29643b(java.lang.Object):int");
    }

    @Override // ma.InterfaceC6150gi
    /* renamed from: c */
    public final int mo29644c(Object obj) {
        int m30142s;
        int i10;
        long m29747i;
        Object obj2;
        Object obj3;
        int m29746h;
        int m29746h2;
        int m29746h3;
        long m29747i2;
        int m29688D;
        int i11;
        int m29406y;
        int i12;
        if (this.f34164e) {
            Unsafe unsafe = f34159n;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int i15 = i14;
                if (i13 < this.f34160a.length) {
                    int m30144w = m30144w(i13);
                    int m30131v = m30131v(m30144w);
                    int i16 = this.f34160a[i13];
                    if (m30131v >= EnumC6211jg.zzJ.zza() && m30131v <= EnumC6211jg.zzW.zza()) {
                        int i17 = this.f34160a[i13 + 2];
                    }
                    long j10 = m30144w & 1048575;
                    switch (m30131v) {
                        case 0:
                            i10 = i15;
                            if (!m30139h(obj, i13)) {
                                break;
                            }
                            m29688D = AbstractC6022ag.m29406y(i16 << 3) + 8;
                            i10 = i15 + m29688D;
                            break;
                        case 1:
                            i10 = i15;
                            if (!m30139h(obj, i13)) {
                                break;
                            }
                            m29688D = AbstractC6022ag.m29406y(i16 << 3) + 4;
                            i10 = i15 + m29688D;
                            break;
                        case 2:
                            i10 = i15;
                            if (!m30139h(obj, i13)) {
                                break;
                            }
                            m29747i = C6193ij.m29747i(obj, j10);
                            i11 = AbstractC6022ag.m29407z(m29747i);
                            m29406y = AbstractC6022ag.m29406y(i16 << 3);
                            i10 = i15 + m29406y + i11;
                            break;
                        case 3:
                            i10 = i15;
                            if (!m30139h(obj, i13)) {
                                break;
                            }
                            m29747i = C6193ij.m29747i(obj, j10);
                            i11 = AbstractC6022ag.m29407z(m29747i);
                            m29406y = AbstractC6022ag.m29406y(i16 << 3);
                            i10 = i15 + m29406y + i11;
                            break;
                        case 4:
                            i10 = i15;
                            if (!m30139h(obj, i13)) {
                                break;
                            }
                            m29746h2 = C6193ij.m29746h(obj, j10);
                            i12 = i16 << 3;
                            i11 = AbstractC6022ag.m29403v(m29746h2);
                            m29406y = AbstractC6022ag.m29406y(i12);
                            i10 = i15 + m29406y + i11;
                            break;
                        case 5:
                            i10 = i15;
                            if (!m30139h(obj, i13)) {
                                break;
                            }
                            m29688D = AbstractC6022ag.m29406y(i16 << 3) + 8;
                            i10 = i15 + m29688D;
                            break;
                        case 6:
                            i10 = i15;
                            if (!m30139h(obj, i13)) {
                                break;
                            }
                            m29688D = AbstractC6022ag.m29406y(i16 << 3) + 4;
                            i10 = i15 + m29688D;
                            break;
                        case 7:
                            i10 = i15;
                            if (!m30139h(obj, i13)) {
                                break;
                            }
                            m29688D = AbstractC6022ag.m29406y(i16 << 3) + 1;
                            i10 = i15 + m29688D;
                            break;
                        case 8:
                            i10 = i15;
                            if (!m30139h(obj, i13)) {
                                break;
                            } else {
                                Object m29749k = C6193ij.m29749k(obj, j10);
                                obj2 = m29749k;
                                if (m29749k instanceof AbstractC6399sf) {
                                    obj3 = m29749k;
                                    Logger logger = AbstractC6022ag.f33661b;
                                    int mo29850d = ((AbstractC6399sf) obj3).mo29850d();
                                    m29688D = AbstractC6022ag.m29406y(i16 << 3) + AbstractC6022ag.m29406y(mo29850d) + mo29850d;
                                    i10 = i15 + m29688D;
                                    break;
                                }
                                i12 = i16 << 3;
                                i11 = AbstractC6022ag.m29405x((String) obj2);
                                m29406y = AbstractC6022ag.m29406y(i12);
                                i10 = i15 + m29406y + i11;
                                break;
                            }
                        case 9:
                            i10 = i15;
                            if (!m30139h(obj, i13)) {
                                break;
                            }
                            m29688D = C6192ii.m29695K(i16, C6193ij.m29749k(obj, j10), m30145y(i13));
                            i10 = i15 + m29688D;
                            break;
                        case 10:
                            i10 = i15;
                            if (!m30139h(obj, i13)) {
                                break;
                            }
                            obj3 = C6193ij.m29749k(obj, j10);
                            Logger logger2 = AbstractC6022ag.f33661b;
                            int mo29850d2 = ((AbstractC6399sf) obj3).mo29850d();
                            m29688D = AbstractC6022ag.m29406y(i16 << 3) + AbstractC6022ag.m29406y(mo29850d2) + mo29850d2;
                            i10 = i15 + m29688D;
                            break;
                        case 11:
                            i10 = i15;
                            if (!m30139h(obj, i13)) {
                                break;
                            } else {
                                m29746h = C6193ij.m29746h(obj, j10);
                                i12 = i16 << 3;
                                i11 = AbstractC6022ag.m29406y(m29746h);
                                m29406y = AbstractC6022ag.m29406y(i12);
                                i10 = i15 + m29406y + i11;
                                break;
                            }
                        case 12:
                            i10 = i15;
                            if (!m30139h(obj, i13)) {
                                break;
                            }
                            m29746h2 = C6193ij.m29746h(obj, j10);
                            i12 = i16 << 3;
                            i11 = AbstractC6022ag.m29403v(m29746h2);
                            m29406y = AbstractC6022ag.m29406y(i12);
                            i10 = i15 + m29406y + i11;
                            break;
                        case 13:
                            i10 = i15;
                            if (!m30139h(obj, i13)) {
                                break;
                            }
                            m29688D = AbstractC6022ag.m29406y(i16 << 3) + 4;
                            i10 = i15 + m29688D;
                            break;
                        case 14:
                            i10 = i15;
                            if (!m30139h(obj, i13)) {
                                break;
                            }
                            m29688D = AbstractC6022ag.m29406y(i16 << 3) + 8;
                            i10 = i15 + m29688D;
                            break;
                        case 15:
                            i10 = i15;
                            if (!m30139h(obj, i13)) {
                                break;
                            } else {
                                m29746h3 = C6193ij.m29746h(obj, j10);
                                m29406y = AbstractC6022ag.m29406y(i16 << 3);
                                i11 = AbstractC6022ag.m29406y((m29746h3 >> 31) ^ (m29746h3 + m29746h3));
                                i10 = i15 + m29406y + i11;
                                break;
                            }
                        case 16:
                            i10 = i15;
                            if (!m30139h(obj, i13)) {
                                break;
                            } else {
                                m29747i2 = C6193ij.m29747i(obj, j10);
                                m29688D = AbstractC6022ag.m29406y(i16 << 3) + AbstractC6022ag.m29407z((m29747i2 + m29747i2) ^ (m29747i2 >> 63));
                                i10 = i15 + m29688D;
                                break;
                            }
                        case 17:
                            i10 = i15;
                            if (!m30139h(obj, i13)) {
                                break;
                            }
                            m29688D = AbstractC6022ag.m29402u(i16, (InterfaceC6443uh) C6193ij.m29749k(obj, j10), m30145y(i13));
                            i10 = i15 + m29688D;
                            break;
                        case 18:
                        case 23:
                        case 32:
                            m29688D = C6192ii.m29688D(i16, (List) C6193ij.m29749k(obj, j10), false);
                            i10 = i15 + m29688D;
                            break;
                        case 19:
                        case 24:
                        case 31:
                            m29688D = C6192ii.m29686B(i16, (List) C6193ij.m29749k(obj, j10), false);
                            i10 = i15 + m29688D;
                            break;
                        case 20:
                            m29688D = C6192ii.m29693I(i16, (List) C6193ij.m29749k(obj, j10), false);
                            i10 = i15 + m29688D;
                            break;
                        case 21:
                            m29688D = C6192ii.m29704T(i16, (List) C6193ij.m29749k(obj, j10), false);
                            i10 = i15 + m29688D;
                            break;
                        case 22:
                            m29688D = C6192ii.m29691G(i16, (List) C6193ij.m29749k(obj, j10), false);
                            i10 = i15 + m29688D;
                            break;
                        case 25:
                            m29688D = C6192ii.m29731x(i16, (List) C6193ij.m29749k(obj, j10), false);
                            i10 = i15 + m29688D;
                            break;
                        case 26:
                            m29688D = C6192ii.m29701Q(i16, (List) C6193ij.m29749k(obj, j10));
                            i10 = i15 + m29688D;
                            break;
                        case 27:
                            m29688D = C6192ii.m29696L(i16, (List) C6193ij.m29749k(obj, j10), m30145y(i13));
                            i10 = i15 + m29688D;
                            break;
                        case 28:
                            m29688D = C6192ii.m29732y(i16, (List) C6193ij.m29749k(obj, j10));
                            i10 = i15 + m29688D;
                            break;
                        case 29:
                            m29688D = C6192ii.m29702R(i16, (List) C6193ij.m29749k(obj, j10), false);
                            i10 = i15 + m29688D;
                            break;
                        case 30:
                            m29688D = C6192ii.m29733z(i16, (List) C6193ij.m29749k(obj, j10), false);
                            i10 = i15 + m29688D;
                            break;
                        case 33:
                            m29688D = C6192ii.m29697M(i16, (List) C6193ij.m29749k(obj, j10), false);
                            i10 = i15 + m29688D;
                            break;
                        case 34:
                            m29688D = C6192ii.m29699O(i16, (List) C6193ij.m29749k(obj, j10), false);
                            i10 = i15 + m29688D;
                            break;
                        case 35:
                            int m29689E = C6192ii.m29689E((List) unsafe.getObject(obj, j10));
                            i10 = i15;
                            if (m29689E <= 0) {
                                break;
                            } else {
                                i11 = m29689E;
                                m29406y = AbstractC6022ag.m29406y(i16 << 3) + AbstractC6022ag.m29406y(i11);
                                i10 = i15 + m29406y + i11;
                                break;
                            }
                        case 36:
                            int m29687C = C6192ii.m29687C((List) unsafe.getObject(obj, j10));
                            i10 = i15;
                            if (m29687C <= 0) {
                                break;
                            } else {
                                i11 = m29687C;
                                m29406y = AbstractC6022ag.m29406y(i16 << 3) + AbstractC6022ag.m29406y(i11);
                                i10 = i15 + m29406y + i11;
                                break;
                            }
                        case 37:
                            int m29694J = C6192ii.m29694J((List) unsafe.getObject(obj, j10));
                            i10 = i15;
                            if (m29694J <= 0) {
                                break;
                            } else {
                                i11 = m29694J;
                                m29406y = AbstractC6022ag.m29406y(i16 << 3) + AbstractC6022ag.m29406y(i11);
                                i10 = i15 + m29406y + i11;
                                break;
                            }
                        case 38:
                            int m29705U = C6192ii.m29705U((List) unsafe.getObject(obj, j10));
                            i10 = i15;
                            if (m29705U <= 0) {
                                break;
                            } else {
                                i11 = m29705U;
                                m29406y = AbstractC6022ag.m29406y(i16 << 3) + AbstractC6022ag.m29406y(i11);
                                i10 = i15 + m29406y + i11;
                                break;
                            }
                        case 39:
                            int m29692H = C6192ii.m29692H((List) unsafe.getObject(obj, j10));
                            i10 = i15;
                            if (m29692H <= 0) {
                                break;
                            } else {
                                i11 = m29692H;
                                m29406y = AbstractC6022ag.m29406y(i16 << 3) + AbstractC6022ag.m29406y(i11);
                                i10 = i15 + m29406y + i11;
                                break;
                            }
                        case 40:
                            int m29689E2 = C6192ii.m29689E((List) unsafe.getObject(obj, j10));
                            i10 = i15;
                            if (m29689E2 <= 0) {
                                break;
                            } else {
                                i11 = m29689E2;
                                m29406y = AbstractC6022ag.m29406y(i16 << 3) + AbstractC6022ag.m29406y(i11);
                                i10 = i15 + m29406y + i11;
                                break;
                            }
                        case 41:
                            int m29687C2 = C6192ii.m29687C((List) unsafe.getObject(obj, j10));
                            i10 = i15;
                            if (m29687C2 <= 0) {
                                break;
                            } else {
                                i11 = m29687C2;
                                m29406y = AbstractC6022ag.m29406y(i16 << 3) + AbstractC6022ag.m29406y(i11);
                                i10 = i15 + m29406y + i11;
                                break;
                            }
                        case 42:
                            List list = (List) unsafe.getObject(obj, j10);
                            Class cls = C6192ii.f33825a;
                            int size = list.size();
                            i10 = i15;
                            if (size <= 0) {
                                break;
                            } else {
                                i11 = size;
                                m29406y = AbstractC6022ag.m29406y(i16 << 3) + AbstractC6022ag.m29406y(i11);
                                i10 = i15 + m29406y + i11;
                                break;
                            }
                        case 43:
                            int m29703S = C6192ii.m29703S((List) unsafe.getObject(obj, j10));
                            i10 = i15;
                            if (m29703S <= 0) {
                                break;
                            } else {
                                i11 = m29703S;
                                m29406y = AbstractC6022ag.m29406y(i16 << 3) + AbstractC6022ag.m29406y(i11);
                                i10 = i15 + m29406y + i11;
                                break;
                            }
                        case 44:
                            int m29685A = C6192ii.m29685A((List) unsafe.getObject(obj, j10));
                            i10 = i15;
                            if (m29685A <= 0) {
                                break;
                            } else {
                                i11 = m29685A;
                                m29406y = AbstractC6022ag.m29406y(i16 << 3) + AbstractC6022ag.m29406y(i11);
                                i10 = i15 + m29406y + i11;
                                break;
                            }
                        case 45:
                            int m29687C3 = C6192ii.m29687C((List) unsafe.getObject(obj, j10));
                            i10 = i15;
                            if (m29687C3 <= 0) {
                                break;
                            } else {
                                i11 = m29687C3;
                                m29406y = AbstractC6022ag.m29406y(i16 << 3) + AbstractC6022ag.m29406y(i11);
                                i10 = i15 + m29406y + i11;
                                break;
                            }
                        case 46:
                            int m29689E3 = C6192ii.m29689E((List) unsafe.getObject(obj, j10));
                            i10 = i15;
                            if (m29689E3 <= 0) {
                                break;
                            } else {
                                i11 = m29689E3;
                                m29406y = AbstractC6022ag.m29406y(i16 << 3) + AbstractC6022ag.m29406y(i11);
                                i10 = i15 + m29406y + i11;
                                break;
                            }
                        case 47:
                            int m29698N = C6192ii.m29698N((List) unsafe.getObject(obj, j10));
                            i10 = i15;
                            if (m29698N <= 0) {
                                break;
                            } else {
                                i11 = m29698N;
                                m29406y = AbstractC6022ag.m29406y(i16 << 3) + AbstractC6022ag.m29406y(i11);
                                i10 = i15 + m29406y + i11;
                                break;
                            }
                        case 48:
                            int m29700P = C6192ii.m29700P((List) unsafe.getObject(obj, j10));
                            i10 = i15;
                            if (m29700P <= 0) {
                                break;
                            } else {
                                i11 = m29700P;
                                m29406y = AbstractC6022ag.m29406y(i16 << 3) + AbstractC6022ag.m29406y(i11);
                                i10 = i15 + m29406y + i11;
                                break;
                            }
                        case 49:
                            m29688D = C6192ii.m29690F(i16, (List) C6193ij.m29749k(obj, j10), m30145y(i13));
                            i10 = i15 + m29688D;
                            break;
                        case 50:
                            C6338ph.m29968a(i16, C6193ij.m29749k(obj, j10), m30146z(i13));
                            i10 = i15;
                            break;
                        case 51:
                            i10 = i15;
                            if (!m30141m(obj, i16, i13)) {
                                break;
                            }
                            m29688D = AbstractC6022ag.m29406y(i16 << 3) + 8;
                            i10 = i15 + m29688D;
                            break;
                        case 52:
                            i10 = i15;
                            if (!m30141m(obj, i16, i13)) {
                                break;
                            }
                            m29688D = AbstractC6022ag.m29406y(i16 << 3) + 4;
                            i10 = i15 + m29688D;
                            break;
                        case 53:
                            i10 = i15;
                            if (!m30141m(obj, i16, i13)) {
                                break;
                            }
                            m29747i = m30132x(obj, j10);
                            i11 = AbstractC6022ag.m29407z(m29747i);
                            m29406y = AbstractC6022ag.m29406y(i16 << 3);
                            i10 = i15 + m29406y + i11;
                            break;
                        case 54:
                            i10 = i15;
                            if (!m30141m(obj, i16, i13)) {
                                break;
                            }
                            m29747i = m30132x(obj, j10);
                            i11 = AbstractC6022ag.m29407z(m29747i);
                            m29406y = AbstractC6022ag.m29406y(i16 << 3);
                            i10 = i15 + m29406y + i11;
                            break;
                        case 55:
                            i10 = i15;
                            if (!m30141m(obj, i16, i13)) {
                                break;
                            }
                            m29746h2 = m30130t(obj, j10);
                            i12 = i16 << 3;
                            i11 = AbstractC6022ag.m29403v(m29746h2);
                            m29406y = AbstractC6022ag.m29406y(i12);
                            i10 = i15 + m29406y + i11;
                            break;
                        case 56:
                            i10 = i15;
                            if (!m30141m(obj, i16, i13)) {
                                break;
                            }
                            m29688D = AbstractC6022ag.m29406y(i16 << 3) + 8;
                            i10 = i15 + m29688D;
                            break;
                        case 57:
                            i10 = i15;
                            if (!m30141m(obj, i16, i13)) {
                                break;
                            }
                            m29688D = AbstractC6022ag.m29406y(i16 << 3) + 4;
                            i10 = i15 + m29688D;
                            break;
                        case 58:
                            i10 = i15;
                            if (!m30141m(obj, i16, i13)) {
                                break;
                            }
                            m29688D = AbstractC6022ag.m29406y(i16 << 3) + 1;
                            i10 = i15 + m29688D;
                            break;
                        case 59:
                            i10 = i15;
                            if (!m30141m(obj, i16, i13)) {
                                break;
                            } else {
                                Object m29749k2 = C6193ij.m29749k(obj, j10);
                                obj2 = m29749k2;
                                if (m29749k2 instanceof AbstractC6399sf) {
                                    obj3 = m29749k2;
                                    Logger logger22 = AbstractC6022ag.f33661b;
                                    int mo29850d22 = ((AbstractC6399sf) obj3).mo29850d();
                                    m29688D = AbstractC6022ag.m29406y(i16 << 3) + AbstractC6022ag.m29406y(mo29850d22) + mo29850d22;
                                    i10 = i15 + m29688D;
                                    break;
                                }
                                i12 = i16 << 3;
                                i11 = AbstractC6022ag.m29405x((String) obj2);
                                m29406y = AbstractC6022ag.m29406y(i12);
                                i10 = i15 + m29406y + i11;
                                break;
                            }
                        case 60:
                            i10 = i15;
                            if (!m30141m(obj, i16, i13)) {
                                break;
                            }
                            m29688D = C6192ii.m29695K(i16, C6193ij.m29749k(obj, j10), m30145y(i13));
                            i10 = i15 + m29688D;
                            break;
                        case 61:
                            i10 = i15;
                            if (!m30141m(obj, i16, i13)) {
                                break;
                            }
                            obj3 = C6193ij.m29749k(obj, j10);
                            Logger logger222 = AbstractC6022ag.f33661b;
                            int mo29850d222 = ((AbstractC6399sf) obj3).mo29850d();
                            m29688D = AbstractC6022ag.m29406y(i16 << 3) + AbstractC6022ag.m29406y(mo29850d222) + mo29850d222;
                            i10 = i15 + m29688D;
                            break;
                        case 62:
                            i10 = i15;
                            if (!m30141m(obj, i16, i13)) {
                                break;
                            } else {
                                m29746h = m30130t(obj, j10);
                                i12 = i16 << 3;
                                i11 = AbstractC6022ag.m29406y(m29746h);
                                m29406y = AbstractC6022ag.m29406y(i12);
                                i10 = i15 + m29406y + i11;
                                break;
                            }
                        case 63:
                            i10 = i15;
                            if (!m30141m(obj, i16, i13)) {
                                break;
                            }
                            m29746h2 = m30130t(obj, j10);
                            i12 = i16 << 3;
                            i11 = AbstractC6022ag.m29403v(m29746h2);
                            m29406y = AbstractC6022ag.m29406y(i12);
                            i10 = i15 + m29406y + i11;
                            break;
                        case 64:
                            i10 = i15;
                            if (!m30141m(obj, i16, i13)) {
                                break;
                            }
                            m29688D = AbstractC6022ag.m29406y(i16 << 3) + 4;
                            i10 = i15 + m29688D;
                            break;
                        case 65:
                            i10 = i15;
                            if (!m30141m(obj, i16, i13)) {
                                break;
                            }
                            m29688D = AbstractC6022ag.m29406y(i16 << 3) + 8;
                            i10 = i15 + m29688D;
                            break;
                        case 66:
                            i10 = i15;
                            if (!m30141m(obj, i16, i13)) {
                                break;
                            } else {
                                m29746h3 = m30130t(obj, j10);
                                m29406y = AbstractC6022ag.m29406y(i16 << 3);
                                i11 = AbstractC6022ag.m29406y((m29746h3 >> 31) ^ (m29746h3 + m29746h3));
                                i10 = i15 + m29406y + i11;
                                break;
                            }
                        case 67:
                            i10 = i15;
                            if (!m30141m(obj, i16, i13)) {
                                break;
                            } else {
                                m29747i2 = m30132x(obj, j10);
                                m29688D = AbstractC6022ag.m29406y(i16 << 3) + AbstractC6022ag.m29407z((m29747i2 + m29747i2) ^ (m29747i2 >> 63));
                                i10 = i15 + m29688D;
                                break;
                            }
                        case 68:
                            i10 = i15;
                            if (!m30141m(obj, i16, i13)) {
                                break;
                            }
                            m29688D = AbstractC6022ag.m29402u(i16, (InterfaceC6443uh) C6193ij.m29749k(obj, j10), m30145y(i13));
                            i10 = i15 + m29688D;
                            break;
                        default:
                            i10 = i15;
                            break;
                    }
                    i13 += 3;
                    i14 = i10;
                } else {
                    AbstractC6504xi abstractC6504xi = this.f34168i;
                    m30142s = i15 + abstractC6504xi.mo30147a(abstractC6504xi.mo30149c(obj));
                }
            }
        } else {
            m30142s = m30142s(obj);
        }
        return m30142s;
    }

    @Override // ma.InterfaceC6150gi
    /* renamed from: d */
    public final void mo29645d(Object obj, InterfaceC6340pj interfaceC6340pj) {
        int i10;
        double m29744f;
        float m29745g;
        long m29747i;
        long m29747i2;
        int m29746h;
        long m29747i3;
        int m29746h2;
        boolean m29735B;
        int m29746h3;
        int m29746h4;
        int m29746h5;
        long m29747i4;
        int m29746h6;
        long m29747i5;
        if (this.f34164e) {
            if (this.f34163d) {
                this.f34169j.mo29550a(obj);
                throw null;
            }
            int length = this.f34160a.length;
            for (int i11 = 0; i11 < length; i11 += 3) {
                int m30144w = m30144w(i11);
                int i12 = this.f34160a[i11];
                switch (m30131v(m30144w)) {
                    case 0:
                        if (m30139h(obj, i11)) {
                            m29744f = C6193ij.m29744f(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29462k(i12, m29744f);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (m30139h(obj, i11)) {
                            m29745g = C6193ij.m29745g(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29445B(i12, m29745g);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (m30139h(obj, i11)) {
                            m29747i = C6193ij.m29747i(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29454c(i12, m29747i);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (m30139h(obj, i11)) {
                            m29747i2 = C6193ij.m29747i(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29469r(i12, m29747i2);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (m30139h(obj, i11)) {
                            m29746h = C6193ij.m29746h(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29460i(i12, m29746h);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (m30139h(obj, i11)) {
                            m29747i3 = C6193ij.m29747i(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29448E(i12, m29747i3);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (m30139h(obj, i11)) {
                            m29746h2 = C6193ij.m29746h(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29471t(i12, m29746h2);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (m30139h(obj, i11)) {
                            m29735B = C6193ij.m29735B(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29455d(i12, m29735B);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!m30139h(obj, i11)) {
                            break;
                        }
                        m30126o(i12, C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj);
                        break;
                    case 9:
                        if (!m30139h(obj, i11)) {
                            break;
                        }
                        interfaceC6340pj.mo29459h(i12, C6193ij.m29749k(obj, m30144w & 1048575), m30145y(i11));
                        break;
                    case 10:
                        if (!m30139h(obj, i11)) {
                            break;
                        }
                        interfaceC6340pj.mo29449F(i12, (AbstractC6399sf) C6193ij.m29749k(obj, m30144w & 1048575));
                        break;
                    case 11:
                        if (m30139h(obj, i11)) {
                            m29746h3 = C6193ij.m29746h(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29475x(i12, m29746h3);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (m30139h(obj, i11)) {
                            m29746h4 = C6193ij.m29746h(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29473v(i12, m29746h4);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (m30139h(obj, i11)) {
                            m29746h5 = C6193ij.m29746h(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29466o(i12, m29746h5);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (m30139h(obj, i11)) {
                            m29747i4 = C6193ij.m29747i(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29463l(i12, m29747i4);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (m30139h(obj, i11)) {
                            m29746h6 = C6193ij.m29746h(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29476y(i12, m29746h6);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (m30139h(obj, i11)) {
                            m29747i5 = C6193ij.m29747i(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29465n(i12, m29747i5);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (!m30139h(obj, i11)) {
                            break;
                        }
                        interfaceC6340pj.mo29446C(i12, C6193ij.m29749k(obj, m30144w & 1048575), m30145y(i11));
                        break;
                    case 18:
                        C6192ii.m29713f(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, false);
                        break;
                    case 19:
                        C6192ii.m29717j(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, false);
                        break;
                    case 20:
                        C6192ii.m29720m(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, false);
                        break;
                    case 21:
                        C6192ii.m29728u(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, false);
                        break;
                    case 22:
                        C6192ii.m29719l(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, false);
                        break;
                    case 23:
                        C6192ii.m29716i(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, false);
                        break;
                    case 24:
                        C6192ii.m29715h(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, false);
                        break;
                    case 25:
                        C6192ii.m29711d(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, false);
                        break;
                    case 26:
                        C6192ii.m29726s(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj);
                        break;
                    case 27:
                        C6192ii.m29721n(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, m30145y(i11));
                        break;
                    case 28:
                        C6192ii.m29712e(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj);
                        break;
                    case 29:
                        C6192ii.m29727t(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, false);
                        break;
                    case 30:
                        C6192ii.m29714g(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, false);
                        break;
                    case 31:
                        C6192ii.m29722o(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, false);
                        break;
                    case 32:
                        C6192ii.m29723p(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, false);
                        break;
                    case 33:
                        C6192ii.m29724q(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, false);
                        break;
                    case 34:
                        C6192ii.m29725r(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, false);
                        break;
                    case 35:
                        C6192ii.m29713f(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, true);
                        break;
                    case 36:
                        C6192ii.m29717j(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, true);
                        break;
                    case 37:
                        C6192ii.m29720m(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, true);
                        break;
                    case 38:
                        C6192ii.m29728u(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, true);
                        break;
                    case 39:
                        C6192ii.m29719l(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, true);
                        break;
                    case 40:
                        C6192ii.m29716i(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, true);
                        break;
                    case 41:
                        C6192ii.m29715h(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, true);
                        break;
                    case 42:
                        C6192ii.m29711d(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, true);
                        break;
                    case 43:
                        C6192ii.m29727t(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, true);
                        break;
                    case 44:
                        C6192ii.m29714g(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, true);
                        break;
                    case 45:
                        C6192ii.m29722o(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, true);
                        break;
                    case 46:
                        C6192ii.m29723p(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, true);
                        break;
                    case 47:
                        C6192ii.m29724q(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, true);
                        break;
                    case 48:
                        C6192ii.m29725r(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, true);
                        break;
                    case 49:
                        C6192ii.m29718k(i12, (List) C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj, m30145y(i11));
                        break;
                    case 50:
                        m30137F(interfaceC6340pj, i12, C6193ij.m29749k(obj, m30144w & 1048575), i11);
                        break;
                    case 51:
                        if (m30141m(obj, i12, i11)) {
                            m29744f = m30128q(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29462k(i12, m29744f);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (m30141m(obj, i12, i11)) {
                            m29745g = m30129r(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29445B(i12, m29745g);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (m30141m(obj, i12, i11)) {
                            m29747i = m30132x(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29454c(i12, m29747i);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (m30141m(obj, i12, i11)) {
                            m29747i2 = m30132x(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29469r(i12, m29747i2);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (m30141m(obj, i12, i11)) {
                            m29746h = m30130t(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29460i(i12, m29746h);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (m30141m(obj, i12, i11)) {
                            m29747i3 = m30132x(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29448E(i12, m29747i3);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (m30141m(obj, i12, i11)) {
                            m29746h2 = m30130t(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29471t(i12, m29746h2);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (m30141m(obj, i12, i11)) {
                            m29735B = m30125n(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29455d(i12, m29735B);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!m30141m(obj, i12, i11)) {
                            break;
                        }
                        m30126o(i12, C6193ij.m29749k(obj, m30144w & 1048575), interfaceC6340pj);
                        break;
                    case 60:
                        if (!m30141m(obj, i12, i11)) {
                            break;
                        }
                        interfaceC6340pj.mo29459h(i12, C6193ij.m29749k(obj, m30144w & 1048575), m30145y(i11));
                        break;
                    case 61:
                        if (!m30141m(obj, i12, i11)) {
                            break;
                        }
                        interfaceC6340pj.mo29449F(i12, (AbstractC6399sf) C6193ij.m29749k(obj, m30144w & 1048575));
                        break;
                    case 62:
                        if (m30141m(obj, i12, i11)) {
                            m29746h3 = m30130t(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29475x(i12, m29746h3);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (m30141m(obj, i12, i11)) {
                            m29746h4 = m30130t(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29473v(i12, m29746h4);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (m30141m(obj, i12, i11)) {
                            m29746h5 = m30130t(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29466o(i12, m29746h5);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (m30141m(obj, i12, i11)) {
                            m29747i4 = m30132x(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29463l(i12, m29747i4);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (m30141m(obj, i12, i11)) {
                            m29746h6 = m30130t(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29476y(i12, m29746h6);
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (m30141m(obj, i12, i11)) {
                            m29747i5 = m30132x(obj, m30144w & 1048575);
                            interfaceC6340pj.mo29465n(i12, m29747i5);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (!m30141m(obj, i12, i11)) {
                            break;
                        }
                        interfaceC6340pj.mo29446C(i12, C6193ij.m29749k(obj, m30144w & 1048575), m30145y(i11));
                        break;
                }
            }
        } else {
            if (this.f34163d) {
                this.f34169j.mo29550a(obj);
                throw null;
            }
            int length2 = this.f34160a.length;
            Unsafe unsafe = f34159n;
            int i13 = 1048575;
            int i14 = 0;
            for (int i15 = 0; i15 < length2; i15 += 3) {
                int m30144w2 = m30144w(i15);
                int[] iArr = this.f34160a;
                int i16 = iArr[i15];
                int m30131v = m30131v(m30144w2);
                if (m30131v <= 17) {
                    int i17 = iArr[i15 + 2];
                    int i18 = i17 & 1048575;
                    int i19 = i13;
                    if (i18 != i13) {
                        i14 = unsafe.getInt(obj, i18);
                        i19 = i18;
                    }
                    i13 = i19;
                    i10 = 1 << (i17 >>> 20);
                } else {
                    i10 = 0;
                }
                long j10 = m30144w2 & 1048575;
                switch (m30131v) {
                    case 0:
                        if ((i14 & i10) != 0) {
                            interfaceC6340pj.mo29462k(i16, C6193ij.m29744f(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if ((i14 & i10) != 0) {
                            interfaceC6340pj.mo29445B(i16, C6193ij.m29745g(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if ((i14 & i10) != 0) {
                            interfaceC6340pj.mo29454c(i16, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if ((i14 & i10) != 0) {
                            interfaceC6340pj.mo29469r(i16, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if ((i14 & i10) != 0) {
                            interfaceC6340pj.mo29460i(i16, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if ((i14 & i10) != 0) {
                            interfaceC6340pj.mo29448E(i16, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if ((i14 & i10) != 0) {
                            interfaceC6340pj.mo29471t(i16, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if ((i14 & i10) != 0) {
                            interfaceC6340pj.mo29455d(i16, C6193ij.m29735B(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if ((i14 & i10) != 0) {
                            m30126o(i16, unsafe.getObject(obj, j10), interfaceC6340pj);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if ((i14 & i10) != 0) {
                            interfaceC6340pj.mo29459h(i16, unsafe.getObject(obj, j10), m30145y(i15));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if ((i14 & i10) != 0) {
                            interfaceC6340pj.mo29449F(i16, (AbstractC6399sf) unsafe.getObject(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if ((i14 & i10) != 0) {
                            interfaceC6340pj.mo29475x(i16, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if ((i14 & i10) != 0) {
                            interfaceC6340pj.mo29473v(i16, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if ((i14 & i10) != 0) {
                            interfaceC6340pj.mo29466o(i16, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if ((i14 & i10) != 0) {
                            interfaceC6340pj.mo29463l(i16, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if ((i14 & i10) != 0) {
                            interfaceC6340pj.mo29476y(i16, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if ((i14 & i10) != 0) {
                            interfaceC6340pj.mo29465n(i16, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if ((i14 & i10) != 0) {
                            interfaceC6340pj.mo29446C(i16, unsafe.getObject(obj, j10), m30145y(i15));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        C6192ii.m29713f(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, false);
                        break;
                    case 19:
                        C6192ii.m29717j(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, false);
                        break;
                    case 20:
                        C6192ii.m29720m(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, false);
                        break;
                    case 21:
                        C6192ii.m29728u(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, false);
                        break;
                    case 22:
                        C6192ii.m29719l(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, false);
                        break;
                    case 23:
                        C6192ii.m29716i(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, false);
                        break;
                    case 24:
                        C6192ii.m29715h(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, false);
                        break;
                    case 25:
                        C6192ii.m29711d(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, false);
                        break;
                    case 26:
                        C6192ii.m29726s(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj);
                        break;
                    case 27:
                        C6192ii.m29721n(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, m30145y(i15));
                        break;
                    case 28:
                        C6192ii.m29712e(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj);
                        break;
                    case 29:
                        C6192ii.m29727t(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, false);
                        break;
                    case 30:
                        C6192ii.m29714g(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, false);
                        break;
                    case 31:
                        C6192ii.m29722o(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, false);
                        break;
                    case 32:
                        C6192ii.m29723p(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, false);
                        break;
                    case 33:
                        C6192ii.m29724q(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, false);
                        break;
                    case 34:
                        C6192ii.m29725r(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, false);
                        break;
                    case 35:
                        C6192ii.m29713f(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, true);
                        break;
                    case 36:
                        C6192ii.m29717j(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, true);
                        break;
                    case 37:
                        C6192ii.m29720m(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, true);
                        break;
                    case 38:
                        C6192ii.m29728u(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, true);
                        break;
                    case 39:
                        C6192ii.m29719l(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, true);
                        break;
                    case 40:
                        C6192ii.m29716i(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, true);
                        break;
                    case 41:
                        C6192ii.m29715h(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, true);
                        break;
                    case 42:
                        C6192ii.m29711d(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, true);
                        break;
                    case 43:
                        C6192ii.m29727t(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, true);
                        break;
                    case 44:
                        C6192ii.m29714g(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, true);
                        break;
                    case 45:
                        C6192ii.m29722o(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, true);
                        break;
                    case 46:
                        C6192ii.m29723p(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, true);
                        break;
                    case 47:
                        C6192ii.m29724q(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, true);
                        break;
                    case 48:
                        C6192ii.m29725r(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, true);
                        break;
                    case 49:
                        C6192ii.m29718k(this.f34160a[i15], (List) unsafe.getObject(obj, j10), interfaceC6340pj, m30145y(i15));
                        break;
                    case 50:
                        m30137F(interfaceC6340pj, i16, unsafe.getObject(obj, j10), i15);
                        break;
                    case 51:
                        if (m30141m(obj, i16, i15)) {
                            interfaceC6340pj.mo29462k(i16, m30128q(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (m30141m(obj, i16, i15)) {
                            interfaceC6340pj.mo29445B(i16, m30129r(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (m30141m(obj, i16, i15)) {
                            interfaceC6340pj.mo29454c(i16, m30132x(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (m30141m(obj, i16, i15)) {
                            interfaceC6340pj.mo29469r(i16, m30132x(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (m30141m(obj, i16, i15)) {
                            interfaceC6340pj.mo29460i(i16, m30130t(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (m30141m(obj, i16, i15)) {
                            interfaceC6340pj.mo29448E(i16, m30132x(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (m30141m(obj, i16, i15)) {
                            interfaceC6340pj.mo29471t(i16, m30130t(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (m30141m(obj, i16, i15)) {
                            interfaceC6340pj.mo29455d(i16, m30125n(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (m30141m(obj, i16, i15)) {
                            m30126o(i16, unsafe.getObject(obj, j10), interfaceC6340pj);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (m30141m(obj, i16, i15)) {
                            interfaceC6340pj.mo29459h(i16, unsafe.getObject(obj, j10), m30145y(i15));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (m30141m(obj, i16, i15)) {
                            interfaceC6340pj.mo29449F(i16, (AbstractC6399sf) unsafe.getObject(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (m30141m(obj, i16, i15)) {
                            interfaceC6340pj.mo29475x(i16, m30130t(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (m30141m(obj, i16, i15)) {
                            interfaceC6340pj.mo29473v(i16, m30130t(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (m30141m(obj, i16, i15)) {
                            interfaceC6340pj.mo29466o(i16, m30130t(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (m30141m(obj, i16, i15)) {
                            interfaceC6340pj.mo29463l(i16, m30132x(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (m30141m(obj, i16, i15)) {
                            interfaceC6340pj.mo29476y(i16, m30130t(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (m30141m(obj, i16, i15)) {
                            interfaceC6340pj.mo29465n(i16, m30132x(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (m30141m(obj, i16, i15)) {
                            interfaceC6340pj.mo29446C(i16, unsafe.getObject(obj, j10), m30145y(i15));
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        AbstractC6504xi abstractC6504xi = this.f34168i;
        abstractC6504xi.mo30153g(abstractC6504xi.mo30149c(obj), interfaceC6340pj);
    }

    @Override // ma.InterfaceC6150gi
    /* renamed from: e */
    public final boolean mo29646e(Object obj, Object obj2) {
        int length = this.f34160a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int m30144w = m30144w(i10);
            int m30131v = m30131v(m30144w);
            long j10 = m30144w & 1048575;
            switch (m30131v) {
                case 0:
                    if (!m30138G(obj, obj2, i10) || Double.doubleToLongBits(C6193ij.m29744f(obj, j10)) != Double.doubleToLongBits(C6193ij.m29744f(obj2, j10))) {
                        return false;
                    }
                    break;
                case 1:
                    if (!m30138G(obj, obj2, i10) || Float.floatToIntBits(C6193ij.m29745g(obj, j10)) != Float.floatToIntBits(C6193ij.m29745g(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!m30138G(obj, obj2, i10) || C6193ij.m29747i(obj, j10) != C6193ij.m29747i(obj2, j10)) {
                        return false;
                    }
                    break;
                case 3:
                    if (!m30138G(obj, obj2, i10) || C6193ij.m29747i(obj, j10) != C6193ij.m29747i(obj2, j10)) {
                        return false;
                    }
                    break;
                case 4:
                    if (!m30138G(obj, obj2, i10) || C6193ij.m29746h(obj, j10) != C6193ij.m29746h(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!m30138G(obj, obj2, i10) || C6193ij.m29747i(obj, j10) != C6193ij.m29747i(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!m30138G(obj, obj2, i10) || C6193ij.m29746h(obj, j10) != C6193ij.m29746h(obj2, j10)) {
                        return false;
                    }
                    break;
                case 7:
                    if (!m30138G(obj, obj2, i10) || C6193ij.m29735B(obj, j10) != C6193ij.m29735B(obj2, j10)) {
                        return false;
                    }
                    break;
                case 8:
                    if (!m30138G(obj, obj2, i10) || !C6192ii.m29729v(C6193ij.m29749k(obj, j10), C6193ij.m29749k(obj2, j10))) {
                        return false;
                    }
                    break;
                case 9:
                    if (!m30138G(obj, obj2, i10) || !C6192ii.m29729v(C6193ij.m29749k(obj, j10), C6193ij.m29749k(obj2, j10))) {
                        return false;
                    }
                    break;
                case 10:
                    if (!m30138G(obj, obj2, i10) || !C6192ii.m29729v(C6193ij.m29749k(obj, j10), C6193ij.m29749k(obj2, j10))) {
                        return false;
                    }
                    break;
                case 11:
                    if (!m30138G(obj, obj2, i10) || C6193ij.m29746h(obj, j10) != C6193ij.m29746h(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 12:
                    if (!m30138G(obj, obj2, i10) || C6193ij.m29746h(obj, j10) != C6193ij.m29746h(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!m30138G(obj, obj2, i10) || C6193ij.m29746h(obj, j10) != C6193ij.m29746h(obj2, j10)) {
                        return false;
                    }
                    break;
                case 14:
                    if (!m30138G(obj, obj2, i10) || C6193ij.m29747i(obj, j10) != C6193ij.m29747i(obj2, j10)) {
                        return false;
                    }
                    break;
                case 15:
                    if (!m30138G(obj, obj2, i10) || C6193ij.m29746h(obj, j10) != C6193ij.m29746h(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!m30138G(obj, obj2, i10) || C6193ij.m29747i(obj, j10) != C6193ij.m29747i(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 17:
                    if (!m30138G(obj, obj2, i10) || !C6192ii.m29729v(C6193ij.m29749k(obj, j10), C6193ij.m29749k(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (!C6192ii.m29729v(C6193ij.m29749k(obj, j10), C6193ij.m29749k(obj2, j10))) {
                        return false;
                    }
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long m30143u = m30143u(i10) & 1048575;
                    if (C6193ij.m29746h(obj, m30143u) != C6193ij.m29746h(obj2, m30143u) || !C6192ii.m29729v(C6193ij.m29749k(obj, j10), C6193ij.m29749k(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!this.f34168i.mo30149c(obj).equals(this.f34168i.mo30149c(obj2))) {
            return false;
        }
        if (!this.f34163d) {
            return true;
        }
        this.f34169j.mo29550a(obj);
        this.f34169j.mo29550a(obj2);
        throw null;
    }

    @Override // ma.InterfaceC6150gi
    /* renamed from: f */
    public final void mo29647f(Object obj, Object obj2) {
        if (!m30124k(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        for (int i10 = 0; i10 < this.f34160a.length; i10 += 3) {
            int m30144w = m30144w(i10);
            int i11 = this.f34160a[i10];
            int m30131v = m30131v(m30144w);
            long j10 = 1048575 & m30144w;
            switch (m30131v) {
                case 0:
                    if (m30139h(obj2, i10)) {
                        C6193ij.m29758t(obj, j10, C6193ij.m29744f(obj2, j10));
                        m30135D(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m30139h(obj2, i10)) {
                        C6193ij.m29759u(obj, j10, C6193ij.m29745g(obj2, j10));
                        m30135D(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!m30139h(obj2, i10)) {
                        break;
                    }
                    C6193ij.m29761w(obj, j10, C6193ij.m29747i(obj2, j10));
                    m30135D(obj, i10);
                    break;
                case 3:
                    if (!m30139h(obj2, i10)) {
                        break;
                    }
                    C6193ij.m29761w(obj, j10, C6193ij.m29747i(obj2, j10));
                    m30135D(obj, i10);
                    break;
                case 4:
                    if (!m30139h(obj2, i10)) {
                        break;
                    }
                    C6193ij.m29760v(obj, j10, C6193ij.m29746h(obj2, j10));
                    m30135D(obj, i10);
                    break;
                case 5:
                    if (!m30139h(obj2, i10)) {
                        break;
                    }
                    C6193ij.m29761w(obj, j10, C6193ij.m29747i(obj2, j10));
                    m30135D(obj, i10);
                    break;
                case 6:
                    if (!m30139h(obj2, i10)) {
                        break;
                    }
                    C6193ij.m29760v(obj, j10, C6193ij.m29746h(obj2, j10));
                    m30135D(obj, i10);
                    break;
                case 7:
                    if (m30139h(obj2, i10)) {
                        C6193ij.m29756r(obj, j10, C6193ij.m29735B(obj2, j10));
                        m30135D(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!m30139h(obj2, i10)) {
                        break;
                    }
                    C6193ij.m29762x(obj, j10, C6193ij.m29749k(obj2, j10));
                    m30135D(obj, i10);
                    break;
                case 9:
                case 17:
                    m30133B(obj, obj2, i10);
                    break;
                case 10:
                    if (!m30139h(obj2, i10)) {
                        break;
                    }
                    C6193ij.m29762x(obj, j10, C6193ij.m29749k(obj2, j10));
                    m30135D(obj, i10);
                    break;
                case 11:
                    if (!m30139h(obj2, i10)) {
                        break;
                    }
                    C6193ij.m29760v(obj, j10, C6193ij.m29746h(obj2, j10));
                    m30135D(obj, i10);
                    break;
                case 12:
                    if (!m30139h(obj2, i10)) {
                        break;
                    }
                    C6193ij.m29760v(obj, j10, C6193ij.m29746h(obj2, j10));
                    m30135D(obj, i10);
                    break;
                case 13:
                    if (!m30139h(obj2, i10)) {
                        break;
                    }
                    C6193ij.m29760v(obj, j10, C6193ij.m29746h(obj2, j10));
                    m30135D(obj, i10);
                    break;
                case 14:
                    if (!m30139h(obj2, i10)) {
                        break;
                    }
                    C6193ij.m29761w(obj, j10, C6193ij.m29747i(obj2, j10));
                    m30135D(obj, i10);
                    break;
                case 15:
                    if (!m30139h(obj2, i10)) {
                        break;
                    }
                    C6193ij.m29760v(obj, j10, C6193ij.m29746h(obj2, j10));
                    m30135D(obj, i10);
                    break;
                case 16:
                    if (!m30139h(obj2, i10)) {
                        break;
                    }
                    C6193ij.m29761w(obj, j10, C6193ij.m29747i(obj2, j10));
                    m30135D(obj, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f34167h.mo29554b(obj, obj2, j10);
                    break;
                case 50:
                    Class cls = C6192ii.f33825a;
                    Object m29749k = C6193ij.m29749k(obj, j10);
                    Object m29749k2 = C6193ij.m29749k(obj2, j10);
                    C6317oh c6317oh = (C6317oh) m29749k;
                    C6317oh c6317oh2 = (C6317oh) m29749k2;
                    C6317oh c6317oh3 = c6317oh;
                    if (!c6317oh2.isEmpty()) {
                        c6317oh3 = c6317oh;
                        if (!c6317oh.m29941e()) {
                            c6317oh3 = c6317oh.m29938b();
                        }
                        c6317oh3.m29940d(c6317oh2);
                    }
                    C6193ij.m29762x(obj, j10, c6317oh3);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!m30141m(obj2, i11, i10)) {
                        break;
                    }
                    C6193ij.m29762x(obj, j10, C6193ij.m29749k(obj2, j10));
                    m30136E(obj, i11, i10);
                    break;
                case 60:
                case 68:
                    m30134C(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m30141m(obj2, i11, i10)) {
                        break;
                    }
                    C6193ij.m29762x(obj, j10, C6193ij.m29749k(obj2, j10));
                    m30136E(obj, i11, i10);
                    break;
            }
        }
        C6192ii.m29709b(this.f34168i, obj, obj2);
        if (this.f34163d) {
            this.f34169j.mo29550a(obj2);
            throw null;
        }
    }

    @Override // ma.InterfaceC6150gi
    /* renamed from: g */
    public final boolean mo29648g(Object obj) {
        int i10 = 1048575;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f34166g; i12++) {
            int i13 = this.f34165f[i12];
            int i14 = this.f34160a[i13];
            int m30144w = m30144w(i13);
            int i15 = this.f34160a[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i10) {
                if (i16 != 1048575) {
                    i11 = f34159n.getInt(obj, i16);
                }
                i10 = i16;
            }
            if ((268435456 & m30144w) != 0 && !m30140i(obj, i13, i10, i11, i17)) {
                return false;
            }
            int m30131v = m30131v(m30144w);
            if (m30131v != 9 && m30131v != 17) {
                if (m30131v != 27) {
                    if (m30131v == 60 || m30131v == 68) {
                        if (m30141m(obj, i14, i13) && !m30123j(obj, m30144w, m30145y(i13))) {
                            return false;
                        }
                    } else if (m30131v != 49) {
                        if (m30131v == 50 && !((C6317oh) C6193ij.m29749k(obj, m30144w & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) C6193ij.m29749k(obj, m30144w & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC6150gi m30145y = m30145y(i13);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!m30145y.mo29648g(list.get(i18))) {
                            return false;
                        }
                    }
                }
            } else if (m30140i(obj, i13, i10, i11, i17) && !m30123j(obj, m30144w, m30145y(i13))) {
                return false;
            }
        }
        if (!this.f34163d) {
            return true;
        }
        this.f34169j.mo29550a(obj);
        throw null;
    }

    /* renamed from: h */
    public final boolean m30139h(Object obj, int i10) {
        int m30143u = m30143u(i10);
        long j10 = m30143u & 1048575;
        if (j10 != 1048575) {
            return (C6193ij.m29746h(obj, j10) & (1 << (m30143u >>> 20))) != 0;
        }
        int m30144w = m30144w(i10);
        int m30131v = m30131v(m30144w);
        long j11 = m30144w & 1048575;
        switch (m30131v) {
            case 0:
                return Double.doubleToRawLongBits(C6193ij.m29744f(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(C6193ij.m29745g(obj, j11)) != 0;
            case 2:
                return C6193ij.m29747i(obj, j11) != 0;
            case 3:
                return C6193ij.m29747i(obj, j11) != 0;
            case 4:
                return C6193ij.m29746h(obj, j11) != 0;
            case 5:
                return C6193ij.m29747i(obj, j11) != 0;
            case 6:
                return C6193ij.m29746h(obj, j11) != 0;
            case 7:
                return C6193ij.m29735B(obj, j11);
            case 8:
                Object m29749k = C6193ij.m29749k(obj, j11);
                if (m29749k instanceof String) {
                    return !((String) m29749k).isEmpty();
                }
                if (m29749k instanceof AbstractC6399sf) {
                    return !AbstractC6399sf.f34033c.equals(m29749k);
                }
                throw new IllegalArgumentException();
            case 9:
                return C6193ij.m29749k(obj, j11) != null;
            case 10:
                return !AbstractC6399sf.f34033c.equals(C6193ij.m29749k(obj, j11));
            case 11:
                return C6193ij.m29746h(obj, j11) != 0;
            case 12:
                return C6193ij.m29746h(obj, j11) != 0;
            case 13:
                return C6193ij.m29746h(obj, j11) != 0;
            case 14:
                return C6193ij.m29747i(obj, j11) != 0;
            case 15:
                return C6193ij.m29746h(obj, j11) != 0;
            case 16:
                return C6193ij.m29747i(obj, j11) != 0;
            case 17:
                return C6193ij.m29749k(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: i */
    public final boolean m30140i(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? m30139h(obj, i10) : (i12 & i13) != 0;
    }

    @Override // ma.InterfaceC6150gi
    /* renamed from: l */
    public final Object mo29649l() {
        return ((AbstractC6295ng) this.f34162c).m29918u();
    }

    /* renamed from: m */
    public final boolean m30141m(Object obj, int i10, int i11) {
        return C6193ij.m29746h(obj, (long) (m30143u(i11) & 1048575)) == i10;
    }

    /* renamed from: s */
    public final int m30142s(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13;
        int m29407z;
        int m29406y;
        int m29406y2;
        Object object;
        int i14;
        int m29701Q;
        int i15;
        int m29406y3;
        Object object2;
        int i16;
        Unsafe unsafe = f34159n;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1048575;
        int i20 = 0;
        while (true) {
            int i21 = i20;
            if (i17 >= this.f34160a.length) {
                AbstractC6504xi abstractC6504xi = this.f34168i;
                int mo30147a = abstractC6504xi.mo30147a(abstractC6504xi.mo30149c(obj));
                if (!this.f34163d) {
                    return i18 + mo30147a;
                }
                this.f34169j.mo29550a(obj);
                throw null;
            }
            int m30144w = m30144w(i17);
            int[] iArr = this.f34160a;
            int i22 = iArr[i17];
            int m30131v = m30131v(m30144w);
            if (m30131v <= 17) {
                int i23 = iArr[i17 + 2];
                int i24 = i23 & 1048575;
                i12 = i19;
                if (i24 != i19) {
                    i21 = unsafe.getInt(obj, i24);
                    i12 = i24;
                }
                i10 = 1 << (i23 >>> 20);
                i11 = i21;
            } else {
                i10 = 0;
                i11 = i21;
                i12 = i19;
            }
            long j10 = m30144w & 1048575;
            switch (m30131v) {
                case 0:
                    i13 = i18;
                    if ((i11 & i10) == 0) {
                        break;
                    }
                    m29406y2 = AbstractC6022ag.m29406y(i22 << 3) + 8;
                    i13 = i18 + m29406y2;
                    break;
                case 1:
                    i13 = i18;
                    if ((i11 & i10) == 0) {
                        break;
                    }
                    m29406y2 = AbstractC6022ag.m29406y(i22 << 3) + 4;
                    i13 = i18 + m29406y2;
                    break;
                case 2:
                    i13 = i18;
                    if ((i11 & i10) == 0) {
                        break;
                    }
                    m29407z = AbstractC6022ag.m29407z(unsafe.getLong(obj, j10));
                    m29406y = AbstractC6022ag.m29406y(i22 << 3);
                    i13 = i18 + m29406y + m29407z;
                    break;
                case 3:
                    i13 = i18;
                    if ((i11 & i10) == 0) {
                        break;
                    }
                    m29407z = AbstractC6022ag.m29407z(unsafe.getLong(obj, j10));
                    m29406y = AbstractC6022ag.m29406y(i22 << 3);
                    i13 = i18 + m29406y + m29407z;
                    break;
                case 4:
                    i13 = i18;
                    if ((i11 & i10) == 0) {
                        break;
                    }
                    i14 = i22 << 3;
                    m29407z = AbstractC6022ag.m29403v(unsafe.getInt(obj, j10));
                    m29406y = AbstractC6022ag.m29406y(i14);
                    i13 = i18 + m29406y + m29407z;
                    break;
                case 5:
                    i13 = i18;
                    if ((i11 & i10) == 0) {
                        break;
                    }
                    m29406y2 = AbstractC6022ag.m29406y(i22 << 3) + 8;
                    i13 = i18 + m29406y2;
                    break;
                case 6:
                    i13 = i18;
                    if ((i11 & i10) == 0) {
                        break;
                    }
                    m29406y2 = AbstractC6022ag.m29406y(i22 << 3) + 4;
                    i13 = i18 + m29406y2;
                    break;
                case 7:
                    i13 = i18;
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        m29406y2 = AbstractC6022ag.m29406y(i22 << 3) + 1;
                        i13 = i18 + m29406y2;
                        break;
                    }
                case 8:
                    i13 = i18;
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        object = unsafe.getObject(obj, j10);
                        if (!(object instanceof AbstractC6399sf)) {
                            i14 = i22 << 3;
                            m29407z = AbstractC6022ag.m29405x((String) object);
                            m29406y = AbstractC6022ag.m29406y(i14);
                            i13 = i18 + m29406y + m29407z;
                            break;
                        }
                        Logger logger = AbstractC6022ag.f33661b;
                        int mo29850d = ((AbstractC6399sf) object).mo29850d();
                        m29406y2 = AbstractC6022ag.m29406y(i22 << 3) + AbstractC6022ag.m29406y(mo29850d) + mo29850d;
                        i13 = i18 + m29406y2;
                        break;
                    }
                case 9:
                    i13 = i18;
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        m29406y2 = C6192ii.m29695K(i22, unsafe.getObject(obj, j10), m30145y(i17));
                        i13 = i18 + m29406y2;
                        break;
                    }
                case 10:
                    i13 = i18;
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        object = unsafe.getObject(obj, j10);
                        Logger logger2 = AbstractC6022ag.f33661b;
                        int mo29850d2 = ((AbstractC6399sf) object).mo29850d();
                        m29406y2 = AbstractC6022ag.m29406y(i22 << 3) + AbstractC6022ag.m29406y(mo29850d2) + mo29850d2;
                        i13 = i18 + m29406y2;
                        break;
                    }
                case 11:
                    i13 = i18;
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        i14 = i22 << 3;
                        m29407z = AbstractC6022ag.m29406y(unsafe.getInt(obj, j10));
                        m29406y = AbstractC6022ag.m29406y(i14);
                        i13 = i18 + m29406y + m29407z;
                        break;
                    }
                case 12:
                    i13 = i18;
                    if ((i11 & i10) == 0) {
                        break;
                    }
                    i14 = i22 << 3;
                    m29407z = AbstractC6022ag.m29403v(unsafe.getInt(obj, j10));
                    m29406y = AbstractC6022ag.m29406y(i14);
                    i13 = i18 + m29406y + m29407z;
                    break;
                case 13:
                    i13 = i18;
                    if ((i11 & i10) == 0) {
                        break;
                    }
                    m29406y2 = AbstractC6022ag.m29406y(i22 << 3) + 4;
                    i13 = i18 + m29406y2;
                    break;
                case 14:
                    i13 = i18;
                    if ((i11 & i10) == 0) {
                        break;
                    }
                    m29406y2 = AbstractC6022ag.m29406y(i22 << 3) + 8;
                    i13 = i18 + m29406y2;
                    break;
                case 15:
                    i13 = i18;
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        int i25 = unsafe.getInt(obj, j10);
                        m29406y = AbstractC6022ag.m29406y(i22 << 3);
                        m29407z = AbstractC6022ag.m29406y((i25 >> 31) ^ (i25 + i25));
                        i13 = i18 + m29406y + m29407z;
                        break;
                    }
                case 16:
                    i13 = i18;
                    if ((i10 & i11) == 0) {
                        break;
                    } else {
                        long j11 = unsafe.getLong(obj, j10);
                        i13 = i18 + AbstractC6022ag.m29406y(i22 << 3) + AbstractC6022ag.m29407z((j11 >> 63) ^ (j11 + j11));
                        break;
                    }
                case 17:
                    i13 = i18;
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        m29406y2 = AbstractC6022ag.m29402u(i22, (InterfaceC6443uh) unsafe.getObject(obj, j10), m30145y(i17));
                        i13 = i18 + m29406y2;
                        break;
                    }
                case 18:
                case 23:
                    m29406y2 = C6192ii.m29688D(i22, (List) unsafe.getObject(obj, j10), false);
                    i13 = i18 + m29406y2;
                    break;
                case 19:
                case 24:
                    m29406y2 = C6192ii.m29686B(i22, (List) unsafe.getObject(obj, j10), false);
                    i13 = i18 + m29406y2;
                    break;
                case 20:
                    m29406y2 = C6192ii.m29693I(i22, (List) unsafe.getObject(obj, j10), false);
                    i13 = i18 + m29406y2;
                    break;
                case 21:
                    m29406y2 = C6192ii.m29704T(i22, (List) unsafe.getObject(obj, j10), false);
                    i13 = i18 + m29406y2;
                    break;
                case 22:
                    m29406y2 = C6192ii.m29691G(i22, (List) unsafe.getObject(obj, j10), false);
                    i13 = i18 + m29406y2;
                    break;
                case 25:
                    m29406y2 = C6192ii.m29731x(i22, (List) unsafe.getObject(obj, j10), false);
                    i13 = i18 + m29406y2;
                    break;
                case 26:
                    m29701Q = C6192ii.m29701Q(i22, (List) unsafe.getObject(obj, j10));
                    i13 = i18 + m29701Q;
                    break;
                case 27:
                    m29701Q = C6192ii.m29696L(i22, (List) unsafe.getObject(obj, j10), m30145y(i17));
                    i13 = i18 + m29701Q;
                    break;
                case 28:
                    m29701Q = C6192ii.m29732y(i22, (List) unsafe.getObject(obj, j10));
                    i13 = i18 + m29701Q;
                    break;
                case 29:
                    m29701Q = C6192ii.m29702R(i22, (List) unsafe.getObject(obj, j10), false);
                    i13 = i18 + m29701Q;
                    break;
                case 30:
                    m29701Q = C6192ii.m29733z(i22, (List) unsafe.getObject(obj, j10), false);
                    i13 = i18 + m29701Q;
                    break;
                case 31:
                    m29701Q = C6192ii.m29686B(i22, (List) unsafe.getObject(obj, j10), false);
                    i13 = i18 + m29701Q;
                    break;
                case 32:
                    m29701Q = C6192ii.m29688D(i22, (List) unsafe.getObject(obj, j10), false);
                    i13 = i18 + m29701Q;
                    break;
                case 33:
                    m29701Q = C6192ii.m29697M(i22, (List) unsafe.getObject(obj, j10), false);
                    i13 = i18 + m29701Q;
                    break;
                case 34:
                    m29701Q = C6192ii.m29699O(i22, (List) unsafe.getObject(obj, j10), false);
                    i13 = i18 + m29701Q;
                    break;
                case 35:
                    int m29689E = C6192ii.m29689E((List) unsafe.getObject(obj, j10));
                    i13 = i18;
                    if (m29689E <= 0) {
                        break;
                    } else {
                        i15 = m29689E;
                        m29406y3 = AbstractC6022ag.m29406y(i22 << 3) + AbstractC6022ag.m29406y(i15);
                        i13 = i18 + m29406y3 + i15;
                        break;
                    }
                case 36:
                    int m29687C = C6192ii.m29687C((List) unsafe.getObject(obj, j10));
                    i13 = i18;
                    if (m29687C <= 0) {
                        break;
                    } else {
                        i15 = m29687C;
                        m29406y3 = AbstractC6022ag.m29406y(i22 << 3) + AbstractC6022ag.m29406y(i15);
                        i13 = i18 + m29406y3 + i15;
                        break;
                    }
                case 37:
                    int m29694J = C6192ii.m29694J((List) unsafe.getObject(obj, j10));
                    i13 = i18;
                    if (m29694J <= 0) {
                        break;
                    } else {
                        i15 = m29694J;
                        m29406y3 = AbstractC6022ag.m29406y(i22 << 3) + AbstractC6022ag.m29406y(i15);
                        i13 = i18 + m29406y3 + i15;
                        break;
                    }
                case 38:
                    int m29705U = C6192ii.m29705U((List) unsafe.getObject(obj, j10));
                    i13 = i18;
                    if (m29705U <= 0) {
                        break;
                    } else {
                        i15 = m29705U;
                        m29406y3 = AbstractC6022ag.m29406y(i22 << 3) + AbstractC6022ag.m29406y(i15);
                        i13 = i18 + m29406y3 + i15;
                        break;
                    }
                case 39:
                    int m29692H = C6192ii.m29692H((List) unsafe.getObject(obj, j10));
                    i13 = i18;
                    if (m29692H <= 0) {
                        break;
                    } else {
                        i15 = m29692H;
                        m29406y3 = AbstractC6022ag.m29406y(i22 << 3) + AbstractC6022ag.m29406y(i15);
                        i13 = i18 + m29406y3 + i15;
                        break;
                    }
                case 40:
                    int m29689E2 = C6192ii.m29689E((List) unsafe.getObject(obj, j10));
                    i13 = i18;
                    if (m29689E2 <= 0) {
                        break;
                    } else {
                        i15 = m29689E2;
                        m29406y3 = AbstractC6022ag.m29406y(i22 << 3) + AbstractC6022ag.m29406y(i15);
                        i13 = i18 + m29406y3 + i15;
                        break;
                    }
                case 41:
                    int m29687C2 = C6192ii.m29687C((List) unsafe.getObject(obj, j10));
                    i13 = i18;
                    if (m29687C2 <= 0) {
                        break;
                    } else {
                        i15 = m29687C2;
                        m29406y3 = AbstractC6022ag.m29406y(i22 << 3) + AbstractC6022ag.m29406y(i15);
                        i13 = i18 + m29406y3 + i15;
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j10);
                    Class cls = C6192ii.f33825a;
                    int size = list.size();
                    i13 = i18;
                    if (size <= 0) {
                        break;
                    } else {
                        i15 = size;
                        m29406y3 = AbstractC6022ag.m29406y(i22 << 3) + AbstractC6022ag.m29406y(i15);
                        i13 = i18 + m29406y3 + i15;
                        break;
                    }
                case 43:
                    int m29703S = C6192ii.m29703S((List) unsafe.getObject(obj, j10));
                    i13 = i18;
                    if (m29703S <= 0) {
                        break;
                    } else {
                        i15 = m29703S;
                        m29406y3 = AbstractC6022ag.m29406y(i22 << 3) + AbstractC6022ag.m29406y(i15);
                        i13 = i18 + m29406y3 + i15;
                        break;
                    }
                case 44:
                    int m29685A = C6192ii.m29685A((List) unsafe.getObject(obj, j10));
                    i13 = i18;
                    if (m29685A <= 0) {
                        break;
                    } else {
                        i15 = m29685A;
                        m29406y3 = AbstractC6022ag.m29406y(i22 << 3) + AbstractC6022ag.m29406y(i15);
                        i13 = i18 + m29406y3 + i15;
                        break;
                    }
                case 45:
                    int m29687C3 = C6192ii.m29687C((List) unsafe.getObject(obj, j10));
                    i13 = i18;
                    if (m29687C3 <= 0) {
                        break;
                    } else {
                        i15 = m29687C3;
                        m29406y3 = AbstractC6022ag.m29406y(i22 << 3) + AbstractC6022ag.m29406y(i15);
                        i13 = i18 + m29406y3 + i15;
                        break;
                    }
                case 46:
                    int m29689E3 = C6192ii.m29689E((List) unsafe.getObject(obj, j10));
                    i13 = i18;
                    if (m29689E3 <= 0) {
                        break;
                    } else {
                        i15 = m29689E3;
                        m29406y3 = AbstractC6022ag.m29406y(i22 << 3) + AbstractC6022ag.m29406y(i15);
                        i13 = i18 + m29406y3 + i15;
                        break;
                    }
                case 47:
                    int m29698N = C6192ii.m29698N((List) unsafe.getObject(obj, j10));
                    i13 = i18;
                    if (m29698N <= 0) {
                        break;
                    } else {
                        i15 = m29698N;
                        m29406y3 = AbstractC6022ag.m29406y(i22 << 3) + AbstractC6022ag.m29406y(i15);
                        i13 = i18 + m29406y3 + i15;
                        break;
                    }
                case 48:
                    int m29700P = C6192ii.m29700P((List) unsafe.getObject(obj, j10));
                    i13 = i18;
                    if (m29700P <= 0) {
                        break;
                    } else {
                        i15 = m29700P;
                        m29406y3 = AbstractC6022ag.m29406y(i22 << 3) + AbstractC6022ag.m29406y(i15);
                        i13 = i18 + m29406y3 + i15;
                        break;
                    }
                case 49:
                    m29701Q = C6192ii.m29690F(i22, (List) unsafe.getObject(obj, j10), m30145y(i17));
                    i13 = i18 + m29701Q;
                    break;
                case 50:
                    C6338ph.m29968a(i22, unsafe.getObject(obj, j10), m30146z(i17));
                    i13 = i18;
                    break;
                case 51:
                    i13 = i18;
                    if (!m30141m(obj, i22, i17)) {
                        break;
                    }
                    m29701Q = AbstractC6022ag.m29406y(i22 << 3) + 8;
                    i13 = i18 + m29701Q;
                    break;
                case 52:
                    i13 = i18;
                    if (!m30141m(obj, i22, i17)) {
                        break;
                    }
                    m29701Q = AbstractC6022ag.m29406y(i22 << 3) + 4;
                    i13 = i18 + m29701Q;
                    break;
                case 53:
                    i13 = i18;
                    if (!m30141m(obj, i22, i17)) {
                        break;
                    }
                    i15 = AbstractC6022ag.m29407z(m30132x(obj, j10));
                    m29406y3 = AbstractC6022ag.m29406y(i22 << 3);
                    i13 = i18 + m29406y3 + i15;
                    break;
                case 54:
                    i13 = i18;
                    if (!m30141m(obj, i22, i17)) {
                        break;
                    }
                    i15 = AbstractC6022ag.m29407z(m30132x(obj, j10));
                    m29406y3 = AbstractC6022ag.m29406y(i22 << 3);
                    i13 = i18 + m29406y3 + i15;
                    break;
                case 55:
                    i13 = i18;
                    if (!m30141m(obj, i22, i17)) {
                        break;
                    }
                    i16 = i22 << 3;
                    i15 = AbstractC6022ag.m29403v(m30130t(obj, j10));
                    m29406y3 = AbstractC6022ag.m29406y(i16);
                    i13 = i18 + m29406y3 + i15;
                    break;
                case 56:
                    i13 = i18;
                    if (!m30141m(obj, i22, i17)) {
                        break;
                    }
                    m29701Q = AbstractC6022ag.m29406y(i22 << 3) + 8;
                    i13 = i18 + m29701Q;
                    break;
                case 57:
                    i13 = i18;
                    if (!m30141m(obj, i22, i17)) {
                        break;
                    }
                    m29701Q = AbstractC6022ag.m29406y(i22 << 3) + 4;
                    i13 = i18 + m29701Q;
                    break;
                case 58:
                    i13 = i18;
                    if (!m30141m(obj, i22, i17)) {
                        break;
                    } else {
                        m29701Q = AbstractC6022ag.m29406y(i22 << 3) + 1;
                        i13 = i18 + m29701Q;
                        break;
                    }
                case 59:
                    i13 = i18;
                    if (!m30141m(obj, i22, i17)) {
                        break;
                    } else {
                        object2 = unsafe.getObject(obj, j10);
                        if (!(object2 instanceof AbstractC6399sf)) {
                            i16 = i22 << 3;
                            i15 = AbstractC6022ag.m29405x((String) object2);
                            m29406y3 = AbstractC6022ag.m29406y(i16);
                            i13 = i18 + m29406y3 + i15;
                            break;
                        }
                        Logger logger3 = AbstractC6022ag.f33661b;
                        int mo29850d3 = ((AbstractC6399sf) object2).mo29850d();
                        m29701Q = AbstractC6022ag.m29406y(i22 << 3) + AbstractC6022ag.m29406y(mo29850d3) + mo29850d3;
                        i13 = i18 + m29701Q;
                        break;
                    }
                case 60:
                    i13 = i18;
                    if (!m30141m(obj, i22, i17)) {
                        break;
                    } else {
                        m29701Q = C6192ii.m29695K(i22, unsafe.getObject(obj, j10), m30145y(i17));
                        i13 = i18 + m29701Q;
                        break;
                    }
                case 61:
                    i13 = i18;
                    if (!m30141m(obj, i22, i17)) {
                        break;
                    } else {
                        object2 = unsafe.getObject(obj, j10);
                        Logger logger32 = AbstractC6022ag.f33661b;
                        int mo29850d32 = ((AbstractC6399sf) object2).mo29850d();
                        m29701Q = AbstractC6022ag.m29406y(i22 << 3) + AbstractC6022ag.m29406y(mo29850d32) + mo29850d32;
                        i13 = i18 + m29701Q;
                        break;
                    }
                case 62:
                    i13 = i18;
                    if (!m30141m(obj, i22, i17)) {
                        break;
                    } else {
                        i16 = i22 << 3;
                        i15 = AbstractC6022ag.m29406y(m30130t(obj, j10));
                        m29406y3 = AbstractC6022ag.m29406y(i16);
                        i13 = i18 + m29406y3 + i15;
                        break;
                    }
                case 63:
                    i13 = i18;
                    if (!m30141m(obj, i22, i17)) {
                        break;
                    }
                    i16 = i22 << 3;
                    i15 = AbstractC6022ag.m29403v(m30130t(obj, j10));
                    m29406y3 = AbstractC6022ag.m29406y(i16);
                    i13 = i18 + m29406y3 + i15;
                    break;
                case 64:
                    i13 = i18;
                    if (!m30141m(obj, i22, i17)) {
                        break;
                    }
                    m29701Q = AbstractC6022ag.m29406y(i22 << 3) + 4;
                    i13 = i18 + m29701Q;
                    break;
                case 65:
                    i13 = i18;
                    if (!m30141m(obj, i22, i17)) {
                        break;
                    }
                    m29701Q = AbstractC6022ag.m29406y(i22 << 3) + 8;
                    i13 = i18 + m29701Q;
                    break;
                case 66:
                    i13 = i18;
                    if (!m30141m(obj, i22, i17)) {
                        break;
                    } else {
                        int m30130t = m30130t(obj, j10);
                        m29406y3 = AbstractC6022ag.m29406y(i22 << 3);
                        i15 = AbstractC6022ag.m29406y((m30130t >> 31) ^ (m30130t + m30130t));
                        i13 = i18 + m29406y3 + i15;
                        break;
                    }
                case 67:
                    i13 = i18;
                    if (!m30141m(obj, i22, i17)) {
                        break;
                    } else {
                        long m30132x = m30132x(obj, j10);
                        i13 = i18 + AbstractC6022ag.m29406y(i22 << 3) + AbstractC6022ag.m29407z((m30132x >> 63) ^ (m30132x + m30132x));
                        break;
                    }
                case 68:
                    i13 = i18;
                    if (!m30141m(obj, i22, i17)) {
                        break;
                    } else {
                        m29701Q = AbstractC6022ag.m29402u(i22, (InterfaceC6443uh) unsafe.getObject(obj, j10), m30145y(i17));
                        i13 = i18 + m29701Q;
                        break;
                    }
                default:
                    i13 = i18;
                    break;
            }
            i17 += 3;
            i18 = i13;
            i19 = i12;
            i20 = i11;
        }
    }

    /* renamed from: u */
    public final int m30143u(int i10) {
        return this.f34160a[i10 + 2];
    }

    /* renamed from: w */
    public final int m30144w(int i10) {
        return this.f34160a[i10 + 1];
    }

    /* renamed from: y */
    public final InterfaceC6150gi m30145y(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        InterfaceC6150gi interfaceC6150gi = (InterfaceC6150gi) this.f34161b[i12];
        if (interfaceC6150gi != null) {
            return interfaceC6150gi;
        }
        InterfaceC6150gi m29512b = C6066ci.m29511a().m29512b((Class) this.f34161b[i12 + 1]);
        this.f34161b[i12] = m29512b;
        return m29512b;
    }

    /* renamed from: z */
    public final Object m30146z(int i10) {
        int i11 = i10 / 3;
        return this.f34161b[i11 + i11];
    }
}
