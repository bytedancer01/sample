package p370vd;

import be.C0892a;
import be.C0894c;
import be.C0895d;
import com.amazonaws.mobileconnectors.appsync.AWSAppSyncClient;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import com.amplifyframework.core.model.ModelIdentifier;
import com.journeyapps.barcodescanner.C2582b;
import java.util.Arrays;
import org.apache.commons.net.SocketClient;
import org.slf4j.Marker;
import p353ud.C9154a;
import p354ue.AbstractC9172q;
import p354ue.C9163h;
import p354ue.C9169n;
import p406xd.C9728e;
import p444zd.C10194b;
import p444zd.C10197e;
import td.C8691f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vd/a.class
 */
/* renamed from: vd.a */
/* loaded from: combined.jar:classes2.jar:vd/a.class */
public final class C9339a {

    /* renamed from: b */
    public static final String[] f42554b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    public static final String[] f42555c = {"CTRL_PS", " ", "a", C2582b.f15902o, "c", "d", C9728e.f44384d, "f", "g", C9163h.f41901n, "i", "j", "k", "l", "m", C9169n.f41939b, "o", "p", AbstractC9172q.f41940a, "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d */
    public static final String[] f42556d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", AWSAppSyncClient.DATABASE_NAME_DELIMITER, "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e */
    public static final String[] f42557e = {"", "\r", SocketClient.NETASCII_EOL, ". ", ", ", ": ", "!", ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, "$", "%", "&", "'", "(", ")", Marker.ANY_MARKER, Marker.ANY_NON_NULL_MARKER, ",", "-", InstructionFileId.DOT, "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f */
    public static final String[] f42558f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", InstructionFileId.DOT, "CTRL_UL", "CTRL_US"};

    /* renamed from: a */
    public C9154a f42559a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:vd/a$a.class
     */
    /* renamed from: vd.a$a */
    /* loaded from: combined.jar:classes2.jar:vd/a$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f42560a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x004d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                vd.a$b[] r0 = p370vd.C9339a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p370vd.C9339a.a.f42560a = r0
                r0 = r4
                vd.a$b r1 = p370vd.C9339a.b.UPPER     // Catch: java.lang.NoSuchFieldError -> L41
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L41
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L41
            L14:
                int[] r0 = p370vd.C9339a.a.f42560a     // Catch: java.lang.NoSuchFieldError -> L41 java.lang.NoSuchFieldError -> L45
                vd.a$b r1 = p370vd.C9339a.b.LOWER     // Catch: java.lang.NoSuchFieldError -> L45
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45
            L1f:
                int[] r0 = p370vd.C9339a.a.f42560a     // Catch: java.lang.NoSuchFieldError -> L45 java.lang.NoSuchFieldError -> L49
                vd.a$b r1 = p370vd.C9339a.b.MIXED     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L2a:
                int[] r0 = p370vd.C9339a.a.f42560a     // Catch: java.lang.NoSuchFieldError -> L49 java.lang.NoSuchFieldError -> L4d
                vd.a$b r1 = p370vd.C9339a.b.PUNCT     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L35:
                int[] r0 = p370vd.C9339a.a.f42560a     // Catch: java.lang.NoSuchFieldError -> L4d java.lang.NoSuchFieldError -> L51
                vd.a$b r1 = p370vd.C9339a.b.DIGIT     // Catch: java.lang.NoSuchFieldError -> L51
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L51
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L51
            L40:
                return
            L41:
                r4 = move-exception
                goto L14
            L45:
                r4 = move-exception
                goto L1f
            L49:
                r4 = move-exception
                goto L2a
            L4d:
                r4 = move-exception
                goto L35
            L51:
                r4 = move-exception
                goto L40
            */
            throw new UnsupportedOperationException("Method not decompiled: p370vd.C9339a.a.m46290clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:vd/a$b.class
     */
    /* renamed from: vd.a$b */
    /* loaded from: combined.jar:classes2.jar:vd/a$b.class */
    public enum b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* renamed from: a */
    public static byte[] m39363a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = m39367h(zArr, i10 << 3);
        }
        return bArr;
    }

    /* renamed from: e */
    public static String m39364e(b bVar, int i10) {
        int i11 = a.f42560a[bVar.ordinal()];
        if (i11 == 1) {
            return f42554b[i10];
        }
        if (i11 == 2) {
            return f42555c[i10];
        }
        if (i11 == 3) {
            return f42556d[i10];
        }
        if (i11 == 4) {
            return f42557e[i10];
        }
        if (i11 == 5) {
            return f42558f[i10];
        }
        throw new IllegalStateException("Bad table");
    }

    /* renamed from: f */
    public static String m39365f(boolean[] zArr) {
        b bVar;
        int length = zArr.length;
        b bVar2 = b.UPPER;
        StringBuilder sb2 = new StringBuilder(20);
        b bVar3 = bVar2;
        int i10 = 0;
        while (i10 < length) {
            if (bVar2 != b.BINARY) {
                int i11 = bVar2 == b.DIGIT ? 4 : 5;
                if (length - i10 < i11) {
                    break;
                }
                int m39368i = m39368i(zArr, i10, i11);
                i10 += i11;
                String m39364e = m39364e(bVar2, m39368i);
                if (m39364e.startsWith("CTRL_")) {
                    bVar = m39366g(m39364e.charAt(5));
                    if (m39364e.charAt(6) != 'L') {
                        bVar3 = bVar2;
                        bVar2 = bVar;
                    }
                } else {
                    sb2.append(m39364e);
                    bVar = bVar3;
                }
                bVar2 = bVar;
                bVar3 = bVar;
            } else {
                if (length - i10 < 5) {
                    break;
                }
                int m39368i2 = m39368i(zArr, i10, 5);
                int i12 = i10 + 5;
                int i13 = m39368i2;
                int i14 = i12;
                if (m39368i2 == 0) {
                    if (length - i12 < 11) {
                        break;
                    }
                    i13 = m39368i(zArr, i12, 11) + 31;
                    i14 = i12 + 11;
                }
                int i15 = 0;
                int i16 = i14;
                while (true) {
                    bVar = bVar3;
                    i10 = i16;
                    if (i15 >= i13) {
                        break;
                    }
                    if (length - i16 < 8) {
                        i10 = length;
                        bVar = bVar3;
                        break;
                    }
                    sb2.append((char) m39368i(zArr, i16, 8));
                    i16 += 8;
                    i15++;
                }
                bVar2 = bVar;
                bVar3 = bVar;
            }
        }
        return sb2.toString();
    }

    /* renamed from: g */
    public static b m39366g(char c10) {
        return c10 != 'B' ? c10 != 'D' ? c10 != 'P' ? c10 != 'L' ? c10 != 'M' ? b.UPPER : b.MIXED : b.LOWER : b.PUNCT : b.DIGIT : b.BINARY;
    }

    /* renamed from: h */
    public static byte m39367h(boolean[] zArr, int i10) {
        int length = zArr.length - i10;
        return (byte) (length >= 8 ? m39368i(zArr, i10, 8) : m39368i(zArr, i10, length) << (8 - length));
    }

    /* renamed from: i */
    public static int m39368i(boolean[] zArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i10; i13 < i10 + i11; i13++) {
            int i14 = i12 << 1;
            i12 = i14;
            if (zArr[i13]) {
                i12 = i14 | 1;
            }
        }
        return i12;
    }

    /* renamed from: j */
    public static int m39369j(int i10, boolean z10) {
        return ((z10 ? 88 : 112) + (i10 << 4)) * i10;
    }

    /* renamed from: b */
    public final boolean[] m39370b(boolean[] zArr) {
        C0892a c0892a;
        int i10;
        int i11;
        int i12 = 8;
        if (this.f42559a.m38499d() <= 2) {
            i12 = 6;
            c0892a = C0892a.f6012j;
        } else if (this.f42559a.m38499d() <= 8) {
            c0892a = C0892a.f6016n;
        } else if (this.f42559a.m38499d() <= 22) {
            i12 = 10;
            c0892a = C0892a.f6011i;
        } else {
            i12 = 12;
            c0892a = C0892a.f6010h;
        }
        int m38498c = this.f42559a.m38498c();
        int length = zArr.length / i12;
        if (length < m38498c) {
            throw C8691f.m37197a();
        }
        int length2 = zArr.length % i12;
        int[] iArr = new int[length];
        int i13 = 0;
        while (i13 < length) {
            iArr[i13] = m39368i(zArr, length2, i12);
            i13++;
            length2 += i12;
        }
        try {
            new C0894c(c0892a).m5548a(iArr, length - m38498c);
            int i14 = (1 << i12) - 1;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int i17 = i16;
                if (i15 < m38498c) {
                    int i18 = iArr[i15];
                    if (i18 == 0 || i18 == i14) {
                        break;
                    }
                    if (i18 != 1) {
                        i11 = i17;
                        if (i18 != i14 - 1) {
                            i15++;
                            i16 = i11;
                        }
                    }
                    i11 = i17 + 1;
                    i15++;
                    i16 = i11;
                } else {
                    boolean[] zArr2 = new boolean[(m38498c * i12) - i17];
                    int i19 = 0;
                    int i20 = 0;
                    while (true) {
                        int i21 = i20;
                        if (i19 >= m38498c) {
                            return zArr2;
                        }
                        int i22 = iArr[i19];
                        if (i22 == 1 || i22 == i14 - 1) {
                            Arrays.fill(zArr2, i21, (i21 + i12) - 1, i22 > 1);
                            i10 = i21 + (i12 - 1);
                        } else {
                            int i23 = i12 - 1;
                            while (true) {
                                i10 = i21;
                                if (i23 >= 0) {
                                    zArr2[i21] = ((1 << i23) & i22) != 0;
                                    i23--;
                                    i21++;
                                }
                            }
                        }
                        i19++;
                        i20 = i10;
                    }
                }
            }
            throw C8691f.m37197a();
        } catch (C0895d e10) {
            throw C8691f.m37198b(e10);
        }
    }

    /* renamed from: c */
    public C10197e m39371c(C9154a c9154a) {
        this.f42559a = c9154a;
        boolean[] m39370b = m39370b(m39372d(c9154a.m42703a()));
        C10197e c10197e = new C10197e(m39363a(m39370b), m39365f(m39370b), null, null);
        c10197e.m42699l(m39370b.length);
        return c10197e;
    }

    /* renamed from: d */
    public final boolean[] m39372d(C10194b c10194b) {
        boolean m38500e = this.f42559a.m38500e();
        int m38499d = this.f42559a.m38499d();
        int i10 = (m38500e ? 11 : 14) + (m38499d << 2);
        int[] iArr = new int[i10];
        boolean[] zArr = new boolean[m39369j(m38499d, m38500e)];
        if (m38500e) {
            for (int i11 = 0; i11 < i10; i11++) {
                iArr[i11] = i11;
            }
        } else {
            int i12 = i10 / 2;
            int i13 = ((i10 + 1) + (((i12 - 1) / 15) * 2)) / 2;
            for (int i14 = 0; i14 < i12; i14++) {
                int i15 = (i14 / 15) + i14;
                iArr[(i12 - i14) - 1] = (i13 - i15) - 1;
                iArr[i12 + i14] = i15 + i13 + 1;
            }
        }
        int i16 = 0;
        for (int i17 = 0; i17 < m38499d; i17++) {
            int i18 = ((m38499d - i17) << 2) + (m38500e ? 9 : 12);
            int i19 = i17 << 1;
            int i20 = (i10 - 1) - i19;
            for (int i21 = 0; i21 < i18; i21++) {
                int i22 = i21 << 1;
                for (int i23 = 0; i23 < 2; i23++) {
                    int i24 = i19 + i23;
                    int i25 = iArr[i24];
                    int i26 = i19 + i21;
                    zArr[i16 + i22 + i23] = c10194b.m42672d(i25, iArr[i26]);
                    int i27 = iArr[i26];
                    int i28 = i20 - i23;
                    zArr[(i18 * 2) + i16 + i22 + i23] = c10194b.m42672d(i27, iArr[i28]);
                    int i29 = iArr[i28];
                    int i30 = i20 - i21;
                    zArr[(i18 * 4) + i16 + i22 + i23] = c10194b.m42672d(i29, iArr[i30]);
                    zArr[(i18 * 6) + i16 + i22 + i23] = c10194b.m42672d(iArr[i30], iArr[i24]);
                }
            }
            i16 += i18 << 3;
        }
        return zArr;
    }
}
