package ci;

import bi.C0911i;
import bi.InterfaceC0906d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh.C5612f;
import kh.C5613g;
import kh.C5615i;
import kh.C5617k;
import org.apache.commons.net.SocketClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5391j;
import p172jh.C5395n;
import p356uh.InterfaceC9196l;
import p356uh.InterfaceC9200p;
import p372vh.AbstractC9368g;
import p372vh.C9367f;
import p448zh.C10238c;
import p448zh.C10240e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ci/o.class
 */
/* renamed from: ci.o */
/* loaded from: combined.jar:classes2.jar:ci/o.class */
public class C1129o extends C1128n {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ci/o$a.class
     */
    /* renamed from: ci.o$a */
    /* loaded from: combined.jar:classes2.jar:ci/o$a.class */
    public static final class a extends AbstractC9368g implements InterfaceC9200p<CharSequence, Integer, C5391j<? extends Integer, ? extends Integer>> {

        /* renamed from: c */
        public final char[] f7477c;

        /* renamed from: d */
        public final boolean f7478d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(char[] cArr, boolean z10) {
            super(2);
            this.f7477c = cArr;
            this.f7478d = z10;
        }

        @Nullable
        /* renamed from: a */
        public final C5391j<Integer, Integer> m6782a(@NotNull CharSequence charSequence, int i10) {
            C9367f.m39526e(charSequence, "$this$$receiver");
            int m6748P = C1129o.m6748P(charSequence, this.f7477c, i10, this.f7478d);
            return m6748P < 0 ? null : C5395n.m26748a(Integer.valueOf(m6748P), 1);
        }

        @Override // p356uh.InterfaceC9200p
        /* renamed from: m */
        public /* bridge */ /* synthetic */ C5391j<? extends Integer, ? extends Integer> mo4818m(CharSequence charSequence, Integer num) {
            return m6782a(charSequence, num.intValue());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ci/o$b.class
     */
    /* renamed from: ci.o$b */
    /* loaded from: combined.jar:classes2.jar:ci/o$b.class */
    public static final class b extends AbstractC9368g implements InterfaceC9200p<CharSequence, Integer, C5391j<? extends Integer, ? extends Integer>> {

        /* renamed from: c */
        public final List<String> f7479c;

        /* renamed from: d */
        public final boolean f7480d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<String> list, boolean z10) {
            super(2);
            this.f7479c = list;
            this.f7480d = z10;
        }

        @Nullable
        /* renamed from: a */
        public final C5391j<Integer, Integer> m6783a(@NotNull CharSequence charSequence, int i10) {
            C9367f.m39526e(charSequence, "$this$$receiver");
            C5391j m6739G = C1129o.m6739G(charSequence, this.f7479c, i10, this.f7480d, false);
            return m6739G != null ? C5395n.m26748a(m6739G.m26739c(), Integer.valueOf(((String) m6739G.m26740d()).length())) : null;
        }

        @Override // p356uh.InterfaceC9200p
        /* renamed from: m */
        public /* bridge */ /* synthetic */ C5391j<? extends Integer, ? extends Integer> mo4818m(CharSequence charSequence, Integer num) {
            return m6783a(charSequence, num.intValue());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ci/o$c.class
     */
    /* renamed from: ci.o$c */
    /* loaded from: combined.jar:classes2.jar:ci/o$c.class */
    public static final class c extends AbstractC9368g implements InterfaceC9196l<C10238c, String> {

        /* renamed from: c */
        public final CharSequence f7481c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CharSequence charSequence) {
            super(1);
            this.f7481c = charSequence;
        }

        @Override // p356uh.InterfaceC9196l
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo6711d(@NotNull C10238c c10238c) {
            C9367f.m39526e(c10238c, "it");
            return C1129o.m6773o0(this.f7481c, c10238c);
        }
    }

    /* renamed from: A */
    public static final boolean m6733A(@NotNull CharSequence charSequence, char c10, boolean z10) {
        C9367f.m39526e(charSequence, "<this>");
        return m6746N(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    /* renamed from: B */
    public static final boolean m6734B(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z10) {
        boolean z11;
        C9367f.m39526e(charSequence, "<this>");
        C9367f.m39526e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m6747O(charSequence, (String) charSequence2, 0, z10, 2, null) >= 0) {
                z11 = true;
            }
            z11 = false;
        } else {
            if (m6745M(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16, null) >= 0) {
                z11 = true;
            }
            z11 = false;
        }
        return z11;
    }

    /* renamed from: C */
    public static /* synthetic */ boolean m6735C(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m6733A(charSequence, c10, z10);
    }

    /* renamed from: D */
    public static /* synthetic */ boolean m6736D(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m6734B(charSequence, charSequence2, z10);
    }

    /* renamed from: E */
    public static final boolean m6737E(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z10) {
        C9367f.m39526e(charSequence, "<this>");
        C9367f.m39526e(charSequence2, "suffix");
        return (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? C1128n.m6718k((String) charSequence, (String) charSequence2, false, 2, null) : m6760b0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z10);
    }

    /* renamed from: F */
    public static /* synthetic */ boolean m6738F(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m6737E(charSequence, charSequence2, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        if (r0 > r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0131, code lost:
    
        if (r0 > r0) goto L50;
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p172jh.C5391j<java.lang.Integer, java.lang.String> m6739G(java.lang.CharSequence r7, java.util.Collection<java.lang.String> r8, int r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.C1129o.m6739G(java.lang.CharSequence, java.util.Collection, int, boolean, boolean):jh.j");
    }

    @NotNull
    /* renamed from: H */
    public static final C10238c m6740H(@NotNull CharSequence charSequence) {
        C9367f.m39526e(charSequence, "<this>");
        return new C10238c(0, charSequence.length() - 1);
    }

    /* renamed from: I */
    public static final int m6741I(@NotNull CharSequence charSequence) {
        C9367f.m39526e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: J */
    public static final int m6742J(@NotNull CharSequence charSequence, char c10, int i10, boolean z10) {
        C9367f.m39526e(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? m6748P(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    /* renamed from: K */
    public static final int m6743K(@NotNull CharSequence charSequence, @NotNull String str, int i10, boolean z10) {
        C9367f.m39526e(charSequence, "<this>");
        C9367f.m39526e(str, "string");
        return (z10 || !(charSequence instanceof String)) ? m6745M(charSequence, str, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(str, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        if (r0 > r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
    
        if (r0 > r0) goto L30;
     */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m6744L(java.lang.CharSequence r7, java.lang.CharSequence r8, int r9, int r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.C1129o.m6744L(java.lang.CharSequence, java.lang.CharSequence, int, int, boolean, boolean):int");
    }

    /* renamed from: M */
    public static /* synthetic */ int m6745M(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return m6744L(charSequence, charSequence2, i10, i11, z10, z11);
    }

    /* renamed from: N */
    public static /* synthetic */ int m6746N(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m6742J(charSequence, c10, i10, z10);
    }

    /* renamed from: O */
    public static /* synthetic */ int m6747O(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m6743K(charSequence, str, i10, z10);
    }

    /* renamed from: P */
    public static final int m6748P(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i10, boolean z10) {
        boolean z11;
        C9367f.m39526e(charSequence, "<this>");
        C9367f.m39526e(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C5613g.m27690p(cArr), i10);
        }
        int m42834b = C10240e.m42834b(i10, 0);
        int m6741I = m6741I(charSequence);
        if (m42834b > m6741I) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(m42834b);
            int length = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = false;
                    break;
                }
                if (C1116b.m6694d(cArr[i11], charAt, z10)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                return m42834b;
            }
            if (m42834b == m6741I) {
                return -1;
            }
            m42834b++;
        }
    }

    /* renamed from: Q */
    public static final int m6749Q(@NotNull CharSequence charSequence, char c10, int i10, boolean z10) {
        C9367f.m39526e(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? m6753U(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    /* renamed from: R */
    public static final int m6750R(@NotNull CharSequence charSequence, @NotNull String str, int i10, boolean z10) {
        C9367f.m39526e(charSequence, "<this>");
        C9367f.m39526e(str, "string");
        return (z10 || !(charSequence instanceof String)) ? m6744L(charSequence, str, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(str, i10);
    }

    /* renamed from: S */
    public static /* synthetic */ int m6751S(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = m6741I(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m6749Q(charSequence, c10, i10, z10);
    }

    /* renamed from: T */
    public static /* synthetic */ int m6752T(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = m6741I(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m6750R(charSequence, str, i10, z10);
    }

    /* renamed from: U */
    public static final int m6753U(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i10, boolean z10) {
        boolean z11;
        C9367f.m39526e(charSequence, "<this>");
        C9367f.m39526e(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(C5613g.m27690p(cArr), i10);
        }
        for (int m42836d = C10240e.m42836d(i10, m6741I(charSequence)); -1 < m42836d; m42836d--) {
            char charAt = charSequence.charAt(m42836d);
            int length = cArr.length;
            int i11 = 0;
            while (true) {
                z11 = false;
                if (i11 >= length) {
                    break;
                }
                if (C1116b.m6694d(cArr[i11], charAt, z10)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                return m42836d;
            }
        }
        return -1;
    }

    @NotNull
    /* renamed from: V */
    public static final InterfaceC0906d<String> m6754V(@NotNull CharSequence charSequence) {
        C9367f.m39526e(charSequence, "<this>");
        return m6770l0(charSequence, new String[]{SocketClient.NETASCII_EOL, "\n", "\r"}, false, 0, 6, null);
    }

    @NotNull
    /* renamed from: W */
    public static final List<String> m6755W(@NotNull CharSequence charSequence) {
        C9367f.m39526e(charSequence, "<this>");
        return C0911i.m5597j(m6754V(charSequence));
    }

    /* renamed from: X */
    public static final InterfaceC0906d<C10238c> m6756X(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11) {
        m6765g0(i11);
        return new C1118d(charSequence, i10, i11, new a(cArr, z10));
    }

    /* renamed from: Y */
    public static final InterfaceC0906d<C10238c> m6757Y(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        m6765g0(i11);
        return new C1118d(charSequence, i10, i11, new b(C5612f.m27676b(strArr), z10));
    }

    /* renamed from: Z */
    public static /* synthetic */ InterfaceC0906d m6758Z(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return m6756X(charSequence, cArr, i10, z10, i11);
    }

    /* renamed from: a0 */
    public static /* synthetic */ InterfaceC0906d m6759a0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return m6757Y(charSequence, strArr, i10, z10, i11);
    }

    /* renamed from: b0 */
    public static final boolean m6760b0(@NotNull CharSequence charSequence, int i10, @NotNull CharSequence charSequence2, int i11, int i12, boolean z10) {
        C9367f.m39526e(charSequence, "<this>");
        C9367f.m39526e(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!C1116b.m6694d(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* renamed from: c0 */
    public static final String m6761c0(@NotNull String str, @NotNull CharSequence charSequence) {
        C9367f.m39526e(str, "<this>");
        C9367f.m39526e(charSequence, "prefix");
        String str2 = str;
        if (m6772n0(str, charSequence, false, 2, null)) {
            str2 = str.substring(charSequence.length());
            C9367f.m39525d(str2, "this as java.lang.String).substring(startIndex)");
        }
        return str2;
    }

    @NotNull
    /* renamed from: d0 */
    public static final String m6762d0(@NotNull String str, @NotNull CharSequence charSequence) {
        C9367f.m39526e(str, "<this>");
        C9367f.m39526e(charSequence, "suffix");
        String str2 = str;
        if (m6738F(str, charSequence, false, 2, null)) {
            str2 = str.substring(0, str.length() - charSequence.length());
            C9367f.m39525d(str2, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return str2;
    }

    @NotNull
    /* renamed from: e0 */
    public static final String m6763e0(@NotNull String str, @NotNull CharSequence charSequence) {
        C9367f.m39526e(str, "<this>");
        C9367f.m39526e(charSequence, "delimiter");
        return m6764f0(str, charSequence, charSequence);
    }

    @NotNull
    /* renamed from: f0 */
    public static final String m6764f0(@NotNull String str, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        C9367f.m39526e(str, "<this>");
        C9367f.m39526e(charSequence, "prefix");
        C9367f.m39526e(charSequence2, "suffix");
        String str2 = str;
        if (str.length() >= charSequence.length() + charSequence2.length()) {
            str2 = str;
            if (m6772n0(str, charSequence, false, 2, null)) {
                str2 = str;
                if (m6738F(str, charSequence2, false, 2, null)) {
                    str2 = str.substring(charSequence.length(), str.length() - charSequence2.length());
                    C9367f.m39525d(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        return str2;
    }

    /* renamed from: g0 */
    public static final void m6765g0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    @NotNull
    /* renamed from: h0 */
    public static final List<String> m6766h0(@NotNull CharSequence charSequence, @NotNull char[] cArr, boolean z10, int i10) {
        C9367f.m39526e(charSequence, "<this>");
        C9367f.m39526e(cArr, "delimiters");
        if (cArr.length == 1) {
            return m6767i0(charSequence, String.valueOf(cArr[0]), z10, i10);
        }
        Iterable m5590c = C0911i.m5590c(m6758Z(charSequence, cArr, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(C5617k.m27708n(m5590c, 10));
        Iterator it = m5590c.iterator();
        while (it.hasNext()) {
            arrayList.add(m6773o0(charSequence, (C10238c) it.next()));
        }
        return arrayList;
    }

    /* renamed from: i0 */
    public static final List<String> m6767i0(CharSequence charSequence, String str, boolean z10, int i10) {
        int length;
        int m6743K;
        m6765g0(i10);
        int i11 = 0;
        int m6743K2 = m6743K(charSequence, str, 0, z10);
        if (m6743K2 == -1 || i10 == 1) {
            return C5615i.m27696b(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        int i12 = 10;
        if (z11) {
            i12 = C10240e.m42836d(i10, 10);
        }
        ArrayList arrayList = new ArrayList(i12);
        int i13 = m6743K2;
        do {
            arrayList.add(charSequence.subSequence(i11, i13).toString());
            length = str.length() + i13;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            m6743K = m6743K(charSequence, str, length, z10);
            i11 = length;
            i13 = m6743K;
        } while (m6743K != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: j0 */
    public static /* synthetic */ List m6768j0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m6766h0(charSequence, cArr, z10, i10);
    }

    @NotNull
    /* renamed from: k0 */
    public static final InterfaceC0906d<String> m6769k0(@NotNull CharSequence charSequence, @NotNull String[] strArr, boolean z10, int i10) {
        C9367f.m39526e(charSequence, "<this>");
        C9367f.m39526e(strArr, "delimiters");
        return C0911i.m5595h(m6759a0(charSequence, strArr, 0, z10, i10, 2, null), new c(charSequence));
    }

    /* renamed from: l0 */
    public static /* synthetic */ InterfaceC0906d m6770l0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m6769k0(charSequence, strArr, z10, i10);
    }

    /* renamed from: m0 */
    public static final boolean m6771m0(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z10) {
        C9367f.m39526e(charSequence, "<this>");
        C9367f.m39526e(charSequence2, "prefix");
        return (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? C1128n.m6732y((String) charSequence, (String) charSequence2, false, 2, null) : m6760b0(charSequence, 0, charSequence2, 0, charSequence2.length(), z10);
    }

    /* renamed from: n0 */
    public static /* synthetic */ boolean m6772n0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m6771m0(charSequence, charSequence2, z10);
    }

    @NotNull
    /* renamed from: o0 */
    public static final String m6773o0(@NotNull CharSequence charSequence, @NotNull C10238c c10238c) {
        C9367f.m39526e(charSequence, "<this>");
        C9367f.m39526e(c10238c, "range");
        return charSequence.subSequence(c10238c.m42831v().intValue(), c10238c.m42830t().intValue() + 1).toString();
    }

    @NotNull
    /* renamed from: p0 */
    public static final String m6774p0(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C9367f.m39526e(str, "<this>");
        C9367f.m39526e(str2, "delimiter");
        C9367f.m39526e(str3, "missingDelimiterValue");
        int m6747O = m6747O(str, str2, 0, false, 6, null);
        if (m6747O != -1) {
            str3 = str.substring(m6747O + str2.length(), str.length());
            C9367f.m39525d(str3, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return str3;
    }

    /* renamed from: q0 */
    public static /* synthetic */ String m6775q0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m6774p0(str, str2, str3);
    }

    @NotNull
    /* renamed from: r0 */
    public static final String m6776r0(@NotNull String str, char c10, @NotNull String str2) {
        C9367f.m39526e(str, "<this>");
        C9367f.m39526e(str2, "missingDelimiterValue");
        int m6746N = m6746N(str, c10, 0, false, 6, null);
        if (m6746N != -1) {
            str2 = str.substring(0, m6746N);
            C9367f.m39525d(str2, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return str2;
    }

    @NotNull
    /* renamed from: s0 */
    public static final String m6777s0(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C9367f.m39526e(str, "<this>");
        C9367f.m39526e(str2, "delimiter");
        C9367f.m39526e(str3, "missingDelimiterValue");
        int m6747O = m6747O(str, str2, 0, false, 6, null);
        if (m6747O != -1) {
            str3 = str.substring(0, m6747O);
            C9367f.m39525d(str3, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return str3;
    }

    /* renamed from: t0 */
    public static /* synthetic */ String m6778t0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m6776r0(str, c10, str2);
    }

    /* renamed from: u0 */
    public static /* synthetic */ String m6779u0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m6777s0(str, str2, str3);
    }

    @NotNull
    /* renamed from: v0 */
    public static final CharSequence m6780v0(@NotNull CharSequence charSequence) {
        C9367f.m39526e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean m6693c = C1115a.m6693c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!m6693c) {
                    break;
                }
                length--;
            } else if (m6693c) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }
}
