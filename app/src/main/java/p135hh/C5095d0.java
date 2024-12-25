package p135hh;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import de.blinkt.openvpn.core.NativeUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Vector;
import p135hh.C5091b0;
import p135hh.InterfaceC5106n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/d0.class
 */
/* renamed from: hh.d0 */
/* loaded from: combined.jar:classes2.jar:hh/d0.class */
public class C5095d0 {

    /* renamed from: e */
    public static String f29248e = "";

    /* renamed from: f */
    public static String f29249f = "NOPROCESS";

    /* renamed from: g */
    public static int f29250g = 2132018636;

    /* renamed from: h */
    public static Intent f29251h;

    /* renamed from: i */
    public static String f29252i;

    /* renamed from: j */
    public static boolean f29253j;

    /* renamed from: k */
    public static final Object f29254k = new Object();

    /* renamed from: m */
    public static final byte[] f29256m = {-58, -42, -44, -106, 90, -88, -87, -88, -52, -124, 84, 117, 66, 79, -112, -111, -46, 86, -37, 109};

    /* renamed from: n */
    public static final byte[] f29257n = {-99, -69, 45, 71, 114, -116, 82, 66, -99, -122, 50, -70, -56, -111, 98, -35, -65, 105, 82, 43};

    /* renamed from: o */
    public static final byte[] f29258o = {-116, -115, -118, -89, -116, -112, 120, 55, 79, -8, -119, -23, 106, -114, -85, -56, -4, 105, 26, -57};

    /* renamed from: p */
    public static final byte[] f29259p = {-92, 111, -42, -46, 123, -96, -60, 79, -27, -31, 49, 103, 11, -54, -68, -27, 17, 2, 121, 104};

    /* renamed from: q */
    public static EnumC5096e f29260q = EnumC5096e.LEVEL_NOTCONNECTED;

    /* renamed from: a */
    public static final LinkedList<C5103k> f29244a = new LinkedList<>();

    /* renamed from: b */
    public static Vector<d> f29245b = new Vector<>();

    /* renamed from: c */
    public static Vector<e> f29246c = new Vector<>();

    /* renamed from: d */
    public static Vector<b> f29247d = new Vector<>();

    /* renamed from: l */
    public static C5091b0 f29255l = new C5091b0();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/d0$a.class
     */
    /* renamed from: hh.d0$a */
    /* loaded from: combined.jar:classes2.jar:hh/d0$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f29261a;

        /* renamed from: b */
        public static final int[] f29262b;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x003f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                hh.n$b[] r0 = p135hh.InterfaceC5106n.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p135hh.C5095d0.a.f29262b = r0
                r0 = r4
                hh.n$b r1 = p135hh.InterfaceC5106n.b.noNetwork     // Catch: java.lang.NoSuchFieldError -> L3f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3f
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3f
            L14:
                int[] r0 = p135hh.C5095d0.a.f29262b     // Catch: java.lang.NoSuchFieldError -> L3f java.lang.NoSuchFieldError -> L43
                hh.n$b r1 = p135hh.InterfaceC5106n.b.screenOff     // Catch: java.lang.NoSuchFieldError -> L43
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L43
            L1f:
                int[] r0 = p135hh.C5095d0.a.f29262b     // Catch: java.lang.NoSuchFieldError -> L43 java.lang.NoSuchFieldError -> L47
                hh.n$b r1 = p135hh.InterfaceC5106n.b.userPause     // Catch: java.lang.NoSuchFieldError -> L47
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L47
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L47
            L2a:
                hh.e[] r0 = p135hh.EnumC5096e.values()     // Catch: java.lang.NoSuchFieldError -> L47
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p135hh.C5095d0.a.f29261a = r0
                r0 = r4
                hh.e r1 = p135hh.EnumC5096e.LEVEL_CONNECTED     // Catch: java.lang.NoSuchFieldError -> L4b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4b
            L3e:
                return
            L3f:
                r4 = move-exception
                goto L14
            L43:
                r4 = move-exception
                goto L1f
            L47:
                r4 = move-exception
                goto L2a
            L4b:
                r4 = move-exception
                goto L3e
            */
            throw new UnsupportedOperationException("Method not decompiled: p135hh.C5095d0.a.m44594clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/d0$b.class
     */
    /* renamed from: hh.d0$b */
    /* loaded from: combined.jar:classes2.jar:hh/d0$b.class */
    public interface b {
        /* renamed from: Z */
        void mo22570Z(long j10, long j11, long j12, long j13);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/d0$c.class
     */
    /* renamed from: hh.d0$c */
    /* loaded from: combined.jar:classes2.jar:hh/d0$c.class */
    public enum c {
        INFO(2),
        ERROR(-2),
        WARNING(1),
        VERBOSE(3),
        DEBUG(4);

        public int mValue;

        c(int i10) {
            this.mValue = i10;
        }

        public static c getEnumByValue(int i10) {
            if (i10 == -2) {
                return ERROR;
            }
            if (i10 == 1) {
                return WARNING;
            }
            if (i10 == 2) {
                return INFO;
            }
            if (i10 == 3) {
                return VERBOSE;
            }
            if (i10 != 4) {
                return null;
            }
            return DEBUG;
        }

        public int getInt() {
            return this.mValue;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/d0$d.class
     */
    /* renamed from: hh.d0$d */
    /* loaded from: combined.jar:classes2.jar:hh/d0$d.class */
    public interface d {
        /* renamed from: a */
        void mo25484a(C5103k c5103k);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/d0$e.class
     */
    /* renamed from: hh.d0$e */
    /* loaded from: combined.jar:classes2.jar:hh/d0$e.class */
    public interface e {
        /* renamed from: U0 */
        void mo22565U0(String str, String str2, int i10, EnumC5096e enumC5096e, Intent intent);

        /* renamed from: y0 */
        void mo22572y0(String str);
    }

    static {
        m25479v();
    }

    /* renamed from: A */
    public static void m25447A(C5103k c5103k) {
        m25448B(c5103k, false);
    }

    /* renamed from: B */
    public static void m25448B(C5103k c5103k, boolean z10) {
        synchronized (C5095d0.class) {
            try {
                if (z10) {
                    f29244a.addFirst(c5103k);
                } else {
                    f29244a.addLast(c5103k);
                }
                if (f29244a.size() > 1500) {
                    while (true) {
                        LinkedList<C5103k> linkedList = f29244a;
                        if (linkedList.size() <= 1000) {
                            break;
                        } else {
                            linkedList.removeFirst();
                        }
                    }
                }
                Iterator<d> it = f29245b.iterator();
                while (it.hasNext()) {
                    it.next().mo25484a(c5103k);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: C */
    public static void m25449C(b bVar) {
        synchronized (C5095d0.class) {
            try {
                f29247d.remove(bVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: D */
    public static void m25450D(d dVar) {
        synchronized (C5095d0.class) {
            try {
                f29245b.remove(dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: E */
    public static void m25451E(e eVar) {
        synchronized (C5095d0.class) {
            try {
                f29246c.remove(eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: F */
    public static void m25452F(String str) {
        f29252i = str;
        Iterator<e> it = f29246c.iterator();
        while (it.hasNext()) {
            it.next().mo22572y0(str);
        }
    }

    /* renamed from: G */
    public static void m25453G(long j10, long j11) {
        synchronized (C5095d0.class) {
            try {
                C5091b0.b m25401b = f29255l.m25401b(j10, j11);
                Iterator<b> it = f29247d.iterator();
                while (it.hasNext()) {
                    it.next().mo22570Z(j10, j11, m25401b.m25407a(), m25401b.m25408b());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: H */
    public static void m25454H(InterfaceC5106n.b bVar) {
        int i10;
        EnumC5096e enumC5096e;
        String str;
        int i11 = a.f29262b[bVar.ordinal()];
        if (i11 == 1) {
            i10 = 2132018635;
            enumC5096e = EnumC5096e.LEVEL_NONETWORK;
            str = "NONETWORK";
        } else if (i11 == 2) {
            i10 = 2132018639;
            enumC5096e = EnumC5096e.LEVEL_VPNPAUSED;
            str = "SCREENOFF";
        } else {
            if (i11 != 3) {
                return;
            }
            i10 = 2132018645;
            enumC5096e = EnumC5096e.LEVEL_VPNPAUSED;
            str = "USERPAUSE";
        }
        m25456J(str, "", i10, enumC5096e);
    }

    /* renamed from: I */
    public static void m25455I(String str, String str2) {
        if (f29260q == EnumC5096e.LEVEL_WAITING_FOR_USER_INPUT && str.equals("GET_CONFIG")) {
            return;
        }
        m25456J(str, str2, m25466i(str), m25465h(str));
    }

    /* renamed from: J */
    public static void m25456J(String str, String str2, int i10, EnumC5096e enumC5096e) {
        synchronized (C5095d0.class) {
            try {
                m25457K(str, str2, i10, enumC5096e, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: K */
    public static void m25457K(String str, String str2, int i10, EnumC5096e enumC5096e, Intent intent) {
        synchronized (C5095d0.class) {
            try {
                if (f29260q == EnumC5096e.LEVEL_CONNECTED && (str.equals("WAIT") || str.equals("AUTH"))) {
                    m25447A(new C5103k(c.DEBUG, String.format("Ignoring OpenVPN Status in CONNECTED state (%s->%s): %s", str, enumC5096e.toString(), str2)));
                    return;
                }
                String str3 = str;
                if (str.equals("AUTH_FAILED")) {
                    str3 = str;
                    if (str2.equals("Private Key")) {
                        str3 = "AUTH_FAILED_PRIVATE_KEY";
                    }
                }
                f29249f = str3;
                f29248e = str2;
                f29250g = i10;
                f29260q = enumC5096e;
                f29251h = intent;
                Iterator<e> it = f29246c.iterator();
                while (it.hasNext()) {
                    it.next().mo22565U0(str3, str2, i10, enumC5096e, intent);
                }
            } finally {
            }
        }
    }

    /* renamed from: a */
    public static void m25458a(b bVar) {
        synchronized (C5095d0.class) {
            try {
                C5091b0.b m25403j = f29255l.m25403j(null);
                bVar.mo22570Z(m25403j.m25409c(), m25403j.m25410d(), m25403j.m25407a(), m25403j.m25408b());
                f29247d.add(bVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public static void m25459b(d dVar) {
        synchronized (C5095d0.class) {
            try {
                f29245b.add(dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public static void m25460c(e eVar) {
        synchronized (C5095d0.class) {
            try {
                if (!f29246c.contains(eVar)) {
                    f29246c.add(eVar);
                    String str = f29249f;
                    if (str != null) {
                        eVar.mo22565U0(str, f29248e, f29250g, f29260q, f29251h);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public static void m25461d() {
        synchronized (C5095d0.class) {
            try {
                f29244a.clear();
                m25479v();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public static void m25462e() {
    }

    /* renamed from: f */
    public static String m25463f(Context context) {
        String str = f29248e;
        if (a.f29261a[f29260q.ordinal()] == 1) {
            String[] split = f29248e.split(",");
            if (split.length >= 7) {
                str = String.format(Locale.US, "%s %s", split[1], split[6]);
            }
        }
        while (str.endsWith(",")) {
            str = str.substring(0, str.length() - 1);
        }
        String str2 = f29249f;
        if (str2.equals("NOPROCESS")) {
            return str;
        }
        int i10 = f29250g;
        if (i10 == 2132018647) {
            return context.getString(2132018647, f29248e);
        }
        String string = context.getString(i10);
        String str3 = str;
        if (f29250g == 2132018735) {
            str3 = str2 + str;
        }
        String str4 = string;
        if (str3.length() > 0) {
            str4 = string + ": ";
        }
        return str4 + str3;
    }

    /* renamed from: g */
    public static String m25464g() {
        return f29252i;
    }

    /* renamed from: h */
    public static EnumC5096e m25465h(String str) {
        for (int i10 = 0; i10 < 5; i10++) {
            if (str.equals(new String[]{"CONNECTING", "WAIT", "RECONNECTING", "RESOLVE", "TCP_CONNECT"}[i10])) {
                return EnumC5096e.LEVEL_CONNECTING_NO_SERVER_REPLY_YET;
            }
        }
        for (int i11 = 0; i11 < 5; i11++) {
            if (str.equals(new String[]{"AUTH", "GET_CONFIG", "ASSIGN_IP", "ADD_ROUTES", "AUTH_PENDING"}[i11])) {
                return EnumC5096e.LEVEL_CONNECTING_SERVER_REPLIED;
            }
        }
        int i12 = 0;
        while (true) {
            if (i12 >= 1) {
                for (int i13 = 0; i13 < 2; i13++) {
                    if (str.equals(new String[]{"DISCONNECTED", "EXITING"}[i13])) {
                        return EnumC5096e.LEVEL_NOTCONNECTED;
                    }
                }
                return EnumC5096e.UNKNOWN_LEVEL;
            }
            if (str.equals(new String[]{"CONNECTED"}[i12])) {
                return EnumC5096e.LEVEL_CONNECTED;
            }
            i12++;
        }
    }

    /* renamed from: i */
    public static int m25466i(String str) {
        str.hashCode();
        switch (str) {
            case "CONNECTED":
                return 2132018630;
            case "RECONNECTING":
                return 2132018637;
            case "AUTH_PENDING":
                return 2132018629;
            case "EXITING":
                return 2132018633;
            case "GET_CONFIG":
                return 2132018634;
            case "CONNECTING":
                return 2132018631;
            case "ASSIGN_IP":
                return 2132018626;
            case "AUTH":
                return 2132018627;
            case "WAIT":
                return 2132018646;
            case "TCP_CONNECT":
                return 2132018640;
            case "ADD_ROUTES":
                return 2132018625;
            case "DISCONNECTED":
                return 2132018632;
            case "RESOLVE":
                return 2132018638;
            default:
                return 2132018735;
        }
    }

    /* renamed from: j */
    public static C5103k[] m25467j() {
        C5103k[] c5103kArr;
        synchronized (C5095d0.class) {
            try {
                LinkedList<C5103k> linkedList = f29244a;
                c5103kArr = (C5103k[]) linkedList.toArray(new C5103k[linkedList.size()]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5103kArr;
    }

    /* renamed from: k */
    public static boolean m25468k() {
        return (f29260q == EnumC5096e.LEVEL_AUTH_FAILED || f29260q == EnumC5096e.LEVEL_NOTCONNECTED) ? false : true;
    }

    /* renamed from: l */
    public static void m25469l(int i10, Object... objArr) {
        m25447A(new C5103k(c.DEBUG, i10, objArr));
    }

    /* renamed from: m */
    public static void m25470m(String str) {
        m25447A(new C5103k(c.DEBUG, str));
    }

    /* renamed from: n */
    public static void m25471n(int i10) {
        m25447A(new C5103k(c.ERROR, i10));
    }

    /* renamed from: o */
    public static void m25472o(int i10, Object... objArr) {
        m25447A(new C5103k(c.ERROR, i10, objArr));
    }

    /* renamed from: p */
    public static void m25473p(String str) {
        m25447A(new C5103k(c.ERROR, str));
    }

    /* renamed from: q */
    public static void m25474q(c cVar, String str, Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        m25447A(str != null ? new C5103k(cVar, 2132018734, exc.getMessage(), stringWriter.toString(), str) : new C5103k(cVar, 2132018733, exc.getMessage(), stringWriter.toString()));
    }

    /* renamed from: r */
    public static void m25475r(Exception exc) {
        m25474q(c.ERROR, null, exc);
    }

    /* renamed from: s */
    public static void m25476s(String str, Exception exc) {
        m25474q(c.ERROR, str, exc);
    }

    /* renamed from: t */
    public static void m25477t(int i10, Object... objArr) {
        m25447A(new C5103k(c.INFO, i10, objArr));
    }

    /* renamed from: u */
    public static void m25478u(String str) {
        m25447A(new C5103k(c.INFO, str));
    }

    /* renamed from: v */
    public static void m25479v() {
        String str;
        try {
            str = NativeUtils.m22575a();
        } catch (UnsatisfiedLinkError e10) {
            str = "error";
        }
        m25477t(2132018078, Build.MODEL, Build.BOARD, Build.BRAND, Integer.valueOf(Build.VERSION.SDK_INT), str, Build.VERSION.RELEASE, Build.ID, Build.FINGERPRINT, "", "");
    }

    /* renamed from: w */
    public static void m25480w(c cVar, String str, String str2) {
        synchronized (C5095d0.class) {
            try {
                m25447A(new C5103k(cVar, str + str2));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: x */
    public static void m25481x(c cVar, int i10, String str) {
        m25447A(new C5103k(cVar, i10, str));
    }

    /* renamed from: y */
    public static void m25482y(int i10, Object... objArr) {
        m25447A(new C5103k(c.WARNING, i10, objArr));
    }

    /* renamed from: z */
    public static void m25483z(String str) {
        m25447A(new C5103k(c.WARNING, str));
    }
}
