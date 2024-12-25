package p173ji;

import ci.C1119e;
import ci.C1128n;
import ci.C1129o;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kh.C5616j;
import ki.C5633a;
import ki.C5634b;
import org.apache.http.cookie.InterfaceC7038SM;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p274pi.C7726c;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/o.class
 */
/* renamed from: ji.o */
/* loaded from: combined.jar:classes2.jar:ji/o.class */
public final class C5424o {

    /* renamed from: a */
    @NotNull
    public final String f31106a;

    /* renamed from: b */
    @NotNull
    public final String f31107b;

    /* renamed from: c */
    public final long f31108c;

    /* renamed from: d */
    @NotNull
    public final String f31109d;

    /* renamed from: e */
    @NotNull
    public final String f31110e;

    /* renamed from: f */
    public final boolean f31111f;

    /* renamed from: g */
    public final boolean f31112g;

    /* renamed from: h */
    public final boolean f31113h;

    /* renamed from: i */
    public final boolean f31114i;

    /* renamed from: n */
    public static final a f31105n = new a(null);

    /* renamed from: j */
    public static final Pattern f31101j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    public static final Pattern f31102k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    public static final Pattern f31103l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    public static final Pattern f31104m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/o$a.class
     */
    /* renamed from: ji.o$a */
    /* loaded from: combined.jar:classes2.jar:ji/o$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        /* renamed from: a */
        public final int m27018a(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        /* renamed from: b */
        public final boolean m27019b(String str, String str2) {
            boolean z10 = true;
            if (C9367f.m39522a(str, str2)) {
                return true;
            }
            if (!C1128n.m6718k(str, str2, false, 2, null) || str.charAt((str.length() - str2.length()) - 1) != '.' || C5634b.m27786f(str)) {
                z10 = false;
            }
            return z10;
        }

        @Nullable
        /* renamed from: c */
        public final C5424o m27020c(@NotNull C5433x c5433x, @NotNull String str) {
            C9367f.m39526e(c5433x, "url");
            C9367f.m39526e(str, "setCookie");
            return m27021d(System.currentTimeMillis(), c5433x, str);
        }

        /* JADX WARN: Code restructure failed: missing block: B:93:0x0277, code lost:
        
            if (r0 > 253402300799999L) goto L63;
         */
        @org.jetbrains.annotations.Nullable
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p173ji.C5424o m27021d(long r15, @org.jetbrains.annotations.NotNull p173ji.C5433x r17, @org.jetbrains.annotations.NotNull java.lang.String r18) {
            /*
                Method dump skipped, instructions count: 863
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p173ji.C5424o.a.m27021d(long, ji.x, java.lang.String):ji.o");
        }

        @NotNull
        /* renamed from: e */
        public final List<C5424o> m27022e(@NotNull C5433x c5433x, @NotNull C5432w c5432w) {
            List<C5424o> m27700f;
            C9367f.m39526e(c5433x, "url");
            C9367f.m39526e(c5432w, "headers");
            List<String> m27086i = c5432w.m27086i(InterfaceC7038SM.SET_COOKIE);
            int size = m27086i.size();
            ArrayList arrayList = null;
            int i10 = 0;
            while (i10 < size) {
                C5424o m27020c = m27020c(c5433x, m27086i.get(i10));
                ArrayList arrayList2 = arrayList;
                if (m27020c != null) {
                    arrayList2 = arrayList;
                    if (arrayList == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(m27020c);
                }
                i10++;
                arrayList = arrayList2;
            }
            if (arrayList != null) {
                m27700f = Collections.unmodifiableList(arrayList);
                C9367f.m39525d(m27700f, "Collections.unmodifiableList(cookies)");
            } else {
                m27700f = C5616j.m27700f();
            }
            return m27700f;
        }

        /* renamed from: f */
        public final String m27023f(String str) {
            if (!(!C1128n.m6718k(str, InstructionFileId.DOT, false, 2, null))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String m27756e = C5633a.m27756e(C1129o.m6761c0(str, InstructionFileId.DOT));
            if (m27756e != null) {
                return m27756e;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: g */
        public final long m27024g(String str, int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int m27018a = m27018a(str, i10, i11, false);
            Matcher matcher = C5424o.f31104m.matcher(str);
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            while (true) {
                int i26 = i25;
                if (m27018a >= i11) {
                    if (70 > i20) {
                        i12 = i20;
                    } else {
                        i12 = i20;
                        if (99 >= i20) {
                            i12 = i20 + 1900;
                        }
                    }
                    if (i12 < 0) {
                        i13 = i12;
                    } else {
                        i13 = i12;
                        if (69 >= i12) {
                            i13 = i12 + 2000;
                        }
                    }
                    if (!(i13 >= 1601)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    if (!(i23 != -1)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    if (!(1 <= i22 && 31 >= i22)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    if (!(i21 >= 0 && 23 >= i21)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    if (!(i24 >= 0 && 59 >= i24)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    if (!(i26 >= 0 && 59 >= i26)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(C5634b.f31709f);
                    gregorianCalendar.setLenient(false);
                    gregorianCalendar.set(1, i13);
                    gregorianCalendar.set(2, i23 - 1);
                    gregorianCalendar.set(5, i22);
                    gregorianCalendar.set(11, i21);
                    gregorianCalendar.set(12, i24);
                    gregorianCalendar.set(13, i26);
                    gregorianCalendar.set(14, 0);
                    return gregorianCalendar.getTimeInMillis();
                }
                int m27018a2 = m27018a(str, m27018a + 1, i11, true);
                matcher.region(m27018a, m27018a2);
                if (i21 == -1 && matcher.usePattern(C5424o.f31104m).matches()) {
                    String group = matcher.group(1);
                    C9367f.m39525d(group, "matcher.group(1)");
                    i15 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    C9367f.m39525d(group2, "matcher.group(2)");
                    i18 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    C9367f.m39525d(group3, "matcher.group(3)");
                    i19 = Integer.parseInt(group3);
                    i14 = i20;
                    i16 = i22;
                    i17 = i23;
                } else if (i22 == -1 && matcher.usePattern(C5424o.f31103l).matches()) {
                    String group4 = matcher.group(1);
                    C9367f.m39525d(group4, "matcher.group(1)");
                    i16 = Integer.parseInt(group4);
                    i14 = i20;
                    i15 = i21;
                    i17 = i23;
                    i18 = i24;
                    i19 = i26;
                } else if (i23 == -1 && matcher.usePattern(C5424o.f31102k).matches()) {
                    String group5 = matcher.group(1);
                    C9367f.m39525d(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    C9367f.m39525d(locale, "Locale.US");
                    if (group5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase = group5.toLowerCase(locale);
                    C9367f.m39525d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String pattern = C5424o.f31102k.pattern();
                    C9367f.m39525d(pattern, "MONTH_PATTERN.pattern()");
                    i17 = C1129o.m6747O(pattern, lowerCase, 0, false, 6, null) / 4;
                    i14 = i20;
                    i15 = i21;
                    i16 = i22;
                    i18 = i24;
                    i19 = i26;
                } else {
                    i14 = i20;
                    i15 = i21;
                    i16 = i22;
                    i17 = i23;
                    i18 = i24;
                    i19 = i26;
                    if (i20 == -1) {
                        i14 = i20;
                        i15 = i21;
                        i16 = i22;
                        i17 = i23;
                        i18 = i24;
                        i19 = i26;
                        if (matcher.usePattern(C5424o.f31101j).matches()) {
                            String group6 = matcher.group(1);
                            C9367f.m39525d(group6, "matcher.group(1)");
                            i14 = Integer.parseInt(group6);
                            i19 = i26;
                            i18 = i24;
                            i17 = i23;
                            i16 = i22;
                            i15 = i21;
                        }
                    }
                }
                m27018a = m27018a(str, m27018a2 + 1, i11, false);
                i20 = i14;
                i21 = i15;
                i22 = i16;
                i23 = i17;
                i24 = i18;
                i25 = i19;
            }
        }

        /* renamed from: h */
        public final long m27025h(String str) {
            long j10 = Long.MIN_VALUE;
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 0) {
                    j10 = parseLong;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (!new C1119e("-?\\d+").m6703a(str)) {
                    throw e10;
                }
                if (!C1128n.m6732y(str, "-", false, 2, null)) {
                    j10 = Long.MAX_VALUE;
                }
                return j10;
            }
        }
    }

    public C5424o(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f31106a = str;
        this.f31107b = str2;
        this.f31108c = j10;
        this.f31109d = str3;
        this.f31110e = str4;
        this.f31111f = z10;
        this.f31112g = z11;
        this.f31113h = z12;
        this.f31114i = z13;
    }

    public /* synthetic */ C5424o(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, C9365d c9365d) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }

    @NotNull
    /* renamed from: e */
    public final String m27015e() {
        return this.f31106a;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z10;
        if (obj instanceof C5424o) {
            C5424o c5424o = (C5424o) obj;
            if (C9367f.m39522a(c5424o.f31106a, this.f31106a) && C9367f.m39522a(c5424o.f31107b, this.f31107b) && c5424o.f31108c == this.f31108c && C9367f.m39522a(c5424o.f31109d, this.f31109d) && C9367f.m39522a(c5424o.f31110e, this.f31110e) && c5424o.f31111f == this.f31111f && c5424o.f31112g == this.f31112g && c5424o.f31113h == this.f31113h && c5424o.f31114i == this.f31114i) {
                z10 = true;
                return z10;
            }
        }
        z10 = false;
        return z10;
    }

    @NotNull
    /* renamed from: f */
    public final String m27016f(boolean z10) {
        String m33726b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f31106a);
        sb2.append('=');
        sb2.append(this.f31107b);
        if (this.f31113h) {
            if (this.f31108c == Long.MIN_VALUE) {
                m33726b = "; max-age=0";
            } else {
                sb2.append("; expires=");
                m33726b = C7726c.m33726b(new Date(this.f31108c));
            }
            sb2.append(m33726b);
        }
        if (!this.f31114i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(InstructionFileId.DOT);
            }
            sb2.append(this.f31109d);
        }
        sb2.append("; path=");
        sb2.append(this.f31110e);
        if (this.f31111f) {
            sb2.append("; secure");
        }
        if (this.f31112g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        C9367f.m39525d(sb3, "toString()");
        return sb3;
    }

    @NotNull
    /* renamed from: g */
    public final String m27017g() {
        return this.f31107b;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.f31106a.hashCode()) * 31) + this.f31107b.hashCode()) * 31) + C5422m.m27009a(this.f31108c)) * 31) + this.f31109d.hashCode()) * 31) + this.f31110e.hashCode()) * 31) + C5423n.m27010a(this.f31111f)) * 31) + C5423n.m27010a(this.f31112g)) * 31) + C5423n.m27010a(this.f31113h)) * 31) + C5423n.m27010a(this.f31114i);
    }

    @NotNull
    public String toString() {
        return m27016f(false);
    }
}
