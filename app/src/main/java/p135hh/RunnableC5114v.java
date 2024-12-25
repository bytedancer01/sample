package p135hh;

import android.content.Context;
import android.content.Intent;
import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import com.amazonaws.mobile.client.AWSMobileClient;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Vector;
import org.apache.http.HttpVersion;
import p083eh.C4726a;
import p135hh.C5094d;
import p135hh.C5115w;
import p135hh.InterfaceC5106n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/v.class
 */
/* renamed from: hh.v */
/* loaded from: combined.jar:classes2.jar:hh/v.class */
public class RunnableC5114v implements Runnable, InterfaceC5106n {

    /* renamed from: r */
    public static final Vector<RunnableC5114v> f29356r = new Vector<>();

    /* renamed from: b */
    public final Handler f29357b;

    /* renamed from: c */
    public LocalSocket f29358c;

    /* renamed from: d */
    public C4726a f29359d;

    /* renamed from: e */
    public C5110r f29360e;

    /* renamed from: g */
    public LocalServerSocket f29362g;

    /* renamed from: j */
    public LocalSocket f29365j;

    /* renamed from: l */
    public InterfaceC5106n.a f29367l;

    /* renamed from: m */
    public boolean f29368m;

    /* renamed from: q */
    public transient C5094d f29372q;

    /* renamed from: f */
    public LinkedList<FileDescriptor> f29361f = new LinkedList<>();

    /* renamed from: h */
    public boolean f29363h = false;

    /* renamed from: i */
    public long f29364i = 0;

    /* renamed from: k */
    public InterfaceC5106n.b f29366k = InterfaceC5106n.b.noNetwork;

    /* renamed from: n */
    public Runnable f29369n = new Runnable(this) { // from class: hh.u

        /* renamed from: b */
        public final RunnableC5114v f29355b;

        {
            this.f29355b = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f29355b.m25618n();
        }
    };

    /* renamed from: o */
    public Runnable f29370o = new a(this);

    /* renamed from: p */
    public C5115w.b f29371p = new b(this);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/v$a.class
     */
    /* renamed from: hh.v$a */
    /* loaded from: combined.jar:classes2.jar:hh/v$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final RunnableC5114v f29373b;

        public a(RunnableC5114v runnableC5114v) {
            this.f29373b = runnableC5114v;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29373b.m25623E(C5094d.a.SOCKS5, "127.0.0.1", Integer.toString(9050), false);
            C5115w.m25647d(this.f29373b.f29360e).m25650f(this.f29373b.f29371p);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/v$b.class
     */
    /* renamed from: hh.v$b */
    /* loaded from: combined.jar:classes2.jar:hh/v$b.class */
    public class b implements C5115w.b {

        /* renamed from: a */
        public final RunnableC5114v f29374a;

        public b(RunnableC5114v runnableC5114v) {
            this.f29374a = runnableC5114v;
        }

        @Override // p135hh.C5115w.b
        /* renamed from: a */
        public void mo25641a() {
            C5095d0.m25470m("Orbot not yet installed");
        }

        @Override // p135hh.C5115w.b
        /* renamed from: b */
        public void mo25642b(Intent intent) {
            StringBuilder sb2 = new StringBuilder();
            for (String str : intent.getExtras().keySet()) {
                Object obj = intent.getExtras().get(str);
                sb2.append(String.format(Locale.ENGLISH, "%s - '%s'", str, obj == null ? "null" : obj.toString()));
            }
            C5095d0.m25470m("Got Orbot status: " + ((Object) sb2));
        }

        @Override // p135hh.C5115w.b
        /* renamed from: c */
        public void mo25643c(Intent intent, String str, int i10) {
            this.f29374a.f29357b.removeCallbacks(this.f29374a.f29370o);
            this.f29374a.m25623E(C5094d.a.SOCKS5, str, Integer.toString(i10), false);
            C5115w.m25647d(this.f29374a.f29360e).m25650f(this);
        }

        @Override // p135hh.C5115w.b
        /* renamed from: d */
        public void mo25644d(Intent intent) {
            C5095d0.m25483z("Orbot integration for external applications is disabled. Waiting %ds before connecting to the default port. Enable external app integration in Orbot or use Socks v5 config instead of Orbot to avoid this delay.");
        }
    }

    public RunnableC5114v(C4726a c4726a, C5110r c5110r) {
        this.f29359d = c4726a;
        this.f29360e = c5110r;
        this.f29357b = new Handler(c5110r.getMainLooper());
    }

    /* renamed from: I */
    public static boolean m25611I() {
        boolean z10;
        Vector<RunnableC5114v> vector = f29356r;
        synchronized (vector) {
            z10 = false;
            Iterator<RunnableC5114v> it = vector.iterator();
            while (it.hasNext()) {
                RunnableC5114v next = it.next();
                z10 = next.m25629o("signal SIGINT\n");
                try {
                    LocalSocket localSocket = next.f29358c;
                    if (localSocket != null) {
                        localSocket.close();
                    }
                } catch (IOException e10) {
                }
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m25618n() {
        if (m25625G()) {
            m25622D();
        }
    }

    /* renamed from: A */
    public final void m25619A(String str) {
        String[] split = str.split(",", 3);
        C5095d0.m25455I(split[1], split[2].equals(",,") ? "" : split[2]);
    }

    /* renamed from: B */
    public final void m25620B(FileDescriptor fileDescriptor) {
        try {
            if (!this.f29360e.protect(((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", new Class[0]).invoke(fileDescriptor, new Object[0])).intValue())) {
                C5095d0.m25483z("Could not protect VPN socket");
            }
            m25627l(fileDescriptor);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | NullPointerException | InvocationTargetException e10) {
            C5095d0.m25476s("Failed to retrieve fd from socket (" + fileDescriptor + ")", e10);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to retrieve fd from socket: ");
            sb2.append(fileDescriptor);
            Log.d("Openvpn", sb2.toString());
        }
    }

    /* renamed from: C */
    public void m25621C() {
        if (this.f29363h) {
            m25622D();
        }
    }

    /* renamed from: D */
    public final void m25622D() {
        this.f29357b.removeCallbacks(this.f29369n);
        if (System.currentTimeMillis() - this.f29364i < 5000) {
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e10) {
            }
        }
        this.f29363h = false;
        this.f29364i = System.currentTimeMillis();
        m25629o("hold release\n");
        m25629o("bytecount 2\n");
        m25629o("state on\n");
    }

    /* renamed from: E */
    public final void m25623E(C5094d.a aVar, String str, String str2, boolean z10) {
        String str3;
        if (aVar == C5094d.a.NONE || str == null) {
            str3 = "proxy NONE\n";
        } else {
            C5095d0.m25477t(2132018767, str, str);
            str3 = String.format(Locale.ENGLISH, "proxy %s %s %s%s\n", aVar == C5094d.a.HTTP ? HttpVersion.HTTP : "SOCKS", str, str2, z10 ? " auto" : "");
        }
        m25629o(str3);
    }

    /* renamed from: F */
    public final boolean m25624F(String str, String str2) {
        if (!str2.equals("tun")) {
            C5095d0.m25473p(String.format("Device type %s requested, but only tun is possible with the Android API, sorry!", str2));
            return false;
        }
        ParcelFileDescriptor m25586e2 = this.f29360e.m25586e2();
        if (m25586e2 == null) {
            return false;
        }
        int fd2 = m25586e2.getFd();
        try {
            Method declaredMethod = FileDescriptor.class.getDeclaredMethod("setInt$", Integer.TYPE);
            FileDescriptor fileDescriptor = new FileDescriptor();
            declaredMethod.invoke(fileDescriptor, Integer.valueOf(fd2));
            this.f29358c.setFileDescriptorsForSend(new FileDescriptor[]{fileDescriptor});
            m25629o(String.format("needok '%s' %s\n", str, "ok"));
            this.f29358c.setFileDescriptorsForSend(null);
            m25586e2.close();
            return true;
        } catch (IOException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e10) {
            C5095d0.m25476s("Could not send fd over socket", e10);
            return false;
        }
    }

    /* renamed from: G */
    public boolean m25625G() {
        InterfaceC5106n.a aVar = this.f29367l;
        if (aVar == null) {
            return false;
        }
        return aVar.mo25491a();
    }

    /* renamed from: H */
    public void m25626H() {
        this.f29357b.removeCallbacks(this.f29369n);
        if (this.f29363h) {
            C5095d0.m25454H(this.f29366k);
        } else {
            m25629o("signal SIGUSR1\n");
        }
    }

    @Override // p135hh.InterfaceC5106n
    /* renamed from: a */
    public boolean mo25549a(boolean z10) {
        boolean m25611I = m25611I();
        if (m25611I) {
            this.f29368m = true;
        }
        return m25611I;
    }

    @Override // p135hh.InterfaceC5106n
    /* renamed from: b */
    public void mo25550b(String str) {
        m25629o("cr-response " + str + "\n");
    }

    @Override // p135hh.InterfaceC5106n
    /* renamed from: c */
    public void mo25551c(InterfaceC5106n.b bVar) {
        this.f29366k = bVar;
        m25626H();
    }

    @Override // p135hh.InterfaceC5106n
    /* renamed from: d */
    public void mo25552d(InterfaceC5106n.a aVar) {
        this.f29367l = aVar;
    }

    @Override // p135hh.InterfaceC5106n
    /* renamed from: e */
    public void mo25553e(boolean z10) {
        if (this.f29363h) {
            m25621C();
        } else {
            m25629o(z10 ? "network-change samenetwork\n" : "network-change\n");
        }
    }

    /* renamed from: l */
    public final void m25627l(FileDescriptor fileDescriptor) {
        try {
            Os.close(fileDescriptor);
        } catch (Exception e10) {
            C5095d0.m25476s("Failed to close fd (" + fileDescriptor + ")", e10);
        }
    }

    /* renamed from: m */
    public final void m25628m(String str) {
        this.f29363h = true;
        int parseInt = Integer.parseInt(str.split(":")[1]);
        if (!m25625G()) {
            C5095d0.m25454H(this.f29366k);
            return;
        }
        if (parseInt > 1) {
            C5095d0.m25456J("CONNECTRETRY", String.valueOf(parseInt), 2132018647, EnumC5096e.LEVEL_CONNECTING_NO_SERVER_REPLY_YET);
        }
        this.f29357b.postDelayed(this.f29369n, parseInt * 1000);
        Object[] objArr = new Object[1];
        if (parseInt > 5) {
            objArr[0] = String.valueOf(parseInt);
            C5095d0.m25477t(2132018647, objArr);
        } else {
            objArr[0] = String.valueOf(parseInt);
            C5095d0.m25469l(2132018647, objArr);
        }
    }

    /* renamed from: o */
    public boolean m25629o(String str) {
        try {
            LocalSocket localSocket = this.f29358c;
            if (localSocket == null || localSocket.getOutputStream() == null) {
                return false;
            }
            this.f29358c.getOutputStream().write(str.getBytes());
            this.f29358c.getOutputStream().flush();
            return true;
        } catch (IOException e10) {
            return false;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0083 -> B:8:0x0060). Please report as a decompilation issue!!! */
    /* renamed from: p */
    public boolean m25630p(Context context) {
        String str = context.getCacheDir().getAbsolutePath() + "/mgmtsocket";
        this.f29365j = new LocalSocket();
        for (int i10 = 8; i10 > 0 && !this.f29365j.isBound(); i10--) {
            try {
                this.f29365j.bind(new LocalSocketAddress(str, LocalSocketAddress.Namespace.FILESYSTEM));
            } catch (IOException e10) {
                try {
                    Thread.sleep(300L);
                } catch (InterruptedException e11) {
                }
            }
        }
        try {
            this.f29362g = new LocalServerSocket(this.f29365j.getFileDescriptor());
            return true;
        } catch (IOException e12) {
            C5095d0.m25475r(e12);
            return false;
        }
    }

    /* renamed from: q */
    public final void m25631q(String str, String str2) {
        C5095d0.m25456J("AUTH_FAILED", str + str2, 2132018628, EnumC5096e.LEVEL_AUTH_FAILED);
    }

    /* renamed from: r */
    public final void m25632r(String str) {
        int indexOf = str.indexOf(44);
        C5095d0.m25453G(Long.parseLong(str.substring(0, indexOf)), Long.parseLong(str.substring(indexOf + 1)));
    }

    @Override // p135hh.InterfaceC5106n
    public void resume() {
        m25621C();
        this.f29366k = InterfaceC5106n.b.noNetwork;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr = new byte[2048];
        String str = "";
        Vector<RunnableC5114v> vector = f29356r;
        synchronized (vector) {
            vector.add(this);
        }
        try {
            LocalSocket accept = this.f29362g.accept();
            this.f29358c = accept;
            InputStream inputStream = accept.getInputStream();
            try {
                this.f29362g.close();
            } catch (IOException e10) {
                C5095d0.m25475r(e10);
            }
            m25629o("version 3\n");
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return;
                }
                FileDescriptor[] fileDescriptorArr = null;
                try {
                    fileDescriptorArr = this.f29358c.getAncillaryFileDescriptors();
                } catch (IOException e11) {
                    C5095d0.m25476s("Error reading fds from socket", e11);
                }
                if (fileDescriptorArr != null) {
                    Collections.addAll(this.f29361f, fileDescriptorArr);
                }
                str = m25635u(str + new String(bArr, 0, read, "UTF-8"));
            }
        } catch (IOException e12) {
            if (!e12.getMessage().equals("socket closed") && !e12.getMessage().equals("Connection reset by peer")) {
                C5095d0.m25475r(e12);
            }
            Vector<RunnableC5114v> vector2 = f29356r;
            synchronized (vector2) {
                vector2.remove(this);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0122, code lost:
    
        if (r0.equals("LOG") == false) goto L8;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m25633s(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p135hh.RunnableC5114v.m25633s(java.lang.String):void");
    }

    /* renamed from: t */
    public final void m25634t(String str) {
        if (str.startsWith("OPEN_URL:") || str.startsWith("CR_TEXT:") || str.startsWith("WEB_AUTH:")) {
            this.f29360e.m25600s2(str);
            return;
        }
        C5095d0.m25470m("Info message from server:" + str);
    }

    /* renamed from: u */
    public final String m25635u(String str) {
        while (str.contains("\n")) {
            String[] split = str.split("\\r?\\n", 2);
            m25633s(split[0]);
            str = split.length == 1 ? "" : split[1];
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r0.equals("F") == false) goto L4;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m25636v(java.lang.String r5) {
        /*
            r4 = this;
            r0 = r5
            java.lang.String r1 = ","
            r2 = 4
            java.lang.String[] r0 = r0.split(r1, r2)
            r8 = r0
            java.lang.String r0 = "OpenVPN"
            r1 = r5
            int r0 = android.util.Log.d(r0, r1)
            r0 = 1
            r6 = r0
            r0 = r8
            r1 = 1
            r0 = r0[r1]
            r5 = r0
            r0 = r5
            int r0 = r0.hashCode()
            r0 = r5
            int r0 = r0.hashCode()
            switch(r0) {
                case 68: goto L82;
                case 70: goto L75;
                case 73: goto L63;
                case 87: goto L51;
                default: goto L4c;
            }
        L4c:
            r0 = -1
            r6 = r0
            goto L91
        L51:
            r0 = r5
            java.lang.String r1 = "W"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5e
            goto L4c
        L5e:
            r0 = 3
            r6 = r0
            goto L91
        L63:
            r0 = r5
            java.lang.String r1 = "I"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L70
            goto L4c
        L70:
            r0 = 2
            r6 = r0
            goto L91
        L75:
            r0 = r5
            java.lang.String r1 = "F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L91
            goto L4c
        L82:
            r0 = r5
            java.lang.String r1 = "D"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8f
            goto L4c
        L8f:
            r0 = 0
            r6 = r0
        L91:
            r0 = r6
            switch(r0) {
                case 0: goto Lc8;
                case 1: goto Lc1;
                case 2: goto Lba;
                case 3: goto Lb3;
                default: goto Lb0;
            }
        Lb0:
            goto Lba
        Lb3:
            hh.d0$c r0 = p135hh.C5095d0.c.WARNING
            r5 = r0
            goto Lcc
        Lba:
            hh.d0$c r0 = p135hh.C5095d0.c.INFO
            r5 = r0
            goto Lcc
        Lc1:
            hh.d0$c r0 = p135hh.C5095d0.c.ERROR
            r5 = r0
            goto Lcc
        Lc8:
            hh.d0$c r0 = p135hh.C5095d0.c.VERBOSE
            r5 = r0
        Lcc:
            r0 = r8
            r1 = 2
            r0 = r0[r1]
            int r0 = java.lang.Integer.parseInt(r0)
            r1 = 15
            r0 = r0 & r1
            r7 = r0
            r0 = r8
            r1 = 3
            r0 = r0[r1]
            r8 = r0
            r0 = r7
            r6 = r0
            r0 = r8
            java.lang.String r1 = "MANAGEMENT: CMD"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto Lf0
            r0 = 4
            r1 = r7
            int r0 = java.lang.Math.max(r0, r1)
            r6 = r0
        Lf0:
            r0 = r5
            r1 = r6
            r2 = r8
            p135hh.C5095d0.m25481x(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p135hh.RunnableC5114v.m25636v(java.lang.String):void");
    }

    /* renamed from: w */
    public final void m25637w(String str) {
        String substring;
        String str2;
        StringBuilder sb2;
        String arrays;
        String str3;
        int indexOf = str.indexOf(39) + 1;
        substring = str.substring(indexOf, str.indexOf(39, indexOf));
        str2 = str.split(":", 2)[1];
        substring.hashCode();
        switch (substring) {
            case "PROTECTFD":
                m25620B(this.f29361f.pollFirst());
                str3 = "ok";
                m25629o(String.format("needok '%s' %s\n", substring, str3));
                break;
            case "IFCONFIG":
                String[] split = str2.split(" ");
                this.f29360e.m25594m2(split[0], split[1], Integer.parseInt(split[2]), split[3]);
                str3 = "ok";
                m25629o(String.format("needok '%s' %s\n", substring, str3));
                break;
            case "ROUTE6":
                String[] split2 = str2.split(" ");
                this.f29360e.m25569M1(split2[0], split2[1]);
                str3 = "ok";
                m25629o(String.format("needok '%s' %s\n", substring, str3));
                break;
            case "DNSDOMAIN":
                this.f29360e.m25592k2(str2);
                str3 = "ok";
                m25629o(String.format("needok '%s' %s\n", substring, str3));
                break;
            case "HTTPPROXY":
                String[] split3 = str2.split(" ");
                if (split3.length == 2) {
                    this.f29360e.m25565I1(split3[0], Integer.parseInt(split3[1]));
                    str3 = "ok";
                    m25629o(String.format("needok '%s' %s\n", substring, str3));
                    break;
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("Unrecognized HTTPPROXY cmd: ");
                    arrays = Arrays.toString(split3);
                    sb2.append(arrays);
                    sb2.append(" | ");
                    sb2.append(str);
                    C5095d0.m25473p(sb2.toString());
                    str3 = "ok";
                    m25629o(String.format("needok '%s' %s\n", substring, str3));
                }
            case "DNSSERVER":
            case "DNS6SERVER":
                this.f29360e.m25564H1(str2);
                str3 = "ok";
                m25629o(String.format("needok '%s' %s\n", substring, str3));
                break;
            case "OPENTUN":
                if (!m25624F(substring, str2)) {
                    str3 = "cancel";
                    m25629o(String.format("needok '%s' %s\n", substring, str3));
                    break;
                }
                break;
            case "ROUTE":
                String[] split4 = str2.split(" ");
                if (split4.length == 5) {
                    this.f29360e.m25568L1(split4[0], split4[1], split4[2], split4[4]);
                } else if (split4.length >= 3) {
                    this.f29360e.m25568L1(split4[0], split4[1], split4[2], null);
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("Unrecognized ROUTE cmd:");
                    arrays = Arrays.toString(split4);
                    sb2.append(arrays);
                    sb2.append(" | ");
                    sb2.append(str);
                    C5095d0.m25473p(sb2.toString());
                }
                str3 = "ok";
                m25629o(String.format("needok '%s' %s\n", substring, str3));
                break;
            case "IFCONFIG6":
                String[] split5 = str2.split(" ");
                this.f29360e.m25596o2(Integer.parseInt(split5[1]));
                this.f29360e.m25595n2(split5[0]);
                str3 = "ok";
                m25629o(String.format("needok '%s' %s\n", substring, str3));
                break;
            case "PERSIST_TUN_ACTION":
                str3 = this.f29360e.m25580X1();
                m25629o(String.format("needok '%s' %s\n", substring, str3));
                break;
            default:
                Log.e("openvpn", "Unknown needok command " + str);
                break;
        }
    }

    /* renamed from: x */
    public final void m25638x(String str) {
        String str2;
        C5094d c5094d;
        try {
            if (str.startsWith("Auth-Token:")) {
                return;
            }
            int indexOf = str.indexOf(39) + 1;
            int indexOf2 = str.indexOf(39, indexOf);
            String substring = str.substring(indexOf, indexOf2);
            if (str.startsWith("Verification Failed")) {
                m25631q(substring, str.substring(indexOf2 + 1));
                return;
            }
            String str3 = null;
            if (substring.equals("Private Key")) {
                str3 = this.f29359d.m23881z();
                str2 = null;
            } else if (substring.equals(AWSMobileClient.AUTH_KEY)) {
                str3 = this.f29359d.m23880x();
                str2 = this.f29359d.f27799B;
            } else if (!substring.equals("HTTP Proxy") || (c5094d = this.f29372q) == null) {
                str2 = null;
            } else {
                str3 = c5094d.f29243n;
                str2 = c5094d.f29242m;
            }
            if (str3 == null) {
                this.f29360e.m25589h2(2132018283, substring);
                C5095d0.m25473p(String.format("Openvpn requires Authentication type '%s' but no password/key information available", substring));
            } else {
                if (str2 != null) {
                    m25629o(String.format("username '%s' %s\n", substring, C4726a.m23848M(str2)));
                }
                m25629o(String.format("password '%s' %s\n", substring, C4726a.m23848M(str3)));
            }
        } catch (StringIndexOutOfBoundsException e10) {
            C5095d0.m25473p("Could not parse management Password command: " + str);
        }
    }

    /* renamed from: y */
    public final void m25639y(String str) {
        C5094d.a aVar;
        String str2;
        String str3;
        boolean z10;
        String[] split = str.split(",", 3);
        C5094d.a aVar2 = C5094d.a.NONE;
        int parseInt = Integer.parseInt(split[0]) - 1;
        C5094d[] c5094dArr = this.f29359d.f27822Y;
        if (c5094dArr.length > parseInt) {
            C5094d c5094d = c5094dArr[parseInt];
            aVar = c5094d.f29238i;
            str2 = c5094d.f29239j;
            str3 = c5094d.f29240k;
            z10 = c5094d.f29241l;
            this.f29372q = c5094d;
        } else {
            C5095d0.m25473p(String.format(Locale.ENGLISH, "OpenVPN is asking for a proxy of an unknown connection entry (%d)", Integer.valueOf(parseInt)));
            aVar = aVar2;
            str2 = null;
            str3 = null;
            z10 = false;
        }
        if (aVar == aVar2) {
            SocketAddress m25398a = C5089a0.m25398a(this.f29359d);
            if (m25398a instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) m25398a;
                aVar = C5094d.a.HTTP;
                str2 = inetSocketAddress.getHostName();
                str3 = String.valueOf(inetSocketAddress.getPort());
                z10 = false;
            }
        }
        if (split.length >= 2 && aVar == C5094d.a.HTTP && split[1].equals("UDP")) {
            C5095d0.m25478u("Not using an HTTP proxy since the connection uses UDP");
            str2 = null;
        }
        if (aVar != C5094d.a.ORBOT) {
            m25623E(aVar, str2, str3, z10);
            return;
        }
        C5095d0.m25456J("WAIT_ORBOT", "Waiting for Orbot to start", 2132018648, EnumC5096e.LEVEL_CONNECTING_NO_SERVER_REPLY_YET);
        C5115w m25647d = C5115w.m25647d(this.f29360e);
        if (!C5115w.m25646c(this.f29360e)) {
            C5095d0.m25473p("Orbot does not seem to be installed!");
        }
        this.f29357b.postDelayed(this.f29370o, 20000L);
        m25647d.m25649b(this.f29360e, this.f29371p);
        m25647d.m25651g();
    }

    /* renamed from: z */
    public final void m25640z(String str) {
        String[] split = str.split(",");
        String m23852C = this.f29359d.m23852C(this.f29360e, split[0], split[1].equals("RSA_PKCS1_PADDING"));
        m25629o("pk-sig\n");
        if (m23852C == null) {
            m25629o("\nEND\n");
            m25611I();
        } else {
            m25629o(m23852C);
            m25629o("\nEND\n");
        }
    }
}
