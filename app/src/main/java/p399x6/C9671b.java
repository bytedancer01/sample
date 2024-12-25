package p399x6;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import ec.C4699b;
import ec.InterfaceC4709l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.apache.http.cookie.InterfaceC7038SM;
import org.apache.http.protocol.HTTP;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import p027b9.AbstractC0842g;
import p027b9.C0833b0;
import p027b9.C0856n;
import p027b9.C0858p;
import p027b9.C0864v;
import p027b9.InterfaceC0831a0;
import p027b9.InterfaceC0853l0;
import p059d9.C4349a;
import p059d9.C4360f;
import p059d9.C4401z0;
import p059d9.InterfaceC4354c;
import p168jc.C5355d;
import p267p6.C7623u0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:x6/b.class
 */
/* renamed from: x6.b */
/* loaded from: combined.jar:classes2.jar:x6/b.class */
public class C9671b extends AbstractC0842g implements InterfaceC0831a0 {

    /* renamed from: A */
    public boolean f44094A;

    /* renamed from: B */
    public volatile long f44095B;

    /* renamed from: e */
    public final UrlRequest.Callback f44096e;

    /* renamed from: f */
    public final CronetEngine f44097f;

    /* renamed from: g */
    public final Executor f44098g;

    /* renamed from: h */
    public final int f44099h;

    /* renamed from: i */
    public final int f44100i;

    /* renamed from: j */
    public final int f44101j;

    /* renamed from: k */
    public final boolean f44102k;

    /* renamed from: l */
    public final boolean f44103l;

    /* renamed from: m */
    public final String f44104m;

    /* renamed from: n */
    public final InterfaceC0831a0.f f44105n;

    /* renamed from: o */
    public final InterfaceC0831a0.f f44106o;

    /* renamed from: p */
    public final C4360f f44107p;

    /* renamed from: q */
    public final InterfaceC4354c f44108q;

    /* renamed from: r */
    public InterfaceC4709l<String> f44109r;

    /* renamed from: s */
    public final boolean f44110s;

    /* renamed from: t */
    public boolean f44111t;

    /* renamed from: u */
    public long f44112u;

    /* renamed from: v */
    public UrlRequest f44113v;

    /* renamed from: w */
    public C0858p f44114w;

    /* renamed from: x */
    public ByteBuffer f44115x;

    /* renamed from: y */
    public UrlResponseInfo f44116y;

    /* renamed from: z */
    public IOException f44117z;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:x6/b$a.class
     */
    /* renamed from: x6.b$a */
    /* loaded from: combined.jar:classes2.jar:x6/b$a.class */
    public class a extends UrlRequest.StatusListener {

        /* renamed from: a */
        public final int[] f44118a;

        /* renamed from: b */
        public final C4360f f44119b;

        public a(int[] iArr, C4360f c4360f) {
            this.f44118a = iArr;
            this.f44119b = c4360f;
        }

        @Override // org.chromium.net.UrlRequest.StatusListener
        public void onStatus(int i10) {
            this.f44118a[0] = i10;
            this.f44119b.m21967f();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:x6/b$b.class
     */
    /* renamed from: x6.b$b */
    /* loaded from: combined.jar:classes2.jar:x6/b$b.class */
    public static final class b implements InterfaceC0831a0.b {

        /* renamed from: a */
        public final CronetEngine f44120a;

        /* renamed from: b */
        public final Executor f44121b;

        /* renamed from: e */
        public InterfaceC0831a0.b f44124e;

        /* renamed from: f */
        public InterfaceC4709l<String> f44125f;

        /* renamed from: g */
        public InterfaceC0853l0 f44126g;

        /* renamed from: h */
        public String f44127h;

        /* renamed from: l */
        public boolean f44131l;

        /* renamed from: m */
        public boolean f44132m;

        /* renamed from: n */
        public boolean f44133n;

        /* renamed from: c */
        public final InterfaceC0831a0.f f44122c = new InterfaceC0831a0.f();

        /* renamed from: d */
        public final C0864v.b f44123d = null;

        /* renamed from: i */
        public int f44128i = 3;

        /* renamed from: j */
        public int f44129j = 8000;

        /* renamed from: k */
        public int f44130k = 8000;

        public b(CronetEngine cronetEngine, Executor executor) {
            this.f44120a = (CronetEngine) C4349a.m21882e(cronetEngine);
            this.f44121b = executor;
        }

        @Override // p027b9.InterfaceC0854m.a
        /* renamed from: a */
        public InterfaceC0831a0 mo5296a() {
            if (this.f44120a == null) {
                InterfaceC0831a0.b bVar = this.f44124e;
                return bVar != null ? bVar.mo5296a() : ((C0864v.b) C4349a.m21882e(this.f44123d)).mo5296a();
            }
            C9671b c9671b = new C9671b(this.f44120a, this.f44121b, this.f44128i, this.f44129j, this.f44130k, this.f44131l, this.f44132m, this.f44127h, this.f44122c, this.f44125f, this.f44133n);
            InterfaceC0853l0 interfaceC0853l0 = this.f44126g;
            if (interfaceC0853l0 != null) {
                c9671b.mo522c(interfaceC0853l0);
            }
            return c9671b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:x6/b$c.class
     */
    /* renamed from: x6.b$c */
    /* loaded from: combined.jar:classes2.jar:x6/b$c.class */
    public static final class c extends InterfaceC0831a0.c {

        /* renamed from: e */
        public final int f44134e;

        public c(C0858p c0858p, int i10, int i11) {
            super(c0858p, i10, 1);
            this.f44134e = i11;
        }

        public c(IOException iOException, C0858p c0858p, int i10, int i11) {
            super(iOException, c0858p, i10, 1);
            this.f44134e = i11;
        }

        public c(String str, C0858p c0858p, int i10, int i11) {
            super(str, c0858p, i10, 1);
            this.f44134e = i11;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:x6/b$d.class
     */
    /* renamed from: x6.b$d */
    /* loaded from: combined.jar:classes2.jar:x6/b$d.class */
    public final class d extends UrlRequest.Callback {

        /* renamed from: a */
        public final C9671b f44135a;

        public d(C9671b c9671b) {
            this.f44135a = c9671b;
        }

        public /* synthetic */ d(C9671b c9671b, a aVar) {
            this(c9671b);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            synchronized (this) {
                if (urlRequest != this.f44135a.f44113v) {
                    return;
                }
                if ((cronetException instanceof NetworkException) && ((NetworkException) cronetException).getErrorCode() == 1) {
                    this.f44135a.f44117z = new UnknownHostException();
                } else {
                    this.f44135a.f44117z = cronetException;
                }
                this.f44135a.f44107p.m21967f();
            }
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            synchronized (this) {
                if (urlRequest != this.f44135a.f44113v) {
                    return;
                }
                this.f44135a.f44107p.m21967f();
            }
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            synchronized (this) {
                if (urlRequest != this.f44135a.f44113v) {
                    return;
                }
                UrlRequest urlRequest2 = (UrlRequest) C4349a.m21882e(this.f44135a.f44113v);
                C0858p c0858p = (C0858p) C4349a.m21882e(this.f44135a.f44114w);
                int httpStatusCode = urlResponseInfo.getHttpStatusCode();
                if (c0858p.f5849c == 2 && (httpStatusCode == 307 || httpStatusCode == 308)) {
                    this.f44135a.f44117z = new InterfaceC0831a0.e(httpStatusCode, urlResponseInfo.getHttpStatusText(), null, urlResponseInfo.getAllHeaders(), c0858p, C4401z0.f26684f);
                    this.f44135a.f44107p.m21967f();
                    return;
                }
                if (this.f44135a.f44102k) {
                    this.f44135a.m40678S();
                }
                boolean z10 = this.f44135a.f44110s && c0858p.f5849c == 2 && httpStatusCode == 302;
                if (!z10 && !this.f44135a.f44103l) {
                    urlRequest.followRedirect();
                    return;
                }
                String m40667P = C9671b.m40667P(urlResponseInfo.getAllHeaders().get(InterfaceC7038SM.SET_COOKIE));
                if (!z10 && TextUtils.isEmpty(m40667P)) {
                    urlRequest.followRedirect();
                    return;
                }
                urlRequest2.cancel();
                try {
                    UrlRequest.Builder m40674K = this.f44135a.m40674K((z10 || c0858p.f5849c != 2) ? c0858p.m5382g(Uri.parse(str)) : c0858p.m5377a().m5392j(str).m5386d(1).m5385c(null).m5383a());
                    C9671b.m40663I(m40674K, m40667P);
                    this.f44135a.f44113v = m40674K.build();
                    this.f44135a.f44113v.start();
                } catch (IOException e10) {
                    this.f44135a.f44117z = e10;
                }
            }
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            synchronized (this) {
                if (urlRequest != this.f44135a.f44113v) {
                    return;
                }
                this.f44135a.f44116y = urlResponseInfo;
                this.f44135a.f44107p.m21967f();
            }
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            synchronized (this) {
                if (urlRequest != this.f44135a.f44113v) {
                    return;
                }
                this.f44135a.f44094A = true;
                this.f44135a.f44107p.m21967f();
            }
        }
    }

    static {
        C7623u0.m33152a("goog.exo.cronet");
    }

    public C9671b(CronetEngine cronetEngine, Executor executor, int i10, int i11, int i12, boolean z10, boolean z11, String str, InterfaceC0831a0.f fVar, InterfaceC4709l<String> interfaceC4709l, boolean z12) {
        super(true);
        this.f44097f = (CronetEngine) C4349a.m21882e(cronetEngine);
        this.f44098g = (Executor) C4349a.m21882e(executor);
        this.f44099h = i10;
        this.f44100i = i11;
        this.f44101j = i12;
        this.f44102k = z10;
        this.f44103l = z11;
        this.f44104m = str;
        this.f44105n = fVar;
        this.f44109r = interfaceC4709l;
        this.f44110s = z12;
        this.f44108q = InterfaceC4354c.f26546a;
        this.f44096e = new d(this, null);
        this.f44106o = new InterfaceC0831a0.f();
        this.f44107p = new C4360f();
    }

    /* renamed from: I */
    public static void m40663I(UrlRequest.Builder builder, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        builder.addHeader(InterfaceC7038SM.COOKIE, str);
    }

    /* renamed from: L */
    public static String m40664L(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        return (list == null || list.isEmpty()) ? null : list.get(0);
    }

    /* renamed from: N */
    public static int m40665N(UrlRequest urlRequest) {
        C4360f c4360f = new C4360f();
        int[] iArr = new int[1];
        urlRequest.getStatus(new a(iArr, c4360f));
        c4360f.m21962a();
        return iArr[0];
    }

    /* renamed from: O */
    public static boolean m40666O(UrlResponseInfo urlResponseInfo) {
        Iterator<Map.Entry<String, String>> it = urlResponseInfo.getAllHeadersAsList().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().equalsIgnoreCase("Content-Encoding")) {
                return !r0.getValue().equalsIgnoreCase(HTTP.IDENTITY_CODING);
            }
        }
        return false;
    }

    /* renamed from: P */
    public static String m40667P(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return TextUtils.join(";", list);
    }

    /* renamed from: J */
    public final boolean m40673J() {
        long mo21913b = this.f44108q.mo21913b();
        boolean z10 = false;
        while (!z10 && mo21913b < this.f44095B) {
            z10 = this.f44107p.m21963b((this.f44095B - mo21913b) + 5);
            mo21913b = this.f44108q.mo21913b();
        }
        return z10;
    }

    /* renamed from: K */
    public UrlRequest.Builder m40674K(C0858p c0858p) {
        UrlRequest.Builder allowDirectExecutor = this.f44097f.newUrlRequestBuilder(c0858p.f5847a.toString(), this.f44096e, this.f44098g).setPriority(this.f44099h).allowDirectExecutor();
        HashMap hashMap = new HashMap();
        InterfaceC0831a0.f fVar = this.f44105n;
        if (fVar != null) {
            hashMap.putAll(fVar.m5299a());
        }
        hashMap.putAll(this.f44106o.m5299a());
        hashMap.putAll(c0858p.f5851e);
        for (Map.Entry entry : hashMap.entrySet()) {
            allowDirectExecutor.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (c0858p.f5850d != null && !hashMap.containsKey("Content-Type")) {
            throw new c("HTTP request with non-empty body must set Content-Type", c0858p, 1004, 0);
        }
        String m5305a = C0833b0.m5305a(c0858p.f5853g, c0858p.f5854h);
        if (m5305a != null) {
            allowDirectExecutor.addHeader("Range", m5305a);
        }
        String str = this.f44104m;
        if (str != null) {
            allowDirectExecutor.addHeader("User-Agent", str);
        }
        allowDirectExecutor.setHttpMethod(c0858p.m5378b());
        byte[] bArr = c0858p.f5850d;
        if (bArr != null) {
            allowDirectExecutor.setUploadDataProvider(new C9670a(bArr), this.f44098g);
        }
        return allowDirectExecutor;
    }

    /* renamed from: M */
    public final ByteBuffer m40675M() {
        if (this.f44115x == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32768);
            this.f44115x = allocateDirect;
            allocateDirect.limit(0);
        }
        return this.f44115x;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0073  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m40676Q(java.nio.ByteBuffer r8, p027b9.C0858p r9) {
        /*
            r7 = this;
            r0 = r7
            org.chromium.net.UrlRequest r0 = r0.f44113v
            java.lang.Object r0 = p059d9.C4401z0.m22391j(r0)
            org.chromium.net.UrlRequest r0 = (org.chromium.net.UrlRequest) r0
            r1 = r8
            r0.read(r1)
            r0 = r7
            d9.f r0 = r0.f44107p     // Catch: java.net.SocketTimeoutException -> L2a java.lang.InterruptedException -> L49
            r1 = r7
            int r1 = r1.f44101j     // Catch: java.net.SocketTimeoutException -> L2a java.lang.InterruptedException -> L49
            long r1 = (long) r1     // Catch: java.net.SocketTimeoutException -> L2a java.lang.InterruptedException -> L49
            boolean r0 = r0.m21963b(r1)     // Catch: java.net.SocketTimeoutException -> L2a java.lang.InterruptedException -> L49
            if (r0 == 0) goto L20
            goto L6a
        L20:
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException     // Catch: java.net.SocketTimeoutException -> L2a java.lang.InterruptedException -> L49
            r10 = r0
            r0 = r10
            r0.<init>()     // Catch: java.net.SocketTimeoutException -> L2a java.lang.InterruptedException -> L49
            r0 = r10
            throw r0     // Catch: java.net.SocketTimeoutException -> L2a java.lang.InterruptedException -> L49
        L2a:
            r10 = move-exception
            r0 = r8
            r1 = r7
            java.nio.ByteBuffer r1 = r1.f44115x
            if (r0 != r1) goto L38
            r0 = r7
            r1 = 0
            r0.f44115x = r1
        L38:
            b9.a0$c r0 = new b9.a0$c
            r1 = r0
            r2 = r10
            r3 = r9
            r4 = 2002(0x7d2, float:2.805E-42)
            r5 = 2
            r1.<init>(r2, r3, r4, r5)
            r8 = r0
            goto L65
        L49:
            r10 = move-exception
            r0 = r8
            r1 = r7
            java.nio.ByteBuffer r1 = r1.f44115x
            if (r0 != r1) goto L57
            r0 = r7
            r1 = 0
            r0.f44115x = r1
        L57:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r1 = r0
            r1.<init>()
            r8 = r0
        L65:
            r0 = r7
            r1 = r8
            r0.f44117z = r1
        L6a:
            r0 = r7
            java.io.IOException r0 = r0.f44117z
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L86
            r0 = r8
            boolean r0 = r0 instanceof p027b9.InterfaceC0831a0.c
            if (r0 == 0) goto L7f
            r0 = r8
            b9.a0$c r0 = (p027b9.InterfaceC0831a0.c) r0
            throw r0
        L7f:
            r0 = r8
            r1 = r9
            r2 = 2
            b9.a0$c r0 = p027b9.InterfaceC0831a0.c.m5298b(r0, r1, r2)
            throw r0
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p399x6.C9671b.m40676Q(java.nio.ByteBuffer, b9.p):void");
    }

    /* renamed from: R */
    public final byte[] m40677R() {
        byte[] bArr = C4401z0.f26684f;
        ByteBuffer m40675M = m40675M();
        while (!this.f44094A) {
            this.f44107p.m21965d();
            m40675M.clear();
            m40676Q(m40675M, (C0858p) C4401z0.m22391j(this.f44114w));
            m40675M.flip();
            if (m40675M.remaining() > 0) {
                int length = bArr.length;
                bArr = Arrays.copyOf(bArr, bArr.length + m40675M.remaining());
                m40675M.get(bArr, length, m40675M.remaining());
            }
        }
        return bArr;
    }

    /* renamed from: S */
    public final void m40678S() {
        this.f44095B = this.f44108q.mo21913b() + this.f44100i;
    }

    /* renamed from: T */
    public final void m40679T(long j10, C0858p c0858p) {
        if (j10 == 0) {
            return;
        }
        ByteBuffer m40675M = m40675M();
        while (j10 > 0) {
            try {
                this.f44107p.m21965d();
                m40675M.clear();
                m40676Q(m40675M, c0858p);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (this.f44094A) {
                    throw new c(c0858p, AdError.REMOTE_ADS_SERVICE_ERROR, 14);
                }
                m40675M.flip();
                C4349a.m21884g(m40675M.hasRemaining());
                int min = (int) Math.min(m40675M.remaining(), j10);
                m40675M.position(m40675M.position() + min);
                j10 -= min;
            } catch (IOException e10) {
                if (e10 instanceof InterfaceC0831a0.c) {
                    throw ((InterfaceC0831a0.c) e10);
                }
                throw new c(e10, c0858p, e10 instanceof SocketTimeoutException ? 2002 : 2001, 14);
            }
        }
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: a */
    public long mo521a(C0858p c0858p) {
        byte[] bArr;
        String m40664L;
        C4349a.m21882e(c0858p);
        C4349a.m21884g(!this.f44111t);
        this.f44107p.m21965d();
        m40678S();
        this.f44114w = c0858p;
        try {
            UrlRequest build = m40674K(c0858p).build();
            this.f44113v = build;
            build.start();
            m5355t(c0858p);
            try {
                boolean m40673J = m40673J();
                IOException iOException = this.f44117z;
                if (iOException != null) {
                    String message = iOException.getMessage();
                    if (message == null || !C4699b.m23638e(message).contains("err_cleartext_not_permitted")) {
                        throw new c(iOException, c0858p, AdError.INTERNAL_ERROR_CODE, m40665N(build));
                    }
                    throw new InterfaceC0831a0.a(iOException, c0858p);
                }
                if (!m40673J) {
                    throw new c(new SocketTimeoutException(), c0858p, AdError.CACHE_ERROR_CODE, m40665N(build));
                }
                UrlResponseInfo urlResponseInfo = (UrlResponseInfo) C4349a.m21882e(this.f44116y);
                int httpStatusCode = urlResponseInfo.getHttpStatusCode();
                Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
                long j10 = 0;
                if (httpStatusCode < 200 || httpStatusCode > 299) {
                    if (httpStatusCode == 416) {
                        if (c0858p.f5853g == C0833b0.m5307c(m40664L(allHeaders, "Content-Range"))) {
                            this.f44111t = true;
                            m5356u(c0858p);
                            long j11 = c0858p.f5854h;
                            if (j11 != -1) {
                                j10 = j11;
                            }
                            return j10;
                        }
                    }
                    try {
                        bArr = m40677R();
                    } catch (IOException e10) {
                        bArr = C4401z0.f26684f;
                    }
                    throw new InterfaceC0831a0.e(httpStatusCode, urlResponseInfo.getHttpStatusText(), httpStatusCode == 416 ? new C0856n(AdError.REMOTE_ADS_SERVICE_ERROR) : null, allHeaders, c0858p, bArr);
                }
                InterfaceC4709l<String> interfaceC4709l = this.f44109r;
                if (interfaceC4709l != null && (m40664L = m40664L(allHeaders, "Content-Type")) != null && !interfaceC4709l.apply(m40664L)) {
                    throw new InterfaceC0831a0.d(m40664L, c0858p);
                }
                long j12 = 0;
                if (httpStatusCode == 200) {
                    long j13 = c0858p.f5853g;
                    j12 = 0;
                    if (j13 != 0) {
                        j12 = j13;
                    }
                }
                if (m40666O(urlResponseInfo)) {
                    this.f44112u = c0858p.f5854h;
                } else {
                    long j14 = c0858p.f5854h;
                    if (j14 != -1) {
                        this.f44112u = j14;
                    } else {
                        long m5306b = C0833b0.m5306b(m40664L(allHeaders, "Content-Length"), m40664L(allHeaders, "Content-Range"));
                        long j15 = -1;
                        if (m5306b != -1) {
                            j15 = m5306b - j12;
                        }
                        this.f44112u = j15;
                    }
                }
                this.f44111t = true;
                m5356u(c0858p);
                m40679T(j12, c0858p);
                return this.f44112u;
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                throw new c(new InterruptedIOException(), c0858p, 1004, -1);
            }
        } catch (IOException e12) {
            if (e12 instanceof InterfaceC0831a0.c) {
                throw ((InterfaceC0831a0.c) e12);
            }
            throw new c(e12, c0858p, 2000, 0);
        }
    }

    @Override // p027b9.InterfaceC0854m
    public void close() {
        synchronized (this) {
            UrlRequest urlRequest = this.f44113v;
            if (urlRequest != null) {
                urlRequest.cancel();
                this.f44113v = null;
            }
            ByteBuffer byteBuffer = this.f44115x;
            if (byteBuffer != null) {
                byteBuffer.limit(0);
            }
            this.f44114w = null;
            this.f44116y = null;
            this.f44117z = null;
            this.f44094A = false;
            if (this.f44111t) {
                this.f44111t = false;
                m5354s();
            }
        }
    }

    @Override // p027b9.AbstractC0842g, p027b9.InterfaceC0854m
    /* renamed from: e */
    public Map<String, List<String>> mo523e() {
        UrlResponseInfo urlResponseInfo = this.f44116y;
        return urlResponseInfo == null ? Collections.emptyMap() : urlResponseInfo.getAllHeaders();
    }

    @Override // p027b9.InterfaceC0854m
    public Uri getUri() {
        UrlResponseInfo urlResponseInfo = this.f44116y;
        return urlResponseInfo == null ? null : Uri.parse(urlResponseInfo.getUrl());
    }

    @Override // p027b9.InterfaceC0846i
    public int read(byte[] bArr, int i10, int i11) {
        C4349a.m21884g(this.f44111t);
        if (i11 == 0) {
            return 0;
        }
        if (this.f44112u == 0) {
            return -1;
        }
        ByteBuffer m40675M = m40675M();
        if (!m40675M.hasRemaining()) {
            this.f44107p.m21965d();
            m40675M.clear();
            m40676Q(m40675M, (C0858p) C4401z0.m22391j(this.f44114w));
            if (this.f44094A) {
                this.f44112u = 0L;
                return -1;
            }
            m40675M.flip();
            C4349a.m21884g(m40675M.hasRemaining());
        }
        long j10 = this.f44112u;
        if (j10 == -1) {
            j10 = Long.MAX_VALUE;
        }
        int m26651d = (int) C5355d.m26651d(j10, m40675M.remaining(), i11);
        m40675M.get(bArr, i10, m26651d);
        long j11 = this.f44112u;
        if (j11 != -1) {
            this.f44112u = j11 - m26651d;
        }
        m5353r(m26651d);
        return m26651d;
    }
}
