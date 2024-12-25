package p267p6;

import android.net.Uri;
import android.util.Pair;
import p026b8.C0820a;
import p059d9.C4349a;
import p059d9.C4401z0;
import p267p6.C7561b1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/e2.class
 */
/* renamed from: p6.e2 */
/* loaded from: combined.jar:classes2.jar:p6/e2.class */
public abstract class AbstractC7574e2 {

    /* renamed from: a */
    public static final AbstractC7574e2 f36706a = new a();

    /* renamed from: b */
    public static final InterfaceC7579g<AbstractC7574e2> f36707b = new C7604o();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/e2$a.class
     */
    /* renamed from: p6.e2$a */
    /* loaded from: combined.jar:classes2.jar:p6/e2$a.class */
    public class a extends AbstractC7574e2 {
        @Override // p267p6.AbstractC7574e2
        /* renamed from: b */
        public int mo506b(Object obj) {
            return -1;
        }

        @Override // p267p6.AbstractC7574e2
        /* renamed from: g */
        public b mo404g(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p267p6.AbstractC7574e2
        /* renamed from: i */
        public int mo509i() {
            return 0;
        }

        @Override // p267p6.AbstractC7574e2
        /* renamed from: m */
        public Object mo511m(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p267p6.AbstractC7574e2
        /* renamed from: o */
        public c mo405o(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p267p6.AbstractC7574e2
        /* renamed from: p */
        public int mo512p() {
            return 0;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/e2$b.class
     */
    /* renamed from: p6.e2$b */
    /* loaded from: combined.jar:classes2.jar:p6/e2$b.class */
    public static final class b {

        /* renamed from: h */
        public static final InterfaceC7579g<b> f36708h = new C7604o();

        /* renamed from: a */
        public Object f36709a;

        /* renamed from: b */
        public Object f36710b;

        /* renamed from: c */
        public int f36711c;

        /* renamed from: d */
        public long f36712d;

        /* renamed from: e */
        public long f36713e;

        /* renamed from: f */
        public boolean f36714f;

        /* renamed from: g */
        public C0820a f36715g = C0820a.f5682g;

        /* renamed from: a */
        public int m32669a(int i10) {
            return this.f36715g.m5222b(i10).f5693b;
        }

        /* renamed from: b */
        public long m32670b(int i10, int i11) {
            C0820a.a m5222b = this.f36715g.m5222b(i10);
            return m5222b.f5693b != -1 ? m5222b.f5696e[i11] : -9223372036854775807L;
        }

        /* renamed from: c */
        public int m32671c() {
            return this.f36715g.f5686b;
        }

        /* renamed from: d */
        public int m32672d(long j10) {
            return this.f36715g.m5223c(j10, this.f36712d);
        }

        /* renamed from: e */
        public int m32673e(long j10) {
            return this.f36715g.m5224d(j10, this.f36712d);
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            if (!C4401z0.m22371c(this.f36709a, bVar.f36709a) || !C4401z0.m22371c(this.f36710b, bVar.f36710b) || this.f36711c != bVar.f36711c || this.f36712d != bVar.f36712d || this.f36713e != bVar.f36713e || this.f36714f != bVar.f36714f || !C4401z0.m22371c(this.f36715g, bVar.f36715g)) {
                z10 = false;
            }
            return z10;
        }

        /* renamed from: f */
        public long m32674f(int i10) {
            return this.f36715g.m5222b(i10).f5692a;
        }

        /* renamed from: g */
        public long m32675g() {
            return this.f36715g.f5687c;
        }

        /* renamed from: h */
        public Object m32676h() {
            return this.f36715g.f5685a;
        }

        public int hashCode() {
            Object obj = this.f36709a;
            int i10 = 0;
            int hashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f36710b;
            if (obj2 != null) {
                i10 = obj2.hashCode();
            }
            int i11 = this.f36711c;
            long j10 = this.f36712d;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            long j11 = this.f36713e;
            return ((((((((((((217 + hashCode) * 31) + i10) * 31) + i11) * 31) + i12) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f36714f ? 1 : 0)) * 31) + this.f36715g.hashCode();
        }

        /* renamed from: i */
        public long m32677i(int i10) {
            return this.f36715g.m5222b(i10).f5697f;
        }

        /* renamed from: j */
        public long m32678j() {
            return C7583h.m32761e(this.f36712d);
        }

        /* renamed from: k */
        public long m32679k() {
            return this.f36712d;
        }

        /* renamed from: l */
        public int m32680l(int i10) {
            return this.f36715g.m5222b(i10).m5238c();
        }

        /* renamed from: m */
        public int m32681m(int i10, int i11) {
            return this.f36715g.m5222b(i10).m5239d(i11);
        }

        /* renamed from: n */
        public long m32682n() {
            return C7583h.m32761e(this.f36713e);
        }

        /* renamed from: o */
        public long m32683o() {
            return this.f36713e;
        }

        /* renamed from: p */
        public int m32684p() {
            return this.f36715g.f5689e;
        }

        /* renamed from: q */
        public boolean m32685q(int i10) {
            return !this.f36715g.m5222b(i10).m5240e();
        }

        /* renamed from: r */
        public boolean m32686r(int i10) {
            return this.f36715g.m5222b(i10).f5698g;
        }

        /* renamed from: s */
        public b m32687s(Object obj, Object obj2, int i10, long j10, long j11) {
            return m32688t(obj, obj2, i10, j10, j11, C0820a.f5682g, false);
        }

        /* renamed from: t */
        public b m32688t(Object obj, Object obj2, int i10, long j10, long j11, C0820a c0820a, boolean z10) {
            this.f36709a = obj;
            this.f36710b = obj2;
            this.f36711c = i10;
            this.f36712d = j10;
            this.f36713e = j11;
            this.f36715g = c0820a;
            this.f36714f = z10;
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/e2$c.class
     */
    /* renamed from: p6.e2$c */
    /* loaded from: combined.jar:classes2.jar:p6/e2$c.class */
    public static final class c {

        /* renamed from: r */
        public static final Object f36716r = new Object();

        /* renamed from: s */
        public static final Object f36717s = new Object();

        /* renamed from: t */
        public static final C7561b1 f36718t = new C7561b1.c().m32371v("com.google.android.exoplayer2.Timeline").m32348B(Uri.EMPTY).m32350a();

        /* renamed from: u */
        public static final InterfaceC7579g<c> f36719u = new C7604o();

        /* renamed from: b */
        @Deprecated
        public Object f36721b;

        /* renamed from: d */
        public Object f36723d;

        /* renamed from: e */
        public long f36724e;

        /* renamed from: f */
        public long f36725f;

        /* renamed from: g */
        public long f36726g;

        /* renamed from: h */
        public boolean f36727h;

        /* renamed from: i */
        public boolean f36728i;

        /* renamed from: j */
        @Deprecated
        public boolean f36729j;

        /* renamed from: k */
        public C7561b1.f f36730k;

        /* renamed from: l */
        public boolean f36731l;

        /* renamed from: m */
        public long f36732m;

        /* renamed from: n */
        public long f36733n;

        /* renamed from: o */
        public int f36734o;

        /* renamed from: p */
        public int f36735p;

        /* renamed from: q */
        public long f36736q;

        /* renamed from: a */
        public Object f36720a = f36716r;

        /* renamed from: c */
        public C7561b1 f36722c = f36718t;

        /* renamed from: a */
        public long m32689a() {
            return C4401z0.m22366a0(this.f36726g);
        }

        /* renamed from: b */
        public long m32690b() {
            return C7583h.m32761e(this.f36732m);
        }

        /* renamed from: c */
        public long m32691c() {
            return this.f36732m;
        }

        /* renamed from: d */
        public long m32692d() {
            return C7583h.m32761e(this.f36733n);
        }

        /* renamed from: e */
        public long m32693e() {
            return this.f36736q;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            if (!C4401z0.m22371c(this.f36720a, cVar.f36720a) || !C4401z0.m22371c(this.f36722c, cVar.f36722c) || !C4401z0.m22371c(this.f36723d, cVar.f36723d) || !C4401z0.m22371c(this.f36730k, cVar.f36730k) || this.f36724e != cVar.f36724e || this.f36725f != cVar.f36725f || this.f36726g != cVar.f36726g || this.f36727h != cVar.f36727h || this.f36728i != cVar.f36728i || this.f36731l != cVar.f36731l || this.f36732m != cVar.f36732m || this.f36733n != cVar.f36733n || this.f36734o != cVar.f36734o || this.f36735p != cVar.f36735p || this.f36736q != cVar.f36736q) {
                z10 = false;
            }
            return z10;
        }

        /* renamed from: f */
        public boolean m32694f() {
            C4349a.m21884g(this.f36729j == (this.f36730k != null));
            return this.f36730k != null;
        }

        /* renamed from: g */
        public c m32695g(Object obj, C7561b1 c7561b1, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, C7561b1.f fVar, long j13, long j14, int i10, int i11, long j15) {
            C7561b1.g gVar;
            this.f36720a = obj;
            this.f36722c = c7561b1 != null ? c7561b1 : f36718t;
            this.f36721b = (c7561b1 == null || (gVar = c7561b1.f36449b) == null) ? null : gVar.f36511h;
            this.f36723d = obj2;
            this.f36724e = j10;
            this.f36725f = j11;
            this.f36726g = j12;
            this.f36727h = z10;
            this.f36728i = z11;
            this.f36729j = fVar != null;
            this.f36730k = fVar;
            this.f36732m = j13;
            this.f36733n = j14;
            this.f36734o = i10;
            this.f36735p = i11;
            this.f36736q = j15;
            this.f36731l = false;
            return this;
        }

        public int hashCode() {
            int hashCode = this.f36720a.hashCode();
            int hashCode2 = this.f36722c.hashCode();
            Object obj = this.f36723d;
            int i10 = 0;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            C7561b1.f fVar = this.f36730k;
            if (fVar != null) {
                i10 = fVar.hashCode();
            }
            long j10 = this.f36724e;
            int i11 = (int) (j10 ^ (j10 >>> 32));
            long j11 = this.f36725f;
            int i12 = (int) (j11 ^ (j11 >>> 32));
            long j12 = this.f36726g;
            int i13 = (int) (j12 ^ (j12 >>> 32));
            boolean z10 = this.f36727h;
            boolean z11 = this.f36728i;
            boolean z12 = this.f36731l;
            long j13 = this.f36732m;
            int i14 = (int) (j13 ^ (j13 >>> 32));
            long j14 = this.f36733n;
            int i15 = (int) (j14 ^ (j14 >>> 32));
            int i16 = this.f36734o;
            int i17 = this.f36735p;
            long j15 = this.f36736q;
            return ((((((((((((((((((((((((((((217 + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + i10) * 31) + i11) * 31) + i12) * 31) + i13) * 31) + (z10 ? 1 : 0)) * 31) + (z11 ? 1 : 0)) * 31) + (z12 ? 1 : 0)) * 31) + i14) * 31) + i15) * 31) + i16) * 31) + i17) * 31) + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    /* renamed from: a */
    public int mo505a(boolean z10) {
        return m32667q() ? -1 : 0;
    }

    /* renamed from: b */
    public abstract int mo506b(Object obj);

    /* renamed from: c */
    public int mo507c(boolean z10) {
        return m32667q() ? -1 : mo512p() - 1;
    }

    /* renamed from: d */
    public final int m32662d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = m32663f(i10, bVar).f36711c;
        if (m32666n(i12, cVar).f36735p != i10) {
            return i10 + 1;
        }
        int mo508e = mo508e(i12, i11, z10);
        if (mo508e == -1) {
            return -1;
        }
        return m32666n(mo508e, cVar).f36734o;
    }

    /* renamed from: e */
    public int mo508e(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            return i10 == mo507c(z10) ? -1 : i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == mo507c(z10) ? mo505a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC7574e2)) {
            return false;
        }
        AbstractC7574e2 abstractC7574e2 = (AbstractC7574e2) obj;
        if (abstractC7574e2.mo512p() != mo512p() || abstractC7574e2.mo509i() != mo509i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i10 = 0; i10 < mo512p(); i10++) {
            if (!m32666n(i10, cVar).equals(abstractC7574e2.m32666n(i10, cVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < mo509i(); i11++) {
            if (!mo404g(i11, bVar, true).equals(abstractC7574e2.mo404g(i11, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final b m32663f(int i10, b bVar) {
        return mo404g(i10, bVar, false);
    }

    /* renamed from: g */
    public abstract b mo404g(int i10, b bVar, boolean z10);

    /* renamed from: h */
    public b mo32326h(Object obj, b bVar) {
        return mo404g(mo506b(obj), bVar, true);
    }

    public int hashCode() {
        int i10;
        c cVar = new c();
        b bVar = new b();
        int mo512p = 217 + mo512p();
        int i11 = 0;
        while (true) {
            i10 = mo512p * 31;
            if (i11 >= mo512p()) {
                break;
            }
            mo512p = i10 + m32666n(i11, cVar).hashCode();
            i11++;
        }
        int mo509i = i10 + mo509i();
        for (int i12 = 0; i12 < mo509i(); i12++) {
            mo509i = (mo509i * 31) + mo404g(i12, bVar, true).hashCode();
        }
        return mo509i;
    }

    /* renamed from: i */
    public abstract int mo509i();

    /* renamed from: j */
    public final Pair<Object, Long> m32664j(c cVar, b bVar, int i10, long j10) {
        return (Pair) C4349a.m21882e(m32665k(cVar, bVar, i10, j10, 0L));
    }

    /* renamed from: k */
    public final Pair<Object, Long> m32665k(c cVar, b bVar, int i10, long j10, long j11) {
        C4349a.m21880c(i10, 0, mo512p());
        mo405o(i10, cVar, j11);
        long j12 = j10;
        if (j10 == -9223372036854775807L) {
            long m32691c = cVar.m32691c();
            j12 = m32691c;
            if (m32691c == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = cVar.f36734o;
        m32663f(i11, bVar);
        while (i11 < cVar.f36735p && bVar.f36713e != j12) {
            int i12 = i11 + 1;
            if (m32663f(i12, bVar).f36713e > j12) {
                break;
            }
            i11 = i12;
        }
        mo404g(i11, bVar, true);
        return Pair.create(C4349a.m21882e(bVar.f36710b), Long.valueOf(j12 - bVar.f36713e));
    }

    /* renamed from: l */
    public int mo510l(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            return i10 == mo505a(z10) ? -1 : i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == mo505a(z10) ? mo507c(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: m */
    public abstract Object mo511m(int i10);

    /* renamed from: n */
    public final c m32666n(int i10, c cVar) {
        return mo405o(i10, cVar, 0L);
    }

    /* renamed from: o */
    public abstract c mo405o(int i10, c cVar, long j10);

    /* renamed from: p */
    public abstract int mo512p();

    /* renamed from: q */
    public final boolean m32667q() {
        return mo512p() == 0;
    }

    /* renamed from: r */
    public final boolean m32668r(int i10, b bVar, c cVar, int i11, boolean z10) {
        return m32662d(i10, bVar, cVar, i11, z10) == -1;
    }
}
