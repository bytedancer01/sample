package p267p6;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p059d9.C4349a;
import p059d9.C4401z0;
import p420y7.C9858i0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/b1.class
 */
/* renamed from: p6.b1 */
/* loaded from: combined.jar:classes2.jar:p6/b1.class */
public final class C7561b1 {

    /* renamed from: f */
    public static final C7561b1 f36446f = new c().m32350a();

    /* renamed from: g */
    public static final InterfaceC7579g<C7561b1> f36447g = new C7604o();

    /* renamed from: a */
    public final String f36448a;

    /* renamed from: b */
    public final g f36449b;

    /* renamed from: c */
    public final f f36450c;

    /* renamed from: d */
    public final C7565c1 f36451d;

    /* renamed from: e */
    public final d f36452e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/b1$b.class
     */
    /* renamed from: p6.b1$b */
    /* loaded from: combined.jar:classes2.jar:p6/b1$b.class */
    public static final class b {

        /* renamed from: a */
        public final Uri f36453a;

        /* renamed from: b */
        public final Object f36454b;

        public b(Uri uri, Object obj) {
            this.f36453a = uri;
            this.f36454b = obj;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f36453a.equals(bVar.f36453a) || !C4401z0.m22371c(this.f36454b, bVar.f36454b)) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            int hashCode = this.f36453a.hashCode();
            Object obj = this.f36454b;
            return (hashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/b1$c.class
     */
    /* renamed from: p6.b1$c */
    /* loaded from: combined.jar:classes2.jar:p6/b1$c.class */
    public static final class c {

        /* renamed from: A */
        public float f36455A;

        /* renamed from: B */
        public float f36456B;

        /* renamed from: a */
        public String f36457a;

        /* renamed from: b */
        public Uri f36458b;

        /* renamed from: c */
        public String f36459c;

        /* renamed from: d */
        public long f36460d;

        /* renamed from: e */
        public long f36461e;

        /* renamed from: f */
        public boolean f36462f;

        /* renamed from: g */
        public boolean f36463g;

        /* renamed from: h */
        public boolean f36464h;

        /* renamed from: i */
        public Uri f36465i;

        /* renamed from: j */
        public Map<String, String> f36466j;

        /* renamed from: k */
        public UUID f36467k;

        /* renamed from: l */
        public boolean f36468l;

        /* renamed from: m */
        public boolean f36469m;

        /* renamed from: n */
        public boolean f36470n;

        /* renamed from: o */
        public List<Integer> f36471o;

        /* renamed from: p */
        public byte[] f36472p;

        /* renamed from: q */
        public List<C9858i0> f36473q;

        /* renamed from: r */
        public String f36474r;

        /* renamed from: s */
        public List<h> f36475s;

        /* renamed from: t */
        public Uri f36476t;

        /* renamed from: u */
        public Object f36477u;

        /* renamed from: v */
        public Object f36478v;

        /* renamed from: w */
        public C7565c1 f36479w;

        /* renamed from: x */
        public long f36480x;

        /* renamed from: y */
        public long f36481y;

        /* renamed from: z */
        public long f36482z;

        public c() {
            this.f36461e = Long.MIN_VALUE;
            this.f36471o = Collections.emptyList();
            this.f36466j = Collections.emptyMap();
            this.f36473q = Collections.emptyList();
            this.f36475s = Collections.emptyList();
            this.f36480x = -9223372036854775807L;
            this.f36481y = -9223372036854775807L;
            this.f36482z = -9223372036854775807L;
            this.f36455A = -3.4028235E38f;
            this.f36456B = -3.4028235E38f;
        }

        public c(C7561b1 c7561b1) {
            this();
            d dVar = c7561b1.f36452e;
            this.f36461e = dVar.f36485b;
            this.f36462f = dVar.f36486c;
            this.f36463g = dVar.f36487d;
            this.f36460d = dVar.f36484a;
            this.f36464h = dVar.f36488e;
            this.f36457a = c7561b1.f36448a;
            this.f36479w = c7561b1.f36451d;
            f fVar = c7561b1.f36450c;
            this.f36480x = fVar.f36499a;
            this.f36481y = fVar.f36500b;
            this.f36482z = fVar.f36501c;
            this.f36455A = fVar.f36502d;
            this.f36456B = fVar.f36503e;
            g gVar = c7561b1.f36449b;
            if (gVar != null) {
                this.f36474r = gVar.f36509f;
                this.f36459c = gVar.f36505b;
                this.f36458b = gVar.f36504a;
                this.f36473q = gVar.f36508e;
                this.f36475s = gVar.f36510g;
                this.f36478v = gVar.f36511h;
                e eVar = gVar.f36506c;
                if (eVar != null) {
                    this.f36465i = eVar.f36490b;
                    this.f36466j = eVar.f36491c;
                    this.f36468l = eVar.f36492d;
                    this.f36470n = eVar.f36494f;
                    this.f36469m = eVar.f36493e;
                    this.f36471o = eVar.f36495g;
                    this.f36467k = eVar.f36489a;
                    this.f36472p = eVar.m32376a();
                }
                b bVar = gVar.f36507d;
                if (bVar != null) {
                    this.f36476t = bVar.f36453a;
                    this.f36477u = bVar.f36454b;
                }
            }
        }

        /* renamed from: A */
        public c m32347A(Object obj) {
            this.f36478v = obj;
            return this;
        }

        /* renamed from: B */
        public c m32348B(Uri uri) {
            this.f36458b = uri;
            return this;
        }

        /* renamed from: C */
        public c m32349C(String str) {
            return m32348B(str == null ? null : Uri.parse(str));
        }

        /* renamed from: a */
        public C7561b1 m32350a() {
            g gVar;
            C4349a.m21884g(this.f36465i == null || this.f36467k != null);
            Uri uri = this.f36458b;
            if (uri != null) {
                String str = this.f36459c;
                UUID uuid = this.f36467k;
                e eVar = uuid != null ? new e(uuid, this.f36465i, this.f36466j, this.f36468l, this.f36470n, this.f36469m, this.f36471o, this.f36472p) : null;
                Uri uri2 = this.f36476t;
                gVar = new g(uri, str, eVar, uri2 != null ? new b(uri2, this.f36477u) : null, this.f36473q, this.f36474r, this.f36475s, this.f36478v);
            } else {
                gVar = null;
            }
            String str2 = this.f36457a;
            if (str2 == null) {
                str2 = "";
            }
            d dVar = new d(this.f36460d, this.f36461e, this.f36462f, this.f36463g, this.f36464h);
            f fVar = new f(this.f36480x, this.f36481y, this.f36482z, this.f36455A, this.f36456B);
            C7565c1 c7565c1 = this.f36479w;
            if (c7565c1 == null) {
                c7565c1 = C7565c1.f36596E;
            }
            return new C7561b1(str2, dVar, gVar, fVar, c7565c1);
        }

        /* renamed from: b */
        public c m32351b(Uri uri) {
            return m32352c(uri, null);
        }

        /* renamed from: c */
        public c m32352c(Uri uri, Object obj) {
            this.f36476t = uri;
            this.f36477u = obj;
            return this;
        }

        /* renamed from: d */
        public c m32353d(String str) {
            return m32351b(str != null ? Uri.parse(str) : null);
        }

        /* renamed from: e */
        public c m32354e(long j10) {
            C4349a.m21878a(j10 == Long.MIN_VALUE || j10 >= 0);
            this.f36461e = j10;
            return this;
        }

        /* renamed from: f */
        public c m32355f(long j10) {
            C4349a.m21878a(j10 >= 0);
            this.f36460d = j10;
            return this;
        }

        /* renamed from: g */
        public c m32356g(String str) {
            this.f36474r = str;
            return this;
        }

        /* renamed from: h */
        public c m32357h(boolean z10) {
            this.f36470n = z10;
            return this;
        }

        /* renamed from: i */
        public c m32358i(byte[] bArr) {
            this.f36472p = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
            return this;
        }

        /* renamed from: j */
        public c m32359j(Map<String, String> map) {
            this.f36466j = (map == null || map.isEmpty()) ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(map));
            return this;
        }

        /* renamed from: k */
        public c m32360k(Uri uri) {
            this.f36465i = uri;
            return this;
        }

        /* renamed from: l */
        public c m32361l(String str) {
            this.f36465i = str == null ? null : Uri.parse(str);
            return this;
        }

        /* renamed from: m */
        public c m32362m(boolean z10) {
            this.f36468l = z10;
            return this;
        }

        /* renamed from: n */
        public c m32363n(boolean z10) {
            this.f36469m = z10;
            return this;
        }

        /* renamed from: o */
        public c m32364o(List<Integer> list) {
            this.f36471o = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        /* renamed from: p */
        public c m32365p(UUID uuid) {
            this.f36467k = uuid;
            return this;
        }

        /* renamed from: q */
        public c m32366q(long j10) {
            this.f36482z = j10;
            return this;
        }

        /* renamed from: r */
        public c m32367r(float f10) {
            this.f36456B = f10;
            return this;
        }

        /* renamed from: s */
        public c m32368s(long j10) {
            this.f36481y = j10;
            return this;
        }

        /* renamed from: t */
        public c m32369t(float f10) {
            this.f36455A = f10;
            return this;
        }

        /* renamed from: u */
        public c m32370u(long j10) {
            this.f36480x = j10;
            return this;
        }

        /* renamed from: v */
        public c m32371v(String str) {
            this.f36457a = (String) C4349a.m21882e(str);
            return this;
        }

        /* renamed from: w */
        public c m32372w(C7565c1 c7565c1) {
            this.f36479w = c7565c1;
            return this;
        }

        /* renamed from: x */
        public c m32373x(String str) {
            this.f36459c = str;
            return this;
        }

        /* renamed from: y */
        public c m32374y(List<C9858i0> list) {
            this.f36473q = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        /* renamed from: z */
        public c m32375z(List<h> list) {
            this.f36475s = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/b1$d.class
     */
    /* renamed from: p6.b1$d */
    /* loaded from: combined.jar:classes2.jar:p6/b1$d.class */
    public static final class d {

        /* renamed from: f */
        public static final InterfaceC7579g<d> f36483f = new C7604o();

        /* renamed from: a */
        public final long f36484a;

        /* renamed from: b */
        public final long f36485b;

        /* renamed from: c */
        public final boolean f36486c;

        /* renamed from: d */
        public final boolean f36487d;

        /* renamed from: e */
        public final boolean f36488e;

        public d(long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f36484a = j10;
            this.f36485b = j11;
            this.f36486c = z10;
            this.f36487d = z11;
            this.f36488e = z12;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f36484a != dVar.f36484a || this.f36485b != dVar.f36485b || this.f36486c != dVar.f36486c || this.f36487d != dVar.f36487d || this.f36488e != dVar.f36488e) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            long j10 = this.f36484a;
            int i10 = (int) (j10 ^ (j10 >>> 32));
            long j11 = this.f36485b;
            return (((((((i10 * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f36486c ? 1 : 0)) * 31) + (this.f36487d ? 1 : 0)) * 31) + (this.f36488e ? 1 : 0);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/b1$e.class
     */
    /* renamed from: p6.b1$e */
    /* loaded from: combined.jar:classes2.jar:p6/b1$e.class */
    public static final class e {

        /* renamed from: a */
        public final UUID f36489a;

        /* renamed from: b */
        public final Uri f36490b;

        /* renamed from: c */
        public final Map<String, String> f36491c;

        /* renamed from: d */
        public final boolean f36492d;

        /* renamed from: e */
        public final boolean f36493e;

        /* renamed from: f */
        public final boolean f36494f;

        /* renamed from: g */
        public final List<Integer> f36495g;

        /* renamed from: h */
        public final byte[] f36496h;

        public e(UUID uuid, Uri uri, Map<String, String> map, boolean z10, boolean z11, boolean z12, List<Integer> list, byte[] bArr) {
            C4349a.m21878a((z11 && uri == null) ? false : true);
            this.f36489a = uuid;
            this.f36490b = uri;
            this.f36491c = map;
            this.f36492d = z10;
            this.f36494f = z11;
            this.f36493e = z12;
            this.f36495g = list;
            this.f36496h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }

        /* renamed from: a */
        public byte[] m32376a() {
            byte[] bArr = this.f36496h;
            return bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (!this.f36489a.equals(eVar.f36489a) || !C4401z0.m22371c(this.f36490b, eVar.f36490b) || !C4401z0.m22371c(this.f36491c, eVar.f36491c) || this.f36492d != eVar.f36492d || this.f36494f != eVar.f36494f || this.f36493e != eVar.f36493e || !this.f36495g.equals(eVar.f36495g) || !Arrays.equals(this.f36496h, eVar.f36496h)) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            int hashCode = this.f36489a.hashCode();
            Uri uri = this.f36490b;
            return (((((((((((((hashCode * 31) + (uri != null ? uri.hashCode() : 0)) * 31) + this.f36491c.hashCode()) * 31) + (this.f36492d ? 1 : 0)) * 31) + (this.f36494f ? 1 : 0)) * 31) + (this.f36493e ? 1 : 0)) * 31) + this.f36495g.hashCode()) * 31) + Arrays.hashCode(this.f36496h);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/b1$f.class
     */
    /* renamed from: p6.b1$f */
    /* loaded from: combined.jar:classes2.jar:p6/b1$f.class */
    public static final class f {

        /* renamed from: f */
        public static final f f36497f = new f(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

        /* renamed from: g */
        public static final InterfaceC7579g<f> f36498g = new C7604o();

        /* renamed from: a */
        public final long f36499a;

        /* renamed from: b */
        public final long f36500b;

        /* renamed from: c */
        public final long f36501c;

        /* renamed from: d */
        public final float f36502d;

        /* renamed from: e */
        public final float f36503e;

        public f(long j10, long j11, long j12, float f10, float f11) {
            this.f36499a = j10;
            this.f36500b = j11;
            this.f36501c = j12;
            this.f36502d = f10;
            this.f36503e = f11;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (this.f36499a != fVar.f36499a || this.f36500b != fVar.f36500b || this.f36501c != fVar.f36501c || this.f36502d != fVar.f36502d || this.f36503e != fVar.f36503e) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            long j10 = this.f36499a;
            int i10 = (int) (j10 ^ (j10 >>> 32));
            long j11 = this.f36500b;
            int i11 = (int) (j11 ^ (j11 >>> 32));
            long j12 = this.f36501c;
            int i12 = (int) (j12 ^ (j12 >>> 32));
            float f10 = this.f36502d;
            int i13 = 0;
            int floatToIntBits = f10 != 0.0f ? Float.floatToIntBits(f10) : 0;
            float f11 = this.f36503e;
            if (f11 != 0.0f) {
                i13 = Float.floatToIntBits(f11);
            }
            return (((((((i10 * 31) + i11) * 31) + i12) * 31) + floatToIntBits) * 31) + i13;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/b1$g.class
     */
    /* renamed from: p6.b1$g */
    /* loaded from: combined.jar:classes2.jar:p6/b1$g.class */
    public static final class g {

        /* renamed from: a */
        public final Uri f36504a;

        /* renamed from: b */
        public final String f36505b;

        /* renamed from: c */
        public final e f36506c;

        /* renamed from: d */
        public final b f36507d;

        /* renamed from: e */
        public final List<C9858i0> f36508e;

        /* renamed from: f */
        public final String f36509f;

        /* renamed from: g */
        public final List<h> f36510g;

        /* renamed from: h */
        public final Object f36511h;

        public g(Uri uri, String str, e eVar, b bVar, List<C9858i0> list, String str2, List<h> list2, Object obj) {
            this.f36504a = uri;
            this.f36505b = str;
            this.f36506c = eVar;
            this.f36507d = bVar;
            this.f36508e = list;
            this.f36509f = str2;
            this.f36510g = list2;
            this.f36511h = obj;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (!this.f36504a.equals(gVar.f36504a) || !C4401z0.m22371c(this.f36505b, gVar.f36505b) || !C4401z0.m22371c(this.f36506c, gVar.f36506c) || !C4401z0.m22371c(this.f36507d, gVar.f36507d) || !this.f36508e.equals(gVar.f36508e) || !C4401z0.m22371c(this.f36509f, gVar.f36509f) || !this.f36510g.equals(gVar.f36510g) || !C4401z0.m22371c(this.f36511h, gVar.f36511h)) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            int hashCode = this.f36504a.hashCode();
            String str = this.f36505b;
            int i10 = 0;
            int hashCode2 = str == null ? 0 : str.hashCode();
            e eVar = this.f36506c;
            int hashCode3 = eVar == null ? 0 : eVar.hashCode();
            b bVar = this.f36507d;
            int hashCode4 = bVar == null ? 0 : bVar.hashCode();
            int hashCode5 = this.f36508e.hashCode();
            String str2 = this.f36509f;
            int hashCode6 = str2 == null ? 0 : str2.hashCode();
            int hashCode7 = this.f36510g.hashCode();
            Object obj = this.f36511h;
            if (obj != null) {
                i10 = obj.hashCode();
            }
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/b1$h.class
     */
    /* renamed from: p6.b1$h */
    /* loaded from: combined.jar:classes2.jar:p6/b1$h.class */
    public static final class h {

        /* renamed from: a */
        public final Uri f36512a;

        /* renamed from: b */
        public final String f36513b;

        /* renamed from: c */
        public final String f36514c;

        /* renamed from: d */
        public final int f36515d;

        /* renamed from: e */
        public final int f36516e;

        /* renamed from: f */
        public final String f36517f;

        public h(Uri uri, String str, String str2) {
            this(uri, str, str2, 0);
        }

        public h(Uri uri, String str, String str2, int i10) {
            this(uri, str, str2, i10, 0, null);
        }

        public h(Uri uri, String str, String str2, int i10, int i11, String str3) {
            this.f36512a = uri;
            this.f36513b = str;
            this.f36514c = str2;
            this.f36515d = i10;
            this.f36516e = i11;
            this.f36517f = str3;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (!this.f36512a.equals(hVar.f36512a) || !this.f36513b.equals(hVar.f36513b) || !C4401z0.m22371c(this.f36514c, hVar.f36514c) || this.f36515d != hVar.f36515d || this.f36516e != hVar.f36516e || !C4401z0.m22371c(this.f36517f, hVar.f36517f)) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            int hashCode = this.f36512a.hashCode();
            int hashCode2 = this.f36513b.hashCode();
            String str = this.f36514c;
            int i10 = 0;
            int hashCode3 = str == null ? 0 : str.hashCode();
            int i11 = this.f36515d;
            int i12 = this.f36516e;
            String str2 = this.f36517f;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i11) * 31) + i12) * 31) + i10;
        }
    }

    public C7561b1(String str, d dVar, g gVar, f fVar, C7565c1 c7565c1) {
        this.f36448a = str;
        this.f36449b = gVar;
        this.f36450c = fVar;
        this.f36451d = c7565c1;
        this.f36452e = dVar;
    }

    /* renamed from: b */
    public static C7561b1 m32344b(Uri uri) {
        return new c().m32348B(uri).m32350a();
    }

    /* renamed from: c */
    public static C7561b1 m32345c(String str) {
        return new c().m32349C(str).m32350a();
    }

    /* renamed from: a */
    public c m32346a() {
        return new c();
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7561b1)) {
            return false;
        }
        C7561b1 c7561b1 = (C7561b1) obj;
        if (!C4401z0.m22371c(this.f36448a, c7561b1.f36448a) || !this.f36452e.equals(c7561b1.f36452e) || !C4401z0.m22371c(this.f36449b, c7561b1.f36449b) || !C4401z0.m22371c(this.f36450c, c7561b1.f36450c) || !C4401z0.m22371c(this.f36451d, c7561b1.f36451d)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        int hashCode = this.f36448a.hashCode();
        g gVar = this.f36449b;
        return (((((((hashCode * 31) + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.f36450c.hashCode()) * 31) + this.f36452e.hashCode()) * 31) + this.f36451d.hashCode();
    }
}
