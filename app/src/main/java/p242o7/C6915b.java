package p242o7;

import android.net.Uri;
import android.util.Pair;
import java.util.Map;
import org.apache.commons.net.imap.IMAP;
import org.apache.commons.net.telnet.TelnetCommand;
import org.apache.http.HttpStatus;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p057d7.C4328k;
import p057d7.C4334q;
import p057d7.InterfaceC4323f;
import p057d7.InterfaceC4324g;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4329l;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4361f0;
import p059d9.C4401z0;
import p267p6.C7594k1;
import p267p6.C7629w0;
import p301r6.C7999q0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:o7/b.class
 */
/* renamed from: o7.b */
/* loaded from: combined.jar:classes2.jar:o7/b.class */
public final class C6915b implements InterfaceC4323f {

    /* renamed from: f */
    public static final InterfaceC4329l f35752f = new InterfaceC4329l() { // from class: o7.a
        @Override // p057d7.InterfaceC4329l
        /* renamed from: a */
        public /* synthetic */ InterfaceC4323f[] mo12020a(Uri uri, Map map) {
            return C4328k.m21824a(this, uri, map);
        }

        @Override // p057d7.InterfaceC4329l
        /* renamed from: b */
        public final InterfaceC4323f[] mo12021b() {
            InterfaceC4323f[] m31841f;
            m31841f = C6915b.m31841f();
            return m31841f;
        }
    };

    /* renamed from: a */
    public InterfaceC4325h f35753a;

    /* renamed from: b */
    public InterfaceC4337t f35754b;

    /* renamed from: c */
    public b f35755c;

    /* renamed from: d */
    public int f35756d = -1;

    /* renamed from: e */
    public long f35757e = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:o7/b$a.class
     */
    /* renamed from: o7.b$a */
    /* loaded from: combined.jar:classes2.jar:o7/b$a.class */
    public static final class a implements b {

        /* renamed from: m */
        public static final int[] f35758m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n */
        public static final int[] f35759n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, IMAP.DEFAULT_PORT, 157, 173, 190, 209, 230, TelnetCommand.f36137DO, 279, HttpStatus.SC_TEMPORARY_REDIRECT, 337, 371, HttpStatus.SC_REQUEST_TIMEOUT, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a */
        public final InterfaceC4325h f35760a;

        /* renamed from: b */
        public final InterfaceC4337t f35761b;

        /* renamed from: c */
        public final C6916c f35762c;

        /* renamed from: d */
        public final int f35763d;

        /* renamed from: e */
        public final byte[] f35764e;

        /* renamed from: f */
        public final C4361f0 f35765f;

        /* renamed from: g */
        public final int f35766g;

        /* renamed from: h */
        public final C7629w0 f35767h;

        /* renamed from: i */
        public int f35768i;

        /* renamed from: j */
        public long f35769j;

        /* renamed from: k */
        public int f35770k;

        /* renamed from: l */
        public long f35771l;

        public a(InterfaceC4325h interfaceC4325h, InterfaceC4337t interfaceC4337t, C6916c c6916c) {
            this.f35760a = interfaceC4325h;
            this.f35761b = interfaceC4337t;
            this.f35762c = c6916c;
            int max = Math.max(1, c6916c.f35782c / 10);
            this.f35766g = max;
            C4361f0 c4361f0 = new C4361f0(c6916c.f35786g);
            c4361f0.m22006v();
            int m22006v = c4361f0.m22006v();
            this.f35763d = m22006v;
            int i10 = c6916c.f35781b;
            int i11 = (((c6916c.f35784e - (i10 * 4)) * 8) / (c6916c.f35785f * i10)) + 1;
            if (m22006v == i11) {
                int m22395l = C4401z0.m22395l(max, m22006v);
                this.f35764e = new byte[c6916c.f35784e * m22395l];
                this.f35765f = new C4361f0(m22395l * m31843h(m22006v, i10));
                int i12 = ((c6916c.f35782c * c6916c.f35784e) * 8) / m22006v;
                this.f35767h = new C7629w0.b().m33220e0("audio/raw").m33196G(i12).m33215Z(i12).m33212W(m31843h(max, i10)).m33197H(c6916c.f35781b).m33221f0(c6916c.f35782c).m33214Y(2).m33194E();
                return;
            }
            throw C7594k1.m32822a("Expected frames per block: " + i11 + "; got: " + m22006v, null);
        }

        /* renamed from: h */
        public static int m31843h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        @Override // p242o7.C6915b.b
        /* renamed from: a */
        public void mo31844a(int i10, long j10) {
            this.f35760a.mo487p(new C6918e(this.f35762c, this.f35763d, i10, j10));
            this.f35761b.mo608f(this.f35767h);
        }

        @Override // p242o7.C6915b.b
        /* renamed from: b */
        public void mo31845b(long j10) {
            this.f35768i = 0;
            this.f35769j = j10;
            this.f35770k = 0;
            this.f35771l = 0L;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0067 A[LOOP:0: B:5:0x002d->B:11:0x0067, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0061 -> B:3:0x0024). Please report as a decompilation issue!!! */
        @Override // p242o7.C6915b.b
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo31846c(p057d7.InterfaceC4324g r6, long r7) {
            /*
                Method dump skipped, instructions count: 264
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p242o7.C6915b.a.mo31846c(d7.g, long):boolean");
        }

        /* renamed from: d */
        public final void m31847d(byte[] bArr, int i10, C4361f0 c4361f0) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f35762c.f35781b; i12++) {
                    m31848e(bArr, i11, i12, c4361f0.m21988d());
                }
            }
            int m31850g = m31850g(this.f35763d * i10);
            c4361f0.m21983P(0);
            c4361f0.m21982O(m31850g);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v44, types: [int] */
        /* JADX WARN: Type inference failed for: r0v50, types: [int] */
        /* JADX WARN: Type inference failed for: r0v64, types: [int] */
        /* renamed from: e */
        public final void m31848e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            C6916c c6916c = this.f35762c;
            int i12 = c6916c.f35784e;
            int i13 = c6916c.f35781b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = i12 / i13;
            short s10 = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int min = Math.min(bArr[i14 + 2] & 255, 88);
            int i16 = f35759n[min];
            int i17 = ((i10 * this.f35763d * i13) + i11) * 2;
            bArr2[i17] = (byte) (s10 & 255);
            bArr2[i17 + 1] = (byte) (s10 >> 8);
            for (int i18 = 0; i18 < (i15 - 4) * 2; i18++) {
                int i19 = bArr[((i18 / 8) * i13 * 4) + (i13 * 4) + i14 + ((i18 / 2) % 4)] & 255;
                int i20 = i18 % 2 == 0 ? i19 & 15 : i19 >> 4;
                ?? r02 = ((((i20 & 7) * 2) + 1) * i16) >> 3;
                short s11 = r02;
                if ((i20 & 8) != 0) {
                    s11 = -r02;
                }
                s10 = C4401z0.m22409s(s10 + s11, -32768, 32767);
                i17 += i13 * 2;
                bArr2[i17] = (byte) (s10 & 255);
                bArr2[i17 + 1] = (byte) (s10 >> 8);
                int i21 = f35758m[i20];
                int[] iArr = f35759n;
                min = C4401z0.m22409s(min + i21, 0, iArr.length - 1);
                i16 = iArr[min];
            }
        }

        /* renamed from: f */
        public final int m31849f(int i10) {
            return i10 / (this.f35762c.f35781b * 2);
        }

        /* renamed from: g */
        public final int m31850g(int i10) {
            return m31843h(i10, this.f35762c.f35781b);
        }

        /* renamed from: i */
        public final void m31851i(int i10) {
            long j10 = this.f35769j;
            long m22346Q0 = C4401z0.m22346Q0(this.f35771l, 1000000L, this.f35762c.f35782c);
            int m31850g = m31850g(i10);
            this.f35761b.mo600b(j10 + m22346Q0, 1, m31850g, this.f35770k - m31850g, null);
            this.f35771l += i10;
            this.f35770k -= m31850g;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:o7/b$b.class
     */
    /* renamed from: o7.b$b */
    /* loaded from: combined.jar:classes2.jar:o7/b$b.class */
    public interface b {
        /* renamed from: a */
        void mo31844a(int i10, long j10);

        /* renamed from: b */
        void mo31845b(long j10);

        /* renamed from: c */
        boolean mo31846c(InterfaceC4324g interfaceC4324g, long j10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:o7/b$c.class
     */
    /* renamed from: o7.b$c */
    /* loaded from: combined.jar:classes2.jar:o7/b$c.class */
    public static final class c implements b {

        /* renamed from: a */
        public final InterfaceC4325h f35772a;

        /* renamed from: b */
        public final InterfaceC4337t f35773b;

        /* renamed from: c */
        public final C6916c f35774c;

        /* renamed from: d */
        public final C7629w0 f35775d;

        /* renamed from: e */
        public final int f35776e;

        /* renamed from: f */
        public long f35777f;

        /* renamed from: g */
        public int f35778g;

        /* renamed from: h */
        public long f35779h;

        public c(InterfaceC4325h interfaceC4325h, InterfaceC4337t interfaceC4337t, C6916c c6916c, String str, int i10) {
            this.f35772a = interfaceC4325h;
            this.f35773b = interfaceC4337t;
            this.f35774c = c6916c;
            int i11 = (c6916c.f35781b * c6916c.f35785f) / 8;
            if (c6916c.f35784e == i11) {
                int i12 = c6916c.f35782c;
                int i13 = i12 * i11 * 8;
                int max = Math.max(i11, (i12 * i11) / 10);
                this.f35776e = max;
                this.f35775d = new C7629w0.b().m33220e0(str).m33196G(i13).m33215Z(i13).m33212W(max).m33197H(c6916c.f35781b).m33221f0(c6916c.f35782c).m33214Y(i10).m33194E();
                return;
            }
            throw C7594k1.m32822a("Expected block size: " + i11 + "; got: " + c6916c.f35784e, null);
        }

        @Override // p242o7.C6915b.b
        /* renamed from: a */
        public void mo31844a(int i10, long j10) {
            this.f35772a.mo487p(new C6918e(this.f35774c, 1, i10, j10));
            this.f35773b.mo608f(this.f35775d);
        }

        @Override // p242o7.C6915b.b
        /* renamed from: b */
        public void mo31845b(long j10) {
            this.f35777f = j10;
            this.f35778g = 0;
            this.f35779h = 0L;
        }

        @Override // p242o7.C6915b.b
        /* renamed from: c */
        public boolean mo31846c(InterfaceC4324g interfaceC4324g, long j10) {
            boolean z10;
            long j11;
            int i10;
            int i11;
            while (true) {
                z10 = true;
                j11 = j10;
                if (j11 <= 0 || (i10 = this.f35778g) >= (i11 = this.f35776e)) {
                    break;
                }
                int mo604d = this.f35773b.mo604d(interfaceC4324g, (int) Math.min(i11 - i10, j10), true);
                if (mo604d == -1) {
                    j10 = 0;
                } else {
                    this.f35778g += mo604d;
                    j10 -= mo604d;
                }
            }
            int i12 = this.f35774c.f35784e;
            int i13 = this.f35778g / i12;
            if (i13 > 0) {
                long j12 = this.f35777f;
                long m22346Q0 = C4401z0.m22346Q0(this.f35779h, 1000000L, r0.f35782c);
                int i14 = i13 * i12;
                int i15 = this.f35778g - i14;
                this.f35773b.mo600b(j12 + m22346Q0, 1, i14, i15, null);
                this.f35779h += i13;
                this.f35778g = i15;
            }
            if (j11 > 0) {
                z10 = false;
            }
            return z10;
        }
    }

    /* renamed from: f */
    public static /* synthetic */ InterfaceC4323f[] m31841f() {
        return new InterfaceC4323f[]{new C6915b()};
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: a */
    public void mo12027a(long j10, long j11) {
        b bVar = this.f35755c;
        if (bVar != null) {
            bVar.mo31845b(j11);
        }
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: c */
    public void mo12028c(InterfaceC4325h interfaceC4325h) {
        this.f35753a = interfaceC4325h;
        this.f35754b = interfaceC4325h.mo479e(0, 1);
        interfaceC4325h.mo491u();
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: d */
    public boolean mo12029d(InterfaceC4324g interfaceC4324g) {
        return C6917d.m31852a(interfaceC4324g) != null;
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    /* renamed from: e */
    public final void m31842e() {
        C4349a.m21886i(this.f35754b);
        C4401z0.m22391j(this.f35753a);
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: h */
    public int mo12033h(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        b cVar;
        m31842e();
        if (this.f35755c == null) {
            C6916c m31852a = C6917d.m31852a(interfaceC4324g);
            if (m31852a == null) {
                throw C7594k1.m32822a("Unsupported or unrecognized wav header.", null);
            }
            int i10 = m31852a.f35780a;
            if (i10 == 17) {
                cVar = new a(this.f35753a, this.f35754b, m31852a);
            } else if (i10 == 6) {
                cVar = new c(this.f35753a, this.f35754b, m31852a, "audio/g711-alaw", -1);
            } else if (i10 == 7) {
                cVar = new c(this.f35753a, this.f35754b, m31852a, "audio/g711-mlaw", -1);
            } else {
                int m34779a = C7999q0.m34779a(i10, m31852a.f35785f);
                if (m34779a == 0) {
                    throw C7594k1.m32826e("Unsupported WAV format type: " + m31852a.f35780a);
                }
                cVar = new c(this.f35753a, this.f35754b, m31852a, "audio/raw", m34779a);
            }
            this.f35755c = cVar;
        }
        int i11 = -1;
        if (this.f35756d == -1) {
            Pair<Long, Long> m31853b = C6917d.m31853b(interfaceC4324g);
            this.f35756d = ((Long) m31853b.first).intValue();
            long longValue = ((Long) m31853b.second).longValue();
            this.f35757e = longValue;
            this.f35755c.mo31844a(this.f35756d, longValue);
        } else if (interfaceC4324g.getPosition() == 0) {
            interfaceC4324g.mo21809o(this.f35756d);
        }
        C4349a.m21884g(this.f35757e != -1);
        if (!this.f35755c.mo31846c(interfaceC4324g, this.f35757e - interfaceC4324g.getPosition())) {
            i11 = 0;
        }
        return i11;
    }

    @Override // p057d7.InterfaceC4323f
    public void release() {
    }
}
