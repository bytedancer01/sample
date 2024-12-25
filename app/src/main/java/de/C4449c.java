package de;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import p444zd.C10195c;
import p444zd.C10197e;
import td.C8691f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:de/c.class
 */
/* renamed from: de.c */
/* loaded from: combined.jar:classes2.jar:de/c.class */
public final class C4449c {

    /* renamed from: b */
    public static final char[] f26822b;

    /* renamed from: d */
    public static final char[] f26824d;

    /* renamed from: a */
    public static final char[] f26821a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: c */
    public static final char[] f26823c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: e */
    public static final char[] f26825e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/c$a.class
     */
    /* renamed from: de.c$a */
    /* loaded from: combined.jar:classes2.jar:de/c$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f26826a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x004d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                de.c$b[] r0 = de.C4449c.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                de.C4449c.a.f26826a = r0
                r0 = r4
                de.c$b r1 = de.C4449c.b.C40_ENCODE     // Catch: java.lang.NoSuchFieldError -> L41
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L41
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L41
            L14:
                int[] r0 = de.C4449c.a.f26826a     // Catch: java.lang.NoSuchFieldError -> L41 java.lang.NoSuchFieldError -> L45
                de.c$b r1 = de.C4449c.b.TEXT_ENCODE     // Catch: java.lang.NoSuchFieldError -> L45
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45
            L1f:
                int[] r0 = de.C4449c.a.f26826a     // Catch: java.lang.NoSuchFieldError -> L45 java.lang.NoSuchFieldError -> L49
                de.c$b r1 = de.C4449c.b.ANSIX12_ENCODE     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L2a:
                int[] r0 = de.C4449c.a.f26826a     // Catch: java.lang.NoSuchFieldError -> L49 java.lang.NoSuchFieldError -> L4d
                de.c$b r1 = de.C4449c.b.EDIFACT_ENCODE     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L35:
                int[] r0 = de.C4449c.a.f26826a     // Catch: java.lang.NoSuchFieldError -> L4d java.lang.NoSuchFieldError -> L51
                de.c$b r1 = de.C4449c.b.BASE256_ENCODE     // Catch: java.lang.NoSuchFieldError -> L51
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
            throw new UnsupportedOperationException("Method not decompiled: de.C4449c.a.m44361clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/c$b.class
     */
    /* renamed from: de.c$b */
    /* loaded from: combined.jar:classes2.jar:de/c$b.class */
    public enum b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        f26822b = cArr;
        f26824d = cArr;
    }

    /* renamed from: a */
    public static C10197e m22577a(byte[] bArr) {
        C10195c c10195c = new C10195c(bArr);
        StringBuilder sb2 = new StringBuilder(100);
        StringBuilder sb3 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        b bVar = b.ASCII_ENCODE;
        do {
            b bVar2 = b.ASCII_ENCODE;
            if (bVar == bVar2) {
                bVar = m22579c(c10195c, sb2, sb3);
            } else {
                int i10 = a.f26826a[bVar.ordinal()];
                if (i10 == 1) {
                    m22581e(c10195c, sb2);
                } else if (i10 == 2) {
                    m22583g(c10195c, sb2);
                } else if (i10 == 3) {
                    m22578b(c10195c, sb2);
                } else if (i10 == 4) {
                    m22582f(c10195c, sb2);
                } else {
                    if (i10 != 5) {
                        throw C8691f.m37197a();
                    }
                    m22580d(c10195c, sb2, arrayList);
                }
                bVar = bVar2;
            }
            if (bVar == b.PAD_ENCODE) {
                break;
            }
        } while (c10195c.m42684a() > 0);
        if (sb3.length() > 0) {
            sb2.append((CharSequence) sb3);
        }
        String sb4 = sb2.toString();
        ArrayList arrayList2 = arrayList;
        if (arrayList.isEmpty()) {
            arrayList2 = null;
        }
        return new C10197e(bArr, sb4, arrayList2, null);
    }

    /* renamed from: b */
    public static void m22578b(C10195c c10195c, StringBuilder sb2) {
        int m42687d;
        char c10;
        int i10;
        int[] iArr = new int[3];
        while (c10195c.m42684a() != 8 && (m42687d = c10195c.m42687d(8)) != 254) {
            m22584h(m42687d, c10195c.m42687d(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (i12 == 0) {
                    c10 = '\r';
                } else if (i12 == 1) {
                    c10 = '*';
                } else if (i12 == 2) {
                    c10 = '>';
                } else if (i12 != 3) {
                    if (i12 < 14) {
                        i10 = i12 + 44;
                    } else {
                        if (i12 >= 40) {
                            throw C8691f.m37197a();
                        }
                        i10 = i12 + 51;
                    }
                    c10 = (char) i10;
                } else {
                    c10 = ' ';
                }
                sb2.append(c10);
            }
            if (c10195c.m42684a() <= 0) {
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: c */
    public static b m22579c(C10195c c10195c, StringBuilder sb2, StringBuilder sb3) {
        boolean z10;
        String str;
        boolean z11 = false;
        do {
            int m42687d = c10195c.m42687d(8);
            if (m42687d == 0) {
                throw C8691f.m37197a();
            }
            if (m42687d <= 128) {
                int i10 = m42687d;
                if (z11) {
                    i10 = m42687d + 128;
                }
                sb2.append((char) (i10 - 1));
                return b.ASCII_ENCODE;
            }
            if (m42687d == 129) {
                return b.PAD_ENCODE;
            }
            if (m42687d > 229) {
                z10 = z11;
                switch (m42687d) {
                    case 230:
                        return b.C40_ENCODE;
                    case NNTPReply.NEW_NEWSGROUP_LIST_FOLLOWS /* 231 */:
                        return b.BASE256_ENCODE;
                    case 232:
                        sb2.append((char) 29);
                        z10 = z11;
                        break;
                    case 233:
                    case FTPReply.SECURITY_DATA_EXCHANGE_COMPLETE /* 234 */:
                    case TelnetCommand.NOP /* 241 */:
                        break;
                    case 235:
                        z10 = true;
                        break;
                    case TelnetCommand.EOF /* 236 */:
                        str = "[)>\u001e05\u001d";
                        sb2.append(str);
                        sb3.insert(0, "\u001e\u0004");
                        z10 = z11;
                        break;
                    case TelnetCommand.SUSP /* 237 */:
                        str = "[)>\u001e06\u001d";
                        sb2.append(str);
                        sb3.insert(0, "\u001e\u0004");
                        z10 = z11;
                        break;
                    case TelnetCommand.ABORT /* 238 */:
                        return b.ANSIX12_ENCODE;
                    case TelnetCommand.EOR /* 239 */:
                        return b.TEXT_ENCODE;
                    case 240:
                        return b.EDIFACT_ENCODE;
                    default:
                        if (m42687d != 254 || c10195c.m42684a() != 0) {
                            throw C8691f.m37197a();
                        }
                        z10 = z11;
                        break;
                        break;
                }
            } else {
                int i11 = m42687d - 130;
                if (i11 < 10) {
                    sb2.append('0');
                }
                sb2.append(i11);
                z10 = z11;
            }
            z11 = z10;
        } while (c10195c.m42684a() > 0);
        return b.ASCII_ENCODE;
    }

    /* renamed from: d */
    public static void m22580d(C10195c c10195c, StringBuilder sb2, Collection<byte[]> collection) {
        int m42686c = c10195c.m42686c() + 1;
        int i10 = m42686c + 1;
        int m22585i = m22585i(c10195c.m42687d(8), m42686c);
        if (m22585i == 0) {
            m22585i = c10195c.m42684a() / 8;
        } else if (m22585i >= 250) {
            m22585i = ((m22585i - TelnetCommand.f36140GA) * 250) + m22585i(c10195c.m42687d(8), i10);
            i10++;
        }
        if (m22585i < 0) {
            throw C8691f.m37197a();
        }
        byte[] bArr = new byte[m22585i];
        int i11 = 0;
        while (i11 < m22585i) {
            if (c10195c.m42684a() < 8) {
                throw C8691f.m37197a();
            }
            bArr[i11] = (byte) m22585i(c10195c.m42687d(8), i10);
            i11++;
            i10++;
        }
        collection.add(bArr);
        try {
            sb2.append(new String(bArr, "ISO8859_1"));
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e10)));
        }
    }

    /* renamed from: e */
    public static void m22581e(C10195c c10195c, StringBuilder sb2) {
        int m42687d;
        int i10;
        int i11;
        char c10;
        char c11;
        int[] iArr = new int[3];
        boolean z10 = false;
        int i12 = 0;
        while (c10195c.m42684a() != 8 && (m42687d = c10195c.m42687d(8)) != 254) {
            m22584h(m42687d, c10195c.m42687d(8), iArr);
            for (int i13 = 0; i13 < 3; i13++) {
                int i14 = iArr[i13];
                if (i12 != 0) {
                    if (i12 == 1) {
                        i10 = i14;
                        if (z10) {
                            i11 = i14 + 128;
                            c11 = (char) i11;
                            sb2.append(c11);
                            z10 = false;
                        }
                        c10 = (char) i10;
                        sb2.append(c10);
                    } else if (i12 == 2) {
                        char[] cArr = f26822b;
                        if (i14 < cArr.length) {
                            char c12 = cArr[i14];
                            c10 = c12;
                            if (z10) {
                                c11 = (char) (c12 + 128);
                                sb2.append(c11);
                                z10 = false;
                            }
                        } else if (i14 == 27) {
                            c10 = 29;
                        } else {
                            if (i14 != 30) {
                                throw C8691f.m37197a();
                            }
                            z10 = true;
                        }
                        sb2.append(c10);
                    } else {
                        if (i12 != 3) {
                            throw C8691f.m37197a();
                        }
                        if (z10) {
                            i11 = i14 + 224;
                            c11 = (char) i11;
                            sb2.append(c11);
                            z10 = false;
                        } else {
                            i10 = i14 + 96;
                            c10 = (char) i10;
                            sb2.append(c10);
                        }
                    }
                    i12 = 0;
                } else if (i14 < 3) {
                    i12 = i14 + 1;
                } else {
                    char[] cArr2 = f26821a;
                    if (i14 >= cArr2.length) {
                        throw C8691f.m37197a();
                    }
                    char c13 = cArr2[i14];
                    if (z10) {
                        sb2.append((char) (c13 + 128));
                        z10 = false;
                    } else {
                        sb2.append(c13);
                    }
                }
            }
            if (c10195c.m42684a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: f */
    public static void m22582f(C10195c c10195c, StringBuilder sb2) {
        while (c10195c.m42684a() > 16) {
            for (int i10 = 0; i10 < 4; i10++) {
                int m42687d = c10195c.m42687d(6);
                if (m42687d == 31) {
                    int m42685b = 8 - c10195c.m42685b();
                    if (m42685b != 8) {
                        c10195c.m42687d(m42685b);
                        return;
                    }
                    return;
                }
                int i11 = m42687d;
                if ((m42687d & 32) == 0) {
                    i11 = m42687d | 64;
                }
                sb2.append((char) i11);
            }
            if (c10195c.m42684a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: g */
    public static void m22583g(C10195c c10195c, StringBuilder sb2) {
        int m42687d;
        char c10;
        char c11;
        char c12;
        int[] iArr = new int[3];
        boolean z10 = false;
        int i10 = 0;
        while (c10195c.m42684a() != 8 && (m42687d = c10195c.m42687d(8)) != 254) {
            m22584h(m42687d, c10195c.m42687d(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            char[] cArr = f26824d;
                            if (i12 < cArr.length) {
                                char c13 = cArr[i12];
                                c10 = c13;
                                if (z10) {
                                    c12 = c13;
                                    c11 = (char) (c12 + 128);
                                    sb2.append(c11);
                                    z10 = false;
                                }
                            } else if (i12 == 27) {
                                c10 = 29;
                            } else {
                                if (i12 != 30) {
                                    throw C8691f.m37197a();
                                }
                                z10 = true;
                            }
                            sb2.append(c10);
                        } else {
                            if (i10 != 3) {
                                throw C8691f.m37197a();
                            }
                            char[] cArr2 = f26825e;
                            if (i12 >= cArr2.length) {
                                throw C8691f.m37197a();
                            }
                            char c14 = cArr2[i12];
                            c10 = c14;
                            if (z10) {
                                c12 = c14;
                                c11 = (char) (c12 + 128);
                                sb2.append(c11);
                                z10 = false;
                            }
                            sb2.append(c10);
                        }
                    } else if (z10) {
                        c11 = (char) (i12 + 128);
                        sb2.append(c11);
                        z10 = false;
                    } else {
                        c10 = (char) i12;
                        sb2.append(c10);
                    }
                    i10 = 0;
                } else if (i12 < 3) {
                    i10 = i12 + 1;
                } else {
                    char[] cArr3 = f26823c;
                    if (i12 >= cArr3.length) {
                        throw C8691f.m37197a();
                    }
                    char c15 = cArr3[i12];
                    if (z10) {
                        sb2.append((char) (c15 + 128));
                        z10 = false;
                    } else {
                        sb2.append(c15);
                    }
                }
            }
            if (c10195c.m42684a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: h */
    public static void m22584h(int i10, int i11, int[] iArr) {
        int i12 = ((i10 << 8) + i11) - 1;
        int i13 = i12 / 1600;
        iArr[0] = i13;
        int i14 = i12 - (i13 * 1600);
        int i15 = i14 / 40;
        iArr[1] = i15;
        iArr[2] = i14 - (i15 * 40);
    }

    /* renamed from: i */
    public static int m22585i(int i10, int i11) {
        int i12 = i10 - (((i11 * 149) % 255) + 1);
        return i12 >= 0 ? i12 : i12 + 256;
    }
}
