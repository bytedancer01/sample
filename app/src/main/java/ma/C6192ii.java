package ma;

import java.util.List;
import java.util.logging.Logger;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ii.class
 */
/* renamed from: ma.ii */
/* loaded from: combined.jar:classes2.jar:ma/ii.class */
public final class C6192ii {

    /* renamed from: a */
    public static final Class f33825a;

    /* renamed from: b */
    public static final AbstractC6504xi f33826b;

    /* renamed from: c */
    public static final AbstractC6504xi f33827c;

    /* renamed from: d */
    public static final AbstractC6504xi f33828d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable th2) {
            cls = null;
        }
        f33825a = cls;
        f33826b = m29730w(false);
        f33827c = m29730w(true);
        f33828d = new C6544zi();
    }

    /* renamed from: A */
    public static int m29685A(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6316og)) {
            int i12 = 0;
            while (true) {
                i10 = i12;
                if (i11 >= size) {
                    break;
                }
                i12 += AbstractC6022ag.m29403v(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            C6316og c6316og = (C6316og) list;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i10 = i13;
                if (i14 >= size) {
                    break;
                }
                i13 += AbstractC6022ag.m29403v(c6316og.m29933e(i14));
                i14++;
            }
        }
        return i10;
    }

    /* renamed from: B */
    public static int m29686B(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC6022ag.m29406y(i10 << 3) + 4);
    }

    /* renamed from: C */
    public static int m29687C(List list) {
        return list.size() * 4;
    }

    /* renamed from: D */
    public static int m29688D(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC6022ag.m29406y(i10 << 3) + 8);
    }

    /* renamed from: E */
    public static int m29689E(List list) {
        return list.size() * 8;
    }

    /* renamed from: F */
    public static int m29690F(int i10, List list, InterfaceC6150gi interfaceC6150gi) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC6022ag.m29402u(i10, (InterfaceC6443uh) list.get(i12), interfaceC6150gi);
        }
        return i11;
    }

    /* renamed from: G */
    public static int m29691G(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29692H(list) + (size * AbstractC6022ag.m29406y(i10 << 3));
    }

    /* renamed from: H */
    public static int m29692H(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6316og)) {
            int i12 = 0;
            while (true) {
                i10 = i12;
                if (i11 >= size) {
                    break;
                }
                i12 += AbstractC6022ag.m29403v(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            C6316og c6316og = (C6316og) list;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i10 = i13;
                if (i14 >= size) {
                    break;
                }
                i13 += AbstractC6022ag.m29403v(c6316og.m29933e(i14));
                i14++;
            }
        }
        return i10;
    }

    /* renamed from: I */
    public static int m29693I(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return m29694J(list) + (list.size() * AbstractC6022ag.m29406y(i10 << 3));
    }

    /* renamed from: J */
    public static int m29694J(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6212jh)) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i10 = i12;
                if (i13 >= size) {
                    break;
                }
                i12 += AbstractC6022ag.m29407z(((Long) list.get(i13)).longValue());
                i13++;
            }
        } else {
            C6212jh c6212jh = (C6212jh) list;
            int i14 = 0;
            while (true) {
                i10 = i14;
                if (i11 >= size) {
                    break;
                }
                i14 += AbstractC6022ag.m29407z(c6212jh.m29785e(i11));
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: K */
    public static int m29695K(int i10, Object obj, InterfaceC6150gi interfaceC6150gi) {
        if (!(obj instanceof C6542zg)) {
            return AbstractC6022ag.m29406y(i10 << 3) + AbstractC6022ag.m29404w((InterfaceC6443uh) obj, interfaceC6150gi);
        }
        Logger logger = AbstractC6022ag.f33661b;
        int m30192a = ((C6542zg) obj).m30192a();
        return AbstractC6022ag.m29406y(i10 << 3) + AbstractC6022ag.m29406y(m30192a) + m30192a;
    }

    /* renamed from: L */
    public static int m29696L(int i10, List list, InterfaceC6150gi interfaceC6150gi) {
        int i11;
        int m29404w;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m29406y = AbstractC6022ag.m29406y(i10 << 3) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            if (obj instanceof C6542zg) {
                int m30192a = ((C6542zg) obj).m30192a();
                i11 = m29406y;
                m29404w = AbstractC6022ag.m29406y(m30192a) + m30192a;
            } else {
                i11 = m29406y;
                m29404w = AbstractC6022ag.m29404w((InterfaceC6443uh) obj, interfaceC6150gi);
            }
            m29406y = i11 + m29404w;
        }
        return m29406y;
    }

    /* renamed from: M */
    public static int m29697M(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29698N(list) + (size * AbstractC6022ag.m29406y(i10 << 3));
    }

    /* renamed from: N */
    public static int m29698N(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6316og)) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i10 = i12;
                if (i13 >= size) {
                    break;
                }
                int intValue = ((Integer) list.get(i13)).intValue();
                i12 += AbstractC6022ag.m29406y((intValue >> 31) ^ (intValue + intValue));
                i13++;
            }
        } else {
            C6316og c6316og = (C6316og) list;
            int i14 = 0;
            while (true) {
                i10 = i14;
                if (i11 >= size) {
                    break;
                }
                int m29933e = c6316og.m29933e(i11);
                i14 += AbstractC6022ag.m29406y((m29933e >> 31) ^ (m29933e + m29933e));
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: O */
    public static int m29699O(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29700P(list) + (size * AbstractC6022ag.m29406y(i10 << 3));
    }

    /* renamed from: P */
    public static int m29700P(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6212jh)) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i10 = i12;
                if (i13 >= size) {
                    break;
                }
                long longValue = ((Long) list.get(i13)).longValue();
                i12 += AbstractC6022ag.m29407z((longValue >> 63) ^ (longValue + longValue));
                i13++;
            }
        } else {
            C6212jh c6212jh = (C6212jh) list;
            int i14 = 0;
            while (true) {
                i10 = i14;
                if (i11 >= size) {
                    break;
                }
                long m29785e = c6212jh.m29785e(i11);
                i14 += AbstractC6022ag.m29407z((m29785e >> 63) ^ (m29785e + m29785e));
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: Q */
    public static int m29701Q(int i10, List list) {
        int i11;
        int i12;
        int m29405x;
        int i13;
        int m29405x2;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        Logger logger = AbstractC6022ag.f33661b;
        boolean z10 = list instanceof InterfaceC6044bh;
        int m29406y = AbstractC6022ag.m29406y(i10 << 3) * size;
        int i15 = m29406y;
        if (!z10) {
            while (true) {
                i11 = i15;
                if (i14 >= size) {
                    break;
                }
                Object obj = list.get(i14);
                if (obj instanceof AbstractC6399sf) {
                    int mo29850d = ((AbstractC6399sf) obj).mo29850d();
                    i12 = i15;
                    m29405x = AbstractC6022ag.m29406y(mo29850d) + mo29850d;
                } else {
                    i12 = i15;
                    m29405x = AbstractC6022ag.m29405x((String) obj);
                }
                i15 = i12 + m29405x;
                i14++;
            }
        } else {
            InterfaceC6044bh interfaceC6044bh = (InterfaceC6044bh) list;
            int i16 = m29406y;
            int i17 = 0;
            while (true) {
                i11 = i16;
                if (i17 >= size) {
                    break;
                }
                Object mo29430n = interfaceC6044bh.mo29430n(i17);
                if (mo29430n instanceof AbstractC6399sf) {
                    int mo29850d2 = ((AbstractC6399sf) mo29430n).mo29850d();
                    i13 = i16;
                    m29405x2 = AbstractC6022ag.m29406y(mo29850d2) + mo29850d2;
                } else {
                    i13 = i16;
                    m29405x2 = AbstractC6022ag.m29405x((String) mo29430n);
                }
                i16 = i13 + m29405x2;
                i17++;
            }
        }
        return i11;
    }

    /* renamed from: R */
    public static int m29702R(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29703S(list) + (size * AbstractC6022ag.m29406y(i10 << 3));
    }

    /* renamed from: S */
    public static int m29703S(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6316og)) {
            int i12 = 0;
            while (true) {
                i10 = i12;
                if (i11 >= size) {
                    break;
                }
                i12 += AbstractC6022ag.m29406y(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            C6316og c6316og = (C6316og) list;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i10 = i13;
                if (i14 >= size) {
                    break;
                }
                i13 += AbstractC6022ag.m29406y(c6316og.m29933e(i14));
                i14++;
            }
        }
        return i10;
    }

    /* renamed from: T */
    public static int m29704T(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29705U(list) + (size * AbstractC6022ag.m29406y(i10 << 3));
    }

    /* renamed from: U */
    public static int m29705U(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6212jh)) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i10 = i12;
                if (i13 >= size) {
                    break;
                }
                i12 += AbstractC6022ag.m29407z(((Long) list.get(i13)).longValue());
                i13++;
            }
        } else {
            C6212jh c6212jh = (C6212jh) list;
            int i14 = 0;
            while (true) {
                i10 = i14;
                if (i11 >= size) {
                    break;
                }
                i14 += AbstractC6022ag.m29407z(c6212jh.m29785e(i11));
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: V */
    public static AbstractC6504xi m29706V() {
        return f33826b;
    }

    /* renamed from: W */
    public static AbstractC6504xi m29707W() {
        return f33827c;
    }

    /* renamed from: a */
    public static AbstractC6504xi m29708a() {
        return f33828d;
    }

    /* renamed from: b */
    public static void m29709b(AbstractC6504xi abstractC6504xi, Object obj, Object obj2) {
        abstractC6504xi.mo30152f(obj, abstractC6504xi.mo30150d(abstractC6504xi.mo30149c(obj), abstractC6504xi.mo30149c(obj2)));
    }

    /* renamed from: c */
    public static void m29710c(Class cls) {
        Class cls2;
        if (!AbstractC6295ng.class.isAssignableFrom(cls) && (cls2 = f33825a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: d */
    public static void m29711d(int i10, List list, InterfaceC6340pj interfaceC6340pj, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6340pj.mo29457f(i10, list, z10);
    }

    /* renamed from: e */
    public static void m29712e(int i10, List list, InterfaceC6340pj interfaceC6340pj) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6340pj.mo29452a(i10, list);
    }

    /* renamed from: f */
    public static void m29713f(int i10, List list, InterfaceC6340pj interfaceC6340pj, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6340pj.mo29447D(i10, list, z10);
    }

    /* renamed from: g */
    public static void m29714g(int i10, List list, InterfaceC6340pj interfaceC6340pj, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6340pj.mo29470s(i10, list, z10);
    }

    /* renamed from: h */
    public static void m29715h(int i10, List list, InterfaceC6340pj interfaceC6340pj, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6340pj.mo29477z(i10, list, z10);
    }

    /* renamed from: i */
    public static void m29716i(int i10, List list, InterfaceC6340pj interfaceC6340pj, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6340pj.mo29464m(i10, list, z10);
    }

    /* renamed from: j */
    public static void m29717j(int i10, List list, InterfaceC6340pj interfaceC6340pj, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6340pj.mo29467p(i10, list, z10);
    }

    /* renamed from: k */
    public static void m29718k(int i10, List list, InterfaceC6340pj interfaceC6340pj, InterfaceC6150gi interfaceC6150gi) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((C6043bg) interfaceC6340pj).mo29446C(i10, list.get(i11), interfaceC6150gi);
        }
    }

    /* renamed from: l */
    public static void m29719l(int i10, List list, InterfaceC6340pj interfaceC6340pj, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6340pj.mo29453b(i10, list, z10);
    }

    /* renamed from: m */
    public static void m29720m(int i10, List list, InterfaceC6340pj interfaceC6340pj, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6340pj.mo29456e(i10, list, z10);
    }

    /* renamed from: n */
    public static void m29721n(int i10, List list, InterfaceC6340pj interfaceC6340pj, InterfaceC6150gi interfaceC6150gi) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((C6043bg) interfaceC6340pj).mo29459h(i10, list.get(i11), interfaceC6150gi);
        }
    }

    /* renamed from: o */
    public static void m29722o(int i10, List list, InterfaceC6340pj interfaceC6340pj, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6340pj.mo29450G(i10, list, z10);
    }

    /* renamed from: p */
    public static void m29723p(int i10, List list, InterfaceC6340pj interfaceC6340pj, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6340pj.mo29472u(i10, list, z10);
    }

    /* renamed from: q */
    public static void m29724q(int i10, List list, InterfaceC6340pj interfaceC6340pj, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6340pj.mo29461j(i10, list, z10);
    }

    /* renamed from: r */
    public static void m29725r(int i10, List list, InterfaceC6340pj interfaceC6340pj, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6340pj.mo29444A(i10, list, z10);
    }

    /* renamed from: s */
    public static void m29726s(int i10, List list, InterfaceC6340pj interfaceC6340pj) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6340pj.mo29458g(i10, list);
    }

    /* renamed from: t */
    public static void m29727t(int i10, List list, InterfaceC6340pj interfaceC6340pj, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6340pj.mo29468q(i10, list, z10);
    }

    /* renamed from: u */
    public static void m29728u(int i10, List list, InterfaceC6340pj interfaceC6340pj, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6340pj.mo29474w(i10, list, z10);
    }

    /* renamed from: v */
    public static boolean m29729v(Object obj, Object obj2) {
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

    /* renamed from: w */
    public static AbstractC6504xi m29730w(boolean z10) {
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
            return (AbstractC6504xi) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable th3) {
            return null;
        }
    }

    /* renamed from: x */
    public static int m29731x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC6022ag.m29406y(i10 << 3) + 1);
    }

    /* renamed from: y */
    public static int m29732y(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m29406y = size * AbstractC6022ag.m29406y(i10 << 3);
        int i11 = m29406y;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int mo29850d = ((AbstractC6399sf) list.get(i12)).mo29850d();
            i11 += AbstractC6022ag.m29406y(mo29850d) + mo29850d;
        }
        return i11;
    }

    /* renamed from: z */
    public static int m29733z(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29685A(list) + (size * AbstractC6022ag.m29406y(i10 << 3));
    }
}
