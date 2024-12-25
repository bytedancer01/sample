package p145i7;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.C2343b;
import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.apache.http.impl.auth.NTLMEngineImpl;
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
import p059d9.C4350a0;
import p059d9.C4361f0;
import p059d9.C4392v;
import p059d9.C4394w;
import p059d9.C4401z0;
import p078e9.C4665b;
import p267p6.C7583h;
import p267p6.C7594k1;
import p301r6.C7968b;
import p365v6.C9273n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:i7/e.class
 */
/* renamed from: i7.e */
/* loaded from: combined.jar:classes2.jar:i7/e.class */
public class C5197e implements InterfaceC4323f {

    /* renamed from: b0 */
    public static final InterfaceC4329l f29612b0 = new InterfaceC4329l() { // from class: i7.d
        @Override // p057d7.InterfaceC4329l
        /* renamed from: a */
        public /* synthetic */ InterfaceC4323f[] mo12020a(Uri uri, Map map) {
            return C4328k.m21824a(this, uri, map);
        }

        @Override // p057d7.InterfaceC4329l
        /* renamed from: b */
        public final InterfaceC4323f[] mo12021b() {
            InterfaceC4323f[] m25898A;
            m25898A = C5197e.m25898A();
            return m25898A;
        }
    };

    /* renamed from: c0 */
    public static final byte[] f29613c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0 */
    public static final byte[] f29614d0 = C4401z0.m22396l0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e0 */
    public static final byte[] f29615e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: f0 */
    public static final UUID f29616f0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: g0 */
    public static final Map<String, Integer> f29617g0;

    /* renamed from: A */
    public long f29618A;

    /* renamed from: B */
    public long f29619B;

    /* renamed from: C */
    public C4394w f29620C;

    /* renamed from: D */
    public C4394w f29621D;

    /* renamed from: E */
    public boolean f29622E;

    /* renamed from: F */
    public boolean f29623F;

    /* renamed from: G */
    public int f29624G;

    /* renamed from: H */
    public long f29625H;

    /* renamed from: I */
    public long f29626I;

    /* renamed from: J */
    public int f29627J;

    /* renamed from: K */
    public int f29628K;

    /* renamed from: L */
    public int[] f29629L;

    /* renamed from: M */
    public int f29630M;

    /* renamed from: N */
    public int f29631N;

    /* renamed from: O */
    public int f29632O;

    /* renamed from: P */
    public int f29633P;

    /* renamed from: Q */
    public boolean f29634Q;

    /* renamed from: R */
    public int f29635R;

    /* renamed from: S */
    public int f29636S;

    /* renamed from: T */
    public int f29637T;

    /* renamed from: U */
    public boolean f29638U;

    /* renamed from: V */
    public boolean f29639V;

    /* renamed from: W */
    public boolean f29640W;

    /* renamed from: X */
    public int f29641X;

    /* renamed from: Y */
    public byte f29642Y;

    /* renamed from: Z */
    public boolean f29643Z;

    /* renamed from: a */
    public final InterfaceC5195c f29644a;

    /* renamed from: a0 */
    public InterfaceC4325h f29645a0;

    /* renamed from: b */
    public final C5199g f29646b;

    /* renamed from: c */
    public final SparseArray<c> f29647c;

    /* renamed from: d */
    public final boolean f29648d;

    /* renamed from: e */
    public final C4361f0 f29649e;

    /* renamed from: f */
    public final C4361f0 f29650f;

    /* renamed from: g */
    public final C4361f0 f29651g;

    /* renamed from: h */
    public final C4361f0 f29652h;

    /* renamed from: i */
    public final C4361f0 f29653i;

    /* renamed from: j */
    public final C4361f0 f29654j;

    /* renamed from: k */
    public final C4361f0 f29655k;

    /* renamed from: l */
    public final C4361f0 f29656l;

    /* renamed from: m */
    public final C4361f0 f29657m;

    /* renamed from: n */
    public final C4361f0 f29658n;

    /* renamed from: o */
    public ByteBuffer f29659o;

    /* renamed from: p */
    public long f29660p;

    /* renamed from: q */
    public long f29661q;

    /* renamed from: r */
    public long f29662r;

    /* renamed from: s */
    public long f29663s;

    /* renamed from: t */
    public long f29664t;

    /* renamed from: u */
    public c f29665u;

    /* renamed from: v */
    public boolean f29666v;

    /* renamed from: w */
    public int f29667w;

    /* renamed from: x */
    public long f29668x;

    /* renamed from: y */
    public boolean f29669y;

    /* renamed from: z */
    public long f29670z;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:i7/e$b.class
     */
    /* renamed from: i7.e$b */
    /* loaded from: combined.jar:classes2.jar:i7/e$b.class */
    public final class b implements InterfaceC5194b {

        /* renamed from: a */
        public final C5197e f29671a;

        public b(C5197e c5197e) {
            this.f29671a = c5197e;
        }

        @Override // p145i7.InterfaceC5194b
        /* renamed from: a */
        public void mo25890a(int i10) {
            this.f29671a.m25923o(i10);
        }

        @Override // p145i7.InterfaceC5194b
        /* renamed from: b */
        public void mo25891b(int i10, double d10) {
            this.f29671a.m25925r(i10, d10);
        }

        @Override // p145i7.InterfaceC5194b
        /* renamed from: c */
        public void mo25892c(int i10, int i11, InterfaceC4324g interfaceC4324g) {
            this.f29671a.m25920l(i10, i11, interfaceC4324g);
        }

        @Override // p145i7.InterfaceC5194b
        /* renamed from: d */
        public void mo25893d(int i10, long j10) {
            this.f29671a.m25930x(i10, j10);
        }

        @Override // p145i7.InterfaceC5194b
        /* renamed from: e */
        public int mo25894e(int i10) {
            return this.f29671a.m25927u(i10);
        }

        @Override // p145i7.InterfaceC5194b
        /* renamed from: f */
        public boolean mo25895f(int i10) {
            return this.f29671a.m25931z(i10);
        }

        @Override // p145i7.InterfaceC5194b
        /* renamed from: g */
        public void mo25896g(int i10, String str) {
            this.f29671a.m25912H(i10, str);
        }

        @Override // p145i7.InterfaceC5194b
        /* renamed from: h */
        public void mo25897h(int i10, long j10, long j11) {
            this.f29671a.m25911G(i10, j10, j11);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:i7/e$c.class
     */
    /* renamed from: i7.e$c */
    /* loaded from: combined.jar:classes2.jar:i7/e$c.class */
    public static final class c {

        /* renamed from: A */
        public int f29672A;

        /* renamed from: B */
        public int f29673B;

        /* renamed from: C */
        public int f29674C;

        /* renamed from: D */
        public float f29675D;

        /* renamed from: E */
        public float f29676E;

        /* renamed from: F */
        public float f29677F;

        /* renamed from: G */
        public float f29678G;

        /* renamed from: H */
        public float f29679H;

        /* renamed from: I */
        public float f29680I;

        /* renamed from: J */
        public float f29681J;

        /* renamed from: K */
        public float f29682K;

        /* renamed from: L */
        public float f29683L;

        /* renamed from: M */
        public float f29684M;

        /* renamed from: N */
        public byte[] f29685N;

        /* renamed from: O */
        public int f29686O;

        /* renamed from: P */
        public int f29687P;

        /* renamed from: Q */
        public int f29688Q;

        /* renamed from: R */
        public long f29689R;

        /* renamed from: S */
        public long f29690S;

        /* renamed from: T */
        public d f29691T;

        /* renamed from: U */
        public boolean f29692U;

        /* renamed from: V */
        public boolean f29693V;

        /* renamed from: W */
        public String f29694W;

        /* renamed from: X */
        public InterfaceC4337t f29695X;

        /* renamed from: Y */
        public int f29696Y;

        /* renamed from: a */
        public String f29697a;

        /* renamed from: b */
        public String f29698b;

        /* renamed from: c */
        public int f29699c;

        /* renamed from: d */
        public int f29700d;

        /* renamed from: e */
        public int f29701e;

        /* renamed from: f */
        public int f29702f;

        /* renamed from: g */
        public int f29703g;

        /* renamed from: h */
        public boolean f29704h;

        /* renamed from: i */
        public byte[] f29705i;

        /* renamed from: j */
        public InterfaceC4337t.a f29706j;

        /* renamed from: k */
        public byte[] f29707k;

        /* renamed from: l */
        public C9273n f29708l;

        /* renamed from: m */
        public int f29709m;

        /* renamed from: n */
        public int f29710n;

        /* renamed from: o */
        public int f29711o;

        /* renamed from: p */
        public int f29712p;

        /* renamed from: q */
        public int f29713q;

        /* renamed from: r */
        public int f29714r;

        /* renamed from: s */
        public float f29715s;

        /* renamed from: t */
        public float f29716t;

        /* renamed from: u */
        public float f29717u;

        /* renamed from: v */
        public byte[] f29718v;

        /* renamed from: w */
        public int f29719w;

        /* renamed from: x */
        public boolean f29720x;

        /* renamed from: y */
        public int f29721y;

        /* renamed from: z */
        public int f29722z;

        public c() {
            this.f29709m = -1;
            this.f29710n = -1;
            this.f29711o = -1;
            this.f29712p = -1;
            this.f29713q = 0;
            this.f29714r = -1;
            this.f29715s = 0.0f;
            this.f29716t = 0.0f;
            this.f29717u = 0.0f;
            this.f29718v = null;
            this.f29719w = -1;
            this.f29720x = false;
            this.f29721y = -1;
            this.f29722z = -1;
            this.f29672A = -1;
            this.f29673B = 1000;
            this.f29674C = 200;
            this.f29675D = -1.0f;
            this.f29676E = -1.0f;
            this.f29677F = -1.0f;
            this.f29678G = -1.0f;
            this.f29679H = -1.0f;
            this.f29680I = -1.0f;
            this.f29681J = -1.0f;
            this.f29682K = -1.0f;
            this.f29683L = -1.0f;
            this.f29684M = -1.0f;
            this.f29686O = 1;
            this.f29687P = -1;
            this.f29688Q = 8000;
            this.f29689R = 0L;
            this.f29690S = 0L;
            this.f29693V = true;
            this.f29694W = "eng";
        }

        /* renamed from: j */
        public static Pair<String, List<byte[]>> m25936j(C4361f0 c4361f0) {
            try {
                c4361f0.m21984Q(16);
                long m22004t = c4361f0.m22004t();
                if (m22004t == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (m22004t == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (m22004t != 826496599) {
                    C4392v.m22275i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] m21988d = c4361f0.m21988d();
                for (int m21989e = c4361f0.m21989e() + 20; m21989e < m21988d.length - 4; m21989e++) {
                    if (m21988d[m21989e] == 0 && m21988d[m21989e + 1] == 0 && m21988d[m21989e + 2] == 1 && m21988d[m21989e + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(m21988d, m21989e, m21988d.length)));
                    }
                }
                throw C7594k1.m32822a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw C7594k1.m32822a("Error parsing FourCC private data", null);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            if (r5.m22007w() == p145i7.C5197e.f29616f0.getLeastSignificantBits()) goto L16;
         */
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static boolean m25937k(p059d9.C4361f0 r5) {
            /*
                r0 = r5
                int r0 = r0.m22006v()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L48
                r6 = r0
                r0 = 1
                r11 = r0
                r0 = r6
                r1 = 1
                if (r0 != r1) goto Lf
                r0 = 1
                return r0
            Lf:
                r0 = r6
                r1 = 65534(0xfffe, float:9.1833E-41)
                if (r0 != r1) goto L46
                r0 = r5
                r1 = 24
                r0.m21983P(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L48
                r0 = r5
                long r0 = r0.m22007w()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L48
                java.util.UUID r1 = p145i7.C5197e.m25903g()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L48
                long r1 = r1.getMostSignificantBits()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L48
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L40
                r0 = r5
                long r0 = r0.m22007w()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L48
                r7 = r0
                java.util.UUID r0 = p145i7.C5197e.m25903g()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L48
                long r0 = r0.getLeastSignificantBits()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L48
                r9 = r0
                r0 = r7
                r1 = r9
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L40
                goto L43
            L40:
                r0 = 0
                r11 = r0
            L43:
                r0 = r11
                return r0
            L46:
                r0 = 0
                return r0
            L48:
                r5 = move-exception
                java.lang.String r0 = "Error parsing MS/ACM codec private"
                r1 = 0
                p6.k1 r0 = p267p6.C7594k1.m32822a(r0, r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p145i7.C5197e.c.m25937k(d9.f0):boolean");
        }

        /* renamed from: l */
        public static List<byte[]> m25938l(byte[] bArr) {
            byte b10;
            byte b11;
            try {
                if (bArr[0] != 2) {
                    throw C7594k1.m32822a("Error parsing vorbis codec private", null);
                }
                int i10 = 1;
                int i11 = 0;
                while (true) {
                    b10 = bArr[i10];
                    if ((b10 & 255) != 255) {
                        break;
                    }
                    i11 += 255;
                    i10++;
                }
                int i12 = i10 + 1;
                int i13 = i11 + (b10 & 255);
                int i14 = 0;
                while (true) {
                    b11 = bArr[i12];
                    if ((b11 & 255) != 255) {
                        break;
                    }
                    i14 += 255;
                    i12++;
                }
                int i15 = i12 + 1;
                if (bArr[i15] != 1) {
                    throw C7594k1.m32822a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i13];
                System.arraycopy(bArr, i15, bArr2, 0, i13);
                int i16 = i15 + i13;
                if (bArr[i16] != 3) {
                    throw C7594k1.m32822a("Error parsing vorbis codec private", null);
                }
                int i17 = i16 + i14 + (b11 & 255);
                if (bArr[i17] != 5) {
                    throw C7594k1.m32822a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i17];
                System.arraycopy(bArr, i17, bArr3, 0, bArr.length - i17);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw C7594k1.m32822a("Error parsing vorbis codec private", null);
            }
        }

        @EnsuresNonNull({"output"})
        /* renamed from: e */
        public final void m25939e() {
            C4349a.m21882e(this.f29695X);
        }

        @EnsuresNonNull({"codecPrivate"})
        /* renamed from: f */
        public final byte[] m25940f(String str) {
            byte[] bArr = this.f29707k;
            if (bArr != null) {
                return bArr;
            }
            throw C7594k1.m32822a("Missing CodecPrivate for codec " + str, null);
        }

        /* renamed from: g */
        public final byte[] m25941g() {
            if (this.f29675D == -1.0f || this.f29676E == -1.0f || this.f29677F == -1.0f || this.f29678G == -1.0f || this.f29679H == -1.0f || this.f29680I == -1.0f || this.f29681J == -1.0f || this.f29682K == -1.0f || this.f29683L == -1.0f || this.f29684M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.f29675D * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f29676E * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f29677F * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f29678G * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f29679H * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f29680I * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f29681J * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f29682K * 50000.0f) + 0.5f));
            order.putShort((short) (this.f29683L + 0.5f));
            order.putShort((short) (this.f29684M + 0.5f));
            order.putShort((short) this.f29673B);
            order.putShort((short) this.f29674C);
            return bArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0809  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x083d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0857  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0a5d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0873  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0843  */
        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m25942h(p057d7.InterfaceC4325h r8, int r9) {
            /*
                Method dump skipped, instructions count: 2760
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p145i7.C5197e.c.m25942h(d7.h, int):void");
        }

        @RequiresNonNull({"output"})
        /* renamed from: i */
        public void m25943i() {
            d dVar = this.f29691T;
            if (dVar != null) {
                dVar.m25945a(this);
            }
        }

        /* renamed from: m */
        public void m25944m() {
            d dVar = this.f29691T;
            if (dVar != null) {
                dVar.m25946b();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:i7/e$d.class
     */
    /* renamed from: i7.e$d */
    /* loaded from: combined.jar:classes2.jar:i7/e$d.class */
    public static final class d {

        /* renamed from: a */
        public final byte[] f29723a = new byte[10];

        /* renamed from: b */
        public boolean f29724b;

        /* renamed from: c */
        public int f29725c;

        /* renamed from: d */
        public long f29726d;

        /* renamed from: e */
        public int f29727e;

        /* renamed from: f */
        public int f29728f;

        /* renamed from: g */
        public int f29729g;

        @RequiresNonNull({"#1.output"})
        /* renamed from: a */
        public void m25945a(c cVar) {
            if (this.f29725c > 0) {
                cVar.f29695X.mo600b(this.f29726d, this.f29727e, this.f29728f, this.f29729g, cVar.f29706j);
                this.f29725c = 0;
            }
        }

        /* renamed from: b */
        public void m25946b() {
            this.f29724b = false;
            this.f29725c = 0;
        }

        @RequiresNonNull({"#1.output"})
        /* renamed from: c */
        public void m25947c(c cVar, long j10, int i10, int i11, int i12) {
            if (this.f29724b) {
                int i13 = this.f29725c;
                int i14 = i13 + 1;
                this.f29725c = i14;
                if (i13 == 0) {
                    this.f29726d = j10;
                    this.f29727e = i10;
                    this.f29728f = 0;
                }
                this.f29728f += i11;
                this.f29729g = i12;
                if (i14 >= 16) {
                    m25945a(cVar);
                }
            }
        }

        /* renamed from: d */
        public void m25948d(InterfaceC4324g interfaceC4324g) {
            if (this.f29724b) {
                return;
            }
            interfaceC4324g.mo21811q(this.f29723a, 0, 10);
            interfaceC4324g.mo21801f();
            if (C7968b.m34544i(this.f29723a) == 0) {
                return;
            }
            this.f29724b = true;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f29617g0 = Collections.unmodifiableMap(hashMap);
    }

    public C5197e() {
        this(0);
    }

    public C5197e(int i10) {
        this(new C5193a(), i10);
    }

    public C5197e(InterfaceC5195c interfaceC5195c, int i10) {
        this.f29661q = -1L;
        this.f29662r = -9223372036854775807L;
        this.f29663s = -9223372036854775807L;
        this.f29664t = -9223372036854775807L;
        this.f29670z = -1L;
        this.f29618A = -1L;
        this.f29619B = -9223372036854775807L;
        this.f29644a = interfaceC5195c;
        interfaceC5195c.mo25884b(new b());
        this.f29648d = (i10 & 1) == 0;
        this.f29646b = new C5199g();
        this.f29647c = new SparseArray<>();
        this.f29651g = new C4361f0(4);
        this.f29652h = new C4361f0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f29653i = new C4361f0(4);
        this.f29649e = new C4361f0(C4350a0.f26520a);
        this.f29650f = new C4361f0(4);
        this.f29654j = new C4361f0();
        this.f29655k = new C4361f0();
        this.f29656l = new C4361f0(8);
        this.f29657m = new C4361f0();
        this.f29658n = new C4361f0();
        this.f29629L = new int[1];
    }

    /* renamed from: A */
    public static /* synthetic */ InterfaceC4323f[] m25898A() {
        return new InterfaceC4323f[]{new C5197e()};
    }

    /* renamed from: F */
    public static void m25899F(String str, long j10, byte[] bArr) {
        byte[] m25905s;
        int i10;
        str.hashCode();
        if (str.equals("S_TEXT/ASS")) {
            m25905s = m25905s(j10, "%01d:%02d:%02d:%02d", 10000L);
            i10 = 21;
        } else {
            if (!str.equals("S_TEXT/UTF8")) {
                throw new IllegalArgumentException();
            }
            m25905s = m25905s(j10, "%02d:%02d:%02d,%03d", 1000L);
            i10 = 19;
        }
        System.arraycopy(m25905s, 0, bArr, i10, m25905s.length);
    }

    /* renamed from: p */
    public static int[] m25904p(int[] iArr, int i10) {
        return iArr == null ? new int[i10] : iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    /* renamed from: s */
    public static byte[] m25905s(long j10, String str, long j11) {
        C4349a.m21878a(j10 != -9223372036854775807L);
        long j12 = j10 - ((r0 * 3600) * 1000000);
        int i10 = (int) (j12 / 60000000);
        long j13 = j12 - ((i10 * 60) * 1000000);
        int i11 = (int) (j13 / 1000000);
        return C4401z0.m22396l0(String.format(Locale.US, str, Integer.valueOf((int) (j10 / 3600000000L)), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j13 - (i11 * 1000000)) / j11))));
    }

    /* renamed from: y */
    public static boolean m25906y(String str) {
        str.hashCode();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    /* renamed from: B */
    public final boolean m25907B(C4334q c4334q, long j10) {
        if (this.f29669y) {
            this.f29618A = j10;
            c4334q.f26491a = this.f29670z;
            this.f29669y = false;
            return true;
        }
        if (!this.f29666v) {
            return false;
        }
        long j11 = this.f29618A;
        if (j11 == -1) {
            return false;
        }
        c4334q.f26491a = j11;
        this.f29618A = -1L;
        return true;
    }

    /* renamed from: C */
    public final void m25908C(InterfaceC4324g interfaceC4324g, int i10) {
        if (this.f29651g.m21990f() >= i10) {
            return;
        }
        if (this.f29651g.m21986b() < i10) {
            C4361f0 c4361f0 = this.f29651g;
            c4361f0.m21987c(Math.max(c4361f0.m21986b() * 2, i10));
        }
        interfaceC4324g.readFully(this.f29651g.m21988d(), this.f29651g.m21990f(), i10 - this.f29651g.m21990f());
        this.f29651g.m21982O(i10);
    }

    /* renamed from: D */
    public final void m25909D() {
        this.f29635R = 0;
        this.f29636S = 0;
        this.f29637T = 0;
        this.f29638U = false;
        this.f29639V = false;
        this.f29640W = false;
        this.f29641X = 0;
        this.f29642Y = (byte) 0;
        this.f29643Z = false;
        this.f29654j.m21979L(0);
    }

    /* renamed from: E */
    public final long m25910E(long j10) {
        long j11 = this.f29662r;
        if (j11 != -9223372036854775807L) {
            return C4401z0.m22346Q0(j10, j11, 1000L);
        }
        throw C7594k1.m32822a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    /* renamed from: G */
    public void m25911G(int i10, long j10, long j11) {
        m25919k();
        if (i10 == 160) {
            this.f29634Q = false;
            return;
        }
        if (i10 == 174) {
            this.f29665u = new c();
            return;
        }
        if (i10 == 187) {
            this.f29622E = false;
            return;
        }
        if (i10 == 19899) {
            this.f29667w = -1;
            this.f29668x = -1L;
            return;
        }
        if (i10 == 20533) {
            m25926t(i10).f29704h = true;
            return;
        }
        if (i10 == 21968) {
            m25926t(i10).f29720x = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f29661q;
            if (j12 != -1 && j12 != j10) {
                throw C7594k1.m32822a("Multiple Segment elements not supported", null);
            }
            this.f29661q = j10;
            this.f29660p = j11;
            return;
        }
        if (i10 == 475249515) {
            this.f29620C = new C4394w();
            this.f29621D = new C4394w();
        } else if (i10 == 524531317 && !this.f29666v) {
            if (this.f29648d && this.f29670z != -1) {
                this.f29669y = true;
            } else {
                this.f29645a0.mo487p(new InterfaceC2348g.b(this.f29664t));
                this.f29666v = true;
            }
        }
    }

    /* renamed from: H */
    public void m25912H(int i10, String str) {
        if (i10 == 134) {
            m25926t(i10).f29698b = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                m25926t(i10).f29697a = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                m25926t(i10).f29694W = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw C7594k1.m32822a("DocType " + str + " not supported", null);
    }

    @RequiresNonNull({"#2.output"})
    /* renamed from: I */
    public final int m25913I(InterfaceC4324g interfaceC4324g, c cVar, int i10) {
        int i11;
        int i12;
        if ("S_TEXT/UTF8".equals(cVar.f29698b)) {
            m25914J(interfaceC4324g, f29613c0, i10);
        } else {
            if (!"S_TEXT/ASS".equals(cVar.f29698b)) {
                InterfaceC4337t interfaceC4337t = cVar.f29695X;
                boolean z10 = true;
                if (!this.f29638U) {
                    if (cVar.f29704h) {
                        this.f29632O &= -1073741825;
                        int i13 = 128;
                        if (!this.f29639V) {
                            interfaceC4324g.readFully(this.f29651g.m21988d(), 0, 1);
                            this.f29635R++;
                            if ((this.f29651g.m21988d()[0] & 128) == 128) {
                                throw C7594k1.m32822a("Extension bit is set in signal byte", null);
                            }
                            this.f29642Y = this.f29651g.m21988d()[0];
                            this.f29639V = true;
                        }
                        byte b10 = this.f29642Y;
                        if ((b10 & 1) == 1) {
                            boolean z11 = (b10 & 2) == 2;
                            this.f29632O |= NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH;
                            if (!this.f29643Z) {
                                interfaceC4324g.readFully(this.f29656l.m21988d(), 0, 8);
                                this.f29635R += 8;
                                this.f29643Z = true;
                                byte[] m21988d = this.f29651g.m21988d();
                                if (!z11) {
                                    i13 = 0;
                                }
                                m21988d[0] = (byte) (i13 | 8);
                                this.f29651g.m21983P(0);
                                interfaceC4337t.mo598a(this.f29651g, 1, 1);
                                this.f29636S++;
                                this.f29656l.m21983P(0);
                                interfaceC4337t.mo598a(this.f29656l, 8, 1);
                                this.f29636S += 8;
                            }
                            if (z11) {
                                if (!this.f29640W) {
                                    interfaceC4324g.readFully(this.f29651g.m21988d(), 0, 1);
                                    this.f29635R++;
                                    this.f29651g.m21983P(0);
                                    this.f29641X = this.f29651g.m21971D();
                                    this.f29640W = true;
                                }
                                int i14 = this.f29641X * 4;
                                this.f29651g.m21979L(i14);
                                interfaceC4324g.readFully(this.f29651g.m21988d(), 0, i14);
                                this.f29635R += i14;
                                short s10 = (short) ((this.f29641X / 2) + 1);
                                int i15 = (s10 * 6) + 2;
                                ByteBuffer byteBuffer = this.f29659o;
                                if (byteBuffer == null || byteBuffer.capacity() < i15) {
                                    this.f29659o = ByteBuffer.allocate(i15);
                                }
                                this.f29659o.position(0);
                                this.f29659o.putShort(s10);
                                int i16 = 0;
                                int i17 = 0;
                                while (true) {
                                    i11 = i17;
                                    i12 = this.f29641X;
                                    if (i16 >= i12) {
                                        break;
                                    }
                                    int m21975H = this.f29651g.m21975H();
                                    if (i16 % 2 == 0) {
                                        this.f29659o.putShort((short) (m21975H - i11));
                                    } else {
                                        this.f29659o.putInt(m21975H - i11);
                                    }
                                    i16++;
                                    i17 = m21975H;
                                }
                                int i18 = (i10 - this.f29635R) - i11;
                                ByteBuffer byteBuffer2 = this.f29659o;
                                if (i12 % 2 == 1) {
                                    byteBuffer2.putInt(i18);
                                } else {
                                    byteBuffer2.putShort((short) i18);
                                    this.f29659o.putInt(0);
                                }
                                this.f29657m.m21981N(this.f29659o.array(), i15);
                                interfaceC4337t.mo598a(this.f29657m, i15, 1);
                                this.f29636S += i15;
                            }
                        }
                    } else {
                        byte[] bArr = cVar.f29705i;
                        if (bArr != null) {
                            this.f29654j.m21981N(bArr, bArr.length);
                        }
                    }
                    if (cVar.f29702f > 0) {
                        this.f29632O |= 268435456;
                        this.f29658n.m21979L(0);
                        this.f29651g.m21979L(4);
                        this.f29651g.m21988d()[0] = (byte) ((i10 >> 24) & 255);
                        this.f29651g.m21988d()[1] = (byte) ((i10 >> 16) & 255);
                        this.f29651g.m21988d()[2] = (byte) ((i10 >> 8) & 255);
                        this.f29651g.m21988d()[3] = (byte) (i10 & 255);
                        interfaceC4337t.mo598a(this.f29651g, 4, 2);
                        this.f29636S += 4;
                    }
                    this.f29638U = true;
                }
                int m21990f = i10 + this.f29654j.m21990f();
                if (!"V_MPEG4/ISO/AVC".equals(cVar.f29698b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f29698b)) {
                    if (cVar.f29691T != null) {
                        if (this.f29654j.m21990f() != 0) {
                            z10 = false;
                        }
                        C4349a.m21884g(z10);
                        cVar.f29691T.m25948d(interfaceC4324g);
                    }
                    while (true) {
                        int i19 = this.f29635R;
                        if (i19 >= m21990f) {
                            break;
                        }
                        int m25915K = m25915K(interfaceC4324g, interfaceC4337t, m21990f - i19);
                        this.f29635R += m25915K;
                        this.f29636S += m25915K;
                    }
                } else {
                    byte[] m21988d2 = this.f29650f.m21988d();
                    m21988d2[0] = 0;
                    m21988d2[1] = 0;
                    m21988d2[2] = 0;
                    int i20 = cVar.f29696Y;
                    while (this.f29635R < m21990f) {
                        int i21 = this.f29637T;
                        if (i21 == 0) {
                            m25916L(interfaceC4324g, m21988d2, 4 - i20, i20);
                            this.f29635R += i20;
                            this.f29650f.m21983P(0);
                            this.f29637T = this.f29650f.m21975H();
                            this.f29649e.m21983P(0);
                            interfaceC4337t.mo606e(this.f29649e, 4);
                            this.f29636S += 4;
                        } else {
                            int m25915K2 = m25915K(interfaceC4324g, interfaceC4337t, i21);
                            this.f29635R += m25915K2;
                            this.f29636S += m25915K2;
                            this.f29637T -= m25915K2;
                        }
                    }
                }
                if ("A_VORBIS".equals(cVar.f29698b)) {
                    this.f29652h.m21983P(0);
                    interfaceC4337t.mo606e(this.f29652h, 4);
                    this.f29636S += 4;
                }
                return m25924q();
            }
            m25914J(interfaceC4324g, f29615e0, i10);
        }
        return m25924q();
    }

    /* renamed from: J */
    public final void m25914J(InterfaceC4324g interfaceC4324g, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        if (this.f29655k.m21986b() < length) {
            this.f29655k.m21980M(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f29655k.m21988d(), 0, bArr.length);
        }
        interfaceC4324g.readFully(this.f29655k.m21988d(), bArr.length, i10);
        this.f29655k.m21983P(0);
        this.f29655k.m21982O(length);
    }

    /* renamed from: K */
    public final int m25915K(InterfaceC4324g interfaceC4324g, InterfaceC4337t interfaceC4337t, int i10) {
        int mo604d;
        int m21985a = this.f29654j.m21985a();
        if (m21985a > 0) {
            mo604d = Math.min(i10, m21985a);
            interfaceC4337t.mo606e(this.f29654j, mo604d);
        } else {
            mo604d = interfaceC4337t.mo604d(interfaceC4324g, i10, false);
        }
        return mo604d;
    }

    /* renamed from: L */
    public final void m25916L(InterfaceC4324g interfaceC4324g, byte[] bArr, int i10, int i11) {
        int min = Math.min(i11, this.f29654j.m21985a());
        interfaceC4324g.readFully(bArr, i10 + min, i11 - min);
        if (min > 0) {
            this.f29654j.m21994j(bArr, i10, min);
        }
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: a */
    public void mo12027a(long j10, long j11) {
        this.f29619B = -9223372036854775807L;
        this.f29624G = 0;
        this.f29644a.reset();
        this.f29646b.m25955e();
        m25909D();
        for (int i10 = 0; i10 < this.f29647c.size(); i10++) {
            this.f29647c.valueAt(i10).m25944m();
        }
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: c */
    public final void mo12028c(InterfaceC4325h interfaceC4325h) {
        this.f29645a0 = interfaceC4325h;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: d */
    public final boolean mo12029d(InterfaceC4324g interfaceC4324g) {
        return new C5198f().m25950b(interfaceC4324g);
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: h */
    public final int mo12033h(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        this.f29623F = false;
        boolean z10 = true;
        while (z10 && !this.f29623F) {
            boolean mo25883a = this.f29644a.mo25883a(interfaceC4324g);
            z10 = mo25883a;
            if (mo25883a) {
                z10 = mo25883a;
                if (m25907B(c4334q, interfaceC4324g.getPosition())) {
                    return 1;
                }
            }
        }
        if (z10) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f29647c.size(); i10++) {
            c valueAt = this.f29647c.valueAt(i10);
            valueAt.m25939e();
            valueAt.m25943i();
        }
        return -1;
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* renamed from: i */
    public final void m25917i(int i10) {
        if (this.f29620C == null || this.f29621D == null) {
            throw C7594k1.m32822a("Element " + i10 + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    /* renamed from: j */
    public final void m25918j(int i10) {
        if (this.f29665u != null) {
            return;
        }
        throw C7594k1.m32822a("Element " + i10 + " must be in a TrackEntry", null);
    }

    @EnsuresNonNull({"extractorOutput"})
    /* renamed from: k */
    public final void m25919k() {
        C4349a.m21886i(this.f29645a0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x040c, code lost:
    
        throw p267p6.C7594k1.m32822a("EBML lacing sample size out of range.", null);
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m25920l(int r9, int r10, p057d7.InterfaceC4324g r11) {
        /*
            Method dump skipped, instructions count: 1346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p145i7.C5197e.m25920l(int, int, d7.g):void");
    }

    /* renamed from: m */
    public final InterfaceC2348g m25921m(C4394w c4394w, C4394w c4394w2) {
        int i10;
        int i11;
        if (this.f29661q == -1 || this.f29664t == -9223372036854775807L || c4394w == null || c4394w.m22284c() == 0 || c4394w2 == null || c4394w2.m22284c() != c4394w.m22284c()) {
            return new InterfaceC2348g.b(this.f29664t);
        }
        int m22284c = c4394w.m22284c();
        int[] iArr = new int[m22284c];
        long[] jArr = new long[m22284c];
        long[] jArr2 = new long[m22284c];
        long[] jArr3 = new long[m22284c];
        int i12 = 0;
        while (true) {
            i10 = 0;
            if (i12 >= m22284c) {
                break;
            }
            jArr3[i12] = c4394w.m22283b(i12);
            jArr[i12] = this.f29661q + c4394w2.m22283b(i12);
            i12++;
        }
        while (true) {
            i11 = m22284c - 1;
            if (i10 >= i11) {
                break;
            }
            int i13 = i10 + 1;
            iArr[i10] = (int) (jArr[i13] - jArr[i10]);
            jArr2[i10] = jArr3[i13] - jArr3[i10];
            i10 = i13;
        }
        iArr[i11] = (int) ((this.f29661q + this.f29660p) - jArr[i11]);
        long j10 = this.f29664t - jArr3[i11];
        jArr2[i11] = j10;
        int[] iArr2 = iArr;
        long[] jArr4 = jArr;
        long[] jArr5 = jArr2;
        long[] jArr6 = jArr3;
        if (j10 <= 0) {
            C4392v.m22275i("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j10);
            iArr2 = Arrays.copyOf(iArr, i11);
            jArr4 = Arrays.copyOf(jArr, i11);
            jArr5 = Arrays.copyOf(jArr2, i11);
            jArr6 = Arrays.copyOf(jArr3, i11);
        }
        return new C2343b(iArr2, jArr4, jArr5, jArr6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if ("S_TEXT/ASS".equals(r9.f29698b) != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e7  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m25922n(p145i7.C5197e.c r9, long r10, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p145i7.C5197e.m25922n(i7.e$c, long, int, int, int):void");
    }

    /* renamed from: o */
    public void m25923o(int i10) {
        m25919k();
        if (i10 == 160) {
            if (this.f29624G != 2) {
                return;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.f29628K; i12++) {
                i11 += this.f29629L[i12];
            }
            c cVar = this.f29647c.get(this.f29630M);
            cVar.m25939e();
            for (int i13 = 0; i13 < this.f29628K; i13++) {
                long j10 = this.f29625H;
                long j11 = (cVar.f29701e * i13) / 1000;
                int i14 = this.f29632O;
                int i15 = i14;
                if (i13 == 0) {
                    i15 = i14;
                    if (!this.f29634Q) {
                        i15 = i14 | 1;
                    }
                }
                int i16 = this.f29629L[i13];
                i11 -= i16;
                m25922n(cVar, j11 + j10, i15, i16, i11);
            }
            this.f29624G = 0;
            return;
        }
        if (i10 == 174) {
            c cVar2 = (c) C4349a.m21886i(this.f29665u);
            String str = cVar2.f29698b;
            if (str == null) {
                throw C7594k1.m32822a("CodecId is missing in TrackEntry element", null);
            }
            if (m25906y(str)) {
                cVar2.m25942h(this.f29645a0, cVar2.f29699c);
                this.f29647c.put(cVar2.f29699c, cVar2);
            }
            this.f29665u = null;
            return;
        }
        if (i10 == 19899) {
            int i17 = this.f29667w;
            if (i17 != -1) {
                long j12 = this.f29668x;
                if (j12 != -1) {
                    if (i17 == 475249515) {
                        this.f29670z = j12;
                        return;
                    }
                    return;
                }
            }
            throw C7594k1.m32822a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == 25152) {
            m25918j(i10);
            c cVar3 = this.f29665u;
            if (cVar3.f29704h) {
                if (cVar3.f29706j == null) {
                    throw C7594k1.m32822a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f29708l = new C9273n(new C9273n.b(C7583h.f36776a, "video/webm", this.f29665u.f29706j.f26496b));
                return;
            }
            return;
        }
        if (i10 == 28032) {
            m25918j(i10);
            c cVar4 = this.f29665u;
            if (cVar4.f29704h && cVar4.f29705i != null) {
                throw C7594k1.m32822a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f29662r == -9223372036854775807L) {
                this.f29662r = 1000000L;
            }
            long j13 = this.f29663s;
            if (j13 != -9223372036854775807L) {
                this.f29664t = m25910E(j13);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            if (this.f29647c.size() == 0) {
                throw C7594k1.m32822a("No valid tracks were found", null);
            }
            this.f29645a0.mo491u();
        } else {
            if (i10 != 475249515) {
                return;
            }
            if (!this.f29666v) {
                this.f29645a0.mo487p(m25921m(this.f29620C, this.f29621D));
                this.f29666v = true;
            }
            this.f29620C = null;
            this.f29621D = null;
        }
    }

    /* renamed from: q */
    public final int m25924q() {
        int i10 = this.f29636S;
        m25909D();
        return i10;
    }

    /* renamed from: r */
    public void m25925r(int i10, double d10) {
        if (i10 == 181) {
            m25926t(i10).f29688Q = (int) d10;
        }
        if (i10 == 17545) {
            this.f29663s = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                m25926t(i10).f29675D = (float) d10;
                break;
            case 21970:
                m25926t(i10).f29676E = (float) d10;
                break;
            case 21971:
                m25926t(i10).f29677F = (float) d10;
                break;
            case 21972:
                m25926t(i10).f29678G = (float) d10;
                break;
            case 21973:
                m25926t(i10).f29679H = (float) d10;
                break;
            case 21974:
                m25926t(i10).f29680I = (float) d10;
                break;
            case 21975:
                m25926t(i10).f29681J = (float) d10;
                break;
            case 21976:
                m25926t(i10).f29682K = (float) d10;
                break;
            case 21977:
                m25926t(i10).f29683L = (float) d10;
                break;
            case 21978:
                m25926t(i10).f29684M = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        m25926t(i10).f29715s = (float) d10;
                        break;
                    case 30324:
                        m25926t(i10).f29716t = (float) d10;
                        break;
                    case 30325:
                        m25926t(i10).f29717u = (float) d10;
                        break;
                }
        }
    }

    @Override // p057d7.InterfaceC4323f
    public final void release() {
    }

    /* renamed from: t */
    public final c m25926t(int i10) {
        m25918j(i10);
        return this.f29665u;
    }

    /* renamed from: u */
    public int m25927u(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case FTPReply.NAME_SYSTEM_TYPE /* 215 */:
            case NNTPReply.NEW_NEWSGROUP_LIST_FOLLOWS /* 231 */:
            case TelnetCommand.ABORT /* 238 */:
            case TelnetCommand.NOP /* 241 */:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case FTPReply.DATA_CONNECTION_OPEN /* 225 */:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: v */
    public void m25928v(c cVar, InterfaceC4324g interfaceC4324g, int i10) {
        if (cVar.f29703g != 1685485123 && cVar.f29703g != 1685480259) {
            interfaceC4324g.mo21809o(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        cVar.f29685N = bArr;
        interfaceC4324g.readFully(bArr, 0, i10);
    }

    /* renamed from: w */
    public void m25929w(c cVar, int i10, InterfaceC4324g interfaceC4324g, int i11) {
        if (i10 != 4 || !"V_VP9".equals(cVar.f29698b)) {
            interfaceC4324g.mo21809o(i11);
        } else {
            this.f29658n.m21979L(i11);
            interfaceC4324g.readFully(this.f29658n.m21988d(), 0, i11);
        }
    }

    /* renamed from: x */
    public void m25930x(int i10, long j10) {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw C7594k1.m32822a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw C7594k1.m32822a("ContentEncodingScope " + j10 + " not supported", null);
        }
        boolean z10 = false;
        switch (i10) {
            case 131:
                m25926t(i10).f29700d = (int) j10;
                return;
            case 136:
                c m25926t = m25926t(i10);
                if (j10 == 1) {
                    z10 = true;
                }
                m25926t.f29693V = z10;
                return;
            case 155:
                this.f29626I = m25910E(j10);
                return;
            case 159:
                m25926t(i10).f29686O = (int) j10;
                return;
            case 176:
                m25926t(i10).f29709m = (int) j10;
                return;
            case 179:
                m25917i(i10);
                this.f29620C.m22282a(m25910E(j10));
                return;
            case 186:
                m25926t(i10).f29710n = (int) j10;
                return;
            case FTPReply.NAME_SYSTEM_TYPE /* 215 */:
                m25926t(i10).f29699c = (int) j10;
                return;
            case NNTPReply.NEW_NEWSGROUP_LIST_FOLLOWS /* 231 */:
                this.f29619B = m25910E(j10);
                return;
            case TelnetCommand.ABORT /* 238 */:
                this.f29633P = (int) j10;
                return;
            case TelnetCommand.NOP /* 241 */:
                if (this.f29622E) {
                    return;
                }
                m25917i(i10);
                this.f29621D.m22282a(j10);
                this.f29622E = true;
                return;
            case 251:
                this.f29634Q = true;
                return;
            case 16871:
                m25926t(i10).f29703g = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw C7594k1.m32822a("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw C7594k1.m32822a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw C7594k1.m32822a("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw C7594k1.m32822a("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw C7594k1.m32822a("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.f29668x = j10 + this.f29661q;
                return;
            case 21432:
                int i11 = (int) j10;
                m25918j(i10);
                if (i11 == 0) {
                    this.f29665u.f29719w = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f29665u.f29719w = 2;
                    return;
                } else if (i11 == 3) {
                    this.f29665u.f29719w = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f29665u.f29719w = 3;
                    return;
                }
            case 21680:
                m25926t(i10).f29711o = (int) j10;
                return;
            case 21682:
                m25926t(i10).f29713q = (int) j10;
                return;
            case 21690:
                m25926t(i10).f29712p = (int) j10;
                return;
            case 21930:
                c m25926t2 = m25926t(i10);
                boolean z11 = false;
                if (j10 == 1) {
                    z11 = true;
                }
                m25926t2.f29692U = z11;
                return;
            case 21998:
                m25926t(i10).f29702f = (int) j10;
                return;
            case 22186:
                m25926t(i10).f29689R = j10;
                return;
            case 22203:
                m25926t(i10).f29690S = j10;
                return;
            case 25188:
                m25926t(i10).f29687P = (int) j10;
                return;
            case 30321:
                m25918j(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.f29665u.f29714r = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f29665u.f29714r = 1;
                    return;
                } else if (i12 == 2) {
                    this.f29665u.f29714r = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f29665u.f29714r = 3;
                    return;
                }
            case 2352003:
                m25926t(i10).f29701e = (int) j10;
                return;
            case 2807729:
                this.f29662r = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        m25918j(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.f29665u.f29672A = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f29665u.f29672A = 1;
                            return;
                        }
                    case 21946:
                        m25918j(i10);
                        int m23400c = C4665b.m23400c((int) j10);
                        if (m23400c != -1) {
                            this.f29665u.f29722z = m23400c;
                            return;
                        }
                        return;
                    case 21947:
                        m25918j(i10);
                        this.f29665u.f29720x = true;
                        int m23399b = C4665b.m23399b((int) j10);
                        if (m23399b != -1) {
                            this.f29665u.f29721y = m23399b;
                            return;
                        }
                        return;
                    case 21948:
                        m25926t(i10).f29673B = (int) j10;
                        return;
                    case 21949:
                        m25926t(i10).f29674C = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    /* renamed from: z */
    public boolean m25931z(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }
}
