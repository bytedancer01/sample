package p312ri;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kh.C5612f;
import kh.C5624r;
import ki.C5634b;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import p372vh.C9365d;
import p372vh.C9367f;
import p411xi.C9761e;
import p411xi.C9764h;
import p411xi.C9772p;
import p411xi.InterfaceC9756b0;
import p411xi.InterfaceC9763g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ri/d.class
 */
/* renamed from: ri.d */
/* loaded from: combined.jar:classes2.jar:ri/d.class */
public final class C8478d {

    /* renamed from: a */
    @NotNull
    public static final C8477c[] f39589a;

    /* renamed from: b */
    @NotNull
    public static final Map<C9764h, Integer> f39590b;

    /* renamed from: c */
    public static final C8478d f39591c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/d$a.class
     */
    /* renamed from: ri.d$a */
    /* loaded from: combined.jar:classes2.jar:ri/d$a.class */
    public static final class a {

        /* renamed from: a */
        public final List<C8477c> f39592a;

        /* renamed from: b */
        public final InterfaceC9763g f39593b;

        /* renamed from: c */
        @NotNull
        public C8477c[] f39594c;

        /* renamed from: d */
        public int f39595d;

        /* renamed from: e */
        public int f39596e;

        /* renamed from: f */
        public int f39597f;

        /* renamed from: g */
        public final int f39598g;

        /* renamed from: h */
        public int f39599h;

        public a(@NotNull InterfaceC9756b0 interfaceC9756b0, int i10, int i11) {
            C9367f.m39526e(interfaceC9756b0, "source");
            this.f39598g = i10;
            this.f39599h = i11;
            this.f39592a = new ArrayList();
            this.f39593b = C9772p.m41229c(interfaceC9756b0);
            C8477c[] c8477cArr = new C8477c[8];
            this.f39594c = c8477cArr;
            this.f39595d = c8477cArr.length - 1;
        }

        public /* synthetic */ a(InterfaceC9756b0 interfaceC9756b0, int i10, int i11, int i12, C9365d c9365d) {
            this(interfaceC9756b0, i10, (i12 & 4) != 0 ? i10 : i11);
        }

        /* renamed from: a */
        public final void m36405a() {
            int i10 = this.f39599h;
            int i11 = this.f39597f;
            if (i10 < i11) {
                if (i10 == 0) {
                    m36406b();
                } else {
                    m36408d(i11 - i10);
                }
            }
        }

        /* renamed from: b */
        public final void m36406b() {
            C5612f.m27683i(this.f39594c, null, 0, 0, 6, null);
            this.f39595d = this.f39594c.length - 1;
            this.f39596e = 0;
            this.f39597f = 0;
        }

        /* renamed from: c */
        public final int m36407c(int i10) {
            return this.f39595d + 1 + i10;
        }

        /* renamed from: d */
        public final int m36408d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f39594c.length - 1;
                int i13 = i10;
                int i14 = 0;
                while (true) {
                    i11 = this.f39595d;
                    if (length < i11 || i13 <= 0) {
                        break;
                    }
                    C8477c c8477c = this.f39594c[length];
                    C9367f.m39524c(c8477c);
                    int i15 = c8477c.f39586a;
                    i13 -= i15;
                    this.f39597f -= i15;
                    this.f39596e--;
                    i14++;
                    length--;
                }
                C8477c[] c8477cArr = this.f39594c;
                System.arraycopy(c8477cArr, i11 + 1, c8477cArr, i11 + 1 + i14, this.f39596e);
                this.f39595d += i14;
                i12 = i14;
            }
            return i12;
        }

        @NotNull
        /* renamed from: e */
        public final List<C8477c> m36409e() {
            List<C8477c> m27718G = C5624r.m27718G(this.f39592a);
            this.f39592a.clear();
            return m27718G;
        }

        /* renamed from: f */
        public final C9764h m36410f(int i10) {
            C8477c c8477c;
            if (!m36412h(i10)) {
                int m36407c = m36407c(i10 - C8478d.f39591c.m36403c().length);
                if (m36407c >= 0) {
                    C8477c[] c8477cArr = this.f39594c;
                    if (m36407c < c8477cArr.length) {
                        c8477c = c8477cArr[m36407c];
                        C9367f.m39524c(c8477c);
                    }
                }
                throw new IOException("Header index too large " + (i10 + 1));
            }
            c8477c = C8478d.f39591c.m36403c()[i10];
            return c8477c.f39587b;
        }

        /* renamed from: g */
        public final void m36411g(int i10, C8477c c8477c) {
            this.f39592a.add(c8477c);
            int i11 = c8477c.f39586a;
            int i12 = i11;
            if (i10 != -1) {
                C8477c c8477c2 = this.f39594c[m36407c(i10)];
                C9367f.m39524c(c8477c2);
                i12 = i11 - c8477c2.f39586a;
            }
            int i13 = this.f39599h;
            if (i12 > i13) {
                m36406b();
                return;
            }
            int m36408d = m36408d((this.f39597f + i12) - i13);
            if (i10 == -1) {
                int i14 = this.f39596e;
                C8477c[] c8477cArr = this.f39594c;
                if (i14 + 1 > c8477cArr.length) {
                    C8477c[] c8477cArr2 = new C8477c[c8477cArr.length * 2];
                    System.arraycopy(c8477cArr, 0, c8477cArr2, c8477cArr.length, c8477cArr.length);
                    this.f39595d = this.f39594c.length - 1;
                    this.f39594c = c8477cArr2;
                }
                int i15 = this.f39595d;
                this.f39595d = i15 - 1;
                this.f39594c[i15] = c8477c;
                this.f39596e++;
            } else {
                this.f39594c[i10 + m36407c(i10) + m36408d] = c8477c;
            }
            this.f39597f += i12;
        }

        /* renamed from: h */
        public final boolean m36412h(int i10) {
            boolean z10 = true;
            if (i10 < 0 || i10 > C8478d.f39591c.m36403c().length - 1) {
                z10 = false;
            }
            return z10;
        }

        /* renamed from: i */
        public final int m36413i() {
            return C5634b.m27782b(this.f39593b.readByte(), 255);
        }

        @NotNull
        /* renamed from: j */
        public final C9764h m36414j() {
            C9764h mo41159g0;
            int m36413i = m36413i();
            boolean z10 = (m36413i & 128) == 128;
            long m36417m = m36417m(m36413i, 127);
            if (z10) {
                C9761e c9761e = new C9761e();
                C8485k.f39783d.m36596b(this.f39593b, m36417m, c9761e);
                mo41159g0 = c9761e.m41129K0();
            } else {
                mo41159g0 = this.f39593b.mo41159g0(m36417m);
            }
            return mo41159g0;
        }

        /* renamed from: k */
        public final void m36415k() {
            while (!this.f39593b.mo41164k0()) {
                int m27782b = C5634b.m27782b(this.f39593b.readByte(), 255);
                if (m27782b == 128) {
                    throw new IOException("index == 0");
                }
                if ((m27782b & 128) == 128) {
                    m36416l(m36417m(m27782b, 127) - 1);
                } else if (m27782b == 64) {
                    m36419o();
                } else if ((m27782b & 64) == 64) {
                    m36418n(m36417m(m27782b, 63) - 1);
                } else if ((m27782b & 32) == 32) {
                    int m36417m = m36417m(m27782b, 31);
                    this.f39599h = m36417m;
                    if (m36417m < 0 || m36417m > this.f39598g) {
                        throw new IOException("Invalid dynamic table size update " + this.f39599h);
                    }
                    m36405a();
                } else if (m27782b == 16 || m27782b == 0) {
                    m36421q();
                } else {
                    m36420p(m36417m(m27782b, 15) - 1);
                }
            }
        }

        /* renamed from: l */
        public final void m36416l(int i10) {
            if (m36412h(i10)) {
                this.f39592a.add(C8478d.f39591c.m36403c()[i10]);
                return;
            }
            int m36407c = m36407c(i10 - C8478d.f39591c.m36403c().length);
            if (m36407c >= 0) {
                C8477c[] c8477cArr = this.f39594c;
                if (m36407c < c8477cArr.length) {
                    List<C8477c> list = this.f39592a;
                    C8477c c8477c = c8477cArr[m36407c];
                    C9367f.m39524c(c8477c);
                    list.add(c8477c);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        /* renamed from: m */
        public final int m36417m(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int m36413i = m36413i();
                if ((m36413i & 128) == 0) {
                    return i11 + (m36413i << i13);
                }
                i11 += (m36413i & 127) << i13;
                i13 += 7;
            }
        }

        /* renamed from: n */
        public final void m36418n(int i10) {
            m36411g(-1, new C8477c(m36410f(i10), m36414j()));
        }

        /* renamed from: o */
        public final void m36419o() {
            m36411g(-1, new C8477c(C8478d.f39591c.m36401a(m36414j()), m36414j()));
        }

        /* renamed from: p */
        public final void m36420p(int i10) {
            this.f39592a.add(new C8477c(m36410f(i10), m36414j()));
        }

        /* renamed from: q */
        public final void m36421q() {
            this.f39592a.add(new C8477c(C8478d.f39591c.m36401a(m36414j()), m36414j()));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/d$b.class
     */
    /* renamed from: ri.d$b */
    /* loaded from: combined.jar:classes2.jar:ri/d$b.class */
    public static final class b {

        /* renamed from: a */
        public int f39600a;

        /* renamed from: b */
        public boolean f39601b;

        /* renamed from: c */
        public int f39602c;

        /* renamed from: d */
        @NotNull
        public C8477c[] f39603d;

        /* renamed from: e */
        public int f39604e;

        /* renamed from: f */
        public int f39605f;

        /* renamed from: g */
        public int f39606g;

        /* renamed from: h */
        public int f39607h;

        /* renamed from: i */
        public final boolean f39608i;

        /* renamed from: j */
        public final C9761e f39609j;

        public b(int i10, boolean z10, @NotNull C9761e c9761e) {
            C9367f.m39526e(c9761e, "out");
            this.f39607h = i10;
            this.f39608i = z10;
            this.f39609j = c9761e;
            this.f39600a = Integer.MAX_VALUE;
            this.f39602c = i10;
            C8477c[] c8477cArr = new C8477c[8];
            this.f39603d = c8477cArr;
            this.f39604e = c8477cArr.length - 1;
        }

        public /* synthetic */ b(int i10, boolean z10, C9761e c9761e, int i11, C9365d c9365d) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, c9761e);
        }

        /* renamed from: a */
        public final void m36422a() {
            int i10 = this.f39602c;
            int i11 = this.f39606g;
            if (i10 < i11) {
                if (i10 == 0) {
                    m36423b();
                } else {
                    m36424c(i11 - i10);
                }
            }
        }

        /* renamed from: b */
        public final void m36423b() {
            C5612f.m27683i(this.f39603d, null, 0, 0, 6, null);
            this.f39604e = this.f39603d.length - 1;
            this.f39605f = 0;
            this.f39606g = 0;
        }

        /* renamed from: c */
        public final int m36424c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f39603d.length - 1;
                int i13 = i10;
                int i14 = 0;
                while (true) {
                    i11 = this.f39604e;
                    if (length < i11 || i13 <= 0) {
                        break;
                    }
                    C8477c c8477c = this.f39603d[length];
                    C9367f.m39524c(c8477c);
                    i13 -= c8477c.f39586a;
                    int i15 = this.f39606g;
                    C8477c c8477c2 = this.f39603d[length];
                    C9367f.m39524c(c8477c2);
                    this.f39606g = i15 - c8477c2.f39586a;
                    this.f39605f--;
                    i14++;
                    length--;
                }
                C8477c[] c8477cArr = this.f39603d;
                System.arraycopy(c8477cArr, i11 + 1, c8477cArr, i11 + 1 + i14, this.f39605f);
                C8477c[] c8477cArr2 = this.f39603d;
                int i16 = this.f39604e;
                Arrays.fill(c8477cArr2, i16 + 1, i16 + 1 + i14, (Object) null);
                this.f39604e += i14;
                i12 = i14;
            }
            return i12;
        }

        /* renamed from: d */
        public final void m36425d(C8477c c8477c) {
            int i10 = c8477c.f39586a;
            int i11 = this.f39602c;
            if (i10 > i11) {
                m36423b();
                return;
            }
            m36424c((this.f39606g + i10) - i11);
            int i12 = this.f39605f;
            C8477c[] c8477cArr = this.f39603d;
            if (i12 + 1 > c8477cArr.length) {
                C8477c[] c8477cArr2 = new C8477c[c8477cArr.length * 2];
                System.arraycopy(c8477cArr, 0, c8477cArr2, c8477cArr.length, c8477cArr.length);
                this.f39604e = this.f39603d.length - 1;
                this.f39603d = c8477cArr2;
            }
            int i13 = this.f39604e;
            this.f39604e = i13 - 1;
            this.f39603d[i13] = c8477c;
            this.f39605f++;
            this.f39606g += i10;
        }

        /* renamed from: e */
        public final void m36426e(int i10) {
            this.f39607h = i10;
            int min = Math.min(i10, 16384);
            int i11 = this.f39602c;
            if (i11 == min) {
                return;
            }
            if (min < i11) {
                this.f39600a = Math.min(this.f39600a, min);
            }
            this.f39601b = true;
            this.f39602c = min;
            m36422a();
        }

        /* renamed from: f */
        public final void m36427f(@NotNull C9764h c9764h) {
            int size;
            int i10;
            C9367f.m39526e(c9764h, "data");
            if (this.f39608i) {
                C8485k c8485k = C8485k.f39783d;
                if (c8485k.m36598d(c9764h) < c9764h.size()) {
                    C9761e c9761e = new C9761e();
                    c8485k.m36597c(c9764h, c9761e);
                    c9764h = c9761e.m41129K0();
                    size = c9764h.size();
                    i10 = 128;
                    m36429h(size, 127, i10);
                    this.f39609j.mo41162i0(c9764h);
                }
            }
            size = c9764h.size();
            i10 = 0;
            m36429h(size, 127, i10);
            this.f39609j.mo41162i0(c9764h);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x017d  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x018b  */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m36428g(@org.jetbrains.annotations.NotNull java.util.List<p312ri.C8477c> r6) {
            /*
                Method dump skipped, instructions count: 494
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p312ri.C8478d.b.m36428g(java.util.List):void");
        }

        /* renamed from: h */
        public final void m36429h(int i10, int i11, int i12) {
            int i13;
            C9761e c9761e;
            if (i10 < i11) {
                c9761e = this.f39609j;
                i13 = i10 | i12;
            } else {
                this.f39609j.writeByte(i12 | i11);
                int i14 = i10 - i11;
                while (true) {
                    i13 = i14;
                    if (i13 < 128) {
                        break;
                    }
                    this.f39609j.writeByte(128 | (i13 & 127));
                    i14 = i13 >>> 7;
                }
                c9761e = this.f39609j;
            }
            c9761e.writeByte(i13);
        }
    }

    static {
        C8478d c8478d = new C8478d();
        f39591c = c8478d;
        C8477c c8477c = new C8477c(C8477c.f39584i, "");
        C9764h c9764h = C8477c.f39581f;
        C8477c c8477c2 = new C8477c(c9764h, HttpGet.METHOD_NAME);
        C8477c c8477c3 = new C8477c(c9764h, "POST");
        C9764h c9764h2 = C8477c.f39582g;
        C8477c c8477c4 = new C8477c(c9764h2, "/");
        C8477c c8477c5 = new C8477c(c9764h2, "/index.html");
        C9764h c9764h3 = C8477c.f39583h;
        C8477c c8477c6 = new C8477c(c9764h3, HttpHost.DEFAULT_SCHEME_NAME);
        C8477c c8477c7 = new C8477c(c9764h3, ClientConstants.DOMAIN_SCHEME);
        C9764h c9764h4 = C8477c.f39580e;
        f39589a = new C8477c[]{c8477c, c8477c2, c8477c3, c8477c4, c8477c5, c8477c6, c8477c7, new C8477c(c9764h4, "200"), new C8477c(c9764h4, "204"), new C8477c(c9764h4, "206"), new C8477c(c9764h4, "304"), new C8477c(c9764h4, "400"), new C8477c(c9764h4, "404"), new C8477c(c9764h4, "500"), new C8477c("accept-charset", ""), new C8477c("accept-encoding", "gzip, deflate"), new C8477c("accept-language", ""), new C8477c("accept-ranges", ""), new C8477c("accept", ""), new C8477c("access-control-allow-origin", ""), new C8477c("age", ""), new C8477c("allow", ""), new C8477c("authorization", ""), new C8477c("cache-control", ""), new C8477c("content-disposition", ""), new C8477c("content-encoding", ""), new C8477c("content-language", ""), new C8477c("content-length", ""), new C8477c("content-location", ""), new C8477c("content-range", ""), new C8477c("content-type", ""), new C8477c("cookie", ""), new C8477c("date", ""), new C8477c(TransferTable.COLUMN_ETAG, ""), new C8477c("expect", ""), new C8477c(ClientCookie.EXPIRES_ATTR, ""), new C8477c("from", ""), new C8477c("host", ""), new C8477c("if-match", ""), new C8477c("if-modified-since", ""), new C8477c("if-none-match", ""), new C8477c("if-range", ""), new C8477c("if-unmodified-since", ""), new C8477c("last-modified", ""), new C8477c("link", ""), new C8477c("location", ""), new C8477c("max-forwards", ""), new C8477c("proxy-authenticate", ""), new C8477c("proxy-authorization", ""), new C8477c("range", ""), new C8477c("referer", ""), new C8477c("refresh", ""), new C8477c("retry-after", ""), new C8477c("server", ""), new C8477c("set-cookie", ""), new C8477c("strict-transport-security", ""), new C8477c("transfer-encoding", ""), new C8477c("user-agent", ""), new C8477c("vary", ""), new C8477c("via", ""), new C8477c("www-authenticate", "")};
        f39590b = c8478d.m36404d();
    }

    @NotNull
    /* renamed from: a */
    public final C9764h m36401a(@NotNull C9764h c9764h) {
        C9367f.m39526e(c9764h, "name");
        int size = c9764h.size();
        for (int i10 = 0; i10 < size; i10++) {
            byte b10 = (byte) 65;
            byte b11 = (byte) 90;
            byte m41193i = c9764h.m41193i(i10);
            if (b10 <= m41193i && b11 >= m41193i) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c9764h.m41188D());
            }
        }
        return c9764h;
    }

    @NotNull
    /* renamed from: b */
    public final Map<C9764h, Integer> m36402b() {
        return f39590b;
    }

    @NotNull
    /* renamed from: c */
    public final C8477c[] m36403c() {
        return f39589a;
    }

    /* renamed from: d */
    public final Map<C9764h, Integer> m36404d() {
        C8477c[] c8477cArr = f39589a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c8477cArr.length);
        int length = c8477cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            C8477c[] c8477cArr2 = f39589a;
            if (!linkedHashMap.containsKey(c8477cArr2[i10].f39587b)) {
                linkedHashMap.put(c8477cArr2[i10].f39587b, Integer.valueOf(i10));
            }
        }
        Map<C9764h, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C9367f.m39525d(unmodifiableMap, "Collections.unmodifiableMap(result)");
        return unmodifiableMap;
    }
}
