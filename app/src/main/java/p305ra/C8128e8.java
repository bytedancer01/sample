package p305ra;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/e8.class
 */
/* renamed from: ra.e8 */
/* loaded from: combined.jar:classes2.jar:ra/e8.class */
public final class C8128e8 {

    /* renamed from: a */
    public static final Class<?> f39056a;

    /* renamed from: b */
    public static final AbstractC8308q8<?, ?> f39057b;

    /* renamed from: c */
    public static final AbstractC8308q8<?, ?> f39058c;

    /* renamed from: d */
    public static final AbstractC8308q8<?, ?> f39059d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable th2) {
            cls = null;
        }
        f39056a = cls;
        f39057b = m35269C(false);
        f39058c = m35269C(true);
        f39059d = new C8338s8();
    }

    /* renamed from: A */
    public static void m35267A(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC8231l6.class.isAssignableFrom(cls) && (cls2 = f39056a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: B */
    public static void m35268B(int i10, List<?> list, C8365u5 c8365u5, InterfaceC8098c8 interfaceC8098c8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            c8365u5.m35869D(i10, list.get(i11), interfaceC8098c8);
        }
    }

    /* renamed from: C */
    public static AbstractC8308q8<?, ?> m35269C(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable th2) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (AbstractC8308q8) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable th3) {
            return null;
        }
    }

    /* renamed from: D */
    public static int m35270D(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C8142f7)) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i10 = i12;
                if (i13 >= size) {
                    break;
                }
                i12 += AbstractC8350t5.m35815D(list.get(i13).longValue());
                i13++;
            }
        } else {
            C8142f7 c8142f7 = (C8142f7) list;
            int i14 = 0;
            while (true) {
                i10 = i14;
                if (i11 >= size) {
                    break;
                }
                i14 += AbstractC8350t5.m35815D(c8142f7.mo35367u(i11));
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: E */
    public static int m35271E(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return m35270D(list) + (list.size() * AbstractC8350t5.m35812A(i10));
    }

    /* renamed from: F */
    public static int m35272F(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C8142f7)) {
            int i12 = 0;
            while (true) {
                i10 = i12;
                if (i11 >= size) {
                    break;
                }
                i12 += AbstractC8350t5.m35815D(list.get(i11).longValue());
                i11++;
            }
        } else {
            C8142f7 c8142f7 = (C8142f7) list;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i10 = i13;
                if (i14 >= size) {
                    break;
                }
                i13 += AbstractC8350t5.m35815D(c8142f7.mo35367u(i14));
                i14++;
            }
        }
        return i10;
    }

    /* renamed from: G */
    public static int m35273G(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35272F(list) + (size * AbstractC8350t5.m35812A(i10));
    }

    /* renamed from: H */
    public static int m35274H(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C8142f7)) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i10 = i12;
                if (i13 >= size) {
                    break;
                }
                i12 += AbstractC8350t5.m35815D(AbstractC8350t5.m35821d(list.get(i13).longValue()));
                i13++;
            }
        } else {
            C8142f7 c8142f7 = (C8142f7) list;
            int i14 = 0;
            while (true) {
                i10 = i14;
                if (i11 >= size) {
                    break;
                }
                i14 += AbstractC8350t5.m35815D(AbstractC8350t5.m35821d(c8142f7.mo35367u(i11)));
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: I */
    public static int m35275I(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35274H(list) + (size * AbstractC8350t5.m35812A(i10));
    }

    /* renamed from: J */
    public static int m35276J(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C8246m6)) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i10 = i12;
                if (i13 >= size) {
                    break;
                }
                i12 += AbstractC8350t5.m35813B(list.get(i13).intValue());
                i13++;
            }
        } else {
            C8246m6 c8246m6 = (C8246m6) list;
            int i14 = 0;
            while (true) {
                i10 = i14;
                if (i11 >= size) {
                    break;
                }
                i14 += AbstractC8350t5.m35813B(c8246m6.m35607g(i11));
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: K */
    public static int m35277K(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35276J(list) + (size * AbstractC8350t5.m35812A(i10));
    }

    /* renamed from: L */
    public static int m35278L(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C8246m6)) {
            int i12 = 0;
            while (true) {
                i10 = i12;
                if (i11 >= size) {
                    break;
                }
                i12 += AbstractC8350t5.m35813B(list.get(i11).intValue());
                i11++;
            }
        } else {
            C8246m6 c8246m6 = (C8246m6) list;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i10 = i13;
                if (i14 >= size) {
                    break;
                }
                i13 += AbstractC8350t5.m35813B(c8246m6.m35607g(i14));
                i14++;
            }
        }
        return i10;
    }

    /* renamed from: M */
    public static int m35279M(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35278L(list) + (size * AbstractC8350t5.m35812A(i10));
    }

    /* renamed from: N */
    public static int m35280N(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C8246m6)) {
            int i12 = 0;
            while (true) {
                i10 = i12;
                if (i11 >= size) {
                    break;
                }
                i12 += AbstractC8350t5.m35814C(list.get(i11).intValue());
                i11++;
            }
        } else {
            C8246m6 c8246m6 = (C8246m6) list;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i10 = i13;
                if (i14 >= size) {
                    break;
                }
                i13 += AbstractC8350t5.m35814C(c8246m6.m35607g(i14));
                i14++;
            }
        }
        return i10;
    }

    /* renamed from: O */
    public static int m35281O(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35280N(list) + (size * AbstractC8350t5.m35812A(i10));
    }

    /* renamed from: P */
    public static int m35282P(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C8246m6)) {
            int i12 = 0;
            while (true) {
                i10 = i12;
                if (i11 >= size) {
                    break;
                }
                i12 += AbstractC8350t5.m35814C(AbstractC8350t5.m35820c(list.get(i11).intValue()));
                i11++;
            }
        } else {
            C8246m6 c8246m6 = (C8246m6) list;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i10 = i13;
                if (i14 >= size) {
                    break;
                }
                i13 += AbstractC8350t5.m35814C(AbstractC8350t5.m35820c(c8246m6.m35607g(i14)));
                i14++;
            }
        }
        return i10;
    }

    /* renamed from: Q */
    public static int m35283Q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35282P(list) + (size * AbstractC8350t5.m35812A(i10));
    }

    /* renamed from: R */
    public static int m35284R(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: S */
    public static int m35285S(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC8350t5.m35812A(i10) + 4);
    }

    /* renamed from: T */
    public static int m35286T(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: U */
    public static int m35287U(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC8350t5.m35812A(i10) + 8);
    }

    /* renamed from: V */
    public static int m35288V(List<?> list) {
        return list.size();
    }

    /* renamed from: W */
    public static int m35289W(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC8350t5.m35812A(i10) + 1);
    }

    /* renamed from: X */
    public static int m35290X(int i10, List<?> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        int m35812A = AbstractC8350t5.m35812A(i10) * size;
        int i13 = m35812A;
        if (!(list instanceof InterfaceC8067a7)) {
            while (true) {
                i11 = i13;
                if (i12 >= size) {
                    break;
                }
                Object obj = list.get(i12);
                i13 += obj instanceof AbstractC8230l5 ? AbstractC8350t5.m35818a((AbstractC8230l5) obj) : AbstractC8350t5.m35816E((String) obj);
                i12++;
            }
        } else {
            InterfaceC8067a7 interfaceC8067a7 = (InterfaceC8067a7) list;
            int i14 = m35812A;
            int i15 = 0;
            while (true) {
                i11 = i14;
                if (i15 >= size) {
                    break;
                }
                Object mo35000m = interfaceC8067a7.mo35000m(i15);
                i14 += mo35000m instanceof AbstractC8230l5 ? AbstractC8350t5.m35818a((AbstractC8230l5) mo35000m) : AbstractC8350t5.m35816E((String) mo35000m);
                i15++;
            }
        }
        return i11;
    }

    /* renamed from: Y */
    public static int m35291Y(int i10, Object obj, InterfaceC8098c8 interfaceC8098c8) {
        if (!(obj instanceof C8426y6)) {
            return AbstractC8350t5.m35812A(i10) + AbstractC8350t5.m35819b((InterfaceC8307q7) obj, interfaceC8098c8);
        }
        int m35812A = AbstractC8350t5.m35812A(i10);
        int m36229a = ((C8426y6) obj).m36229a();
        return m35812A + AbstractC8350t5.m35814C(m36229a) + m36229a;
    }

    /* renamed from: Z */
    public static int m35292Z(int i10, List<?> list, InterfaceC8098c8 interfaceC8098c8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m35812A = AbstractC8350t5.m35812A(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            m35812A += obj instanceof C8426y6 ? AbstractC8350t5.m35817F((C8426y6) obj) : AbstractC8350t5.m35819b((InterfaceC8307q7) obj, interfaceC8098c8);
        }
        return m35812A;
    }

    /* renamed from: a */
    public static AbstractC8308q8<?, ?> m35293a() {
        return f39057b;
    }

    /* renamed from: a0 */
    public static int m35294a0(int i10, List<AbstractC8230l5> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m35812A = size * AbstractC8350t5.m35812A(i10);
        int i11 = m35812A;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += AbstractC8350t5.m35818a(list.get(i12));
        }
        return i11;
    }

    /* renamed from: b */
    public static AbstractC8308q8<?, ?> m35295b() {
        return f39058c;
    }

    /* renamed from: b0 */
    public static int m35296b0(int i10, List<InterfaceC8307q7> list, InterfaceC8098c8 interfaceC8098c8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC8350t5.m35822g(i10, list.get(i12), interfaceC8098c8);
        }
        return i11;
    }

    /* renamed from: c */
    public static AbstractC8308q8<?, ?> m35297c() {
        return f39059d;
    }

    /* renamed from: d */
    public static boolean m35298d(Object obj, Object obj2) {
        boolean z10 = false;
        if (obj != obj2) {
            if (obj != null) {
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return z10;
        }
        z10 = true;
        return z10;
    }

    /* renamed from: e */
    public static <T, FT extends InterfaceC8096c6<FT>> void m35299e(AbstractC8440z5<FT> abstractC8440z5, T t10, T t11) {
        abstractC8440z5.mo34997b(t11);
        throw null;
    }

    /* renamed from: f */
    public static <T, UT, UB> void m35300f(AbstractC8308q8<UT, UB> abstractC8308q8, T t10, T t11) {
        abstractC8308q8.mo35735c(t10, abstractC8308q8.mo35738f(abstractC8308q8.mo35736d(t10), abstractC8308q8.mo35736d(t11)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static <UT, UB> UB m35301g(int i10, List<Integer> list, InterfaceC8291p6 interfaceC8291p6, UB ub2, AbstractC8308q8<UT, UB> abstractC8308q8) {
        UB ub3;
        if (interfaceC8291p6 == null) {
            return ub2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (true) {
                ub3 = ub2;
                if (!it.hasNext()) {
                    break;
                }
                int intValue = it.next().intValue();
                if (!interfaceC8291p6.mo35032a(intValue)) {
                    ub2 = m35302h(i10, intValue, ub2, abstractC8308q8);
                    it.remove();
                }
            }
        } else {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue2 = list.get(i12).intValue();
                if (interfaceC8291p6.mo35032a(intValue2)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue2));
                    }
                    i11++;
                } else {
                    ub2 = m35302h(i10, intValue2, ub2, abstractC8308q8);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return ub2;
            }
            ub3 = ub2;
        }
        return ub3;
    }

    /* renamed from: h */
    public static <UT, UB> UB m35302h(int i10, int i11, UB ub2, AbstractC8308q8<UT, UB> abstractC8308q8) {
        UB ub3 = ub2;
        if (ub2 == null) {
            ub3 = abstractC8308q8.mo35734b();
        }
        abstractC8308q8.mo35733a(ub3, i10, i11);
        return ub3;
    }

    /* renamed from: i */
    public static <T> void m35303i(C8232l7 c8232l7, T t10, T t11, long j10) {
        C8099c9.m35140z(t10, j10, C8232l7.m35592b(C8099c9.m35139y(t10, j10), C8099c9.m35139y(t11, j10)));
    }

    /* renamed from: j */
    public static void m35304j(int i10, List<Double> list, C8365u5 c8365u5, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8365u5.m35878b(i10, list, z10);
    }

    /* renamed from: k */
    public static void m35305k(int i10, List<Float> list, C8365u5 c8365u5, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8365u5.m35877a(i10, list, z10);
    }

    /* renamed from: l */
    public static void m35306l(int i10, List<Long> list, C8365u5 c8365u5, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8365u5.m35874I(i10, list, z10);
    }

    /* renamed from: m */
    public static void m35307m(int i10, List<Long> list, C8365u5 c8365u5, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8365u5.m35875J(i10, list, z10);
    }

    /* renamed from: n */
    public static void m35308n(int i10, List<Long> list, C8365u5 c8365u5, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8365u5.m35887k(i10, list, z10);
    }

    /* renamed from: o */
    public static void m35309o(int i10, List<Long> list, C8365u5 c8365u5, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8365u5.m35876K(i10, list, z10);
    }

    /* renamed from: p */
    public static void m35310p(int i10, List<Long> list, C8365u5 c8365u5, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8365u5.m35885i(i10, list, z10);
    }

    /* renamed from: q */
    public static void m35311q(int i10, List<Integer> list, C8365u5 c8365u5, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8365u5.m35872G(i10, list, z10);
    }

    /* renamed from: r */
    public static void m35312r(int i10, List<Integer> list, C8365u5 c8365u5, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8365u5.m35883g(i10, list, z10);
    }

    /* renamed from: s */
    public static void m35313s(int i10, List<Integer> list, C8365u5 c8365u5, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8365u5.m35886j(i10, list, z10);
    }

    /* renamed from: t */
    public static void m35314t(int i10, List<Integer> list, C8365u5 c8365u5, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8365u5.m35873H(i10, list, z10);
    }

    /* renamed from: u */
    public static void m35315u(int i10, List<Integer> list, C8365u5 c8365u5, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8365u5.m35884h(i10, list, z10);
    }

    /* renamed from: v */
    public static void m35316v(int i10, List<Integer> list, C8365u5 c8365u5, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8365u5.m35879c(i10, list, z10);
    }

    /* renamed from: w */
    public static void m35317w(int i10, List<Boolean> list, C8365u5 c8365u5, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8365u5.m35880d(i10, list, z10);
    }

    /* renamed from: x */
    public static void m35318x(int i10, List<String> list, C8365u5 c8365u5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8365u5.m35881e(i10, list);
    }

    /* renamed from: y */
    public static void m35319y(int i10, List<AbstractC8230l5> list, C8365u5 c8365u5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8365u5.m35882f(i10, list);
    }

    /* renamed from: z */
    public static void m35320z(int i10, List<?> list, C8365u5 c8365u5, InterfaceC8098c8 interfaceC8098c8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            c8365u5.m35868C(i10, list.get(i11), interfaceC8098c8);
        }
    }
}
