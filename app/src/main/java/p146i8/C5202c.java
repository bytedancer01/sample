package p146i8;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p009a8.C0111o;
import p009a8.C0117r;
import p009a8.InterfaceC0090d0;
import p027b9.C0839e0;
import p027b9.C0843g0;
import p027b9.InterfaceC0831a0;
import p027b9.InterfaceC0837d0;
import p027b9.InterfaceC0854m;
import p059d9.C4349a;
import p059d9.C4401z0;
import p099fc.C4844y;
import p114g8.InterfaceC4974g;
import p146i8.C5202c;
import p146i8.C5205f;
import p146i8.C5206g;
import p146i8.C5208i;
import p146i8.InterfaceC5210k;
import p267p6.C7583h;
import p267p6.C7594k1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:i8/c.class
 */
/* renamed from: i8.c */
/* loaded from: combined.jar:classes2.jar:i8/c.class */
public final class C5202c implements InterfaceC5210k, C0839e0.b<C0843g0<AbstractC5207h>> {

    /* renamed from: q */
    public static final InterfaceC5210k.a f29736q = new InterfaceC5210k.a() { // from class: i8.b
        @Override // p146i8.InterfaceC5210k.a
        /* renamed from: a */
        public final InterfaceC5210k mo25958a(InterfaceC4974g interfaceC4974g, InterfaceC0837d0 interfaceC0837d0, InterfaceC5209j interfaceC5209j) {
            return new C5202c(interfaceC4974g, interfaceC0837d0, interfaceC5209j);
        }
    };

    /* renamed from: b */
    public final InterfaceC4974g f29737b;

    /* renamed from: c */
    public final InterfaceC5209j f29738c;

    /* renamed from: d */
    public final InterfaceC0837d0 f29739d;

    /* renamed from: e */
    public final HashMap<Uri, c> f29740e;

    /* renamed from: f */
    public final CopyOnWriteArrayList<InterfaceC5210k.b> f29741f;

    /* renamed from: g */
    public final double f29742g;

    /* renamed from: h */
    public InterfaceC0090d0.a f29743h;

    /* renamed from: i */
    public C0839e0 f29744i;

    /* renamed from: j */
    public Handler f29745j;

    /* renamed from: k */
    public InterfaceC5210k.e f29746k;

    /* renamed from: l */
    public C5205f f29747l;

    /* renamed from: m */
    public Uri f29748m;

    /* renamed from: n */
    public C5206g f29749n;

    /* renamed from: o */
    public boolean f29750o;

    /* renamed from: p */
    public long f29751p;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:i8/c$b.class
     */
    /* renamed from: i8.c$b */
    /* loaded from: combined.jar:classes2.jar:i8/c$b.class */
    public class b implements InterfaceC5210k.b {

        /* renamed from: b */
        public final C5202c f29752b;

        public b(C5202c c5202c) {
            this.f29752b = c5202c;
        }

        @Override // p146i8.InterfaceC5210k.b
        /* renamed from: e */
        public void mo25075e() {
            this.f29752b.f29741f.remove(this);
        }

        @Override // p146i8.InterfaceC5210k.b
        /* renamed from: o */
        public boolean mo25076o(Uri uri, InterfaceC0837d0.c cVar, boolean z10) {
            int i10;
            c cVar2;
            if (this.f29752b.f29749n != null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            List<C5205f.b> list = ((C5205f) C4401z0.m22391j(this.f29752b.f29747l)).f29770e;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                i10 = i12;
                if (i11 >= list.size()) {
                    break;
                }
                c cVar3 = (c) this.f29752b.f29740e.get(list.get(i11).f29783a);
                int i13 = i10;
                if (cVar3 != null) {
                    i13 = i10;
                    if (elapsedRealtime < cVar3.f29760i) {
                        i13 = i10 + 1;
                    }
                }
                i11++;
                i12 = i13;
            }
            InterfaceC0837d0.b mo5312c = this.f29752b.f29739d.mo5312c(new InterfaceC0837d0.a(1, 0, this.f29752b.f29747l.f29770e.size(), i10), cVar);
            if (mo5312c == null || mo5312c.f5758a != 2 || (cVar2 = (c) this.f29752b.f29740e.get(uri)) == null) {
                return false;
            }
            cVar2.m26008h(mo5312c.f5759b);
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:i8/c$c.class
     */
    /* renamed from: i8.c$c */
    /* loaded from: combined.jar:classes2.jar:i8/c$c.class */
    public final class c implements C0839e0.b<C0843g0<AbstractC5207h>> {

        /* renamed from: b */
        public final Uri f29753b;

        /* renamed from: c */
        public final C0839e0 f29754c = new C0839e0("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: d */
        public final InterfaceC0854m f29755d;

        /* renamed from: e */
        public C5206g f29756e;

        /* renamed from: f */
        public long f29757f;

        /* renamed from: g */
        public long f29758g;

        /* renamed from: h */
        public long f29759h;

        /* renamed from: i */
        public long f29760i;

        /* renamed from: j */
        public boolean f29761j;

        /* renamed from: k */
        public IOException f29762k;

        /* renamed from: l */
        public final C5202c f29763l;

        public c(C5202c c5202c, Uri uri) {
            this.f29763l = c5202c;
            this.f29753b = uri;
            this.f29755d = c5202c.f29737b.mo25015a(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m26007m(Uri uri) {
            this.f29761j = false;
            m26013p(uri);
        }

        /* renamed from: h */
        public final boolean m26008h(long j10) {
            this.f29760i = SystemClock.elapsedRealtime() + j10;
            return this.f29753b.equals(this.f29763l.f29748m) && !this.f29763l.m25981L();
        }

        /* renamed from: i */
        public final Uri m26009i() {
            C5206g c5206g = this.f29756e;
            if (c5206g != null) {
                C5206g.f fVar = c5206g.f29807v;
                if (fVar.f29826a != -9223372036854775807L || fVar.f29830e) {
                    Uri.Builder buildUpon = this.f29753b.buildUpon();
                    C5206g c5206g2 = this.f29756e;
                    if (c5206g2.f29807v.f29830e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c5206g2.f29796k + c5206g2.f29803r.size()));
                        C5206g c5206g3 = this.f29756e;
                        if (c5206g3.f29799n != -9223372036854775807L) {
                            List<C5206g.b> list = c5206g3.f29804s;
                            int size = list.size();
                            int i10 = size;
                            if (!list.isEmpty()) {
                                i10 = size;
                                if (((C5206g.b) C4844y.m24603c(list)).f29809n) {
                                    i10 = size - 1;
                                }
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
                        }
                    }
                    C5206g.f fVar2 = this.f29756e.f29807v;
                    if (fVar2.f29826a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", fVar2.f29827b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.f29753b;
        }

        /* renamed from: j */
        public C5206g m26010j() {
            return this.f29756e;
        }

        /* renamed from: l */
        public boolean m26011l() {
            int i10;
            boolean z10 = false;
            if (this.f29756e == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, C7583h.m32761e(this.f29756e.f29806u));
            C5206g c5206g = this.f29756e;
            if (c5206g.f29800o || (i10 = c5206g.f29789d) == 2 || i10 == 1 || this.f29757f + max > elapsedRealtime) {
                z10 = true;
            }
            return z10;
        }

        /* renamed from: n */
        public void m26012n() {
            m26014q(this.f29753b);
        }

        /* renamed from: p */
        public final void m26013p(Uri uri) {
            C0843g0 c0843g0 = new C0843g0(this.f29755d, uri, 4, this.f29763l.f29738c.mo25957b(this.f29763l.f29747l, this.f29756e));
            this.f29763l.f29743h.m396z(new C0111o(c0843g0.f5796a, c0843g0.f5797b, this.f29754c.m5328n(c0843g0, this, this.f29763l.f29739d.mo5311b(c0843g0.f5798c))), c0843g0.f5798c);
        }

        /* renamed from: q */
        public final void m26014q(final Uri uri) {
            this.f29760i = 0L;
            if (this.f29761j || this.f29754c.m5324j() || this.f29754c.m5323i()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.f29759h) {
                m26013p(uri);
            } else {
                this.f29761j = true;
                this.f29763l.f29745j.postDelayed(new Runnable(this, uri) { // from class: i8.d

                    /* renamed from: b */
                    public final C5202c.c f29764b;

                    /* renamed from: c */
                    public final Uri f29765c;

                    {
                        this.f29764b = this;
                        this.f29765c = uri;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f29764b.m26007m(this.f29765c);
                    }
                }, this.f29759h - elapsedRealtime);
            }
        }

        /* renamed from: s */
        public void m26015s() {
            this.f29754c.mo5320a();
            IOException iOException = this.f29762k;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // p027b9.C0839e0.b
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo485k(C0843g0<AbstractC5207h> c0843g0, long j10, long j11, boolean z10) {
            C0111o c0111o = new C0111o(c0843g0.f5796a, c0843g0.f5797b, c0843g0.m5361f(), c0843g0.m5359d(), j10, j11, c0843g0.m5358b());
            this.f29763l.f29739d.mo5313d(c0843g0.f5796a);
            this.f29763l.f29743h.m387q(c0111o, 4);
        }

        @Override // p027b9.C0839e0.b
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public void mo489r(C0843g0<AbstractC5207h> c0843g0, long j10, long j11) {
            AbstractC5207h m5360e = c0843g0.m5360e();
            C0111o c0111o = new C0111o(c0843g0.f5796a, c0843g0.f5797b, c0843g0.m5361f(), c0843g0.m5359d(), j10, j11, c0843g0.m5358b());
            if (m5360e instanceof C5206g) {
                m26019w((C5206g) m5360e, c0111o);
                this.f29763l.f29743h.m390t(c0111o, 4);
            } else {
                this.f29762k = C7594k1.m32824c("Loaded playlist has unexpected type.", null);
                this.f29763l.f29743h.m394x(c0111o, 4, this.f29762k, true);
            }
            this.f29763l.f29739d.mo5313d(c0843g0.f5796a);
        }

        @Override // p027b9.C0839e0.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C0839e0.c mo486o(C0843g0<AbstractC5207h> c0843g0, long j10, long j11, IOException iOException, int i10) {
            C0839e0.c cVar;
            C0111o c0111o = new C0111o(c0843g0.f5796a, c0843g0.f5797b, c0843g0.m5361f(), c0843g0.m5359d(), j10, j11, c0843g0.m5358b());
            boolean z10 = iOException instanceof C5208i.a;
            if ((c0843g0.m5361f().getQueryParameter("_HLS_msn") != null) || z10) {
                int i11 = Integer.MAX_VALUE;
                if (iOException instanceof InterfaceC0831a0.e) {
                    i11 = ((InterfaceC0831a0.e) iOException).f5741e;
                }
                if (z10 || i11 == 400 || i11 == 503) {
                    this.f29759h = SystemClock.elapsedRealtime();
                    m26012n();
                    ((InterfaceC0090d0.a) C4401z0.m22391j(this.f29763l.f29743h)).m394x(c0111o, c0843g0.f5798c, iOException, true);
                    return C0839e0.f5770f;
                }
            }
            InterfaceC0837d0.c cVar2 = new InterfaceC0837d0.c(c0111o, new C0117r(c0843g0.f5798c), iOException, i10);
            if (this.f29763l.m25983N(this.f29753b, cVar2, false)) {
                long mo5310a = this.f29763l.f29739d.mo5310a(cVar2);
                cVar = mo5310a != -9223372036854775807L ? C0839e0.m5319h(false, mo5310a) : C0839e0.f5771g;
            } else {
                cVar = C0839e0.f5770f;
            }
            boolean m5331c = true ^ cVar.m5331c();
            this.f29763l.f29743h.m394x(c0111o, c0843g0.f5798c, iOException, m5331c);
            if (m5331c) {
                this.f29763l.f29739d.mo5313d(c0843g0.f5796a);
            }
            return cVar;
        }

        /* renamed from: w */
        public final void m26019w(C5206g c5206g, C0111o c0111o) {
            IOException iOException;
            boolean z10;
            C5206g c5206g2 = this.f29756e;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f29757f = elapsedRealtime;
            C5206g m25976G = this.f29763l.m25976G(c5206g2, c5206g);
            this.f29756e = m25976G;
            boolean z11 = false;
            if (m25976G != c5206g2) {
                this.f29762k = null;
                this.f29758g = elapsedRealtime;
                this.f29763l.m25987R(this.f29753b, m25976G);
            } else if (!m25976G.f29800o) {
                if (c5206g.f29796k + c5206g.f29803r.size() < this.f29756e.f29796k) {
                    iOException = new InterfaceC5210k.c(this.f29753b);
                    z10 = true;
                } else {
                    iOException = null;
                    if (elapsedRealtime - this.f29758g > C7583h.m32761e(r0.f29798m) * this.f29763l.f29742g) {
                        iOException = new InterfaceC5210k.d(this.f29753b);
                    }
                    z10 = false;
                }
                if (iOException != null) {
                    this.f29762k = iOException;
                    this.f29763l.m25983N(this.f29753b, new InterfaceC0837d0.c(c0111o, new C0117r(4), iOException, 1), z10);
                }
            }
            long j10 = 0;
            C5206g c5206g3 = this.f29756e;
            if (!c5206g3.f29807v.f29830e) {
                j10 = c5206g3.f29798m;
                if (c5206g3 == c5206g2) {
                    j10 /= 2;
                }
            }
            this.f29759h = elapsedRealtime + C7583h.m32761e(j10);
            if (this.f29756e.f29799n != -9223372036854775807L || this.f29753b.equals(this.f29763l.f29748m)) {
                z11 = true;
            }
            if (!z11 || this.f29756e.f29800o) {
                return;
            }
            m26014q(m26009i());
        }

        /* renamed from: x */
        public void m26020x() {
            this.f29754c.m5326l();
        }
    }

    public C5202c(InterfaceC4974g interfaceC4974g, InterfaceC0837d0 interfaceC0837d0, InterfaceC5209j interfaceC5209j) {
        this(interfaceC4974g, interfaceC0837d0, interfaceC5209j, 3.5d);
    }

    public C5202c(InterfaceC4974g interfaceC4974g, InterfaceC0837d0 interfaceC0837d0, InterfaceC5209j interfaceC5209j, double d10) {
        this.f29737b = interfaceC4974g;
        this.f29738c = interfaceC5209j;
        this.f29739d = interfaceC0837d0;
        this.f29742g = d10;
        this.f29741f = new CopyOnWriteArrayList<>();
        this.f29740e = new HashMap<>();
        this.f29751p = -9223372036854775807L;
    }

    /* renamed from: F */
    public static C5206g.d m25963F(C5206g c5206g, C5206g c5206g2) {
        int i10 = (int) (c5206g2.f29796k - c5206g.f29796k);
        List<C5206g.d> list = c5206g.f29803r;
        return i10 < list.size() ? list.get(i10) : null;
    }

    /* renamed from: E */
    public final void m25975E(List<Uri> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = list.get(i10);
            this.f29740e.put(uri, new c(this, uri));
        }
    }

    /* renamed from: G */
    public final C5206g m25976G(C5206g c5206g, C5206g c5206g2) {
        if (c5206g2.m26032f(c5206g)) {
            return c5206g2.m26029c(m25978I(c5206g, c5206g2), m25977H(c5206g, c5206g2));
        }
        C5206g c5206g3 = c5206g;
        if (c5206g2.f29800o) {
            c5206g3 = c5206g.m26030d();
        }
        return c5206g3;
    }

    /* renamed from: H */
    public final int m25977H(C5206g c5206g, C5206g c5206g2) {
        C5206g.d m25963F;
        if (c5206g2.f29794i) {
            return c5206g2.f29795j;
        }
        C5206g c5206g3 = this.f29749n;
        int i10 = c5206g3 != null ? c5206g3.f29795j : 0;
        if (c5206g != null && (m25963F = m25963F(c5206g, c5206g2)) != null) {
            return (c5206g.f29795j + m25963F.f29818e) - c5206g2.f29803r.get(0).f29818e;
        }
        return i10;
    }

    /* renamed from: I */
    public final long m25978I(C5206g c5206g, C5206g c5206g2) {
        if (c5206g2.f29801p) {
            return c5206g2.f29793h;
        }
        C5206g c5206g3 = this.f29749n;
        long j10 = c5206g3 != null ? c5206g3.f29793h : 0L;
        if (c5206g == null) {
            return j10;
        }
        int size = c5206g.f29803r.size();
        C5206g.d m25963F = m25963F(c5206g, c5206g2);
        return m25963F != null ? c5206g.f29793h + m25963F.f29819f : ((long) size) == c5206g2.f29796k - c5206g.f29796k ? c5206g.m26031e() : j10;
    }

    /* renamed from: J */
    public final Uri m25979J(Uri uri) {
        C5206g c5206g = this.f29749n;
        Uri uri2 = uri;
        if (c5206g != null) {
            uri2 = uri;
            if (c5206g.f29807v.f29830e) {
                C5206g.c cVar = c5206g.f29805t.get(uri);
                uri2 = uri;
                if (cVar != null) {
                    Uri.Builder buildUpon = uri.buildUpon();
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f29811b));
                    int i10 = cVar.f29812c;
                    if (i10 != -1) {
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
                    }
                    uri2 = buildUpon.build();
                }
            }
        }
        return uri2;
    }

    /* renamed from: K */
    public final boolean m25980K(Uri uri) {
        List<C5205f.b> list = this.f29747l.f29770e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(list.get(i10).f29783a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: L */
    public final boolean m25981L() {
        List<C5205f.b> list = this.f29747l.f29770e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) C4349a.m21882e(this.f29740e.get(list.get(i10).f29783a));
            if (elapsedRealtime > cVar.f29760i) {
                Uri uri = cVar.f29753b;
                this.f29748m = uri;
                cVar.m26014q(m25979J(uri));
                return true;
            }
        }
        return false;
    }

    /* renamed from: M */
    public final void m25982M(Uri uri) {
        if (uri.equals(this.f29748m) || !m25980K(uri)) {
            return;
        }
        C5206g c5206g = this.f29749n;
        if (c5206g == null || !c5206g.f29800o) {
            this.f29748m = uri;
            c cVar = this.f29740e.get(uri);
            C5206g c5206g2 = cVar.f29756e;
            if (c5206g2 == null || !c5206g2.f29800o) {
                cVar.m26014q(m25979J(uri));
            } else {
                this.f29749n = c5206g2;
                this.f29746k.mo12256b(c5206g2);
            }
        }
    }

    /* renamed from: N */
    public final boolean m25983N(Uri uri, InterfaceC0837d0.c cVar, boolean z10) {
        Iterator<InterfaceC5210k.b> it = this.f29741f.iterator();
        boolean z11 = false;
        while (true) {
            boolean z12 = z11;
            if (!it.hasNext()) {
                return z12;
            }
            z11 = z12 | (!it.next().mo25076o(uri, cVar, z10));
        }
    }

    @Override // p027b9.C0839e0.b
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo485k(C0843g0<AbstractC5207h> c0843g0, long j10, long j11, boolean z10) {
        C0111o c0111o = new C0111o(c0843g0.f5796a, c0843g0.f5797b, c0843g0.m5361f(), c0843g0.m5359d(), j10, j11, c0843g0.m5358b());
        this.f29739d.mo5313d(c0843g0.f5796a);
        this.f29743h.m387q(c0111o, 4);
    }

    @Override // p027b9.C0839e0.b
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo489r(C0843g0<AbstractC5207h> c0843g0, long j10, long j11) {
        AbstractC5207h m5360e = c0843g0.m5360e();
        boolean z10 = m5360e instanceof C5206g;
        C5205f m26023e = z10 ? C5205f.m26023e(m5360e.f29831a) : (C5205f) m5360e;
        this.f29747l = m26023e;
        this.f29748m = m26023e.f29770e.get(0).f29783a;
        this.f29741f.add(new b());
        m25975E(m26023e.f29769d);
        C0111o c0111o = new C0111o(c0843g0.f5796a, c0843g0.f5797b, c0843g0.m5361f(), c0843g0.m5359d(), j10, j11, c0843g0.m5358b());
        c cVar = this.f29740e.get(this.f29748m);
        if (z10) {
            cVar.m26019w((C5206g) m5360e, c0111o);
        } else {
            cVar.m26012n();
        }
        this.f29739d.mo5313d(c0843g0.f5796a);
        this.f29743h.m390t(c0111o, 4);
    }

    @Override // p027b9.C0839e0.b
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public C0839e0.c mo486o(C0843g0<AbstractC5207h> c0843g0, long j10, long j11, IOException iOException, int i10) {
        C0111o c0111o = new C0111o(c0843g0.f5796a, c0843g0.f5797b, c0843g0.m5361f(), c0843g0.m5359d(), j10, j11, c0843g0.m5358b());
        long mo5310a = this.f29739d.mo5310a(new InterfaceC0837d0.c(c0111o, new C0117r(c0843g0.f5798c), iOException, i10));
        boolean z10 = mo5310a == -9223372036854775807L;
        this.f29743h.m394x(c0111o, c0843g0.f5798c, iOException, z10);
        if (z10) {
            this.f29739d.mo5313d(c0843g0.f5796a);
        }
        return z10 ? C0839e0.f5771g : C0839e0.m5319h(false, mo5310a);
    }

    /* renamed from: R */
    public final void m25987R(Uri uri, C5206g c5206g) {
        if (uri.equals(this.f29748m)) {
            if (this.f29749n == null) {
                this.f29750o = !c5206g.f29800o;
                this.f29751p = c5206g.f29793h;
            }
            this.f29749n = c5206g;
            this.f29746k.mo12256b(c5206g);
        }
        Iterator<InterfaceC5210k.b> it = this.f29741f.iterator();
        while (it.hasNext()) {
            it.next().mo25075e();
        }
    }

    @Override // p146i8.InterfaceC5210k
    /* renamed from: a */
    public void mo25988a(InterfaceC5210k.b bVar) {
        this.f29741f.remove(bVar);
    }

    @Override // p146i8.InterfaceC5210k
    /* renamed from: b */
    public void mo25989b(Uri uri) {
        this.f29740e.get(uri).m26015s();
    }

    @Override // p146i8.InterfaceC5210k
    /* renamed from: c */
    public long mo25990c() {
        return this.f29751p;
    }

    @Override // p146i8.InterfaceC5210k
    /* renamed from: d */
    public C5205f mo25991d() {
        return this.f29747l;
    }

    @Override // p146i8.InterfaceC5210k
    /* renamed from: e */
    public void mo25992e(Uri uri) {
        this.f29740e.get(uri).m26012n();
    }

    @Override // p146i8.InterfaceC5210k
    /* renamed from: f */
    public void mo25993f(Uri uri, InterfaceC0090d0.a aVar, InterfaceC5210k.e eVar) {
        this.f29745j = C4401z0.m22421y();
        this.f29743h = aVar;
        this.f29746k = eVar;
        C0843g0 c0843g0 = new C0843g0(this.f29737b.mo25015a(4), uri, 4, this.f29738c.mo25956a());
        C4349a.m21884g(this.f29744i == null);
        C0839e0 c0839e0 = new C0839e0("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.f29744i = c0839e0;
        aVar.m396z(new C0111o(c0843g0.f5796a, c0843g0.f5797b, c0839e0.m5328n(c0843g0, this, this.f29739d.mo5311b(c0843g0.f5798c))), c0843g0.f5798c);
    }

    @Override // p146i8.InterfaceC5210k
    /* renamed from: g */
    public boolean mo25994g(Uri uri) {
        return this.f29740e.get(uri).m26011l();
    }

    @Override // p146i8.InterfaceC5210k
    /* renamed from: h */
    public boolean mo25995h() {
        return this.f29750o;
    }

    @Override // p146i8.InterfaceC5210k
    /* renamed from: i */
    public boolean mo25996i(Uri uri, long j10) {
        if (this.f29740e.get(uri) != null) {
            return !r0.m26008h(j10);
        }
        return false;
    }

    @Override // p146i8.InterfaceC5210k
    /* renamed from: j */
    public void mo25997j() {
        C0839e0 c0839e0 = this.f29744i;
        if (c0839e0 != null) {
            c0839e0.mo5320a();
        }
        Uri uri = this.f29748m;
        if (uri != null) {
            mo25989b(uri);
        }
    }

    @Override // p146i8.InterfaceC5210k
    /* renamed from: l */
    public void mo25998l(InterfaceC5210k.b bVar) {
        C4349a.m21882e(bVar);
        this.f29741f.add(bVar);
    }

    @Override // p146i8.InterfaceC5210k
    /* renamed from: m */
    public C5206g mo25999m(Uri uri, boolean z10) {
        C5206g m26010j = this.f29740e.get(uri).m26010j();
        if (m26010j != null && z10) {
            m25982M(uri);
        }
        return m26010j;
    }

    @Override // p146i8.InterfaceC5210k
    public void stop() {
        this.f29748m = null;
        this.f29749n = null;
        this.f29747l = null;
        this.f29751p = -9223372036854775807L;
        this.f29744i.m5326l();
        this.f29744i = null;
        Iterator<c> it = this.f29740e.values().iterator();
        while (it.hasNext()) {
            it.next().m26020x();
        }
        this.f29745j.removeCallbacksAndMessages(null);
        this.f29745j = null;
        this.f29740e.clear();
    }
}
