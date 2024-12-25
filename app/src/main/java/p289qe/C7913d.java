package p289qe;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p444zd.C10195c;
import p444zd.C10197e;
import p444zd.C10204l;
import p444zd.EnumC10196d;
import td.C8691f;
import td.EnumC8690e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qe/d.class
 */
/* renamed from: qe.d */
/* loaded from: combined.jar:classes2.jar:qe/d.class */
public final class C7913d {

    /* renamed from: a */
    public static final char[] f38048a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qe/d$a.class
     */
    /* renamed from: qe.d$a */
    /* loaded from: combined.jar:classes2.jar:qe/d$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f38049a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:64:0x009d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                qe.h[] r0 = p289qe.EnumC7917h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p289qe.C7913d.a.f38049a = r0
                r0 = r4
                qe.h r1 = p289qe.EnumC7917h.NUMERIC     // Catch: java.lang.NoSuchFieldError -> L7d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7d
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7d
            L14:
                int[] r0 = p289qe.C7913d.a.f38049a     // Catch: java.lang.NoSuchFieldError -> L7d java.lang.NoSuchFieldError -> L81
                qe.h r1 = p289qe.EnumC7917h.ALPHANUMERIC     // Catch: java.lang.NoSuchFieldError -> L81
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L81
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L81
            L1f:
                int[] r0 = p289qe.C7913d.a.f38049a     // Catch: java.lang.NoSuchFieldError -> L81 java.lang.NoSuchFieldError -> L85
                qe.h r1 = p289qe.EnumC7917h.BYTE     // Catch: java.lang.NoSuchFieldError -> L85
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L85
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L85
            L2a:
                int[] r0 = p289qe.C7913d.a.f38049a     // Catch: java.lang.NoSuchFieldError -> L85 java.lang.NoSuchFieldError -> L89
                qe.h r1 = p289qe.EnumC7917h.KANJI     // Catch: java.lang.NoSuchFieldError -> L89
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L89
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L89
            L35:
                int[] r0 = p289qe.C7913d.a.f38049a     // Catch: java.lang.NoSuchFieldError -> L89 java.lang.NoSuchFieldError -> L8d
                qe.h r1 = p289qe.EnumC7917h.TERMINATOR     // Catch: java.lang.NoSuchFieldError -> L8d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8d
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8d
            L40:
                int[] r0 = p289qe.C7913d.a.f38049a     // Catch: java.lang.NoSuchFieldError -> L8d java.lang.NoSuchFieldError -> L91
                qe.h r1 = p289qe.EnumC7917h.FNC1_FIRST_POSITION     // Catch: java.lang.NoSuchFieldError -> L91
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L91
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L91
            L4c:
                int[] r0 = p289qe.C7913d.a.f38049a     // Catch: java.lang.NoSuchFieldError -> L91 java.lang.NoSuchFieldError -> L95
                qe.h r1 = p289qe.EnumC7917h.FNC1_SECOND_POSITION     // Catch: java.lang.NoSuchFieldError -> L95
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L95
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L95
            L58:
                int[] r0 = p289qe.C7913d.a.f38049a     // Catch: java.lang.NoSuchFieldError -> L95 java.lang.NoSuchFieldError -> L99
                qe.h r1 = p289qe.EnumC7917h.STRUCTURED_APPEND     // Catch: java.lang.NoSuchFieldError -> L99
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L99
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L99
            L64:
                int[] r0 = p289qe.C7913d.a.f38049a     // Catch: java.lang.NoSuchFieldError -> L99 java.lang.NoSuchFieldError -> L9d
                qe.h r1 = p289qe.EnumC7917h.ECI     // Catch: java.lang.NoSuchFieldError -> L9d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9d
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9d
            L70:
                int[] r0 = p289qe.C7913d.a.f38049a     // Catch: java.lang.NoSuchFieldError -> L9d java.lang.NoSuchFieldError -> La1
                qe.h r1 = p289qe.EnumC7917h.HANZI     // Catch: java.lang.NoSuchFieldError -> La1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La1
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La1
            L7c:
                return
            L7d:
                r4 = move-exception
                goto L14
            L81:
                r4 = move-exception
                goto L1f
            L85:
                r4 = move-exception
                goto L2a
            L89:
                r4 = move-exception
                goto L35
            L8d:
                r4 = move-exception
                goto L40
            L91:
                r4 = move-exception
                goto L4c
            L95:
                r4 = move-exception
                goto L58
            L99:
                r4 = move-exception
                goto L64
            L9d:
                r4 = move-exception
                goto L70
            La1:
                r4 = move-exception
                goto L7c
            */
            throw new UnsupportedOperationException("Method not decompiled: p289qe.C7913d.a.m45805clinit():void");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static C10197e m34270a(byte[] bArr, C7919j c7919j, EnumC7915f enumC7915f, Map<EnumC8690e, ?> map) {
        EnumC7917h forBits;
        C10195c c10195c = new C10195c(bArr);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        EnumC10196d enumC10196d = null;
        boolean z10 = false;
        int i10 = -1;
        int i11 = -1;
        do {
            try {
                forBits = c10195c.m42684a() < 4 ? EnumC7917h.TERMINATOR : EnumC7917h.forBits(c10195c.m42687d(4));
                int[] iArr = a.f38049a;
                int i12 = i10;
                int i13 = i11;
                EnumC10196d enumC10196d2 = enumC10196d;
                switch (iArr[forBits.ordinal()]) {
                    case 5:
                        i10 = i12;
                        i11 = i13;
                        enumC10196d = enumC10196d2;
                        break;
                    case 6:
                    case 7:
                        z10 = true;
                        break;
                    case 8:
                        if (c10195c.m42684a() < 16) {
                            throw C8691f.m37197a();
                        }
                        i12 = c10195c.m42687d(8);
                        i13 = c10195c.m42687d(8);
                        enumC10196d2 = enumC10196d;
                        i10 = i12;
                        i11 = i13;
                        enumC10196d = enumC10196d2;
                        break;
                    case 9:
                        enumC10196d2 = EnumC10196d.getCharacterSetECIByValue(m34276g(c10195c));
                        if (enumC10196d2 == null) {
                            throw C8691f.m37197a();
                        }
                        i13 = i11;
                        i12 = i10;
                        i10 = i12;
                        i11 = i13;
                        enumC10196d = enumC10196d2;
                        break;
                    case 10:
                        int m42687d = c10195c.m42687d(4);
                        int m42687d2 = c10195c.m42687d(forBits.getCharacterCountBits(c7919j));
                        i12 = i10;
                        i13 = i11;
                        enumC10196d2 = enumC10196d;
                        if (m42687d == 1) {
                            m34273d(c10195c, sb2, m42687d2);
                            i12 = i10;
                            i13 = i11;
                            enumC10196d2 = enumC10196d;
                        }
                        i10 = i12;
                        i11 = i13;
                        enumC10196d = enumC10196d2;
                        break;
                    default:
                        int m42687d3 = c10195c.m42687d(forBits.getCharacterCountBits(c7919j));
                        int i14 = iArr[forBits.ordinal()];
                        if (i14 == 1) {
                            m34275f(c10195c, sb2, m42687d3);
                        } else if (i14 == 2) {
                            m34271b(c10195c, sb2, m42687d3, z10);
                        } else if (i14 == 3) {
                            m34272c(c10195c, sb2, m42687d3, enumC10196d, arrayList, map);
                        } else {
                            if (i14 != 4) {
                                throw C8691f.m37197a();
                            }
                            m34274e(c10195c, sb2, m42687d3);
                            i12 = i10;
                            i13 = i11;
                            enumC10196d2 = enumC10196d;
                            i10 = i12;
                            i11 = i13;
                            enumC10196d = enumC10196d2;
                        }
                        break;
                }
            } catch (IllegalArgumentException e10) {
                throw C8691f.m37197a();
            }
        } while (forBits != EnumC7917h.TERMINATOR);
        return new C10197e(bArr, sb2.toString(), arrayList.isEmpty() ? null : arrayList, enumC7915f == null ? null : enumC7915f.toString(), i10, i11);
    }

    /* renamed from: b */
    public static void m34271b(C10195c c10195c, StringBuilder sb2, int i10, boolean z10) {
        int length = sb2.length();
        while (i10 > 1) {
            if (c10195c.m42684a() < 11) {
                throw C8691f.m37197a();
            }
            int m42687d = c10195c.m42687d(11);
            sb2.append(m34277h(m42687d / 45));
            sb2.append(m34277h(m42687d % 45));
            i10 -= 2;
        }
        if (i10 == 1) {
            if (c10195c.m42684a() < 6) {
                throw C8691f.m37197a();
            }
            sb2.append(m34277h(c10195c.m42687d(6)));
        }
        if (z10) {
            for (int i11 = length; i11 < sb2.length(); i11++) {
                if (sb2.charAt(i11) == '%') {
                    if (i11 < sb2.length() - 1) {
                        int i12 = i11 + 1;
                        if (sb2.charAt(i12) == '%') {
                            sb2.deleteCharAt(i12);
                        }
                    }
                    sb2.setCharAt(i11, (char) 29);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m34272c(C10195c c10195c, StringBuilder sb2, int i10, EnumC10196d enumC10196d, Collection<byte[]> collection, Map<EnumC8690e, ?> map) {
        if ((i10 << 3) > c10195c.m42684a()) {
            throw C8691f.m37197a();
        }
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) c10195c.m42687d(8);
        }
        try {
            sb2.append(new String(bArr, enumC10196d == null ? C10204l.m42719a(bArr, map) : enumC10196d.name()));
            collection.add(bArr);
        } catch (UnsupportedEncodingException e10) {
            throw C8691f.m37197a();
        }
    }

    /* renamed from: d */
    public static void m34273d(C10195c c10195c, StringBuilder sb2, int i10) {
        if (i10 * 13 > c10195c.m42684a()) {
            throw C8691f.m37197a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int m42687d = c10195c.m42687d(13);
            int i12 = (m42687d % 96) | ((m42687d / 96) << 8);
            int i13 = i12 + (i12 < 2560 ? 41377 : 42657);
            bArr[i11] = (byte) (i13 >> 8);
            bArr[i11 + 1] = (byte) i13;
            i11 += 2;
            i10--;
        }
        try {
            sb2.append(new String(bArr, "GB2312"));
        } catch (UnsupportedEncodingException e10) {
            throw C8691f.m37197a();
        }
    }

    /* renamed from: e */
    public static void m34274e(C10195c c10195c, StringBuilder sb2, int i10) {
        if (i10 * 13 > c10195c.m42684a()) {
            throw C8691f.m37197a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int m42687d = c10195c.m42687d(13);
            int i12 = (m42687d % 192) | ((m42687d / 192) << 8);
            int i13 = i12 + (i12 < 7936 ? 33088 : 49472);
            bArr[i11] = (byte) (i13 >> 8);
            bArr[i11 + 1] = (byte) i13;
            i11 += 2;
            i10--;
        }
        try {
            sb2.append(new String(bArr, "SJIS"));
        } catch (UnsupportedEncodingException e10) {
            throw C8691f.m37197a();
        }
    }

    /* renamed from: f */
    public static void m34275f(C10195c c10195c, StringBuilder sb2, int i10) {
        while (i10 >= 3) {
            if (c10195c.m42684a() < 10) {
                throw C8691f.m37197a();
            }
            int m42687d = c10195c.m42687d(10);
            if (m42687d >= 1000) {
                throw C8691f.m37197a();
            }
            sb2.append(m34277h(m42687d / 100));
            sb2.append(m34277h((m42687d / 10) % 10));
            sb2.append(m34277h(m42687d % 10));
            i10 -= 3;
        }
        if (i10 == 2) {
            if (c10195c.m42684a() < 7) {
                throw C8691f.m37197a();
            }
            int m42687d2 = c10195c.m42687d(7);
            if (m42687d2 >= 100) {
                throw C8691f.m37197a();
            }
            sb2.append(m34277h(m42687d2 / 10));
            sb2.append(m34277h(m42687d2 % 10));
            return;
        }
        if (i10 == 1) {
            if (c10195c.m42684a() < 4) {
                throw C8691f.m37197a();
            }
            int m42687d3 = c10195c.m42687d(4);
            if (m42687d3 >= 10) {
                throw C8691f.m37197a();
            }
            sb2.append(m34277h(m42687d3));
        }
    }

    /* renamed from: g */
    public static int m34276g(C10195c c10195c) {
        int m42687d = c10195c.m42687d(8);
        if ((m42687d & 128) == 0) {
            return m42687d & 127;
        }
        if ((m42687d & 192) == 128) {
            return c10195c.m42687d(8) | ((m42687d & 63) << 8);
        }
        if ((m42687d & 224) == 192) {
            return c10195c.m42687d(16) | ((m42687d & 31) << 16);
        }
        throw C8691f.m37197a();
    }

    /* renamed from: h */
    public static char m34277h(int i10) {
        char[] cArr = f38048a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw C8691f.m37197a();
    }
}
