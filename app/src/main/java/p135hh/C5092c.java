package p135hh;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;
import p083eh.C4726a;
import p135hh.C5094d;
import p221n0.C6612d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/c.class
 */
/* renamed from: hh.c */
/* loaded from: combined.jar:classes2.jar:hh/c.class */
public class C5092c {

    /* renamed from: a */
    public Context f29222a;

    /* renamed from: e */
    public final String[] f29226e;

    /* renamed from: f */
    public HashSet<String> f29227f;

    /* renamed from: i */
    public String f29230i;

    /* renamed from: b */
    public final String[] f29223b = {"config", "tls-server"};

    /* renamed from: c */
    public final String[] f29224c = {"tls-client", "allow-recursive-routing", "askpass", "auth-nocache", "up", "down", "route-up", "ipchange", "route-pre-down", "auth-user-pass-verify", "block-outside-dns", "client-cert-not-required", "dhcp-release", "dhcp-renew", "dh", "group", "ip-win32", "ifconfig-nowarn", "management-hold", "management", "management-client", "management-query-remote", "management-query-passwords", "management-query-proxy", "management-external-key", "management-forget-disconnect", "management-signal", "management-log-cache", "management-up-down", "management-client-user", "management-client-group", "pause-exit", "preresolve", "plugin", "machine-readable-output", "persist-key", "push", "register-dns", "route-delay", "route-gateway", "route-metric", "route-method", "status", "script-security", "show-net-up", "suppress-timestamps", "tap-sleep", "tmp-dir", "tun-ipv6", "topology", "user", "win-sys"};

    /* renamed from: d */
    public final String[][] f29225d = {new String[]{"setenv", "IV_GUI_VER"}, new String[]{"setenv", "IV_SSO"}, new String[]{"setenv", "IV_PLAT_VER"}, new String[]{"setenv", "IV_OPENVPN_GUI_VERSION"}, new String[]{"engine", "dynamic"}, new String[]{"setenv", "CLIENT_CERT"}, new String[]{"resolv-retry", "60"}};

    /* renamed from: g */
    public HashMap<String, Vector<Vector<String>>> f29228g = new HashMap<>();

    /* renamed from: h */
    public HashMap<String, Vector<String>> f29229h = new HashMap<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/c$a.class
     */
    /* renamed from: hh.c$a */
    /* loaded from: combined.jar:classes2.jar:hh/c$a.class */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/c$b.class
     */
    /* renamed from: hh.c$b */
    /* loaded from: combined.jar:classes2.jar:hh/c$b.class */
    public enum b {
        initial,
        readin_single_quote,
        reading_quoted,
        reading_unquoted,
        done
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.String[], java.lang.String[][]] */
    public C5092c() {
        String[] strArr = {"local", "remote", "float", "port", "connect-retry", "connect-timeout", "connect-retry-max", "link-mtu", "tun-mtu", "tun-mtu-extra", "fragment", "mtu-disc", "local-port", "remote-port", "bind", "nobind", "proto", "http-proxy", "http-proxy-retry", "http-proxy-timeout", "http-proxy-option", "socks-proxy", "socks-proxy-retry", "http-proxy-user-pass", "explicit-exit-notify"};
        this.f29226e = strArr;
        this.f29227f = new HashSet<>(Arrays.asList(strArr));
    }

    /* renamed from: u */
    public static void m25413u(C5094d c5094d, String str) {
        String[] split = C4726a.m23850l(str).split("\n");
        if (split.length >= 2) {
            c5094d.f29242m = split[0];
            c5094d.f29243n = split[1];
            c5094d.f29241l = true;
        }
    }

    /* renamed from: v */
    public static void m25414v(C4726a c4726a, String str) {
        String[] split = C4726a.m23850l(str).split("\n");
        if (split.length >= 2) {
            c4726a.f27799B = split[0];
            c4726a.f27797A = split[1];
        }
    }

    /* renamed from: a */
    public final void m25415a(String str, Vector<String> vector) {
        String trim = vector.get(0).trim();
        String trim2 = vector.get(1).trim();
        File file = new File(str);
        try {
            if (file.exists()) {
                trim.substring(1, trim.length() - 1);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                String str2 = "";
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    str2 = (str2 + readLine) + "\n";
                }
                String str3 = str2;
                if (str2.endsWith("\n")) {
                    str3 = str2.substring(0, str2.length() - 1);
                }
                vector.clear();
                vector.add("ca");
                vector.add("[[NAME]]" + trim2 + "[[INLINE]]" + str3);
            }
        } catch (Exception e10) {
            Log.d("", "" + e10);
        }
    }

    /* renamed from: b */
    public final void m25416b(C4726a c4726a) {
        for (String str : this.f29223b) {
            if (this.f29228g.containsKey(str)) {
                throw new a(String.format("Unsupported Option %s encountered in config file. Aborting", str));
            }
        }
        for (String str2 : this.f29224c) {
            this.f29228g.remove(str2);
        }
        Iterator<Vector<Vector<String>>> it = this.f29228g.values().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Iterator<Vector<String>> it2 = it.next().iterator();
            boolean z11 = z10;
            while (true) {
                z10 = z11;
                if (it2.hasNext()) {
                    if (!m25425k(it2.next())) {
                        z11 = true;
                    }
                }
            }
        }
        if (z10) {
            c4726a.f27804G = "# These options found in the config file do not map to config settings:\n" + c4726a.f27804G;
            Iterator<Vector<Vector<String>>> it3 = this.f29228g.values().iterator();
            while (it3.hasNext()) {
                c4726a.f27804G += m25424j(it3.next());
            }
            c4726a.f27803F = true;
        }
    }

    /* renamed from: c */
    public final void m25417c(C4726a c4726a, Vector<Vector<String>> vector, boolean z10) {
        boolean z11 = false;
        if (z10) {
            Iterator<Vector<String>> it = vector.iterator();
            z11 = false;
            while (it.hasNext()) {
                Vector<String> next = it.next();
                int i10 = 1;
                while (true) {
                    boolean z12 = z11;
                    z11 = z12;
                    if (i10 < next.size()) {
                        if (next.get(i10).equals("block-local")) {
                            c4726a.f27819V = false;
                            z11 = z12;
                        } else if (next.get(i10).equals("unblock-local")) {
                            c4726a.f27819V = true;
                            z11 = z12;
                        } else if (next.get(i10).equals("!ipv4")) {
                            z11 = true;
                        } else {
                            z11 = z12;
                            if (next.get(i10).equals("ipv6")) {
                                c4726a.f27808K = true;
                                z11 = z12;
                            }
                        }
                        i10++;
                    }
                }
            }
        }
        if (!z10 || z11) {
            return;
        }
        c4726a.f27858u = true;
    }

    /* renamed from: d */
    public final void m25418d(Vector<String> vector, BufferedReader bufferedReader) {
        String trim = vector.get(0).trim();
        if (!trim.startsWith("<") || !trim.endsWith(">")) {
            return;
        }
        String substring = trim.substring(1, trim.length() - 1);
        String format = String.format("</%s>", substring);
        String str = "[[INLINE]]";
        while (true) {
            String str2 = str;
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                throw new a(String.format("No endtag </%s> for starttag <%s> found", substring, substring));
            }
            if (readLine.trim().equals(format)) {
                String str3 = str2;
                if (str2.endsWith("\n")) {
                    str3 = str2.substring(0, str2.length() - 1);
                }
                vector.clear();
                vector.add(substring);
                vector.add(str3);
                return;
            }
            str = (str2 + readLine) + "\n";
        }
    }

    /* renamed from: e */
    public final void m25419e(Vector<String> vector, BufferedReader bufferedReader, String str, String str2) {
        String trim = vector.get(0).trim();
        if (!trim.startsWith("<") || !trim.endsWith(">")) {
            if (trim.equals("ca")) {
                String trim2 = vector.get(1).trim();
                m25415a(trim2 != null ? str.replaceAll(str2, trim2) : "", vector);
                return;
            }
            return;
        }
        String substring = trim.substring(1, trim.length() - 1);
        String format = String.format("</%s>", substring);
        String str3 = "[[INLINE]]";
        while (true) {
            String str4 = str3;
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                throw new a(String.format("No endtag </%s> for starttag <%s> found", substring, substring));
            }
            if (readLine.trim().equals(format)) {
                String str5 = str4;
                if (str4.endsWith("\n")) {
                    str5 = str4.substring(0, str4.length() - 1);
                }
                vector.clear();
                vector.add(substring);
                vector.add(str5);
                return;
            }
            str3 = (str4 + readLine) + "\n";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x09cf  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x09ed  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0a2c  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0b2d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0bce  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0c45  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0c5b  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0cd1  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p083eh.C4726a m25420f() {
        /*
            Method dump skipped, instructions count: 3418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p135hh.C5092c.m25420f():eh.a");
    }

    /* renamed from: g */
    public final void m25421g(C4726a c4726a) {
        if (c4726a.f27868z.equals(c4726a.f27851q0)) {
            c4726a.f27868z = "";
        }
    }

    /* renamed from: h */
    public final Vector<Vector<String>> m25422h(String str, int i10, int i11) {
        Vector<Vector<String>> vector = this.f29228g.get(str);
        if (vector == null) {
            return null;
        }
        Iterator<Vector<String>> it = vector.iterator();
        while (it.hasNext()) {
            Vector<String> next = it.next();
            if (next.size() < i10 + 1 || next.size() > i11 + 1) {
                throw new a(String.format(Locale.getDefault(), "Option %s has %d parameters, expected between %d and %d", str, Integer.valueOf(next.size() - 1), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
        }
        this.f29228g.remove(str);
        return vector;
    }

    /* renamed from: i */
    public final Vector<String> m25423i(String str, int i10, int i11) {
        Vector<Vector<String>> m25422h = m25422h(str, i10, i11);
        if (m25422h == null) {
            return null;
        }
        return m25422h.lastElement();
    }

    /* renamed from: j */
    public final String m25424j(Vector<Vector<String>> vector) {
        Iterator<Vector<String>> it = vector.iterator();
        String str = "";
        while (it.hasNext()) {
            Vector<String> next = it.next();
            if (!m25425k(next)) {
                if (next.size() == 2 && "extra-certs".equals(next.get(0))) {
                    str = str + C4726a.m23846H(next.get(0), next.get(1));
                } else {
                    Iterator<String> it2 = next.iterator();
                    while (it2.hasNext()) {
                        str = str + C4726a.m23848M(it2.next()) + " ";
                    }
                    str = str + "\n";
                }
            }
        }
        return str;
    }

    /* renamed from: k */
    public boolean m25425k(Vector<String> vector) {
        for (String[] strArr : this.f29225d) {
            if (vector.size() >= strArr.length) {
                boolean z10 = true;
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    if (!strArr[i10].equals(vector.get(i10))) {
                        z10 = false;
                    }
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m25426l(String str) {
        boolean z10;
        if (str.equals("udp") || str.equals("udp4") || str.equals("udp6")) {
            z10 = true;
        } else {
            if (!str.equals("tcp-client") && !str.equals("tcp") && !str.equals("tcp4") && !str.endsWith("tcp4-client") && !str.equals("tcp6") && !str.endsWith("tcp6-client")) {
                throw new a("Unsupported option to --proto " + str);
            }
            z10 = false;
        }
        return z10;
    }

    /* renamed from: m */
    public final String m25427m(String str, Vector<String> vector) {
        return Build.VERSION.SDK_INT > 26 ? C5090b.m25400a(str, vector) : TextUtils.join(str, vector);
    }

    /* renamed from: n */
    public void m25428n(Reader reader) {
        HashMap hashMap = new HashMap();
        hashMap.put("server-poll-timeout", "timeout-connect");
        BufferedReader bufferedReader = new BufferedReader(reader);
        int i10 = 0;
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                i10++;
                if (readLine == null) {
                    return;
                }
                String str = readLine;
                if (i10 == 1) {
                    if (readLine.startsWith("PK\u0003\u0004") || readLine.startsWith("PK\u0007��8")) {
                        break;
                    }
                    str = readLine;
                    if (readLine.startsWith("\ufeff")) {
                        str = readLine.substring(1);
                    }
                }
                if (str.startsWith("# OVPN_ACCESS_SERVER_")) {
                    Vector<String> m25433s = m25433s(str);
                    this.f29229h.put(m25433s.get(0), m25433s);
                } else {
                    Vector<String> m25432r = m25432r(str);
                    if (m25432r.size() != 0) {
                        if (m25432r.get(0).startsWith("--")) {
                            m25432r.set(0, m25432r.get(0).substring(2));
                        }
                        m25418d(m25432r, bufferedReader);
                        String str2 = m25432r.get(0);
                        String str3 = str2;
                        if (hashMap.get(str2) != null) {
                            str3 = (String) hashMap.get(str2);
                        }
                        if (!this.f29228g.containsKey(str3)) {
                            this.f29228g.put(str3, new Vector<>());
                        }
                        this.f29228g.get(str3).add(m25432r);
                    }
                }
            } catch (OutOfMemoryError e10) {
                throw new a("File too large to parse: " + e10.getLocalizedMessage());
            }
        }
        throw new a("Input looks like a ZIP Archive. Import is only possible for OpenVPN config files (.ovpn/.conf)");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        throw new p135hh.C5092c.a("Input looks like a ZIP Archive. Import is only possible for OpenVPN config files (.ovpn/.conf)");
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m25429o(java.io.Reader r7, java.lang.String r8, java.lang.String r9, android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p135hh.C5092c.m25429o(java.io.Reader, java.lang.String, java.lang.String, android.content.Context):void");
    }

    /* renamed from: p */
    public final C6612d<C5094d, C5094d[]> m25430p(String str, C5094d c5094d) {
        C5092c c5092c = new C5092c();
        c5092c.m25428n(new StringReader(str.substring(10)));
        return c5092c.m25431q(c5094d);
    }

    /* renamed from: q */
    public final C6612d<C5094d, C5094d[]> m25431q(C5094d c5094d) {
        C5094d clone;
        if (c5094d != null) {
            try {
                clone = c5094d.clone();
            } catch (CloneNotSupportedException e10) {
                e10.printStackTrace();
                return null;
            }
        } else {
            clone = new C5094d();
        }
        Vector<String> m25423i = m25423i("port", 1, 1);
        if (m25423i != null) {
            clone.f29232c = m25423i.get(1);
        }
        Vector<String> m25423i2 = m25423i("rport", 1, 1);
        if (m25423i2 != null) {
            clone.f29232c = m25423i2.get(1);
        }
        Vector<String> m25423i3 = m25423i("proto", 1, 1);
        if (m25423i3 != null) {
            clone.f29233d = m25426l(m25423i3.get(1));
        }
        Vector<String> m25423i4 = m25423i("connect-timeout", 1, 1);
        int i10 = 0;
        if (m25423i4 != null) {
            try {
                clone.f29237h = Integer.parseInt(m25423i4.get(1));
            } catch (NumberFormatException e11) {
                throw new a(String.format("Argument to connect-timeout (%s) must to be an integer: %s", m25423i4.get(1), e11.getLocalizedMessage()));
            }
        }
        Vector<String> m25423i5 = m25423i("socks-proxy", 1, 2);
        Vector<String> vector = m25423i5;
        if (m25423i5 == null) {
            vector = m25423i("http-proxy", 2, 2);
        }
        if (vector != null) {
            if (vector.get(0).equals("socks-proxy")) {
                clone.f29238i = C5094d.a.SOCKS5;
                clone.f29240k = "1080";
            } else {
                clone.f29238i = C5094d.a.HTTP;
            }
            clone.f29239j = vector.get(1);
            if (vector.size() >= 3) {
                clone.f29240k = vector.get(2);
            }
        }
        Vector<String> m25423i6 = m25423i("http-proxy-user-pass", 1, 1);
        if (m25423i6 != null) {
            m25413u(clone, m25423i6.get(1));
        }
        Vector<Vector<String>> m25422h = m25422h("remote", 1, 3);
        Vector vector2 = new Vector();
        for (Map.Entry<String, Vector<Vector<String>>> entry : this.f29228g.entrySet()) {
            if (c5094d != null || this.f29227f.contains(entry.getKey())) {
                clone.f29234e += m25424j(entry.getValue());
                vector2.add(entry.getKey());
            }
        }
        Iterator it = vector2.iterator();
        while (it.hasNext()) {
            this.f29228g.remove((String) it.next());
        }
        String str = clone.f29234e;
        if (str != null && !"".equals(str.trim())) {
            clone.f29235f = true;
        }
        Vector<Vector<String>> vector3 = m25422h;
        if (m25422h == null) {
            vector3 = new Vector<>();
        }
        C5094d[] c5094dArr = new C5094d[vector3.size()];
        Iterator<Vector<String>> it2 = vector3.iterator();
        while (it2.hasNext()) {
            Vector<String> next = it2.next();
            try {
                c5094dArr[i10] = clone.clone();
            } catch (CloneNotSupportedException e12) {
                e12.printStackTrace();
            }
            int size = next.size();
            if (size != 2) {
                if (size != 3) {
                    if (size != 4) {
                        i10++;
                    } else {
                        c5094dArr[i10].f29233d = m25426l(next.get(3));
                    }
                }
                c5094dArr[i10].f29232c = next.get(2);
            }
            c5094dArr[i10].f29231b = next.get(1);
            i10++;
        }
        return C6612d.m30519a(clone, c5094dArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d1, code lost:
    
        if (m25434t(r8) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d4, code lost:
    
        r11 = p135hh.C5092c.b.done;
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f7, code lost:
    
        if (r8 == '\"') goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0113, code lost:
    
        if (r8 == '\'') goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0124  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Vector<java.lang.String> m25432r(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p135hh.C5092c.m25432r(java.lang.String):java.util.Vector");
    }

    /* renamed from: s */
    public final Vector<String> m25433s(String str) {
        String[] split = str.split("#\\sOVPN_ACCESS_SERVER_", 2)[1].split("=", 2);
        Vector<String> vector = new Vector<>();
        Collections.addAll(vector, split);
        return vector;
    }

    /* renamed from: t */
    public final boolean m25434t(char c10) {
        return Character.isWhitespace(c10) || c10 == 0;
    }
}
