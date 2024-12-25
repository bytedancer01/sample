package p135hh;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.p015pm.ShortcutManager;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ProxyInfo;
import android.net.VpnService;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.system.OsConstants;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.Toast;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferService;
import gh.C5011b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;
import p083eh.C4726a;
import p104fh.ActivityC4860a;
import p135hh.C5094d;
import p135hh.C5095d0;
import p135hh.C5104l;
import p135hh.InterfaceC5100h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/r.class
 */
/* renamed from: hh.r */
/* loaded from: combined.jar:classes2.jar:hh/r.class */
public class C5110r extends VpnService implements C5095d0.e, Handler.Callback, C5095d0.b, InterfaceC5100h {

    /* renamed from: y */
    public static boolean f29303y = false;

    /* renamed from: f */
    public String f29308f;

    /* renamed from: h */
    public C4726a f29310h;

    /* renamed from: k */
    public int f29313k;

    /* renamed from: m */
    public C5098f f29315m;

    /* renamed from: p */
    public long f29318p;

    /* renamed from: q */
    public InterfaceC5106n f29319q;

    /* renamed from: s */
    public String f29321s;

    /* renamed from: t */
    public String f29322t;

    /* renamed from: u */
    public Handler f29323u;

    /* renamed from: v */
    public Toast f29324v;

    /* renamed from: w */
    public Runnable f29325w;

    /* renamed from: x */
    public ProxyInfo f29326x;

    /* renamed from: b */
    public final Vector<String> f29304b = new Vector<>();

    /* renamed from: c */
    public final C5104l f29305c = new C5104l();

    /* renamed from: d */
    public final C5104l f29306d = new C5104l();

    /* renamed from: e */
    public final Object f29307e = new Object();

    /* renamed from: g */
    public Thread f29309g = null;

    /* renamed from: i */
    public String f29311i = null;

    /* renamed from: j */
    public C5088a f29312j = null;

    /* renamed from: l */
    public String f29314l = null;

    /* renamed from: n */
    public boolean f29316n = false;

    /* renamed from: o */
    public boolean f29317o = false;

    /* renamed from: r */
    public final IBinder f29320r = new a(this);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/r$a.class
     */
    /* renamed from: hh.r$a */
    /* loaded from: combined.jar:classes2.jar:hh/r$a.class */
    public class a extends InterfaceC5100h.a {

        /* renamed from: b */
        public final C5110r f29327b;

        public a(C5110r c5110r) {
            this.f29327b = c5110r;
        }

        @Override // p135hh.InterfaceC5100h
        /* renamed from: O */
        public boolean mo25505O(String str) {
            return this.f29327b.mo25505O(str);
        }

        @Override // p135hh.InterfaceC5100h
        /* renamed from: a */
        public boolean mo25506a(boolean z10) {
            return this.f29327b.mo25506a(z10);
        }

        @Override // p135hh.InterfaceC5100h
        /* renamed from: k1 */
        public void mo25507k1(String str) {
            this.f29327b.mo25507k1(str);
        }

        @Override // p135hh.InterfaceC5100h
        /* renamed from: o0 */
        public void mo25508o0(boolean z10) {
            this.f29327b.mo25508o0(z10);
        }

        @Override // p135hh.InterfaceC5100h
        /* renamed from: o1 */
        public void mo25509o1(String str) {
            this.f29327b.mo25509o1(str);
        }

        @Override // p135hh.InterfaceC5100h
        public boolean protect(int i10) {
            return this.f29327b.protect(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/r$b.class
     */
    /* renamed from: hh.r$b */
    /* loaded from: combined.jar:classes2.jar:hh/r$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final String f29328b;

        /* renamed from: c */
        public final C5110r f29329c;

        public b(C5110r c5110r, String str) {
            this.f29329c = c5110r;
            this.f29328b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f29329c.f29324v != null) {
                this.f29329c.f29324v.cancel();
            }
            String format = String.format(Locale.getDefault(), "%s - %s", this.f29329c.f29310h.f27826d, this.f29328b);
            C5110r c5110r = this.f29329c;
            c5110r.f29324v = Toast.makeText(c5110r.getBaseContext(), format, 0);
            this.f29329c.f29324v.show();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/r$c.class
     */
    /* renamed from: hh.r$c */
    /* loaded from: combined.jar:classes2.jar:hh/r$c.class */
    public class c implements Runnable {

        /* renamed from: b */
        public final C5110r f29330b;

        public c(C5110r c5110r) {
            this.f29330b = c5110r;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29330b.m25598q2();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/r$d.class
     */
    /* renamed from: hh.r$d */
    /* loaded from: combined.jar:classes2.jar:hh/r$d.class */
    public class d implements Runnable {

        /* renamed from: b */
        public final C5110r f29331b;

        public d(C5110r c5110r) {
            this.f29331b = c5110r;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f29331b.f29315m != null) {
                this.f29331b.m25601t2();
            }
            C5110r c5110r = this.f29331b;
            c5110r.m25588g2(c5110r.f29319q);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/r$e.class
     */
    /* renamed from: hh.r$e */
    /* loaded from: combined.jar:classes2.jar:hh/r$e.class */
    public static /* synthetic */ class e {

        /* renamed from: a */
        public static final int[] f29332a = new int[EnumC5096e.values().length];
    }

    @SuppressLint({"StringFormatInvalid"})
    /* renamed from: Y1 */
    public static String m25563Y1(long j10, boolean z10, Resources resources) {
        long j11 = j10;
        if (z10) {
            j11 = j10 * 8;
        }
        int i10 = z10 ? 1000 : 1024;
        double d10 = j11;
        double log = Math.log(d10);
        double d11 = i10;
        int max = Math.max(0, Math.min((int) (log / Math.log(d11)), 3));
        float pow = (float) (d10 / Math.pow(d11, max));
        return z10 ? max != 0 ? max != 1 ? max != 2 ? resources.getString(2132017819, Float.valueOf(pow)) : resources.getString(2132018021, Float.valueOf(pow)) : resources.getString(2132017892, Float.valueOf(pow)) : resources.getString(2132017366, Float.valueOf(pow)) : max != 0 ? max != 1 ? max != 2 ? resources.getString(2132018787, Float.valueOf(pow)) : resources.getString(2132018789, Float.valueOf(pow)) : resources.getString(2132018788, Float.valueOf(pow)) : resources.getString(2132018786, Float.valueOf(pow));
    }

    /* renamed from: H1 */
    public void m25564H1(String str) {
        this.f29304b.add(str);
    }

    /* renamed from: I1 */
    public boolean m25565I1(String str, int i10) {
        try {
            this.f29326x = ProxyInfo.buildDirectProxy(str, i10);
            return true;
        } catch (Exception e10) {
            C5095d0.m25473p("Could not set proxy" + e10.getLocalizedMessage());
            return false;
        }
    }

    /* renamed from: J1 */
    public final void m25566J1() {
        Iterator<String> it = C5105m.m25548a(this, false).iterator();
        while (it.hasNext()) {
            String[] split = it.next().split("/");
            String str = split[0];
            int parseInt = Integer.parseInt(split[1]);
            if (!str.equals(this.f29312j.f29210a) && this.f29310h.f27819V) {
                this.f29305c.m25533a(new C5088a(str, parseInt), false);
            }
        }
        if (this.f29310h.f27819V) {
            Iterator<String> it2 = C5105m.m25548a(this, true).iterator();
            while (it2.hasNext()) {
                m25570N1(it2.next(), false);
            }
        }
    }

    /* renamed from: K1 */
    public void m25567K1(C5088a c5088a, boolean z10) {
        this.f29305c.m25533a(c5088a, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        if (r10.equals(r7.f29322t) != false) goto L15;
     */
    /* renamed from: L1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m25568L1(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p135hh.C5110r.m25568L1(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: M1 */
    public void m25569M1(String str, String str2) {
        m25570N1(str, m25582a2(str2));
    }

    /* renamed from: N1 */
    public void m25570N1(String str, boolean z10) {
        String[] split = str.split("/");
        try {
            this.f29306d.m25534b((Inet6Address) InetAddress.getAllByName(split[0])[0], Integer.parseInt(split[1]), z10);
        } catch (UnknownHostException e10) {
            C5095d0.m25475r(e10);
        }
    }

    @Override // p135hh.InterfaceC5100h
    /* renamed from: O */
    public boolean mo25505O(String str) {
        return new C5011b(this).m25205b(this, str);
    }

    /* renamed from: O1 */
    public final void m25571O1(Notification.Builder builder) {
        PendingIntent service;
        int i10;
        int i11;
        Intent intent = new Intent(this, (Class<?>) ActivityC4860a.class);
        intent.setAction("de.blinkt.openvpn.DISCONNECT_VPN");
        builder.addAction(2131231185, getString(2132017385), PendingIntent.getActivity(this, 0, intent, 67108864));
        Intent intent2 = new Intent(this, (Class<?>) C5110r.class);
        C5098f c5098f = this.f29315m;
        if (c5098f == null || !c5098f.m25495h()) {
            intent2.setAction("de.blinkt.openvpn.PAUSE_VPN");
            service = PendingIntent.getService(this, 0, intent2, 67108864);
            i10 = 2131231496;
            i11 = 2132018296;
        } else {
            intent2.setAction("de.blinkt.openvpn.RESUME_VPN");
            service = PendingIntent.getService(this, 0, intent2, 67108864);
            i10 = 2131231498;
            i11 = 2132018492;
        }
        builder.addAction(i10, getString(i11), service);
    }

    @TargetApi(21)
    /* renamed from: P1 */
    public final void m25572P1(VpnService.Builder builder) {
        builder.allowFamily(OsConstants.AF_INET);
        builder.allowFamily(OsConstants.AF_INET6);
    }

    /* renamed from: Q1 */
    public final void m25573Q1(String str, EnumC5096e enumC5096e) {
        Intent intent = new Intent();
        intent.setAction("de.blinkt.openvpn.VPN_STATUS");
        intent.putExtra("status", enumC5096e.toString());
        intent.putExtra("detailstatus", str);
        sendBroadcast(intent, "android.permission.ACCESS_NETWORK_STATE");
    }

    /* renamed from: R1 */
    public final void m25574R1() {
        synchronized (this.f29307e) {
            this.f29309g = null;
        }
        C5095d0.m25449C(this);
        m25601t2();
        C5118z.m25668p(this);
        this.f29325w = null;
        if (this.f29317o) {
            return;
        }
        stopForeground(!f29303y);
        if (f29303y) {
            return;
        }
        stopSelf();
        C5095d0.m25451E(this);
    }

    /* renamed from: S1 */
    public void m25575S1() {
        synchronized (this.f29307e) {
            Thread thread = this.f29309g;
            if (thread != null) {
                thread.interrupt();
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                }
            }
        }
    }

    /* renamed from: T1 */
    public PendingIntent m25576T1() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this, getPackageName() + ".activities.MainActivity"));
        intent.putExtra("PAGE", "graph");
        intent.addFlags(131072);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 67108864);
        intent.addFlags(131072);
        return activity;
    }

    @Override // p135hh.C5095d0.e
    /* renamed from: U0 */
    public void mo22565U0(String str, String str2, int i10, EnumC5096e enumC5096e, Intent intent) {
        String str3;
        m25573Q1(str, enumC5096e);
        if (this.f29309g != null || f29303y) {
            if (enumC5096e == EnumC5096e.LEVEL_CONNECTED) {
                this.f29316n = true;
                this.f29318p = System.currentTimeMillis();
                if (!m25590i2()) {
                    str3 = "openvpn_bg";
                    m25597p2(C5095d0.m25463f(this), C5095d0.m25463f(this), str3, 0L, enumC5096e, intent);
                }
            } else {
                this.f29316n = false;
            }
            str3 = "openvpn_newstat";
            m25597p2(C5095d0.m25463f(this), C5095d0.m25463f(this), str3, 0L, enumC5096e, intent);
        }
    }

    /* renamed from: U1 */
    public final int m25577U1(EnumC5096e enumC5096e) {
        int i10 = e.f29332a[enumC5096e.ordinal()];
        return 2131755009;
    }

    /* renamed from: V1 */
    public InterfaceC5106n m25578V1() {
        return this.f29319q;
    }

    /* renamed from: W1 */
    public final String m25579W1() {
        String str = "TUNCFG UNQIUE STRING ips:";
        if (this.f29312j != null) {
            str = "TUNCFG UNQIUE STRING ips:" + this.f29312j.toString();
        }
        String str2 = str;
        if (this.f29314l != null) {
            str2 = str + this.f29314l;
        }
        return (((((str2 + "routes: " + TextUtils.join("|", this.f29305c.m25537e(true)) + TextUtils.join("|", this.f29306d.m25537e(true))) + "excl. routes:" + TextUtils.join("|", this.f29305c.m25537e(false)) + TextUtils.join("|", this.f29306d.m25537e(false))) + "dns: " + TextUtils.join("|", this.f29304b)) + "domain: " + this.f29311i) + "mtu: " + this.f29313k) + "proxyInfo: " + this.f29326x;
    }

    /* renamed from: X1 */
    public String m25580X1() {
        if (m25579W1().equals(this.f29321s)) {
            return "NOACTION";
        }
        String str = Build.VERSION.RELEASE;
        return "OPEN_BEFORE_CLOSE";
    }

    @Override // p135hh.C5095d0.b
    /* renamed from: Z */
    public void mo22570Z(long j10, long j11, long j12, long j13) {
        if (this.f29316n) {
            m25597p2(String.format(getString(2132018653), m25563Y1(j10, false, getResources()), m25563Y1(j12 / 2, true, getResources()), m25563Y1(j11, false, getResources()), m25563Y1(j13 / 2, true, getResources())), null, "openvpn_bg", this.f29318p, EnumC5096e.LEVEL_CONNECTED, null);
        }
    }

    /* renamed from: Z1 */
    public final InterfaceC5106n m25581Z1() {
        try {
            return (InterfaceC5106n) Class.forName("de.blinkt.openvpn.core.OpenVPNThreadv3").getConstructor(C5110r.class, C4726a.class).newInstance(this, this.f29310h);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // p135hh.InterfaceC5100h
    /* renamed from: a */
    public boolean mo25506a(boolean z10) {
        if (m25578V1() != null) {
            return m25578V1().mo25549a(z10);
        }
        return false;
    }

    /* renamed from: a2 */
    public final boolean m25582a2(String str) {
        return str != null && (str.startsWith("tun") || "(null)".equals(str) || "vpnservice-tun".equals(str));
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f29320r;
    }

    /* renamed from: b2 */
    public final boolean m25583b2() {
        if (Build.VERSION.SDK_INT >= 29) {
            return isLockdownEnabled();
        }
        return false;
    }

    @TargetApi(16)
    /* renamed from: c2 */
    public final void m25584c2(int i10, Notification.Builder builder) {
        if (i10 != 0) {
            try {
                builder.getClass().getMethod("setPriority", Integer.TYPE).invoke(builder, Integer.valueOf(i10));
                builder.getClass().getMethod("setUsesChronometer", Boolean.TYPE).invoke(builder, Boolean.TRUE);
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e10) {
                C5095d0.m25475r(e10);
            }
        }
    }

    @TargetApi(21)
    /* renamed from: d2 */
    public final void m25585d2(Notification.Builder builder, String str) {
        builder.setCategory(str);
        builder.setLocalOnly(true);
    }

    /* renamed from: e2 */
    public ParcelFileDescriptor m25586e2() {
        int i10;
        String str;
        VpnService.Builder builder = new VpnService.Builder(this);
        C5095d0.m25477t(2132017897, new Object[0]);
        boolean z10 = !this.f29310h.f27867y0;
        if (z10) {
            m25572P1(builder);
        }
        C5088a c5088a = this.f29312j;
        if (c5088a == null && this.f29314l == null) {
            C5095d0.m25473p(getString(2132018260));
            return null;
        }
        if (c5088a != null) {
            if (!C4726a.m23849h(this)) {
                m25566J1();
            }
            try {
                C5088a c5088a2 = this.f29312j;
                builder.addAddress(c5088a2.f29210a, c5088a2.f29211b);
            } catch (IllegalArgumentException e10) {
                C5095d0.m25472o(2132017583, this.f29312j, e10.getLocalizedMessage());
                return null;
            }
        }
        String str2 = this.f29314l;
        if (str2 != null) {
            String[] split = str2.split("/");
            try {
                builder.addAddress(split[0], Integer.parseInt(split[1]));
            } catch (IllegalArgumentException e11) {
                C5095d0.m25472o(2132017884, this.f29314l, e11.getLocalizedMessage());
                return null;
            }
        }
        Iterator<String> it = this.f29304b.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                builder.addDnsServer(next);
            } catch (IllegalArgumentException e12) {
                C5095d0.m25472o(2132017583, next, e12.getLocalizedMessage());
            }
        }
        String str3 = Build.VERSION.RELEASE;
        builder.setMtu(this.f29313k);
        Collection<C5104l.a> m25538f = this.f29305c.m25538f();
        Collection<C5104l.a> m25538f2 = this.f29306d.m25538f();
        if ("samsung".equals(Build.BRAND) && this.f29304b.size() >= 1) {
            try {
                C5104l.a aVar = new C5104l.a(new C5088a(this.f29304b.get(0), 32), true);
                Iterator<C5104l.a> it2 = m25538f.iterator();
                boolean z11 = false;
                while (it2.hasNext()) {
                    if (it2.next().m25541c(aVar)) {
                        z11 = true;
                    }
                }
                if (!z11) {
                    C5095d0.m25483z(String.format("Warning Samsung Android 5.0+ devices ignore DNS servers outside the VPN range. To enable DNS resolution a route to your DNS Server (%s) has been added.", this.f29304b.get(0)));
                    m25538f.add(aVar);
                }
            } catch (Exception e13) {
                if (!this.f29304b.get(0).contains(":")) {
                    C5095d0.m25473p("Error parsing DNS Server IP: " + this.f29304b.get(0));
                }
            }
        }
        C5104l.a aVar2 = new C5104l.a(new C5088a("224.0.0.0", 3), true);
        for (C5104l.a aVar3 : m25538f) {
            try {
                if (aVar2.m25541c(aVar3)) {
                    C5095d0.m25469l(2132017838, aVar3.toString());
                } else {
                    builder.addRoute(aVar3.m25543e(), aVar3.f29298c);
                }
            } catch (IllegalArgumentException e14) {
                C5095d0.m25473p(getString(2132018496) + aVar3 + " " + e14.getLocalizedMessage());
            }
        }
        for (C5104l.a aVar4 : m25538f2) {
            try {
                builder.addRoute(aVar4.m25544f(), aVar4.f29298c);
            } catch (IllegalArgumentException e15) {
                C5095d0.m25473p(getString(2132018496) + aVar4 + " " + e15.getLocalizedMessage());
            }
        }
        String str4 = this.f29311i;
        if (str4 != null) {
            builder.addSearchDomain(str4);
        }
        String str5 = "(not set, allowed)";
        String str6 = "(not set)";
        if (z10) {
            str6 = "(not set, allowed)";
        } else {
            str5 = "(not set)";
        }
        C5088a c5088a3 = this.f29312j;
        if (c5088a3 != null) {
            i10 = c5088a3.f29211b;
            str5 = c5088a3.f29210a;
        } else {
            i10 = -1;
        }
        String str7 = this.f29314l;
        if (str7 != null) {
            str6 = str7;
        }
        if ((!this.f29305c.m25537e(false).isEmpty() || !this.f29306d.m25537e(false).isEmpty()) && m25583b2()) {
            C5095d0.m25478u("VPN lockdown enabled (do not allow apps to bypass VPN) enabled. Route exclusion will not allow apps to bypass VPN (e.g. bypass VPN for local networks)");
        }
        C5095d0.m25477t(2132017966, str5, Integer.valueOf(i10), str6, Integer.valueOf(this.f29313k));
        C5095d0.m25477t(2132017584, TextUtils.join(", ", this.f29304b), this.f29311i);
        C5095d0.m25477t(2132018499, TextUtils.join(", ", this.f29305c.m25537e(true)), TextUtils.join(", ", this.f29306d.m25537e(true)));
        C5095d0.m25477t(2132018498, TextUtils.join(", ", this.f29305c.m25537e(false)), TextUtils.join(", ", this.f29306d.m25537e(false)));
        ProxyInfo proxyInfo = this.f29326x;
        if (proxyInfo != null) {
            C5095d0.m25477t(2132018418, proxyInfo.getHost(), Integer.valueOf(this.f29326x.getPort()));
        }
        C5095d0.m25469l(2132018497, TextUtils.join(", ", m25538f), TextUtils.join(", ", m25538f2));
        int i11 = Build.VERSION.SDK_INT;
        m25591j2(builder);
        if (i11 >= 22) {
            builder.setUnderlyingNetworks(null);
        }
        if (i11 >= 29) {
            builder.setMetered(false);
        }
        String str8 = this.f29310h.f27826d;
        C5088a c5088a4 = this.f29312j;
        builder.setSession((c5088a4 == null || (str = this.f29314l) == null) ? c5088a4 != null ? getString(2132018553, str8, c5088a4) : getString(2132018553, str8, this.f29314l) : getString(2132018554, str8, c5088a4, str));
        if (this.f29304b.size() == 0) {
            C5095d0.m25477t(2132018811, new Object[0]);
        }
        m25593l2(builder);
        this.f29321s = m25579W1();
        this.f29304b.clear();
        this.f29305c.m25535c();
        this.f29306d.m25535c();
        this.f29312j = null;
        this.f29314l = null;
        this.f29311i = null;
        this.f29326x = null;
        builder.setConfigureIntent(m25576T1());
        try {
            ParcelFileDescriptor establish = builder.establish();
            if (establish != null) {
                return establish;
            }
            throw new NullPointerException("Android establish() method returned null (Really broken network configuration?)");
        } catch (Exception e16) {
            C5095d0.m25471n(2132018720);
            C5095d0.m25473p(getString(2132017676) + e16.getLocalizedMessage());
            return null;
        }
    }

    /* renamed from: f2 */
    public void m25587f2() {
        m25574R1();
    }

    /* renamed from: g2 */
    public void m25588g2(InterfaceC5106n interfaceC5106n) {
        synchronized (this) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            C5098f c5098f = new C5098f(interfaceC5106n);
            this.f29315m = c5098f;
            c5098f.m25496i(this);
            registerReceiver(this.f29315m, intentFilter);
            C5095d0.m25458a(this.f29315m);
        }
    }

    /* renamed from: h2 */
    public void m25589h2(int i10, String str) {
        EnumC5096e enumC5096e = EnumC5096e.LEVEL_WAITING_FOR_USER_INPUT;
        C5095d0.m25456J("NEED", "need " + str, i10, enumC5096e);
        m25597p2(getString(i10), getString(i10), "openvpn_newstat", 0L, enumC5096e, null);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Runnable callback = message.getCallback();
        if (callback == null) {
            return false;
        }
        callback.run();
        return true;
    }

    /* renamed from: i2 */
    public final boolean m25590i2() {
        return ((UiModeManager) getSystemService("uimode")).getCurrentModeType() == 4;
    }

    @TargetApi(21)
    /* renamed from: j2 */
    public final void m25591j2(VpnService.Builder builder) {
        boolean z10 = false;
        for (C5094d c5094d : this.f29310h.f27822Y) {
            if (c5094d.f29238i == C5094d.a.ORBOT) {
                z10 = true;
            }
        }
        if (z10) {
            C5095d0.m25470m("VPN Profile uses at least one server entry with Orbot. Setting up VPN so that OrBot is not redirected over VPN.");
        }
        if (this.f29310h.f27831g0 && z10) {
            try {
                builder.addDisallowedApplication("org.torproject.android");
            } catch (PackageManager.NameNotFoundException e10) {
                C5095d0.m25470m("Orbot not installed?");
            }
        }
        try {
            builder.addAllowedApplication(getPackageName());
        } catch (PackageManager.NameNotFoundException e11) {
            C5095d0.m25473p("This should not happen: " + e11.getLocalizedMessage());
        }
        C4726a c4726a = this.f29310h;
        if (c4726a.f27831g0) {
            C5095d0.m25469l(2132017582, TextUtils.join(", ", c4726a.f27829f0));
        } else {
            C5095d0.m25469l(2132017304, TextUtils.join(", ", c4726a.f27829f0));
        }
        if (this.f29310h.f27833h0) {
            builder.allowBypass();
            C5095d0.m25470m("Apps may bypass VPN");
        }
    }

    @Override // p135hh.InterfaceC5100h
    /* renamed from: k1 */
    public void mo25507k1(String str) {
        new C5011b(this).m25204a(str);
    }

    /* renamed from: k2 */
    public void m25592k2(String str) {
        if (this.f29311i == null) {
            this.f29311i = str;
        }
    }

    /* renamed from: l2 */
    public final void m25593l2(VpnService.Builder builder) {
        ProxyInfo proxyInfo = this.f29326x;
        if (proxyInfo != null && Build.VERSION.SDK_INT >= 29) {
            builder.setHttpProxy(proxyInfo);
        } else if (proxyInfo != null) {
            C5095d0.m25483z("HTTP Proxy needs Android 10 or later.");
        }
    }

    /* renamed from: m2 */
    public void m25594m2(String str, String str2, int i10, String str3) {
        long j10;
        int i11;
        this.f29312j = new C5088a(str, str2);
        this.f29313k = i10;
        this.f29322t = null;
        long m25395c = C5088a.m25395c(str2);
        if (this.f29312j.f29211b == 32 && !str2.equals("255.255.255.255")) {
            if ("net30".equals(str3)) {
                j10 = -4;
                i11 = 30;
            } else {
                j10 = -2;
                i11 = 31;
            }
            long m25396b = this.f29312j.m25396b();
            C5088a c5088a = this.f29312j;
            if ((m25395c & j10) == (m25396b & j10)) {
                c5088a.f29211b = i11;
            } else {
                c5088a.f29211b = 32;
                if (!"p2p".equals(str3)) {
                    C5095d0.m25482y(2132017886, str, str2, str3);
                }
            }
        }
        if (("p2p".equals(str3) && this.f29312j.f29211b < 32) || ("net30".equals(str3) && this.f29312j.f29211b < 30)) {
            C5095d0.m25482y(2132017885, str, str2, str3);
        }
        C5088a c5088a2 = this.f29312j;
        int i12 = c5088a2.f29211b;
        if (i12 <= 31) {
            C5088a c5088a3 = new C5088a(c5088a2.f29210a, i12);
            c5088a3.m25397d();
            m25567K1(c5088a3, true);
        }
        this.f29322t = str2;
    }

    /* renamed from: n2 */
    public void m25595n2(String str) {
        this.f29314l = str;
    }

    @Override // p135hh.InterfaceC5100h
    /* renamed from: o0 */
    public void mo25508o0(boolean z10) {
        C5098f c5098f = this.f29315m;
        if (c5098f != null) {
            c5098f.m25498k(z10);
        }
    }

    @Override // p135hh.InterfaceC5100h
    /* renamed from: o1 */
    public void mo25509o1(String str) {
        if (this.f29319q != null) {
            this.f29319q.mo25550b(Base64.encodeToString(str.getBytes(Charset.forName("UTF-8")), 0));
        }
    }

    /* renamed from: o2 */
    public void m25596o2(int i10) {
        this.f29313k = i10;
    }

    @Override // android.net.VpnService, android.app.Service
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        return (action == null || !action.equals("de.blinkt.openvpn.START_SERVICE")) ? super.onBind(intent) : this.f29320r;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        synchronized (this.f29307e) {
            if (this.f29309g != null) {
                this.f29319q.mo25549a(true);
            }
        }
        C5098f c5098f = this.f29315m;
        if (c5098f != null) {
            unregisterReceiver(c5098f);
        }
        C5095d0.m25451E(this);
        C5095d0.m25462e();
    }

    @Override // android.net.VpnService
    public void onRevoke() {
        C5095d0.m25471n(2132018307);
        this.f29319q.mo25549a(false);
        m25574R1();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a7  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int onStartCommand(android.content.Intent r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p135hh.C5110r.onStartCommand(android.content.Intent, int, int):int");
    }

    /* renamed from: p2 */
    public final void m25597p2(String str, String str2, String str3, long j10, EnumC5096e enumC5096e, Intent intent) {
        NotificationManager notificationManager = (NotificationManager) getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        int m25577U1 = m25577U1(enumC5096e);
        Notification.Builder builder = new Notification.Builder(this);
        int i10 = str3.equals("openvpn_bg") ? -2 : str3.equals("openvpn_userreq") ? 2 : 0;
        C4726a c4726a = this.f29310h;
        builder.setContentTitle(c4726a != null ? getString(2132018243, c4726a.f27826d) : getString(2132018244));
        builder.setContentText(str);
        builder.setOnlyAlertOnce(true);
        builder.setOngoing(true);
        builder.setSmallIcon(m25577U1);
        builder.setContentIntent(enumC5096e == EnumC5096e.LEVEL_WAITING_FOR_USER_INPUT ? PendingIntent.getActivity(this, 0, intent, 0) : m25576T1());
        if (j10 != 0) {
            builder.setWhen(j10);
        }
        int i11 = Build.VERSION.SDK_INT;
        m25584c2(i10, builder);
        m25571O1(builder);
        m25585d2(builder, "service");
        if (i11 >= 26) {
            notificationManager.createNotificationChannel(new NotificationChannel(str3, str3, 3));
            builder.setChannelId(str3);
            C4726a c4726a2 = this.f29310h;
            if (c4726a2 != null) {
                builder.setShortcutId(c4726a2.m23855F());
            }
        }
        if (str2 != null && !str2.equals("")) {
            builder.setTicker(str2);
        }
        Notification notification = builder.getNotification();
        int hashCode = str3.hashCode();
        notificationManager.notify(hashCode, notification);
        startForeground(hashCode, notification);
        String str4 = this.f29308f;
        if (str4 != null && !str3.equals(str4)) {
            notificationManager.cancel(this.f29308f.hashCode());
        }
        if (!m25590i2() || i10 < 0) {
            return;
        }
        this.f29323u.post(new b(this, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Runnable] */
    /* renamed from: q2 */
    public final void m25598q2() {
        String str;
        RunnableC5112t runnableC5112t;
        try {
            this.f29310h.m23863R(this);
            String str2 = getApplicationInfo().nativeLibraryDir;
            try {
                str = getApplication().getCacheDir().getCanonicalPath();
            } catch (IOException e10) {
                e10.printStackTrace();
                str = "/tmp";
            }
            String[] m25435a = C5093c0.m25435a(this);
            this.f29317o = true;
            m25599r2();
            this.f29317o = false;
            boolean m23849h = C4726a.m23849h(this);
            if (!m23849h) {
                RunnableC5114v runnableC5114v = new RunnableC5114v(this.f29310h, this);
                if (!runnableC5114v.m25630p(this)) {
                    m25574R1();
                    return;
                } else {
                    new Thread(runnableC5114v, "OpenVPNManagementThread").start();
                    this.f29319q = runnableC5114v;
                    C5095d0.m25478u("started Socket Thread");
                }
            }
            if (m23849h) {
                InterfaceC5106n m25581Z1 = m25581Z1();
                runnableC5112t = (Runnable) m25581Z1;
                this.f29319q = m25581Z1;
            } else {
                runnableC5112t = new RunnableC5112t(this, m25435a, str2, str);
                this.f29325w = runnableC5112t;
            }
            synchronized (this.f29307e) {
                Thread thread = new Thread(runnableC5112t, "OpenVPNProcessThread");
                this.f29309g = thread;
                thread.start();
            }
            new Handler(getMainLooper()).post(new d(this));
        } catch (IOException e11) {
            C5095d0.m25476s("Error writing config file", e11);
            m25574R1();
        }
    }

    /* renamed from: r2 */
    public final void m25599r2() {
        if (this.f29319q != null) {
            Runnable runnable = this.f29325w;
            if (runnable != null) {
                ((RunnableC5112t) runnable).m25608b();
            }
            if (this.f29319q.mo25549a(true)) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                }
            }
        }
        m25575S1();
    }

    /* renamed from: s2 */
    public void m25600s2(String str) {
        String str2 = str.split(":", 2)[0];
        NotificationManager notificationManager = (NotificationManager) getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        Notification.Builder builder = new Notification.Builder(this);
        builder.setAutoCancel(true);
        builder.setSmallIcon(R.drawable.ic_dialog_info);
        str2.hashCode();
        if (!str2.equals("CR_TEXT")) {
            C5095d0.m25473p("Unknown SSO method found: " + str2);
            return;
        }
        String str3 = str.split(":", 2)[1];
        builder.setContentTitle(getString(2132017536));
        builder.setContentText(str3);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this, getPackageName() + ".activities.CredentialsPopup"));
        intent.putExtra("de.blinkt.openvpn.core.CR_TEXT_CHALLENGE", str3);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 67108864);
        C5095d0.m25457K("USER_INPUT", "waiting for user input", 2132017536, EnumC5096e.LEVEL_WAITING_FOR_USER_INPUT, intent);
        builder.setContentIntent(activity);
        int i10 = Build.VERSION.SDK_INT;
        m25584c2(2, builder);
        m25585d2(builder, "status");
        if (i10 >= 26) {
            builder.setChannelId("openvpn_userreq");
        }
        notificationManager.notify(-370124770, builder.getNotification());
    }

    /* renamed from: t2 */
    public void m25601t2() {
        synchronized (this) {
            C5098f c5098f = this.f29315m;
            if (c5098f != null) {
                try {
                    C5095d0.m25449C(c5098f);
                    unregisterReceiver(this.f29315m);
                } catch (IllegalArgumentException e10) {
                    e10.printStackTrace();
                }
            }
            this.f29315m = null;
        }
    }

    /* renamed from: u2 */
    public final void m25602u2(C4726a c4726a) {
        if (c4726a == null) {
            return;
        }
        ((ShortcutManager) getSystemService(ShortcutManager.class)).reportShortcutUsed(c4726a.m23855F());
    }

    @Override // p135hh.C5095d0.e
    /* renamed from: y0 */
    public void mo22572y0(String str) {
    }
}
