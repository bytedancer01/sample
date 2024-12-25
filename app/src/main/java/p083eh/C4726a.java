package p083eh;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.security.KeyChain;
import android.security.KeyChainException;
import android.text.TextUtils;
import android.util.Base64;
import com.amplifyframework.core.model.ModelIdentifier;
import de.blinkt.openvpn.core.NativeUtils;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.UUID;
import java.util.Vector;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import p135hh.C5093c0;
import p135hh.C5094d;
import p135hh.C5095d0;
import p135hh.C5099g;
import p135hh.C5110r;
import p135hh.C5115w;
import p135hh.C5116x;
import p135hh.C5117y;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:eh/a.class
 */
/* renamed from: eh.a */
/* loaded from: combined.jar:classes2.jar:eh/a.class */
public class C4726a implements Serializable, Cloneable {

    /* renamed from: B0 */
    public static String f27795B0 = "8.8.8.8";

    /* renamed from: C0 */
    public static String f27796C0 = "8.8.4.4";

    /* renamed from: V */
    public boolean f27819V;

    /* renamed from: W */
    public String f27820W;

    /* renamed from: Y */
    public C5094d[] f27822Y;

    /* renamed from: d */
    public String f27826d;

    /* renamed from: e */
    public String f27827e;

    /* renamed from: f */
    public String f27828f;

    /* renamed from: h */
    public String f27832h;

    /* renamed from: i */
    public String f27834i;

    /* renamed from: i0 */
    public String f27835i0;

    /* renamed from: j */
    public String f27836j;

    /* renamed from: j0 */
    public String f27837j0;

    /* renamed from: k0 */
    public String f27839k0;

    /* renamed from: l */
    public String f27840l;

    /* renamed from: m */
    public String f27842m;

    /* renamed from: m0 */
    public int f27843m0;

    /* renamed from: q */
    public String f27850q;

    /* renamed from: r */
    public String f27852r;

    /* renamed from: u0 */
    public transient PrivateKey f27859u0;

    /* renamed from: w */
    public String f27862w;

    /* renamed from: b */
    public transient boolean f27824b = false;

    /* renamed from: c */
    public int f27825c = 2;

    /* renamed from: g */
    public String f27830g = "";

    /* renamed from: k */
    public boolean f27838k = false;

    /* renamed from: n */
    public boolean f27844n = false;

    /* renamed from: o */
    public String f27846o = f27795B0;

    /* renamed from: p */
    public String f27848p = f27796C0;

    /* renamed from: s */
    public boolean f27854s = false;

    /* renamed from: t */
    public String f27856t = "blinkt.de";

    /* renamed from: u */
    public boolean f27858u = true;

    /* renamed from: v */
    public boolean f27860v = true;

    /* renamed from: x */
    public boolean f27864x = true;

    /* renamed from: y */
    public boolean f27866y = false;

    /* renamed from: z */
    public String f27868z = "";

    /* renamed from: A */
    public String f27797A = "";

    /* renamed from: B */
    public String f27799B = "";

    /* renamed from: C */
    public boolean f27800C = false;

    /* renamed from: D */
    public boolean f27801D = false;

    /* renamed from: E */
    public boolean f27802E = false;

    /* renamed from: F */
    public boolean f27803F = false;

    /* renamed from: G */
    public String f27804G = "";

    /* renamed from: H */
    public String f27805H = "1";

    /* renamed from: I */
    public String f27806I = "";

    /* renamed from: J */
    public boolean f27807J = true;

    /* renamed from: K */
    public boolean f27808K = true;

    /* renamed from: L */
    public String f27809L = "";

    /* renamed from: M */
    public String f27810M = "";

    /* renamed from: N */
    public boolean f27811N = false;

    /* renamed from: O */
    public String f27812O = "-1";

    /* renamed from: P */
    public String f27813P = "2";

    /* renamed from: Q */
    public String f27814Q = "300";

    /* renamed from: R */
    public boolean f27815R = true;

    /* renamed from: S */
    public String f27816S = "";

    /* renamed from: T */
    public int f27817T = 3;

    /* renamed from: U */
    public String f27818U = null;

    /* renamed from: X */
    public int f27821X = 0;

    /* renamed from: Z */
    public boolean f27823Z = false;

    /* renamed from: f0 */
    public HashSet<String> f27829f0 = new HashSet<>();

    /* renamed from: g0 */
    public boolean f27831g0 = true;

    /* renamed from: h0 */
    public boolean f27833h0 = false;

    /* renamed from: l0 */
    public int f27841l0 = 0;

    /* renamed from: n0 */
    public boolean f27845n0 = false;

    /* renamed from: o0 */
    public int f27847o0 = 0;

    /* renamed from: q0 */
    public String f27851q0 = "openvpn.example.com";

    /* renamed from: r0 */
    public String f27853r0 = "1194";

    /* renamed from: s0 */
    public boolean f27855s0 = true;

    /* renamed from: t0 */
    public boolean f27857t0 = false;

    /* renamed from: x0 */
    public String f27865x0 = "";

    /* renamed from: y0 */
    public boolean f27867y0 = true;

    /* renamed from: z0 */
    public boolean f27869z0 = false;

    /* renamed from: A0 */
    public String f27798A0 = "";

    /* renamed from: v0 */
    public UUID f27861v0 = UUID.randomUUID();

    /* renamed from: w0 */
    public int f27863w0 = 9;

    /* renamed from: p0 */
    public long f27849p0 = System.currentTimeMillis();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:eh/a$a.class
     */
    /* renamed from: eh.a$a */
    /* loaded from: combined.jar:classes2.jar:eh/a$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final Context f27870b;

        /* renamed from: c */
        public final C4726a f27871c;

        public a(C4726a c4726a, Context context) {
            this.f27871c = c4726a;
            this.f27870b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27871c.m23875o(this.f27870b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:eh/a$b.class
     */
    /* renamed from: eh.a$b */
    /* loaded from: combined.jar:classes2.jar:eh/a$b.class */
    public static class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:eh/a$c.class
     */
    /* renamed from: eh.a$c */
    /* loaded from: combined.jar:classes2.jar:eh/a$c.class */
    public enum c {
        NO_PADDING,
        PKCS1_PADDING
    }

    public C4726a(String str) {
        this.f27822Y = new C5094d[0];
        this.f27826d = str;
        this.f27822Y = new C5094d[]{new C5094d()};
    }

    /* renamed from: G */
    public static String m23845G(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            C5095d0.m25475r(e10);
            str = "unknown";
        }
        return String.format(Locale.US, "%s %s", context.getPackageName(), str);
    }

    /* renamed from: H */
    public static String m23846H(String str, String str2) {
        if (str2 == null) {
            return String.format("%s %s\n", str, "file missing in config profile");
        }
        if (!m23847I(str2)) {
            return String.format(Locale.ENGLISH, "%s %s\n", str, m23848M(str2));
        }
        return String.format(Locale.ENGLISH, "<%s>\n%s\n</%s>\n", str, m23850l(str2), str);
    }

    /* renamed from: I */
    public static boolean m23847I(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("[[INLINE]]") || str.startsWith("[[NAME]]");
    }

    /* renamed from: M */
    public static String m23848M(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace("\\", "\\\\").replace(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "\\\"").replace("\n", "\\n");
        if (replace.equals(str) && !replace.contains(" ") && !replace.contains(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER) && !replace.contains(";") && !replace.equals("")) {
            return str;
        }
        return '\"' + replace + '\"';
    }

    /* renamed from: h */
    public static boolean m23849h(Context context) {
        return C5117y.m25656a(context).getBoolean("ovpn3", false);
    }

    /* renamed from: l */
    public static String m23850l(String str) {
        return !str.contains("[[INLINE]]") ? str : str.substring(str.indexOf("[[INLINE]]") + 10);
    }

    /* renamed from: A */
    public String m23851A() {
        return String.format(Locale.US, "%d %s %s %s %s %s", Integer.valueOf(Build.VERSION.SDK_INT), Build.VERSION.RELEASE, NativeUtils.m22575a(), Build.BRAND, Build.BOARD, Build.MODEL);
    }

    /* renamed from: C */
    public String m23852C(Context context, String str, boolean z10) {
        byte[] m23877r;
        byte[] decode = Base64.decode(str, 0);
        if (this.f27825c == 8) {
            c cVar = z10 ? c.PKCS1_PADDING : c.NO_PADDING;
            Bundle bundle = new Bundle();
            bundle.putInt("de.blinkt.openvpn.api.RSA_PADDING_TYPE", cVar.ordinal());
            m23877r = m23874n(context, decode, bundle);
        } else {
            m23877r = m23877r(decode, z10);
        }
        if (m23877r != null) {
            return Base64.encodeToString(m23877r, 2);
        }
        return null;
    }

    /* renamed from: D */
    public Intent m23853D(Context context) {
        String packageName = context.getPackageName();
        Intent intent = new Intent(context, (Class<?>) C5110r.class);
        intent.putExtra(packageName + ".profileUUID", this.f27861v0.toString());
        intent.putExtra(packageName + ".profileVersion", this.f27847o0);
        return intent;
    }

    /* renamed from: E */
    public UUID m23854E() {
        return this.f27861v0;
    }

    /* renamed from: F */
    public String m23855F() {
        return this.f27861v0.toString().toLowerCase(Locale.ENGLISH);
    }

    /* renamed from: J */
    public boolean m23856J() {
        int i10 = this.f27825c;
        return i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7;
    }

    /* renamed from: K */
    public final void m23857K() {
        this.f27822Y = new C5094d[1];
        C5094d c5094d = new C5094d();
        c5094d.f29231b = this.f27851q0;
        c5094d.f29232c = this.f27853r0;
        c5094d.f29233d = this.f27855s0;
        c5094d.f29234e = "";
        this.f27822Y[0] = c5094d;
    }

    /* renamed from: L */
    public int m23858L(String str, String str2) {
        String str3;
        int i10 = this.f27825c;
        if ((i10 == 1 || i10 == 6) && (((str3 = this.f27842m) == null || str3.equals("")) && str == null)) {
            return 2132018314;
        }
        int i11 = this.f27825c;
        if ((i11 == 0 || i11 == 5) && m23860O() && TextUtils.isEmpty(this.f27810M) && str == null) {
            return 2132018411;
        }
        if (!m23856J()) {
            return 0;
        }
        if (TextUtils.isEmpty(this.f27799B)) {
            return 2132018283;
        }
        return (TextUtils.isEmpty(this.f27797A) && str2 == null) ? 2132018283 : 0;
    }

    /* renamed from: N */
    public Intent m23859N(Context context) {
        return m23853D(context);
    }

    /* renamed from: O */
    public boolean m23860O() {
        String str;
        if (TextUtils.isEmpty(this.f27834i)) {
            return false;
        }
        if (m23847I(this.f27834i)) {
            str = this.f27834i;
        } else {
            char[] cArr = new char[2048];
            try {
                FileReader fileReader = new FileReader(this.f27834i);
                str = "";
                for (int read = fileReader.read(cArr); read > 0; read = fileReader.read(cArr)) {
                    str = str + new String(cArr, 0, read);
                }
                fileReader.close();
            } catch (FileNotFoundException | IOException e10) {
                return false;
            }
        }
        return str.contains("Proc-Type: 4,ENCRYPTED") || str.contains("-----BEGIN ENCRYPTED PRIVATE KEY-----");
    }

    /* renamed from: P */
    public void m23861P() {
        switch (this.f27863w0) {
            case 0:
            case 1:
                this.f27819V = false;
            case 2:
            case 3:
                m23857K();
                this.f27831g0 = true;
                if (this.f27829f0 == null) {
                    this.f27829f0 = new HashSet<>();
                }
                if (this.f27822Y == null) {
                    this.f27822Y = new C5094d[0];
                }
            case 4:
            case 5:
                if (TextUtils.isEmpty(this.f27837j0)) {
                    this.f27815R = true;
                }
            case 6:
                for (C5094d c5094d : this.f27822Y) {
                    if (c5094d.f29238i == null) {
                        c5094d.f29238i = C5094d.a.NONE;
                    }
                }
            case 7:
                boolean z10 = this.f27833h0;
                if (z10) {
                    this.f27867y0 = !z10;
                }
            case 8:
                if (!TextUtils.isEmpty(this.f27806I) && !this.f27806I.equals("AES-256-GCM") && !this.f27806I.equals("AES-128-GCM")) {
                    this.f27865x0 = "AES-256-GCM:AES-128-GCM:" + this.f27806I;
                    break;
                }
                break;
        }
        this.f27863w0 = 9;
    }

    /* renamed from: Q */
    public final boolean m23862Q() {
        String str;
        if (this.f27803F && (str = this.f27804G) != null && str.contains("http-proxy-option ")) {
            return true;
        }
        for (C5094d c5094d : this.f27822Y) {
            if (c5094d.m25446d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: R */
    public void m23863R(Context context) {
        FileWriter fileWriter = new FileWriter(C5093c0.m25436b(context));
        fileWriter.write(m23870i(context, false));
        fileWriter.flush();
        fileWriter.close();
    }

    /* renamed from: a */
    public void m23864a(Context context) {
        int i10 = this.f27825c;
        if ((i10 == 2 || i10 == 7) && this.f27859u0 == null) {
            new Thread(new a(this, context)).start();
        }
    }

    /* renamed from: b */
    public int m23865b(Context context) {
        return m23866c(context, m23849h(context));
    }

    /* renamed from: c */
    public int m23866c(Context context, boolean z10) {
        String str;
        int i10 = this.f27825c;
        if (i10 == 2 || i10 == 7 || i10 == 8) {
            if (this.f27827e == null) {
                return 2132018210;
            }
        } else if ((i10 == 0 || i10 == 5) && TextUtils.isEmpty(this.f27836j) && !this.f27869z0) {
            return 2132018193;
        }
        if (this.f27864x && this.f27817T == 0) {
            return 2132017565;
        }
        if ((!this.f27860v || this.f27825c == 4) && ((str = this.f27850q) == null || m23867d(str) == null)) {
            return 2132017888;
        }
        if (!this.f27858u) {
            if (!TextUtils.isEmpty(this.f27862w) && m23871j(this.f27862w).size() == 0) {
                return 2132017537;
            }
            if (!TextUtils.isEmpty(this.f27820W) && m23871j(this.f27820W).size() == 0) {
                return 2132017537;
            }
        }
        if (this.f27844n && TextUtils.isEmpty(this.f27832h)) {
            return 2132018076;
        }
        int i11 = this.f27825c;
        if ((i11 == 5 || i11 == 0) && (TextUtils.isEmpty(this.f27828f) || TextUtils.isEmpty(this.f27834i))) {
            return 2132018075;
        }
        int i12 = this.f27825c;
        if ((i12 == 0 || i12 == 5) && TextUtils.isEmpty(this.f27836j)) {
            return 2132018074;
        }
        boolean z11 = true;
        for (C5094d c5094d : this.f27822Y) {
            if (c5094d.f29236g) {
                z11 = false;
            }
        }
        if (z11) {
            return 2132018468;
        }
        if (z10) {
            int i13 = this.f27825c;
            if (i13 == 4) {
                return 2132018263;
            }
            if (i13 == 1 || i13 == 6) {
                return 2132018264;
            }
            for (C5094d c5094d2 : this.f27822Y) {
                C5094d.a aVar = c5094d2.f29238i;
                if (aVar == C5094d.a.ORBOT || aVar == C5094d.a.SOCKS5) {
                    return 2132018265;
                }
            }
        }
        for (C5094d c5094d3 : this.f27822Y) {
            if (c5094d3.f29238i == C5094d.a.ORBOT) {
                if (m23862Q()) {
                    return 2132017689;
                }
                if (!C5115w.m25646c(context)) {
                    return 2132018214;
                }
            }
        }
        return 2132018199;
    }

    /* renamed from: d */
    public final String m23867d(String str) {
        String[] split = str.split("/");
        String[] strArr = split;
        if (split.length == 1) {
            strArr = (str + "/32").split("/");
        }
        if (strArr.length != 2) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            if (parseInt < 0 || parseInt > 32) {
                return null;
            }
            long j10 = (4294967295 << (32 - parseInt)) & 4294967295L;
            return strArr[0] + "  " + String.format(Locale.ENGLISH, "%d.%d.%d.%d", Long.valueOf(((-16777216) & j10) >> 24), Long.valueOf((16711680 & j10) >> 16), Long.valueOf((65280 & j10) >> 8), Long.valueOf(j10 & 255));
        } catch (NumberFormatException e10) {
            return null;
        }
    }

    /* renamed from: e */
    public void m23868e() {
        this.f27851q0 = "unknown";
        this.f27860v = false;
        this.f27838k = false;
        this.f27858u = false;
        this.f27808K = false;
        this.f27866y = false;
        this.f27864x = false;
        this.f27811N = false;
        this.f27819V = true;
        this.f27845n0 = false;
        this.f27821X = 0;
        this.f27807J = false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4726a) {
            return this.f27861v0.equals(((C4726a) obj).f27861v0);
        }
        return false;
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C4726a clone() {
        C4726a c4726a = (C4726a) super.clone();
        c4726a.f27861v0 = UUID.randomUUID();
        c4726a.f27822Y = new C5094d[this.f27822Y.length];
        C5094d[] c5094dArr = this.f27822Y;
        int length = c5094dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            c4726a.f27822Y[i11] = c5094dArr[i10].clone();
            i10++;
            i11++;
        }
        c4726a.f27829f0 = (HashSet) this.f27829f0.clone();
        return c4726a;
    }

    public String getName() {
        return TextUtils.isEmpty(this.f27826d) ? "No profile name" : this.f27826d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x09bc  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x09cc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0a55  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0483  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m23870i(android.content.Context r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 2727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p083eh.C4726a.m23870i(android.content.Context, boolean):java.lang.String");
    }

    /* renamed from: j */
    public final Collection<String> m23871j(String str) {
        Vector vector = new Vector();
        if (str == null) {
            return vector;
        }
        for (String str2 : str.split("[\n \t]")) {
            if (!str2.equals("")) {
                String m23867d = m23867d(str2);
                if (m23867d == null) {
                    return vector;
                }
                vector.add(m23867d);
            }
        }
        return vector;
    }

    /* renamed from: k */
    public final Collection<String> m23872k(String str) {
        Vector vector = new Vector();
        if (str == null) {
            return vector;
        }
        for (String str2 : str.split("[\n \t]")) {
            if (!str2.equals("")) {
                vector.add(str2);
            }
        }
        return vector;
    }

    /* renamed from: m */
    public final X509Certificate[] m23873m(Context context) {
        String str;
        String str2 = this.f27839k0;
        if (str2 == null || (str = this.f27827e) == null) {
            throw new KeyChainException("Alias or external auth provider name not set");
        }
        return C5099g.m25501c(context, str2, str);
    }

    /* renamed from: n */
    public final byte[] m23874n(Context context, byte[] bArr, Bundle bundle) {
        if (TextUtils.isEmpty(this.f27839k0)) {
            return null;
        }
        try {
            return C5099g.m25502d(context, this.f27839k0, this.f27827e, bArr, bundle);
        } catch (KeyChainException | InterruptedException e10) {
            C5095d0.m25472o(2132017683, this.f27839k0, e10.getClass().toString(), e10.getLocalizedMessage());
            return null;
        }
    }

    /* renamed from: o */
    public String[] m23875o(Context context) {
        return m23876p(context, 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018a  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String[] m23876p(android.content.Context r7, int r8) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p083eh.C4726a.m23876p(android.content.Context, int):java.lang.String[]");
    }

    /* renamed from: r */
    public final byte[] m23877r(byte[] bArr, boolean z10) {
        byte[] doFinal;
        PrivateKey m23879u = m23879u();
        try {
            if (m23879u.getAlgorithm().equals("EC")) {
                Signature signature = Signature.getInstance("NONEwithECDSA");
                signature.initSign(m23879u);
                signature.update(bArr);
                doFinal = signature.sign();
            } else {
                Cipher cipher = Cipher.getInstance(z10 ? "RSA/ECB/PKCS1PADDING" : "RSA/ECB/NoPadding");
                cipher.init(1, m23879u);
                doFinal = cipher.doFinal(bArr);
            }
            return doFinal;
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e10) {
            C5095d0.m25472o(2132017691, e10.getClass().toString(), e10.getLocalizedMessage());
            return null;
        }
    }

    /* renamed from: s */
    public final X509Certificate[] m23878s(Context context) {
        this.f27859u0 = KeyChain.getPrivateKey(context, this.f27827e);
        return KeyChain.getCertificateChain(context, this.f27827e);
    }

    public String toString() {
        return this.f27826d;
    }

    /* renamed from: u */
    public PrivateKey m23879u() {
        return this.f27859u0;
    }

    /* renamed from: x */
    public String m23880x() {
        String m25652a = C5116x.m25652a(this.f27861v0, true);
        return m25652a != null ? m25652a : this.f27797A;
    }

    /* renamed from: z */
    public String m23881z() {
        String m25654c = C5116x.m25654c(this.f27861v0, true);
        if (m25654c != null) {
            return m25654c;
        }
        int i10 = this.f27825c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 5) {
                    if (i10 != 6) {
                        return null;
                    }
                }
            }
            return this.f27842m;
        }
        return this.f27810M;
    }
}
