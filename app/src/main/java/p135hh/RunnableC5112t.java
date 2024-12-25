package p135hh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p135hh.C5095d0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/t.class
 */
/* renamed from: hh.t */
/* loaded from: combined.jar:classes2.jar:hh/t.class */
public class RunnableC5112t implements Runnable {

    /* renamed from: j */
    public static final Pattern f29346j = Pattern.compile("(\\d+).(\\d+) ([0-9a-f])+ (.*)");

    /* renamed from: b */
    public String[] f29347b;

    /* renamed from: c */
    public Process f29348c;

    /* renamed from: d */
    public String f29349d;

    /* renamed from: e */
    public String f29350e;

    /* renamed from: f */
    public C5110r f29351f;

    /* renamed from: g */
    public String f29352g;

    /* renamed from: h */
    public boolean f29353h = false;

    /* renamed from: i */
    public boolean f29354i = false;

    public RunnableC5112t(C5110r c5110r, String[] strArr, String str, String str2) {
        this.f29347b = strArr;
        this.f29349d = str;
        this.f29350e = str2;
        this.f29351f = c5110r;
    }

    /* renamed from: a */
    public final String m25607a(String[] strArr, ProcessBuilder processBuilder) {
        String str;
        String replaceFirst = strArr[0].replaceFirst("/cache/.*$", "/lib");
        String str2 = processBuilder.environment().get("LD_LIBRARY_PATH");
        if (str2 == null) {
            str = replaceFirst;
        } else {
            str = replaceFirst + ":" + str2;
        }
        String str3 = str;
        if (!replaceFirst.equals(this.f29349d)) {
            str3 = this.f29349d + ":" + str;
        }
        return str3;
    }

    /* renamed from: b */
    public void m25608b() {
        this.f29354i = true;
    }

    /* renamed from: c */
    public final void m25609c(String[] strArr) {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, strArr);
        ProcessBuilder processBuilder = new ProcessBuilder(linkedList);
        processBuilder.environment().put("LD_LIBRARY_PATH", m25607a(strArr, processBuilder));
        processBuilder.environment().put("TMPDIR", this.f29350e);
        processBuilder.redirectErrorStream(true);
        try {
            Process start = processBuilder.start();
            this.f29348c = start;
            start.getOutputStream().close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f29348c.getInputStream()));
            do {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return;
                }
                if (readLine.startsWith("Dump path: ")) {
                    this.f29352g = readLine.substring(11);
                }
                if (readLine.startsWith("/data/data/de.blinkt.openvpn/cache/pievpn") || readLine.contains("syntax error")) {
                    this.f29353h = true;
                }
                Matcher matcher = f29346j.matcher(readLine);
                boolean z10 = false;
                if (matcher.matches()) {
                    int parseInt = Integer.parseInt(matcher.group(3), 16);
                    String group = matcher.group(4);
                    int i10 = parseInt & 15;
                    C5095d0.c cVar = C5095d0.c.INFO;
                    if ((parseInt & 16) != 0) {
                        cVar = C5095d0.c.ERROR;
                    } else if ((parseInt & 32) != 0 || (parseInt & 64) != 0) {
                        cVar = C5095d0.c.WARNING;
                    } else if ((parseInt & 128) != 0) {
                        cVar = C5095d0.c.VERBOSE;
                    }
                    int i11 = i10;
                    if (group.startsWith("MANAGEMENT: CMD")) {
                        i11 = Math.max(4, i10);
                    }
                    if ((group.endsWith("md too weak") && group.startsWith("OpenSSL: error")) || group.contains("error:140AB18E")) {
                        z10 = true;
                    }
                    C5095d0.m25481x(cVar, i11, group);
                    if (z10) {
                        C5095d0.m25473p("OpenSSL reported a certificate with a weak hash, please the in app FAQ about weak hashes");
                    }
                } else {
                    C5095d0.m25478u("P:" + readLine);
                }
            } while (!Thread.interrupted());
            throw new InterruptedException("OpenVpn process was killed form java code");
        } catch (IOException | InterruptedException e10) {
            C5095d0.m25476s("Error reading from output of OpenVPN process", e10);
            m25610d();
        }
    }

    /* renamed from: d */
    public void m25610d() {
        this.f29348c.destroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03d7 A[Catch: InterruptedException -> 0x03e0, IllegalThreadStateException -> 0x0409, TRY_ENTER, TRY_LEAVE, TryCatch #12 {IllegalThreadStateException -> 0x0409, InterruptedException -> 0x03e0, blocks: (B:93:0x03cc, B:95:0x03d7), top: B:92:0x03cc }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x043a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p135hh.RunnableC5112t.run():void");
    }
}
