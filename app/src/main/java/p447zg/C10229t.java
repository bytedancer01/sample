package p447zg;

import com.sun.jna.Native;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zg/t.class
 */
/* renamed from: zg.t */
/* loaded from: combined.jar:classes2.jar:zg/t.class */
public final class C10229t {

    /* renamed from: a */
    public static final boolean f46817a;

    /* renamed from: b */
    public static final boolean f46818b;

    /* renamed from: c */
    public static final boolean f46819c;

    /* renamed from: d */
    public static final boolean f46820d;

    /* renamed from: e */
    public static final String f46821e;

    /* renamed from: f */
    public static final String f46822f;

    /* renamed from: g */
    public static final boolean f46823g;

    /* renamed from: h */
    public static final String f46824h;

    /* renamed from: i */
    public static final int f46825i;

    /* renamed from: j */
    public static final String f46826j;

    static {
        boolean z10;
        String property = System.getProperty("os.name");
        if (property.startsWith("Linux")) {
            if ("dalvik".equals(System.getProperty("java.vm.name").toLowerCase())) {
                f46825i = 8;
                System.setProperty("jna.nounpack", "true");
            } else {
                f46825i = 1;
            }
        } else if (property.startsWith("AIX")) {
            f46825i = 7;
        } else if (property.startsWith("Mac") || property.startsWith("Darwin")) {
            f46825i = 0;
        } else if (property.startsWith("Windows CE")) {
            f46825i = 6;
        } else if (property.startsWith("Windows")) {
            f46825i = 2;
        } else {
            f46825i = (property.startsWith("Solaris") || property.startsWith("SunOS")) ? 3 : property.startsWith("FreeBSD") ? 4 : property.startsWith("OpenBSD") ? 5 : property.equalsIgnoreCase("gnu") ? 9 : property.equalsIgnoreCase("gnu/kfreebsd") ? 10 : property.equalsIgnoreCase("netbsd") ? 11 : -1;
        }
        try {
            Class.forName("java.nio.Buffer");
            z10 = true;
        } catch (ClassNotFoundException e10) {
            z10 = false;
        }
        int i10 = f46825i;
        boolean z11 = (i10 == 6 || i10 == 8 || i10 == 7) ? false : true;
        f46819c = z11;
        f46820d = z11 && i10 != 0;
        f46818b = z10;
        f46817a = i10 != 6;
        f46822f = i10 == 2 ? "msvcrt" : i10 == 6 ? "coredll" : "c";
        f46821e = i10 == 2 ? "msvcrt" : i10 == 6 ? "coredll" : "m";
        boolean z12 = false;
        if (i10 == 2) {
            z12 = true;
        }
        f46823g = z12;
        f46826j = m42795a(System.getProperty("os.arch"), i10);
        f46824h = m42796b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if ("amd64".equals(r0) != false) goto L17;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m42795a(java.lang.String r3, int r4) {
        /*
            r0 = r3
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r0 = r0.trim()
            r5 = r0
            java.lang.String r0 = "powerpc"
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L17
            java.lang.String r0 = "ppc"
            r3 = r0
            goto L58
        L17:
            java.lang.String r0 = "powerpc64"
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L26
            java.lang.String r0 = "ppc64"
            r3 = r0
            goto L58
        L26:
            java.lang.String r0 = "i386"
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L55
            java.lang.String r0 = "i686"
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3b
            goto L55
        L3b:
            java.lang.String r0 = "x86_64"
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4f
            r0 = r5
            r3 = r0
            java.lang.String r0 = "amd64"
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L58
        L4f:
            java.lang.String r0 = "x86-64"
            r3 = r0
            goto L58
        L55:
            java.lang.String r0 = "x86"
            r3 = r0
        L58:
            r0 = r3
            r5 = r0
            java.lang.String r0 = "ppc64"
            r1 = r3
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L75
            r0 = r3
            r5 = r0
            java.lang.String r0 = "little"
            java.lang.String r1 = "sun.cpu.endian"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L75
            java.lang.String r0 = "ppc64le"
            r5 = r0
        L75:
            r0 = r5
            r3 = r0
            java.lang.String r0 = "arm"
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L92
            r0 = r5
            r3 = r0
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L92
            r0 = r5
            r3 = r0
            boolean r0 = m42813s()
            if (r0 == 0) goto L92
            java.lang.String r0 = "armel"
            r3 = r0
        L92:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p447zg.C10229t.m42795a(java.lang.String, int):java.lang.String");
    }

    /* renamed from: b */
    public static String m42796b() {
        String property = System.getProperty("jna.prefix");
        return property != null ? property : m42797c(m42798d(), System.getProperty("os.arch"), System.getProperty("os.name"));
    }

    /* renamed from: c */
    public static String m42797c(int i10, String str, String str2) {
        String str3;
        StringBuilder sb2;
        String str4;
        String m42795a = m42795a(str, i10);
        switch (i10) {
            case 0:
                str3 = "darwin";
                break;
            case 1:
                sb2 = new StringBuilder();
                str4 = "linux-";
                sb2.append(str4);
                sb2.append(m42795a);
                str3 = sb2.toString();
                break;
            case 2:
                sb2 = new StringBuilder();
                str4 = "win32-";
                sb2.append(str4);
                sb2.append(m42795a);
                str3 = sb2.toString();
                break;
            case 3:
                sb2 = new StringBuilder();
                str4 = "sunos-";
                sb2.append(str4);
                sb2.append(m42795a);
                str3 = sb2.toString();
                break;
            case 4:
                sb2 = new StringBuilder();
                str4 = "freebsd-";
                sb2.append(str4);
                sb2.append(m42795a);
                str3 = sb2.toString();
                break;
            case 5:
                sb2 = new StringBuilder();
                str4 = "openbsd-";
                sb2.append(str4);
                sb2.append(m42795a);
                str3 = sb2.toString();
                break;
            case 6:
                sb2 = new StringBuilder();
                str4 = "w32ce-";
                sb2.append(str4);
                sb2.append(m42795a);
                str3 = sb2.toString();
                break;
            case 7:
            case 9:
            default:
                String lowerCase = str2.toLowerCase();
                int indexOf = lowerCase.indexOf(" ");
                String str5 = lowerCase;
                if (indexOf != -1) {
                    str5 = lowerCase.substring(0, indexOf);
                }
                str3 = str5 + "-" + m42795a;
                break;
            case 8:
                String str6 = m42795a;
                if (m42795a.startsWith("arm")) {
                    str6 = "arm";
                }
                sb2 = new StringBuilder();
                m42795a = str6;
                str4 = "android-";
                sb2.append(str4);
                sb2.append(m42795a);
                str3 = sb2.toString();
                break;
            case 10:
                sb2 = new StringBuilder();
                str4 = "kfreebsd-";
                sb2.append(str4);
                sb2.append(m42795a);
                str3 = sb2.toString();
                break;
            case 11:
                sb2 = new StringBuilder();
                str4 = "netbsd-";
                sb2.append(str4);
                sb2.append(m42795a);
                str3 = sb2.toString();
                break;
        }
        return str3;
    }

    /* renamed from: d */
    public static final int m42798d() {
        return f46825i;
    }

    /* renamed from: e */
    public static final boolean m42799e() {
        String property = System.getProperty("sun.arch.data.model", System.getProperty("com.ibm.vm.bitmode"));
        if (property != null) {
            return "64".equals(property);
        }
        String str = f46826j;
        boolean z10 = true;
        if (!"x86-64".equals(str)) {
            z10 = true;
            if (!"ia64".equals(str)) {
                z10 = true;
                if (!"ppc64".equals(str)) {
                    z10 = true;
                    if (!"ppc64le".equals(str)) {
                        z10 = true;
                        if (!"sparcv9".equals(str)) {
                            z10 = true;
                            if (!"mips64".equals(str)) {
                                z10 = true;
                                if (!"mips64el".equals(str)) {
                                    z10 = "amd64".equals(str) ? true : Native.f26127l == 8;
                                }
                            }
                        }
                    }
                }
            }
        }
        return z10;
    }

    /* renamed from: f */
    public static final boolean m42800f() {
        return f46825i == 7;
    }

    /* renamed from: g */
    public static final boolean m42801g() {
        return f46826j.startsWith("arm");
    }

    /* renamed from: h */
    public static final boolean m42802h() {
        return f46825i == 8;
    }

    /* renamed from: i */
    public static final boolean m42803i() {
        return f46825i == 4;
    }

    /* renamed from: j */
    public static final boolean m42804j() {
        return f46825i == 9;
    }

    /* renamed from: k */
    public static final boolean m42805k() {
        return f46826j.startsWith("x86");
    }

    /* renamed from: l */
    public static final boolean m42806l() {
        boolean z10 = true;
        if (f46825i != 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: m */
    public static final boolean m42807m() {
        String str = f46826j;
        return str.equals("mips") || str.equals("mips64") || str.equals("mipsel") || str.equals("mips64el");
    }

    /* renamed from: n */
    public static final boolean m42808n() {
        return f46825i == 0;
    }

    /* renamed from: o */
    public static final boolean m42809o() {
        return f46825i == 11;
    }

    /* renamed from: p */
    public static final boolean m42810p() {
        return f46825i == 5;
    }

    /* renamed from: q */
    public static final boolean m42811q() {
        return f46826j.startsWith("ppc");
    }

    /* renamed from: r */
    public static final boolean m42812r() {
        return f46826j.startsWith("sparc");
    }

    /* renamed from: s */
    public static boolean m42813s() {
        Logger logger;
        Level level;
        String str;
        try {
            if (new File("/proc/self/exe").exists()) {
                return !C10212c.m42728a(r0.getCanonicalPath()).m42735c();
            }
            return false;
        } catch (IOException e10) {
            e = e10;
            logger = Logger.getLogger(C10229t.class.getName());
            level = Level.INFO;
            str = "Failed to read '/proc/self/exe' or the target binary.";
            logger.log(level, str, e);
            return false;
        } catch (SecurityException e11) {
            e = e11;
            logger = Logger.getLogger(C10229t.class.getName());
            level = Level.INFO;
            str = "SecurityException while analysing '/proc/self/exe' or the target binary.";
            logger.log(level, str, e);
            return false;
        }
    }

    /* renamed from: t */
    public static final boolean m42814t() {
        return f46825i == 3;
    }

    /* renamed from: u */
    public static final boolean m42815u() {
        int i10 = f46825i;
        return i10 == 2 || i10 == 6;
    }

    /* renamed from: v */
    public static final boolean m42816v() {
        return f46825i == 10;
    }
}
