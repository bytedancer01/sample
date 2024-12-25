package p173ji;

import ci.C1119e;
import ci.C1128n;
import ci.C1129o;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh.C5617k;
import ki.C5633a;
import ki.C5634b;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.apache.http.HttpHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;
import p372vh.C9365d;
import p372vh.C9367f;
import p411xi.C9761e;
import p448zh.C10236a;
import p448zh.C10240e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/x.class
 */
/* renamed from: ji.x */
/* loaded from: combined.jar:classes2.jar:ji/x.class */
public final class C5433x {

    /* renamed from: a */
    public final boolean f31148a;

    /* renamed from: b */
    @NotNull
    public final String f31149b;

    /* renamed from: c */
    @NotNull
    public final String f31150c;

    /* renamed from: d */
    @NotNull
    public final String f31151d;

    /* renamed from: e */
    @NotNull
    public final String f31152e;

    /* renamed from: f */
    public final int f31153f;

    /* renamed from: g */
    @NotNull
    public final List<String> f31154g;

    /* renamed from: h */
    public final List<String> f31155h;

    /* renamed from: i */
    @Nullable
    public final String f31156i;

    /* renamed from: j */
    public final String f31157j;

    /* renamed from: l */
    public static final b f31147l = new b(null);

    /* renamed from: k */
    public static final char[] f31146k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/x$a.class
     */
    /* renamed from: ji.x$a */
    /* loaded from: combined.jar:classes2.jar:ji/x$a.class */
    public static final class a {

        /* renamed from: i */
        public static final C10309a f31158i = new C10309a(null);

        /* renamed from: a */
        @Nullable
        public String f31159a;

        /* renamed from: d */
        @Nullable
        public String f31162d;

        /* renamed from: f */
        @NotNull
        public final List<String> f31164f;

        /* renamed from: g */
        @Nullable
        public List<String> f31165g;

        /* renamed from: h */
        @Nullable
        public String f31166h;

        /* renamed from: b */
        @NotNull
        public String f31160b = "";

        /* renamed from: c */
        @NotNull
        public String f31161c = "";

        /* renamed from: e */
        public int f31163e = -1;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ji/x$a$a.class
         */
        /* renamed from: ji.x$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:ji/x$a$a.class */
        public static final class C10309a {
            public C10309a() {
            }

            public /* synthetic */ C10309a(C9365d c9365d) {
                this();
            }

            /* renamed from: e */
            public final int m27152e(String str, int i10, int i11) {
                int i12;
                try {
                    int parseInt = Integer.parseInt(b.m27156b(C5433x.f31147l, str, i10, i11, "", false, false, false, false, null, TelnetCommand.f36139EL, null));
                    if (1 > parseInt) {
                        i12 = -1;
                    } else {
                        i12 = -1;
                        if (65535 >= parseInt) {
                            i12 = parseInt;
                        }
                    }
                } catch (NumberFormatException e10) {
                    i12 = -1;
                }
                return i12;
            }

            /* renamed from: f */
            public final int m27153f(String str, int i10, int i11) {
                int i12;
                while (i10 < i11) {
                    char charAt = str.charAt(i10);
                    if (charAt == ':') {
                        return i10;
                    }
                    int i13 = i10;
                    if (charAt != '[') {
                        i12 = i10;
                    } else {
                        while (true) {
                            int i14 = i13 + 1;
                            i12 = i14;
                            if (i14 < i11) {
                                i13 = i14;
                                if (str.charAt(i14) == ']') {
                                    i12 = i14;
                                    break;
                                }
                            }
                        }
                    }
                    i10 = i12 + 1;
                }
                return i11;
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
            
                if (p372vh.C9367f.m39528g(r0, 122) > 0) goto L10;
             */
            /* renamed from: g */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final int m27154g(java.lang.String r4, int r5, int r6) {
                /*
                    r3 = this;
                    r0 = -1
                    r8 = r0
                    r0 = r6
                    r1 = r5
                    int r0 = r0 - r1
                    r1 = 2
                    if (r0 >= r1) goto Lc
                    r0 = -1
                    return r0
                Lc:
                    r0 = r4
                    r1 = r5
                    char r0 = r0.charAt(r1)
                    r9 = r0
                    r0 = r9
                    r1 = 97
                    int r0 = p372vh.C9367f.m39528g(r0, r1)
                    if (r0 < 0) goto L2a
                    r0 = r5
                    r7 = r0
                    r0 = r9
                    r1 = 122(0x7a, float:1.71E-43)
                    int r0 = p372vh.C9367f.m39528g(r0, r1)
                    if (r0 <= 0) goto L4c
                L2a:
                    r0 = r8
                    r7 = r0
                    r0 = r9
                    r1 = 65
                    int r0 = p372vh.C9367f.m39528g(r0, r1)
                    if (r0 < 0) goto Lcc
                    r0 = r5
                    r7 = r0
                    r0 = r9
                    r1 = 90
                    int r0 = p372vh.C9367f.m39528g(r0, r1)
                    if (r0 <= 0) goto L4c
                    r0 = r8
                    r7 = r0
                    goto Lcc
                L4c:
                    r0 = r7
                    r1 = 1
                    int r0 = r0 + r1
                    r5 = r0
                    r0 = r8
                    r7 = r0
                    r0 = r5
                    r1 = r6
                    if (r0 >= r1) goto Lcc
                    r0 = r4
                    r1 = r5
                    char r0 = r0.charAt(r1)
                    r9 = r0
                    r0 = 97
                    r1 = r9
                    if (r0 <= r1) goto L6b
                    goto L75
                L6b:
                    r0 = 122(0x7a, float:1.71E-43)
                    r1 = r9
                    if (r0 < r1) goto L75
                    goto Lb8
                L75:
                    r0 = 65
                    r1 = r9
                    if (r0 <= r1) goto L7f
                    goto L89
                L7f:
                    r0 = 90
                    r1 = r9
                    if (r0 < r1) goto L89
                    goto Lb8
                L89:
                    r0 = 48
                    r1 = r9
                    if (r0 <= r1) goto L93
                    goto L9d
                L93:
                    r0 = 57
                    r1 = r9
                    if (r0 < r1) goto L9d
                    goto Lb8
                L9d:
                    r0 = r9
                    r1 = 43
                    if (r0 != r1) goto La7
                    goto Lb8
                La7:
                    r0 = r9
                    r1 = 45
                    if (r0 != r1) goto Lb1
                    goto Lb8
                Lb1:
                    r0 = r9
                    r1 = 46
                    if (r0 != r1) goto Lbe
                Lb8:
                    r0 = r5
                    r7 = r0
                    goto L4c
                Lbe:
                    r0 = r8
                    r7 = r0
                    r0 = r9
                    r1 = 58
                    if (r0 != r1) goto Lcc
                    r0 = r5
                    r7 = r0
                Lcc:
                    r0 = r7
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p173ji.C5433x.a.C10309a.m27154g(java.lang.String, int, int):int");
            }

            /* renamed from: h */
            public final int m27155h(String str, int i10, int i11) {
                char charAt;
                int i12 = 0;
                while (i10 < i11 && ((charAt = str.charAt(i10)) == '\\' || charAt == '/')) {
                    i12++;
                    i10++;
                }
                return i12;
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f31164f = arrayList;
            arrayList.add("");
        }

        @NotNull
        /* renamed from: a */
        public final a m27124a(@NotNull String str, @Nullable String str2) {
            C9367f.m39526e(str, "encodedName");
            if (this.f31165g == null) {
                this.f31165g = new ArrayList();
            }
            List<String> list = this.f31165g;
            C9367f.m39524c(list);
            b bVar = C5433x.f31147l;
            list.add(b.m27156b(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
            List<String> list2 = this.f31165g;
            C9367f.m39524c(list2);
            list2.add(str2 != null ? b.m27156b(bVar, str2, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null) : null);
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final a m27125b(@NotNull String str, @Nullable String str2) {
            C9367f.m39526e(str, "name");
            if (this.f31165g == null) {
                this.f31165g = new ArrayList();
            }
            List<String> list = this.f31165g;
            C9367f.m39524c(list);
            b bVar = C5433x.f31147l;
            list.add(b.m27156b(bVar, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            List<String> list2 = this.f31165g;
            C9367f.m39524c(list2);
            list2.add(str2 != null ? b.m27156b(bVar, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null) : null);
            return this;
        }

        @NotNull
        /* renamed from: c */
        public final C5433x m27126c() {
            ArrayList arrayList;
            String str = this.f31159a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = C5433x.f31147l;
            String m27157h = b.m27157h(bVar, this.f31160b, 0, 0, false, 7, null);
            String m27157h2 = b.m27157h(bVar, this.f31161c, 0, 0, false, 7, null);
            String str2 = this.f31162d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int m27127d = m27127d();
            List<String> list = this.f31164f;
            ArrayList arrayList2 = new ArrayList(C5617k.m27708n(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.m27157h(C5433x.f31147l, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f31165g;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList(C5617k.m27708n(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    arrayList = arrayList3;
                    if (!it2.hasNext()) {
                        break;
                    }
                    String str3 = (String) it2.next();
                    arrayList3.add(str3 != null ? b.m27157h(C5433x.f31147l, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.f31166h;
            return new C5433x(str, m27157h, m27157h2, str2, m27127d, arrayList2, arrayList, str4 != null ? b.m27157h(C5433x.f31147l, str4, 0, 0, false, 7, null) : null, toString());
        }

        /* renamed from: d */
        public final int m27127d() {
            int i10 = this.f31163e;
            if (i10 == -1) {
                b bVar = C5433x.f31147l;
                String str = this.f31159a;
                C9367f.m39524c(str);
                i10 = bVar.m27159c(str);
            }
            return i10;
        }

        @NotNull
        /* renamed from: e */
        public final a m27128e(@Nullable String str) {
            b bVar;
            String m27156b;
            this.f31165g = (str == null || (m27156b = b.m27156b((bVar = C5433x.f31147l), str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null)) == null) ? null : bVar.m27165j(m27156b);
            return this;
        }

        @NotNull
        /* renamed from: f */
        public final List<String> m27129f() {
            return this.f31164f;
        }

        @NotNull
        /* renamed from: g */
        public final a m27130g(@NotNull String str) {
            C9367f.m39526e(str, "host");
            String m27756e = C5633a.m27756e(b.m27157h(C5433x.f31147l, str, 0, 0, false, 7, null));
            if (m27756e != null) {
                this.f31162d = m27756e;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        /* renamed from: h */
        public final boolean m27131h(String str) {
            boolean z10 = true;
            if (!C9367f.m39522a(str, InstructionFileId.DOT)) {
                z10 = C1128n.m6719l(str, "%2e", true);
            }
            return z10;
        }

        /* renamed from: i */
        public final boolean m27132i(String str) {
            boolean z10 = true;
            if (!C9367f.m39522a(str, "..")) {
                z10 = true;
                if (!C1128n.m6719l(str, "%2e.", true)) {
                    z10 = true;
                    if (!C1128n.m6719l(str, ".%2e", true)) {
                        z10 = C1128n.m6719l(str, "%2e%2e", true);
                    }
                }
            }
            return z10;
        }

        @NotNull
        /* renamed from: j */
        public final a m27133j(@Nullable C5433x c5433x, @NotNull String str) {
            int m27794n;
            C9367f.m39526e(str, "input");
            int m27804x = C5634b.m27804x(str, 0, 0, 3, null);
            int m27806z = C5634b.m27806z(str, m27804x, 0, 2, null);
            C10309a c10309a = f31158i;
            int m27154g = c10309a.m27154g(str, m27804x, m27806z);
            if (m27154g != -1) {
                if (C1128n.m6729v(str, "https:", m27804x, true)) {
                    this.f31159a = ClientConstants.DOMAIN_SCHEME;
                    m27804x += 6;
                } else {
                    if (!C1128n.m6729v(str, "http:", m27804x, true)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String substring = str.substring(0, m27154g);
                        C9367f.m39525d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb2.append(substring);
                        sb2.append("'");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f31159a = HttpHost.DEFAULT_SCHEME_NAME;
                    m27804x += 5;
                }
            } else {
                if (c5433x == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.f31159a = c5433x.m27121s();
            }
            int m27155h = c10309a.m27155h(str, m27804x, m27806z);
            if (m27155h >= 2 || c5433x == null || (!C9367f.m39522a(c5433x.m27121s(), this.f31159a))) {
                int i10 = m27804x + m27155h;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    m27794n = C5634b.m27794n(str, "@/\\?#", i10, m27806z);
                    char charAt = m27794n != m27806z ? str.charAt(m27794n) : (char) 65535;
                    if (charAt == 65535 || charAt == '#' || charAt == '/' || charAt == '\\' || charAt == '?') {
                        break;
                    }
                    if (charAt == '@') {
                        if (z10) {
                            this.f31161c += "%40" + b.m27156b(C5433x.f31147l, str, i10, m27794n, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                        } else {
                            int m27793m = C5634b.m27793m(str, ':', i10, m27794n);
                            b bVar = C5433x.f31147l;
                            String m27156b = b.m27156b(bVar, str, i10, m27793m, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            String str2 = m27156b;
                            if (z11) {
                                str2 = this.f31160b + "%40" + m27156b;
                            }
                            this.f31160b = str2;
                            if (m27793m != m27794n) {
                                this.f31161c = b.m27156b(bVar, str, m27793m + 1, m27794n, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z10 = true;
                            }
                            z11 = true;
                        }
                        i10 = m27794n + 1;
                    }
                }
                C10309a c10309a2 = f31158i;
                int m27153f = c10309a2.m27153f(str, i10, m27794n);
                int i11 = m27153f + 1;
                if (i11 < m27794n) {
                    this.f31162d = C5633a.m27756e(b.m27157h(C5433x.f31147l, str, i10, m27153f, false, 4, null));
                    int m27152e = c10309a2.m27152e(str, i11, m27794n);
                    this.f31163e = m27152e;
                    if (!(m27152e != -1)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String substring2 = str.substring(i11, m27794n);
                        C9367f.m39525d(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb3.append(substring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    b bVar2 = C5433x.f31147l;
                    this.f31162d = C5633a.m27756e(b.m27157h(bVar2, str, i10, m27153f, false, 4, null));
                    String str3 = this.f31159a;
                    C9367f.m39524c(str3);
                    this.f31163e = bVar2.m27159c(str3);
                }
                if (!(this.f31162d != null)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String substring3 = str.substring(i10, m27153f);
                    C9367f.m39525d(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sb4.append(substring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                m27804x = m27794n;
            } else {
                this.f31160b = c5433x.m27111g();
                this.f31161c = c5433x.m27107c();
                this.f31162d = c5433x.m27112i();
                this.f31163e = c5433x.m27117o();
                this.f31164f.clear();
                this.f31164f.addAll(c5433x.m27109e());
                if (m27804x == m27806z || str.charAt(m27804x) == '#') {
                    m27128e(c5433x.m27110f());
                }
            }
            int m27794n2 = C5634b.m27794n(str, "?#", m27804x, m27806z);
            m27139p(str, m27804x, m27794n2);
            int i12 = m27794n2;
            if (m27794n2 < m27806z) {
                i12 = m27794n2;
                if (str.charAt(m27794n2) == '?') {
                    i12 = C5634b.m27793m(str, '#', m27794n2, m27806z);
                    b bVar3 = C5433x.f31147l;
                    this.f31165g = bVar3.m27165j(b.m27156b(bVar3, str, m27794n2 + 1, i12, " \"'<>#", true, false, true, false, null, 208, null));
                }
            }
            if (i12 < m27806z && str.charAt(i12) == '#') {
                this.f31166h = b.m27156b(C5433x.f31147l, str, i12 + 1, m27806z, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        @NotNull
        /* renamed from: k */
        public final a m27134k(@NotNull String str) {
            C9367f.m39526e(str, CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD);
            this.f31161c = b.m27156b(C5433x.f31147l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        /* renamed from: l */
        public final void m27135l() {
            List<String> list = this.f31164f;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.f31164f.isEmpty())) {
                this.f31164f.add("");
            } else {
                List<String> list2 = this.f31164f;
                list2.set(list2.size() - 1, "");
            }
        }

        @NotNull
        /* renamed from: m */
        public final a m27136m(int i10) {
            boolean z10 = true;
            if (1 > i10 || 65535 < i10) {
                z10 = false;
            }
            if (z10) {
                this.f31163e = i10;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i10).toString());
        }

        /* renamed from: n */
        public final void m27137n(String str, int i10, int i11, boolean z10, boolean z11) {
            String m27156b = b.m27156b(C5433x.f31147l, str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, false, null, 240, null);
            if (m27131h(m27156b)) {
                return;
            }
            if (m27132i(m27156b)) {
                m27135l();
                return;
            }
            List<String> list = this.f31164f;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.f31164f;
                list2.set(list2.size() - 1, m27156b);
            } else {
                this.f31164f.add(m27156b);
            }
            if (z10) {
                this.f31164f.add("");
            }
        }

        @NotNull
        /* renamed from: o */
        public final a m27138o() {
            String str = this.f31162d;
            this.f31162d = str != null ? new C1119e("[\"<>^`{|}]").m6704b(str, "") : null;
            int size = this.f31164f.size();
            for (int i10 = 0; i10 < size; i10++) {
                List<String> list = this.f31164f;
                list.set(i10, b.m27156b(C5433x.f31147l, list.get(i10), 0, 0, "[]", true, true, false, false, null, FTPReply.ENTERING_PASSIVE_MODE, null));
            }
            List<String> list2 = this.f31165g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = list2.get(i11);
                    list2.set(i11, str2 != null ? b.m27156b(C5433x.f31147l, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.f31166h;
            this.f31166h = str3 != null ? b.m27156b(C5433x.f31147l, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        /* renamed from: p */
        public final void m27139p(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char charAt = str.charAt(i10);
            if (charAt == '/' || charAt == '\\') {
                this.f31164f.clear();
                this.f31164f.add("");
                i10++;
            } else {
                List<String> list = this.f31164f;
                list.set(list.size() - 1, "");
            }
            while (i10 < i11) {
                int m27794n = C5634b.m27794n(str, "/\\", i10, i11);
                boolean z10 = m27794n < i11;
                m27137n(str, i10, m27794n, z10, true);
                i10 = m27794n;
                if (z10) {
                    i10 = m27794n + 1;
                }
            }
        }

        @NotNull
        /* renamed from: q */
        public final a m27140q(@NotNull String str) {
            String str2;
            C9367f.m39526e(str, "scheme");
            if (C1128n.m6719l(str, HttpHost.DEFAULT_SCHEME_NAME, true)) {
                str2 = HttpHost.DEFAULT_SCHEME_NAME;
            } else {
                if (!C1128n.m6719l(str, ClientConstants.DOMAIN_SCHEME, true)) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                str2 = ClientConstants.DOMAIN_SCHEME;
            }
            this.f31159a = str2;
            return this;
        }

        /* renamed from: r */
        public final void m27141r(@Nullable String str) {
            this.f31166h = str;
        }

        /* renamed from: s */
        public final void m27142s(@NotNull String str) {
            C9367f.m39526e(str, "<set-?>");
            this.f31161c = str;
        }

        /* renamed from: t */
        public final void m27143t(@NotNull String str) {
            C9367f.m39526e(str, "<set-?>");
            this.f31160b = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
        
            if ((r6.f31161c.length() > 0) != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0105, code lost:
        
            if (r0 != r0.m27159c(r0)) goto L40;
         */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 367
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p173ji.C5433x.a.toString():java.lang.String");
        }

        /* renamed from: u */
        public final void m27144u(@Nullable String str) {
            this.f31162d = str;
        }

        /* renamed from: v */
        public final void m27145v(int i10) {
            this.f31163e = i10;
        }

        /* renamed from: w */
        public final void m27146w(@Nullable String str) {
            this.f31159a = str;
        }

        @NotNull
        /* renamed from: x */
        public final a m27147x(@NotNull String str) {
            C9367f.m39526e(str, CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME);
            this.f31160b = b.m27156b(C5433x.f31147l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/x$b.class
     */
    /* renamed from: ji.x$b */
    /* loaded from: combined.jar:classes2.jar:ji/x$b.class */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C9365d c9365d) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ String m27156b(b bVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 8) != 0) {
                z10 = false;
            }
            if ((i12 & 16) != 0) {
                z11 = false;
            }
            if ((i12 & 32) != 0) {
                z12 = false;
            }
            if ((i12 & 64) != 0) {
                z13 = false;
            }
            if ((i12 & 128) != 0) {
                charset = null;
            }
            return bVar.m27158a(str, i10, i11, str2, z10, z11, z12, z13, charset);
        }

        /* renamed from: h */
        public static /* synthetic */ String m27157h(b bVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return bVar.m27163g(str, i10, i11, z10);
        }

        @NotNull
        /* renamed from: a */
        public final String m27158a(@NotNull String str, int i10, int i11, @NotNull String str2, boolean z10, boolean z11, boolean z12, boolean z13, @Nullable Charset charset) {
            int i12;
            C9367f.m39526e(str, "$this$canonicalize");
            C9367f.m39526e(str2, "encodeSet");
            int i13 = i10;
            while (true) {
                i12 = i13;
                if (i12 >= i11) {
                    String substring = str.substring(i10, i11);
                    C9367f.m39525d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    return substring;
                }
                int codePointAt = str.codePointAt(i12);
                if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z13) || C1129o.m6735C(str2, (char) codePointAt, false, 2, null) || ((codePointAt == 37 && (!z10 || (z11 && !m27161e(str, i12, i11)))) || (codePointAt == 43 && z12)))) {
                    break;
                }
                i13 = i12 + Character.charCount(codePointAt);
            }
            C9761e c9761e = new C9761e();
            c9761e.mo41140T(str, i10, i12);
            m27167l(c9761e, str, i12, i11, str2, z10, z11, z12, z13, charset);
            return c9761e.m41134O0();
        }

        /* renamed from: c */
        public final int m27159c(@NotNull String str) {
            int i10;
            C9367f.m39526e(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals(ClientConstants.DOMAIN_SCHEME)) {
                    i10 = 443;
                }
                i10 = -1;
            } else {
                if (str.equals(HttpHost.DEFAULT_SCHEME_NAME)) {
                    i10 = 80;
                }
                i10 = -1;
            }
            return i10;
        }

        @NotNull
        /* renamed from: d */
        public final C5433x m27160d(@NotNull String str) {
            C9367f.m39526e(str, "$this$toHttpUrl");
            return new a().m27133j(null, str).m27126c();
        }

        /* renamed from: e */
        public final boolean m27161e(String str, int i10, int i11) {
            int i12 = i10 + 2;
            boolean z10 = true;
            if (i12 >= i11 || str.charAt(i10) != '%' || C5634b.m27761E(str.charAt(i10 + 1)) == -1 || C5634b.m27761E(str.charAt(i12)) == -1) {
                z10 = false;
            }
            return z10;
        }

        @Nullable
        /* renamed from: f */
        public final C5433x m27162f(@NotNull String str) {
            C5433x c5433x;
            C9367f.m39526e(str, "$this$toHttpUrlOrNull");
            try {
                c5433x = m27160d(str);
            } catch (IllegalArgumentException e10) {
                c5433x = null;
            }
            return c5433x;
        }

        @NotNull
        /* renamed from: g */
        public final String m27163g(@NotNull String str, int i10, int i11, boolean z10) {
            C9367f.m39526e(str, "$this$percentDecode");
            for (int i12 = i10; i12 < i11; i12++) {
                char charAt = str.charAt(i12);
                if (charAt == '%' || (charAt == '+' && z10)) {
                    C9761e c9761e = new C9761e();
                    c9761e.mo41140T(str, i10, i12);
                    m27168m(c9761e, str, i12, i11, z10);
                    return c9761e.m41134O0();
                }
            }
            String substring = str.substring(i10, i11);
            C9367f.m39525d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: i */
        public final void m27164i(@NotNull List<String> list, @NotNull StringBuilder sb2) {
            C9367f.m39526e(list, "$this$toPathString");
            C9367f.m39526e(sb2, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('/');
                sb2.append(list.get(i10));
            }
        }

        @NotNull
        /* renamed from: j */
        public final List<String> m27165j(@NotNull String str) {
            String str2;
            C9367f.m39526e(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (i11 > str.length()) {
                    return arrayList;
                }
                int m6746N = C1129o.m6746N(str, '&', i11, false, 4, null);
                int i12 = m6746N;
                if (m6746N == -1) {
                    i12 = str.length();
                }
                int m6746N2 = C1129o.m6746N(str, '=', i11, false, 4, null);
                if (m6746N2 == -1 || m6746N2 > i12) {
                    String substring = str.substring(i11, i12);
                    C9367f.m39525d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    str2 = null;
                } else {
                    String substring2 = str.substring(i11, m6746N2);
                    C9367f.m39525d(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    str2 = str.substring(m6746N2 + 1, i12);
                    C9367f.m39525d(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(str2);
                i10 = i12 + 1;
            }
        }

        /* renamed from: k */
        public final void m27166k(@NotNull List<String> list, @NotNull StringBuilder sb2) {
            C9367f.m39526e(list, "$this$toQueryString");
            C9367f.m39526e(sb2, "out");
            C10236a m42840h = C10240e.m42840h(C10240e.m42841i(0, list.size()), 2);
            int m42824d = m42840h.m42824d();
            int m42825f = m42840h.m42825f();
            int m42826g = m42840h.m42826g();
            if (m42826g >= 0) {
                if (m42824d > m42825f) {
                    return;
                }
            } else if (m42824d < m42825f) {
                return;
            }
            while (true) {
                String str = list.get(m42824d);
                String str2 = list.get(m42824d + 1);
                if (m42824d > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (m42824d == m42825f) {
                    return;
                } else {
                    m42824d += m42826g;
                }
            }
        }

        /* renamed from: l */
        public final void m27167l(C9761e c9761e, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
            C9761e c9761e2 = null;
            while (i10 < i11) {
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                int codePointAt = str.codePointAt(i10);
                if (!z10 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                    if (codePointAt == 43 && z12) {
                        c9761e.mo41136Q(z10 ? Marker.ANY_NON_NULL_MARKER : "%2B");
                    } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z13) || C1129o.m6735C(str2, (char) codePointAt, false, 2, null) || (codePointAt == 37 && (!z10 || (z11 && !m27161e(str, i10, i11)))))) {
                        C9761e c9761e3 = c9761e2;
                        if (c9761e2 == null) {
                            c9761e3 = new C9761e();
                        }
                        if (charset == null || C9367f.m39522a(charset, StandardCharsets.UTF_8)) {
                            c9761e3.m41161h1(codePointAt);
                        } else {
                            c9761e3.m41156d1(str, i10, Character.charCount(codePointAt) + i10, charset);
                        }
                        while (true) {
                            c9761e2 = c9761e3;
                            if (!c9761e3.mo41164k0()) {
                                int readByte = c9761e3.readByte() & 255;
                                c9761e.writeByte(37);
                                c9761e.writeByte(C5433x.f31146k[(readByte >> 4) & 15]);
                                c9761e.writeByte(C5433x.f31146k[readByte & 15]);
                            }
                        }
                    } else {
                        c9761e.m41161h1(codePointAt);
                    }
                }
                i10 += Character.charCount(codePointAt);
            }
        }

        /* renamed from: m */
        public final void m27168m(C9761e c9761e, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                int codePointAt = str.codePointAt(i10);
                if (codePointAt != 37 || (i12 = i10 + 2) >= i11) {
                    if (codePointAt == 43 && z10) {
                        c9761e.writeByte(32);
                        i10++;
                    }
                    c9761e.m41161h1(codePointAt);
                    i10 += Character.charCount(codePointAt);
                } else {
                    int m27761E = C5634b.m27761E(str.charAt(i10 + 1));
                    int m27761E2 = C5634b.m27761E(str.charAt(i12));
                    if (m27761E != -1 && m27761E2 != -1) {
                        c9761e.writeByte((m27761E << 4) + m27761E2);
                        i10 = Character.charCount(codePointAt) + i12;
                    }
                    c9761e.m41161h1(codePointAt);
                    i10 += Character.charCount(codePointAt);
                }
            }
        }
    }

    public C5433x(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i10, @NotNull List<String> list, @Nullable List<String> list2, @Nullable String str5, @NotNull String str6) {
        C9367f.m39526e(str, "scheme");
        C9367f.m39526e(str2, CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME);
        C9367f.m39526e(str3, CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD);
        C9367f.m39526e(str4, "host");
        C9367f.m39526e(list, "pathSegments");
        C9367f.m39526e(str6, "url");
        this.f31149b = str;
        this.f31150c = str2;
        this.f31151d = str3;
        this.f31152e = str4;
        this.f31153f = i10;
        this.f31154g = list;
        this.f31155h = list2;
        this.f31156i = str5;
        this.f31157j = str6;
        this.f31148a = C9367f.m39522a(str, ClientConstants.DOMAIN_SCHEME);
    }

    @NotNull
    /* renamed from: h */
    public static final C5433x m27104h(@NotNull String str) {
        return f31147l.m27160d(str);
    }

    @Nullable
    /* renamed from: m */
    public static final C5433x m27105m(@NotNull String str) {
        return f31147l.m27162f(str);
    }

    @Nullable
    /* renamed from: b */
    public final String m27106b() {
        if (this.f31156i == null) {
            return null;
        }
        int m6746N = C1129o.m6746N(this.f31157j, '#', 0, false, 6, null);
        String str = this.f31157j;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str.substring(m6746N + 1);
        C9367f.m39525d(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    @NotNull
    /* renamed from: c */
    public final String m27107c() {
        if (this.f31151d.length() == 0) {
            return "";
        }
        int m6746N = C1129o.m6746N(this.f31157j, ':', this.f31149b.length() + 3, false, 4, null);
        int m6746N2 = C1129o.m6746N(this.f31157j, '@', 0, false, 6, null);
        String str = this.f31157j;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str.substring(m6746N + 1, m6746N2);
        C9367f.m39525d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    /* renamed from: d */
    public final String m27108d() {
        int m6746N = C1129o.m6746N(this.f31157j, '/', this.f31149b.length() + 3, false, 4, null);
        String str = this.f31157j;
        int m27794n = C5634b.m27794n(str, "?#", m6746N, str.length());
        String str2 = this.f31157j;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str2.substring(m6746N, m27794n);
        C9367f.m39525d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    /* renamed from: e */
    public final List<String> m27109e() {
        int m6746N = C1129o.m6746N(this.f31157j, '/', this.f31149b.length() + 3, false, 4, null);
        String str = this.f31157j;
        int m27794n = C5634b.m27794n(str, "?#", m6746N, str.length());
        ArrayList arrayList = new ArrayList();
        while (m6746N < m27794n) {
            int i10 = m6746N + 1;
            m6746N = C5634b.m27793m(this.f31157j, '/', i10, m27794n);
            String str2 = this.f31157j;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = str2.substring(i10, m6746N);
            C9367f.m39525d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
        }
        return arrayList;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C5433x) && C9367f.m39522a(((C5433x) obj).f31157j, this.f31157j);
    }

    @Nullable
    /* renamed from: f */
    public final String m27110f() {
        if (this.f31155h == null) {
            return null;
        }
        int m6746N = C1129o.m6746N(this.f31157j, '?', 0, false, 6, null) + 1;
        String str = this.f31157j;
        int m27793m = C5634b.m27793m(str, '#', m6746N, str.length());
        String str2 = this.f31157j;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str2.substring(m6746N, m27793m);
        C9367f.m39525d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    /* renamed from: g */
    public final String m27111g() {
        if (this.f31150c.length() == 0) {
            return "";
        }
        int length = this.f31149b.length() + 3;
        String str = this.f31157j;
        int m27794n = C5634b.m27794n(str, ":@", length, str.length());
        String str2 = this.f31157j;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str2.substring(length, m27794n);
        C9367f.m39525d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public int hashCode() {
        return this.f31157j.hashCode();
    }

    @NotNull
    /* renamed from: i */
    public final String m27112i() {
        return this.f31152e;
    }

    /* renamed from: j */
    public final boolean m27113j() {
        return this.f31148a;
    }

    @NotNull
    /* renamed from: k */
    public final a m27114k() {
        a aVar = new a();
        aVar.m27146w(this.f31149b);
        aVar.m27143t(m27111g());
        aVar.m27142s(m27107c());
        aVar.m27144u(this.f31152e);
        aVar.m27145v(this.f31153f != f31147l.m27159c(this.f31149b) ? this.f31153f : -1);
        aVar.m27129f().clear();
        aVar.m27129f().addAll(m27109e());
        aVar.m27128e(m27110f());
        aVar.m27141r(m27106b());
        return aVar;
    }

    @Nullable
    /* renamed from: l */
    public final a m27115l(@NotNull String str) {
        a aVar;
        C9367f.m39526e(str, "link");
        try {
            aVar = new a().m27133j(this, str);
        } catch (IllegalArgumentException e10) {
            aVar = null;
        }
        return aVar;
    }

    @NotNull
    /* renamed from: n */
    public final List<String> m27116n() {
        return this.f31154g;
    }

    /* renamed from: o */
    public final int m27117o() {
        return this.f31153f;
    }

    @Nullable
    /* renamed from: p */
    public final String m27118p() {
        if (this.f31155h == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f31147l.m27166k(this.f31155h, sb2);
        return sb2.toString();
    }

    @NotNull
    /* renamed from: q */
    public final String m27119q() {
        a m27115l = m27115l("/...");
        C9367f.m39524c(m27115l);
        return m27115l.m27147x("").m27134k("").m27126c().toString();
    }

    @Nullable
    /* renamed from: r */
    public final C5433x m27120r(@NotNull String str) {
        C9367f.m39526e(str, "link");
        a m27115l = m27115l(str);
        return m27115l != null ? m27115l.m27126c() : null;
    }

    @NotNull
    /* renamed from: s */
    public final String m27121s() {
        return this.f31149b;
    }

    @NotNull
    /* renamed from: t */
    public final URI m27122t() {
        URI create;
        String aVar = m27114k().m27138o().toString();
        try {
            create = new URI(aVar);
        } catch (URISyntaxException e10) {
            try {
                create = URI.create(new C1119e("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").m6704b(aVar, ""));
                C9367f.m39525d(create, "try {\n        val stripp…e) // Unexpected!\n      }");
            } catch (Exception e11) {
                throw new RuntimeException(e10);
            }
        }
        return create;
    }

    @NotNull
    public String toString() {
        return this.f31157j;
    }

    @NotNull
    /* renamed from: u */
    public final URL m27123u() {
        try {
            return new URL(this.f31157j);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }
}
