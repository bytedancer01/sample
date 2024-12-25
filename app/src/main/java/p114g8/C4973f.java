package p114g8;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p009a8.C0084b;
import p009a8.C0134z0;
import p027b9.C0858p;
import p027b9.InterfaceC0853l0;
import p027b9.InterfaceC0854m;
import p038c8.AbstractC1016b;
import p038c8.AbstractC1020f;
import p038c8.AbstractC1026l;
import p038c8.AbstractC1028n;
import p038c8.InterfaceC1029o;
import p059d9.C4349a;
import p059d9.C4393v0;
import p059d9.C4401z0;
import p099fc.AbstractC4834t;
import p099fc.C4844y;
import p146i8.C5206g;
import p146i8.InterfaceC5210k;
import p168jc.C5354c;
import p267p6.C7629w0;
import p421y8.AbstractC9879c;
import p421y8.InterfaceC9884h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:g8/f.class
 */
/* renamed from: g8.f */
/* loaded from: combined.jar:classes2.jar:g8/f.class */
public class C4973f {

    /* renamed from: a */
    public final InterfaceC4975h f28819a;

    /* renamed from: b */
    public final InterfaceC0854m f28820b;

    /* renamed from: c */
    public final InterfaceC0854m f28821c;

    /* renamed from: d */
    public final C4988u f28822d;

    /* renamed from: e */
    public final Uri[] f28823e;

    /* renamed from: f */
    public final C7629w0[] f28824f;

    /* renamed from: g */
    public final InterfaceC5210k f28825g;

    /* renamed from: h */
    public final C0134z0 f28826h;

    /* renamed from: i */
    public final List<C7629w0> f28827i;

    /* renamed from: k */
    public boolean f28829k;

    /* renamed from: m */
    public IOException f28831m;

    /* renamed from: n */
    public Uri f28832n;

    /* renamed from: o */
    public boolean f28833o;

    /* renamed from: p */
    public InterfaceC9884h f28834p;

    /* renamed from: r */
    public boolean f28836r;

    /* renamed from: j */
    public final C4972e f28828j = new C4972e(4);

    /* renamed from: l */
    public byte[] f28830l = C4401z0.f26684f;

    /* renamed from: q */
    public long f28835q = -9223372036854775807L;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:g8/f$a.class
     */
    /* renamed from: g8.f$a */
    /* loaded from: combined.jar:classes2.jar:g8/f$a.class */
    public static final class a extends AbstractC1026l {

        /* renamed from: l */
        public byte[] f28837l;

        public a(InterfaceC0854m interfaceC0854m, C0858p c0858p, C7629w0 c7629w0, int i10, Object obj, byte[] bArr) {
            super(interfaceC0854m, c0858p, 3, c7629w0, i10, obj, bArr);
        }

        @Override // p038c8.AbstractC1026l
        /* renamed from: g */
        public void mo6048g(byte[] bArr, int i10) {
            this.f28837l = Arrays.copyOf(bArr, i10);
        }

        /* renamed from: j */
        public byte[] m25049j() {
            return this.f28837l;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:g8/f$b.class
     */
    /* renamed from: g8.f$b */
    /* loaded from: combined.jar:classes2.jar:g8/f$b.class */
    public static final class b {

        /* renamed from: a */
        public AbstractC1020f f28838a;

        /* renamed from: b */
        public boolean f28839b;

        /* renamed from: c */
        public Uri f28840c;

        public b() {
            m25050a();
        }

        /* renamed from: a */
        public void m25050a() {
            this.f28838a = null;
            this.f28839b = false;
            this.f28840c = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:g8/f$c.class
     */
    /* renamed from: g8.f$c */
    /* loaded from: combined.jar:classes2.jar:g8/f$c.class */
    public static final class c extends AbstractC1016b {

        /* renamed from: e */
        public final List<C5206g.e> f28841e;

        /* renamed from: f */
        public final long f28842f;

        /* renamed from: g */
        public final String f28843g;

        public c(String str, long j10, List<C5206g.e> list) {
            super(0L, list.size() - 1);
            this.f28843g = str;
            this.f28842f = j10;
            this.f28841e = list;
        }

        @Override // p038c8.InterfaceC1029o
        /* renamed from: a */
        public long mo6052a() {
            m5988c();
            return this.f28842f + this.f28841e.get((int) m5989d()).f29819f;
        }

        @Override // p038c8.InterfaceC1029o
        /* renamed from: b */
        public long mo6053b() {
            m5988c();
            C5206g.e eVar = this.f28841e.get((int) m5989d());
            return this.f28842f + eVar.f29819f + eVar.f29817d;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:g8/f$d.class
     */
    /* renamed from: g8.f$d */
    /* loaded from: combined.jar:classes2.jar:g8/f$d.class */
    public static final class d extends AbstractC9879c {

        /* renamed from: h */
        public int f28844h;

        public d(C0134z0 c0134z0, int[] iArr) {
            super(c0134z0, iArr);
            this.f28844h = mo41610j(c0134z0.m663b(iArr[0]));
        }

        @Override // p421y8.InterfaceC9884h
        /* renamed from: a */
        public int mo25051a() {
            return this.f28844h;
        }

        @Override // p421y8.InterfaceC9884h
        /* renamed from: h */
        public Object mo25052h() {
            return null;
        }

        @Override // p421y8.InterfaceC9884h
        /* renamed from: n */
        public void mo25053n(long j10, long j11, long j12, List<? extends AbstractC1028n> list, InterfaceC1029o[] interfaceC1029oArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (mo41605c(this.f28844h, elapsedRealtime)) {
                for (int i10 = this.f45370b - 1; i10 >= 0; i10--) {
                    if (!mo41605c(i10, elapsedRealtime)) {
                        this.f28844h = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // p421y8.InterfaceC9884h
        /* renamed from: r */
        public int mo25054r() {
            return 0;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:g8/f$e.class
     */
    /* renamed from: g8.f$e */
    /* loaded from: combined.jar:classes2.jar:g8/f$e.class */
    public static final class e {

        /* renamed from: a */
        public final C5206g.e f28845a;

        /* renamed from: b */
        public final long f28846b;

        /* renamed from: c */
        public final int f28847c;

        /* renamed from: d */
        public final boolean f28848d;

        public e(C5206g.e eVar, long j10, int i10) {
            this.f28845a = eVar;
            this.f28846b = j10;
            this.f28847c = i10;
            this.f28848d = (eVar instanceof C5206g.b) && ((C5206g.b) eVar).f29809n;
        }
    }

    public C4973f(InterfaceC4975h interfaceC4975h, InterfaceC5210k interfaceC5210k, Uri[] uriArr, C7629w0[] c7629w0Arr, InterfaceC4974g interfaceC4974g, InterfaceC0853l0 interfaceC0853l0, C4988u c4988u, List<C7629w0> list) {
        this.f28819a = interfaceC4975h;
        this.f28825g = interfaceC5210k;
        this.f28823e = uriArr;
        this.f28824f = c7629w0Arr;
        this.f28822d = c4988u;
        this.f28827i = list;
        InterfaceC0854m mo25015a = interfaceC4974g.mo25015a(1);
        this.f28820b = mo25015a;
        if (interfaceC0853l0 != null) {
            mo25015a.mo522c(interfaceC0853l0);
        }
        this.f28821c = interfaceC4974g.mo25015a(3);
        this.f28826h = new C0134z0(c7629w0Arr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((c7629w0Arr[i10].f37079f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f28834p = new d(this.f28826h, C5354c.m26644j(arrayList));
    }

    /* renamed from: c */
    public static Uri m25027c(C5206g c5206g, C5206g.e eVar) {
        String str;
        if (eVar == null || (str = eVar.f29821h) == null) {
            return null;
        }
        return C4393v0.m22281e(c5206g.f29831a, str);
    }

    /* renamed from: f */
    public static e m25028f(C5206g c5206g, long j10, int i10) {
        int i11 = (int) (j10 - c5206g.f29796k);
        e eVar = null;
        if (i11 == c5206g.f29803r.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < c5206g.f29804s.size()) {
                eVar = new e(c5206g.f29804s.get(i10), j10, i10);
            }
            return eVar;
        }
        C5206g.d dVar = c5206g.f29803r.get(i11);
        if (i10 == -1) {
            return new e(dVar, j10, -1);
        }
        if (i10 < dVar.f29814n.size()) {
            return new e(dVar.f29814n.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < c5206g.f29803r.size()) {
            return new e(c5206g.f29803r.get(i12), j10 + 1, -1);
        }
        if (c5206g.f29804s.isEmpty()) {
            return null;
        }
        return new e(c5206g.f29804s.get(0), j10 + 1, 0);
    }

    /* renamed from: h */
    public static List<C5206g.e> m25029h(C5206g c5206g, long j10, int i10) {
        int i11 = (int) (j10 - c5206g.f29796k);
        if (i11 < 0 || c5206g.f29803r.size() < i11) {
            return AbstractC4834t.m24539E();
        }
        ArrayList arrayList = new ArrayList();
        int i12 = i10;
        if (i11 < c5206g.f29803r.size()) {
            int i13 = i11;
            if (i10 != -1) {
                C5206g.d dVar = c5206g.f29803r.get(i11);
                if (i10 == 0) {
                    arrayList.add(dVar);
                } else if (i10 < dVar.f29814n.size()) {
                    List<C5206g.b> list = dVar.f29814n;
                    arrayList.addAll(list.subList(i10, list.size()));
                }
                i13 = i11 + 1;
            }
            List<C5206g.d> list2 = c5206g.f29803r;
            arrayList.addAll(list2.subList(i13, list2.size()));
            i12 = 0;
        }
        if (c5206g.f29799n != -9223372036854775807L) {
            if (i12 == -1) {
                i12 = 0;
            }
            if (i12 < c5206g.f29804s.size()) {
                List<C5206g.b> list3 = c5206g.f29804s;
                arrayList.addAll(list3.subList(i12, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public InterfaceC1029o[] m25030a(C4977j c4977j, long j10) {
        int m664c = c4977j == null ? -1 : this.f28826h.m664c(c4977j.f6871d);
        int length = this.f28834p.length();
        InterfaceC1029o[] interfaceC1029oArr = new InterfaceC1029o[length];
        for (int i10 = 0; i10 < length; i10++) {
            int mo41608f = this.f28834p.mo41608f(i10);
            Uri uri = this.f28823e[mo41608f];
            if (this.f28825g.mo25994g(uri)) {
                C5206g mo25999m = this.f28825g.mo25999m(uri, false);
                C4349a.m21882e(mo25999m);
                long mo25990c = mo25999m.f29793h - this.f28825g.mo25990c();
                Pair<Long, Integer> m25033e = m25033e(c4977j, mo41608f != m664c, mo25999m, mo25990c, j10);
                interfaceC1029oArr[i10] = new c(mo25999m.f29831a, mo25990c, m25029h(mo25999m, ((Long) m25033e.first).longValue(), ((Integer) m25033e.second).intValue()));
            } else {
                interfaceC1029oArr[i10] = InterfaceC1029o.f6920a;
            }
        }
        return interfaceC1029oArr;
    }

    /* renamed from: b */
    public int m25031b(C4977j c4977j) {
        int i10 = 1;
        if (c4977j.f28868o == -1) {
            return 1;
        }
        C5206g c5206g = (C5206g) C4349a.m21882e(this.f28825g.mo25999m(this.f28823e[this.f28826h.m664c(c4977j.f6871d)], false));
        int i11 = (int) (c4977j.f6919j - c5206g.f29796k);
        if (i11 < 0) {
            return 1;
        }
        List<C5206g.b> list = i11 < c5206g.f29803r.size() ? c5206g.f29803r.get(i11).f29814n : c5206g.f29804s;
        if (c4977j.f28868o >= list.size()) {
            return 2;
        }
        C5206g.b bVar = list.get(c4977j.f28868o);
        if (bVar.f29809n) {
            return 0;
        }
        if (!C4401z0.m22371c(Uri.parse(C4393v0.m22280d(c5206g.f29831a, bVar.f29815b)), c4977j.f6869b.f5847a)) {
            i10 = 2;
        }
        return i10;
    }

    /* renamed from: d */
    public void m25032d(long j10, long j11, List<C4977j> list, boolean z10, b bVar) {
        long j12;
        C4977j c4977j = list.isEmpty() ? null : (C4977j) C4844y.m24603c(list);
        int m664c = c4977j == null ? -1 : this.f28826h.m664c(c4977j.f6871d);
        long j13 = j11 - j10;
        long m25044r = m25044r(j10);
        long j14 = j13;
        long j15 = m25044r;
        if (c4977j != null) {
            j14 = j13;
            j15 = m25044r;
            if (!this.f28833o) {
                long m6004d = c4977j.m6004d();
                long max = Math.max(0L, j13 - m6004d);
                j14 = max;
                j15 = m25044r;
                if (m25044r != -9223372036854775807L) {
                    j15 = Math.max(0L, m25044r - m6004d);
                    j14 = max;
                }
            }
        }
        this.f28834p.mo25053n(j10, j14, j15, list, m25030a(c4977j, j11));
        int mo41614p = this.f28834p.mo41614p();
        boolean z11 = m664c != mo41614p;
        Uri uri = this.f28823e[mo41614p];
        if (!this.f28825g.mo25994g(uri)) {
            bVar.f28840c = uri;
            this.f28836r &= uri.equals(this.f28832n);
            this.f28832n = uri;
            return;
        }
        C5206g mo25999m = this.f28825g.mo25999m(uri, true);
        C4349a.m21882e(mo25999m);
        this.f28833o = mo25999m.f29833c;
        m25048v(mo25999m);
        long mo25990c = mo25999m.f29793h - this.f28825g.mo25990c();
        Pair<Long, Integer> m25033e = m25033e(c4977j, z11, mo25999m, mo25990c, j11);
        long longValue = ((Long) m25033e.first).longValue();
        int intValue = ((Integer) m25033e.second).intValue();
        if (longValue >= mo25999m.f29796k || c4977j == null || !z11) {
            m664c = mo41614p;
            j12 = longValue;
        } else {
            uri = this.f28823e[m664c];
            mo25999m = this.f28825g.mo25999m(uri, true);
            C4349a.m21882e(mo25999m);
            mo25990c = mo25999m.f29793h - this.f28825g.mo25990c();
            Pair<Long, Integer> m25033e2 = m25033e(c4977j, false, mo25999m, mo25990c, j11);
            j12 = ((Long) m25033e2.first).longValue();
            intValue = ((Integer) m25033e2.second).intValue();
        }
        if (j12 < mo25999m.f29796k) {
            this.f28831m = new C0084b();
            return;
        }
        e m25028f = m25028f(mo25999m, j12, intValue);
        e eVar = m25028f;
        if (m25028f == null) {
            if (!mo25999m.f29800o) {
                bVar.f28840c = uri;
                this.f28836r &= uri.equals(this.f28832n);
                this.f28832n = uri;
                return;
            } else {
                if (z10 || mo25999m.f29803r.isEmpty()) {
                    bVar.f28839b = true;
                    return;
                }
                eVar = new e((C5206g.e) C4844y.m24603c(mo25999m.f29803r), (mo25999m.f29796k + mo25999m.f29803r.size()) - 1, -1);
            }
        }
        this.f28836r = false;
        this.f28832n = null;
        Uri m25027c = m25027c(mo25999m, eVar.f28845a.f29816c);
        AbstractC1020f m25037k = m25037k(m25027c, m664c);
        bVar.f28838a = m25037k;
        if (m25037k != null) {
            return;
        }
        Uri m25027c2 = m25027c(mo25999m, eVar.f28845a);
        AbstractC1020f m25037k2 = m25037k(m25027c2, m664c);
        bVar.f28838a = m25037k2;
        if (m25037k2 != null) {
            return;
        }
        boolean m25059w = C4977j.m25059w(c4977j, uri, mo25999m, eVar, mo25990c);
        if (m25059w && eVar.f28848d) {
            return;
        }
        bVar.f28838a = C4977j.m25056j(this.f28819a, this.f28820b, this.f28824f[m664c], mo25990c, mo25999m, eVar, uri, this.f28827i, this.f28834p.mo25054r(), this.f28834p.mo25052h(), this.f28829k, this.f28822d, c4977j, this.f28828j.m25024a(m25027c2), this.f28828j.m25024a(m25027c), m25059w);
    }

    /* renamed from: e */
    public final Pair<Long, Integer> m25033e(C4977j c4977j, boolean z10, C5206g c5206g, long j10, long j11) {
        Pair<Long, Integer> pair;
        int i10 = -1;
        if (c4977j != null && !z10) {
            if (c4977j.mo6046h()) {
                long mo6045g = c4977j.f28868o == -1 ? c4977j.mo6045g() : c4977j.f6919j;
                int i11 = c4977j.f28868o;
                if (i11 != -1) {
                    i10 = i11 + 1;
                }
                pair = new Pair<>(Long.valueOf(mo6045g), Integer.valueOf(i10));
            } else {
                pair = new Pair<>(Long.valueOf(c4977j.f6919j), Integer.valueOf(c4977j.f28868o));
            }
            return pair;
        }
        long j12 = c5206g.f29806u;
        long j13 = j11;
        if (c4977j != null) {
            j13 = this.f28833o ? j11 : c4977j.f6874g;
        }
        if (!c5206g.f29800o && j13 >= j12 + j10) {
            return new Pair<>(Long.valueOf(c5206g.f29796k + c5206g.f29803r.size()), -1);
        }
        long j14 = j13 - j10;
        int i12 = 0;
        int m22383g = C4401z0.m22383g(c5206g.f29803r, Long.valueOf(j14), true, !this.f28825g.mo25995h() || c4977j == null);
        long j15 = m22383g + c5206g.f29796k;
        int i13 = -1;
        long j16 = j15;
        if (m22383g >= 0) {
            C5206g.d dVar = c5206g.f29803r.get(m22383g);
            List<C5206g.b> list = j14 < dVar.f29819f + dVar.f29817d ? dVar.f29814n : c5206g.f29804s;
            while (true) {
                i13 = -1;
                j16 = j15;
                if (i12 >= list.size()) {
                    break;
                }
                C5206g.b bVar = list.get(i12);
                if (j14 < bVar.f29819f + bVar.f29817d) {
                    i13 = -1;
                    j16 = j15;
                    if (bVar.f29808m) {
                        j16 = j15 + (list == c5206g.f29804s ? 1L : 0L);
                        i13 = i12;
                    }
                } else {
                    i12++;
                }
            }
        }
        return new Pair<>(Long.valueOf(j16), Integer.valueOf(i13));
    }

    /* renamed from: g */
    public int m25034g(long j10, List<? extends AbstractC1028n> list) {
        return (this.f28831m != null || this.f28834p.length() < 2) ? list.size() : this.f28834p.mo41598o(j10, list);
    }

    /* renamed from: i */
    public C0134z0 m25035i() {
        return this.f28826h;
    }

    /* renamed from: j */
    public InterfaceC9884h m25036j() {
        return this.f28834p;
    }

    /* renamed from: k */
    public final AbstractC1020f m25037k(Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        byte[] m25026c = this.f28828j.m25026c(uri);
        if (m25026c != null) {
            this.f28828j.m25025b(uri, m25026c);
            return null;
        }
        return new a(this.f28821c, new C0858p.b().m5391i(uri).m5384b(1).m5383a(), this.f28824f[i10], this.f28834p.mo25054r(), this.f28834p.mo25052h(), this.f28830l);
    }

    /* renamed from: l */
    public boolean m25038l(AbstractC1020f abstractC1020f, long j10) {
        InterfaceC9884h interfaceC9884h = this.f28834p;
        return interfaceC9884h.mo41604b(interfaceC9884h.mo41611k(this.f28826h.m664c(abstractC1020f.f6871d)), j10);
    }

    /* renamed from: m */
    public void m25039m() {
        IOException iOException = this.f28831m;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f28832n;
        if (uri == null || !this.f28836r) {
            return;
        }
        this.f28825g.mo25989b(uri);
    }

    /* renamed from: n */
    public boolean m25040n(Uri uri) {
        return C4401z0.m22413u(this.f28823e, uri);
    }

    /* renamed from: o */
    public void m25041o(AbstractC1020f abstractC1020f) {
        if (abstractC1020f instanceof a) {
            a aVar = (a) abstractC1020f;
            this.f28830l = aVar.m6049h();
            this.f28828j.m25025b(aVar.f6869b.f5847a, (byte[]) C4349a.m21882e(aVar.m25049j()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        if (r5.f28825g.mo25996i(r6, r7) != false) goto L24;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m25042p(android.net.Uri r6, long r7) {
        /*
            r5 = this;
            r0 = 0
            r11 = r0
            r0 = 0
            r9 = r0
        L6:
            r0 = r5
            android.net.Uri[] r0 = r0.f28823e
            r12 = r0
            r0 = r9
            r1 = r12
            int r1 = r1.length
            if (r0 >= r1) goto L29
            r0 = r12
            r1 = r9
            r0 = r0[r1]
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L23
            goto L2c
        L23:
            int r9 = r9 + 1
            goto L6
        L29:
            r0 = -1
            r9 = r0
        L2c:
            r0 = r9
            r1 = -1
            if (r0 != r1) goto L34
            r0 = 1
            return r0
        L34:
            r0 = r5
            y8.h r0 = r0.f28834p
            r1 = r9
            int r0 = r0.mo41611k(r1)
            r9 = r0
            r0 = r9
            r1 = -1
            if (r0 != r1) goto L49
            r0 = 1
            return r0
        L49:
            r0 = r5
            r1 = r5
            boolean r1 = r1.f28836r
            r2 = r6
            r3 = r5
            android.net.Uri r3 = r3.f28832n
            boolean r2 = r2.equals(r3)
            r1 = r1 | r2
            r0.f28836r = r1
            r0 = r7
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L87
            r0 = r11
            r10 = r0
            r0 = r5
            y8.h r0 = r0.f28834p
            r1 = r9
            r2 = r7
            boolean r0 = r0.mo41604b(r1, r2)
            if (r0 == 0) goto L8a
            r0 = r11
            r10 = r0
            r0 = r5
            i8.k r0 = r0.f28825g
            r1 = r6
            r2 = r7
            boolean r0 = r0.mo25996i(r1, r2)
            if (r0 == 0) goto L8a
        L87:
            r0 = 1
            r10 = r0
        L8a:
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p114g8.C4973f.m25042p(android.net.Uri, long):boolean");
    }

    /* renamed from: q */
    public void m25043q() {
        this.f28831m = null;
    }

    /* renamed from: r */
    public final long m25044r(long j10) {
        long j11 = this.f28835q;
        long j12 = -9223372036854775807L;
        if (j11 != -9223372036854775807L) {
            j12 = j11 - j10;
        }
        return j12;
    }

    /* renamed from: s */
    public void m25045s(boolean z10) {
        this.f28829k = z10;
    }

    /* renamed from: t */
    public void m25046t(InterfaceC9884h interfaceC9884h) {
        this.f28834p = interfaceC9884h;
    }

    /* renamed from: u */
    public boolean m25047u(long j10, AbstractC1020f abstractC1020f, List<? extends AbstractC1028n> list) {
        if (this.f28831m != null) {
            return false;
        }
        return this.f28834p.mo41606d(j10, abstractC1020f, list);
    }

    /* renamed from: v */
    public final void m25048v(C5206g c5206g) {
        this.f28835q = c5206g.f29800o ? -9223372036854775807L : c5206g.m26031e() - this.f28825g.mo25990c();
    }
}
