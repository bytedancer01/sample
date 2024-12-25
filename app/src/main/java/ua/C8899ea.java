package ua;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.amazonaws.mobileconnectors.appsync.AWSAppSyncClient;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.achartengine.chart.TimeChart;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p060da.C4407f;
import p097fa.C4794e;
import p305ra.C8341sb;
import p305ra.C8384v9;
import p305ra.InterfaceC8358td;
import p350u9.C8814g;
import p350u9.C8822k;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/ea.class
 */
/* renamed from: ua.ea */
/* loaded from: combined.jar:classes2.jar:ua/ea.class */
public final class C8899ea extends AbstractC9119x5 {

    /* renamed from: g */
    public static final String[] f41045g = {"firebase_", "google_", "ga_"};

    /* renamed from: h */
    public static final String[] f41046h = {"_err"};

    /* renamed from: c */
    public SecureRandom f41047c;

    /* renamed from: d */
    public final AtomicLong f41048d;

    /* renamed from: e */
    public int f41049e;

    /* renamed from: f */
    public Integer f41050f;

    public C8899ea(C8870c5 c8870c5) {
        super(c8870c5);
        this.f41050f = null;
        this.f41048d = new AtomicLong(0L);
    }

    /* renamed from: B */
    public static MessageDigest m37816B() {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            } catch (NoSuchAlgorithmException e10) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    /* renamed from: C */
    public static long m37817C(byte[] bArr) {
        C9935o.m41850j(bArr);
        int length = bArr.length;
        int i10 = 0;
        C9935o.m41853m(length > 0);
        long j10 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j10 += (bArr[i11] & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    /* renamed from: D */
    public static boolean m37818D(Context context, boolean z10) {
        C9935o.m41850j(context);
        return m37825e0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: F */
    public static boolean m37819F(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(AWSAppSyncClient.DATABASE_NAME_DELIMITER);
    }

    /* renamed from: G */
    public static boolean m37820G(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* renamed from: M */
    public static boolean m37821M(String str) {
        return !f41046h[0].equals(str);
    }

    /* renamed from: Y */
    public static ArrayList<Bundle> m37822Y(List<C8852b> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (C8852b c8852b : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c8852b.f40912d);
            bundle.putString("origin", c8852b.f40913e);
            bundle.putLong("creation_timestamp", c8852b.f40915g);
            bundle.putString("name", c8852b.f40914f.f40906e);
            C9141z5.m38440a(bundle, c8852b.f40914f.m37750P());
            bundle.putBoolean("active", c8852b.f40916h);
            String str = c8852b.f40917i;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C9068t c9068t = c8852b.f40918j;
            if (c9068t != null) {
                bundle.putString("timed_out_event_name", c9068t.f41627d);
                C9044r c9044r = c8852b.f40918j.f41628e;
                if (c9044r != null) {
                    bundle.putBundle("timed_out_event_params", c9044r.m38211T());
                }
            }
            bundle.putLong("trigger_timeout", c8852b.f40919k);
            C9068t c9068t2 = c8852b.f40920l;
            if (c9068t2 != null) {
                bundle.putString("triggered_event_name", c9068t2.f41627d);
                C9044r c9044r2 = c8852b.f40920l.f41628e;
                if (c9044r2 != null) {
                    bundle.putBundle("triggered_event_params", c9044r2.m38211T());
                }
            }
            bundle.putLong("triggered_timestamp", c8852b.f40914f.f40907f);
            bundle.putLong("time_to_live", c8852b.f40921m);
            C9068t c9068t3 = c8852b.f40922n;
            if (c9068t3 != null) {
                bundle.putString("expired_event_name", c9068t3.f41627d);
                C9044r c9044r3 = c8852b.f40922n.f41628e;
                if (c9044r3 != null) {
                    bundle.putBundle("expired_event_params", c9044r3.m38211T());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: a0 */
    public static final boolean m37823a0(Bundle bundle, int i10) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    /* renamed from: b0 */
    public static final boolean m37824b0(String str) {
        C9935o.m41850j(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: e0 */
    public static boolean m37825e0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null) {
                return false;
            }
            return serviceInfo.enabled;
        } catch (PackageManager.NameNotFoundException e10) {
            return false;
        }
    }

    /* renamed from: f0 */
    public static boolean m37826f0(String str, String[] strArr) {
        C9935o.m41850j(strArr);
        for (String str2 : strArr) {
            if (m37820G(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i0 */
    public static boolean m37827i0(String str) {
        C9935o.m41846f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* renamed from: A */
    public final void m37828A(InterfaceC8887da interfaceC8887da, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        m37823a0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        C8384v9.m35968a();
        if (this.f41723a.m37797z().m37900w(null, C8988m3.f41337N0)) {
            interfaceC8887da.mo37810a(str, bundle);
        } else {
            this.f41723a.mo37783f();
            this.f41723a.m37764F().m37933X("auto", "_err", bundle);
        }
    }

    /* renamed from: E */
    public final boolean m37829E(String str) {
        mo37811h();
        if (C4794e.m24250a(this.f41723a.mo37779b()).m24243a(str) == 0) {
            return true;
        }
        this.f41723a.mo37780c().m38415v().m38327b("Permission not granted", str);
        return false;
    }

    /* renamed from: H */
    public final boolean m37830H(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String m37882D = this.f41723a.m37797z().m37882D();
        this.f41723a.mo37783f();
        return m37882D.equals(str);
    }

    /* renamed from: I */
    public final Bundle m37831I(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object m37866s = m37866s(str, bundle.get(str));
                if (m37866s == null) {
                    this.f41723a.mo37780c().m38413t().m38327b("Param value can't be null", this.f41723a.m37766H().m38232q(str));
                } else {
                    m37876z(bundle2, str, m37866s);
                }
            }
        }
        return bundle2;
    }

    /* renamed from: J */
    public final C9068t m37832J(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11, boolean z12) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (m37859o0(str2, z12) != 0) {
            this.f41723a.mo37780c().m38408o().m38327b("Invalid conditional property event name", this.f41723a.m37766H().m38233r(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle m37868t = m37868t(str, str2, bundle2, C4407f.m22436b("_o"), false);
        Bundle bundle3 = m37868t;
        if (z10) {
            bundle3 = m37831I(m37868t);
        }
        C9935o.m41850j(bundle3);
        return new C9068t(str2, new C9044r(bundle3), str3, j10);
    }

    /* renamed from: K */
    public final boolean m37833K(Context context, String str) {
        C9106w3 m38408o;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo m24247e = C4794e.m24250a(context).m24247e(str, 64);
            if (m24247e == null || (signatureArr = m24247e.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
            m38408o = this.f41723a.mo37780c().m38408o();
            str2 = "Package name not found";
            m38408o.m38327b(str2, e);
            return true;
        } catch (CertificateException e11) {
            e = e11;
            m38408o = this.f41723a.mo37780c().m38408o();
            str2 = "Error obtaining certificate";
            m38408o.m38327b(str2, e);
            return true;
        }
    }

    /* renamed from: L */
    public final byte[] m37834L(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @EnsuresNonNull({"this.apkVersion"})
    /* renamed from: N */
    public final int m37835N() {
        if (this.f41050f == null) {
            this.f41050f = Integer.valueOf(C8814g.m37697h().m37699b(this.f41723a.mo37779b()) / 1000);
        }
        return this.f41050f.intValue();
    }

    /* renamed from: O */
    public final int m37836O(int i10) {
        return C8814g.m37697h().mo37681j(this.f41723a.mo37779b(), C8822k.f40857a);
    }

    /* renamed from: P */
    public final long m37837P(long j10, long j11) {
        return (j10 + (j11 * 60000)) / TimeChart.DAY;
    }

    /* renamed from: Q */
    public final void m37838Q(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            this.f41723a.mo37780c().m38411r().m38327b("Params already contained engagement", Long.valueOf(j11));
        }
        bundle.putLong("_et", j10 + j11);
    }

    /* renamed from: R */
    public final void m37839R(InterfaceC8358td interfaceC8358td, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC8358td.mo35776j(bundle);
        } catch (RemoteException e10) {
            this.f41723a.mo37780c().m38411r().m38327b("Error returning string value to wrapper", e10);
        }
    }

    /* renamed from: S */
    public final void m37840S(InterfaceC8358td interfaceC8358td, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            interfaceC8358td.mo35776j(bundle);
        } catch (RemoteException e10) {
            this.f41723a.mo37780c().m38411r().m38327b("Error returning long value to wrapper", e10);
        }
    }

    /* renamed from: T */
    public final void m37841T(InterfaceC8358td interfaceC8358td, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            interfaceC8358td.mo35776j(bundle);
        } catch (RemoteException e10) {
            this.f41723a.mo37780c().m38411r().m38327b("Error returning int value to wrapper", e10);
        }
    }

    /* renamed from: U */
    public final void m37842U(InterfaceC8358td interfaceC8358td, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC8358td.mo35776j(bundle);
        } catch (RemoteException e10) {
            this.f41723a.mo37780c().m38411r().m38327b("Error returning byte array to wrapper", e10);
        }
    }

    /* renamed from: V */
    public final void m37843V(InterfaceC8358td interfaceC8358td, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            interfaceC8358td.mo35776j(bundle);
        } catch (RemoteException e10) {
            this.f41723a.mo37780c().m38411r().m38327b("Error returning boolean value to wrapper", e10);
        }
    }

    /* renamed from: W */
    public final void m37844W(InterfaceC8358td interfaceC8358td, Bundle bundle) {
        try {
            interfaceC8358td.mo35776j(bundle);
        } catch (RemoteException e10) {
            this.f41723a.mo37780c().m38411r().m38327b("Error returning bundle value to wrapper", e10);
        }
    }

    /* renamed from: X */
    public final void m37845X(InterfaceC8358td interfaceC8358td, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC8358td.mo35776j(bundle);
        } catch (RemoteException e10) {
            this.f41723a.mo37780c().m38411r().m38327b("Error returning bundle list to wrapper", e10);
        }
    }

    /* renamed from: Z */
    public final URL m37846Z(long j10, String str, String str2, long j11) {
        try {
            C9935o.m41846f(str2);
            C9935o.m41846f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 37000L, Integer.valueOf(m37835N())), str2, str, Long.valueOf(j11));
            String str3 = format;
            if (str.equals(this.f41723a.m37797z().m37883E())) {
                str3 = format.concat("&ddl_test=1");
            }
            return new URL(str3);
        } catch (IllegalArgumentException | MalformedURLException e10) {
            this.f41723a.mo37780c().m38408o().m38327b("Failed to create BOW URL for Deferred Deep Link. exception", e10.getMessage());
            return null;
        }
    }

    /* renamed from: c0 */
    public final Object m37847c0(int i10, Object obj, boolean z10, boolean z11) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return m37862q(String.valueOf(obj), i10, z10);
        }
        if (!z11) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle m37831I = m37831I((Bundle) parcelable);
                if (!m37831I.isEmpty()) {
                    arrayList.add(m37831I);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: d0 */
    public final int m37848d0(String str) {
        if ("_ldl".equals(str)) {
            this.f41723a.m37797z();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.f41723a.m37797z();
            return 256;
        }
        if (this.f41723a.m37797z().m37900w(null, C8988m3.f41366h0) && "_lgclid".equals(str)) {
            this.f41723a.m37797z();
            return 100;
        }
        this.f41723a.m37797z();
        return 36;
    }

    /* renamed from: g0 */
    public final long m37849g0() {
        long j10 = this.f41048d.get();
        synchronized (this.f41048d) {
            if (j10 != 0) {
                this.f41048d.compareAndSet(-1L, 1L);
                return this.f41048d.getAndIncrement();
            }
            long nextLong = new Random(System.nanoTime() ^ this.f41723a.mo37778a().mo22432a()).nextLong();
            int i10 = this.f41049e + 1;
            this.f41049e = i10;
            return nextLong + i10;
        }
    }

    @EnsuresNonNull({"this.secureRandom"})
    /* renamed from: h0 */
    public final SecureRandom m37850h0() {
        mo37811h();
        if (this.f41047c == null) {
            this.f41047c = new SecureRandom();
        }
        return this.f41047c;
    }

    @Override // ua.AbstractC9119x5
    /* renamed from: i */
    public final boolean mo37851i() {
        return true;
    }

    @Override // ua.AbstractC9119x5
    /* renamed from: j */
    public final void mo37852j() {
        mo37811h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        long j10 = nextLong;
        if (nextLong == 0) {
            long nextLong2 = secureRandom.nextLong();
            j10 = nextLong2;
            if (nextLong2 == 0) {
                this.f41723a.mo37780c().m38411r().m38326a("Utils falling back to Random for random id");
                j10 = nextLong2;
            }
        }
        this.f41048d.set(j10);
    }

    /* renamed from: j0 */
    public final Bundle m37853j0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter("gclid");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("gclid", str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            this.f41723a.mo37780c().m38411r().m38327b("Install referrer url isn't a hierarchical URI", e10);
            return null;
        }
    }

    /* renamed from: k0 */
    public final boolean m37854k0(String str, String str2) {
        if (str2 == null) {
            this.f41723a.mo37780c().m38410q().m38327b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f41723a.mo37780c().m38410q().m38327b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            this.f41723a.mo37780c().m38410q().m38328c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (true) {
            int i10 = charCount;
            if (i10 >= length) {
                return true;
            }
            int codePointAt2 = str2.codePointAt(i10);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.f41723a.mo37780c().m38410q().m38328c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount = i10 + Character.charCount(codePointAt2);
        }
    }

    /* renamed from: l0 */
    public final boolean m37855l0(String str, String str2) {
        if (str2 == null) {
            this.f41723a.mo37780c().m38410q().m38327b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f41723a.mo37780c().m38410q().m38327b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        int i10 = codePointAt;
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                this.f41723a.mo37780c().m38410q().m38328c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            i10 = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(i10);
        while (true) {
            int i11 = charCount;
            if (i11 >= length) {
                return true;
            }
            int codePointAt2 = str2.codePointAt(i11);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.f41723a.mo37780c().m38410q().m38328c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount = i11 + Character.charCount(codePointAt2);
        }
    }

    /* renamed from: m0 */
    public final boolean m37856m0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f41723a.mo37780c().m38410q().m38327b("Name is required and can't be null. Type", str);
            return false;
        }
        C9935o.m41850j(str2);
        String[] strArr3 = f41045g;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                this.f41723a.mo37780c().m38410q().m38328c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m37826f0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m37826f0(str2, strArr2)) {
            return true;
        }
        this.f41723a.mo37780c().m38410q().m38328c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* renamed from: n0 */
    public final boolean m37857n0(String str, int i10, String str2) {
        if (str2 == null) {
            this.f41723a.mo37780c().m38410q().m38327b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        this.f41723a.mo37780c().m38410q().m38329d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    /* renamed from: o */
    public final boolean m37858o(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (m37824b0(str)) {
                return true;
            }
            if (!this.f41723a.m37769K()) {
                return false;
            }
            this.f41723a.mo37780c().m38410q().m38327b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C9128y3.m38407x(str));
            return false;
        }
        C8341sb.m35785a();
        if (this.f41723a.m37797z().m37900w(null, C8988m3.f41370j0) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            if (!this.f41723a.m37769K()) {
                return false;
            }
            this.f41723a.mo37780c().m38410q().m38326a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        if (m37824b0(str2)) {
            return true;
        }
        this.f41723a.mo37780c().m38410q().m38327b("Invalid admob_app_id. Analytics disabled.", C9128y3.m38407x(str2));
        return false;
    }

    /* renamed from: o0 */
    public final int m37859o0(String str, boolean z10) {
        if (!m37855l0("event", str)) {
            return 2;
        }
        if (z10) {
            if (!m37856m0("event", C8847a6.f40892a, C8847a6.f40893b, str)) {
                return 13;
            }
        } else if (!m37856m0("event", C8847a6.f40892a, null, str)) {
            return 13;
        }
        this.f41723a.m37797z();
        return !m37857n0("event", 40, str) ? 2 : 0;
    }

    /* renamed from: p */
    public final boolean m37860p(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            C9935o.m41850j(str);
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* renamed from: p0 */
    public final int m37861p0(String str) {
        if (!m37855l0("user property", str)) {
            return 6;
        }
        if (!m37856m0("user property", C8871c6.f40990a, null, str)) {
            return 15;
        }
        this.f41723a.m37797z();
        return !m37857n0("user property", 24, str) ? 6 : 0;
    }

    /* renamed from: q */
    public final String m37862q(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z10) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
        }
        return null;
    }

    /* renamed from: q0 */
    public final int m37863q0(String str) {
        if (!m37854k0("event param", str)) {
            return 3;
        }
        if (!m37856m0("event param", null, null, str)) {
            return 14;
        }
        this.f41723a.m37797z();
        return !m37857n0("event param", 40, str) ? 3 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015e  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m37864r(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.Object r12, android.os.Bundle r13, java.util.List<java.lang.String> r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C8899ea.m37864r(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* renamed from: r0 */
    public final int m37865r0(String str) {
        if (!m37855l0("event param", str)) {
            return 3;
        }
        if (!m37856m0("event param", null, null, str)) {
            return 14;
        }
        this.f41723a.m37797z();
        return !m37857n0("event param", 40, str) ? 3 : 0;
    }

    /* renamed from: s */
    public final Object m37866s(String str, Object obj) {
        int i10 = 256;
        if ("_ev".equals(str)) {
            this.f41723a.m37797z();
            return m37847c0(256, obj, true, true);
        }
        if (m37819F(str)) {
            this.f41723a.m37797z();
        } else {
            this.f41723a.m37797z();
            i10 = 100;
        }
        return m37847c0(i10, obj, false, true);
    }

    /* renamed from: s0 */
    public final boolean m37867s0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* renamed from: t */
    public final Bundle m37868t(String str, String str2, Bundle bundle, List<String> list, boolean z10) {
        int i10;
        boolean m37826f0 = m37826f0(str2, C8847a6.f40895d);
        Bundle bundle2 = new Bundle(bundle);
        int m37890m = this.f41723a.m37797z().m37890m();
        int i11 = 0;
        for (String str3 : this.f41723a.m37797z().m37900w(str, C8988m3.f41350Z) ? new TreeSet(bundle.keySet()) : bundle.keySet()) {
            if (list == null || !list.contains(str3)) {
                int m37863q0 = z10 ? m37863q0(str3) : 0;
                i10 = m37863q0;
                if (m37863q0 == 0) {
                    i10 = m37865r0(str3);
                }
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                m37873w(bundle2, i10, str3, str3, i10 == 3 ? str3 : null);
                bundle2.remove(str3);
            } else {
                int m37864r = m37864r(str, str2, str3, bundle.get(str3), bundle2, list, z10, m37826f0);
                if (m37864r == 17) {
                    m37873w(bundle2, 17, str3, str3, Boolean.FALSE);
                } else if (m37864r != 0 && !"_ev".equals(str3)) {
                    m37873w(bundle2, m37864r, m37864r == 21 ? str2 : str3, str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (m37827i0(str3)) {
                    i11++;
                    if (i11 > m37890m) {
                        StringBuilder sb2 = new StringBuilder(48);
                        sb2.append("Event can't contain more than ");
                        sb2.append(m37890m);
                        sb2.append(" params");
                        this.f41723a.mo37780c().m38410q().m38328c(sb2.toString(), this.f41723a.m37766H().m38231p(str2), this.f41723a.m37766H().m38234s(bundle));
                        m37823a0(bundle2, 5);
                        bundle2.remove(str3);
                    }
                }
            }
        }
        return bundle2;
    }

    /* renamed from: t0 */
    public final boolean m37869t0(String str, String str2, int i10, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String valueOf = String.valueOf(obj);
        if (valueOf.codePointCount(0, valueOf.length()) <= i10) {
            return true;
        }
        this.f41723a.mo37780c().m38413t().m38329d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
        return false;
    }

    /* renamed from: u */
    public final void m37870u(C9139z3 c9139z3, int i10) {
        int i11 = 0;
        for (String str : new TreeSet(c9139z3.f41818d.keySet())) {
            if (m37827i0(str)) {
                int i12 = i11 + 1;
                i11 = i12;
                if (i12 > i10) {
                    StringBuilder sb2 = new StringBuilder(48);
                    sb2.append("Event can't contain more than ");
                    sb2.append(i10);
                    sb2.append(" params");
                    this.f41723a.mo37780c().m38410q().m38328c(sb2.toString(), this.f41723a.m37766H().m38231p(c9139z3.f41815a), this.f41723a.m37766H().m38234s(c9139z3.f41818d));
                    m37823a0(c9139z3.f41818d, 5);
                    c9139z3.f41818d.remove(str);
                    i11 = i12;
                }
            }
        }
    }

    /* renamed from: u0 */
    public final void m37871u0(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z10) {
        int i10;
        int m37864r;
        if (bundle == null) {
            return;
        }
        this.f41723a.m37797z();
        int i11 = 0;
        for (String str4 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str4)) {
                int m37863q0 = z10 ? m37863q0(str4) : 0;
                i10 = m37863q0;
                if (m37863q0 == 0) {
                    i10 = m37865r0(str4);
                }
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                m37873w(bundle, i10, str4, str4, i10 == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                if (m37867s0(bundle.get(str4))) {
                    this.f41723a.mo37780c().m38413t().m38329d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str4);
                    m37864r = 22;
                } else {
                    m37864r = m37864r(str, str2, str4, bundle.get(str4), bundle, list, z10, false);
                }
                if (m37864r != 0 && !"_ev".equals(str4)) {
                    m37873w(bundle, m37864r, str4, str4, bundle.get(str4));
                } else if (m37827i0(str4) && !m37826f0(str4, C8859b6.f40934d)) {
                    int i12 = i11 + 1;
                    i11 = i12;
                    if (i12 > 0) {
                        this.f41723a.mo37780c().m38410q().m38328c("Item cannot contain custom parameters", this.f41723a.m37766H().m38231p(str2), this.f41723a.m37766H().m38234s(bundle));
                        m37823a0(bundle, 23);
                        i11 = i12;
                    }
                }
                bundle.remove(str4);
            }
        }
    }

    /* renamed from: v */
    public final void m37872v(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f41723a.m37765G().m37876z(bundle, str, bundle2.get(str));
            }
        }
    }

    /* renamed from: w */
    public final void m37873w(Bundle bundle, int i10, String str, String str2, Object obj) {
        if (m37823a0(bundle, i10)) {
            this.f41723a.m37797z();
            bundle.putString("_ev", m37862q(str, 40, true));
            if (obj != null) {
                C9935o.m41850j(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    /* renamed from: x */
    public final int m37874x(String str, Object obj) {
        int m37848d0;
        String str2;
        if ("_ldl".equals(str)) {
            m37848d0 = m37848d0(str);
            str2 = "user property referrer";
        } else {
            m37848d0 = m37848d0(str);
            str2 = "user property";
        }
        return m37869t0(str2, str, m37848d0, obj) ? 0 : 7;
    }

    /* renamed from: y */
    public final Object m37875y(String str, Object obj) {
        boolean equals = "_ldl".equals(str);
        int m37848d0 = m37848d0(str);
        return equals ? m37847c0(m37848d0, obj, true, false) : m37847c0(m37848d0, obj, false, false);
    }

    /* renamed from: z */
    public final void m37876z(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.f41723a.mo37780c().m38413t().m38328c("Not putting event parameter. Invalid value type. name, type", this.f41723a.m37766H().m38232q(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }
}
