package p334t8;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import ec.C4699b;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4401z0;
import p168jc.C5354c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t8/c.class
 */
/* renamed from: t8.c */
/* loaded from: combined.jar:classes2.jar:t8/c.class */
public final class C8644c {

    /* renamed from: a */
    public final String f40367a;

    /* renamed from: b */
    public final int f40368b;

    /* renamed from: c */
    public final Integer f40369c;

    /* renamed from: d */
    public final float f40370d;

    /* renamed from: e */
    public final boolean f40371e;

    /* renamed from: f */
    public final boolean f40372f;

    /* renamed from: g */
    public final boolean f40373g;

    /* renamed from: h */
    public final boolean f40374h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:t8/c$a.class
     */
    /* renamed from: t8.c$a */
    /* loaded from: combined.jar:classes2.jar:t8/c$a.class */
    public static final class a {

        /* renamed from: a */
        public final int f40375a;

        /* renamed from: b */
        public final int f40376b;

        /* renamed from: c */
        public final int f40377c;

        /* renamed from: d */
        public final int f40378d;

        /* renamed from: e */
        public final int f40379e;

        /* renamed from: f */
        public final int f40380f;

        /* renamed from: g */
        public final int f40381g;

        /* renamed from: h */
        public final int f40382h;

        /* renamed from: i */
        public final int f40383i;

        public a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f40375a = i10;
            this.f40376b = i11;
            this.f40377c = i12;
            this.f40378d = i13;
            this.f40379e = i14;
            this.f40380f = i15;
            this.f40381g = i16;
            this.f40382h = i17;
            this.f40383i = i18;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: a */
        public static a m37119a(String str) {
            boolean z10;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            for (int i18 = 0; i18 < split.length; i18++) {
                String m23638e = C4699b.m23638e(split[i18].trim());
                m23638e.hashCode();
                switch (m23638e.hashCode()) {
                    case -1178781136:
                        if (m23638e.equals("italic")) {
                            z10 = false;
                            break;
                        }
                        z10 = -1;
                        break;
                    case -1026963764:
                        if (m23638e.equals("underline")) {
                            z10 = true;
                            break;
                        }
                        z10 = -1;
                        break;
                    case -192095652:
                        if (m23638e.equals("strikeout")) {
                            z10 = 2;
                            break;
                        }
                        z10 = -1;
                        break;
                    case -70925746:
                        if (m23638e.equals("primarycolour")) {
                            z10 = 3;
                            break;
                        }
                        z10 = -1;
                        break;
                    case 3029637:
                        if (m23638e.equals("bold")) {
                            z10 = 4;
                            break;
                        }
                        z10 = -1;
                        break;
                    case 3373707:
                        if (m23638e.equals("name")) {
                            z10 = 5;
                            break;
                        }
                        z10 = -1;
                        break;
                    case 366554320:
                        if (m23638e.equals("fontsize")) {
                            z10 = 6;
                            break;
                        }
                        z10 = -1;
                        break;
                    case 1767875043:
                        if (m23638e.equals("alignment")) {
                            z10 = 7;
                            break;
                        }
                        z10 = -1;
                        break;
                    default:
                        z10 = -1;
                        break;
                }
                switch (z10) {
                    case false:
                        i15 = i18;
                        break;
                    case true:
                        i16 = i18;
                        break;
                    case true:
                        i17 = i18;
                        break;
                    case true:
                        i12 = i18;
                        break;
                    case true:
                        i14 = i18;
                        break;
                    case true:
                        i10 = i18;
                        break;
                    case true:
                        i13 = i18;
                        break;
                    case true:
                        i11 = i18;
                        break;
                }
            }
            return i10 != -1 ? new a(i10, i11, i12, i13, i14, i15, i16, i17, split.length) : null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:t8/c$b.class
     */
    /* renamed from: t8.c$b */
    /* loaded from: combined.jar:classes2.jar:t8/c$b.class */
    public static final class b {

        /* renamed from: c */
        public static final Pattern f40384c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d */
        public static final Pattern f40385d = Pattern.compile(C4401z0.m22321E("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e */
        public static final Pattern f40386e = Pattern.compile(C4401z0.m22321E("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f */
        public static final Pattern f40387f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a */
        public final int f40388a;

        /* renamed from: b */
        public final PointF f40389b;

        public b(int i10, PointF pointF) {
            this.f40388a = i10;
            this.f40389b = pointF;
        }

        /* renamed from: a */
        public static int m37120a(String str) {
            Matcher matcher = f40387f.matcher(str);
            return matcher.find() ? C8644c.m37115d((String) C4349a.m21882e(matcher.group(1))) : -1;
        }

        /* renamed from: b */
        public static b m37121b(String str) {
            PointF pointF;
            Matcher matcher = f40384c.matcher(str);
            PointF pointF2 = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) C4349a.m21882e(matcher.group(1));
                try {
                    PointF m37122c = m37122c(str2);
                    pointF = pointF2;
                    if (m37122c != null) {
                        pointF = m37122c;
                    }
                } catch (RuntimeException e10) {
                    pointF = pointF2;
                }
                try {
                    int m37120a = m37120a(str2);
                    pointF2 = pointF;
                    if (m37120a != -1) {
                        i10 = m37120a;
                        pointF2 = pointF;
                    }
                } catch (RuntimeException e11) {
                    pointF2 = pointF;
                }
            }
            return new b(i10, pointF2);
        }

        /* renamed from: c */
        public static PointF m37122c(String str) {
            String group;
            String group2;
            Matcher matcher = f40385d.matcher(str);
            Matcher matcher2 = f40386e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    C4392v.m22273g("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else {
                if (!find2) {
                    return null;
                }
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) C4349a.m21882e(group)).trim()), Float.parseFloat(((String) C4349a.m21882e(group2)).trim()));
        }

        /* renamed from: d */
        public static String m37123d(String str) {
            return f40384c.matcher(str).replaceAll("");
        }
    }

    public C8644c(String str, int i10, Integer num, float f10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f40367a = str;
        this.f40368b = i10;
        this.f40369c = num;
        this.f40370d = f10;
        this.f40371e = z10;
        this.f40372f = z11;
        this.f40373g = z12;
        this.f40374h = z13;
    }

    /* renamed from: b */
    public static C8644c m37113b(String str, a aVar) {
        C4349a.m21878a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i10 = aVar.f40383i;
        if (length != i10) {
            C4392v.m22275i("SsaStyle", C4401z0.m22321E("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.f40375a].trim();
            int i11 = aVar.f40376b;
            int m37115d = i11 != -1 ? m37115d(split[i11].trim()) : -1;
            int i12 = aVar.f40377c;
            Integer m37117f = i12 != -1 ? m37117f(split[i12].trim()) : null;
            int i13 = aVar.f40378d;
            float m37118g = i13 != -1 ? m37118g(split[i13].trim()) : -3.4028235E38f;
            int i14 = aVar.f40379e;
            boolean z10 = i14 != -1 && m37116e(split[i14].trim());
            int i15 = aVar.f40380f;
            boolean z11 = i15 != -1 && m37116e(split[i15].trim());
            int i16 = aVar.f40381g;
            boolean z12 = i16 != -1 && m37116e(split[i16].trim());
            int i17 = aVar.f40382h;
            return new C8644c(trim, m37115d, m37117f, m37118g, z10, z11, z12, i17 != -1 && m37116e(split[i17].trim()));
        } catch (RuntimeException e10) {
            C4392v.m22276j("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e10);
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m37114c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: d */
    public static int m37115d(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (m37114c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException e10) {
        }
        C4392v.m22275i("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    /* renamed from: e */
    public static boolean m37116e(String str) {
        boolean z10 = false;
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt == 1 || parseInt == -1) {
                z10 = true;
            }
            return z10;
        } catch (NumberFormatException e10) {
            C4392v.m22276j("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    /* renamed from: f */
    public static Integer m37117f(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            C4349a.m21878a(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(C5354c.m26637c(((parseLong >> 24) & 255) ^ 255), C5354c.m26637c(parseLong & 255), C5354c.m26637c((parseLong >> 8) & 255), C5354c.m26637c((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            C4392v.m22276j("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    /* renamed from: g */
    public static float m37118g(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            C4392v.m22276j("SsaStyle", "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }
}
