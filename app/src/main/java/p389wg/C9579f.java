package p389wg;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.ClientCookie;
import p411xi.C9761e;
import p411xi.C9764h;
import p411xi.C9772p;
import p411xi.InterfaceC9756b0;
import p411xi.InterfaceC9763g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wg/f.class
 */
/* renamed from: wg.f */
/* loaded from: combined.jar:classes2.jar:wg/f.class */
public final class C9579f {

    /* renamed from: a */
    public static final C9577d[] f43611a;

    /* renamed from: b */
    public static final Map<C9764h, Integer> f43612b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/f$a.class
     */
    /* renamed from: wg.f$a */
    /* loaded from: combined.jar:classes2.jar:wg/f$a.class */
    public static final class a {

        /* renamed from: b */
        public final InterfaceC9763g f43614b;

        /* renamed from: c */
        public int f43615c;

        /* renamed from: d */
        public int f43616d;

        /* renamed from: e */
        public C9577d[] f43617e;

        /* renamed from: f */
        public int f43618f;

        /* renamed from: a */
        public final List<C9577d> f43613a = new ArrayList();

        /* renamed from: g */
        public int f43619g = 0;

        /* renamed from: h */
        public int f43620h = 0;

        public a(int i10, InterfaceC9756b0 interfaceC9756b0) {
            C9577d[] c9577dArr = new C9577d[8];
            this.f43617e = c9577dArr;
            this.f43618f = c9577dArr.length - 1;
            this.f43615c = i10;
            this.f43616d = i10;
            this.f43614b = C9772p.m41229c(interfaceC9756b0);
        }

        /* renamed from: a */
        public final void m40208a() {
            int i10 = this.f43616d;
            int i11 = this.f43620h;
            if (i10 < i11) {
                if (i10 == 0) {
                    m40209b();
                } else {
                    m40210c(i11 - i10);
                }
            }
        }

        /* renamed from: b */
        public final void m40209b() {
            this.f43613a.clear();
            Arrays.fill(this.f43617e, (Object) null);
            this.f43618f = this.f43617e.length - 1;
            this.f43619g = 0;
            this.f43620h = 0;
        }

        /* renamed from: c */
        public final int m40210c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f43617e.length - 1;
                int i13 = i10;
                int i14 = 0;
                while (true) {
                    i11 = this.f43618f;
                    if (length < i11 || i13 <= 0) {
                        break;
                    }
                    int i15 = this.f43617e[length].f43610c;
                    i13 -= i15;
                    this.f43620h -= i15;
                    this.f43619g--;
                    i14++;
                    length--;
                }
                C9577d[] c9577dArr = this.f43617e;
                System.arraycopy(c9577dArr, i11 + 1, c9577dArr, i11 + 1 + i14, this.f43619g);
                this.f43618f += i14;
                i12 = i14;
            }
            return i12;
        }

        /* renamed from: d */
        public List<C9577d> m40211d() {
            ArrayList arrayList = new ArrayList(this.f43613a);
            this.f43613a.clear();
            return arrayList;
        }

        /* renamed from: e */
        public final C9764h m40212e(int i10) {
            return (m40215h(i10) ? C9579f.f43611a[i10] : this.f43617e[m40213f(i10 - C9579f.f43611a.length)]).f43608a;
        }

        /* renamed from: f */
        public final int m40213f(int i10) {
            return this.f43618f + 1 + i10;
        }

        /* renamed from: g */
        public final void m40214g(int i10, C9577d c9577d) {
            this.f43613a.add(c9577d);
            int i11 = c9577d.f43610c;
            int i12 = i11;
            if (i10 != -1) {
                i12 = i11 - this.f43617e[m40213f(i10)].f43610c;
            }
            int i13 = this.f43616d;
            if (i12 > i13) {
                m40209b();
                return;
            }
            int m40210c = m40210c((this.f43620h + i12) - i13);
            if (i10 == -1) {
                int i14 = this.f43619g;
                C9577d[] c9577dArr = this.f43617e;
                if (i14 + 1 > c9577dArr.length) {
                    C9577d[] c9577dArr2 = new C9577d[c9577dArr.length * 2];
                    System.arraycopy(c9577dArr, 0, c9577dArr2, c9577dArr.length, c9577dArr.length);
                    this.f43618f = this.f43617e.length - 1;
                    this.f43617e = c9577dArr2;
                }
                int i15 = this.f43618f;
                this.f43618f = i15 - 1;
                this.f43617e[i15] = c9577d;
                this.f43619g++;
            } else {
                this.f43617e[i10 + m40213f(i10) + m40210c] = c9577d;
            }
            this.f43620h += i12;
        }

        /* renamed from: h */
        public final boolean m40215h(int i10) {
            boolean z10 = true;
            if (i10 < 0 || i10 > C9579f.f43611a.length - 1) {
                z10 = false;
            }
            return z10;
        }

        /* renamed from: i */
        public void m40216i(int i10) {
            this.f43615c = i10;
            this.f43616d = i10;
            m40208a();
        }

        /* renamed from: j */
        public final int m40217j() {
            return this.f43614b.readByte() & 255;
        }

        /* renamed from: k */
        public C9764h m40218k() {
            int m40217j = m40217j();
            boolean z10 = (m40217j & 128) == 128;
            int m40221n = m40221n(m40217j, 127);
            return z10 ? C9764h.m41184t(C9581h.m40260d().m40263c(this.f43614b.mo41145W(m40221n))) : this.f43614b.mo41159g0(m40221n);
        }

        /* renamed from: l */
        public void m40219l() {
            while (!this.f43614b.mo41164k0()) {
                int readByte = this.f43614b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & 128) == 128) {
                    m40220m(m40221n(readByte, 127) - 1);
                } else if (readByte == 64) {
                    m40223p();
                } else if ((readByte & 64) == 64) {
                    m40222o(m40221n(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int m40221n = m40221n(readByte, 31);
                    this.f43616d = m40221n;
                    if (m40221n < 0 || m40221n > this.f43615c) {
                        throw new IOException("Invalid header table byte count " + this.f43616d);
                    }
                    m40208a();
                } else if (readByte == 16 || readByte == 0) {
                    m40225r();
                } else {
                    m40224q(m40221n(readByte, 15) - 1);
                }
            }
        }

        /* renamed from: m */
        public final void m40220m(int i10) {
            if (m40215h(i10)) {
                this.f43613a.add(C9579f.f43611a[i10]);
                return;
            }
            int m40213f = m40213f(i10 - C9579f.f43611a.length);
            if (m40213f >= 0) {
                C9577d[] c9577dArr = this.f43617e;
                if (m40213f <= c9577dArr.length - 1) {
                    this.f43613a.add(c9577dArr[m40213f]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        /* renamed from: n */
        public int m40221n(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int m40217j = m40217j();
                if ((m40217j & 128) == 0) {
                    return i11 + (m40217j << i13);
                }
                i11 += (m40217j & 127) << i13;
                i13 += 7;
            }
        }

        /* renamed from: o */
        public final void m40222o(int i10) {
            m40214g(-1, new C9577d(m40212e(i10), m40218k()));
        }

        /* renamed from: p */
        public final void m40223p() {
            m40214g(-1, new C9577d(C9579f.m40206d(m40218k()), m40218k()));
        }

        /* renamed from: q */
        public final void m40224q(int i10) {
            this.f43613a.add(new C9577d(m40212e(i10), m40218k()));
        }

        /* renamed from: r */
        public final void m40225r() {
            this.f43613a.add(new C9577d(C9579f.m40206d(m40218k()), m40218k()));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/f$b.class
     */
    /* renamed from: wg.f$b */
    /* loaded from: combined.jar:classes2.jar:wg/f$b.class */
    public static final class b {

        /* renamed from: a */
        public final C9761e f43621a;

        public b(C9761e c9761e) {
            this.f43621a = c9761e;
        }

        /* renamed from: a */
        public void m40226a(C9764h c9764h) {
            m40228c(c9764h.size(), 127, 0);
            this.f43621a.mo41162i0(c9764h);
        }

        /* renamed from: b */
        public void m40227b(List<C9577d> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                C9764h mo41186B = list.get(i10).f43608a.mo41186B();
                Integer num = (Integer) C9579f.f43612b.get(mo41186B);
                if (num != null) {
                    m40228c(num.intValue() + 1, 15, 0);
                } else {
                    this.f43621a.writeByte(0);
                    m40226a(mo41186B);
                }
                m40226a(list.get(i10).f43609b);
            }
        }

        /* renamed from: c */
        public void m40228c(int i10, int i11, int i12) {
            int i13;
            C9761e c9761e;
            if (i10 < i11) {
                c9761e = this.f43621a;
                i13 = i10 | i12;
            } else {
                this.f43621a.writeByte(i12 | i11);
                int i14 = i10 - i11;
                while (true) {
                    i13 = i14;
                    if (i13 < 128) {
                        break;
                    }
                    this.f43621a.writeByte(128 | (i13 & 127));
                    i14 = i13 >>> 7;
                }
                c9761e = this.f43621a;
            }
            c9761e.writeByte(i13);
        }
    }

    static {
        C9577d c9577d = new C9577d(C9577d.f43605h, "");
        C9764h c9764h = C9577d.f43602e;
        C9577d c9577d2 = new C9577d(c9764h, HttpGet.METHOD_NAME);
        C9577d c9577d3 = new C9577d(c9764h, "POST");
        C9764h c9764h2 = C9577d.f43603f;
        C9577d c9577d4 = new C9577d(c9764h2, "/");
        C9577d c9577d5 = new C9577d(c9764h2, "/index.html");
        C9764h c9764h3 = C9577d.f43604g;
        C9577d c9577d6 = new C9577d(c9764h3, HttpHost.DEFAULT_SCHEME_NAME);
        C9577d c9577d7 = new C9577d(c9764h3, ClientConstants.DOMAIN_SCHEME);
        C9764h c9764h4 = C9577d.f43601d;
        f43611a = new C9577d[]{c9577d, c9577d2, c9577d3, c9577d4, c9577d5, c9577d6, c9577d7, new C9577d(c9764h4, "200"), new C9577d(c9764h4, "204"), new C9577d(c9764h4, "206"), new C9577d(c9764h4, "304"), new C9577d(c9764h4, "400"), new C9577d(c9764h4, "404"), new C9577d(c9764h4, "500"), new C9577d("accept-charset", ""), new C9577d("accept-encoding", "gzip, deflate"), new C9577d("accept-language", ""), new C9577d("accept-ranges", ""), new C9577d("accept", ""), new C9577d("access-control-allow-origin", ""), new C9577d("age", ""), new C9577d("allow", ""), new C9577d("authorization", ""), new C9577d("cache-control", ""), new C9577d("content-disposition", ""), new C9577d("content-encoding", ""), new C9577d("content-language", ""), new C9577d("content-length", ""), new C9577d("content-location", ""), new C9577d("content-range", ""), new C9577d("content-type", ""), new C9577d("cookie", ""), new C9577d("date", ""), new C9577d(TransferTable.COLUMN_ETAG, ""), new C9577d("expect", ""), new C9577d(ClientCookie.EXPIRES_ATTR, ""), new C9577d("from", ""), new C9577d("host", ""), new C9577d("if-match", ""), new C9577d("if-modified-since", ""), new C9577d("if-none-match", ""), new C9577d("if-range", ""), new C9577d("if-unmodified-since", ""), new C9577d("last-modified", ""), new C9577d("link", ""), new C9577d("location", ""), new C9577d("max-forwards", ""), new C9577d("proxy-authenticate", ""), new C9577d("proxy-authorization", ""), new C9577d("range", ""), new C9577d("referer", ""), new C9577d("refresh", ""), new C9577d("retry-after", ""), new C9577d("server", ""), new C9577d("set-cookie", ""), new C9577d("strict-transport-security", ""), new C9577d("transfer-encoding", ""), new C9577d("user-agent", ""), new C9577d("vary", ""), new C9577d("via", ""), new C9577d("www-authenticate", "")};
        f43612b = m40207e();
    }

    /* renamed from: d */
    public static C9764h m40206d(C9764h c9764h) {
        int size = c9764h.size();
        for (int i10 = 0; i10 < size; i10++) {
            byte m41193i = c9764h.m41193i(i10);
            if (m41193i >= 65 && m41193i <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c9764h.m41188D());
            }
        }
        return c9764h;
    }

    /* renamed from: e */
    public static Map<C9764h, Integer> m40207e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f43611a.length);
        int i10 = 0;
        while (true) {
            C9577d[] c9577dArr = f43611a;
            if (i10 >= c9577dArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(c9577dArr[i10].f43608a)) {
                linkedHashMap.put(c9577dArr[i10].f43608a, Integer.valueOf(i10));
            }
            i10++;
        }
    }
}
