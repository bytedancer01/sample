package p076e7;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.C2344c;
import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p057d7.C4328k;
import p057d7.C4334q;
import p057d7.InterfaceC4323f;
import p057d7.InterfaceC4324g;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4329l;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4401z0;
import p267p6.C7594k1;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e7/b.class
 */
/* renamed from: e7.b */
/* loaded from: combined.jar:classes2.jar:e7/b.class */
public final class C4647b implements InterfaceC4323f {

    /* renamed from: r */
    public static final int[] f27382r;

    /* renamed from: u */
    public static final int f27385u;

    /* renamed from: a */
    public final byte[] f27386a;

    /* renamed from: b */
    public final int f27387b;

    /* renamed from: c */
    public boolean f27388c;

    /* renamed from: d */
    public long f27389d;

    /* renamed from: e */
    public int f27390e;

    /* renamed from: f */
    public int f27391f;

    /* renamed from: g */
    public boolean f27392g;

    /* renamed from: h */
    public long f27393h;

    /* renamed from: i */
    public int f27394i;

    /* renamed from: j */
    public int f27395j;

    /* renamed from: k */
    public long f27396k;

    /* renamed from: l */
    public InterfaceC4325h f27397l;

    /* renamed from: m */
    public InterfaceC4337t f27398m;

    /* renamed from: n */
    public InterfaceC2348g f27399n;

    /* renamed from: o */
    public boolean f27400o;

    /* renamed from: p */
    public static final InterfaceC4329l f27380p = new InterfaceC4329l() { // from class: e7.a
        @Override // p057d7.InterfaceC4329l
        /* renamed from: a */
        public /* synthetic */ InterfaceC4323f[] mo12020a(Uri uri, Map map) {
            return C4328k.m21824a(this, uri, map);
        }

        @Override // p057d7.InterfaceC4329l
        /* renamed from: b */
        public final InterfaceC4323f[] mo12021b() {
            InterfaceC4323f[] m23282m;
            m23282m = C4647b.m23282m();
            return m23282m;
        }
    };

    /* renamed from: q */
    public static final int[] f27381q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: s */
    public static final byte[] f27383s = C4401z0.m22396l0("#!AMR\n");

    /* renamed from: t */
    public static final byte[] f27384t = C4401z0.m22396l0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f27382r = iArr;
        f27385u = iArr[8];
    }

    public C4647b() {
        this(0);
    }

    public C4647b(int i10) {
        this.f27387b = i10;
        this.f27386a = new byte[1];
        this.f27394i = -1;
    }

    /* renamed from: f */
    public static int m23281f(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }

    /* renamed from: m */
    public static /* synthetic */ InterfaceC4323f[] m23282m() {
        return new InterfaceC4323f[]{new C4647b()};
    }

    /* renamed from: p */
    public static boolean m23283p(InterfaceC4324g interfaceC4324g, byte[] bArr) {
        interfaceC4324g.mo21801f();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC4324g.mo21811q(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: a */
    public void mo12027a(long j10, long j11) {
        this.f27389d = 0L;
        this.f27390e = 0;
        this.f27391f = 0;
        if (j10 != 0) {
            InterfaceC2348g interfaceC2348g = this.f27399n;
            if (interfaceC2348g instanceof C2344c) {
                this.f27396k = ((C2344c) interfaceC2348g).m12097c(j10);
                return;
            }
        }
        this.f27396k = 0L;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: c */
    public void mo12028c(InterfaceC4325h interfaceC4325h) {
        this.f27397l = interfaceC4325h;
        this.f27398m = interfaceC4325h.mo479e(0, 1);
        interfaceC4325h.mo491u();
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: d */
    public boolean mo12029d(InterfaceC4324g interfaceC4324g) {
        return m23293r(interfaceC4324g);
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    /* renamed from: e */
    public final void m23284e() {
        C4349a.m21886i(this.f27398m);
        C4401z0.m22391j(this.f27397l);
    }

    /* renamed from: g */
    public final InterfaceC2348g m23285g(long j10) {
        return new C2344c(j10, this.f27393h, m23281f(this.f27394i, 20000L), this.f27394i);
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: h */
    public int mo12033h(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        m23284e();
        if (interfaceC4324g.getPosition() == 0 && !m23293r(interfaceC4324g)) {
            throw C7594k1.m32822a("Could not find AMR header.", null);
        }
        m23290n();
        int m23294s = m23294s(interfaceC4324g);
        m23291o(interfaceC4324g.getLength(), m23294s);
        return m23294s;
    }

    /* renamed from: i */
    public final int m23286i(int i10) {
        if (m23288k(i10)) {
            return this.f27388c ? f27382r[i10] : f27381q[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f27388c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw C7594k1.m32822a(sb2.toString(), null);
    }

    /* renamed from: j */
    public final boolean m23287j(int i10) {
        return !this.f27388c && (i10 < 12 || i10 > 14);
    }

    /* renamed from: k */
    public final boolean m23288k(int i10) {
        return i10 >= 0 && i10 <= 15 && (m23289l(i10) || m23287j(i10));
    }

    /* renamed from: l */
    public final boolean m23289l(int i10) {
        return this.f27388c && (i10 < 10 || i10 > 13);
    }

    @RequiresNonNull({"trackOutput"})
    /* renamed from: n */
    public final void m23290n() {
        if (this.f27400o) {
            return;
        }
        this.f27400o = true;
        boolean z10 = this.f27388c;
        this.f27398m.mo608f(new C7629w0.b().m33220e0(z10 ? "audio/amr-wb" : "audio/3gpp").m33212W(f27385u).m33197H(1).m33221f0(z10 ? 16000 : 8000).m33194E());
    }

    @RequiresNonNull({"extractorOutput"})
    /* renamed from: o */
    public final void m23291o(long j10, int i10) {
        InterfaceC2348g bVar;
        int i11;
        if (this.f27392g) {
            return;
        }
        if ((this.f27387b & 1) == 0 || j10 == -1 || !((i11 = this.f27394i) == -1 || i11 == this.f27390e)) {
            bVar = new InterfaceC2348g.b(-9223372036854775807L);
        } else if (this.f27395j < 20 && i10 != -1) {
            return;
        } else {
            bVar = m23285g(j10);
        }
        this.f27399n = bVar;
        this.f27397l.mo487p(bVar);
        this.f27392g = true;
    }

    /* renamed from: q */
    public final int m23292q(InterfaceC4324g interfaceC4324g) {
        interfaceC4324g.mo21801f();
        interfaceC4324g.mo21811q(this.f27386a, 0, 1);
        byte b10 = this.f27386a[0];
        if ((b10 & 131) <= 0) {
            return m23286i((b10 >> 3) & 15);
        }
        throw C7594k1.m32822a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    /* renamed from: r */
    public final boolean m23293r(InterfaceC4324g interfaceC4324g) {
        int length;
        byte[] bArr = f27383s;
        if (m23283p(interfaceC4324g, bArr)) {
            this.f27388c = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = f27384t;
            if (!m23283p(interfaceC4324g, bArr2)) {
                return false;
            }
            this.f27388c = true;
            length = bArr2.length;
        }
        interfaceC4324g.mo21809o(length);
        return true;
    }

    @Override // p057d7.InterfaceC4323f
    public void release() {
    }

    @RequiresNonNull({"trackOutput"})
    /* renamed from: s */
    public final int m23294s(InterfaceC4324g interfaceC4324g) {
        if (this.f27391f == 0) {
            try {
                int m23292q = m23292q(interfaceC4324g);
                this.f27390e = m23292q;
                this.f27391f = m23292q;
                if (this.f27394i == -1) {
                    this.f27393h = interfaceC4324g.getPosition();
                    this.f27394i = this.f27390e;
                }
                if (this.f27394i == this.f27390e) {
                    this.f27395j++;
                }
            } catch (EOFException e10) {
                return -1;
            }
        }
        int mo604d = this.f27398m.mo604d(interfaceC4324g, this.f27391f, true);
        if (mo604d == -1) {
            return -1;
        }
        int i10 = this.f27391f - mo604d;
        this.f27391f = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f27398m.mo600b(this.f27396k + this.f27389d, 1, this.f27390e, 0, null);
        this.f27389d += 20000;
        return 0;
    }
}
