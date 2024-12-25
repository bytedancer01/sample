package p401x8;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p059d9.C4349a;
import p059d9.C4361f0;
import p059d9.C4392v;
import p059d9.C4401z0;
import p243o8.C6919a;
import p322s8.C8547c;
import p401x8.C9685f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:x8/f.class
 */
/* renamed from: x8.f */
/* loaded from: combined.jar:classes2.jar:x8/f.class */
public final class C9685f {

    /* renamed from: a */
    public static final Pattern f44201a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    public static final Pattern f44202b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    public static final Map<String, Integer> f44203c;

    /* renamed from: d */
    public static final Map<String, Integer> f44204d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:x8/f$b.class
     */
    /* renamed from: x8.f$b */
    /* loaded from: combined.jar:classes2.jar:x8/f$b.class */
    public static class b {

        /* renamed from: c */
        public static final Comparator<b> f44205c = new Comparator() { // from class: x8.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m40781e;
                m40781e = C9685f.b.m40781e((C9685f.b) obj, (C9685f.b) obj2);
                return m40781e;
            }
        };

        /* renamed from: a */
        public final c f44206a;

        /* renamed from: b */
        public final int f44207b;

        public b(c cVar, int i10) {
            this.f44206a = cVar;
            this.f44207b = i10;
        }

        /* renamed from: e */
        public static /* synthetic */ int m40781e(b bVar, b bVar2) {
            return Integer.compare(bVar.f44206a.f44209b, bVar2.f44206a.f44209b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:x8/f$c.class
     */
    /* renamed from: x8.f$c */
    /* loaded from: combined.jar:classes2.jar:x8/f$c.class */
    public static final class c {

        /* renamed from: a */
        public final String f44208a;

        /* renamed from: b */
        public final int f44209b;

        /* renamed from: c */
        public final String f44210c;

        /* renamed from: d */
        public final Set<String> f44211d;

        public c(String str, int i10, String str2, Set<String> set) {
            this.f44209b = i10;
            this.f44208a = str;
            this.f44210c = str2;
            this.f44211d = set;
        }

        /* renamed from: a */
        public static c m40782a(String str, int i10) {
            String trim;
            String trim2 = str.trim();
            C4349a.m21878a(!trim2.isEmpty());
            int indexOf = trim2.indexOf(" ");
            if (indexOf == -1) {
                trim = "";
            } else {
                trim = trim2.substring(indexOf).trim();
                trim2 = trim2.substring(0, indexOf);
            }
            String[] m22356V0 = C4401z0.m22356V0(trim2, "\\.");
            String str2 = m22356V0[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < m22356V0.length; i11++) {
                hashSet.add(m22356V0[i11]);
            }
            return new c(str2, i10, trim, hashSet);
        }

        /* renamed from: b */
        public static c m40783b() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:x8/f$d.class
     */
    /* renamed from: x8.f$d */
    /* loaded from: combined.jar:classes2.jar:x8/f$d.class */
    public static final class d implements Comparable<d> {

        /* renamed from: b */
        public final int f44212b;

        /* renamed from: c */
        public final C9683d f44213c;

        public d(int i10, C9683d c9683d) {
            this.f44212b = i10;
            this.f44213c = c9683d;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f44212b, dVar.f44212b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:x8/f$e.class
     */
    /* renamed from: x8.f$e */
    /* loaded from: combined.jar:classes2.jar:x8/f$e.class */
    public static final class e {

        /* renamed from: c */
        public CharSequence f44216c;

        /* renamed from: a */
        public long f44214a = 0;

        /* renamed from: b */
        public long f44215b = 0;

        /* renamed from: d */
        public int f44217d = 2;

        /* renamed from: e */
        public float f44218e = -3.4028235E38f;

        /* renamed from: f */
        public int f44219f = 1;

        /* renamed from: g */
        public int f44220g = 0;

        /* renamed from: h */
        public float f44221h = -3.4028235E38f;

        /* renamed from: i */
        public int f44222i = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;

        /* renamed from: j */
        public float f44223j = 1.0f;

        /* renamed from: k */
        public int f44224k = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;

        /* renamed from: b */
        public static float m40785b(float f10, int i10) {
            if (f10 == -3.4028235E38f || i10 != 0 || (f10 >= 0.0f && f10 <= 1.0f)) {
                return f10 != -3.4028235E38f ? f10 : i10 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        /* renamed from: c */
        public static Layout.Alignment m40786c(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            C4392v.m22275i("WebvttCueParser", "Unknown textAlignment: " + i10);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        /* renamed from: d */
        public static float m40787d(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 == 1) {
                return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            }
            if (i10 == 2) {
                return f10;
            }
            throw new IllegalStateException(String.valueOf(i10));
        }

        /* renamed from: e */
        public static float m40788e(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        /* renamed from: f */
        public static int m40789f(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                return i10 != 5 ? 1 : 2;
            }
            return 0;
        }

        /* renamed from: a */
        public C9684e m40790a() {
            return new C9684e(m40791g().m31857a(), this.f44214a, this.f44215b);
        }

        /* renamed from: g */
        public C6919a.b m40791g() {
            float f10 = this.f44221h;
            if (f10 == -3.4028235E38f) {
                f10 = m40788e(this.f44217d);
            }
            int i10 = this.f44222i;
            if (i10 == Integer.MIN_VALUE) {
                i10 = m40789f(this.f44217d);
            }
            C6919a.b m31874r = new C6919a.b().m31872p(m40786c(this.f44217d)).m31864h(m40785b(this.f44218e, this.f44219f), this.f44219f).m31865i(this.f44220g).m31867k(f10).m31868l(i10).m31870n(Math.min(this.f44223j, m40787d(i10, f10))).m31874r(this.f44224k);
            CharSequence charSequence = this.f44216c;
            if (charSequence != null) {
                m31874r.m31871o(charSequence);
            }
            return m31874r;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f44203c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f44204d = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static void m40754a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i10, int i11) {
        Object foregroundColorSpan;
        for (String str : set) {
            Map<String, Integer> map = f44203c;
            if (map.containsKey(str)) {
                foregroundColorSpan = new ForegroundColorSpan(map.get(str).intValue());
            } else {
                Map<String, Integer> map2 = f44204d;
                if (map2.containsKey(str)) {
                    foregroundColorSpan = new BackgroundColorSpan(map2.get(str).intValue());
                }
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, i10, i11, 33);
        }
    }

    /* renamed from: b */
    public static void m40755b(String str, SpannableStringBuilder spannableStringBuilder) {
        char c10;
        str.hashCode();
        switch (str) {
            case "gt":
                c10 = '>';
                break;
            case "lt":
                c10 = '<';
                break;
            case "amp":
                c10 = '&';
                break;
            case "nbsp":
                c10 = ' ';
                break;
            default:
                C4392v.m22275i("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
        spannableStringBuilder.append(c10);
    }

    /* renamed from: c */
    public static void m40756c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List<b> list, List<C9683d> list2) {
        int m40762i = m40762i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f44205c);
        int i10 = cVar.f44209b;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if ("rt".equals(((b) arrayList.get(i12)).f44206a.f44208a)) {
                b bVar = (b) arrayList.get(i12);
                int m40760g = m40760g(m40762i(list2, str, bVar.f44206a), m40762i, 1);
                int i13 = bVar.f44206a.f44209b - i11;
                int i14 = bVar.f44207b - i11;
                CharSequence subSequence = spannableStringBuilder.subSequence(i13, i14);
                spannableStringBuilder.delete(i13, i14);
                spannableStringBuilder.setSpan(new C8547c(subSequence.toString(), m40760g), i10, i13, 33);
                i11 += subSequence.length();
                i10 = i13;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a2 A[LOOP:0: B:38:0x0197->B:40:0x01a2, LOOP_END] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m40757d(java.lang.String r6, p401x8.C9685f.c r7, java.util.List<p401x8.C9685f.b> r8, android.text.SpannableStringBuilder r9, java.util.List<p401x8.C9683d> r10) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p401x8.C9685f.m40757d(java.lang.String, x8.f$c, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m40758e(android.text.SpannableStringBuilder r6, p401x8.C9683d r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p401x8.C9685f.m40758e(android.text.SpannableStringBuilder, x8.d, int, int):void");
    }

    /* renamed from: f */
    public static int m40759f(String str, int i10) {
        int indexOf = str.indexOf(62, i10);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    /* renamed from: g */
    public static int m40760g(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public static List<d> m40761h(List<C9683d> list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C9683d c9683d = list.get(i10);
            int m40735h = c9683d.m40735h(str, cVar.f44208a, cVar.f44211d, cVar.f44210c);
            if (m40735h > 0) {
                arrayList.add(new d(m40735h, c9683d));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: i */
    public static int m40762i(List<C9683d> list, String str, c cVar) {
        List<d> m40761h = m40761h(list, str, cVar);
        for (int i10 = 0; i10 < m40761h.size(); i10++) {
            C9683d c9683d = m40761h.get(i10).f44213c;
            if (c9683d.m40734g() != -1) {
                return c9683d.m40734g();
            }
        }
        return -1;
    }

    /* renamed from: j */
    public static String m40763j(String str) {
        String trim = str.trim();
        C4349a.m21878a(!trim.isEmpty());
        return C4401z0.m22358W0(trim, "[ \\.]")[0];
    }

    /* renamed from: k */
    public static boolean m40764k(String str) {
        str.hashCode();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    /* renamed from: l */
    public static C6919a m40765l(CharSequence charSequence) {
        e eVar = new e();
        eVar.f44216c = charSequence;
        return eVar.m40791g().m31857a();
    }

    /* renamed from: m */
    public static C9684e m40766m(C4361f0 c4361f0, List<C9683d> list) {
        String m22000p = c4361f0.m22000p();
        if (m22000p == null) {
            return null;
        }
        Pattern pattern = f44201a;
        Matcher matcher = pattern.matcher(m22000p);
        if (matcher.matches()) {
            return m40767n(null, matcher, c4361f0, list);
        }
        String m22000p2 = c4361f0.m22000p();
        if (m22000p2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(m22000p2);
        if (matcher2.matches()) {
            return m40767n(m22000p.trim(), matcher2, c4361f0, list);
        }
        return null;
    }

    /* renamed from: n */
    public static C9684e m40767n(String str, Matcher matcher, C4361f0 c4361f0, List<C9683d> list) {
        e eVar = new e();
        try {
            eVar.f44214a = C9688i.m40797d((String) C4349a.m21882e(matcher.group(1)));
            eVar.f44215b = C9688i.m40797d((String) C4349a.m21882e(matcher.group(2)));
            m40769p((String) C4349a.m21882e(matcher.group(3)), eVar);
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String m22000p = c4361f0.m22000p();
                if (TextUtils.isEmpty(m22000p)) {
                    eVar.f44216c = m40770q(str, sb2.toString(), list);
                    return eVar.m40790a();
                }
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(m22000p.trim());
            }
        } catch (NumberFormatException e10) {
            C4392v.m22275i("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* renamed from: o */
    public static C6919a.b m40768o(String str) {
        e eVar = new e();
        m40769p(str, eVar);
        return eVar.m40791g();
    }

    /* renamed from: p */
    public static void m40769p(String str, e eVar) {
        Matcher matcher = f44202b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) C4349a.m21882e(matcher.group(1));
            String str3 = (String) C4349a.m21882e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    m40772s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f44217d = m40775v(str3);
                } else if ("position".equals(str2)) {
                    m40774u(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f44223j = C9688i.m40796c(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f44224k = m40776w(str3);
                } else {
                    C4392v.m22275i("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException e10) {
                C4392v.m22275i("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* renamed from: q */
    public static SpannedString m40770q(String str, String str2, List<C9683d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char charAt = str2.charAt(i10);
            if (charAt == '&') {
                int i11 = i10 + 1;
                int indexOf = str2.indexOf(59, i11);
                int indexOf2 = str2.indexOf(32, i11);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    m40755b(str2.substring(i11, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                    i10 = i11;
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i10++;
            } else {
                int i12 = i10 + 1;
                if (i12 >= str2.length()) {
                    i10 = i12;
                } else {
                    int i13 = 1;
                    boolean z10 = str2.charAt(i12) == '/';
                    int m40759f = m40759f(str2, i12);
                    int i14 = m40759f - 2;
                    boolean z11 = str2.charAt(i14) == '/';
                    if (z10) {
                        i13 = 2;
                    }
                    if (!z11) {
                        i14 = m40759f - 1;
                    }
                    String substring = str2.substring(i10 + i13, i14);
                    if (substring.trim().isEmpty()) {
                        i10 = m40759f;
                    } else {
                        String m40763j = m40763j(substring);
                        if (!m40764k(m40763j)) {
                            i10 = m40759f;
                        } else if (z10) {
                            while (true) {
                                if (arrayDeque.isEmpty()) {
                                    i10 = m40759f;
                                    break;
                                }
                                c cVar = (c) arrayDeque.pop();
                                m40757d(str, cVar, arrayList, spannableStringBuilder, list);
                                if (arrayDeque.isEmpty()) {
                                    arrayList.clear();
                                } else {
                                    arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                }
                                if (cVar.f44208a.equals(m40763j)) {
                                    i10 = m40759f;
                                    break;
                                }
                            }
                        } else {
                            i10 = m40759f;
                            if (!z11) {
                                arrayDeque.push(c.m40782a(substring, spannableStringBuilder.length()));
                                i10 = m40759f;
                            }
                        }
                    }
                }
            }
        }
        while (!arrayDeque.isEmpty()) {
            m40757d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m40757d(str, c.m40783b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* renamed from: r */
    public static int m40771r(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                C4392v.m22275i("WebvttCueParser", "Invalid anchor value: " + str);
                return NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        }
    }

    /* renamed from: s */
    public static void m40772s(String str, e eVar) {
        int indexOf = str.indexOf(44);
        String str2 = str;
        if (indexOf != -1) {
            eVar.f44220g = m40771r(str.substring(indexOf + 1));
            str2 = str.substring(0, indexOf);
        }
        if (str2.endsWith("%")) {
            eVar.f44218e = C9688i.m40796c(str2);
            eVar.f44219f = 0;
        } else {
            eVar.f44218e = Integer.parseInt(str2);
            eVar.f44219f = 1;
        }
    }

    /* renamed from: t */
    public static int m40773t(String str) {
        str.hashCode();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                C4392v.m22275i("WebvttCueParser", "Invalid anchor value: " + str);
                return NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        }
    }

    /* renamed from: u */
    public static void m40774u(String str, e eVar) {
        int indexOf = str.indexOf(44);
        String str2 = str;
        if (indexOf != -1) {
            eVar.f44222i = m40773t(str.substring(indexOf + 1));
            str2 = str.substring(0, indexOf);
        }
        eVar.f44221h = C9688i.m40796c(str2);
    }

    /* renamed from: v */
    public static int m40775v(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                C4392v.m22275i("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    /* renamed from: w */
    public static int m40776w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        C4392v.m22275i("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
    }
}
