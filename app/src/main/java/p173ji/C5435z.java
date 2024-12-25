package p173ji;

import ci.C1128n;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kh.C5613g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9365d;
import p372vh.C9367f;
import p448zh.C10236a;
import p448zh.C10240e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/z.class
 */
/* renamed from: ji.z */
/* loaded from: combined.jar:classes2.jar:ji/z.class */
public final class C5435z {

    /* renamed from: a */
    public final String f31170a;

    /* renamed from: b */
    @NotNull
    public final String f31171b;

    /* renamed from: c */
    @NotNull
    public final String f31172c;

    /* renamed from: d */
    public final String[] f31173d;

    /* renamed from: g */
    public static final a f31169g = new a(null);

    /* renamed from: e */
    public static final Pattern f31167e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: f */
    public static final Pattern f31168f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/z$a.class
     */
    /* renamed from: ji.z$a */
    /* loaded from: combined.jar:classes2.jar:ji/z$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C5435z m27178a(@NotNull String str) {
            String str2;
            C9367f.m39526e(str, "$this$toMediaType");
            Matcher matcher = C5435z.f31167e.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String group = matcher.group(1);
            C9367f.m39525d(group, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            C9367f.m39525d(locale, "Locale.US");
            if (group == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = group.toLowerCase(locale);
            C9367f.m39525d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String group2 = matcher.group(2);
            C9367f.m39525d(group2, "typeSubtype.group(2)");
            C9367f.m39525d(locale, "Locale.US");
            if (group2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase2 = group2.toLowerCase(locale);
            C9367f.m39525d(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = C5435z.f31168f.matcher(str);
            int end = matcher.end();
            while (true) {
                int i10 = end;
                if (i10 >= str.length()) {
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array != null) {
                        return new C5435z(str, lowerCase, lowerCase2, (String[]) array, null);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                matcher2.region(i10, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameter is not formatted correctly: \"");
                    String substring = str.substring(i10);
                    C9367f.m39525d(substring, "(this as java.lang.String).substring(startIndex)");
                    sb2.append(substring);
                    sb2.append("\" for: \"");
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                String group3 = matcher2.group(1);
                if (group3 != null) {
                    String group4 = matcher2.group(2);
                    if (group4 == null) {
                        str2 = matcher2.group(3);
                    } else {
                        str2 = group4;
                        if (C1128n.m6732y(group4, "'", false, 2, null)) {
                            str2 = group4;
                            if (C1128n.m6718k(group4, "'", false, 2, null)) {
                                str2 = group4;
                                if (group4.length() > 2) {
                                    str2 = group4.substring(1, group4.length() - 1);
                                    C9367f.m39525d(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                }
                            }
                        }
                    }
                    arrayList.add(group3);
                    arrayList.add(str2);
                }
                end = matcher2.end();
            }
        }

        @Nullable
        /* renamed from: b */
        public final C5435z m27179b(@NotNull String str) {
            C5435z c5435z;
            C9367f.m39526e(str, "$this$toMediaTypeOrNull");
            try {
                c5435z = m27178a(str);
            } catch (IllegalArgumentException e10) {
                c5435z = null;
            }
            return c5435z;
        }
    }

    public C5435z(String str, String str2, String str3, String[] strArr) {
        this.f31170a = str;
        this.f31171b = str2;
        this.f31172c = str3;
        this.f31173d = strArr;
    }

    public /* synthetic */ C5435z(String str, String str2, String str3, String[] strArr, C9365d c9365d) {
        this(str, str2, str3, strArr);
    }

    /* renamed from: d */
    public static /* synthetic */ Charset m27172d(C5435z c5435z, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return c5435z.m27175c(charset);
    }

    @NotNull
    /* renamed from: e */
    public static final C5435z m27173e(@NotNull String str) {
        return f31169g.m27178a(str);
    }

    @Nullable
    /* renamed from: g */
    public static final C5435z m27174g(@NotNull String str) {
        return f31169g.m27179b(str);
    }

    @Nullable
    /* renamed from: c */
    public final Charset m27175c(@Nullable Charset charset) {
        String m27176f = m27176f("charset");
        Charset charset2 = charset;
        if (m27176f != null) {
            try {
                charset2 = Charset.forName(m27176f);
            } catch (IllegalArgumentException e10) {
                charset2 = charset;
            }
        }
        return charset2;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C5435z) && C9367f.m39522a(((C5435z) obj).f31170a, this.f31170a);
    }

    @Nullable
    /* renamed from: f */
    public final String m27176f(@NotNull String str) {
        C9367f.m39526e(str, "name");
        C10236a m42840h = C10240e.m42840h(C5613g.m27687m(this.f31173d), 2);
        int m42824d = m42840h.m42824d();
        int m42825f = m42840h.m42825f();
        int m42826g = m42840h.m42826g();
        if (m42826g >= 0) {
            if (m42824d > m42825f) {
                return null;
            }
        } else if (m42824d < m42825f) {
            return null;
        }
        while (!C1128n.m6719l(this.f31173d[m42824d], str, true)) {
            if (m42824d == m42825f) {
                return null;
            }
            m42824d += m42826g;
        }
        return this.f31173d[m42824d + 1];
    }

    @NotNull
    /* renamed from: h */
    public final String m27177h() {
        return this.f31171b;
    }

    public int hashCode() {
        return this.f31170a.hashCode();
    }

    @NotNull
    public String toString() {
        return this.f31170a;
    }
}
