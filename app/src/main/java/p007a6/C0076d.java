package p007a6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.http.HttpHeaders;
import p007a6.C0076d;
import p024b6.AbstractC0803a;
import p024b6.AbstractC0812j;
import p024b6.AbstractC0813k;
import p024b6.AbstractC0814l;
import p024b6.AbstractC0815m;
import p024b6.AbstractC0816n;
import p024b6.AbstractC0817o;
import p024b6.EnumC0818p;
import p036c6.AbstractC0998i;
import p036c6.C0997h;
import p056d6.AbstractC4310f;
import p056d6.AbstractC4311g;
import p056d6.InterfaceC4317m;
import p124h6.C5036a;
import p144i6.C5191b;
import p144i6.InterfaceC5190a;
import p144i6.InterfaceC5192c;
import p227n6.InterfaceC6654a;
import p437z5.C10054b;
import tc.C8680c;
import tc.InterfaceC8678a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a6/d.class
 */
/* renamed from: a6.d */
/* loaded from: combined.jar:classes1.jar:a6/d.class */
public final class C0076d implements InterfaceC4317m {

    /* renamed from: a */
    public final InterfaceC8678a f236a;

    /* renamed from: b */
    public final ConnectivityManager f237b;

    /* renamed from: c */
    public final Context f238c;

    /* renamed from: d */
    public final URL f239d;

    /* renamed from: e */
    public final InterfaceC6654a f240e;

    /* renamed from: f */
    public final InterfaceC6654a f241f;

    /* renamed from: g */
    public final int f242g;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a6/d$a.class
     */
    /* renamed from: a6.d$a */
    /* loaded from: combined.jar:classes1.jar:a6/d$a.class */
    public static final class a {

        /* renamed from: a */
        public final URL f243a;

        /* renamed from: b */
        public final AbstractC0812j f244b;

        /* renamed from: c */
        public final String f245c;

        public a(URL url, AbstractC0812j abstractC0812j, String str) {
            this.f243a = url;
            this.f244b = abstractC0812j;
            this.f245c = str;
        }

        /* renamed from: a */
        public a m294a(URL url) {
            return new a(url, this.f244b, this.f245c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a6/d$b.class
     */
    /* renamed from: a6.d$b */
    /* loaded from: combined.jar:classes1.jar:a6/d$b.class */
    public static final class b {

        /* renamed from: a */
        public final int f246a;

        /* renamed from: b */
        public final URL f247b;

        /* renamed from: c */
        public final long f248c;

        public b(int i10, URL url, long j10) {
            this.f246a = i10;
            this.f247b = url;
            this.f248c = j10;
        }
    }

    public C0076d(Context context, InterfaceC6654a interfaceC6654a, InterfaceC6654a interfaceC6654a2) {
        this(context, interfaceC6654a, interfaceC6654a2, 40000);
    }

    public C0076d(Context context, InterfaceC6654a interfaceC6654a, InterfaceC6654a interfaceC6654a2, int i10) {
        this.f236a = AbstractC0812j.m5210b();
        this.f238c = context;
        this.f237b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f239d = m289n(C0073a.f227c);
        this.f240e = interfaceC6654a2;
        this.f241f = interfaceC6654a;
        this.f242g = i10;
    }

    /* renamed from: f */
    public static int m282f(NetworkInfo networkInfo) {
        AbstractC0817o.b bVar;
        if (networkInfo == null) {
            bVar = AbstractC0817o.b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype != -1) {
                if (AbstractC0817o.b.forNumber(subtype) == null) {
                    subtype = 0;
                }
                return subtype;
            }
            bVar = AbstractC0817o.b.COMBINED;
        }
        return bVar.getValue();
    }

    /* renamed from: g */
    public static int m283g(NetworkInfo networkInfo) {
        return networkInfo == null ? AbstractC0817o.c.NONE.getValue() : networkInfo.getType();
    }

    /* renamed from: h */
    public static int m284h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            C5036a.m25237c("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    /* renamed from: j */
    public static TelephonyManager m285j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: k */
    public static long m286k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* renamed from: l */
    public static /* synthetic */ a m287l(a aVar, b bVar) {
        URL url = bVar.f247b;
        if (url == null) {
            return null;
        }
        C5036a.m25235a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.m294a(bVar.f247b);
    }

    /* renamed from: m */
    public static InputStream m288m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* renamed from: n */
    public static URL m289n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // p056d6.InterfaceC4317m
    /* renamed from: a */
    public AbstractC0998i mo290a(AbstractC0998i abstractC0998i) {
        NetworkInfo activeNetworkInfo = this.f237b.getActiveNetworkInfo();
        return abstractC0998i.m5947l().m5948a("sdk-version", Build.VERSION.SDK_INT).m5950c("model", Build.MODEL).m5950c("hardware", Build.HARDWARE).m5950c("device", Build.DEVICE).m5950c("product", Build.PRODUCT).m5950c("os-uild", Build.ID).m5950c("manufacturer", Build.MANUFACTURER).m5950c("fingerprint", Build.FINGERPRINT).m5949b("tz-offset", m286k()).m5948a("net-type", m283g(activeNetworkInfo)).m5948a("mobile-subtype", m282f(activeNetworkInfo)).m5950c("country", Locale.getDefault().getCountry()).m5950c("locale", Locale.getDefault().getLanguage()).m5950c("mcc_mnc", m285j(this.f238c).getSimOperator()).m5950c("application_build", Integer.toString(m284h(this.f238c))).mo5908d();
    }

    @Override // p056d6.InterfaceC4317m
    /* renamed from: b */
    public AbstractC4311g mo291b(AbstractC4310f abstractC4310f) {
        AbstractC0812j m293i = m293i(abstractC4310f);
        URL url = this.f239d;
        String str = null;
        URL url2 = url;
        if (abstractC4310f.mo21769c() != null) {
            try {
                C0073a m274c = C0073a.m274c(abstractC4310f.mo21769c());
                String str2 = null;
                if (m274c.m277d() != null) {
                    str2 = m274c.m277d();
                }
                url2 = url;
                str = str2;
                if (m274c.m278e() != null) {
                    url2 = m289n(m274c.m278e());
                    str = str2;
                }
            } catch (IllegalArgumentException e10) {
                return AbstractC4311g.m21780a();
            }
        }
        try {
            b bVar = (b) C5191b.m25881a(5, new a(url2, m293i, str), new InterfaceC5190a(this) { // from class: a6.b

                /* renamed from: a */
                public final C0076d f235a;

                {
                    this.f235a = this;
                }

                @Override // p144i6.InterfaceC5190a
                public final Object apply(Object obj) {
                    C0076d.b m292e;
                    m292e = this.f235a.m292e((C0076d.a) obj);
                    return m292e;
                }
            }, new InterfaceC5192c() { // from class: a6.c
                @Override // p144i6.InterfaceC5192c
                /* renamed from: a */
                public final Object mo279a(Object obj, Object obj2) {
                    C0076d.a m287l;
                    m287l = C0076d.m287l((C0076d.a) obj, (C0076d.b) obj2);
                    return m287l;
                }
            });
            int i10 = bVar.f246a;
            return i10 == 200 ? AbstractC4311g.m21782e(bVar.f248c) : (i10 >= 500 || i10 == 404) ? AbstractC4311g.m21783f() : i10 == 400 ? AbstractC4311g.m21781d() : AbstractC4311g.m21780a();
        } catch (IOException e11) {
            C5036a.m25237c("CctTransportBackend", "Could not make request to the backend", e11);
            return AbstractC4311g.m21783f();
        }
    }

    /* renamed from: e */
    public final b m292e(a aVar) {
        C5036a.m25235a("CctTransportBackend", "Making request to: %s", aVar.f243a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f243a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f242g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.3"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
        String str = aVar.f245c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f236a.mo37171a(aVar.f244b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    C5036a.m25239e("CctTransportBackend", "Status Code: " + responseCode);
                    C5036a.m25239e("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                    C5036a.m25239e("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream m288m = m288m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, AbstractC0816n.m5219b(new BufferedReader(new InputStreamReader(m288m))).mo5203c());
                            if (m288m != null) {
                                m288m.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } finally {
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (ConnectException e10) {
            e = e10;
            C5036a.m25237c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            C5036a.m25237c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            C5036a.m25237c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (C8680c e13) {
            e = e13;
            C5036a.m25237c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    /* renamed from: i */
    public final AbstractC0812j m293i(AbstractC4310f abstractC4310f) {
        AbstractC0814l.a m5214j;
        HashMap hashMap = new HashMap();
        for (AbstractC0998i abstractC0998i : abstractC4310f.mo21768b()) {
            String mo5906j = abstractC0998i.mo5906j();
            if (hashMap.containsKey(mo5906j)) {
                ((List) hashMap.get(mo5906j)).add(abstractC0998i);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC0998i);
                hashMap.put(mo5906j, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC0998i abstractC0998i2 = (AbstractC0998i) ((List) entry.getValue()).get(0);
            AbstractC0815m.a mo5196b = AbstractC0815m.m5215a().mo5200f(EnumC0818p.DEFAULT).mo5201g(this.f241f.mo30655a()).mo5202h(this.f240e.mo30655a()).mo5196b(AbstractC0813k.m5211a().mo5172c(AbstractC0813k.b.ANDROID_FIREBASE).mo5171b(AbstractC0803a.m5133a().mo5158m(Integer.valueOf(abstractC0998i2.m5944g("sdk-version"))).mo5155j(abstractC0998i2.m5943b("model")).mo5151f(abstractC0998i2.m5943b("hardware")).mo5149d(abstractC0998i2.m5943b("device")).mo5157l(abstractC0998i2.m5943b("product")).mo5156k(abstractC0998i2.m5943b("os-uild")).mo5153h(abstractC0998i2.m5943b("manufacturer")).mo5150e(abstractC0998i2.m5943b("fingerprint")).mo5148c(abstractC0998i2.m5943b("country")).mo5152g(abstractC0998i2.m5943b("locale")).mo5154i(abstractC0998i2.m5943b("mcc_mnc")).mo5147b(abstractC0998i2.m5943b("application_build")).mo5146a()).mo5170a());
            try {
                mo5196b.m5216i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException e10) {
                mo5196b.m5217j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC0998i abstractC0998i3 : (List) entry.getValue()) {
                C0997h mo5904e = abstractC0998i3.mo5904e();
                C10054b m5941b = mo5904e.m5941b();
                if (m5941b.equals(C10054b.m42268b("proto"))) {
                    m5214j = AbstractC0814l.m5214j(mo5904e.m5940a());
                } else if (m5941b.equals(C10054b.m42268b("json"))) {
                    m5214j = AbstractC0814l.m5213i(new String(mo5904e.m5940a(), Charset.forName("UTF-8")));
                } else {
                    C5036a.m25240f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", m5941b);
                }
                m5214j.mo5182c(abstractC0998i3.mo5905f()).mo5183d(abstractC0998i3.mo5907k()).mo5187h(abstractC0998i3.m5945h("tz-offset")).mo5184e(AbstractC0817o.m5220a().mo5208c(AbstractC0817o.c.forNumber(abstractC0998i3.m5944g("net-type"))).mo5207b(AbstractC0817o.b.forNumber(abstractC0998i3.m5944g("mobile-subtype"))).mo5206a());
                if (abstractC0998i3.mo5903d() != null) {
                    m5214j.mo5181b(abstractC0998i3.mo5903d());
                }
                arrayList3.add(m5214j.mo5180a());
            }
            mo5196b.mo5197c(arrayList3);
            arrayList2.add(mo5196b.mo5195a());
        }
        return AbstractC0812j.m5209a(arrayList2);
    }
}
