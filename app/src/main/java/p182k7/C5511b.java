package p182k7;

import android.util.Pair;
import ec.InterfaceC4703f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p057d7.C4326i;
import p057d7.C4332o;
import p059d9.C4349a;
import p059d9.C4361f0;
import p059d9.C4392v;
import p059d9.C4400z;
import p059d9.C4401z0;
import p099fc.AbstractC4834t;
import p182k7.AbstractC5510a;
import p267p6.C7629w0;
import p283q7.C7839a;
import p365v6.C9273n;
import p381w7.C9425a;
import p381w7.C9429e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:k7/b.class
 */
/* renamed from: k7.b */
/* loaded from: combined.jar:classes2.jar:k7/b.class */
public final class C5511b {

    /* renamed from: a */
    public static final byte[] f31396a = C4401z0.m22396l0("OpusHead");

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:k7/b$a.class
     */
    /* renamed from: k7.b$a */
    /* loaded from: combined.jar:classes2.jar:k7/b$a.class */
    public static final class a {

        /* renamed from: a */
        public final int f31397a;

        /* renamed from: b */
        public int f31398b;

        /* renamed from: c */
        public int f31399c;

        /* renamed from: d */
        public long f31400d;

        /* renamed from: e */
        public final boolean f31401e;

        /* renamed from: f */
        public final C4361f0 f31402f;

        /* renamed from: g */
        public final C4361f0 f31403g;

        /* renamed from: h */
        public int f31404h;

        /* renamed from: i */
        public int f31405i;

        public a(C4361f0 c4361f0, C4361f0 c4361f02, boolean z10) {
            this.f31403g = c4361f0;
            this.f31402f = c4361f02;
            this.f31401e = z10;
            c4361f02.m21983P(12);
            this.f31397a = c4361f02.m21975H();
            c4361f0.m21983P(12);
            this.f31405i = c4361f0.m21975H();
            C4326i.m21819a(c4361f0.m21998n() != 1 ? false : true, "first_chunk must be 1");
            this.f31398b = -1;
        }

        /* renamed from: a */
        public boolean m27376a() {
            int i10 = this.f31398b + 1;
            this.f31398b = i10;
            if (i10 == this.f31397a) {
                return false;
            }
            this.f31400d = this.f31401e ? this.f31402f.m21976I() : this.f31402f.m21973F();
            if (this.f31398b != this.f31404h) {
                return true;
            }
            this.f31399c = this.f31403g.m21975H();
            this.f31403g.m21984Q(4);
            int i11 = this.f31405i - 1;
            this.f31405i = i11;
            this.f31404h = i11 > 0 ? this.f31403g.m21975H() - 1 : -1;
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:k7/b$b.class
     */
    /* renamed from: k7.b$b */
    /* loaded from: combined.jar:classes2.jar:k7/b$b.class */
    public interface b {
        /* renamed from: a */
        int mo27377a();

        /* renamed from: b */
        int mo27378b();

        /* renamed from: c */
        int mo27379c();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:k7/b$c.class
     */
    /* renamed from: k7.b$c */
    /* loaded from: combined.jar:classes2.jar:k7/b$c.class */
    public static final class c {

        /* renamed from: a */
        public final C5525p[] f31406a;

        /* renamed from: b */
        public C7629w0 f31407b;

        /* renamed from: c */
        public int f31408c;

        /* renamed from: d */
        public int f31409d = 0;

        public c(int i10) {
            this.f31406a = new C5525p[i10];
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:k7/b$d.class
     */
    /* renamed from: k7.b$d */
    /* loaded from: combined.jar:classes2.jar:k7/b$d.class */
    public static final class d implements b {

        /* renamed from: a */
        public final int f31410a;

        /* renamed from: b */
        public final int f31411b;

        /* renamed from: c */
        public final C4361f0 f31412c;

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0043, code lost:
        
            if ((r0 % r0) != 0) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(p182k7.AbstractC5510a.b r4, p267p6.C7629w0 r5) {
            /*
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r4
                d9.f0 r0 = r0.f31395b
                r4 = r0
                r0 = r3
                r1 = r4
                r0.f31412c = r1
                r0 = r4
                r1 = 12
                r0.m21983P(r1)
                r0 = r4
                int r0 = r0.m21975H()
                r7 = r0
                r0 = r7
                r6 = r0
                java.lang.String r0 = "audio/raw"
                r1 = r5
                java.lang.String r1 = r1.f37086m
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L76
                r0 = r5
                int r0 = r0.f37069B
                r1 = r5
                int r1 = r1.f37099z
                int r0 = p059d9.C4401z0.m22375d0(r0, r1)
                r8 = r0
                r0 = r7
                if (r0 == 0) goto L46
                r0 = r7
                r6 = r0
                r0 = r7
                r1 = r8
                int r0 = r0 % r1
                if (r0 == 0) goto L76
            L46:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r5 = r0
                r0 = r5
                java.lang.String r1 = "Audio sample size mismatch. stsd sample size: "
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r5
                r1 = r8
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r5
                java.lang.String r1 = ", stsz sample size: "
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r5
                r1 = r7
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = "AtomParsers"
                r1 = r5
                java.lang.String r1 = r1.toString()
                p059d9.C4392v.m22275i(r0, r1)
                r0 = r8
                r6 = r0
            L76:
                r0 = r6
                r7 = r0
                r0 = r6
                if (r0 != 0) goto L80
                r0 = -1
                r7 = r0
            L80:
                r0 = r3
                r1 = r7
                r0.f31410a = r1
                r0 = r3
                r1 = r4
                int r1 = r1.m21975H()
                r0.f31411b = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p182k7.C5511b.d.<init>(k7.a$b, p6.w0):void");
        }

        @Override // p182k7.C5511b.b
        /* renamed from: a */
        public int mo27377a() {
            int i10 = this.f31410a;
            int i11 = i10;
            if (i10 == -1) {
                i11 = this.f31412c.m21975H();
            }
            return i11;
        }

        @Override // p182k7.C5511b.b
        /* renamed from: b */
        public int mo27378b() {
            return this.f31410a;
        }

        @Override // p182k7.C5511b.b
        /* renamed from: c */
        public int mo27379c() {
            return this.f31411b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:k7/b$e.class
     */
    /* renamed from: k7.b$e */
    /* loaded from: combined.jar:classes2.jar:k7/b$e.class */
    public static final class e implements b {

        /* renamed from: a */
        public final C4361f0 f31413a;

        /* renamed from: b */
        public final int f31414b;

        /* renamed from: c */
        public final int f31415c;

        /* renamed from: d */
        public int f31416d;

        /* renamed from: e */
        public int f31417e;

        public e(AbstractC5510a.b bVar) {
            C4361f0 c4361f0 = bVar.f31395b;
            this.f31413a = c4361f0;
            c4361f0.m21983P(12);
            this.f31415c = c4361f0.m21975H() & 255;
            this.f31414b = c4361f0.m21975H();
        }

        @Override // p182k7.C5511b.b
        /* renamed from: a */
        public int mo27377a() {
            int i10 = this.f31415c;
            if (i10 == 8) {
                return this.f31413a.m21971D();
            }
            if (i10 == 16) {
                return this.f31413a.m21977J();
            }
            int i11 = this.f31416d;
            this.f31416d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f31417e & 15;
            }
            int m21971D = this.f31413a.m21971D();
            this.f31417e = m21971D;
            return (m21971D & 240) >> 4;
        }

        @Override // p182k7.C5511b.b
        /* renamed from: b */
        public int mo27378b() {
            return -1;
        }

        @Override // p182k7.C5511b.b
        /* renamed from: c */
        public int mo27379c() {
            return this.f31414b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:k7/b$f.class
     */
    /* renamed from: k7.b$f */
    /* loaded from: combined.jar:classes2.jar:k7/b$f.class */
    public static final class f {

        /* renamed from: a */
        public final int f31418a;

        /* renamed from: b */
        public final long f31419b;

        /* renamed from: c */
        public final int f31420c;

        public f(int i10, long j10, int i11) {
            this.f31418a = i10;
            this.f31419b = j10;
            this.f31420c = i11;
        }
    }

    /* renamed from: A */
    public static Pair<C7839a, C7839a> m27347A(AbstractC5510a.b bVar) {
        C7839a c7839a;
        C4361f0 c4361f0 = bVar.f31395b;
        c4361f0.m21983P(8);
        C7839a c7839a2 = null;
        C7839a c7839a3 = null;
        while (c4361f0.m21985a() >= 8) {
            int m21989e = c4361f0.m21989e();
            int m21998n = c4361f0.m21998n();
            int m21998n2 = c4361f0.m21998n();
            if (m21998n2 == 1835365473) {
                c4361f0.m21983P(m21989e);
                c7839a = m27348B(c4361f0, m21989e + m21998n);
            } else {
                c7839a = c7839a2;
                if (m21998n2 == 1936553057) {
                    c4361f0.m21983P(m21989e);
                    c7839a3 = m27369t(c4361f0, m21989e + m21998n);
                    c7839a = c7839a2;
                }
            }
            c4361f0.m21983P(m21989e + m21998n);
            c7839a2 = c7839a;
        }
        return Pair.create(c7839a2, c7839a3);
    }

    /* renamed from: B */
    public static C7839a m27348B(C4361f0 c4361f0, int i10) {
        c4361f0.m21984Q(8);
        m27353d(c4361f0);
        while (c4361f0.m21989e() < i10) {
            int m21989e = c4361f0.m21989e();
            int m21998n = c4361f0.m21998n();
            if (c4361f0.m21998n() == 1768715124) {
                c4361f0.m21983P(m21989e);
                return m27360k(c4361f0, m21989e + m21998n);
            }
            c4361f0.m21983P(m21989e + m21998n);
        }
        return null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* renamed from: C */
    public static void m27349C(p059d9.C4361f0 r7, int r8, int r9, int r10, int r11, int r12, p365v6.C9273n r13, p182k7.C5511b.c r14, int r15) {
        /*
            Method dump skipped, instructions count: 1418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p182k7.C5511b.m27349C(d9.f0, int, int, int, int, int, v6.n, k7.b$c, int):void");
    }

    /* renamed from: a */
    public static boolean m27350a(long[] jArr, long j10, long j11, long j12) {
        boolean z10 = true;
        int length = jArr.length - 1;
        int m22409s = C4401z0.m22409s(4, 0, length);
        int m22409s2 = C4401z0.m22409s(jArr.length - 4, 0, length);
        if (jArr[0] > j11 || j11 >= jArr[m22409s] || jArr[m22409s2] >= j12 || j12 > j10) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: b */
    public static int m27351b(C4361f0 c4361f0, int i10, int i11) {
        int m21989e = c4361f0.m21989e();
        while (true) {
            int i12 = m21989e;
            if (i12 - i10 >= i11) {
                return -1;
            }
            c4361f0.m21983P(i12);
            int m21998n = c4361f0.m21998n();
            C4326i.m21819a(m21998n > 0, "childAtomSize must be positive");
            if (c4361f0.m21998n() == 1702061171) {
                return i12;
            }
            m21989e = i12 + m21998n;
        }
    }

    /* renamed from: c */
    public static int m27352c(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    /* renamed from: d */
    public static void m27353d(C4361f0 c4361f0) {
        int m21989e = c4361f0.m21989e();
        c4361f0.m21984Q(4);
        int i10 = m21989e;
        if (c4361f0.m21998n() != 1751411826) {
            i10 = m21989e + 4;
        }
        c4361f0.m21983P(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0507 A[EDGE_INSN: B:82:0x0507->B:83:0x0507 BREAK  A[LOOP:0: B:26:0x0239->B:36:0x04ed], SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m27354e(p059d9.C4361f0 r5, int r6, int r7, int r8, int r9, java.lang.String r10, boolean r11, p365v6.C9273n r12, p182k7.C5511b.c r13, int r14) {
        /*
            Method dump skipped, instructions count: 1360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p182k7.C5511b.m27354e(d9.f0, int, int, int, int, java.lang.String, boolean, v6.n, k7.b$c, int):void");
    }

    /* renamed from: f */
    public static Pair<Integer, C5525p> m27355f(C4361f0 c4361f0, int i10, int i11) {
        String str;
        Integer num;
        int i12 = i10 + 8;
        String str2 = null;
        Integer num2 = null;
        int i13 = -1;
        int i14 = 0;
        while (i12 - i10 < i11) {
            c4361f0.m21983P(i12);
            int m21998n = c4361f0.m21998n();
            int m21998n2 = c4361f0.m21998n();
            if (m21998n2 == 1718775137) {
                num = Integer.valueOf(c4361f0.m21998n());
                str = str2;
            } else if (m21998n2 == 1935894637) {
                c4361f0.m21984Q(4);
                str = c4361f0.m21968A(4);
                num = num2;
            } else {
                str = str2;
                num = num2;
                if (m21998n2 == 1935894633) {
                    i13 = i12;
                    i14 = m21998n;
                    num = num2;
                    str = str2;
                }
            }
            i12 += m21998n;
            str2 = str;
            num2 = num;
        }
        if (!"cenc".equals(str2) && !"cbc1".equals(str2) && !"cens".equals(str2) && !"cbcs".equals(str2)) {
            return null;
        }
        C4326i.m21819a(num2 != null, "frma atom is mandatory");
        C4326i.m21819a(i13 != -1, "schi atom is mandatory");
        C5525p m27368s = m27368s(c4361f0, i13, i14, str2);
        boolean z10 = false;
        if (m27368s != null) {
            z10 = true;
        }
        C4326i.m21819a(z10, "tenc atom is mandatory");
        return Pair.create(num2, (C5525p) C4401z0.m22391j(m27368s));
    }

    /* renamed from: g */
    public static Pair<long[], long[]> m27356g(AbstractC5510a.a aVar) {
        AbstractC5510a.b m27346g = aVar.m27346g(1701606260);
        if (m27346g == null) {
            return null;
        }
        C4361f0 c4361f0 = m27346g.f31395b;
        c4361f0.m21983P(8);
        int m27342c = AbstractC5510a.m27342c(c4361f0.m21998n());
        int m21975H = c4361f0.m21975H();
        long[] jArr = new long[m21975H];
        long[] jArr2 = new long[m21975H];
        for (int i10 = 0; i10 < m21975H; i10++) {
            jArr[i10] = m27342c == 1 ? c4361f0.m21976I() : c4361f0.m21973F();
            jArr2[i10] = m27342c == 1 ? c4361f0.m22007w() : c4361f0.m21998n();
            if (c4361f0.m22010z() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            c4361f0.m21984Q(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* renamed from: h */
    public static Pair<String, byte[]> m27357h(C4361f0 c4361f0, int i10) {
        c4361f0.m21983P(i10 + 8 + 4);
        c4361f0.m21984Q(1);
        m27358i(c4361f0);
        c4361f0.m21984Q(2);
        int m21971D = c4361f0.m21971D();
        if ((m21971D & 128) != 0) {
            c4361f0.m21984Q(2);
        }
        if ((m21971D & 64) != 0) {
            c4361f0.m21984Q(c4361f0.m21977J());
        }
        if ((m21971D & 32) != 0) {
            c4361f0.m21984Q(2);
        }
        c4361f0.m21984Q(1);
        m27358i(c4361f0);
        String m22300h = C4400z.m22300h(c4361f0.m21971D());
        if ("audio/mpeg".equals(m22300h) || "audio/vnd.dts".equals(m22300h) || "audio/vnd.dts.hd".equals(m22300h)) {
            return Pair.create(m22300h, null);
        }
        c4361f0.m21984Q(12);
        c4361f0.m21984Q(1);
        int m27358i = m27358i(c4361f0);
        byte[] bArr = new byte[m27358i];
        c4361f0.m21994j(bArr, 0, m27358i);
        return Pair.create(m22300h, bArr);
    }

    /* renamed from: i */
    public static int m27358i(C4361f0 c4361f0) {
        int m21971D = c4361f0.m21971D();
        int i10 = m21971D & 127;
        while (true) {
            int i11 = i10;
            if ((m21971D & 128) != 128) {
                return i11;
            }
            m21971D = c4361f0.m21971D();
            i10 = (i11 << 7) | (m21971D & 127);
        }
    }

    /* renamed from: j */
    public static int m27359j(C4361f0 c4361f0) {
        c4361f0.m21983P(16);
        return c4361f0.m21998n();
    }

    /* renamed from: k */
    public static C7839a m27360k(C4361f0 c4361f0, int i10) {
        c4361f0.m21984Q(8);
        ArrayList arrayList = new ArrayList();
        while (c4361f0.m21989e() < i10) {
            C7839a.b m27437c = C5517h.m27437c(c4361f0);
            if (m27437c != null) {
                arrayList.add(m27437c);
            }
        }
        return arrayList.isEmpty() ? null : new C7839a(arrayList);
    }

    /* renamed from: l */
    public static Pair<Long, String> m27361l(C4361f0 c4361f0) {
        c4361f0.m21983P(8);
        int m27342c = AbstractC5510a.m27342c(c4361f0.m21998n());
        c4361f0.m21984Q(m27342c == 0 ? 8 : 16);
        long m21973F = c4361f0.m21973F();
        int i10 = 8;
        if (m27342c == 0) {
            i10 = 4;
        }
        c4361f0.m21984Q(i10);
        int m21977J = c4361f0.m21977J();
        return Pair.create(Long.valueOf(m21973F), "" + ((char) (((m21977J >> 10) & 31) + 96)) + ((char) (((m21977J >> 5) & 31) + 96)) + ((char) ((m21977J & 31) + 96)));
    }

    /* renamed from: m */
    public static C7839a m27362m(AbstractC5510a.a aVar) {
        AbstractC5510a.b m27346g = aVar.m27346g(1751411826);
        AbstractC5510a.b m27346g2 = aVar.m27346g(1801812339);
        AbstractC5510a.b m27346g3 = aVar.m27346g(1768715124);
        C7839a c7839a = null;
        if (m27346g != null) {
            c7839a = null;
            if (m27346g2 != null) {
                c7839a = null;
                if (m27346g3 != null) {
                    if (m27359j(m27346g.f31395b) != 1835299937) {
                        c7839a = null;
                    } else {
                        C4361f0 c4361f0 = m27346g2.f31395b;
                        c4361f0.m21983P(12);
                        int m21998n = c4361f0.m21998n();
                        String[] strArr = new String[m21998n];
                        for (int i10 = 0; i10 < m21998n; i10++) {
                            int m21998n2 = c4361f0.m21998n();
                            c4361f0.m21984Q(4);
                            strArr[i10] = c4361f0.m21968A(m21998n2 - 8);
                        }
                        C4361f0 c4361f02 = m27346g3.f31395b;
                        c4361f02.m21983P(8);
                        ArrayList arrayList = new ArrayList();
                        while (c4361f02.m21985a() > 8) {
                            int m21989e = c4361f02.m21989e();
                            int m21998n3 = c4361f02.m21998n();
                            int m21998n4 = c4361f02.m21998n() - 1;
                            if (m21998n4 < 0 || m21998n4 >= m21998n) {
                                C4392v.m22275i("AtomParsers", "Skipped metadata with unknown key index: " + m21998n4);
                            } else {
                                C9425a m27440f = C5517h.m27440f(c4361f02, m21989e + m21998n3, strArr[m21998n4]);
                                if (m27440f != null) {
                                    arrayList.add(m27440f);
                                }
                            }
                            c4361f02.m21983P(m21989e + m21998n3);
                        }
                        c7839a = arrayList.isEmpty() ? null : new C7839a(arrayList);
                    }
                }
            }
        }
        return c7839a;
    }

    /* renamed from: n */
    public static void m27363n(C4361f0 c4361f0, int i10, int i11, int i12, c cVar) {
        c4361f0.m21983P(i11 + 8 + 8);
        if (i10 == 1835365492) {
            c4361f0.m22008x();
            String m22008x = c4361f0.m22008x();
            if (m22008x != null) {
                cVar.f31407b = new C7629w0.b().m33207R(i12).m33220e0(m22008x).m33194E();
            }
        }
    }

    /* renamed from: o */
    public static long m27364o(C4361f0 c4361f0) {
        int i10 = 8;
        c4361f0.m21983P(8);
        if (AbstractC5510a.m27342c(c4361f0.m21998n()) != 0) {
            i10 = 16;
        }
        c4361f0.m21984Q(i10);
        return c4361f0.m21973F();
    }

    /* renamed from: p */
    public static float m27365p(C4361f0 c4361f0, int i10) {
        c4361f0.m21983P(i10 + 8);
        return c4361f0.m21975H() / c4361f0.m21975H();
    }

    /* renamed from: q */
    public static byte[] m27366q(C4361f0 c4361f0, int i10, int i11) {
        int i12 = i10;
        int i13 = 8;
        while (true) {
            int i14 = i12 + i13;
            if (i14 - i10 >= i11) {
                return null;
            }
            c4361f0.m21983P(i14);
            int m21998n = c4361f0.m21998n();
            if (c4361f0.m21998n() == 1886547818) {
                return Arrays.copyOfRange(c4361f0.m21988d(), i14, m21998n + i14);
            }
            i12 = i14;
            i13 = m21998n;
        }
    }

    /* renamed from: r */
    public static Pair<Integer, C5525p> m27367r(C4361f0 c4361f0, int i10, int i11) {
        Pair<Integer, C5525p> m27355f;
        int m21989e = c4361f0.m21989e();
        while (true) {
            int i12 = m21989e;
            if (i12 - i10 >= i11) {
                return null;
            }
            c4361f0.m21983P(i12);
            int m21998n = c4361f0.m21998n();
            C4326i.m21819a(m21998n > 0, "childAtomSize must be positive");
            if (c4361f0.m21998n() == 1936289382 && (m27355f = m27355f(c4361f0, i12, m21998n)) != null) {
                return m27355f;
            }
            m21989e = i12 + m21998n;
        }
    }

    /* renamed from: s */
    public static C5525p m27368s(C4361f0 c4361f0, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10;
        int i15 = 8;
        while (true) {
            int i16 = i14 + i15;
            if (i16 - i10 >= i11) {
                return null;
            }
            c4361f0.m21983P(i16);
            int m21998n = c4361f0.m21998n();
            if (c4361f0.m21998n() == 1952804451) {
                int m27342c = AbstractC5510a.m27342c(c4361f0.m21998n());
                c4361f0.m21984Q(1);
                if (m27342c == 0) {
                    c4361f0.m21984Q(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int m21971D = c4361f0.m21971D();
                    i12 = m21971D & 15;
                    i13 = (m21971D & 240) >> 4;
                }
                boolean z10 = c4361f0.m21971D() == 1;
                int m21971D2 = c4361f0.m21971D();
                byte[] bArr = new byte[16];
                c4361f0.m21994j(bArr, 0, 16);
                byte[] bArr2 = null;
                if (z10) {
                    bArr2 = null;
                    if (m21971D2 == 0) {
                        int m21971D3 = c4361f0.m21971D();
                        bArr2 = new byte[m21971D3];
                        c4361f0.m21994j(bArr2, 0, m21971D3);
                    }
                }
                return new C5525p(z10, str, m21971D2, bArr, i13, i12, bArr2);
            }
            i14 = i16;
            i15 = m21998n;
        }
    }

    /* renamed from: t */
    public static C7839a m27369t(C4361f0 c4361f0, int i10) {
        c4361f0.m21984Q(12);
        while (c4361f0.m21989e() < i10) {
            int m21989e = c4361f0.m21989e();
            int m21998n = c4361f0.m21998n();
            if (c4361f0.m21998n() == 1935766900) {
                if (m21998n < 14) {
                    return null;
                }
                c4361f0.m21984Q(5);
                int m21971D = c4361f0.m21971D();
                if (m21971D != 12 && m21971D != 13) {
                    return null;
                }
                float f10 = m21971D == 12 ? 240.0f : 120.0f;
                c4361f0.m21984Q(1);
                return new C7839a(new C9429e(f10, c4361f0.m21971D()));
            }
            c4361f0.m21983P(m21989e + m21998n);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x053d  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p182k7.C5527r m27370u(p182k7.C5524o r15, p182k7.AbstractC5510a.a r16, p057d7.C4332o r17) {
        /*
            Method dump skipped, instructions count: 2246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p182k7.C5511b.m27370u(k7.o, k7.a$a, d7.o):k7.r");
    }

    /* renamed from: v */
    public static c m27371v(C4361f0 c4361f0, int i10, int i11, String str, C9273n c9273n, boolean z10) {
        c4361f0.m21983P(12);
        int m21998n = c4361f0.m21998n();
        c cVar = new c(m21998n);
        for (int i12 = 0; i12 < m21998n; i12++) {
            int m21989e = c4361f0.m21989e();
            int m21998n2 = c4361f0.m21998n();
            C4326i.m21819a(m21998n2 > 0, "childAtomSize must be positive");
            int m21998n3 = c4361f0.m21998n();
            if (m21998n3 == 1635148593 || m21998n3 == 1635148595 || m21998n3 == 1701733238 || m21998n3 == 1831958048 || m21998n3 == 1836070006 || m21998n3 == 1752589105 || m21998n3 == 1751479857 || m21998n3 == 1932670515 || m21998n3 == 1211250227 || m21998n3 == 1987063864 || m21998n3 == 1987063865 || m21998n3 == 1635135537 || m21998n3 == 1685479798 || m21998n3 == 1685479729 || m21998n3 == 1685481573 || m21998n3 == 1685481521) {
                m27349C(c4361f0, m21998n3, m21989e, m21998n2, i10, i11, c9273n, cVar, i12);
            } else if (m21998n3 == 1836069985 || m21998n3 == 1701733217 || m21998n3 == 1633889587 || m21998n3 == 1700998451 || m21998n3 == 1633889588 || m21998n3 == 1685353315 || m21998n3 == 1685353317 || m21998n3 == 1685353320 || m21998n3 == 1685353324 || m21998n3 == 1685353336 || m21998n3 == 1935764850 || m21998n3 == 1935767394 || m21998n3 == 1819304813 || m21998n3 == 1936684916 || m21998n3 == 1953984371 || m21998n3 == 778924082 || m21998n3 == 778924083 || m21998n3 == 1835557169 || m21998n3 == 1835560241 || m21998n3 == 1634492771 || m21998n3 == 1634492791 || m21998n3 == 1970037111 || m21998n3 == 1332770163 || m21998n3 == 1716281667) {
                m27354e(c4361f0, m21998n3, m21989e, m21998n2, i10, str, z10, c9273n, cVar, i12);
            } else if (m21998n3 == 1414810956 || m21998n3 == 1954034535 || m21998n3 == 2004251764 || m21998n3 == 1937010800 || m21998n3 == 1664495672) {
                m27372w(c4361f0, m21998n3, m21989e, m21998n2, i10, str, cVar);
            } else if (m21998n3 == 1835365492) {
                m27363n(c4361f0, m21998n3, m21989e, i10, cVar);
            } else if (m21998n3 == 1667329389) {
                cVar.f31407b = new C7629w0.b().m33207R(i10).m33220e0("application/x-camera-motion").m33194E();
            }
            c4361f0.m21983P(m21989e + m21998n2);
        }
        return cVar;
    }

    /* renamed from: w */
    public static void m27372w(C4361f0 c4361f0, int i10, int i11, int i12, int i13, String str, c cVar) {
        String str2;
        c4361f0.m21983P(i11 + 8 + 8);
        AbstractC4834t abstractC4834t = null;
        long j10 = Long.MAX_VALUE;
        if (i10 == 1414810956) {
            str2 = "application/ttml+xml";
        } else if (i10 == 1954034535) {
            int i14 = (i12 - 8) - 8;
            byte[] bArr = new byte[i14];
            c4361f0.m21994j(bArr, 0, i14);
            abstractC4834t = AbstractC4834t.m24540F(bArr);
            str2 = "application/x-quicktime-tx3g";
        } else if (i10 == 2004251764) {
            str2 = "application/x-mp4-vtt";
        } else if (i10 == 1937010800) {
            j10 = 0;
            str2 = "application/ttml+xml";
        } else {
            if (i10 != 1664495672) {
                throw new IllegalStateException();
            }
            cVar.f31409d = 1;
            str2 = "application/x-mp4-cea-608";
        }
        cVar.f31407b = new C7629w0.b().m33207R(i13).m33220e0(str2).m33211V(str).m33224i0(j10).m33209T(abstractC4834t).m33194E();
    }

    /* renamed from: x */
    public static f m27373x(C4361f0 c4361f0) {
        boolean z10;
        long m21973F;
        int i10;
        c4361f0.m21983P(8);
        int m27342c = AbstractC5510a.m27342c(c4361f0.m21998n());
        c4361f0.m21984Q(m27342c == 0 ? 8 : 16);
        int m21998n = c4361f0.m21998n();
        c4361f0.m21984Q(4);
        int m21989e = c4361f0.m21989e();
        int i11 = 8;
        if (m27342c == 0) {
            i11 = 4;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                z10 = true;
                break;
            }
            if (c4361f0.m21988d()[m21989e + i12] != -1) {
                z10 = false;
                break;
            }
            i12++;
        }
        if (z10) {
            c4361f0.m21984Q(i11);
            m21973F = -9223372036854775807L;
        } else {
            m21973F = m27342c == 0 ? c4361f0.m21973F() : c4361f0.m21976I();
            if (m21973F == 0) {
                m21973F = -9223372036854775807L;
            }
        }
        c4361f0.m21984Q(16);
        int m21998n2 = c4361f0.m21998n();
        int m21998n3 = c4361f0.m21998n();
        c4361f0.m21984Q(4);
        int m21998n4 = c4361f0.m21998n();
        int m21998n5 = c4361f0.m21998n();
        if (m21998n2 == 0 && m21998n3 == 65536 && m21998n4 == -65536 && m21998n5 == 0) {
            i10 = 90;
        } else if (m21998n2 == 0 && m21998n3 == -65536 && m21998n4 == 65536 && m21998n5 == 0) {
            i10 = 270;
        } else {
            i10 = 0;
            if (m21998n2 == -65536) {
                i10 = 0;
                if (m21998n3 == 0) {
                    i10 = 0;
                    if (m21998n4 == 0) {
                        i10 = 0;
                        if (m21998n5 == -65536) {
                            i10 = 180;
                        }
                    }
                }
            }
        }
        return new f(m21998n, m21973F, i10);
    }

    /* renamed from: y */
    public static C5524o m27374y(AbstractC5510a.a aVar, AbstractC5510a.b bVar, long j10, C9273n c9273n, boolean z10, boolean z11) {
        long[] jArr;
        long[] jArr2;
        AbstractC5510a.a m27345f;
        Pair<long[], long[]> m27356g;
        AbstractC5510a.a aVar2 = (AbstractC5510a.a) C4349a.m21882e(aVar.m27345f(1835297121));
        int m27352c = m27352c(m27359j(((AbstractC5510a.b) C4349a.m21882e(aVar2.m27346g(1751411826))).f31395b));
        if (m27352c == -1) {
            return null;
        }
        f m27373x = m27373x(((AbstractC5510a.b) C4349a.m21882e(aVar.m27346g(1953196132))).f31395b);
        if (j10 == -9223372036854775807L) {
            j10 = m27373x.f31419b;
        }
        long m27364o = m27364o(bVar.f31395b);
        long m22346Q0 = j10 == -9223372036854775807L ? -9223372036854775807L : C4401z0.m22346Q0(j10, 1000000L, m27364o);
        AbstractC5510a.a aVar3 = (AbstractC5510a.a) C4349a.m21882e(((AbstractC5510a.a) C4349a.m21882e(aVar2.m27345f(1835626086))).m27345f(1937007212));
        Pair<Long, String> m27361l = m27361l(((AbstractC5510a.b) C4349a.m21882e(aVar2.m27346g(1835296868))).f31395b);
        c m27371v = m27371v(((AbstractC5510a.b) C4349a.m21882e(aVar3.m27346g(1937011556))).f31395b, m27373x.f31418a, m27373x.f31420c, (String) m27361l.second, c9273n, z11);
        if (z10 || (m27345f = aVar.m27345f(1701082227)) == null || (m27356g = m27356g(m27345f)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            jArr = (long[]) m27356g.first;
            jArr2 = (long[]) m27356g.second;
        }
        return m27371v.f31407b == null ? null : new C5524o(m27373x.f31418a, m27352c, ((Long) m27361l.first).longValue(), m27364o, m22346Q0, m27371v.f31407b, m27371v.f31409d, m27371v.f31406a, m27371v.f31408c, jArr, jArr2);
    }

    /* renamed from: z */
    public static List<C5527r> m27375z(AbstractC5510a.a aVar, C4332o c4332o, long j10, C9273n c9273n, boolean z10, boolean z11, InterfaceC4703f<C5524o, C5524o> interfaceC4703f) {
        C5524o apply;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < aVar.f31394d.size(); i10++) {
            AbstractC5510a.a aVar2 = aVar.f31394d.get(i10);
            if (aVar2.f31391a == 1953653099 && (apply = interfaceC4703f.apply(m27374y(aVar2, (AbstractC5510a.b) C4349a.m21882e(aVar.m27346g(1836476516)), j10, c9273n, z10, z11))) != null) {
                arrayList.add(m27370u(apply, (AbstractC5510a.a) C4349a.m21882e(((AbstractC5510a.a) C4349a.m21882e(((AbstractC5510a.a) C4349a.m21882e(aVar2.m27345f(1835297121))).m27345f(1835626086))).m27345f(1937007212)), c4332o));
            }
        }
        return arrayList;
    }
}
