package p228n7;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.C2344c;
import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import java.io.EOFException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p057d7.C4328k;
import p057d7.C4334q;
import p057d7.InterfaceC4323f;
import p057d7.InterfaceC4324g;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4329l;
import p059d9.C4349a;
import p059d9.C4359e0;
import p059d9.C4361f0;
import p228n7.InterfaceC6677i0;
import p267p6.C7594k1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/h.class
 */
/* renamed from: n7.h */
/* loaded from: combined.jar:classes2.jar:n7/h.class */
public final class C6674h implements InterfaceC4323f {

    /* renamed from: m */
    public static final InterfaceC4329l f34764m = new InterfaceC4329l() { // from class: n7.g
        @Override // p057d7.InterfaceC4329l
        /* renamed from: a */
        public /* synthetic */ InterfaceC4323f[] mo12020a(Uri uri, Map map) {
            return C4328k.m21824a(this, uri, map);
        }

        @Override // p057d7.InterfaceC4329l
        /* renamed from: b */
        public final InterfaceC4323f[] mo12021b() {
            InterfaceC4323f[] m30707i;
            m30707i = C6674h.m30707i();
            return m30707i;
        }
    };

    /* renamed from: a */
    public final int f34765a;

    /* renamed from: b */
    public final C6676i f34766b;

    /* renamed from: c */
    public final C4361f0 f34767c;

    /* renamed from: d */
    public final C4361f0 f34768d;

    /* renamed from: e */
    public final C4359e0 f34769e;

    /* renamed from: f */
    public InterfaceC4325h f34770f;

    /* renamed from: g */
    public long f34771g;

    /* renamed from: h */
    public long f34772h;

    /* renamed from: i */
    public int f34773i;

    /* renamed from: j */
    public boolean f34774j;

    /* renamed from: k */
    public boolean f34775k;

    /* renamed from: l */
    public boolean f34776l;

    public C6674h() {
        this(0);
    }

    public C6674h(int i10) {
        this.f34765a = i10;
        this.f34766b = new C6676i(true);
        this.f34767c = new C4361f0(2048);
        this.f34773i = -1;
        this.f34772h = -1L;
        C4361f0 c4361f0 = new C4361f0(10);
        this.f34768d = c4361f0;
        this.f34769e = new C4359e0(c4361f0.m21988d());
    }

    /* renamed from: f */
    public static int m30706f(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }

    /* renamed from: i */
    public static /* synthetic */ InterfaceC4323f[] m30707i() {
        return new InterfaceC4323f[]{new C6674h()};
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: a */
    public void mo12027a(long j10, long j11) {
        this.f34775k = false;
        this.f34766b.mo30679c();
        this.f34771g = j11;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: c */
    public void mo12028c(InterfaceC4325h interfaceC4325h) {
        this.f34770f = interfaceC4325h;
        this.f34766b.mo30680d(interfaceC4325h, new InterfaceC6677i0.d(0, 1));
        interfaceC4325h.mo491u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r6.mo21801f();
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if ((r7 - r0) < 8192) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        return false;
     */
    @Override // p057d7.InterfaceC4323f
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo12029d(p057d7.InterfaceC4324g r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            int r0 = r0.m30711k(r1)
            r10 = r0
            r0 = r10
            r7 = r0
        La:
            r0 = 0
            r9 = r0
            r0 = 0
            r8 = r0
        Lf:
            r0 = r6
            r1 = r5
            d9.f0 r1 = r1.f34768d
            byte[] r1 = r1.m21988d()
            r2 = 0
            r3 = 2
            r0.mo21811q(r1, r2, r3)
            r0 = r5
            d9.f0 r0 = r0.f34768d
            r1 = 0
            r0.m21983P(r1)
            r0 = r5
            d9.f0 r0 = r0.f34768d
            int r0 = r0.m21977J()
            boolean r0 = p228n7.C6676i.m30735m(r0)
            if (r0 != 0) goto L52
            r0 = r6
            r0.mo21801f()
            int r7 = r7 + 1
            r0 = r7
            r1 = r10
            int r0 = r0 - r1
            r1 = 8192(0x2000, float:1.148E-41)
            if (r0 < r1) goto L48
            r0 = 0
            return r0
        L48:
            r0 = r6
            r1 = r7
            r0.mo21805k(r1)
            goto La
        L52:
            int r9 = r9 + 1
            r0 = r9
            r1 = 4
            if (r0 < r1) goto L64
            r0 = r8
            r1 = 188(0xbc, float:2.63E-43)
            if (r0 <= r1) goto L64
            r0 = 1
            return r0
        L64:
            r0 = r6
            r1 = r5
            d9.f0 r1 = r1.f34768d
            byte[] r1 = r1.m21988d()
            r2 = 0
            r3 = 4
            r0.mo21811q(r1, r2, r3)
            r0 = r5
            d9.e0 r0 = r0.f34769e
            r1 = 14
            r0.m21958p(r1)
            r0 = r5
            d9.e0 r0 = r0.f34769e
            r1 = 13
            int r0 = r0.m21950h(r1)
            r11 = r0
            r0 = r11
            r1 = 6
            if (r0 > r1) goto L90
            r0 = 0
            return r0
        L90:
            r0 = r6
            r1 = r11
            r2 = 6
            int r1 = r1 - r2
            r0.mo21805k(r1)
            r0 = r8
            r1 = r11
            int r0 = r0 + r1
            r8 = r0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: p228n7.C6674h.mo12029d(d7.g):boolean");
    }

    /* renamed from: e */
    public final void m30708e(InterfaceC4324g interfaceC4324g) {
        int i10;
        long j10;
        int m21950h;
        if (this.f34774j) {
            return;
        }
        this.f34773i = -1;
        interfaceC4324g.mo21801f();
        long j11 = 0;
        if (interfaceC4324g.getPosition() == 0) {
            m30711k(interfaceC4324g);
        }
        int i11 = 0;
        do {
            int i12 = i11;
            long j12 = j11;
            i10 = i11;
            j10 = j11;
            try {
                if (!interfaceC4324g.mo21800d(this.f34768d.m21988d(), 0, 2, true)) {
                    break;
                }
                int i13 = i11;
                this.f34768d.m21983P(0);
                int i14 = i11;
                if (!C6676i.m30735m(this.f34768d.m21977J())) {
                    i10 = 0;
                    break;
                }
                if (!interfaceC4324g.mo21800d(this.f34768d.m21988d(), 0, 4, true)) {
                    i10 = i11;
                    j10 = j11;
                    break;
                }
                this.f34769e.m21958p(14);
                int i15 = i11;
                m21950h = this.f34769e.m21950h(13);
                if (m21950h <= 6) {
                    this.f34774j = true;
                    i12 = i11;
                    j12 = j11;
                    throw C7594k1.m32822a("Malformed ADTS stream", null);
                }
                j10 = j11 + m21950h;
                i10 = i11 + 1;
                if (i10 == 1000) {
                    break;
                }
                i11 = i10;
                j11 = j10;
            } catch (EOFException e10) {
                j10 = j12;
                i10 = i12;
            }
        } while (interfaceC4324g.mo21810p(m21950h - 6, true));
        j11 = j10;
        interfaceC4324g.mo21801f();
        if (i10 > 0) {
            this.f34773i = (int) (j11 / i10);
        } else {
            this.f34773i = -1;
        }
        this.f34774j = true;
    }

    /* renamed from: g */
    public final InterfaceC2348g m30709g(long j10) {
        return new C2344c(j10, this.f34772h, m30706f(this.f34773i, this.f34766b.m30741k()), this.f34773i);
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: h */
    public int mo12033h(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        C4349a.m21886i(this.f34770f);
        long length = interfaceC4324g.getLength();
        boolean z10 = ((this.f34765a & 1) == 0 || length == -1) ? false : true;
        if (z10) {
            m30708e(interfaceC4324g);
        }
        int read = interfaceC4324g.read(this.f34767c.m21988d(), 0, 2048);
        boolean z11 = read == -1;
        m30710j(length, z10, z11);
        if (z11) {
            return -1;
        }
        this.f34767c.m21983P(0);
        this.f34767c.m21982O(read);
        if (!this.f34775k) {
            this.f34766b.mo30682f(this.f34771g, 4);
            this.f34775k = true;
        }
        this.f34766b.mo30677a(this.f34767c);
        return 0;
    }

    @RequiresNonNull({"extractorOutput"})
    /* renamed from: j */
    public final void m30710j(long j10, boolean z10, boolean z11) {
        if (this.f34776l) {
            return;
        }
        boolean z12 = z10 && this.f34773i > 0;
        if (z12 && this.f34766b.m30741k() == -9223372036854775807L && !z11) {
            return;
        }
        if (!z12 || this.f34766b.m30741k() == -9223372036854775807L) {
            this.f34770f.mo487p(new InterfaceC2348g.b(-9223372036854775807L));
        } else {
            this.f34770f.mo487p(m30709g(j10));
        }
        this.f34776l = true;
    }

    /* renamed from: k */
    public final int m30711k(InterfaceC4324g interfaceC4324g) {
        int i10 = 0;
        while (true) {
            interfaceC4324g.mo21811q(this.f34768d.m21988d(), 0, 10);
            this.f34768d.m21983P(0);
            if (this.f34768d.m21974G() != 4801587) {
                break;
            }
            this.f34768d.m21984Q(3);
            int m21970C = this.f34768d.m21970C();
            i10 += m21970C + 10;
            interfaceC4324g.mo21805k(m21970C);
        }
        interfaceC4324g.mo21801f();
        interfaceC4324g.mo21805k(i10);
        if (this.f34772h == -1) {
            this.f34772h = i10;
        }
        return i10;
    }

    @Override // p057d7.InterfaceC4323f
    public void release() {
    }
}
