package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/navigation/h.class
 */
/* renamed from: androidx.navigation.h */
/* loaded from: combined.jar:classes1.jar:androidx/navigation/h.class */
public final class C0628h {

    /* renamed from: j */
    public static final Pattern f4234j = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a */
    public final ArrayList<String> f4235a = new ArrayList<>();

    /* renamed from: b */
    public final Map<String, c> f4236b = new HashMap();

    /* renamed from: c */
    public Pattern f4237c;

    /* renamed from: d */
    public boolean f4238d;

    /* renamed from: e */
    public boolean f4239e;

    /* renamed from: f */
    public final String f4240f;

    /* renamed from: g */
    public final String f4241g;

    /* renamed from: h */
    public Pattern f4242h;

    /* renamed from: i */
    public final String f4243i;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/h$a.class
     */
    /* renamed from: androidx.navigation.h$a */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/h$a.class */
    public static final class a {

        /* renamed from: a */
        public String f4244a;

        /* renamed from: b */
        public String f4245b;

        /* renamed from: c */
        public String f4246c;

        /* renamed from: a */
        public C0628h m3539a() {
            return new C0628h(this.f4244a, this.f4245b, this.f4246c);
        }

        /* renamed from: b */
        public a m3540b(String str) {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.f4245b = str;
            return this;
        }

        /* renamed from: c */
        public a m3541c(String str) {
            this.f4246c = str;
            return this;
        }

        /* renamed from: d */
        public a m3542d(String str) {
            this.f4244a = str;
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/h$b.class
     */
    /* renamed from: androidx.navigation.h$b */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/h$b.class */
    public static class b implements Comparable<b> {

        /* renamed from: b */
        public String f4247b;

        /* renamed from: c */
        public String f4248c;

        public b(String str) {
            String[] split = str.split("/", -1);
            this.f4247b = split[0];
            this.f4248c = split[1];
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int i10 = this.f4247b.equals(bVar.f4247b) ? 2 : 0;
            int i11 = i10;
            if (this.f4248c.equals(bVar.f4248c)) {
                i11 = i10 + 1;
            }
            return i11;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/h$c.class
     */
    /* renamed from: androidx.navigation.h$c */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/h$c.class */
    public static class c {

        /* renamed from: a */
        public String f4249a;

        /* renamed from: b */
        public ArrayList<String> f4250b = new ArrayList<>();

        /* renamed from: a */
        public void m3544a(String str) {
            this.f4250b.add(str);
        }

        /* renamed from: b */
        public String m3545b(int i10) {
            return this.f4250b.get(i10);
        }

        /* renamed from: c */
        public String m3546c() {
            return this.f4249a;
        }

        /* renamed from: d */
        public void m3547d(String str) {
            this.f4249a = str;
        }

        /* renamed from: e */
        public int m3548e() {
            return this.f4250b.size();
        }
    }

    public C0628h(String str, String str2, String str3) {
        int i10;
        this.f4237c = null;
        this.f4238d = false;
        this.f4239e = false;
        this.f4242h = null;
        this.f4240f = str;
        this.f4241g = str2;
        this.f4243i = str3;
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.f4239e = parse.getQuery() != null;
            StringBuilder sb2 = new StringBuilder("^");
            if (!f4234j.matcher(str).find()) {
                sb2.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.f4239e) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    m3533a(str.substring(0, matcher.start()), sb2, compile);
                }
                this.f4238d = false;
                for (String str4 : parse.getQueryParameterNames()) {
                    StringBuilder sb3 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(str4);
                    Matcher matcher2 = compile.matcher(queryParameter);
                    c cVar = new c();
                    int i11 = 0;
                    while (true) {
                        i10 = i11;
                        if (!matcher2.find()) {
                            break;
                        }
                        cVar.m3544a(matcher2.group(1));
                        sb3.append(Pattern.quote(queryParameter.substring(i10, matcher2.start())));
                        sb3.append("(.+?)?");
                        i11 = matcher2.end();
                    }
                    if (i10 < queryParameter.length()) {
                        sb3.append(Pattern.quote(queryParameter.substring(i10)));
                    }
                    cVar.m3547d(sb3.toString().replace(".*", "\\E.*\\Q"));
                    this.f4236b.put(str4, cVar);
                }
            } else {
                this.f4238d = m3533a(str, sb2, compile);
            }
            this.f4237c = Pattern.compile(sb2.toString().replace(".*", "\\E.*\\Q"));
        }
        if (str3 != null) {
            if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
                throw new IllegalArgumentException("The given mimeType " + str3 + " does not match to required \"type/subtype\" format");
            }
            b bVar = new b(str3);
            this.f4242h = Pattern.compile(("^(" + bVar.f4247b + "|[*]+)/(" + bVar.f4248c + "|[*]+)$").replace("*|[*]", "[\\s\\S]"));
        }
    }

    /* renamed from: a */
    public final boolean m3533a(String str, StringBuilder sb2, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z10 = !str.contains(".*");
        int i10 = 0;
        while (matcher.find()) {
            this.f4235a.add(matcher.group(1));
            sb2.append(Pattern.quote(str.substring(i10, matcher.start())));
            sb2.append("(.+?)");
            i10 = matcher.end();
            z10 = false;
        }
        if (i10 < str.length()) {
            sb2.append(Pattern.quote(str.substring(i10)));
        }
        sb2.append("($|(\\?(.)*))");
        return z10;
    }

    /* renamed from: b */
    public String m3534b() {
        return this.f4241g;
    }

    /* renamed from: c */
    public Bundle m3535c(Uri uri, Map<String, C0619d> map) {
        Matcher matcher;
        Matcher matcher2 = this.f4237c.matcher(uri.toString());
        if (!matcher2.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        int size = this.f4235a.size();
        int i10 = 0;
        while (i10 < size) {
            String str = this.f4235a.get(i10);
            int i11 = i10 + 1;
            i10 = i11;
            if (m3538f(bundle, str, Uri.decode(matcher2.group(i11)), map.get(str))) {
                return null;
            }
        }
        if (this.f4239e) {
            for (String str2 : this.f4236b.keySet()) {
                c cVar = this.f4236b.get(str2);
                String queryParameter = uri.getQueryParameter(str2);
                if (queryParameter != null) {
                    Matcher matcher3 = Pattern.compile(cVar.m3546c()).matcher(queryParameter);
                    matcher = matcher3;
                    if (!matcher3.matches()) {
                        return null;
                    }
                } else {
                    matcher = null;
                }
                for (int i12 = 0; i12 < cVar.m3548e(); i12++) {
                    String decode = matcher != null ? Uri.decode(matcher.group(i12 + 1)) : null;
                    String m3545b = cVar.m3545b(i12);
                    C0619d c0619d = map.get(m3545b);
                    if (decode != null && !decode.replaceAll("[{}]", "").equals(m3545b) && m3538f(bundle, m3545b, decode, c0619d)) {
                        return null;
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: d */
    public int m3536d(String str) {
        if (this.f4243i == null || !this.f4242h.matcher(str).matches()) {
            return -1;
        }
        return new b(this.f4243i).compareTo(new b(str));
    }

    /* renamed from: e */
    public boolean m3537e() {
        return this.f4238d;
    }

    /* renamed from: f */
    public final boolean m3538f(Bundle bundle, String str, String str2, C0619d c0619d) {
        if (c0619d == null) {
            bundle.putString(str, str2);
            return false;
        }
        try {
            c0619d.m3488a().m3613g(bundle, str, str2);
            return false;
        } catch (IllegalArgumentException e10) {
            return true;
        }
    }
}
