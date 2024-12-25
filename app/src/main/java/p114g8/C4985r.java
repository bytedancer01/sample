package p114g8;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p009a8.C0083a1;
import p009a8.C0111o;
import p009a8.C0117r;
import p009a8.C0118r0;
import p009a8.C0134z0;
import p009a8.InterfaceC0090d0;
import p009a8.InterfaceC0120s0;
import p009a8.InterfaceC0122t0;
import p027b9.C0839e0;
import p027b9.InterfaceC0831a0;
import p027b9.InterfaceC0832b;
import p027b9.InterfaceC0837d0;
import p027b9.InterfaceC0846i;
import p038c8.AbstractC1020f;
import p057d7.C4322e;
import p057d7.C4336s;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4361f0;
import p059d9.C4392v;
import p059d9.C4400z;
import p059d9.C4401z0;
import p099fc.AbstractC4834t;
import p099fc.C4844y;
import p114g8.C4973f;
import p114g8.C4985r;
import p267p6.C7583h;
import p267p6.C7594k1;
import p267p6.C7629w0;
import p267p6.C7632x0;
import p283q7.C7839a;
import p321s7.C8542a;
import p321s7.C8543b;
import p332t6.C8638f;
import p365v6.C9273n;
import p365v6.InterfaceC9290x;
import p365v6.InterfaceC9292z;
import p366v7.C9304l;
import p421y8.C9890n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:g8/r.class
 */
/* renamed from: g8.r */
/* loaded from: combined.jar:classes2.jar:g8/r.class */
public final class C4985r implements C0839e0.b<AbstractC1020f>, C0839e0.f, InterfaceC0122t0, InterfaceC4325h, C0118r0.d {

    /* renamed from: Y */
    public static final Set<Integer> f28910Y = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: A */
    public int f28911A;

    /* renamed from: B */
    public int f28912B;

    /* renamed from: C */
    public boolean f28913C;

    /* renamed from: D */
    public boolean f28914D;

    /* renamed from: E */
    public int f28915E;

    /* renamed from: F */
    public C7629w0 f28916F;

    /* renamed from: G */
    public C7629w0 f28917G;

    /* renamed from: H */
    public boolean f28918H;

    /* renamed from: I */
    public C0083a1 f28919I;

    /* renamed from: J */
    public Set<C0134z0> f28920J;

    /* renamed from: K */
    public int[] f28921K;

    /* renamed from: L */
    public int f28922L;

    /* renamed from: M */
    public boolean f28923M;

    /* renamed from: N */
    public boolean[] f28924N;

    /* renamed from: O */
    public boolean[] f28925O;

    /* renamed from: P */
    public long f28926P;

    /* renamed from: Q */
    public long f28927Q;

    /* renamed from: R */
    public boolean f28928R;

    /* renamed from: S */
    public boolean f28929S;

    /* renamed from: T */
    public boolean f28930T;

    /* renamed from: U */
    public boolean f28931U;

    /* renamed from: V */
    public long f28932V;

    /* renamed from: W */
    public C9273n f28933W;

    /* renamed from: X */
    public C4977j f28934X;

    /* renamed from: b */
    public final int f28935b;

    /* renamed from: c */
    public final b f28936c;

    /* renamed from: d */
    public final C4973f f28937d;

    /* renamed from: e */
    public final InterfaceC0832b f28938e;

    /* renamed from: f */
    public final C7629w0 f28939f;

    /* renamed from: g */
    public final InterfaceC9292z f28940g;

    /* renamed from: h */
    public final InterfaceC9290x.a f28941h;

    /* renamed from: i */
    public final InterfaceC0837d0 f28942i;

    /* renamed from: k */
    public final InterfaceC0090d0.a f28944k;

    /* renamed from: l */
    public final int f28945l;

    /* renamed from: n */
    public final ArrayList<C4977j> f28947n;

    /* renamed from: o */
    public final List<C4977j> f28948o;

    /* renamed from: p */
    public final Runnable f28949p;

    /* renamed from: q */
    public final Runnable f28950q;

    /* renamed from: r */
    public final Handler f28951r;

    /* renamed from: s */
    public final ArrayList<C4981n> f28952s;

    /* renamed from: t */
    public final Map<String, C9273n> f28953t;

    /* renamed from: u */
    public AbstractC1020f f28954u;

    /* renamed from: v */
    public d[] f28955v;

    /* renamed from: x */
    public Set<Integer> f28957x;

    /* renamed from: y */
    public SparseIntArray f28958y;

    /* renamed from: z */
    public InterfaceC4337t f28959z;

    /* renamed from: j */
    public final C0839e0 f28943j = new C0839e0("Loader:HlsSampleStreamWrapper");

    /* renamed from: m */
    public final C4973f.b f28946m = new C4973f.b();

    /* renamed from: w */
    public int[] f28956w = new int[0];

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:g8/r$b.class
     */
    /* renamed from: g8.r$b */
    /* loaded from: combined.jar:classes2.jar:g8/r$b.class */
    public interface b extends InterfaceC0122t0.a<C4985r> {
        void onPrepared();

        /* renamed from: p */
        void mo25077p(Uri uri);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:g8/r$c.class
     */
    /* renamed from: g8.r$c */
    /* loaded from: combined.jar:classes2.jar:g8/r$c.class */
    public static class c implements InterfaceC4337t {

        /* renamed from: g */
        public static final C7629w0 f28960g = new C7629w0.b().m33220e0("application/id3").m33194E();

        /* renamed from: h */
        public static final C7629w0 f28961h = new C7629w0.b().m33220e0("application/x-emsg").m33194E();

        /* renamed from: a */
        public final C8543b f28962a = new C8543b();

        /* renamed from: b */
        public final InterfaceC4337t f28963b;

        /* renamed from: c */
        public final C7629w0 f28964c;

        /* renamed from: d */
        public C7629w0 f28965d;

        /* renamed from: e */
        public byte[] f28966e;

        /* renamed from: f */
        public int f28967f;

        public c(InterfaceC4337t interfaceC4337t, int i10) {
            C7629w0 c7629w0;
            this.f28963b = interfaceC4337t;
            if (i10 == 1) {
                c7629w0 = f28960g;
            } else {
                if (i10 != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i10);
                }
                c7629w0 = f28961h;
            }
            this.f28964c = c7629w0;
            this.f28966e = new byte[0];
            this.f28967f = 0;
        }

        @Override // p057d7.InterfaceC4337t
        /* renamed from: a */
        public void mo598a(C4361f0 c4361f0, int i10, int i11) {
            m25137h(this.f28967f + i10);
            c4361f0.m21994j(this.f28966e, this.f28967f, i10);
            this.f28967f += i10;
        }

        @Override // p057d7.InterfaceC4337t
        /* renamed from: b */
        public void mo600b(long j10, int i10, int i11, int i12, InterfaceC4337t.a aVar) {
            C4349a.m21882e(this.f28965d);
            C4361f0 m25138i = m25138i(i11, i12);
            if (!C4401z0.m22371c(this.f28965d.f37086m, this.f28964c.f37086m)) {
                if (!"application/x-emsg".equals(this.f28965d.f37086m)) {
                    C4392v.m22275i("EmsgUnwrappingTrackOutput", "Ignoring sample for unsupported format: " + this.f28965d.f37086m);
                    return;
                }
                C8542a m36771c = this.f28962a.m36771c(m25138i);
                if (!m25136g(m36771c)) {
                    C4392v.m22275i("EmsgUnwrappingTrackOutput", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f28964c.f37086m, m36771c.getWrappedMetadataFormat()));
                    return;
                }
                m25138i = new C4361f0((byte[]) C4349a.m21882e(m36771c.getWrappedMetadataBytes()));
            }
            int m21985a = m25138i.m21985a();
            this.f28963b.mo606e(m25138i, m21985a);
            this.f28963b.mo600b(j10, i10, m21985a, i12, aVar);
        }

        @Override // p057d7.InterfaceC4337t
        /* renamed from: c */
        public int mo602c(InterfaceC0846i interfaceC0846i, int i10, boolean z10, int i11) {
            m25137h(this.f28967f + i10);
            int read = interfaceC0846i.read(this.f28966e, this.f28967f, i10);
            if (read != -1) {
                this.f28967f += read;
                return read;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // p057d7.InterfaceC4337t
        /* renamed from: d */
        public /* synthetic */ int mo604d(InterfaceC0846i interfaceC0846i, int i10, boolean z10) {
            return C4336s.m21841a(this, interfaceC0846i, i10, z10);
        }

        @Override // p057d7.InterfaceC4337t
        /* renamed from: e */
        public /* synthetic */ void mo606e(C4361f0 c4361f0, int i10) {
            C4336s.m21842b(this, c4361f0, i10);
        }

        @Override // p057d7.InterfaceC4337t
        /* renamed from: f */
        public void mo608f(C7629w0 c7629w0) {
            this.f28965d = c7629w0;
            this.f28963b.mo608f(this.f28964c);
        }

        /* renamed from: g */
        public final boolean m25136g(C8542a c8542a) {
            C7629w0 wrappedMetadataFormat = c8542a.getWrappedMetadataFormat();
            return wrappedMetadataFormat != null && C4401z0.m22371c(this.f28964c.f37086m, wrappedMetadataFormat.f37086m);
        }

        /* renamed from: h */
        public final void m25137h(int i10) {
            byte[] bArr = this.f28966e;
            if (bArr.length < i10) {
                this.f28966e = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        /* renamed from: i */
        public final C4361f0 m25138i(int i10, int i11) {
            int i12 = this.f28967f - i11;
            C4361f0 c4361f0 = new C4361f0(Arrays.copyOfRange(this.f28966e, i12 - i10, i12));
            byte[] bArr = this.f28966e;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.f28967f = i11;
            return c4361f0;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:g8/r$d.class
     */
    /* renamed from: g8.r$d */
    /* loaded from: combined.jar:classes2.jar:g8/r$d.class */
    public static final class d extends C0118r0 {

        /* renamed from: I */
        public final Map<String, C9273n> f28968I;

        /* renamed from: J */
        public C9273n f28969J;

        public d(InterfaceC0832b interfaceC0832b, Looper looper, InterfaceC9292z interfaceC9292z, InterfaceC9290x.a aVar, Map<String, C9273n> map) {
            super(interfaceC0832b, looper, interfaceC9292z, aVar);
            this.f28968I = map;
        }

        @Override // p009a8.C0118r0, p057d7.InterfaceC4337t
        /* renamed from: b */
        public void mo600b(long j10, int i10, int i11, int i12, InterfaceC4337t.a aVar) {
            super.mo600b(j10, i10, i11, i12, aVar);
        }

        /* renamed from: h0 */
        public final C7839a m25139h0(C7839a c7839a) {
            int i10;
            if (c7839a == null) {
                return null;
            }
            int m34087k = c7839a.m34087k();
            int i11 = 0;
            while (true) {
                if (i11 >= m34087k) {
                    i10 = -1;
                    break;
                }
                C7839a.b m34086j = c7839a.m34086j(i11);
                if ((m34086j instanceof C9304l) && "com.apple.streaming.transportStreamTimestamp".equals(((C9304l) m34086j).f42436c)) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
            if (i10 == -1) {
                return c7839a;
            }
            if (m34087k == 1) {
                return null;
            }
            C7839a.b[] bVarArr = new C7839a.b[m34087k - 1];
            int i12 = 0;
            while (i12 < m34087k) {
                if (i12 != i10) {
                    bVarArr[i12 < i10 ? i12 : i12 - 1] = c7839a.m34086j(i12);
                }
                i12++;
            }
            return new C7839a(bVarArr);
        }

        /* renamed from: i0 */
        public void m25140i0(C9273n c9273n) {
            this.f28969J = c9273n;
            m581I();
        }

        /* renamed from: j0 */
        public void m25141j0(C4977j c4977j) {
            m609f0(c4977j.f28864k);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
        
            if (r0 != r4.f37084k) goto L15;
         */
        @Override // p009a8.C0118r0
        /* renamed from: w */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p267p6.C7629w0 mo624w(p267p6.C7629w0 r4) {
            /*
                r3 = this;
                r0 = r3
                v6.n r0 = r0.f28969J
                r5 = r0
                r0 = r5
                if (r0 == 0) goto Lc
                goto L11
            Lc:
                r0 = r4
                v6.n r0 = r0.f37089p
                r5 = r0
            L11:
                r0 = r5
                r6 = r0
                r0 = r5
                if (r0 == 0) goto L33
                r0 = r3
                java.util.Map<java.lang.String, v6.n> r0 = r0.f28968I
                r1 = r5
                java.lang.String r1 = r1.f42358d
                java.lang.Object r0 = r0.get(r1)
                v6.n r0 = (p365v6.C9273n) r0
                r7 = r0
                r0 = r5
                r6 = r0
                r0 = r7
                if (r0 == 0) goto L33
                r0 = r7
                r6 = r0
            L33:
                r0 = r3
                r1 = r4
                q7.a r1 = r1.f37084k
                q7.a r0 = r0.m25139h0(r1)
                r7 = r0
                r0 = r6
                r1 = r4
                v6.n r1 = r1.f37089p
                if (r0 != r1) goto L50
                r0 = r4
                r5 = r0
                r0 = r7
                r1 = r4
                q7.a r1 = r1.f37084k
                if (r0 == r1) goto L61
            L50:
                r0 = r4
                p6.w0$b r0 = r0.m33157b()
                r1 = r6
                p6.w0$b r0 = r0.m33201L(r1)
                r1 = r7
                p6.w0$b r0 = r0.m33213X(r1)
                p6.w0 r0 = r0.m33194E()
                r5 = r0
            L61:
                r0 = r3
                r1 = r5
                p6.w0 r0 = super.mo624w(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p114g8.C4985r.d.mo624w(p6.w0):p6.w0");
        }
    }

    public C4985r(int i10, b bVar, C4973f c4973f, Map<String, C9273n> map, InterfaceC0832b interfaceC0832b, long j10, C7629w0 c7629w0, InterfaceC9292z interfaceC9292z, InterfaceC9290x.a aVar, InterfaceC0837d0 interfaceC0837d0, InterfaceC0090d0.a aVar2, int i11) {
        this.f28935b = i10;
        this.f28936c = bVar;
        this.f28937d = c4973f;
        this.f28953t = map;
        this.f28938e = interfaceC0832b;
        this.f28939f = c7629w0;
        this.f28940g = interfaceC9292z;
        this.f28941h = aVar;
        this.f28942i = interfaceC0837d0;
        this.f28944k = aVar2;
        this.f28945l = i11;
        Set<Integer> set = f28910Y;
        this.f28957x = new HashSet(set.size());
        this.f28958y = new SparseIntArray(set.size());
        this.f28955v = new d[0];
        this.f28925O = new boolean[0];
        this.f28924N = new boolean[0];
        ArrayList<C4977j> arrayList = new ArrayList<>();
        this.f28947n = arrayList;
        this.f28948o = Collections.unmodifiableList(arrayList);
        this.f28952s = new ArrayList<>();
        this.f28949p = new Runnable(this) { // from class: g8.o

            /* renamed from: b */
            public final C4985r f28907b;

            {
                this.f28907b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f28907b.m25107U();
            }
        };
        this.f28950q = new Runnable(this) { // from class: g8.p

            /* renamed from: b */
            public final C4985r f28908b;

            {
                this.f28908b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f28908b.m25116d0();
            }
        };
        this.f28951r = C4401z0.m22421y();
        this.f28926P = j10;
        this.f28927Q = j10;
    }

    /* renamed from: D */
    public static C4322e m25085D(int i10, int i11) {
        C4392v.m22275i("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new C4322e();
    }

    /* renamed from: G */
    public static C7629w0 m25086G(C7629w0 c7629w0, C7629w0 c7629w02, boolean z10) {
        String m22296d;
        String str;
        if (c7629w0 == null) {
            return c7629w02;
        }
        int m22304l = C4400z.m22304l(c7629w02.f37086m);
        if (C4401z0.m22335L(c7629w0.f37083j, m22304l) == 1) {
            m22296d = C4401z0.m22337M(c7629w0.f37083j, m22304l);
            str = C4400z.m22299g(m22296d);
        } else {
            m22296d = C4400z.m22296d(c7629w0.f37083j, c7629w02.f37086m);
            str = c7629w02.f37086m;
        }
        C7629w0.b m33198I = c7629w02.m33157b().m33208S(c7629w0.f37075b).m33210U(c7629w0.f37076c).m33211V(c7629w0.f37077d).m33222g0(c7629w0.f37078e).m33218c0(c7629w0.f37079f).m33196G(z10 ? c7629w0.f37080g : -1).m33215Z(z10 ? c7629w0.f37081h : -1).m33198I(m22296d);
        if (m22304l == 2) {
            m33198I.m33225j0(c7629w0.f37091r).m33206Q(c7629w0.f37092s).m33205P(c7629w0.f37093t);
        }
        if (str != null) {
            m33198I.m33220e0(str);
        }
        int i10 = c7629w0.f37099z;
        if (i10 != -1 && m22304l == 1) {
            m33198I.m33197H(i10);
        }
        C7839a c7839a = c7629w0.f37084k;
        if (c7839a != null) {
            C7839a c7839a2 = c7629w02.f37084k;
            C7839a c7839a3 = c7839a;
            if (c7839a2 != null) {
                c7839a3 = c7839a2.m34085c(c7839a);
            }
            m33198I.m33213X(c7839a3);
        }
        return m33198I.m33194E();
    }

    /* renamed from: K */
    public static boolean m25087K(C7629w0 c7629w0, C7629w0 c7629w02) {
        String str = c7629w0.f37086m;
        String str2 = c7629w02.f37086m;
        int m22304l = C4400z.m22304l(str);
        boolean z10 = true;
        if (m22304l != 3) {
            return m22304l == C4400z.m22304l(str2);
        }
        if (!C4401z0.m22371c(str, str2)) {
            return false;
        }
        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
            return true;
        }
        if (c7629w0.f37072E != c7629w02.f37072E) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: O */
    public static int m25088O(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    /* renamed from: Q */
    public static boolean m25089Q(AbstractC1020f abstractC1020f) {
        return abstractC1020f instanceof C4977j;
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups", "trackGroupToSampleQueueIndex"})
    /* renamed from: A */
    public final void m25092A() {
        int i10;
        int i11;
        int i12;
        int length = this.f28955v.length;
        int i13 = 0;
        int i14 = 7;
        int i15 = -1;
        while (true) {
            i10 = i15;
            if (i13 >= length) {
                break;
            }
            String str = ((C7629w0) C4349a.m21886i(this.f28955v[i13].m578F())).f37086m;
            int i16 = C4400z.m22311s(str) ? 2 : C4400z.m22308p(str) ? 1 : C4400z.m22310r(str) ? 3 : 7;
            if (m25088O(i16) > m25088O(i14)) {
                i12 = i13;
                i11 = i16;
            } else {
                i11 = i14;
                i12 = i10;
                if (i16 == i14) {
                    i11 = i14;
                    i12 = i10;
                    if (i10 != -1) {
                        i12 = -1;
                        i11 = i14;
                    }
                }
            }
            i13++;
            i14 = i11;
            i15 = i12;
        }
        C0134z0 m25035i = this.f28937d.m25035i();
        int i17 = m25035i.f618b;
        this.f28922L = -1;
        this.f28921K = new int[length];
        for (int i18 = 0; i18 < length; i18++) {
            this.f28921K[i18] = i18;
        }
        C0134z0[] c0134z0Arr = new C0134z0[length];
        for (int i19 = 0; i19 < length; i19++) {
            C7629w0 c7629w0 = (C7629w0) C4349a.m21886i(this.f28955v[i19].m578F());
            if (i19 == i10) {
                C7629w0[] c7629w0Arr = new C7629w0[i17];
                if (i17 == 1) {
                    c7629w0Arr[0] = c7629w0.m33161m(m25035i.m663b(0));
                } else {
                    for (int i20 = 0; i20 < i17; i20++) {
                        c7629w0Arr[i20] = m25086G(m25035i.m663b(i20), c7629w0, true);
                    }
                }
                c0134z0Arr[i19] = new C0134z0(c7629w0Arr);
                this.f28922L = i19;
            } else {
                c0134z0Arr[i19] = new C0134z0(m25086G((i14 == 2 && C4400z.m22308p(c7629w0.f37086m)) ? this.f28939f : null, c7629w0, false));
            }
        }
        this.f28919I = m25096F(c0134z0Arr);
        C4349a.m21884g(this.f28920J == null);
        this.f28920J = Collections.emptySet();
    }

    /* renamed from: B */
    public final boolean m25093B(int i10) {
        for (int i11 = i10; i11 < this.f28947n.size(); i11++) {
            if (this.f28947n.get(i11).f28867n) {
                return false;
            }
        }
        C4977j c4977j = this.f28947n.get(i10);
        for (int i12 = 0; i12 < this.f28955v.length; i12++) {
            if (this.f28955v[i12].m575C() > c4977j.m25061m(i12)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    public void m25094C() {
        if (this.f28914D) {
            return;
        }
        mo337d(this.f28926P);
    }

    /* renamed from: E */
    public final C0118r0 m25095E(int i10, int i11) {
        int length = this.f28955v.length;
        boolean z10 = true;
        if (i11 != 1) {
            z10 = i11 == 2;
        }
        d dVar = new d(this.f28938e, this.f28951r.getLooper(), this.f28940g, this.f28941h, this.f28953t);
        dVar.m601b0(this.f28926P);
        if (z10) {
            dVar.m25140i0(this.f28933W);
        }
        dVar.m599a0(this.f28932V);
        C4977j c4977j = this.f28934X;
        if (c4977j != null) {
            dVar.m25141j0(c4977j);
        }
        dVar.m605d0(this);
        int i12 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f28956w, i12);
        this.f28956w = copyOf;
        copyOf[length] = i10;
        this.f28955v = (d[]) C4401z0.m22324F0(this.f28955v, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.f28925O, i12);
        this.f28925O = copyOf2;
        copyOf2[length] = z10;
        this.f28923M |= z10;
        this.f28957x.add(Integer.valueOf(i11));
        this.f28958y.append(i11, length);
        if (m25088O(i11) > m25088O(this.f28911A)) {
            this.f28912B = length;
            this.f28911A = i11;
        }
        this.f28924N = Arrays.copyOf(this.f28924N, i12);
        return dVar;
    }

    /* renamed from: F */
    public final C0083a1 m25096F(C0134z0[] c0134z0Arr) {
        for (int i10 = 0; i10 < c0134z0Arr.length; i10++) {
            C0134z0 c0134z0 = c0134z0Arr[i10];
            C7629w0[] c7629w0Arr = new C7629w0[c0134z0.f618b];
            for (int i11 = 0; i11 < c0134z0.f618b; i11++) {
                C7629w0 m663b = c0134z0.m663b(i11);
                c7629w0Arr[i11] = m663b.m33158c(this.f28940g.mo39088a(m663b));
            }
            c0134z0Arr[i10] = new C0134z0(c7629w0Arr);
        }
        return new C0083a1(c0134z0Arr);
    }

    /* renamed from: H */
    public final void m25097H(int i10) {
        C4349a.m21884g(!this.f28943j.m5324j());
        while (true) {
            if (i10 >= this.f28947n.size()) {
                i10 = -1;
                break;
            } else if (m25093B(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = m25100L().f6875h;
        C4977j m25098I = m25098I(i10);
        if (this.f28947n.isEmpty()) {
            this.f28927Q = this.f28926P;
        } else {
            ((C4977j) C4844y.m24603c(this.f28947n)).m25063o();
        }
        this.f28930T = false;
        this.f28944k.m380D(this.f28911A, m25098I.f6874g, j10);
    }

    /* renamed from: I */
    public final C4977j m25098I(int i10) {
        C4977j c4977j = this.f28947n.get(i10);
        ArrayList<C4977j> arrayList = this.f28947n;
        C4401z0.m22342O0(arrayList, i10, arrayList.size());
        for (int i11 = 0; i11 < this.f28955v.length; i11++) {
            this.f28955v[i11].m622u(c4977j.m25061m(i11));
        }
        return c4977j;
    }

    /* renamed from: J */
    public final boolean m25099J(C4977j c4977j) {
        int i10 = c4977j.f28864k;
        int length = this.f28955v.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f28924N[i11] && this.f28955v[i11].m588Q() == i10) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: L */
    public final C4977j m25100L() {
        ArrayList<C4977j> arrayList = this.f28947n;
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [g8.r$d[]] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* renamed from: M */
    public final InterfaceC4337t m25101M(int i10, int i11) {
        C4349a.m21878a(f28910Y.contains(Integer.valueOf(i11)));
        int i12 = this.f28958y.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.f28957x.add(Integer.valueOf(i11))) {
            this.f28956w[i12] = i10;
        }
        return this.f28956w[i12] == i10 ? this.f28955v[i12] : m25085D(i10, i11);
    }

    /* renamed from: N */
    public int m25102N() {
        return this.f28922L;
    }

    /* renamed from: P */
    public final void m25103P(C4977j c4977j) {
        this.f28934X = c4977j;
        this.f28916F = c4977j.f6871d;
        this.f28927Q = -9223372036854775807L;
        this.f28947n.add(c4977j);
        AbstractC4834t.a m24548x = AbstractC4834t.m24548x();
        for (d dVar : this.f28955v) {
            m24548x.m24554d(Integer.valueOf(dVar.m579G()));
        }
        c4977j.m25062n(this, m24548x.m24555e());
        for (d dVar2 : this.f28955v) {
            dVar2.m25141j0(c4977j);
            if (c4977j.f28867n) {
                dVar2.m610g0();
            }
        }
    }

    /* renamed from: R */
    public final boolean m25104R() {
        return this.f28927Q != -9223372036854775807L;
    }

    /* renamed from: S */
    public boolean m25105S(int i10) {
        return !m25104R() && this.f28955v[i10].m583K(this.f28930T);
    }

    @EnsuresNonNull({"trackGroupToSampleQueueIndex"})
    @RequiresNonNull({"trackGroups"})
    /* renamed from: T */
    public final void m25106T() {
        int i10 = this.f28919I.f261b;
        int[] iArr = new int[i10];
        this.f28921K = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                d[] dVarArr = this.f28955v;
                if (i12 >= dVarArr.length) {
                    break;
                }
                if (m25087K((C7629w0) C4349a.m21886i(dVarArr[i12].m578F()), this.f28919I.m323b(i11).m663b(0))) {
                    this.f28921K[i11] = i12;
                    break;
                }
                i12++;
            }
        }
        Iterator<C4981n> it = this.f28952s.iterator();
        while (it.hasNext()) {
            it.next().m25082b();
        }
    }

    /* renamed from: U */
    public final void m25107U() {
        if (!this.f28918H && this.f28921K == null && this.f28913C) {
            for (d dVar : this.f28955v) {
                if (dVar.m578F() == null) {
                    return;
                }
            }
            if (this.f28919I != null) {
                m25106T();
                return;
            }
            m25092A();
            m25125m0();
            this.f28936c.onPrepared();
        }
    }

    /* renamed from: V */
    public void m25108V() {
        this.f28943j.mo5320a();
        this.f28937d.m25039m();
    }

    /* renamed from: W */
    public void m25109W(int i10) {
        m25108V();
        this.f28955v[i10].m585N();
    }

    @Override // p027b9.C0839e0.b
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo485k(AbstractC1020f abstractC1020f, long j10, long j11, boolean z10) {
        this.f28954u = null;
        C0111o c0111o = new C0111o(abstractC1020f.f6868a, abstractC1020f.f6869b, abstractC1020f.m6006f(), abstractC1020f.m6005e(), j10, j11, abstractC1020f.m6003b());
        this.f28942i.mo5313d(abstractC1020f.f6868a);
        this.f28944k.m388r(c0111o, abstractC1020f.f6870c, this.f28935b, abstractC1020f.f6871d, abstractC1020f.f6872e, abstractC1020f.f6873f, abstractC1020f.f6874g, abstractC1020f.f6875h);
        if (z10) {
            return;
        }
        if (m25104R() || this.f28915E == 0) {
            m25120h0();
        }
        if (this.f28915E > 0) {
            this.f28936c.mo334a(this);
        }
    }

    @Override // p027b9.C0839e0.b
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void mo489r(AbstractC1020f abstractC1020f, long j10, long j11) {
        this.f28954u = null;
        this.f28937d.m25041o(abstractC1020f);
        C0111o c0111o = new C0111o(abstractC1020f.f6868a, abstractC1020f.f6869b, abstractC1020f.m6006f(), abstractC1020f.m6005e(), j10, j11, abstractC1020f.m6003b());
        this.f28942i.mo5313d(abstractC1020f.f6868a);
        this.f28944k.m391u(c0111o, abstractC1020f.f6870c, this.f28935b, abstractC1020f.f6871d, abstractC1020f.f6872e, abstractC1020f.f6873f, abstractC1020f.f6874g, abstractC1020f.f6875h);
        if (this.f28914D) {
            this.f28936c.mo334a(this);
        } else {
            mo337d(this.f28926P);
        }
    }

    @Override // p027b9.C0839e0.b
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public C0839e0.c mo486o(AbstractC1020f abstractC1020f, long j10, long j11, IOException iOException, int i10) {
        C0839e0.c m5319h;
        int i11;
        boolean m25089Q = m25089Q(abstractC1020f);
        if (m25089Q && !((C4977j) abstractC1020f).m25064q() && (iOException instanceof InterfaceC0831a0.e) && ((i11 = ((InterfaceC0831a0.e) iOException).f5741e) == 410 || i11 == 404)) {
            return C0839e0.f5768d;
        }
        long m6003b = abstractC1020f.m6003b();
        C0111o c0111o = new C0111o(abstractC1020f.f6868a, abstractC1020f.f6869b, abstractC1020f.m6006f(), abstractC1020f.m6005e(), j10, j11, m6003b);
        InterfaceC0837d0.c cVar = new InterfaceC0837d0.c(c0111o, new C0117r(abstractC1020f.f6870c, this.f28935b, abstractC1020f.f6871d, abstractC1020f.f6872e, abstractC1020f.f6873f, C7583h.m32761e(abstractC1020f.f6874g), C7583h.m32761e(abstractC1020f.f6875h)), iOException, i10);
        InterfaceC0837d0.b mo5312c = this.f28942i.mo5312c(C9890n.m41743a(this.f28937d.m25036j()), cVar);
        boolean z10 = false;
        boolean m25038l = (mo5312c == null || mo5312c.f5758a != 2) ? false : this.f28937d.m25038l(abstractC1020f, mo5312c.f5759b);
        if (m25038l) {
            if (m25089Q && m6003b == 0) {
                ArrayList<C4977j> arrayList = this.f28947n;
                if (arrayList.remove(arrayList.size() - 1) == abstractC1020f) {
                    z10 = true;
                }
                C4349a.m21884g(z10);
                if (this.f28947n.isEmpty()) {
                    this.f28927Q = this.f28926P;
                } else {
                    ((C4977j) C4844y.m24603c(this.f28947n)).m25063o();
                }
            }
            m5319h = C0839e0.f5770f;
        } else {
            long mo5310a = this.f28942i.mo5310a(cVar);
            m5319h = mo5310a != -9223372036854775807L ? C0839e0.m5319h(false, mo5310a) : C0839e0.f5771g;
        }
        boolean z11 = !m5319h.m5331c();
        this.f28944k.m393w(c0111o, abstractC1020f.f6870c, this.f28935b, abstractC1020f.f6871d, abstractC1020f.f6872e, abstractC1020f.f6873f, abstractC1020f.f6874g, abstractC1020f.f6875h, iOException, z11);
        if (z11) {
            this.f28954u = null;
            this.f28942i.mo5313d(abstractC1020f.f6868a);
        }
        if (m25038l) {
            if (this.f28914D) {
                this.f28936c.mo334a(this);
            } else {
                mo337d(this.f28926P);
            }
        }
        return m5319h;
    }

    /* renamed from: a0 */
    public void m25113a0() {
        this.f28957x.clear();
    }

    @Override // p009a8.InterfaceC0122t0
    /* renamed from: b */
    public boolean mo335b() {
        return this.f28943j.m5324j();
    }

    /* renamed from: b0 */
    public boolean m25114b0(Uri uri, InterfaceC0837d0.c cVar, boolean z10) {
        if (!this.f28937d.m25040n(uri)) {
            return true;
        }
        long j10 = -9223372036854775807L;
        if (!z10) {
            InterfaceC0837d0.b mo5312c = this.f28942i.mo5312c(C9890n.m41743a(this.f28937d.m25036j()), cVar);
            j10 = -9223372036854775807L;
            if (mo5312c != null) {
                j10 = -9223372036854775807L;
                if (mo5312c.f5758a == 2) {
                    j10 = mo5312c.f5759b;
                }
            }
        }
        return this.f28937d.m25042p(uri, j10);
    }

    @Override // p009a8.InterfaceC0122t0
    /* renamed from: c */
    public long mo336c() {
        if (m25104R()) {
            return this.f28927Q;
        }
        return this.f28930T ? Long.MIN_VALUE : m25100L().f6875h;
    }

    /* renamed from: c0 */
    public void m25115c0() {
        if (this.f28947n.isEmpty()) {
            return;
        }
        C4977j c4977j = (C4977j) C4844y.m24603c(this.f28947n);
        int m25031b = this.f28937d.m25031b(c4977j);
        if (m25031b == 1) {
            c4977j.m25069v();
        } else if (m25031b == 2 && !this.f28930T && this.f28943j.m5324j()) {
            this.f28943j.m5321f();
        }
    }

    @Override // p009a8.InterfaceC0122t0
    /* renamed from: d */
    public boolean mo337d(long j10) {
        List<C4977j> list;
        long max;
        if (this.f28930T || this.f28943j.m5324j() || this.f28943j.m5323i()) {
            return false;
        }
        if (m25104R()) {
            List<C4977j> emptyList = Collections.emptyList();
            long j11 = this.f28927Q;
            d[] dVarArr = this.f28955v;
            int length = dVarArr.length;
            int i10 = 0;
            while (true) {
                list = emptyList;
                max = j11;
                if (i10 >= length) {
                    break;
                }
                dVarArr[i10].m601b0(this.f28927Q);
                i10++;
            }
        } else {
            list = this.f28948o;
            C4977j m25100L = m25100L();
            max = m25100L.mo6046h() ? m25100L.f6875h : Math.max(this.f28926P, m25100L.f6874g);
        }
        this.f28946m.m25050a();
        this.f28937d.m25032d(j10, max, list, this.f28914D || !list.isEmpty(), this.f28946m);
        C4973f.b bVar = this.f28946m;
        boolean z10 = bVar.f28839b;
        AbstractC1020f abstractC1020f = bVar.f28838a;
        Uri uri = bVar.f28840c;
        if (z10) {
            this.f28927Q = -9223372036854775807L;
            this.f28930T = true;
            return true;
        }
        if (abstractC1020f == null) {
            if (uri == null) {
                return false;
            }
            this.f28936c.mo25077p(uri);
            return false;
        }
        if (m25089Q(abstractC1020f)) {
            m25103P((C4977j) abstractC1020f);
        }
        this.f28954u = abstractC1020f;
        this.f28944k.m377A(new C0111o(abstractC1020f.f6868a, abstractC1020f.f6869b, this.f28943j.m5328n(abstractC1020f, this, this.f28942i.mo5311b(abstractC1020f.f6870c))), abstractC1020f.f6870c, this.f28935b, abstractC1020f.f6871d, abstractC1020f.f6872e, abstractC1020f.f6873f, abstractC1020f.f6874g, abstractC1020f.f6875h);
        return true;
    }

    /* renamed from: d0 */
    public final void m25116d0() {
        this.f28913C = true;
        m25107U();
    }

    @Override // p057d7.InterfaceC4325h
    /* renamed from: e */
    public InterfaceC4337t mo479e(int i10, int i11) {
        InterfaceC4337t interfaceC4337t;
        if (!f28910Y.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                d[] dVarArr = this.f28955v;
                if (i12 >= dVarArr.length) {
                    interfaceC4337t = null;
                    break;
                }
                if (this.f28956w[i12] == i10) {
                    interfaceC4337t = dVarArr[i12];
                    break;
                }
                i12++;
            }
        } else {
            interfaceC4337t = m25101M(i10, i11);
        }
        InterfaceC4337t interfaceC4337t2 = interfaceC4337t;
        if (interfaceC4337t == null) {
            if (this.f28931U) {
                return m25085D(i10, i11);
            }
            interfaceC4337t2 = m25095E(i10, i11);
        }
        if (i11 != 5) {
            return interfaceC4337t2;
        }
        if (this.f28959z == null) {
            this.f28959z = new c(interfaceC4337t2, this.f28945l);
        }
        return this.f28959z;
    }

    /* renamed from: e0 */
    public void m25117e0(C0134z0[] c0134z0Arr, int i10, int... iArr) {
        this.f28919I = m25096F(c0134z0Arr);
        this.f28920J = new HashSet();
        for (int i11 : iArr) {
            this.f28920J.add(this.f28919I.m323b(i11));
        }
        this.f28922L = i10;
        Handler handler = this.f28951r;
        final b bVar = this.f28936c;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable(bVar) { // from class: g8.q

            /* renamed from: b */
            public final C4985r.b f28909b;

            {
                this.f28909b = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f28909b.onPrepared();
            }
        });
        m25125m0();
    }

    /* renamed from: f0 */
    public int m25118f0(int i10, C7632x0 c7632x0, C8638f c8638f, int i11) {
        if (m25104R()) {
            return -3;
        }
        if (!this.f28947n.isEmpty()) {
            int i12 = 0;
            while (i12 < this.f28947n.size() - 1 && m25099J(this.f28947n.get(i12))) {
                i12++;
            }
            C4401z0.m22342O0(this.f28947n, 0, i12);
            C4977j c4977j = this.f28947n.get(0);
            C7629w0 c7629w0 = c4977j.f6871d;
            if (!c7629w0.equals(this.f28917G)) {
                this.f28944k.m385i(this.f28935b, c7629w0, c4977j.f6872e, c4977j.f6873f, c4977j.f6874g);
            }
            this.f28917G = c7629w0;
        }
        if (!this.f28947n.isEmpty() && !this.f28947n.get(0).m25064q()) {
            return -3;
        }
        int m590S = this.f28955v[i10].m590S(c7632x0, c8638f, i11, this.f28930T);
        if (m590S == -5) {
            C7629w0 c7629w02 = (C7629w0) C4349a.m21882e(c7632x0.f37132b);
            C7629w0 c7629w03 = c7629w02;
            if (i10 == this.f28912B) {
                int m588Q = this.f28955v[i10].m588Q();
                int i13 = 0;
                while (i13 < this.f28947n.size() && this.f28947n.get(i13).f28864k != m588Q) {
                    i13++;
                }
                c7629w03 = c7629w02.m33161m(i13 < this.f28947n.size() ? this.f28947n.get(i13).f6871d : (C7629w0) C4349a.m21882e(this.f28916F));
            }
            c7632x0.f37132b = c7629w03;
        }
        return m590S;
    }

    @Override // p009a8.InterfaceC0122t0
    /* renamed from: g */
    public long mo340g() {
        if (this.f28930T) {
            return Long.MIN_VALUE;
        }
        if (m25104R()) {
            return this.f28927Q;
        }
        long j10 = this.f28926P;
        C4977j m25100L = m25100L();
        if (!m25100L.mo6046h()) {
            if (this.f28947n.size() > 1) {
                ArrayList<C4977j> arrayList = this.f28947n;
                m25100L = arrayList.get(arrayList.size() - 2);
            } else {
                m25100L = null;
            }
        }
        long j11 = j10;
        if (m25100L != null) {
            j11 = Math.max(j10, m25100L.f6875h);
        }
        long j12 = j11;
        if (this.f28913C) {
            d[] dVarArr = this.f28955v;
            int length = dVarArr.length;
            int i10 = 0;
            while (true) {
                j12 = j11;
                if (i10 >= length) {
                    break;
                }
                j11 = Math.max(j11, dVarArr[i10].m627z());
                i10++;
            }
        }
        return j12;
    }

    /* renamed from: g0 */
    public void m25119g0() {
        if (this.f28914D) {
            for (d dVar : this.f28955v) {
                dVar.m589R();
            }
        }
        this.f28943j.m5327m(this);
        this.f28951r.removeCallbacksAndMessages(null);
        this.f28918H = true;
        this.f28952s.clear();
    }

    @Override // p009a8.InterfaceC0122t0
    /* renamed from: h */
    public void mo341h(long j10) {
        if (this.f28943j.m5323i() || m25104R()) {
            return;
        }
        if (this.f28943j.m5324j()) {
            C4349a.m21882e(this.f28954u);
            if (this.f28937d.m25047u(j10, this.f28954u, this.f28948o)) {
                this.f28943j.m5321f();
                return;
            }
            return;
        }
        int size = this.f28948o.size();
        while (size > 0 && this.f28937d.m25031b(this.f28948o.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f28948o.size()) {
            m25097H(size);
        }
        int m25034g = this.f28937d.m25034g(j10, this.f28948o);
        if (m25034g < this.f28947n.size()) {
            m25097H(m25034g);
        }
    }

    /* renamed from: h0 */
    public final void m25120h0() {
        for (d dVar : this.f28955v) {
            dVar.m594W(this.f28928R);
        }
        this.f28928R = false;
    }

    /* renamed from: i0 */
    public final boolean m25121i0(long j10) {
        int length = this.f28955v.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f28955v[i10].m597Z(j10, false) && (this.f28925O[i10] || !this.f28923M)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j0 */
    public boolean m25122j0(long j10, boolean z10) {
        this.f28926P = j10;
        if (m25104R()) {
            this.f28927Q = j10;
            return true;
        }
        if (this.f28913C && !z10 && m25121i0(j10)) {
            return false;
        }
        this.f28927Q = j10;
        this.f28930T = false;
        this.f28947n.clear();
        if (!this.f28943j.m5324j()) {
            this.f28943j.m5322g();
            m25120h0();
            return true;
        }
        if (this.f28913C) {
            for (d dVar : this.f28955v) {
                dVar.m619r();
            }
        }
        this.f28943j.m5321f();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x023b  */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m25123k0(p421y8.InterfaceC9884h[] r11, boolean[] r12, p009a8.InterfaceC0120s0[] r13, boolean[] r14, long r15, boolean r17) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p114g8.C4985r.m25123k0(y8.h[], boolean[], a8.s0[], boolean[], long, boolean):boolean");
    }

    /* renamed from: l0 */
    public void m25124l0(C9273n c9273n) {
        if (C4401z0.m22371c(this.f28933W, c9273n)) {
            return;
        }
        this.f28933W = c9273n;
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.f28955v;
            if (i10 >= dVarArr.length) {
                return;
            }
            if (this.f28925O[i10]) {
                dVarArr[i10].m25140i0(c9273n);
            }
            i10++;
        }
    }

    @RequiresNonNull({"trackGroups", "optionalTrackGroups"})
    /* renamed from: m0 */
    public final void m25125m0() {
        this.f28914D = true;
    }

    /* renamed from: n0 */
    public void m25126n0(boolean z10) {
        this.f28937d.m25045s(z10);
    }

    /* renamed from: o0 */
    public void m25127o0(long j10) {
        if (this.f28932V != j10) {
            this.f28932V = j10;
            for (d dVar : this.f28955v) {
                dVar.m599a0(j10);
            }
        }
    }

    @Override // p057d7.InterfaceC4325h
    /* renamed from: p */
    public void mo487p(InterfaceC2348g interfaceC2348g) {
    }

    /* renamed from: p0 */
    public int m25128p0(int i10, long j10) {
        if (m25104R()) {
            return 0;
        }
        d dVar = this.f28955v[i10];
        int m577E = dVar.m577E(j10, this.f28930T);
        C4977j c4977j = (C4977j) C4844y.m24604d(this.f28947n, null);
        int i11 = m577E;
        if (c4977j != null) {
            i11 = m577E;
            if (!c4977j.m25064q()) {
                i11 = Math.min(m577E, c4977j.m25061m(i10) - dVar.m575C());
            }
        }
        dVar.m607e0(i11);
        return i11;
    }

    @Override // p027b9.C0839e0.f
    /* renamed from: q */
    public void mo488q() {
        for (d dVar : this.f28955v) {
            dVar.m591T();
        }
    }

    /* renamed from: q0 */
    public void m25129q0(int i10) {
        m25134y();
        C4349a.m21882e(this.f28921K);
        int i11 = this.f28921K[i10];
        C4349a.m21884g(this.f28924N[i11]);
        this.f28924N[i11] = false;
    }

    /* renamed from: r0 */
    public final void m25130r0(InterfaceC0120s0[] interfaceC0120s0Arr) {
        this.f28952s.clear();
        for (InterfaceC0120s0 interfaceC0120s0 : interfaceC0120s0Arr) {
            if (interfaceC0120s0 != null) {
                this.f28952s.add((C4981n) interfaceC0120s0);
            }
        }
    }

    /* renamed from: s */
    public void m25131s() {
        m25108V();
        if (this.f28930T && !this.f28914D) {
            throw C7594k1.m32822a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // p009a8.C0118r0.d
    /* renamed from: t */
    public void mo490t(C7629w0 c7629w0) {
        this.f28951r.post(this.f28949p);
    }

    @Override // p057d7.InterfaceC4325h
    /* renamed from: u */
    public void mo491u() {
        this.f28931U = true;
        this.f28951r.post(this.f28950q);
    }

    /* renamed from: v */
    public C0083a1 m25132v() {
        m25134y();
        return this.f28919I;
    }

    /* renamed from: w */
    public void m25133w(long j10, boolean z10) {
        if (!this.f28913C || m25104R()) {
            return;
        }
        int length = this.f28955v.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f28955v[i10].m618q(j10, z10, this.f28924N[i10]);
        }
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    /* renamed from: y */
    public final void m25134y() {
        C4349a.m21884g(this.f28914D);
        C4349a.m21882e(this.f28919I);
        C4349a.m21882e(this.f28920J);
    }

    /* renamed from: z */
    public int m25135z(int i10) {
        m25134y();
        C4349a.m21882e(this.f28921K);
        int i11 = this.f28921K[i10];
        int i12 = -2;
        if (i11 == -1) {
            if (this.f28920J.contains(this.f28919I.m323b(i10))) {
                i12 = -3;
            }
            return i12;
        }
        boolean[] zArr = this.f28924N;
        if (zArr[i11]) {
            return -2;
        }
        zArr[i11] = true;
        return i11;
    }
}
