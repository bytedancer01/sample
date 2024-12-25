package ci;

import java.util.ArrayList;
import java.util.List;
import kh.C5616j;
import kh.C5624r;
import org.jetbrains.annotations.NotNull;
import p356uh.InterfaceC9196l;
import p372vh.AbstractC9368g;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ci/g.class
 */
/* renamed from: ci.g */
/* loaded from: combined.jar:classes2.jar:ci/g.class */
public class C1121g extends C1120f {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ci/g$a.class
     */
    /* renamed from: ci.g$a */
    /* loaded from: combined.jar:classes2.jar:ci/g$a.class */
    public static final class a extends AbstractC9368g implements InterfaceC9196l<String, String> {

        /* renamed from: c */
        public static final a f7475c = new a();

        public a() {
            super(1);
        }

        @Override // p356uh.InterfaceC9196l
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo6711d(@NotNull String str) {
            C9367f.m39526e(str, "line");
            return str;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ci/g$b.class
     */
    /* renamed from: ci.g$b */
    /* loaded from: combined.jar:classes2.jar:ci/g$b.class */
    public static final class b extends AbstractC9368g implements InterfaceC9196l<String, String> {

        /* renamed from: c */
        public final String f7476c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f7476c = str;
        }

        @Override // p356uh.InterfaceC9196l
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo6711d(@NotNull String str) {
            C9367f.m39526e(str, "line");
            return this.f7476c + str;
        }
    }

    /* renamed from: b */
    public static final InterfaceC9196l<String, String> m6706b(String str) {
        return str.length() == 0 ? a.f7475c : new b(str);
    }

    @NotNull
    /* renamed from: c */
    public static final String m6707c(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        String str4;
        C9367f.m39526e(str, "<this>");
        C9367f.m39526e(str2, "newIndent");
        C9367f.m39526e(str3, "marginPrefix");
        if (!(!C1128n.m6721n(str3))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> m6755W = C1129o.m6755W(str);
        int length = str.length();
        int length2 = str2.length();
        int size = m6755W.size();
        InterfaceC9196l<String, String> m6706b = m6706b(str2);
        int m27701g = C5616j.m27701g(m6755W);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : m6755W) {
            if (i10 < 0) {
                C5616j.m27707m();
            }
            String str5 = (String) obj;
            String str6 = null;
            if ((i10 == 0 || i10 == m27701g) && C1128n.m6721n(str5)) {
                str4 = null;
            } else {
                int length3 = str5.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length3) {
                        i11 = -1;
                        break;
                    }
                    if (!C1115a.m6693c(str5.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
                if (i11 != -1 && C1128n.m6731x(str5, str3, i11, false, 4, null)) {
                    str6 = str5.substring(i11 + str3.length());
                    C9367f.m39525d(str6, "this as java.lang.String).substring(startIndex)");
                }
                str4 = str5;
                if (str6 != null) {
                    str4 = m6706b.mo6711d(str6);
                    if (str4 == null) {
                        str4 = str5;
                    }
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i10++;
        }
        String sb2 = ((StringBuilder) C5624r.m27727w(arrayList, new StringBuilder(length + (length2 * size)), "\n", null, null, 0, null, null, 124, null)).toString();
        C9367f.m39525d(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    @NotNull
    /* renamed from: d */
    public static final String m6708d(@NotNull String str, @NotNull String str2) {
        C9367f.m39526e(str, "<this>");
        C9367f.m39526e(str2, "marginPrefix");
        return m6707c(str, "", str2);
    }

    /* renamed from: e */
    public static /* synthetic */ String m6709e(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return m6708d(str, str2);
    }
}
