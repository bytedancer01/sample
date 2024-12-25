package p305ra;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.apache.http.impl.auth.NTLMEngineImpl;
import sun.misc.Unsafe;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/u7.class
 */
/* renamed from: ra.u7 */
/* loaded from: combined.jar:classes2.jar:ra/u7.class */
public final class C8367u7<T> implements InterfaceC8098c8<T> {

    /* renamed from: p */
    public static final int[] f39303p = new int[0];

    /* renamed from: q */
    public static final Unsafe f39304q = C8099c9.m35106C();

    /* renamed from: a */
    public final int[] f39305a;

    /* renamed from: b */
    public final Object[] f39306b;

    /* renamed from: c */
    public final int f39307c;

    /* renamed from: d */
    public final int f39308d;

    /* renamed from: e */
    public final InterfaceC8307q7 f39309e;

    /* renamed from: f */
    public final boolean f39310f;

    /* renamed from: g */
    public final boolean f39311g;

    /* renamed from: h */
    public final int[] f39312h;

    /* renamed from: i */
    public final int f39313i;

    /* renamed from: j */
    public final int f39314j;

    /* renamed from: k */
    public final AbstractC8127e7 f39315k;

    /* renamed from: l */
    public final AbstractC8308q8<?, ?> f39316l;

    /* renamed from: m */
    public final AbstractC8440z5<?> f39317m;

    /* renamed from: n */
    public final C8397w7 f39318n;

    /* renamed from: o */
    public final C8232l7 f39319o;

    /* JADX WARN: Multi-variable type inference failed */
    public C8367u7(int[] iArr, int[] iArr2, Object[] objArr, int i10, int i11, InterfaceC8307q7 interfaceC8307q7, boolean z10, boolean z11, int[] iArr3, int i12, int i13, C8397w7 c8397w7, AbstractC8127e7 abstractC8127e7, AbstractC8308q8<?, ?> abstractC8308q8, AbstractC8440z5<?> abstractC8440z5, C8232l7 c8232l7) {
        this.f39305a = iArr;
        this.f39306b = iArr2;
        this.f39307c = objArr;
        this.f39308d = i10;
        this.f39311g = interfaceC8307q7;
        boolean z12 = false;
        if (abstractC8308q8 != 0) {
            z12 = false;
            if (abstractC8308q8.mo34996a(i11)) {
                z12 = true;
            }
        }
        this.f39310f = z12;
        this.f39312h = z11;
        this.f39313i = iArr3;
        this.f39314j = i12;
        this.f39318n = i13;
        this.f39315k = c8397w7;
        this.f39316l = abstractC8127e7;
        this.f39317m = abstractC8308q8;
        this.f39309e = i11;
        this.f39319o = abstractC8440z5;
    }

    /* renamed from: B */
    public static final void m35911B(int i10, Object obj, C8365u5 c8365u5) {
        if (obj instanceof String) {
            c8365u5.m35899x(i10, (String) obj);
        } else {
            c8365u5.m35900y(i10, (AbstractC8230l5) obj);
        }
    }

    /* renamed from: C */
    public static C8323r8 m35912C(Object obj) {
        AbstractC8231l6 abstractC8231l6 = (AbstractC8231l6) obj;
        C8323r8 c8323r8 = abstractC8231l6.zzc;
        C8323r8 c8323r82 = c8323r8;
        if (c8323r8 == C8323r8.m35762a()) {
            c8323r82 = C8323r8.m35763b();
            abstractC8231l6.zzc = c8323r82;
        }
        return c8323r82;
    }

    /* renamed from: E */
    public static <T> C8367u7<T> m35913E(Class<T> cls, InterfaceC8262n7 interfaceC8262n7, C8397w7 c8397w7, AbstractC8127e7 abstractC8127e7, AbstractC8308q8<?, ?> abstractC8308q8, AbstractC8440z5<?> abstractC8440z5, C8232l7 c8232l7) {
        if (interfaceC8262n7 instanceof C8083b8) {
            return m35914F((C8083b8) interfaceC8262n7, c8397w7, abstractC8127e7, abstractC8308q8, abstractC8440z5, c8232l7);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x06b9  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> p305ra.C8367u7<T> m35914F(p305ra.C8083b8 r19, p305ra.C8397w7 r20, p305ra.AbstractC8127e7 r21, p305ra.AbstractC8308q8<?, ?> r22, p305ra.AbstractC8440z5<?> r23, p305ra.C8232l7 r24) {
        /*
            Method dump skipped, instructions count: 2548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p305ra.C8367u7.m35914F(ra.b8, ra.w7, ra.e7, ra.q8, ra.z5, ra.l7):ra.u7");
    }

    /* renamed from: G */
    public static Field m35915G(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(arrays);
            throw new RuntimeException(sb2.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: S */
    public static boolean m35916S(Object obj, int i10, InterfaceC8098c8 interfaceC8098c8) {
        return interfaceC8098c8.mo35101f(C8099c9.m35139y(obj, i10 & 1048575));
    }

    /* renamed from: k */
    public static int m35917k(int i10) {
        return (i10 >>> 20) & 255;
    }

    /* renamed from: l */
    public static <T> double m35918l(T t10, long j10) {
        return ((Double) C8099c9.m35139y(t10, j10)).doubleValue();
    }

    /* renamed from: m */
    public static <T> float m35919m(T t10, long j10) {
        return ((Float) C8099c9.m35139y(t10, j10)).floatValue();
    }

    /* renamed from: n */
    public static <T> int m35920n(T t10, long j10) {
        return ((Integer) C8099c9.m35139y(t10, j10)).intValue();
    }

    /* renamed from: o */
    public static <T> long m35921o(T t10, long j10) {
        return ((Long) C8099c9.m35139y(t10, j10)).longValue();
    }

    /* renamed from: p */
    public static <T> boolean m35922p(T t10, long j10) {
        return ((Boolean) C8099c9.m35139y(t10, j10)).booleanValue();
    }

    /* renamed from: A */
    public final <K, V> void m35923A(C8365u5 c8365u5, int i10, Object obj, int i11) {
        if (obj == null) {
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0623, code lost:
    
        if (r25 == 1048575) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0626, code lost:
    
        r0.putInt(r17, r25, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0631, code lost:
    
        r23 = r16.f39313i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x063d, code lost:
    
        if (r23 >= r16.f39314j) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0640, code lost:
    
        r0 = r16.f39312h[r23];
        r0 = r16.f39305a[r0];
        r0 = p305ra.C8099c9.m35139y(r17, m35936i(r0) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0664, code lost:
    
        if (r0 != null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0670, code lost:
    
        if (m35934Q(r0) != null) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0679, code lost:
    
        r0 = (p305ra.C8217k7) r0;
        r0 = (p305ra.C8202j7) m35933P(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x068a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0673, code lost:
    
        r23 = r23 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x068d, code lost:
    
        if (r26 != 0) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0693, code lost:
    
        if (r19 != r20) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x069c, code lost:
    
        throw p305ra.C8396w6.m35990e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x06ab, code lost:
    
        return r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x06a0, code lost:
    
        if (r19 > r20) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x06a7, code lost:
    
        if (r21 != r26) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x06af, code lost:
    
        throw p305ra.C8396w6.m35990e();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m35924D(T r17, byte[] r18, int r19, int r20, int r21, p305ra.C8394w4 r22) {
        /*
            Method dump skipped, instructions count: 1712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p305ra.C8367u7.m35924D(java.lang.Object, byte[], int, int, int, ra.w4):int");
    }

    /* renamed from: H */
    public final void m35925H(T t10, T t11, int i10) {
        long m35936i = m35936i(i10) & 1048575;
        if (m35940s(t11, i10)) {
            Object m35139y = C8099c9.m35139y(t10, m35936i);
            Object m35139y2 = C8099c9.m35139y(t11, m35936i);
            if (m35139y != null && m35139y2 != null) {
                m35139y2 = C8366u6.m35910i(m35139y, m35139y2);
            } else if (m35139y2 == null) {
                return;
            }
            C8099c9.m35140z(t10, m35936i, m35139y2);
            m35941t(t10, i10);
        }
    }

    /* renamed from: I */
    public final void m35926I(T t10, T t11, int i10) {
        int m35936i = m35936i(i10);
        int i11 = this.f39305a[i10];
        long j10 = m35936i & 1048575;
        if (m35942u(t11, i11, i10)) {
            Object m35139y = m35942u(t10, i11, i10) ? C8099c9.m35139y(t10, j10) : null;
            Object m35139y2 = C8099c9.m35139y(t11, j10);
            if (m35139y != null && m35139y2 != null) {
                m35139y2 = C8366u6.m35910i(m35139y, m35139y2);
            } else if (m35139y2 == null) {
                return;
            }
            C8099c9.m35140z(t10, j10, m35139y2);
            m35943v(t10, i11, i10);
        }
    }

    /* renamed from: J */
    public final int m35927J(T t10) {
        int i10;
        int i11;
        int i12;
        long j10;
        Object obj;
        Object obj2;
        int i13;
        int i14;
        int i15;
        long j11;
        int m35287U;
        int i16;
        int m35812A;
        int m35812A2;
        int m35815D;
        int m35814C;
        Unsafe unsafe = f39304q;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 1048575;
        while (true) {
            int i21 = i20;
            if (i17 >= this.f39305a.length) {
                AbstractC8308q8<?, ?> abstractC8308q8 = this.f39316l;
                int mo35740h = abstractC8308q8.mo35740h(abstractC8308q8.mo35736d(t10));
                if (!this.f39310f) {
                    return i18 + mo35740h;
                }
                this.f39317m.mo34997b(t10);
                throw null;
            }
            int m35936i = m35936i(i17);
            int i22 = this.f39305a[i17];
            int m35917k = m35917k(m35936i);
            if (m35917k <= 17) {
                int i23 = this.f39305a[i17 + 2];
                int i24 = i23 & 1048575;
                int i25 = 1 << (i23 >>> 20);
                i11 = i21;
                i10 = i25;
                if (i24 != i21) {
                    i19 = unsafe.getInt(t10, i24);
                    i11 = i24;
                    i10 = i25;
                }
            } else {
                i10 = 0;
                i11 = i21;
            }
            long j12 = m35936i & 1048575;
            switch (m35917k) {
                case 0:
                    i12 = i18;
                    if ((i19 & i10) == 0) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i22) + 8;
                    i12 = i18 + m35287U;
                    break;
                case 1:
                    i12 = i18;
                    if ((i19 & i10) == 0) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i22) + 4;
                    i12 = i18 + m35287U;
                    break;
                case 2:
                    i12 = i18;
                    if ((i19 & i10) == 0) {
                        break;
                    }
                    j10 = unsafe.getLong(t10, j12);
                    m35812A2 = AbstractC8350t5.m35812A(i22);
                    m35815D = AbstractC8350t5.m35815D(j10);
                    m35287U = m35812A2 + m35815D;
                    i12 = i18 + m35287U;
                    break;
                case 3:
                    i12 = i18;
                    if ((i19 & i10) == 0) {
                        break;
                    }
                    j10 = unsafe.getLong(t10, j12);
                    m35812A2 = AbstractC8350t5.m35812A(i22);
                    m35815D = AbstractC8350t5.m35815D(j10);
                    m35287U = m35812A2 + m35815D;
                    i12 = i18 + m35287U;
                    break;
                case 4:
                    i12 = i18;
                    if ((i19 & i10) == 0) {
                        break;
                    }
                    i14 = unsafe.getInt(t10, j12);
                    m35812A = AbstractC8350t5.m35812A(i22);
                    i16 = AbstractC8350t5.m35813B(i14);
                    m35814C = m35812A + i16;
                    i12 = i18 + m35814C;
                    break;
                case 5:
                    i12 = i18;
                    if ((i19 & i10) == 0) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i22) + 8;
                    i12 = i18 + m35287U;
                    break;
                case 6:
                    i12 = i18;
                    if ((i19 & i10) == 0) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i22) + 4;
                    i12 = i18 + m35287U;
                    break;
                case 7:
                    i12 = i18;
                    if ((i19 & i10) == 0) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i22) + 1;
                    i12 = i18 + m35287U;
                    break;
                case 8:
                    i12 = i18;
                    if ((i19 & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(t10, j12);
                        obj = object;
                        if (object instanceof AbstractC8230l5) {
                            obj2 = object;
                            int m35812A3 = AbstractC8350t5.m35812A(i22);
                            int mo35264d = ((AbstractC8230l5) obj2).mo35264d();
                            m35814C = m35812A3 + AbstractC8350t5.m35814C(mo35264d) + mo35264d;
                            i12 = i18 + m35814C;
                            break;
                        }
                        m35812A = AbstractC8350t5.m35812A(i22);
                        i16 = AbstractC8350t5.m35816E((String) obj);
                        m35814C = m35812A + i16;
                        i12 = i18 + m35814C;
                    }
                case 9:
                    i12 = i18;
                    if ((i19 & i10) == 0) {
                        break;
                    }
                    m35287U = C8128e8.m35291Y(i22, unsafe.getObject(t10, j12), m35932O(i17));
                    i12 = i18 + m35287U;
                    break;
                case 10:
                    i12 = i18;
                    if ((i19 & i10) == 0) {
                        break;
                    }
                    obj2 = unsafe.getObject(t10, j12);
                    int m35812A32 = AbstractC8350t5.m35812A(i22);
                    int mo35264d2 = ((AbstractC8230l5) obj2).mo35264d();
                    m35814C = m35812A32 + AbstractC8350t5.m35814C(mo35264d2) + mo35264d2;
                    i12 = i18 + m35814C;
                    break;
                case 11:
                    i12 = i18;
                    if ((i19 & i10) == 0) {
                        break;
                    } else {
                        i13 = unsafe.getInt(t10, j12);
                        m35812A = AbstractC8350t5.m35812A(i22);
                        i16 = AbstractC8350t5.m35814C(i13);
                        m35814C = m35812A + i16;
                        i12 = i18 + m35814C;
                        break;
                    }
                case 12:
                    i12 = i18;
                    if ((i19 & i10) == 0) {
                        break;
                    }
                    i14 = unsafe.getInt(t10, j12);
                    m35812A = AbstractC8350t5.m35812A(i22);
                    i16 = AbstractC8350t5.m35813B(i14);
                    m35814C = m35812A + i16;
                    i12 = i18 + m35814C;
                    break;
                case 13:
                    i12 = i18;
                    if ((i19 & i10) == 0) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i22) + 4;
                    i12 = i18 + m35287U;
                    break;
                case 14:
                    i12 = i18;
                    if ((i19 & i10) == 0) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i22) + 8;
                    i12 = i18 + m35287U;
                    break;
                case 15:
                    i12 = i18;
                    if ((i19 & i10) == 0) {
                        break;
                    } else {
                        i15 = unsafe.getInt(t10, j12);
                        m35812A = AbstractC8350t5.m35812A(i22);
                        i13 = AbstractC8350t5.m35820c(i15);
                        i16 = AbstractC8350t5.m35814C(i13);
                        m35814C = m35812A + i16;
                        i12 = i18 + m35814C;
                        break;
                    }
                case 16:
                    i12 = i18;
                    if ((i19 & i10) == 0) {
                        break;
                    } else {
                        j11 = unsafe.getLong(t10, j12);
                        m35812A2 = AbstractC8350t5.m35812A(i22);
                        m35815D = AbstractC8350t5.m35815D(AbstractC8350t5.m35821d(j11));
                        m35287U = m35812A2 + m35815D;
                        i12 = i18 + m35287U;
                        break;
                    }
                case 17:
                    i12 = i18;
                    if ((i19 & i10) == 0) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35822g(i22, (InterfaceC8307q7) unsafe.getObject(t10, j12), m35932O(i17));
                    i12 = i18 + m35287U;
                    break;
                case 18:
                case 23:
                case 32:
                    m35287U = C8128e8.m35287U(i22, (List) unsafe.getObject(t10, j12), false);
                    i12 = i18 + m35287U;
                    break;
                case 19:
                case 24:
                case 31:
                    m35287U = C8128e8.m35285S(i22, (List) unsafe.getObject(t10, j12), false);
                    i12 = i18 + m35287U;
                    break;
                case 20:
                    m35287U = C8128e8.m35271E(i22, (List) unsafe.getObject(t10, j12), false);
                    i12 = i18 + m35287U;
                    break;
                case 21:
                    m35287U = C8128e8.m35273G(i22, (List) unsafe.getObject(t10, j12), false);
                    i12 = i18 + m35287U;
                    break;
                case 22:
                    m35287U = C8128e8.m35279M(i22, (List) unsafe.getObject(t10, j12), false);
                    i12 = i18 + m35287U;
                    break;
                case 25:
                    m35287U = C8128e8.m35289W(i22, (List) unsafe.getObject(t10, j12), false);
                    i12 = i18 + m35287U;
                    break;
                case 26:
                    m35287U = C8128e8.m35290X(i22, (List) unsafe.getObject(t10, j12));
                    i12 = i18 + m35287U;
                    break;
                case 27:
                    m35287U = C8128e8.m35292Z(i22, (List) unsafe.getObject(t10, j12), m35932O(i17));
                    i12 = i18 + m35287U;
                    break;
                case 28:
                    m35287U = C8128e8.m35294a0(i22, (List) unsafe.getObject(t10, j12));
                    i12 = i18 + m35287U;
                    break;
                case 29:
                    m35287U = C8128e8.m35281O(i22, (List) unsafe.getObject(t10, j12), false);
                    i12 = i18 + m35287U;
                    break;
                case 30:
                    m35287U = C8128e8.m35277K(i22, (List) unsafe.getObject(t10, j12), false);
                    i12 = i18 + m35287U;
                    break;
                case 33:
                    m35287U = C8128e8.m35283Q(i22, (List) unsafe.getObject(t10, j12), false);
                    i12 = i18 + m35287U;
                    break;
                case 34:
                    m35287U = C8128e8.m35275I(i22, (List) unsafe.getObject(t10, j12), false);
                    i12 = i18 + m35287U;
                    break;
                case 35:
                    int m35286T = C8128e8.m35286T((List) unsafe.getObject(t10, j12));
                    i12 = i18;
                    if (m35286T <= 0) {
                        break;
                    } else {
                        i16 = m35286T;
                        m35812A = AbstractC8350t5.m35812A(i22) + AbstractC8350t5.m35814C(i16);
                        m35814C = m35812A + i16;
                        i12 = i18 + m35814C;
                        break;
                    }
                case 36:
                    int m35284R = C8128e8.m35284R((List) unsafe.getObject(t10, j12));
                    i12 = i18;
                    if (m35284R <= 0) {
                        break;
                    } else {
                        i16 = m35284R;
                        m35812A = AbstractC8350t5.m35812A(i22) + AbstractC8350t5.m35814C(i16);
                        m35814C = m35812A + i16;
                        i12 = i18 + m35814C;
                        break;
                    }
                case 37:
                    int m35270D = C8128e8.m35270D((List) unsafe.getObject(t10, j12));
                    i12 = i18;
                    if (m35270D <= 0) {
                        break;
                    } else {
                        i16 = m35270D;
                        m35812A = AbstractC8350t5.m35812A(i22) + AbstractC8350t5.m35814C(i16);
                        m35814C = m35812A + i16;
                        i12 = i18 + m35814C;
                        break;
                    }
                case 38:
                    int m35272F = C8128e8.m35272F((List) unsafe.getObject(t10, j12));
                    i12 = i18;
                    if (m35272F <= 0) {
                        break;
                    } else {
                        i16 = m35272F;
                        m35812A = AbstractC8350t5.m35812A(i22) + AbstractC8350t5.m35814C(i16);
                        m35814C = m35812A + i16;
                        i12 = i18 + m35814C;
                        break;
                    }
                case 39:
                    int m35278L = C8128e8.m35278L((List) unsafe.getObject(t10, j12));
                    i12 = i18;
                    if (m35278L <= 0) {
                        break;
                    } else {
                        i16 = m35278L;
                        m35812A = AbstractC8350t5.m35812A(i22) + AbstractC8350t5.m35814C(i16);
                        m35814C = m35812A + i16;
                        i12 = i18 + m35814C;
                        break;
                    }
                case 40:
                    int m35286T2 = C8128e8.m35286T((List) unsafe.getObject(t10, j12));
                    i12 = i18;
                    if (m35286T2 <= 0) {
                        break;
                    } else {
                        i16 = m35286T2;
                        m35812A = AbstractC8350t5.m35812A(i22) + AbstractC8350t5.m35814C(i16);
                        m35814C = m35812A + i16;
                        i12 = i18 + m35814C;
                        break;
                    }
                case 41:
                    int m35284R2 = C8128e8.m35284R((List) unsafe.getObject(t10, j12));
                    i12 = i18;
                    if (m35284R2 <= 0) {
                        break;
                    } else {
                        i16 = m35284R2;
                        m35812A = AbstractC8350t5.m35812A(i22) + AbstractC8350t5.m35814C(i16);
                        m35814C = m35812A + i16;
                        i12 = i18 + m35814C;
                        break;
                    }
                case 42:
                    int m35288V = C8128e8.m35288V((List) unsafe.getObject(t10, j12));
                    i12 = i18;
                    if (m35288V <= 0) {
                        break;
                    } else {
                        i16 = m35288V;
                        m35812A = AbstractC8350t5.m35812A(i22) + AbstractC8350t5.m35814C(i16);
                        m35814C = m35812A + i16;
                        i12 = i18 + m35814C;
                        break;
                    }
                case 43:
                    int m35280N = C8128e8.m35280N((List) unsafe.getObject(t10, j12));
                    i12 = i18;
                    if (m35280N <= 0) {
                        break;
                    } else {
                        i16 = m35280N;
                        m35812A = AbstractC8350t5.m35812A(i22) + AbstractC8350t5.m35814C(i16);
                        m35814C = m35812A + i16;
                        i12 = i18 + m35814C;
                        break;
                    }
                case 44:
                    int m35276J = C8128e8.m35276J((List) unsafe.getObject(t10, j12));
                    i12 = i18;
                    if (m35276J <= 0) {
                        break;
                    } else {
                        i16 = m35276J;
                        m35812A = AbstractC8350t5.m35812A(i22) + AbstractC8350t5.m35814C(i16);
                        m35814C = m35812A + i16;
                        i12 = i18 + m35814C;
                        break;
                    }
                case 45:
                    int m35284R3 = C8128e8.m35284R((List) unsafe.getObject(t10, j12));
                    i12 = i18;
                    if (m35284R3 <= 0) {
                        break;
                    } else {
                        i16 = m35284R3;
                        m35812A = AbstractC8350t5.m35812A(i22) + AbstractC8350t5.m35814C(i16);
                        m35814C = m35812A + i16;
                        i12 = i18 + m35814C;
                        break;
                    }
                case 46:
                    int m35286T3 = C8128e8.m35286T((List) unsafe.getObject(t10, j12));
                    i12 = i18;
                    if (m35286T3 <= 0) {
                        break;
                    } else {
                        i16 = m35286T3;
                        m35812A = AbstractC8350t5.m35812A(i22) + AbstractC8350t5.m35814C(i16);
                        m35814C = m35812A + i16;
                        i12 = i18 + m35814C;
                        break;
                    }
                case 47:
                    int m35282P = C8128e8.m35282P((List) unsafe.getObject(t10, j12));
                    i12 = i18;
                    if (m35282P <= 0) {
                        break;
                    } else {
                        i16 = m35282P;
                        m35812A = AbstractC8350t5.m35812A(i22) + AbstractC8350t5.m35814C(i16);
                        m35814C = m35812A + i16;
                        i12 = i18 + m35814C;
                        break;
                    }
                case 48:
                    int m35274H = C8128e8.m35274H((List) unsafe.getObject(t10, j12));
                    i12 = i18;
                    if (m35274H <= 0) {
                        break;
                    } else {
                        i16 = m35274H;
                        m35812A = AbstractC8350t5.m35812A(i22) + AbstractC8350t5.m35814C(i16);
                        m35814C = m35812A + i16;
                        i12 = i18 + m35814C;
                        break;
                    }
                case 49:
                    m35287U = C8128e8.m35296b0(i22, (List) unsafe.getObject(t10, j12), m35932O(i17));
                    i12 = i18 + m35287U;
                    break;
                case 50:
                    C8232l7.m35591a(i22, unsafe.getObject(t10, j12), m35933P(i17));
                    i12 = i18;
                    break;
                case 51:
                    i12 = i18;
                    if (!m35942u(t10, i22, i17)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i22) + 8;
                    i12 = i18 + m35287U;
                    break;
                case 52:
                    i12 = i18;
                    if (!m35942u(t10, i22, i17)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i22) + 4;
                    i12 = i18 + m35287U;
                    break;
                case 53:
                    i12 = i18;
                    if (!m35942u(t10, i22, i17)) {
                        break;
                    }
                    j10 = m35921o(t10, j12);
                    m35812A2 = AbstractC8350t5.m35812A(i22);
                    m35815D = AbstractC8350t5.m35815D(j10);
                    m35287U = m35812A2 + m35815D;
                    i12 = i18 + m35287U;
                    break;
                case 54:
                    i12 = i18;
                    if (!m35942u(t10, i22, i17)) {
                        break;
                    }
                    j10 = m35921o(t10, j12);
                    m35812A2 = AbstractC8350t5.m35812A(i22);
                    m35815D = AbstractC8350t5.m35815D(j10);
                    m35287U = m35812A2 + m35815D;
                    i12 = i18 + m35287U;
                    break;
                case 55:
                    i12 = i18;
                    if (!m35942u(t10, i22, i17)) {
                        break;
                    }
                    i14 = m35920n(t10, j12);
                    m35812A = AbstractC8350t5.m35812A(i22);
                    i16 = AbstractC8350t5.m35813B(i14);
                    m35814C = m35812A + i16;
                    i12 = i18 + m35814C;
                    break;
                case 56:
                    i12 = i18;
                    if (!m35942u(t10, i22, i17)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i22) + 8;
                    i12 = i18 + m35287U;
                    break;
                case 57:
                    i12 = i18;
                    if (!m35942u(t10, i22, i17)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i22) + 4;
                    i12 = i18 + m35287U;
                    break;
                case 58:
                    i12 = i18;
                    if (!m35942u(t10, i22, i17)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i22) + 1;
                    i12 = i18 + m35287U;
                    break;
                case 59:
                    i12 = i18;
                    if (!m35942u(t10, i22, i17)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(t10, j12);
                        obj = object2;
                        if (object2 instanceof AbstractC8230l5) {
                            obj2 = object2;
                            int m35812A322 = AbstractC8350t5.m35812A(i22);
                            int mo35264d22 = ((AbstractC8230l5) obj2).mo35264d();
                            m35814C = m35812A322 + AbstractC8350t5.m35814C(mo35264d22) + mo35264d22;
                            i12 = i18 + m35814C;
                            break;
                        }
                        m35812A = AbstractC8350t5.m35812A(i22);
                        i16 = AbstractC8350t5.m35816E((String) obj);
                        m35814C = m35812A + i16;
                        i12 = i18 + m35814C;
                    }
                case 60:
                    i12 = i18;
                    if (!m35942u(t10, i22, i17)) {
                        break;
                    }
                    m35287U = C8128e8.m35291Y(i22, unsafe.getObject(t10, j12), m35932O(i17));
                    i12 = i18 + m35287U;
                    break;
                case 61:
                    i12 = i18;
                    if (!m35942u(t10, i22, i17)) {
                        break;
                    }
                    obj2 = unsafe.getObject(t10, j12);
                    int m35812A3222 = AbstractC8350t5.m35812A(i22);
                    int mo35264d222 = ((AbstractC8230l5) obj2).mo35264d();
                    m35814C = m35812A3222 + AbstractC8350t5.m35814C(mo35264d222) + mo35264d222;
                    i12 = i18 + m35814C;
                    break;
                case 62:
                    i12 = i18;
                    if (!m35942u(t10, i22, i17)) {
                        break;
                    } else {
                        i13 = m35920n(t10, j12);
                        m35812A = AbstractC8350t5.m35812A(i22);
                        i16 = AbstractC8350t5.m35814C(i13);
                        m35814C = m35812A + i16;
                        i12 = i18 + m35814C;
                        break;
                    }
                case 63:
                    i12 = i18;
                    if (!m35942u(t10, i22, i17)) {
                        break;
                    }
                    i14 = m35920n(t10, j12);
                    m35812A = AbstractC8350t5.m35812A(i22);
                    i16 = AbstractC8350t5.m35813B(i14);
                    m35814C = m35812A + i16;
                    i12 = i18 + m35814C;
                    break;
                case 64:
                    i12 = i18;
                    if (!m35942u(t10, i22, i17)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i22) + 4;
                    i12 = i18 + m35287U;
                    break;
                case 65:
                    i12 = i18;
                    if (!m35942u(t10, i22, i17)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i22) + 8;
                    i12 = i18 + m35287U;
                    break;
                case 66:
                    i12 = i18;
                    if (!m35942u(t10, i22, i17)) {
                        break;
                    } else {
                        i15 = m35920n(t10, j12);
                        m35812A = AbstractC8350t5.m35812A(i22);
                        i13 = AbstractC8350t5.m35820c(i15);
                        i16 = AbstractC8350t5.m35814C(i13);
                        m35814C = m35812A + i16;
                        i12 = i18 + m35814C;
                        break;
                    }
                case 67:
                    i12 = i18;
                    if (!m35942u(t10, i22, i17)) {
                        break;
                    } else {
                        j11 = m35921o(t10, j12);
                        m35812A2 = AbstractC8350t5.m35812A(i22);
                        m35815D = AbstractC8350t5.m35815D(AbstractC8350t5.m35821d(j11));
                        m35287U = m35812A2 + m35815D;
                        i12 = i18 + m35287U;
                        break;
                    }
                case 68:
                    i12 = i18;
                    if (!m35942u(t10, i22, i17)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35822g(i22, (InterfaceC8307q7) unsafe.getObject(t10, j12), m35932O(i17));
                    i12 = i18 + m35287U;
                    break;
                default:
                    i12 = i18;
                    break;
            }
            i17 += 3;
            i18 = i12;
            i20 = i11;
        }
    }

    /* renamed from: K */
    public final int m35928K(T t10) {
        int i10;
        long m35131q;
        Object obj;
        Object obj2;
        int m35129o;
        int m35129o2;
        int m35129o3;
        long m35131q2;
        int m35287U;
        int i11;
        int m35812A;
        int m35812A2;
        int m35814C;
        Unsafe unsafe = f39304q;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = i13;
            if (i12 >= this.f39305a.length) {
                AbstractC8308q8<?, ?> abstractC8308q8 = this.f39316l;
                return i14 + abstractC8308q8.mo35740h(abstractC8308q8.mo35736d(t10));
            }
            int m35936i = m35936i(i12);
            int m35917k = m35917k(m35936i);
            int i15 = this.f39305a[i12];
            long j10 = m35936i & 1048575;
            if (m35917k >= EnumC8126e6.zzJ.zza() && m35917k <= EnumC8126e6.zzW.zza()) {
                int i16 = this.f39305a[i12 + 2];
            }
            switch (m35917k) {
                case 0:
                    i10 = i14;
                    if (!m35940s(t10, i12)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i15) + 8;
                    i10 = i14 + m35287U;
                    break;
                case 1:
                    i10 = i14;
                    if (!m35940s(t10, i12)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i15) + 4;
                    i10 = i14 + m35287U;
                    break;
                case 2:
                    i10 = i14;
                    if (!m35940s(t10, i12)) {
                        break;
                    }
                    m35131q = C8099c9.m35131q(t10, j10);
                    m35812A2 = AbstractC8350t5.m35812A(i15);
                    i10 = i14 + m35812A2 + AbstractC8350t5.m35815D(m35131q);
                    break;
                case 3:
                    i10 = i14;
                    if (!m35940s(t10, i12)) {
                        break;
                    }
                    m35131q = C8099c9.m35131q(t10, j10);
                    m35812A2 = AbstractC8350t5.m35812A(i15);
                    i10 = i14 + m35812A2 + AbstractC8350t5.m35815D(m35131q);
                    break;
                case 4:
                    i10 = i14;
                    if (!m35940s(t10, i12)) {
                        break;
                    }
                    m35129o2 = C8099c9.m35129o(t10, j10);
                    m35812A = AbstractC8350t5.m35812A(i15);
                    i11 = AbstractC8350t5.m35813B(m35129o2);
                    m35814C = m35812A + i11;
                    i10 = i14 + m35814C;
                    break;
                case 5:
                    i10 = i14;
                    if (!m35940s(t10, i12)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i15) + 8;
                    i10 = i14 + m35287U;
                    break;
                case 6:
                    i10 = i14;
                    if (!m35940s(t10, i12)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i15) + 4;
                    i10 = i14 + m35287U;
                    break;
                case 7:
                    i10 = i14;
                    if (!m35940s(t10, i12)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i15) + 1;
                    i10 = i14 + m35287U;
                    break;
                case 8:
                    i10 = i14;
                    if (!m35940s(t10, i12)) {
                        break;
                    } else {
                        Object m35139y = C8099c9.m35139y(t10, j10);
                        obj = m35139y;
                        if (m35139y instanceof AbstractC8230l5) {
                            obj2 = m35139y;
                            int m35812A3 = AbstractC8350t5.m35812A(i15);
                            int mo35264d = ((AbstractC8230l5) obj2).mo35264d();
                            m35814C = m35812A3 + AbstractC8350t5.m35814C(mo35264d) + mo35264d;
                            i10 = i14 + m35814C;
                            break;
                        }
                        m35812A = AbstractC8350t5.m35812A(i15);
                        i11 = AbstractC8350t5.m35816E((String) obj);
                        m35814C = m35812A + i11;
                        i10 = i14 + m35814C;
                    }
                case 9:
                    i10 = i14;
                    if (!m35940s(t10, i12)) {
                        break;
                    }
                    m35287U = C8128e8.m35291Y(i15, C8099c9.m35139y(t10, j10), m35932O(i12));
                    i10 = i14 + m35287U;
                    break;
                case 10:
                    i10 = i14;
                    if (!m35940s(t10, i12)) {
                        break;
                    }
                    obj2 = C8099c9.m35139y(t10, j10);
                    int m35812A32 = AbstractC8350t5.m35812A(i15);
                    int mo35264d2 = ((AbstractC8230l5) obj2).mo35264d();
                    m35814C = m35812A32 + AbstractC8350t5.m35814C(mo35264d2) + mo35264d2;
                    i10 = i14 + m35814C;
                    break;
                case 11:
                    i10 = i14;
                    if (!m35940s(t10, i12)) {
                        break;
                    } else {
                        m35129o = C8099c9.m35129o(t10, j10);
                        m35812A = AbstractC8350t5.m35812A(i15);
                        i11 = AbstractC8350t5.m35814C(m35129o);
                        m35814C = m35812A + i11;
                        i10 = i14 + m35814C;
                        break;
                    }
                case 12:
                    i10 = i14;
                    if (!m35940s(t10, i12)) {
                        break;
                    }
                    m35129o2 = C8099c9.m35129o(t10, j10);
                    m35812A = AbstractC8350t5.m35812A(i15);
                    i11 = AbstractC8350t5.m35813B(m35129o2);
                    m35814C = m35812A + i11;
                    i10 = i14 + m35814C;
                    break;
                case 13:
                    i10 = i14;
                    if (!m35940s(t10, i12)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i15) + 4;
                    i10 = i14 + m35287U;
                    break;
                case 14:
                    i10 = i14;
                    if (!m35940s(t10, i12)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i15) + 8;
                    i10 = i14 + m35287U;
                    break;
                case 15:
                    i10 = i14;
                    if (!m35940s(t10, i12)) {
                        break;
                    } else {
                        m35129o3 = C8099c9.m35129o(t10, j10);
                        m35812A = AbstractC8350t5.m35812A(i15);
                        m35129o = AbstractC8350t5.m35820c(m35129o3);
                        i11 = AbstractC8350t5.m35814C(m35129o);
                        m35814C = m35812A + i11;
                        i10 = i14 + m35814C;
                        break;
                    }
                case 16:
                    i10 = i14;
                    if (!m35940s(t10, i12)) {
                        break;
                    } else {
                        m35131q2 = C8099c9.m35131q(t10, j10);
                        m35812A2 = AbstractC8350t5.m35812A(i15);
                        m35131q = AbstractC8350t5.m35821d(m35131q2);
                        i10 = i14 + m35812A2 + AbstractC8350t5.m35815D(m35131q);
                        break;
                    }
                case 17:
                    i10 = i14;
                    if (!m35940s(t10, i12)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35822g(i15, (InterfaceC8307q7) C8099c9.m35139y(t10, j10), m35932O(i12));
                    i10 = i14 + m35287U;
                    break;
                case 18:
                case 23:
                case 32:
                    m35287U = C8128e8.m35287U(i15, (List) C8099c9.m35139y(t10, j10), false);
                    i10 = i14 + m35287U;
                    break;
                case 19:
                case 24:
                case 31:
                    m35287U = C8128e8.m35285S(i15, (List) C8099c9.m35139y(t10, j10), false);
                    i10 = i14 + m35287U;
                    break;
                case 20:
                    m35287U = C8128e8.m35271E(i15, (List) C8099c9.m35139y(t10, j10), false);
                    i10 = i14 + m35287U;
                    break;
                case 21:
                    m35287U = C8128e8.m35273G(i15, (List) C8099c9.m35139y(t10, j10), false);
                    i10 = i14 + m35287U;
                    break;
                case 22:
                    m35287U = C8128e8.m35279M(i15, (List) C8099c9.m35139y(t10, j10), false);
                    i10 = i14 + m35287U;
                    break;
                case 25:
                    m35287U = C8128e8.m35289W(i15, (List) C8099c9.m35139y(t10, j10), false);
                    i10 = i14 + m35287U;
                    break;
                case 26:
                    m35287U = C8128e8.m35290X(i15, (List) C8099c9.m35139y(t10, j10));
                    i10 = i14 + m35287U;
                    break;
                case 27:
                    m35287U = C8128e8.m35292Z(i15, (List) C8099c9.m35139y(t10, j10), m35932O(i12));
                    i10 = i14 + m35287U;
                    break;
                case 28:
                    m35287U = C8128e8.m35294a0(i15, (List) C8099c9.m35139y(t10, j10));
                    i10 = i14 + m35287U;
                    break;
                case 29:
                    m35287U = C8128e8.m35281O(i15, (List) C8099c9.m35139y(t10, j10), false);
                    i10 = i14 + m35287U;
                    break;
                case 30:
                    m35287U = C8128e8.m35277K(i15, (List) C8099c9.m35139y(t10, j10), false);
                    i10 = i14 + m35287U;
                    break;
                case 33:
                    m35287U = C8128e8.m35283Q(i15, (List) C8099c9.m35139y(t10, j10), false);
                    i10 = i14 + m35287U;
                    break;
                case 34:
                    m35287U = C8128e8.m35275I(i15, (List) C8099c9.m35139y(t10, j10), false);
                    i10 = i14 + m35287U;
                    break;
                case 35:
                    int m35286T = C8128e8.m35286T((List) unsafe.getObject(t10, j10));
                    i10 = i14;
                    if (m35286T <= 0) {
                        break;
                    } else {
                        i11 = m35286T;
                        m35812A = AbstractC8350t5.m35812A(i15) + AbstractC8350t5.m35814C(i11);
                        m35814C = m35812A + i11;
                        i10 = i14 + m35814C;
                        break;
                    }
                case 36:
                    int m35284R = C8128e8.m35284R((List) unsafe.getObject(t10, j10));
                    i10 = i14;
                    if (m35284R <= 0) {
                        break;
                    } else {
                        i11 = m35284R;
                        m35812A = AbstractC8350t5.m35812A(i15) + AbstractC8350t5.m35814C(i11);
                        m35814C = m35812A + i11;
                        i10 = i14 + m35814C;
                        break;
                    }
                case 37:
                    int m35270D = C8128e8.m35270D((List) unsafe.getObject(t10, j10));
                    i10 = i14;
                    if (m35270D <= 0) {
                        break;
                    } else {
                        i11 = m35270D;
                        m35812A = AbstractC8350t5.m35812A(i15) + AbstractC8350t5.m35814C(i11);
                        m35814C = m35812A + i11;
                        i10 = i14 + m35814C;
                        break;
                    }
                case 38:
                    int m35272F = C8128e8.m35272F((List) unsafe.getObject(t10, j10));
                    i10 = i14;
                    if (m35272F <= 0) {
                        break;
                    } else {
                        i11 = m35272F;
                        m35812A = AbstractC8350t5.m35812A(i15) + AbstractC8350t5.m35814C(i11);
                        m35814C = m35812A + i11;
                        i10 = i14 + m35814C;
                        break;
                    }
                case 39:
                    int m35278L = C8128e8.m35278L((List) unsafe.getObject(t10, j10));
                    i10 = i14;
                    if (m35278L <= 0) {
                        break;
                    } else {
                        i11 = m35278L;
                        m35812A = AbstractC8350t5.m35812A(i15) + AbstractC8350t5.m35814C(i11);
                        m35814C = m35812A + i11;
                        i10 = i14 + m35814C;
                        break;
                    }
                case 40:
                    int m35286T2 = C8128e8.m35286T((List) unsafe.getObject(t10, j10));
                    i10 = i14;
                    if (m35286T2 <= 0) {
                        break;
                    } else {
                        i11 = m35286T2;
                        m35812A = AbstractC8350t5.m35812A(i15) + AbstractC8350t5.m35814C(i11);
                        m35814C = m35812A + i11;
                        i10 = i14 + m35814C;
                        break;
                    }
                case 41:
                    int m35284R2 = C8128e8.m35284R((List) unsafe.getObject(t10, j10));
                    i10 = i14;
                    if (m35284R2 <= 0) {
                        break;
                    } else {
                        i11 = m35284R2;
                        m35812A = AbstractC8350t5.m35812A(i15) + AbstractC8350t5.m35814C(i11);
                        m35814C = m35812A + i11;
                        i10 = i14 + m35814C;
                        break;
                    }
                case 42:
                    int m35288V = C8128e8.m35288V((List) unsafe.getObject(t10, j10));
                    i10 = i14;
                    if (m35288V <= 0) {
                        break;
                    } else {
                        i11 = m35288V;
                        m35812A = AbstractC8350t5.m35812A(i15) + AbstractC8350t5.m35814C(i11);
                        m35814C = m35812A + i11;
                        i10 = i14 + m35814C;
                        break;
                    }
                case 43:
                    int m35280N = C8128e8.m35280N((List) unsafe.getObject(t10, j10));
                    i10 = i14;
                    if (m35280N <= 0) {
                        break;
                    } else {
                        i11 = m35280N;
                        m35812A = AbstractC8350t5.m35812A(i15) + AbstractC8350t5.m35814C(i11);
                        m35814C = m35812A + i11;
                        i10 = i14 + m35814C;
                        break;
                    }
                case 44:
                    int m35276J = C8128e8.m35276J((List) unsafe.getObject(t10, j10));
                    i10 = i14;
                    if (m35276J <= 0) {
                        break;
                    } else {
                        i11 = m35276J;
                        m35812A = AbstractC8350t5.m35812A(i15) + AbstractC8350t5.m35814C(i11);
                        m35814C = m35812A + i11;
                        i10 = i14 + m35814C;
                        break;
                    }
                case 45:
                    int m35284R3 = C8128e8.m35284R((List) unsafe.getObject(t10, j10));
                    i10 = i14;
                    if (m35284R3 <= 0) {
                        break;
                    } else {
                        i11 = m35284R3;
                        m35812A = AbstractC8350t5.m35812A(i15) + AbstractC8350t5.m35814C(i11);
                        m35814C = m35812A + i11;
                        i10 = i14 + m35814C;
                        break;
                    }
                case 46:
                    int m35286T3 = C8128e8.m35286T((List) unsafe.getObject(t10, j10));
                    i10 = i14;
                    if (m35286T3 <= 0) {
                        break;
                    } else {
                        i11 = m35286T3;
                        m35812A = AbstractC8350t5.m35812A(i15) + AbstractC8350t5.m35814C(i11);
                        m35814C = m35812A + i11;
                        i10 = i14 + m35814C;
                        break;
                    }
                case 47:
                    int m35282P = C8128e8.m35282P((List) unsafe.getObject(t10, j10));
                    i10 = i14;
                    if (m35282P <= 0) {
                        break;
                    } else {
                        i11 = m35282P;
                        m35812A = AbstractC8350t5.m35812A(i15) + AbstractC8350t5.m35814C(i11);
                        m35814C = m35812A + i11;
                        i10 = i14 + m35814C;
                        break;
                    }
                case 48:
                    int m35274H = C8128e8.m35274H((List) unsafe.getObject(t10, j10));
                    i10 = i14;
                    if (m35274H <= 0) {
                        break;
                    } else {
                        i11 = m35274H;
                        m35812A = AbstractC8350t5.m35812A(i15) + AbstractC8350t5.m35814C(i11);
                        m35814C = m35812A + i11;
                        i10 = i14 + m35814C;
                        break;
                    }
                case 49:
                    m35287U = C8128e8.m35296b0(i15, (List) C8099c9.m35139y(t10, j10), m35932O(i12));
                    i10 = i14 + m35287U;
                    break;
                case 50:
                    C8232l7.m35591a(i15, C8099c9.m35139y(t10, j10), m35933P(i12));
                    i10 = i14;
                    break;
                case 51:
                    i10 = i14;
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i15) + 8;
                    i10 = i14 + m35287U;
                    break;
                case 52:
                    i10 = i14;
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i15) + 4;
                    i10 = i14 + m35287U;
                    break;
                case 53:
                    i10 = i14;
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    }
                    m35131q = m35921o(t10, j10);
                    m35812A2 = AbstractC8350t5.m35812A(i15);
                    i10 = i14 + m35812A2 + AbstractC8350t5.m35815D(m35131q);
                    break;
                case 54:
                    i10 = i14;
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    }
                    m35131q = m35921o(t10, j10);
                    m35812A2 = AbstractC8350t5.m35812A(i15);
                    i10 = i14 + m35812A2 + AbstractC8350t5.m35815D(m35131q);
                    break;
                case 55:
                    i10 = i14;
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    }
                    m35129o2 = m35920n(t10, j10);
                    m35812A = AbstractC8350t5.m35812A(i15);
                    i11 = AbstractC8350t5.m35813B(m35129o2);
                    m35814C = m35812A + i11;
                    i10 = i14 + m35814C;
                    break;
                case 56:
                    i10 = i14;
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i15) + 8;
                    i10 = i14 + m35287U;
                    break;
                case 57:
                    i10 = i14;
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i15) + 4;
                    i10 = i14 + m35287U;
                    break;
                case 58:
                    i10 = i14;
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i15) + 1;
                    i10 = i14 + m35287U;
                    break;
                case 59:
                    i10 = i14;
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        Object m35139y2 = C8099c9.m35139y(t10, j10);
                        obj = m35139y2;
                        if (m35139y2 instanceof AbstractC8230l5) {
                            obj2 = m35139y2;
                            int m35812A322 = AbstractC8350t5.m35812A(i15);
                            int mo35264d22 = ((AbstractC8230l5) obj2).mo35264d();
                            m35814C = m35812A322 + AbstractC8350t5.m35814C(mo35264d22) + mo35264d22;
                            i10 = i14 + m35814C;
                            break;
                        }
                        m35812A = AbstractC8350t5.m35812A(i15);
                        i11 = AbstractC8350t5.m35816E((String) obj);
                        m35814C = m35812A + i11;
                        i10 = i14 + m35814C;
                    }
                case 60:
                    i10 = i14;
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    }
                    m35287U = C8128e8.m35291Y(i15, C8099c9.m35139y(t10, j10), m35932O(i12));
                    i10 = i14 + m35287U;
                    break;
                case 61:
                    i10 = i14;
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    }
                    obj2 = C8099c9.m35139y(t10, j10);
                    int m35812A3222 = AbstractC8350t5.m35812A(i15);
                    int mo35264d222 = ((AbstractC8230l5) obj2).mo35264d();
                    m35814C = m35812A3222 + AbstractC8350t5.m35814C(mo35264d222) + mo35264d222;
                    i10 = i14 + m35814C;
                    break;
                case 62:
                    i10 = i14;
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        m35129o = m35920n(t10, j10);
                        m35812A = AbstractC8350t5.m35812A(i15);
                        i11 = AbstractC8350t5.m35814C(m35129o);
                        m35814C = m35812A + i11;
                        i10 = i14 + m35814C;
                        break;
                    }
                case 63:
                    i10 = i14;
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    }
                    m35129o2 = m35920n(t10, j10);
                    m35812A = AbstractC8350t5.m35812A(i15);
                    i11 = AbstractC8350t5.m35813B(m35129o2);
                    m35814C = m35812A + i11;
                    i10 = i14 + m35814C;
                    break;
                case 64:
                    i10 = i14;
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i15) + 4;
                    i10 = i14 + m35287U;
                    break;
                case 65:
                    i10 = i14;
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35812A(i15) + 8;
                    i10 = i14 + m35287U;
                    break;
                case 66:
                    i10 = i14;
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        m35129o3 = m35920n(t10, j10);
                        m35812A = AbstractC8350t5.m35812A(i15);
                        m35129o = AbstractC8350t5.m35820c(m35129o3);
                        i11 = AbstractC8350t5.m35814C(m35129o);
                        m35814C = m35812A + i11;
                        i10 = i14 + m35814C;
                        break;
                    }
                case 67:
                    i10 = i14;
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        m35131q2 = m35921o(t10, j10);
                        m35812A2 = AbstractC8350t5.m35812A(i15);
                        m35131q = AbstractC8350t5.m35821d(m35131q2);
                        i10 = i14 + m35812A2 + AbstractC8350t5.m35815D(m35131q);
                        break;
                    }
                case 68:
                    i10 = i14;
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    }
                    m35287U = AbstractC8350t5.m35822g(i15, (InterfaceC8307q7) C8099c9.m35139y(t10, j10), m35932O(i12));
                    i10 = i14 + m35287U;
                    break;
                default:
                    i10 = i14;
                    break;
            }
            i12 += 3;
            i13 = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x02ec, code lost:
    
        r0.add(p305ra.AbstractC8230l5.m35569t(r10, r0, r0));
        r11 = r0 + r0;
        r26 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0564, code lost:
    
        r25 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x08b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x08b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x0400 -> B:121:0x039f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x04a4 -> B:141:0x0431). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:192:0x059d -> B:185:0x055b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x0337 -> B:85:0x02c8). Please report as a decompilation issue!!! */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m35929L(T r9, byte[] r10, int r11, int r12, int r13, int r14, int r15, int r16, long r17, int r19, long r20, p305ra.C8394w4 r22) {
        /*
            Method dump skipped, instructions count: 2236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p305ra.C8367u7.m35929L(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, ra.w4):int");
    }

    /* renamed from: M */
    public final <K, V> int m35930M(T t10, byte[] bArr, int i10, int i11, int i12, long j10, C8394w4 c8394w4) {
        Unsafe unsafe = f39304q;
        Object m35933P = m35933P(i12);
        Object object = unsafe.getObject(t10, j10);
        if (!((C8217k7) object).m35535g()) {
            C8217k7<K, V> m35533d = C8217k7.m35530b().m35533d();
            C8232l7.m35592b(m35533d, object);
            unsafe.putObject(t10, j10, m35533d);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: N */
    public final int m35931N(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, C8394w4 c8394w4) {
        int m36068c;
        long j11;
        int i18;
        Object valueOf;
        Object obj;
        Unsafe unsafe = f39304q;
        long j12 = this.f39305a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(t10, j10, Double.valueOf(Double.longBitsToDouble(C8409x4.m36070e(bArr, i10))));
                    unsafe.putInt(t10, j12, i13);
                    return i10 + 8;
                }
                return i10;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(t10, j10, Float.valueOf(Float.intBitsToFloat(C8409x4.m36069d(bArr, i10))));
                    unsafe.putInt(t10, j12, i13);
                    return i10 + 4;
                }
                return i10;
            case 53:
            case 54:
                if (i14 == 0) {
                    m36068c = C8409x4.m36068c(bArr, i10, c8394w4);
                    j11 = c8394w4.f39361b;
                    valueOf = Long.valueOf(j11);
                    unsafe.putObject(t10, j10, valueOf);
                    unsafe.putInt(t10, j12, i13);
                    return m36068c;
                }
                return i10;
            case 55:
            case 62:
                if (i14 == 0) {
                    m36068c = C8409x4.m36066a(bArr, i10, c8394w4);
                    i18 = c8394w4.f39360a;
                    valueOf = Integer.valueOf(i18);
                    unsafe.putObject(t10, j10, valueOf);
                    unsafe.putInt(t10, j12, i13);
                    return m36068c;
                }
                return i10;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(t10, j10, Long.valueOf(C8409x4.m36070e(bArr, i10)));
                    unsafe.putInt(t10, j12, i13);
                    return i10 + 8;
                }
                return i10;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(t10, j10, Integer.valueOf(C8409x4.m36069d(bArr, i10)));
                    unsafe.putInt(t10, j12, i13);
                    return i10 + 4;
                }
                return i10;
            case 58:
                if (i14 == 0) {
                    m36068c = C8409x4.m36068c(bArr, i10, c8394w4);
                    valueOf = Boolean.valueOf(c8394w4.f39361b != 0);
                    unsafe.putObject(t10, j10, valueOf);
                    unsafe.putInt(t10, j12, i13);
                    return m36068c;
                }
                return i10;
            case 59:
                if (i14 == 2) {
                    i10 = C8409x4.m36066a(bArr, i10, c8394w4);
                    int i19 = c8394w4.f39360a;
                    if (i19 == 0) {
                        obj = "";
                        unsafe.putObject(t10, j10, obj);
                        unsafe.putInt(t10, j12, i13);
                    } else {
                        if ((i15 & NTLMEngineImpl.FLAG_REQUEST_128BIT_KEY_EXCH) != 0 && !C8189i9.m35456b(bArr, i10, i10 + i19)) {
                            throw C8396w6.m35991f();
                        }
                        unsafe.putObject(t10, j10, new String(bArr, i10, i19, C8366u6.f39298a));
                        i10 += i19;
                        unsafe.putInt(t10, j12, i13);
                    }
                }
                return i10;
            case 60:
                if (i14 == 2) {
                    i10 = C8409x4.m36074i(m35932O(i17), bArr, i10, i11, c8394w4);
                    Object object = unsafe.getInt(t10, j12) == i13 ? unsafe.getObject(t10, j10) : null;
                    Object obj2 = c8394w4.f39362c;
                    obj = object == null ? obj2 : C8366u6.m35910i(object, obj2);
                    unsafe.putObject(t10, j10, obj);
                    unsafe.putInt(t10, j12, i13);
                }
                return i10;
            case 61:
                if (i14 == 2) {
                    m36068c = C8409x4.m36073h(bArr, i10, c8394w4);
                    valueOf = c8394w4.f39362c;
                    unsafe.putObject(t10, j10, valueOf);
                    unsafe.putInt(t10, j12, i13);
                    return m36068c;
                }
                return i10;
            case 63:
                if (i14 == 0) {
                    i10 = C8409x4.m36066a(bArr, i10, c8394w4);
                    int i20 = c8394w4.f39360a;
                    InterfaceC8291p6 m35934Q = m35934Q(i17);
                    if (m35934Q == null || m35934Q.mo35032a(i20)) {
                        unsafe.putObject(t10, j10, Integer.valueOf(i20));
                        unsafe.putInt(t10, j12, i13);
                    } else {
                        m35912C(t10).m35769h(i12, Long.valueOf(i20));
                    }
                }
                return i10;
            case 66:
                if (i14 == 0) {
                    m36068c = C8409x4.m36066a(bArr, i10, c8394w4);
                    i18 = C8275o5.m35653a(c8394w4.f39360a);
                    valueOf = Integer.valueOf(i18);
                    unsafe.putObject(t10, j10, valueOf);
                    unsafe.putInt(t10, j12, i13);
                    return m36068c;
                }
                return i10;
            case 67:
                if (i14 == 0) {
                    m36068c = C8409x4.m36068c(bArr, i10, c8394w4);
                    j11 = C8275o5.m35654b(c8394w4.f39361b);
                    valueOf = Long.valueOf(j11);
                    unsafe.putObject(t10, j10, valueOf);
                    unsafe.putInt(t10, j12, i13);
                    return m36068c;
                }
                return i10;
            case 68:
                if (i14 == 3) {
                    i10 = C8409x4.m36075j(m35932O(i17), bArr, i10, i11, (i12 & (-8)) | 4, c8394w4);
                    Object object2 = unsafe.getInt(t10, j12) == i13 ? unsafe.getObject(t10, j10) : null;
                    Object obj3 = c8394w4.f39362c;
                    obj = object2 == null ? obj3 : C8366u6.m35910i(object2, obj3);
                    unsafe.putObject(t10, j10, obj);
                    unsafe.putInt(t10, j12, i13);
                }
                return i10;
            default:
                return i10;
        }
    }

    /* renamed from: O */
    public final InterfaceC8098c8 m35932O(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        InterfaceC8098c8 interfaceC8098c8 = (InterfaceC8098c8) this.f39306b[i12];
        if (interfaceC8098c8 != null) {
            return interfaceC8098c8;
        }
        InterfaceC8098c8<T> m36243b = C8442z7.m36242a().m36243b((Class) this.f39306b[i12 + 1]);
        this.f39306b[i12] = m36243b;
        return m36243b;
    }

    /* renamed from: P */
    public final Object m35933P(int i10) {
        int i11 = i10 / 3;
        return this.f39306b[i11 + i11];
    }

    /* renamed from: Q */
    public final InterfaceC8291p6 m35934Q(int i10) {
        int i11 = i10 / 3;
        return (InterfaceC8291p6) this.f39306b[i11 + i11 + 1];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0107. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v210, types: [int] */
    /* renamed from: R */
    public final int m35935R(T t10, byte[] bArr, int i10, int i11, C8394w4 c8394w4) {
        int i12;
        int i13;
        int m36078m;
        int i14;
        int i15;
        int m36068c;
        long j10;
        int i16;
        int i17;
        Object obj;
        Unsafe unsafe = f39304q;
        int i18 = i10;
        int i19 = -1;
        int i20 = 0;
        int i21 = 0;
        int i22 = 1048575;
        while (i18 < i11) {
            int i23 = i18 + 1;
            byte b10 = bArr[i18];
            if (b10 < 0) {
                i23 = C8409x4.m36067b(b10, bArr, i23, c8394w4);
                b10 = c8394w4.f39360a;
            }
            int i24 = b10 >>> 3;
            int i25 = b10 & 7;
            int m35945x = i24 > i19 ? m35945x(i24, i20 / 3) : m35944w(i24);
            if (m35945x == -1) {
                m35945x = 0;
            } else {
                int i26 = this.f39305a[m35945x + 1];
                int m35917k = m35917k(i26);
                long j11 = i26 & 1048575;
                if (m35917k <= 17) {
                    int i27 = this.f39305a[m35945x + 2];
                    boolean z10 = true;
                    int i28 = 1 << (i27 >>> 20);
                    int i29 = i27 & 1048575;
                    if (i29 != i22) {
                        if (i22 != 1048575) {
                            unsafe.putInt(t10, i22, i21);
                        }
                        if (i29 != 1048575) {
                            i21 = unsafe.getInt(t10, i29);
                        }
                        i22 = i29;
                        i14 = i21;
                    } else {
                        i14 = i21;
                    }
                    Unsafe unsafe2 = unsafe;
                    switch (m35917k) {
                        case 0:
                            if (i25 != 1) {
                                unsafe = unsafe2;
                                i21 = i14;
                                break;
                            } else {
                                C8099c9.m35138x(t10, j11, Double.longBitsToDouble(C8409x4.m36070e(bArr, i23)));
                                i15 = i23 + 8;
                                m36078m = i15;
                                i21 = i14 | i28;
                                i20 = m35945x;
                                i19 = i24;
                                i18 = m36078m;
                                break;
                            }
                        case 1:
                            if (i25 != 5) {
                                unsafe = unsafe2;
                                i21 = i14;
                                break;
                            } else {
                                C8099c9.m35136v(t10, j11, Float.intBitsToFloat(C8409x4.m36069d(bArr, i23)));
                                i15 = i23 + 4;
                                m36078m = i15;
                                i21 = i14 | i28;
                                i20 = m35945x;
                                i19 = i24;
                                i18 = m36078m;
                                break;
                            }
                        case 2:
                        case 3:
                            if (i25 != 0) {
                                unsafe = unsafe2;
                                i21 = i14;
                                break;
                            } else {
                                m36068c = C8409x4.m36068c(bArr, i23, c8394w4);
                                j10 = c8394w4.f39361b;
                                unsafe2.putLong(t10, j11, j10);
                                unsafe = unsafe2;
                                m36078m = m36068c;
                                i21 = i14 | i28;
                                i20 = m35945x;
                                i19 = i24;
                                i18 = m36078m;
                                break;
                            }
                        case 4:
                        case 11:
                            if (i25 != 0) {
                                unsafe = unsafe2;
                                i21 = i14;
                                break;
                            } else {
                                i15 = C8409x4.m36066a(bArr, i23, c8394w4);
                                i16 = c8394w4.f39360a;
                                unsafe2.putInt(t10, j11, i16);
                                m36078m = i15;
                                i21 = i14 | i28;
                                i20 = m35945x;
                                i19 = i24;
                                i18 = m36078m;
                                break;
                            }
                        case 5:
                        case 14:
                            if (i25 != 1) {
                                unsafe = unsafe2;
                                i21 = i14;
                                break;
                            } else {
                                unsafe2.putLong(t10, j11, C8409x4.m36070e(bArr, i23));
                                i15 = i23 + 8;
                                m36078m = i15;
                                i21 = i14 | i28;
                                i20 = m35945x;
                                i19 = i24;
                                i18 = m36078m;
                                break;
                            }
                        case 6:
                        case 13:
                            if (i25 != 5) {
                                unsafe = unsafe2;
                                i21 = i14;
                                break;
                            } else {
                                unsafe2.putInt(t10, j11, C8409x4.m36069d(bArr, i23));
                                i17 = i23 + 4;
                                int i30 = i14 | i28;
                                unsafe = unsafe2;
                                i20 = m35945x;
                                i18 = i17;
                                i19 = i24;
                                i21 = i30;
                                break;
                            }
                        case 7:
                            if (i25 != 0) {
                                unsafe = unsafe2;
                                i21 = i14;
                                break;
                            } else {
                                i17 = C8409x4.m36068c(bArr, i23, c8394w4);
                                if (c8394w4.f39361b == 0) {
                                    z10 = false;
                                }
                                C8099c9.m35134t(t10, j11, z10);
                                int i302 = i14 | i28;
                                unsafe = unsafe2;
                                i20 = m35945x;
                                i18 = i17;
                                i19 = i24;
                                i21 = i302;
                                break;
                            }
                        case 8:
                            if (i25 != 2) {
                                unsafe = unsafe2;
                                i21 = i14;
                                break;
                            } else {
                                i17 = (i26 & NTLMEngineImpl.FLAG_REQUEST_128BIT_KEY_EXCH) == 0 ? C8409x4.m36071f(bArr, i23, c8394w4) : C8409x4.m36072g(bArr, i23, c8394w4);
                                obj = c8394w4.f39362c;
                                unsafe2.putObject(t10, j11, obj);
                                int i3022 = i14 | i28;
                                unsafe = unsafe2;
                                i20 = m35945x;
                                i18 = i17;
                                i19 = i24;
                                i21 = i3022;
                                break;
                            }
                        case 9:
                            if (i25 != 2) {
                                unsafe = unsafe2;
                                i21 = i14;
                                break;
                            } else {
                                i17 = C8409x4.m36074i(m35932O(m35945x), bArr, i23, i11, c8394w4);
                                Object object = unsafe2.getObject(t10, j11);
                                obj = object == null ? c8394w4.f39362c : C8366u6.m35910i(object, c8394w4.f39362c);
                                unsafe2.putObject(t10, j11, obj);
                                int i30222 = i14 | i28;
                                unsafe = unsafe2;
                                i20 = m35945x;
                                i18 = i17;
                                i19 = i24;
                                i21 = i30222;
                                break;
                            }
                        case 10:
                            if (i25 != 2) {
                                unsafe = unsafe2;
                                i21 = i14;
                                break;
                            } else {
                                i15 = C8409x4.m36073h(bArr, i23, c8394w4);
                                unsafe2.putObject(t10, j11, c8394w4.f39362c);
                                m36078m = i15;
                                i21 = i14 | i28;
                                i20 = m35945x;
                                i19 = i24;
                                i18 = m36078m;
                                break;
                            }
                        case 12:
                            if (i25 != 0) {
                                unsafe = unsafe2;
                                i21 = i14;
                                break;
                            } else {
                                i15 = C8409x4.m36066a(bArr, i23, c8394w4);
                                i16 = c8394w4.f39360a;
                                unsafe2.putInt(t10, j11, i16);
                                m36078m = i15;
                                i21 = i14 | i28;
                                i20 = m35945x;
                                i19 = i24;
                                i18 = m36078m;
                                break;
                            }
                        case 15:
                            if (i25 != 0) {
                                unsafe = unsafe2;
                                i21 = i14;
                                break;
                            } else {
                                i15 = C8409x4.m36066a(bArr, i23, c8394w4);
                                i16 = C8275o5.m35653a(c8394w4.f39360a);
                                unsafe2.putInt(t10, j11, i16);
                                m36078m = i15;
                                i21 = i14 | i28;
                                i20 = m35945x;
                                i19 = i24;
                                i18 = m36078m;
                                break;
                            }
                        case 16:
                            if (i25 != 0) {
                                unsafe = unsafe2;
                                i21 = i14;
                                break;
                            } else {
                                m36068c = C8409x4.m36068c(bArr, i23, c8394w4);
                                j10 = C8275o5.m35654b(c8394w4.f39361b);
                                unsafe2.putLong(t10, j11, j10);
                                unsafe = unsafe2;
                                m36078m = m36068c;
                                i21 = i14 | i28;
                                i20 = m35945x;
                                i19 = i24;
                                i18 = m36078m;
                                break;
                            }
                        default:
                            unsafe = unsafe2;
                            i21 = i14;
                            break;
                    }
                } else {
                    Unsafe unsafe3 = unsafe;
                    if (m35917k != 27) {
                        if (m35917k <= 49) {
                            int m35929L = m35929L(t10, bArr, i23, i11, b10, i24, i25, m35945x, i26, m35917k, j11, c8394w4);
                            i13 = m35929L;
                            if (m35929L != i23) {
                                i12 = m35929L;
                            }
                            i23 = i13;
                        } else if (m35917k != 50) {
                            int m35931N = m35931N(t10, bArr, i23, i11, b10, i24, i25, i26, m35917k, j11, m35945x, c8394w4);
                            i13 = m35931N;
                            if (m35931N != i23) {
                                i12 = m35931N;
                            }
                            i23 = i13;
                        } else if (i25 == 2) {
                            int m35930M = m35930M(t10, bArr, i23, i11, m35945x, j11, c8394w4);
                            i13 = m35930M;
                            if (m35930M != i23) {
                                i12 = m35930M;
                            }
                            i23 = i13;
                        }
                        i20 = m35945x;
                        i19 = i24;
                        i18 = i12;
                    } else if (i25 == 2) {
                        InterfaceC8351t6 interfaceC8351t6 = (InterfaceC8351t6) unsafe3.getObject(t10, j11);
                        InterfaceC8351t6 interfaceC8351t62 = interfaceC8351t6;
                        if (!interfaceC8351t6.zza()) {
                            int size = interfaceC8351t6.size();
                            interfaceC8351t62 = interfaceC8351t6.mo35006n(size == 0 ? 10 : size + size);
                            unsafe3.putObject(t10, j11, interfaceC8351t62);
                        }
                        m36078m = C8409x4.m36078m(m35932O(m35945x), b10, bArr, i23, i11, interfaceC8351t62, c8394w4);
                        i20 = m35945x;
                        i19 = i24;
                        i18 = m36078m;
                    }
                }
            }
            i12 = C8409x4.m36079n(b10, bArr, i23, i11, m35912C(t10), c8394w4);
            i20 = m35945x;
            i19 = i24;
            i18 = i12;
        }
        if (i22 != 1048575) {
            unsafe.putInt(t10, i22, i21);
        }
        if (i18 == i11) {
            return i18;
        }
        throw C8396w6.m35990e();
    }

    @Override // p305ra.InterfaceC8098c8
    /* renamed from: a */
    public final int mo35096a(T t10) {
        return this.f39311g ? m35928K(t10) : m35927J(t10);
    }

    @Override // p305ra.InterfaceC8098c8
    /* renamed from: b */
    public final void mo35097b(T t10, C8365u5 c8365u5) {
        double m35137w;
        float m35135u;
        long m35131q;
        long m35131q2;
        int m35129o;
        long m35131q3;
        int m35129o2;
        boolean m35133s;
        int m35129o3;
        int m35129o4;
        int m35129o5;
        long m35131q4;
        int m35129o6;
        long m35131q5;
        if (!this.f39311g) {
            m35947z(t10, c8365u5);
            return;
        }
        if (this.f39310f) {
            this.f39317m.mo34997b(t10);
            throw null;
        }
        int length = this.f39305a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int m35936i = m35936i(i10);
            int i11 = this.f39305a[i10];
            switch (m35917k(m35936i)) {
                case 0:
                    if (m35940s(t10, i10)) {
                        m35137w = C8099c9.m35137w(t10, m35936i & 1048575);
                        c8365u5.m35892q(i11, m35137w);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m35940s(t10, i10)) {
                        m35135u = C8099c9.m35135u(t10, m35936i & 1048575);
                        c8365u5.m35891p(i11, m35135u);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m35940s(t10, i10)) {
                        m35131q = C8099c9.m35131q(t10, m35936i & 1048575);
                        c8365u5.m35889n(i11, m35131q);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m35940s(t10, i10)) {
                        m35131q2 = C8099c9.m35131q(t10, m35936i & 1048575);
                        c8365u5.m35894s(i11, m35131q2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m35940s(t10, i10)) {
                        m35129o = C8099c9.m35129o(t10, m35936i & 1048575);
                        c8365u5.m35895t(i11, m35129o);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m35940s(t10, i10)) {
                        m35131q3 = C8099c9.m35131q(t10, m35936i & 1048575);
                        c8365u5.m35896u(i11, m35131q3);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m35940s(t10, i10)) {
                        m35129o2 = C8099c9.m35129o(t10, m35936i & 1048575);
                        c8365u5.m35897v(i11, m35129o2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m35940s(t10, i10)) {
                        m35133s = C8099c9.m35133s(t10, m35936i & 1048575);
                        c8365u5.m35898w(i11, m35133s);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!m35940s(t10, i10)) {
                        break;
                    }
                    m35911B(i11, C8099c9.m35139y(t10, m35936i & 1048575), c8365u5);
                    break;
                case 9:
                    if (!m35940s(t10, i10)) {
                        break;
                    }
                    c8365u5.m35868C(i11, C8099c9.m35139y(t10, m35936i & 1048575), m35932O(i10));
                    break;
                case 10:
                    if (!m35940s(t10, i10)) {
                        break;
                    }
                    c8365u5.m35900y(i11, (AbstractC8230l5) C8099c9.m35139y(t10, m35936i & 1048575));
                    break;
                case 11:
                    if (m35940s(t10, i10)) {
                        m35129o3 = C8099c9.m35129o(t10, m35936i & 1048575);
                        c8365u5.m35901z(i11, m35129o3);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m35940s(t10, i10)) {
                        m35129o4 = C8099c9.m35129o(t10, m35936i & 1048575);
                        c8365u5.m35893r(i11, m35129o4);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m35940s(t10, i10)) {
                        m35129o5 = C8099c9.m35129o(t10, m35936i & 1048575);
                        c8365u5.m35888m(i11, m35129o5);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m35940s(t10, i10)) {
                        m35131q4 = C8099c9.m35131q(t10, m35936i & 1048575);
                        c8365u5.m35890o(i11, m35131q4);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m35940s(t10, i10)) {
                        m35129o6 = C8099c9.m35129o(t10, m35936i & 1048575);
                        c8365u5.m35866A(i11, m35129o6);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m35940s(t10, i10)) {
                        m35131q5 = C8099c9.m35131q(t10, m35936i & 1048575);
                        c8365u5.m35867B(i11, m35131q5);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (!m35940s(t10, i10)) {
                        break;
                    }
                    c8365u5.m35869D(i11, C8099c9.m35139y(t10, m35936i & 1048575), m35932O(i10));
                    break;
                case 18:
                    C8128e8.m35304j(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, false);
                    break;
                case 19:
                    C8128e8.m35305k(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, false);
                    break;
                case 20:
                    C8128e8.m35306l(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, false);
                    break;
                case 21:
                    C8128e8.m35307m(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, false);
                    break;
                case 22:
                    C8128e8.m35311q(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, false);
                    break;
                case 23:
                    C8128e8.m35309o(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, false);
                    break;
                case 24:
                    C8128e8.m35314t(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, false);
                    break;
                case 25:
                    C8128e8.m35317w(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, false);
                    break;
                case 26:
                    C8128e8.m35318x(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5);
                    break;
                case 27:
                    C8128e8.m35320z(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, m35932O(i10));
                    break;
                case 28:
                    C8128e8.m35319y(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5);
                    break;
                case 29:
                    C8128e8.m35312r(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, false);
                    break;
                case 30:
                    C8128e8.m35316v(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, false);
                    break;
                case 31:
                    C8128e8.m35315u(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, false);
                    break;
                case 32:
                    C8128e8.m35310p(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, false);
                    break;
                case 33:
                    C8128e8.m35313s(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, false);
                    break;
                case 34:
                    C8128e8.m35308n(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, false);
                    break;
                case 35:
                    C8128e8.m35304j(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, true);
                    break;
                case 36:
                    C8128e8.m35305k(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, true);
                    break;
                case 37:
                    C8128e8.m35306l(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, true);
                    break;
                case 38:
                    C8128e8.m35307m(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, true);
                    break;
                case 39:
                    C8128e8.m35311q(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, true);
                    break;
                case 40:
                    C8128e8.m35309o(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, true);
                    break;
                case 41:
                    C8128e8.m35314t(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, true);
                    break;
                case 42:
                    C8128e8.m35317w(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, true);
                    break;
                case 43:
                    C8128e8.m35312r(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, true);
                    break;
                case 44:
                    C8128e8.m35316v(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, true);
                    break;
                case 45:
                    C8128e8.m35315u(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, true);
                    break;
                case 46:
                    C8128e8.m35310p(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, true);
                    break;
                case 47:
                    C8128e8.m35313s(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, true);
                    break;
                case 48:
                    C8128e8.m35308n(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, true);
                    break;
                case 49:
                    C8128e8.m35268B(this.f39305a[i10], (List) C8099c9.m35139y(t10, m35936i & 1048575), c8365u5, m35932O(i10));
                    break;
                case 50:
                    m35923A(c8365u5, i11, C8099c9.m35139y(t10, m35936i & 1048575), i10);
                    break;
                case 51:
                    if (m35942u(t10, i11, i10)) {
                        m35137w = m35918l(t10, m35936i & 1048575);
                        c8365u5.m35892q(i11, m35137w);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m35942u(t10, i11, i10)) {
                        m35135u = m35919m(t10, m35936i & 1048575);
                        c8365u5.m35891p(i11, m35135u);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m35942u(t10, i11, i10)) {
                        m35131q = m35921o(t10, m35936i & 1048575);
                        c8365u5.m35889n(i11, m35131q);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m35942u(t10, i11, i10)) {
                        m35131q2 = m35921o(t10, m35936i & 1048575);
                        c8365u5.m35894s(i11, m35131q2);
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m35942u(t10, i11, i10)) {
                        m35129o = m35920n(t10, m35936i & 1048575);
                        c8365u5.m35895t(i11, m35129o);
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m35942u(t10, i11, i10)) {
                        m35131q3 = m35921o(t10, m35936i & 1048575);
                        c8365u5.m35896u(i11, m35131q3);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m35942u(t10, i11, i10)) {
                        m35129o2 = m35920n(t10, m35936i & 1048575);
                        c8365u5.m35897v(i11, m35129o2);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m35942u(t10, i11, i10)) {
                        m35133s = m35922p(t10, m35936i & 1048575);
                        c8365u5.m35898w(i11, m35133s);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!m35942u(t10, i11, i10)) {
                        break;
                    }
                    m35911B(i11, C8099c9.m35139y(t10, m35936i & 1048575), c8365u5);
                    break;
                case 60:
                    if (!m35942u(t10, i11, i10)) {
                        break;
                    }
                    c8365u5.m35868C(i11, C8099c9.m35139y(t10, m35936i & 1048575), m35932O(i10));
                    break;
                case 61:
                    if (!m35942u(t10, i11, i10)) {
                        break;
                    }
                    c8365u5.m35900y(i11, (AbstractC8230l5) C8099c9.m35139y(t10, m35936i & 1048575));
                    break;
                case 62:
                    if (m35942u(t10, i11, i10)) {
                        m35129o3 = m35920n(t10, m35936i & 1048575);
                        c8365u5.m35901z(i11, m35129o3);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m35942u(t10, i11, i10)) {
                        m35129o4 = m35920n(t10, m35936i & 1048575);
                        c8365u5.m35893r(i11, m35129o4);
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m35942u(t10, i11, i10)) {
                        m35129o5 = m35920n(t10, m35936i & 1048575);
                        c8365u5.m35888m(i11, m35129o5);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m35942u(t10, i11, i10)) {
                        m35131q4 = m35921o(t10, m35936i & 1048575);
                        c8365u5.m35890o(i11, m35131q4);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m35942u(t10, i11, i10)) {
                        m35129o6 = m35920n(t10, m35936i & 1048575);
                        c8365u5.m35866A(i11, m35129o6);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m35942u(t10, i11, i10)) {
                        m35131q5 = m35921o(t10, m35936i & 1048575);
                        c8365u5.m35867B(i11, m35131q5);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (!m35942u(t10, i11, i10)) {
                        break;
                    }
                    c8365u5.m35869D(i11, C8099c9.m35139y(t10, m35936i & 1048575), m35932O(i10));
                    break;
            }
        }
        AbstractC8308q8<?, ?> abstractC8308q8 = this.f39316l;
        abstractC8308q8.mo35741i(abstractC8308q8.mo35736d(t10), c8365u5);
    }

    @Override // p305ra.InterfaceC8098c8
    /* renamed from: c */
    public final void mo35098c(T t10, byte[] bArr, int i10, int i11, C8394w4 c8394w4) {
        if (this.f39311g) {
            m35935R(t10, bArr, i10, i11, c8394w4);
        } else {
            m35924D(t10, bArr, i10, i11, 0, c8394w4);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x030d, code lost:
    
        if (r19 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x033c, code lost:
    
        r10 = (r11 * 53) + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0335, code lost:
    
        r10 = r19.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0332, code lost:
    
        if (r19 != null) goto L68;
     */
    @Override // p305ra.InterfaceC8098c8
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo35099d(T r6) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p305ra.C8367u7.mo35099d(java.lang.Object):int");
    }

    @Override // p305ra.InterfaceC8098c8
    /* renamed from: e */
    public final void mo35100e(T t10, T t11) {
        t11.getClass();
        for (int i10 = 0; i10 < this.f39305a.length; i10 += 3) {
            int m35936i = m35936i(i10);
            long j10 = 1048575 & m35936i;
            int i11 = this.f39305a[i10];
            switch (m35917k(m35936i)) {
                case 0:
                    if (m35940s(t11, i10)) {
                        C8099c9.m35138x(t10, j10, C8099c9.m35137w(t11, j10));
                        m35941t(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m35940s(t11, i10)) {
                        C8099c9.m35136v(t10, j10, C8099c9.m35135u(t11, j10));
                        m35941t(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!m35940s(t11, i10)) {
                        break;
                    }
                    C8099c9.m35132r(t10, j10, C8099c9.m35131q(t11, j10));
                    m35941t(t10, i10);
                    break;
                case 3:
                    if (!m35940s(t11, i10)) {
                        break;
                    }
                    C8099c9.m35132r(t10, j10, C8099c9.m35131q(t11, j10));
                    m35941t(t10, i10);
                    break;
                case 4:
                    if (!m35940s(t11, i10)) {
                        break;
                    }
                    C8099c9.m35130p(t10, j10, C8099c9.m35129o(t11, j10));
                    m35941t(t10, i10);
                    break;
                case 5:
                    if (!m35940s(t11, i10)) {
                        break;
                    }
                    C8099c9.m35132r(t10, j10, C8099c9.m35131q(t11, j10));
                    m35941t(t10, i10);
                    break;
                case 6:
                    if (!m35940s(t11, i10)) {
                        break;
                    }
                    C8099c9.m35130p(t10, j10, C8099c9.m35129o(t11, j10));
                    m35941t(t10, i10);
                    break;
                case 7:
                    if (m35940s(t11, i10)) {
                        C8099c9.m35134t(t10, j10, C8099c9.m35133s(t11, j10));
                        m35941t(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!m35940s(t11, i10)) {
                        break;
                    }
                    C8099c9.m35140z(t10, j10, C8099c9.m35139y(t11, j10));
                    m35941t(t10, i10);
                    break;
                case 9:
                case 17:
                    m35925H(t10, t11, i10);
                    break;
                case 10:
                    if (!m35940s(t11, i10)) {
                        break;
                    }
                    C8099c9.m35140z(t10, j10, C8099c9.m35139y(t11, j10));
                    m35941t(t10, i10);
                    break;
                case 11:
                    if (!m35940s(t11, i10)) {
                        break;
                    }
                    C8099c9.m35130p(t10, j10, C8099c9.m35129o(t11, j10));
                    m35941t(t10, i10);
                    break;
                case 12:
                    if (!m35940s(t11, i10)) {
                        break;
                    }
                    C8099c9.m35130p(t10, j10, C8099c9.m35129o(t11, j10));
                    m35941t(t10, i10);
                    break;
                case 13:
                    if (!m35940s(t11, i10)) {
                        break;
                    }
                    C8099c9.m35130p(t10, j10, C8099c9.m35129o(t11, j10));
                    m35941t(t10, i10);
                    break;
                case 14:
                    if (!m35940s(t11, i10)) {
                        break;
                    }
                    C8099c9.m35132r(t10, j10, C8099c9.m35131q(t11, j10));
                    m35941t(t10, i10);
                    break;
                case 15:
                    if (!m35940s(t11, i10)) {
                        break;
                    }
                    C8099c9.m35130p(t10, j10, C8099c9.m35129o(t11, j10));
                    m35941t(t10, i10);
                    break;
                case 16:
                    if (!m35940s(t11, i10)) {
                        break;
                    }
                    C8099c9.m35132r(t10, j10, C8099c9.m35131q(t11, j10));
                    m35941t(t10, i10);
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
                    this.f39315k.mo35095b(t10, t11, j10);
                    break;
                case 50:
                    C8128e8.m35303i(this.f39319o, t10, t11, j10);
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
                    if (!m35942u(t11, i11, i10)) {
                        break;
                    }
                    C8099c9.m35140z(t10, j10, C8099c9.m35139y(t11, j10));
                    m35943v(t10, i11, i10);
                    break;
                case 60:
                case 68:
                    m35926I(t10, t11, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m35942u(t11, i11, i10)) {
                        break;
                    }
                    C8099c9.m35140z(t10, j10, C8099c9.m35139y(t11, j10));
                    m35943v(t10, i11, i10);
                    break;
            }
        }
        C8128e8.m35300f(this.f39316l, t10, t11);
        if (this.f39310f) {
            C8128e8.m35299e(this.f39317m, t10, t11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p305ra.InterfaceC8098c8
    /* renamed from: f */
    public final boolean mo35101f(T t10) {
        int i10 = 1048575;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f39313i; i12++) {
            int i13 = this.f39312h[i12];
            int i14 = this.f39305a[i13];
            int m35936i = m35936i(i13);
            int i15 = this.f39305a[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i10) {
                if (i16 != 1048575) {
                    i11 = f39304q.getInt(t10, i16);
                }
                i10 = i16;
            }
            if ((268435456 & m35936i) != 0 && !m35939r(t10, i13, i10, i11, i17)) {
                return false;
            }
            int m35917k = m35917k(m35936i);
            if (m35917k != 9 && m35917k != 17) {
                if (m35917k != 27) {
                    if (m35917k == 60 || m35917k == 68) {
                        if (m35942u(t10, i14, i13) && !m35916S(t10, m35936i, m35932O(i13))) {
                            return false;
                        }
                    } else if (m35917k != 49) {
                        if (m35917k == 50 && !((C8217k7) C8099c9.m35139y(t10, m35936i & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) C8099c9.m35139y(t10, m35936i & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC8098c8 m35932O = m35932O(i13);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!m35932O.mo35101f(list.get(i18))) {
                            return false;
                        }
                    }
                }
            } else if (m35939r(t10, i13, i10, i11, i17) && !m35916S(t10, m35936i, m35932O(i13))) {
                return false;
            }
        }
        if (!this.f39310f) {
            return true;
        }
        this.f39317m.mo34997b(t10);
        throw null;
    }

    @Override // p305ra.InterfaceC8098c8
    /* renamed from: g */
    public final void mo35102g(T t10) {
        int i10;
        int i11 = this.f39313i;
        while (true) {
            i10 = this.f39314j;
            if (i11 >= i10) {
                break;
            }
            long m35936i = m35936i(this.f39312h[i11]) & 1048575;
            Object m35139y = C8099c9.m35139y(t10, m35936i);
            if (m35139y != null) {
                ((C8217k7) m35139y).m35534e();
                C8099c9.m35140z(t10, m35936i, m35139y);
            }
            i11++;
        }
        int length = this.f39312h.length;
        for (int i12 = i10; i12 < length; i12++) {
            this.f39315k.mo35094a(t10, this.f39312h[i12]);
        }
        this.f39316l.mo35737e(t10);
        if (this.f39310f) {
            this.f39317m.mo34998c(t10);
        }
    }

    @Override // p305ra.InterfaceC8098c8
    /* renamed from: h */
    public final boolean mo35103h(T t10, T t11) {
        int length = this.f39305a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int m35936i = m35936i(i10);
            long j10 = m35936i & 1048575;
            switch (m35917k(m35936i)) {
                case 0:
                    if (!m35938q(t10, t11, i10) || Double.doubleToLongBits(C8099c9.m35137w(t10, j10)) != Double.doubleToLongBits(C8099c9.m35137w(t11, j10))) {
                        return false;
                    }
                    break;
                case 1:
                    if (!m35938q(t10, t11, i10) || Float.floatToIntBits(C8099c9.m35135u(t10, j10)) != Float.floatToIntBits(C8099c9.m35135u(t11, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!m35938q(t10, t11, i10) || C8099c9.m35131q(t10, j10) != C8099c9.m35131q(t11, j10)) {
                        return false;
                    }
                    break;
                case 3:
                    if (!m35938q(t10, t11, i10) || C8099c9.m35131q(t10, j10) != C8099c9.m35131q(t11, j10)) {
                        return false;
                    }
                    break;
                case 4:
                    if (!m35938q(t10, t11, i10) || C8099c9.m35129o(t10, j10) != C8099c9.m35129o(t11, j10)) {
                        return false;
                    }
                    break;
                case 5:
                    if (!m35938q(t10, t11, i10) || C8099c9.m35131q(t10, j10) != C8099c9.m35131q(t11, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!m35938q(t10, t11, i10) || C8099c9.m35129o(t10, j10) != C8099c9.m35129o(t11, j10)) {
                        return false;
                    }
                    break;
                case 7:
                    if (!m35938q(t10, t11, i10) || C8099c9.m35133s(t10, j10) != C8099c9.m35133s(t11, j10)) {
                        return false;
                    }
                    break;
                case 8:
                    if (!m35938q(t10, t11, i10) || !C8128e8.m35298d(C8099c9.m35139y(t10, j10), C8099c9.m35139y(t11, j10))) {
                        return false;
                    }
                    break;
                case 9:
                    if (!m35938q(t10, t11, i10) || !C8128e8.m35298d(C8099c9.m35139y(t10, j10), C8099c9.m35139y(t11, j10))) {
                        return false;
                    }
                    break;
                case 10:
                    if (!m35938q(t10, t11, i10) || !C8128e8.m35298d(C8099c9.m35139y(t10, j10), C8099c9.m35139y(t11, j10))) {
                        return false;
                    }
                    break;
                case 11:
                    if (!m35938q(t10, t11, i10) || C8099c9.m35129o(t10, j10) != C8099c9.m35129o(t11, j10)) {
                        return false;
                    }
                    break;
                case 12:
                    if (!m35938q(t10, t11, i10) || C8099c9.m35129o(t10, j10) != C8099c9.m35129o(t11, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!m35938q(t10, t11, i10) || C8099c9.m35129o(t10, j10) != C8099c9.m35129o(t11, j10)) {
                        return false;
                    }
                    break;
                case 14:
                    if (!m35938q(t10, t11, i10) || C8099c9.m35131q(t10, j10) != C8099c9.m35131q(t11, j10)) {
                        return false;
                    }
                    break;
                case 15:
                    if (!m35938q(t10, t11, i10) || C8099c9.m35129o(t10, j10) != C8099c9.m35129o(t11, j10)) {
                        return false;
                    }
                    break;
                case 16:
                    if (!m35938q(t10, t11, i10) || C8099c9.m35131q(t10, j10) != C8099c9.m35131q(t11, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 17:
                    if (!m35938q(t10, t11, i10) || !C8128e8.m35298d(C8099c9.m35139y(t10, j10), C8099c9.m35139y(t11, j10))) {
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
                    if (!C8128e8.m35298d(C8099c9.m35139y(t10, j10), C8099c9.m35139y(t11, j10))) {
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
                    long m35937j = m35937j(i10) & 1048575;
                    if (C8099c9.m35129o(t10, m35937j) != C8099c9.m35129o(t11, m35937j) || !C8128e8.m35298d(C8099c9.m35139y(t10, j10), C8099c9.m35139y(t11, j10))) {
                        return false;
                    }
                    break;
            }
        }
        if (!this.f39316l.mo35736d(t10).equals(this.f39316l.mo35736d(t11))) {
            return false;
        }
        if (!this.f39310f) {
            return true;
        }
        this.f39317m.mo34997b(t10);
        this.f39317m.mo34997b(t11);
        throw null;
    }

    /* renamed from: i */
    public final int m35936i(int i10) {
        return this.f39305a[i10 + 1];
    }

    /* renamed from: j */
    public final int m35937j(int i10) {
        return this.f39305a[i10 + 2];
    }

    /* renamed from: q */
    public final boolean m35938q(T t10, T t11, int i10) {
        return m35940s(t10, i10) == m35940s(t11, i10);
    }

    /* renamed from: r */
    public final boolean m35939r(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? m35940s(t10, i10) : (i12 & i13) != 0;
    }

    /* renamed from: s */
    public final boolean m35940s(T t10, int i10) {
        int m35937j = m35937j(i10);
        long j10 = m35937j & 1048575;
        if (j10 != 1048575) {
            return (C8099c9.m35129o(t10, j10) & (1 << (m35937j >>> 20))) != 0;
        }
        int m35936i = m35936i(i10);
        long j11 = m35936i & 1048575;
        switch (m35917k(m35936i)) {
            case 0:
                return C8099c9.m35137w(t10, j11) != 0.0d;
            case 1:
                return C8099c9.m35135u(t10, j11) != 0.0f;
            case 2:
                return C8099c9.m35131q(t10, j11) != 0;
            case 3:
                return C8099c9.m35131q(t10, j11) != 0;
            case 4:
                return C8099c9.m35129o(t10, j11) != 0;
            case 5:
                return C8099c9.m35131q(t10, j11) != 0;
            case 6:
                return C8099c9.m35129o(t10, j11) != 0;
            case 7:
                return C8099c9.m35133s(t10, j11);
            case 8:
                Object m35139y = C8099c9.m35139y(t10, j11);
                if (m35139y instanceof String) {
                    return !((String) m35139y).isEmpty();
                }
                if (m35139y instanceof AbstractC8230l5) {
                    return !AbstractC8230l5.f39165c.equals(m35139y);
                }
                throw new IllegalArgumentException();
            case 9:
                return C8099c9.m35139y(t10, j11) != null;
            case 10:
                return !AbstractC8230l5.f39165c.equals(C8099c9.m35139y(t10, j11));
            case 11:
                return C8099c9.m35129o(t10, j11) != 0;
            case 12:
                return C8099c9.m35129o(t10, j11) != 0;
            case 13:
                return C8099c9.m35129o(t10, j11) != 0;
            case 14:
                return C8099c9.m35131q(t10, j11) != 0;
            case 15:
                return C8099c9.m35129o(t10, j11) != 0;
            case 16:
                return C8099c9.m35131q(t10, j11) != 0;
            case 17:
                return C8099c9.m35139y(t10, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: t */
    public final void m35941t(T t10, int i10) {
        int m35937j = m35937j(i10);
        long j10 = 1048575 & m35937j;
        if (j10 == 1048575) {
            return;
        }
        C8099c9.m35130p(t10, j10, (1 << (m35937j >>> 20)) | C8099c9.m35129o(t10, j10));
    }

    /* renamed from: u */
    public final boolean m35942u(T t10, int i10, int i11) {
        return C8099c9.m35129o(t10, (long) (m35937j(i11) & 1048575)) == i10;
    }

    /* renamed from: v */
    public final void m35943v(T t10, int i10, int i11) {
        C8099c9.m35130p(t10, m35937j(i11) & 1048575, i10);
    }

    /* renamed from: w */
    public final int m35944w(int i10) {
        if (i10 < this.f39307c || i10 > this.f39308d) {
            return -1;
        }
        return m35946y(i10, 0);
    }

    /* renamed from: x */
    public final int m35945x(int i10, int i11) {
        if (i10 < this.f39307c || i10 > this.f39308d) {
            return -1;
        }
        return m35946y(i10, i11);
    }

    /* renamed from: y */
    public final int m35946y(int i10, int i11) {
        int length = (this.f39305a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f39305a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* renamed from: z */
    public final void m35947z(T t10, C8365u5 c8365u5) {
        int i10;
        int i11;
        if (this.f39310f) {
            this.f39317m.mo34997b(t10);
            throw null;
        }
        int length = this.f39305a.length;
        Unsafe unsafe = f39304q;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i12 < length) {
            int m35936i = m35936i(i12);
            int i15 = this.f39305a[i12];
            int m35917k = m35917k(m35936i);
            if (m35917k <= 17) {
                int i16 = this.f39305a[i12 + 2];
                int i17 = i16 & 1048575;
                i11 = i13;
                int i18 = i14;
                if (i17 != i14) {
                    i11 = unsafe.getInt(t10, i17);
                    i18 = i17;
                }
                i10 = 1 << (i16 >>> 20);
                i14 = i18;
            } else {
                i10 = 0;
                i11 = i13;
            }
            long j10 = m35936i & 1048575;
            switch (m35917k) {
                case 0:
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        c8365u5.m35892q(i15, C8099c9.m35137w(t10, j10));
                        break;
                    }
                case 1:
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        c8365u5.m35891p(i15, C8099c9.m35135u(t10, j10));
                        break;
                    }
                case 2:
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        c8365u5.m35889n(i15, unsafe.getLong(t10, j10));
                        break;
                    }
                case 3:
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        c8365u5.m35894s(i15, unsafe.getLong(t10, j10));
                        break;
                    }
                case 4:
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        c8365u5.m35895t(i15, unsafe.getInt(t10, j10));
                        break;
                    }
                case 5:
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        c8365u5.m35896u(i15, unsafe.getLong(t10, j10));
                        break;
                    }
                case 6:
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        c8365u5.m35897v(i15, unsafe.getInt(t10, j10));
                        break;
                    }
                case 7:
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        c8365u5.m35898w(i15, C8099c9.m35133s(t10, j10));
                        break;
                    }
                case 8:
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        m35911B(i15, unsafe.getObject(t10, j10), c8365u5);
                        break;
                    }
                case 9:
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        c8365u5.m35868C(i15, unsafe.getObject(t10, j10), m35932O(i12));
                        break;
                    }
                case 10:
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        c8365u5.m35900y(i15, (AbstractC8230l5) unsafe.getObject(t10, j10));
                        break;
                    }
                case 11:
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        c8365u5.m35901z(i15, unsafe.getInt(t10, j10));
                        break;
                    }
                case 12:
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        c8365u5.m35893r(i15, unsafe.getInt(t10, j10));
                        break;
                    }
                case 13:
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        c8365u5.m35888m(i15, unsafe.getInt(t10, j10));
                        break;
                    }
                case 14:
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        c8365u5.m35890o(i15, unsafe.getLong(t10, j10));
                        break;
                    }
                case 15:
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        c8365u5.m35866A(i15, unsafe.getInt(t10, j10));
                        break;
                    }
                case 16:
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        c8365u5.m35867B(i15, unsafe.getLong(t10, j10));
                        break;
                    }
                case 17:
                    if ((i11 & i10) == 0) {
                        break;
                    } else {
                        c8365u5.m35869D(i15, unsafe.getObject(t10, j10), m35932O(i12));
                        break;
                    }
                case 18:
                    C8128e8.m35304j(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, false);
                    break;
                case 19:
                    C8128e8.m35305k(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, false);
                    break;
                case 20:
                    C8128e8.m35306l(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, false);
                    break;
                case 21:
                    C8128e8.m35307m(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, false);
                    break;
                case 22:
                    C8128e8.m35311q(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, false);
                    break;
                case 23:
                    C8128e8.m35309o(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, false);
                    break;
                case 24:
                    C8128e8.m35314t(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, false);
                    break;
                case 25:
                    C8128e8.m35317w(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, false);
                    break;
                case 26:
                    C8128e8.m35318x(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5);
                    break;
                case 27:
                    C8128e8.m35320z(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, m35932O(i12));
                    break;
                case 28:
                    C8128e8.m35319y(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5);
                    break;
                case 29:
                    C8128e8.m35312r(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, false);
                    break;
                case 30:
                    C8128e8.m35316v(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, false);
                    break;
                case 31:
                    C8128e8.m35315u(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, false);
                    break;
                case 32:
                    C8128e8.m35310p(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, false);
                    break;
                case 33:
                    C8128e8.m35313s(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, false);
                    break;
                case 34:
                    C8128e8.m35308n(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, false);
                    break;
                case 35:
                    C8128e8.m35304j(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, true);
                    break;
                case 36:
                    C8128e8.m35305k(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, true);
                    break;
                case 37:
                    C8128e8.m35306l(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, true);
                    break;
                case 38:
                    C8128e8.m35307m(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, true);
                    break;
                case 39:
                    C8128e8.m35311q(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, true);
                    break;
                case 40:
                    C8128e8.m35309o(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, true);
                    break;
                case 41:
                    C8128e8.m35314t(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, true);
                    break;
                case 42:
                    C8128e8.m35317w(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, true);
                    break;
                case 43:
                    C8128e8.m35312r(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, true);
                    break;
                case 44:
                    C8128e8.m35316v(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, true);
                    break;
                case 45:
                    C8128e8.m35315u(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, true);
                    break;
                case 46:
                    C8128e8.m35310p(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, true);
                    break;
                case 47:
                    C8128e8.m35313s(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, true);
                    break;
                case 48:
                    C8128e8.m35308n(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, true);
                    break;
                case 49:
                    C8128e8.m35268B(this.f39305a[i12], (List) unsafe.getObject(t10, j10), c8365u5, m35932O(i12));
                    break;
                case 50:
                    m35923A(c8365u5, i15, unsafe.getObject(t10, j10), i12);
                    break;
                case 51:
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        c8365u5.m35892q(i15, m35918l(t10, j10));
                        break;
                    }
                case 52:
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        c8365u5.m35891p(i15, m35919m(t10, j10));
                        break;
                    }
                case 53:
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        c8365u5.m35889n(i15, m35921o(t10, j10));
                        break;
                    }
                case 54:
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        c8365u5.m35894s(i15, m35921o(t10, j10));
                        break;
                    }
                case 55:
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        c8365u5.m35895t(i15, m35920n(t10, j10));
                        break;
                    }
                case 56:
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        c8365u5.m35896u(i15, m35921o(t10, j10));
                        break;
                    }
                case 57:
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        c8365u5.m35897v(i15, m35920n(t10, j10));
                        break;
                    }
                case 58:
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        c8365u5.m35898w(i15, m35922p(t10, j10));
                        break;
                    }
                case 59:
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        m35911B(i15, unsafe.getObject(t10, j10), c8365u5);
                        break;
                    }
                case 60:
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        c8365u5.m35868C(i15, unsafe.getObject(t10, j10), m35932O(i12));
                        break;
                    }
                case 61:
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        c8365u5.m35900y(i15, (AbstractC8230l5) unsafe.getObject(t10, j10));
                        break;
                    }
                case 62:
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        c8365u5.m35901z(i15, m35920n(t10, j10));
                        break;
                    }
                case 63:
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        c8365u5.m35893r(i15, m35920n(t10, j10));
                        break;
                    }
                case 64:
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        c8365u5.m35888m(i15, m35920n(t10, j10));
                        break;
                    }
                case 65:
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        c8365u5.m35890o(i15, m35921o(t10, j10));
                        break;
                    }
                case 66:
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        c8365u5.m35866A(i15, m35920n(t10, j10));
                        break;
                    }
                case 67:
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        c8365u5.m35867B(i15, m35921o(t10, j10));
                        break;
                    }
                case 68:
                    if (!m35942u(t10, i15, i12)) {
                        break;
                    } else {
                        c8365u5.m35869D(i15, unsafe.getObject(t10, j10), m35932O(i12));
                        break;
                    }
            }
            i12 += 3;
            i13 = i11;
        }
        AbstractC8308q8<?, ?> abstractC8308q8 = this.f39316l;
        abstractC8308q8.mo35741i(abstractC8308q8.mo35736d(t10), c8365u5);
    }

    @Override // p305ra.InterfaceC8098c8
    public final T zza() {
        return (T) ((AbstractC8231l6) this.f39309e).mo35030x(4, null, null);
    }
}
