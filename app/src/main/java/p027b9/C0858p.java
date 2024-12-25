package p027b9;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import p059d9.C4349a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/p.class
 */
/* renamed from: b9.p */
/* loaded from: combined.jar:classes2.jar:b9/p.class */
public final class C0858p {

    /* renamed from: a */
    public final Uri f5847a;

    /* renamed from: b */
    public final long f5848b;

    /* renamed from: c */
    public final int f5849c;

    /* renamed from: d */
    public final byte[] f5850d;

    /* renamed from: e */
    public final Map<String, String> f5851e;

    /* renamed from: f */
    @Deprecated
    public final long f5852f;

    /* renamed from: g */
    public final long f5853g;

    /* renamed from: h */
    public final long f5854h;

    /* renamed from: i */
    public final String f5855i;

    /* renamed from: j */
    public final int f5856j;

    /* renamed from: k */
    public final Object f5857k;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/p$b.class
     */
    /* renamed from: b9.p$b */
    /* loaded from: combined.jar:classes2.jar:b9/p$b.class */
    public static final class b {

        /* renamed from: a */
        public Uri f5858a;

        /* renamed from: b */
        public long f5859b;

        /* renamed from: c */
        public int f5860c;

        /* renamed from: d */
        public byte[] f5861d;

        /* renamed from: e */
        public Map<String, String> f5862e;

        /* renamed from: f */
        public long f5863f;

        /* renamed from: g */
        public long f5864g;

        /* renamed from: h */
        public String f5865h;

        /* renamed from: i */
        public int f5866i;

        /* renamed from: j */
        public Object f5867j;

        public b() {
            this.f5860c = 1;
            this.f5862e = Collections.emptyMap();
            this.f5864g = -1L;
        }

        public b(C0858p c0858p) {
            this.f5858a = c0858p.f5847a;
            this.f5859b = c0858p.f5848b;
            this.f5860c = c0858p.f5849c;
            this.f5861d = c0858p.f5850d;
            this.f5862e = c0858p.f5851e;
            this.f5863f = c0858p.f5853g;
            this.f5864g = c0858p.f5854h;
            this.f5865h = c0858p.f5855i;
            this.f5866i = c0858p.f5856j;
            this.f5867j = c0858p.f5857k;
        }

        /* renamed from: a */
        public C0858p m5383a() {
            C4349a.m21887j(this.f5858a, "The uri must be set.");
            return new C0858p(this.f5858a, this.f5859b, this.f5860c, this.f5861d, this.f5862e, this.f5863f, this.f5864g, this.f5865h, this.f5866i, this.f5867j);
        }

        /* renamed from: b */
        public b m5384b(int i10) {
            this.f5866i = i10;
            return this;
        }

        /* renamed from: c */
        public b m5385c(byte[] bArr) {
            this.f5861d = bArr;
            return this;
        }

        /* renamed from: d */
        public b m5386d(int i10) {
            this.f5860c = i10;
            return this;
        }

        /* renamed from: e */
        public b m5387e(Map<String, String> map) {
            this.f5862e = map;
            return this;
        }

        /* renamed from: f */
        public b m5388f(String str) {
            this.f5865h = str;
            return this;
        }

        /* renamed from: g */
        public b m5389g(long j10) {
            this.f5864g = j10;
            return this;
        }

        /* renamed from: h */
        public b m5390h(long j10) {
            this.f5863f = j10;
            return this;
        }

        /* renamed from: i */
        public b m5391i(Uri uri) {
            this.f5858a = uri;
            return this;
        }

        /* renamed from: j */
        public b m5392j(String str) {
            this.f5858a = Uri.parse(str);
            return this;
        }

        /* renamed from: k */
        public b m5393k(long j10) {
            this.f5859b = j10;
            return this;
        }
    }

    public C0858p(Uri uri) {
        this(uri, 0L, -1L);
    }

    public C0858p(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        long j13 = j10 + j11;
        C4349a.m21878a(j13 >= 0);
        C4349a.m21878a(j11 >= 0);
        C4349a.m21878a(j12 <= 0 ? j12 == -1 : true);
        this.f5847a = uri;
        this.f5848b = j10;
        this.f5849c = i10;
        this.f5850d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f5851e = Collections.unmodifiableMap(new HashMap(map));
        this.f5853g = j11;
        this.f5852f = j13;
        this.f5854h = j12;
        this.f5855i = str;
        this.f5856j = i11;
        this.f5857k = obj;
    }

    public C0858p(Uri uri, long j10, long j11) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j10, j11, null, 0, null);
    }

    /* renamed from: c */
    public static String m5376c(int i10) {
        if (i10 == 1) {
            return HttpGet.METHOD_NAME;
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return HttpHead.METHOD_NAME;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public b m5377a() {
        return new b();
    }

    /* renamed from: b */
    public final String m5378b() {
        return m5376c(this.f5849c);
    }

    /* renamed from: d */
    public boolean m5379d(int i10) {
        return (this.f5856j & i10) == i10;
    }

    /* renamed from: e */
    public C0858p m5380e(long j10) {
        long j11 = this.f5854h;
        long j12 = -1;
        if (j11 != -1) {
            j12 = j11 - j10;
        }
        return m5381f(j10, j12);
    }

    /* renamed from: f */
    public C0858p m5381f(long j10, long j11) {
        return (j10 == 0 && this.f5854h == j11) ? this : new C0858p(this.f5847a, this.f5848b, this.f5849c, this.f5850d, this.f5851e, this.f5853g + j10, j11, this.f5855i, this.f5856j, this.f5857k);
    }

    /* renamed from: g */
    public C0858p m5382g(Uri uri) {
        return new C0858p(uri, this.f5848b, this.f5849c, this.f5850d, this.f5851e, this.f5853g, this.f5854h, this.f5855i, this.f5856j, this.f5857k);
    }

    public String toString() {
        return "DataSpec[" + m5378b() + " " + this.f5847a + ", " + this.f5853g + ", " + this.f5854h + ", " + this.f5855i + ", " + this.f5856j + "]";
    }
}
