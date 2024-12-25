package p113g7;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p057d7.C4328k;
import p057d7.C4334q;
import p057d7.InterfaceC4323f;
import p057d7.InterfaceC4324g;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4329l;
import p059d9.C4349a;
import p059d9.C4361f0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:g7/c.class
 */
/* renamed from: g7.c */
/* loaded from: combined.jar:classes2.jar:g7/c.class */
public final class C4964c implements InterfaceC4323f {

    /* renamed from: q */
    public static final InterfaceC4329l f28777q = new InterfaceC4329l() { // from class: g7.b
        @Override // p057d7.InterfaceC4329l
        /* renamed from: a */
        public /* synthetic */ InterfaceC4323f[] mo12020a(Uri uri, Map map) {
            return C4328k.m21824a(this, uri, map);
        }

        @Override // p057d7.InterfaceC4329l
        /* renamed from: b */
        public final InterfaceC4323f[] mo12021b() {
            InterfaceC4323f[] m24987g;
            m24987g = C4964c.m24987g();
            return m24987g;
        }
    };

    /* renamed from: f */
    public InterfaceC4325h f28783f;

    /* renamed from: h */
    public boolean f28785h;

    /* renamed from: i */
    public long f28786i;

    /* renamed from: j */
    public int f28787j;

    /* renamed from: k */
    public int f28788k;

    /* renamed from: l */
    public int f28789l;

    /* renamed from: m */
    public long f28790m;

    /* renamed from: n */
    public boolean f28791n;

    /* renamed from: o */
    public C4962a f28792o;

    /* renamed from: p */
    public C4967f f28793p;

    /* renamed from: a */
    public final C4361f0 f28778a = new C4361f0(4);

    /* renamed from: b */
    public final C4361f0 f28779b = new C4361f0(9);

    /* renamed from: c */
    public final C4361f0 f28780c = new C4361f0(11);

    /* renamed from: d */
    public final C4361f0 f28781d = new C4361f0();

    /* renamed from: e */
    public final C4965d f28782e = new C4965d();

    /* renamed from: g */
    public int f28784g = 1;

    /* renamed from: g */
    public static /* synthetic */ InterfaceC4323f[] m24987g() {
        return new InterfaceC4323f[]{new C4964c()};
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: a */
    public void mo12027a(long j10, long j11) {
        if (j10 == 0) {
            this.f28784g = 1;
            this.f28785h = false;
        } else {
            this.f28784g = 3;
        }
        this.f28787j = 0;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: c */
    public void mo12028c(InterfaceC4325h interfaceC4325h) {
        this.f28783f = interfaceC4325h;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: d */
    public boolean mo12029d(InterfaceC4324g interfaceC4324g) {
        boolean z10 = false;
        interfaceC4324g.mo21811q(this.f28778a.m21988d(), 0, 3);
        this.f28778a.m21983P(0);
        if (this.f28778a.m21974G() != 4607062) {
            return false;
        }
        interfaceC4324g.mo21811q(this.f28778a.m21988d(), 0, 2);
        this.f28778a.m21983P(0);
        if ((this.f28778a.m21977J() & 250) != 0) {
            return false;
        }
        interfaceC4324g.mo21811q(this.f28778a.m21988d(), 0, 4);
        this.f28778a.m21983P(0);
        int m21998n = this.f28778a.m21998n();
        interfaceC4324g.mo21801f();
        interfaceC4324g.mo21805k(m21998n);
        interfaceC4324g.mo21811q(this.f28778a.m21988d(), 0, 4);
        this.f28778a.m21983P(0);
        if (this.f28778a.m21998n() == 0) {
            z10 = true;
        }
        return z10;
    }

    @RequiresNonNull({"extractorOutput"})
    /* renamed from: e */
    public final void m24988e() {
        if (this.f28791n) {
            return;
        }
        this.f28783f.mo487p(new InterfaceC2348g.b(-9223372036854775807L));
        this.f28791n = true;
    }

    /* renamed from: f */
    public final long m24989f() {
        return this.f28785h ? this.f28786i + this.f28790m : this.f28782e.m25004d() == -9223372036854775807L ? 0L : this.f28790m;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: h */
    public int mo12033h(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        C4349a.m21886i(this.f28783f);
        while (true) {
            int i10 = this.f28784g;
            if (i10 != 1) {
                if (i10 == 2) {
                    m24994m(interfaceC4324g);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    if (m24992k(interfaceC4324g)) {
                        return 0;
                    }
                } else if (!m24993l(interfaceC4324g)) {
                    return -1;
                }
            } else if (!m24991j(interfaceC4324g)) {
                return -1;
            }
        }
    }

    /* renamed from: i */
    public final C4361f0 m24990i(InterfaceC4324g interfaceC4324g) {
        if (this.f28789l > this.f28781d.m21986b()) {
            C4361f0 c4361f0 = this.f28781d;
            c4361f0.m21981N(new byte[Math.max(c4361f0.m21986b() * 2, this.f28789l)], 0);
        } else {
            this.f28781d.m21983P(0);
        }
        this.f28781d.m21982O(this.f28789l);
        interfaceC4324g.readFully(this.f28781d.m21988d(), 0, this.f28789l);
        return this.f28781d;
    }

    @RequiresNonNull({"extractorOutput"})
    /* renamed from: j */
    public final boolean m24991j(InterfaceC4324g interfaceC4324g) {
        boolean z10 = false;
        if (!interfaceC4324g.mo21802g(this.f28779b.m21988d(), 0, 9, true)) {
            return false;
        }
        this.f28779b.m21983P(0);
        this.f28779b.m21984Q(4);
        int m21971D = this.f28779b.m21971D();
        boolean z11 = (m21971D & 4) != 0;
        if ((m21971D & 1) != 0) {
            z10 = true;
        }
        if (z11 && this.f28792o == null) {
            this.f28792o = new C4962a(this.f28783f.mo479e(8, 1));
        }
        if (z10 && this.f28793p == null) {
            this.f28793p = new C4967f(this.f28783f.mo479e(9, 2));
        }
        this.f28783f.mo491u();
        this.f28787j = (this.f28779b.m21998n() - 9) + 4;
        this.f28784g = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e3  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m24992k(p057d7.InterfaceC4324g r9) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p113g7.C4964c.m24992k(d7.g):boolean");
    }

    /* renamed from: l */
    public final boolean m24993l(InterfaceC4324g interfaceC4324g) {
        if (!interfaceC4324g.mo21802g(this.f28780c.m21988d(), 0, 11, true)) {
            return false;
        }
        this.f28780c.m21983P(0);
        this.f28788k = this.f28780c.m21971D();
        this.f28789l = this.f28780c.m21974G();
        this.f28790m = this.f28780c.m21974G();
        this.f28790m = ((this.f28780c.m21971D() << 24) | this.f28790m) * 1000;
        this.f28780c.m21984Q(3);
        this.f28784g = 4;
        return true;
    }

    /* renamed from: m */
    public final void m24994m(InterfaceC4324g interfaceC4324g) {
        interfaceC4324g.mo21809o(this.f28787j);
        this.f28787j = 0;
        this.f28784g = 3;
    }

    @Override // p057d7.InterfaceC4323f
    public void release() {
    }
}
