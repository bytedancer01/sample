package p027b9;

import android.net.Uri;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.facebook.ads.AdError;
import ec.InterfaceC4709l;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpHost;
import org.apache.http.protocol.HTTP;
import p027b9.InterfaceC0831a0;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/v.class
 */
/* renamed from: b9.v */
/* loaded from: combined.jar:classes2.jar:b9/v.class */
public class C0864v extends AbstractC0842g implements InterfaceC0831a0 {

    /* renamed from: e */
    public final boolean f5919e;

    /* renamed from: f */
    public final int f5920f;

    /* renamed from: g */
    public final int f5921g;

    /* renamed from: h */
    public final String f5922h;

    /* renamed from: i */
    public final InterfaceC0831a0.f f5923i;

    /* renamed from: j */
    public final InterfaceC0831a0.f f5924j;

    /* renamed from: k */
    public final boolean f5925k;

    /* renamed from: l */
    public InterfaceC4709l<String> f5926l;

    /* renamed from: m */
    public C0858p f5927m;

    /* renamed from: n */
    public HttpURLConnection f5928n;

    /* renamed from: o */
    public InputStream f5929o;

    /* renamed from: p */
    public boolean f5930p;

    /* renamed from: q */
    public int f5931q;

    /* renamed from: r */
    public long f5932r;

    /* renamed from: s */
    public long f5933s;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/v$b.class
     */
    /* renamed from: b9.v$b */
    /* loaded from: combined.jar:classes2.jar:b9/v$b.class */
    public static final class b implements InterfaceC0831a0.b {

        /* renamed from: b */
        public InterfaceC0853l0 f5935b;

        /* renamed from: c */
        public InterfaceC4709l<String> f5936c;

        /* renamed from: d */
        public String f5937d;

        /* renamed from: g */
        public boolean f5940g;

        /* renamed from: h */
        public boolean f5941h;

        /* renamed from: a */
        public final InterfaceC0831a0.f f5934a = new InterfaceC0831a0.f();

        /* renamed from: e */
        public int f5938e = 8000;

        /* renamed from: f */
        public int f5939f = 8000;

        @Override // p027b9.InterfaceC0854m.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0864v mo5296a() {
            C0864v c0864v = new C0864v(this.f5937d, this.f5938e, this.f5939f, this.f5940g, this.f5934a, this.f5936c, this.f5941h);
            InterfaceC0853l0 interfaceC0853l0 = this.f5935b;
            if (interfaceC0853l0 != null) {
                c0864v.mo522c(interfaceC0853l0);
            }
            return c0864v;
        }

        /* renamed from: c */
        public b m5428c(String str) {
            this.f5937d = str;
            return this;
        }
    }

    public C0864v(String str, int i10, int i11, boolean z10, InterfaceC0831a0.f fVar, InterfaceC4709l<String> interfaceC4709l, boolean z11) {
        super(true);
        this.f5922h = str;
        this.f5920f = i10;
        this.f5921g = i11;
        this.f5919e = z10;
        this.f5923i = fVar;
        this.f5926l = interfaceC4709l;
        this.f5924j = new InterfaceC0831a0.f();
        this.f5925k = z11;
    }

    /* renamed from: A */
    public static void m5418A(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection == null || (i10 = C4401z0.f26679a) < 19 || i10 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j10 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j10 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) C4349a.m21882e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: x */
    public static boolean m5419x(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    /* renamed from: B */
    public HttpURLConnection m5420B(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    /* renamed from: C */
    public final int m5421C(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f5932r;
        int i12 = i11;
        if (j10 != -1) {
            long j11 = j10 - this.f5933s;
            if (j11 == 0) {
                return -1;
            }
            i12 = (int) Math.min(i11, j11);
        }
        int read = ((InputStream) C4401z0.m22391j(this.f5929o)).read(bArr, i10, i12);
        if (read == -1) {
            return -1;
        }
        this.f5933s += read;
        m5353r(read);
        return read;
    }

    /* renamed from: D */
    public final void m5422D(long j10, C0858p c0858p) {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int read = ((InputStream) C4401z0.m22391j(this.f5929o)).read(bArr, 0, (int) Math.min(j10, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterfaceC0831a0.c(new InterruptedIOException(), c0858p, 2000, 1);
            }
            if (read == -1) {
                throw new InterfaceC0831a0.c(c0858p, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
            }
            j10 -= read;
            m5353r(read);
        }
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: a */
    public long mo521a(C0858p c0858p) {
        byte[] bArr;
        this.f5927m = c0858p;
        long j10 = 0;
        this.f5933s = 0L;
        this.f5932r = 0L;
        m5355t(c0858p);
        try {
            HttpURLConnection m5425y = m5425y(c0858p);
            this.f5928n = m5425y;
            this.f5931q = m5425y.getResponseCode();
            String responseMessage = m5425y.getResponseMessage();
            int i10 = this.f5931q;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = m5425y.getHeaderFields();
                if (this.f5931q == 416) {
                    if (c0858p.f5853g == C0833b0.m5307c(m5425y.getHeaderField("Content-Range"))) {
                        this.f5930p = true;
                        m5356u(c0858p);
                        long j11 = c0858p.f5854h;
                        if (j11 != -1) {
                            j10 = j11;
                        }
                        return j10;
                    }
                }
                InputStream errorStream = m5425y.getErrorStream();
                try {
                    bArr = errorStream != null ? C4401z0.m22370b1(errorStream) : C4401z0.f26684f;
                } catch (IOException e10) {
                    bArr = C4401z0.f26684f;
                }
                m5423v();
                throw new InterfaceC0831a0.e(this.f5931q, responseMessage, this.f5931q == 416 ? new C0856n(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields, c0858p, bArr);
            }
            String contentType = m5425y.getContentType();
            InterfaceC4709l<String> interfaceC4709l = this.f5926l;
            if (interfaceC4709l != null && !interfaceC4709l.apply(contentType)) {
                m5423v();
                throw new InterfaceC0831a0.d(contentType, c0858p);
            }
            long j12 = 0;
            if (this.f5931q == 200) {
                long j13 = c0858p.f5853g;
                j12 = 0;
                if (j13 != 0) {
                    j12 = j13;
                }
            }
            boolean m5419x = m5419x(m5425y);
            if (m5419x) {
                this.f5932r = c0858p.f5854h;
            } else {
                long j14 = c0858p.f5854h;
                if (j14 != -1) {
                    this.f5932r = j14;
                } else {
                    long m5306b = C0833b0.m5306b(m5425y.getHeaderField("Content-Length"), m5425y.getHeaderField("Content-Range"));
                    long j15 = -1;
                    if (m5306b != -1) {
                        j15 = m5306b - j12;
                    }
                    this.f5932r = j15;
                }
            }
            try {
                this.f5929o = m5425y.getInputStream();
                if (m5419x) {
                    this.f5929o = new GZIPInputStream(this.f5929o);
                }
                this.f5930p = true;
                m5356u(c0858p);
                try {
                    m5422D(j12, c0858p);
                    return this.f5932r;
                } catch (IOException e11) {
                    m5423v();
                    if (e11 instanceof InterfaceC0831a0.c) {
                        throw ((InterfaceC0831a0.c) e11);
                    }
                    throw new InterfaceC0831a0.c(e11, c0858p, 2000, 1);
                }
            } catch (IOException e12) {
                m5423v();
                throw new InterfaceC0831a0.c(e12, c0858p, 2000, 1);
            }
        } catch (IOException e13) {
            m5423v();
            throw InterfaceC0831a0.c.m5298b(e13, c0858p, 1);
        }
    }

    @Override // p027b9.InterfaceC0854m
    public void close() {
        try {
            InputStream inputStream = this.f5929o;
            if (inputStream != null) {
                long j10 = this.f5932r;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f5933s;
                }
                m5418A(this.f5928n, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new InterfaceC0831a0.c(e10, (C0858p) C4401z0.m22391j(this.f5927m), 2000, 3);
                }
            }
        } finally {
            this.f5929o = null;
            m5423v();
            if (this.f5930p) {
                this.f5930p = false;
                m5354s();
            }
        }
    }

    @Override // p027b9.AbstractC0842g, p027b9.InterfaceC0854m
    /* renamed from: e */
    public Map<String, List<String>> mo523e() {
        HttpURLConnection httpURLConnection = this.f5928n;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // p027b9.InterfaceC0854m
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f5928n;
        return httpURLConnection == null ? null : Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // p027b9.InterfaceC0846i
    public int read(byte[] bArr, int i10, int i11) {
        try {
            return m5421C(bArr, i10, i11);
        } catch (IOException e10) {
            throw InterfaceC0831a0.c.m5298b(e10, (C0858p) C4401z0.m22391j(this.f5927m), 2);
        }
    }

    /* renamed from: v */
    public final void m5423v() {
        HttpURLConnection httpURLConnection = this.f5928n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                C4392v.m22271e("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f5928n = null;
        }
    }

    /* renamed from: w */
    public final URL m5424w(URL url, String str, C0858p c0858p) {
        if (str == null) {
            throw new InterfaceC0831a0.c("Null location redirect", c0858p, AdError.INTERNAL_ERROR_CODE, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!ClientConstants.DOMAIN_SCHEME.equals(protocol) && !HttpHost.DEFAULT_SCHEME_NAME.equals(protocol)) {
                throw new InterfaceC0831a0.c("Unsupported protocol redirect: " + protocol, c0858p, AdError.INTERNAL_ERROR_CODE, 1);
            }
            if (this.f5919e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new InterfaceC0831a0.c("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", c0858p, AdError.INTERNAL_ERROR_CODE, 1);
        } catch (MalformedURLException e10) {
            throw new InterfaceC0831a0.c(e10, c0858p, AdError.INTERNAL_ERROR_CODE, 1);
        }
    }

    /* renamed from: y */
    public final HttpURLConnection m5425y(C0858p c0858p) {
        HttpURLConnection m5426z;
        URL m5424w;
        URL url = new URL(c0858p.f5847a.toString());
        int i10 = c0858p.f5849c;
        byte[] bArr = c0858p.f5850d;
        long j10 = c0858p.f5853g;
        long j11 = c0858p.f5854h;
        boolean m5379d = c0858p.m5379d(1);
        if (!this.f5919e && !this.f5925k) {
            return m5426z(url, i10, bArr, j10, j11, m5379d, true, c0858p.f5851e);
        }
        int i11 = 0;
        while (true) {
            int i12 = i11;
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new InterfaceC0831a0.c(new NoRouteToHostException("Too many redirects: " + i13), c0858p, AdError.INTERNAL_ERROR_CODE, 1);
            }
            m5426z = m5426z(url, i10, bArr, j10, j11, m5379d, false, c0858p.f5851e);
            int responseCode = m5426z.getResponseCode();
            String headerField = m5426z.getHeaderField("Location");
            if ((i10 == 1 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                m5426z.disconnect();
                m5424w = m5424w(url, headerField, c0858p);
            } else {
                if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                m5426z.disconnect();
                if (!(this.f5925k && responseCode == 302)) {
                    bArr = null;
                    i10 = 1;
                }
                m5424w = m5424w(url, headerField, c0858p);
            }
            url = m5424w;
            i11 = i13;
        }
        return m5426z;
    }

    /* renamed from: z */
    public final HttpURLConnection m5426z(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) {
        HttpURLConnection m5420B = m5420B(url);
        m5420B.setConnectTimeout(this.f5920f);
        m5420B.setReadTimeout(this.f5921g);
        HashMap hashMap = new HashMap();
        InterfaceC0831a0.f fVar = this.f5923i;
        if (fVar != null) {
            hashMap.putAll(fVar.m5299a());
        }
        hashMap.putAll(this.f5924j.m5299a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            m5420B.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String m5305a = C0833b0.m5305a(j10, j11);
        if (m5305a != null) {
            m5420B.setRequestProperty("Range", m5305a);
        }
        String str = this.f5922h;
        if (str != null) {
            m5420B.setRequestProperty("User-Agent", str);
        }
        m5420B.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, z10 ? "gzip" : HTTP.IDENTITY_CODING);
        m5420B.setInstanceFollowRedirects(z11);
        m5420B.setDoOutput(bArr != null);
        m5420B.setRequestMethod(C0858p.m5376c(i10));
        if (bArr != null) {
            m5420B.setFixedLengthStreamingMode(bArr.length);
            m5420B.connect();
            OutputStream outputStream = m5420B.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            m5420B.connect();
        }
        return m5420B;
    }
}
