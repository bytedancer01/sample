package p411xi;

import ci.C1128n;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kh.C5612f;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9365d;
import p372vh.C9367f;
import p430yi.C10023b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/h.class
 */
/* renamed from: xi.h */
/* loaded from: combined.jar:classes2.jar:xi/h.class */
public class C9764h implements Serializable, Comparable<C9764h> {

    /* renamed from: b */
    public transient int f44532b;

    /* renamed from: c */
    @Nullable
    public transient String f44533c;

    /* renamed from: d */
    @NotNull
    public final byte[] f44534d;

    /* renamed from: f */
    public static final a f44531f = new a(null);

    /* renamed from: e */
    @NotNull
    public static final C9764h f44530e = new C9764h(new byte[0]);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xi/h$a.class
     */
    /* renamed from: xi.h$a */
    /* loaded from: combined.jar:classes2.jar:xi/h$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        /* renamed from: g */
        public static /* synthetic */ C9764h m41208g(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = bArr.length;
            }
            return aVar.m41214f(bArr, i10, i11);
        }

        @Nullable
        /* renamed from: a */
        public final C9764h m41209a(@NotNull String str) {
            C9367f.m39526e(str, "$this$decodeBase64");
            byte[] m41075a = C9753a.m41075a(str);
            return m41075a != null ? new C9764h(m41075a) : null;
        }

        @NotNull
        /* renamed from: b */
        public final C9764h m41210b(@NotNull String str) {
            int m42174e;
            int m42174e2;
            C9367f.m39526e(str, "$this$decodeHex");
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                m42174e = C10023b.m42174e(str.charAt(i11));
                m42174e2 = C10023b.m42174e(str.charAt(i11 + 1));
                bArr[i10] = (byte) ((m42174e << 4) + m42174e2);
            }
            return new C9764h(bArr);
        }

        @NotNull
        /* renamed from: c */
        public final C9764h m41211c(@NotNull String str, @NotNull Charset charset) {
            C9367f.m39526e(str, "$this$encode");
            C9367f.m39526e(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            C9367f.m39525d(bytes, "(this as java.lang.String).getBytes(charset)");
            return new C9764h(bytes);
        }

        @NotNull
        /* renamed from: d */
        public final C9764h m41212d(@NotNull String str) {
            C9367f.m39526e(str, "$this$encodeUtf8");
            C9764h c9764h = new C9764h(C9755b.m41078a(str));
            c9764h.m41205x(str);
            return c9764h;
        }

        @NotNull
        /* renamed from: e */
        public final C9764h m41213e(@NotNull byte... bArr) {
            C9367f.m39526e(bArr, "data");
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            C9367f.m39525d(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new C9764h(copyOf);
        }

        @NotNull
        /* renamed from: f */
        public final C9764h m41214f(@NotNull byte[] bArr, int i10, int i11) {
            C9367f.m39526e(bArr, "$this$toByteString");
            C9757c.m41081b(bArr.length, i10, i11);
            return new C9764h(C5612f.m27681g(bArr, i10, i11 + i10));
        }
    }

    public C9764h(@NotNull byte[] bArr) {
        C9367f.m39526e(bArr, "data");
        this.f44534d = bArr;
    }

    @Nullable
    /* renamed from: f */
    public static final C9764h m41182f(@NotNull String str) {
        return f44531f.m41209a(str);
    }

    @NotNull
    /* renamed from: h */
    public static final C9764h m41183h(@NotNull String str) {
        return f44531f.m41212d(str);
    }

    @NotNull
    /* renamed from: t */
    public static final C9764h m41184t(@NotNull byte... bArr) {
        return f44531f.m41213e(bArr);
    }

    /* renamed from: A */
    public final boolean m41185A(@NotNull C9764h c9764h) {
        C9367f.m39526e(c9764h, "prefix");
        return mo41202u(0, c9764h, 0, c9764h.size());
    }

    @NotNull
    /* renamed from: B */
    public C9764h mo41186B() {
        C9764h c9764h;
        byte b10;
        int i10 = 0;
        while (true) {
            if (i10 >= m41194j().length) {
                c9764h = this;
                break;
            }
            byte b11 = m41194j()[i10];
            byte b12 = (byte) 65;
            if (b11 < b12 || b11 > (b10 = (byte) 90)) {
                i10++;
            } else {
                byte[] m41194j = m41194j();
                byte[] copyOf = Arrays.copyOf(m41194j, m41194j.length);
                C9367f.m39525d(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i10] = (byte) (b11 + 32);
                for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                    byte b13 = copyOf[i11];
                    if (b13 >= b12 && b13 <= b10) {
                        copyOf[i11] = (byte) (b13 + 32);
                    }
                }
                c9764h = new C9764h(copyOf);
            }
        }
        return c9764h;
    }

    @NotNull
    /* renamed from: C */
    public byte[] mo41187C() {
        byte[] m41194j = m41194j();
        byte[] copyOf = Arrays.copyOf(m41194j, m41194j.length);
        C9367f.m39525d(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    /* renamed from: D */
    public String m41188D() {
        String m41197o = m41197o();
        String str = m41197o;
        if (m41197o == null) {
            str = C9755b.m41079b(mo41199q());
            m41205x(str);
        }
        return str;
    }

    /* renamed from: E */
    public void mo41189E(@NotNull C9761e c9761e, int i10, int i11) {
        C9367f.m39526e(c9761e, "buffer");
        C10023b.m42173d(this, c9761e, i10, i11);
    }

    @NotNull
    /* renamed from: d */
    public String mo41190d() {
        return C9753a.m41077c(m41194j(), null, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006a, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r0 < r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
    
        if (r0 < r0) goto L16;
     */
    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(@org.jetbrains.annotations.NotNull p411xi.C9764h r4) {
        /*
            r3 = this;
            r0 = r4
            java.lang.String r1 = "other"
            p372vh.C9367f.m39526e(r0, r1)
            r0 = r3
            int r0 = r0.size()
            r7 = r0
            r0 = r4
            int r0 = r0.size()
            r9 = r0
            r0 = r7
            r1 = r9
            int r0 = java.lang.Math.min(r0, r1)
            r8 = r0
            r0 = 0
            r6 = r0
            r0 = 0
            r5 = r0
        L1f:
            r0 = r5
            r1 = r8
            if (r0 >= r1) goto L52
            r0 = r3
            r1 = r5
            byte r0 = r0.m41193i(r1)
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r11 = r0
            r0 = r4
            r1 = r5
            byte r0 = r0.m41193i(r1)
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r10 = r0
            r0 = r11
            r1 = r10
            if (r0 != r1) goto L48
            int r5 = r5 + 1
            goto L1f
        L48:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L6a
            goto L65
        L52:
            r0 = r7
            r1 = r9
            if (r0 != r1) goto L5e
            r0 = r6
            r5 = r0
            goto L6c
        L5e:
            r0 = r7
            r1 = r9
            if (r0 >= r1) goto L6a
        L65:
            r0 = -1
            r5 = r0
            goto L6c
        L6a:
            r0 = 1
            r5 = r0
        L6c:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p411xi.C9764h.compareTo(xi.h):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r0.mo41203v(0, m41194j(), 0, m41194j().length) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            r8 = r0
            r0 = r7
            r1 = r6
            if (r0 != r1) goto La
            goto L39
        La:
            r0 = r7
            boolean r0 = r0 instanceof p411xi.C9764h
            if (r0 == 0) goto L37
            r0 = r7
            xi.h r0 = (p411xi.C9764h) r0
            r7 = r0
            r0 = r7
            int r0 = r0.size()
            r1 = r6
            byte[] r1 = r1.m41194j()
            int r1 = r1.length
            if (r0 != r1) goto L37
            r0 = r7
            r1 = 0
            r2 = r6
            byte[] r2 = r2.m41194j()
            r3 = 0
            r4 = r6
            byte[] r4 = r4.m41194j()
            int r4 = r4.length
            boolean r0 = r0.mo41203v(r1, r2, r3, r4)
            if (r0 == 0) goto L37
            goto L39
        L37:
            r0 = 0
            r8 = r0
        L39:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p411xi.C9764h.equals(java.lang.Object):boolean");
    }

    @NotNull
    /* renamed from: g */
    public C9764h mo41192g(@NotNull String str) {
        C9367f.m39526e(str, "algorithm");
        byte[] digest = MessageDigest.getInstance(str).digest(this.f44534d);
        C9367f.m39525d(digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new C9764h(digest);
    }

    public int hashCode() {
        int m41195m = m41195m();
        if (m41195m == 0) {
            m41195m = Arrays.hashCode(m41194j());
            m41204w(m41195m);
        }
        return m41195m;
    }

    /* renamed from: i */
    public final byte m41193i(int i10) {
        return mo41200r(i10);
    }

    @NotNull
    /* renamed from: j */
    public final byte[] m41194j() {
        return this.f44534d;
    }

    /* renamed from: m */
    public final int m41195m() {
        return this.f44532b;
    }

    /* renamed from: n */
    public int mo41196n() {
        return m41194j().length;
    }

    @Nullable
    /* renamed from: o */
    public final String m41197o() {
        return this.f44533c;
    }

    @NotNull
    /* renamed from: p */
    public String mo41198p() {
        char[] cArr = new char[m41194j().length * 2];
        int i10 = 0;
        for (byte b10 : m41194j()) {
            int i11 = i10 + 1;
            cArr[i10] = C10023b.m42175f()[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = C10023b.m42175f()[b10 & 15];
        }
        return new String(cArr);
    }

    @NotNull
    /* renamed from: q */
    public byte[] mo41199q() {
        return m41194j();
    }

    /* renamed from: r */
    public byte mo41200r(int i10) {
        return m41194j()[i10];
    }

    @NotNull
    /* renamed from: s */
    public C9764h m41201s() {
        return mo41192g(MessageDigestAlgorithms.MD5);
    }

    public final int size() {
        return mo41196n();
    }

    @NotNull
    public String toString() {
        int m42172c;
        StringBuilder sb2;
        String sb3;
        if (m41194j().length == 0) {
            sb3 = "[size=0]";
        } else {
            m42172c = C10023b.m42172c(m41194j(), 64);
            if (m42172c != -1) {
                String m41188D = m41188D();
                if (m41188D == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String substring = m41188D.substring(0, m42172c);
                C9367f.m39525d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String m6728u = C1128n.m6728u(C1128n.m6728u(C1128n.m6728u(substring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (m42172c < m41188D.length()) {
                    sb2 = new StringBuilder();
                    sb2.append("[size=");
                    sb2.append(m41194j().length);
                    sb2.append(" text=");
                    sb2.append(m6728u);
                    sb2.append("…]");
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("[text=");
                    sb2.append(m6728u);
                    sb2.append(']');
                }
            } else if (m41194j().length <= 64) {
                sb2 = new StringBuilder();
                sb2.append("[hex=");
                sb2.append(mo41198p());
                sb2.append(']');
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("[size=");
                sb4.append(m41194j().length);
                sb4.append(" hex=");
                if (!(64 <= m41194j().length)) {
                    throw new IllegalArgumentException(("endIndex > length(" + m41194j().length + ')').toString());
                }
                sb4.append((64 == m41194j().length ? this : new C9764h(C5612f.m27681g(m41194j(), 0, 64))).mo41198p());
                sb2 = sb4;
                sb2.append("…]");
            }
            sb3 = sb2.toString();
        }
        return sb3;
    }

    /* renamed from: u */
    public boolean mo41202u(int i10, @NotNull C9764h c9764h, int i11, int i12) {
        C9367f.m39526e(c9764h, "other");
        return c9764h.mo41203v(i11, m41194j(), i10, i12);
    }

    /* renamed from: v */
    public boolean mo41203v(int i10, @NotNull byte[] bArr, int i11, int i12) {
        C9367f.m39526e(bArr, "other");
        return i10 >= 0 && i10 <= m41194j().length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && C9757c.m41080a(m41194j(), i10, bArr, i11, i12);
    }

    /* renamed from: w */
    public final void m41204w(int i10) {
        this.f44532b = i10;
    }

    /* renamed from: x */
    public final void m41205x(@Nullable String str) {
        this.f44533c = str;
    }

    @NotNull
    /* renamed from: y */
    public C9764h m41206y() {
        return mo41192g(MessageDigestAlgorithms.SHA_1);
    }

    @NotNull
    /* renamed from: z */
    public C9764h m41207z() {
        return mo41192g(MessageDigestAlgorithms.SHA_256);
    }
}
